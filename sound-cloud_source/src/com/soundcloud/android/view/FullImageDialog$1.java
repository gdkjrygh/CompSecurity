// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.app.Activity;
import com.soundcloud.android.utils.AndroidUtils;
import java.lang.ref.WeakReference;

// Referenced classes of package com.soundcloud.android.view:
//            FullImageDialog

class this._cls0
    implements Runnable
{

    final FullImageDialog this$0;

    public void run()
    {
        Activity activity = (Activity)FullImageDialog.access$000(FullImageDialog.this).get();
        if (activity != null && !activity.isFinishing())
        {
            AndroidUtils.showToast(activity, 0x7f070147, new Object[0]);
        }
        try
        {
            dismiss();
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return;
        }
    }

    ()
    {
        this$0 = FullImageDialog.this;
        super();
    }
}
