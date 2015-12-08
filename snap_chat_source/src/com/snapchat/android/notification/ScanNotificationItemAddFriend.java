// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.notification;

import DL;
import IQ;
import Jr;
import MA;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.snapchat.android.Timber;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;
import mh;

// Referenced classes of package com.snapchat.android.notification:
//            ScanNotificationItem

public class ScanNotificationItemAddFriend extends ScanNotificationItem
{
    public static final class SnapcodeNotificationSteps extends Enum
    {

        private static final SnapcodeNotificationSteps $VALUES[];
        public static final SnapcodeNotificationSteps COMPLETE;
        public static final SnapcodeNotificationSteps EDITING_FRIENDS;
        public static final SnapcodeNotificationSteps ERROR;
        public static final SnapcodeNotificationSteps SHOW_PROFILE_INFO;

        public static SnapcodeNotificationSteps valueOf(String s1)
        {
            return (SnapcodeNotificationSteps)Enum.valueOf(com/snapchat/android/notification/ScanNotificationItemAddFriend$SnapcodeNotificationSteps, s1);
        }

        public static SnapcodeNotificationSteps[] values()
        {
            return (SnapcodeNotificationSteps[])$VALUES.clone();
        }

        static 
        {
            SHOW_PROFILE_INFO = new SnapcodeNotificationSteps("SHOW_PROFILE_INFO", 0);
            EDITING_FRIENDS = new SnapcodeNotificationSteps("EDITING_FRIENDS", 1);
            COMPLETE = new SnapcodeNotificationSteps("COMPLETE", 2);
            ERROR = new SnapcodeNotificationSteps("ERROR", 3);
            $VALUES = (new SnapcodeNotificationSteps[] {
                SHOW_PROFILE_INFO, EDITING_FRIENDS, COMPLETE, ERROR
            });
        }

        private SnapcodeNotificationSteps(String s1, int k)
        {
            super(s1, k);
        }
    }

    final class a
        implements CO.a
    {

        final ScanNotificationItemAddFriend a;

        public final void a()
        {
            if (ScanNotificationItemAddFriend.a(a) != SnapcodeNotificationSteps.SHOW_PROFILE_INFO && ScanNotificationItemAddFriend.a(a) != SnapcodeNotificationSteps.COMPLETE)
            {
                return;
            }
            a.j.b(a.h.duration);
            if (ScanNotificationItemAddFriend.b(a))
            {
                IQ iq = a.j;
                IQ.b(a.h.mScannableMetric, ScanNotificationItemAddFriend.o());
            }
            ScanNotificationItemAddFriend.c(a);
            Object obj = new Friend(ScanNotificationItemAddFriend.d(a));
            if (ScanNotificationItemAddFriend.a(a) == SnapcodeNotificationSteps.SHOW_PROFILE_INFO)
            {
                obj = new mh(((Friend) (obj)), FriendAction.ADD);
                obj.mAddSourceType = com.snapchat.android.analytics.AnalyticsEvents.AddFriendSourceType.QR_CODE.getAddSourceType();
                a.g.setText(a.e.getResources().getString(0x7f08022e));
            } else
            {
                obj = new mh(((Friend) (obj)), FriendAction.DELETE);
                a.g.setText(a.e.getResources().getString(0x7f080239));
            }
            ScanNotificationItemAddFriend.a(a, SnapcodeNotificationSteps.EDITING_FRIENDS);
            obj.mFriendActionCompleteCallback = new a(this, (byte)0);
            ((mh) (obj)).execute();
            ScanNotificationItemAddFriend.e(a).setVisibility(8);
            ((ProgressBar)a.d.findViewById(0x7f0d0418)).setVisibility(0);
        }

        public final void b()
        {
            a.c();
        }

        public final void c()
        {
            a.j.b(a.h.duration);
        }

        private a()
        {
            a = ScanNotificationItemAddFriend.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    final class a.a
        implements mh.a
    {

        private a a;

        public final void a(FriendAction friendaction, boolean flag, String s1)
        {
            Timber.c(ScanNotificationItemAddFriend.o(), s1, new Object[0]);
            static final class _cls2
            {

                static final int a[];

                static 
                {
                    a = new int[FriendAction.values().length];
                    try
                    {
                        a[FriendAction.ADD.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[FriendAction.DELETE.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            _cls2.a[friendaction.ordinal()];
            JVM INSTR tableswitch 1 2: default 40
        //                       1 80
        //                       2 214;
               goto _L1 _L2 _L3
_L1:
            ((ProgressBar)a.a.d.findViewById(0x7f0d0418)).setVisibility(8);
            a.a.j.b(1500L);
            return;
_L2:
            ScanNotificationItemAddFriend.a(a.a, SnapcodeNotificationSteps.COMPLETE);
            if (flag)
            {
                ScanNotificationItemAddFriend.e(a.a).setImageResource(0x7f020014);
                ScanNotificationItemAddFriend.e(a.a).setVisibility(0);
                a.a.g.setText(a.a.e.getResources().getString(0x7f080053));
            } else
            {
                friendaction = s1;
                if (s1 == null)
                {
                    friendaction = a.a.e.getResources().getString(0x7f080234);
                }
                a.a.a(friendaction);
                ScanNotificationItemAddFriend.a(a.a, SnapcodeNotificationSteps.ERROR);
            }
            continue; /* Loop/switch isn't completed */
_L3:
            ScanNotificationItemAddFriend.a(a.a, SnapcodeNotificationSteps.SHOW_PROFILE_INFO);
            if (flag)
            {
                ScanNotificationItemAddFriend.e(a.a).setImageResource(0x7f020012);
                ScanNotificationItemAddFriend.e(a.a).setVisibility(0);
                a.a.g.setText(a.a.e.getResources().getString(0x7f0802cd));
            } else
            {
                friendaction = s1;
                if (s1 == null)
                {
                    friendaction = a.a.e.getResources().getString(0x7f080238);
                }
                a.a.a(friendaction);
                ScanNotificationItemAddFriend.a(a.a, SnapcodeNotificationSteps.ERROR);
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        private a.a(a a1)
        {
            a = a1;
            super();
        }

        a.a(a a1, byte byte0)
        {
            this(a1);
        }
    }


    private static final String m = com/snapchat/android/notification/ScanNotificationItemAddFriend.getSimpleName();
    private ImageView n;
    private ImageView o;
    private ImageView p;
    private String q;
    private SnapcodeNotificationSteps r;
    private boolean s;

    public ScanNotificationItemAddFriend(Context context, ViewGroup viewgroup, MA ma, IQ iq)
    {
        super(context, viewgroup, ma, iq);
        s = false;
        if (ma.mScannableData != null)
        {
            context = (DL)ma.mScannableData;
            r = ((DL) (context)).f;
            q = ((DL) (context)).e;
            Timber.c(m, (new StringBuilder("Add friend:")).append(q).toString(), new Object[0]);
        }
        k();
    }

    static SnapcodeNotificationSteps a(ScanNotificationItemAddFriend scannotificationitemaddfriend)
    {
        return scannotificationitemaddfriend.r;
    }

    static SnapcodeNotificationSteps a(ScanNotificationItemAddFriend scannotificationitemaddfriend, SnapcodeNotificationSteps snapcodenotificationsteps)
    {
        scannotificationitemaddfriend.r = snapcodenotificationsteps;
        return snapcodenotificationsteps;
    }

    static boolean b(ScanNotificationItemAddFriend scannotificationitemaddfriend)
    {
        return scannotificationitemaddfriend.s;
    }

    static boolean c(ScanNotificationItemAddFriend scannotificationitemaddfriend)
    {
        scannotificationitemaddfriend.s = false;
        return false;
    }

    static String d(ScanNotificationItemAddFriend scannotificationitemaddfriend)
    {
        return scannotificationitemaddfriend.q;
    }

    static ImageView e(ScanNotificationItemAddFriend scannotificationitemaddfriend)
    {
        return scannotificationitemaddfriend.p;
    }

    static String o()
    {
        return m;
    }

    public final String a()
    {
        return i;
    }

    protected final void a(String s1)
    {
        Object obj = d.findViewById(0x7f0d0069);
        View view = d.findViewById(0x7f0d0414);
        ((View) (obj)).setVisibility(8);
        obj = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        obj.leftMargin = (int)e.getResources().getDimension(0x7f0a0065);
        obj.rightMargin = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin;
        view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        if (g == null)
        {
            g = (TextView)d.findViewById(0x7f0d0416);
        }
        if (p == null)
        {
            p = (ImageView)d.findViewById(0x7f0d0417);
        }
        if (f == null)
        {
            f = (TextView)d.findViewById(0x7f0d0415);
        }
        g.setVisibility(8);
        p.setVisibility(8);
        f.setGravity(17);
        f.setSingleLine(false);
        f.setLines(2);
        f.setText(s1);
    }

    public final void c()
    {
        j.a(true);
    }

    protected final void d()
    {
        View view = d.findViewById(0x7f0d0413);
        p = (ImageView)d.findViewById(0x7f0d0417);
        o = (ImageView)d.findViewById(0x7f0d006c);
        n = (ImageView)d.findViewById(0x7f0d006a);
        c.setVisibility(8);
        c.animate().setStartDelay(0L).setListener(null).cancel();
        p.setVisibility(0);
        f.setVisibility(0);
        g.setVisibility(0);
        f.setSingleLine(true);
        f.setEllipsize(android.text.TextUtils.TruncateAt.END);
        if (TextUtils.isEmpty(h.primaryText))
        {
            Timber.c(m, (new StringBuilder("got error from server: ")).append(h.secondaryText).toString(), new Object[0]);
            if (!TextUtils.isEmpty(h.secondaryText))
            {
                a(h.secondaryText.toString());
            }
            r = SnapcodeNotificationSteps.ERROR;
        } else
        {
            f.setText(h.primaryText);
        }
        g.setText(e.getResources().getString(0x7f0802cd));
        p.setImageResource(0x7f020012);
        if (r != SnapcodeNotificationSteps.ERROR)
        {
            e();
        } else
        {
            j.b(3000L);
        }
        view.setVisibility(0);
        s = true;
        IQ.a(h.mScannableMetric, m);
    }

    protected final void e()
    {
        n.setVisibility(4);
        o.setVisibility(0);
    }

    protected final void f()
    {
        c.setVisibility(0);
        Timber.c(m, "Show start showProgressBar", new Object[0]);
        c.animate().alpha(0.0F).setStartDelay(8000L).setListener(new Jr() {

            private ScanNotificationItemAddFriend a;

            public final void onAnimationEnd(Animator animator)
            {
                if (a.c == null)
                {
                    return;
                }
                Timber.c(ScanNotificationItemAddFriend.o(), "Show start delay check for progress bar", new Object[0]);
                if (a.c.getVisibility() == 0)
                {
                    a.a(a.e.getResources().getString(0x7f080235));
                    ScanNotificationItemAddFriend.a(a, SnapcodeNotificationSteps.ERROR);
                    a.c.setVisibility(8);
                    a.d.findViewById(0x7f0d0413).setVisibility(0);
                }
                a.c.animate().setStartDelay(0L).setListener(null).cancel();
            }

            
            {
                a = ScanNotificationItemAddFriend.this;
                super();
            }
        }).start();
    }

    protected final void g()
    {
        if (d != null)
        {
            return;
        } else
        {
            d = LayoutInflater.from(e).inflate(0x7f0400c3, null);
            d.setBackgroundColor(-1);
            c = (ProgressBar)d.findViewById(0x7f0d0419);
            f = (TextView)d.findViewById(0x7f0d0415);
            g = (TextView)d.findViewById(0x7f0d0416);
            p = (ImageView)d.findViewById(0x7f0d0417);
            o = (ImageView)d.findViewById(0x7f0d006c);
            n = (ImageView)d.findViewById(0x7f0d006a);
            return;
        }
    }

    protected final View h()
    {
        if (d == null)
        {
            d = LayoutInflater.from(e).inflate(0x7f0400c3, null);
        }
        return d;
    }

    protected final View i()
    {
        return h().findViewById(0x7f0d0413);
    }

    protected final ImageView j()
    {
        return null;
    }

    public final void l()
    {
        if (r == SnapcodeNotificationSteps.ERROR)
        {
            j.b(3000L);
        }
    }

    protected final CO.a n()
    {
        return new a((byte)0);
    }

}
