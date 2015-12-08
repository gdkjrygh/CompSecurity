// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;

public final class ccq extends cbg
{

    public ccq()
    {
    }

    protected final cay a(cay cay, AssetManager assetmanager, Resources resources)
    {
        assetmanager = new cbj();
        assetmanager.d = cay;
        assetmanager.e = -1;
        assetmanager.g = 36F;
        assetmanager.k = Typeface.create("sans-serif", 0);
        assetmanager.m = true;
        assetmanager.q = resources.getColor(b.cx);
        assetmanager.n = 0.075F;
        return assetmanager.a();
    }
}
