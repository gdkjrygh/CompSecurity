// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;

final class cms extends cmu
{

    public cms()
    {
        super(0.0F);
    }

    protected final Float a(cmi cmi1, long l)
    {
        cmi1 = (cdx[])cmi1.a(cos.g, l);
        if (cmi1 == null)
        {
            return null;
        }
        float f = 0.0F;
        for (int i = 0; i < cmi1.length; i++)
        {
            Rect rect = ((cdx) (cmi1[i])).b.rect;
            int j = rect.width();
            f += rect.height() * j;
        }

        return Float.valueOf(f);
    }

    public final Object a(cvs cvs1)
    {
        return cmm.a(cvs1.i);
    }

    public final void a(Object obj, cvs cvs1)
    {
        cvs1.i = ((Float)obj).floatValue();
    }
}
