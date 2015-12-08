// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.widget.ListView;

final class bv
    implements Runnable
{

    final ListView a;
    final int b;

    bv(ListView listview, int i)
    {
        a = listview;
        b = i;
        super();
    }

    public final void run()
    {
        a.setTranscriptMode(b);
    }
}
