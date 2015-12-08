// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gr, hl, ow, gl, 
//            pe

public final class ho extends gr
{

    public static final gr b = new ho();

    private ho()
    {
    }

    public final int a()
    {
        return 1;
    }

    public final String a(gl gl1)
    {
        return d(gl1);
    }

    public final void a(ow ow1, gl gl1)
    {
        ow1.c(a(gl1, ((hl)gl1).b() & 0xff));
    }

    public final boolean a(hl hl1)
    {
        int i = hl1.b();
        return i != 0 && b(i);
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
