// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.photogrid.common.al;
import com.roidapp.photogrid.common.ba;
import com.roidapp.photogrid.common.cc;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.release:
//            ParentActivity, bd, PhotoGridActivity, ImageEditor, 
//            bb, ih, ba, bc

public class EffectsList extends ParentActivity
{

    ListView a;
    private boolean b;
    private al c;
    private Handler d;

    public EffectsList()
    {
        a = null;
        b = true;
        d = new bd(this);
    }

    private void a()
    {
        Intent intent = new Intent(this, com/roidapp/photogrid/release/PhotoGridActivity);
        if (u != null)
        {
            u.removeAllViews();
        }
        startActivity(intent);
        finish();
    }

    static void a(EffectsList effectslist)
    {
        effectslist.a();
    }

    static void a(EffectsList effectslist, String s)
    {
        Intent intent = new Intent();
        intent.setClass(effectslist, com/roidapp/photogrid/release/ImageEditor);
        intent.putExtra("effect_mode", s);
        if (effectslist.u != null)
        {
            effectslist.u.removeAllViews();
        }
        effectslist.startActivity(intent);
        effectslist.finish();
    }

    static boolean b(EffectsList effectslist)
    {
        return effectslist.b;
    }

    static al c(EffectsList effectslist)
    {
        return effectslist.c;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        ba.a().a(this);
        try
        {
            setContentView(0x7f030094);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            v = true;
            (new cc(this)).a();
        }
        if (!v)
        {
            ((TextView)findViewById(0x7f0d0028)).setOnClickListener(new bb(this));
            bundle = ih.C().M();
            boolean flag;
            if (bundle != null && bundle.length == 1)
            {
                b = false;
                getResources().getDrawable(0x7f0203ff).setAlpha(50);
                an.a(new WeakReference(this), getString(0x7f070209));
            } else
            {
                getResources().getDrawable(0x7f0203ff).setAlpha(255);
            }
            a = (ListView)findViewById(0x7f0d0261);
            flag = b;
            bundle = getResources().getStringArray(0x7f080000);
            bundle = new com.roidapp.photogrid.release.ba(this, new String[] {
                bundle[0], bundle[1], bundle[3]
            }, new int[] {
                0x7f0203ff, 0x7f0203f7, 0x7f0203f8
            }, new boolean[] {
                flag, true, true
            });
            a.setAdapter(bundle);
            a.setOnItemClickListener(new bc(this));
            if (getSharedPreferences("DebugMode", 0).getBoolean("DebugMode", false))
            {
                c = new al(this, d);
                c.b();
                ba.a().b();
            }
        }
    }

    public void onDestroy()
    {
        if (c != null)
        {
            c.c();
        }
        if (u != null)
        {
            u.removeAllViews();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            a();
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    protected void onStart()
    {
        super.onStart();
    }

    public final void x()
    {
        t = "effect_list";
    }
}
