// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import com.cardinalblue.android.piccollage.activities.StickersActivity;
import com.cardinalblue.android.piccollage.model.gson.Sticker;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            g

public class t extends g
{
    public static interface a
    {

        public abstract void a(Sticker sticker);

        public abstract boolean b(Sticker sticker);
    }


    private a d;

    public t()
    {
    }

    public void a(Sticker sticker, Checkable checkable)
    {
        boolean flag = true;
        if (!checkable.isChecked()) goto _L2; else goto _L1
_L1:
        d.a(sticker);
_L4:
        if (flag)
        {
            checkable.toggle();
        }
        return;
_L2:
        if (!d.b(sticker))
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        d = (StickersActivity)activity;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300be, viewgroup, false);
        a(layoutinflater, false);
        return layoutinflater;
    }

    public void onDetach()
    {
        super.onDetach();
        d = null;
    }
}
