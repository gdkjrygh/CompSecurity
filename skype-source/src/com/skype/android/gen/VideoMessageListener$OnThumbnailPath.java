// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.VideoMessage;

// Referenced classes of package com.skype.android.gen:
//            VideoMessageListener

public static class _localPath
{

    private String _localPath;
    private VideoMessage _sender;

    public String getLocalPath()
    {
        return _localPath;
    }

    public VideoMessage getSender()
    {
        return _sender;
    }

    public (VideoMessage videomessage, String s)
    {
        _sender = videomessage;
        _localPath = s;
    }
}
