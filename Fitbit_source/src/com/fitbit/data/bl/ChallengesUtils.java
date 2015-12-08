// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.fitbit.FitBitApplication;
import com.fitbit.FitbitMobile.GCMNotification;
import com.fitbit.challenges.a.b;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.User;
import com.fitbit.data.domain.challenges.Challenge;
import com.fitbit.data.domain.challenges.ChallengeMessage;
import com.fitbit.data.domain.challenges.ChallengeType;
import com.fitbit.data.domain.challenges.ChallengeUser;
import com.fitbit.data.domain.challenges.ChallengeUserParticipantStatus;
import com.fitbit.data.domain.challenges.ChallengeUserRank;
import com.fitbit.e.a;
import com.fitbit.mixpanel.f;
import com.fitbit.pedometer.d;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.bl:
//            an

public class ChallengesUtils
{
    public static final class RematchSource extends Enum
    {

        public static final RematchSource a;
        public static final RematchSource b;
        private static final RematchSource c[];
        final String sourceString;

        public static RematchSource valueOf(String s)
        {
            return (RematchSource)Enum.valueOf(com/fitbit/data/bl/ChallengesUtils$RematchSource, s);
        }

        public static RematchSource[] values()
        {
            return (RematchSource[])c.clone();
        }

        static 
        {
            a = new RematchSource("SUMMARY_GRAPH", 0, "Summary Graph");
            b = new RematchSource("MESSAGE_VIEW", 1, "Message View");
            c = (new RematchSource[] {
                a, b
            });
        }

        private RematchSource(String s, int i, String s1)
        {
            super(s, i);
            sourceString = s1;
        }
    }

    public static class a
        implements Comparator
    {

        public int a(Challenge challenge, Challenge challenge1)
        {
            challenge = challenge.A();
            challenge1 = challenge1.A();
            return com.fitbit.data.bl.ChallengesUtils.d.a(challenge, challenge1);
        }

        public int compare(Object obj, Object obj1)
        {
            return a((Challenge)obj, (Challenge)obj1);
        }

        public a()
        {
        }
    }

    public static class b
        implements Comparator
    {

        public int a(Challenge challenge, Challenge challenge1)
        {
            com.fitbit.data.domain.challenges.Challenge.ChallengeStatus challengestatus = challenge.i();
            com.fitbit.data.domain.challenges.Challenge.ChallengeStatus challengestatus1 = challenge1.i();
            if (challengestatus != null || challengestatus1 == null)
            {
                if (challengestatus != null && challengestatus1 == null)
                {
                    return -1;
                }
                if (challengestatus != null && challengestatus1 != null)
                {
                    static class _cls2
                    {

                        static final int a[];
                        static final int b[];

                        static 
                        {
                            b = new int[com.fitbit.FitbitMobile.GCMNotification.Type.values().length];
                            try
                            {
                                b[com.fitbit.FitbitMobile.GCMNotification.Type.f.ordinal()] = 1;
                            }
                            catch (NoSuchFieldError nosuchfielderror5) { }
                            try
                            {
                                b[com.fitbit.FitbitMobile.GCMNotification.Type.g.ordinal()] = 2;
                            }
                            catch (NoSuchFieldError nosuchfielderror4) { }
                            a = new int[com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.values().length];
                            try
                            {
                                a[com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.INVITED.ordinal()] = 1;
                            }
                            catch (NoSuchFieldError nosuchfielderror3) { }
                            try
                            {
                                a[com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.ACTIVE.ordinal()] = 2;
                            }
                            catch (NoSuchFieldError nosuchfielderror2) { }
                            try
                            {
                                a[com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.COMPLETE.ordinal()] = 3;
                            }
                            catch (NoSuchFieldError nosuchfielderror1) { }
                            try
                            {
                                a[com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.UNKNOWN.ordinal()] = 4;
                            }
                            catch (NoSuchFieldError nosuchfielderror)
                            {
                                return;
                            }
                        }
                    }

                    if (challengestatus == challengestatus1)
                    {
                        switch (com.fitbit.data.bl._cls2.a[challengestatus.ordinal()])
                        {
                        default:
                            return 1;

                        case 1: // '\001'
                            return com.fitbit.data.bl.ChallengesUtils.a.a(challenge, challenge1);

                        case 2: // '\002'
                            return com.fitbit.data.bl.ChallengesUtils.b.a(challenge, challenge1);

                        case 3: // '\003'
                            return ChallengesUtils.c.a(challenge, challenge1);
                        }
                    }
                    if (com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.INVITED == challengestatus)
                    {
                        return -1;
                    }
                    if (com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.INVITED != challengestatus1)
                    {
                        if (com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.ACTIVE == challengestatus)
                        {
                            return -1;
                        }
                        if (com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.ACTIVE != challengestatus1 && com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.COMPLETE == challengestatus)
                        {
                            return -1;
                        }
                    }
                } else
                {
                    return 0;
                }
            }
            return 1;
        }

        public int compare(Object obj, Object obj1)
        {
            return a((Challenge)obj, (Challenge)obj1);
        }

        public b()
        {
        }
    }

    public static class c
        implements Comparator
    {

        public int a(ChallengeUser challengeuser, ChallengeUser challengeuser1)
        {
            Profile profile = com.fitbit.data.bl.an.a().b();
            if (challengeuser.f() == null || !challengeuser.f().equals(profile.F())) goto _L2; else goto _L1
_L1:
            return -1;
_L2:
            int i;
            if (challengeuser1.f() != null && challengeuser1.f().equals(profile.F()))
            {
                return 1;
            }
            i = challengeuser.g().P().compareToIgnoreCase(challengeuser1.g().P());
            if (i == 0)
            {
                break; /* Loop/switch isn't completed */
            }
            if (challengeuser.g().P().length() == 0)
            {
                return 1;
            }
            if (challengeuser1.g().P().length() == 0) goto _L1; else goto _L3
_L3:
            return i;
        }

        public int compare(Object obj, Object obj1)
        {
            return a((ChallengeUser)obj, (ChallengeUser)obj1);
        }

        public c()
        {
        }
    }

    public static interface d
    {

        public abstract void a();

        public abstract void b();
    }

    public static class e
        implements Comparator
    {

        public int a(Challenge challenge, Challenge challenge1)
        {
            challenge = challenge.C();
            challenge1 = challenge1.C();
            return com.fitbit.data.bl.ChallengesUtils.d.a(challenge1, challenge);
        }

        public int compare(Object obj, Object obj1)
        {
            return a((Challenge)obj, (Challenge)obj1);
        }

        public e()
        {
        }
    }

    public static class f
        implements Comparator
    {

        public int a(Challenge challenge, Challenge challenge1)
        {
            challenge = challenge.z();
            challenge1 = challenge1.z();
            return com.fitbit.data.bl.ChallengesUtils.d.a(challenge, challenge1);
        }

        public int compare(Object obj, Object obj1)
        {
            return a((Challenge)obj, (Challenge)obj1);
        }

        public f()
        {
        }
    }

    public static class g
        implements Comparator
    {

        public int a(ChallengeMessage challengemessage, ChallengeMessage challengemessage1)
        {
            if (challengemessage1.c() == null && challengemessage.c() != null)
            {
                return 1;
            }
            if (challengemessage.c() == null && challengemessage1.c() != null)
            {
                return -1;
            } else
            {
                return challengemessage1.e().compareTo(challengemessage.e());
            }
        }

        public int compare(Object obj, Object obj1)
        {
            return a((ChallengeMessage)obj, (ChallengeMessage)obj1);
        }

        public g()
        {
        }
    }


    public static final f a = new f();
    public static final a b = new a();
    public static final e c = new e();
    public static final com.fitbit.challenges.a.b d = new com.fitbit.challenges.a.b();
    private static final String e = "ChallengesUtils";

    public ChallengesUtils()
    {
    }

    public static ChallengeType a(Collection collection, Challenge challenge)
    {
        if (challenge != null && challenge.w() != null)
        {
            return a(collection, challenge.w());
        } else
        {
            return null;
        }
    }

    public static ChallengeType a(Collection collection, String s)
    {
label0:
        {
            if (collection == null || s == null)
            {
                break label0;
            }
            collection = collection.iterator();
            ChallengeType challengetype;
            do
            {
                if (!collection.hasNext())
                {
                    break label0;
                }
                challengetype = (ChallengeType)collection.next();
            } while (!s.equals(challengetype.f()));
            return challengetype;
        }
        return null;
    }

    public static SimpleConfirmDialogFragment a(Activity activity, d d1)
    {
        com.fitbit.e.a.a("ChallengesUtils", "createUpdateAppDialog", new Object[0]);
        Intent intent = com.fitbit.pedometer.d.a(FitBitApplication.a().getPackageManager(), FitBitApplication.a().getApplicationContext().getPackageName());
        if (intent != null)
        {
            com.fitbit.e.a.a("ChallengesUtils", "null != intent", new Object[0]);
            return SimpleConfirmDialogFragment.a(new com.fitbit.util.SimpleConfirmDialogFragment.a(d1, activity, intent) {

                final d a;
                final Activity b;
                final Intent c;

                public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                {
                    com.fitbit.e.a.a("ChallengesUtils", "onPositive", new Object[0]);
                    if (a != null)
                    {
                        a.a();
                    }
                    if (b != null)
                    {
                        b.startActivity(c);
                    }
                }

                public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                {
                    com.fitbit.e.a.a("ChallengesUtils", "onNegative", new Object[0]);
                    if (a != null)
                    {
                        a.b();
                    }
                }

                public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
                {
                }

            
            {
                a = d1;
                b = activity;
                c = intent;
                super();
            }
            }, 0x7f0800c0, 0x7f0800bf, 0x7f0800c1, 0x7f0800be);
        } else
        {
            com.fitbit.e.a.a("ChallengesUtils", "null == intent", new Object[0]);
            return null;
        }
    }

    public static String a(Context context, Challenge challenge, Profile profile)
    {
        context = new com.fitbit.util.format.a(context);
        context.a(profile);
        context.a(true);
        return context.a(challenge.l());
    }

    public static String a(List list, int i)
    {
        if (list != null && i < list.size())
        {
            list = (ChallengeUser)list.get(i);
            if (list != null && list.g() != null && list.g().P() != null)
            {
                return list.g().P();
            }
        }
        return "";
    }

    public static List a(Challenge challenge, ChallengeType challengetype)
    {
        ArrayList arraylist = new ArrayList();
        if (challenge == null || challengetype == null) goto _L2; else goto _L1
_L1:
        for (Iterator iterator = challenge.H().iterator(); iterator.hasNext();)
        {
            ChallengeMessage challengemessage = (ChallengeMessage)iterator.next();
            if (challengemessage != null && com.fitbit.data.domain.challenges.ChallengeMessage.ChallengeMessageType.NO_WINNERS == challengemessage.f())
            {
                return arraylist;
            }
        }

        if (!challengetype.q()) goto _L4; else goto _L3
_L3:
        challenge = d(challenge);
_L6:
        return challenge;
_L4:
        if (challengetype.p())
        {
            challenge = c(challenge);
            continue; /* Loop/switch isn't completed */
        }
_L2:
        challenge = arraylist;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static JSONObject a(String s, String s1)
    {
        String s2 = s;
        if (s == null)
        {
            s2 = "UNKNOWN";
        }
        return a(new JSONObject(Collections.singletonMap("!ChallengeType", s2)), "!ChallengeId", s1);
    }

    private static JSONObject a(JSONObject jsonobject, String s)
    {
        return a(jsonobject, "!TriggerType", s);
    }

    private static JSONObject a(JSONObject jsonobject, String s, String s1)
    {
        if (s1 != null && s != null)
        {
            try
            {
                jsonobject.put(s, s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return jsonobject;
            }
        }
        return jsonobject;
    }

    public static void a(GCMNotification gcmnotification)
    {
        if (gcmnotification == null) goto _L2; else goto _L1
_L1:
        String s;
        String s1;
        s = "UNKNOWN";
        s1 = gcmnotification.e();
        com.fitbit.data.bl._cls2.b[gcmnotification.a().ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 62
    //                   2 69;
           goto _L3 _L4 _L5
_L3:
        gcmnotification = s;
_L7:
        com.fitbit.mixpanel.f.a("Push Notification: Open", a(a(((String) (null)), s1), ((String) (gcmnotification))));
_L2:
        return;
_L4:
        gcmnotification = "invite";
        continue; /* Loop/switch isn't completed */
_L5:
        if (gcmnotification.g() == null)
        {
            gcmnotification = "message";
        } else
        {
            gcmnotification = "cheer";
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static void a(String s, Challenge challenge)
    {
        com.fitbit.mixpanel.f.a(s, f(challenge));
    }

    public static void a(String s, Challenge challenge, String s1)
    {
        com.fitbit.mixpanel.f.a(s, a(f(challenge), s1));
    }

    public static void a(String s, Date date, RematchSource rematchsource)
    {
        if (date == null)
        {
            date = "Later";
        } else
        if (o.b().compareTo(date) >= 0)
        {
            date = "Now";
        } else
        {
            date = "Later";
        }
        date = a(a(s, ((String) (null))), "!StartTime", ((String) (date)));
        if (rematchsource != null)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        date = a(((JSONObject) (date)), "!Rematch", s);
        s = date;
        if (rematchsource != null)
        {
            s = a(((JSONObject) (date)), "!Source", rematchsource.sourceString);
        }
        com.fitbit.mixpanel.f.a("Challenges: Create", s);
    }

    public static void a(List list)
    {
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (iterator.next() == null)
            {
                iterator.remove();
            }
        } while (true);
        Collections.sort(list, new c());
    }

    public static boolean a(Challenge challenge)
    {
        if (challenge != null)
        {
            return o.t(challenge.C());
        } else
        {
            return false;
        }
    }

    public static boolean a(ChallengeUser challengeuser, Challenge challenge)
    {
        challengeuser = challengeuser.a();
        Date date = challenge.C();
        challenge = challenge.D();
        return challengeuser == null || !challengeuser.after(date) || !challengeuser.before(challenge);
    }

    public static boolean a(List list, Profile profile)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (((ChallengeUser)list.next()).a(profile))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean b(Challenge challenge)
    {
        if (challenge != null)
        {
            return o.t(challenge.B());
        } else
        {
            return false;
        }
    }

    public static List c(Challenge challenge)
    {
        ArrayList arraylist = new ArrayList();
        challenge = challenge.l().iterator();
        do
        {
            if (!challenge.hasNext())
            {
                break;
            }
            ChallengeUser challengeuser = (ChallengeUser)challenge.next();
            if (challengeuser.j().a())
            {
                arraylist.add(challengeuser);
            }
        } while (true);
        return arraylist;
    }

    public static List d(Challenge challenge)
    {
        ArrayList arraylist = new ArrayList();
        challenge = challenge.l().iterator();
        do
        {
            if (!challenge.hasNext())
            {
                break;
            }
            ChallengeUser challengeuser = (ChallengeUser)challenge.next();
            int i;
            if (challengeuser.i() != null)
            {
                i = challengeuser.i().a();
            } else
            {
                i = 2;
            }
            if (i == 1)
            {
                arraylist.add(challengeuser);
            }
        } while (true);
        return arraylist;
    }

    public static boolean e(Challenge challenge)
    {
        boolean flag1 = false;
        Date date = new Date();
        Date date1 = challenge.E();
        boolean flag = flag1;
        if (date1 != null)
        {
            flag = flag1;
            if (date.after(date1))
            {
                flag = flag1;
                if (com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.INVITED == challenge.i())
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private static JSONObject f(Challenge challenge)
    {
        if (challenge != null)
        {
            return a(challenge.w(), challenge.g());
        } else
        {
            return a(((String) (null)), ((String) (null)));
        }
    }

}
