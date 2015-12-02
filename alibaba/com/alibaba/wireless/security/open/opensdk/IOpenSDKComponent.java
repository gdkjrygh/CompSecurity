// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.wireless.security.open.opensdk;

import com.alibaba.wireless.security.open.SecException;

public interface IOpenSDKComponent
{

    public static final byte OPEN_BIZ_IID[] = {
        0, 2
    };
    public static final byte OPEN_BIZ_TID[] = {
        0, 3
    };
    public static final byte OPEN_BIZ_UID[] = {
        0, 1
    };

    public abstract Long analyzeOpenId(String s, String s1, String s2, byte abyte0[], String s3)
        throws SecException;

}
