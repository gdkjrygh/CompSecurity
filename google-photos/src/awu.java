// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.util.List;

public final class awu extends awk
{

    public awu(awr awr1)
    {
        super(awr1);
    }

    public final Class a()
    {
        return awr;
    }

    public final int c()
    {
        aww aww1 = ((awr)a).a.a;
        amu amu1 = aww1.a;
        int i = amu1.a.limit();
        int j = amu1.d.length;
        int k = amu1.e.length;
        return bag.a(aww1.a().getWidth(), aww1.a().getHeight(), aww1.a().getConfig()) + ((k << 2) + (i + j));
    }

    public final void d()
    {
        ((awr)a).stop();
        Object obj = (awr)a;
        obj.b = true;
        obj = ((awr) (obj)).a.a;
        ((aww) (obj)).c.clear();
        ((aww) (obj)).c();
        obj.e = false;
        if (((aww) (obj)).g != null)
        {
            ((aww) (obj)).d.a(((aww) (obj)).g);
            obj.g = null;
        }
        if (((aww) (obj)).i != null)
        {
            ((aww) (obj)).d.a(((aww) (obj)).i);
            obj.i = null;
        }
        amu amu1 = ((aww) (obj)).a;
        amu1.g = null;
        if (amu1.d != null)
        {
            amu1.h.a(amu1.d);
        }
        if (amu1.e != null)
        {
            amu1.h.a(amu1.e);
        }
        if (amu1.i != null)
        {
            amu1.h.a(amu1.i);
        }
        amu1.i = null;
        amu1.a = null;
        amu1.j = false;
        if (amu1.b != null)
        {
            amu1.h.a(amu1.b);
        }
        if (amu1.c != null)
        {
            amu1.h.a(amu1.c);
        }
        obj.h = true;
    }
}
