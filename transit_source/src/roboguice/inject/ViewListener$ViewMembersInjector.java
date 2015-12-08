// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import com.google.inject.MembersInjector;
import com.google.inject.Provider;
import com.google.inject.spi.TypeEncounter;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

// Referenced classes of package roboguice.inject:
//            ViewListener, InjectFragment, Nullable, InjectView

public static class 
    implements MembersInjector
{

    protected static WeakHashMap viewMembersInjectors = new WeakHashMap();
    protected Provider activityProvider;
    protected Annotation annotation;
    protected Field field;
    protected Provider fragmentManagerProvider;
    protected WeakReference instanceRef;

    protected static void injectViews(Object obj)
    {
        roboguice/inject/ViewListener$ViewMembersInjector;
        JVM INSTR monitorenter ;
        Object obj1 = (ArrayList)viewMembersInjectors.get(obj);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        for (obj1 = ((ArrayList) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((viewMembersInjectors)((Iterator) (obj1)).next()).reallyInjectMembers(obj)) { }
        break MISSING_BLOCK_LABEL_54;
        obj;
        roboguice/inject/ViewListener$ViewMembersInjector;
        JVM INSTR monitorexit ;
        throw obj;
        roboguice/inject/ViewListener$ViewMembersInjector;
        JVM INSTR monitorexit ;
    }

    public void injectMembers(Object obj)
    {
        roboguice/inject/ViewListener$ViewMembersInjector;
        JVM INSTR monitorenter ;
        Object obj1 = (Activity)activityProvider.get();
        if (ViewListener.fragmentClass != null && ViewListener.fragmentClass.isInstance(obj))
        {
            obj1 = obj;
        }
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        roboguice/inject/ViewListener$ViewMembersInjector;
        JVM INSTR monitorexit ;
        return;
        ArrayList arraylist1 = (ArrayList)viewMembersInjectors.get(obj1);
        ArrayList arraylist;
        arraylist = arraylist1;
        if (arraylist1 != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        arraylist = new ArrayList();
        viewMembersInjectors.put(obj1, arraylist);
        arraylist.add(this);
        instanceRef = new WeakReference(obj);
        roboguice/inject/ViewListener$ViewMembersInjector;
        JVM INSTR monitorexit ;
        return;
        obj;
        roboguice/inject/ViewListener$ViewMembersInjector;
        JVM INSTR monitorexit ;
        throw obj;
    }

    protected void reallyInjectMemberFragments(Object obj)
    {
        Object obj1;
        Object obj2;
        obj2 = instanceRef.get();
        if (obj2 == null)
        {
            return;
        }
        if ((obj instanceof Context) && !(obj instanceof Activity))
        {
            throw new UnsupportedOperationException("Can't inject fragment into a non-Activity context");
        }
        obj = null;
        obj1 = obj;
        InjectFragment injectfragment = (InjectFragment)annotation;
        obj1 = obj;
        int i = injectfragment.value();
        if (i < 0) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        obj = ViewListener.fragmentFindFragmentByIdMethod.invoke(fragmentManagerProvider.get(), new Object[] {
            Integer.valueOf(i)
        });
_L4:
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        if (!Nullable.notNullable(field))
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        try
        {
            throw new NullPointerException(String.format("Can't inject null value into %s.%s when field is not @Nullable", new Object[] {
                field.getDeclaringClass(), field.getName()
            }));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            if (obj1 != null)
            {
                obj = obj1.getClass();
            } else
            {
                obj = "(null)";
            }
        }
        break MISSING_BLOCK_LABEL_238;
_L2:
        obj1 = obj;
        obj = ViewListener.fragmentFindFragmentByTagMethod.invoke(fragmentManagerProvider.get(), new Object[] {
            injectfragment.tag()
        });
        if (true) goto _L4; else goto _L3
_L3:
        obj1 = obj;
        field.setAccessible(true);
        obj1 = obj;
        field.set(obj2, obj);
        return;
        throw new IllegalArgumentException(String.format("Can't assign %s value %s to %s field %s", new Object[] {
            obj, obj1, field.getType(), field.getName()
        }), illegalargumentexception);
    }

    protected void reallyInjectMemberViews(Object obj)
    {
        Object obj1;
        Object obj2;
        Object obj3;
        if (ViewListener.fragmentClass != null && ViewListener.fragmentClass.isInstance(obj))
        {
            obj2 = obj;
        } else
        {
            obj2 = instanceRef.get();
        }
        if (obj2 == null)
        {
            return;
        }
        if ((obj instanceof Context) && !(obj instanceof Activity))
        {
            throw new UnsupportedOperationException("Can't inject view into a non-Activity context");
        }
        obj3 = null;
        obj1 = obj3;
        InjectView injectview = (InjectView)annotation;
        obj1 = obj3;
        int i = injectview.value();
        if (i < 0) goto _L2; else goto _L1
_L1:
        obj1 = obj3;
        if (ViewListener.fragmentClass == null) goto _L4; else goto _L3
_L3:
        obj1 = obj3;
        if (!ViewListener.fragmentClass.isInstance(obj)) goto _L4; else goto _L5
_L5:
        obj1 = obj3;
        obj = ((View)ViewListener.fragmentGetViewMethod.invoke(obj, new Object[0])).findViewById(i);
_L7:
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        if (!Nullable.notNullable(field))
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        try
        {
            throw new NullPointerException(String.format("Can't inject null value into %s.%s when field is not @Nullable", new Object[] {
                field.getDeclaringClass(), field.getName()
            }));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            if (obj1 != null)
            {
                obj = obj1.getClass();
            } else
            {
                obj = "(null)";
            }
        }
        break MISSING_BLOCK_LABEL_338;
_L4:
        obj1 = obj3;
        obj = ((Activity)obj).findViewById(i);
        continue; /* Loop/switch isn't completed */
_L2:
        obj1 = obj3;
        if (ViewListener.fragmentClass == null)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        obj1 = obj3;
        if (!ViewListener.fragmentClass.isInstance(obj))
        {
            break MISSING_BLOCK_LABEL_269;
        }
        obj1 = obj3;
        obj = ((View)ViewListener.fragmentGetViewMethod.invoke(obj, new Object[0])).findViewWithTag(injectview.tag());
        continue; /* Loop/switch isn't completed */
        obj1 = obj3;
        obj = ((Activity)obj).getWindow().getDecorView().findViewWithTag(injectview.tag());
        if (true) goto _L7; else goto _L6
_L6:
        obj1 = obj;
        field.setAccessible(true);
        obj1 = obj;
        field.set(obj2, obj);
        return;
        throw new IllegalArgumentException(String.format("Can't assign %s value %s to %s field %s", new Object[] {
            obj, obj1, field.getType(), field.getName()
        }), illegalargumentexception);
    }

    public void reallyInjectMembers(Object obj)
    {
        if (annotation instanceof InjectView)
        {
            reallyInjectMemberViews(obj);
            return;
        } else
        {
            reallyInjectMemberFragments(obj);
            return;
        }
    }


    public (Field field1, Annotation annotation1, TypeEncounter typeencounter)
    {
        field = field1;
        annotation = annotation1;
        activityProvider = typeencounter.getProvider(android/app/Activity);
        if (ViewListener.fragmentManagerClass != null)
        {
            fragmentManagerProvider = typeencounter.getProvider(ViewListener.fragmentManagerClass);
        }
    }
}
