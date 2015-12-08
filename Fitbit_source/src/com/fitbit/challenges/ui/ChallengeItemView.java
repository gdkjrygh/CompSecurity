// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.challenges.a.d;
import com.fitbit.challenges.a.f;
import com.fitbit.data.bl.ChallengesUtils;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.User;
import com.fitbit.data.domain.challenges.Challenge;
import com.fitbit.data.domain.challenges.ChallengeType;
import com.fitbit.data.domain.challenges.ChallengeUser;
import com.fitbit.data.domain.challenges.ChallengeUserParticipantStatus;
import com.fitbit.data.domain.challenges.ChallengeUserRank;
import com.fitbit.e.a;
import com.fitbit.home.ui.i;
import com.fitbit.ui.loadable.LoadablePicassoImageView;
import com.fitbit.ui.loadable.b;
import com.fitbit.ui.loadable.e;
import com.fitbit.util.al;
import com.fitbit.util.o;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengeItemView_

public class ChallengeItemView extends LinearLayout
{
    public static interface a
    {

        public abstract void a(Challenge challenge);
    }


    private static final String e = "com.fitbit.challenges.ui.ChallengeItemView";
    protected LoadablePicassoImageView a;
    protected TextView b;
    protected TextView c;
    protected TextView d;
    private Challenge f;
    private ChallengeType g;
    private a h;
    private i i;
    private e j;
    private b k;
    private e l;
    private b m;

    public ChallengeItemView(Context context)
    {
        super(context);
        i = new i();
    }

    public ChallengeItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = new i();
    }

    public ChallengeItemView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        i = new i();
    }

    public static ChallengeItemView a(Context context)
    {
        return com.fitbit.challenges.ui.ChallengeItemView_.b(context);
    }

    public static ChallengeItemView a(Context context, a a1)
    {
        context = a(context);
        context.a(a1);
        return context;
    }

    public static String a(Context context, Challenge challenge)
    {
        int i1 = ChallengesUtils.c(challenge).size();
        if (i1 == 0)
        {
            return context.getResources().getString(0x7f0800d0);
        } else
        {
            return al.a(0x7f0b0004, i1, new Object[] {
                Integer.valueOf(i1)
            });
        }
    }

    public static String a(Context context, Challenge challenge, Profile profile)
    {
        if (ChallengesUtils.b(challenge))
        {
            if (profile != null)
            {
                List list = challenge.l();
                Collections.sort(list, new f(new d()));
                int i1 = list.size();
                if (i1 > 1)
                {
                    challenge = challenge.h(profile.F());
                    if (challenge != null && challenge.i() != null)
                    {
                        int k1 = challenge.i().b();
                        int j1 = list.indexOf(challenge);
                        if (j1 > 0)
                        {
                            challenge = (ChallengeUser)list.get(j1 - 1);
                        } else
                        {
                            challenge = null;
                        }
                        if (j1 < i1 - 1)
                        {
                            profile = (ChallengeUser)list.get(j1 + 1);
                        } else
                        {
                            profile = null;
                        }
                        if (challenge != null && challenge.i() != null)
                        {
                            i1 = k1 - challenge.i().b();
                        } else
                        {
                            i1 = 0;
                        }
                        if (profile != null && profile.i() != null)
                        {
                            j1 = profile.i().b() - k1;
                        } else
                        {
                            j1 = 0;
                        }
                        if (k1 == 0 && j1 == 0)
                        {
                            return "";
                        }
                        if (challenge != null && (profile == null || i1 <= j1))
                        {
                            profile = al.a(0x7f0b001d, (new StringBuilder()).append(i1).append("").toString());
                            return context.getResources().getString(0x7f0800d3, new Object[] {
                                Integer.valueOf(i1), profile, challenge.g().P()
                            });
                        }
                        if (profile != null && (challenge == null || i1 > j1))
                        {
                            challenge = al.a(0x7f0b001d, (new StringBuilder()).append(j1).append("").toString());
                            return context.getResources().getString(0x7f0800d4, new Object[] {
                                Integer.valueOf(j1), challenge, profile.g().P()
                            });
                        }
                        com.fitbit.e.a.f("com.fitbit.challenges.ui.ChallengeItemView", (new StringBuilder()).append("Unexpected condition; aheadUser: ").append(profile).append("; behindUser: ").append(challenge).append("; ahead by ").append(i1).append("; behind by ").append(j1).toString(), new Object[0]);
                    }
                }
            }
            return "";
        } else
        {
            return ChallengesUtils.a(context, challenge, profile);
        }
    }

    public static String b(Context context, Challenge challenge, Profile profile)
    {
        double d1 = 1.0D;
        if (ChallengesUtils.b(challenge))
        {
            if (profile != null)
            {
                challenge = challenge.h(profile.F());
                if (challenge != null)
                {
                    double d2 = challenge.j().f();
                    int i1;
                    if (d2 <= 1.0D)
                    {
                        d1 = d2;
                    }
                    i1 = (int)(d1 * 100D);
                    return context.getResources().getString(0x7f0800d2, new Object[] {
                        Integer.valueOf(i1)
                    });
                }
            }
        } else
        {
            return ChallengesUtils.a(context, challenge, profile);
        }
        return "";
    }

    public static String c(Context context, Challenge challenge, Profile profile)
    {
        challenge = ChallengesUtils.d(challenge);
        int i1 = challenge.size();
        Object obj;
        switch (i1)
        {
        default:
            return al.a(0x7f0b0005, i1, new Object[] {
                Integer.valueOf(i1)
            });

        case 0: // '\0'
            return context.getResources().getString(0x7f0800d1);

        case 1: // '\001'
            obj = new com.fitbit.util.format.a(context);
            break;
        }
        ((com.fitbit.util.format.a) (obj)).a(profile);
        ((com.fitbit.util.format.a) (obj)).a(true);
        obj = ((com.fitbit.util.format.a) (obj)).a(challenge);
        if (ChallengesUtils.a(challenge, profile))
        {
            i1 = 0x7f0800d6;
        } else
        {
            i1 = 0x7f0800d5;
        }
        return context.getResources().getString(i1, new Object[] {
            obj
        });
    }

    private b d()
    {
        if (k == null)
        {
            k = new b(getContext(), a);
        }
        return k;
    }

    private e e()
    {
        if (j == null)
        {
            j = new e(getContext(), a);
        }
        return j;
    }

    private b f()
    {
        if (m == null)
        {
            m = new b(getContext(), a);
        }
        return m;
    }

    private e g()
    {
        if (l == null)
        {
            l = new e(getContext(), a);
        }
        return l;
    }

    public Challenge a()
    {
        return f;
    }

    public void a(a a1)
    {
        h = a1;
    }

    protected void a(Challenge challenge)
    {
        Object obj = "";
        if (challenge != null)
        {
            int i1;
            if (com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.INVITED == challenge.i())
            {
                obj = challenge.I();
                Resources resources;
                if (obj != null && ((ChallengeUser) (obj)).g() != null)
                {
                    obj = ((ChallengeUser) (obj)).g().P();
                } else
                {
                    obj = "";
                }
                obj = getResources().getString(0x7f0800db, new Object[] {
                    obj
                });
            } else
            {
                obj = challenge.h();
            }
            resources = getResources();
            if (com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.COMPLETE == challenge.i())
            {
                i1 = 0x7f0f0040;
            } else
            {
                i1 = 0x7f0f0029;
            }
            i1 = resources.getColor(i1);
            b.setTextColor(i1);
        }
        b.setText(((CharSequence) (obj)));
    }

    public void a(Challenge challenge, ChallengeType challengetype, Profile profile)
    {
        f = challenge;
        g = challengetype;
        a(challenge);
        b(challenge, challengetype, profile);
        c(challenge);
        b(challenge);
    }

    public a b()
    {
        return h;
    }

    protected void b(Challenge challenge)
    {
        if (challenge.i() == com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.INVITED)
        {
            a.a(e(), g());
            a.a(challenge.I().g().G());
            return;
        } else
        {
            a.a(d(), f());
            a.a(challenge.v());
            return;
        }
    }

    protected void b(Challenge challenge, ChallengeType challengetype, Profile profile)
    {
        String s;
        String s1;
        s1 = "";
        s = s1;
        if (challenge == null) goto _L2; else goto _L1
_L1:
        com.fitbit.data.domain.challenges.Challenge.ChallengeStatus challengestatus;
        challengestatus = challenge.i();
        s = s1;
        if (challengestatus == null) goto _L2; else goto _L3
_L3:
    /* anonymous class not found */
    class _anm1 {}

        com.fitbit.challenges.ui._cls1.a[challengestatus.ordinal()];
        JVM INSTR tableswitch 1 3: default 64
    //                   1 157
    //                   2 103
    //                   3 86;
           goto _L4 _L5 _L6 _L7
_L4:
        s = s1;
_L2:
        c.setText(s);
        c.setSelected(true);
        return;
_L7:
        s = s1;
        if (challengetype != null)
        {
            s = challengetype.d();
        }
        continue; /* Loop/switch isn't completed */
_L6:
        s = s1;
        if (challengetype != null)
        {
            if (challengetype.q())
            {
                s = a(getContext(), challenge, profile);
            } else
            {
                s = s1;
                if (challengetype.p())
                {
                    s = b(getContext(), challenge, profile);
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        s = s1;
        if (challengetype != null)
        {
            if (challengetype.q())
            {
                s = c(getContext(), challenge, profile);
            } else
            {
                s = s1;
                if (challengetype.p())
                {
                    s = a(getContext(), challenge);
                }
            }
        }
        if (true) goto _L2; else goto _L8
_L8:
    }

    protected void c()
    {
        if (h == null)
        {
            return;
        } else
        {
            h.a(f);
            return;
        }
    }

    protected void c(Challenge challenge)
    {
        String s;
        Date date;
        Date date1;
        Date date2;
        int i1;
        date1 = challenge.B();
        date2 = challenge.C();
        s = "";
        i1 = getResources().getColor(0x7f0f0040);
        date = new Date();
        com.fitbit.challenges.ui._cls1.a[challenge.i().ordinal()];
        JVM INSTR tableswitch 1 3: default 72
    //                   1 108
    //                   2 160
    //                   3 346;
           goto _L1 _L2 _L3 _L4
_L1:
        Object obj;
        int j1;
        com.fitbit.e.a.a("com.fitbit.challenges.ui.ChallengeItemView", "Do not know how to write the time left on an unknown status, setting to empty", new Object[0]);
        obj = s;
        j1 = i1;
_L6:
        d.setText(((CharSequence) (obj)));
        d.setTextColor(j1);
        return;
_L2:
        j1 = i1;
        obj = s;
        if (date2 != null)
        {
            long l1 = date.getTime();
            long l7 = date2.getTime();
            obj = i.a(getContext(), l1 - l7, 0x7f0800c4);
            j1 = i1;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (date1 != null && date.before(date1))
        {
            long l2 = date1.getTime();
            long l8 = date.getTime();
            obj = i.a(getContext(), l2 - l8, 0x7f080468);
            j1 = i1;
        } else
        if (date2 != null && date.before(date2))
        {
            long l3 = date2.getTime();
            long l9 = date.getTime();
            obj = i.a(getContext(), l3 - l9, 0x7f080466);
            j1 = i1;
        } else
        {
            j1 = i1;
            obj = s;
            if (challenge.D() != null)
            {
                j1 = i1;
                obj = s;
                if (date.before(challenge.D()))
                {
                    long l4 = challenge.D().getTime();
                    long l10 = date.getTime();
                    obj = i.a(getContext(), l4 - l10, 0x7f080469);
                    j1 = i1;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (o.i(date1) && o.i(date2) && o.i(date))
        {
            obj = getResources().getString(0x7f080540);
            j1 = getResources().getColor(0x7f0f0049);
            continue; /* Loop/switch isn't completed */
        }
        obj = challenge.E();
        challenge = ((Challenge) (obj));
        if (date2 != null)
        {
            long l5;
            long l11;
            if (obj != null)
            {
                l5 = ((Date) (obj)).getTime();
            } else
            {
                l5 = 0x7fffffffffffffffL;
            }
            challenge = new Date(Math.min(l5, date2.getTime()));
        }
        if (date1 == null || !date.before(date1))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = Calendar.getInstance();
        ((Calendar) (obj)).setTime(date1);
        ((Calendar) (obj)).add(10, -1);
        if (date.after(((Calendar) (obj)).getTime()) && date.before(challenge))
        {
            i1 = getResources().getColor(0x7f0f0049);
        }
        l5 = date1.getTime();
        l11 = date.getTime();
        challenge = i.a(getContext(), l5 - l11, 0x7f080468);
_L7:
        j1 = i1;
        obj = challenge;
        if (true) goto _L6; else goto _L5
_L5:
        if (challenge != null)
        {
            if (date.before(challenge))
            {
                long l6 = challenge.getTime();
                long l12 = date.getTime();
                challenge = i.a(getContext(), l6 - l12, 0x7f080467);
                i1 = getResources().getColor(0x7f0f0049);
            } else
            {
                challenge = getContext().getString(0x7f08029a);
            }
        } else
        {
            challenge = "";
        }
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }
}
