// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.text;

import android.text.SpannableString;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.pinterest.ui.text:
//            HashTag, AtMentionSpan

public class HashTagUtils
{

    public HashTagUtils()
    {
    }

    public static ArrayList getSpanWords(String s, ArrayList arraylist)
    {
        if (arraylist == null || arraylist.size() == 0)
        {
            return null;
        }
        ArrayList arraylist1 = new ArrayList(arraylist.size());
        for (int i = 0; i < arraylist.size(); i++)
        {
            int ai[] = (int[])arraylist.get(i);
            arraylist1.add(s.substring(ai[0], ai[1]));
        }

        return arraylist1;
    }

    public static ArrayList getSpans(String s, char c)
    {
        ArrayList arraylist = new ArrayList();
        for (s = Pattern.compile((new StringBuilder()).append(c).append("\\w+").toString()).matcher(s); s.find(); arraylist.add(new int[] {
    s.start(), s.end()
})) { }
        return arraylist;
    }

    public static boolean gotoTarget(String s)
    {
        if (s != null)
        {
            if (HashTag.isHashTag(s))
            {
                s = s.substring(1);
                Pinalytics.a(ElementType.HASH_TAG, ComponentType.MODAL_PIN, s);
                s = new Navigation(Location.SEARCH, s);
                s.putStringParcelable("com.pinterest.EXTRA_SEARCH_CONTEXT", "VALUE_HASHTAG");
                Events.post(s);
                return true;
            }
            if (AtMentionSpan.isAtMention(s))
            {
                s = s.substring(1);
                Pinalytics.a(ElementType.HASH_TAG, ComponentType.MODAL_PIN, s);
                Events.post(new Navigation(Location.USER, s));
                return true;
            }
        }
        return false;
    }

    public static void setSpans(SpannableString spannablestring, ArrayList arraylist, Class class1)
    {
        int i = 0;
        while (i < arraylist.size()) 
        {
            int ai[] = (int[])arraylist.get(i);
            try
            {
                spannablestring.setSpan(class1.newInstance(), ai[0], ai[1], 0);
            }
            catch (Exception exception) { }
            i++;
        }
    }
}
