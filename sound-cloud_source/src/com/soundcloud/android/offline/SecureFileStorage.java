// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.net.Uri;
import com.soundcloud.android.Consts;
import com.soundcloud.android.crypto.CryptoOperations;
import com.soundcloud.android.crypto.EncryptionException;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.utils.IOUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineSettingsStorage

public class SecureFileStorage
{

    private static final String DIRECTORY_NAME = "offline";
    private static final String ENC_FILE_EXTENSION = ".enc";
    public static final int MP3_128_KBPS = 128;
    private static final String TAG = "SecureFileStorage";
    protected final File OFFLINE_DIR;
    private final CryptoOperations cryptoOperations;
    private volatile boolean isRunningEncryption;
    private final OfflineSettingsStorage settingsStorage;

    public SecureFileStorage(CryptoOperations cryptooperations, OfflineSettingsStorage offlinesettingsstorage)
    {
        cryptoOperations = cryptooperations;
        settingsStorage = offlinesettingsstorage;
        OFFLINE_DIR = new File(Consts.FILES_PATH, "offline");
    }

    public static long calculateFileSizeInBytes(long l)
    {
        return ((TimeUnit.MILLISECONDS.toSeconds(l) * 128L) / 8L) * 1024L;
    }

    private boolean deleteFile(File file)
    {
        return !file.exists() || file.delete();
    }

    private String generateFileName(Urn urn)
        throws EncryptionException
    {
        return (new StringBuilder()).append(cryptoOperations.generateHashForUrn(urn)).append(".enc").toString();
    }

    private boolean isWithinStorageLimit(long l)
    {
        return !settingsStorage.hasStorageLimit() || settingsStorage.getStorageLimit() > l;
    }

    protected final boolean createDirectoryIfNeeded()
    {
        return OFFLINE_DIR.exists() || IOUtils.mkdirs(OFFLINE_DIR);
    }

    public void deleteAllTracks()
    {
        IOUtils.deleteDir(OFFLINE_DIR);
    }

    public boolean deleteTrack(Urn urn)
    {
        boolean flag;
        try
        {
            flag = deleteFile(new File(OFFLINE_DIR, generateFileName(urn)));
        }
        catch (EncryptionException encryptionexception)
        {
            ErrorUtils.handleSilentException((new StringBuilder("Offline file deletion failed for track ")).append(urn).toString(), encryptionexception);
            return false;
        }
        return flag;
    }

    public Uri getFileUriForOfflineTrack(Urn urn)
    {
        try
        {
            urn = Uri.fromFile(new File(OFFLINE_DIR, generateFileName(urn)));
        }
        // Misplaced declaration of an exception variable
        catch (Urn urn)
        {
            return Uri.EMPTY;
        }
        return urn;
    }

    public long getStorageAvailable()
    {
        return Consts.FILES_PATH.getFreeSpace();
    }

    public long getStorageCapacity()
    {
        return Consts.FILES_PATH.getTotalSpace();
    }

    public long getStorageUsed()
    {
        return IOUtils.getDirSize(new File[] {
            OFFLINE_DIR
        });
    }

    public boolean isEnoughSpaceForTrack(long l)
    {
        l = calculateFileSizeInBytes(l);
        long l1 = getStorageUsed();
        return getStorageAvailable() > l && isWithinStorageLimit(l1 + l);
    }

    public void storeTrack(Urn urn, InputStream inputstream, com.soundcloud.android.crypto.Encryptor.EncryptionProgressListener encryptionprogresslistener)
        throws IOException, EncryptionException
    {
        File file;
        if (!createDirectoryIfNeeded())
        {
            throw new IOException((new StringBuilder("Failed to create directory for ")).append(OFFLINE_DIR.getAbsolutePath()).toString());
        }
        file = new File(OFFLINE_DIR, generateFileName(urn));
        urn = new FileOutputStream(file);
        isRunningEncryption = true;
        cryptoOperations.encryptStream(inputstream, urn, encryptionprogresslistener);
        isRunningEncryption = false;
        IOUtils.close(urn);
        return;
        inputstream;
        IOUtils.close(urn);
        deleteFile(file);
        throw inputstream;
        inputstream;
        isRunningEncryption = false;
        IOUtils.close(urn);
        throw inputstream;
    }

    public void tryCancelRunningEncryption()
    {
        if (isRunningEncryption)
        {
            cryptoOperations.cancelEncryption();
        }
    }
}
