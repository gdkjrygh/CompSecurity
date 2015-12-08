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
        while (!list.contains((new StringBuilder()).append(s).append("-small.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-br-medium.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-r-medium.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-tr-medium.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-t-medium.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-tl-medium.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-l-medium.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-b-medium.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-bl-medium.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-br-medium.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-br-large.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-r-large.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-tr-large.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-t-large.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-tl-large.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-l-large.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-b-large.png").toString()) || !list.contains((new StringBuilder()).append(s).append("-bl-large.png").toString())) 
        {
            return false;
        }
        return list.contains((new StringBuilder()).append(s).append("-br-large.png").toString());
    }

    boolean a(String s, ZipFile zipfile)
    {
        Assert.assertNotNull("identifier is null", s);
        Assert.assertNotNull("zip is null", zipfile);
        java.util.zip.ZipEntry zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-small.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-small.png").toString(), zipentry);
        zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-br-medium.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-br-medium.png").toString(), zipentry);
        zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-r-medium.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-r-medium.png").toString(), zipentry);
        zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-tr-medium.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-tr-medium.png").toString(), zipentry);
        zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-t-medium.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-t-medium.png").toString(), zipentry);
        zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-tl-medium.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-tl-medium.png").toString(), zipentry);
        zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-l-medium.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-l-medium.png").toString(), zipentry);
        zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-b-medium.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-b-medium.png").toString(), zipentry);
        zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-bl-medium.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-bl-medium.png").toString(), zipentry);
        zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-br-medium.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-br-medium.png").toString(), zipentry);
        zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-br-large.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-br-large.png").toString(), zipentry);
        zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-r-large.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-r-large.png").toString(), zipentry);
        zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-tr-large.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-tr-large.png").toString(), zipentry);
        zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-t-large.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-t-large.png").toString(), zipentry);
        zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-tl-large.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-tl-large.png").toString(), zipentry);
        zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-l-large.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-l-large.png").toString(), zipentry);
        zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-b-large.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-b-large.png").toString(), zipentry);
        zipentry = zipfile.getEntry((new StringBuilder()).append(s).append("-bl-large.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-bl-large.png").toString(), zipentry);
        zipfile = zipfile.getEntry((new StringBuilder()).append(s).append("-br-large.png").toString());
        Assert.assertNotNull((new StringBuilder()).append(s).append("-br-large.png").toString(), zipfile);
        return true;
    }

    ()
    {
    }
}
