// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.calling;

import com.skype.Conversation;
import com.skype.Participant;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.skype.android.calling:
//            VideoCall, a

final class a
    implements Runnable
{

    final VideoCall a;

    public final void run()
    {
        VideoCall.l().remove(Integer.valueOf(VideoCall.a(a).getObjectID()));
        VideoCall.a(a).removeListener(VideoCall.b(a));
        VideoCall.a(a).removeListener(VideoCall.b(a));
        Participant participant;
        for (Iterator iterator = VideoCall.c(a).iterator(); iterator.hasNext(); participant.removeListener(VideoCall.b(a)))
        {
            participant = ((a)iterator.next()).a();
            participant.removeListener(VideoCall.b(a));
        }

    }

    (VideoCall videocall)
    {
        a = videocall;
        super();
    }
}
