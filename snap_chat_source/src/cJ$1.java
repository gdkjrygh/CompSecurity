// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileFilter;

static final class >
    implements FileFilter
{

    public final boolean accept(File file)
    {
        file = file.getName();
        if (file.startsWith("cpu"))
        {
            for (int i = 3; i < file.length(); i++)
            {
                if (file.charAt(i) < '0' || file.charAt(i) > '9')
                {
                    return false;
                }
            }

            return true;
        } else
        {
            return false;
        }
    }

    >()
    {
    }
}
