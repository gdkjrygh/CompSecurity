// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;


// Referenced classes of package android.support.v4.view.a:
//            ag, ae, ad, ah, 
//            af

public class ac
{

    private static final af a;
    private final Object b;

    public ac(Object obj)
    {
        b = obj;
    }

    public static ac a()
    {
        return new ac(a.a());
    }

    public void a(int i)
    {
        a.b(b, i);
    }

    public void a(boolean flag)
    {
        a.a(b, flag);
    }

    public void b(int i)
    {
        a.a(b, i);
    }

    public void c(int i)
    {
        a.c(b, i);
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (ac)obj;
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((ac) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((ac) (obj)).b)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.hashCode();
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new ag();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            a = new ae();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new ad();
        } else
        {
            a = new ah();
        }
    }
}
