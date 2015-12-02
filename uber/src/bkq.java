// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public abstract class bkq
{

    public bkq()
    {
    }

    public final bkd a(Object obj)
    {
        try
        {
            blx blx1 = new blx();
            a(((JsonWriter) (blx1)), obj);
            obj = blx1.a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new bke(((Throwable) (obj)));
        }
        return ((bkd) (obj));
    }

    public abstract Object a(JsonReader jsonreader);

    public abstract void a(JsonWriter jsonwriter, Object obj);
}
