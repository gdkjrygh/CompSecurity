// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.content.Context;
import com.appboy.Constants;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy.ui.widget:
//            BaseCardView

public class DefaultCardView extends BaseCardView
{

    private static final String TAG;

    public DefaultCardView(Context context)
    {
        this(context, null);
    }

    public DefaultCardView(Context context, Card card)
    {
        super(context);
        if (card != null)
        {
            setCard(card);
        }
    }

    protected int getLayoutResource()
    {
        return com.appboy.ui.R.layout.com_appboy_default_card;
    }

    public void onSetCard(Card card)
    {
        AppboyLogger.w(TAG, (new StringBuilder()).append("onSetCard called for blank view with: ").append(card.toString()).toString());
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/ui/widget/DefaultCardView.getName()
        });
    }
}
