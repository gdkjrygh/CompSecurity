// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import java.util.List;
import java.util.zip.ZipFile;
import junit.framework.Assert;

// Referenced classes of package com.aviary.android.feather.cds:
//            b

static class  extends 
{

    boolean a(String s, List list)
        throws AssertionError
    {
        while (!list.contains((new StringBuilder()).append(s).append("-small.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-medium.png").toString())) 
        {
            return false;
        }
        return list.contains((new StringBuilder()).append(s).append("-large.png").toString());
    }

    boolean a(String s, ZipFile zipfile)
        throws AssertionError
    {
        Assert.assertNotNull("identifier is null", s);
        Assert.assertNotNull("zip is null", zipfile);
        java.util.zip.ZipEntry zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-small.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-small.png").toString(), zipentry);
        zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-medium.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-medium.png").toString(), zipentry);
        zipfile = zipfile.getEntry((new StringBuilder()).append(s).append("-large.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-large.png").toString(), zipfile);
        return true;
    }

    ()
    {
    }
}
