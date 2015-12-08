// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.events.ChangePageEvent;
import com.cardinalblue.android.piccollage.events.a;
import com.cardinalblue.android.piccollage.events.g;
import com.cardinalblue.android.piccollage.events.m;
import com.cardinalblue.android.piccollage.events.n;
import com.cardinalblue.android.piccollage.model.PhotoInfo;
import com.cardinalblue.android.piccollage.model.gdata.PhotoEntry;
import com.cardinalblue.android.piccollage.model.gson.FbFriend;
import com.cardinalblue.android.piccollage.model.gson.FbPhoto;
import com.cardinalblue.android.piccollage.model.k;
import com.cardinalblue.android.piccollage.view.a.l;
import com.cardinalblue.android.piccollage.view.fragments.c;
import com.cardinalblue.android.piccollage.view.fragments.d;
import com.cardinalblue.android.piccollage.view.fragments.r;
import com.google.samples.apps.iosched.ui.widget.SlidingTabLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseFragmentActivity, FbAlbumListActivity, KddiAlbumListActivity

public class PhotoAdderActivity extends BaseFragmentActivity
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{
    private static class a extends Handler
    {

        private final WeakReference a;

        public void handleMessage(Message message)
        {
            PhotoAdderActivity photoadderactivity = (PhotoAdderActivity)a.get();
            message.what;
            JVM INSTR tableswitch 0 0: default 32
        //                       0 38;
               goto _L1 _L2
_L1:
            super.handleMessage(message);
_L4:
            return;
_L2:
            if (photoadderactivity != null && com.cardinalblue.android.piccollage.activities.PhotoAdderActivity.a(photoadderactivity) != null)
            {
                com.cardinalblue.android.piccollage.activities.PhotoAdderActivity.a(photoadderactivity).setSystemUiVisibility(1);
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public a(PhotoAdderActivity photoadderactivity)
        {
            a = new WeakReference(photoadderactivity);
        }
    }


    ArrayList a;
    private int b;
    private View c;
    private View d;
    private l e;
    private TextView f;
    private Uri g;
    private Handler h;

    public PhotoAdderActivity()
    {
        g = null;
        h = new a(this);
    }

    private Uri a(Intent intent)
        throws com.cardinalblue.android.piccollage.model.k.a
    {
        Uri uri;
        if (g != null && (intent == null || intent.getData() == null))
        {
            MediaScannerConnection.scanFile(this, new String[] {
                g.getPath()
            }, null, null);
            uri = g;
        } else
        {
            Uri uri1 = intent.getData();
            uri = uri1;
            if (uri1 == null)
            {
                if (intent.hasExtra("data"))
                {
                    intent = (Bitmap)intent.getExtras().get("data");
                    if (intent == null)
                    {
                        throw new com.cardinalblue.android.piccollage.model.k.a("can't get camera data from data.getExtras().get('data')");
                    } else
                    {
                        return Uri.fromFile(k.a(intent, "png"));
                    }
                } else
                {
                    throw new com.cardinalblue.android.piccollage.model.k.a("can not found any camera photo information from intent");
                }
            }
        }
        return uri;
    }

    static View a(PhotoAdderActivity photoadderactivity)
    {
        return photoadderactivity.c;
    }

    private void a()
    {
        boolean flag = false;
        if (f != null)
        {
            Object obj = f;
            int i;
            if (a.size() > 0)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((TextView) (obj)).setVisibility(i);
            f.setText(Integer.toString(a.size()));
        }
        if (d != null)
        {
            obj = d;
            if (!a.isEmpty())
            {
                flag = true;
            }
            ((View) (obj)).setEnabled(flag);
        }
    }

    private void a(String s)
    {
        com.cardinalblue.android.piccollage.a.b.K(s);
    }

    static Handler b(PhotoAdderActivity photoadderactivity)
    {
        return photoadderactivity.h;
    }

    private void b(Intent intent)
        throws com.cardinalblue.android.piccollage.model.k.a
    {
        Object obj = a(intent);
        intent = new ArrayList();
        intent.add(new PhotoInfo(Uri.decode(((Uri) (obj)).toString()), "camera"));
        obj = new Intent();
        ((Intent) (obj)).putExtra("photo_infos", intent);
        setResult(-1, ((Intent) (obj)));
        g = null;
        finish();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        i;
        JVM INSTR lookupswitch 7: default 68
    //                   1: 100
    //                   101: 76
    //                   200: 425
    //                   201: 126
    //                   202: 459
    //                   203: 126
    //                   301: 292;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L5 _L7
_L1:
        super.onActivityResult(i, j, intent);
_L9:
        return;
_L3:
        if (j == -1)
        {
            intent.putExtra("extra_is_kddi", true);
            setResult(-1, intent);
            finish();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (j == -1)
        {
            com.cardinalblue.android.piccollage.a.b.aG();
            a("camera");
            try
            {
                b(intent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                com.cardinalblue.android.piccollage.a.f.a(intent);
            }
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (j != -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (intent.hasExtra("extra_fb_photos"))
        {
            Object obj = intent.getExtras().getParcelableArrayList("extra_fb_photos");
            if (obj != null && ((ArrayList) (obj)).size() != 0)
            {
                intent = new ArrayList();
                FbPhoto fbphoto;
                for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); intent.add(new PhotoInfo(fbphoto.getSourceUrl(), fbphoto.getThumbnailUrl(), "facebook")))
                {
                    fbphoto = (FbPhoto)((Iterator) (obj)).next();
                }

                obj = new Intent();
                ((Intent) (obj)).putExtra("photo_infos", intent);
                setResult(-1, ((Intent) (obj)));
                finish();
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (j != 1) goto _L9; else goto _L8
_L8:
        intent = getSupportFragmentManager().findFragmentByTag("tag_adder_facebook");
        if (intent != null && (intent instanceof c))
        {
            ((c)intent).b();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (j == -1 && intent.hasExtra("extra_google_photos"))
        {
            Object obj1 = intent.getExtras().getParcelableArrayList("extra_google_photos");
            if (obj1 != null && ((ArrayList) (obj1)).size() != 0)
            {
                intent = new ArrayList();
                PhotoEntry photoentry;
                for (obj1 = ((ArrayList) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); intent.add(new PhotoInfo(photoentry.b(), photoentry.a(), "googleplus")))
                {
                    photoentry = (PhotoEntry)((Iterator) (obj1)).next();
                }

                obj1 = new Intent();
                ((Intent) (obj1)).putExtra("photo_infos", intent);
                setResult(-1, ((Intent) (obj1)));
                finish();
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (j == -1)
        {
            intent = getSupportFragmentManager().findFragmentByTag("tag_adder_facebook");
            if (intent != null && (intent instanceof c))
            {
                ((c)intent).d();
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (j == -1 && intent.hasExtra("extra_fb_friend"))
        {
            intent = (FbFriend)intent.getParcelableExtra("extra_fb_friend");
            Intent intent1 = new Intent(this, com/cardinalblue/android/piccollage/activities/FbAlbumListActivity);
            intent1.putExtra("extra_fb_friend", intent);
            startActivityForResult(intent1, 203);
            return;
        }
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void onAddPhotoSelection(com.cardinalblue.android.piccollage.events.a a1)
    {
        a1 = (PhotoInfo)a1.a;
        if (a.add(a1))
        {
            a();
        }
    }

    public void onClearPhotoSelection(g g1)
    {
        a.clear();
        a();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030036);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        c = getWindow().getDecorView();
        c.setOnSystemUiVisibilityChangeListener(new android.view.View.OnSystemUiVisibilityChangeListener() {

            final PhotoAdderActivity a;

            public void onSystemUiVisibilityChange(int i)
            {
                if ((i & 4) == 0)
                {
                    com.cardinalblue.android.piccollage.activities.PhotoAdderActivity.b(a).sendEmptyMessageDelayed(0, 1000L);
                }
            }

            
            {
                a = PhotoAdderActivity.this;
                super();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle(0x7f07022e);
        SlidingTabLayout slidingtablayout;
        if (bundle != null)
        {
            b = bundle.getInt("max_choices", 0);
            g = (Uri)bundle.getParcelable("key_camera_output_uri");
        } else
        {
            b = getIntent().getIntExtra("max_choices", 0);
        }
        a = new ArrayList(b);
        e = new l(this);
        bundle = new Bundle();
        bundle.putInt("extra_activity_title", 0x7f07022e);
        bundle.putInt("max_choices", b);
        e.a(0x7f02027c, com/cardinalblue/android/piccollage/view/fragments/r.getName(), bundle, "tag_adder_gallery");
        bundle = new Bundle();
        bundle.putInt("extra_activity_title", 0x7f07022d);
        bundle.putInt("max_choices", b);
        e.a(0x7f02027a, com/cardinalblue/android/piccollage/view/fragments/c.getName(), bundle, "tag_adder_facebook");
        bundle = new Bundle();
        bundle.putInt("extra_activity_title", 0x7f07022f);
        bundle.putInt("max_choices", b);
        e.a(0x7f02027b, com/cardinalblue/android/piccollage/view/fragments/d.getName(), bundle, "tag_adder_googleplus");
        bundle = (ViewPager)findViewById(0x7f1000d1);
        bundle.setAdapter(e);
        bundle.setOffscreenPageLimit(2);
        slidingtablayout = (SlidingTabLayout)findViewById(0x7f1000d0);
        slidingtablayout.a(0x7f03014b, 0, 0x7f10007a);
        slidingtablayout.setSelectedIndicatorColors(new int[] {
            getResources().getColor(0x7f0f00ff)
        });
        slidingtablayout.setDistributeEvenly(true);
        slidingtablayout.setViewPager(bundle);
        slidingtablayout.setOnPageChangeListener(this);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(0x7f110015, menu);
        menu = menu.findItem(0x7f1002ea);
        View view = MenuItemCompat.getActionView(menu);
        d = view.findViewById(0x7f1000bf);
        d.setOnClickListener(new android.view.View.OnClickListener(menu) {

            final MenuItem a;
            final PhotoAdderActivity b;

            public void onClick(View view1)
            {
                b.onOptionsItemSelected(a);
            }

            
            {
                b = PhotoAdderActivity.this;
                a = menuitem;
                super();
            }
        });
        f = (TextView)view.findViewById(0x7f1000c0);
        a();
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onBackPressed();
            return true;

        case 2131755764: 
            menuitem = new Intent(this, com/cardinalblue/android/piccollage/activities/KddiAlbumListActivity);
            menuitem.putExtra("max_choices", b);
            startActivityForResult(menuitem, 101);
            return true;

        case 2131755754: 
            menuitem = new Intent();
            menuitem.putExtra("photo_infos", a);
            setResult(-1, menuitem);
            finish();
            return true;
        }
    }

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f1, int j)
    {
    }

    public void onPageSelected(int i)
    {
        a.clear();
        a();
        com.cardinalblue.android.piccollage.controller.d.a().c(new ChangePageEvent(i));
        int i1 = e.a(i);
        ActionBar actionbar = getSupportActionBar();
        int j = i1;
        if (i1 == -1)
        {
            j = 0x7f0700f9;
        }
        actionbar.setTitle(j);
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            com.cardinalblue.android.piccollage.a.b.aE("Gallery");
            return;

        case 1: // '\001'
            if (!com.cardinalblue.android.b.k.b(this))
            {
                com.cardinalblue.android.b.k.a(this, 0x7f07021d, 1);
            }
            com.cardinalblue.android.piccollage.a.b.aE("Facebook");
            return;

        case 2: // '\002'
            break;
        }
        if (!com.cardinalblue.android.b.k.b(this))
        {
            com.cardinalblue.android.b.k.a(this, 0x7f07021d, 1);
        }
        com.cardinalblue.android.piccollage.a.b.aE("Google+");
    }

    public void onRemoveFromPhotoSelection(m m1)
    {
        m1 = (PhotoInfo)m1.b;
        if (a.remove(m1))
        {
            a();
        }
    }

    protected void onResume()
    {
        super.onResume();
        h.sendEmptyMessage(0);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("max_choices", b);
        bundle.putParcelable("key_camera_output_uri", g);
    }

    protected void onStart()
    {
        super.onStart();
        com.cardinalblue.android.piccollage.controller.d.a().a(this);
    }

    protected void onStop()
    {
        super.onStop();
        com.cardinalblue.android.piccollage.controller.d.a().b(this);
    }

    public void onTakePhotoEvent(n n)
    {
        com.cardinalblue.android.piccollage.a.b.ax();
        com.cardinalblue.android.piccollage.a.b.J("Use Camera");
        n = new Intent("android.media.action.IMAGE_CAPTURE");
        g = Uri.fromFile(k.a("Photo", "jpg"));
        n.putExtra("output", g);
        try
        {
            startActivityForResult(n, 1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (n n)
        {
            com.cardinalblue.android.b.k.a(this, 0x7f0701e1, 0);
        }
    }
}
