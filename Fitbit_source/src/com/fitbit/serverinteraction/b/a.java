// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.b;

import android.text.TextUtils;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.fitbit.serverinteraction.b:
//            g

abstract class a extends g
{

    private static final String a = "BaseStringResponseParser";

    a()
    {
    }

    protected boolean a()
    {
        return b.a.a();
    }

    protected String c(InputStream inputstream, String s)
        throws IOException, ServerCommunicationException
    {
        String as[];
        ByteArrayOutputStream bytearrayoutputstream;
        bytearrayoutputstream = new ByteArrayOutputStream(1024);
        as = null;
        byte abyte0[] = new byte[1024];
        do
        {
            int i = inputstream.read(abyte0);
            if (i == -1)
            {
                break;
            }
            bytearrayoutputstream.write(abyte0, 0, i);
        } while (true);
        inputstream = as;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        if (s.contains("text")) goto _L4; else goto _L3
_L3:
        inputstream = as;
        if (!s.contains("application/json")) goto _L2; else goto _L4
_L4:
        int j;
        int k;
        as = s.split(";");
        s = "UTF-8";
        k = as.length;
        j = 0;
_L10:
        inputstream = s;
        if (j >= k) goto _L6; else goto _L5
_L5:
        inputstream = as[j].split("=");
        if (inputstream.length != 2 || !"charset".equalsIgnoreCase(inputstream[0])) goto _L8; else goto _L7
_L7:
        inputstream = inputstream[1];
_L6:
        inputstream = new String(bytearrayoutputstream.toByteArray(), inputstream);
_L2:
        s = inputstream;
        if (TextUtils.isEmpty(inputstream))
        {
            s = null;
        }
        if (a() && !TextUtils.isEmpty(s))
        {
            CharSequence charsequence = s.subSequence(0, Math.min(512, s.length()));
            if (s.length() > 512)
            {
                inputstream = "...";
            } else
            {
                inputstream = "";
            }
            com.fitbit.e.a.a("BaseStringResponseParser", String.format("RESPONSE: \"%s%s\"", new Object[] {
                charsequence, inputstream
            }), new Object[0]);
        }
        return s;
_L8:
        j++;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
