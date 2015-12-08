// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//            TypeFactory

public class TypeParser
    implements Serializable
{
    static final class MyTokenizer extends StringTokenizer
    {

        protected int _index;
        protected final String _input;
        protected String _pushbackToken;

        public String getAllInput()
        {
            return _input;
        }

        public String getRemainingInput()
        {
            return _input.substring(_index);
        }

        public boolean hasMoreTokens()
        {
            return _pushbackToken != null || super.hasMoreTokens();
        }

        public String nextToken()
        {
            String s;
            if (_pushbackToken != null)
            {
                s = _pushbackToken;
                _pushbackToken = null;
            } else
            {
                s = super.nextToken();
            }
            _index = _index + s.length();
            return s;
        }

        public void pushBack(String s)
        {
            _pushbackToken = s;
            _index = _index - s.length();
        }

        public MyTokenizer(String s)
        {
            super(s, "<,>", true);
            _input = s;
        }
    }


    protected final TypeFactory _factory;

    public TypeParser(TypeFactory typefactory)
    {
        _factory = typefactory;
    }

    protected IllegalArgumentException _problem(MyTokenizer mytokenizer, String s)
    {
        return new IllegalArgumentException((new StringBuilder()).append("Failed to parse type '").append(mytokenizer.getAllInput()).append("' (remaining: '").append(mytokenizer.getRemainingInput()).append("'): ").append(s).toString());
    }

    protected Class findClass(String s, MyTokenizer mytokenizer)
    {
        Class class1;
        try
        {
            class1 = ClassUtil.findClass(s);
        }
        catch (Exception exception)
        {
            if (exception instanceof RuntimeException)
            {
                throw (RuntimeException)exception;
            } else
            {
                throw _problem(mytokenizer, (new StringBuilder()).append("Can not locate class '").append(s).append("', problem: ").append(exception.getMessage()).toString());
            }
        }
        return class1;
    }

    public JavaType parse(String s)
        throws IllegalArgumentException
    {
        s = new MyTokenizer(s.trim());
        JavaType javatype = parseType(s);
        if (s.hasMoreTokens())
        {
            throw _problem(s, "Unexpected tokens after complete type");
        } else
        {
            return javatype;
        }
    }

    protected JavaType parseType(MyTokenizer mytokenizer)
        throws IllegalArgumentException
    {
        if (!mytokenizer.hasMoreTokens())
        {
            throw _problem(mytokenizer, "Unexpected end-of-string");
        }
        Class class1 = findClass(mytokenizer.nextToken(), mytokenizer);
        if (mytokenizer.hasMoreTokens())
        {
            String s = mytokenizer.nextToken();
            if ("<".equals(s))
            {
                return _factory._fromParameterizedClass(class1, parseTypes(mytokenizer));
            }
            mytokenizer.pushBack(s);
        }
        return _factory._fromClass(class1, null);
    }

    protected List parseTypes(MyTokenizer mytokenizer)
        throws IllegalArgumentException
    {
        ArrayList arraylist = new ArrayList();
        do
        {
label0:
            {
                if (mytokenizer.hasMoreTokens())
                {
                    arraylist.add(parseType(mytokenizer));
                    if (mytokenizer.hasMoreTokens())
                    {
                        break label0;
                    }
                }
                throw _problem(mytokenizer, "Unexpected end-of-string");
            }
            String s = mytokenizer.nextToken();
            if (">".equals(s))
            {
                return arraylist;
            }
            if (!",".equals(s))
            {
                throw _problem(mytokenizer, (new StringBuilder()).append("Unexpected token '").append(s).append("', expected ',' or '>')").toString());
            }
        } while (true);
    }
}
