// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.google.SearchPhotoFragment;
import com.roidapp.cloudlib.t;
import com.roidapp.photogrid.common.an;
import com.roidapp.photogrid.common.ba;
import com.roidapp.photogrid.common.c;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            SelectorBaseActivity, al, am

public class GoogleSearchSelectorActivity extends SelectorBaseActivity
{

    public GoogleSearchSelectorActivity()
    {
    }

    static void a(GoogleSearchSelectorActivity googlesearchselectoractivity)
    {
        googlesearchselectoractivity.l();
    }

    private void l()
    {
        ih.C().a((ig[])l.toArray(new ig[0]));
        ih.C().j(o);
        Intent intent = new Intent();
        intent.putExtra("fromCloud", true);
        intent.setClass(this, al.g().d());
        startActivity(intent);
        finish();
    }

    protected final t b()
    {
        return (SearchPhotoFragment)getSupportFragmentManager().findFragmentById(0x7f0d0088);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (an.b(bundle))
        {
            c.a("330", this);
        } else
        {
            ba.a().a(this);
            try
            {
                setContentView(0x7f03001b);
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
                bundle = (TextView)findViewById(0x7f0d008d);
                bundle.setText(0x7f070092);
                bundle.setOnClickListener(new com.roidapp.photogrid.cloud.al(this));
                bundle = (ImageButton)findViewById(0x7f0d0089);
                bundle.setAlpha(165);
                bundle.setOnClickListener(new am(this));
                if (ih.C().M() != null)
                {
                    a(ih.C().M());
                }
                if (!getIntent().hasExtra("firstCreate"))
                {
                    getWindow().setSoftInputMode(36);
                    ((SearchPhotoFragment)b).h();
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
