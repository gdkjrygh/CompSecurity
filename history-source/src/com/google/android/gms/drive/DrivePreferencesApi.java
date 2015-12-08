// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.drive:
//            FileUploadPreferences

public interface DrivePreferencesApi
{
    public static interface FileUploadPreferencesResult
        extends Result
    {

        public abstract FileUploadPreferences getFileUploadPreferences();
    }


    public abstract PendingResult getFileUploadPreferences(GoogleApiClient googleapiclient);

    public abstract PendingResult setFileUploadPreferences(GoogleApiClient googleapiclient, FileUploadPreferences fileuploadpreferences);
}
