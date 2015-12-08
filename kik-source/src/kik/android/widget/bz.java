// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;
import com.kik.g.k;

// Referenced classes of package kik.android.widget:
//            KikContactImageThumbNailList

final class bz
    implements android.view.View.OnClickListener
{

    final kik.a.d.k a;
    final KikContactImageThumbNailList b;

    bz(KikContactImageThumbNailList kikcontactimagethumbnaillist, kik.a.d.k k1)
    {
        b = kikcontactimagethumbnaillist;
        a = k1;
        super();
    }

    public final void onClick(View view)
    {
        KikContactImageThumbNailList.a(b).a(a);
    }
}
