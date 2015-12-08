// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;

import java.io.File;

// Referenced classes of package com.google.android.gms.games.provider:
//            ImageStore

public static final class path
{

    public final long id;
    public final String path;
    public final long size;

    public (File file)
    {
        id = Long.parseLong(file.getName());
        size = file.length();
        path = file.getAbsolutePath();
    }
}
