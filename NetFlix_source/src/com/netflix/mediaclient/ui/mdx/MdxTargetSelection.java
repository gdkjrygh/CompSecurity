// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxTarget

public final class MdxTargetSelection
{

    private final String TAG = "nf_mdx";
    private MdxTarget mdxTargets[];
    private MdxTarget selectedTarget;

    public MdxTargetSelection(Pair apair[], String s)
    {
        mdxTargets = new MdxTarget[apair.length + 1];
        mdxTargets[0] = MdxTarget.createLocalTarget();
        for (int i = 0; i < apair.length; i++)
        {
            mdxTargets[i + 1] = MdxTarget.createRemoteTarget(apair[i]);
            if (mdxTargets[i + 1].getUUID().equals(s))
            {
                selectedTarget = mdxTargets[i + 1];
            }
        }

        if (selectedTarget == null)
        {
            selectedTarget = mdxTargets[0];
        }
    }

    private static List toAdapterList(Context context, MdxTarget amdxtarget[])
    {
        ArrayList arraylist = new ArrayList();
        if (amdxtarget != null)
        {
            int j = amdxtarget.length;
            int i = 0;
            while (i < j) 
            {
                MdxTarget mdxtarget = amdxtarget[i];
                if (mdxtarget.isLocal())
                {
                    arraylist.add(context.getString(0x7f0c017f));
                } else
                {
                    arraylist.add(mdxtarget.getFriendlyName());
                }
                i++;
            }
        }
        return arraylist;
    }

    public int getDevicePositionByUUID(String s)
    {
        if (s == null)
        {
            Log.e("nf_mdx", "getDevicePositionByUUID:: Given UUID is null!");
            return 0;
        }
        for (int i = 0; i < mdxTargets.length; i++)
        {
            if (s.equals(mdxTargets[i].getUUID()))
            {
                Log.d("nf_mdx", (new StringBuilder()).append("getDevicePositionByUUID:: given device found on position ").append(i).toString());
                return i;
            }
        }

        Log.e("nf_mdx", "Selected device not found!");
        return 0;
    }

    public int getLocalDevicePosition()
    {
        for (int i = 0; i < mdxTargets.length; i++)
        {
            if (mdxTargets[i].isLocal())
            {
                Log.d("nf_mdx", (new StringBuilder()).append("Local device found on position ").append(i).toString());
                return i;
            }
        }

        Log.e("nf_mdx", "We do NOT have local device from Mobile UI");
        return 0;
    }

    public MdxTarget[] getMdxTargets()
    {
        return mdxTargets;
    }

    public int getSelectedDevicePosition()
    {
        for (int i = 0; i < mdxTargets.length; i++)
        {
            if (mdxTargets[i] == selectedTarget)
            {
                Log.d("nf_mdx", (new StringBuilder()).append("Selected device found on position ").append(i).toString());
                return i;
            }
        }

        Log.e("nf_mdx", "Selected device not found!");
        return 0;
    }

    public MdxTarget getSelectedTarget()
    {
        return selectedTarget;
    }

    public List getTargets(Context context)
    {
        if (mdxTargets == null)
        {
            Log.e("nf_mdx", "We should never be here. No targets!");
        }
        return toAdapterList(context, mdxTargets);
    }

    public MdxTarget setTarget(int i)
    {
        if (Log.isLoggable("nf_mdx", 3))
        {
            Log.d("nf_mdx", (new StringBuilder()).append("User selected as target on position ").append(i).toString());
        }
        if (mdxTargets != null && mdxTargets.length > i)
        {
            if (Log.isLoggable("nf_mdx", 3))
            {
                Log.d("nf_mdx", (new StringBuilder()).append("User selected as target ").append(mdxTargets[i]).toString());
            }
            selectedTarget = mdxTargets[i];
            return selectedTarget;
        } else
        {
            Log.e("nf_mdx", "Target NOT found! This should NOT happen!");
            return null;
        }
    }
}
