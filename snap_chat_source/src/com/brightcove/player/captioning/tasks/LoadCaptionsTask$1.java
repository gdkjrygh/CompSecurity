// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning.tasks;

import com.brightcove.player.captioning.WebVTTParser;
import java.io.InputStream;

// Referenced classes of package com.brightcove.player.captioning.tasks:
//            LoadCaptionsTask

final class a
    implements sponseStreamListener
{

    private LoadCaptionsTask a;

    public final void onStreamReady(InputStream inputstream)
    {
        LoadCaptionsTask.a(a, WebVTTParser.parse(inputstream, "UTF-8"));
    }

    sponseStreamListener(LoadCaptionsTask loadcaptionstask)
    {
        a = loadcaptionstask;
        super();
    }
}
