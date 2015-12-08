// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.d;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

// Referenced classes of package com.microsoft.onlineid.internal.d:
//            b

protected static final class 
{

    protected static String a(JsonReader jsonreader)
        throws IOException
    {
        jsonreader.beginObject();
        a(jsonreader, "Views");
        jsonreader.beginArray();
        jsonreader.beginObject();
        a(jsonreader, "Attributes");
        jsonreader.beginArray();
_L10:
        if (!jsonreader.hasNext()) goto _L2; else goto _L1
_L1:
        jsonreader.beginObject();
        Object obj;
        String s;
        obj = null;
        s = null;
_L9:
        Object obj1;
        while (jsonreader.hasNext()) 
        {
            obj1 = jsonreader.nextName();
            if (!"Name".equals(obj1))
            {
                break MISSING_BLOCK_LABEL_72;
            }
            s = jsonreader.nextString();
        }
          goto _L3
        if (!"Value".equals(obj1)) goto _L5; else goto _L4
_L4:
        obj1 = jsonreader.peek();
        a[((JsonToken) (obj1)).ordinal()];
        JVM INSTR tableswitch 1 2: default 192
    //                   1 130
    //                   2 139;
           goto _L6 _L7 _L8
_L6:
        jsonreader.skipValue();
          goto _L9
        obj;
        jsonreader.close();
        throw obj;
_L7:
        jsonreader.nextNull();
        obj = null;
          goto _L9
_L8:
        obj = jsonreader.nextString();
          goto _L9
_L5:
        jsonreader.skipValue();
          goto _L9
_L3:
        boolean flag;
        jsonreader.endObject();
        flag = "PublicProfile.OrderedBasicName".equals(s);
        if (!flag)
        {
            obj = null;
        }
        if (obj != null)
        {
            jsonreader.close();
            return ((String) (obj));
        }
          goto _L10
_L2:
        jsonreader.close();
        return null;
    }

    private static void a(JsonReader jsonreader, String s)
        throws IOException
    {
        for (; jsonreader.hasNext(); jsonreader.skipValue())
        {
            if (s.equals(jsonreader.nextName()))
            {
                return;
            }
        }

        throw new IOException((new StringBuilder("Unable to find name ")).append(s).toString());
    }

    public ()
    {
    }
}
