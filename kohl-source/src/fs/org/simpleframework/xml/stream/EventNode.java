// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;


interface EventNode
    extends Iterable
{

    public abstract int getLine();

    public abstract String getName();

    public abstract String getValue();

    public abstract boolean isEnd();

    public abstract boolean isStart();

    public abstract boolean isText();
}
