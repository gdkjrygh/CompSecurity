// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;

import com.skype.android.mediacontent.EmoticonContent;
import com.skype.android.mediacontent.MediaContent;
import com.skype.android.mediacontent.MojiContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.skype.android.app.chat.picker.Search:
//            SearchWeightedMediaContent

public class MediaPickerContentSearchModel
{

    private final int COPYRIGHT_SEARCH_WEIGHT = 2;
    private final int DESCRIPTION_SEARCH_WEIGHT = 5;
    private final int KEYWORDS_SEARCH_WEIGHT = 1;
    private final int SHORTCUTS_SEARCH_WEIGHT = 2;
    private final int TITLE_SEARCH_WEIGHT = 3;
    private String queryString;

    public MediaPickerContentSearchModel()
    {
    }

    private int getSearchWeight(MediaContent mediacontent)
    {
        int j = 0;
        int i = j;
        if (mediacontent.l() != null)
        {
            i = j;
            if (startTextMatchesQueryString(mediacontent.l()))
            {
                i = 0 + 5;
            }
        }
        j = i;
        if (mediacontent.m() != null)
        {
            j = i;
            if (startTextMatchesQueryString(mediacontent.m()))
            {
                j = i + 3;
            }
        }
        if (mediacontent.n() == com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK)
        {
            i = j + getSearchWeightForMojiSpecificContent((MojiContent)mediacontent);
        } else
        {
            i = j;
            if (mediacontent.n() == com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON)
            {
                return j + getSearchWeightForEmoticonSpecificContent((EmoticonContent)mediacontent);
            }
        }
        return i;
    }

    private int getSearchWeightForEmoticonSpecificContent(EmoticonContent emoticoncontent)
    {
        int i = 0;
        if (startTextMatchesQueryString(emoticoncontent.a()))
        {
            i = 0 + 3;
        }
        Object obj = emoticoncontent.g();
        int j;
        if (obj != null)
        {
            emoticoncontent = (new StringBuilder("(")).append(queryString).toString();
            obj = ((List) (obj)).iterator();
            do
            {
                j = i;
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                if (((String)((Iterator) (obj)).next()).toUpperCase().startsWith(emoticoncontent))
                {
                    i += 2;
                }
            } while (true);
        } else
        {
            j = i;
            if (startTextMatchesQueryString(emoticoncontent.f()))
            {
                j = i + 2;
            }
        }
        return j;
    }

    private int getSearchWeightForMojiSpecificContent(MojiContent mojicontent)
    {
        int i = 0;
        if (startTextMatchesQueryString(mojicontent.a()))
        {
            i = 0 + 2;
        }
        mojicontent = mojicontent.d().iterator();
        do
        {
            if (!mojicontent.hasNext())
            {
                break;
            }
            if (startTextMatchesQueryString((String)mojicontent.next()))
            {
                i++;
            }
        } while (true);
        return i;
    }

    private boolean startTextMatchesQueryString(String s)
    {
        if (!s.isEmpty()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        s = s.toUpperCase();
        if (s.startsWith(queryString))
        {
            return true;
        }
        s = s.split("\\s+");
        if (s.length > 1)
        {
            int j = s.length;
            int i = 0;
            while (i < j) 
            {
                if (s[i].startsWith(queryString))
                {
                    return true;
                }
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public Set searchForString(Set set, String s)
    {
        TreeSet treeset = new TreeSet(SearchWeightedMediaContent.SEARCH_WEIGHTED_MEDIA_CONTENT_COMPARATOR);
        queryString = s.toUpperCase();
        set = set.iterator();
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            s = ((SearchWeightedMediaContent)set.next()).getMediaContent();
            int i = getSearchWeight(s);
            if (i > 0)
            {
                treeset.add(new SearchWeightedMediaContent(i, s));
            }
        } while (true);
        return treeset;
    }
}
