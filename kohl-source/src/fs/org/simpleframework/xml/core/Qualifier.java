// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Namespace;
import fs.org.simpleframework.xml.NamespaceList;
import fs.org.simpleframework.xml.stream.OutputNode;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Decorator, NamespaceDecorator, Contact

class Qualifier
    implements Decorator
{

    private NamespaceDecorator decorator;

    public Qualifier(Contact contact)
    {
        decorator = new NamespaceDecorator();
        scan(contact);
    }

    private void namespace(Contact contact)
    {
        contact = (Namespace)contact.getAnnotation(fs/org/simpleframework/xml/Namespace);
        if (contact != null)
        {
            decorator.set(contact);
            decorator.add(contact);
        }
    }

    private void scan(Contact contact)
    {
        namespace(contact);
        scope(contact);
    }

    private void scope(Contact contact)
    {
        contact = (NamespaceList)contact.getAnnotation(fs/org/simpleframework/xml/NamespaceList);
        if (contact != null)
        {
            contact = contact.value();
            int j = contact.length;
            for (int i = 0; i < j; i++)
            {
                Namespace namespace1 = contact[i];
                decorator.add(namespace1);
            }

        }
    }

    public void decorate(OutputNode outputnode)
    {
        decorator.decorate(outputnode);
    }

    public void decorate(OutputNode outputnode, Decorator decorator1)
    {
        decorator.decorate(outputnode, decorator1);
    }
}
