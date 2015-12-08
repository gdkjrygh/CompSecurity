// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

static final class a
    implements bi
{

    private bf a;

    public final void a(View view)
    {
        if (bf.b(a) >= 0)
        {
            aY.a(view, 2, null);
        }
        bf.c();
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof bi)
        {
            obj = (bi)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((bi) (obj)).a(view);
        }
    }

    public final void b(View view)
    {
        if (bf.b(a) >= 0)
        {
            aY.a(view, bf.b(a), null);
            bf.a(a);
        }
        bf.d();
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof bi)
        {
            obj = (bi)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((bi) (obj)).b(view);
        }
    }

    public final void c(View view)
    {
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof bi)
        {
            obj = (bi)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((bi) (obj)).c(view);
        }
    }

    iew(bf bf1)
    {
        a = bf1;
    }
}
