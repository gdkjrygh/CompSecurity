// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;

import android.app.Application;
import android.text.TextUtils;
import com.pinterest.activity.sendapin.providers.ContactsProvider;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.ConfigurationApi;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.time.Clock;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

// Referenced classes of package com.pinterest.activity.contacts:
//            InvitabilityContact

public class InviterManager
{

    private static final Set BOT_LIKELY_EMAIL_DOMAINS = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "e", "email"
    })));
    private static final Set FAMILY_WORDS = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "mom", "dad", "uncle", "aunt", "brother", "sister"
    })));
    private static final Set NON_HUMAN_CONTACT_NAMES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "hospital", "service", "center", "support", "inc", "help"
    })));
    private static final Set NON_HUMAN_EMAIL_DOMAINS = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "craigslist", "news", "facebookmail"
    })));
    private static final Set NON_HUMAN_EMAIL_IDS = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "no-reply", "noreply", "donotreply", "support", "alerts", "email", "confirm", "hello", "deals", "info", 
        "reminder", "newsletter", "news", "shop", "support", "admin", "customerservice", "contact"
    })));
    private static final String TAG = "InviterManager";
    private final Clock clock;
    protected double invitabilityScoreCutoff;
    private final PreferencesManager prefManager;

    public InviterManager(Clock clock1, PreferencesManager preferencesmanager)
    {
        clock = clock1;
        prefManager = preferencesmanager;
        updateFromSettings();
    }

    public static HashMap getLocalInvitabilityContacts(Application application, int i)
    {
        HashMap hashmap = new HashMap();
        ContactsProvider.fillInvitabilityContactsWithEmail(application, hashmap, i);
        ContactsProvider.fillInvitabilityContactsWithPhone(application, hashmap);
        ContactsProvider.fillInvitabilityContactsWithName(application, hashmap);
        ContactsProvider.fillInvitabilityContactsWithCloseFriend(application, hashmap);
        ContactsProvider.fillInvitabilityContactsWithPostal(application, hashmap);
        return hashmap;
    }

    public List getInviteRecommendationsLocally(User user, List list, int i)
    {
        boolean flag = false;
        if (list.isEmpty())
        {
            return Collections.emptyList();
        }
        PriorityQueue priorityqueue = new PriorityQueue(list.size(), Collections.reverseOrder());
        class ScoredInvitabilityContact.Builder
        {

            private static final int EMAIL_DOMAIN = 2;
            private static final int EMAIL_ID = 1;
            private final User accountOwner;
            private InvitabilityContact contact;
            private final PinterestJsonObject defaultNameHeuristic = getDefaultNameHeuristic();
            private final Pattern emailPattern = Pattern.compile("([^\\+]*).*@(.*)(\\..*)");
            private final Map featureWeightMap;
            private final Map nameHeuristicsMap;

            private double calcScore(String s, double d)
            {
                if (featureWeightMap.containsKey(s))
                {
                    return ((Double)featureWeightMap.get(s)).doubleValue() * d;
                } else
                {
                    return 0.0D;
                }
            }

            private static boolean containsSubstring(String s, Set set)
            {
                if (set.contains(s))
                {
                    return true;
                }
                for (set = set.iterator(); set.hasNext();)
                {
                    if (s.contains((String)set.next()))
                    {
                        return true;
                    }
                }

                return false;
            }

            private static PinterestJsonObject getDefaultNameHeuristic()
            {
                return new PinterestJsonObject("{gender: 0.4836111543, age_groups: [0.2064032483, 0.4052428231, 0.4052428231]}");
            }

            private String getFirstNameLowerCase()
            {
                if (TextUtils.isEmpty(contact.firstName))
                {
                    String as[] = getFullNameLowerCase().split(" ");
                    if (as.length > 0)
                    {
                        return as[0];
                    } else
                    {
                        return "";
                    }
                } else
                {
                    return contact.firstName.toLowerCase();
                }
            }

            private double getGender(String s)
            {
                return getNameHeuristic(s).b("gender");
            }

            private PinterestJsonObject getNameHeuristic(String s)
            {
                if (nameHeuristicsMap.containsKey(s))
                {
                    return (PinterestJsonObject)nameHeuristicsMap.get(s);
                } else
                {
                    return defaultNameHeuristic;
                }
            }

            private double hasLastName()
            {
                while (!TextUtils.isEmpty(contact.lastName) || normalizeString(contact.name).contains(" ")) 
                {
                    return 1.0D;
                }
                return 0.0D;
            }

            private double isFamily(String s)
            {
                if (InviterManager.FAMILY_WORDS.contains(s))
                {
                    return 1.0D;
                }
                String s1 = accountOwner.getLastName().toLowerCase();
                return TextUtils.isEmpty(s1) || !s.endsWith(s1) ? 0.0D : 0.5D;
            }

            private static String normalizeString(String s)
            {
                if (TextUtils.isEmpty(s))
                {
                    return "";
                } else
                {
                    return s.toLowerCase().replace('-', ' ');
                }
            }

            private double notHuman(String s)
            {
                if (TextUtils.isEmpty(contact.email))
                {
                    return 0.0D;
                }
                Object obj = emailPattern.matcher(contact.email.toLowerCase());
                ((Matcher) (obj)).find();
                String s1 = ((Matcher) (obj)).group(1);
                if (((Matcher) (obj)).groupCount() > 1)
                {
                    obj = ((Matcher) (obj)).group(2);
                } else
                {
                    obj = "";
                }
                if (InviterManager.NON_HUMAN_EMAIL_IDS.contains(s1) || s1.endsWith("noreply") || s1.startsWith("noreply") || containsSubstring(((String) (obj)), InviterManager.NON_HUMAN_EMAIL_DOMAINS) || containsSubstring(s, InviterManager.NON_HUMAN_CONTACT_NAMES))
                {
                    return 1.0D;
                }
                return !containsSubstring(((String) (obj)), InviterManager.BOT_LIKELY_EMAIL_DOMAINS) ? 0.0D : 0.29999999999999999D;
            }

            final double calcScore(InvitabilityContact invitabilitycontact)
            {
                double d1 = 0.0D;
                contact = invitabilitycontact;
                String s = getFullNameLowerCase();
                double d2 = getGender(getFirstNameLowerCase());
                double d3 = calcScore("not_human", notHuman(s));
                double d4 = calcScore("is_family", isFamily(s));
                double d;
                double d5;
                double d6;
                if (invitabilitycontact.hasPhoto)
                {
                    d = 1.0D;
                } else
                {
                    d = 0.0D;
                }
                d5 = calcScore("has_photo", d);
                if (invitabilitycontact.isCloseFriend)
                {
                    d = 1.0D;
                } else
                {
                    d = 0.0D;
                }
                d6 = calcScore("is_close_friend", d);
                d = d1;
                if (invitabilitycontact.isFacebookFriend)
                {
                    d = 1.0D;
                }
                return d6 + (d3 + d4 + d5) + calcScore("is_facebook_friend", d) + calcScore("num_pieces_of_info", Math.min(5, invitabilitycontact.numPiecesOfInfo)) + calcScore("has_last_name", hasLastName()) + calcScore("is_female", d2) + calcScore("offset", 1.0D);
            }

            public final ScoredInvitabilityContact create(InvitabilityContact invitabilitycontact)
            {
                return new ScoredInvitabilityContact(invitabilitycontact, 1.0D / (Math.exp(calcScore(invitabilitycontact) * -1D) + 1.0D), null);
            }

            final String getFullNameLowerCase()
            {
                if (TextUtils.isEmpty(contact.name))
                {
                    String s1 = normalizeString(contact.firstName);
                    String s = s1;
                    if (!TextUtils.isEmpty(contact.lastName))
                    {
                        s = (new StringBuilder()).append(s1).append(" ").append(normalizeString(contact.lastName)).toString();
                    }
                    return s;
                } else
                {
                    return contact.name.toLowerCase();
                }
            }

            public ScoredInvitabilityContact.Builder(User user, Map map, Map map1)
            {
                accountOwner = user;
                featureWeightMap = map;
                nameHeuristicsMap = map1;
            }
        }

        user = new ScoredInvitabilityContact.Builder(user, getScoredFeatureToWeightMap(), getNameHeuristicsMap());
        for (int j = 0; j < list.size(); j++)
        {
            priorityqueue.add(user.create((InvitabilityContact)list.get(j)));
        }

        user = new ArrayList(i);
        int k = ((flag) ? 1 : 0);
        do
        {
            if (k >= i || priorityqueue.isEmpty())
            {
                break;
            }
            list = (ScoredInvitabilityContact)priorityqueue.poll();
            if (((ScoredInvitabilityContact) (list)).score < invitabilityScoreCutoff)
            {
                break;
            }
            user.add(((ScoredInvitabilityContact) (list)).contact);
            k++;
        } while (true);
        user.trimToSize();
        return user;
    }

    protected Map getNameHeuristicsMap()
    {
        String s = prefManager.getString("PREF_INVITABILITY_NAME_HEURISTICS", null);
        if (TextUtils.isEmpty(s))
        {
            return new HashMap(0);
        } else
        {
            return (new PinterestJsonObject(s)).b();
        }
    }

    protected Map getScoredFeatureToWeightMap()
    {
        String s = prefManager.getString("PREF_INVITABILITY_FEATURE_WEIGHT", null);
        if (TextUtils.isEmpty(s))
        {
            return new HashMap(0);
        } else
        {
            return (new PinterestJsonObject(s)).a(new _cls1());
        }
    }

    protected void updateFromSettings()
    {
        String s = prefManager.getString("PREF_INVITABILITY_SETTINGS", null);
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            invitabilityScoreCutoff = (new PinterestJsonObject(s)).a("local_cutoff_score", 0.0D);
            return;
        }
    }

    public void updateInvitabilityConfigs(ConfigurationApi configurationapi)
    {
        configurationapi.a(new _cls2(), "InviterManager");
    }









    private class ScoredInvitabilityContact
        implements Comparable
    {

        public final InvitabilityContact contact;
        public final double score;

        public final int compareTo(ScoredInvitabilityContact scoredinvitabilitycontact)
        {
            double d = score - scoredinvitabilitycontact.score;
            if (d == 0.0D)
            {
                return 0;
            }
            return d <= 0.0D ? -1 : 1;
        }

        public final volatile int compareTo(Object obj)
        {
            return compareTo((ScoredInvitabilityContact)obj);
        }

        private ScoredInvitabilityContact(InvitabilityContact invitabilitycontact, double d)
        {
            contact = invitabilitycontact;
            score = d;
        }

        ScoredInvitabilityContact(InvitabilityContact invitabilitycontact, double d, _cls1 _pcls1)
        {
            this(invitabilitycontact, d);
        }
    }


    private class _cls1
        implements Function
    {

        final InviterManager this$0;

        public Double apply(JsonElement jsonelement)
        {
            return Double.valueOf(jsonelement.getAsDouble());
        }

        public volatile Object apply(Object obj)
        {
            return apply((JsonElement)obj);
        }

        _cls1()
        {
            this$0 = InviterManager.this;
            super();
        }
    }


    private class _cls2 extends ApiResponseHandler
    {

        final InviterManager this$0;

        private void saveInvitabilityConfiguration(PinterestJsonObject pinterestjsonobject)
        {
            PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject.c("configuration");
            if (pinterestjsonobject1 == null)
            {
                return;
            } else
            {
                String s = pinterestjsonobject.a("snapshot_key", "0");
                saveInvitabilityConfiguration(pinterestjsonobject.a("config_id", null), s, pinterestjsonobject1);
                return;
            }
        }

        private void saveInvitabilityConfiguration(String s, String s1, PinterestJsonObject pinterestjsonobject)
        {
            byte byte0 = -1;
            s.hashCode();
            JVM INSTR lookupswitch 3: default 40
        //                       -2012429091: 84
        //                       -265168718: 69
        //                       1434631203: 99;
               goto _L1 _L2 _L3 _L4
_L1:
            byte0;
            JVM INSTR tableswitch 0 2: default 68
        //                       0 114
        //                       1 150
        //                       2 160;
               goto _L5 _L6 _L7 _L8
_L5:
            return;
_L3:
            if (s.equals("feature_weights"))
            {
                byte0 = 0;
            }
              goto _L1
_L2:
            if (s.equals("name_heuristics"))
            {
                byte0 = 1;
            }
              goto _L1
_L4:
            if (s.equals("settings"))
            {
                byte0 = 2;
            }
              goto _L1
_L6:
            String s2;
            s2 = "PREF_INVITABILITY_FEATURE_WEIGHT";
            s = "PREF_INVITABILITY_FEATURE_WEIGHT_SNAPSHOT_KEY";
_L10:
            prefManager.set(s2, pinterestjsonobject.toString());
            prefManager.set(s, s1);
            return;
_L7:
            s2 = "PREF_INVITABILITY_NAME_HEURISTICS";
            s = "PREF_INVITABILITY_NAME_HEURISTICS_SNAPSHOT_KEY";
            continue; /* Loop/switch isn't completed */
_L8:
            s2 = "PREF_INVITABILITY_SETTINGS";
            s = "PREF_INVITABILITY_SETTINGS_SNAPSHOT_KEY";
            if (true) goto _L10; else goto _L9
_L9:
        }

        public void onFinish()
        {
            PreferencesManager preferencesmanager = prefManager;
            Clock _tmp = clock;
            preferencesmanager.set("PREF_LAST_CONFIG_UPDATE", Clock.a());
            updateFromSettings();
            super.onFinish();
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            apiresponse = (PinterestJsonObject)apiresponse.getData();
            if (apiresponse != null)
            {
                apiresponse = apiresponse.b().values().iterator();
                while (apiresponse.hasNext()) 
                {
                    ApiResponse apiresponse1 = new ApiResponse((PinterestJsonObject)apiresponse.next());
                    if (apiresponse1.getCode() == 0)
                    {
                        saveInvitabilityConfiguration((PinterestJsonObject)apiresponse1.getData());
                    }
                }
            }
        }

        _cls2()
        {
            this$0 = InviterManager.this;
            super();
        }
    }

}
