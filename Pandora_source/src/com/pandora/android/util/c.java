// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.app.Application;
import com.pandora.android.activity.GlobalBroadcastReceiver;
import com.pandora.android.provider.b;
import com.pandora.radio.data.MusicSearchData;
import com.pandora.radio.data.SearchDescriptor;
import com.pandora.radio.util.j;
import p.dd.ak;
import p.df.a;

public class c
    implements j
{

    private String a;
    private String b;
    private Integer c;

    public c(String s, String s1, Integer integer)
    {
        if (s == null)
        {
            p.df.a.c("AddSeedFromSearchResult", "stationToken is null");
        }
        c = integer;
        a = s;
        b = s1;
    }

    public CharSequence a()
    {
        return (new StringBuilder()).append(b.a.h().getString(0x7f080078)).append("\n").append(b).toString();
    }

    public void a(MusicSearchData musicsearchdata, String s, p.cw.c c1)
    {
        GlobalBroadcastReceiver.a().onSearchResults(new ak(c, musicsearchdata, s, this, true));
    }

    public void a(String s)
    {
    }

    public void a(String s, String s1, p.cw.c c1, p.cx.x.e e, SearchDescriptor searchdescriptor)
    {
        (new p.cm.b()).execute(new Object[] {
            a, s, s1
        });
    }
}
