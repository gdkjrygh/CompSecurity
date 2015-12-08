// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.view.View;
import com.androidquery.a;
import com.androidquery.callback.BitmapAjaxCallback;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            y

static class er extends android.support.v7.widget.clerView.ViewHolder
{

    public void a(WebPhoto webphoto)
    {
        (new a(itemView.findViewById(0x7f10016d))).a(((BitmapAjaxCallback)((BitmapAjaxCallback)((BitmapAjaxCallback)(new BitmapAjaxCallback()).a(webphoto.getLargeImageUrl())).b(false)).a(true)).e(0x7f020229).a(com.cardinalblue.android.piccollage.helpers.a.a(0x7f020229)));
    }

    public WebPhoto(View view)
    {
        super(view);
    }
}
