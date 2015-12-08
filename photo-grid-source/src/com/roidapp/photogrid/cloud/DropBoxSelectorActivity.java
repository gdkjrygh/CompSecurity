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
import com.roidapp.cloudlib.AccountMgrActivity;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.common.a;
import com.roidapp.cloudlib.dropbox.DropBoxPhotoFragment;
import com.roidapp.cloudlib.t;
import com.roidapp.photogrid.common.an;
import com.roidapp.photogrid.common.ba;
import com.roidapp.photogrid.common.c;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            SelectorBaseActivity, x, y, z

public class DropBoxSelectorActivity extends SelectorBaseActivity
{

    private TextView a;

    public DropBoxSelectorActivity()
    {
    }

    static void a(DropBoxSelectorActivity dropboxselectoractivity)
    {
        dropboxselectoractivity.l();
    }

    static void b(DropBoxSelectorActivity dropboxselectoractivity)
    {
        dropboxselectoractivity.startActivityForResult(new Intent(dropboxselectoractivity, com/roidapp/cloudlib/AccountMgrActivity), 2);
    }

    private void l()
    {
        if (((DropBoxPhotoFragment)b).h())
        {
            ih.C().a((ig[])l.toArray(new ig[0]));
            ih.C().j(o);
        }
    }

    protected final t b()
    {
        return (DropBoxPhotoFragment)getSupportFragmentManager().findFragmentById(0x7f0d0088);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 2 && TextUtils.isEmpty(com.roidapp.cloudlib.common.a.x(this)))
        {
            startActivity(new Intent(this, al.g().d()));
            finish();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (an.b(bundle))
        {
            c.a("300", this);
        } else
        {
            ba.a().a(this);
            try
            {
                setContentView(0x7f030015);
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
                bundle = com.roidapp.cloudlib.common.a.x(this);
                if (TextUtils.isEmpty(bundle))
                {
                    a.setText(0x7f07006e);
                } else
                {
                    a.setText(bundle);
                }
                a.setOnClickListener(new x(this));
                bundle = (ImageButton)findViewById(0x7f0d0089);
                bundle.setAlpha(165);
                bundle.setOnClickListener(new y(this));
                bundle = (ImageButton)findViewById(0x7f0d008a);
                bundle.setAlpha(165);
                bundle.setOnClickListener(new z(this));
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
