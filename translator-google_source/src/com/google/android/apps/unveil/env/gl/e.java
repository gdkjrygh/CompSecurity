// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env.gl;


public final class e
{

    final float a[] = {
        1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 
        1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F
    };

    public e()
    {
    }

    final void a(int i, int j, float f)
    {
        a[(i << 2) + j] = f;
    }
}
