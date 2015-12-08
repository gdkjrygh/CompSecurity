// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.profile;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.RequestCreator;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import me.lyft.android.IUserSession;
import me.lyft.android.application.profile.IProfilePhotoFileRecipient;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.managers.ImageLoader;

// Referenced classes of package me.lyft.android.infrastructure.profile:
//            IProfilePhotoLoader

public class ProfilePhotoLoader
    implements IProfilePhotoFileRecipient, IProfilePhotoLoader
{

    private AtomicReference cachedFileReference;
    private ImageLoader imageLoader;
    private String lastUsedPhoto;
    private AtomicReference previewFileReference;
    private IUserSession userSession;

    public ProfilePhotoLoader(ImageLoader imageloader, IUserSession iusersession)
    {
        cachedFileReference = new AtomicReference();
        previewFileReference = new AtomicReference();
        imageLoader = imageloader;
        userSession = iusersession;
    }

    private void invalidateFileReferencesIfChanged(String s)
    {
        String s1 = lastUsedPhoto;
        lastUsedPhoto = s;
        if (s1 != null && !s1.equals(s))
        {
            cachedFileReference.set(null);
            previewFileReference.set(null);
        }
    }

    private RequestCreator performLoad(File file)
    {
        String s = userSession.getUser().getUserPhoto();
        invalidateFileReferencesIfChanged(s);
        if (file != null)
        {
            return imageLoader.load(file).memoryPolicy(MemoryPolicy.NO_CACHE, new MemoryPolicy[] {
                MemoryPolicy.NO_STORE
            });
        } else
        {
            return imageLoader.load(s);
        }
    }

    public boolean hasCacheFile()
    {
        return cachedFileReference.get() != null;
    }

    public RequestCreator load()
    {
        return performLoad((File)cachedFileReference.get());
    }

    public RequestCreator loadPreview()
    {
        return performLoad((File)previewFileReference.get());
    }

    public void usePhotoFile(File file)
    {
        cachedFileReference.set(file);
        previewFileReference.set(file);
    }

    public void usePhotoFilePreview(File file)
    {
        if (file == null)
        {
            file = (File)cachedFileReference.get();
        }
        previewFileReference.set(file);
    }
}
