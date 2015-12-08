// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gp, ge, ha, gn

public final class gf
    implements gp
{

    protected boolean a;
    protected boolean b;
    protected int c;

    public gf()
    {
        this((byte)0);
    }

    private gf(byte byte0)
    {
        this('\0');
    }

    private gf(char c1)
    {
        a = false;
        b = true;
        a = false;
        b = true;
        c = 0;
    }

    public final gn a(ha ha)
    {
        ha = new ge(ha, a, b);
        if (c != 0)
        {
            ha.b(c);
        }
        return ha;
    }
}
