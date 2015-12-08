// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dxc
    implements fpx
{

    dxc()
    {
    }

    public final fpr a(byte abyte0[])
    {
        abyte0 = (dxg)mve.a(new dxg(), abyte0);
        switch (((dxg) (abyte0)).a)
        {
        default:
            throw new IllegalArgumentException("Cannot deserialize an unknown PhotosAssistantJob");

        case 1: // '\001'
            abyte0 = ((dxg) (abyte0)).b;
            break;
        }
        abyte0 = (dxf)mve.a(new dxf(), abyte0);
        return new dxa(new duj(((dxf) (abyte0)).a.intValue(), ((dxf) (abyte0)).b, ((dxf) (abyte0)).c));
    }

    public final Object a()
    {
        return "PHOTOS_ASSISTANT_JOB_SUBSYSTEM";
    }

    public final byte[] a(fpr fpr)
    {
        if (fpr instanceof dxb)
        {
            fpr = (dxb)fpr;
            dxg dxg1 = new dxg();
            dxg1.a = 1;
            dxg1.b = fpr.c();
            return qlw.a(dxg1);
        } else
        {
            throw new IllegalArgumentException("Cannot serialize a non PhotosAssistantJob by PhotosAssistantJobSubsystem");
        }
    }
}
