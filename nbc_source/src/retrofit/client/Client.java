// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.client;

import java.io.IOException;

// Referenced classes of package retrofit.client:
//            Request, Response

public interface Client
{
    public static interface Provider
    {

        public abstract Client get();
    }


    public abstract Response execute(Request request)
        throws IOException;
}
