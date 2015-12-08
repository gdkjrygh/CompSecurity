// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            Recording

public static class 
    implements FilenameFilter
{

    public boolean accept(File file, String s)
    {
        return Recording.isRawFilename(s) || Recording.isEncodedFilename(s) || Recording.isAmplitudeFile(s);
    }

    public ()
    {
    }
}
