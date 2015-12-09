// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import java.io.IOException;

// Referenced classes of package com.google.gson.stream:
//            JsonReader, JsonToken

static final class eeReader extends JsonReaderInternalAccess
{

    public void promoteNameToValue(JsonReader jsonreader)
        throws IOException
    {
        if (jsonreader instanceof JsonTreeReader)
        {
            ((JsonTreeReader)jsonreader).promoteNameToValue();
            return;
        }
        jsonreader.peek();
        if (JsonReader.access$000(jsonreader) != JsonToken.NAME)
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected a name but was ").append(jsonreader.peek()).append(" ").append(" at line ").append(JsonReader.access$100(jsonreader)).append(" column ").append(JsonReader.access$200(jsonreader)).toString());
        } else
        {
            JsonReader.access$302(jsonreader, JsonReader.access$400(jsonreader));
            JsonReader.access$402(jsonreader, null);
            JsonReader.access$002(jsonreader, JsonToken.STRING);
            return;
        }
    }

    eeReader()
    {
    }
}
