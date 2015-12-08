// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

// Referenced classes of package com.localytics.android:
//            AmpCallable, AmpSessionHandler, SessionHandler

class this._cls0 extends AmpCallable
{

    final AmpSessionHandler this$0;

    Object call(Object aobj[])
    {
        aobj = SessionHandler.getInstallationId(mProvider, mApiKey);
        if (!TextUtils.isEmpty(((CharSequence) (aobj))))
        {
            Context context = mContext;
            Context context1 = mContext;
            ((ClipboardManager)context.getSystemService("clipboard")).setText(((CharSequence) (aobj)));
            Toast.makeText(mContext, (new StringBuilder()).append(((String) (aobj))).append(" has been copied to the clipboard.").toString(), 1).show();
        } else
        {
            Toast.makeText(mContext, "No install id found. Please check your integration.", 1).show();
        }
        return null;
    }

    ()
    {
        this$0 = AmpSessionHandler.this;
        super();
    }
}
