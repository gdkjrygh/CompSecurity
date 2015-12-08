// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.activity;

import am;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dgp;
import dmz;
import fcv;
import fcw;
import fcx;
import fcy;
import fcz;
import fda;
import fdb;
import fdc;
import fop;
import fou;
import fys;
import fyw;
import ggn;

public class CreateRenamePlaylistActivity extends fou
{

    private final String d[] = {
        "name"
    };
    private EditText i;
    private Button j;
    private fdb k;
    private String l;
    private String m;
    private String n;
    private String o;
    private TextWatcher p;
    private android.view.View.OnClickListener q;
    private android.view.View.OnClickListener r;

    public CreateRenamePlaylistActivity()
    {
        p = new TextWatcher() {

            private CreateRenamePlaylistActivity a;

            public final void afterTextChanged(Editable editable)
            {
                Button button = CreateRenamePlaylistActivity.a(a);
                boolean flag;
                if (editable.toString().trim().length() > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                button.setEnabled(flag);
            }

            public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            
            {
                a = CreateRenamePlaylistActivity.this;
                super();
            }
        };
        q = new android.view.View.OnClickListener() {

            private CreateRenamePlaylistActivity a;

            public final void onClick(View view)
            {
                a.finish();
            }

            
            {
                a = CreateRenamePlaylistActivity.this;
                super();
            }
        };
        r = new android.view.View.OnClickListener() {

            private CreateRenamePlaylistActivity a;

            public final void onClick(View view)
            {
                view = CreateRenamePlaylistActivity.b(a).getText().toString();
                CreateRenamePlaylistActivity.c(a).a(view);
                CreateRenamePlaylistActivity.c(a).a();
                a.finish();
            }

            
            {
                a = CreateRenamePlaylistActivity.this;
                super();
            }
        };
    }

    private static Intent a(Context context, String s)
    {
        s = new Intent(s);
        s.setClass(context, com/spotify/mobile/android/spotlets/playlist/activity/CreateRenamePlaylistActivity);
        return s;
    }

    public static Intent a(Context context, String s, Flags flags)
    {
        context = a(context, "com.spotify.mobile.android.ui.activity.action.RENAME");
        context.putExtra("com.spotify.mobile.android.ui.activity.uri", s);
        fyw.a(context, flags);
        return context;
    }

    public static Intent a(Context context, String s, String s1, Flags flags)
    {
        context = a(context, "com.spotify.mobile.android.ui.activity.action.ADD_ITEM_TO_NEW_PLAYLIST");
        context.putExtra("com.spotify.mobile.android.ui.activity.uri", s);
        context.putExtra("com.spotify.mobile.android.ui.activity.default_name", s1);
        fyw.a(context, flags);
        return context;
    }

    public static Intent a(Context context, String s, String s1, String s2, Flags flags)
    {
        context = a(context, s, s2, flags);
        context.putExtra("com.spotify.mobile.android.ui.activity.folder_uri", s1);
        return context;
    }

    static Button a(CreateRenamePlaylistActivity createrenameplaylistactivity)
    {
        return createrenameplaylistactivity.j;
    }

    public static void a(CreateRenamePlaylistActivity createrenameplaylistactivity, com.spotify.mobile.android.util.ClientEvent.SubEvent subevent)
    {
        dmz.a(fop);
        fop.a(createrenameplaylistactivity, ViewUri.aA, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, subevent));
    }

    public static Intent b(Context context, String s, Flags flags)
    {
        context = a(context, "com.spotify.mobile.android.ui.activity.action.CREATE_PLAYLIST");
        context.putExtra("com.spotify.mobile.android.ui.activity.folder_uri", s);
        fyw.a(context, flags);
        return context;
    }

    static EditText b(CreateRenamePlaylistActivity createrenameplaylistactivity)
    {
        return createrenameplaylistactivity.i;
    }

    static fdb c(CreateRenamePlaylistActivity createrenameplaylistactivity)
    {
        return createrenameplaylistactivity.k;
    }

    public static String[] d(CreateRenamePlaylistActivity createrenameplaylistactivity)
    {
        return createrenameplaylistactivity.d;
    }

    static String e(CreateRenamePlaylistActivity createrenameplaylistactivity)
    {
        return createrenameplaylistactivity.n;
    }

    public void onCreate(Bundle bundle)
    {
        Object obj;
        Object obj1;
        String s;
        Object obj2;
        boolean flag;
        s = null;
        super.onCreate(bundle);
        if (bundle != null)
        {
            bundle.setClassLoader(getClassLoader());
            l = bundle.getString("com.spotify.mobile.android.ui.activity.action");
            m = bundle.getString("com.spotify.mobile.android.ui.activity.uri");
            n = bundle.getString("com.spotify.mobile.android.ui.activity.folder_uri");
            o = bundle.getString("com.spotify.mobile.android.ui.activity.default_name");
        } else
        {
            bundle = getIntent();
            l = bundle.getAction();
            m = bundle.getStringExtra("com.spotify.mobile.android.ui.activity.uri");
            n = bundle.getStringExtra("com.spotify.mobile.android.ui.activity.folder_uri");
            o = bundle.getStringExtra("com.spotify.mobile.android.ui.activity.default_name");
        }
        if ("com.spotify.mobile.android.ui.activity.action.CREATE_PLAYLIST".equals(l))
        {
            obj1 = getResources().getString(0x7f08026a);
            obj = getResources().getString(0x7f080266);
            k = new fcx(this, n);
            bundle = null;
        } else
        {
label0:
            {
                if (!"com.spotify.mobile.android.ui.activity.action.CREATE_FOLDER".equals(l))
                {
                    break label0;
                }
                obj1 = getResources().getString(0x7f080263);
                obj = getResources().getString(0x7f080266);
                k = new fcw(this, n);
                bundle = null;
            }
        }
_L4:
        obj2 = fyw.a(this);
        public final class _cls6
        {

            public static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.util.SpotifyLink.LinkType.values().length];
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.T.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.an.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (((Integer)((Flags) (obj2)).a(fys.D)).intValue() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && ((Integer)((Flags) (obj2)).a(fys.E)).intValue() == 2)
        {
            startActivity((new fcv(this)).c(n).d(s).a(bundle).b(o).a);
            finish();
            return;
        }
        break MISSING_BLOCK_LABEL_624;
        if (!"com.spotify.mobile.android.ui.activity.action.RENAME".equals(l))
        {
            break MISSING_BLOCK_LABEL_510;
        }
        obj = m;
        Assertion.a(m, "Don't start this activity to rename a playlist without specifying the playlist uri");
        bundle = new SpotifyLink(m);
        _cls6.a[((SpotifyLink) (bundle)).c.ordinal()];
        JVM INSTR tableswitch 1 3: default 380
    //                   1 482
    //                   2 496
    //                   3 496;
           goto _L1 _L2 _L3 _L3
_L3:
        break MISSING_BLOCK_LABEL_496;
_L1:
        Assertion.a((new StringBuilder("Got unepexted link type: ")).append(((SpotifyLink) (bundle)).c).toString());
        bundle = null;
_L5:
        Assertion.a(bundle, "Uri is neither a folder nor a playlist.");
        obj2 = getResources().getString(0x7f080267);
        k = new fdc(this, m);
        S_().a(0x7f110079, null, new fcz(this, m, new fda() {

            private CreateRenamePlaylistActivity a;

            public final void a(String s1)
            {
                CreateRenamePlaylistActivity.b(a).setText(s1);
                CreateRenamePlaylistActivity.b(a).setSelection(s1.length());
                a.S_().a(0x7f110079);
            }

            
            {
                a = CreateRenamePlaylistActivity.this;
                super();
            }
        }));
        obj1 = bundle;
        bundle = ((Bundle) (obj));
        obj = obj2;
          goto _L4
_L2:
        bundle = getResources().getString(0x7f080264);
          goto _L5
        bundle = getResources().getString(0x7f08026c);
          goto _L5
        if ("com.spotify.mobile.android.ui.activity.action.ADD_ITEM_TO_NEW_PLAYLIST".equals(l))
        {
            s = m;
            obj1 = getResources().getString(0x7f080269);
            obj = getResources().getString(0x7f080266);
            Assertion.a(m, "Don't start this activity to create a playlist and adding tracks or album without specifying the track or album uri to add");
            k = new fcy(this, m, n);
            bundle = null;
        } else
        {
            throw new RuntimeException((new StringBuilder("Intent action ")).append(l).append(" is invalid.").toString());
        }
          goto _L4
        DialogLayout dialoglayout = new DialogLayout(this);
        setContentView(dialoglayout);
        dialoglayout.a(((CharSequence) (obj1)));
        dialoglayout.a(((CharSequence) (obj)), r);
        dialoglayout.b(0x7f080265, q);
        j = dialoglayout.a();
        obj = new LinearLayout(this);
        ((LinearLayout) (obj)).setOrientation(1);
        int i1 = getResources().getDimensionPixelOffset(0x7f0c0161);
        ((LinearLayout) (obj)).setPadding(0, i1, 0, i1);
        i = dgp.a(this);
        i.setInputType(16384);
        i.setImeOptions(6);
        i.setSingleLine(true);
        i.setHint(0x7f08026b);
        i.addTextChangedListener(p);
        if (!TextUtils.isEmpty(o))
        {
            i.setText(o);
        }
        obj1 = new LinearLayout(this);
        ((LinearLayout) (obj1)).setGravity(1);
        Object obj3 = new android.widget.LinearLayout.LayoutParams(-1, -1);
        ((android.widget.LinearLayout.LayoutParams) (obj3)).setMargins(0, i1, 0, 0);
        ((LinearLayout) (obj1)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj3)));
        obj3 = dgp.d(this, ((android.view.ViewGroup) (obj1)));
        ((LinearLayout) (obj1)).addView(((View) (obj3)));
        ((Button) (obj3)).setText(0x7f080268);
        ((Button) (obj3)).setOnClickListener(new android.view.View.OnClickListener(s, bundle) {

            private String a;
            private String b;
            private CreateRenamePlaylistActivity c;

            public final void onClick(View view)
            {
                CreateRenamePlaylistActivity.a(c, com.spotify.mobile.android.util.ClientEvent.SubEvent.cv);
                view = (new fcv(c)).c(CreateRenamePlaylistActivity.e(c)).d(a).a(b).b(CreateRenamePlaylistActivity.b(c).getText().toString()).a;
                c.startActivity(view);
                c.finish();
            }

            
            {
                c = CreateRenamePlaylistActivity.this;
                a = s;
                b = s1;
                super();
            }
        });
        ((LinearLayout) (obj)).addView(i);
        if (flag && ((Integer)((Flags) (obj2)).a(fys.E)).intValue() == 1)
        {
            ((LinearLayout) (obj)).addView(((View) (obj1)));
        }
        dialoglayout.a(((View) (obj)));
        bundle = j;
        boolean flag1;
        if (i.getText().toString().trim().length() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        bundle.setEnabled(flag1);
        super.e = ggn.a(this, ViewUri.aA);
        return;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("com.spotify.mobile.android.ui.activity.action", l);
        bundle.putString("com.spotify.mobile.android.ui.activity.uri", m);
        bundle.putString("com.spotify.mobile.android.ui.activity.folder_uri", n);
        bundle.putString("com.spotify.mobile.android.ui.activity.default_name", o);
    }
}
