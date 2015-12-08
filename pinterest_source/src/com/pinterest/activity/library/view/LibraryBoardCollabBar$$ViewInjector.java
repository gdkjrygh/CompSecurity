// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.view;

import android.widget.LinearLayout;

// Referenced classes of package com.pinterest.activity.library.view:
//            LibraryBoardCollabBar

public class 
{

    public static void inject(butterknife.CollabBar collabbar, LibraryBoardCollabBar libraryboardcollabbar, Object obj)
    {
        libraryboardcollabbar._collabWrapper = (LinearLayout)collabbar._collabWrapper(obj, 0x7f0f02fa, "field '_collabWrapper'");
    }

    public static void reset(LibraryBoardCollabBar libraryboardcollabbar)
    {
        libraryboardcollabbar._collabWrapper = null;
    }

    public ()
    {
    }
}
