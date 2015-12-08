// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.persistence;

import android.content.Context;
import android.os.Environment;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import java.io.File;

// Referenced classes of package io.fabric.sdk.android.services.persistence:
//            FileStore

public class FileStoreImpl
    implements FileStore
{

    private final String contentPath;
    private final Context context;
    private final String legacySupport;

    public FileStoreImpl(Kit kit)
    {
        if (kit.getContext() == null)
        {
            throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
        } else
        {
            context = kit.getContext();
            contentPath = kit.getPath();
            legacySupport = (new StringBuilder()).append("Android/").append(context.getPackageName()).toString();
            return;
        }
    }

    public File getCacheDir()
    {
        return prepare(context.getCacheDir());
    }

    public File getExternalCacheDir()
    {
        File file = null;
        if (isExternalStorageAvailable())
        {
            if (android.os.Build.VERSION.SDK_INT >= 8)
            {
                file = context.getExternalCacheDir();
            } else
            {
                file = new File(Environment.getExternalStorageDirectory(), (new StringBuilder()).append(legacySupport).append("/cache/").append(contentPath).toString());
            }
        }
        return prepare(file);
    }

    public File getExternalFilesDir()
    {
        File file = null;
        if (isExternalStorageAvailable())
        {
            if (android.os.Build.VERSION.SDK_INT >= 8)
            {
                file = context.getExternalFilesDir(null);
            } else
            {
                file = new File(Environment.getExternalStorageDirectory(), (new StringBuilder()).append(legacySupport).append("/files/").append(contentPath).toString());
            }
        }
        return prepare(file);
    }

    public File getFilesDir()
    {
        return prepare(context.getFilesDir());
    }

    boolean isExternalStorageAvailable()
    {
        if (!"mounted".equals(Environment.getExternalStorageState()))
        {
            Fabric.getLogger().w("Fabric", "External Storage is not mounted and/or writable\nHave you declared android.permission.WRITE_EXTERNAL_STORAGE in the manifest?");
            return false;
        } else
        {
            return true;
        }
    }

    File prepare(File file)
    {
        if (file != null)
        {
            if (file.exists() || file.mkdirs())
            {
                return file;
            }
            Fabric.getLogger().w("Fabric", "Couldn't create file");
        } else
        {
            Fabric.getLogger().d("Fabric", "Null File");
        }
        return null;
    }
}
