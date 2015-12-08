// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.serverinteraction.b.g;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.fitbit.serverinteraction:
//            k

public class i extends k
{

    public i()
    {
    }

    public static i a(InputStream inputstream, g g, RequestParametersBuilder.RequestParameters.ContentType contenttype)
        throws Throwable, IllegalArgumentException, ServerCommunicationException, IOException
    {
        i j = new i();
        j.a(g, inputstream, contenttype.contentType);
        return j;
    }
}
