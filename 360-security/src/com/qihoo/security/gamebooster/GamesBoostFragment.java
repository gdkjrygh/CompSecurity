// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.dialog.i;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.fragment.BaseFragment;
import com.qihoo.security.widget.ImageView.RemoteImageView;
import com.qihoo360.mobilesafe.b.d;
import com.qihoo360.mobilesafe.b.q;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.gamebooster:
//            h, c, b, g

public class GamesBoostFragment extends BaseFragment
    implements android.view.View.OnClickListener, h
{

    private boolean a;
    private Menu b;
    private View c;
    private ListView j;
    private LocaleTextView k;
    private g l;
    private c m;
    private LayoutInflater n;
    private Bitmap o;
    private final BroadcastReceiver p = new BroadcastReceiver() {

        final GamesBoostFragment a;

        public void onReceive(Context context, Intent intent)
        {
            com.qihoo.security.gamebooster.b.a().a(a);
        }

            
            {
                a = GamesBoostFragment.this;
                super();
            }
    };

    public GamesBoostFragment()
    {
    }

    private void a()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.qihoo.security.gamebooster.LocalGamePackageUpdate");
        d.registerReceiver(p, intentfilter);
    }

    private void a(Activity activity, int i1, int j1)
    {
        if (activity == null)
        {
            return;
        } else
        {
            activity = new i(activity, i1, j1);
            activity.setButtonText(new int[] {
                0x7f0c0156, 0x7f0c014f
            });
            activity.setCancelable(true);
            activity.setButtonOnClickListener(new android.view.View.OnClickListener[] {
                new android.view.View.OnClickListener(activity) {

                    final i a;
                    final GamesBoostFragment b;

                    public void onClick(View view)
                    {
                        if (GamesBoostFragment.a(b))
                        {
                            com.qihoo.security.support.b.b(11115);
                            GamesBoostFragment.a(b, false);
                            q.a().a(0x7f0c009b);
                        } else
                        {
                            com.qihoo.security.support.b.b(11117);
                            GamesBoostFragment.a(b, true);
                            q.a().a(0x7f0c009d);
                        }
                        SharedPref.a(SecurityApplication.a(), "game_booster_show_toast", GamesBoostFragment.a(b));
                        GamesBoostFragment.a(b, com.qihoo.security.gamebooster.GamesBoostFragment.b(b));
                        d.b(a);
                    }

            
            {
                b = GamesBoostFragment.this;
                a = i1;
                super();
            }
                }, new android.view.View.OnClickListener(activity) {

                    final i a;
                    final GamesBoostFragment b;

                    public void onClick(View view)
                    {
                        d.b(a);
                    }

            
            {
                b = GamesBoostFragment.this;
                a = i1;
                super();
            }
                }
            });
            d.a(activity);
            return;
        }
    }

    private void a(Menu menu)
    {
        a = SharedPref.b(SecurityApplication.a(), "game_booster_show_toast", true);
        if (a)
        {
            menu.findItem(0x7f0b0252).setTitle(f.a(0x7f0c0099));
            return;
        } else
        {
            menu.findItem(0x7f0b0252).setTitle(f.a(0x7f0c009a));
            return;
        }
    }

    static void a(GamesBoostFragment gamesboostfragment, Menu menu)
    {
        gamesboostfragment.a(menu);
    }

    private void a(g g1)
    {
        if (m == null)
        {
            FragmentActivity fragmentactivity = getActivity();
            if (fragmentactivity != null)
            {
                m = new c(g1, fragmentactivity);
                j.setAdapter(m);
            }
            return;
        } else
        {
            m.a(g1);
            m.notifyDataSetChanged();
            return;
        }
    }

    static boolean a(GamesBoostFragment gamesboostfragment)
    {
        return gamesboostfragment.a;
    }

    static boolean a(GamesBoostFragment gamesboostfragment, boolean flag)
    {
        gamesboostfragment.a = flag;
        return flag;
    }

    static Menu b(GamesBoostFragment gamesboostfragment)
    {
        return gamesboostfragment.b;
    }

    private void b()
    {
        com.qihoo.security.gamebooster.b.a().a(this);
        o = com.qihoo.security.gamebooster.b.a().d();
    }

    private void c()
    {
        k = (LocaleTextView)c.findViewById(0x7f0b00f6);
        k.setLocalText(0x7f0c0097);
        k.setOnClickListener(this);
        j = (ListView)c.findViewById(0x7f0b0122);
        View view = n.inflate(0x7f030062, null);
        View view1 = n.inflate(0x7f030059, null);
        LocaleTextView localetextview = (LocaleTextView)view.findViewById(0x7f0b0144);
        RemoteImageView remoteimageview = (RemoteImageView)view.findViewById(0x7f0b0145);
        localetextview.setLocalText(String.format(getResources().getString(0x7f0c0085), new Object[] {
            com.qihoo.security.gamebooster.b.h()
        }));
        remoteimageview.setImageBitmap(o);
        j.addHeaderView(view);
        j.addFooterView(view1);
    }

    public void a(g g1, Object obj)
    {
        if (g1 == null)
        {
            return;
        } else
        {
            l = g1;
            a(l);
            return;
        }
    }

    public volatile void a(Object obj, Object obj1)
    {
        a((g)obj, obj1);
    }

    public void onClick(View view)
    {
        if (view == k)
        {
            com.qihoo.security.gamebooster.b.a().c();
            k.setEnabled(false);
            k.setLocalText(0x7f0c0098);
            k.setBackgroundResource(0x7f0200fe);
            com.qihoo.security.support.b.b(11118);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a();
        n = layoutinflater;
        c = layoutinflater.inflate(0x7f030054, viewgroup, false);
        b();
        c();
        return c;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (o != null && !o.isRecycled())
        {
            o.recycle();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        FragmentActivity fragmentactivity = getActivity();
        menuitem.getItemId();
        JVM INSTR tableswitch 2131427922 2131427922: default 28
    //                   2131427922 34;
           goto _L1 _L2
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        if (a)
        {
            com.qihoo.security.support.b.b(11114);
            a(fragmentactivity, 0x7f0c00a0, 0x7f0c009c);
        } else
        {
            com.qihoo.security.support.b.b(11116);
            a(fragmentactivity, 0x7f0c00a0, 0x7f0c009e);
        }
        if (fragmentactivity != null)
        {
            fragmentactivity.c();
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
