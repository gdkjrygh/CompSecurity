// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.response;

import java.util.Comparator;

// Referenced classes of package com.auditude.ads.response:
//            VmapXmlNode

public static class A
    implements Comparator
{

    public int compare(VmapXmlNode vmapxmlnode, VmapXmlNode vmapxmlnode1)
    {
        return vmapxmlnode.index - vmapxmlnode1.index;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((VmapXmlNode)obj, (VmapXmlNode)obj1);
    }

    public A()
    {
    }
}
