// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;


// Referenced classes of package fs.org.simpleframework.xml.core:
//            Variable, Label

interface Criteria
    extends Iterable
{

    public abstract void commit(Object obj)
        throws Exception;

    public abstract Variable get(String s);

    public abstract Variable remove(String s)
        throws Exception;

    public abstract Variable resolve(String s);

    public abstract void set(Label label, Object obj)
        throws Exception;
}
