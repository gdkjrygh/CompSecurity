// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;


// Referenced classes of package org.spongycastle.crypto.params:
//            DESParameters

public class DESedeParameters extends DESParameters
{

    public static boolean b(byte abyte0[], int i)
    {
        boolean flag1 = false;
        int j = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j < i)
                {
                    if (!DESParameters.a(abyte0, j))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j += 8;
        } while (true);
    }
}
