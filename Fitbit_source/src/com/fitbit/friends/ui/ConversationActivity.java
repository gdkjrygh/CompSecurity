// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fitbit.data.bl.ah;
import com.fitbit.data.bl.cw;
import com.fitbit.data.bl.dl;
import com.fitbit.data.bl.s;
import com.fitbit.data.domain.Notification;
import com.fitbit.data.domain.RankedUser;
import com.fitbit.friends.ui.views.TriangleView;
import com.fitbit.home.ui.i;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.loadable.LoadablePicassoImageView;
import com.fitbit.util.bi;
import com.fitbit.util.o;
import java.util.Date;

// Referenced classes of package com.fitbit.friends.ui:
//            ConversationActivity_, b

public class ConversationActivity extends FitbitActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{
    private static class a extends bi
    {

        private String a;
        private long b;

        private static IntentFilter d()
        {
            IntentFilter intentfilter = dl.d();
            intentfilter.addAction("com.fitbit.data.bl.SyncPendingObjectsOperation.BROADCAST_ACTION");
            return intentfilter;
        }

        protected Intent[] a()
        {
            return (new Intent[] {
                dl.a(getContext(), true), cw.a(getContext(), false)
            });
        }

        public b b()
        {
            b b1 = new b();
            if (b > 0L)
            {
                b.a(b1, ah.a().a(b));
                if (b.a(b1) != null && a == null)
                {
                    a = b.a(b1).g();
                }
            }
            if (a != null)
            {
                b.a(b1, com.fitbit.data.bl.s.a(getContext()).b(a));
                if (b.a(b1) == null)
                {
                    b.a(b1, ah.a().a(a));
                }
            }
            return b1;
        }

        public Object f_()
        {
            return b();
        }

        public a(Context context, String s1, long l1)
        {
            super(context, d());
            a = s1;
            b = l1;
        }
    }

    static class b
    {

        private RankedUser a;
        private Notification b;

        static Notification a(b b1)
        {
            return b1.b;
        }

        static Notification a(b b1, Notification notification)
        {
            b1.b = notification;
            return notification;
        }

        static RankedUser a(b b1, RankedUser rankeduser)
        {
            b1.a = rankeduser;
            return rankeduser;
        }

        static RankedUser b(b b1)
        {
            return b1.a;
        }

        b()
        {
        }
    }


    private static final int r = 180;
    private static final String s = "com.fitbit.friends.ui.ConversationActivity.messageText";
    private static final String t = "com.fitbit.friends.ui.ConversationActivity.friendId";
    private static final String u = "com.fitbit.friends.ui.ConversationActivity.friendName";
    private static final String v = "com.fitbit.friends.ui.ConversationActivity.friendPhoto";
    private static final String w = "com.fitbit.friends.ui.ConversationActivity.notificationId";
    private static final String x = "com.fitbit.friends.ui.ConversationActivity.pagegroup";
    private static final String y = "com.fitbit.friends.ui.ConversationActivity.fromNotification";
    protected EditText a;
    protected ProgressBar b;
    protected TextView c;
    protected LinearLayout d;
    protected LinearLayout e;
    protected LoadablePicassoImageView f;
    protected TriangleView g;
    protected TextView h;
    protected TextView i;
    protected View j;
    protected String k;
    protected String l;
    protected String m;
    protected long n;
    protected String o;
    protected String p;
    protected boolean q;

    public ConversationActivity()
    {
    }

    public static void a(Context context, long l1, int i1, boolean flag)
    {
        Intent intent = new Intent(context, com/fitbit/friends/ui/ConversationActivity_);
        intent.setFlags(i1);
        intent.putExtra("com.fitbit.friends.ui.ConversationActivity.fromNotification", flag);
        intent.putExtra("com.fitbit.friends.ui.ConversationActivity.notificationId", l1);
        context.startActivity(intent);
    }

    public static void a(Context context, long l1, String s1)
    {
        Intent intent = new Intent(context, com/fitbit/friends/ui/ConversationActivity_);
        intent.putExtra("com.fitbit.friends.ui.ConversationActivity.notificationId", l1);
        intent.putExtra("com.fitbit.friends.ui.ConversationActivity.pagegroup", s1);
        context.startActivity(intent);
    }

    public static void a(Context context, long l1, boolean flag)
    {
        Intent intent = new Intent(context, com/fitbit/friends/ui/ConversationActivity_);
        intent.putExtra("com.fitbit.friends.ui.ConversationActivity.notificationId", l1);
        intent.putExtra("com.fitbit.friends.ui.ConversationActivity.fromNotification", flag);
        context.startActivity(intent);
    }

    public static void a(Context context, String s1, String s2, String s3, String s4)
    {
        Intent intent = new Intent(context, com/fitbit/friends/ui/ConversationActivity_);
        intent.putExtra("com.fitbit.friends.ui.ConversationActivity.friendName", s2);
        intent.putExtra("com.fitbit.friends.ui.ConversationActivity.friendId", s1);
        intent.putExtra("com.fitbit.friends.ui.ConversationActivity.friendPhoto", s3);
        intent.putExtra("com.fitbit.friends.ui.ConversationActivity.pagegroup", s4);
        context.startActivity(intent);
    }

    private void a(Intent intent)
    {
        if (intent != null)
        {
            q = intent.getBooleanExtra("com.fitbit.friends.ui.ConversationActivity.fromNotification", false);
            k = intent.getStringExtra("com.fitbit.friends.ui.ConversationActivity.friendId");
            o = intent.getStringExtra("com.fitbit.friends.ui.ConversationActivity.messageText");
            l = intent.getStringExtra("com.fitbit.friends.ui.ConversationActivity.friendName");
            n = intent.getLongExtra("com.fitbit.friends.ui.ConversationActivity.notificationId", 0L);
            m = intent.getStringExtra("com.fitbit.friends.ui.ConversationActivity.friendPhoto");
            p = intent.getStringExtra("com.fitbit.friends.ui.ConversationActivity.pagegroup");
            if (k == null && n == 0L)
            {
                throw new NullPointerException("Please specify friendId");
            }
        }
    }

    static void a(ConversationActivity conversationactivity)
    {
        conversationactivity.f();
    }

    private void a(boolean flag)
    {
        a.setEnabled(flag);
        LinearLayout linearlayout = e;
        if (flag && a.getText().length() > 0 && a.getText().length() <= 180)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        linearlayout.setEnabled(flag);
    }

    private boolean a(Notification notification)
    {
        while (notification == null || com.fitbit.util.o.c(new Date(), notification.getTimeCreated()) > 30L) 
        {
            return false;
        }
        return true;
    }

    public static Intent b(Context context, long l1, int i1, boolean flag)
    {
        context = ConversationActivity_.a(context).a(0x4000000 | i1).a();
        context.putExtra("com.fitbit.friends.ui.ConversationActivity.fromNotification", flag);
        context.putExtra("com.fitbit.friends.ui.ConversationActivity.notificationId", l1);
        return context;
    }

    private void f()
    {
        int i1 = a.getLineCount();
        if (i1 > 1)
        {
            c.setVisibility(0);
            int j1 = 180 - a.length();
            android.view.ViewGroup.LayoutParams layoutparams;
            if (j1 >= 0)
            {
                c.setTextColor(0xff000000);
                c.setText(Integer.valueOf(j1).toString());
            } else
            {
                c.setTextColor(0xffff0000);
                c.setText(Integer.valueOf(Math.abs(j1)).toString());
            }
            layoutparams = d.getLayoutParams();
            if (i1 == 2)
            {
                layoutparams.height = -2;
                return;
            } else
            {
                layoutparams.height = -1;
                return;
            }
        } else
        {
            c.setVisibility(8);
            return;
        }
    }

    public void a(Loader loader, b b1)
    {
        byte byte1 = 8;
        boolean flag1 = true;
        boolean flag2 = a(b.a(b1));
        boolean flag;
        byte byte0;
        if (b.b(b1) != null || b.a(b1) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        loader = j;
        if (!flag || !flag2)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        loader.setVisibility(byte0);
        loader = b;
        byte0 = byte1;
        if (!flag)
        {
            byte0 = 0;
        }
        loader.setVisibility(byte0);
        if (b.b(b1) != null)
        {
            if (l == null)
            {
                l = b.b(b1).P();
            }
            if (k == null)
            {
                k = b.b(b1).F();
            }
            if (m == null)
            {
                m = b.b(b1).G();
            }
        } else
        if (flag2)
        {
            if (l == null)
            {
                l = b.a(b1).f();
            }
            if (k == null)
            {
                k = b.a(b1).g();
            }
            if (m == null)
            {
                m = b.a(b1).e();
            }
        }
        if (flag2)
        {
            f.setVisibility(0);
            g.setVisibility(0);
            try
            {
                f.a(m);
            }
            // Misplaced declaration of an exception variable
            catch (Loader loader)
            {
                f.a(null);
            }
            if (b.a(b1) != null)
            {
                if (!b.a(b1).c())
                {
                    ah.a().e();
                }
                h.setText(b.a(b1).d());
                loader = new i();
                i.setText(loader.a(b.a(b1).getTimeCreated(), this));
            }
        }
        if (k == null)
        {
            flag1 = false;
        }
        a(flag1);
    }

    protected void c()
    {
        LinearLayout linearlayout = e;
        boolean flag;
        if (a.getText().length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        linearlayout.setEnabled(flag);
        a.addTextChangedListener(new TextWatcher() {

            final ConversationActivity a;

            public void afterTextChanged(Editable editable)
            {
                ConversationActivity.a(a);
            }

            public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
                LinearLayout linearlayout1 = a.e;
                boolean flag1;
                if (charsequence.toString().trim().length() > 0 && charsequence.length() <= 180)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                linearlayout1.setEnabled(flag1);
            }

            
            {
                a = ConversationActivity.this;
                super();
            }
        });
        if (o != null)
        {
            a.setText(o);
        }
        getSupportLoaderManager().restartLoader(0, null, this);
    }

    protected void d()
    {
        finish();
    }

    protected void e()
    {
        String s1 = a.getText().toString();
        if (s1.length() > 0)
        {
            e.setEnabled(false);
            (new com.fitbit.friends.ui.b(this, k, l, com.fitbit.data.domain.Message.MessageType.MESSAGE, s1, p) {

                final ConversationActivity a;

                protected void c()
                {
                    a.e.setEnabled(true);
                }

                protected void d()
                {
                    super.d();
                    a.finish();
                }

            
            {
                a = ConversationActivity.this;
                super(fragmentactivity, s1, s2, messagetype, s3, s4);
            }
            }).e();
        }
    }

    public void onBackPressed()
    {
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(getIntent());
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new a(this, k, n);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (b)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        a(intent);
        getSupportLoaderManager().restartLoader(0, null, this);
    }
}
