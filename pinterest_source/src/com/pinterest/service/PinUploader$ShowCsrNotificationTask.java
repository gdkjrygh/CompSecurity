// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.service;

import android.os.AsyncTask;
import com.pinterest.activity.task.toast.CsrPinnedToast;

// Referenced classes of package com.pinterest.service:
//            PinUploader

class <init> extends AsyncTask
{

    final PinUploader this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((s[])aobj);
    }

    protected transient Void doInBackground(s as[])
    {
        as = as[0];
        CsrPinnedToast csrpinnedtoast = new CsrPinnedToast(((s) (as)).pin, ((s) (as)).domainPins);
        csrpinnedtoast.setDuration(5000);
        PinUploader.access$1400(PinUploader.this, ((s) (as)).pin, csrpinnedtoast);
        return null;
    }

    private s()
    {
        this$0 = PinUploader.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
