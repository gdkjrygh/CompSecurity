// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binder;
import com.google.inject.Binding;
import com.google.inject.ConfigurationException;
import com.google.inject.ImplementedBy;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.MembersInjector;
import com.google.inject.Module;
import com.google.inject.ProvidedBy;
import com.google.inject.Provider;
import com.google.inject.ProvisionException;
import com.google.inject.Stage;
import com.google.inject.TypeLiteral;
import com.google.inject.internal.util.$ImmutableList;
import com.google.inject.internal.util.$ImmutableMap;
import com.google.inject.internal.util.$ImmutableSet;
import com.google.inject.internal.util.$Lists;
import com.google.inject.internal.util.$Maps;
import com.google.inject.internal.util.$Objects;
import com.google.inject.internal.util.$SourceProvider;
import com.google.inject.internal.util.$ToStringBuilder;
import com.google.inject.spi.BindingTargetVisitor;
import com.google.inject.spi.ConvertedConstantBinding;
import com.google.inject.spi.Dependency;
import com.google.inject.spi.HasDependencies;
import com.google.inject.spi.InjectionPoint;
import com.google.inject.spi.ProviderBinding;
import com.google.inject.spi.TypeConverter;
import com.google.inject.spi.TypeConverterBinding;
import com.google.inject.util.Providers;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.inject.internal:
//            Lookups, DeferredLookups, ConstructorInjectorStore, BindingImpl, 
//            ConstructorBindingImpl, State, ErrorsException, Errors, 
//            LinkedBindingImpl, Scoping, MembersInjectorStore, ConstantFactory, 
//            Initializables, InstanceBindingImpl, InternalContext, ContextualCallable, 
//            InternalInjectorCreator, SingleParameterInjector, LinkedProviderBindingImpl, Annotations, 
//            InternalFactory

final class InjectorImpl
    implements Injector, Lookups
{
    private static class BindingsMultimap
    {

        final Map multimap;

        List getAll(TypeLiteral typeliteral)
        {
            if ((List)multimap.get(typeliteral) != null)
            {
                return Collections.unmodifiableList((List)multimap.get(typeliteral));
            } else
            {
                return $ImmutableList.of();
            }
        }

        void put(TypeLiteral typeliteral, Binding binding)
        {
            List list = (List)multimap.get(typeliteral);
            Object obj = list;
            if (list == null)
            {
                obj = $Lists.newArrayList();
                multimap.put(typeliteral, obj);
            }
            ((List) (obj)).add(binding);
        }

        private BindingsMultimap()
        {
            multimap = $Maps.newHashMap();
        }

    }

    private static class ConvertedConstantBindingImpl extends BindingImpl
        implements ConvertedConstantBinding
    {

        final Binding originalBinding;
        final Provider provider;
        final TypeConverterBinding typeConverterBinding;
        final Object value;

        public Object acceptTargetVisitor(BindingTargetVisitor bindingtargetvisitor)
        {
            return bindingtargetvisitor.visit(this);
        }

        public void applyTo(Binder binder)
        {
            throw new UnsupportedOperationException("This element represents a synthetic binding.");
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof ConvertedConstantBindingImpl)
            {
                obj = (ConvertedConstantBindingImpl)obj;
                flag = flag1;
                if (getKey().equals(((ConvertedConstantBindingImpl) (obj)).getKey()))
                {
                    flag = flag1;
                    if (getScoping().equals(((ConvertedConstantBindingImpl) (obj)).getScoping()))
                    {
                        flag = flag1;
                        if ($Objects.equal(value, ((ConvertedConstantBindingImpl) (obj)).value))
                        {
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }

        public Set getDependencies()
        {
            return $ImmutableSet.of(Dependency.get(getSourceKey()));
        }

        public Provider getProvider()
        {
            return provider;
        }

        public Key getSourceKey()
        {
            return originalBinding.getKey();
        }

        public TypeConverterBinding getTypeConverterBinding()
        {
            return typeConverterBinding;
        }

        public Object getValue()
        {
            return value;
        }

        public int hashCode()
        {
            return $Objects.hashCode(new Object[] {
                getKey(), getScoping(), value
            });
        }

        public String toString()
        {
            return (new $ToStringBuilder(com/google/inject/spi/ConvertedConstantBinding)).add("key", getKey()).add("sourceKey", getSourceKey()).add("value", value).toString();
        }

        ConvertedConstantBindingImpl(InjectorImpl injectorimpl, Key key, Object obj, Binding binding, TypeConverterBinding typeconverterbinding)
        {
            super(injectorimpl, key, binding.getSource(), new ConstantFactory(Initializables.of(obj)), Scoping.UNSCOPED);
            value = obj;
            provider = Providers.of(obj);
            originalBinding = binding;
            typeConverterBinding = typeconverterbinding;
        }
    }

    static class InjectorOptions
    {

        final boolean disableCircularProxies;
        final boolean jitDisabled;
        final Stage stage;

        public String toString()
        {
            return (new $ToStringBuilder(getClass())).add("stage", stage).add("jitDisabled", Boolean.valueOf(jitDisabled)).add("disableCircularProxies", Boolean.valueOf(disableCircularProxies)).toString();
        }

        InjectorOptions(Stage stage1, boolean flag, boolean flag1)
        {
            stage = stage1;
            jitDisabled = flag;
            disableCircularProxies = flag1;
        }
    }

    static final class JitLimitation extends Enum
    {

        private static final JitLimitation $VALUES[];
        public static final JitLimitation EXISTING_JIT;
        public static final JitLimitation NEW_OR_EXISTING_JIT;
        public static final JitLimitation NO_JIT;

        public static JitLimitation valueOf(String s)
        {
            return (JitLimitation)Enum.valueOf(com/google/inject/internal/InjectorImpl$JitLimitation, s);
        }

        public static JitLimitation[] values()
        {
            return (JitLimitation[])$VALUES.clone();
        }

        static 
        {
            NO_JIT = new JitLimitation("NO_JIT", 0);
            EXISTING_JIT = new JitLimitation("EXISTING_JIT", 1);
            NEW_OR_EXISTING_JIT = new JitLimitation("NEW_OR_EXISTING_JIT", 2);
            $VALUES = (new JitLimitation[] {
                NO_JIT, EXISTING_JIT, NEW_OR_EXISTING_JIT
            });
        }

        private JitLimitation(String s, int i)
        {
            super(s, i);
        }
    }

    static interface MethodInvoker
    {

        public transient abstract Object invoke(Object obj, Object aobj[])
            throws IllegalAccessException, InvocationTargetException;
    }

    private static class ProviderBindingImpl extends BindingImpl
        implements ProviderBinding, HasDependencies
    {

        final BindingImpl providedBinding;

        static InternalFactory createInternalFactory(Binding binding)
        {
            return new InternalFactory(binding.getProvider()) {

                final Provider val$provider;

                public Provider get(Errors errors, InternalContext internalcontext, Dependency dependency, boolean flag)
                {
                    return provider;
                }

                public volatile Object get(Errors errors, InternalContext internalcontext, Dependency dependency, boolean flag)
                    throws ErrorsException
                {
                    return get(errors, internalcontext, dependency, flag);
                }

            
            {
                provider = provider1;
                super();
            }
            };
        }

        public Object acceptTargetVisitor(BindingTargetVisitor bindingtargetvisitor)
        {
            return bindingtargetvisitor.visit(this);
        }

        public void applyTo(Binder binder)
        {
            throw new UnsupportedOperationException("This element represents a synthetic binding.");
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof ProviderBindingImpl)
            {
                obj = (ProviderBindingImpl)obj;
                flag = flag1;
                if (getKey().equals(((ProviderBindingImpl) (obj)).getKey()))
                {
                    flag = flag1;
                    if (getScoping().equals(((ProviderBindingImpl) (obj)).getScoping()))
                    {
                        flag = flag1;
                        if ($Objects.equal(providedBinding, ((ProviderBindingImpl) (obj)).providedBinding))
                        {
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }

        public Set getDependencies()
        {
            return $ImmutableSet.of(Dependency.get(getProvidedKey()));
        }

        public Key getProvidedKey()
        {
            return providedBinding.getKey();
        }

        public int hashCode()
        {
            return $Objects.hashCode(new Object[] {
                getKey(), getScoping(), providedBinding
            });
        }

        public String toString()
        {
            return (new $ToStringBuilder(com/google/inject/spi/ProviderBinding)).add("key", getKey()).add("providedKey", getProvidedKey()).toString();
        }

        ProviderBindingImpl(InjectorImpl injectorimpl, Key key, Binding binding)
        {
            super(injectorimpl, key, binding.getSource(), createInternalFactory(binding), Scoping.UNSCOPED);
            providedBinding = (BindingImpl)binding;
        }
    }


    public static final TypeLiteral STRING_TYPE = TypeLiteral.get(java/lang/String);
    final BindingsMultimap bindingsMultimap = new BindingsMultimap();
    final ConstructorInjectorStore constructors = new ConstructorInjectorStore(this);
    final Map jitBindings = $Maps.newHashMap();
    final ThreadLocal localContext;
    Lookups lookups;
    MembersInjectorStore membersInjectorStore;
    final InjectorOptions options;
    final InjectorImpl parent;
    final State state;

    InjectorImpl(InjectorImpl injectorimpl, State state1, InjectorOptions injectoroptions)
    {
        lookups = new DeferredLookups(this);
        parent = injectorimpl;
        state = state1;
        options = injectoroptions;
        if (injectorimpl != null)
        {
            localContext = injectorimpl.localContext;
            return;
        } else
        {
            localContext = new ThreadLocal() {

                final InjectorImpl this$0;

                protected volatile Object initialValue()
                {
                    return ((Object) (initialValue()));
                }

                protected Object[] initialValue()
                {
                    return new Object[1];
                }

            
            {
                this$0 = InjectorImpl.this;
                super();
            }
            };
            return;
        }
    }

    private boolean cleanup(BindingImpl bindingimpl, Set set)
    {
        boolean flag = false;
        Iterator iterator = getInternalDependencies(bindingimpl).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bindingimpl = (Dependency)iterator.next();
            Key key = bindingimpl.getKey();
            bindingimpl = bindingimpl.getInjectionPoint();
            if (set.add(key))
            {
                Object obj = (BindingImpl)jitBindings.get(key);
                if (obj != null)
                {
                    boolean flag2 = cleanup(((BindingImpl) (obj)), set);
                    boolean flag1 = flag2;
                    if (obj instanceof ConstructorBindingImpl)
                    {
                        ConstructorBindingImpl constructorbindingimpl = (ConstructorBindingImpl)obj;
                        obj = constructorbindingimpl.getInternalConstructor();
                        flag1 = flag2;
                        bindingimpl = ((BindingImpl) (obj));
                        if (!constructorbindingimpl.isInitialized())
                        {
                            flag1 = true;
                            bindingimpl = ((BindingImpl) (obj));
                        }
                    }
                    if (flag1)
                    {
                        removeFailedJitBinding(key, bindingimpl);
                        flag = true;
                    }
                } else
                if (state.getExplicitBinding(key) == null)
                {
                    flag = true;
                }
            }
        } while (true);
        return flag;
    }

    private BindingImpl convertConstantStringBinding(Key key, Errors errors)
        throws ErrorsException
    {
        TypeConverterBinding typeconverterbinding;
        BindingImpl bindingimpl;
        Object obj2;
        Object obj = key.ofType(STRING_TYPE);
        bindingimpl = state.getExplicitBinding(((Key) (obj)));
        if (bindingimpl == null || !bindingimpl.isConstant())
        {
            return null;
        }
        obj = (String)bindingimpl.getProvider().get();
        Object obj1 = bindingimpl.getSource();
        TypeLiteral typeliteral = key.getTypeLiteral();
        typeconverterbinding = state.getConverter(((String) (obj)), typeliteral, errors, obj1);
        if (typeconverterbinding == null)
        {
            return null;
        }
        try
        {
            obj2 = typeconverterbinding.getTypeConverter().convert(((String) (obj)), typeliteral);
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw key;
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw errors.conversionError(((String) (obj)), obj1, typeliteral, typeconverterbinding, key).toException();
        }
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        throw errors.converterReturnedNull(((String) (obj)), obj1, typeliteral, typeconverterbinding).toException();
        if (!typeliteral.getRawType().isInstance(obj2))
        {
            throw errors.conversionTypeError(((String) (obj)), obj1, typeliteral, typeconverterbinding, obj2).toException();
        }
        key = new ConvertedConstantBindingImpl(this, key, obj2, bindingimpl, typeconverterbinding);
        return key;
    }

    private BindingImpl createImplementedByBinding(Key key, Scoping scoping, ImplementedBy implementedby, Errors errors)
        throws ErrorsException
    {
        Class class1 = key.getTypeLiteral().getRawType();
        implementedby = implementedby.value();
        if (implementedby == class1)
        {
            throw errors.recursiveImplementationType().toException();
        }
        if (!class1.isAssignableFrom(implementedby))
        {
            throw errors.notASubtype(implementedby, class1).toException();
        } else
        {
            implementedby = Key.get(implementedby);
            return new LinkedBindingImpl(this, key, class1, Scoping.scope(key, this, new InternalFactory() {

                final InjectorImpl this$0;
                final BindingImpl val$targetBinding;
                final Key val$targetKey;

                public Object get(Errors errors1, InternalContext internalcontext, Dependency dependency, boolean flag)
                    throws ErrorsException
                {
                    return targetBinding.getInternalFactory().get(errors1.withSource(targetKey), internalcontext, dependency, true);
                }

            
            {
                this$0 = InjectorImpl.this;
                targetBinding = bindingimpl;
                targetKey = key;
                super();
            }
            }, class1, scoping), scoping, implementedby);
        }
    }

    private BindingImpl createJustInTimeBinding(Key key, Errors errors, boolean flag, JitLimitation jitlimitation)
        throws ErrorsException
    {
        int i;
        i = errors.size();
        if (state.isBlacklisted(key))
        {
            throw errors.childBindingAlreadySet(key, state.getSourcesForBlacklistedKey(key)).toException();
        }
        if (isProvider(key))
        {
            return createProviderBinding(key, errors);
        }
        if (isMembersInjector(key))
        {
            return createMembersInjectorBinding(key, errors);
        }
        BindingImpl bindingimpl = convertConstantStringBinding(key, errors);
        if (bindingimpl != null)
        {
            return bindingimpl;
        }
        if (!isTypeLiteral(key) && flag && jitlimitation != JitLimitation.NEW_OR_EXISTING_JIT)
        {
            throw errors.jitDisabled(key).toException();
        }
        if (key.getAnnotationType() == null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        if (!key.hasAttributes())
        {
            break MISSING_BLOCK_LABEL_153;
        }
        jitlimitation = new Errors();
        jitlimitation = getBindingOrThrow(key.withoutAttributes(), jitlimitation, JitLimitation.NO_JIT);
        return jitlimitation;
        jitlimitation;
        throw errors.missingImplementation(key).toException();
        jitlimitation = key.getTypeLiteral().getRawType();
        key = createUninitializedBinding(key, Scoping.UNSCOPED, jitlimitation, errors, true);
        errors.throwIfNewErrors(i);
        initializeJitBinding(key, errors);
        return key;
    }

    private BindingImpl createJustInTimeBindingRecursive(Key key, Errors errors, boolean flag, JitLimitation jitlimitation)
        throws ErrorsException
    {
        if (parent == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        Object obj;
        InjectorImpl injectorimpl;
        Errors errors1;
        injectorimpl = parent;
        errors1 = new Errors();
        if (!parent.options.jitDisabled)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        obj = JitLimitation.NO_JIT;
_L1:
        obj = injectorimpl.createJustInTimeBindingRecursive(key, errors1, flag, ((JitLimitation) (obj)));
        return ((BindingImpl) (obj));
        obj = jitlimitation;
          goto _L1
        ErrorsException errorsexception;
        errorsexception;
        if (state.isBlacklisted(key))
        {
            throw errors.childBindingAlreadySet(key, state.getSourcesForBlacklistedKey(key)).toException();
        } else
        {
            errors = createJustInTimeBinding(key, errors, flag, jitlimitation);
            state.parent().blacklist(key, errors.getSource());
            jitBindings.put(key, errors);
            return errors;
        }
    }

    private BindingImpl createMembersInjectorBinding(Key key, Errors errors)
        throws ErrorsException
    {
        Object obj = key.getTypeLiteral().getType();
        if (!(obj instanceof ParameterizedType))
        {
            throw errors.cannotInjectRawMembersInjector().toException();
        } else
        {
            obj = TypeLiteral.get(((ParameterizedType)obj).getActualTypeArguments()[0]);
            errors = membersInjectorStore.get(((TypeLiteral) (obj)), errors);
            obj = new ConstantFactory(Initializables.of(errors));
            return new InstanceBindingImpl(this, key, $SourceProvider.UNKNOWN_SOURCE, ((InternalFactory) (obj)), $ImmutableSet.of(), errors);
        }
    }

    private BindingImpl createProviderBinding(Key key, Errors errors)
        throws ErrorsException
    {
        return new ProviderBindingImpl(this, key, getBindingOrThrow(getProvidedKey(key, errors), errors, JitLimitation.NO_JIT));
    }

    private BindingImpl createTypeLiteralBinding(Key key, Errors errors)
        throws ErrorsException
    {
        Object obj = key.getTypeLiteral().getType();
        if (!(obj instanceof ParameterizedType))
        {
            throw errors.cannotInjectRawTypeLiteral().toException();
        }
        obj = ((ParameterizedType)obj).getActualTypeArguments()[0];
        if (!(obj instanceof Class) && !(obj instanceof GenericArrayType) && !(obj instanceof ParameterizedType))
        {
            throw errors.cannotInjectTypeLiteralOf(((java.lang.reflect.Type) (obj))).toException();
        } else
        {
            errors = TypeLiteral.get(((java.lang.reflect.Type) (obj)));
            obj = new ConstantFactory(Initializables.of(errors));
            return new InstanceBindingImpl(this, key, $SourceProvider.UNKNOWN_SOURCE, ((InternalFactory) (obj)), $ImmutableSet.of(), errors);
        }
    }

    private Set getInternalDependencies(BindingImpl bindingimpl)
    {
        if (bindingimpl instanceof ConstructorBindingImpl)
        {
            return ((ConstructorBindingImpl)bindingimpl).getInternalDependencies();
        }
        if (bindingimpl instanceof HasDependencies)
        {
            return ((HasDependencies)bindingimpl).getDependencies();
        } else
        {
            return $ImmutableSet.of();
        }
    }

    private BindingImpl getJustInTimeBinding(Key key, Errors errors, JitLimitation jitlimitation)
        throws ErrorsException
    {
        InjectorImpl injectorimpl;
        Object obj;
        BindingImpl bindingimpl;
        boolean flag;
        if (isProvider(key) || isTypeLiteral(key) || isMembersInjector(key))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = state.lock();
        obj;
        JVM INSTR monitorenter ;
        injectorimpl = this;
_L1:
        if (injectorimpl == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        bindingimpl = (BindingImpl)injectorimpl.jitBindings.get(key);
        if (bindingimpl == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        if (!options.jitDisabled || jitlimitation != JitLimitation.NO_JIT || flag)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        if (!(bindingimpl instanceof ConvertedConstantBindingImpl))
        {
            throw errors.jitDisabled(key).toException();
        }
        break MISSING_BLOCK_LABEL_118;
        key;
        obj;
        JVM INSTR monitorexit ;
        throw key;
        obj;
        JVM INSTR monitorexit ;
        return bindingimpl;
        injectorimpl = injectorimpl.parent;
          goto _L1
        key = createJustInTimeBindingRecursive(key, errors, options.jitDisabled, jitlimitation);
        obj;
        JVM INSTR monitorexit ;
        return key;
    }

    private static Key getProvidedKey(Key key, Errors errors)
        throws ErrorsException
    {
        java.lang.reflect.Type type = key.getTypeLiteral().getType();
        if (!(type instanceof ParameterizedType))
        {
            throw errors.cannotInjectRawProvider().toException();
        } else
        {
            return key.ofType(((ParameterizedType)type).getActualTypeArguments()[0]);
        }
    }

    private static boolean isMembersInjector(Key key)
    {
        return key.getTypeLiteral().getRawType().equals(com/google/inject/MembersInjector) && key.getAnnotationType() == null;
    }

    private static boolean isProvider(Key key)
    {
        return key.getTypeLiteral().getRawType().equals(com/google/inject/Provider);
    }

    private static boolean isTypeLiteral(Key key)
    {
        return key.getTypeLiteral().getRawType().equals(com/google/inject/TypeLiteral);
    }

    private void removeFailedJitBinding(Key key, InjectionPoint injectionpoint)
    {
        jitBindings.remove(key);
        membersInjectorStore.remove(key.getTypeLiteral());
        if (injectionpoint != null)
        {
            constructors.remove(injectionpoint);
        }
    }

    Object callInContext(ContextualCallable contextualcallable)
        throws ErrorsException
    {
        Object aobj[];
        aobj = (Object[])localContext.get();
        if (aobj[0] != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        aobj[0] = new InternalContext();
        contextualcallable = ((ContextualCallable) (contextualcallable.call((InternalContext)aobj[0])));
        aobj[0] = null;
        return contextualcallable;
        contextualcallable;
        aobj[0] = null;
        throw contextualcallable;
        return contextualcallable.call((InternalContext)aobj[0]);
    }

    public Injector createChildInjector(Iterable iterable)
    {
        return (new InternalInjectorCreator()).parentInjector(this).addModules(iterable).build();
    }

    public transient Injector createChildInjector(Module amodule[])
    {
        return createChildInjector(((Iterable) ($ImmutableList.of(amodule))));
    }

    SingleParameterInjector createParameterInjector(Dependency dependency, Errors errors)
        throws ErrorsException
    {
        return new SingleParameterInjector(dependency, getInternalFactory(dependency.getKey(), errors, JitLimitation.NO_JIT));
    }

    BindingImpl createProvidedByBinding(Key key, Scoping scoping, ProvidedBy providedby, Errors errors)
        throws ErrorsException
    {
        Class class1 = key.getTypeLiteral().getRawType();
        providedby = providedby.value();
        if (providedby == class1)
        {
            throw errors.recursiveProviderType().toException();
        } else
        {
            final Key providerKey = Key.get(providedby);
            return new LinkedProviderBindingImpl(this, key, class1, Scoping.scope(key, this, new InternalFactory() {

                final InjectorImpl this$0;
                final BindingImpl val$providerBinding;
                final Key val$providerKey;
                final Class val$providerType;
                final Class val$rawType;

                public Object get(Errors errors1, InternalContext internalcontext, Dependency dependency, boolean flag)
                    throws ErrorsException
                {
                    errors1 = errors1.withSource(providerKey);
                    internalcontext = (Provider)providerBinding.getInternalFactory().get(errors1, internalcontext, dependency, true);
                    try
                    {
                        internalcontext = ((InternalContext) (internalcontext.get()));
                    }
                    // Misplaced declaration of an exception variable
                    catch (InternalContext internalcontext)
                    {
                        throw errors1.errorInProvider(internalcontext).toException();
                    }
                    if (internalcontext == null)
                    {
                        break MISSING_BLOCK_LABEL_77;
                    }
                    if (!rawType.isInstance(internalcontext))
                    {
                        throw errors1.subtypeNotProvided(providerType, rawType).toException();
                    }
                    return internalcontext;
                }

            
            {
                this$0 = InjectorImpl.this;
                providerKey = key;
                providerBinding = bindingimpl;
                rawType = class1;
                providerType = class2;
                super();
            }
            }, class1, scoping), scoping, providerKey);
        }
    }

    BindingImpl createUninitializedBinding(Key key, Scoping scoping, Object obj, Errors errors, boolean flag)
        throws ErrorsException
    {
        Class class1 = key.getTypeLiteral().getRawType();
        if (class1.isArray() || class1.isEnum())
        {
            throw errors.missingImplementation(key).toException();
        }
        if (class1 == com/google/inject/TypeLiteral)
        {
            return createTypeLiteralBinding(key, errors);
        }
        Object obj1 = (ImplementedBy)class1.getAnnotation(com/google/inject/ImplementedBy);
        if (obj1 != null)
        {
            Annotations.checkForMisplacedScopeAnnotations(class1, obj, errors);
            return createImplementedByBinding(key, scoping, ((ImplementedBy) (obj1)), errors);
        }
        obj1 = (ProvidedBy)class1.getAnnotation(com/google/inject/ProvidedBy);
        if (obj1 != null)
        {
            Annotations.checkForMisplacedScopeAnnotations(class1, obj, errors);
            return createProvidedByBinding(key, scoping, ((ProvidedBy) (obj1)), errors);
        }
        if (flag && options.jitDisabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return ConstructorBindingImpl.create(this, key, null, obj, scoping, errors, flag);
    }

    public List findBindingsByType(TypeLiteral typeliteral)
    {
        return bindingsMultimap.getAll(typeliteral);
    }

    public Map getAllBindings()
    {
        $ImmutableMap $immutablemap;
        synchronized (state.lock())
        {
            $immutablemap = (new com.google.inject.internal.util..ImmutableMap.Builder()).putAll(state.getExplicitBindingsThisLevel()).putAll(jitBindings).build();
        }
        return $immutablemap;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public volatile Binding getBinding(Key key)
    {
        return getBinding(key);
    }

    public Binding getBinding(Class class1)
    {
        return getBinding(Key.get(class1));
    }

    public BindingImpl getBinding(Key key)
    {
        Errors errors = new Errors(key);
        try
        {
            key = getBindingOrThrow(key, errors, JitLimitation.EXISTING_JIT);
            errors.throwConfigurationExceptionIfErrorsExist();
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new ConfigurationException(errors.merge(key.getErrors()).getMessages());
        }
        return key;
    }

    BindingImpl getBindingOrThrow(Key key, Errors errors, JitLimitation jitlimitation)
        throws ErrorsException
    {
        BindingImpl bindingimpl = state.getExplicitBinding(key);
        if (bindingimpl != null)
        {
            return bindingimpl;
        } else
        {
            return getJustInTimeBinding(key, errors, jitlimitation);
        }
    }

    public Map getBindings()
    {
        return state.getExplicitBindingsThisLevel();
    }

    public volatile Binding getExistingBinding(Key key)
    {
        return getExistingBinding(key);
    }

    public BindingImpl getExistingBinding(Key key)
    {
        BindingImpl bindingimpl = state.getExplicitBinding(key);
        if (bindingimpl != null)
        {
            return bindingimpl;
        }
        Object obj = state.lock();
        obj;
        JVM INSTR monitorenter ;
        InjectorImpl injectorimpl = this;
_L1:
        if (injectorimpl == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        BindingImpl bindingimpl1 = (BindingImpl)injectorimpl.jitBindings.get(key);
        if (bindingimpl1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        obj;
        JVM INSTR monitorexit ;
        return bindingimpl1;
        injectorimpl = injectorimpl.parent;
          goto _L1
        obj;
        JVM INSTR monitorexit ;
        if (!isProvider(key))
        {
            break MISSING_BLOCK_LABEL_124;
        }
        try
        {
            if (getExistingBinding(getProvidedKey(key, new Errors())) == null)
            {
                break MISSING_BLOCK_LABEL_124;
            }
            key = getBinding(key);
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new ConfigurationException(key.getErrors().getMessages());
        }
        return key;
        key;
        obj;
        JVM INSTR monitorexit ;
        throw key;
        return null;
    }

    public Object getInstance(Key key)
    {
        return getProvider(key).get();
    }

    public Object getInstance(Class class1)
    {
        return getProvider(class1).get();
    }

    InternalFactory getInternalFactory(Key key, Errors errors, JitLimitation jitlimitation)
        throws ErrorsException
    {
        return getBindingOrThrow(key, errors, jitlimitation).getInternalFactory();
    }

    public MembersInjector getMembersInjector(TypeLiteral typeliteral)
    {
        Errors errors = new Errors(typeliteral);
        try
        {
            typeliteral = membersInjectorStore.get(typeliteral, errors);
        }
        // Misplaced declaration of an exception variable
        catch (TypeLiteral typeliteral)
        {
            throw new ConfigurationException(errors.merge(typeliteral.getErrors()).getMessages());
        }
        return typeliteral;
    }

    public MembersInjector getMembersInjector(Class class1)
    {
        return getMembersInjector(TypeLiteral.get(class1));
    }

    SingleParameterInjector[] getParametersInjectors(List list, Errors errors)
        throws ErrorsException
    {
        if (list.isEmpty())
        {
            return null;
        }
        int j = errors.size();
        SingleParameterInjector asingleparameterinjector[] = new SingleParameterInjector[list.size()];
        int i = 0;
        list = list.iterator();
        while (list.hasNext()) 
        {
            Dependency dependency = (Dependency)list.next();
            try
            {
                asingleparameterinjector[i] = createParameterInjector(dependency, errors.withSource(dependency));
            }
            catch (ErrorsException errorsexception) { }
            i++;
        }
        errors.throwIfNewErrors(j);
        return asingleparameterinjector;
    }

    public Injector getParent()
    {
        return parent;
    }

    public Provider getProvider(Key key)
    {
        Errors errors = new Errors(key);
        try
        {
            key = getProviderOrThrow(key, errors);
            errors.throwIfNewErrors(0);
        }
        // Misplaced declaration of an exception variable
        catch (Key key)
        {
            throw new ConfigurationException(errors.merge(key.getErrors()).getMessages());
        }
        return key;
    }

    public Provider getProvider(Class class1)
    {
        return getProvider(Key.get(class1));
    }

    Provider getProviderOrThrow(Key key, Errors errors)
        throws ErrorsException
    {
        errors = getInternalFactory(key, errors, JitLimitation.NO_JIT);
        return new Provider() {

            final InjectorImpl this$0;
            final Dependency val$dependency;
            final InternalFactory val$factory;

            public Object get()
            {
                Errors errors1 = new Errors(dependency);
                Object obj;
                try
                {
                    obj = callInContext(errors1. new ContextualCallable() {

                        final _cls4 this$1;
                        final Errors val$errors;

                        public Object call(InternalContext internalcontext)
                            throws ErrorsException
                        {
                            Dependency dependency = internalcontext.setDependency(_cls4.this.dependency);
                            Object obj = factory.get(errors, internalcontext, _cls4.this.dependency, false);
                            internalcontext.setDependency(dependency);
                            return obj;
                            Exception exception;
                            exception;
                            internalcontext.setDependency(dependency);
                            throw exception;
                        }

            
            {
                this$1 = final__pcls4;
                errors = Errors.this;
                super();
            }
                    });
                    errors1.throwIfNewErrors(0);
                }
                catch (ErrorsException errorsexception)
                {
                    throw new ProvisionException(errors1.merge(errorsexception.getErrors()).getMessages());
                }
                return obj;
            }

            public String toString()
            {
                return factory.toString();
            }

            
            {
                this$0 = InjectorImpl.this;
                dependency = dependency1;
                factory = internalfactory;
                super();
            }
        };
    }

    public Map getScopeBindings()
    {
        return $ImmutableMap.copyOf(state.getScopes());
    }

    public Set getTypeConverterBindings()
    {
        return $ImmutableSet.copyOf(state.getConvertersThisLevel());
    }

    void index()
    {
        for (Iterator iterator = state.getExplicitBindingsThisLevel().values().iterator(); iterator.hasNext(); index((Binding)iterator.next())) { }
    }

    void index(Binding binding)
    {
        bindingsMultimap.put(binding.getKey().getTypeLiteral(), binding);
    }

    void initializeBinding(BindingImpl bindingimpl, Errors errors)
        throws ErrorsException
    {
        if (bindingimpl instanceof ConstructorBindingImpl)
        {
            ((ConstructorBindingImpl)bindingimpl).initialize(this, errors);
        }
    }

    void initializeJitBinding(BindingImpl bindingimpl, Errors errors)
        throws ErrorsException
    {
        Key key;
        ConstructorBindingImpl constructorbindingimpl;
        if (!(bindingimpl instanceof ConstructorBindingImpl))
        {
            break MISSING_BLOCK_LABEL_60;
        }
        key = bindingimpl.getKey();
        jitBindings.put(key, bindingimpl);
        constructorbindingimpl = (ConstructorBindingImpl)bindingimpl;
        constructorbindingimpl.initialize(this, errors);
        if (false)
        {
            removeFailedJitBinding(key, null);
            cleanup(bindingimpl, new HashSet());
        }
        return;
        errors;
        if (true)
        {
            removeFailedJitBinding(key, null);
            cleanup(bindingimpl, new HashSet());
        }
        throw errors;
    }

    public void injectMembers(Object obj)
    {
        getMembersInjector(obj.getClass()).injectMembers(obj);
    }

    public String toString()
    {
        return (new $ToStringBuilder(com/google/inject/Injector)).add("bindings", state.getExplicitBindingsThisLevel().values()).toString();
    }

}
