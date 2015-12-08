// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.os.Bundle;
import android.support.v4.app.CustomFragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.o;
import com.cardinalblue.android.piccollage.model.NoInternetBundle;
import com.cardinalblue.android.piccollage.model.StickerBundle;
import com.cardinalblue.android.piccollage.view.fragments.g;
import java.util.Iterator;
import java.util.List;

public class v extends CustomFragmentStatePagerAdapter
{

    private static StickerBundle c;
    private final Object a = new Object();
    private boolean b;

    public v(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
        b = true;
        b = k.b(k.a());
        c = new NoInternetBundle();
    }

    private List a()
    {
        return o.a().a(b);
    }

    public int a(String s, int i)
    {
label0:
        {
            synchronized (a)
            {
                Iterator iterator = a().iterator();
                StickerBundle stickerbundle;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    stickerbundle = (StickerBundle)iterator.next();
                } while (!stickerbundle.f().equalsIgnoreCase(s));
                i = a().indexOf(stickerbundle);
            }
            return i;
        }
        obj;
        JVM INSTR monitorexit ;
        return i;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (b != flag)
        {
            b = flag;
            notifyDataSetChanged();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int getCount()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        int i;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        i = a().size();
_L2:
        return i;
        i = a().size() + 1;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Fragment getItem(int i)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        StickerBundle stickerbundle;
        if (i < a().size())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        stickerbundle = c;
_L1:
        g g1;
        g1 = o.c(stickerbundle);
        Bundle bundle = new Bundle();
        bundle.putParcelable("sticker_bundle", stickerbundle);
        g1.setArguments(bundle);
        return g1;
        stickerbundle = (StickerBundle)a().get(i);
          goto _L1
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int getItemPosition(Object obj)
    {
        return -2;
    }

    public String getItemTag(int i)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (a().size() > i) goto _L2; else goto _L1
_L1:
        String s = "no_internet_bundle";
_L4:
        obj;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = ((StickerBundle)a().get(i)).f();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
