// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.widget.TextView;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;

// Referenced classes of package com.skype.android.app.settings:
//            AttributionsFragment

final class val.textView
    implements AsyncCallback
{

    final AttributionsFragment this$0;
    final TextView val$textView;

    public final void done(AsyncResult asyncresult)
    {
        val$textView.setText((CharSequence)asyncresult.a());
    }

    ()
    {
        this$0 = final_attributionsfragment;
        val$textView = TextView.this;
        super();
    }
}
