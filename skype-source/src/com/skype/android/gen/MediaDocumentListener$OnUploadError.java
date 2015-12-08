// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.MediaDocument;

// Referenced classes of package com.skype.android.gen:
//            MediaDocumentListener

public static class _isCritical
{

    private String _contentId;
    private com.skype.UploadError._sender _error;
    private boolean _isCritical;
    private MediaDocument _sender;

    public String getContentId()
    {
        return _contentId;
    }

    public com.skype.UploadError getError()
    {
        return _error;
    }

    public boolean getIsCritical()
    {
        return _isCritical;
    }

    public MediaDocument getSender()
    {
        return _sender;
    }

    public (MediaDocument mediadocument, String s, com.skype.UploadError uploaderror, boolean flag)
    {
        _sender = mediadocument;
        _contentId = s;
        _error = uploaderror;
        _isCritical = flag;
    }
}
