// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.ImageButton;
import android.widget.TextView;
import com.roidapp.cloudlib.common.a;
import com.roidapp.cloudlib.instagram.InstagramListCloud;
import com.roidapp.cloudlib.instagram.InstagramPhotoFragment;
import com.roidapp.cloudlib.t;
import com.roidapp.photogrid.common.an;
import com.roidapp.photogrid.common.ba;
import com.roidapp.photogrid.common.c;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            SelectorBaseActivity, an, ao

public class InstagramSelectorActivity extends SelectorBaseActivity
{

    public final String a = "InstagramSelectorActivity";
    private TextView y;

    public InstagramSelectorActivity()
    {
    }

    static void a(InstagramSelectorActivity instagramselectoractivity)
    {
        instagramselectoractivity.l();
    }

    private void l()
    {
        if (l != null)
        {
            ih.C().a((ig[])l.toArray(new ig[0]));
        }
        ih.C().j(o);
        Intent intent = new Intent();
        intent.setClass(this, com/roidapp/cloudlib/instagram/InstagramListCloud);
        startActivity(intent);
        finish();
    }

    protected final t b()
    {
        return (InstagramPhotoFragment)getSupportFragmentManager().findFragmentById(0x7f0d0088);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (an.b(bundle))
        {
            c.a("340", this);
        } else
        {
            ba.a().a(this);
            try
            {
                setContentView(0x7f03001c);
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
                d();
                e();
                y = (TextView)findViewById(0x7f0d008d);
                if (com.roidapp.cloudlib.common.a.f(this) == 1)
                {
                    bundle = com.roidapp.cloudlib.common.a.b(this);
                    if (!TextUtils.isEmpty(bundle))
                    {
                        y.setText(bundle);
                    } else
                    {
                        y.setText(getString(0x7f070249));
                    }
                } else
                {
                    y.setText(getString(0x7f070249));
                }
                y.setOnClickListener(new com.roidapp.photogrid.cloud.an(this));
                bundle = (ImageButton)findViewById(0x7f0d0089);
                bundle.setAlpha(165);
                bundle.setOnClickListener(new ao(this));
                if (ih.C().M() != null)
                {
                    a(ih.C().M());
                    return;
                }
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            if (this.i != null && this.i.getVisibility() == 0)
            {
                this.i.setVisibility(8);
            } else
            {
                l();
            }
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
}
