// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;

import android.text.TextUtils;
import com.pinterest.api.model.User;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.pinterest.activity.contacts:
//            InvitabilityContact, InviterManager

public final class nameHeuristicsMap
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
        if (InviterManager.access$500().contains(s))
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
        if (InviterManager.access$100().contains(s1) || s1.endsWith("noreply") || s1.startsWith("noreply") || containsSubstring(((String) (obj)), InviterManager.access$200()) || containsSubstring(s, InviterManager.access$300()))
        {
            return 1.0D;
        }
        return !containsSubstring(((String) (obj)), InviterManager.access$400()) ? 0.0D : 0.29999999999999999D;
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

    public final calcScore create(InvitabilityContact invitabilitycontact)
    {
        return new calcScore(invitabilitycontact, 1.0D / (Math.exp(calcScore(invitabilitycontact) * -1D) + 1.0D), null);
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

    public (User user, Map map, Map map1)
    {
        accountOwner = user;
        featureWeightMap = map;
        nameHeuristicsMap = map1;
    }
}
