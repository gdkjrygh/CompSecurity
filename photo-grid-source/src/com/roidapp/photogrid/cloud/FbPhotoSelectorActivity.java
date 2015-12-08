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
import com.roidapp.cloudlib.common.b;
import com.roidapp.cloudlib.facebook.FbAlbumListActivity;
import com.roidapp.cloudlib.facebook.FbPhotoFragment;
import com.roidapp.cloudlib.t;
import com.roidapp.photogrid.common.an;
import com.roidapp.photogrid.common.ba;
import com.roidapp.photogrid.common.c;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            SelectorBaseActivity, af, ag

public class FbPhotoSelectorActivity extends SelectorBaseActivity
{

    private TextView a;

    public FbPhotoSelectorActivity()
    {
    }

    static void a(FbPhotoSelectorActivity fbphotoselectoractivity)
    {
        fbphotoselectoractivity.l();
    }

    private void l()
    {
        ih.C().a((ig[])l.toArray(new ig[0]));
        ih.C().j(o);
        b b1 = com.roidapp.cloudlib.common.a.a();
        Intent intent = new Intent(this, com/roidapp/cloudlib/facebook/FbAlbumListActivity);
        intent.putExtra("user_id", b1.d);
        intent.putExtra("user_name", b1.e);
        startActivity(intent);
        finish();
        com.roidapp.cloudlib.common.a.b();
    }

    protected final t b()
    {
        return (FbPhotoFragment)getSupportFragmentManager().findFragmentById(0x7f0d0088);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (an.b(bundle))
        {
            c.a("310", this);
        } else
        {
            ba.a().a(this);
            try
            {
                setContentView(0x7f030018);
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
                a.setOnClickListener(new af(this));
                bundle = (ImageButton)findViewById(0x7f0d0089);
                bundle.setAlpha(165);
                bundle.setOnClickListener(new ag(this));
                bundle = com.roidapp.cloudlib.common.a.a();
                a.setText(((b) (bundle)).c);
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
        }
        return super.onKeyDown(i, keyevent);
    }

    protected void onStart()
    {
        super.onStart();
    }
}
