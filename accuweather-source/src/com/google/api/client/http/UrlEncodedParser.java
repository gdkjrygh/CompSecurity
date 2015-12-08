// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.ArrayValueMap;
import com.google.api.client.util.Charsets;
import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Throwables;
import com.google.api.client.util.Types;
import com.google.api.client.util.escape.CharEscapers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.api.client.http:
//            HttpMediaType

public class UrlEncodedParser
    implements ObjectParser
{

    public static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
    public static final String MEDIA_TYPE;

    public UrlEncodedParser()
    {
    }

    public static void parse(Reader reader, Object obj)
        throws IOException
    {
        Object obj1 = obj.getClass();
        ClassInfo classinfo = ClassInfo.of(((Class) (obj1)));
        List list = Arrays.asList(new Type[] {
            obj1
        });
        GenericData genericdata;
        Object obj2;
        Object obj3;
        ArrayValueMap arrayvaluemap;
        boolean flag;
        if (com/google/api/client/util/GenericData.isAssignableFrom(((Class) (obj1))))
        {
            genericdata = (GenericData)obj;
        } else
        {
            genericdata = null;
        }
        if (java/util/Map.isAssignableFrom(((Class) (obj1))))
        {
            obj1 = (Map)obj;
        } else
        {
            obj1 = null;
        }
        arrayvaluemap = new ArrayValueMap(obj);
        obj3 = new StringWriter();
        obj2 = new StringWriter();
        flag = true;
        do
        {
            int i = reader.read();
            switch (i)
            {
            default:
                String s;
                FieldInfo fieldinfo;
                Object obj4;
                if (flag)
                {
                    ((StringWriter) (obj3)).write(i);
                } else
                {
                    ((StringWriter) (obj2)).write(i);
                }
                continue;

            case -1: 
            case 38: // '&'
                obj4 = CharEscapers.decodeUri(((StringWriter) (obj3)).toString());
                if (((String) (obj4)).length() != 0)
                {
                    s = CharEscapers.decodeUri(((StringWriter) (obj2)).toString());
                    fieldinfo = classinfo.getFieldInfo(((String) (obj4)));
                    if (fieldinfo != null)
                    {
                        obj4 = Data.resolveWildcardTypeOrTypeVariable(list, fieldinfo.getGenericType());
                        if (Types.isArray(((Type) (obj4))))
                        {
                            obj2 = Types.getRawArrayComponentType(list, Types.getArrayComponentType(((Type) (obj4))));
                            arrayvaluemap.put(fieldinfo.getField(), ((Class) (obj2)), parseValue(((Type) (obj2)), list, s));
                        } else
                        if (Types.isAssignableToOrFrom(Types.getRawArrayComponentType(list, ((Type) (obj4))), java/lang/Iterable))
                        {
                            obj3 = (Collection)fieldinfo.getValue(obj);
                            obj2 = obj3;
                            if (obj3 == null)
                            {
                                obj2 = Data.newCollectionInstance(((Type) (obj4)));
                                fieldinfo.setValue(obj, obj2);
                            }
                            if (obj4 == java/lang/Object)
                            {
                                obj3 = null;
                            } else
                            {
                                obj3 = Types.getIterableParameter(((Type) (obj4)));
                            }
                            ((Collection) (obj2)).add(parseValue(((Type) (obj3)), list, s));
                        } else
                        {
                            fieldinfo.setValue(obj, parseValue(((Type) (obj4)), list, s));
                        }
                    } else
                    if (obj1 != null)
                    {
                        obj3 = (ArrayList)((Map) (obj1)).get(obj4);
                        obj2 = obj3;
                        if (obj3 == null)
                        {
                            obj2 = new ArrayList();
                            if (genericdata != null)
                            {
                                genericdata.set(((String) (obj4)), obj2);
                            } else
                            {
                                ((Map) (obj1)).put(obj4, obj2);
                            }
                        }
                        ((ArrayList) (obj2)).add(s);
                    }
                }
                flag = true;
                obj3 = new StringWriter();
                obj2 = new StringWriter();
                if (i == -1)
                {
                    arrayvaluemap.setValues();
                    return;
                }
                continue;

            case 61: // '='
                flag = false;
                break;
            }
        } while (true);
    }

    public static void parse(String s, Object obj)
    {
        if (s == null)
        {
            return;
        }
        try
        {
            parse(((Reader) (new StringReader(s))), obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw Throwables.propagate(s);
        }
    }

    private static Object parseValue(Type type, List list, String s)
    {
        return Data.parsePrimitiveValue(Data.resolveWildcardTypeOrTypeVariable(list, type), s);
    }

    public Object parseAndClose(InputStream inputstream, Charset charset, Class class1)
        throws IOException
    {
        return parseAndClose(((Reader) (new InputStreamReader(inputstream, charset))), class1);
    }

    public Object parseAndClose(InputStream inputstream, Charset charset, Type type)
        throws IOException
    {
        return parseAndClose(((Reader) (new InputStreamReader(inputstream, charset))), type);
    }

    public Object parseAndClose(Reader reader, Class class1)
        throws IOException
    {
        return parseAndClose(reader, ((Type) (class1)));
    }

    public Object parseAndClose(Reader reader, Type type)
        throws IOException
    {
        Preconditions.checkArgument(type instanceof Class, "dataType has to be of type Class<?>");
        type = ((Type) (Types.newInstance((Class)type)));
        parse(new BufferedReader(reader), type);
        return type;
    }

    static 
    {
        MEDIA_TYPE = (new HttpMediaType("application/x-www-form-urlencoded")).setCharsetParameter(Charsets.UTF_8).build();
    }
}
