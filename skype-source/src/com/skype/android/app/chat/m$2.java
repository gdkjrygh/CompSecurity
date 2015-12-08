// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.os.Bundle;
import android.view.View;
import com.skype.Message;
import com.skype.android.SkypeActivity;

// Referenced classes of package com.skype.android.app.chat:
//            m, PlayVoicemailDialog

final class val.message
    implements android.view..OnClickListener
{

    final m this$0;
    final Message val$message;

    public final void onClick(View view)
    {
        view = new PlayVoicemailDialog();
        Bundle bundle = new Bundle();
        bundle.putInt("com.skype.objId", val$message.getObjectID());
        view.setArguments(bundle);
        view.show(((SkypeActivity)getContext()).getSupportFragmentManager());
    }

    ()
    {
        this$0 = final_m1;
        val$message = Message.this;
        super();
    }
}
