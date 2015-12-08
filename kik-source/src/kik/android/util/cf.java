// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package kik.android.util:
//            ce

final class cf
    implements FilenameFilter
{

    final ce a;

    cf(ce ce1)
    {
        a = ce1;
        super();
    }

    public final boolean accept(File file, String s)
    {
        return s != null && s.startsWith(ce.a(a));
    }
}
