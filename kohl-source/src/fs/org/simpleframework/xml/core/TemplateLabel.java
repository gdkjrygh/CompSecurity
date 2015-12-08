// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Label, Context

abstract class TemplateLabel
    implements Label
{

    protected TemplateLabel()
    {
    }

    public Type getDependent()
        throws Exception
    {
        return null;
    }

    public String getEntry()
        throws Exception
    {
        return null;
    }

    public Label getLabel(Class class1)
    {
        return this;
    }

    public Collection getNames()
        throws Exception
    {
        return Arrays.asList(new String[] {
            getPath(), getName()
        });
    }

    public Collection getNames(Context context)
        throws Exception
    {
        return Arrays.asList(new String[] {
            getPath(context), getName(context)
        });
    }

    public Collection getPaths()
        throws Exception
    {
        return Collections.singleton(getPath());
    }

    public Collection getPaths(Context context)
        throws Exception
    {
        return Collections.singleton(getPath(context));
    }

    public Type getType(Class class1)
    {
        return getContact();
    }

    public boolean isAttribute()
    {
        return false;
    }

    public boolean isCollection()
    {
        return false;
    }

    public boolean isInline()
    {
        return false;
    }

    public boolean isText()
    {
        return false;
    }

    public boolean isUnion()
    {
        return false;
    }
}
