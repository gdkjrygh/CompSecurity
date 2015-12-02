// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.picking;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import com.facebook.k;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;

// Referenced classes of package com.facebook.orca.photos.picking:
//            d, a, b, c

public class MediaChoiceDialog extends DialogFragment
{

    private String Z;
    private EnumSet aa;
    private EnumMap ab;
    private c ac;
    private d ad;

    public MediaChoiceDialog()
    {
        ad = d.CANCEL;
    }

    public static MediaChoiceDialog a(String s, EnumSet enumset)
    {
        MediaChoiceDialog mediachoicedialog = new MediaChoiceDialog();
        Bundle bundle = new Bundle();
        bundle.putString("title", s);
        bundle.putSerializable("visibleButtons", enumset);
        mediachoicedialog.g(bundle);
        return mediachoicedialog;
    }

    static d a(MediaChoiceDialog mediachoicedialog, d d1)
    {
        mediachoicedialog.ad = d1;
        return d1;
    }

    static EnumMap a(MediaChoiceDialog mediachoicedialog)
    {
        return mediachoicedialog.ab;
    }

    static d b(MediaChoiceDialog mediachoicedialog)
    {
        return mediachoicedialog.ad;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = c();
        Window window = bundle.getWindow();
        window.setSoftInputMode(1);
        window.addFlags(0x20000);
        bundle.requestWindowFeature(1);
        bundle.setCanceledOnTouchOutside(true);
        if (Z != null)
        {
            bundle.setTitle(Z);
        }
        layoutinflater = layoutinflater.inflate(k.orca_media_choice_dialog, viewgroup, false);
        viewgroup = new a(this);
        bundle = com.facebook.orca.photos.picking.b.values();
        int j = bundle.length;
        for (int i = 0; i < j; i++)
        {
            b b1 = bundle[i];
            Button button = (Button)layoutinflater.findViewById(b.access$300(b1));
            button.setOnClickListener(viewgroup);
            ab.put(b1, button);
        }

        for (viewgroup = aa.iterator(); viewgroup.hasNext(); ((Button)ab.get(bundle)).setVisibility(8))
        {
            bundle = (b)viewgroup.next();
        }

        return layoutinflater;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = k();
        Z = bundle.getString("title");
        ab = new EnumMap(com/facebook/orca/photos/picking/b);
        aa = EnumSet.complementOf((EnumSet)bundle.getSerializable("visibleButtons"));
    }

    public void a(c c1)
    {
        ac = c1;
    }

    public void g()
    {
        super.g();
        if (ac != null)
        {
            ac.a(ad);
        }
    }
}
