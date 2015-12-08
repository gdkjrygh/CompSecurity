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
import com.cardinalblue.android.piccollage.activities.StickersActivity;
import com.cardinalblue.android.piccollage.model.StickerBundle;
import com.cardinalblue.android.piccollage.model.gson.Sticker;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            g

public class z extends g
{

    private TextView d;

    public z()
    {
    }

    static void a(z z1)
    {
        z1.b();
    }

    private void b()
    {
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
        a("paid");
        StickersActivity stickersactivity = (StickersActivity)getActivity();
        if (stickersactivity != null)
        {
            stickersactivity.a(a);
        }
    }

    protected void a(Sticker sticker, Checkable checkable)
    {
        a(new android.content.DialogInterface.OnClickListener() {

            final z a;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                com.cardinalblue.android.piccollage.view.fragments.z.a(a);
            }

            
            {
                a = z.this;
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

            final z a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.view.fragments.z.a(a);
            }

            
            {
                a = z.this;
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
