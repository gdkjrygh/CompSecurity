// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class olm
{

    private static onh c = new onh("debug.binder.verification");
    private static final Object d = new Object();
    private static final olr e = new olr(false, new olx());
    public olm a;
    public String b;
    private Context f;
    private final Map g;
    private final Map h;
    private final HashSet i;
    private final ArrayList j;
    private boolean k;

    public olm()
    {
        g = new HashMap();
        h = new HashMap();
        i = new HashSet();
        j = new ArrayList();
    }

    public olm(Context context)
    {
        this(context, null);
    }

    public olm(Context context, olm olm1)
    {
        g = new HashMap();
        h = new HashMap();
        i = new HashSet();
        j = new ArrayList();
        f = context;
        a = olm1;
        b = context.getClass().getName();
    }

    public static int a(Context context, String s, int l)
    {
        return ((Integer)b(context).a(s, Integer.valueOf(300))).intValue();
    }

    public static Object a(Context context, Class class1)
    {
        return b(context).a(class1);
    }

    public static String a(Context context, String s, String s1)
    {
        return (String)b(context).a(s, null);
    }

    public static olm a(Context context, am am1)
    {
        for (; am1 != null; am1 = am1.E)
        {
            olm olm1 = a(am1);
            if (olm1 != null)
            {
                return olm1;
            }
        }

        return b(context);
    }

    private static olm a(Object obj)
    {
        olm olm1;
        if (obj instanceof olp)
        {
            olm olm2 = ((olp)obj).ai_();
            olm1 = olm2;
            if (olm2 == null)
            {
                obj = String.valueOf(obj);
                throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 43)).append("BinderContext must not return null Binder: ").append(((String) (obj))).toString());
            }
        } else
        {
            olm1 = null;
        }
        return olm1;
    }

    public static boolean a(Context context, String s, boolean flag)
    {
        return ((Boolean)b(context).a(s, Boolean.valueOf(true))).booleanValue();
    }

    public static Object b(Context context, Class class1)
    {
        return b(context).b(class1);
    }

    public static olm b(Context context)
    {
        Context context2 = context.getApplicationContext();
        boolean flag = false;
        Context context1 = context;
        do
        {
            context = a(context1);
            if (context != null)
            {
                return context;
            }
            boolean flag1;
            if (context1 == context2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag |= flag1;
            if (context1 instanceof ContextWrapper)
            {
                context1 = ((ContextWrapper)context1).getBaseContext();
                context = context1;
                if (context1 == null)
                {
                    throw new IllegalStateException("Invalid ContextWrapper -- If this is a Robolectric test, have you called ActivityController.create()?");
                }
            } else
            if (!flag)
            {
                context = context2;
            } else
            {
                context = null;
            }
            context1 = context;
        } while (context != null);
        return c(context2);
    }

    private void b()
    {
        if (k)
        {
            throw new olo("This binder is sealed for modification");
        } else
        {
            return;
        }
    }

    public static List c(Context context, Class class1)
    {
        return b(context).c(class1);
    }

    public static olm c(Context context)
    {
        return e.a(context.getApplicationContext());
    }

    public static List d(Context context, Class class1)
    {
        return b(context).d(class1);
    }

    private Object e(Class class1)
    {
        int l = 0;
        this;
        JVM INSTR monitorenter ;
        p.a(class1);
        if (f == null)
        {
            throw new IllegalStateException("Binder not initialized yet.");
        }
        break MISSING_BLOCK_LABEL_32;
        class1;
        this;
        JVM INSTR monitorexit ;
        throw class1;
        Object obj = g.get(class1);
        if (obj == null) goto _L2; else goto _L1
_L1:
        class1 = ((Class) (d));
        if (obj == class1)
        {
            obj = null;
        }
_L3:
        this;
        JVM INSTR monitorexit ;
        return obj;
_L2:
        boolean flag;
        flag = k;
        k = false;
        int i1 = j.size();
_L5:
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        ((olv)j.get(l)).a(f, class1, this);
        obj = g.get(class1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        k = flag;
          goto _L3
        Object obj1;
        k = flag;
        obj1 = g.get(class1);
        obj = obj1;
        if (obj1 != null) goto _L3; else goto _L4
_L4:
        g.put(class1, d);
        obj = obj1;
          goto _L3
        class1;
        k = flag;
        throw class1;
        l++;
          goto _L5
    }

    private List f(Class class1)
    {
        int l = 0;
        this;
        JVM INSTR monitorenter ;
        p.a(class1);
        if (f == null)
        {
            throw new IllegalStateException("Binder not initialized yet.");
        }
        break MISSING_BLOCK_LABEL_31;
        class1;
        this;
        JVM INSTR monitorexit ;
        throw class1;
        Object obj = (List)h.get(class1);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        obj = new ArrayList();
        h.put(class1, obj);
        boolean flag;
        if (i.contains(class1))
        {
            break MISSING_BLOCK_LABEL_150;
        }
        i.add(class1);
        flag = k;
        k = false;
        int i1 = j.size();
_L2:
        if (l >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((olv)j.get(l)).a(f, class1, this);
        l++;
        if (true) goto _L2; else goto _L1
_L1:
        k = flag;
        this;
        JVM INSTR monitorexit ;
        return ((List) (obj));
        class1;
        k = flag;
        throw class1;
    }

    public final Object a(Class class1)
    {
        p.a(class1);
        Object obj = b(class1);
        if (obj != null)
        {
            return obj;
        }
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("Unbound type: ").append(class1.getName()).append("\nSearched binders:\n");
        class1 = this;
        do
        {
            ((StringBuilder) (obj)).append(((olm) (class1)).b);
            class1 = ((olm) (class1)).a;
            if (class1 != null)
            {
                ((StringBuilder) (obj)).append(" ->\n");
            } else
            {
                class1 = ((StringBuilder) (obj)).toString();
                obj = new IllegalStateException(class1);
                Log.e("Binder", class1, ((Throwable) (obj)));
                throw obj;
            }
        } while (true);
    }

    public Object a(String s, Object obj)
    {
        olm olm1;
        olm1 = this;
        if (f == null)
        {
            throw new IllegalStateException("Binder not initialized yet.");
        }
_L2:
        olm1;
        JVM INSTR monitorenter ;
        Object obj1 = olm1.g.get(s);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (obj1 == d)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        olm1;
        JVM INSTR monitorexit ;
        return obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        olm1.g.put(s, d);
        olm1;
        JVM INSTR monitorexit ;
        obj1 = olm1.a;
        olm1 = ((olm) (obj1));
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        return obj;
        s;
        olm1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final String a(String s, String s1)
    {
        return (String)a(s, s1);
    }

    public final transient olm a(Class class1, Object aobj[])
    {
        for (int l = 0; l < aobj.length; l++)
        {
            b(class1, aobj[l]);
        }

        return this;
    }

    public final olm a(String s, int l)
    {
        a(s, Integer.valueOf(l));
        return this;
    }

    public final olm a(String s, boolean flag)
    {
        a(s, Boolean.valueOf(true));
        return this;
    }

    public final olm a(olv olv1)
    {
        this;
        JVM INSTR monitorenter ;
        b();
        j.add(olv1);
        this;
        JVM INSTR monitorexit ;
        return this;
        olv1;
        throw olv1;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        k = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(Context context)
    {
        f = context;
        if (b == null)
        {
            b = context.getClass().getName();
        }
    }

    public void a(Object obj, Object obj1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj2;
        b();
        obj2 = g.get(obj);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        if (obj2 == d)
        {
            obj = String.valueOf(obj);
            throw new olo((new StringBuilder(String.valueOf(obj).length() + 51)).append("Bind call too late - someone already tried to get: ").append(((String) (obj))).toString());
        }
        break MISSING_BLOCK_LABEL_76;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj = String.valueOf(obj);
        obj1 = String.valueOf(obj2);
        throw new oln((new StringBuilder(String.valueOf(obj).length() + 21 + String.valueOf(obj1).length())).append("Duplicate binding: ").append(((String) (obj))).append(", ").append(((String) (obj1))).toString());
        g.put(obj, obj1);
        this;
        JVM INSTR monitorexit ;
    }

    public final Object b(Class class1)
    {
        p.a(class1);
        olm olm1 = this;
        Object obj;
        do
        {
            obj = olm1.e(class1);
            if (obj != null)
            {
                return obj;
            }
            obj = olm1.a;
            olm1 = ((olm) (obj));
        } while (obj != null);
        return null;
    }

    public void b(Object obj, Object obj1)
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        b();
        list = (List)h.get(obj);
        Object obj2;
        obj2 = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        obj2 = new ArrayList();
        h.put(obj, obj2);
        ((List) (obj2)).add(obj1);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public final List c(Class class1)
    {
        p.a(class1);
        ArrayList arraylist = new ArrayList();
        olm olm1 = this;
        olm olm2;
        do
        {
            arraylist.addAll(olm1.f(class1));
            olm2 = olm1.a;
            olm1 = olm2;
        } while (olm2 != null);
        return arraylist;
    }

    public final List d(Class class1)
    {
        p.a(class1);
        ArrayList arraylist = new ArrayList();
        olm olm1 = this;
        Object obj;
        do
        {
            obj = olm1.e(class1);
            if (obj != null)
            {
                arraylist.add(obj);
            }
            obj = olm1.a;
            olm1 = ((olm) (obj));
        } while (obj != null);
        return arraylist;
    }

}
