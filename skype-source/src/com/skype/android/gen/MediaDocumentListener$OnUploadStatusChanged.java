// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.MediaDocument;

// Referenced classes of package com.skype.android.gen:
//            MediaDocumentListener

public static class _status
{

    private String _contentId;
    private MediaDocument _sender;
    private com.skype.atusChanged._status _status;

    public String getContentId()
    {
        return _contentId;
    }

    public MediaDocument getSender()
    {
        return _sender;
    }

    public com.skype.atusChanged getStatus()
    {
        return _status;
    }

    public (MediaDocument mediadocument, String s, com.skype.atusChanged atuschanged)
    {
        _sender = mediadocument;
        _contentId = s;
        _status = atuschanged;
    }
}
