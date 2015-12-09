// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.HeadersMode;
import java.util.List;
import okio.ByteString;

public interface gsr
{

    public abstract void a(int i);

    public abstract void a(int i, long l);

    public abstract void a(int i, ErrorCode errorcode);

    public abstract void a(int i, ByteString bytestring);

    public abstract void a(boolean flag, int i, int j);

    public abstract void a(boolean flag, int i, hcj hcj, int j);

    public abstract void a(boolean flag, gtp gtp);

    public abstract void a(boolean flag, boolean flag1, int i, List list, HeadersMode headersmode);
}
