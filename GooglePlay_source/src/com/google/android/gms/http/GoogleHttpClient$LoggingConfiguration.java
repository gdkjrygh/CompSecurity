// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.http;


// Referenced classes of package com.google.android.gms.http:
//            GoogleHttpClient

static final class logAuthToken
{

    final int level;
    final boolean logAuthToken;
    final String tag;

    protected (String s, int i, boolean flag)
    {
        tag = s;
        level = i;
        logAuthToken = flag;
    }
}
