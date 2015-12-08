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
        super(s, bp(s), Collections.emptyList(), i);
    }

    private String bo(String s)
    {
        return q(getName(), s);
    }

    private static Collection bp(String s)
    {
        return Arrays.asList(new String[] {
            q(s, "permissionId"), q(s, "displayName"), q(s, "picture"), q(s, "isAuthenticatedUser"), q(s, "emailAddress")
        });
    }

    private static String q(String s, String s1)
    {
        return (new StringBuilder(s)).append(".").append(s1).toString();
    }

    protected boolean b(DataHolder dataholder, int i, int k)
    {
        return !dataholder.h(bo("permissionId"), i, k);
    }

    protected Object c(DataHolder dataholder, int i, int k)
    {
        return j(dataholder, i, k);
    }

    protected UserMetadata j(DataHolder dataholder, int i, int k)
    {
        String s = dataholder.c(bo("permissionId"), i, k);
        if (s != null)
        {
            String s1 = dataholder.c(bo("displayName"), i, k);
            String s2 = dataholder.c(bo("picture"), i, k);
            boolean flag = dataholder.d(bo("isAuthenticatedUser"), i, k);
            dataholder = dataholder.c(bo("emailAddress"), i, k);
            return new UserMetadata(s, s1, s2, Boolean.valueOf(flag).booleanValue(), dataholder);
        } else
        {
            return null;
        }
    }
}
