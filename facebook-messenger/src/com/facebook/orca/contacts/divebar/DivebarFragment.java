// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.a.c;
import android.support.v4.app.ag;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.base.activity.h;
import com.facebook.base.broadcast.LocalBroadcast;
import com.facebook.base.broadcast.j;
import com.facebook.base.broadcast.l;
import com.facebook.base.fragment.FbFragment;
import com.facebook.c.s;
import com.facebook.contacts.a.d;
import com.facebook.contacts.database.AddressBookPeriodicRunner;
import com.facebook.contacts.picker.ContactPickerColorScheme;
import com.facebook.contacts.picker.ae;
import com.facebook.contacts.picker.af;
import com.facebook.contacts.picker.ah;
import com.facebook.contacts.picker.bd;
import com.facebook.contacts.picker.u;
import com.facebook.contacts.picker.v;
import com.facebook.contacts.upload.ContactsUploadState;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.m;
import com.facebook.inject.t;
import com.facebook.l.k;
import com.facebook.l.x;
import com.facebook.o;
import com.facebook.orca.annotations.ForDivebarList;
import com.facebook.orca.annotations.IsClientSmsEnabled;
import com.facebook.orca.annotations.IsDivebarMoreMobileFriendsEnabled;
import com.facebook.orca.annotations.IsDivebarMoreMobileFriendsNewSectionEnabled;
import com.facebook.orca.annotations.IsPartialAccount;
import com.facebook.orca.annotations.IsSmsReadPermitted;
import com.facebook.orca.annotations.ShowGroupsSectionInDivebar;
import com.facebook.orca.contacts.annotations.IsChatContextEnabled;
import com.facebook.orca.contacts.picker.ad;
import com.facebook.orca.contacts.picker.ar;
import com.facebook.orca.contacts.picker.az;
import com.facebook.orca.creation.CreateThreadActivity;
import com.facebook.orca.threadlist.bf;
import com.facebook.orca.threadlist.bl;
import com.facebook.orca.threadlist.bm;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.ThreadsCollection;
import com.facebook.prefs.shared.e;
import com.facebook.user.User;
import com.facebook.user.UserWithIdentifier;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.hq;
import com.google.common.a.kl;
import com.google.common.base.Optional;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            u, bs, be, ap, 
//            aa, v, an, w, 
//            x, z, s, e, 
//            ao, r, y, t, 
//            bl

public class DivebarFragment extends FbFragment
{

    private static final Class a = com/facebook/orca/contacts/divebar/DivebarFragment;
    private a Z;
    private List aA;
    private List aB;
    private List aC;
    private List aD;
    private long aE;
    private long aF;
    private int aG;
    private z aH;
    private boolean aI;
    private j aJ;
    private l aK;
    private y aL;
    private a aa;
    private a ab;
    private a ac;
    private a ad;
    private a ae;
    private a af;
    private s ag;
    private av ah;
    private com.facebook.fbservice.ops.k ai;
    private com.facebook.prefs.shared.d aj;
    private com.facebook.contacts.upload.c ak;
    private com.facebook.auth.b.b al;
    private com.facebook.common.time.a am;
    private bf an;
    private bs ao;
    private aa ap;
    private ap aq;
    private be ar;
    private com.facebook.contacts.picker.c as;
    private com.facebook.orca.contacts.divebar.bl at;
    private v au;
    private boolean av;
    private boolean aw;
    private List ax;
    private List ay;
    private List az;
    private AddressBookPeriodicRunner b;
    private k c;
    private com.facebook.contacts.a.c d;
    private com.facebook.orca.contacts.divebar.e e;
    private d f;
    private az g;
    private ao h;
    private bd i;

    public DivebarFragment()
    {
        aE = 0L;
        aG = 0;
    }

    private void O()
    {
        c c1 = y().a(0);
        if (c1 != null)
        {
            com.facebook.debug.log.b.b(a, "stopping DivebarLoader");
            c1.b(null);
            c1.k();
        }
    }

    private android.support.v4.app.ah P()
    {
        return new com.facebook.orca.contacts.divebar.u(this);
    }

    private int Q()
    {
        Iterator iterator = hq.a(new List[] {
            ax, ay, az, aA, aB, aD
        }).iterator();
        int i1 = 0;
        while (iterator.hasNext()) 
        {
            List list = (List)iterator.next();
            int j1;
            if (list != null)
            {
                j1 = list.size();
            } else
            {
                j1 = 0;
            }
            i1 = j1 + i1;
        }
        return i1;
    }

    private boolean R()
    {
        boolean flag2 = false;
        boolean flag;
        boolean flag1;
        if (ax != null && ay != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (aI && Q() == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag || flag1)
        {
            flag2 = true;
        }
        return flag2;
    }

    private void T()
    {
        boolean flag1 = true;
        boolean flag2 = false;
        long l1 = f.c();
        boolean flag = flag2;
        if (l1 > 0L)
        {
            flag = flag2;
            if (l1 != aE)
            {
                es es1 = f.b();
                flag = flag2;
                if (es1 != null)
                {
                    ax = hq.a(es1);
                    aE = l1;
                    flag = true;
                }
            }
        }
        if (a(ak.b()))
        {
            flag = flag1;
        }
        if (flag)
        {
            W();
        }
    }

    private void U()
    {
        com.facebook.debug.log.b.b(a, "loadFriends");
        V();
        y().a(0, null, P());
    }

    private void V()
    {
        aF = 0L;
        aG = 0;
    }

    private void W()
    {
        ao.c();
        Object obj = ax;
        List list = ay;
        List list1 = az;
        List list3 = aA;
        List list2 = aB;
        Object obj3 = aD;
        Object obj1 = es.e();
        if (av)
        {
            ((et) (obj1)).b(ar.c);
        }
        if (R())
        {
            com.facebook.debug.log.b.a(a, "Top friends not loaded; not showing any users in list.");
            obj = ((et) (obj1)).b();
            ar.a(((es) (obj)));
            if (!av)
            {
                ar.d();
            }
            return;
        }
        Object obj2 = aq.a();
        if (((Optional) (obj2)).isPresent())
        {
            ((et) (obj1)).b(((Optional) (obj2)).get());
        }
        obj2 = kl.a();
        if (aw && aC != null && aC.size() > 0)
        {
            ((et) (obj1)).b(new ae(n().getString(o.contact_picker_recents_header)));
            for (int i1 = 0; i1 < 4 && i1 < aC.size(); i1++)
            {
                ((et) (obj1)).b(new ad((ThreadSummary)aC.get(i1)));
            }

        }
        boolean flag;
        int k1;
        if (obj != null && ((List) (obj)).size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (list.size() > 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (((Boolean)ae.b()).booleanValue() && !ap.b())
        {
            ((et) (obj1)).b(new ae(n().getString(o.contact_picker_groups_header)));
            User user1;
            UserWithIdentifier userwithidentifier2;
            if (a(((List) (obj3)), ((et) (obj1))) > 0)
            {
                X();
            } else
            {
                ((et) (obj1)).b(ar.g);
            }
        }
        if (flag || k1)
        {
            ((et) (obj1)).b(ar.b);
            if (obj != null)
            {
                for (obj3 = ((List) (obj)).iterator(); ((Iterator) (obj3)).hasNext(); ((Set) (obj2)).add(user1.c()))
                {
                    user1 = (User)((Iterator) (obj3)).next();
                    userwithidentifier2 = new UserWithIdentifier(user1, user1.i());
                    ((et) (obj1)).b(g.b(userwithidentifier2, ah.FAVORITES));
                }

            }
        }
        if (flag && k1)
        {
            ((et) (obj1)).b(new af());
        }
        int j1 = 0;
        while (j1 < 15 && j1 < list.size()) 
        {
            obj3 = (User)list.get(j1);
            if (!((Set) (obj2)).contains(((User) (obj3)).c()))
            {
                UserWithIdentifier userwithidentifier = new UserWithIdentifier(((User) (obj3)), ((User) (obj3)).i());
                ((et) (obj1)).b(g.b(userwithidentifier, ah.TOP_FRIENDS));
                ((Set) (obj2)).add(((User) (obj3)).c());
            }
            j1++;
        }
        Object obj4 = hq.a();
        java.util.ArrayList arraylist = hq.a();
        obj3 = hq.b();
        if (list1 != null)
        {
            if (((Boolean)ab.b()).booleanValue())
            {
                ((List) (obj4)).addAll(list1);
            } else
            {
                arraylist.addAll(list1);
            }
        }
        if (!((List) (obj4)).isEmpty())
        {
            Collections.sort(((List) (obj4)), i);
            obj4 = ((List) (obj4)).iterator();
            boolean flag1 = false;
            do
            {
                if (!((Iterator) (obj4)).hasNext())
                {
                    break;
                }
                User user4 = (User)((Iterator) (obj4)).next();
                if (!((Set) (obj2)).contains(user4.c()))
                {
                    k1 = ((flag1) ? 1 : 0);
                    if (!flag1)
                    {
                        ((et) (obj1)).b(new ae(n().getString(o.contact_picker_online_friends_header)));
                        k1 = 1;
                    }
                    UserWithIdentifier userwithidentifier5 = new UserWithIdentifier(user4, user4.i());
                    ((et) (obj1)).b(g.b(userwithidentifier5, ah.UNKNOWN));
                    ((Set) (obj2)).add(user4.c());
                    flag1 = k1;
                }
            } while (true);
        }
        if (list3 != null)
        {
            arraylist.addAll(list3);
        }
        if (!arraylist.isEmpty() && !Y())
        {
            Collections.sort(arraylist, i);
            Iterator iterator = arraylist.iterator();
            boolean flag2 = false;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                User user3 = (User)iterator.next();
                if (!((Set) (obj2)).contains(user3.c()))
                {
                    k1 = ((flag2) ? 1 : 0);
                    if (!flag2)
                    {
                        ((et) (obj1)).b(new ae(n().getString(o.contact_picker_more_friends_header)));
                        k1 = 1;
                    }
                    UserWithIdentifier userwithidentifier4 = new UserWithIdentifier(user3, user3.i());
                    ((et) (obj1)).b(g.b(userwithidentifier4, ah.UNKNOWN));
                    ((Set) (obj2)).add(user3.c());
                    flag2 = k1;
                }
            } while (true);
        }
        if (list2 != null)
        {
            if (Y())
            {
                list2.addAll(arraylist);
            }
            Collections.sort(list2, i);
            Iterator iterator1 = list2.iterator();
            boolean flag3 = false;
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                User user2 = (User)iterator1.next();
                if (!((Set) (obj2)).contains(user2.c()))
                {
                    if (Y() && !c.a(user2.c()) && !c.b(user2.c()).b())
                    {
                        ((List) (obj3)).add(user2);
                    } else
                    {
                        k1 = ((flag3) ? 1 : 0);
                        if (!flag3)
                        {
                            ((et) (obj1)).b(new ae(n().getString(o.contact_picker_other_contacts_header)));
                            k1 = 1;
                        }
                        UserWithIdentifier userwithidentifier3 = new UserWithIdentifier(user2, user2.i());
                        ((et) (obj1)).b(g.b(userwithidentifier3, ah.ACTIVE_FRIENDS));
                        ((Set) (obj2)).add(user2.c());
                        flag3 = k1;
                    }
                }
            } while (true);
        }
        if (obj3 != null && ao.b())
        {
            Iterator iterator2 = ((List) (obj3)).iterator();
            boolean flag4 = false;
            do
            {
                if (!iterator2.hasNext())
                {
                    break;
                }
                User user = (User)iterator2.next();
                if (!((Set) (obj2)).contains(user.c()))
                {
                    k1 = ((flag4) ? 1 : 0);
                    if (!flag4)
                    {
                        ((et) (obj1)).b(new ae(n().getString(o.contact_picker_offline_contacts_header)));
                        k1 = 1;
                    }
                    UserWithIdentifier userwithidentifier1 = new UserWithIdentifier(user, user.i());
                    ((et) (obj1)).b(g.b(userwithidentifier1, ah.ACTIVE_FRIENDS));
                    ((Set) (obj2)).add(user.c());
                    flag4 = k1;
                }
            } while (true);
        }
        if (((Boolean)Z.b()).booleanValue())
        {
            ((et) (obj1)).b((new com.facebook.orca.contacts.picker.ag()).a(new com.facebook.orca.contacts.divebar.v(this)).a());
        }
        obj1 = ((et) (obj1)).b();
        ar.a(((es) (obj1)));
        int l1;
        int i2;
        if (obj != null)
        {
            flag4 = ((List) (obj)).size();
        } else
        {
            flag4 = false;
        }
        if (list != null)
        {
            k1 = list.size();
        } else
        {
            k1 = 0;
        }
        if (list1 != null)
        {
            l1 = list1.size();
        } else
        {
            l1 = 0;
        }
        if (list2 != null)
        {
            i2 = list2.size();
        } else
        {
            i2 = 0;
        }
        e(i2 + (flag4 + k1 + l1));
    }

    private void X()
    {
        cb cb1 = (new cb("view")).h(af()).e("divebar").f("list_section").g("group_conversations_section");
        ah.a(cb1);
    }

    private boolean Y()
    {
        return ao.a() || ao.b();
    }

    private void Z()
    {
        cb cb1 = (new cb("click")).h(af()).e("divebar").f("button").g("orca_divebar_fragment_invite_friends_clicked");
        if (((Boolean)ac.b()).booleanValue() && ((Boolean)ad.b()).booleanValue())
        {
            Intent intent = aa();
            cb1.b("composer_type", "orca_composer");
            ag.a(intent, n());
        } else
        {
            Intent intent1 = ab();
            cb1.b("composer_type", "native_composer");
            ag.b(intent1, n());
        }
        ah.a(cb1);
    }

    static int a(DivebarFragment divebarfragment, int i1)
    {
        divebarfragment.aG = i1;
        return i1;
    }

    private int a(List list, et et1)
    {
        if (list == null)
        {
            return 0;
        }
        list = list.iterator();
        int i1 = 0;
        do
        {
            ThreadSummary threadsummary;
label0:
            {
                if (list.hasNext())
                {
                    threadsummary = (ThreadSummary)list.next();
                    if (i1 < 3)
                    {
                        break label0;
                    }
                }
                return i1;
            }
            if (threadsummary.j().size() >= 3 && threadsummary.w())
            {
                et1.b(new ad(threadsummary));
                i1++;
            }
        } while (true);
    }

    static long a(DivebarFragment divebarfragment, long l1)
    {
        divebarfragment.aF = l1;
        return l1;
    }

    public static DivebarFragment a(ContactPickerColorScheme contactpickercolorscheme)
    {
        return a(contactpickercolorscheme, false);
    }

    public static DivebarFragment a(ContactPickerColorScheme contactpickercolorscheme, boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("PARAM_COLOR_SCHEME", contactpickercolorscheme);
        bundle.putBoolean("PARAM_SHOW_RECENT_THREADS", flag);
        contactpickercolorscheme = new DivebarFragment();
        contactpickercolorscheme.g(bundle);
        return contactpickercolorscheme;
    }

    static az a(DivebarFragment divebarfragment)
    {
        return divebarfragment.g;
    }

    static void a(DivebarFragment divebarfragment, Intent intent)
    {
        divebarfragment.b(intent);
    }

    static void a(DivebarFragment divebarfragment, an an1)
    {
        divebarfragment.a(an1);
    }

    static void a(DivebarFragment divebarfragment, bm bm1)
    {
        divebarfragment.a(bm1);
    }

    private void a(an an1)
    {
        boolean flag1;
        flag1 = true;
        break MISSING_BLOCK_LABEL_2;
        if (s() && an1 != null)
        {
            if (aG != 0 && aF > 0L && SystemClock.elapsedRealtime() - aF < 2000L)
            {
                com.facebook.debug.log.b.b(a, "Skipping list udpate. user is interacting with list");
                return;
            }
            boolean flag = false;
            aI = an1.g();
            if (an1.b() != null)
            {
                ay = hq.a(an1.b());
                flag = true;
            }
            if (an1.c() != null)
            {
                az = hq.a(an1.c());
                flag = true;
            }
            if (an1.a() != null)
            {
                ax = hq.a(an1.a());
                flag = true;
            }
            if (an1.e() != null)
            {
                aA = hq.a(an1.e());
                flag = true;
            }
            if (an1.d() != null)
            {
                aB = hq.a(an1.d());
                flag = true;
            }
            if (an1.f() != null)
            {
                aD = hq.a(an1.f());
                flag = flag1;
            }
            if (flag || !an1.g())
            {
                com.facebook.debug.log.b.b(a, "updating list with new result from loader");
                W();
            }
            if (ay != null && (az != null || aA != null) && !an1.g())
            {
                O();
                com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Stopped loader with new result=").append(an1.toString()).toString());
                return;
            }
        }
        return;
    }

    private void a(bm bm1)
    {
        aC = bm1.a.b();
        W();
    }

    private boolean a(ContactsUploadState contactsuploadstate)
    {
        contactsuploadstate = contactsuploadstate.a();
        boolean flag;
        if (contactsuploadstate == com.facebook.contacts.upload.k.STARTED || contactsuploadstate == com.facebook.contacts.upload.k.RUNNING)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag != av)
        {
            av = flag;
            return true;
        } else
        {
            return false;
        }
    }

    private Intent aa()
    {
        Context context = n();
        Intent intent = new Intent(context, com/facebook/orca/creation/CreateThreadActivity);
        intent.putExtra("show_composer", true);
        intent.putExtra("composer_initial_text", context.getString(o.invite_friends_default_text));
        return intent;
    }

    private Intent ab()
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("sms:"));
        intent.setType("vnd.android-dir/mms-sms");
        intent.putExtra("sms_body", n().getString(o.invite_friends_default_text));
        return intent;
    }

    private void ac()
    {
        Bundle bundle = new Bundle();
        ai.a(com.facebook.contacts.server.d.n, bundle).a();
    }

    private void ad()
    {
        e e1 = aj.b();
        e1.a(com.facebook.orca.prefs.o.G, true);
        e1.a(com.facebook.orca.prefs.o.H, am.a());
        e1.a();
    }

    private void ae()
    {
        int i1 = aj.a(com.facebook.orca.prefs.o.F, 0);
        e e1 = aj.b();
        e1.a(com.facebook.orca.prefs.o.F, i1 + 1);
        e1.a(com.facebook.orca.prefs.o.E, am.a());
        e1.a();
    }

    private String af()
    {
        Context context = n();
        if (context instanceof h)
        {
            return ((h)context).h();
        } else
        {
            return null;
        }
    }

    static ao b(DivebarFragment divebarfragment)
    {
        return divebarfragment.h;
    }

    private void b(Intent intent)
    {
        String s1;
        boolean flag1;
        s1 = intent.getAction();
        flag1 = false;
        if (!"com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED".equals(s1)) goto _L2; else goto _L1
_L1:
        boolean flag;
        com.facebook.debug.log.b.b(a, "CONTACTS_UPLOAD_STATE_CHANGED");
        flag = flag1;
        if (u())
        {
            if (a((ContactsUploadState)intent.getParcelableExtra("state")))
            {
                W();
            }
            flag = true;
        }
_L4:
        if (flag)
        {
            a();
        }
        return;
_L2:
        if ("com.facebook.orca.presence.PRESENCE_MANAGER_SETTINGS_CHANGED".equals(s1))
        {
            com.facebook.debug.log.b.b(a, "PRESENCE_MANAGER_SETTINGS_CHANGED");
            flag = true;
        } else
        if (com.facebook.backgroundlocation.status.d.a.equals(s1))
        {
            com.facebook.debug.log.b.b(a, "BackgroundLocationStatusManager settings changed");
            flag = true;
        } else
        {
            flag = flag1;
            if ("com.facebook.orca.contacts.divebar.GROUP_MEGAPHONE_DISMISSED".equals(s1))
            {
                com.facebook.debug.log.b.b(a, "ACTION_GROUP_MEGAPHONE_DISMISSED");
                W();
                flag = flag1;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static Class c()
    {
        return a;
    }

    static void c(DivebarFragment divebarfragment)
    {
        divebarfragment.Z();
    }

    private ContactPickerColorScheme d()
    {
        if (k() != null && k().containsKey("PARAM_COLOR_SCHEME"))
        {
            return (ContactPickerColorScheme)k().getParcelable("PARAM_COLOR_SCHEME");
        } else
        {
            return ContactPickerColorScheme.DIVEBAR_SCHEME;
        }
    }

    static void d(DivebarFragment divebarfragment)
    {
        divebarfragment.ad();
    }

    private void e(int i1)
    {
        if (aj.a(com.facebook.contacts.upload.a.c, false))
        {
            w w1 = new w(this);
            com.facebook.orca.contacts.divebar.x x1 = new com.facebook.orca.contacts.divebar.x(this);
            ar.a(w1, x1, i1);
        }
    }

    static void e(DivebarFragment divebarfragment)
    {
        divebarfragment.ac();
    }

    static be f(DivebarFragment divebarfragment)
    {
        return divebarfragment.ar;
    }

    static void g(DivebarFragment divebarfragment)
    {
        divebarfragment.ae();
    }

    public void A()
    {
        super.A();
        T();
        if (aH != null)
        {
            aH.b();
        }
    }

    public void B()
    {
        super.B();
        if (aH != null)
        {
            aH.a();
        }
    }

    public void C()
    {
        super.C();
        O();
        if (an != null)
        {
            an.a();
        }
        if (aK != null)
        {
            aK.c();
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = S();
        as = (com.facebook.contacts.picker.c)layoutinflater.a(com/facebook/contacts/picker/c, com/facebook/orca/annotations/ForDivebarList);
        as.a().a(au);
        as.a(d());
        ar = new be(n(), as, d());
        ar.setContactPickerViewListener(at);
        ar.setOnContactListScrollListener(new com.facebook.orca.contacts.divebar.s(this));
        aq.a(at);
        ar.setSearchHint(a(o.name_or_phone_search_hint));
        aa = layoutinflater.b(java/lang/Boolean, com/facebook/orca/annotations/IsDivebarMoreMobileFriendsEnabled);
        ab = layoutinflater.b(java/lang/Boolean, com/facebook/orca/annotations/IsDivebarMoreMobileFriendsNewSectionEnabled);
        return ar;
    }

    public void a()
    {
        if (al.b() && !al.c())
        {
            if (R())
            {
                ar.d();
            }
            if (aw)
            {
                an.a(FolderName.b);
                an.a(new bl(false, false));
            }
            ag ag1 = y();
            if (ag1.a(0) != null)
            {
                O();
                V();
                ag1.b(0, null, P());
                return;
            }
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = S();
        b = (AddressBookPeriodicRunner)bundle.a(com/facebook/contacts/database/AddressBookPeriodicRunner);
        c = (k)bundle.a(com/facebook/l/k);
        d = (com.facebook.contacts.a.c)bundle.a(com/facebook/contacts/a/c);
        e = (com.facebook.orca.contacts.divebar.e)bundle.a(com/facebook/orca/contacts/divebar/e);
        h = (ao)bundle.a(com/facebook/orca/contacts/divebar/ao);
        f = (d)bundle.a(com/facebook/contacts/a/d);
        g = (az)bundle.a(com/facebook/orca/contacts/picker/az);
        Z = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/IsPartialAccount);
        ac = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/IsClientSmsEnabled);
        ad = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsReadPermitted);
        ae = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/ShowGroupsSectionInDivebar);
        ak = (com.facebook.contacts.upload.c)bundle.a(com/facebook/contacts/upload/c);
        i = new bd();
        ai = (com.facebook.fbservice.ops.k)bundle.a(com/facebook/fbservice/ops/k);
        aj = (com.facebook.prefs.shared.d)bundle.a(com/facebook/prefs/shared/d);
        am = (com.facebook.common.time.a)bundle.a(com/facebook/common/time/a);
        ag = (s)bundle.a(com/facebook/c/s);
        ah = (av)bundle.a(com/facebook/analytics/av);
        al = (com.facebook.auth.b.b)bundle.a(com/facebook/auth/b/b);
        an = (bf)bundle.a(com/facebook/orca/threadlist/bf);
        ao = (bs)bundle.a(com/facebook/orca/contacts/divebar/bs);
        ap = (aa)bundle.a(com/facebook/orca/contacts/divebar/aa);
        aq = (ap)bundle.a(com/facebook/orca/contacts/divebar/ap);
        af = bundle.b(java/lang/Boolean, com/facebook/orca/contacts/annotations/IsChatContextEnabled);
        au = new r(this);
        aL = new y(this, null);
        aJ = (j)bundle.a(com/facebook/base/broadcast/j, com/facebook/base/broadcast/LocalBroadcast);
        aK = aJ.a().a(com.facebook.backgroundlocation.status.d.a, aL).a("com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED", aL).a("com.facebook.orca.presence.PRESENCE_MANAGER_SETTINGS_CHANGED", aL).a("com.facebook.orca.contacts.divebar.GROUP_MEGAPHONE_DISMISSED", aL).a();
        aK.b();
        aq.a(this);
    }

    public void a(com.facebook.orca.contacts.divebar.bl bl1)
    {
        at = bl1;
        if (ar != null)
        {
            ar.setContactPickerViewListener(at);
        }
        aq.a(at);
    }

    public void a(z z1)
    {
        aH = z1;
    }

    public void a(String s1)
    {
        if (ar != null)
        {
            ar.setSearchBoxText(s1);
        }
    }

    public void b()
    {
        ar.a();
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        ao.c();
        b.a();
        an.a(new com.facebook.orca.contacts.divebar.t(this));
        aw = k().getBoolean("PARAM_SHOW_RECENT_THREADS");
        bundle = f.b();
        if (bundle != null)
        {
            ax = hq.a(bundle);
        }
        bundle = e.b();
        if (bundle != null)
        {
            ay = hq.a(bundle);
        }
        bundle = e.e();
        if (bundle != null)
        {
            az = hq.a(bundle);
        }
        if (((Boolean)aa.b()).booleanValue())
        {
            bundle = e.f();
            if (bundle != null)
            {
                aA = hq.a(bundle);
            }
        }
        bundle = e.c();
        if (bundle != null)
        {
            aB = hq.a(bundle);
        }
        bundle = e.g();
        if (bundle != null)
        {
            aD = hq.a(bundle);
        }
        ar.d();
        W();
        U();
        aK.b();
    }

}
