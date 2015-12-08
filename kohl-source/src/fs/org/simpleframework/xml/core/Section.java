// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;


// Referenced classes of package fs.org.simpleframework.xml.core:
//            LabelMap, Label

interface Section
    extends Iterable
{

    public abstract String getAttribute(String s)
        throws Exception;

    public abstract LabelMap getAttributes()
        throws Exception;

    public abstract Label getElement(String s)
        throws Exception;

    public abstract LabelMap getElements()
        throws Exception;

    public abstract String getPath(String s)
        throws Exception;

    public abstract String getPrefix();

    public abstract Section getSection(String s)
        throws Exception;

    public abstract Label getText()
        throws Exception;
}
