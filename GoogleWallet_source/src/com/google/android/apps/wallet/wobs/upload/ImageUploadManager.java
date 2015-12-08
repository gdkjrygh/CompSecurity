// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.upload;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.app.filenames.Filenames;
import com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil;
import com.google.android.apps.wallet.config.gservices.GservicesKey;
import com.google.android.apps.wallet.config.gservices.GservicesWrapper;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.BufferedLog;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import com.google.android.apps.wallet.wobs.provider.WobDeletionEvent;
import com.google.android.apps.wallet.wobs.provider.WobUpdateEvent;
import com.google.android.apps.wallet.wobs.upload.api.LocalImageUriResolver;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.libraries.uploader.service.lib.service.Uploader;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.io.BaseEncoding;
import com.google.common.io.Closeables;
import com.google.protobuf.nano.MessageNano;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.keyczar.exceptions.KeyczarException;

// Referenced classes of package com.google.android.apps.wallet.wobs.upload:
//            ImageUploadManagerRegistry, SendFeedbackActivity, WobEncrypter

public class ImageUploadManager
    implements LocalImageUriResolver
{
    public static final class UploadException extends Exception
    {

        public UploadException(String s)
        {
            super(s);
        }

        public UploadException(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }


    static final long CLEAR_ORPHANED_FILES_PERIOD;
    private static final Pattern LOCAL_IMAGE_PATTERN = Pattern.compile("(?:.*cgw|comgooglewallet://)/localimage/(.*)");
    static final String TAG = com/google/android/apps/wallet/wobs/upload/ImageUploadManager.getSimpleName();
    private final String accountName;
    private final String authScope;
    private final WalletGoogleAuthUtil authUtil;
    private final File cacheDir;
    private final AtomicReference cachedAuthToken = new AtomicReference();
    private final Context context;
    private final long deviceSpecificId;
    private final Executor executor;
    private long lastClearTime;
    final BufferedLog log;
    private final NotificationManager notificationManager;
    private final ImageUploadManagerRegistry registry;
    private final String scottyUrl;
    private final ThreadChecker threadChecker;
    final com.google.android.libraries.uploader.service.lib.service.Uploader.Listener uploadListener = new com.google.android.libraries.uploader.service.lib.service.Uploader.Listener() {

        final ImageUploadManager this$0;

        public final void onResponseReceived(String s3, byte abyte0[], int i)
        {
            if (i == 200)
            {
                log.logfmt(com.google.android.apps.wallet.logging.WLog.LogPriority.INFO, "Upload response received: identifier=%s, responseText=\"%s\"", new Object[] {
                    s3, new String(abyte0, Charset.forName("UTF-8"))
                });
                logUserEventUploadFinished(s3);
                executor.execute(s3. new Runnable() {

                    final _cls1 this$1;
                    final String val$identifier;

                    public final void run()
                    {
                        removeEncryptedFile(identifier);
                    }

            
            {
                this$1 = final__pcls1;
                identifier = String.this;
                super();
            }
                });
                return;
            }
            log.logfmt(com.google.android.apps.wallet.logging.WLog.LogPriority.ERROR, "Upload response received: identifier=%s, responseText=\"%s\", responseCode=%s", new Object[] {
                s3, new String(abyte0, Charset.forName("UTF-8")), Integer.valueOf(i)
            });
            logUserEventUploadFailed(s3, Integer.valueOf(i));
            if (i == 401)
            {
                log.logfmt(com.google.android.apps.wallet.logging.WLog.LogPriority.ERROR, "Got 401, retrying upload: identifier=%s", new Object[] {
                    s3
                });
                executor.execute(s3. new Runnable() {

                    final _cls1 this$1;
                    final String val$identifier;

                    public final void run()
                    {
                        try
                        {
                            clearAuthTokenAndRetryUpload(identifier);
                            return;
                        }
                        catch (UploadException uploadexception)
                        {
                            log.log(com.google.android.apps.wallet.logging.WLog.LogPriority.ERROR, "Upload retry failed", uploadexception);
                        }
                    }

            
            {
                this$1 = final__pcls1;
                identifier = String.this;
                super();
            }
                });
                return;
            } else
            {
                handleFailedUpload(s3);
                return;
            }
        }

        public final void onUploadFailed(String s3)
        {
            log.logfmt(com.google.android.apps.wallet.logging.WLog.LogPriority.ERROR, "Upload failed: identifier=%s", new Object[] {
                s3
            });
            logUserEventUploadFailed(s3, null);
            handleFailedUpload(s3);
        }

            
            {
                this$0 = ImageUploadManager.this;
                super();
            }
    };
    private final Uploader uploader;
    private final UriRegistry uriRegistry;
    private final UserEventLogger userEventLogger;
    private final WobEncrypter wobEncrypter;

    ImageUploadManager(Context context1, Uploader uploader1, String s, GservicesWrapper gserviceswrapper, WalletGoogleAuthUtil walletgoogleauthutil, String s1, String s2, 
            File file, Executor executor1, ThreadChecker threadchecker, ImageUploadManagerRegistry imageuploadmanagerregistry, EventBus eventbus, WobEncrypter wobencrypter, UserEventLogger usereventlogger, 
            NotificationManager notificationmanager, UriRegistry uriregistry)
    {
        log = new BufferedLog(TAG, 20, "MM/dd/yyyy HH:mm:ss.SSS");
        context = context1;
        uploader = uploader1;
        scottyUrl = s;
        wobEncrypter = wobencrypter;
        deviceSpecificId = gserviceswrapper.getLong(GservicesKey.ANDROID_ID);
        authUtil = walletgoogleauthutil;
        accountName = s1;
        authScope = s2;
        cacheDir = new File(file, "imageuploads");
        executor = executor1;
        threadChecker = threadchecker;
        registry = imageuploadmanagerregistry;
        userEventLogger = usereventlogger;
        notificationManager = notificationmanager;
        uriRegistry = uriregistry;
        eventbus.register(this);
    }

    public static Uri buildLocalImageUri(String s)
    {
        String s1 = String.valueOf("comgooglewallet:///localimage/");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        return Uri.parse(s);
    }

    private void clearAuthToken()
        throws UploadException
    {
        String s;
        s = (String)cachedAuthToken.getAndSet(null);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        log.log(com.google.android.apps.wallet.logging.WLog.LogPriority.INFO, "Clearing cached auth token");
        authUtil.clearToken(s);
        return;
        Object obj;
        obj;
        throw new UploadException("Could not clear auth token", ((Throwable) (obj)));
        obj;
        log.log(com.google.android.apps.wallet.logging.WLog.LogPriority.ERROR, "Unexpected exception while clearing token", ((Throwable) (obj)));
        return;
        obj;
        log.log(com.google.android.apps.wallet.logging.WLog.LogPriority.ERROR, "Unexpected exception while clearing token", ((Throwable) (obj)));
        return;
    }

    private void clearAuthTokenAndRetryUpload(String s)
        throws UploadException
    {
        Object obj = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        clearAuthToken();
        if (s.startsWith("retry_"))
        {
            removeEncryptedFile(s.substring(6));
            return;
        }
        obj = String.valueOf(resolveLocalSource(s).getPath());
        Object obj1 = String.valueOf("_encrypted");
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        obj1 = new File(((String) (obj)));
        if (!((File) (obj1)).exists())
        {
            throw new UploadException("Cache file not found");
        }
        com.google.wallet.proto.NanoWalletClient.ImageUploadManagerRegistryData.Entry entry = (com.google.wallet.proto.NanoWalletClient.ImageUploadManagerRegistryData.Entry)registry.getEntries().get(s);
        if (entry == null)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Registry entry not found for identifier ".concat(s);
            } else
            {
                s = new String("Registry entry not found for identifier ");
            }
            throw new UploadException(s);
        }
        obj = String.valueOf("retry_");
        String s1 = String.valueOf(s);
        if (s1.length() != 0)
        {
            obj = ((String) (obj)).concat(s1);
        } else
        {
            obj = new String(((String) (obj)));
        }
        startUpload(((String) (obj)), buildLocalImageUri(s), entry.wobInstanceId, entry.sessionMaterial, ((File) (obj1)));
    }

    private void clearOrphanedFiles()
    {
        java.util.HashSet hashset = Sets.newHashSet();
        Iterator iterator = registry.getIdentifiers().iterator();
        while (iterator.hasNext()) 
        {
            String s = (String)iterator.next();
            hashset.add(new File(cacheDir, s));
            File file1 = cacheDir;
            s = String.valueOf(s);
            String s1 = String.valueOf("_encrypted");
            if (s1.length() != 0)
            {
                s = s.concat(s1);
            } else
            {
                s = new String(s);
            }
            hashset.add(new File(file1, s));
        }
        Object obj = Lists.newArrayList();
        collectAllFiles(cacheDir, ((List) (obj)));
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            File file = (File)((Iterator) (obj)).next();
            if (!hashset.contains(file))
            {
                if (file.delete())
                {
                    log.logfmt(com.google.android.apps.wallet.logging.WLog.LogPriority.INFO, "Deleted orphaned file from cache: %s", new Object[] {
                        file
                    });
                } else
                {
                    log.logfmt(com.google.android.apps.wallet.logging.WLog.LogPriority.ERROR, "Could not deleted orphaned file: %s", new Object[] {
                        file
                    });
                }
            }
        } while (true);
    }

    private void clearOrphanedFilesIfNecessary(final com.google.wallet.proto.NanoWalletObjects.WobInstance wobInstance, final boolean itemDeleted)
    {
        executor.execute(new Runnable() {

            final ImageUploadManager this$0;
            final boolean val$itemDeleted;
            final com.google.wallet.proto.NanoWalletObjects.WobInstance val$wobInstance;

            public final void run()
            {
                boolean flag = false;
                boolean flag1 = registry.clearOldAndDereferencedEntries(wobInstance);
                boolean flag2;
                flag2 = flag1;
                flag = flag1;
                if (!itemDeleted)
                {
                    break MISSING_BLOCK_LABEL_51;
                }
                flag = flag1;
                registry.clearEntryWithId(wobInstance.id);
                flag2 = flag1;
_L2:
                if (!flag2 && SystemClock.uptimeMillis() - lastClearTime <= ImageUploadManager.CLEAR_ORPHANED_FILES_PERIOD)
                {
                    break MISSING_BLOCK_LABEL_92;
                }
                clearOrphanedFiles();
                lastClearTime = SystemClock.uptimeMillis();
                return;
                Throwable throwable;
                throwable;
                log.log(com.google.android.apps.wallet.logging.WLog.LogPriority.ERROR, "Failure while clearing dereferenced registry entries", throwable);
                flag2 = flag;
                if (true) goto _L2; else goto _L1
_L1:
                throwable;
                log.log(com.google.android.apps.wallet.logging.WLog.LogPriority.ERROR, "Failure while clearing orphaned files", throwable);
                return;
            }

            
            {
                this$0 = ImageUploadManager.this;
                wobInstance = wobinstance;
                itemDeleted = flag;
                super();
            }
        });
    }

    private static void collectAllFiles(File file, List list)
    {
        file = file.listFiles();
        if (file != null)
        {
            int j = file.length;
            int i = 0;
            while (i < j) 
            {
                File file1 = file[i];
                if (file1.isDirectory())
                {
                    collectAllFiles(file1, list);
                } else
                {
                    list.add(file1);
                }
                i++;
            }
        }
    }

    private static String encodeBase64(com.google.commerce.wobs.imageupload.NanoUserAddedImageMetadata.UserAddedImageMetadata useraddedimagemetadata)
    {
        useraddedimagemetadata = MessageNano.toByteArray(useraddedimagemetadata);
        return BaseEncoding.base64().encode(useraddedimagemetadata);
    }

    private String getAuthToken()
        throws UploadException
    {
        String s = (String)cachedAuthToken.get();
        if (s != null)
        {
            return s;
        }
        String s1 = authUtil.getToken(accountName, authScope);
        if (cachedAuthToken.compareAndSet(null, s1))
        {
            return s1;
        }
        try
        {
            s1 = (String)cachedAuthToken.get();
        }
        catch (UserRecoverableAuthException userrecoverableauthexception)
        {
            throw new UploadException("Could not get auth token", userrecoverableauthexception);
        }
        catch (GoogleAuthException googleauthexception)
        {
            throw new UploadException("Could not get auth token", googleauthexception);
        }
        catch (IOException ioexception)
        {
            throw new UploadException("Could not get auth token", ioexception);
        }
        return s1;
    }

    private void handleFailedUpload(final String identifier)
    {
        executor.execute(new Runnable() {

            final ImageUploadManager this$0;
            final String val$identifier;

            public final void run()
            {
                Object obj = registry.remove(identifier);
                if (obj != null)
                {
                    clearOrphanedFiles();
                    sendUploadFailureNotification(((com.google.wallet.proto.NanoWalletClient.ImageUploadManagerRegistryData.Entry) (obj)).wobInstanceId);
                    return;
                }
                BufferedLog bufferedlog = log;
                com.google.android.apps.wallet.logging.WLog.LogPriority logpriority = com.google.android.apps.wallet.logging.WLog.LogPriority.ERROR;
                obj = String.valueOf(identifier);
                if (((String) (obj)).length() != 0)
                {
                    obj = "missing upload file for identifier: ".concat(((String) (obj)));
                } else
                {
                    obj = new String("missing upload file for identifier: ");
                }
                bufferedlog.log(logpriority, ((String) (obj)));
                sendUploadFailureNotification(null);
            }

            
            {
                this$0 = ImageUploadManager.this;
                identifier = s;
                super();
            }
        });
    }

    private void logUserEventUploadFailed(String s, Integer integer)
    {
        com.google.wallet.proto.NanoWalletLogging.UserEventContextExtraInfo usereventcontextextrainfo = new com.google.wallet.proto.NanoWalletLogging.UserEventContextExtraInfo();
        usereventcontextextrainfo.imageUploadExtraInfo = new com.google.wallet.proto.NanoWalletLogging.ImageUploadContextExtraInfo();
        usereventcontextextrainfo.imageUploadExtraInfo.identifier = s;
        usereventcontextextrainfo.imageUploadExtraInfo.responseCode = integer;
        userEventLogger.log(56, 334, usereventcontextextrainfo);
    }

    private void logUserEventUploadFinished(String s)
    {
        com.google.wallet.proto.NanoWalletLogging.UserEventContextExtraInfo usereventcontextextrainfo = new com.google.wallet.proto.NanoWalletLogging.UserEventContextExtraInfo();
        usereventcontextextrainfo.imageUploadExtraInfo = new com.google.wallet.proto.NanoWalletLogging.ImageUploadContextExtraInfo();
        usereventcontextextrainfo.imageUploadExtraInfo.identifier = s;
        userEventLogger.log(56, 333, usereventcontextextrainfo);
    }

    private void logUserEventUploadStart(String s)
    {
        com.google.wallet.proto.NanoWalletLogging.UserEventContextExtraInfo usereventcontextextrainfo = new com.google.wallet.proto.NanoWalletLogging.UserEventContextExtraInfo();
        usereventcontextextrainfo.imageUploadExtraInfo = new com.google.wallet.proto.NanoWalletLogging.ImageUploadContextExtraInfo();
        usereventcontextextrainfo.imageUploadExtraInfo.identifier = s;
        userEventLogger.log(56, 332, usereventcontextextrainfo);
    }

    private void removeEncryptedFile(String s)
    {
        File file = cacheDir;
        s = String.valueOf(s);
        String s1 = String.valueOf("_encrypted");
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        s = new File(file, s);
        if (!s.delete())
        {
            BufferedLog bufferedlog = log;
            com.google.android.apps.wallet.logging.WLog.LogPriority logpriority = com.google.android.apps.wallet.logging.WLog.LogPriority.INFO;
            s = String.valueOf(s.toString());
            if (s.length() != 0)
            {
                s = "failed to delete encrypted version of file: ".concat(s);
            } else
            {
                s = new String("failed to delete encrypted version of file: ");
            }
            bufferedlog.log(logpriority, s);
        }
    }

    private Uri resolveLocalSource(String s)
    {
        return Uri.fromFile(new File(cacheDir, s));
    }

    private void sendUploadFailureNotification(String s)
    {
        Object obj;
        String s1;
        if (s == null)
        {
            s = uriRegistry.createIntent(2, new Object[0]);
        } else
        {
            s = uriRegistry.createIntent(1000, new Object[] {
                s, "g_expanded"
            });
        }
        s = PendingIntent.getActivity(context, 0, s, 0x10000000);
        obj = context.getString(com.google.android.apps.walletnfcrel.R.string.wobs_upload_images_failed);
        s1 = context.getString(com.google.android.apps.walletnfcrel.R.string.notification_text_google_wallet);
        s = (new android.support.v4.app.NotificationCompat.Builder(context)).setAutoCancel(true).setSmallIcon(com.google.android.apps.walletnfcrel.R.drawable.ic_wallet_logo_white_24dp).setTicker(((CharSequence) (obj))).setContentTitle(((CharSequence) (obj))).setContentText(s1).setContentIntent(s);
        obj = SendFeedbackActivity.createIntent(context, log.getRecentMessages());
        obj = PendingIntent.getActivity(context, 0, ((android.content.Intent) (obj)), 0x10000000);
        s.addAction(0, context.getString(com.google.android.apps.walletnfcrel.R.string.wobs_upload_images_failed_send_feedback), ((PendingIntent) (obj)));
        s.setColor(context.getResources().getColor(com.google.android.apps.walletnfcrel.R.color.primary));
        notificationManager.notify(1000, s.build());
    }

    private void startUpload(String s, Uri uri, String s1, String s2, File file)
        throws UploadException
    {
        String s3 = String.valueOf(getAuthToken());
        com.google.commerce.wobs.imageupload.NanoUserAddedImageMetadata.UserAddedImageMetadata useraddedimagemetadata;
        if (s3.length() != 0)
        {
            s3 = "Bearer ".concat(s3);
        } else
        {
            s3 = new String("Bearer ");
        }
        useraddedimagemetadata = new com.google.commerce.wobs.imageupload.NanoUserAddedImageMetadata.UserAddedImageMetadata();
        useraddedimagemetadata.wobInstanceId = s1;
        useraddedimagemetadata.localSourceUri = uri.toString();
        useraddedimagemetadata.sessionMaterial = s2;
        log.logfmt(com.google.android.apps.wallet.logging.WLog.LogPriority.INFO, "Starting upload: identifier=%s, wobInstanceId=%s, localSourceUri=%s, scottyUrl=%s", new Object[] {
            s, useraddedimagemetadata.wobInstanceId, useraddedimagemetadata.localSourceUri, scottyUrl
        });
        uploader.startUpload(scottyUrl, s3, Uri.fromFile(file), file.length(), encodeBase64(useraddedimagemetadata), uploadListener, s);
        logUserEventUploadStart(s);
    }

    private static void writeToFile(byte abyte0[], File file)
        throws IOException
    {
        Object obj = null;
        file = new FileOutputStream(file);
        file.write(abyte0);
        Closeables.close(file, true);
        return;
        file;
        abyte0 = obj;
_L2:
        Closeables.close(abyte0, true);
        throw file;
        Exception exception;
        exception;
        abyte0 = file;
        file = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final String generateIdentifier()
    {
        ThreadChecker threadchecker = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        int i = registry.getNextCounterInt();
        return Filenames.getImageUploadIdentifier(accountName, deviceSpecificId, i);
    }

    public final boolean isLocalImageUri(Uri uri)
    {
        return LOCAL_IMAGE_PATTERN.matcher(uri.toString()).matches();
    }

    public void onWobDeletionEvent(WobDeletionEvent wobdeletionevent)
    {
        clearOrphanedFilesIfNecessary(wobdeletionevent.getWobInstance(), true);
    }

    public void onWobUpdateEvent(WobUpdateEvent wobupdateevent)
    {
        clearOrphanedFilesIfNecessary(wobupdateevent.getWobInstance(), false);
    }

    public final void registerAndUploadImage(String s, String s1, byte abyte0[])
        throws UploadException
    {
        WobEncrypter.EncryptedData encrypteddata;
        File file;
        ThreadChecker threadchecker = threadChecker;
        ThreadChecker.checkOnBackgroundThread();
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(s1);
        try
        {
            encrypteddata = wobEncrypter.encrypt(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new UploadException("Could not encrypt image file for upload", s);
        }
        try
        {
            file = new File(cacheDir, s);
            if (!file.getParentFile().exists() && !file.getParentFile().mkdirs())
            {
                s = String.valueOf(file.getParentFile());
                throw new UploadException((new StringBuilder(String.valueOf(s).length() + 34)).append("Could not create cache directory: ").append(s).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new UploadException("Could not write file to disk", s);
        }
        Object obj;
        File file1;
        file1 = cacheDir;
        obj = String.valueOf(s);
        String s2 = String.valueOf("_encrypted");
        if (s2.length() == 0)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        obj = ((String) (obj)).concat(s2);
_L1:
        obj = new File(file1, ((String) (obj)));
        writeToFile(abyte0, file);
        writeToFile(encrypteddata.bytes, ((File) (obj)));
        registry.add(s, s1, encrypteddata.sessionMaterial);
        startUpload(s, buildLocalImageUri(s), s1, encrypteddata.sessionMaterial, ((File) (obj)));
        return;
        obj = new String(((String) (obj)));
          goto _L1
    }

    public final Uri resolveLocalImageUri(Uri uri)
    {
        uri = LOCAL_IMAGE_PATTERN.matcher(uri.toString());
        Preconditions.checkArgument(uri.matches());
        return resolveLocalSource(Uri.decode(uri.group(1)));
    }

    static 
    {
        CLEAR_ORPHANED_FILES_PERIOD = TimeUnit.DAYS.toMillis(1L);
    }










/*
    static long access$702(ImageUploadManager imageuploadmanager, long l)
    {
        imageuploadmanager.lastClearTime = l;
        return l;
    }

*/


}
