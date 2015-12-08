// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.widget.ImageButton;
import android.widget.TextView;
import com.roidapp.cloudlib.common.a;
import com.roidapp.cloudlib.flickr.FlickrListCloud;
import com.roidapp.cloudlib.flickr.FlickrPhotoFragment;
import com.roidapp.cloudlib.t;
import com.roidapp.photogrid.common.an;
import com.roidapp.photogrid.common.ba;
import com.roidapp.photogrid.common.c;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            SelectorBaseActivity, ah, ai

public class FlickrSelectorActivity extends SelectorBaseActivity
{

    private TextView a;

    public FlickrSelectorActivity()
    {
    }

    static void a(FlickrSelectorActivity flickrselectoractivity)
    {
        ih.C().a((ig[])flickrselectoractivity.l.toArray(new ig[0]));
        ih.C().j(flickrselectoractivity.o);
        Intent intent = new Intent();
        intent.setClass(flickrselectoractivity, com/roidapp/cloudlib/flickr/FlickrListCloud);
        flickrselectoractivity.startActivity(intent);
        flickrselectoractivity.finish();
    }

    protected final t b()
    {
        return (FlickrPhotoFragment)getSupportFragmentManager().findFragmentById(0x7f0d0088);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (an.b(bundle))
        {
            c.a("320", this);
        } else
        {
            ba.a().a(this);
            try
            {
                setContentView(0x7f030019);
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
                a = (TextView)findViewById(0x7f0d008d);
                if (com.roidapp.cloudlib.common.a.j(this) == 0)
                {
                    a.setText(com.roidapp.cloudlib.common.a.g(this));
                } else
                {
                    a.setText(getString(0x7f070249));
                }
                a.setOnClickListener(new ah(this));
                bundle = (ImageButton)findViewById(0x7f0d0089);
                bundle.setAlpha(165);
                bundle.setOnClickListener(new ai(this));
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
                startActivity(new Intent(this, com/roidapp/cloudlib/flickr/FlickrListCloud));
                finish();
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
