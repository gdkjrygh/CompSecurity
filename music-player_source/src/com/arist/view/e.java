// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.view;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.arist.activity.EqualizerActivity;
import com.arist.activity.MainActivity;
import com.arist.activity.MyApplication;
import com.arist.activity.ScanMusicActivity;
import com.arist.activity.SettingScreen;
import com.arist.c.f;
import com.arist.model.equize.j;
import com.arist.model.skin.b;
import com.arist.model.skin.m;
import com.ijoysoft.a.a;

// Referenced classes of package com.arist.view:
//            h, g, f

public final class e extends LinearLayout
    implements android.view.View.OnClickListener, m
{

    private LayoutInflater a;
    private MainActivity b;
    private TextView c;
    private ImageView d;

    public e(MainActivity mainactivity)
    {
        super(mainactivity);
        a = LayoutInflater.from(mainactivity);
        b = mainactivity;
        a.inflate(0x7f030040, this);
        ((TextView)findViewById(0x7f0600e7)).setOnClickListener(this);
        c = (TextView)findViewById(0x7f0600e8);
        a();
        c.setOnClickListener(this);
        ((TextView)findViewById(0x7f0600e9)).setOnClickListener(this);
        ((TextView)findViewById(0x7f0600ea)).setOnClickListener(this);
        ((TextView)findViewById(0x7f0600eb)).setOnClickListener(this);
        mainactivity = (TextView)findViewById(0x7f0600ec);
        d = (ImageView)findViewById(0x7f0600ed);
        mainactivity.setOnClickListener(this);
        findViewById(0x7f0600ee).setOnClickListener(this);
        ((TextView)findViewById(0x7f0600ef)).setOnClickListener(this);
    }

    static MainActivity a(e e1)
    {
        return e1.b;
    }

    public final void a()
    {
        Drawable drawable;
        Resources resources;
        resources = getResources();
        drawable = resources.getDrawable(0x7f020079);
        MyApplication.i;
        JVM INSTR tableswitch 1 4: default 44
    //                   1 70
    //                   2 80
    //                   3 90
    //                   4 100;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        c.setCompoundDrawables(drawable, null, null, null);
        return;
_L2:
        drawable = resources.getDrawable(0x7f020079);
        continue; /* Loop/switch isn't completed */
_L3:
        drawable = resources.getDrawable(0x7f02007c);
        continue; /* Loop/switch isn't completed */
_L4:
        drawable = resources.getDrawable(0x7f02007a);
        continue; /* Loop/switch isn't completed */
_L5:
        drawable = resources.getDrawable(0x7f02007b);
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final void a(int i)
    {
        d.setImageDrawable(new ColorDrawable(i));
    }

    protected final void onAttachedToWindow()
    {
        com.arist.model.skin.b.a().a(this);
        super.onAttachedToWindow();
    }

    public final void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131099879 2131099887: default 56
    //                   2131099879 57
    //                   2131099880 80
    //                   2131099881 142
    //                   2131099882 201
    //                   2131099883 318
    //                   2131099884 340
    //                   2131099885 56
    //                   2131099886 351
    //                   2131099887 460;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L1 _L8 _L9
_L1:
        return;
_L2:
        view = new Intent(b, com/arist/activity/ScanMusicActivity);
        b.startActivity(view);
        return;
_L3:
        (new android.app.AlertDialog.Builder(b)).setTitle(b.getString(0x7f09004f)).setCancelable(true).setSingleChoiceItems(b.getResources().getStringArray(0x7f0c0001), MyApplication.i - 1, new h(this)).create().show();
        return;
_L4:
        if (!j.a().e())
        {
            Toast.makeText(getContext(), getContext().getString(0x7f0900ed), 0).show();
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            b.startActivity(new Intent(b, com/arist/activity/EqualizerActivity));
            return;
        }
          goto _L1
_L5:
        view = a.inflate(0x7f03003f, null);
        EditText edittext = (EditText)view.findViewById(0x7f0600e3);
        edittext.setText((new StringBuilder()).append(MyApplication.e.h()).toString());
        (new android.app.AlertDialog.Builder(b)).setTitle(b.getString(0x7f09004c)).setCancelable(true).setView(view).setPositiveButton(b.getString(0x7f09004b), new g(this, edittext)).setNegativeButton(b.getString(0x7f09004a), null).create().show();
        return;
_L6:
        b.startActivity(new Intent(b, com/arist/activity/SettingScreen));
        return;
_L7:
        com.arist.model.skin.b.a().a(b);
        return;
_L8:
        view = getContext().getString(0x7f09010e);
        String s = (new StringBuilder(String.valueOf(getContext().getString(0x7f09010c)))).append("http://market.android.com/details?id=").append(getContext().getPackageName()).toString();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", view);
        intent.putExtra("android.intent.extra.TEXT", s);
        intent.setFlags(0x10000000);
        getContext().startActivity(Intent.createChooser(intent, view));
        return;
_L9:
        com.ijoysoft.a.a.a().a(b, new com.arist.view.f(this));
        return;
    }

    protected final void onDetachedFromWindow()
    {
        com.arist.model.skin.b.a().b(this);
        super.onDetachedFromWindow();
    }
}
