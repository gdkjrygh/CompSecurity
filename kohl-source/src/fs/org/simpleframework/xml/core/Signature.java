// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Parameter, Context

class Signature extends LinkedHashMap
{

    private final Class type;

    public Signature(Class class1)
    {
        type = class1;
    }

    public Parameter getParameter(String s)
    {
        return (Parameter)get(s);
    }

    public List getParameters()
    {
        return new ArrayList(values());
    }

    public Signature getSignature(Context context)
        throws Exception
    {
        Signature signature = new Signature(type);
        Parameter parameter;
        for (Iterator iterator = values().iterator(); iterator.hasNext(); signature.put(parameter.getPath(context), parameter))
        {
            parameter = (Parameter)iterator.next();
        }

        return signature;
    }

    public Class getType()
    {
        return type;
    }
}
