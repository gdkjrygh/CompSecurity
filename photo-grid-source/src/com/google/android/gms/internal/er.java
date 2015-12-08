// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            eo, dz

public final class er
    implements NativeCustomTemplateAd
{

    private final eo a;

    public er(eo eo1)
    {
        a = eo1;
    }

    public final List getAvailableAssetNames()
    {
        List list;
        try
        {
            list = a.getAvailableAssetNames();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get available asset names.", remoteexception);
            return null;
        }
        return list;
    }

    public final String getCustomTemplateId()
    {
        String s;
        try
        {
            s = a.getCustomTemplateId();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get custom template id.", remoteexception);
            return null;
        }
        return s;
    }

    public final com.google.android.gms.ads.formats.NativeAd.Image getImage(String s)
    {
        s = a.zzV(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        s = new dz(s);
        return s;
        s;
        zzb.zzb("Failed to get image.", s);
        return null;
    }

    public final CharSequence getText(String s)
    {
        try
        {
            s = a.zzU(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb.zzb("Failed to get string.", s);
            return null;
        }
        return s;
    }

    public final void performClick(String s)
    {
        try
        {
            a.performClick(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb.zzb("Failed to perform click.", s);
        }
    }

    public final void recordImpression()
    {
        try
        {
            a.recordImpression();
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to record impression.", remoteexception);
        }
    }
}
