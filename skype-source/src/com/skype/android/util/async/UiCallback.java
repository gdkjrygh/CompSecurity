// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.async;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.View;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.ConditionalAsyncCallback;

// Referenced classes of package com.skype.android.util.async:
//            a

public class UiCallback extends ConditionalAsyncCallback
{

    private AsyncCallback a;

    public UiCallback(Activity activity, AsyncCallback asynccallback)
    {
        super(new a(activity), asynccallback);
        a = asynccallback;
    }

    public UiCallback(Fragment fragment, AsyncCallback asynccallback)
    {
        super(new a(fragment), asynccallback);
        a = asynccallback;
    }

    public UiCallback(View view, AsyncCallback asynccallback)
    {
        super(new a(view), asynccallback);
        a = asynccallback;
    }

    public final void done(AsyncResult asyncresult)
    {
        if (a != null)
        {
            a.done(asyncresult);
        }
    }
}
