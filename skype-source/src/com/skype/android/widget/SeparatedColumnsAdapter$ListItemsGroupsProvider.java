// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import java.util.Map;

// Referenced classes of package com.skype.android.widget:
//            SeparatedColumnsAdapter

public static interface GroupInfo.c
{
    public static class GroupInfo
    {

        public final String a;
        public final int b;
        public final int c;

        public GroupInfo(int i, int j)
        {
            this(null, i, j);
        }

        public GroupInfo(String s, int i, int j)
        {
            a = s;
            b = i;
            c = j;
        }
    }


    public abstract android.support.v7.widget.roupInfo getAdapter();

    public abstract Map getGroupInfoMap();
}
