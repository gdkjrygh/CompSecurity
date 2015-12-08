// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gr, hl, gl, pe, 
//            ow

public final class ht extends gr
{

    public static final gr b = new ht();

    private ht()
    {
    }

    public final int a()
    {
        return 2;
    }

    public final String a(gl gl1)
    {
        return d(gl1);
    }

    public final void a(ow ow, gl gl1)
    {
        int i = ((hl)gl1).b();
        a(ow, a(gl1, 0), (short)i);
    }

    public final boolean a(hl hl1)
    {
        int i = hl1.b();
        return i != 0 && d(i);
    }

    public final String b(gl gl1, boolean flag)
    {
        return e(gl1);
    }

    public final boolean b(gl gl1)
    {
        if (!(gl1 instanceof hl) || ((pe) (gl1.f)).K.length != 0)
        {
            return false;
        }
        gl1 = (hl)gl1;
        if (gl1.g())
        {
            return a(gl1);
        } else
        {
            return true;
        }
    }

}
