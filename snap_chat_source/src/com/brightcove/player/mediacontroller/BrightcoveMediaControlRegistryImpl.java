// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.brightcove.player.mediacontroller.buttons.ButtonController;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveMediaControlRegistry

public class BrightcoveMediaControlRegistryImpl
    implements BrightcoveMediaControlRegistry
{

    private final SparseArray a = new SparseArray();
    private final SparseArray b = new SparseArray();

    public BrightcoveMediaControlRegistryImpl()
    {
    }

    public void clear()
    {
        a.clear();
        b.clear();
    }

    public ButtonController getButtonController(int i)
    {
        return (ButtonController)b.get(i);
    }

    public List getButtonControllers()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < b.size(); i++)
        {
            arraylist.add(b.valueAt(i));
        }

        return arraylist;
    }

    public int getId(View view)
    {
        for (int i = 0; i < a.size(); i++)
        {
            if (view == a.valueAt(i))
            {
                return a.keyAt(i);
            }
        }

        return -1;
    }

    public int getManagedState(int i)
    {
        if (b.get(i) != null)
        {
            return ((ButtonController)b.get(i)).getManagedState();
        } else
        {
            return -1;
        }
    }

    public List getStateList(int i)
    {
        if (b.get(i) != null)
        {
            return ((ButtonController)b.get(i)).getStateList();
        } else
        {
            return null;
        }
    }

    public View getView(int i)
    {
        return (View)a.get(i);
    }

    public View getView(String s)
    {
        if (s != null)
        {
            for (int i = 0; i < a.size(); i++)
            {
                View view = (View)a.valueAt(i);
                int j = view.getId();
                String s1 = view.getContext().getResources().getResourceEntryName(j);
                String.format("Checking for a match between the view (%1$s) and the candidate tag: %2$s.", new Object[] {
                    view, s
                });
                if (s1.equals(s.toLowerCase(Locale.US)))
                {
                    return view;
                }
            }

        }
        return null;
    }

    public void register(View view)
    {
        if (view != null)
        {
            if (view instanceof ViewGroup)
            {
                view = (ViewGroup)view;
                for (int i = 0; i < view.getChildCount(); i++)
                {
                    register(view.getChildAt(i));
                }

            } else
            {
                int j = view.getId();
                a.put(j, view);
            }
        }
    }

    public void register(ButtonController buttoncontroller)
    {
        int i = buttoncontroller.getId();
        b.append(i, buttoncontroller);
        a.put(i, buttoncontroller.getButton());
    }

    static 
    {
        com/brightcove/player/mediacontroller/BrightcoveMediaControlRegistryImpl.getSimpleName();
    }
}
