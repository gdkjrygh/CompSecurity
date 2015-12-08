// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import am;
import an;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.bouncer.proto.SocialStory;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.share.client.ShareViewClient;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import cu;
import da;
import dgp;
import dmz;
import doa;
import dof;
import dtq;
import edo;
import fop;
import fou;
import ftu;
import gcx;
import ggc;
import ggn;

public class ShareToSpotifyActivity extends fou
{

    edo d;
    AutoCompleteTextView i;
    EditText j;
    Intent k;
    ShareType l;
    String m;
    private final ShareViewClient n = new ShareViewClient(this);
    private Button o;
    private boolean p;
    private ftu q;
    private an r;

    public ShareToSpotifyActivity()
    {
        dmz.a(fop);
        r = new an() {

            private ShareToSpotifyActivity a;

            public final da a(Bundle bundle)
            {
                android.net.Uri.Builder builder = dtq.a.buildUpon();
                bundle = bundle.getString("filter");
                if (bundle == null)
                {
                    bundle = "";
                }
                bundle = builder.appendQueryParameter("filter", (String)bundle).build();
                return new cu(a, bundle, doa.a, null, null);
            }

            public final void a()
            {
                ShareToSpotifyActivity.f(a).b(null);
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                ShareToSpotifyActivity.f(a).b(((Cursor) (obj)));
            }

            
            {
                a = ShareToSpotifyActivity.this;
                super();
            }
        };
    }

    public static Intent a(Context context, ShareType sharetype, String s, Intent intent)
    {
        context = new Intent(context, com/spotify/mobile/android/ui/activity/ShareToSpotifyActivity);
        context.setFlags(0x40000000);
        context.putExtra("type", sharetype);
        context.putExtra("intent", intent);
        context.putExtra("title", s);
        return context;
    }

    static Button a(ShareToSpotifyActivity sharetospotifyactivity)
    {
        return sharetospotifyactivity.o;
    }

    static String a(ShareToSpotifyActivity sharetospotifyactivity, String s)
    {
        sharetospotifyactivity.m = s;
        return s;
    }

    static boolean b(ShareToSpotifyActivity sharetospotifyactivity)
    {
        return sharetospotifyactivity.p;
    }

    static String c(ShareToSpotifyActivity sharetospotifyactivity)
    {
        return sharetospotifyactivity.m;
    }

    static AutoCompleteTextView d(ShareToSpotifyActivity sharetospotifyactivity)
    {
        return sharetospotifyactivity.i;
    }

    static boolean e(ShareToSpotifyActivity sharetospotifyactivity)
    {
        sharetospotifyactivity.p = false;
        return false;
    }

    static ftu f(ShareToSpotifyActivity sharetospotifyactivity)
    {
        return sharetospotifyactivity.q;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = new edo(this);
        k = (Intent)getIntent().getParcelableExtra("intent");
        Object obj;
        String s;
        DialogLayout dialoglayout;
        int i1;
        if (getIntent().hasExtra("type"))
        {
            l = (ShareType)getIntent().getSerializableExtra("type");
        } else
        {
            l = ShareType.a;
        }
        getIntent().getStringExtra("title");
        s = null;
        obj = null;
        if (bundle != null)
        {
            bundle.setClassLoader(getClassLoader());
            m = bundle.getString("selected_user_uid");
            p = bundle.getBoolean("restore_input_user");
            s = bundle.getString("message_text");
            obj = bundle.getString("user_text");
        }
        bundle = new gcx(S_(), r) {

            public final CharSequence a(Cursor cursor)
            {
                return cursor.getString(1);
            }

        };
        ((gcx) (bundle)).a.a(((gcx) (bundle)).b, ((gcx) (bundle)).d, ((gcx) (bundle)).c);
        q = new ftu(this);
        q.c = bundle;
        dialoglayout = new DialogLayout(this);
        setContentView(dialoglayout);
        dialoglayout.a(getIntent().getStringExtra("title"));
        bundle = new LinearLayout(this);
        bundle.setOrientation(1);
        bundle.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        dialoglayout.a(bundle);
        dialoglayout.a(0x7f0804e2, new android.view.View.OnClickListener() {

            private ShareToSpotifyActivity a;

            public final void onClick(View view)
            {
                int j1 = 128;
                view = a;
                final class _cls8
                {

                    static final int a[];

                    static 
                    {
                        a = new int[ShareType.values().length];
                        try
                        {
                            a[ShareType.a.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[ShareType.b.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                Object obj2;
                switch (_cls8.a[((ShareToSpotifyActivity) (view)).l.ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                    String s1 = ((ShareToSpotifyActivity) (view)).j.getText().toString();
                    String s2 = ((ShareToSpotifyActivity) (view)).k.getStringExtra("android.intent.extra.TEXT");
                    String s3 = ((ShareToSpotifyActivity) (view)).i.getText().toString();
                    fop.a(view, ((ShareToSpotifyActivity) (view)).m, s1, s2);
                    dmz.a(ggc);
                    ggc.a(view, 0x7f08056d, 1, new Object[] {
                        s3
                    });
                    view.finish();
                    return;

                case 2: // '\002'
                    obj2 = ((ShareToSpotifyActivity) (view)).d;
                    break;
                }
                Object obj1 = ((ShareToSpotifyActivity) (view)).k.getStringExtra("android.intent.extra.TEXT");
                String s4 = ((ShareToSpotifyActivity) (view)).j.getText().toString();
                view = view. new com.spotify.cosmos.android.Resolver.CallbackReceiver(new Handler()) {

                    private ShareToSpotifyActivity a;

                    protected final void onError(Throwable throwable)
                    {
                        dmz.a(ggc);
                        ggc.a(a, 0x7f08056c, 1, new Object[0]);
                        a.finish();
                    }

                    protected final void onResolved(Response response)
                    {
                        dmz.a(ggc);
                        ggc.g(a);
                        a.finish();
                    }

            
            {
                a = ShareToSpotifyActivity.this;
                super(handler);
            }
                };
                obj2 = ((edo) (obj2)).b();
                s4 = s4.trim();
                obj1 = (new com.spotify.bouncer.proto.SocialStory.Builder()).uri(((String) (obj1))).type(com.spotify.bouncer.proto.SocialStory.StoryType.b);
                com.spotify.bouncer.proto.Metadata.Builder builder = new com.spotify.bouncer.proto.Metadata.Builder();
                if (s4.length() < 128)
                {
                    j1 = s4.length();
                }
                ((Resolver) (obj2)).resolve(RequestBuilder.postBytes("hm://bouncer/story", ((com.spotify.bouncer.proto.SocialStory.Builder) (obj1)).metadata(builder.summary(s4.substring(0, j1)).build()).build().a()).build(), view);
            }

            
            {
                a = ShareToSpotifyActivity.this;
                super();
            }
        });
        dialoglayout.b(0x7f0804e1, new android.view.View.OnClickListener() {

            private ShareToSpotifyActivity a;

            public final void onClick(View view)
            {
                a.finish();
            }

            
            {
                a = ShareToSpotifyActivity.this;
                super();
            }
        });
        o = dialoglayout.a();
        if (l == ShareType.a)
        {
            o.setEnabled(false);
        }
        i = dgp.b(this);
        i.setId(0x7f11011c);
        i.setAdapter(q);
        i.setHint(0x7f0804e5);
        i.setSingleLine(true);
        i.setImeOptions(6);
        i.setInputType(16384);
        i.setText(((CharSequence) (obj)));
        i.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            private ShareToSpotifyActivity a;

            public final void onItemClick(AdapterView adapterview, View view, int j1, long l1)
            {
                if (view.getTag() instanceof dof)
                {
                    adapterview = (dof)view.getTag();
                    ShareToSpotifyActivity.a(a, adapterview.a());
                    ShareToSpotifyActivity.a(a).setEnabled(true);
                }
            }

            
            {
                a = ShareToSpotifyActivity.this;
                super();
            }
        });
        i.addTextChangedListener(new TextWatcher() {

            private ShareToSpotifyActivity a;

            public final void afterTextChanged(Editable editable)
            {
                if (ShareToSpotifyActivity.b(a))
                {
                    if (ShareToSpotifyActivity.c(a) != null)
                    {
                        ShareToSpotifyActivity.a(a).setEnabled(true);
                        ShareToSpotifyActivity.d(a).dismissDropDown();
                    }
                    ShareToSpotifyActivity.e(a);
                    return;
                } else
                {
                    ShareToSpotifyActivity.a(a, null);
                    ShareToSpotifyActivity.a(a).setEnabled(false);
                    return;
                }
            }

            public final void beforeTextChanged(CharSequence charsequence, int j1, int k1, int l1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int j1, int k1, int l1)
            {
            }

            
            {
                a = ShareToSpotifyActivity.this;
                super();
            }
        });
        j = dgp.a(this);
        j.setId(0x7f1100b4);
        j.setText(s);
        j.setInputType(j.getInputType() | 0x4000);
        j.setImeOptions(6);
        j.setSingleLine(true);
        j.setHint(0x7f0804e4);
        obj = new android.widget.LinearLayout.LayoutParams(-1, -2);
        i1 = getResources().getDimensionPixelOffset(0x7f0c0136);
        ((android.widget.LinearLayout.LayoutParams) (obj)).setMargins(0, i1, 0, i1);
        if (l == ShareType.a)
        {
            bundle.addView(i, ((android.view.ViewGroup.LayoutParams) (obj)));
        }
        bundle.addView(j, ((android.view.ViewGroup.LayoutParams) (obj)));
        super.e = ggn.a(this, ViewUri.bd);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        n.a();
        d.a();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("selected_user_uid", m);
        boolean flag;
        if (i.getText().length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.putBoolean("restore_input_user", flag);
        bundle.putString("message_text", j.getText().toString());
        bundle.putString("user_text", i.getText().toString());
    }

    private class ShareType extends Enum
    {

        public static final ShareType a;
        public static final ShareType b;
        private static final ShareType c[];

        public static ShareType valueOf(String s)
        {
            return (ShareType)Enum.valueOf(com/spotify/mobile/android/ui/activity/ShareToSpotifyActivity$ShareType, s);
        }

        public static ShareType[] values()
        {
            return (ShareType[])c.clone();
        }

        static 
        {
            a = new ShareType("SPOTIFY", 0);
            b = new ShareType("FOLLOWERS", 1);
            c = (new ShareType[] {
                a, b
            });
        }

        private ShareType(String s, int i1)
        {
            super(s, i1);
        }
    }

}
