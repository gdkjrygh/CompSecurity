// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.utils;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.Toast;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;

// Referenced classes of package org.xbmc.kore.utils:
//            LogUtils

public class FileDownloadHelper
{
    public static abstract class MediaInfo
    {

        public final String fileName;

        public boolean downloadDirectoryExists()
        {
            return (new File(getAbsoluteDirectoryPath())).exists();
        }

        public boolean downloadFileExists()
        {
            if (!downloadDirectoryExists())
            {
                return false;
            } else
            {
                return (new File(getAbsoluteFilePath())).exists();
            }
        }

        public String getAbsoluteDirectoryPath()
        {
            File file = Environment.getExternalStoragePublicDirectory(getExternalPublicDirType());
            return (new StringBuilder()).append(file.getPath()).append("/").append(getRelativeDirectoryPath()).toString();
        }

        public String getAbsoluteFilePath()
        {
            return (new StringBuilder()).append(getAbsoluteDirectoryPath()).append("/").append(getDownloadFileName()).toString();
        }

        public String getDownloadDescrition(Context context)
        {
            return context.getString(0x7f070035);
        }

        public abstract String getDownloadFileName();

        public abstract String getDownloadTitle(Context context);

        public abstract String getExternalPublicDirType();

        public abstract String getRelativeDirectoryPath();

        public String getRelativeFilePath()
        {
            return (new StringBuilder()).append(getRelativeDirectoryPath()).append("/").append(getDownloadFileName()).toString();
        }

        public MediaInfo(String s)
        {
            fileName = s;
        }
    }

    public static class MovieInfo extends MediaInfo
    {

        public final String title;

        public String getDownloadFileName()
        {
            String s = FileDownloadHelper.getFilenameExtension(fileName);
            if (s != null)
            {
                return (new StringBuilder()).append(title).append(s).toString();
            } else
            {
                return null;
            }
        }

        public String getDownloadTitle(Context context)
        {
            return title;
        }

        public String getExternalPublicDirType()
        {
            return Environment.DIRECTORY_MOVIES;
        }

        public String getRelativeDirectoryPath()
        {
            if (TextUtils.isEmpty(title))
            {
                return null;
            } else
            {
                return title;
            }
        }

        public MovieInfo(String s, String s1)
        {
            super(s1);
            title = s;
        }
    }

    public static class MusicVideoInfo extends MediaInfo
    {

        public final String title;

        public String getDownloadFileName()
        {
            String s = FileDownloadHelper.getFilenameExtension(fileName);
            if (s != null)
            {
                return (new StringBuilder()).append(title).append(s).toString();
            } else
            {
                return null;
            }
        }

        public String getDownloadTitle(Context context)
        {
            return title;
        }

        public String getExternalPublicDirType()
        {
            return Environment.DIRECTORY_MUSIC;
        }

        public String getRelativeDirectoryPath()
        {
            if (TextUtils.isEmpty(title))
            {
                return null;
            } else
            {
                return (new StringBuilder()).append("Music Videos/").append(title).toString();
            }
        }

        public MusicVideoInfo(String s, String s1)
        {
            super(s1);
            title = s;
        }
    }

    public static class SongInfo extends MediaInfo
    {

        public final String album;
        public final String artist;
        public final int songId;
        public final String title;
        public final int track;

        public String getDownloadFileName()
        {
            String s = FileDownloadHelper.getFilenameExtension(fileName);
            if (s != null)
            {
                return (new StringBuilder()).append(String.valueOf(track)).append(" - ").append(title).append(s).toString();
            } else
            {
                return null;
            }
        }

        public String getDownloadTitle(Context context)
        {
            return title;
        }

        public String getExternalPublicDirType()
        {
            return Environment.DIRECTORY_MUSIC;
        }

        public String getRelativeDirectoryPath()
        {
            if (TextUtils.isEmpty(album) || TextUtils.isEmpty(artist))
            {
                return null;
            } else
            {
                return (new StringBuilder()).append(artist).append("/").append(album).toString();
            }
        }

        public SongInfo(String s, String s1, int i, int j, String s2, String s3)
        {
            super(s3);
            artist = s;
            album = s1;
            songId = i;
            track = j;
            title = s2;
        }
    }

    public static class TVShowInfo extends MediaInfo
    {

        public final int episodeNumber;
        public final int season;
        public final String title;
        public final String tvshowTitle;

        public String getDownloadFileName()
        {
            String s = FileDownloadHelper.getFilenameExtension(fileName);
            if (s != null)
            {
                return (new StringBuilder()).append(String.valueOf(episodeNumber)).append(" - ").append(title).append(s).toString();
            } else
            {
                return null;
            }
        }

        public String getDownloadTitle(Context context)
        {
            return title;
        }

        public String getExternalPublicDirType()
        {
            return Environment.DIRECTORY_MOVIES;
        }

        public String getRelativeDirectoryPath()
        {
            if (season <= 0) goto _L2; else goto _L1
_L1:
            if (!TextUtils.isEmpty(tvshowTitle)) goto _L4; else goto _L3
_L3:
            return null;
_L4:
            return (new StringBuilder()).append(tvshowTitle).append("/Season").append(String.valueOf(season)).toString();
_L2:
            if (!TextUtils.isEmpty(tvshowTitle))
            {
                return tvshowTitle;
            }
            if (true) goto _L3; else goto _L5
_L5:
        }

        public TVShowInfo(String s, int i, int j, String s1, String s2)
        {
            super(s2);
            tvshowTitle = s;
            season = i;
            episodeNumber = j;
            title = s1;
        }
    }


    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/utils/FileDownloadHelper);

    public FileDownloadHelper()
    {
    }

    private static boolean checkDownloadDir(Context context, String s)
    {
        s = new File(s);
        if (s.exists() && !s.isDirectory())
        {
            Toast.makeText(context, "Download directory already exists and is not a directory.", 0).show();
            return false;
        }
        if (!s.isDirectory() && !s.mkdirs())
        {
            Toast.makeText(context, (new StringBuilder()).append("Couldn't create download directory: ").append(s.getPath()).toString(), 0).show();
            return false;
        } else
        {
            return true;
        }
    }

    public static void downloadFiles(Context context, HostInfo hostinfo, List list, int i, Handler handler)
    {
        while (list == null || list.size() == 0 || !checkDownloadDir(context, ((MediaInfo)list.get(0)).getAbsoluteDirectoryPath())) 
        {
            return;
        }
        HostConnection hostconnection = new HostConnection(hostinfo);
        hostconnection.setProtocol(1);
        (new org.xbmc.kore.jsonrpc.method.JSONRPC.Ping()).execute(hostconnection, new ApiCallback(context, list, hostconnection, hostinfo, i, handler) {

            final Handler val$callbackHandler;
            final Context val$context;
            final int val$fileHandlingMode;
            final HostInfo val$hostInfo;
            final HostConnection val$httpHostConnection;
            final List val$mediaInfoList;

            public void onError(int j, String s)
            {
                Toast.makeText(context, 0x7f0700a2, 0).show();
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                s = (DownloadManager)context.getSystemService("download");
                MediaInfo mediainfo;
                for (Iterator iterator = mediaInfoList.iterator(); iterator.hasNext(); FileDownloadHelper.downloadSingleFile(context, httpHostConnection, hostInfo, mediainfo, fileHandlingMode, s, callbackHandler))
                {
                    mediainfo = (MediaInfo)iterator.next();
                }

            }

            
            {
                context = context1;
                mediaInfoList = list;
                httpHostConnection = hostconnection;
                hostInfo = hostinfo;
                fileHandlingMode = i;
                callbackHandler = handler;
                super();
            }
        }, handler);
    }

    public static void downloadFiles(Context context, HostInfo hostinfo, MediaInfo mediainfo, int i, Handler handler)
    {
        while (mediainfo == null || !checkDownloadDir(context, mediainfo.getAbsoluteDirectoryPath())) 
        {
            return;
        }
        HostConnection hostconnection = new HostConnection(hostinfo);
        hostconnection.setProtocol(1);
        (new org.xbmc.kore.jsonrpc.method.JSONRPC.Ping()).execute(hostconnection, new ApiCallback(context, hostconnection, hostinfo, mediainfo, i, handler) {

            final Handler val$callbackHandler;
            final Context val$context;
            final int val$fileHandlingMode;
            final HostInfo val$hostInfo;
            final HostConnection val$httpHostConnection;
            final MediaInfo val$mediaInfo;

            public void onError(int j, String s)
            {
                Toast.makeText(context, 0x7f0700a2, 0).show();
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            public void onSuccess(String s)
            {
                s = (DownloadManager)context.getSystemService("download");
                FileDownloadHelper.downloadSingleFile(context, httpHostConnection, hostInfo, mediaInfo, fileHandlingMode, s, callbackHandler);
            }

            
            {
                context = context1;
                httpHostConnection = hostconnection;
                hostInfo = hostinfo;
                mediaInfo = mediainfo;
                fileHandlingMode = i;
                callbackHandler = handler;
                super();
            }
        }, handler);
    }

    private static void downloadSingleFile(Context context, HostConnection hostconnection, HostInfo hostinfo, MediaInfo mediainfo, int i, DownloadManager downloadmanager, Handler handler)
    {
        (new org.xbmc.kore.jsonrpc.method.Files.PrepareDownload(mediainfo.fileName)).execute(hostconnection, new ApiCallback(i, mediainfo, hostinfo, context, downloadmanager) {

            final Context val$context;
            final DownloadManager val$downloadManager;
            final int val$fileHandlingMode;
            final HostInfo val$hostInfo;
            final MediaInfo val$mediaInfo;

            public void onError(int j, String s)
            {
                Toast.makeText(context, String.format(context.getString(0x7f07003f), new Object[] {
                    mediaInfo.getDownloadTitle(context)
                }), 0).show();
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((org.xbmc.kore.jsonrpc.type.FilesType.PrepareDownloadReturnType)obj);
            }

            public void onSuccess(org.xbmc.kore.jsonrpc.type.FilesType.PrepareDownloadReturnType preparedownloadreturntype)
            {
                if (fileHandlingMode == 0)
                {
                    File file = new File(mediaInfo.getAbsoluteFilePath());
                    if (file.exists())
                    {
                        file.delete();
                    }
                }
                preparedownloadreturntype = new android.app.DownloadManager.Request(Uri.parse((new StringBuilder()).append(hostInfo.getHttpURL()).append("/").append(preparedownloadreturntype.path).toString()));
                if (hostInfo.getUsername() != null && !hostInfo.getUsername().isEmpty() && hostInfo.getPassword() != null && !hostInfo.getPassword().isEmpty())
                {
                    String s = Base64.encodeToString((new StringBuilder()).append(hostInfo.getUsername()).append(":").append(hostInfo.getPassword()).toString().getBytes(), 0);
                    preparedownloadreturntype.addRequestHeader("Authorization", (new StringBuilder()).append("Basic ").append(s).toString());
                }
                preparedownloadreturntype.allowScanningByMediaScanner();
                preparedownloadreturntype.setAllowedNetworkTypes(2);
                preparedownloadreturntype.setTitle(mediaInfo.getDownloadTitle(context));
                preparedownloadreturntype.setDescription(mediaInfo.getDownloadDescrition(context));
                preparedownloadreturntype.setDestinationInExternalPublicDir(mediaInfo.getExternalPublicDirType(), mediaInfo.getRelativeFilePath());
                downloadManager.enqueue(preparedownloadreturntype);
            }

            
            {
                fileHandlingMode = i;
                mediaInfo = mediainfo;
                hostInfo = hostinfo;
                context = context1;
                downloadManager = downloadmanager;
                super();
            }
        }, handler);
    }

    public static String getFilenameExtension(String s)
    {
        int i = s.lastIndexOf(".");
        if (i > 0)
        {
            return s.substring(i);
        } else
        {
            return null;
        }
    }


}
