// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// Referenced classes of package dagger.internal:
//            ArrayQueue, Keys, BuiltInBinding, LazyBinding, 
//            Loader, Binding, BindingsGroup

public final class Linker
{
    static class DeferredBinding extends Binding
    {

        final ClassLoader classLoader;
        final String deferredKey;
        final boolean mustHaveInjections;

        public void getDependencies(Set set, Set set1)
        {
            throw new UnsupportedOperationException("Deferred bindings must resolve first.");
        }

        public void injectMembers(Object obj)
        {
            throw new UnsupportedOperationException("Deferred bindings must resolve first.");
        }

        public String toString()
        {
            String s = deferredKey;
            return (new StringBuilder(String.valueOf(s).length() + 29)).append("DeferredBinding[deferredKey=").append(s).append("]").toString();
        }

        private DeferredBinding(String s, ClassLoader classloader, Object obj, boolean flag)
        {
            super(null, null, false, obj);
            deferredKey = s;
            classLoader = classloader;
            mustHaveInjections = flag;
        }

    }

    public static interface ErrorHandler
    {

        public static final ErrorHandler NULL = new ErrorHandler() {

            public final void handleErrors(List list)
            {
            }

        };

        public abstract void handleErrors(List list);

    }

    static class SingletonBinding extends Binding
    {

        private final Binding binding;
        private volatile Object onlyInstance;

        public void attach(Linker linker)
        {
            binding.attach(linker);
        }

        public boolean dependedOn()
        {
            return binding.dependedOn();
        }

        public Object get()
        {
            if (onlyInstance != Linker.UNINITIALIZED) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorenter ;
            if (onlyInstance == Linker.UNINITIALIZED)
            {
                onlyInstance = binding.get();
            }
            this;
            JVM INSTR monitorexit ;
_L2:
            return onlyInstance;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void getDependencies(Set set, Set set1)
        {
            binding.getDependencies(set, set1);
        }

        public void injectMembers(Object obj)
        {
            binding.injectMembers(obj);
        }

        public boolean isCycleFree()
        {
            return binding.isCycleFree();
        }

        public boolean isLinked()
        {
            return binding.isLinked();
        }

        protected boolean isSingleton()
        {
            return true;
        }

        public boolean isVisiting()
        {
            return binding.isVisiting();
        }

        public boolean library()
        {
            return binding.library();
        }

        public void setCycleFree(boolean flag)
        {
            binding.setCycleFree(flag);
        }

        public void setDependedOn(boolean flag)
        {
            binding.setDependedOn(flag);
        }

        public void setLibrary(boolean flag)
        {
            binding.setLibrary(true);
        }

        protected void setLinked()
        {
            binding.setLinked();
        }

        public void setVisiting(boolean flag)
        {
            binding.setVisiting(flag);
        }

        public String toString()
        {
            String s = String.valueOf(binding.toString());
            if (s.length() != 0)
            {
                return "@Singleton/".concat(s);
            } else
            {
                return new String("@Singleton/");
            }
        }

        private SingletonBinding(Binding binding1)
        {
            super(binding1.provideKey, binding1.membersKey, true, binding1.requiredBy);
            onlyInstance = Linker.UNINITIALIZED;
            binding = binding1;
        }

    }


    private static final Object UNINITIALIZED = new Object();
    private boolean attachSuccess;
    private final Linker base;
    private final Map bindings = new HashMap();
    private final ErrorHandler errorHandler;
    private final List errors = new ArrayList();
    private volatile Map linkedBindings;
    private final Loader plugin;
    private final Queue toLink = new ArrayQueue();

    public Linker(Linker linker, Loader loader, ErrorHandler errorhandler)
    {
        attachSuccess = true;
        linkedBindings = null;
        if (loader == null)
        {
            throw new NullPointerException("plugin");
        }
        if (errorhandler == null)
        {
            throw new NullPointerException("errorHandler");
        } else
        {
            base = linker;
            plugin = loader;
            errorHandler = errorhandler;
            return;
        }
    }

    private void addError(String s)
    {
        errors.add(s);
    }

    private void assertLockHeld()
    {
        if (!Thread.holdsLock(this))
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    private Binding createBinding(String s, Object obj, ClassLoader classloader, boolean flag)
    {
        String s1 = Keys.getBuiltInBindingsKey(s);
        if (s1 != null)
        {
            obj = new BuiltInBinding(s, obj, classloader, s1);
        } else
        {
            String s2 = Keys.getLazyKey(s);
            if (s2 != null)
            {
                return new LazyBinding(s, obj, classloader, s2);
            }
            s2 = Keys.getClassName(s);
            if (s2 == null)
            {
                throw new Binding.InvalidBindingException(s, "is a generic class or an array and can only be bound with concrete type parameter(s) in a @Provides method.");
            }
            if (Keys.isAnnotated(s))
            {
                throw new Binding.InvalidBindingException(s, "is a @Qualifier-annotated type and must be bound by a @Provides method.");
            }
            classloader = plugin.getAtInjectBinding(s, s2, classloader, flag);
            obj = classloader;
            if (classloader == null)
            {
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    s = "could not be bound with key ".concat(s);
                } else
                {
                    s = new String("could not be bound with key ");
                }
                throw new Binding.InvalidBindingException(s2, s);
            }
        }
        return ((Binding) (obj));
    }

    private void putBinding(Binding binding)
    {
        if (binding.provideKey != null)
        {
            putIfAbsent(bindings, binding.provideKey, binding);
        }
        if (binding.membersKey != null)
        {
            putIfAbsent(bindings, binding.membersKey, binding);
        }
    }

    private static void putIfAbsent(Map map, Object obj, Object obj1)
    {
        obj1 = map.put(obj, obj1);
        if (obj1 != null)
        {
            map.put(obj, obj1);
        }
    }

    static Binding scope(Binding binding)
    {
        if (!binding.isSingleton() || (binding instanceof SingletonBinding))
        {
            return binding;
        } else
        {
            return new SingletonBinding(binding);
        }
    }

    public final Map fullyLinkedBindings()
    {
        return linkedBindings;
    }

    public final void installBindings(BindingsGroup bindingsgroup)
    {
        if (linkedBindings != null)
        {
            throw new IllegalStateException("Cannot install further bindings after calling linkAll().");
        }
        java.util.Map.Entry entry;
        for (bindingsgroup = bindingsgroup.entrySet().iterator(); bindingsgroup.hasNext(); bindings.put(entry.getKey(), scope((Binding)entry.getValue())))
        {
            entry = (java.util.Map.Entry)bindingsgroup.next();
        }

    }

    public final Map linkAll()
    {
        assertLockHeld();
        if (linkedBindings != null)
        {
            return linkedBindings;
        }
        Iterator iterator = bindings.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Binding binding = (Binding)iterator.next();
            if (!binding.isLinked())
            {
                toLink.add(binding);
            }
        } while (true);
        linkRequested();
        linkedBindings = Collections.unmodifiableMap(bindings);
        return linkedBindings;
    }

    public final void linkRequested()
    {
        assertLockHeld();
_L3:
        Object obj;
        String s1;
        Object obj1;
        boolean flag;
        obj1 = (Binding)toLink.poll();
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!(obj1 instanceof DeferredBinding))
        {
            break MISSING_BLOCK_LABEL_466;
        }
        obj = (DeferredBinding)obj1;
        s1 = ((DeferredBinding) (obj)).deferredKey;
        flag = ((DeferredBinding) (obj)).mustHaveInjections;
        if (bindings.containsKey(s1))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = createBinding(s1, ((Binding) (obj1)).requiredBy, ((DeferredBinding) (obj)).classLoader, flag);
        ((Binding) (obj)).setLibrary(((Binding) (obj1)).library());
        ((Binding) (obj)).setDependedOn(((Binding) (obj1)).dependedOn());
        if (s1.equals(((Binding) (obj)).provideKey) || s1.equals(((Binding) (obj)).membersKey))
        {
            break MISSING_BLOCK_LABEL_349;
        }
        obj = String.valueOf(s1);
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        obj = "Unable to create binding for ".concat(((String) (obj)));
_L1:
        Binding.InvalidBindingException invalidbindingexception;
        String s2;
        throw new IllegalStateException(((String) (obj)));
        obj = new String("Unable to create binding for ");
          goto _L1
        try
        {
            obj = scope(((Binding) (obj)));
            toLink.add(obj);
            putBinding(((Binding) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Binding.InvalidBindingException invalidbindingexception)
        {
            obj = invalidbindingexception.type;
            s2 = String.valueOf(invalidbindingexception.getMessage());
            obj1 = String.valueOf(((Binding) (obj1)).requiredBy);
            addError((new StringBuilder(String.valueOf(obj).length() + 14 + String.valueOf(s2).length() + String.valueOf(obj1).length())).append(((String) (obj))).append(" ").append(s2).append(" required by ").append(((String) (obj1))).toString());
            bindings.put(s1, Binding.UNRESOLVED);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = String.valueOf(((UnsupportedOperationException) (obj)).getMessage());
            obj1 = String.valueOf(((Binding) (obj1)).requiredBy);
            addError((new StringBuilder(String.valueOf(obj).length() + 26 + String.valueOf(obj1).length())).append("Unsupported: ").append(((String) (obj))).append(" required by ").append(((String) (obj1))).toString());
            bindings.put(s1, Binding.UNRESOLVED);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            String s = String.valueOf(illegalargumentexception.getMessage());
            obj1 = String.valueOf(((Binding) (obj1)).requiredBy);
            addError((new StringBuilder(String.valueOf(s).length() + 13 + String.valueOf(obj1).length())).append(s).append(" required by ").append(((String) (obj1))).toString());
            bindings.put(s1, Binding.UNRESOLVED);
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception);
        }
        continue; /* Loop/switch isn't completed */
        attachSuccess = true;
        ((Binding) (obj1)).attach(this);
        if (attachSuccess)
        {
            ((Binding) (obj1)).setLinked();
        } else
        {
            toLink.add(obj1);
        }
        if (true) goto _L3; else goto _L2
_L2:
        errorHandler.handleErrors(errors);
        errors.clear();
        return;
        Exception exception1;
        exception1;
        errors.clear();
        throw exception1;
    }

    public final Binding requestBinding(String s, Object obj, ClassLoader classloader)
    {
        return requestBinding(s, obj, classloader, true, true);
    }

    public final Binding requestBinding(String s, Object obj, ClassLoader classloader, boolean flag, boolean flag1)
    {
        assertLockHeld();
        Binding binding = null;
        Linker linker = this;
        Binding binding1;
        do
        {
            binding1 = binding;
            if (linker == null)
            {
                break;
            }
            binding = (Binding)linker.bindings.get(s);
            if (binding != null)
            {
                binding1 = binding;
                if (linker != this)
                {
                    binding1 = binding;
                    if (!binding.isLinked())
                    {
                        throw new AssertionError();
                    }
                }
                break;
            }
            linker = linker.base;
        } while (true);
        if (binding1 == null)
        {
            s = new DeferredBinding(s, classloader, obj, flag);
            s.setLibrary(flag1);
            s.setDependedOn(true);
            toLink.add(s);
            attachSuccess = false;
            return null;
        }
        if (!binding1.isLinked())
        {
            toLink.add(binding1);
        }
        binding1.setLibrary(flag1);
        binding1.setDependedOn(true);
        return binding1;
    }


}
