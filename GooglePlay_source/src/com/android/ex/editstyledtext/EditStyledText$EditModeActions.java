// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.editstyledtext;

import android.util.Log;

// Referenced classes of package com.android.ex.editstyledtext:
//            EditStyledText

public final class EditModeActionBase
{
    public final class EditModeActionBase
    {

        Object mParams[];
    }


    private int mMode;

    private static EditModeActionBase getAction(int i)
    {
        throw new NullPointerException();
    }

    public final boolean doNext(int i)
    {
        Log.d("EditModeActions", (new StringBuilder("--- do the next action: ")).append(i).append(",0").toString());
        if (getAction(i) == null)
        {
            Log.e("EditModeActions", "--- invalid action error.");
        }
        return false;
    }

    public final void onAction(int i)
    {
        getAction(i).mParams = null;
        throw new NullPointerException();
    }
}
