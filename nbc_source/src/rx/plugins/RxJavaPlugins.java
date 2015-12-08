// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.plugins;

import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package rx.plugins:
//            RxJavaErrorHandler, RxJavaObservableExecutionHook, RxJavaObservableExecutionHookDefault, RxJavaSchedulersHook

public class RxJavaPlugins
{

    static final RxJavaErrorHandler DEFAULT_ERROR_HANDLER = new RxJavaErrorHandler() {

    };
    private static final RxJavaPlugins INSTANCE = new RxJavaPlugins();
    private final AtomicReference errorHandler = new AtomicReference();
    private final AtomicReference observableExecutionHook = new AtomicReference();
    private final AtomicReference schedulersHook = new AtomicReference();

    RxJavaPlugins()
    {
    }

    public static RxJavaPlugins getInstance()
    {
        return INSTANCE;
    }

    private static Object getPluginImplementationViaProperty(Class class1)
    {
        String s = class1.getSimpleName();
        String s1 = System.getProperty((new StringBuilder()).append("rxjava.plugin.").append(s).append(".implementation").toString());
        if (s1 != null)
        {
            try
            {
                class1 = ((Class) (Class.forName(s1).asSubclass(class1).newInstance()));
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                throw new RuntimeException((new StringBuilder()).append(s).append(" implementation is not an instance of ").append(s).append(": ").append(s1).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                throw new RuntimeException((new StringBuilder()).append(s).append(" implementation class not found: ").append(s1).toString(), class1);
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                throw new RuntimeException((new StringBuilder()).append(s).append(" implementation not able to be instantiated: ").append(s1).toString(), class1);
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                throw new RuntimeException((new StringBuilder()).append(s).append(" implementation not able to be accessed: ").append(s1).toString(), class1);
            }
            return class1;
        } else
        {
            return null;
        }
    }

    public RxJavaErrorHandler getErrorHandler()
    {
        if (errorHandler.get() == null)
        {
            Object obj = getPluginImplementationViaProperty(rx/plugins/RxJavaErrorHandler);
            if (obj == null)
            {
                errorHandler.compareAndSet(null, DEFAULT_ERROR_HANDLER);
            } else
            {
                errorHandler.compareAndSet(null, (RxJavaErrorHandler)obj);
            }
        }
        return (RxJavaErrorHandler)errorHandler.get();
    }

    public RxJavaObservableExecutionHook getObservableExecutionHook()
    {
        if (observableExecutionHook.get() == null)
        {
            Object obj = getPluginImplementationViaProperty(rx/plugins/RxJavaObservableExecutionHook);
            if (obj == null)
            {
                observableExecutionHook.compareAndSet(null, RxJavaObservableExecutionHookDefault.getInstance());
            } else
            {
                observableExecutionHook.compareAndSet(null, (RxJavaObservableExecutionHook)obj);
            }
        }
        return (RxJavaObservableExecutionHook)observableExecutionHook.get();
    }

    public RxJavaSchedulersHook getSchedulersHook()
    {
        if (schedulersHook.get() == null)
        {
            Object obj = getPluginImplementationViaProperty(rx/plugins/RxJavaSchedulersHook);
            if (obj == null)
            {
                schedulersHook.compareAndSet(null, RxJavaSchedulersHook.getDefaultInstance());
            } else
            {
                schedulersHook.compareAndSet(null, (RxJavaSchedulersHook)obj);
            }
        }
        return (RxJavaSchedulersHook)schedulersHook.get();
    }

    public void registerErrorHandler(RxJavaErrorHandler rxjavaerrorhandler)
    {
        if (!errorHandler.compareAndSet(null, rxjavaerrorhandler))
        {
            throw new IllegalStateException((new StringBuilder()).append("Another strategy was already registered: ").append(errorHandler.get()).toString());
        } else
        {
            return;
        }
    }

    public void registerObservableExecutionHook(RxJavaObservableExecutionHook rxjavaobservableexecutionhook)
    {
        if (!observableExecutionHook.compareAndSet(null, rxjavaobservableexecutionhook))
        {
            throw new IllegalStateException((new StringBuilder()).append("Another strategy was already registered: ").append(observableExecutionHook.get()).toString());
        } else
        {
            return;
        }
    }

    public void registerSchedulersHook(RxJavaSchedulersHook rxjavaschedulershook)
    {
        if (!schedulersHook.compareAndSet(null, rxjavaschedulershook))
        {
            throw new IllegalStateException((new StringBuilder()).append("Another strategy was already registered: ").append(schedulersHook.get()).toString());
        } else
        {
            return;
        }
    }

    void reset()
    {
        INSTANCE.errorHandler.set(null);
        INSTANCE.observableExecutionHook.set(null);
        INSTANCE.schedulersHook.set(null);
    }

}
