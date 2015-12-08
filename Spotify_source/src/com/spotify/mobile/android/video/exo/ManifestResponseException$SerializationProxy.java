// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.exo;

import java.io.Serializable;

// Referenced classes of package com.spotify.mobile.android.video.exo:
//            ManifestResponseException

class mHttpStatusCode
    implements Serializable
{

    private static final long serialVersionUID = 0x21830df2ab75d01dL;
    private final int mHttpStatusCode;
    private final String mJsonResponse;

    private Object readResolve()
    {
        return new ManifestResponseException(mHttpStatusCode, mJsonResponse);
    }

    public (ManifestResponseException manifestresponseexception)
    {
        mJsonResponse = ManifestResponseException.a(manifestresponseexception);
        mHttpStatusCode = ManifestResponseException.b(manifestresponseexception);
    }
}
