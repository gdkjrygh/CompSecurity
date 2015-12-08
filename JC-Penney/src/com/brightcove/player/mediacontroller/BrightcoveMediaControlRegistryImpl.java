// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
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

    private static final String a = com/brightcove/player/mediacontroller/BrightcoveMediaControlRegistryImpl.getSimpleName();
    private final SparseArray b = new SparseArray();
    private final SparseArray c = new SparseArray();

    public BrightcoveMediaControlRegistryImpl()
    {
    }

    public void clear()
    {
        b.clear();
        c.clear();
    }

    public ButtonController getButtonController(int i)
    {
        return (ButtonController)c.get(i);
    }

    public List getButtonControllers()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < c.size(); i++)
        {
            arraylist.add(c.valueAt(i));
        }

        return arraylist;
    }

    public int getId(View view)
    {
        for (int i = 0; i < b.size(); i++)
        {
            if (view == b.valueAt(i))
            {
                return b.keyAt(i);
            }
        }

        return -1;
    }

    public int getManagedState(int i)
    {
        if (c.get(i) != null)
        {
            return ((ButtonController)c.get(i)).getManagedState();
        } else
        {
            return -1;
        }
    }

    public List getStateList(int i)
    {
        if (c.get(i) != null)
        {
            return ((ButtonController)c.get(i)).getStateList();
        } else
        {
            return null;
        }
    }

    public View getView(int i)
    {
        return (View)b.get(i);
    }

    public View getView(String s)
    {
        if (s != null)
        {
            for (int i = 0; i < b.size(); i++)
            {
                View view = (View)b.valueAt(i);
                int j = view.getId();
                String s1 = view.getContext().getResources().getResourceEntryName(j);
                Log.d(a, String.format("Checking for a match between the view (%1$s) and the candidate tag: %2$s.", new Object[] {
                    view, s
                }));
                if (s1.equals(s.toLowerCase(Locale.US)))
                {
                    return view;
                }
            }

        } else
        {
            Log.e(a, "Unexpected null resource tag!");
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
                b.put(j, view);
            }
        }
    }

    public void register(ButtonController buttoncontroller)
    {
        int i = buttoncontroller.getId();
        c.append(i, buttoncontroller);
        b.put(i, buttoncontroller.getButton());
    }

}
