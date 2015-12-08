// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.logging;


public interface ILogger
{

    public transient abstract void d(String s, Object aobj[]);

    public transient abstract void d(Throwable throwable, String s, Object aobj[]);

    public transient abstract void e(String s, Object aobj[]);

    public transient abstract void e(Throwable throwable, String s, Object aobj[]);

    public transient abstract void i(String s, Object aobj[]);

    public transient abstract void i(Throwable throwable, String s, Object aobj[]);

    public transient abstract void v(String s, Object aobj[]);

    public transient abstract void v(Throwable throwable, String s, Object aobj[]);

    public transient abstract void w(String s, Object aobj[]);

    public transient abstract void w(Throwable throwable, String s, Object aobj[]);
}
