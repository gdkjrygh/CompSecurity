// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Messenger;

abstract class e
{

    public static boolean a(Messenger messenger)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (messenger != null)
        {
            try
            {
                messenger = messenger.getBinder();
            }
            // Misplaced declaration of an exception variable
            catch (Messenger messenger)
            {
                return false;
            }
            flag = flag1;
            if (messenger != null)
            {
                flag = true;
            }
        }
        return flag;
    }
}
