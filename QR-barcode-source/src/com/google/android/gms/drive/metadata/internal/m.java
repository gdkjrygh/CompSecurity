// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.UserMetadata;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            j

public class m extends j
{

    public m(String s, int i)
    {
        super(s, bm(s), Collections.emptyList(), i);
    }

    private String bl(String s)
    {
        return r(getName(), s);
    }

    private static Collection bm(String s)
    {
        return Arrays.asList(new String[] {
            r(s, "permissionId"), r(s, "displayName"), r(s, "picture"), r(s, "isAuthenticatedUser"), r(s, "emailAddress")
        });
    }

    private static String r(String s, String s1)
    {
        return (new StringBuilder(s)).append(".").append(s1).toString();
    }

    protected boolean b(DataHolder dataholder, int i, int k)
    {
        return !dataholder.h(bl("permissionId"), i, k);
    }

    protected Object c(DataHolder dataholder, int i, int k)
    {
        return j(dataholder, i, k);
    }

    protected UserMetadata j(DataHolder dataholder, int i, int k)
    {
        String s = dataholder.c(bl("permissionId"), i, k);
        if (s != null)
        {
            String s1 = dataholder.c(bl("displayName"), i, k);
            String s2 = dataholder.c(bl("picture"), i, k);
            boolean flag = dataholder.d(bl("isAuthenticatedUser"), i, k);
            dataholder = dataholder.c(bl("emailAddress"), i, k);
            return new UserMetadata(s, s1, s2, Boolean.valueOf(flag).booleanValue(), dataholder);
        } else
        {
            return null;
        }
    }
}
