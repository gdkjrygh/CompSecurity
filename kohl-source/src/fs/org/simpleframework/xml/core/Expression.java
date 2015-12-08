// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;


interface Expression
    extends Iterable
{

    public abstract String getAttribute(String s);

    public abstract String getElement(String s);

    public abstract String getFirst();

    public abstract int getIndex();

    public abstract String getLast();

    public abstract Expression getPath(int i);

    public abstract Expression getPath(int i, int j);

    public abstract String getPath();

    public abstract String getPrefix();

    public abstract boolean isAttribute();

    public abstract boolean isEmpty();

    public abstract boolean isPath();
}
