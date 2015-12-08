// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.content.ContentResolver;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.utils.IOUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.b;

// Referenced classes of package com.soundcloud.android.creators.record:
//            AudioDurationHelper

public class RecordingStorage
{

    private final AccountOperations accountOperations;
    private final AudioDurationHelper durationHelper;

    public RecordingStorage(AccountOperations accountoperations, AudioDurationHelper audiodurationhelper)
    {
        accountOperations = accountoperations;
        durationHelper = audiodurationhelper;
    }

    private List cleanupRecordings(File file, Urn urn)
    {
        Object obj = new HashMap();
        file = IOUtils.nullSafeListFiles(file, new com.soundcloud.android.api.legacy.model.Recording.RecordingFilter());
        Arrays.sort(file);
        int j = file.length;
        for (int i = 0; i < j; i++)
        {
            File file1 = file[i];
            ((Map) (obj)).put(IOUtils.removeExtension(file1).getAbsolutePath(), file1);
        }

        file = new ArrayList();
        for (obj = ((Map) (obj)).values().iterator(); ((Iterator) (obj)).hasNext();)
        {
            File file2 = (File)((Iterator) (obj)).next();
            if (Recording.isAmplitudeFile(file2.getName()))
            {
                IOUtils.deleteFile(file2);
            } else
            {
                Recording recording = new Recording(file2);
                recording.user_id = urn.getNumericId();
                recording.duration = durationHelper.getDuration(file2);
                if (recording.duration <= 0L || file2.getName().contains("_processed"))
                {
                    delete(recording);
                } else
                {
                    file.add(recording);
                }
            }
        }

        return file;
    }

    private File copyStreamToFile(File file, Uri uri, String s, ContentResolver contentresolver)
        throws IOException
    {
        contentresolver = contentresolver.openInputStream(uri);
        s = MimeTypeMap.getSingleton().getExtensionFromMimeType(s);
        uri = s;
        if (s == null)
        {
            uri = "wav";
        }
        file = new File(file, (new StringBuilder()).append(System.currentTimeMillis()).append(".").append(uri).toString());
        IOUtils.copy(contentresolver, file);
        return file;
    }

    public static boolean delete(Recording recording)
    {
        boolean flag = false;
        if (!recording.external_upload || recording.isLegacyRecording() || recording.isUploadRecording())
        {
            flag = IOUtils.deleteFile(recording.audio_path);
        }
        IOUtils.deleteFile(recording.getEncodedFile());
        IOUtils.deleteFile(recording.getAmplitudeFile());
        IOUtils.deleteFile(recording.getImageFile());
        return flag;
    }

    public b cleanupRecordings(final File recordingDir)
    {
        return b.create(new _cls1());
    }

    public b deleteStaleUploads(final File uploadsDirectory)
    {
        return b.create(new _cls2());
    }

    public b upload(final File uploadDir, final Uri stream, final String type, final ContentResolver resolver)
    {
        return b.create(new _cls3());
    }





    private class _cls1
        implements rx.b.f
    {

        final RecordingStorage this$0;
        final File val$recordingDir;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            x.onNext(cleanupRecordings(recordingDir, accountOperations.getLoggedInUserUrn()));
            x.onCompleted();
        }

        _cls1()
        {
            this$0 = RecordingStorage.this;
            recordingDir = file;
            super();
        }
    }


    private class _cls2
        implements rx.b.f
    {

        final RecordingStorage this$0;
        final File val$uploadsDirectory;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            File afile[] = IOUtils.nullSafeListFiles(uploadsDirectory, null);
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                RecordingStorage.delete(new Recording(afile[i]));
            }

            x.onCompleted();
        }

        _cls2()
        {
            this$0 = RecordingStorage.this;
            uploadsDirectory = file;
            super();
        }
    }


    private class _cls3
        implements rx.b.f
    {

        final RecordingStorage this$0;
        final ContentResolver val$resolver;
        final Uri val$stream;
        final String val$type;
        final File val$uploadDir;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            File file = IOUtils.getFromMediaUri(resolver, stream);
            Object obj;
            Recording recording;
            if (file == null || !file.exists())
            {
                try
                {
                    file = copyStreamToFile(uploadDir, stream, type, resolver);
                    obj = IOUtils.getFilenameFromUri(stream, resolver);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    x.onCompleted();
                    return;
                }
            } else
            {
                obj = file.getName();
            }
            recording = new Recording(file);
            recording.external_upload = true;
            recording.original_filename = ((String) (obj));
            recording.duration = durationHelper.getDuration(file);
            x.onNext(recording);
            x.onCompleted();
        }

        _cls3()
        {
            this$0 = RecordingStorage.this;
            resolver = contentresolver;
            stream = uri;
            uploadDir = file;
            type = s;
            super();
        }
    }

}
