// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.a;

import com.kik.scan.GroupKikCode;

// Referenced classes of package kik.android.scan.a:
//            c

private static final class a extends c
{

    GroupKikCode a;

    public final byte[] a()
    {
        byte abyte0[] = null;
        if (a != null)
        {
            abyte0 = a.encode();
        }
        byte abyte1[] = abyte0;
        if (abyte0 == null)
        {
            abyte1 = new byte[0];
        }
        return abyte1;
    }

    public final byte[] d()
    {
        if (a == null)
        {
            return null;
        } else
        {
            return a.getInviteCode();
        }
    }

    de(GroupKikCode groupkikcode)
    {
        a = groupkikcode;
    }
}
