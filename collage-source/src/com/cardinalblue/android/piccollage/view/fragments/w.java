// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.gson.Sticker;
import java.io.IOException;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            g

public class w extends g
{

    public w()
    {
    }

    private Bitmap b()
        throws IOException
    {
        return BitmapFactory.decodeStream(getActivity().getAssets().open("stickers/StickerLite/st_satarter_2_smile.png"));
    }

    protected void a(Sticker sticker, Checkable checkable)
    {
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300cd, viewgroup, false);
        viewgroup = (ImageView)layoutinflater.findViewById(0x7f100210);
        try
        {
            viewgroup.setImageBitmap(b());
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup)
        {
            f.a(viewgroup);
            return layoutinflater;
        }
        return layoutinflater;
    }
}
