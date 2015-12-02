// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.h;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.messages.model.threads.Message;
import com.facebook.orca.attachments.a;
import com.facebook.widget.f;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewImageAttachmentView

public class d extends f
{

    private a a;
    private Message b;
    private ImageView c;
    private TextView d;
    private ThreadViewImageAttachmentView e;

    public d(Context context)
    {
        super(context);
        a(context);
    }

    private void a(Context context)
    {
        a = (a)getInjector().a(com/facebook/orca/attachments/a);
        setContentView(k.orca_admin_message_item);
        c = (ImageView)findViewById(i.admin_icon);
        d = (TextView)findViewById(i.admin_text);
        e = (ThreadViewImageAttachmentView)findViewById(i.admin_images);
    }

    public Message getMessage()
    {
        return b;
    }

    public void setMessage(Message message)
    {
        b = message;
        b.u();
        JVM INSTR lookupswitch 10: default 104
    //                   1: 151
    //                   2: 164
    //                   3: 177
    //                   4: 190
    //                   5: 203
    //                   6: 216
    //                   7: 190
    //                   100: 229
    //                   101: 242
    //                   102: 255;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L5 _L8 _L9 _L10
_L10:
        break MISSING_BLOCK_LABEL_255;
_L1:
        c.setImageDrawable(null);
_L11:
        d.setText(message.k());
        if (a.a(message))
        {
            e.setVisibility(0);
            e.setMessage(message);
            return;
        } else
        {
            e.setVisibility(8);
            return;
        }
_L2:
        c.setImageResource(h.orca_admin_add_people);
          goto _L11
_L3:
        c.setImageResource(h.orca_admin_leave_conversation);
          goto _L11
_L4:
        c.setImageResource(h.orca_admin_edit_name);
          goto _L11
_L5:
        c.setImageResource(h.orca_admin_change_picture);
          goto _L11
_L6:
        c.setImageResource(h.orca_admin_video_call);
          goto _L11
_L7:
        c.setImageResource(h.orca_admin_missed_call);
          goto _L11
_L8:
        c.setImageResource(h.orca_admin_incoming_call);
          goto _L11
_L9:
        c.setImageResource(h.orca_admin_missed_call);
          goto _L11
        c.setImageResource(h.orca_admin_outgoing_call);
          goto _L11
    }
}
