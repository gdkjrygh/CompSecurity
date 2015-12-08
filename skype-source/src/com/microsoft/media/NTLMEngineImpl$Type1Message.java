// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import org.apache.http.impl.auth.NTLMEngineException;

// Referenced classes of package com.microsoft.media:
//            NTLMEngineImpl

static class nit> extends nit>
{

    protected byte domainBytes[];
    protected byte hostBytes[];

    String getResponse()
    {
        prepareResponse(hostBytes.length + 32 + domainBytes.length, 1);
        addULong(0x20080235);
        addUShort(domainBytes.length);
        addUShort(domainBytes.length);
        addULong(hostBytes.length + 32);
        addUShort(hostBytes.length);
        addUShort(hostBytes.length);
        addULong(32);
        addBytes(hostBytes);
        addBytes(domainBytes);
        return super.etResponse();
    }

    (String s, String s1)
        throws NTLMEngineException
    {
        try
        {
            s1 = NTLMEngineImpl.access$400(s1);
            s = NTLMEngineImpl.access$500(s);
            hostBytes = s1.getBytes("UnicodeLittleUnmarked");
            domainBytes = s.toUpperCase(Locale.US).getBytes("UnicodeLittleUnmarked");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NTLMEngineException((new StringBuilder("Unicode unsupported: ")).append(s.getMessage()).toString(), s);
        }
    }
}
