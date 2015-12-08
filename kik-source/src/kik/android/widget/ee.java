// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;
import com.kik.g.k;

// Referenced classes of package kik.android.widget:
//            ThumbNailListView

final class ee
    implements android.view.View.OnClickListener
{

    final Object a;
    final ThumbNailListView b;

    ee(ThumbNailListView thumbnaillistview, Object obj)
    {
        b = thumbnaillistview;
        a = obj;
        super();
    }

    public final void onClick(View view)
    {
        ThumbNailListView.a(b).a(a);
    }
}
