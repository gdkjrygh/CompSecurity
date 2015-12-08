// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.transform;


public interface Transform
{

    public abstract Object read(String s)
        throws Exception;

    public abstract String write(Object obj)
        throws Exception;
}
