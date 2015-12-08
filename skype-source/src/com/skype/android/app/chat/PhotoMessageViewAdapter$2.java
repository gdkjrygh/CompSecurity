// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Activity;
import android.view.View;
import com.skype.MediaDocument;
import com.skype.Message;
import com.skype.SkyLib;
import com.skype.android.app.Navigation;
import com.skype.android.util.TimeAnomalyException;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;

// Referenced classes of package com.skype.android.app.chat:
//            PhotoMessageViewAdapter

final class val.message
    implements android.view.ViewAdapter._cls2
{

    final PhotoMessageViewAdapter this$0;
    final MediaDocument val$mediaDocument;
    final Message val$message;

    public final void onClick(View view)
    {
        if (isLoaded(val$mediaDocument))
        {
            int i = val$message.getTimestampProp();
            String s;
            try
            {
                view = timeUtil.a(lib.getServerTime(), i, true);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                timeAnomalyTelemetry.a(view, val$message.getTypeProp(), "PhotoMessage#onClick#mediaDocument#isLoaded");
                view = timeUtil.a(i, true);
            }
            s = val$message.getAuthorProp();
            view = getContext().getString(0x7f0800fc, new Object[] {
                s, view
            });
            navigation.showImage(val$mediaDocument, view);
        }
    }

    ()
    {
        this$0 = final_photomessageviewadapter;
        val$mediaDocument = mediadocument;
        val$message = Message.this;
        super();
    }
}
