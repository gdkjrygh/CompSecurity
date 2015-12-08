// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ai;

import android.os.Bundle;
import android.os.IInterface;
import android.util.Log;
import com.google.android.m4b.maps.db.a;

// Referenced classes of package com.google.android.m4b.maps.ai:
//            b

final class t> extends com.google.android.m4b.maps.ay.t>
{

    private a a;
    private b b;

    private Void a(a a1)
    {
        t> t>;
        Object obj;
        short word0;
        Log.i(com.google.android.m4b.maps.ai.b.b(), "Sending API token request.");
        a1 = a1.a(com.google.android.m4b.maps.ai.b.a(b));
        obj = b;
        t> = a;
        word0 = a1.getShort("ERROR_CODE", (short)-1);
        if (word0 == -1) goto _L2; else goto _L1
_L1:
        word0;
        JVM INSTR tableswitch 1 5: default 378
    //                   1 256
    //                   2 212
    //                   3 180
    //                   4 234
    //                   5 132;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        Log.e(com.google.android.m4b.maps.ai.b.a, (new StringBuilder(49)).append("Authentication failed. Unrecognized error: ").append(word0).toString());
        ((b) (obj)).a();
        t>.b();
_L9:
        b.c();
_L10:
        return null;
_L8:
        Log.e(com.google.android.m4b.maps.ai.b.a, "Authentication failed. Timeout while trying to contact the server.");
        t>.a();
          goto _L9
        a1;
        Log.e(com.google.android.m4b.maps.ai.b.b(), "Exception when sending the token request.", a1);
        a.a();
        b.c();
          goto _L10
_L6:
        Log.e(com.google.android.m4b.maps.ai.b.a, "Authentication failed. API Key not found in the request.");
        ((b) (obj)).a();
        t>.b();
          goto _L9
        a1;
        b.c();
        throw a1;
_L5:
        Log.e(com.google.android.m4b.maps.ai.b.a, "Authentication failed. Could not extract app certificate");
        ((b) (obj)).a();
        t>.b();
          goto _L9
_L7:
        Log.e(com.google.android.m4b.maps.ai.b.a, "Authentication failed on the server.");
        ((b) (obj)).a();
        t>.b();
          goto _L9
_L4:
        Log.e(com.google.android.m4b.maps.ai.b.a, "Authentication failed. Package names don't match.");
        ((b) (obj)).a();
        t>.b();
          goto _L9
_L2:
        obj = a1.getString("API_TOKEN");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_360;
        }
        long l = a1.getLong("VALIDITY_DURATION");
        Log.i(com.google.android.m4b.maps.ai.b.a, (new StringBuilder(String.valueOf(obj).length() + 57)).append("Received API Token: ").append(((String) (obj))).append(" / Expires in: ").append(l).append("ms").toString());
        t>.a(((String) (obj)), l);
          goto _L9
        Log.e(com.google.android.m4b.maps.ai.b.a, "Missing token in service response.");
        t>.b();
          goto _L9
    }

    public final volatile Object a(IInterface iinterface)
    {
        return a((a)iinterface);
    }

    (b b1,  )
    {
        b = b1;
        a = ;
        super(b1);
    }
}
