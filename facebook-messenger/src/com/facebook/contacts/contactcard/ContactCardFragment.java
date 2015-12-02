// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.auth.annotations.LoggedInUser;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.base.fragment.FbFragment;
import com.facebook.common.e.h;
import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.common.executors.ForUiThread;
import com.facebook.contacts.contactcard.entry.LabelValueRowView;
import com.facebook.contacts.data.a;
import com.facebook.contacts.g.c;
import com.facebook.contacts.models.Contact;
import com.facebook.contacts.models.ContactDetails;
import com.facebook.contacts.models.EntrySection;
import com.facebook.contacts.models.entry.AddressEntry;
import com.facebook.contacts.models.entry.EmailEntry;
import com.facebook.contacts.models.entry.Entry;
import com.facebook.contacts.models.entry.PhoneEntry;
import com.facebook.contacts.models.entry.d;
import com.facebook.contacts.server.BlockContactParams;
import com.facebook.contacts.server.CreateContactClaimParams;
import com.facebook.contacts.server.DeleteContactClaimParams;
import com.facebook.contacts.server.FetchContactParams;
import com.facebook.contacts.server.FetchContactResult;
import com.facebook.contacts.server.PrivacyParam;
import com.facebook.debug.log.b;
import com.facebook.f;
import com.facebook.fbservice.ops.aa;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.s;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.orca.annotations.IsMergeThreadsEnabled;
import com.facebook.orca.annotations.IsPartialAccount;
import com.facebook.orca.annotations.IsVoipEnabledForUser;
import com.facebook.orca.annotations.IsVoipWifiCallingOnly;
import com.facebook.orca.f.k;
import com.facebook.orca.notify.NotificationSetting;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.prefs.shared.e;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.facebook.widget.listview.EmptyListViewItem;
import com.facebook.zero.ui.l;
import com.google.common.a.es;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.d.a.i;
import com.google.common.d.a.u;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.contacts.contactcard:
//            HeaderView, BlockContactDialogFragment, EntrySectionView, x, 
//            MapSectionView, o, l, k, 
//            m, i, j, ax, 
//            HiddenEntryPickerActivity, ConversationSettingsView, n, g, 
//            p, q, r, s, 
//            t, u, w, v, 
//            h, f

public class ContactCardFragment extends FbFragment
{

    private static final Class a = com/facebook/contacts/contactcard/ContactCardFragment;
    private javax.inject.a Z;
    private Button aA;
    private ViewGroup aB;
    private com.facebook.c.s aC;
    private LabelValueRowView aD;
    private com.facebook.contacts.contactcard.f aE;
    private ProgressDialog aF;
    private x aG;
    private Contact aH;
    private ContactDetails aI;
    private boolean aJ;
    private ThreadSummary aK;
    private MessagesCollection aL;
    private boolean aM;
    private boolean aN;
    private boolean aO;
    private a aa;
    private com.facebook.fbservice.ops.k ab;
    private com.facebook.prefs.shared.d ac;
    private com.facebook.orca.common.ui.widgets.text.a ad;
    private com.facebook.orca.fbwebrtc.i ae;
    private ax af;
    private l ag;
    private com.google.common.d.a.s ah;
    private com.google.common.d.a.s ai;
    private com.google.common.d.a.s aj;
    private com.google.common.d.a.s ak;
    private Executor al;
    private u am;
    private UserKey an;
    private com.facebook.config.a.a ao;
    private Button ap;
    private HeaderView aq;
    private EmptyListViewItem ar;
    private ViewGroup as;
    private ViewGroup at;
    private LabelValueRowView au;
    private ViewGroup av;
    private LabelValueRowView aw;
    private EntrySectionView ax;
    private ConversationSettingsView ay;
    private MapSectionView az;
    private k b;
    private av c;
    private h d;
    private c e;
    private javax.inject.a f;
    private javax.inject.a g;
    private javax.inject.a h;
    private javax.inject.a i;

    public ContactCardFragment()
    {
        aM = false;
        aN = false;
        aO = false;
    }

    static Class V()
    {
        return a;
    }

    private void W()
    {
        ThreadSummary threadsummary = b.c(an);
        Object obj = null;
        if (threadsummary != null)
        {
            obj = b.c(threadsummary.a());
        }
        a(threadsummary, ((MessagesCollection) (obj)));
        obj = b.a(an);
        if (obj != null)
        {
            aq.setPlaceholderName(((User) (obj)).h());
            aq.setVisibility(0);
        }
    }

    private void X()
    {
        BlockContactDialogFragment blockcontactdialogfragment = (BlockContactDialogFragment)p().a("blockContactDialog");
        if (blockcontactdialogfragment != null)
        {
            blockcontactdialogfragment.a(aE);
        }
        ag.a(p());
    }

    private void Y()
    {
        boolean flag;
        if (!aM)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aM = flag;
        ax.setEditMode(aM);
        if (aG != null)
        {
            aG.d();
        }
    }

    private void Z()
    {
        boolean flag;
        flag = true;
        Preconditions.checkNotNull(an);
        com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Updating contact info: ").append(aH).append(", ").append(aI).toString());
        Button button;
        int i1;
        if (aH == Contact.a)
        {
            aq.setVisibility(8);
            ap.setVisibility(0);
        } else
        {
            aq.setContact(aH);
            aq.setVisibility(0);
            ap.setVisibility(8);
        }
        if (aI != null && aI.getHasTimeline())
        {
            at.setVisibility(0);
            az.setVisibility(0);
        } else
        {
            at.setVisibility(8);
            az.setVisibility(8);
        }
        ag();
        if (aH != Contact.a && an.a() != n.FACEBOOK)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        button = aA;
        if (i1 != 0)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        button.setVisibility(i1);
        if (aI == null) goto _L2; else goto _L1
_L1:
        ax.setEntrySection(aI.getContactInfoSection());
_L4:
        ax.setEditMode(aM);
        ax.setVisibility(0);
        return;
_L2:
        if (aH == Contact.a)
        {
            EntrySection entrysection;
            if (an.a() != n.PHONE_NUMBER)
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            entrysection = aa.a(an.b());
            ax.setEntrySection(entrysection);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static com.google.common.d.a.s a(ContactCardFragment contactcardfragment, com.google.common.d.a.s s1)
    {
        contactcardfragment.ah = s1;
        return s1;
    }

    private void a(cb cb1)
    {
        cb1.e("GroupContactCardFragment");
        if (aK != null)
        {
            cb1.b("thread_id", aK.a());
        }
        c.a(cb1);
    }

    static void a(ContactCardFragment contactcardfragment)
    {
        contactcardfragment.ag();
    }

    static void a(ContactCardFragment contactcardfragment, Entry entry)
    {
        contactcardfragment.a(entry);
    }

    static void a(ContactCardFragment contactcardfragment, PhoneEntry phoneentry)
    {
        contactcardfragment.a(phoneentry);
    }

    static void a(ContactCardFragment contactcardfragment, OperationResult operationresult)
    {
        contactcardfragment.a(operationresult);
    }

    static void a(ContactCardFragment contactcardfragment, ServiceException serviceexception)
    {
        contactcardfragment.a(serviceexception);
    }

    static void a(ContactCardFragment contactcardfragment, String s1)
    {
        contactcardfragment.e(s1);
    }

    private void a(Entry entry)
    {
        switch (com.facebook.contacts.contactcard.o.a[entry.a().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            e("dial_phone_number");
            b(((PhoneEntry)entry).getNumber());
            return;

        case 2: // '\002'
            e("open_email_client");
            c(((EmailEntry)entry).getEmail());
            return;

        case 3: // '\003'
            e("open_address_in_map");
            break;
        }
        d(((AddressEntry)entry).getAddress());
    }

    private void a(PhoneEntry phoneentry)
    {
        Preconditions.checkNotNull(aH);
        if (ak != null)
        {
            return;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable("deleteContactClaimParams", new DeleteContactClaimParams(phoneentry.getGraphApiWriteId(), aH.getGraphApiWriteId(), aH.getContactId()));
            phoneentry = ab.a(com.facebook.contacts.server.d.c, bundle);
            phoneentry.a(new aa(n(), o.contact_delete_phone_progress));
            ak = phoneentry.a();
            com.google.common.d.a.i.a(ak, new com.facebook.contacts.contactcard.l(this));
            return;
        }
    }

    private void a(OperationResult operationresult)
    {
        operationresult = (FetchContactResult)operationresult.i();
        aH = operationresult.a();
        aI = operationresult.b();
        com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Fetched contact successfully, result: ").append(operationresult).toString());
        if (aG != null)
        {
            aG.d();
        }
        Z();
        if (operationresult.e() == com.facebook.fbservice.c.b.FROM_SERVER)
        {
            com.facebook.debug.log.b.b(a, "Contact fetched from server, done.");
            a(false);
        } else
        {
            com.facebook.debug.log.b.c(a, "Checking server for new data...");
            a(s.CHECK_SERVER_FOR_NEW_DATA);
            if (aI.getContactInfoSection() != null)
            {
                a(false);
                return;
            }
        }
    }

    private void a(ServiceException serviceexception)
    {
        com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Fetching contact failed, error ").append(serviceexception).toString());
        a(false);
    }

    private void a(s s1)
    {
        Preconditions.checkNotNull(an);
        if (ah != null)
        {
            return;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable("fetchContactParams", new FetchContactParams(s1, an));
            ah = ab.a(com.facebook.contacts.server.d.d, bundle).a();
            com.google.common.d.a.i.a(ah, new com.facebook.contacts.contactcard.k(this));
            return;
        }
    }

    private void a(String s1)
    {
        Preconditions.checkNotNull(aH);
        if (aj != null)
        {
            return;
        } else
        {
            s1 = e.a(s1, 1);
            Bundle bundle = new Bundle();
            bundle.putParcelable("createContactClaimParams", new CreateContactClaimParams(aH.getContactId(), aH.getGraphApiWriteId(), s1, PrivacyParam.b));
            s1 = ab.a(com.facebook.contacts.server.d.b, bundle);
            s1.a(new aa(n(), o.contact_add_phone_progress));
            aj = s1.a();
            com.google.common.d.a.i.a(aj, new com.facebook.contacts.contactcard.m(this));
            return;
        }
    }

    private void a(boolean flag)
    {
        if (ar == null || as == null)
        {
            return;
        }
        ar.a(flag);
        if (flag)
        {
            ar.setMessage(o.contact_card_loading);
            ar.setVisibility(0);
            as.setVisibility(8);
            return;
        } else
        {
            ar.setVisibility(8);
            as.setVisibility(0);
            return;
        }
    }

    static boolean a(ContactCardFragment contactcardfragment, boolean flag)
    {
        contactcardfragment.aN = flag;
        return flag;
    }

    private void aa()
    {
        Preconditions.checkNotNull(an);
        String s1;
        Intent intent;
        boolean flag;
        if (an.a() == n.PHONE_NUMBER)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        s1 = an.b();
        intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/contact");
        intent.putExtra("phone", s1);
        aN = true;
        a(intent);
    }

    private void ab()
    {
        String s1 = aH.getLookupKey();
        Preconditions.checkNotNull(s1);
        aa aa1 = new aa(n(), o().getString(o.contact_card_loading));
        aa1.a();
        com.google.common.d.a.i.a(am.c(new com.facebook.contacts.contactcard.i(this, s1)), new j(this, aa1), al);
    }

    private void ac()
    {
        if (an != null && an.b().equals(b.c()))
        {
            return;
        } else
        {
            af.a(an);
            return;
        }
    }

    private void ad()
    {
        Preconditions.checkNotNull(aH);
        Intent intent = new Intent(n(), com/facebook/contacts/contactcard/HiddenEntryPickerActivity);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("contact_id", aH.getContactId());
        a(intent, 21);
    }

    private void ae()
    {
        Preconditions.checkNotNull(an);
        Object obj;
        Object obj1;
        boolean flag;
        if (an.a() == n.FACEBOOK || an.a() == n.FACEBOOK_CONTACT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (an.a() == n.FACEBOOK)
        {
            obj = an.b();
        } else
        {
            Preconditions.checkNotNull(aH);
            obj = aH.getProfileFbid();
        }
        obj1 = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("fb://profile/").append(((String) (obj))).toString()).buildUpon().build());
        flag = com.facebook.common.j.a.a(n(), ((Intent) (obj1)));
        if (!flag)
        {
            obj1 = Uri.parse("http://m.facebook.com/profile.php").buildUpon();
            ((android.net.Uri.Builder) (obj1)).appendQueryParameter("id", ((String) (obj)));
            obj = new Intent("android.intent.action.VIEW", ((android.net.Uri.Builder) (obj1)).build());
        } else
        {
            obj = obj1;
        }
        if (flag)
        {
            aC.a(((Intent) (obj)), n());
            return;
        }
        if (aF == null)
        {
            aF = new ProgressDialog(n());
            aF.setCancelable(true);
            aF.setMessage(a(o.loading_timeline_message));
            aF.show();
        }
        aC.b(((Intent) (obj)), n());
    }

    private void af()
    {
        ae();
    }

    private void ag()
    {
        if (!af.b())
        {
            av.setVisibility(8);
            return;
        }
        av.setVisibility(0);
        aw.setEnabled(true);
        if (!af.c())
        {
            av.setBackgroundResource(f.voip_section_background_unavailable);
            return;
        } else
        {
            av.setBackgroundResource(f.voip_section_background_normal);
            return;
        }
    }

    private void ah()
    {
        ae.a(n(), an, af.c(), af.d());
        ac();
    }

    private void ai()
    {
        BlockContactDialogFragment blockcontactdialogfragment = new BlockContactDialogFragment();
        blockcontactdialogfragment.a(aE);
        blockcontactdialogfragment.a(p(), "blockContactDialog");
    }

    private void aj()
    {
        com.facebook.prefs.shared.ae ae1 = com.facebook.orca.prefs.n.a(aK.a());
        ac.b().a(ae1, NotificationSetting.b.d()).a();
        ay.a();
    }

    private void ak()
    {
        Preconditions.checkNotNull(an);
        if (ai != null)
        {
            return;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable("blockContactParams", new BlockContactParams(an));
            ai = ab.a(com.facebook.contacts.server.d.e, bundle).a();
            com.google.common.d.a.i.a(ai, new com.facebook.contacts.contactcard.n(this), al);
            return;
        }
    }

    private void al()
    {
        Object obj = Uri.parse("https://m.facebook.com/help/contact/messenger-reporting").buildUpon();
        User user = (User)h.b();
        ((android.net.Uri.Builder) (obj)).appendQueryParameter("cid", ao.b());
        ((android.net.Uri.Builder) (obj)).appendQueryParameter("auth_token", ((ViewerContext)i.b()).b());
        ((android.net.Uri.Builder) (obj)).appendQueryParameter("rep", user.b());
        ((android.net.Uri.Builder) (obj)).appendQueryParameter("resp", an.b());
        ((android.net.Uri.Builder) (obj)).appendQueryParameter("locale", com.facebook.common.k.a.a(Locale.getDefault()));
        obj = new Intent("android.intent.action.VIEW", ((android.net.Uri.Builder) (obj)).build());
        aC.b(((Intent) (obj)), n());
    }

    private boolean am()
    {
        return ((Boolean)g.b()).booleanValue();
    }

    static com.google.common.d.a.s b(ContactCardFragment contactcardfragment, com.google.common.d.a.s s1)
    {
        contactcardfragment.ak = s1;
        return s1;
    }

    static void b(ContactCardFragment contactcardfragment)
    {
        contactcardfragment.aa();
    }

    private void b(String s1)
    {
        String s2 = (new StringBuilder()).append("tel:").append(s1).toString();
        s1 = new Intent("android.intent.action.DIAL", Uri.parse(s2));
        Context context = n();
        if (context.getPackageManager().checkPermission("android.permission.CALL_PHONE", context.getPackageName()) == 0)
        {
            s1 = new Intent("android.intent.action.CALL", Uri.parse(s2));
        }
        aC.b(s1, n());
    }

    static com.google.common.d.a.s c(ContactCardFragment contactcardfragment, com.google.common.d.a.s s1)
    {
        contactcardfragment.aj = s1;
        return s1;
    }

    static void c(ContactCardFragment contactcardfragment)
    {
        contactcardfragment.ab();
    }

    private void c(String s1)
    {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.EMAIL", new String[] {
            s1
        });
        intent.setType("plain/text");
        a(Intent.createChooser(intent, ""));
    }

    static l d(ContactCardFragment contactcardfragment)
    {
        return contactcardfragment.ag;
    }

    static com.google.common.d.a.s d(ContactCardFragment contactcardfragment, com.google.common.d.a.s s1)
    {
        contactcardfragment.ai = s1;
        return s1;
    }

    private void d(String s1)
    {
        Context context = n();
        String s2 = URLEncoder.encode(s1, "ISO-8859-1");
        s1 = s2;
_L2:
        s1 = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("geo:0,0?q=").append(s1).toString()));
        if (com.facebook.common.j.a.a(context, s1))
        {
            a(s1);
        }
        return;
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static void e(ContactCardFragment contactcardfragment)
    {
        contactcardfragment.ai();
    }

    private void e(String s1)
    {
        a((new cb("click")).f("button").g(s1));
    }

    static void f(ContactCardFragment contactcardfragment)
    {
        contactcardfragment.aj();
    }

    static void g(ContactCardFragment contactcardfragment)
    {
        contactcardfragment.ak();
    }

    static void h(ContactCardFragment contactcardfragment)
    {
        contactcardfragment.al();
    }

    static void i(ContactCardFragment contactcardfragment)
    {
        contactcardfragment.ah();
    }

    static void j(ContactCardFragment contactcardfragment)
    {
        contactcardfragment.af();
    }

    static void k(ContactCardFragment contactcardfragment)
    {
        contactcardfragment.ad();
    }

    static com.facebook.c.s l(ContactCardFragment contactcardfragment)
    {
        return contactcardfragment.aC;
    }

    static h m(ContactCardFragment contactcardfragment)
    {
        return contactcardfragment.d;
    }

    public void A()
    {
        super.A();
        T();
        R();
        ac();
    }

    public void B()
    {
        super.B();
        if (aF != null)
        {
            aF.dismiss();
            aF = null;
        }
    }

    public void O()
    {
        if (!aO)
        {
            return;
        } else
        {
            az.setVisibilityMode("visible");
            az.a(aL, an);
            return;
        }
    }

    public boolean P()
    {
        return aM;
    }

    public void Q()
    {
        if (ah != null)
        {
            ah.cancel(false);
            ah = null;
            an = null;
        }
        af.f();
    }

    public void R()
    {
        if (!aO)
        {
            return;
        }
        if (aJ)
        {
            ay.setVisibility(0);
            ay.a();
            return;
        } else
        {
            ay.setVisibility(8);
            return;
        }
    }

    void T()
    {
        if (an == null)
        {
            return;
        }
        if (aN || aH == null)
        {
            a(true);
            a(s.DO_NOT_CHECK_SERVER);
            if (aG != null)
            {
                aG.e();
            }
            aN = false;
            return;
        } else
        {
            Z();
            return;
        }
    }

    public void U()
    {
        if (aq != null)
        {
            aq.setVisibility(8);
            aq.a();
        }
        if (at != null)
        {
            at.setVisibility(8);
        }
        if (av != null)
        {
            av.setVisibility(8);
        }
        if (aw != null)
        {
            aw.setEnabled(false);
        }
        if (af != null)
        {
            af.a(null);
        }
        if (az != null)
        {
            az.a();
            az.setVisibility(8);
        }
        if (ap != null)
        {
            ap.setVisibility(8);
        }
        if (aA != null)
        {
            aA.setVisibility(8);
        }
        if (ax != null)
        {
            ax.setVisibility(8);
        }
        an = null;
        Q();
        a(true);
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(com.facebook.k.contacts_card_fragment, viewgroup, false);
    }

    public void a(int i1, int j1, Intent intent)
    {
        boolean flag = true;
        if (i1 == 21 && j1 == 1)
        {
            i1 = intent.getIntExtra("entry_position", -1);
            if (i1 == -1)
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            intent = ax.getEntrySection();
            Preconditions.checkNotNull(intent);
            a(((PhoneEntry)intent.getHiddenEntries().get(i1)).getNumber());
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            an = UserKey.a(bundle.getString("userKey"));
            aJ = bundle.getBoolean("showConversationSettings");
        }
    }

    public void a(x x1)
    {
        aG = x1;
        if (az != null)
        {
            az.setContactCardListener(x1);
            ay.setContactCardListener(x1);
        }
    }

    public void a(ThreadSummary threadsummary, MessagesCollection messagescollection)
    {
        while (!aO || threadsummary == aK && messagescollection == aL) 
        {
            return;
        }
        aK = threadsummary;
        aL = messagescollection;
        aq.setThreadNameViewData(ad.a(threadsummary));
        if (threadsummary != null)
        {
            ay.setThreadId(threadsummary.a());
        }
        if (messagescollection != null && an != null)
        {
            az.a(messagescollection, an);
            return;
        } else
        {
            az.a();
            return;
        }
    }

    public void a(UserKey userkey, boolean flag)
    {
        if (!userkey.equals(an) || flag != aJ)
        {
            an = userkey;
            aJ = flag;
            if (aO)
            {
                aq.setVisibility(8);
                aq.a();
                aH = null;
                aI = null;
                W();
                T();
                R();
                ac();
                return;
            }
        }
    }

    public boolean a()
    {
        return aH != null && aH != Contact.a && aI != null && an != null && an.a() == n.FACEBOOK && ((Boolean)f.b()).booleanValue();
    }

    public void b()
    {
        Preconditions.checkNotNull(an);
        if (an.a() == n.FACEBOOK)
        {
            Y();
        }
    }

    public void c()
    {
        if (!aM)
        {
            return;
        }
        String s1 = ax.getAddEntryValue();
        if (Strings.isNullOrEmpty(s1))
        {
            Y();
            return;
        } else
        {
            a(s1);
            return;
        }
    }

    public void c(boolean flag)
    {
        super.c(flag);
        while (!u() || flag || !aO) 
        {
            return;
        }
        ac();
    }

    public void d()
    {
        if (aM)
        {
            Y();
        }
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        bundle = S();
        b = (k)bundle.a(com/facebook/orca/f/k);
        c = (av)bundle.a(com/facebook/analytics/av);
        d = (h)bundle.a(com/facebook/common/e/h);
        e = (c)bundle.a(com/facebook/contacts/g/c);
        aa = (a)bundle.a(com/facebook/contacts/data/a);
        f = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/IsMergeThreadsEnabled);
        g = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/IsPartialAccount);
        h = bundle.b(com/facebook/user/User, com/facebook/auth/annotations/LoggedInUser);
        i = bundle.b(com/facebook/auth/viewercontext/ViewerContext);
        ab = (com.facebook.fbservice.ops.k)bundle.a(com/facebook/fbservice/ops/k);
        ao = (com.facebook.config.a.a)bundle.a(com/facebook/config/a/a);
        aC = (com.facebook.c.s)bundle.a(com/facebook/c/s);
        Z = bundle.b(java/lang/Boolean, com/facebook/orca/annotations/IsVoipEnabledForUser);
        ad = (com.facebook.orca.common.ui.widgets.text.a)bundle.a(com/facebook/orca/common/ui/widgets/text/a);
        al = (Executor)bundle.a(java/util/concurrent/Executor, com/facebook/common/executors/ForUiThread);
        am = (u)bundle.a(com/google/common/d/a/u, com/facebook/common/executors/DefaultExecutorService);
        ac = (com.facebook.prefs.shared.d)bundle.a(com/facebook/prefs/shared/d);
        ae = (com.facebook.orca.fbwebrtc.i)bundle.a(com/facebook/orca/fbwebrtc/i);
        af = new ax(Z, bundle.b(java/lang/Boolean, com/facebook/orca/annotations/IsVoipWifiCallingOnly), (com.facebook.e.c)bundle.a(com/facebook/e/c), (com.facebook.common.time.a)bundle.a(com/facebook/common/time/a), ab);
        af.a(new g(this));
        ag = (l)bundle.a(com/facebook/zero/ui/l);
        ap = (Button)d(com.facebook.i.contact_card_add_contact);
        aq = (HeaderView)d(com.facebook.i.contact_header_view);
        ar = (EmptyListViewItem)d(com.facebook.i.contact_card_empty_item);
        as = (ViewGroup)d(com.facebook.i.contact_card_content_wrapper);
        ay = (ConversationSettingsView)d(com.facebook.i.conversation_settings_section);
        at = (ViewGroup)d(com.facebook.i.contact_card_view_timeline_section);
        au = (LabelValueRowView)d(com.facebook.i.contact_card_view_timeline_row);
        av = (ViewGroup)d(com.facebook.i.contact_card_voip_section);
        aw = (LabelValueRowView)d(com.facebook.i.contact_card_voip_row);
        ax = (EntrySectionView)d(com.facebook.i.contact_entry_section_view);
        az = (MapSectionView)d(com.facebook.i.map_section);
        aA = (Button)d(com.facebook.i.contact_card_view_in_address_book);
        aB = (ViewGroup)d(com.facebook.i.contact_card_block_user_section);
        aD = (LabelValueRowView)d(com.facebook.i.contact_card_block_user_row);
        if (aG != null)
        {
            az.setContactCardListener(aG);
            ay.setContactCardListener(aG);
        }
        ar.setBackgroundDrawable(o().getDrawable(com.facebook.h.transparent));
        ap.setOnClickListener(new p(this));
        aA.setOnClickListener(new com.facebook.contacts.contactcard.q(this));
        au.setLabelText(o.contact_card_view_timeline);
        au.setOnClickListener(new r(this));
        aw.setLabelText(o.contact_card_call_with_messenger);
        aw.setEnabled(false);
        aw.setOnClickListener(new com.facebook.contacts.contactcard.s(this));
        aD.setLabelText(o.contact_card_block_user);
        aD.setOnClickListener(new com.facebook.contacts.contactcard.t(this));
        aE = new com.facebook.contacts.contactcard.u(this);
        ag.a(com.facebook.zero.a.c.g, a(o.zero_view_timeline_dialog_content), new w(this)).a(com.facebook.zero.a.c.l, a(o.zero_voip_call_dialog_content), new v(this));
        X();
        ax.setEntryListener(new com.facebook.contacts.contactcard.h(this));
        if (am())
        {
            aB.setVisibility(0);
        }
        aO = true;
        W();
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        String s1;
        if (an == null)
        {
            s1 = null;
        } else
        {
            s1 = an.c();
        }
        bundle.putString("userKey", s1);
        bundle.putBoolean("showConversationSettings", aJ);
    }

}
