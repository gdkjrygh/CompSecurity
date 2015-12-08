// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;
import com.kik.g.k;

// Referenced classes of package kik.android.widget:
//            KikContactImageThumbNailList

final class cb
    implements android.view.View.OnClickListener
{

    final String a;
    final KikContactImageThumbNailList b;

    cb(KikContactImageThumbNailList kikcontactimagethumbnaillist, String s)
    {
        b = kikcontactimagethumbnaillist;
        a = s;
        super();
    }

    public final void onClick(View view)
    {
        KikContactImageThumbNailList.b(b).a(a);
    }
}
