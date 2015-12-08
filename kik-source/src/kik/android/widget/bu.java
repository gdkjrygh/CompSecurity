// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import com.kik.g.i;

// Referenced classes of package kik.android.widget:
//            bv, GifWidgetFragment

final class bu extends i
{

    final GifWidgetFragment a;

    bu(GifWidgetFragment gifwidgetfragment)
    {
        a = gifwidgetfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        if (((Boolean)obj1).booleanValue())
        {
            a.b(new bv(this));
        }
    }
}
