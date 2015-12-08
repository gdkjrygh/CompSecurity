// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            CommandBase, RenderResource, Pulse3DView

class CommandBindResourceP3D extends CommandBase
{

    static int argTypes[] = {
        2
    };
    int handle;
    RenderResource o;

    CommandBindResourceP3D()
    {
        handle = 0;
        o = null;
    }

    void execute()
    {
        if (handle == 0)
        {
            Log.d(TAG, "Warning, BindResource command with handle 0");
        }
        if (o.handle == 0)
        {
            Log.d(TAG, "Warning, BindResource command with handle 0");
        }
        o.Bind();
    }

    void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview)
    {
        handle = aglarg[0].intVal[0];
        if (handle == 0)
        {
            Log.d(TAG, "Warning, BindResource command with handle 0");
        }
        aglarg = ((CmdParserBase.GlArg []) (pulse3dview.resources.get(handle)));
        if (aglarg instanceof RenderResource)
        {
            o = (RenderResource)aglarg;
            return;
        } else
        {
            notImplementedArgs(o.toString());
            return;
        }
    }

}
