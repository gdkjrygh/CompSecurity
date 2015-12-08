// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.database.Cursor;
import android.graphics.Bitmap;
import com.kik.android.a;
import com.kik.cache.ad;
import com.kik.g.p;
import java.io.File;
import kik.a.e.s;

public interface ab
{

    public abstract Cursor a(String s);

    public abstract Cursor a(String s, String as[]);

    public abstract ad a();

    public abstract p a(String s, s s1, a a1);

    public abstract p a(kik.a.d.a.a a1, byte abyte0[], s s, a a2);

    public abstract void a(Bitmap bitmap, String s);

    public abstract boolean a(String s, String s1);

    public abstract ad b();

    public abstract p b(kik.a.d.a.a a1, byte abyte0[], s s, a a2);

    public abstract String b(String s);

    public abstract void b(Bitmap bitmap, String s);

    public abstract boolean c(String s);

    public abstract boolean d(String s);

    public abstract boolean e(String s);

    public abstract File f(String s);

    public abstract Bitmap g(String s);
}
