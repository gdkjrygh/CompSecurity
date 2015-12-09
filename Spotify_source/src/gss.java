// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.Closeable;
import java.util.List;

public interface gss
    extends Closeable
{

    public abstract void a();

    public abstract void a(int i, long l);

    public abstract void a(int i, ErrorCode errorcode);

    public abstract void a(int i, ErrorCode errorcode, byte abyte0[]);

    public abstract void a(gtp gtp);

    public abstract void a(boolean flag, int i, int j);

    public abstract void a(boolean flag, int i, hch hch, int j);

    public abstract void a(boolean flag, int i, List list);

    public abstract void b();

    public abstract void b(gtp gtp);

    public abstract int c();
}
