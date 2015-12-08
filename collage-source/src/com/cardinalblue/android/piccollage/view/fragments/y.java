// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import com.androidquery.a;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.activities.IabBackgroundActivity;
import com.cardinalblue.android.piccollage.model.StickerBundle;
import com.cardinalblue.android.piccollage.model.gson.Sticker;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            g

public class y extends g
{

    private TextView d;

    public y()
    {
    }

    static void a(y y1)
    {
        y1.b();
    }

    private void b()
    {
        com.cardinalblue.android.piccollage.a.b.aJ(a.f());
        if (a())
        {
            return;
        } else
        {
            c();
            return;
        }
    }

    private void c()
    {
        IabBackgroundActivity iabbackgroundactivity = (IabBackgroundActivity)getActivity();
        if (iabbackgroundactivity != null)
        {
            iabbackgroundactivity.a(a);
        }
    }

    protected void a(Sticker sticker, Checkable checkable)
    {
        a(new android.content.DialogInterface.OnClickListener() {

            final y a;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                com.cardinalblue.android.piccollage.view.fragments.y.a(a);
            }

            
            {
                a = y.this;
                super();
            }
        });
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        switch (i)
        {
        default:
            super.onActivityResult(i, j, intent);
            return;

        case 201: 
            c();
            break;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300c3, viewgroup, false);
        viewgroup = new a(layoutinflater);
        a(layoutinflater, true);
        ((a)viewgroup.a(0x7f1001de)).a(b);
        if (TextUtils.isEmpty(a.c()))
        {
            ((a)viewgroup.a(0x7f1001df)).c();
        } else
        {
            ((a)viewgroup.a(0x7f1001df)).a(a.c());
        }
        ((a)viewgroup.a(0x7f1001e0)).a(c);
        d = ((a)((a)((a)viewgroup.a(0x7f1001e1)).c(0x7f07010c)).a(new android.view.View.OnClickListener() {

            final y a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.view.fragments.y.a(a);
            }

            
            {
                a = y.this;
                super();
            }
        })).g();
        a((ImageView)layoutinflater.findViewById(0x7f1001dd));
        layoutinflater.findViewById(0x7f1001e0).setVisibility(0);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (d != null)
        {
            d.setOnClickListener(null);
            d = null;
        }
    }
}
