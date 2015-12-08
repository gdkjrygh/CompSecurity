// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.util;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

// Referenced classes of package com.google.api.client.googleapis.util:
//            Utils

private static class I
{

    static final HttpTransport INSTANCE = new NetHttpTransport();


    private I()
    {
    }
}
