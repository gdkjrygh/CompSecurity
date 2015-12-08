// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.a;

import java.io.File;
import java.io.FileFilter;

// Referenced classes of package android.support.a:
//            b

static final class >
    implements FileFilter
{

    final String a;

    public final boolean accept(File file)
    {
        return !file.getName().startsWith(a);
    }

    (String s)
    {
        a = s;
        super();
    }
}
