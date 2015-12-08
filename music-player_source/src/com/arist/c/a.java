// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.c;

import android.os.Environment;
import com.arist.activity.MyApplication;
import java.io.File;

public final class a
{

    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E = Environment.getExternalStorageDirectory().getPath();
    public static final String F = (new StringBuilder(String.valueOf(E))).append("/MusicPlayer/lyrics/").toString();
    public static final String G = (new StringBuilder(String.valueOf(E))).append("/MusicPlayer/files/favorite.xml").toString();
    public static final String H = (new StringBuilder(String.valueOf(E))).append("/MusicPlayer/files/").toString();
    public static final String I = (new StringBuilder(String.valueOf(E))).append("/MusicPlayer/musics/").toString();
    public static final String J = (new StringBuilder(String.valueOf(E))).append("/MusicPlayer/images/").toString();
    public static final String K = (new StringBuilder(String.valueOf(E))).append("/MusicPlayer/errorlog/").toString();
    public static final String L = (new StringBuilder(String.valueOf(E))).append("/MusicPlayer/albumimgs_caches/").toString();
    public static String M = "";
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;

    static 
    {
        a = MyApplication.d.getPackageName();
        b = (new StringBuilder(String.valueOf(a))).append(".action.play").toString();
        c = (new StringBuilder(String.valueOf(a))).append(".action.fravourite_changed").toString();
        d = (new StringBuilder(String.valueOf(a))).append(".action.net_play").toString();
        e = (new StringBuilder(String.valueOf(a))).append(".action.seek").toString();
        f = (new StringBuilder(String.valueOf(a))).append(".action.previous").toString();
        g = (new StringBuilder(String.valueOf(a))).append(".action.next").toString();
        h = (new StringBuilder(String.valueOf(a))).append(".action.stop").toString();
        i = (new StringBuilder(String.valueOf(a))).append(".action.clear_notify").toString();
        j = (new StringBuilder(String.valueOf(a))).append(".action.music_changed").toString();
        k = (new StringBuilder(String.valueOf(a))).append(".ACTION_DATA_INIT_FINISHED").toString();
        l = (new StringBuilder(String.valueOf(a))).append(".action.STATUS_CHANGED").toString();
        m = (new StringBuilder(String.valueOf(a))).append(".action.DISS_DIALOG").toString();
        n = (new StringBuilder(String.valueOf(a))).append(".action.PALY_MODE").toString();
        o = (new StringBuilder(String.valueOf(a))).append(".action.STAR_THREA").toString();
        p = (new StringBuilder(String.valueOf(a))).append(".action.PLAY_STATUS").toString();
        q = (new StringBuilder(String.valueOf(a))).append(".action.DESTORY").toString();
        r = (new StringBuilder(String.valueOf(a))).append(".action.MEDIAPLAYER_INFO").toString();
        s = (new StringBuilder(String.valueOf(a))).append(".action.START_SLEEP").toString();
        t = (new StringBuilder(String.valueOf(a))).append(".action.band_change").toString();
        u = (new StringBuilder(String.valueOf(a))).append(".action.SHOW_MUSICLIST").toString();
        v = (new StringBuilder(String.valueOf(a))).append(".action.MEDIA_BUTTON_PRESSED").toString();
        w = (new StringBuilder(String.valueOf(a))).append(".action.UPDATE_NETMUEIC_VIEW").toString();
        x = (new StringBuilder(String.valueOf(a))).append(".action.NET_MUSIC_BUFFERING").toString();
        y = (new StringBuilder(String.valueOf(a))).append(".action_music_db_changed").toString();
        z = (new StringBuilder(String.valueOf(a))).append(".action_scan_media").toString();
        A = (new StringBuilder(String.valueOf(a))).append(".action_start_buffering").toString();
        B = (new StringBuilder(String.valueOf(a))).append(".action_buffering_complete").toString();
        C = (new StringBuilder(String.valueOf(a))).append(".action.CHECK_DESK_LRC").toString();
        D = (new StringBuilder(String.valueOf(a))).append(".action.REFRASH_MUISC_LIST").toString();
    }
}
