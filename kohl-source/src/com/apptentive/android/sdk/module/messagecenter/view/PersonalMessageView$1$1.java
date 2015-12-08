// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.widget.FrameLayout;
import com.apptentive.android.sdk.model.Message;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter.view:
//            AvatarView, PersonalMessageView

class val.avatar
    implements Runnable
{

    final val.avatar this$1;
    final AvatarView val$avatar;

    public void run()
    {
        avatarFrame.addView(val$avatar);
    }

    l.avatarFrame()
    {
        this$1 = final_avatarframe;
        val$avatar = AvatarView.this;
        super();
    }

    // Unreferenced inner class com/apptentive/android/sdk/module/messagecenter/view/PersonalMessageView$1

/* anonymous class */
    class PersonalMessageView._cls1 extends Thread
    {

        final PersonalMessageView this$0;
        final FrameLayout val$avatarFrame;

        public void run()
        {
            AvatarView avatarview = new AvatarView(context, message.getSenderProfilePhoto());
            post(avatarview. new PersonalMessageView._cls1._cls1());
        }

            
            {
                this$0 = final_personalmessageview;
                avatarFrame = FrameLayout.this;
                super();
            }
    }

}
