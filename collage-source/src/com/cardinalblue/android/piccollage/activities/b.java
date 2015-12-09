// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v7.widget.CBluePopupMenu;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import bolts.j;
import com.android.volley.r;
import com.bumptech.glide.a;
import com.bumptech.glide.g;
import com.cardinalblue.android.b.i;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.auth.PicLoginActivity;
import com.cardinalblue.android.piccollage.controller.a.p;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.gson.PicUser;
import com.cardinalblue.android.piccollage.model.k;
import com.cardinalblue.android.piccollage.view.a.x;
import com.cardinalblue.android.piccollage.view.fragments.aa;
import com.cardinalblue.android.piccollage.view.fragments.ab;
import com.cardinalblue.android.piccollage.view.fragments.ac;
import com.cardinalblue.android.piccollage.view.fragments.e;
import com.cardinalblue.android.piccollage.view.fragments.h;
import com.cardinalblue.android.piccollage.view.fragments.s;
import java.io.File;
import java.util.concurrent.Callable;
import org.json.JSONException;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PicUsersListActivity, CropImageActivity, AbsDrawerActivity, RemixableListActivity

public class b extends Fragment
    implements android.support.v4.view.ViewPager.OnPageChangeListener, android.view.View.OnClickListener, com.cardinalblue.android.piccollage.controller.a.p.a, s
{

    private ViewPager a;
    private PicUser b;
    private ProgressBar c;
    private TextView d;
    private TextView e;
    private View f;
    private View g;
    private TextView h;
    private ColorStateList i;
    private ColorStateList j;
    private p k;
    private ImageView l;
    private View m;
    private x n;
    private Fragment o;
    private Uri p;
    private MenuItem q;
    private MenuItem r;
    private View s;
    private MenuItem t;

    public b()
    {
        o = null;
    }

    private Uri a(Intent intent)
    {
        Uri uri2;
        uri2 = p;
        p = null;
        if (intent == null) goto _L2; else goto _L1
_L1:
        Uri uri = intent.getData();
        if (uri == null) goto _L4; else goto _L3
_L3:
        intent = uri;
_L9:
        return intent;
_L4:
        if (!intent.hasExtra("data")) goto _L2; else goto _L5
_L5:
        intent = (Bitmap)intent.getExtras().get("data");
        if (intent == null) goto _L2; else goto _L6
_L6:
        intent = Uri.fromFile(com.cardinalblue.android.piccollage.model.k.a(intent, "png"));
        return intent;
        intent;
        com.cardinalblue.android.piccollage.a.f.a(intent);
_L2:
        if (uri2 != null)
        {
            MediaScannerConnection.scanFile(getActivity(), new String[] {
                uri2.getPath()
            }, null, null);
            return uri2;
        }
        break; /* Loop/switch isn't completed */
        intent;
        com.cardinalblue.android.piccollage.a.f.a(intent);
        if (true) goto _L2; else goto _L7
_L7:
        com.cardinalblue.android.piccollage.a.f.a(new com.cardinalblue.android.piccollage.model.k.a("PicProfileFragment No Photo From Camera"));
        Uri uri1 = h();
        intent = uri1;
        if (uri1 == null)
        {
            return null;
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    static Uri a(b b1, Uri uri)
    {
        b1.p = uri;
        return uri;
    }

    static p a(b b1)
    {
        return b1.k;
    }

    private void a(int i1)
    {
        i1;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 152
    //                   1 110;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_152;
_L4:
        Bundle bundle = new Bundle();
        bundle.putInt("type", i1);
        bundle.putString("user_name", b.getDisplayName());
        Object obj;
        if (i1 == 1)
        {
            obj = "users/%s/followers";
        } else
        {
            obj = "users/%s/followed_users";
        }
        bundle.putString("user_list_path", String.format(((String) (obj)), new Object[] {
            b.getId()
        }));
        obj = new Intent(getActivity(), com/cardinalblue/android/piccollage/activities/PicUsersListActivity);
        ((Intent) (obj)).putExtras(bundle);
        startActivity(((Intent) (obj)));
        return;
_L3:
        if (b.isMe())
        {
            com.cardinalblue.android.piccollage.a.b.Q(String.valueOf(b.getFollowersCount()));
        } else
        {
            com.cardinalblue.android.piccollage.a.b.Y(String.valueOf(b.getFollowersCount()));
        }
          goto _L4
        if (b.isMe())
        {
            com.cardinalblue.android.piccollage.a.b.P(String.valueOf(b.getFollowingCount()));
        } else
        {
            com.cardinalblue.android.piccollage.a.b.X(String.valueOf(b.getFollowingCount()));
        }
          goto _L4
    }

    private void a(View view)
    {
        i = getResources().getColorStateList(0x7f0f0126);
        j = getResources().getColorStateList(0x7f0f0127);
        e = (TextView)view.findViewById(0x7f10019e);
        d = (TextView)view.findViewById(0x7f1001a1);
        c = (ProgressBar)view.findViewById(0x7f10019b);
        g = view.findViewById(0x7f10019d);
        f = view.findViewById(0x7f1001a0);
        h = (TextView)view.findViewById(0x7f10019c);
        g.setOnClickListener(new android.view.View.OnClickListener() {

            final b a;

            public void onClick(View view1)
            {
                com.cardinalblue.android.piccollage.activities.b.a(a, 0);
            }

            
            {
                a = b.this;
                super();
            }
        });
        f.setOnClickListener(new android.view.View.OnClickListener() {

            final b a;

            public void onClick(View view1)
            {
                com.cardinalblue.android.piccollage.activities.b.a(a, 1);
            }

            
            {
                a = b.this;
                super();
            }
        });
        h.setOnClickListener(this);
        Object obj = null;
        view = obj;
        if (getArguments() != null)
        {
            view = obj;
            if (getArguments().containsKey("user"))
            {
                view = (PicUser)getArguments().getParcelable("user");
            }
        }
        b(view);
    }

    static void a(b b1, int i1)
    {
        b1.a(i1);
    }

    static void a(b b1, PicUser picuser)
    {
        b1.b(picuser);
    }

    static void a(b b1, boolean flag)
    {
        b1.b(flag);
    }

    private void a(boolean flag)
    {
        String s1;
        if (flag)
        {
            s1 = "success";
        } else
        {
            s1 = "fail";
        }
        com.cardinalblue.android.piccollage.a.b.U(s1);
        if (flag)
        {
            com.cardinalblue.android.piccollage.a.b.aM();
        }
    }

    static TextView b(b b1)
    {
        return b1.h;
    }

    private void b()
    {
        if (getActivity() == null)
        {
            return;
        }
        b(b.getProfileImageUrl());
        if (b != null && b.isValid())
        {
            h.setVisibility(0);
            getActivity().setTitle(b.getDisplayName());
            if (b.isMe())
            {
                h.setText("");
                h.setBackgroundResource(0x7f020283);
            } else
            if (b.isFollowing().booleanValue())
            {
                h.setText(0x7f07023d);
                h.setTextColor(j);
                h.setBackgroundResource(0x7f020286);
            } else
            {
                h.setText(0x7f07023c);
                h.setTextColor(i);
                h.setBackgroundResource(0x7f020285);
            }
        } else
        {
            h.setVisibility(8);
            getActivity().setTitle(getString(0x7f07023a));
        }
        if (b == null || !b.isValid())
        {
            g.setVisibility(4);
            f.setVisibility(4);
            return;
        }
        int i1 = b.getFollowersCount();
        int j1 = b.getFollowingCount();
        if (i1 > 0)
        {
            f.setVisibility(0);
            d.setText(com.cardinalblue.android.b.i.a(i1));
        } else
        {
            f.setVisibility(4);
        }
        if (j1 > 0)
        {
            g.setVisibility(0);
            e.setText(com.cardinalblue.android.b.i.a(j1));
            return;
        } else
        {
            g.setVisibility(4);
            return;
        }
    }

    private void b(View view)
    {
        n = new x(getActivity(), getChildFragmentManager());
        Bundle bundle = new Bundle();
        bundle.putString("user_id", b.getId());
        n.a(getString(0x7f070235), com/cardinalblue/android/piccollage/view/fragments/ac.getName(), bundle, "pic_user_posts_fragment");
        n.a(getString(0x7f0700eb), com/cardinalblue/android/piccollage/view/fragments/aa.getName(), bundle, "pic_user_echoes_fragment");
        n.a(getString(0x7f0701f9), com/cardinalblue/android/piccollage/view/fragments/ab.getName(), bundle, "pic_user_likes_fragment");
        a = (ViewPager)view.findViewById(0x7f1000d9);
        a.setAdapter(n);
        a.setOffscreenPageLimit(2);
        view = (TabLayout)view.findViewById(0x7f1000db);
        int i1 = getResources().getColor(0x7f0f00fe);
        view.setTabTextColors(i1, i1);
        view.setupWithViewPager(a);
        a.addOnPageChangeListener(new android.support.design.widget.TabLayout.TabLayoutOnPageChangeListener(view));
        a.addOnPageChangeListener(this);
        bolts.j.a(new Callable() {

            final b a;

            public Void a()
                throws Exception
            {
                a.onPageSelected(0);
                return null;
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                a = b.this;
                super();
            }
        }, com.cardinalblue.android.b.k.a);
    }

    private void b(PicUser picuser)
    {
        if (picuser == null)
        {
            b = new PicUser();
            return;
        }
        b = picuser;
        if (!picuser.isMe()) goto _L2; else goto _L1
_L1:
        PicAuth.h().c(picuser.toJSONString());
        com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.model.gson.PicUser.PicUserDataChangedEvent());
_L4:
        b();
        return;
_L2:
        if (picuser.isPrivate() || picuser.isBlocked())
        {
            f();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b(String s1)
    {
        com.bumptech.glide.g.a(getActivity()).a(s1).l().b(0x7f020224).a(0x7f020224).a(com.bumptech.glide.load.engine.b.a).d().a(l);
    }

    private void b(boolean flag)
    {
        h.setEnabled(false);
        com.cardinalblue.android.piccollage.model.gson.PicUser.PicRelation picrelation;
        int i1;
        if (flag)
        {
            picrelation = com.cardinalblue.android.piccollage.model.gson.PicUser.PicRelation.FOLLOWING;
        } else
        {
            picrelation = com.cardinalblue.android.piccollage.model.gson.PicUser.PicRelation.UNFOLLOW;
        }
        i1 = b.getFollowersCount();
        if (flag)
        {
            i1++;
        } else
        {
            i1--;
        }
        com.cardinalblue.android.piccollage.a.i.a(b.getId(), picrelation, "other_profile").a(new bolts.i() {

            final b a;

            public Void a(j j1)
                throws Exception
            {
                if (j1.d() || j1.c())
                {
                    if (j1.f() instanceof com.cardinalblue.android.piccollage.auth.PicAuth.a)
                    {
                        j1 = new Intent(a.getActivity(), com/cardinalblue/android/piccollage/auth/PicLoginActivity);
                        j1.putExtra("from", "other_profile");
                        a.startActivityForResult(j1, 103);
                    } else
                    {
                        com.cardinalblue.android.b.k.a(a.getActivity(), 0x7f0700f8, 1);
                    }
                }
                com.cardinalblue.android.piccollage.activities.b.e(a);
                return null;
            }

            public Object then(j j1)
                throws Exception
            {
                return a(j1);
            }

            
            {
                a = b.this;
                super();
            }
        }, com.cardinalblue.android.b.k.a);
        b.setIsFollowing(flag);
        b.setFollowersCount(i1);
        b();
    }

    private void c()
    {
        if (b == null || TextUtils.isEmpty(b.getId()))
        {
            return;
        } else
        {
            com.cardinalblue.android.piccollage.controller.network.f.b(getActivity(), b.getId(), new com.android.volley.m.b() {

                final b a;

                public volatile void a(Object obj)
                {
                    a((String)obj);
                }

                public void a(String s1)
                {
                    if (com.cardinalblue.android.piccollage.activities.b.a(a) != null && (com.cardinalblue.android.piccollage.activities.b.a(a).getStatus() == android.os.AsyncTask.Status.RUNNING || com.cardinalblue.android.piccollage.activities.b.a(a).getStatus() == android.os.AsyncTask.Status.PENDING))
                    {
                        return;
                    }
                    try
                    {
                        com.cardinalblue.android.piccollage.activities.b.a(a, com.cardinalblue.android.piccollage.controller.network.f.u(s1));
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s1)
                    {
                        com.cardinalblue.android.piccollage.a.f.a(s1);
                    }
                    b.b(a).setEnabled(true);
                }

            
            {
                a = b.this;
                super();
            }
            }, new com.android.volley.m.a() {

                final b a;

                public void a(r r1)
                {
                    com.cardinalblue.android.piccollage.controller.network.f.a(r1);
_L2:
                    b.b(a).setEnabled(true);
                    return;
                    r1;
                    b.c(a);
                    com.cardinalblue.android.piccollage.activities.b.d(a).setBlocked(true);
                    if (a.getActivity() != null)
                    {
                        a.getActivity().invalidateOptionsMenu();
                    }
                    continue; /* Loop/switch isn't completed */
                    r1;
                    com.cardinalblue.android.b.k.a(a.getActivity(), 0x7f0700f8, 1);
                    if (true) goto _L2; else goto _L1
_L1:
                }

            
            {
                a = b.this;
                super();
            }
            });
            return;
        }
    }

    static void c(b b1)
    {
        b1.f();
    }

    private void c(boolean flag)
    {
        if (r != null)
        {
            View view = MenuItemCompat.getActionView(r).findViewById(0x7f1000bb);
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 4;
            }
            view.setVisibility(i1);
        }
    }

    static PicUser d(b b1)
    {
        return b1.b;
    }

    private void d()
    {
        ViewCompat.animate(s).alpha(1.0F).scaleX(1.0F).scaleY(1.0F).start();
    }

    private void e()
    {
        ViewCompat.animate(s).alpha(0.0F).scaleX(0.0F).scaleY(0.0F).start();
    }

    static void e(b b1)
    {
        b1.c();
    }

    static Uri f(b b1)
    {
        return b1.p;
    }

    private void f()
    {
        m.findViewById(0x7f1001b0).setVisibility(0);
        m.findViewById(0x7f1000da).setVisibility(4);
    }

    static MenuItem g(b b1)
    {
        return b1.r;
    }

    private void g()
    {
        h h1 = a("pic_user_posts_fragment");
        if (h1 != null)
        {
            h1.a(b.getId());
        }
        h1 = a("pic_user_echoes_fragment");
        if (h1 != null)
        {
            h1.a(b.getId());
        }
        h1 = a("pic_user_likes_fragment");
        if (h1 != null)
        {
            h1.a(b.getId());
        }
    }

    private Uri h()
    {
        Cursor cursor = getActivity().getContentResolver().query(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[] {
            "_id", "_data"
        }, null, null, "_id DESC");
        int i1;
        if (cursor.moveToFirst())
        {
            if ((i1 = cursor.getColumnIndex("_data")) != -1)
            {
                String s1 = cursor.getString(i1);
                cursor.close();
                return Uri.fromFile(new File(s1));
            }
        }
        return null;
    }

    private void i()
    {
        com.cardinalblue.android.b.k.a(getActivity(), com.cardinalblue.android.piccollage.view.fragments.e.a(getString(0x7f070107), getString(0x7f070106), getString(0x7f0702c6), new android.content.DialogInterface.OnClickListener() {

            final b a;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                com.cardinalblue.android.b.k.a(a.getActivity(), new Callable(this) {

                    final _cls4 a;

                    public Void a()
                        throws Exception
                    {
                        if (!com.cardinalblue.android.piccollage.activities.b.d(a.a).isBlocked())
                        {
                            com.cardinalblue.android.piccollage.controller.network.f.w(com.cardinalblue.android.piccollage.activities.b.d(a.a).getId());
                        }
                        return null;
                    }

                    public Object call()
                        throws Exception
                    {
                        return a();
                    }

            
            {
                a = _pcls4;
                super();
            }
                }, a.getString(0x7f070105)).c(new bolts.i(this) {

                    final _cls4 a;

                    public Object then(j j1)
                        throws Exception
                    {
                        j1 = com.cardinalblue.android.piccollage.activities.b.d(a.a);
                        boolean flag;
                        if (!com.cardinalblue.android.piccollage.activities.b.d(a.a).isBlocked())
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        j1.setBlocked(flag);
                        com.cardinalblue.android.piccollage.activities.b.e(a.a);
                        if (a.a.getActivity() != null)
                        {
                            a.a.getActivity().invalidateOptionsMenu();
                        }
                        return null;
                    }

            
            {
                a = _pcls4;
                super();
            }
                }, j.b);
            }

            
            {
                a = b.this;
                super();
            }
        }, getString(0x7f07010f), null), "dialog_block_user");
    }

    public h a(String s1)
    {
        return (h)getChildFragmentManager().findFragmentByTag(s1);
    }

    public void a()
    {
        a(false);
        com.cardinalblue.android.b.k.a(getActivity(), 0x7f0700f8, 1);
        b();
        c.setVisibility(8);
    }

    protected void a(Uri uri)
    {
        Intent intent = new Intent(getActivity(), com/cardinalblue/android/piccollage/activities/CropImageActivity);
        intent.setData(uri);
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("output", com.cardinalblue.android.piccollage.model.k.a("Photo", "jpg").getPath());
        startActivityForResult(intent, 109);
    }

    public void a(Fragment fragment, Intent intent, int i1, Bundle bundle)
    {
        o = fragment;
        ActivityCompat.startActivityForResult(getActivity(), intent, i1, bundle);
    }

    public void a(PicUser picuser)
    {
        a(true);
        com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.model.gson.PicUser.PicUserDataChangedEvent());
        b(picuser);
        c.setVisibility(8);
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (o == null) goto _L2; else goto _L1
_L1:
        o.onActivityResult(i1, j1, intent);
        o = null;
_L10:
        return;
_L2:
        i1;
        JVM INSTR lookupswitch 6: default 84
    //                   107: 211
    //                   108: 123
    //                   109: 137
    //                   110: 196
    //                   999: 92
    //                   1000: 92;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L8
_L4:
        continue; /* Loop/switch isn't completed */
_L3:
        super.onActivityResult(i1, j1, intent);
        return;
_L8:
        if (j1 != -1 || !(getActivity() instanceof AbsDrawerActivity)) goto _L10; else goto _L9
_L9:
        ((AbsDrawerActivity)getActivity()).a(0x7f1002de, null);
        return;
_L5:
        if (j1 != -1) goto _L10; else goto _L11
_L11:
        a(intent.getData());
        return;
_L6:
        if (j1 != -1) goto _L10; else goto _L12
_L12:
        intent = intent.getStringExtra("output");
        b(intent);
        c.setVisibility(0);
        k = new p(getActivity(), this);
        k.a(new String[] {
            intent
        });
        return;
_L7:
        if (j1 != -1) goto _L10; else goto _L13
_L13:
        a(a(intent));
        return;
        if (j1 != -1) goto _L10; else goto _L14
_L14:
        i();
        return;
    }

    public void onBadgeNumberChange(AbsDrawerActivity.OnBadgeNumberChangeEvent onbadgenumberchangeevent)
    {
        c(onbadgenumberchangeevent.a);
    }

    public void onClick(View view)
    {
        if (b != null && b.isValid()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (b.isMe())
        {
            break; /* Loop/switch isn't completed */
        }
        com.cardinalblue.android.piccollage.a.b.Z(String.valueOf(b.isFollowing()));
        switch (view.getId())
        {
        case 2131755419: 
        default:
            return;

        case 2131755418: 
            if (!b.isFollowing().booleanValue())
            {
                view = com.cardinalblue.android.piccollage.view.fragments.e.a(null, getString(0x7f0701b3, new Object[] {
                    b.getDisplayName()
                }), getString(0x104000a), new android.content.DialogInterface.OnClickListener() {

                    final b a;

                    public void onClick(DialogInterface dialoginterface, int i1)
                    {
                        com.cardinalblue.android.piccollage.activities.b.a(a, true);
                    }

            
            {
                a = b.this;
                super();
            }
                }, getString(0x1040009), null);
                com.cardinalblue.android.b.k.a(getActivity(), view, "confirm_follow");
                return;
            }
            break;

        case 2131755420: 
            if (!b.isFollowing().booleanValue())
            {
                b(true);
                return;
            } else
            {
                b(false);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (PicAuth.h().b())
        {
            view = "yes";
        } else
        {
            view = "no";
        }
        com.cardinalblue.android.piccollage.a.b.T(view);
        view = com.cardinalblue.android.piccollage.view.fragments.e.a(getString(0x7f070138), "", getString(0x7f070136), new android.content.DialogInterface.OnClickListener() {

            final b a;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                dialoginterface = new Intent("android.intent.action.PICK");
                dialoginterface.setType("image/*");
                a.startActivityForResult(dialoginterface, 108);
            }

            
            {
                a = b.this;
                super();
            }
        }, getString(0x7f070137), new android.content.DialogInterface.OnClickListener() {

            final b a;

            public void onClick(DialogInterface dialoginterface, int i1)
            {
                dialoginterface = new Intent("android.media.action.IMAGE_CAPTURE");
                if (!com.cardinalblue.android.b.e.a)
                {
                    com.cardinalblue.android.piccollage.activities.b.a(a, Uri.fromFile(com.cardinalblue.android.piccollage.model.k.a("Photo", "jpg")));
                    dialoginterface.putExtra("output", com.cardinalblue.android.piccollage.activities.b.f(a));
                }
                try
                {
                    a.startActivityForResult(dialoginterface, 110);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (DialogInterface dialoginterface)
                {
                    com.cardinalblue.android.b.k.a(a.getActivity(), 0x7f0701e1, 0);
                }
            }

            
            {
                a = b.this;
                super();
            }
        });
        com.cardinalblue.android.b.k.a(getActivity(), view, "choose_avatar_source");
        return;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f110019, menu);
        q = menu.findItem(0x7f1002f9);
        r = menu.findItem(0x7f1002ed);
        t = menu.findItem(0x7f1002f1);
        MenuItemCompat.getActionView(r).setOnClickListener(new android.view.View.OnClickListener() {

            final b a;

            public void onClick(View view)
            {
                a.getActivity().onOptionsItemSelected(com.cardinalblue.android.piccollage.activities.b.g(a));
            }

            
            {
                a = b.this;
                super();
            }
        });
        c(com.cardinalblue.android.b.k.g());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        m = layoutinflater.inflate(0x7f030038, viewgroup, false);
        l = (ImageView)m.findViewById(0x7f10019a);
        l.setOnClickListener(this);
        a(m);
        b(m);
        if (b.isMe())
        {
            com.cardinalblue.android.piccollage.a.b.O(String.valueOf(b.getCollagesCount()));
        } else
        {
            com.cardinalblue.android.piccollage.a.b.aP();
        }
        setHasOptionsMenu(true);
        s = m.findViewById(0x7f1000dd);
        s.setOnClickListener(new android.view.View.OnClickListener() {

            final b a;

            public void onClick(View view)
            {
                com.cardinalblue.android.piccollage.a.b.bP();
                view = new CBluePopupMenu(a.getActivity(), view, 0x800055);
                view.setOnDismissListener(new android.support.v7.widget.CBluePopupMenu.OnDismissListener(this) {

                    final _cls1 a;

                    public void onDismiss(CBluePopupMenu cbluepopupmenu)
                    {
                        com.cardinalblue.android.piccollage.controller.d.a().c(new HomeActivity.OnPopupMenuEvent(false));
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
                view.inflate(0x7f11000c);
                view.setOnMenuItemClickListener(new android.support.v7.widget.CBluePopupMenu.OnMenuItemClickListener(this) {

                    final _cls1 a;

                    public boolean onMenuItemClick(MenuItem menuitem)
                    {
                        com.cardinalblue.android.piccollage.controller.d.a().c(new HomeActivity.OnPopupMenuEvent(false));
                        switch (menuitem.getItemId())
                        {
                        default:
                            return false;

                        case 2131755759: 
                            com.cardinalblue.android.piccollage.a.b.a("profile page : floating button");
                            com.cardinalblue.android.piccollage.a.b.bR();
                            com.cardinalblue.android.piccollage.a.b.aM("empty");
                            a.a.startActivityForResult(Collage.a(a.a.getActivity()), 999);
                            return true;

                        case 2131755758: 
                            com.cardinalblue.android.piccollage.a.b.bQ();
                            menuitem = new Intent(a.a.getActivity(), com/cardinalblue/android/piccollage/activities/RemixableListActivity);
                            a.a.startActivityForResult(menuitem, 1000);
                            return true;

                        case 2131755760: 
                            com.cardinalblue.android.piccollage.a.b.bS();
                            break;
                        }
                        com.cardinalblue.android.piccollage.a.b.aM("grid");
                        menuitem = Collage.a(a.a.getActivity());
                        menuitem.putExtra("extra_grid_flow", true);
                        a.a.startActivityForResult(menuitem, 999);
                        return true;
                    }

            
            {
                a = _pcls1;
                super();
            }
                });
                com.cardinalblue.android.piccollage.controller.d.a().c(new HomeActivity.OnPopupMenuEvent(true));
                view.show();
            }

            
            {
                a = b.this;
                super();
            }
        });
        return m;
    }

    public void onDestroy()
    {
        try
        {
            com.bumptech.glide.g.a(getActivity()).f();
        }
        catch (Throwable throwable)
        {
            com.cardinalblue.android.piccollage.a.f.a(throwable);
        }
        super.onDestroy();
    }

    public void onDestroyView()
    {
        a.clearOnPageChangeListeners();
        super.onDestroyView();
    }

    public void onLoginResult(com.cardinalblue.android.piccollage.auth.PicAuth.PicLoginResultEvent picloginresultevent)
    {
        if (picloginresultevent.a() == com.cardinalblue.android.piccollage.auth.PicAuth.PicLoginResultEvent.a.a && !b.isValid())
        {
            b(PicAuth.h().i());
            c();
            g();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag1 = true;
        menuitem.getItemId();
        JVM INSTR tableswitch 2131755769 2131755769: default 28
    //                   2131755769 36;
           goto _L1 _L2
_L1:
        boolean flag = super.onOptionsItemSelected(menuitem);
_L4:
        return flag;
_L2:
        flag = flag1;
        if (b != null)
        {
            flag = flag1;
            if (!b.isMe())
            {
                menuitem = PicAuth.h();
                if (!b.isValid() || !menuitem.b())
                {
                    menuitem = new Intent(getActivity(), com/cardinalblue/android/piccollage/auth/PicLoginActivity);
                    menuitem.putExtra("from", "other_profile");
                    startActivityForResult(menuitem, 107);
                    return true;
                } else
                {
                    i();
                    return true;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onPageScrollStateChanged(int i1)
    {
    }

    public void onPageScrolled(int i1, float f1, int j1)
    {
    }

    public void onPageSelected(int i1)
    {
        i1;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 49
    //                   1 99
    //                   2 125;
           goto _L1 _L2 _L3 _L4
_L1:
        com.cardinalblue.android.piccollage.view.fragments.i j1;
        j1 = (com.cardinalblue.android.piccollage.view.fragments.i)n.instantiateItem(a, i1);
        if (j1 == null)
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (b.isMe())
        {
            com.cardinalblue.android.piccollage.a.b.S(String.valueOf(b.getCollagesCount()));
            d();
        } else
        {
            com.cardinalblue.android.piccollage.a.b.V(String.valueOf(b.getCollagesCount()));
            e();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (b.isMe())
        {
            com.cardinalblue.android.piccollage.a.b.aL();
        } else
        {
            com.cardinalblue.android.piccollage.a.b.aQ();
        }
        e();
        continue; /* Loop/switch isn't completed */
_L4:
        if (b.isMe())
        {
            com.cardinalblue.android.piccollage.a.b.R(String.valueOf(b.getLikedCollagesCount()));
        } else
        {
            com.cardinalblue.android.piccollage.a.b.W(String.valueOf(b.getLikedCollagesCount()));
        }
        e();
        if (true) goto _L1; else goto _L5
_L5:
        j1.a(this);
        if (!TextUtils.isEmpty(b.getId()))
        {
            j1.a(true);
            return;
        } else
        {
            j1.d();
            return;
        }
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        boolean flag1 = true;
        menu = q;
        boolean flag;
        if (b.isValid() && !b.isMe() && !b.isBlocked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menu.setVisible(flag);
        r.setVisible(b.isMe());
        if (getActivity() == null)
        {
            return;
        }
        menu = t;
        if (!((AbsDrawerActivity)getActivity()).h())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        menu.setVisible(flag);
    }

    public void onStart()
    {
        super.onStart();
        c();
        com.cardinalblue.android.piccollage.controller.d.b(this);
        try
        {
            com.bumptech.glide.g.a(getActivity()).d();
            return;
        }
        catch (Throwable throwable)
        {
            com.cardinalblue.android.piccollage.a.f.a(throwable);
        }
    }

    public void onStop()
    {
        super.onStop();
        com.cardinalblue.android.piccollage.controller.d.a(this);
        try
        {
            com.bumptech.glide.g.a(getActivity()).e();
            return;
        }
        catch (Throwable throwable)
        {
            com.cardinalblue.android.piccollage.a.f.a(throwable);
        }
    }

    public String toString()
    {
        if (b == null)
        {
            return "My Profile";
        }
        if (b.isMe())
        {
            return "My Profile";
        } else
        {
            return "Others Profile Page";
        }
    }
}
