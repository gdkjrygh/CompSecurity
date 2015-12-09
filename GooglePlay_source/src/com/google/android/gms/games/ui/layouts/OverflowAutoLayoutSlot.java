// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.layouts;

import android.content.Context;
import android.support.v7.internal.view.menu.MenuPopupHelper;
import android.support.v7.widget.PopupMenu;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.games.appcontent.AppContentAction;
import com.google.android.gms.games.logging.LogflowViewUiElementNode;
import com.google.android.gms.games.ui.LogflowEventListener;
import com.google.android.gms.games.ui.appcontent.AppContentUtils;
import com.google.android.gms.games.ui.appcontent.ExtendedAppContentAction;
import com.google.android.gms.games.ui.appcontent.ExtendedAppContentAnnotation;
import com.google.android.gms.games.ui.appcontent.ExtendedAppContentSection;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.games.ui.layouts:
//            AutoLayoutSlot

public final class OverflowAutoLayoutSlot extends AutoLayoutSlot
    implements android.support.v7.widget.PopupMenu.OnMenuItemClickListener, android.view.View.OnClickListener
{

    private final ArrayList mActions = new ArrayList();
    private final boolean mExplicitOverflow;
    private boolean mIsOverflow;
    private final ImageView mOverflowImage;
    private int mOverflowImageHideVis;

    public OverflowAutoLayoutSlot(Context context, String s, View view, ViewGroup viewgroup, ImageView imageview, TextView textview, TextView textview1, 
            ProgressBar progressbar, View view1, int i, ArrayList arraylist, ImageView imageview1)
    {
        super(context, s, view, viewgroup, imageview, textview, textview1, progressbar, view1, i, arraylist, 0);
        mOverflowImage = imageview1;
        mOverflowImageHideVis = getHideVisibility(mOverflowImage);
        mExplicitOverflow = "OVERFLOW_MENU".equals(mLayoutSlotName);
        mIsOverflow = false;
    }

    public final void onClick(View view)
    {
        PopupMenu popupmenu = new PopupMenu(view.getContext(), view);
        android.support.v7.internal.view.menu.MenuBuilder menubuilder = popupmenu.mMenu;
        int i = 0;
        for (int j = mActions.size(); i < j; i++)
        {
            String s = ((ExtendedAppContentAction)mActions.get(i)).getAction().getOverflowText();
            if (!TextUtils.isEmpty(s))
            {
                menubuilder.add(0, i, 0, s);
            }
        }

        popupmenu.mMenuItemClickListener = this;
        popupmenu.mPopup.show();
        if (mActions.size() > 0)
        {
            Object obj = ((ExtendedAppContentAction)mActions.get(0)).getSection();
            if (obj != null)
            {
                obj = ((ExtendedAppContentSection) (obj)).mLogListener;
                if (obj != null)
                {
                    ((LogflowEventListener) (obj)).logClick(view);
                }
            }
        }
    }

    public final boolean onMenuItemClick(MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        if (i >= 0 && i < mActions.size())
        {
            menuitem = (ExtendedAppContentAction)mActions.get(i);
            Object obj = menuitem.getSection();
            if (obj != null)
            {
                obj = ((ExtendedAppContentSection) (obj)).mLogListener;
                if (obj != null)
                {
                    ((LogflowEventListener) (obj)).logClick(AppContentUtils.getActionLogflowUiElementType(menuitem), mOverflowImage);
                }
            }
            menuitem.execute();
            return true;
        } else
        {
            return false;
        }
    }

    public final void reset()
    {
        super.reset();
        mActions.clear();
        mOverflowImage.setVisibility(mOverflowImageHideVis);
        mIsOverflow = false;
    }

    public final void setAction(ExtendedAppContentAction extendedappcontentaction)
    {
        Object obj;
        boolean flag;
        obj = extendedappcontentaction.getAction().getOverflowText();
        String s = extendedappcontentaction.mAnnotation.mLayoutSlot;
        flag = mLayoutSlotName.equals(s);
        if (!mExplicitOverflow && flag || !TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
        return;
_L2:
        mActions.add(extendedappcontentaction);
        if (mIsOverflow) goto _L1; else goto _L3
_L3:
        extendedappcontentaction = null;
        obj = null;
        if (!mExplicitOverflow) goto _L5; else goto _L4
_L4:
        mIsOverflow = true;
_L7:
        if (mIsOverflow)
        {
            resetAction();
            resetAnnotation();
            mOverflowImage.setVisibility(0);
            mOverflowImage.setOnClickListener(this);
            extendedappcontentaction = new LogflowViewUiElementNode(514, (byte)0);
            mOverflowImage.setTag(0x7f0d0061, extendedappcontentaction);
            return;
        }
        break; /* Loop/switch isn't completed */
_L5:
        Iterator iterator = mActions.iterator();
        do
        {
            ExtendedAppContentAction extendedappcontentaction1;
            do
            {
                obj = extendedappcontentaction;
                if (!iterator.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                extendedappcontentaction1 = (ExtendedAppContentAction)iterator.next();
                obj = extendedappcontentaction;
                if (flag)
                {
                    obj = extendedappcontentaction1;
                }
                extendedappcontentaction = ((ExtendedAppContentAction) (obj));
            } while (TextUtils.isEmpty(extendedappcontentaction1.getAction().getOverflowText()));
            extendedappcontentaction = ((ExtendedAppContentAction) (obj));
        } while (flag);
        mIsOverflow = true;
        if (true) goto _L7; else goto _L6
_L6:
        if (obj == null || getAction() != null) goto _L1; else goto _L8
_L8:
        super.setAction(((ExtendedAppContentAction) (obj)));
        return;
    }
}
