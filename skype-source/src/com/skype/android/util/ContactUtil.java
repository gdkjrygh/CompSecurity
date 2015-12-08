// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.TextView;
import com.skype.Account;
import com.skype.Contact;
import com.skype.ContactGroup;
import com.skype.ContactImpl;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.PROPKEY;
import com.skype.Proptable;
import com.skype.ProptableImpl;
import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.contacts.ContactItem;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.CompletableFuture;
import com.skype.android.concurrent.CompletedAsyncResult;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.text.SegoeTypeFaceFactory;
import com.skype.android.text.SymbolDrawable;
import com.skype.android.util.cache.ContactMoodCache;
import com.skype.android.widget.PathClippedImageView;
import com.skype.android.widget.PathType;
import com.skype.android.widget.SymbolElement;
import com.skype.android.widget.drawable.PresenceDrawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.util:
//            CountryCode, ImageCache

public class ContactUtil
{

    public static final PROPKEY c[];
    public static final PROPKEY d[];
    public static final PROPKEY e[];
    public static final PROPKEY f[];
    public final String a = "guest:";
    public final String b = "(Guest)";
    private Map g;
    private Provider h;
    private Context i;
    private SkyLib j;
    private ObjectIdMap k;
    private ContactMoodCache l;
    private Provider m;
    private Provider n;
    private EcsConfiguration o;
    private ImageCache p;
    private DefaultAvatars q;
    private SegoeTypeFaceFactory r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;

    public ContactUtil(Application application, Provider provider, SkyLib skylib, ObjectIdMap objectidmap, ContactMoodCache contactmoodcache, EcsConfiguration ecsconfiguration, ImageCache imagecache, 
            DefaultAvatars defaultavatars)
    {
        g = new HashMap() {

            final ContactUtil a;

            
            {
                a = ContactUtil.this;
                super();
                put("0", Integer.valueOf(0x7f0802c3));
                put("1", Integer.valueOf(0x7f0802f4));
                put("2", Integer.valueOf(0x7f0802dc));
                put("3", Integer.valueOf(0x7f0802f9));
            }
        };
        i = application;
        h = provider;
        j = skylib;
        k = objectidmap;
        l = contactmoodcache;
        o = ecsconfiguration;
        p = imagecache;
        q = defaultavatars;
        r = SegoeTypeFaceFactory.getInstance(application);
        m = new Provider(skylib) {

            com.skype.SkyLib.GetISOCountryInfo_Result a;
            final SkyLib b;
            final ContactUtil c;

            public final Object get()
            {
                if (a == null)
                {
                    com.skype.SkyLib.GetISOCountryInfo_Result getisocountryinfo_result = b.getISOCountryInfo();
                    a = getisocountryinfo_result;
                    return getisocountryinfo_result;
                } else
                {
                    return a;
                }
            }

            
            {
                c = ContactUtil.this;
                b = skylib;
                super();
            }
        };
        n = new Provider(skylib) {

            com.skype.SkyLib.GetISOLanguageInfo_Result a;
            final SkyLib b;
            final ContactUtil c;

            public final Object get()
            {
                if (a == null)
                {
                    com.skype.SkyLib.GetISOLanguageInfo_Result getisolanguageinfo_result = b.getISOLanguageInfo();
                    a = getisolanguageinfo_result;
                    return getisolanguageinfo_result;
                } else
                {
                    return a;
                }
            }

            
            {
                c = ContactUtil.this;
                b = skylib;
                super();
            }
        };
        application = application.getResources();
        s = application.getColor(0x7f0f00be);
        v = application.getColor(0x7f0f00bf);
        t = application.getColor(0x7f0f00bd);
        u = application.getColor(0x7f0f00bc);
    }

    private CharSequence a(com.skype.Contact.TYPE type, int i1, String s1, String s2, int j1)
    {
        static final class _cls5
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[com.skype.Contact.AVAILABILITY.values().length];
                try
                {
                    b[com.skype.Contact.AVAILABILITY.UNKNOWN.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    b[com.skype.Contact.AVAILABILITY.PENDINGAUTH.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    b[com.skype.Contact.AVAILABILITY.BLOCKED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    b[com.skype.Contact.AVAILABILITY.BLOCKED_SKYPEOUT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    b[com.skype.Contact.AVAILABILITY.CONNECTING.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    b[com.skype.Contact.AVAILABILITY.OFFLINE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    b[com.skype.Contact.AVAILABILITY.OFFLINE_BUT_VM_ABLE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    b[com.skype.Contact.AVAILABILITY.INVISIBLE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    b[com.skype.Contact.AVAILABILITY.NOT_AVAILABLE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    b[com.skype.Contact.AVAILABILITY.NOT_AVAILABLE_FROM_MOBILE.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    b[com.skype.Contact.AVAILABILITY.ONLINE_FROM_MOBILE.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    b[com.skype.Contact.AVAILABILITY.SKYPE_ME_FROM_MOBILE.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    b[com.skype.Contact.AVAILABILITY.ONLINE.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    b[com.skype.Contact.AVAILABILITY.SKYPE_ME.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    b[com.skype.Contact.AVAILABILITY.AWAY.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    b[com.skype.Contact.AVAILABILITY.AWAY_FROM_MOBILE.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[com.skype.Contact.AVAILABILITY.DO_NOT_DISTURB.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[com.skype.Contact.AVAILABILITY.DO_NOT_DISTURB_FROM_MOBILE.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[com.skype.Contact.AVAILABILITY.SKYPEOUT.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[com.skype.Contact.AVAILABILITY.OFFLINE_BUT_CF_ABLE.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                a = new int[com.skype.Contact.TYPE.values().length];
                try
                {
                    a[com.skype.Contact.TYPE.PASSPORT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.skype.Contact.TYPE.LYNC.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.skype.Contact.TYPE.BOT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.skype.Contact.TYPE.SKYPE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls5.a[type.ordinal()])
        {
        default:
            return l.a(i1, s1, s2, j1);

        case 1: // '\001'
            return i.getString(0x7f0802d6);

        case 2: // '\002'
            return i.getString(0x7f0802cd);
        }
    }

    public static void a(TextView textview)
    {
        if (textview == null) goto _L2; else goto _L1
_L1:
        Object obj = textview.getTag(0x7f100005);
        if (!(obj instanceof SymbolDrawable)) goto _L2; else goto _L3
_L3:
        obj = (SymbolDrawable)obj;
_L5:
        if (obj != null)
        {
            ((SymbolDrawable) (obj)).a(textview);
        }
        return;
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void a(Contact contact, String s1, Analytics analytics)
    {
        contact.setBuddyStatus(true, true);
        contact.sendAuthRequest(s1, 0);
        analytics.c(AnalyticsEvent.ax);
    }

    public static boolean a(com.skype.Contact.AVAILABILITY availability)
    {
        switch (_cls5.b[availability.ordinal()])
        {
        case 12: // '\f'
        case 14: // '\016'
        default:
            return false;

        case 11: // '\013'
        case 13: // '\r'
        case 15: // '\017'
        case 16: // '\020'
            return true;
        }
    }

    public static boolean a(com.skype.Contact.TYPE type)
    {
        switch (_cls5.a[type.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            return true;
        }
    }

    public static boolean a(Contact contact)
    {
        return contact != null && contact.getIdentity().equalsIgnoreCase("echo123");
    }

    public static boolean a(PROPKEY propkey)
    {
        PROPKEY apropkey[] = c;
        int j1 = apropkey.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (apropkey[i1] == propkey)
            {
                return true;
            }
        }

        return false;
    }

    public static boolean a(com.skype.SkyLib.IDENTITYTYPE identitytype)
    {
        return identitytype == com.skype.SkyLib.IDENTITYTYPE.PSTN || identitytype == com.skype.SkyLib.IDENTITYTYPE.PSTN_FREE || identitytype == com.skype.SkyLib.IDENTITYTYPE.PSTN_UNDISCLOSED || identitytype == com.skype.SkyLib.IDENTITYTYPE.PSTN_EMERGENCY;
    }

    public static boolean b(com.skype.Contact.AVAILABILITY availability)
    {
        return availability == com.skype.Contact.AVAILABILITY.CONNECTING;
    }

    public static boolean b(com.skype.Contact.TYPE type)
    {
        return com.skype.Contact.TYPE.BOT == type;
    }

    public static boolean b(ContactItem contactitem)
    {
        return contactitem != null && b(contactitem.getType());
    }

    private boolean b(String s1, com.skype.Contact.TYPE type)
    {
        if (type != com.skype.Contact.TYPE.UNDISCLOSED_PSTN)
        {
            if (type == com.skype.Contact.TYPE.EMERGENCY_PSTN || type == com.skype.Contact.TYPE.PSTN)
            {
                if (j.getIdentityType(s1) != com.skype.SkyLib.IDENTITYTYPE.PSTN_UNDISCLOSED)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    private static boolean c(com.skype.Contact.TYPE type)
    {
        return type == com.skype.Contact.TYPE.FREE_PSTN || type == com.skype.Contact.TYPE.PSTN || type == com.skype.Contact.TYPE.UNDISCLOSED_PSTN || type == com.skype.Contact.TYPE.EMERGENCY_PSTN;
    }

    public static String d(String s1)
    {
        int i1 = s1.indexOf(":");
        String s2 = s1;
        if (i1 != -1)
        {
            s2 = s1.substring(i1 + 1);
        }
        return s2;
    }

    public static boolean e(Contact contact)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (contact != null)
        {
            flag = flag1;
            if (contact.getType() == com.skype.Contact.TYPE.LYNC)
            {
                flag = true;
            }
        }
        return flag;
    }

    public static boolean e(String s1)
    {
        return s1.startsWith("guest:");
    }

    public static boolean f(Contact contact)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (contact != null)
        {
            flag = flag1;
            if (contact.getType() == com.skype.Contact.TYPE.EMERGENCY_PSTN)
            {
                flag = true;
            }
        }
        return flag;
    }

    public static boolean g(Contact contact)
    {
        if (contact != null)
        {
            return c(contact.getType());
        } else
        {
            return false;
        }
    }

    public static boolean h(Contact contact)
    {
        contact = contact.getAvailabilityProp();
        return contact == com.skype.Contact.AVAILABILITY.BLOCKED || contact == com.skype.Contact.AVAILABILITY.BLOCKED_SKYPEOUT;
    }

    private String j(String s1)
    {
        s1 = s1.replace("guest:", "");
        return i.getString(0x7f080487, new Object[] {
            s1
        });
    }

    public static int k(Contact contact)
    {
        if (TextUtils.isEmpty(contact.getAssignedPhone1Prop()))
        {
            return 1;
        }
        if (TextUtils.isEmpty(contact.getAssignedPhone2Prop()))
        {
            return 2;
        }
        return !TextUtils.isEmpty(contact.getAssignedPhone3Prop()) ? -1 : 3;
    }

    public static void n(Contact contact)
    {
        ConversationImpl conversationimpl = new ConversationImpl();
        contact.openConversation(conversationimpl);
        conversationimpl.removeFromInbox();
        conversationimpl.unPin();
    }

    public static void o(Contact contact)
    {
        contact.setBuddyStatus(true, true);
        contact.refreshProfile();
    }

    public static boolean p(Contact contact)
    {
        return contact != null && b(contact.getTypeProp());
    }

    public static boolean q(Contact contact)
    {
        return g(contact) && (TextUtils.isEmpty(contact.getDisplaynameProp().trim()) || contact.getDisplaynameProp().equals(contact.getPstnnumberProp()));
    }

    public static boolean r(Contact contact)
    {
        return contact != null && contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.SCD_CONTACTS);
    }

    public static boolean s(Contact contact)
    {
        return contact != null && contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.ALL_BUDDIES);
    }

    public final int a(CountryCode countrycode)
    {
        if (countrycode != null)
        {
            com.skype.SkyLib.GetISOCountryInfo_Result getisocountryinfo_result = (com.skype.SkyLib.GetISOCountryInfo_Result)m.get();
            countrycode = countrycode.b();
            for (int i1 = getisocountryinfo_result.m_countryCodeList.length - 1; i1 >= 0; i1--)
            {
                if (countrycode.equalsIgnoreCase(getisocountryinfo_result.m_countryCodeList[i1]))
                {
                    return i1;
                }
            }

        }
        return -1;
    }

    public final int a(String s1)
    {
        s1 = (Integer)g.get(s1);
        if (s1 != null)
        {
            return s1.intValue();
        } else
        {
            return ((Integer)g.get("3")).intValue();
        }
    }

    public final Drawable a(Drawable drawable)
    {
        if (drawable != null)
        {
            return new LayerDrawable(new Drawable[] {
                drawable, i.getResources().getDrawable(0x7f020071)
            });
        } else
        {
            return null;
        }
    }

    public final Drawable a(Contact contact, Bitmap bitmap)
    {
        return a(contact.getIdentity(), contact.getType(), contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.CONTACTS_BLOCKED_BY_ME), bitmap);
    }

    public final Drawable a(Contact contact, com.skype.android.res.DefaultAvatars.AvatarSize avatarsize)
    {
        return a(contact.getIdentity(), contact.getType(), avatarsize);
    }

    public final Drawable a(String s1, com.skype.Contact.TYPE type, com.skype.android.res.DefaultAvatars.AvatarSize avatarsize)
    {
        com.skype.android.res.DefaultAvatars.AvatarType avatartype = com.skype.android.res.DefaultAvatars.AvatarType.c;
        if (!s1.equals("echo123")) goto _L2; else goto _L1
_L1:
        avatartype = com.skype.android.res.DefaultAvatars.AvatarType.a;
_L4:
        return q.a(avatartype, avatarsize, s1);
_L2:
        if (c(type))
        {
            avatartype = com.skype.android.res.DefaultAvatars.AvatarType.b;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Drawable a(String s1, com.skype.Contact.TYPE type, boolean flag, Bitmap bitmap)
    {
        boolean flag1;
        if (bitmap != null)
        {
            type = new BitmapDrawable(i.getResources(), bitmap);
            flag1 = true;
        } else
        {
            type = a(s1, type, com.skype.android.res.DefaultAvatars.AvatarSize.a);
            flag1 = false;
        }
        if (flag)
        {
            bitmap = com.skype.android.res.DefaultAvatars.AvatarSize.a;
            s1 = q.a(com.skype.android.res.DefaultAvatars.AvatarType.e, bitmap, s1);
            s1 = new LayerDrawable(new Drawable[] {
                type, i.getResources().getDrawable(0x7f02007f), s1
            });
        } else
        {
            s1 = type;
            if (flag1)
            {
                return new LayerDrawable(new Drawable[] {
                    type, i.getResources().getDrawable(0x7f020071)
                });
            }
        }
        return s1;
    }

    public final com.skype.SkyLib.NormalizePSTNWithCountry_Result a(String s1, String s2)
    {
        String s3 = PhoneNumberUtils.stripSeparators(PhoneNumberUtils.convertKeypadLettersToDigits(s1));
        s1 = null;
        if (s2 != null)
        {
            s1 = g(s2);
        }
        int i1;
        if (s1 == null)
        {
            i1 = 0;
        } else
        {
            i1 = s1.c();
        }
        return j.normalizePSTNWithCountry(s3, i1);
    }

    public final CountryCode a(int i1)
    {
        com.skype.SkyLib.GetISOCountryInfo_Result getisocountryinfo_result = (com.skype.SkyLib.GetISOCountryInfo_Result)m.get();
        return new CountryCode(getisocountryinfo_result.m_countryNameList[i1], getisocountryinfo_result.m_countryCodeList[i1], getisocountryinfo_result.m_countryPrefixList[i1]);
    }

    public final CharSequence a(String s1, com.skype.Contact.AVAILABILITY availability)
    {
        return a(s1, availability, "");
    }

    public final CharSequence a(String s1, com.skype.Contact.AVAILABILITY availability, CharSequence charsequence)
    {
        if (availability == com.skype.Contact.AVAILABILITY.ONLINE)
        {
            availability = i.getString(0x7f0800df);
        } else
        {
            availability = i.getString(0x7f0800de);
        }
        return (new StringBuilder()).append(s1).append(", ").append(availability).append(", ").append(charsequence).toString();
    }

    public final String a(Resources resources, List list)
    {
        if (list == null || list.size() == 0)
        {
            return "";
        }
        int j2 = list.size();
        StringBuilder stringbuilder = new StringBuilder();
        int i1 = 0;
        String s1 = String.format(resources.getQuantityString(0x7f0b0015, j2), new Object[] {
            Integer.valueOf(j2)
        });
        if (j2 == 1)
        {
            list = (ContactItem)list.get(0);
            resources = new ContactImpl();
            list = list.getIdentity();
            j.getContact(list, resources);
            resources = l(resources);
        } else
        {
            int i2 = 0;
            int l1;
            do
            {
                l1 = i1;
                if (i2 >= j2)
                {
                    break;
                }
                Object obj2 = (ContactItem)list.get(i2);
                Object obj = new ContactImpl();
                obj2 = ((ContactItem) (obj2)).getIdentity();
                j.getContact(((String) (obj2)), ((Contact) (obj)));
                obj = l(((Contact) (obj)));
                l1 = i1;
                if (!((String) (obj)).equals(obj2))
                {
                    if (i1 > 0)
                    {
                        stringbuilder.append(", ");
                    }
                    stringbuilder.append(((String) (obj)));
                    i1++;
                    l1 = i1;
                    if (i1 == 4)
                    {
                        break;
                    }
                    l1 = i1;
                }
                i2++;
                i1 = l1;
            } while (true);
            i2 = j2 - l1;
            if (i2 == 0)
            {
                list = stringbuilder.toString();
                int j1 = list.lastIndexOf(',');
                resources = String.format(resources.getString(0x7f0804b1), new Object[] {
                    list.substring(0, j1), list.substring(j1 + 2)
                });
            } else
            {
                int k1 = i2;
                if (l1 == 0)
                {
                    Object obj1 = (ContactItem)list.get(0);
                    list = new ContactImpl();
                    obj1 = ((ContactItem) (obj1)).getIdentity();
                    j.getContact(((String) (obj1)), list);
                    stringbuilder.append(l(list));
                    k1 = i2 - 1;
                }
                resources = String.format(resources.getQuantityString(0x7f0b001c, k1), new Object[] {
                    stringbuilder.toString(), Integer.valueOf(k1)
                });
            }
        }
        return (new StringBuilder()).append(s1).append(" ").append(resources).toString();
    }

    public final String a(String s1, com.skype.Contact.TYPE type)
    {
        String s2 = s1;
        if (b(s1, type))
        {
            s2 = i.getString(0x7f080341);
        }
        s1 = s2;
        if (s2.startsWith("guest:"))
        {
            s1 = j(s2);
        }
        return s1;
    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        int ai[] = j.getCustomContactGroups().m_groupObjectIDList;
        int j1 = ai.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            int k1 = ai[i1];
            ContactGroup contactgroup = (ContactGroup)k.a(k1, com/skype/ContactGroup);
            if (!TextUtils.isEmpty(contactgroup.getGivenDisplaynameProp()) && !contactgroup.getGivenDisplaynameProp().equals("Favorites"))
            {
                arraylist.add(contactgroup);
            }
        }

        return arraylist;
    }

    public final List a(int ai[])
    {
        if (ai != null) goto _L2; else goto _L1
_L1:
        ai = null;
_L4:
        return ai;
_L2:
        ProptableImpl proptableimpl = new ProptableImpl();
        j.getPropertyTable(ai, ContactItem.CONTACT_PROPKEYS, proptableimpl);
        ArrayList arraylist = new ArrayList(proptableimpl.getCount());
        int i1 = 0;
        do
        {
            ai = arraylist;
            if (i1 >= proptableimpl.getCount())
            {
                continue;
            }
            arraylist.add(new ContactItem(proptableimpl, i1));
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Future a(com.skype.Contact.TYPE type, int i1, String s1, String s2, int j1, Object obj, AsyncCallback asynccallback)
    {
        if (type == com.skype.Contact.TYPE.PASSPORT || type == com.skype.Contact.TYPE.LYNC)
        {
            type = a(type, i1, s1, s2, j1);
            if (asynccallback != null)
            {
                asynccallback.done(new CompletedAsyncResult(type, obj));
            }
            return CompletableFuture.completedFuture(type);
        } else
        {
            return l.a(i1, s1, s2, j1, obj, asynccallback);
        }
    }

    public final void a(TextView textview, com.skype.Contact.TYPE type)
    {
        Object obj = textview.getTag(0x7f100005);
        Drawable adrawable[] = textview.getCompoundDrawables();
        if (!b(type))
        {
            if (obj instanceof SymbolDrawable)
            {
                textview.setTag(0x7f100005, null);
            }
            type = null;
        } else
        {
            if (obj instanceof SymbolDrawable)
            {
                type = (SymbolDrawable)obj;
            } else
            {
                type = new SymbolDrawable(com.skype.android.widget.SymbolElement.SymbolCode.fG, SegoeTypeFaceFactory.getInstance((Application)i.getApplicationContext()), SymbolDrawable.b);
                textview.setTag(0x7f100005, type);
            }
            type.a(textview);
        }
        textview.setCompoundDrawablesWithIntrinsicBounds(adrawable[0], adrawable[1], type, adrawable[3]);
    }

    public final void a(TextView textview, com.skype.Contact.TYPE type, com.skype.Contact.AVAILABILITY availability)
    {
        Object obj = textview.getCompoundDrawables()[0];
        if (obj == null || !(obj instanceof PresenceDrawable))
        {
            obj = new PresenceDrawable(r, i);
        } else
        {
            obj = (PresenceDrawable)obj;
        }
        a(((SymbolElement) (obj)), type, availability);
        ((PresenceDrawable) (obj)).a();
        textview.setCompoundDrawablesWithIntrinsicBounds(((Drawable) (obj)), null, null, null);
    }

    public final void a(TextView textview, Contact contact)
    {
        String s1 = contact.getDisplaynameProp();
        contact = contact.getTypeProp();
        textview.setText(a(s1, ((com.skype.Contact.TYPE) (contact))));
        a(textview, ((com.skype.Contact.TYPE) (contact)));
    }

    public final void a(Contact contact, Analytics analytics)
    {
        a(contact, i.getResources().getString(0x7f080475, new Object[] {
            l(contact)
        }), analytics);
    }

    public final void a(Contact contact, PathClippedImageView pathclippedimageview, PathType pathtype)
    {
        pathclippedimageview.setImageDrawable(b(contact));
        pathclippedimageview.a(false);
        if (p(contact))
        {
            pathtype = PathType.b;
        }
        pathclippedimageview.setPathType(pathtype);
        p.a(contact, pathclippedimageview, new AsyncCallback() {

            final ContactUtil a;

            public final void done(AsyncResult asyncresult)
            {
                if (!asyncresult.d())
                {
                    Bitmap bitmap = (Bitmap)asyncresult.a();
                    asyncresult = (PathClippedImageView)asyncresult.b();
                    if (bitmap != null)
                    {
                        asyncresult.setImageBitmap(bitmap);
                        asyncresult.a(true);
                    }
                }
            }

            
            {
                a = ContactUtil.this;
                super();
            }
        });
    }

    public final void a(SymbolElement symbolelement, com.skype.Contact.AVAILABILITY availability)
    {
        a(symbolelement, ((com.skype.Contact.TYPE) (null)), availability);
    }

    public final void a(SymbolElement symbolelement, com.skype.Contact.TYPE type, com.skype.Contact.AVAILABILITY availability)
    {
        com.skype.Contact.AVAILABILITY availability1 = availability;
        if (type == null) goto _L2; else goto _L1
_L1:
        _cls5.a[type.ordinal()];
        JVM INSTR tableswitch 3 3: default 32
    //                   3 141;
           goto _L3 _L4
_L3:
        availability1 = availability;
_L2:
        _cls5.b[availability1.ordinal()];
        JVM INSTR tableswitch 1 20: default 140
    //                   1 149
    //                   2 149
    //                   3 192
    //                   4 192
    //                   5 254
    //                   6 254
    //                   7 254
    //                   8 254
    //                   9 254
    //                   10 254
    //                   11 297
    //                   12 297
    //                   13 297
    //                   14 297
    //                   15 334
    //                   16 334
    //                   17 396
    //                   18 396
    //                   19 414
    //                   20 445;
           goto _L5 _L6 _L6 _L7 _L7 _L8 _L8 _L8 _L8 _L8 _L8 _L9 _L9 _L9 _L9 _L10 _L10 _L11 _L11 _L12 _L13
_L5:
        return;
_L4:
        availability1 = com.skype.Contact.AVAILABILITY.ONLINE;
          goto _L2
_L6:
        int i1;
        if (o.isUnifiedPresenceEnabled())
        {
            type = com.skype.android.widget.SymbolElement.SymbolCode.eB;
        } else
        {
            type = com.skype.android.widget.SymbolElement.SymbolCode.eG;
        }
        symbolelement.setSymbolCode(type);
        i1 = u;
_L17:
        symbolelement.setSymbolColor(i1);
        return;
_L7:
        if (o.isUnifiedPresenceEnabled())
        {
            type = com.skype.android.widget.SymbolElement.SymbolCode.eB;
        } else
        {
            type = com.skype.android.widget.SymbolElement.SymbolCode.eF;
        }
        symbolelement.setSymbolCode(type);
        if (o.isUnifiedPresenceEnabled())
        {
            i1 = u;
        } else
        {
            i1 = s;
        }
        symbolelement.setSymbolColor(i1);
        return;
_L8:
        symbolelement.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.eB);
        if (o.isUnifiedPresenceEnabled())
        {
            i1 = u;
        } else
        {
            i1 = t;
        }
        symbolelement.setSymbolColor(i1);
        return;
_L9:
        if (o.isUnifiedPresenceEnabled())
        {
            type = com.skype.android.widget.SymbolElement.SymbolCode.et;
        } else
        {
            type = com.skype.android.widget.SymbolElement.SymbolCode.eC;
        }
        symbolelement.setSymbolCode(type);
_L14:
        i1 = t;
        continue; /* Loop/switch isn't completed */
_L10:
        if (o.isUnifiedPresenceEnabled())
        {
            type = com.skype.android.widget.SymbolElement.SymbolCode.et;
        } else
        {
            type = com.skype.android.widget.SymbolElement.SymbolCode.eD;
        }
        symbolelement.setSymbolCode(type);
        if (o.isUnifiedPresenceEnabled())
        {
            i1 = t;
        } else
        {
            i1 = v;
        }
        symbolelement.setSymbolColor(i1);
        return;
_L11:
        symbolelement.setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.eE);
        i1 = s;
        continue; /* Loop/switch isn't completed */
_L12:
        if (o.isUnifiedPresenceEnabled())
        {
            type = com.skype.android.widget.SymbolElement.SymbolCode.et;
        } else
        {
            type = com.skype.android.widget.SymbolElement.SymbolCode.eH;
        }
        symbolelement.setSymbolCode(type);
          goto _L14
_L13:
        if (o.isUnifiedPresenceEnabled())
        {
            type = com.skype.android.widget.SymbolElement.SymbolCode.eB;
        } else
        {
            type = com.skype.android.widget.SymbolElement.SymbolCode.eH;
        }
        symbolelement.setSymbolCode(type);
        if (!o.isUnifiedPresenceEnabled()) goto _L14; else goto _L15
_L15:
        i1 = u;
        if (true) goto _L17; else goto _L16
_L16:
    }

    public final boolean a(ContactItem contactitem)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!contactitem.isLocalContact())
        {
            contactitem = (Contact)k.a(contactitem.getContactObjectId(), com/skype/Contact);
            ConversationImpl conversationimpl = new ConversationImpl();
            contactitem.openConversation(conversationimpl);
            flag = flag1;
            if (conversationimpl.getPinnedOrderProp() > 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final boolean a(UserPreferences userpreferences)
    {
        return o.isShortCircuitEnabled() && userpreferences.isAutoBuddyEnabledInLocalCache();
    }

    public final boolean a(String s1, int i1)
    {
        boolean flag1 = false;
        String s2 = s1.replace("+", "");
        String s3 = String.valueOf(i1);
        boolean flag = flag1;
        if (i1 != -1)
        {
            flag = flag1;
            if (s2.startsWith(s3))
            {
                flag = PhoneNumberUtils.isEmergencyNumber(s2.substring(s3.length()));
            }
        }
        return flag || PhoneNumberUtils.isEmergencyNumber(s1) || j.getIdentityType(s1) == com.skype.SkyLib.IDENTITYTYPE.PSTN_EMERGENCY;
    }

    public final Drawable b(Contact contact)
    {
        return a(contact, com.skype.android.res.DefaultAvatars.AvatarSize.a);
    }

    public final CountryCode b()
    {
        CountryCode countrycode1 = h(((Account)h.get()).getCountryProp());
        CountryCode countrycode = countrycode1;
        if (countrycode1 == null)
        {
            TelephonyManager telephonymanager = (TelephonyManager)i.getSystemService("phone");
            CountryCode countrycode2 = h(telephonymanager.getNetworkCountryIso());
            countrycode = countrycode2;
            if (countrycode2 == null)
            {
                CountryCode countrycode3 = h(telephonymanager.getSimCountryIso());
                countrycode = countrycode3;
                if (countrycode3 == null)
                {
                    CountryCode countrycode4 = h(i.getResources().getConfiguration().locale.getCountry());
                    countrycode = countrycode4;
                    if (countrycode4 == null)
                    {
                        countrycode = h(Locale.US.getCountry());
                    }
                }
            }
        }
        return countrycode;
    }

    public final String b(CountryCode countrycode)
    {
        if (countrycode != null)
        {
            return String.format(Locale.getDefault(), i.getResources().getString(0x7f08047f), new Object[] {
                countrycode.a(), countrycode.d()
            });
        } else
        {
            return "";
        }
    }

    public final String b(String s1)
    {
        for (Iterator iterator = g.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (i.getString(((Integer)entry.getValue()).intValue()).equals(s1))
            {
                return (String)entry.getKey();
            }
        }

        return "3";
    }

    public final Drawable c(Contact contact)
    {
        return a(contact, com.skype.android.res.DefaultAvatars.AvatarSize.c);
    }

    public final ContactGroup c(String s1)
    {
        int ai[] = j.getCustomContactGroups().m_groupObjectIDList;
        int j1 = ai.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            int k1 = ai[i1];
            ContactGroup contactgroup = (ContactGroup)k.a(k1, com/skype/ContactGroup);
            if (contactgroup.getGivenDisplaynameProp().equals(s1))
            {
                return contactgroup;
            }
        }

        return null;
    }

    public final String[] c()
    {
        return ((com.skype.SkyLib.GetISOLanguageInfo_Result)n.get()).m_languageNameList;
    }

    public final CharSequence d(Contact contact)
    {
        return a(contact.getType(), contact.getObjectID(), contact.getRichMoodTextProp(), contact.getMoodTextProp(), contact.getMoodTimestampProp());
    }

    public final String[] d()
    {
        return ((com.skype.SkyLib.GetISOLanguageInfo_Result)n.get()).m_languageCodeList;
    }

    public final String f(String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            if ((s1 = h(s1)) != null)
            {
                return s1.a();
            }
        }
        return null;
    }

    public final CountryCode g(String s1)
    {
        CountryCode countrycode = h(s1);
        s1 = countrycode;
        if (countrycode == null)
        {
            s1 = b();
        }
        return s1;
    }

    public final CountryCode h(String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            com.skype.SkyLib.GetISOCountryInfo_Result getisocountryinfo_result = (com.skype.SkyLib.GetISOCountryInfo_Result)m.get();
            int i1 = 0;
            while (i1 < getisocountryinfo_result.m_countryCodeList.length) 
            {
                if (getisocountryinfo_result.m_countryCodeList[i1].equalsIgnoreCase(s1))
                {
                    return new CountryCode(getisocountryinfo_result.m_countryNameList[i1], getisocountryinfo_result.m_countryCodeList[i1], getisocountryinfo_result.m_countryPrefixList[i1]);
                }
                i1++;
            }
        }
        return null;
    }

    public final String i(String s1)
    {
        String s2 = s1;
        if (TextUtils.isEmpty(s1))
        {
            s2 = i.getResources().getConfiguration().locale.getLanguage();
        }
        s1 = (com.skype.SkyLib.GetISOLanguageInfo_Result)n.get();
        for (int i1 = 0; i1 < ((com.skype.SkyLib.GetISOLanguageInfo_Result) (s1)).m_languageCodeList.length; i1++)
        {
            if (s2.equalsIgnoreCase(((com.skype.SkyLib.GetISOLanguageInfo_Result) (s1)).m_languageCodeList[i1]) || s2.equalsIgnoreCase(((com.skype.SkyLib.GetISOLanguageInfo_Result) (s1)).m_languageNameList[i1]))
            {
                return ((com.skype.SkyLib.GetISOLanguageInfo_Result) (s1)).m_languageNameList[i1];
            }
        }

        return null;
    }

    public final boolean i(Contact contact)
    {
        return contact != null && b(contact.getIdentity(), contact.getType());
    }

    public final List j(Contact contact)
    {
        ArrayList arraylist = new ArrayList();
        PROPKEY apropkey[] = c;
        int j1 = apropkey.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            PROPKEY propkey = apropkey[i1];
            Object obj = contact.getStrProperty(propkey);
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                continue;
            }
            CountryCode countrycode = g(contact.getIpcountryProp());
            if (countrycode == null)
            {
                obj = j.normalizePSTNWithCountry(((String) (obj)));
            } else
            {
                obj = j.normalizePSTNWithCountry(((String) (obj)), countrycode.c());
            }
            if (((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (obj)).m_return == com.skype.SkyLib.NORMALIZERESULT.IDENTITY_OK)
            {
                arraylist.add(new Pair(propkey, ((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (obj)).m_normalized));
            }
            i1++;
        }
        if (arraylist.isEmpty())
        {
            contact = contact.getStrProperty(PROPKEY.CONTACT_PSTNNUMBER);
            if (!TextUtils.isEmpty(contact))
            {
                arraylist.add(new Pair(PROPKEY.CONTACT_PSTNNUMBER, contact));
            }
        }
        return arraylist;
    }

    public final String l(Contact contact)
    {
        String s2 = contact.getDisplaynameProp().trim();
        if (!i(contact)) goto _L2; else goto _L1
_L1:
        String s1 = i.getString(0x7f080341);
_L4:
        s2 = s1;
        if (contact.getIdentity().startsWith("guest:"))
        {
            if (s1.startsWith("guest:"))
            {
                contact.refreshProfile();
            }
            s2 = j(s1);
        }
        return s2;
_L2:
        s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s1 = contact.getIdentity();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String m(Contact contact)
    {
        return f(contact.getCountryProp());
    }

    static 
    {
        c = (new PROPKEY[] {
            PROPKEY.CONTACT_PHONE_HOME, PROPKEY.CONTACT_PHONE_OFFICE, PROPKEY.CONTACT_PHONE_MOBILE, PROPKEY.CONTACT_ASSIGNED_PHONE1, PROPKEY.CONTACT_ASSIGNED_PHONE2, PROPKEY.CONTACT_ASSIGNED_PHONE3
        });
        d = (new PROPKEY[] {
            PROPKEY.CONTACT_PHONE_MOBILE, PROPKEY.CONTACT_PHONE_HOME, PROPKEY.CONTACT_PHONE_OFFICE
        });
        e = (new PROPKEY[] {
            PROPKEY.CONTACT_ASSIGNED_PHONE1, PROPKEY.CONTACT_ASSIGNED_PHONE2, PROPKEY.CONTACT_ASSIGNED_PHONE3
        });
        f = (new PROPKEY[] {
            PROPKEY.CONTACT_ASSIGNED_PHONE1_LABEL, PROPKEY.CONTACT_ASSIGNED_PHONE2_LABEL, PROPKEY.CONTACT_ASSIGNED_PHONE3_LABEL
        });
    }
}
