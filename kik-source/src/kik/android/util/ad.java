// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.EditText;
import com.kik.cards.web.kik.KikMessageParcelable;
import kik.android.e.f;

public final class ad extends Handler
{

    f a;
    private EditText b;

    public ad(EditText edittext, f f1)
    {
        b = edittext;
        a = f1;
    }

    public final void handleMessage(Message message)
    {
        String s;
        String s1;
        KikMessageParcelable kikmessageparcelable;
        ComponentName componentname;
        String s2;
        Bundle bundle;
        s = message.getData().getString("built_in_msg");
        s1 = message.getData().getString("smiley_key");
        kikmessageparcelable = (KikMessageParcelable)message.getData().getParcelable("serialized_content_message");
        componentname = (ComponentName)message.getData().get("launch_app");
        s2 = message.getData().getString("launch_card");
        bundle = new Bundle();
        if (kikmessageparcelable == null) goto _L2; else goto _L1
_L1:
        a.a(kikmessageparcelable);
_L4:
        return;
_L2:
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.equals("camera"))
        {
            a.g();
            return;
        }
        if (s.equals("gallery"))
        {
            a.h();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (s2 != null)
        {
            bundle.putInt("KikChatFragment.CardIndex", message.getData().getInt("KikChatFragment.CardIndex"));
            a.a(s2);
            return;
        }
        if (componentname != null)
        {
            a.a(componentname);
            return;
        }
        if (s1 != null && !"".equals(s1))
        {
            a.b(s1);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }
}
