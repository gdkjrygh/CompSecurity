// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.ElementList;
import java.lang.reflect.Constructor;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            ParameterContact, ElementListParameter

private static class  extends ParameterContact
{

    public String getName()
    {
        return ((ElementList)label).name();
    }

    public (ElementList elementlist, Constructor constructor, int i)
    {
        super(elementlist, constructor, i);
    }
}
