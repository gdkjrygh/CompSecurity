// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.util.Log;
import com.leanplum.callbacks.VariableCallback;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.leanplum:
//            Leanplum, aU, aT, aR, 
//            N, aQ, g, aS, 
//            FileManager

public class Var
{

    private static boolean t;
    String a;
    boolean b;
    int c;
    String d;
    private String e;
    private String f[];
    private Double g;
    private Object h;
    private Object i;
    private String j;
    private List k;
    private List l;
    private boolean m;
    private boolean n;
    private boolean o;
    private byte p[];
    private boolean q;
    private boolean r;
    private int s;

    protected Var()
    {
        k = new ArrayList();
        l = new ArrayList();
        q = false;
    }

    private static Var a(String s1, Object obj, String s2, aT at)
    {
        if (Leanplum.a && !s1.startsWith("__Android Resources"))
        {
            Log.w("Leanplum", (new StringBuilder("You should not create new variables after calling start (name=")).append(s1).append(")").toString());
        }
        Var var = aU.b(s1);
        if (var != null)
        {
            return var;
        }
        var = new Var();
        var.e = s1;
        var.f = aU.a(s1);
        var.h = obj;
        var.i = obj;
        var.j = s2;
        if (s1.startsWith("__Android Resources"))
        {
            var.r = true;
        }
        if (at != null)
        {
            at.a(var);
        }
        var.c();
        aU.a(var);
        if (var.j.equals("file"))
        {
            aU.a(var.a, var.defaultValue().toString(), var.defaultStream(), var.b, var.d, var.c);
        }
        var.a();
        return var;
    }

    static Var a(String s1, String s2, int i1, String s3, byte abyte0[])
    {
        return a(s1, s2, "file", ((aT) (new aR(i1, s3, abyte0))));
    }

    static void a(Var var)
    {
        var.e();
    }

    static void a(Var var, boolean flag)
    {
        var.o = true;
    }

    static void a(Var var, byte abyte0[])
    {
        var.p = abyte0;
    }

    private void b()
    {
        if (!r && !Leanplum.hasStarted() && !t)
        {
            Log.w("Leanplum", (new StringBuilder("Leanplum hasn't finished retrieving values from the server. You should use a callback to make sure the value for '")).append(e).append("' is ready. Otherwise, your app may not use the most up-to-date value.").toString());
            t = true;
        }
    }

    private void c()
    {
        if (!(i instanceof String))
        {
            break MISSING_BLOCK_LABEL_40;
        }
        a = (String)i;
        g = Double.valueOf(a);
_L1:
        return;
        NumberFormatException numberformatexception;
        numberformatexception;
        g = null;
        return;
        if (i instanceof Number)
        {
            a = (new StringBuilder()).append(i).toString();
            g = Double.valueOf(((Number)i).doubleValue());
            if (h instanceof Byte)
            {
                i = Byte.valueOf(((Number)i).byteValue());
                return;
            }
            if (h instanceof Short)
            {
                i = Short.valueOf(((Number)i).shortValue());
                return;
            }
            if (h instanceof Integer)
            {
                i = Integer.valueOf(((Number)i).intValue());
                return;
            }
            if (h instanceof Long)
            {
                i = Long.valueOf(((Number)i).longValue());
                return;
            }
            if (h instanceof Float)
            {
                i = Float.valueOf(((Number)i).floatValue());
                return;
            }
            if (h instanceof Double)
            {
                i = Double.valueOf(((Number)i).doubleValue());
                return;
            }
            if (h instanceof Character)
            {
                i = Character.valueOf((char)((Number)i).intValue());
                return;
            }
        } else
        if (i != null && !(i instanceof Iterable) && !(i instanceof Map))
        {
            a = i.toString();
            g = null;
            return;
        } else
        {
            a = null;
            g = null;
            return;
        }
          goto _L1
    }

    private void d()
    {
        Iterator iterator = l.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            VariableCallback variablecallback = (VariableCallback)iterator.next();
            variablecallback.setVariable(this);
            N.a().a(variablecallback);
        } while (true);
    }

    public static Var define(String s1, Object obj)
    {
        return a(s1, obj, aU.a(obj), null);
    }

    public static Var define(String s1, Object obj, String s2)
    {
        return a(s1, obj, s2, null);
    }

    public static Var defineAsset(String s1, String s2)
    {
        return a(s1, s2, "file", new aQ());
    }

    public static Var defineColor(String s1, int i1)
    {
        return a(s1, Integer.valueOf(i1), "color", null);
    }

    public static Var defineFile(String s1, String s2)
    {
        return a(s1, s2, "file", null);
    }

    private void e()
    {
        m = false;
        Iterator iterator = k.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            VariableCallback variablecallback = (VariableCallback)iterator.next();
            variablecallback.setVariable(this);
            N.a().a(variablecallback);
        } while (true);
    }

    final void a()
    {
        Object obj;
        obj = i;
        i = aU.a(f);
        break MISSING_BLOCK_LABEL_16;
        while (!Leanplum.hasStarted()) 
        {
            do
            {
                do
                {
                    return;
                } while (i == null && obj == null || i != null && obj != null && i.equals(obj) && n);
                c();
                if (aU.i() && e.startsWith("__Android Resources") && j.equals("file") && !m)
                {
                    e();
                }
            } while (aU.i());
            if (Leanplum.hasStarted())
            {
                d();
            }
            if (!j.equals("file"))
            {
                continue;
            }
            if (!com.leanplum.g.a())
            {
                FileManager.DownloadFileResult downloadfileresult = FileManager.a(b, a, (String)h, new aS(this));
                q = false;
                if (downloadfileresult == FileManager.DownloadFileResult.DOWNLOADING)
                {
                    m = true;
                } else
                if (downloadfileresult == FileManager.DownloadFileResult.EXISTS_IN_ASSETS)
                {
                    q = true;
                }
            }
            if (Leanplum.hasStarted() && !m)
            {
                e();
            }
        }
        n = true;
        return;
    }

    public void addFileReadyHandler(VariableCallback variablecallback)
    {
        k.add(variablecallback);
        if (Leanplum.hasStarted() && !m)
        {
            e();
        }
    }

    public void addValueChangedHandler(VariableCallback variablecallback)
    {
        l.add(variablecallback);
        if (Leanplum.hasStarted())
        {
            d();
        }
    }

    public int count()
    {
        b();
        Object obj = aU.a(f);
        if (obj instanceof List)
        {
            return ((List)obj).size();
        } else
        {
            Leanplum.a(new UnsupportedOperationException("This variable is not a list."));
            return 0;
        }
    }

    public InputStream defaultStream()
    {
        if (!j.equals("file"))
        {
            return null;
        } else
        {
            return FileManager.a(b, Boolean.valueOf(o), Boolean.valueOf(q), (String)h, (String)h, p);
        }
    }

    public Object defaultValue()
    {
        return h;
    }

    public String fileValue()
    {
        b();
        if (j.equals("file"))
        {
            return FileManager.a(a, (String)h, Boolean.valueOf(q));
        } else
        {
            return null;
        }
    }

    public String kind()
    {
        return j;
    }

    public String name()
    {
        return e;
    }

    public String[] nameComponents()
    {
        return f;
    }

    public Number numberValue()
    {
        b();
        return g;
    }

    public transient Object objectForKeyPath(Object aobj[])
    {
        ArrayList arraylist;
        String as[];
        int i1;
        int j1;
        b();
        arraylist = new ArrayList();
        as = f;
        j1 = as.length;
        i1 = 0;
_L3:
        if (i1 < j1) goto _L2; else goto _L1
_L1:
        j1 = aobj.length;
        i1 = 0;
_L4:
        if (i1 >= j1)
        {
            return aU.a(arraylist.toArray(new Object[0]));
        }
        break MISSING_BLOCK_LABEL_79;
_L2:
        arraylist.add(as[i1]);
        i1++;
          goto _L3
        arraylist.add(aobj[i1]);
        i1++;
          goto _L4
    }

    public int overrideResId()
    {
        return s;
    }

    public void removeFileReadyHandler(VariableCallback variablecallback)
    {
        k.remove(variablecallback);
    }

    public void removeValueChangedHandler(VariableCallback variablecallback)
    {
        l.remove(variablecallback);
    }

    public void setOverrideResId(int i1)
    {
        s = i1;
    }

    public InputStream stream()
    {
        InputStream inputstream;
        if (!j.equals("file"))
        {
            inputstream = null;
        } else
        {
            b();
            InputStream inputstream1 = FileManager.a(b, Boolean.valueOf(o), Boolean.valueOf(q), fileValue(), (String)h, p);
            inputstream = inputstream1;
            if (inputstream1 == null)
            {
                return defaultStream();
            }
        }
        return inputstream;
    }

    public String stringValue()
    {
        b();
        return a;
    }

    public final String toString()
    {
        return (new StringBuilder("Var(")).append(e).append(")=").append(i).toString();
    }

    public Object value()
    {
        b();
        return i;
    }
}
