// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.gallery;

import android.content.Context;
import com.lyft.scoop.Screen;
import java.io.File;

public interface IGalleryService
{

    public abstract void pickFileFromGallery(Context context, Screen screen, Screen screen1, File file);
}
