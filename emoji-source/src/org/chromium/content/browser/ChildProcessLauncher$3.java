// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import java.util.Map;
import org.chromium.content.common.SurfaceWrapper;

// Referenced classes of package org.chromium.content.browser:
//            ChildProcessLauncher

static final class ub extends org.chromium.content.common.tub
{

    static final boolean $assertionsDisabled;
    final int val$callbackType;
    final int val$childProcessId;

    public void establishSurfacePeer(int i, Surface surface, int j, int k)
    {
        if (val$callbackType != 1)
        {
            Log.e("ChildProcessLauncher", "Illegal callback for non-GPU process.");
            return;
        } else
        {
            ChildProcessLauncher.access$400(i, surface, j, k);
            return;
        }
    }

    public SurfaceWrapper getSurfaceTextureSurface(int i, int j)
    {
        if (val$callbackType != 2)
        {
            Log.e("ChildProcessLauncher", "Illegal callback for non-renderer process.");
            return null;
        }
        if (j != val$childProcessId)
        {
            Log.e("ChildProcessLauncher", "Illegal secondaryId for renderer process.");
            return null;
        }
        Object obj = new Pair(Integer.valueOf(i), Integer.valueOf(j));
        obj = (Surface)ChildProcessLauncher.access$600().remove(obj);
        if (obj == null)
        {
            Log.e("ChildProcessLauncher", "Invalid Id for surface texture.");
            return null;
        }
        if (!$assertionsDisabled && !((Surface) (obj)).isValid())
        {
            throw new AssertionError();
        } else
        {
            return new SurfaceWrapper(((Surface) (obj)));
        }
    }

    public SurfaceWrapper getViewSurface(int i)
    {
        if (val$callbackType != 1)
        {
            Log.e("ChildProcessLauncher", "Illegal callback for non-GPU process.");
            return null;
        }
        Surface surface = (Surface)ChildProcessLauncher.access$500().get(Integer.valueOf(i));
        if (surface == null)
        {
            Log.e("ChildProcessLauncher", "Invalid surfaceId.");
            return null;
        }
        if (!$assertionsDisabled && !surface.isValid())
        {
            throw new AssertionError();
        } else
        {
            return new SurfaceWrapper(surface);
        }
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/ChildProcessLauncher.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    ub(int i, int j)
    {
        val$callbackType = i;
        val$childProcessId = j;
        super();
    }
}
