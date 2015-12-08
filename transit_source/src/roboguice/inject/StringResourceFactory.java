// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.content.res.Resources;

// Referenced classes of package roboguice.inject:
//            ResourceFactory

public class StringResourceFactory
    implements ResourceFactory
{

    protected Resources resources;

    public StringResourceFactory(Resources resources1)
    {
        resources = resources1;
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public String get(int i)
    {
        return resources.getString(i);
    }
}
