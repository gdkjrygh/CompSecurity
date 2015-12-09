// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class alz
    implements FilenameFilter
{

    private alz()
    {
    }

    alz(byte byte0)
    {
        this();
    }

    public final boolean accept(File file, String s)
    {
        return !aly.a.accept(file, s) && aly.a().matcher(s).matches();
    }
}
