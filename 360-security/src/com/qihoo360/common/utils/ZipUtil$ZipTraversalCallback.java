// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

// Referenced classes of package com.qihoo360.common.utils:
//            ZipUtil

public static interface 
{

    public abstract boolean onProgress(ZipFile zipfile, ZipEntry zipentry)
        throws IOException;
}
