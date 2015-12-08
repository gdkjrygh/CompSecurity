// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.Toast;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.cw;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.s;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.RankedUser;
import com.fitbit.data.domain.User;
import com.fitbit.e.a;
import com.fitbit.friends.ui.ConversationActivity;
import com.fitbit.friends.ui.b;
import com.fitbit.mixpanel.f;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.views.ViewPagerTabIndicator;
import com.fitbit.util.bf;
import com.fitbit.util.z;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.fitbit.settings.ui:
//            UserInformationFragment

public class ProfileActivity extends FitbitActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{
    private static abstract class ProfilePageType extends Enum
    {

        public static final ProfilePageType a;
        public static final ProfilePageType b;
        public static final ProfilePageType c;
        private static final ProfilePageType d[];
        final int titleId;

        public static ProfilePageType valueOf(String s1)
        {
            return (ProfilePageType)Enum.valueOf(com/fitbit/settings/ui/ProfileActivity$ProfilePageType, s1);
        }

        public static ProfilePageType[] values()
        {
            return (ProfilePageType[])d.clone();
        }

        abstract Fragment a(User user, boolean flag);

        static 
        {
        /* block-local class not found */
        class _cls1 {}

            a = new _cls1("BADGES", 0, 0x7f0804b5);
        /* block-local class not found */
        class _cls2 {}

            b = new _cls2("FRIENDS", 1, 0x7f080235);
        /* block-local class not found */
        class _cls3 {}

            c = new _cls3("SETTINGS", 2, 0x7f0804b6);
            d = (new ProfilePageType[] {
                a, b, c
            });
        }

        private ProfilePageType(String s1, int i1, int j1)
        {
            super(s1, i1);
            titleId = j1;
        }

    }

    private static class a extends bf
    {

        private final long a;

        protected User a()
        {
            return s.a(getContext()).b(a);
        }

        protected Object f_()
        {
            return a();
        }

        public a(Context context, long l1)
        {
            super(context);
            a = l1;
        }
    }

    private static final class b extends bf
    {

        private final String a;
        private final long b;

        protected User a()
        {
            RankedUser rankeduser;
            RankedUser rankeduser1;
            if (TextUtils.isEmpty(a))
            {
                rankeduser = s.a(getContext()).a(b);
            } else
            {
                rankeduser = s.a(getContext()).b(a);
            }
            rankeduser1 = rankeduser;
            if (rankeduser == null)
            {
                rankeduser1 = rankeduser;
                if (!TextUtils.isEmpty(a))
                {
                    try
                    {
                        rankeduser1 = s.a(getContext()).c(a);
                    }
                    catch (ServerCommunicationException servercommunicationexception)
                    {
                        com.fitbit.e.a.e(ProfileActivity.e(), "Could not talk to Server regarding the users friend %s", new Object[] {
                            a, servercommunicationexception
                        });
                        return rankeduser;
                    }
                }
            }
            return rankeduser1;
        }

        protected Object f_()
        {
            return a();
        }

        public b(Context context, long l1)
        {
            super(context);
            a = null;
            b = l1;
        }

        public b(Context context, String s1)
        {
            super(context);
            a = s1;
            b = -1L;
        }
    }

    private static final class c extends bf
    {

        protected User a()
        {
            Profile profile;
            try
            {
                dg.d().r(true, null);
                profile = an.a().c();
            }
            catch (Exception exception)
            {
                return null;
            }
            return profile;
        }

        protected Object f_()
        {
            return a();
        }

        public c(Context context)
        {
            super(context);
        }
    }

    private class d extends FragmentPagerAdapter
    {

        final List a;
        Fragment b[];
        final ProfileActivity c;
        private User d;

        public int getCount()
        {
            return a.size();
        }

        public Fragment getItem(int i1)
        {
            Fragment fragment = b[i1];
            if (fragment != null)
            {
                return fragment;
            } else
            {
                b[i1] = ((ProfilePageType)a.get(i1)).a(d, com.fitbit.settings.ui.ProfileActivity.b(c));
                return b[i1];
            }
        }

        public CharSequence getPageTitle(int i1)
        {
            return c.getString(((ProfilePageType)a.get(i1)).titleId);
        }

        public d(FragmentManager fragmentmanager, User user)
        {
            c = ProfileActivity.this;
            super(fragmentmanager);
            b = new Fragment[ProfilePageType.values().length];
            d = user;
            profileactivity = EnumSet.allOf(com/fitbit/settings/ui/ProfileActivity$ProfilePageType);
            fragmentmanager = an.a().b();
            if (fragmentmanager == null || !TextUtils.equals(fragmentmanager.F(), user.F()))
            {
                remove(ProfilePageType.c);
            }
            a = new ArrayList(ProfileActivity.this);
        }
    }


    public static final String a = "ACTION_NEW_INTENT";
    private static final String b = com/fitbit/settings/ui/ProfileActivity.getSimpleName();
    private static final String c = "Social: View Profile";
    private static final String d = "!Type";
    private static final String e = "Personal";
    private static final String f = "Others";
    private static final String g = "Profile";
    private static final String h = "Profile";
    private static final String i = (new StringBuilder()).append(com/fitbit/settings/ui/ProfileActivity.getName()).append(".extra_user").toString();
    private static final String j = (new StringBuilder()).append(com/fitbit/settings/ui/ProfileActivity.getName()).append(".extra_userId").toString();
    private static final String k = (new StringBuilder()).append(com/fitbit/settings/ui/ProfileActivity.getName()).append(".extra_isSelf").toString();
    private static final String l = (new StringBuilder()).append(com/fitbit/settings/ui/ProfileActivity.getName()).append(".extra_invite_id").toString();
    private static final String m = (new StringBuilder()).append(com/fitbit/settings/ui/ProfileActivity.getName()).append(".extra_invite").toString();
    private View n;
    private ViewPagerTabIndicator o;
    private ViewPager p;
    private User q;
    private boolean r;

    public ProfileActivity()
    {
    }

    public static Intent a(Context context)
    {
        return a(context, ((User) (an.a().b())), true);
    }

    public static Intent a(Context context, long l1)
    {
        context = new Intent(context, com/fitbit/settings/ui/ProfileActivity);
        context.putExtra(l, l1);
        context.putExtra(k, false);
        return context;
    }

    public static Intent a(Context context, User user)
    {
        context = new Intent(context, com/fitbit/settings/ui/ProfileActivity);
        context.putExtra(m, user);
        context.putExtra(k, false);
        return context;
    }

    public static Intent a(Context context, User user, boolean flag)
    {
        context = new Intent(context, com/fitbit/settings/ui/ProfileActivity);
        context.putExtra(i, user);
        context.putExtra(k, flag);
        return context;
    }

    public static Intent a(Context context, String s1)
    {
        context = new Intent(context, com/fitbit/settings/ui/ProfileActivity);
        context.putExtra(j, s1);
        Profile profile = an.a().b();
        String s2 = k;
        boolean flag;
        if (profile != null && TextUtils.equals(s1, profile.F()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context.putExtra(s2, flag);
        return context;
    }

    static User a(ProfileActivity profileactivity)
    {
        return profileactivity.q;
    }

    private void a(com.fitbit.data.domain.Message.MessageType messagetype)
    {
        com.fitbit.friends.ui.b b1 = new com.fitbit.friends.ui.b(this, q.F(), q.P(), messagetype, null, "Profile");
        b1.a(EnumSet.of(com.fitbit.data.domain.Message.MessageType.CHEER, com.fitbit.data.domain.Message.MessageType.TAUNT));
        int i1;
        if (messagetype == com.fitbit.data.domain.Message.MessageType.CHEER)
        {
            i1 = 0x7f0805b2;
        } else
        {
            i1 = 0x7f0805b3;
        }
        b1.a(new com.fitbit.friends.ui.b.a(i1) {

            final int a;
            final ProfileActivity b;

            public void a()
            {
                Toast.makeText(b, b.getString(a, new Object[] {
                    com.fitbit.settings.ui.ProfileActivity.a(b).P()
                }), 0).show();
            }

            
            {
                b = ProfileActivity.this;
                a = i1;
                super();
            }
        });
        b1.e();
    }

    private void a(boolean flag)
    {
        View view = n;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
    }

    public static Intent b(Context context)
    {
        return a(context).addFlags(0x20000000).putExtra("com.fitbit.FitbitMobile.NotificationBroadcastReceiver.ACTION_NOTIFICATION_CAME", true);
    }

    public static Intent b(Context context, User user)
    {
        Profile profile = an.a().b();
        boolean flag;
        if (profile != null && TextUtils.equals(user.F(), profile.F()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return a(context, user, flag);
    }

    static boolean b(ProfileActivity profileactivity)
    {
        return profileactivity.r;
    }

    static void c(ProfileActivity profileactivity)
    {
        profileactivity.g();
    }

    static String e()
    {
        return b;
    }

    private void f()
    {
        if (r)
        {
            setTitle(0x7f080031);
            return;
        } else
        {
            setTitle(0x7f0802fb);
            return;
        }
    }

    private void g()
    {
        a(false);
        if (getSupportFragmentManager().findFragmentByTag("user_info") == null)
        {
            UserInformationFragment userinformationfragment = com.fitbit.settings.ui.UserInformationFragment.a(q, r);
            getSupportFragmentManager().beginTransaction().add(0x7f1101de, userinformationfragment, "user_info").commit();
        }
        if (getIntent().hasExtra(l) || getIntent().hasExtra(m))
        {
            Object obj = (ViewStub)findViewById(0x7f1101e1);
            if (obj != null)
            {
                ((ViewStub) (obj)).inflate();
            }
            obj = findViewById(0x7f1101e0);
            findViewById(0x7f110412).setOnClickListener(new android.view.View.OnClickListener(((View) (obj))) {

                final View a;
                final ProfileActivity b;

                public void onClick(View view)
                {
                    s.a(view.getContext()).a((RankedUser)com.fitbit.settings.ui.ProfileActivity.a(b), view.getContext(), null);
                    a.setVisibility(8);
                }

            
            {
                b = ProfileActivity.this;
                a = view;
                super();
            }
            });
            findViewById(0x7f110411).setOnClickListener(new android.view.View.OnClickListener(((View) (obj))) {

                final View a;
                final ProfileActivity b;

                public void onClick(View view)
                {
                    s.a(view.getContext()).b((RankedUser)com.fitbit.settings.ui.ProfileActivity.a(b), view.getContext(), null);
                    a.setVisibility(8);
                }

            
            {
                b = ProfileActivity.this;
                a = view;
                super();
            }
            });
        }
        d d1 = new d(getSupportFragmentManager(), q);
        p.setAdapter(d1);
        o.a(p);
    }

    private boolean h()
    {
        return (q instanceof RankedUser) && ((RankedUser)q).c() == com.fitbit.data.domain.RankedUser.Relation.FRIEND;
    }

    private void i()
    {
        if (h())
        {
            RankedUser rankeduser = (RankedUser)q;
            s.a(this).c(rankeduser, this, null);
            invalidateOptionsMenu();
        }
    }

    public void a(Loader loader, User user)
    {
        q = user;
        if (q == null)
        {
            ActivityCompat.finishAfterTransition(this);
            return;
        } else
        {
            n.post(new Runnable() {

                final ProfileActivity a;

                public void run()
                {
                    ProfileActivity.c(a);
                }

            
            {
                a = ProfileActivity.this;
                super();
            }
            });
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040052);
        n = findViewById(0x7f1101dd);
        o = (ViewPagerTabIndicator)findViewById(0x7f1100ac);
        p = (ViewPager)findViewById(0x7f1101df);
        if (getIntent().hasExtra(i))
        {
            q = (User)getIntent().getSerializableExtra(i);
        } else
        if (getIntent().hasExtra(m))
        {
            q = (User)getIntent().getSerializableExtra(m);
        }
        r = getIntent().getBooleanExtra(k, false);
        startService(cw.a(this, false));
        f();
        if (q == null)
        {
            ActivityCompat.postponeEnterTransition(this);
            getSupportLoaderManager().restartLoader(0x7f1102b3, getIntent().getExtras(), this);
            return;
        } else
        {
            g();
            return;
        }
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        User user = (User)bundle.getParcelable(i);
        boolean flag = bundle.getBoolean(k);
        if (user != null || flag)
        {
            if (flag)
            {
                return new c(this);
            } else
            {
                return new b(this, user.F());
            }
        }
        a(true);
        if (bundle.containsKey(l))
        {
            long l1 = bundle.getLong(l);
            com.fitbit.e.a.a(b, "Loading the user data a pending invite", new Object[0]);
            return new a(this, l1);
        }
        if (bundle.containsKey(j))
        {
            com.fitbit.e.a.a(b, "Loading the user data for another user", new Object[0]);
            return new b(this, bundle.getString(j));
        } else
        {
            com.fitbit.e.a.e(b, "Could not find a suitable loader for the type of user", new Object[0]);
            return null;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        if (!r && h())
        {
            getMenuInflater().inflate(0x7f120013, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (User)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        Intent intent1 = new Intent("ACTION_NEW_INTENT");
        intent1.putExtra("android.intent.extra.INTENT", intent);
        z.a(intent1);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (!h()) goto _L2; else goto _L1
_L1:
        menuitem.getItemId();
        JVM INSTR tableswitch 2131821797 2131821800: default 44
    //                   2131821797 90
    //                   2131821798 54
    //                   2131821799 72
    //                   2131821800 50;
           goto _L2 _L3 _L4 _L5 _L6
_L2:
        return super.onOptionsItemSelected(menuitem);
_L6:
        i();
_L4:
        a(com.fitbit.data.domain.Message.MessageType.CHEER);
        menuitem.setEnabled(false);
        continue; /* Loop/switch isn't completed */
_L5:
        a(com.fitbit.data.domain.Message.MessageType.TAUNT);
        menuitem.setEnabled(false);
        continue; /* Loop/switch isn't completed */
_L3:
        ConversationActivity.a(this, q.F(), q.P(), q.G(), "Profile");
        if (true) goto _L2; else goto _L7
_L7:
    }

    protected void onResume()
    {
        super.onResume();
        Object obj;
        if (r)
        {
            obj = "Personal";
        } else
        {
            obj = "Others";
        }
        com.fitbit.mixpanel.f.a("Social: View Profile", "!Type", ((String) (obj)));
        if (r)
        {
            obj = com.fitbit.analytics.core.Interaction.DEFAULTS.f;
        } else
        {
            obj = com.fitbit.analytics.core.Interaction.DEFAULTS.g;
        }
        com.fitbit.analytics.core.a.a(((com.fitbit.analytics.core.Interaction.DEFAULTS) (obj)));
        FitBitApplication.a().c().a(0x7f11000a).a("Profile");
    }

}
