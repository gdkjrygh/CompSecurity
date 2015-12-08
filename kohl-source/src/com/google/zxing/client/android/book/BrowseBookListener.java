// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.book;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import com.google.zxing.client.android.LocaleManager;
import java.util.List;

// Referenced classes of package com.google.zxing.client.android.book:
//            SearchBookContentsResult, SearchBookContentsActivity

final class BrowseBookListener
    implements android.widget.AdapterView.OnItemClickListener
{

    private final SearchBookContentsActivity activity;
    private final List items;

    BrowseBookListener(SearchBookContentsActivity searchbookcontentsactivity, List list)
    {
        activity = searchbookcontentsactivity;
        items = list;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i >= 1)
        {
            if (i-- < items.size())
            {
                adapterview = ((SearchBookContentsResult)items.get(i)).getPageId();
                view = SearchBookContentsResult.getQuery();
                if (LocaleManager.isBookSearchUrl(activity.getISBN()) && !adapterview.isEmpty())
                {
                    String s = activity.getISBN();
                    s = s.substring(s.indexOf('=') + 1);
                    adapterview = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("http://books.google.").append(LocaleManager.getBookSearchCountryTLD(activity)).append("/books?id=").append(s).append("&pg=").append(adapterview).append("&vq=").append(view).toString()));
                    adapterview.addFlags(0x80000);
                    activity.startActivity(adapterview);
                    return;
                }
            }
        }
    }
}
