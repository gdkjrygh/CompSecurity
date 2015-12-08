// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a;

import android.content.Intent;
import android.os.Bundle;

public final class a
{

    public a()
    {
    }

    public static Bundle a(Intent intent)
    {
        return intent.getBundleExtra("al_applink_data");
    }
}
