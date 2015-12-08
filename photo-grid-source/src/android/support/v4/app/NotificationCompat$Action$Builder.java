// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            RemoteInput

public final class _cls00
{

    private final Bundle mExtras;
    private final int mIcon;
    private final PendingIntent mIntent;
    private ArrayList mRemoteInputs;
    private final CharSequence mTitle;

    public final _cls00 addExtras(Bundle bundle)
    {
        if (bundle != null)
        {
            mExtras.putAll(bundle);
        }
        return this;
    }

    public final mExtras addRemoteInput(RemoteInput remoteinput)
    {
        if (mRemoteInputs == null)
        {
            mRemoteInputs = new ArrayList();
        }
        mRemoteInputs.add(remoteinput);
        return this;
    }

    public final mRemoteInputs build()
    {
        RemoteInput aremoteinput[];
        if (mRemoteInputs != null)
        {
            aremoteinput = (RemoteInput[])mRemoteInputs.toArray(new RemoteInput[mRemoteInputs.size()]);
        } else
        {
            aremoteinput = null;
        }
        return new mRemoteInputs(mIcon, mTitle, mIntent, mExtras, aremoteinput, null);
    }

    public final  extend( )
    {
        .extend(this);
        return this;
    }

    public final Bundle getExtras()
    {
        return mExtras;
    }

    public (int i, CharSequence charsequence, PendingIntent pendingintent)
    {
        this(i, charsequence, pendingintent, new Bundle());
    }

    private <init>(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle)
    {
        mIcon = i;
        mTitle = arSequenceLength(charsequence);
        mIntent = pendingintent;
        mExtras = bundle;
    }

    public mExtras(mExtras mextras)
    {
        this(mextras.<init>, mextras.<init>, mextras.tent, new Bundle(_mth00(mextras)));
    }
}
