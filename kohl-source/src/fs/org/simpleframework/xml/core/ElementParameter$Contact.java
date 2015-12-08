// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Element;
import java.lang.reflect.Constructor;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            ParameterContact, ElementParameter

private static class  extends ParameterContact
{

    public String getName()
    {
        return ((Element)label).name();
    }

    public (Element element, Constructor constructor, int i)
    {
        super(element, constructor, i);
    }
}
