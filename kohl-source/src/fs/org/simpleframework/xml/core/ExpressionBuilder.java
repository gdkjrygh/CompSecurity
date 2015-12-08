// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Type;
import java.util.HashMap;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            ClassType, PathParser, Expression

class ExpressionBuilder
{
    private class Cache extends HashMap
    {

        final ExpressionBuilder this$0;

        public Cache()
        {
            this$0 = ExpressionBuilder.this;
            super();
        }
    }


    private final Cache cache;
    private final Type type;

    public ExpressionBuilder(Type type1)
    {
        cache = new Cache();
        type = type1;
    }

    public ExpressionBuilder(Class class1)
    {
        this(((Type) (new ClassType(class1))));
    }

    private Expression create(String s)
        throws Exception
    {
        PathParser pathparser = new PathParser(type, s);
        if (cache != null)
        {
            cache.put(s, pathparser);
        }
        return pathparser;
    }

    public Expression build(String s)
        throws Exception
    {
        Expression expression1 = (Expression)cache.get(s);
        Expression expression = expression1;
        if (expression1 == null)
        {
            expression = create(s);
        }
        return expression;
    }
}
