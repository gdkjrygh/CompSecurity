// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.games.appcontent.AppContentAction;
import com.google.android.gms.games.appcontent.AppContentCard;
import com.google.android.gms.games.appcontent.AppContentCondition;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentUtils, ExtendedAppContentSection, ExtendedAppContentCondition

public final class ExtendedAppContentCard
    implements ExtendedAppContentAction.EventListener, ExtendedAppContentCondition.EventListener
{
    public static interface EventListener
    {

        public abstract void onCardAdded(ExtendedAppContentCard extendedappcontentcard);

        public abstract void onCardChanged(ExtendedAppContentCard extendedappcontentcard);

        public abstract void onCardRemoved(ExtendedAppContentCard extendedappcontentcard);
    }


    final ArrayList mActions;
    public final AppContentCard mCard;
    private final ArrayList mConditions;
    private final Context mContext;
    private final EventListener mEventListener;
    final ExtendedAppContentSection mSection;
    public boolean mVisible;

    private ExtendedAppContentCard(Context context, ExtendedAppContentSection extendedappcontentsection, AppContentCard appcontentcard, EventListener eventlistener)
    {
        mContext = context;
        mCard = appcontentcard;
        mSection = extendedappcontentsection;
        mEventListener = eventlistener;
        mVisible = true;
        context = appcontentcard.getActions();
        int k = context.size();
        mActions = new ArrayList(k);
        for (int i = 0; i < k; i++)
        {
            eventlistener = AppContentUtils.createAction(extendedappcontentsection, (AppContentAction)context.get(i), this);
            if (eventlistener != null)
            {
                mActions.add(eventlistener);
            }
        }

        context = appcontentcard.getConditions();
        k = context.size();
        mConditions = new ArrayList(k);
        for (int j = 0; j < k; j++)
        {
            appcontentcard = AppContentUtils.createCondition(extendedappcontentsection, (AppContentCondition)context.get(j), this);
            if (appcontentcard != null)
            {
                mConditions.add(appcontentcard);
            }
        }

    }

    public ExtendedAppContentCard(ExtendedAppContentSection extendedappcontentsection, AppContentCard appcontentcard, EventListener eventlistener)
    {
        this(((Context) (((Fragment) (extendedappcontentsection.mFragment)).mActivity)), extendedappcontentsection, appcontentcard, eventlistener);
    }

    public static String getSemanticId(AppContentCard appcontentcard)
    {
        appcontentcard = appcontentcard.getExtras().getString("semanticId");
        if (appcontentcard != null)
        {
            return appcontentcard;
        } else
        {
            return new String();
        }
    }

    public final void checkConditions()
    {
        boolean flag = mVisible;
        mVisible = true;
        int j = mConditions.size();
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i < j)
                {
                    if (((ExtendedAppContentCondition)mConditions.get(i)).evaluate())
                    {
                        break label1;
                    }
                    mVisible = false;
                }
                if (flag != mVisible && mEventListener != null)
                {
                    if (!mVisible)
                    {
                        break label0;
                    }
                    mEventListener.onCardAdded(this);
                }
                return;
            }
            i++;
        } while (true);
        mEventListener.onCardRemoved(this);
    }

    public final String getLogflowDocumentId()
    {
        return mCard.getExtras().getString("semanticId");
    }

    public final void onActionChanged$5ea2ff71()
    {
        if (mEventListener != null)
        {
            mEventListener.onCardChanged(this);
        }
    }

    public final void onConditionChanged$7a33ab32()
    {
        checkConditions();
    }
}
