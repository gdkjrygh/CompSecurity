// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.profile;

import com.squareup.picasso.RequestCreator;
import java.io.File;

public interface IProfilePhotoLoader
{

    public abstract boolean hasCacheFile();

    public abstract RequestCreator load();

    public abstract RequestCreator loadPreview();

    public abstract void usePhotoFilePreview(File file);
}
