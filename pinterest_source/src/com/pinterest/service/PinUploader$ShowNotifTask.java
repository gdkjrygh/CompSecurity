// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.service;

import android.os.AsyncTask;
import com.pinterest.api.model.Pin;

// Referenced classes of package com.pinterest.service:
//            PinUploader

class <init> extends AsyncTask
{

    final PinUploader this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Pin[])aobj);
    }

    protected transient Void doInBackground(Pin apin[])
    {
        PinUploader.access$1300(PinUploader.this, apin[0]);
        return null;
    }

    private ()
    {
        this$0 = PinUploader.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
