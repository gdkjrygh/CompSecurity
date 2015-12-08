// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.strategy;

import fs.org.simpleframework.xml.stream.NodeMap;
import java.util.Map;

// Referenced classes of package fs.org.simpleframework.xml.strategy:
//            Type, Value

public interface Strategy
{

    public abstract Value read(Type type, NodeMap nodemap, Map map)
        throws Exception;

    public abstract boolean write(Type type, Object obj, NodeMap nodemap, Map map)
        throws Exception;
}
