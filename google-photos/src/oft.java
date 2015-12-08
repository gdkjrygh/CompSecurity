// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import java.util.Set;

final class oft
    implements ofq
{

    oft(ofn ofn)
    {
    }

    public final boolean a(Intent intent)
    {
        intent = intent.getCategories();
        return intent != null && intent.contains("android.intent.category.INFO");
    }

    public final msm b(Intent intent)
    {
        return new msm(pwo.c);
    }
}
