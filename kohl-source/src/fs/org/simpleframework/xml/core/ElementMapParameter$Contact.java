// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.ElementMap;
import java.lang.reflect.Constructor;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            ParameterContact, ElementMapParameter

private static class A extends ParameterContact
{

    public String getName()
    {
        return ((ElementMap)label).name();
    }

    public A(ElementMap elementmap, Constructor constructor, int i)
    {
        super(elementmap, constructor, i);
    }
}
