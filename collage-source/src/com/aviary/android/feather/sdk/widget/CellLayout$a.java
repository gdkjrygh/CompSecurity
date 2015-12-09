// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            CellLayout

public static final class 
    implements android.view.ontextMenuInfo
{

    View a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    final Rect g = new Rect();

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("Cell[view=");
        Object obj;
        if (a == null)
        {
            obj = "null";
        } else
        {
            obj = a.getClass();
        }
        return stringbuilder.append(obj).append(", x=").append(b).append("]").toString();
    }

    public ()
    {
    }
}
