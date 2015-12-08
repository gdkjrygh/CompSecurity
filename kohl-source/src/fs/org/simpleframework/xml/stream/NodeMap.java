// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;

import java.util.Iterator;

// Referenced classes of package fs.org.simpleframework.xml.stream:
//            Node

public interface NodeMap
    extends Iterable
{

    public abstract Node get(String s);

    public abstract Iterator iterator();

    public abstract Node put(String s, String s1);

    public abstract Node remove(String s);
}
