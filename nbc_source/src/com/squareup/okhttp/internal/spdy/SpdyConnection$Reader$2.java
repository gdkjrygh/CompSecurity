// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            SpdyConnection, FrameWriter, Settings

class val.peerSettings extends NamedRunnable
{

    final val.peerSettings this$1;
    final Settings val$peerSettings;

    public void execute()
    {
        try
        {
            frameWriter.ackSettings(val$peerSettings);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    transient (Object aobj[], Settings settings)
    {
        this$1 = final_;
        val$peerSettings = settings;
        super(String.this, aobj);
    }
}
