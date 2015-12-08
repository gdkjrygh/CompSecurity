// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.gms.games.appcontent.AppContentAction;
import com.google.android.gms.games.appcontent.AppContentCondition;
import com.google.android.gms.games.ui.LogflowEventListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentSection, ExtendedAppContentAnnotation, AppContentUtils, ExtendedAppContentCondition, 
//            AppContentFragment

public abstract class ExtendedAppContentAction
    implements android.view.View.OnClickListener, ExtendedAppContentCondition.EventListener
{
    public static interface EventListener
    {

        public abstract void onActionChanged$5ea2ff71();
    }


    protected final AppContentAction mAction;
    public final ExtendedAppContentAnnotation mAnnotation;
    public boolean mClickDisabled;
    private final ArrayList mConditions;
    protected final Context mContext;
    protected final EventListener mEventListener;
    protected final AppContentFragment mFragment;
    protected final ExtendedAppContentSection mSection;
    boolean mVisible;

    public ExtendedAppContentAction(ExtendedAppContentSection extendedappcontentsection, AppContentAction appcontentaction, EventListener eventlistener)
    {
        mSection = extendedappcontentsection;
        int j;
        if (extendedappcontentsection != null)
        {
            mFragment = extendedappcontentsection.mFragment;
            mContext = ((Fragment) (mFragment)).mActivity;
        } else
        {
            mFragment = null;
            mContext = null;
        }
        mAction = appcontentaction;
        mEventListener = eventlistener;
        mVisible = true;
        mAnnotation = new ExtendedAppContentAnnotation(appcontentaction.getAnnotation());
        appcontentaction = appcontentaction.getConditions();
        j = appcontentaction.size();
        mConditions = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            eventlistener = AppContentUtils.createCondition(extendedappcontentsection, (AppContentCondition)appcontentaction.get(i), this);
            if (eventlistener != null)
            {
                mConditions.add(eventlistener);
            }
        }

    }

    final void checkConditionsInternal(boolean flag)
    {
        boolean flag1 = mVisible;
        mVisible = true;
        int j = mConditions.size();
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    if (((ExtendedAppContentCondition)mConditions.get(i)).evaluate())
                    {
                        break label0;
                    }
                    mVisible = false;
                }
                if (flag && mEventListener != null && flag1 != mVisible)
                {
                    mEventListener._mth5ea2ff71();
                }
                return;
            }
            i++;
        } while (true);
    }

    public abstract void execute();

    public final AppContentAction getAction()
    {
        return mAction;
    }

    public final Context getContext()
    {
        return mContext;
    }

    public final int getIndex()
    {
        boolean flag = false;
        Bundle bundle = mAction.getExtras();
        int i = ((flag) ? 1 : 0);
        if (bundle != null)
        {
            i = ((flag) ? 1 : 0);
            if (bundle.containsKey("index"))
            {
                try
                {
                    i = Integer.parseInt(bundle.getString("index"));
                }
                catch (NumberFormatException numberformatexception)
                {
                    return -1;
                }
            }
        }
        return i;
    }

    public final String getLogflowDocumentId()
    {
        return mAction.getExtras().getString("semanticId");
    }

    public abstract int getLogflowUiElementType();

    public Bundle getSaveBundle()
    {
        return null;
    }

    public String getSaveKey()
    {
        return null;
    }

    public final ExtendedAppContentSection getSection()
    {
        return mSection;
    }

    public void loadFromSaveBundle(Bundle bundle)
    {
    }

    protected final void notifyFinished()
    {
        if (mSection != null)
        {
            ExtendedAppContentSection extendedappcontentsection = mSection;
            if (!extendedappcontentsection.mActiveActions.isEmpty())
            {
                extendedappcontentsection.mActiveActions.remove(this);
                extendedappcontentsection.checkPendingData();
            }
        }
    }

    protected final void notifyStarted()
    {
        if (mSection != null)
        {
            mSection.mActiveActions.add(this);
        }
    }

    public void onBindToLayoutSlotProvider(com.google.android.gms.games.ui.layouts.LayoutSlot.LayoutSlotProvider layoutslotprovider)
    {
    }

    public void onClick(View view)
    {
        if (mSection != null)
        {
            LogflowEventListener logfloweventlistener = mSection.mLogListener;
            if (logfloweventlistener != null)
            {
                if (!"WHOLE_CARD".equals(mAnnotation.mLayoutSlot))
                {
                    logfloweventlistener.logClick(view);
                } else
                {
                    logfloweventlistener.logClick(AppContentUtils.getActionLogflowUiElementType(this), view);
                }
            }
        }
        execute();
    }

    public final void onConditionChanged$7a33ab32()
    {
        checkConditionsInternal(true);
    }

    public final void setClickDisabled(boolean flag)
    {
        if (mClickDisabled != flag)
        {
            mClickDisabled = flag;
            if (mEventListener != null)
            {
                mEventListener._mth5ea2ff71();
                return;
            }
        }
    }
}
