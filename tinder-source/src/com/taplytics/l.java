// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            hd, gs, j

public final class l
    implements hd
{

    final j a;

    public l(j j1)
    {
        a = j1;
        super();
    }

    public final void a(JSONArray jsonarray, Exception exception)
    {
        if (exception == null) goto _L2; else goto _L1
_L1:
        gs.b("Reading Events from Disk", exception);
_L4:
        return;
_L2:
        if (jsonarray == null || jsonarray.length() <= 0) goto _L4; else goto _L3
_L3:
        int i;
        if (j.a(a) == null)
        {
            j.a(a, new ArrayList());
        }
        if (gs.b())
        {
            gs.a((new StringBuilder("Got TLEvents From Disk: ")).append(jsonarray.length()).toString());
        }
        i = 0;
_L10:
        if (i >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_147;
        }
        try
        {
            exception = ((Exception) (jsonarray.opt(i)));
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            gs.b("Adding TLEvent from disk", exception);
            break MISSING_BLOCK_LABEL_156;
        }
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        if (!(exception instanceof JSONObject)) goto _L6; else goto _L5
_L5:
        exception = (JSONObject)exception;
_L8:
        j.a(a).add(exception);
        break MISSING_BLOCK_LABEL_156;
_L6:
        exception = new JSONObject((String)exception);
        if (true) goto _L8; else goto _L7
_L7:
        j.a(a, null);
        return;
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
