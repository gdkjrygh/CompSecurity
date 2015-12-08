// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            ContentNoCache, AdHandle

private class _adHandle
{

    private AdHandle _adHandle;
    private String _url;
    final ContentNoCache this$0;

    AdHandle getAdHandle()
    {
        return _adHandle;
    }

    String getUrl()
    {
        return _url;
    }

    public (String s, AdHandle adhandle)
    {
        this$0 = ContentNoCache.this;
        super();
        _url = s;
        _adHandle = adhandle;
    }
}
