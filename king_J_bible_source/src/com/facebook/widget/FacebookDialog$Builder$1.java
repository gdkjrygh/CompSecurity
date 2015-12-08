// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import com.facebook.NativeAppCallAttachmentStore;
import java.util.HashMap;

// Referenced classes of package com.facebook.widget:
//            FacebookDialog

class this._cls1
    implements allback
{

    final diaAttachmentFiles this$1;

    public void onPresent(Context context)
        throws Exception
    {
        if (ageAttachments != null && ageAttachments.size() > 0)
        {
            FacebookDialog.access$7().addAttachmentsForCall(context, pCall.getCallId(), ageAttachments);
        }
        if (diaAttachmentFiles != null && diaAttachmentFiles.size() > 0)
        {
            FacebookDialog.access$7().addAttachmentFilesForCall(context, pCall.getCallId(), diaAttachmentFiles);
        }
    }

    l()
    {
        this$1 = this._cls1.this;
        super();
    }
}
