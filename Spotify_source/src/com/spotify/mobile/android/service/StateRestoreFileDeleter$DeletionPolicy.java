// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import java.util.Locale;

public abstract class <init> extends Enum
{

    public static final b a;
    public static final b b;
    private static b c;
    private static final b d[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/spotify/mobile/android/service/StateRestoreFileDeleter$DeletionPolicy, s);
    }

    public static <init>[] values()
    {
        return (<init>[])d.clone();
    }

    abstract boolean a(String s);

    public String toString()
    {
        return super.toString().toLowerCase(Locale.US);
    }

    static 
    {
        a = new StateRestoreFileDeleter.DeletionPolicy("BASIC") {

            final boolean a(String s)
            {
                return s.equals("state.restore");
            }

        };
        c = new StateRestoreFileDeleter.DeletionPolicy("INTERMEDIATE") {

            public final boolean a(String s)
            {
                return !s.equals("orbit.settings") && !s.equals("offline2") && !s.equals("offline_lists.bnk");
            }

        };
        b = new StateRestoreFileDeleter.DeletionPolicy("EXTREME") {

            final boolean a(String s)
            {
                return true;
            }

        };
        d = (new d[] {
            a, c, b
        });
    }

    private _cls3(String s, int i)
    {
        super(s, i);
    }

    _cls3(String s, int i, byte byte0)
    {
        this(s, i);
    }
}
