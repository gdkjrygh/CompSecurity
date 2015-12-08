// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.sunset;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import com.tinder.base.a;
import com.tinder.e.ah;
import com.tinder.managers.ManagerApp;
import com.tinder.model.SparksEvent;
import com.tinder.utils.DateUtils;
import com.tinder.utils.ad;
import com.tinder.utils.e;

// Referenced classes of package com.tinder.sunset:
//            SunsetMoment

public class ActivityMomentViewer extends a
{

    private ImageView a;
    private SunsetMoment b;
    private ImageButton c;

    public ActivityMomentViewer()
    {
    }

    static void a(ActivityMomentViewer activitymomentviewer)
    {
        Picasso.a(activitymomentviewer).a(activitymomentviewer.b.e).a(activitymomentviewer. new x() {

            final ActivityMomentViewer a;

            public final void onBitmapFailed(Drawable drawable)
            {
                Toast.makeText(a, 0x7f060120, 0).show();
            }

            public final void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
            {
                com.tinder.sunset.ActivityMomentViewer.a(a, bitmap);
            }

            public final void onPrepareLoad(Drawable drawable)
            {
            }

            
            {
                a = ActivityMomentViewer.this;
                super();
            }
        });
    }

    static void a(ActivityMomentViewer activitymomentviewer, Bitmap bitmap)
    {
        String s1 = DateUtils.a(activitymomentviewer.b.c);
        ah ah = activitymomentviewer. new ah() {

            final ActivityMomentViewer a;

            public final void a()
            {
                Toast.makeText(ManagerApp.c(), 0x7f060121, 0).show();
            }

            public final void b()
            {
                Toast.makeText(ManagerApp.c(), 0x7f060120, 0).show();
            }

            
            {
                a = ActivityMomentViewer.this;
                super();
            }
        };
        activitymomentviewer = e.a(new com.tinder.utils.m._cls2("Tinder", s1, bitmap, activitymomentviewer));
        activitymomentviewer.a = new com.tinder.utils.m._cls1(ah);
        activitymomentviewer.a(false);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        F();
        setContentView(0x7f03006a);
        b = (SunsetMoment)getIntent().getExtras().getSerializable("moment");
        a = (ImageView)findViewById(0x7f0e01a8);
        c = (ImageButton)findViewById(0x7f0e01aa);
        ad.b(c);
        Picasso.a(this).a(b.e).b(ad.c(), ad.b()).b().a(a, null);
        c.setOnClickListener(new android.view.View.OnClickListener() {

            final ActivityMomentViewer a;

            public final void onClick(View view)
            {
                com.tinder.sunset.ActivityMomentViewer.a(a);
            }

            
            {
                a = ActivityMomentViewer.this;
                super();
            }
        });
    }

    protected void onResume()
    {
        super.onResume();
        SparksEvent sparksevent = new SparksEvent("Moments.View");
        sparksevent.put("otherId", b.b);
        sparksevent.put("momentId", b.a);
        sparksevent.put("viewedFrom", Integer.valueOf(1));
        com.tinder.managers.a.a(sparksevent);
    }
}
