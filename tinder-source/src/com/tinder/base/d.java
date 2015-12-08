// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.base;

import android.support.v4.app.Fragment;
import java.util.LinkedList;
import java.util.Queue;

public class d extends Fragment
{

    public boolean a;
    public Queue b;

    public d()
    {
        a = false;
        b = new LinkedList();
        (new StringBuilder("FragmentBase created as ")).append(getClass().toString());
    }

    public void onPause()
    {
        super.onPause();
        a = false;
    }

    public void onResume()
    {
        super.onResume();
        a = true;
        for (; b.size() > 0; ((Runnable)b.poll()).run()) { }
    }
}
