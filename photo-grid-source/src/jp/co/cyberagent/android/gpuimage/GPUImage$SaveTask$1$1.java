// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.net.Uri;

class val.uri
    implements Runnable
{

    final val.uri this$2;
    final Uri val$uri;

    public void run()
    {
        ss._mth200(_fld1).onPictureSaved(val$uri);
    }

    dListener()
    {
        this$2 = final_dlistener;
        val$uri = Uri.this;
        super();
    }
}
