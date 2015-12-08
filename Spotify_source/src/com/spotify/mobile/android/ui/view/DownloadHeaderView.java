// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.util.Assertion;
import dfz;
import ewa;
import gap;
import gaq;
import gbv;
import gcg;

public class DownloadHeaderView extends LinearLayout
{

    public State a;
    public SwitchCompat b;
    public gap c;
    public Optional d;
    private gbv e;
    private Animation f;
    private Animation g;
    private ProgressBar h;
    private ViewGroup i;
    private TextView j;
    private int k;
    private int l;
    private final android.widget.CompoundButton.OnCheckedChangeListener m;

    public DownloadHeaderView(Context context)
    {
        super(context);
        a = State.a;
        m = new android.widget.CompoundButton.OnCheckedChangeListener() {

            private DownloadHeaderView a;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (DownloadHeaderView.a(a) != null)
                {
                    DownloadHeaderView.a(a).a(DownloadHeaderView.b(a).isChecked());
                }
            }

            
            {
                a = DownloadHeaderView.this;
                super();
            }
        };
        b();
    }

    public DownloadHeaderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = State.a;
        m = new _cls1();
        b();
    }

    static gap a(DownloadHeaderView downloadheaderview)
    {
        return downloadheaderview.c;
    }

    private void a(View view, int i1, boolean flag)
    {
        if (flag)
        {
            gaq gaq1 = new gaq(view, i1, false);
            e.a(view, gaq1, false);
            return;
        } else
        {
            view.setVisibility(0);
            return;
        }
    }

    private void a(View view, boolean flag)
    {
        if (flag)
        {
            e.a(view, f, false);
            return;
        } else
        {
            view.setVisibility(0);
            return;
        }
    }

    private void a(State state, int i1)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag1 = true;
        if (state == State.d)
        {
            h.setProgress(i1);
        }
        b.setOnCheckedChangeListener(null);
        Object obj = b;
        if (state != State.c && state != State.b && state != State.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((SwitchCompat) (obj)).setChecked(flag);
        b.setOnCheckedChangeListener(m);
        if (a == state)
        {
            return;
        }
        final class _cls2
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[State.values().length];
                try
                {
                    b[State.f.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[State.g.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[State.h.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[State.i.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                a = new int[com.spotify.mobile.android.provider.Metadata.OfflineSync.WaitReason.values().length];
                try
                {
                    a[com.spotify.mobile.android.provider.Metadata.OfflineSync.WaitReason.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.spotify.mobile.android.provider.Metadata.OfflineSync.WaitReason.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.provider.Metadata.OfflineSync.WaitReason.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.provider.Metadata.OfflineSync.WaitReason.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (a != State.a)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (a == State.d)
        {
            b(h, l, flag);
        }
        flag1 = a(state);
        flag2 = a(a);
        flag3 = b(state);
        flag4 = b(a);
        if (!flag3) goto _L2; else goto _L1
_L1:
        obj = j;
        _cls2.b[state.ordinal()];
        JVM INSTR tableswitch 1 4: default 204
    //                   1 343
    //                   2 349
    //                   3 355
    //                   4 361;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        Assertion.a((new StringBuilder("State ")).append(state).append(" is not a waiting state.").toString());
        i1 = 0x7f0802ea;
_L9:
        ((TextView) (obj)).setText(i1);
        if (d.b())
        {
            ((ewa)d.c()).a(state);
        }
_L2:
        if (a == State.b)
        {
            if (flag1)
            {
                a(((View) (i)), k, flag);
            } else
            {
                i.setVisibility(8);
            }
            if (flag3)
            {
                a(((View) (j)), k, flag);
            } else
            {
                j.setVisibility(8);
            }
        } else
        if (state == State.b)
        {
            if (flag2)
            {
                b(i, k, flag);
            }
            if (flag4)
            {
                b(j, k, flag);
            }
        } else
        {
            if (flag2 && !flag1)
            {
                b(i, flag);
            }
            if (flag4 && !flag3)
            {
                b(j, flag);
            }
            if (flag1 && !flag2)
            {
                a(((View) (i)), flag);
            }
            if (flag3 && !flag4)
            {
                a(((View) (j)), flag);
            }
        }
        if (state == State.d)
        {
            a(((View) (h)), l, flag);
        }
        a = state;
        return;
_L4:
        i1 = 0x7f0802ea;
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = 0x7f0802ec;
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = 0x7f0802eb;
        continue; /* Loop/switch isn't completed */
_L7:
        i1 = 0x7f0802ed;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static boolean a(State state)
    {
        return state != State.b && state != State.a;
    }

    static SwitchCompat b(DownloadHeaderView downloadheaderview)
    {
        return downloadheaderview.b;
    }

    private void b()
    {
        Resources resources = getResources();
        k = resources.getDimensionPixelSize(0x7f0c00d4) - 1;
        l = resources.getDimensionPixelSize(0x7f0c00d5) - 1;
        d = Optional.e();
    }

    private void b(View view, int i1, boolean flag)
    {
        if (flag)
        {
            gaq gaq1 = new gaq(view, i1, true);
            e.a(view, gaq1, true);
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    private void b(View view, boolean flag)
    {
        if (flag)
        {
            e.a(view, g, true);
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    private static boolean b(State state)
    {
        return state == State.f || state == State.g || state == State.h || state == State.i;
    }

    public final void a()
    {
        a(State.b, 0);
    }

    public final void a(int i1, int j1)
    {
        if (!com.spotify.mobile.android.provider.Metadata.OfflineSync.a(i1)) goto _L2; else goto _L1
_L1:
        Object obj = State.c;
_L4:
        a(((State) (obj)), j1);
        return;
_L2:
        if (com.spotify.mobile.android.provider.Metadata.OfflineSync.c(i1))
        {
            obj = State.d;
            continue; /* Loop/switch isn't completed */
        }
        if (!com.spotify.mobile.android.provider.Metadata.OfflineSync.b(i1, j1))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = State.e;
        if (true) goto _L4; else goto _L3
_L3:
        if (com.spotify.mobile.android.provider.Metadata.OfflineSync.a(i1, j1))
        {
            obj = com.spotify.mobile.android.provider.Metadata.OfflineSync.b(i1);
            switch (_cls2.a[((com.spotify.mobile.android.provider.Metadata.OfflineSync.WaitReason) (obj)).ordinal()])
            {
            default:
                Assertion.a((new StringBuilder("Unknown reason ")).append(obj).toString());
                obj = State.f;
                break;

            case 1: // '\001'
                obj = State.f;
                break;

            case 2: // '\002'
                obj = State.g;
                break;

            case 3: // '\003'
                obj = State.h;
                break;

            case 4: // '\004'
                obj = State.i;
                break;
            }
        } else
        {
            obj = State.b;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            e = new gbv();
            f = AnimationUtils.loadAnimation(getContext(), 0x7f040011);
            g = AnimationUtils.loadAnimation(getContext(), 0x7f040012);
            i = (ViewGroup)findViewById(0x7f1103f1);
            b = new SwitchCompat(getContext(), null, 0x7f010141);
            i.addView(b, new android.widget.LinearLayout.LayoutParams(-2, getResources().getDimensionPixelSize(0x7f0c00d3)));
            h = (ProgressBar)findViewById(0x7f1103a1);
            j = (TextView)findViewById(0x7f1103f2);
            dfz dfz1 = new dfz(getContext(), SpotifyIcon.p);
            dfz1.a(gcg.b(getContext(), 0x7f0f007c));
            j.setCompoundDrawablesWithIntrinsicBounds(dfz1, null, null, null);
            b.setOnCheckedChangeListener(m);
            return;
        }
    }

    private class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        public static final State d;
        public static final State e;
        public static final State f;
        public static final State g;
        public static final State h;
        public static final State i;
        private static final State j[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/spotify/mobile/android/ui/view/DownloadHeaderView$State, s);
        }

        public static State[] values()
        {
            return (State[])j.clone();
        }

        static 
        {
            a = new State("INIT", 0);
            b = new State("HIDDEN", 1);
            c = new State("DOWNLOADABLE", 2);
            d = new State("DOWNLOADING", 3);
            e = new State("DOWNLOADED", 4);
            f = new State("WAITING", 5);
            g = new State("NO_INTERNET", 6);
            h = new State("OFFLINE_MODE", 7);
            i = new State("SYNC_NOT_ALLOWED", 8);
            j = (new State[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private State(String s, int i1)
        {
            super(s, i1);
        }
    }

}
