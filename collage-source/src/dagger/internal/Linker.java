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
            if (s2 == null || Keys.isAnnotated(s))
            {
                throw new IllegalArgumentException(s);
            }
            classloader = plugin.getAtInjectBinding(s, s2, classloader, flag);
            obj = classloader;
            if (classloader == null)
            {
                throw new Binding.InvalidBindingException(s2, (new StringBuilder()).append("could not be bound with key ").append(s).toString());
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

    private void putIfAbsent(Map map, Object obj, Object obj1)
    {
        obj1 = map.put(obj, obj1);
        if (obj1 != null)
        {
            map.put(obj, obj1);
        }
    }

    static Binding scope(Binding binding)
    {
    /* block-local class not found */
    class SingletonBinding {}

        if (!binding.isSingleton() || (binding instanceof SingletonBinding))
        {
            return binding;
        } else
        {
            return new SingletonBinding(binding, null);
        }
    }

    public Map fullyLinkedBindings()
    {
        return linkedBindings;
    }

    public void installBindings(BindingsGroup bindingsgroup)
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

    public Map linkAll()
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

    public void linkRequested()
    {
        assertLockHeld();
_L2:
    /* block-local class not found */
    class DeferredBinding {}

        Object obj;
        String s;
        Object obj1;
        boolean flag;
        obj = (Binding)toLink.poll();
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof DeferredBinding))
        {
            break MISSING_BLOCK_LABEL_351;
        }
        obj1 = (DeferredBinding)obj;
        s = ((DeferredBinding) (obj1)).deferredKey;
        flag = ((DeferredBinding) (obj1)).mustHaveInjections;
        if (bindings.containsKey(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = createBinding(s, ((Binding) (obj)).requiredBy, ((DeferredBinding) (obj1)).classLoader, flag);
        ((Binding) (obj1)).setLibrary(((Binding) (obj)).library());
        ((Binding) (obj1)).setDependedOn(((Binding) (obj)).dependedOn());
        if (!s.equals(((Binding) (obj1)).provideKey) && !s.equals(((Binding) (obj1)).membersKey))
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to create binding for ").append(s).toString());
        }
        try
        {
            obj1 = scope(((Binding) (obj1)));
            toLink.add(obj1);
            putBinding(((Binding) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            addError((new StringBuilder()).append(((Binding.InvalidBindingException) (obj1)).type).append(" ").append(((Binding.InvalidBindingException) (obj1)).getMessage()).append(" required by ").append(((Binding) (obj)).requiredBy).toString());
            bindings.put(s, Binding.UNRESOLVED);
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            addError((new StringBuilder()).append("Unsupported: ").append(unsupportedoperationexception.getMessage()).append(" required by ").append(((Binding) (obj)).requiredBy).toString());
            bindings.put(s, Binding.UNRESOLVED);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            addError((new StringBuilder()).append(illegalargumentexception.getMessage()).append(" required by ").append(((Binding) (obj)).requiredBy).toString());
            bindings.put(s, Binding.UNRESOLVED);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        continue; /* Loop/switch isn't completed */
        attachSuccess = true;
        ((Binding) (obj)).attach(this);
        if (attachSuccess)
        {
            ((Binding) (obj)).setLinked();
        } else
        {
            toLink.add(obj);
        }
        if (true) goto _L2; else goto _L1
_L1:
    /* block-local class not found */
    class ErrorHandler {}

        errorHandler.handleErrors(errors);
        errors.clear();
        return;
        Exception exception;
        exception;
        errors.clear();
        throw exception;
    }

    public Binding requestBinding(String s, Object obj)
    {
        return requestBinding(s, obj, getClass().getClassLoader(), true, true);
    }

    public Binding requestBinding(String s, Object obj, ClassLoader classloader)
    {
        return requestBinding(s, obj, classloader, true, true);
    }

    public Binding requestBinding(String s, Object obj, ClassLoader classloader, boolean flag, boolean flag1)
    {
        assertLockHeld();
        Linker linker = this;
        Binding binding = null;
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
            s = new DeferredBinding(s, classloader, obj, flag, null);
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

    public Binding requestBinding(String s, Object obj, boolean flag, boolean flag1)
    {
        return requestBinding(s, obj, getClass().getClassLoader(), flag, flag1);
    }


}
