// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

public final class Streams
{
    static final class a extends Writer
    {

        private final Appendable a;
        private final a b;

        public final void close()
        {
        }

        public final void flush()
        {
        }

        public final void write(int i)
        {
            a.append((char)i);
        }

        public final void write(char ac[], int i, int j)
        {
            b.a = ac;
            a.append(b, i, i + j);
        }

        private a(Appendable appendable)
        {
            b = new a();
            a = appendable;
        }

        a(Appendable appendable, byte byte0)
        {
            this(appendable);
        }
    }

    static final class a.a
        implements CharSequence
    {

        char a[];

        public final char charAt(int i)
        {
            return a[i];
        }

        public final int length()
        {
            return a.length;
        }

        public final CharSequence subSequence(int i, int j)
        {
            return new String(a, i, j - i);
        }

        a.a()
        {
        }
    }


    public static JsonElement parse(JsonReader jsonreader)
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
                return JsonNull.INSTANCE;
            } else
            {
                throw new JsonSyntaxException(jsonreader);
            }
        }
        // Misplaced declaration of an exception variable
        catch (JsonReader jsonreader)
        {
            throw new JsonSyntaxException(jsonreader);
        }
        // Misplaced declaration of an exception variable
        catch (JsonReader jsonreader)
        {
            throw new JsonIOException(jsonreader);
        }
        // Misplaced declaration of an exception variable
        catch (JsonReader jsonreader)
        {
            throw new JsonSyntaxException(jsonreader);
        }
        flag = false;
        jsonreader = (JsonElement)TypeAdapters.JSON_ELEMENT.read(jsonreader);
        return jsonreader;
    }

    public static void write(JsonElement jsonelement, JsonWriter jsonwriter)
    {
        TypeAdapters.JSON_ELEMENT.write(jsonwriter, jsonelement);
    }

    public static Writer writerForAppendable(Appendable appendable)
    {
        if (appendable instanceof Writer)
        {
            return (Writer)appendable;
        } else
        {
            return new a(appendable, (byte)0);
        }
    }
}
