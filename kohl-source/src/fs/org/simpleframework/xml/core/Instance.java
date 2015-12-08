// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;


interface Instance
{

    public abstract Object getInstance()
        throws Exception;

    public abstract Class getType();

    public abstract boolean isReference();

    public abstract Object setInstance(Object obj)
        throws Exception;
}
