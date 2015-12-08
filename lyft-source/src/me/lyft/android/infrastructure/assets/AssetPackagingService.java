// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.assets;

import android.content.Context;
import android.content.res.Resources;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.analytics.Analytics;
import me.lyft.android.analytics.DeveloperEvent;
import me.lyft.android.common.Closeables;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.logging.L;
import me.lyft.android.rx.SimpleSubscriber;
import me.lyft.android.utils.FileUtils;
import me.lyft.android.utils.Files;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

// Referenced classes of package me.lyft.android.infrastructure.assets:
//            IAssetPackagingService, AssetsPath

public class AssetPackagingService
    implements IAssetPackagingService
{

    final Context context;
    final ILyftPreferences lyftPreferences;
    final OkHttpClient okHttpClient;

    public AssetPackagingService(Context context1, ILyftPreferences ilyftpreferences, OkHttpClient okhttpclient)
    {
        context = context1;
        lyftPreferences = ilyftpreferences;
        okHttpClient = okhttpclient;
    }

    private Observable downloadAssetsPackage(final String url, final File file)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final AssetPackagingService this$0;
            final File val$file;
            final String val$url;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                Object obj = (new com.squareup.okhttp.Request.Builder()).url(url).get().build();
                FileOutputStream fileoutputstream;
                Response response;
                response = okHttpClient.newCall(((com.squareup.okhttp.Request) (obj))).execute();
                fileoutputstream = new FileOutputStream(file);
                obj = fileoutputstream;
                fileoutputstream.write(response.body().bytes());
                obj = fileoutputstream;
                subscriber.onNext(file);
                obj = fileoutputstream;
                subscriber.onCompleted();
                Closeables.closeQuietly(fileoutputstream);
                return;
                Throwable throwable;
                throwable;
                fileoutputstream = null;
_L4:
                obj = fileoutputstream;
                subscriber.onError(throwable);
                Closeables.closeQuietly(fileoutputstream);
                return;
                subscriber;
                obj = null;
_L2:
                Closeables.closeQuietly(((java.io.Closeable) (obj)));
                throw subscriber;
                subscriber;
                if (true) goto _L2; else goto _L1
_L1:
                throwable;
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = AssetPackagingService.this;
                url = s;
                file = file1;
                super();
            }
        });
    }

    private void ensureAssetDirectoryCreatedAndClean()
    {
        File file = new File(getAssetsFolderPath());
        file.mkdirs();
        File afile[] = file.listFiles();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            afile[i].delete();
        }

    }

    private File getAssetFile(String s)
    {
        return new File(getAssetsFolderPath(), s);
    }

    private String getAssetsFolderPath()
    {
        return AssetsPath.get(context);
    }

    private File getDownloadedAssetsFile(String s)
    {
        return new File(FileUtils.getTempDirectoryPath(context), s);
    }

    private static String getFileNameWithoutExtensions(String s)
    {
        s = s.substring(s.lastIndexOf('/') + 1, s.length());
        return s.substring(0, s.lastIndexOf('.'));
    }

    static boolean isUpgrade(String s, String s1)
    {
        return s1.compareTo(s) > 0;
    }

    private Observable unpackInputStream(final String packageName, final InputStream is)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final AssetPackagingService this$0;
            final InputStream val$is;
            final String val$packageName;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                Analytics.track(new DeveloperEvent("assets_unpacking_started"));
                ZipInputStream zipinputstream1 = new ZipInputStream(new BufferedInputStream(is));
                ZipInputStream zipinputstream = zipinputstream1;
                ensureAssetDirectoryCreatedAndClean();
_L5:
                zipinputstream = zipinputstream1;
                Object obj1 = zipinputstream1.getNextEntry();
                if (obj1 == null) goto _L2; else goto _L1
_L1:
                zipinputstream = zipinputstream1;
                if (!subscriber.isUnsubscribed())
                {
                    break MISSING_BLOCK_LABEL_68;
                }
                zipinputstream = zipinputstream1;
                subscriber.onCompleted();
                zipinputstream = zipinputstream1;
                Object obj = new ByteArrayOutputStream();
                zipinputstream = zipinputstream1;
                byte abyte0[] = new byte[1024];
_L4:
                zipinputstream = zipinputstream1;
                int i = zipinputstream1.read(abyte0);
                if (i == -1)
                {
                    break; /* Loop/switch isn't completed */
                }
                zipinputstream = zipinputstream1;
                ((ByteArrayOutputStream) (obj)).write(abyte0, 0, i);
                if (true) goto _L4; else goto _L3
                obj;
_L8:
                zipinputstream = zipinputstream1;
                Analytics.track(new DeveloperEvent("assets_unpacking_failed"));
                zipinputstream = zipinputstream1;
                subscriber.onError(((Throwable) (obj)));
                Closeables.closeQuietly(is);
                Closeables.closeQuietly(zipinputstream1);
                return;
_L3:
                zipinputstream = zipinputstream1;
                obj1 = ((ZipEntry) (obj1)).getName();
                zipinputstream = zipinputstream1;
                Files.write(((ByteArrayOutputStream) (obj)).toByteArray(), getAssetFile(((String) (obj1))));
                zipinputstream = zipinputstream1;
                Closeables.closeQuietly(((java.io.Closeable) (obj)));
                  goto _L5
                subscriber;
_L7:
                Closeables.closeQuietly(is);
                Closeables.closeQuietly(zipinputstream);
                throw subscriber;
_L2:
                zipinputstream = zipinputstream1;
                lyftPreferences.setLastUnpackedAssetsPackageName(packageName);
                zipinputstream = zipinputstream1;
                subscriber.onNext(Unit.create());
                zipinputstream = zipinputstream1;
                subscriber.onCompleted();
                Closeables.closeQuietly(is);
                Closeables.closeQuietly(zipinputstream1);
                return;
                subscriber;
                zipinputstream = null;
                if (true) goto _L7; else goto _L6
_L6:
                obj;
                zipinputstream1 = null;
                  goto _L8
            }

            
            {
                this$0 = AssetPackagingService.this;
                is = inputstream;
                packageName = s;
                super();
            }
        });
    }

    public void downloadAssetsIfChanged(String s)
    {
        final String fileName = getFileNameWithoutExtensions(s);
        final File packageFile = getDownloadedAssetsFile(fileName);
        boolean flag = isUpgrade(lyftPreferences.getLastUnpackedAssetsPackageName(), fileName);
        if (!Strings.isNullOrEmpty(s) && flag)
        {
            downloadAssetsPackage(s, packageFile).flatMap(new Func1() {

                final AssetPackagingService this$0;
                final String val$fileName;

                public volatile Object call(Object obj)
                {
                    return call((File)obj);
                }

                public Observable call(File file)
                {
                    try
                    {
                        file = new FileInputStream(file);
                        file = unpackInputStream(fileName, file);
                    }
                    // Misplaced declaration of an exception variable
                    catch (File file)
                    {
                        return Observable.error(file);
                    }
                    return file;
                }

            
            {
                this$0 = AssetPackagingService.this;
                fileName = s;
                super();
            }
            }).doOnNext(new Action1() {

                final AssetPackagingService this$0;
                final File val$packageFile;

                public volatile void call(Object obj)
                {
                    call((Unit)obj);
                }

                public void call(Unit unit)
                {
                    packageFile.delete();
                }

            
            {
                this$0 = AssetPackagingService.this;
                packageFile = file;
                super();
            }
            }).subscribeOn(Schedulers.newThread()).subscribe(new SimpleSubscriber() {

                final AssetPackagingService this$0;

                public void onError(Throwable throwable)
                {
                    super.onError(throwable);
                    L.w(throwable, "updateAssets", new Object[0]);
                }

            
            {
                this$0 = AssetPackagingService.this;
                super();
            }
            });
        }
    }

    public Observable unpackEmbededZipResources()
    {
        Resources resources = context.getResources();
        String s = resources.getResourceEntryName(0x7f060001);
        if (!isUpgrade(lyftPreferences.getLastUnpackedAssetsPackageName(), s))
        {
            return Unit.just();
        } else
        {
            return unpackInputStream(s, resources.openRawResource(0x7f060001)).subscribeOn(Schedulers.newThread());
        }
    }



}
