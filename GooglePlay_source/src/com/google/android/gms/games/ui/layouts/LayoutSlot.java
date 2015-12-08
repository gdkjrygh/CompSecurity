// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.layouts;

import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.appcontent.AppContentAction;
import com.google.android.gms.games.appcontent.AppContentAnnotation;
import com.google.android.gms.games.logging.LogflowGamesUiElementNode;
import com.google.android.gms.games.logging.LogflowViewUiElementNode;
import com.google.android.gms.games.ui.appcontent.AppContentUtils;
import com.google.android.gms.games.ui.appcontent.ExtendedAppContentAction;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import java.util.Collection;
import java.util.List;

public class LayoutSlot
{
    public static interface LayoutSlotProvider
    {

        public abstract LayoutSlot getLayoutSlot(String s);

        public abstract Collection getLayoutSlots();
    }


    protected ExtendedAppContentAction mAction;
    public boolean mVisible;

    public LayoutSlot()
    {
    }

    private void setupClickableViews(boolean flag, String s)
    {
        List list = getClickableViews();
        if (list != null && list.size() != 0)
        {
            LogflowViewUiElementNode logflowviewuielementnode;
            Object obj;
            boolean flag1;
            boolean flag2;
            if (!flag || mAction != null)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            Asserts.checkState(flag2);
            flag1 = true;
            obj = null;
            logflowviewuielementnode = ((LogflowViewUiElementNode) (obj));
            if (mAction != null)
            {
                View view;
                int i;
                int j;
                if (!"WHOLE_CARD".equals(mAction.getAction().getAnnotation().getLayoutSlot()))
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                logflowviewuielementnode = ((LogflowViewUiElementNode) (obj));
                flag1 = i;
                if (i != 0)
                {
                    obj = new LogflowViewUiElementNode(AppContentUtils.getActionLogflowUiElementType(mAction), (byte)0);
                    String s1 = mAction.getLogflowDocumentId();
                    logflowviewuielementnode = ((LogflowViewUiElementNode) (obj));
                    flag1 = i;
                    if (!TextUtils.isEmpty(s1))
                    {
                        ((LogflowGamesUiElementNode) (obj)).getPlaylogGamesUiElement().id = s1;
                        flag1 = i;
                        logflowviewuielementnode = ((LogflowViewUiElementNode) (obj));
                    }
                }
            }
            if (flag)
            {
                obj = mAction;
            } else
            {
                obj = null;
            }
            i = 0;
            j = list.size();
            while (i < j) 
            {
                view = (View)list.get(i);
                view.setOnClickListener(((android.view.View.OnClickListener) (obj)));
                view.setClickable(flag);
                view.setContentDescription(s);
                if (flag1)
                {
                    view.setTag(0x7f0d0061, logflowviewuielementnode);
                }
                i++;
            }
        }
    }

    public void addSharedViews(SharedElementTransition sharedelementtransition)
    {
    }

    public final ExtendedAppContentAction getAction()
    {
        return mAction;
    }

    public int getAnimationType()
    {
        return 0;
    }

    public List getClickableViews()
    {
        return null;
    }

    public void reset()
    {
        resetAction();
        resetAnnotation();
    }

    public void resetAction()
    {
        mAction = null;
        setupClickableViews(false, "");
    }

    public void resetAnnotation()
    {
        mVisible = false;
    }

    public void setAction(ExtendedAppContentAction extendedappcontentaction)
    {
        boolean flag1 = true;
        boolean flag;
        if (extendedappcontentaction != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        mAction = extendedappcontentaction;
        if (!mAction.mClickDisabled)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        setupClickableViews(flag, extendedappcontentaction.getAction().getContentDescription());
        setAnnotation(extendedappcontentaction.mAnnotation);
    }

    public void setAnnotation(AppContentAnnotation appcontentannotation)
    {
        mVisible = true;
    }
}
