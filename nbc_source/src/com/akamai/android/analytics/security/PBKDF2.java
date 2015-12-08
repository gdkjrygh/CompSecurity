// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics.security;


// Referenced classes of package com.akamai.android.analytics.security:
//            PBKDF2Parameters, PRF

public interface PBKDF2
{

    public abstract byte[] deriveKey(String s);

    public abstract byte[] deriveKey(String s, int i);

    public abstract PBKDF2Parameters getParameters();

    public abstract PRF getPseudoRandomFunction();

    public abstract void setParameters(PBKDF2Parameters pbkdf2parameters);

    public abstract void setPseudoRandomFunction(PRF prf);

    public abstract boolean verifyKey(String s);
}
