// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;

import com.skype.android.mediacontent.MediaContent;
import java.util.Comparator;

// Referenced classes of package com.skype.android.app.chat.picker.Search:
//            SearchWeightedMediaContent

static final class 
    implements Comparator
{

    public final int compare(SearchWeightedMediaContent searchweightedmediacontent, SearchWeightedMediaContent searchweightedmediacontent1)
    {
        if (searchweightedmediacontent.equals(searchweightedmediacontent1))
        {
            return 0;
        }
        if (SearchWeightedMediaContent.access$000(searchweightedmediacontent) == SearchWeightedMediaContent.access$000(searchweightedmediacontent1))
        {
            return searchweightedmediacontent.getMediaContent().k() - searchweightedmediacontent1.getMediaContent().k();
        } else
        {
            return SearchWeightedMediaContent.access$000(searchweightedmediacontent1) - SearchWeightedMediaContent.access$000(searchweightedmediacontent);
        }
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((SearchWeightedMediaContent)obj, (SearchWeightedMediaContent)obj1);
    }

    ()
    {
    }
}
