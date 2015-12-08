// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.android.volley.r;
import com.androidquery.callback.BitmapAjaxCallback;
import com.bumptech.glide.a;
import com.bumptech.glide.d;
import com.bumptech.glide.g;
import com.bumptech.glide.j;
import com.bumptech.glide.load.engine.b;
import com.cardinalblue.android.b.i;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.activities.EchoesListActivity;
import com.cardinalblue.android.piccollage.activities.HomeActivity;
import com.cardinalblue.android.piccollage.activities.PicProfileActivity;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import org.json.JSONException;

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            a

public class e extends com.cardinalblue.android.piccollage.view.a
{

    public ImageView b;
    public TextView c;
    public TextView d;
    public ImageView e;
    public ToggleButton f;
    public View g;
    public View h;
    public ImageView i;
    public TextView j;
    public TextView k;
    public ImageView l;
    public TextView m;
    public TextView n;
    private final com.cardinalblue.android.piccollage.view.a.d.a o;
    private final String p;

    public e(Context context, View view, String s, com.cardinalblue.android.piccollage.view.a.d.a a1)
    {
        super(context, view);
        o = a1;
        p = s;
        b = (ImageView)view.findViewById(0x7f100180);
        c = (TextView)view.findViewById(0x7f100183);
        d = (TextView)view.findViewById(0x7f100184);
        e = (ImageView)view.findViewById(0x7f10016d);
        f = (ToggleButton)view.findViewById(0x7f100181);
        g = view.findViewById(0x7f1000ea);
        h = view.findViewById(0x7f100182);
        i = (ImageView)view.findViewById(0x7f10017e);
        j = (TextView)view.findViewById(0x7f1000ee);
        k = (TextView)view.findViewById(0x7f1000ef);
        l = (ImageView)view.findViewById(0x7f10017f);
        m = (TextView)view.findViewById(0x7f1000f0);
        n = (TextView)view.findViewById(0x7f1000f1);
    }

    static com.cardinalblue.android.piccollage.view.a.d.a a(e e1)
    {
        return e1.o;
    }

    private void a(int i1)
    {
        a(i1, i, j, k, 0x7f080007);
    }

    private void a(int i1, ImageView imageview, TextView textview, TextView textview1, int j1)
    {
        boolean flag1 = false;
        boolean flag;
        int k1;
        if (i1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (imageview != null)
        {
            if (flag)
            {
                k1 = 0;
            } else
            {
                k1 = 8;
            }
            imageview.setVisibility(k1);
        }
        if (textview != null)
        {
            textview.setText(com.cardinalblue.android.b.i.a(i1));
            if (flag)
            {
                k1 = 0;
            } else
            {
                k1 = 8;
            }
            textview.setVisibility(k1);
        }
        if (textview1 != null)
        {
            textview1.setText(textview1.getResources().getQuantityString(j1, i1));
            if (flag)
            {
                i1 = ((flag1) ? 1 : 0);
            } else
            {
                i1 = 8;
            }
            textview1.setVisibility(i1);
        }
    }

    static void a(e e1, int i1)
    {
        e1.a(i1);
    }

    static String b(e e1)
    {
        return e1.p;
    }

    private void b(int i1)
    {
        a(i1, l, m, n, 0x7f080009);
    }

    static void b(e e1, int i1)
    {
        e1.b(i1);
    }

    public void a(int i1, WebPhoto webphoto)
    {
        itemView.setOnClickListener(new android.view.View.OnClickListener(i1) {

            final int a;
            final e b;

            public void onClick(View view)
            {
                if (com.cardinalblue.android.piccollage.view.e.a(b) != null)
                {
                    com.cardinalblue.android.piccollage.view.e.a(b).a(view, a);
                }
            }

            
            {
                b = e.this;
                a = i1;
                super();
            }
        });
        Object obj = new android.view.View.OnClickListener(webphoto) {

            final WebPhoto a;
            final e b;

            public void onClick(View view)
            {
                if (a != null) goto _L2; else goto _L1
_L1:
                return;
_L2:
                Object obj1;
                switch (view.getId())
                {
                default:
                    return;

                case 2131755242: 
                    if (a.getLikeNum() > 0 || a.getEchoesNum() > 0)
                    {
                        Intent intent = new Intent(view.getContext(), com/cardinalblue/android/piccollage/activities/EchoesListActivity);
                        intent.putExtra("extra_webphoto", a);
                        intent.putExtra("start_from", com.cardinalblue.android.piccollage.view.e.b(b));
                        view.getContext().startActivity(intent);
                        return;
                    }
                    break;

                case 2131755392: 
                case 2131755394: 
                    obj1 = a.getUser();
                    continue; /* Loop/switch isn't completed */
                }
                if (true) goto _L1; else goto _L3
_L3:
                if (obj1 == null) goto _L1; else goto _L4
_L4:
                Intent intent1;
                if (((PicUser) (obj1)).equals(PicAuth.h().i()))
                {
                    intent1 = new Intent(view.getContext(), com/cardinalblue/android/piccollage/activities/HomeActivity);
                    intent1.setAction("piccollage.intent.action.VIEW_PROFILE");
                } else
                {
                    intent1 = new Intent(view.getContext(), com/cardinalblue/android/piccollage/activities/PicProfileActivity);
                }
                intent1.putExtra("user", ((android.os.Parcelable) (obj1)));
                obj1 = (Activity)view.getContext();
                ActivityCompat.startActivity(((Activity) (obj1)), intent1, ActivityOptionsCompat.makeSceneTransitionAnimation(((Activity) (obj1)), b.b, view.getContext().getString(0x7f0703aa)).toBundle());
                return;
            }

            
            {
                b = e.this;
                a = webphoto;
                super();
            }
        };
        if (b != null)
        {
            b.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        }
        if (g != null)
        {
            g.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        }
        if (h != null)
        {
            h.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        }
        a(webphoto.getLikeNum());
        b(webphoto.getEchoesNum());
        if (c != null)
        {
            c.setText(webphoto.getUser().getDisplayName());
        }
        if (d != null)
        {
            obj = DateUtils.getRelativeTimeSpanString(webphoto.getCreatedTime() * 1000L, System.currentTimeMillis(), 1000L);
            d.setText(((CharSequence) (obj)));
        }
        obj = webphoto.getUser();
        if (b != null)
        {
            com.bumptech.glide.g.b(a).a(((PicUser) (obj)).getProfileImageUrl()).l().a(b.a).a(0x7f020224).b(0x7f020224).d().a(b);
        }
        obj = webphoto.getLargeImageUrl();
        obj = ((BitmapAjaxCallback)((BitmapAjaxCallback)((BitmapAjaxCallback)(new BitmapAjaxCallback()).a(((String) (obj)))).b(false)).a(true)).e(0x7f020229).a(com.cardinalblue.android.piccollage.helpers.a.a(0x7f020229));
        (new com.androidquery.a(e)).a(((BitmapAjaxCallback) (obj)));
        if (f != null)
        {
            f.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

                final e a;

                public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
                {
                }

            
            {
                a = e.this;
                super();
            }
            });
            f.setChecked(webphoto.isLiked());
            f.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(webphoto) {

                final WebPhoto a;
                final e b;

                public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
                {
                    if (!com.cardinalblue.android.b.k.b(compoundbutton.getContext()))
                    {
                        com.cardinalblue.android.b.k.a(compoundbutton.getContext(), 0x7f07021d, 0);
                    } else
                    if (a != null)
                    {
                        String s;
                        String s1;
                        if (!a.isLiked())
                        {
                            com.cardinalblue.android.piccollage.a.f.a(compoundbutton.getContext(), a.getId());
                            com.cardinalblue.android.piccollage.a.b.a(com.cardinalblue.android.piccollage.view.e.b(b), "0");
                        } else
                        {
                            com.cardinalblue.android.piccollage.a.b.g(com.cardinalblue.android.piccollage.view.e.b(b));
                        }
                        a.toggleIsLiked();
                        b.f.setChecked(a.isLiked());
                        com.cardinalblue.android.piccollage.view.e.a(b, a.getLikeNum());
                        com.cardinalblue.android.piccollage.view.e.b(b, a.getEchoesNum());
                        s = a.getId();
                        com.cardinalblue.android.piccollage.lib.i.a(compoundbutton.getContext()).a(s);
                        s1 = a.getId();
                        com.cardinalblue.android.piccollage.controller.network.f.a(compoundbutton.getContext(), s1, a.isLiked(), s, new com.android.volley.m.b(this) {

                            final _cls4 a;

                            public volatile void a(Object obj)
                            {
                                a((String)obj);
                            }

                            public void a(String s)
                            {
                                try
                                {
                                    s = com.cardinalblue.android.piccollage.controller.network.f.b(s);
                                    if (a.a.equals(s))
                                    {
                                        a.a.setLikeNum(a.a.getLikeNum());
                                        a.a.setIsLiked(a.a.isLiked());
                                    }
                                    return;
                                }
                                // Misplaced declaration of an exception variable
                                catch (String s)
                                {
                                    com.cardinalblue.android.piccollage.a.f.a(s);
                                }
                            }

            
            {
                a = _pcls4;
                super();
            }
                        }, new com.android.volley.m.a(this, compoundbutton) {

                            final CompoundButton a;
                            final _cls4 b;

                            public void a(r r)
                            {
                                com.cardinalblue.android.b.k.a(a.getContext(), 0x7f0701f8, 0);
                                b.a.toggleIsLiked();
                                b.b.f.setChecked(b.a.isLiked());
                                com.cardinalblue.android.piccollage.view.e.a(b.b, b.a.getLikeNum());
                            }

            
            {
                b = _pcls4;
                a = compoundbutton;
                super();
            }
                        });
                        return;
                    }
                }

            
            {
                b = e.this;
                a = webphoto;
                super();
            }
            });
        }
    }
}
