// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Version;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Schema, Scanner, Caller, Decorator, 
//            Creator, Section, Label, Context

class ClassSchema
    implements Schema
{

    private final Caller caller;
    private final Decorator decorator;
    private final Creator factory;
    private final boolean primitive;
    private final Version revision;
    private final Section section;
    private final Label text;
    private final Class type;
    private final Label version;

    public ClassSchema(Scanner scanner, Context context)
        throws Exception
    {
        section = scanner.getSection(context);
        caller = scanner.getCaller(context);
        factory = scanner.getCreator();
        revision = scanner.getRevision();
        decorator = scanner.getDecorator();
        primitive = scanner.isPrimitive();
        version = scanner.getVersion();
        text = scanner.getText();
        type = scanner.getType();
    }

    public Caller getCaller()
    {
        return caller;
    }

    public Creator getCreator()
    {
        return factory;
    }

    public Version getRevision()
    {
        return revision;
    }

    public Section getSection()
    {
        return section;
    }

    public Label getVersion()
    {
        return version;
    }

    public boolean isPrimitive()
    {
        return primitive;
    }

    public String toString()
    {
        return String.format("schema for %s", new Object[] {
            type
        });
    }
}
