// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

// Referenced classes of package com.google.userfeedback.android.api:
//            m, ah, SendUserFeedbackService

final class o extends AsyncTask
{

    final m a;

    o(m m1)
    {
        a = m1;
        super();
    }

    private transient Void a()
    {
        if (!a.a())
        {
            a.b();
        }
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = a.a.a;
        ((Context) (obj)).startService(new Intent(((Context) (obj)), com/google/userfeedback/android/api/SendUserFeedbackService));
    }
}
