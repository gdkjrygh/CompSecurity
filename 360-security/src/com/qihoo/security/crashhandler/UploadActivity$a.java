// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.crashhandler;

import android.os.AsyncTask;
import com.qihoo360.common.utils.Utils;

// Referenced classes of package com.qihoo.security.crashhandler:
//            UploadActivity, b

private class <init> extends AsyncTask
{

    final UploadActivity a;

    protected transient Integer a(Void avoid[])
    {
        return Integer.valueOf(b.a(a).b());
    }

    protected void a(Integer integer)
    {
        super.onPostExecute(integer);
        Utils.dismissDialog(UploadActivity.a(a));
        UploadActivity uploadactivity = a;
        boolean flag;
        if (integer.intValue() >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        UploadActivity.a(uploadactivity, flag);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Integer)obj);
    }

    private (UploadActivity uploadactivity)
    {
        a = uploadactivity;
        super();
    }

    a(UploadActivity uploadactivity, a a1)
    {
        this(uploadactivity);
    }
}
