// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.stream.Style;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Parameter, Context, Expression

abstract class TemplateParameter
    implements Parameter
{

    protected TemplateParameter()
    {
    }

    public String getName(Context context)
    {
        return context.getStyle().getElement(getName());
    }

    public String getPath(Context context)
    {
        return getExpression().getElement(getName(context));
    }

    public boolean isAttribute()
    {
        return false;
    }

    public boolean isText()
    {
        return false;
    }
}
