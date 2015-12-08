// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Version;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Label, Contact, ModelSection, Model, 
//            Context, Section

class Structure
{

    private final Model model;
    private final boolean primitive;
    private final Label text;
    private final Label version;

    public Structure(Model model1, Label label, Label label1, boolean flag)
    {
        primitive = flag;
        version = label;
        model = model1;
        text = label1;
    }

    public Version getRevision()
    {
        if (version != null)
        {
            return (Version)version.getContact().getAnnotation(fs/org/simpleframework/xml/Version);
        } else
        {
            return null;
        }
    }

    public Section getSection(Context context)
    {
        return new ModelSection(context, model);
    }

    public Label getText()
    {
        return text;
    }

    public Label getVersion()
    {
        return version;
    }

    public boolean isPrimitive()
    {
        return primitive;
    }
}
