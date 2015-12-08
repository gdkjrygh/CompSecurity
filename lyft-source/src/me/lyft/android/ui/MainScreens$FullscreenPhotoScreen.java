// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;


// Referenced classes of package me.lyft.android.ui:
//            MainScreens

public class subtitle extends MainScreens
{

    final String photoUrl;
    final String subtitle;
    final String title;

    public String getPhotoUrl()
    {
        return photoUrl;
    }

    public String getSubtitle()
    {
        return subtitle;
    }

    public String getTitle()
    {
        return title;
    }

    public (String s)
    {
        this(s, null, null);
    }

    public <init>(String s, String s1)
    {
        this(s, s1, null);
    }

    public <init>(String s, String s1, String s2)
    {
        photoUrl = s;
        title = s1;
        subtitle = s2;
    }
}
