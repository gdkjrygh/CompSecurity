// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.trophies;

import Gh;
import UL;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import cn;
import com.snapchat.android.Timber;
import java.io.IOException;

public class TrophyView extends RelativeLayout
{

    public UL a;
    private LayoutInflater b;
    private ImageView c;
    private String d;
    private String e;

    public TrophyView(Context context, UL ul)
    {
        super(context);
        d = "TrophyView";
        e = "\uD83D\uDD12";
        a = ul;
        b = (LayoutInflater)context.getSystemService("layout_inflater");
        View view = b.inflate(0x7f0400fd, this);
        c = (ImageView)view.findViewById(0x7f0d02b9);
        UL.a a1 = ul.c();
        if (a1 == UL.a.UNACHIEVED)
        {
            context = e;
        } else
        {
            context = ul.b();
        }
        if (a1 != UL.a.CURRENT)
        {
            view.setAlpha(0.2F);
        }
        try
        {
            ul = Gh.a().b(context);
            Bitmap bitmap = Bitmap.createBitmap(200, 200, android.graphics.Bitmap.Config.ARGB_8888);
            ul.a(new Canvas(bitmap));
            c.setImageBitmap(bitmap);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (UL ul)
        {
            Timber.e(d, (new StringBuilder("Unable to load unicode ")).append(context).toString(), new Object[0]);
        }
    }
}
