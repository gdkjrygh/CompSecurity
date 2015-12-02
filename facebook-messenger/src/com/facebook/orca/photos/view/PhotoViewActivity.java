// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.Gallery;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.analytics.d;
import com.facebook.base.activity.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.l;
import com.facebook.messages.model.threads.Message;
import com.facebook.orca.attachments.ImageAttachmentData;
import com.facebook.orca.emoji.z;
import com.facebook.orca.photos.c.a;
import com.facebook.orca.threads.n;
import com.facebook.user.tiles.UserTileView;
import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.photos.view:
//            d, e, b, a

public class PhotoViewActivity extends i
    implements d
{

    private a A;
    private n B;
    private Message C;
    private final android.widget.AdapterView.OnItemSelectedListener D = new com.facebook.orca.photos.view.d(this);
    private final android.view.GestureDetector.SimpleOnGestureListener E = new e(this);
    private Gallery p;
    private com.facebook.orca.photos.view.a q;
    private RelativeLayout r;
    private FrameLayout s;
    private GestureDetector t;
    private TextView u;
    private UserTileView v;
    private TextView w;
    private TextView x;
    private TextView y;
    private z z;

    public PhotoViewActivity()
    {
    }

    static void a(PhotoViewActivity photoviewactivity)
    {
        photoviewactivity.k();
    }

    static Gallery b(PhotoViewActivity photoviewactivity)
    {
        return photoviewactivity.p;
    }

    static TextView c(PhotoViewActivity photoviewactivity)
    {
        return photoviewactivity.u;
    }

    static z d(PhotoViewActivity photoviewactivity)
    {
        return photoviewactivity.z;
    }

    static UserTileView e(PhotoViewActivity photoviewactivity)
    {
        return photoviewactivity.v;
    }

    static TextView f(PhotoViewActivity photoviewactivity)
    {
        return photoviewactivity.w;
    }

    static n g(PhotoViewActivity photoviewactivity)
    {
        return photoviewactivity.B;
    }

    static TextView h(PhotoViewActivity photoviewactivity)
    {
        return photoviewactivity.x;
    }

    static RelativeLayout i(PhotoViewActivity photoviewactivity)
    {
        return photoviewactivity.r;
    }

    static TextView j(PhotoViewActivity photoviewactivity)
    {
        return photoviewactivity.y;
    }

    private boolean j()
    {
        return r.getVisibility() == 0;
    }

    private void k()
    {
        if (s.getVisibility() == 8)
        {
            if (((b)p.getSelectedItem()).b() != null)
            {
                r.setVisibility(0);
            }
            s.setVisibility(0);
        }
    }

    static boolean k(PhotoViewActivity photoviewactivity)
    {
        return photoviewactivity.j();
    }

    private void l()
    {
        if (s.getVisibility() == 0)
        {
            r.setVisibility(8);
            s.setVisibility(8);
        }
    }

    static void l(PhotoViewActivity photoviewactivity)
    {
        photoviewactivity.l();
    }

    public void b(Bundle bundle)
    {
        int i1 = 0;
        super.b(bundle);
        B = (n)i().a(com/facebook/orca/threads/n);
        z = (z)i().a(com/facebook/orca/emoji/z);
        A = (a)i().a(com/facebook/orca/photos/c/a);
        setContentView(k.orca_photo_view);
        Object obj = getIntent();
        bundle = (ImageAttachmentData)((Intent) (obj)).getParcelableExtra("imageData");
        if (bundle == null)
        {
            finish();
            return;
        }
        if (((Intent) (obj)).hasExtra("message"))
        {
            C = (Message)((Intent) (obj)).getParcelableExtra("message");
        }
        java.util.ArrayList arraylist = hq.a();
        int k1;
        if (((Intent) (obj)).hasExtra("imageAttachments"))
        {
            obj = ((Intent) (obj)).getParcelableArrayListExtra("imageAttachments").iterator();
            int j1 = 0;
            do
            {
                k1 = j1;
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                ImageAttachmentData imageattachmentdata = (ImageAttachmentData)((Iterator) (obj)).next();
                arraylist.add(new b(imageattachmentdata.b(), C, bundle.f()));
                if (imageattachmentdata.b().equals(bundle.b()))
                {
                    j1 = i1;
                }
                i1++;
            } while (true);
        } else
        {
            arraylist.add(new b(bundle.b(), null, bundle.f()));
            k1 = 0;
        }
        t = new GestureDetector(this, E);
        p = (Gallery)b(com.facebook.i.gallery);
        q = new com.facebook.orca.photos.view.a(this, arraylist);
        p.setAdapter(q);
        p.setOnItemSelectedListener(D);
        r = (RelativeLayout)b(com.facebook.i.message_container);
        u = (TextView)b(com.facebook.i.message_text);
        v = (UserTileView)b(com.facebook.i.message_user_tile);
        w = (TextView)b(com.facebook.i.message_user);
        x = (TextView)b(com.facebook.i.message_time);
        y = (TextView)b(com.facebook.i.photo_count_text);
        s = (FrameLayout)b(com.facebook.i.photo_count_container);
        p.setSelection(k1);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return t.onTouchEvent(motionevent) || super.dispatchTouchEvent(motionevent);
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.PHOTO_VIEW_ACTIVITY_NAME;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        boolean flag = super.onCreateOptionsMenu(menu);
        if (com.facebook.orca.photos.c.a.a())
        {
            getMenuInflater().inflate(l.photo_view_activity_menu, menu);
            flag = true;
        }
        return flag;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.facebook.i.menu_item_save_image)
        {
            int i1 = p.getSelectedItemPosition();
            menuitem = ((MenuItem) (q.getItem(i1)));
            if (menuitem != null && (menuitem instanceof b))
            {
                Object obj = (b)menuitem;
                menuitem = ((b) (obj)).a();
                obj = ((b) (obj)).c();
                A.a(menuitem, ((String) (obj)));
            }
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }
}
