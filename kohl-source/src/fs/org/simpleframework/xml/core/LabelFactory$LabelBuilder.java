// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.lang.reflect.Constructor;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            LabelFactory, Contact

private static class type
{

    public Class entry;
    public Class label;
    public Class type;

    private Constructor getConstructor(Class class1)
        throws Exception
    {
        return type.getConstructor(new Class[] {
            fs/org/simpleframework/xml/core/Contact, class1
        });
    }

    private Constructor getConstructor(Class class1, Class class2)
        throws Exception
    {
        return type.getConstructor(new Class[] {
            fs/org/simpleframework/xml/core/Contact, class1, class2
        });
    }

    public Constructor getConstructor()
        throws Exception
    {
        if (entry != null)
        {
            return getConstructor(label, entry);
        } else
        {
            return getConstructor(label);
        }
    }

    public (Class class1, Class class2)
    {
        this(class1, class2, null);
    }

    public <init>(Class class1, Class class2, Class class3)
    {
        entry = class3;
        label = class2;
        type = class1;
    }
}
