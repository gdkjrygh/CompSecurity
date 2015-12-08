// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.upload;

import android.app.Application;
import com.google.android.apps.wallet.config.cloudconfig.CloudConfigurationManager;
import com.google.android.apps.wallet.wobs.upload.api.LocalImageUriResolver;
import com.google.android.libraries.uploader.service.lib.service.Uploader;
import java.io.File;

// Referenced classes of package com.google.android.apps.wallet.wobs.upload:
//            ImageUploadManager

public class UploadModule
{

    public UploadModule()
    {
    }

    static File getApplicationCacheDirectory(Application application)
    {
        return application.getCacheDir().getAbsoluteFile();
    }

    static String getAuthScope(CloudConfigurationManager cloudconfigurationmanager)
    {
        return cloudconfigurationmanager.getCloudConfig().getOauthScope();
    }

    static LocalImageUriResolver getLocalImageUriUtil(ImageUploadManager imageuploadmanager)
    {
        return imageuploadmanager;
    }

    static String getScottyUrl(CloudConfigurationManager cloudconfigurationmanager)
    {
        return cloudconfigurationmanager.getCloudConfig().getScottyImageUploadUrl();
    }

    static Uploader getUploader(Application application)
    {
        return new Uploader(application);
    }
}
