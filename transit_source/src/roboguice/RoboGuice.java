// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Stage;
import com.google.inject.spi.DefaultElementVisitor;
import com.google.inject.spi.Element;
import com.google.inject.spi.Elements;
import com.google.inject.spi.StaticInjectionRequest;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import roboguice.config.DefaultRoboModule;
import roboguice.event.EventManager;
import roboguice.inject.ContextScope;
import roboguice.inject.ContextScopedRoboInjector;
import roboguice.inject.ResourceListener;
import roboguice.inject.RoboInjector;
import roboguice.inject.ViewListener;

public class RoboGuice
{
    public static class util
    {

        public static void reset()
        {
            RoboGuice.injectors.clear();
            RoboGuice.resourceListeners.clear();
            RoboGuice.viewListeners.clear();
        }

        private util()
        {
        }
    }


    public static Stage DEFAULT_STAGE;
    protected static WeakHashMap injectors = new WeakHashMap();
    protected static int modulesResourceId = 0;
    protected static WeakHashMap resourceListeners = new WeakHashMap();
    protected static WeakHashMap viewListeners = new WeakHashMap();

    private RoboGuice()
    {
    }

    public static void destroyInjector(Context context)
    {
        ((EventManager)getInjector(context).getInstance(roboguice/event/EventManager)).destroy();
        injectors.remove(context);
    }

    public static Injector getBaseApplicationInjector(Application application)
    {
        Injector injector = (Injector)injectors.get(application);
        if (injector != null)
        {
            return injector;
        }
        roboguice/RoboGuice;
        JVM INSTR monitorenter ;
        Injector injector1 = (Injector)injectors.get(application);
        if (injector1 == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        roboguice/RoboGuice;
        JVM INSTR monitorexit ;
        return injector1;
        application = setBaseApplicationInjector(application, DEFAULT_STAGE);
        roboguice/RoboGuice;
        JVM INSTR monitorexit ;
        return application;
        application;
        roboguice/RoboGuice;
        JVM INSTR monitorexit ;
        throw application;
    }

    public static RoboInjector getInjector(Context context)
    {
        Application application = (Application)context.getApplicationContext();
        return new ContextScopedRoboInjector(context, getBaseApplicationInjector(application), getViewListener(application));
    }

    protected static ResourceListener getResourceListener(Application application)
    {
        ResourceListener resourcelistener1 = (ResourceListener)resourceListeners.get(application);
        if (resourcelistener1 != null) goto _L2; else goto _L1
_L1:
        roboguice/RoboGuice;
        JVM INSTR monitorenter ;
        ResourceListener resourcelistener;
        resourcelistener = resourcelistener1;
        if (resourcelistener1 != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        resourcelistener = new ResourceListener(application);
        resourceListeners.put(application, resourcelistener);
        roboguice/RoboGuice;
        JVM INSTR monitorexit ;
        return resourcelistener;
_L4:
        roboguice/RoboGuice;
        JVM INSTR monitorexit ;
        throw application;
        application;
        continue; /* Loop/switch isn't completed */
_L2:
        return resourcelistener1;
        application;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected static ViewListener getViewListener(Application application)
    {
        ViewListener viewlistener1 = (ViewListener)viewListeners.get(application);
        if (viewlistener1 != null) goto _L2; else goto _L1
_L1:
        roboguice/RoboGuice;
        JVM INSTR monitorenter ;
        ViewListener viewlistener;
        viewlistener = viewlistener1;
        if (viewlistener1 != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        viewlistener = new ViewListener();
        viewListeners.put(application, viewlistener);
        roboguice/RoboGuice;
        JVM INSTR monitorexit ;
        return viewlistener;
_L4:
        roboguice/RoboGuice;
        JVM INSTR monitorexit ;
        throw application;
        application;
        continue; /* Loop/switch isn't completed */
_L2:
        return viewlistener1;
        application;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Object injectMembers(Context context, Object obj)
    {
        getInjector(context).injectMembers(obj);
        return obj;
    }

    public static DefaultRoboModule newDefaultRoboModule(Application application)
    {
        return new DefaultRoboModule(application, new ContextScope(application), getViewListener(application), getResourceListener(application));
    }

    public static Injector setBaseApplicationInjector(Application application, Stage stage)
    {
        roboguice/RoboGuice;
        JVM INSTR monitorenter ;
        int j = modulesResourceId;
        int i;
        i = j;
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        i = application.getResources().getIdentifier("roboguice_modules", "array", application.getPackageName());
        if (i <= 0) goto _L2; else goto _L1
_L1:
        String as[] = application.getResources().getStringArray(i);
_L7:
        ArrayList arraylist;
        arraylist = new ArrayList();
        arraylist.add(newDefaultRoboModule(application));
        j = as.length;
        i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        Class class1 = Class.forName(as[i]).asSubclass(com/google/inject/Module);
        arraylist.add(class1.getDeclaredConstructor(new Class[] {
            android/content/Context
        }).newInstance(new Object[] {
            application
        }));
_L5:
        i++;
        if (true) goto _L4; else goto _L3
_L2:
        as = new String[0];
        continue; /* Loop/switch isn't completed */
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
        arraylist.add(class1.newInstance());
          goto _L5
        application;
        throw new RuntimeException(application);
        application;
        roboguice/RoboGuice;
        JVM INSTR monitorexit ;
        throw application;
_L3:
        stage = setBaseApplicationInjector(application, stage, (Module[])arraylist.toArray(new Module[arraylist.size()]));
        injectors.put(application, stage);
        roboguice/RoboGuice;
        JVM INSTR monitorexit ;
        return stage;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static transient Injector setBaseApplicationInjector(Application application, Stage stage, Module amodule[])
    {
        for (Iterator iterator = Elements.getElements(amodule).iterator(); iterator.hasNext(); ((Element)iterator.next()).acceptVisitor(new DefaultElementVisitor(application) {

        final Application val$application;

        public volatile Object visit(StaticInjectionRequest staticinjectionrequest)
        {
            return visit(staticinjectionrequest);
        }

        public Void visit(StaticInjectionRequest staticinjectionrequest)
        {
            RoboGuice.getResourceListener(application).requestStaticInjection(new Class[] {
                staticinjectionrequest.getType()
            });
            return null;
        }

            
            {
                application = application1;
                super();
            }
    })) { }
        roboguice/RoboGuice;
        JVM INSTR monitorenter ;
        stage = Guice.createInjector(stage, amodule);
        injectors.put(application, stage);
        roboguice/RoboGuice;
        JVM INSTR monitorexit ;
        return stage;
        application;
        roboguice/RoboGuice;
        JVM INSTR monitorexit ;
        throw application;
    }

    public static void setModulesResourceId(int i)
    {
        modulesResourceId = i;
    }

    static 
    {
        DEFAULT_STAGE = Stage.PRODUCTION;
    }
}
