// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;


interface Attribute
{

    public abstract String getName();

    public abstract String getPrefix();

    public abstract String getReference();

    public abstract Object getSource();

    public abstract String getValue();

    public abstract boolean isReserved();
}
