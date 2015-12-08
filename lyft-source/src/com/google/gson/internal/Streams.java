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

    public static JsonElement a(JsonReader jsonreader)
    {
        boolean flag = true;
        try
        {
            jsonreader.f();
        }
        // Misplaced declaration of an exception variable
        catch (JsonReader jsonreader)
        {
            if (flag)
            {
                return JsonNull.a;
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
        jsonreader = (JsonElement)TypeAdapters.P.read(jsonreader);
        return jsonreader;
    }

    public static Writer a(Appendable appendable)
    {
        if (appendable instanceof Writer)
        {
            return (Writer)appendable;
        } else
        {
            return new AppendableWriter(appendable);
        }
    }

    public static void a(JsonElement jsonelement, JsonWriter jsonwriter)
    {
        TypeAdapters.P.write(jsonwriter, jsonelement);
    }

    private class AppendableWriter extends Writer
    {

        private final Appendable a;
        private final CurrentWrite b;

        public void close()
        {
        }

        public void flush()
        {
        }

        public void write(int i)
        {
            a.append((char)i);
        }

        public void write(char ac[], int i, int j)
        {
            b.a = ac;
            a.append(b, i, i + j);
        }

        private AppendableWriter(Appendable appendable)
        {
            class CurrentWrite
                implements CharSequence
            {

                char a[];

                public char charAt(int i)
                {
                    return a[i];
                }

                public int length()
                {
                    return a.length;
                }

                public CharSequence subSequence(int i, int j)
                {
                    return new String(a, i, j - i);
                }

                CurrentWrite()
                {
                }
            }

            b = new CurrentWrite();
            a = appendable;
        }

    }

}
