// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.book;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;

// Referenced classes of package com.google.zxing.client.android.book:
//            SearchBookContentsResult

public final class SearchBookContentsListItem extends LinearLayout
{

    private TextView pageNumberView;
    private TextView snippetView;

    SearchBookContentsListItem(Context context)
    {
        super(context);
    }

    public SearchBookContentsListItem(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        pageNumberView = (TextView)findViewById(com.google.zxing.client.android.R.id.page_number_view);
        snippetView = (TextView)findViewById(com.google.zxing.client.android.R.id.snippet_view);
    }

    public void set(SearchBookContentsResult searchbookcontentsresult)
    {
        pageNumberView.setText(searchbookcontentsresult.getPageNumber());
        Object obj = searchbookcontentsresult.getSnippet();
        if (((String) (obj)).length() > 0)
        {
            if (searchbookcontentsresult.getValidSnippet())
            {
                searchbookcontentsresult = SearchBookContentsResult.getQuery().toLowerCase(Locale.getDefault());
                String s = ((String) (obj)).toLowerCase(Locale.getDefault());
                obj = new SpannableString(((CharSequence) (obj)));
                StyleSpan stylespan = new StyleSpan(1);
                int j = searchbookcontentsresult.length();
                int i = 0;
                do
                {
                    i = s.indexOf(searchbookcontentsresult, i);
                    if (i < 0)
                    {
                        snippetView.setText(((CharSequence) (obj)));
                        return;
                    }
                    ((Spannable) (obj)).setSpan(stylespan, i, i + j, 0);
                    i += j;
                } while (true);
            } else
            {
                snippetView.setText(((CharSequence) (obj)));
                return;
            }
        } else
        {
            snippetView.setText("");
            return;
        }
    }
}
