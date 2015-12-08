// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binding;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.MembersInjector;
import com.google.inject.Module;
import com.google.inject.Provider;
import com.google.inject.Stage;
import com.google.inject.TypeLiteral;
import com.google.inject.internal.util.$ImmutableList;
import com.google.inject.internal.util.$Iterables;
import com.google.inject.internal.util.$Stopwatch;
import com.google.inject.spi.Dependency;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.inject.internal:
//            Errors, Initializer, InjectionRequestProcessor, ProcessedBindingData, 
//            InjectorShell, InjectorImpl, LookupProcessor, DeferredLookups, 
//            BindingImpl, Scoping, LinkedBindingImpl, ErrorsException, 
//            State, ContextualCallable, InternalContext, InternalFactory

public final class InternalInjectorCreator
{
    static class ToolStageInjector
        implements Injector
    {

        private final Injector delegateInjector;

        public Injector createChildInjector(Iterable iterable)
        {
            return delegateInjector.createChildInjector(iterable);
        }

        public transient Injector createChildInjector(Module amodule[])
        {
            return delegateInjector.createChildInjector(amodule);
        }

        public List findBindingsByType(TypeLiteral typeliteral)
        {
            return delegateInjector.findBindingsByType(typeliteral);
        }

        public Map getAllBindings()
        {
            return delegateInjector.getAllBindings();
        }

        public Binding getBinding(Key key)
        {
            return delegateInjector.getBinding(key);
        }

        public Binding getBinding(Class class1)
        {
            return delegateInjector.getBinding(class1);
        }

        public Map getBindings()
        {
            return delegateInjector.getBindings();
        }

        public Binding getExistingBinding(Key key)
        {
            return delegateInjector.getExistingBinding(key);
        }

        public Object getInstance(Key key)
        {
            throw new UnsupportedOperationException("Injector.getInstance(Key<T>) is not supported in Stage.TOOL");
        }

        public Object getInstance(Class class1)
        {
            throw new UnsupportedOperationException("Injector.getInstance(Class<T>) is not supported in Stage.TOOL");
        }

        public MembersInjector getMembersInjector(TypeLiteral typeliteral)
        {
            throw new UnsupportedOperationException("Injector.getMembersInjector(TypeLiteral<T>) is not supported in Stage.TOOL");
        }

        public MembersInjector getMembersInjector(Class class1)
        {
            throw new UnsupportedOperationException("Injector.getMembersInjector(Class<T>) is not supported in Stage.TOOL");
        }

        public Injector getParent()
        {
            return delegateInjector.getParent();
        }

        public Provider getProvider(Key key)
        {
            throw new UnsupportedOperationException("Injector.getProvider(Key<T>) is not supported in Stage.TOOL");
        }

        public Provider getProvider(Class class1)
        {
            throw new UnsupportedOperationException("Injector.getProvider(Class<T>) is not supported in Stage.TOOL");
        }

        public Map getScopeBindings()
        {
            return delegateInjector.getScopeBindings();
        }

        public Set getTypeConverterBindings()
        {
            return delegateInjector.getTypeConverterBindings();
        }

        public void injectMembers(Object obj)
        {
            throw new UnsupportedOperationException("Injector.injectMembers(Object) is not supported in Stage.TOOL");
        }

        ToolStageInjector(Injector injector)
        {
            delegateInjector = injector;
        }
    }


    private final ProcessedBindingData bindingData = new ProcessedBindingData();
    private final Errors errors = new Errors();
    private final Initializer initializer = new Initializer();
    private final InjectionRequestProcessor injectionRequestProcessor;
    private final InjectorShell.Builder shellBuilder = new InjectorShell.Builder();
    private List shells;
    private final $Stopwatch stopwatch = new $Stopwatch();

    public InternalInjectorCreator()
    {
        injectionRequestProcessor = new InjectionRequestProcessor(errors, initializer);
    }

    private void initializeStatically()
    {
        bindingData.initializeBindings();
        stopwatch.resetAndLog("Binding initialization");
        for (Iterator iterator = shells.iterator(); iterator.hasNext(); ((InjectorShell)iterator.next()).getInjector().index()) { }
        stopwatch.resetAndLog("Binding indexing");
        injectionRequestProcessor.process(shells);
        stopwatch.resetAndLog("Collecting injection requests");
        bindingData.runCreationListeners(errors);
        stopwatch.resetAndLog("Binding validation");
        injectionRequestProcessor.validate();
        stopwatch.resetAndLog("Static validation");
        initializer.validateOustandingInjections(errors);
        stopwatch.resetAndLog("Instance member validation");
        (new LookupProcessor(errors)).process(shells);
        for (Iterator iterator1 = shells.iterator(); iterator1.hasNext(); ((DeferredLookups)((InjectorShell)iterator1.next()).getInjector().lookups).initialize(errors)) { }
        stopwatch.resetAndLog("Provider verification");
        for (Iterator iterator2 = shells.iterator(); iterator2.hasNext();)
        {
            InjectorShell injectorshell = (InjectorShell)iterator2.next();
            if (!injectorshell.getElements().isEmpty())
            {
                throw new AssertionError((new StringBuilder()).append("Failed to execute ").append(injectorshell.getElements()).toString());
            }
        }

        errors.throwCreationExceptionIfErrorsExist();
    }

    private void injectDynamically()
    {
        injectionRequestProcessor.injectMembers();
        stopwatch.resetAndLog("Static member injection");
        initializer.injectAll(errors);
        stopwatch.resetAndLog("Instance injection");
        errors.throwCreationExceptionIfErrorsExist();
        if (shellBuilder.getStage() != Stage.TOOL)
        {
            for (Iterator iterator = shells.iterator(); iterator.hasNext(); loadEagerSingletons(((InjectorShell)iterator.next()).getInjector(), shellBuilder.getStage(), errors)) { }
            stopwatch.resetAndLog("Preloading singletons");
        }
        errors.throwCreationExceptionIfErrorsExist();
    }

    private boolean isEagerSingleton(InjectorImpl injectorimpl, BindingImpl bindingimpl, Stage stage1)
    {
        if (bindingimpl.getScoping().isEagerSingleton(stage1))
        {
            return true;
        }
        if (bindingimpl instanceof LinkedBindingImpl)
        {
            return isEagerSingleton(injectorimpl, injectorimpl.getBinding(((LinkedBindingImpl)bindingimpl).getLinkedKey()), stage1);
        } else
        {
            return false;
        }
    }

    private Injector primaryInjector()
    {
        return ((InjectorShell)shells.get(0)).getInjector();
    }

    public InternalInjectorCreator addModules(Iterable iterable)
    {
        shellBuilder.addModules(iterable);
        return this;
    }

    public Injector build()
    {
        if (shellBuilder == null)
        {
            throw new AssertionError("Already built, builders are not reusable.");
        }
        synchronized (shellBuilder.lock())
        {
            shells = shellBuilder.build(initializer, bindingData, stopwatch, errors);
            stopwatch.resetAndLog("Injector construction");
            initializeStatically();
        }
        injectDynamically();
        if (shellBuilder.getStage() == Stage.TOOL)
        {
            return new ToolStageInjector(primaryInjector());
        } else
        {
            return primaryInjector();
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void loadEagerSingletons(InjectorImpl injectorimpl, Stage stage1, final Errors errors)
    {
        Iterator iterator = $ImmutableList.copyOf($Iterables.concat(injectorimpl.state.getExplicitBindingsThisLevel().values(), injectorimpl.jitBindings.values())).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            final BindingImpl binding = (BindingImpl)iterator.next();
            if (isEagerSingleton(injectorimpl, binding, stage1))
            {
                try
                {
                    injectorimpl.callInContext(new ContextualCallable() {

                        Dependency dependency;
                        final InternalInjectorCreator this$0;
                        final BindingImpl val$binding;
                        final Errors val$errors;

                        public volatile Object call(InternalContext internalcontext)
                            throws ErrorsException
                        {
                            return call(internalcontext);
                        }

                        public Void call(InternalContext internalcontext)
                        {
                            Dependency dependency1;
                            Errors errors1;
                            dependency1 = internalcontext.setDependency(dependency);
                            errors1 = errors.withSource(dependency);
                            binding.getInternalFactory().get(errors1, internalcontext, dependency, false);
                            internalcontext.setDependency(dependency1);
_L2:
                            return null;
                            ErrorsException errorsexception;
                            errorsexception;
                            errors1.merge(errorsexception.getErrors());
                            internalcontext.setDependency(dependency1);
                            if (true) goto _L2; else goto _L1
_L1:
                            Exception exception;
                            exception;
                            internalcontext.setDependency(dependency1);
                            throw exception;
                        }

            
            {
                this$0 = InternalInjectorCreator.this;
                binding = bindingimpl;
                errors = errors1;
                super();
                dependency = Dependency.get(binding.getKey());
            }
                    });
                }
                // Misplaced declaration of an exception variable
                catch (InjectorImpl injectorimpl)
                {
                    throw new AssertionError();
                }
            }
        } while (true);
    }

    public InternalInjectorCreator parentInjector(InjectorImpl injectorimpl)
    {
        shellBuilder.parent(injectorimpl);
        return this;
    }

    public InternalInjectorCreator stage(Stage stage1)
    {
        shellBuilder.stage(stage1);
        return this;
    }
}
