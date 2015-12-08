// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.messaging;

import org.json.JSONObject;

// Referenced classes of package org.xwalk.core.internal.extension.api.messaging:
//            Command, Messaging, MessagingManager

class this._cls0
    implements Command
{

    final Messaging this$0;

    public void runCommand(int i, JSONObject jsonobject)
    {
        Messaging.access$100(Messaging.this).onMsgMarkConversationRead(i, jsonobject);
    }

    ager()
    {
        this$0 = Messaging.this;
        super();
    }
}
