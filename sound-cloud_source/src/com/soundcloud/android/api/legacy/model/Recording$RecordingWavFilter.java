// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            Recording

public static class toIgnore
    implements FilenameFilter
{

    private final Recording toIgnore;

    public boolean accept(File file, String s)
    {
        return Recording.isRawFilename(s) && (toIgnore == null || !toIgnore.audio_path.getName().equals(s));
    }

    public (Recording recording)
    {
        toIgnore = recording;
    }
}
