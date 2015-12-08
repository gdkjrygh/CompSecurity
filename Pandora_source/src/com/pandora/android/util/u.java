// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Intent;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.radio.data.MusicSearchData;
import com.pandora.radio.data.SearchDescriptor;
import com.pandora.radio.util.j;
import java.util.UUID;
import p.cw.c;

public class u
    implements j
{

    private UUID a;

    public u(UUID uuid)
    {
        a = uuid;
    }

    public CharSequence a()
    {
        return null;
    }

    public void a(MusicSearchData musicsearchdata, String s, c c)
    {
        s = new PandoraIntent("action_populate_search_results");
        s.putExtra("intent_search_results", musicsearchdata);
        s.putExtra("intent_task_id", a);
        b.a.C().a(s);
    }

    public void a(String s)
    {
    }

    public void a(String s, String s1, c c, p.cx.x.e e, SearchDescriptor searchdescriptor)
    {
    }
}
