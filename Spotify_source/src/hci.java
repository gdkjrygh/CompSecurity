// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.OutputStream;
import okio.ByteString;

public interface hci
    extends hcv
{

    public abstract long a(hcw hcw);

    public abstract hci a(byte abyte0[], int k);

    public abstract hch b();

    public abstract hci b(String s);

    public abstract hci b(ByteString bytestring);

    public abstract hci b(byte abyte0[]);

    public abstract OutputStream c();

    public abstract hci d();

    public abstract hci f(int k);

    public abstract hci g(int k);

    public abstract hci h(int k);

    public abstract hci i(long l);

    public abstract hci j(long l);

    public abstract hci t();
}
