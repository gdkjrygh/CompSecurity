// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public class JsonMappingException extends JsonProcessingException
{

    private static final long serialVersionUID = 1L;
    protected LinkedList _path;

    public JsonMappingException(String s)
    {
        super(s);
    }

    public JsonMappingException(String s, JsonLocation jsonlocation)
    {
        super(s, jsonlocation);
    }

    public JsonMappingException(String s, JsonLocation jsonlocation, Throwable throwable)
    {
        super(s, jsonlocation, throwable);
    }

    public JsonMappingException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public static JsonMappingException from(JsonParser jsonparser, String s)
    {
        if (jsonparser == null)
        {
            jsonparser = null;
        } else
        {
            jsonparser = jsonparser.getTokenLocation();
        }
        return new JsonMappingException(s, jsonparser);
    }

    public static JsonMappingException from(JsonParser jsonparser, String s, Throwable throwable)
    {
        if (jsonparser == null)
        {
            jsonparser = null;
        } else
        {
            jsonparser = jsonparser.getTokenLocation();
        }
        return new JsonMappingException(s, jsonparser, throwable);
    }

    public static JsonMappingException fromUnexpectedIOE(IOException ioexception)
    {
        return new JsonMappingException((new StringBuilder("Unexpected IOException (of type ")).append(ioexception.getClass().getName()).append("): ").append(ioexception.getMessage()).toString(), null, ioexception);
    }

    public static JsonMappingException wrapWithPath(Throwable throwable, Reference reference)
    {
        if (!(throwable instanceof JsonMappingException)) goto _L2; else goto _L1
_L1:
        throwable = (JsonMappingException)throwable;
_L4:
        throwable.prependPath(reference);
        return throwable;
_L2:
        String s;
label0:
        {
            String s1 = throwable.getMessage();
            if (s1 != null)
            {
                s = s1;
                if (s1.length() != 0)
                {
                    break label0;
                }
            }
            s = (new StringBuilder("(was ")).append(throwable.getClass().getName()).append(")").toString();
        }
        throwable = new JsonMappingException(s, null, throwable);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static JsonMappingException wrapWithPath(Throwable throwable, Object obj, int i)
    {
        return wrapWithPath(throwable, new Reference(obj, i));
    }

    public static JsonMappingException wrapWithPath(Throwable throwable, Object obj, String s)
    {
        return wrapWithPath(throwable, new Reference(obj, s));
    }

    protected void _appendPathDesc(StringBuilder stringbuilder)
    {
        if (_path != null)
        {
            Iterator iterator = _path.iterator();
            while (iterator.hasNext()) 
            {
                stringbuilder.append(((Reference)iterator.next()).toString());
                if (iterator.hasNext())
                {
                    stringbuilder.append("->");
                }
            }
        }
    }

    protected String _buildMessage()
    {
        Object obj = super.getMessage();
        if (_path == null)
        {
            return ((String) (obj));
        }
        if (obj == null)
        {
            obj = new StringBuilder();
        } else
        {
            obj = new StringBuilder(((String) (obj)));
        }
        ((StringBuilder) (obj)).append(" (through reference chain: ");
        obj = getPathReference(((StringBuilder) (obj)));
        ((StringBuilder) (obj)).append(')');
        return ((StringBuilder) (obj)).toString();
    }

    public String getLocalizedMessage()
    {
        return _buildMessage();
    }

    public String getMessage()
    {
        return _buildMessage();
    }

    public StringBuilder getPathReference(StringBuilder stringbuilder)
    {
        _appendPathDesc(stringbuilder);
        return stringbuilder;
    }

    public void prependPath(Reference reference)
    {
        if (_path == null)
        {
            _path = new LinkedList();
        }
        if (_path.size() < 1000)
        {
            _path.addFirst(reference);
        }
    }

    public void prependPath(Object obj, String s)
    {
        prependPath(new Reference(obj, s));
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getName()).append(": ").append(getMessage()).toString();
    }

    private class Reference
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        protected String _fieldName;
        protected Object _from;
        protected int _index;

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            Class class1;
            Package package1;
            if (_from instanceof Class)
            {
                class1 = (Class)_from;
            } else
            {
                class1 = _from.getClass();
            }
            package1 = class1.getPackage();
            if (package1 != null)
            {
                stringbuilder.append(package1.getName());
                stringbuilder.append('.');
            }
            stringbuilder.append(class1.getSimpleName());
            stringbuilder.append('[');
            if (_fieldName != null)
            {
                stringbuilder.append('"');
                stringbuilder.append(_fieldName);
                stringbuilder.append('"');
            } else
            if (_index >= 0)
            {
                stringbuilder.append(_index);
            } else
            {
                stringbuilder.append('?');
            }
            stringbuilder.append(']');
            return stringbuilder.toString();
        }

        protected Reference()
        {
            _index = -1;
        }

        public Reference(Object obj, int i)
        {
            _index = -1;
            _from = obj;
            _index = i;
        }

        public Reference(Object obj, String s)
        {
            _index = -1;
            _from = obj;
            if (s == null)
            {
                throw new NullPointerException("Can not pass null fieldName");
            } else
            {
                _fieldName = s;
                return;
            }
        }
    }

}
