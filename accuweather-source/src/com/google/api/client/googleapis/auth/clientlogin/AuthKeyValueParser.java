// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.clientlogin;

import com.google.api.client.http.HttpResponse;
import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Types;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Map;

final class AuthKeyValueParser
    implements ObjectParser
{

    public static final AuthKeyValueParser INSTANCE = new AuthKeyValueParser();

    private AuthKeyValueParser()
    {
    }

    public String getContentType()
    {
        return "text/plain";
    }

    public Object parse(HttpResponse httpresponse, Class class1)
        throws IOException
    {
        httpresponse.setContentLoggingLimit(0);
        httpresponse = httpresponse.getContent();
        class1 = ((Class) (parse(((InputStream) (httpresponse)), class1)));
        httpresponse.close();
        return class1;
        class1;
        httpresponse.close();
        throw class1;
    }

    public Object parse(InputStream inputstream, Class class1)
        throws IOException
    {
        ClassInfo classinfo = ClassInfo.of(class1);
        Object obj = Types.newInstance(class1);
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
        do
        {
            inputstream = bufferedreader.readLine();
            if (inputstream == null)
            {
                return obj;
            }
            int i = inputstream.indexOf('=');
            Object obj1 = inputstream.substring(0, i);
            inputstream = inputstream.substring(i + 1);
            Field field = classinfo.getField(((String) (obj1)));
            if (field != null)
            {
                obj1 = field.getType();
                if (obj1 == Boolean.TYPE || obj1 == java/lang/Boolean)
                {
                    inputstream = Boolean.valueOf(inputstream);
                }
                FieldInfo.setFieldValue(field, obj, inputstream);
            } else
            if (com/google/api/client/util/GenericData.isAssignableFrom(class1))
            {
                ((GenericData)obj).set(((String) (obj1)), inputstream);
            } else
            if (java/util/Map.isAssignableFrom(class1))
            {
                ((Map)obj).put(obj1, inputstream);
            }
        } while (true);
    }

    public Object parseAndClose(InputStream inputstream, Charset charset, Class class1)
        throws IOException
    {
        return parseAndClose(((Reader) (new InputStreamReader(inputstream, charset))), class1);
    }

    public Object parseAndClose(InputStream inputstream, Charset charset, Type type)
    {
        throw new UnsupportedOperationException("Type-based parsing is not yet supported -- use Class<T> instead");
    }

    public Object parseAndClose(Reader reader, Class class1)
        throws IOException
    {
        ClassInfo classinfo;
        Object obj1;
        BufferedReader bufferedreader;
        classinfo = ClassInfo.of(class1);
        obj1 = Types.newInstance(class1);
        bufferedreader = new BufferedReader(reader);
_L1:
        Object obj = bufferedreader.readLine();
        if (obj == null)
        {
            reader.close();
            return obj1;
        }
        Field field;
        Object obj2;
        int i = ((String) (obj)).indexOf('=');
        obj2 = ((String) (obj)).substring(0, i);
        obj = ((String) (obj)).substring(i + 1);
        field = classinfo.getField(((String) (obj2)));
        if (field == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        obj2 = field.getType();
        if (obj2 != Boolean.TYPE && obj2 != java/lang/Boolean)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        obj = Boolean.valueOf(((String) (obj)));
        FieldInfo.setFieldValue(field, obj1, obj);
          goto _L1
        class1;
        reader.close();
        throw class1;
        if (!com/google/api/client/util/GenericData.isAssignableFrom(class1)) goto _L3; else goto _L2
_L2:
        ((GenericData)obj1).set(((String) (obj2)), obj);
          goto _L1
_L3:
        if (!java/util/Map.isAssignableFrom(class1)) goto _L1; else goto _L4
_L4:
        ((Map)obj1).put(obj2, obj);
          goto _L1
    }

    public Object parseAndClose(Reader reader, Type type)
    {
        throw new UnsupportedOperationException("Type-based parsing is not yet supported -- use Class<T> instead");
    }

}
