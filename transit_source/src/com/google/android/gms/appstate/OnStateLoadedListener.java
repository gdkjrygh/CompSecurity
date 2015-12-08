// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;


public interface OnStateLoadedListener
{

    public abstract void onStateConflict(int i, String s, byte abyte0[], byte abyte1[]);

    public abstract void onStateLoaded(int i, int j, byte abyte0[]);
}
