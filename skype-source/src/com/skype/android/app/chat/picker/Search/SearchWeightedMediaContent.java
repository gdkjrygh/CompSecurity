// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;

import com.skype.android.mediacontent.MediaContent;
import java.util.Comparator;

public class SearchWeightedMediaContent
    implements Comparable
{

    public static final Comparator SEARCH_WEIGHTED_MEDIA_CONTENT_COMPARATOR = new Comparator() {

        public final int compare(SearchWeightedMediaContent searchweightedmediacontent, SearchWeightedMediaContent searchweightedmediacontent1)
        {
            if (searchweightedmediacontent.equals(searchweightedmediacontent1))
            {
                return 0;
            }
            if (searchweightedmediacontent.searchWeight == searchweightedmediacontent1.searchWeight)
            {
                return searchweightedmediacontent.getMediaContent().k() - searchweightedmediacontent1.getMediaContent().k();
            } else
            {
                return searchweightedmediacontent1.searchWeight - searchweightedmediacontent.searchWeight;
            }
        }

        public final volatile int compare(Object obj, Object obj1)
        {
            return compare((SearchWeightedMediaContent)obj, (SearchWeightedMediaContent)obj1);
        }

    };
    private MediaContent mediaContent;
    private int searchWeight;

    public SearchWeightedMediaContent(int i, MediaContent mediacontent)
    {
        searchWeight = i;
        mediaContent = mediacontent;
    }

    public int compareTo(SearchWeightedMediaContent searchweightedmediacontent)
    {
        return mediaContent.a(searchweightedmediacontent.mediaContent);
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((SearchWeightedMediaContent)obj);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof SearchWeightedMediaContent)
        {
            flag = flag1;
            if (mediaContent.k() == ((SearchWeightedMediaContent)obj).mediaContent.k())
            {
                flag = true;
            }
        }
        return flag;
    }

    public MediaContent getMediaContent()
    {
        return mediaContent;
    }

    public void setSearchWeight(int i)
    {
        searchWeight = i;
    }


}
