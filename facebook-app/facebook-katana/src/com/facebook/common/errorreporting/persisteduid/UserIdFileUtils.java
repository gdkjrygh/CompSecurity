// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.errorreporting.persisteduid;

import android.content.Context;
import java.io.File;

class UserIdFileUtils
{

    UserIdFileUtils()
    {
    }

    static File a(Context context)
    {
        return new File(b(context), "UID");
    }

    static File b(Context context)
    {
        return context.getDir("persisteduid", 0);
    }
}
