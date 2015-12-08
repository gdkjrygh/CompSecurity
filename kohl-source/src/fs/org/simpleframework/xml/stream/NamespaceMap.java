// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import java.util.Iterator;

public interface NamespaceMap
    extends Iterable
{

    public abstract String getPrefix(String s);

    public abstract String getReference(String s);

    public abstract Iterator iterator();

    public abstract String setReference(String s, String s1);
}
