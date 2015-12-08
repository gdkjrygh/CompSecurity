// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

// Referenced classes of package com.google.gson.internal:
//            Excluder

class val.type extends TypeAdapter
{

    private TypeAdapter _flddelegate;
    final Excluder this$0;
    final Gson val$gson;
    final boolean val$skipDeserialize;
    final boolean val$skipSerialize;
    final TypeToken val$type;

    private TypeAdapter _mthdelegate()
    {
        TypeAdapter typeadapter = _flddelegate;
        if (typeadapter != null)
        {
            return typeadapter;
        } else
        {
            TypeAdapter typeadapter1 = val$gson.getDelegateAdapter(Excluder.this, val$type);
            _flddelegate = typeadapter1;
            return typeadapter1;
        }
    }

    public Object read(JsonReader jsonreader)
        throws IOException
    {
        if (val$skipDeserialize)
        {
            jsonreader.skipValue();
            return null;
        } else
        {
            return _mthdelegate().read(jsonreader);
        }
    }

    public void write(JsonWriter jsonwriter, Object obj)
        throws IOException
    {
        if (val$skipSerialize)
        {
            jsonwriter.nullValue();
            return;
        } else
        {
            _mthdelegate().write(jsonwriter, obj);
            return;
        }
    }

    ()
    {
        this$0 = final_excluder;
        val$skipDeserialize = flag;
        val$skipSerialize = flag1;
        val$gson = gson1;
        val$type = TypeToken.this;
        super();
    }
}
