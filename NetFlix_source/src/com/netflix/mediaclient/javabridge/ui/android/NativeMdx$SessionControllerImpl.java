// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.android;

import com.netflix.mediaclient.javabridge.invoke.mdx.session.EndSession;
import com.netflix.mediaclient.javabridge.invoke.mdx.session.SendMessage;
import com.netflix.mediaclient.javabridge.invoke.mdx.session.StartSession;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.SessionController;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.javabridge.ui.android:
//            NativeMdx

class mSessionId
    implements SessionController
{

    private String mMessageName;
    private int mSessionId;
    final NativeMdx this$0;

    public void endSession(int i)
    {
        NativeMdx.access$000(NativeMdx.this, new EndSession(i));
        mSessionId = -1;
    }

    public String getLastMessageName(int i)
    {
        if (mSessionId == i)
        {
            return mMessageName;
        } else
        {
            return null;
        }
    }

    public long sendMessage(int i, String s, JSONObject jsonobject)
    {
        mMessageName = s;
        mSessionId = i;
        s = new SendMessage(i, s, jsonobject);
        NativeMdx.access$000(NativeMdx.this, s);
        return s.getXid();
    }

    public void startSession(String s)
    {
        NativeMdx.access$000(NativeMdx.this, new StartSession(s));
    }

    ()
    {
        this$0 = NativeMdx.this;
        super();
        mSessionId = -1;
    }
}
