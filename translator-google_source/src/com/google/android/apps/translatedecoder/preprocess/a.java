// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.preprocess;

import com.google.android.apps.translatedecoder.util.StringSet;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.apps.translatedecoder.preprocess:
//            b

final class a
{

    public static final Pattern a = Pattern.compile("^\\p{Punct}$");
    public static final Pattern b = Pattern.compile("^\\p{Space}$");
    static StringSet c = null;
    private static final Logger d = Logger.getLogger("translate");
    private static final List e;

    public a()
    {
    }

    public static void a(String s)
    {
        c = c(s);
    }

    static boolean b(String s)
    {
        return !com.google.android.apps.translatedecoder.preprocess.b.a(s, e).isEmpty();
    }

    private static StringSet c(String s)
    {
        try
        {
            s = (new RandomAccessFile(s, "r")).getChannel();
            s = StringSet.readFromByteBuffer(s.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, (int)s.size()));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    static 
    {
        e = new ArrayList();
        e.add("ko");
    }
}
