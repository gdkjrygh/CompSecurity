// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml;

import java.io.OutputStream;

public interface Serializer
{

    public abstract Object read(Class class1, String s)
        throws Exception;

    public abstract void write(Object obj, OutputStream outputstream)
        throws Exception;
}
