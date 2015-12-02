// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash.mpd;

import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.util.Arrays;
import java.util.UUID;

public class ContentProtection
{

    public final String a;
    public final UUID b;
    public final byte c[];

    public ContentProtection(String s, UUID uuid, byte abyte0[])
    {
        a = (String)Assertions.a(s);
        b = uuid;
        c = abyte0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ContentProtection)
        {
            if (obj == this)
            {
                return true;
            }
            obj = (ContentProtection)obj;
            if (a.equals(((ContentProtection) (obj)).a) && Util.a(b, ((ContentProtection) (obj)).b) && Arrays.equals(c, ((ContentProtection) (obj)).c))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        int j = a.hashCode() + 37;
        int i = j;
        if (b != null)
        {
            i = j * 37 + b.hashCode();
        }
        j = i;
        if (c != null)
        {
            j = i * 37 + Arrays.hashCode(c);
        }
        return j;
    }
}
