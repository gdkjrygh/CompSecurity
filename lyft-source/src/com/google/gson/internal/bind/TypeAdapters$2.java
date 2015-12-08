// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.BitSet;

// Referenced classes of package com.google.gson.internal.bind:
//            TypeAdapters

final class  extends TypeAdapter
{

    public BitSet a(JsonReader jsonreader)
    {
        JsonToken jsontoken;
        BitSet bitset;
        int i;
        if (jsonreader.f() == JsonToken.i)
        {
            jsonreader.j();
            return null;
        }
        bitset = new BitSet();
        jsonreader.a();
        jsontoken = jsonreader.f();
        i = 0;
_L2:
        boolean flag;
        if (jsontoken == JsonToken.b)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        switch (.a[jsontoken.ordinal()])
        {
        default:
            throw new JsonSyntaxException((new StringBuilder()).append("Invalid bitset value type: ").append(jsontoken).toString());

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
            break MISSING_BLOCK_LABEL_153;

        case 1: // '\001'
            if (jsonreader.m() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            break;
        }
_L3:
        if (flag)
        {
            bitset.set(i);
        }
        i++;
        jsontoken = jsonreader.f();
        if (true) goto _L2; else goto _L1
_L1:
        flag = jsonreader.i();
          goto _L3
        String s = jsonreader.h();
        int j;
        try
        {
            j = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (JsonReader jsonreader)
        {
            throw new JsonSyntaxException((new StringBuilder()).append("Error: Expecting: bitset number value (1, 0), Found: ").append(s).toString());
        }
        if (j != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L3
        jsonreader.b();
        return bitset;
    }

    public void a(JsonWriter jsonwriter, BitSet bitset)
    {
        if (bitset == null)
        {
            jsonwriter.f();
            return;
        }
        jsonwriter.b();
        int i = 0;
        while (i < bitset.length()) 
        {
            int j;
            if (bitset.get(i))
            {
                j = 1;
            } else
            {
                j = 0;
            }
            jsonwriter.a(j);
            i++;
        }
        jsonwriter.c();
    }

    public Object read(JsonReader jsonreader)
    {
        return a(jsonreader);
    }

    public void write(JsonWriter jsonwriter, Object obj)
    {
        a(jsonwriter, (BitSet)obj);
    }

    ()
    {
    }
}
