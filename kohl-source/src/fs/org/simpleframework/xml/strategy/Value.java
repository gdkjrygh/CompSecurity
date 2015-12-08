// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.strategy;


public interface Value
{

    public abstract int getLength();

    public abstract Class getType();

    public abstract Object getValue();

    public abstract boolean isReference();

    public abstract void setValue(Object obj);
}
