// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dd;

import com.pandora.radio.data.MusicSearchData;
import com.pandora.radio.util.j;

public class ak
{

    public final int a;
    public final MusicSearchData b;
    public final String c;
    public final j d;
    public final boolean e;

    public ak(Integer integer, MusicSearchData musicsearchdata, String s, j j, boolean flag)
    {
        b = musicsearchdata;
        int i;
        if (integer == null)
        {
            i = -1;
        } else
        {
            i = integer.intValue();
        }
        a = i;
        c = s;
        d = j;
        e = flag;
    }
}
