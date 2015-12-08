// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            s

public class t
{
    public static interface a
    {

        public abstract void a();
    }

    public static class b
    {

        public final int a;
        private final Object b;
        private final Object c;
        private final Number d;
        private final Number e;

        public b a(Object obj)
        {
            return new b(a, c, d, e, obj);
        }

        public String a()
        {
            String s = null;
            String s1 = (String)c;
            s = s1;
_L2:
            String s2;
            try
            {
                s2 = (String)b;
            }
            catch (ClassCastException classcastexception)
            {
                return s;
            }
            return s2;
            ClassCastException classcastexception1;
            classcastexception1;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public Number b()
        {
            Object obj1 = Integer.valueOf(0);
            Object obj = obj1;
            if (c != null)
            {
                try
                {
                    obj = (Number)c;
                }
                catch (ClassCastException classcastexception)
                {
                    classcastexception = ((ClassCastException) (obj1));
                }
            }
            obj1 = obj;
            if (b != null)
            {
                try
                {
                    obj1 = (Number)b;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    return ((Number) (obj));
                }
            }
            return ((Number) (obj1));
        }

        public Boolean c()
        {
            Object obj1 = Boolean.valueOf(false);
            Object obj = obj1;
            if (c != null)
            {
                try
                {
                    obj = (Boolean)c;
                }
                catch (ClassCastException classcastexception)
                {
                    classcastexception = ((ClassCastException) (obj1));
                }
            }
            obj1 = obj;
            if (b != null)
            {
                try
                {
                    obj1 = (Boolean)b;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    return ((Boolean) (obj));
                }
            }
            return ((Boolean) (obj1));
        }

        private b(int i, Object obj, Number number, Number number1, Object obj1)
        {
            a = i;
            c = obj;
            d = number;
            e = number1;
            b = obj1;
        }

    }


    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    private static final String g = "MixpanelAPI.Tweaks";
    private final Map e = new HashMap();
    private final List f = new ArrayList();

    t()
    {
    }

    static b a(t t1, String s)
    {
        return t1.a(s);
    }

    private b a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = (b)e.get(s);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    private void a(String s, Object obj, int i)
    {
        if (e.containsKey(s))
        {
            Log.w("MixpanelAPI.Tweaks", (new StringBuilder()).append("Attempt to define a tweak \"").append(s).append("\" twice with the same name").toString());
        } else
        {
            obj = new b(i, obj, null, null, obj);
            e.put(s, obj);
            int j = f.size();
            i = 0;
            while (i < j) 
            {
                ((a)f.get(i)).a();
                i++;
            }
        }
    }

    s a(String s, byte byte0)
    {
        a(s, Byte.valueOf(byte0), 3);
        return new s(s) {

            final String a;
            final t b;

            public Object a()
            {
                return b();
            }

            public Byte b()
            {
                return Byte.valueOf(t.a(b, a).b().byteValue());
            }

            
            {
                b = t.this;
                a = s1;
                super();
            }
        };
    }

    s a(String s, double d1)
    {
        a(s, Double.valueOf(d1), 2);
        return new s(s) {

            final String a;
            final t b;

            public Object a()
            {
                return b();
            }

            public Double b()
            {
                return Double.valueOf(t.a(b, a).b().doubleValue());
            }

            
            {
                b = t.this;
                a = s1;
                super();
            }
        };
    }

    s a(String s, float f1)
    {
        a(s, Float.valueOf(f1), 2);
        return new s(s) {

            final String a;
            final t b;

            public Object a()
            {
                return b();
            }

            public Float b()
            {
                return Float.valueOf(t.a(b, a).b().floatValue());
            }

            
            {
                b = t.this;
                a = s1;
                super();
            }
        };
    }

    s a(String s, int i)
    {
        a(s, Integer.valueOf(i), 3);
        return new s(s) {

            final String a;
            final t b;

            public Object a()
            {
                return b();
            }

            public Integer b()
            {
                return Integer.valueOf(t.a(b, a).b().intValue());
            }

            
            {
                b = t.this;
                a = s1;
                super();
            }
        };
    }

    s a(String s, long l)
    {
        a(s, Long.valueOf(l), 3);
        return new s(s) {

            final String a;
            final t b;

            public Object a()
            {
                return b();
            }

            public Long b()
            {
                return Long.valueOf(t.a(b, a).b().longValue());
            }

            
            {
                b = t.this;
                a = s1;
                super();
            }
        };
    }

    s a(String s, String s1)
    {
        a(s, s1, 4);
        return new s(s) {

            final String a;
            final t b;

            public Object a()
            {
                return b();
            }

            public String b()
            {
                return t.a(b, a).a();
            }

            
            {
                b = t.this;
                a = s1;
                super();
            }
        };
    }

    s a(String s, short word0)
    {
        a(s, Short.valueOf(word0), 3);
        return new s(s) {

            final String a;
            final t b;

            public Object a()
            {
                return b();
            }

            public Short b()
            {
                return Short.valueOf(t.a(b, a).b().shortValue());
            }

            
            {
                b = t.this;
                a = s1;
                super();
            }
        };
    }

    s a(String s, boolean flag)
    {
        a(s, Boolean.valueOf(flag), 1);
        return new s(s) {

            final String a;
            final t b;

            public Object a()
            {
                return b();
            }

            public Boolean b()
            {
                return t.a(b, a).c();
            }

            
            {
                b = t.this;
                a = s1;
                super();
            }
        };
    }

    public Map a()
    {
        this;
        JVM INSTR monitorenter ;
        HashMap hashmap = new HashMap(e);
        this;
        JVM INSTR monitorexit ;
        return hashmap;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new NullPointerException("listener cannot be null");
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
        f.add(a1);
        this;
        JVM INSTR monitorexit ;
    }

    public void a(String s, Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (e.containsKey(s)) goto _L2; else goto _L1
_L1:
        Log.w("MixpanelAPI.Tweaks", (new StringBuilder()).append("Attempt to set a tweak \"").append(s).append("\" which has never been defined.").toString());
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        obj = ((b)e.get(s)).a(obj);
        e.put(s, obj);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    // Unreferenced inner class com/mixpanel/android/mpmetrics/Tweaks$TweakType
    /* block-local class not found */
    class Tweaks.TweakType {}

}
