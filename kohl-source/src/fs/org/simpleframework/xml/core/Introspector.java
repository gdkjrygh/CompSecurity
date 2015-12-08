// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Path;
import fs.org.simpleframework.xml.Root;
import fs.org.simpleframework.xml.strategy.Type;
import java.lang.annotation.Annotation;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Contact, Label, Reflector, PathParser, 
//            Expression

class Introspector
{

    private Contact contact;
    private Label label;
    private Annotation marker;

    public Introspector(Contact contact1, Label label1)
    {
        marker = contact1.getAnnotation();
        contact = contact1;
        label = label1;
    }

    private String getDefault()
        throws Exception
    {
        String s = label.getOverride();
        if (!isEmpty(s))
        {
            return s;
        } else
        {
            return contact.getName();
        }
    }

    private String getName(Class class1)
        throws Exception
    {
        String s = getRoot(class1);
        if (s != null)
        {
            return s;
        } else
        {
            return Reflector.getName(class1.getSimpleName());
        }
    }

    private String getRoot(Class class1)
    {
        for (Class class2 = class1; class2 != null; class2 = class2.getSuperclass())
        {
            String s = getRoot(class1, class2);
            if (s != null)
            {
                return s;
            }
        }

        return null;
    }

    private String getRoot(Class class1, Class class2)
    {
        class1 = class2.getSimpleName();
        if (class2.isAnnotationPresent(fs/org/simpleframework/xml/Root))
        {
            class2 = ((Root)class2.getAnnotation(fs/org/simpleframework/xml/Root)).name();
            if (!isEmpty(class2))
            {
                return class2;
            } else
            {
                return Reflector.getName(class1);
            }
        } else
        {
            return null;
        }
    }

    public Contact getContact()
    {
        return contact;
    }

    public Type getDependent()
        throws Exception
    {
        return label.getDependent();
    }

    public String getEntry()
        throws Exception
    {
        Class class1 = getDependent().getType();
        Object obj = class1;
        if (class1.isArray())
        {
            obj = class1.getComponentType();
        }
        obj = getName(((Class) (obj)));
        if (obj == null)
        {
            return null;
        } else
        {
            return ((String) (obj)).intern();
        }
    }

    public Expression getExpression()
        throws Exception
    {
        String s = getPath();
        if (s != null)
        {
            return new PathParser(contact, s);
        } else
        {
            return new PathParser(contact, ".");
        }
    }

    public String getName()
        throws Exception
    {
        String s = label.getEntry();
        if (!label.isInline())
        {
            s = getDefault();
        }
        return s.intern();
    }

    public String getPath()
        throws Exception
    {
        Path path = (Path)contact.getAnnotation(fs/org/simpleframework/xml/Path);
        if (path == null)
        {
            return null;
        } else
        {
            return path.value();
        }
    }

    public boolean isEmpty(String s)
    {
        return s == null || s.length() == 0;
    }

    public String toString()
    {
        return String.format("%s on %s", new Object[] {
            marker, contact
        });
    }
}
