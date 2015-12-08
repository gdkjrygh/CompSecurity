// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.MediaDocument;

// Referenced classes of package com.skype.android.gen:
//            MediaDocumentListener

public static class _isCritical
{

    private com.skype.wnloadError._sender _error;
    private boolean _isCritical;
    private String _profile;
    private MediaDocument _sender;

    public com.skype.wnloadError getError()
    {
        return _error;
    }

    public boolean getIsCritical()
    {
        return _isCritical;
    }

    public String getProfile()
    {
        return _profile;
    }

    public MediaDocument getSender()
    {
        return _sender;
    }

    public A(MediaDocument mediadocument, String s, com.skype.wnloadError wnloaderror, boolean flag)
    {
        _sender = mediadocument;
        _profile = s;
        _error = wnloaderror;
        _isCritical = flag;
    }
}
