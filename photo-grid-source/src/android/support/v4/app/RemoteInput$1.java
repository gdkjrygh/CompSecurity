// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            RemoteInput

final class patBase.RemoteInput
    implements patBase.RemoteInput.Factory
{

    public final RemoteInput build(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle)
    {
        return new RemoteInput(s, charsequence, acharsequence, flag, bundle);
    }

    public final volatile patBase.RemoteInput build(String s, CharSequence charsequence, CharSequence acharsequence[], boolean flag, Bundle bundle)
    {
        return build(s, charsequence, acharsequence, flag, bundle);
    }

    public final RemoteInput[] newArray(int i)
    {
        return new RemoteInput[i];
    }

    public final volatile patBase.RemoteInput[] newArray(int i)
    {
        return newArray(i);
    }

    patBase.RemoteInput()
    {
    }
}
