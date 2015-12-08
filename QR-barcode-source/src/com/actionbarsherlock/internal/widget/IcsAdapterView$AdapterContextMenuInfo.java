// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.view.View;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            IcsAdapterView

public static class id
    implements android.view.w.AdapterContextMenuInfo
{

    public long id;
    public int position;
    public View targetView;

    public Q(View view, int i, long l)
    {
        targetView = view;
        position = i;
        id = l;
    }
}
