// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;

import com.google.gson.internal.a.f;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.gson:
//            JsonIOException, k

public abstract class r
{

    public r()
    {
    }

    public final k a(Object obj)
    {
        f f1;
        try
        {
            f1 = new f();
            a(((JsonWriter) (f1)), obj);
            if (!f1.a.isEmpty())
            {
                throw new IllegalStateException((new StringBuilder("Expected one JSON element but was ")).append(f1.a).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new JsonIOException(((Throwable) (obj)));
        }
        obj = f1.b;
        return ((k) (obj));
    }

    public abstract Object a(JsonReader jsonreader)
        throws IOException;

    public abstract void a(JsonWriter jsonwriter, Object obj)
        throws IOException;
}
