// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import java.util.List;

// Referenced classes of package com.google.android.gms.auth:
//            TokenData

public static final class mGrantedScopes
{

    private Long mExpirationTimeSecs;
    private List mGrantedScopes;
    private boolean mIsCached;
    private boolean mIsSnowballed;
    public String mToken;

    public ()
    {
        mToken = null;
        mExpirationTimeSecs = null;
        mIsCached = false;
        mIsSnowballed = false;
        mGrantedScopes = null;
    }
}
