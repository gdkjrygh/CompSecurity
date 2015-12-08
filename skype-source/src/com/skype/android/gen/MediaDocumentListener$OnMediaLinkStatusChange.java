// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.MediaDocument;

// Referenced classes of package com.skype.android.gen:
//            MediaDocumentListener

public static class _path
{

    private String _path;
    private String _profile;
    private MediaDocument _sender;
    private com.skype.tatusChange._status _status;

    public String getPath()
    {
        return _path;
    }

    public String getProfile()
    {
        return _profile;
    }

    public MediaDocument getSender()
    {
        return _sender;
    }

    public com.skype.tatusChange getStatus()
    {
        return _status;
    }

    public I(MediaDocument mediadocument, com.skype.tatusChange tatuschange, String s, String s1)
    {
        _sender = mediadocument;
        _status = tatuschange;
        _profile = s;
        _path = s1;
    }
}
