// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.MediaDocument;

// Referenced classes of package com.skype.android.gen:
//            MediaDocumentListener

public static class _totalSize
{

    private int _preparationPercents;
    private String _profile;
    private MediaDocument _sender;
    private int _sizeDownloaded;
    private int _totalSize;

    public int getPreparationPercents()
    {
        return _preparationPercents;
    }

    public String getProfile()
    {
        return _profile;
    }

    public MediaDocument getSender()
    {
        return _sender;
    }

    public int getSizeDownloaded()
    {
        return _sizeDownloaded;
    }

    public int getTotalSize()
    {
        return _totalSize;
    }

    public (MediaDocument mediadocument, String s, int i, int j, int k)
    {
        _sender = mediadocument;
        _profile = s;
        _preparationPercents = i;
        _sizeDownloaded = j;
        _totalSize = k;
    }
}
