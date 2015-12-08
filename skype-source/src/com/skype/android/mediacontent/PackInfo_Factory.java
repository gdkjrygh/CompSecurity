// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;

import com.skype.MediaDocument;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.mediacontent:
//            PackInfo

public final class PackInfo_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider idAndPositionProvider;
    private final Provider mediaDocumentProvider;

    public PackInfo_Factory(Provider provider, Provider provider1)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        }
        idAndPositionProvider = provider;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            mediaDocumentProvider = provider1;
            return;
        }
    }

    public static Factory create(Provider provider, Provider provider1)
    {
        return new PackInfo_Factory(provider, provider1);
    }

    public final PackInfo get()
    {
        return new PackInfo(((Integer)idAndPositionProvider.get()).intValue(), ((Integer)idAndPositionProvider.get()).intValue(), (MediaDocument)mediaDocumentProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/mediacontent/PackInfo_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
