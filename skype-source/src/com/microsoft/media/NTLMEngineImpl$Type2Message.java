// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;

import java.io.UnsupportedEncodingException;
import org.apache.http.impl.auth.NTLMEngineException;

// Referenced classes of package com.microsoft.media:
//            NTLMEngineImpl

static class targetInfo extends targetInfo
{

    protected byte challenge[];
    protected int flags;
    protected String target;
    protected byte targetInfo[];

    byte[] getChallenge()
    {
        return challenge;
    }

    int getFlags()
    {
        return flags;
    }

    String getTarget()
    {
        return target;
    }

    byte[] getTargetInfo()
    {
        return targetInfo;
    }

    (String s)
        throws NTLMEngineException
    {
        super(s, 2);
        challenge = new byte[8];
        readBytes(challenge, 24);
        flags = readULong(20);
        if ((flags & 1) == 0)
        {
            throw new NTLMEngineException((new StringBuilder("NTLM type 2 message has flags that make no sense: ")).append(Integer.toString(flags)).toString());
        }
        target = null;
        if (getMessageLength() >= 20)
        {
            s = readSecurityBuffer(12);
            if (s.length != 0)
            {
                try
                {
                    target = new String(s, "UnicodeLittleUnmarked");
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw new NTLMEngineException(s.getMessage(), s);
                }
            }
        }
        targetInfo = null;
        if (getMessageLength() >= 48)
        {
            s = readSecurityBuffer(40);
            if (s.length != 0)
            {
                targetInfo = s;
            }
        }
    }
}
