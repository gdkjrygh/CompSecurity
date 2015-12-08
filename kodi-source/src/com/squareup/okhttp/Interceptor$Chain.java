// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.IOException;

// Referenced classes of package com.squareup.okhttp:
//            Interceptor, Request, Response

public static interface 
{

    public abstract Response proceed(Request request)
        throws IOException;
}
