// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.b;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.fitbit.serverinteraction.b:
//            a

class h extends a
{

    h()
    {
    }

    public String a(InputStream inputstream, String s)
        throws IOException, ServerCommunicationException
    {
        return super.c(inputstream, s);
    }

    public Object b(InputStream inputstream, String s)
        throws Throwable, ServerCommunicationException
    {
        return a(inputstream, s);
    }
}
