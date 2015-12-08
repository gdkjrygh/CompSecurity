// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.layouts;

import android.os.Bundle;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.appcontent.AppContentAnnotation;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.appcontent.ExtendedAppContentAction;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.games.ui.layouts:
//            LayoutSlot

public final class ArrayLayoutSlot extends LayoutSlot
{

    private ArrayList mLayoutSlots;

    public ArrayLayoutSlot()
    {
        mLayoutSlots = new ArrayList();
    }

    public final void addLayoutSlot(int i, LayoutSlot layoutslot)
    {
        for (; mLayoutSlots.size() <= i; mLayoutSlots.add(null)) { }
        mLayoutSlots.set(i, layoutslot);
    }

    public final LayoutSlot getLayoutSlot(int i)
    {
        if (mLayoutSlots.size() <= i || i < 0)
        {
            GamesLog.d("ArrayLayoutSlot", "Slot index out of range, returning null.");
            return null;
        } else
        {
            return (LayoutSlot)mLayoutSlots.get(i);
        }
    }

    public final void resetAction()
    {
        Iterator iterator = mLayoutSlots.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            LayoutSlot layoutslot = (LayoutSlot)iterator.next();
            if (layoutslot != null)
            {
                layoutslot.resetAction();
            }
        } while (true);
    }

    public final void resetAnnotation()
    {
        Iterator iterator = mLayoutSlots.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            LayoutSlot layoutslot = (LayoutSlot)iterator.next();
            if (layoutslot != null)
            {
                layoutslot.resetAnnotation();
            }
        } while (true);
    }

    public final void setAction(ExtendedAppContentAction extendedappcontentaction)
    {
        LayoutSlot layoutslot;
        boolean flag;
        if (extendedappcontentaction != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        layoutslot = getLayoutSlot(extendedappcontentaction.getIndex());
        if (layoutslot != null)
        {
            layoutslot.setAction(extendedappcontentaction);
        }
    }

    public final void setAnnotation(AppContentAnnotation appcontentannotation)
    {
        super.setAnnotation(appcontentannotation);
        boolean flag = false;
        Object obj = appcontentannotation.getModifiers();
        int i = ((flag) ? 1 : 0);
        if (obj != null)
        {
            i = ((flag) ? 1 : 0);
            if (((Bundle) (obj)).containsKey("index"))
            {
                try
                {
                    i = Integer.parseInt(((Bundle) (obj)).getString("index"));
                }
                // Misplaced declaration of an exception variable
                catch (AppContentAnnotation appcontentannotation)
                {
                    GamesLog.d("ArrayLayoutSlot", "Failed to parse index extra, ignoring this annotation.");
                    return;
                }
            }
        }
        obj = getLayoutSlot(i);
        if (obj != null)
        {
            ((LayoutSlot) (obj)).setAnnotation(appcontentannotation);
        }
    }
}
