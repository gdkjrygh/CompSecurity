// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageSelector

final class js
    implements android.widget.AdapterView.OnItemClickListener
{

    final ImageSelector a;

    js(ImageSelector imageselector)
    {
        a = imageselector;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        ImageSelector.a(a, view);
    }
}
