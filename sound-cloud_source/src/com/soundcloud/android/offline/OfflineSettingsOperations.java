// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;


// Referenced classes of package com.soundcloud.android.offline:
//            OfflineSettingsStorage

public class OfflineSettingsOperations
{

    private final OfflineSettingsStorage offlineSettingsStorage;

    public OfflineSettingsOperations(OfflineSettingsStorage offlinesettingsstorage)
    {
        offlineSettingsStorage = offlinesettingsstorage;
    }

    public boolean hasOfflineContent()
    {
        return offlineSettingsStorage.hasOfflineContent();
    }

    public void setHasOfflineContent(boolean flag)
    {
        offlineSettingsStorage.setHasOfflineContent(flag);
    }
}
