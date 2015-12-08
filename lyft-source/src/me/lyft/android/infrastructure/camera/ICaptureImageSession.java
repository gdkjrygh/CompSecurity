// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.camera;

import com.lyft.scoop.Screen;
import java.io.File;

public interface ICaptureImageSession
{

    public abstract void cancel();

    public abstract File getImage();

    public abstract void onGalleryResult(Screen screen, File file, File file1, Screen screen1);

    public abstract void onImageCaptured(File file);

    public abstract void retakePicture();

    public abstract void saveCroppedPicture(File file);

    public abstract void savePicture();
}
