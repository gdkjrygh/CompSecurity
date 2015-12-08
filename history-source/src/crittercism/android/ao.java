// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


// Referenced classes of package crittercism.android:
//            ak, af, al, ai, 
//            ag, aj

public final class ao extends ak
{

    private int g;

    public ao(af af1, int i)
    {
        super(af1);
        g = i;
    }

    protected final af g()
    {
        boolean flag;
        if (super.a.c().equals("HEAD") || g >= 100 && g <= 199 || g == 204 || g == 304)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            super.a.b(a());
            return super.a.b();
        }
        if (super.f)
        {
            return new ai(this);
        }
        if (super.d)
        {
            if (super.e > 0)
            {
                return new ag(this, super.e);
            } else
            {
                super.a.b(a());
                return super.a.b();
            }
        }
        if (super.a.c().equals("CONNECT"))
        {
            super.a.b(a());
            return super.a.b();
        } else
        {
            return new aj(this);
        }
    }
}
