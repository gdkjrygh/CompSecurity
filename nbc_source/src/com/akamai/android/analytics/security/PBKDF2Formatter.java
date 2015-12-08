// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics.security;


// Referenced classes of package com.akamai.android.analytics.security:
//            PBKDF2Parameters

public interface PBKDF2Formatter
{

    public abstract boolean fromString(PBKDF2Parameters pbkdf2parameters, String s);

    public abstract String toString(PBKDF2Parameters pbkdf2parameters);
}
