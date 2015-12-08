// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.MediaDocument;

// Referenced classes of package com.skype.android.gen:
//            MediaDocumentListener

public static class _totalSize
{

    private String _contentId;
    private MediaDocument _sender;
    private int _sizeUploaded;
    private int _totalSize;

    public String getContentId()
    {
        return _contentId;
    }

    public MediaDocument getSender()
    {
        return _sender;
    }

    public int getSizeUploaded()
    {
        return _sizeUploaded;
    }

    public int getTotalSize()
    {
        return _totalSize;
    }

    public (MediaDocument mediadocument, String s, int i, int j)
    {
        _sender = mediadocument;
        _contentId = s;
        _sizeUploaded = i;
        _totalSize = j;
    }
}
