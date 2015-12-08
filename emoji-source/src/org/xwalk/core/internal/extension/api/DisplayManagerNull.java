// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api;

import android.view.Display;

// Referenced classes of package org.xwalk.core.internal.extension.api:
//            XWalkDisplayManager

public class DisplayManagerNull extends XWalkDisplayManager
{

    private static final Display NO_DISPLAYS[] = new Display[0];

    public DisplayManagerNull()
    {
    }

    public Display getDisplay(int i)
    {
        return null;
    }

    public Display[] getDisplays()
    {
        return NO_DISPLAYS;
    }

    public Display[] getPresentationDisplays()
    {
        return NO_DISPLAYS;
    }

}
