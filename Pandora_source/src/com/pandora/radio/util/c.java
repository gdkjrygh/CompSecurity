// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import com.pandora.radio.data.MusicSearchData;
import com.pandora.radio.data.SearchDescriptor;
import p.dd.ak;

// Referenced classes of package com.pandora.radio.util:
//            j

public class c
    implements j
{

    private String a;
    private final Integer b;

    public c(Integer integer)
    {
        b = integer;
    }

    public CharSequence a()
    {
        return "New Station";
    }

    public void a(MusicSearchData musicsearchdata, String s, p.cw.c c1)
    {
        c1.a(new ak(b, musicsearchdata, s, this, false));
    }

    public void a(String s)
    {
        a = s;
    }

    public void a(String s, String s1, p.cw.c c1, p.cx.x.e e, SearchDescriptor searchdescriptor)
    {
        (new p.di.c(c1, s1, a, false, e, searchdescriptor, null)).execute(new Object[0]);
    }
}
