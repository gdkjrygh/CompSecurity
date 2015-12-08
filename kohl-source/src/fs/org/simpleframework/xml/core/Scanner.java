// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Default;
import fs.org.simpleframework.xml.DefaultType;
import fs.org.simpleframework.xml.Order;
import fs.org.simpleframework.xml.Root;
import fs.org.simpleframework.xml.Version;
import java.util.Iterator;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Policy, ClassScanner, StructureBuilder, FieldScanner, 
//            ContactList, Contact, Reflector, Caller, 
//            Structure, MethodScanner, Context, Function, 
//            Creator, Decorator, Section, Label

class Scanner
    implements Policy
{

    private DefaultType access;
    private StructureBuilder builder;
    private String name;
    private boolean required;
    private ClassScanner scanner;
    private Structure structure;
    private Class type;

    public Scanner(Class class1)
        throws Exception
    {
        scanner = new ClassScanner(class1);
        builder = new StructureBuilder(this, class1);
        type = class1;
        scan(class1);
    }

    private void access(Class class1)
    {
        class1 = scanner.getDefault();
        if (class1 != null)
        {
            required = class1.required();
            access = class1.value();
        }
    }

    private void commit(Class class1)
        throws Exception
    {
        if (structure == null)
        {
            structure = builder.build(class1);
        }
        builder = null;
    }

    private void field(Class class1)
        throws Exception
    {
        class1 = (new FieldScanner(class1, access, required)).iterator();
        do
        {
            if (!class1.hasNext())
            {
                break;
            }
            Contact contact = (Contact)class1.next();
            java.lang.annotation.Annotation annotation = contact.getAnnotation();
            if (annotation != null)
            {
                builder.process(contact, annotation);
            }
        } while (true);
    }

    private boolean isEmpty(String s)
    {
        return s.length() == 0;
    }

    private void order(Class class1)
        throws Exception
    {
        builder.assemble(class1);
    }

    private void root(Class class1)
    {
        String s1 = class1.getSimpleName();
        class1 = scanner.getRoot();
        if (class1 != null)
        {
            String s = class1.name();
            class1 = s;
            if (isEmpty(s))
            {
                class1 = Reflector.getName(s1);
            }
            name = class1.intern();
        }
    }

    private void scan(Class class1)
        throws Exception
    {
        root(class1);
        order(class1);
        access(class1);
        field(class1);
        method(class1);
        validate(class1);
        commit(class1);
    }

    private void validate(Class class1)
        throws Exception
    {
        builder.validate(class1);
    }

    public Caller getCaller(Context context)
    {
        return new Caller(this, context);
    }

    public Function getCommit()
    {
        return scanner.getCommit();
    }

    public Function getComplete()
    {
        return scanner.getComplete();
    }

    public Creator getCreator()
    {
        return scanner.getCreator();
    }

    public Decorator getDecorator()
    {
        return scanner.getDecorator();
    }

    public String getName()
    {
        return name;
    }

    public Order getOrder()
    {
        return scanner.getOrder();
    }

    public Function getPersist()
    {
        return scanner.getPersist();
    }

    public Function getReplace()
    {
        return scanner.getReplace();
    }

    public Function getResolve()
    {
        return scanner.getResolve();
    }

    public Version getRevision()
    {
        return structure.getRevision();
    }

    public Section getSection(Context context)
    {
        return structure.getSection(context);
    }

    public Label getText()
    {
        return structure.getText();
    }

    public Class getType()
    {
        return type;
    }

    public Function getValidate()
    {
        return scanner.getValidate();
    }

    public Label getVersion()
    {
        return structure.getVersion();
    }

    public boolean isEmpty()
    {
        return scanner.getRoot() == null;
    }

    public boolean isPrimitive()
    {
        return structure.isPrimitive();
    }

    public boolean isStrict()
    {
        return scanner.isStrict();
    }

    public void method(Class class1)
        throws Exception
    {
        class1 = (new MethodScanner(class1, access, required)).iterator();
        do
        {
            if (!class1.hasNext())
            {
                break;
            }
            Contact contact = (Contact)class1.next();
            java.lang.annotation.Annotation annotation = contact.getAnnotation();
            if (annotation != null)
            {
                builder.process(contact, annotation);
            }
        } while (true);
    }
}
