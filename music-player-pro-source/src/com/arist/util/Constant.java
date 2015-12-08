// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.util;

import android.os.Environment;
import java.io.File;

public class Constant
{

    public static final String ACTION_ALBUM_PIC_CHANGED = "com.MediaPlayer.action.ALBUM_PIC_CHANGED";
    public static final String ACTION_DESTORY = "com.MediaPlayer.action.DESTORY";
    public static final String ACTION_DISS_DIALOG = "com.MediaPlayer.action.DISS_DIALOG";
    public static final String ACTION_MEDIAPLAYER_INFO = "com.MediaPlayer.action.MEDIAPLAYER_INFO";
    public static final String ACTION_MEDIA_BUTTON_PRESSED = "com.MediaPlayer.action.MEDIA_BUTTON_PRESSED";
    public static final String ACTION_MEDIA_SCANNER_SCAN_DIR = "android.intent.action.MEDIA_SCANNER_SCAN_DIR";
    public static final String ACTION_MUSIC_CHANGED = "com.MediaPlayer.action.MUSIC_CHANGED";
    public static final String ACTION_NET_MUSIC_BUFFERING = "com.MediaPlayer.action.NET_MUSIC_BUFFERING";
    public static final String ACTION_NET_PLAY = "com.MediaPlayer.action.NET_PLAY";
    public static final String ACTION_NEXT = "com.MediaPlayer.action.NEXT";
    public static final String ACTION_PLAY = "com.MediaPlayer.action.PLAY";
    public static final String ACTION_PLAY_STATUS = "com.MediaPlayer.action.PLAY_STATUS";
    public static final String ACTION_PREVIOUS = "com.MediaPlayer.action.PREVIOUS";
    public static final String ACTION_SEEK = "com.MediaPlayer.action.SEEK";
    public static final String ACTION_SET_PLAY_MODE = "com.MediaPlayer.action.PALY_MODE";
    public static final String ACTION_SHOW_MUSICLIST = "com.MediaPlayer.action.SHOW_MUSICLIST";
    public static final String ACTION_START_BUFFERING = "start buffering";
    public static final String ACTION_START_SLEEP = "com.MediaPlayer.action.START_SLEEP";
    public static final String ACTION_STAR_THREAD = "com.MediaPlayer.action.STAR_THREA";
    public static final String ACTION_STATUS_CHANGED = "com.MediaPlayer.action.STATUS_CHANGED";
    public static final String ACTION_STOP_BUFFERING = "buffering complete";
    public static final String ACTION_UPDATE_NETMUEIC_VIEW = "com.MediaPlayer.action.UPDATE_NETMUEIC_VIEW";
    public static final String ACTION_WIDGET_EXIT = "com.MediaPlayer.action.WIDGET_EXIT";
    public static final String ACTION_WIDGET_NEXT = "com.MediaPlayer.action.WIDGET_NEXT";
    public static final String ACTION_WIDGET_PLAY = "com.MediaPlayer.action.WIDGET_PLAY";
    public static final String ACTION_WIDGET_PREVIOUS = "com.MediaPlayer.action.WIDGET_PREVIOUS";
    public static final String BASE_ABLUM_CACHES_PATH = (new StringBuilder(String.valueOf(rootDir))).append("/MusicPlayer/albumimgs_caches/").toString();
    public static final String BASE_ABLUM_PATH = (new StringBuilder(String.valueOf(rootDir))).append("/MusicPlayer/albumimgs/").toString();
    public static final String BASE_DOWNLOAD_PATH = (new StringBuilder(String.valueOf(rootDir))).append("/MusicPlayer/musics/").toString();
    public static final String BASE_FAV_PATH = (new StringBuilder(String.valueOf(rootDir))).append("/MusicPlayer/files/favorite.xml").toString();
    public static final String BASE_FILE_PATH = (new StringBuilder(String.valueOf(rootDir))).append("/MusicPlayer/files/").toString();
    public static final String BASE_LYRIC_PATH = (new StringBuilder(String.valueOf(rootDir))).append("/MusicPlayer/lyrics/").toString();
    public static final String DOWNLOAD_MUSIC_Format = ".mp3";
    public static final String DOWNLOAD_PIC_Format = ".jpg";
    public static final int LIST_CYCLE = 1;
    public static final int LIST_ONCE = 3;
    public static final int LIST_RAND = 4;
    public static final int MENU_CONTEXT_DETAILS = 1;
    public static final int MENU_CONTEXT_DOWNLOAD = 2;
    public static final int MSG_TAG_UPDATE_PROGRESS = 6;
    public static final int MUSIC_LIST_SEARCH = 8;
    public static final int NET_MUSIC_LOADING = 7;
    public static final int NET_MUSIC_SEARCH = 9;
    public static final int NET_SEARCH_EMPTY = 10;
    public static final int NOTIFY_MUSIC_PLAYER_ID = 1;
    public static final int SEEK_UPDATE_NEXT = 1;
    public static final int SEEK_UPDATE_PRE = 2;
    public static final int SHOW_LYRIC = 3;
    public static final int SINGLE_CYCLE = 2;
    public static final int STATUS_NOT_PLAY = 1;
    public static final int STATUS_PAUSE = 3;
    public static final int STATUS_PLAYING = 2;
    public static final int XML_PULL_FAILED = 5;
    public static final int XML_PULL_SUCESS = 4;
    public static final int albumButtonSelected = 3;
    public static final int allMusicButtonSelected = 1;
    public static final int artistButtonSelected = 2;
    public static final int downloadButtonSelected = 7;
    public static final int favritorButtonSelected = 5;
    public static final int folderButtonSelected = 4;
    public static final int musicFolderSelected = 111;
    public static final int recentAddButtonSelected = 6;
    public static final String rootDir = Environment.getExternalStorageDirectory().getPath();

    public Constant()
    {
    }

}
