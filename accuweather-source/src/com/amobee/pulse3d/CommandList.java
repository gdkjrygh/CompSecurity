// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.util.HashMap;
import java.util.LinkedList;

// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DGLRenderer

class CommandList
{

    private LinkedList commands_;
    private boolean enabled_;
    private HashMap name_map_;
    private float priority_;

    public CommandList(float f, Pulse3DGLRenderer pulse3dglrenderer)
    {
        priority_ = f;
        enabled_ = true;
        commands_ = new LinkedList();
        name_map_ = new HashMap();
    }

    static boolean Compare(CommandList commandlist, CommandList commandlist1)
    {
        return commandlist.priority_ > commandlist1.priority_;
    }

    public LinkedList commands()
    {
        return commands_;
    }

    public void disable()
    {
        enabled_ = false;
    }

    public void enable()
    {
        enabled_ = true;
    }

    public boolean isEnabled()
    {
        return enabled_;
    }

    public HashMap name_map()
    {
        return name_map_;
    }

    public float priority()
    {
        return priority_;
    }
}
