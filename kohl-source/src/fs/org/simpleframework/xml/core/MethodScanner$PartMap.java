// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            MethodScanner, MethodPart

private class <init> extends LinkedHashMap
    implements Iterable
{

    final MethodScanner this$0;

    public Iterator iterator()
    {
        return keySet().iterator();
    }

    public MethodPart take(String s)
    {
        return (MethodPart)remove(s);
    }

    private ()
    {
        this$0 = MethodScanner.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
