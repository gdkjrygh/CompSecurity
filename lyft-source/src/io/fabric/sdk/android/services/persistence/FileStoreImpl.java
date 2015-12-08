// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.persistence;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import java.io.File;

public class FileStoreImpl
{

    private final Context a;
    private final String b;
    private final String c;

    public FileStoreImpl(Kit kit)
    {
        if (kit.C() == null)
        {
            throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
        } else
        {
            a = kit.C();
            b = kit.E();
            c = (new StringBuilder()).append("Android/").append(a.getPackageName()).toString();
            return;
        }
    }

    public File a()
    {
        return a(a.getFilesDir());
    }

    File a(File file)
    {
        if (file != null)
        {
            if (file.exists() || file.mkdirs())
            {
                return file;
            }
            Fabric.g().c("Fabric", "Couldn't create file");
        } else
        {
            Fabric.g().a("Fabric", "Null File");
        }
        return null;
    }
}
