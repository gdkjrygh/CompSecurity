// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            GridLayout

public static abstract class 
{

    abstract int getAlignmentValue(View view, int i, int j);

     getBounds()
    {
        return new it>(null);
    }

    abstract String getDebugString();

    abstract int getGravityOffset(View view, int i);

    int getSizeInCell(View view, int i, int j)
    {
        return i;
    }

    public String toString()
    {
        return (new StringBuilder("Alignment:")).append(getDebugString()).toString();
    }

    ()
    {
    }
}
