// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.widget.ArrayAdapter;

// Referenced classes of package android.support.v7.app:
//            AlertController

private static class  extends ArrayAdapter
{

    public long getItemId(int i)
    {
        return (long)i;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public (Context context, int i, int j, CharSequence acharsequence[])
    {
        super(context, i, j, acharsequence);
    }
}
