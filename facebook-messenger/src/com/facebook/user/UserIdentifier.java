// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.content.res.Resources;
import android.os.Parcelable;

// Referenced classes of package com.facebook.user:
//            UserIdentifierKey, s

public abstract class UserIdentifier
    implements Parcelable
{

    public UserIdentifier()
    {
    }

    public abstract String a(Resources resources);

    public abstract UserIdentifierKey c();

    public abstract String d();

    public abstract s e();

    public String toString()
    {
        return d();
    }
}
