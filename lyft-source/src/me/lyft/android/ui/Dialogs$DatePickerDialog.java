// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;


// Referenced classes of package me.lyft.android.ui:
//            Dialogs

public class day extends Dialogs
{

    public int day;
    public boolean disablePastDate;
    public int month;
    public int year;

    public void setDisablePastDate(boolean flag)
    {
        disablePastDate = flag;
    }

    public (int i, int j, int k)
    {
        year = i;
        month = j;
        day = k;
    }
}
