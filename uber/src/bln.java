// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

public final class bln
{

    public static bkd a(JsonReader jsonreader)
    {
        boolean flag = true;
        try
        {
            jsonreader.peek();
        }
        // Misplaced declaration of an exception variable
        catch (JsonReader jsonreader)
        {
            if (flag)
            {
                return bkf.a;
            } else
            {
                throw new bkm(jsonreader);
            }
        }
        // Misplaced declaration of an exception variable
        catch (JsonReader jsonreader)
        {
            throw new bkm(jsonreader);
        }
        // Misplaced declaration of an exception variable
        catch (JsonReader jsonreader)
        {
            throw new bke(jsonreader);
        }
        // Misplaced declaration of an exception variable
        catch (JsonReader jsonreader)
        {
            throw new bkm(jsonreader);
        }
        flag = false;
        jsonreader = (bkd)bmh.P.a(jsonreader);
        return jsonreader;
    }

    public static Writer a(Appendable appendable)
    {
        if (appendable instanceof Writer)
        {
            return (Writer)appendable;
        } else
        {
            return new blo(appendable, (byte)0);
        }
    }

    public static void a(bkd bkd1, JsonWriter jsonwriter)
    {
        bmh.P.a(jsonwriter, bkd1);
    }
}
