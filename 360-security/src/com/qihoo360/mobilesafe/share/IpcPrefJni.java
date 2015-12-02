// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.share;


class IpcPrefJni
{

    IpcPrefJni()
    {
    }

    static native void prefApply(int i, byte abyte0[]);

    static native void prefClean();

    static native void prefClose(int i);

    static native void prefCloseAll();

    static native boolean prefCommit(int i, byte abyte0[]);

    static native boolean prefContains(int i, String s);

    static native byte[] prefGet(int i, String s);

    static native byte[] prefGetAll(int i);

    static native boolean prefInit(String s);

    static native int prefOpen(String s, int i);

    static native boolean prefReload(int i, String s);
}
