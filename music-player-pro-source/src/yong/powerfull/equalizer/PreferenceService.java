// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yong.powerfull.equalizer;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

public class PreferenceService
{

    private Context context;

    public PreferenceService(Context context1)
    {
        context = context1;
    }

    public void background(String s, int i)
    {
        android.content.SharedPreferences.Editor editor = context.getSharedPreferences("music", 0).edit();
        editor.putString("background", s);
        editor.putInt("ui", 0);
        editor.commit();
    }

    public void band0(String s, Integer integer)
    {
        android.content.SharedPreferences.Editor editor = context.getSharedPreferences("music", 0).edit();
        editor.putString("band0", s);
        editor.putInt("progress0", integer.intValue());
        editor.commit();
    }

    public void band1(String s, Integer integer)
    {
        android.content.SharedPreferences.Editor editor = context.getSharedPreferences("music", 0).edit();
        editor.putString("band1", s);
        editor.putInt("progress1", integer.intValue());
        editor.commit();
    }

    public void band2(String s, Integer integer)
    {
        android.content.SharedPreferences.Editor editor = context.getSharedPreferences("music", 0).edit();
        editor.putString("band2", s);
        editor.putInt("progress2", integer.intValue());
        editor.commit();
    }

    public void band3(String s, Integer integer)
    {
        android.content.SharedPreferences.Editor editor = context.getSharedPreferences("music", 0).edit();
        editor.putString("band3", s);
        editor.putInt("progress3", integer.intValue());
        editor.commit();
    }

    public void band4(String s, Integer integer)
    {
        android.content.SharedPreferences.Editor editor = context.getSharedPreferences("music", 0).edit();
        editor.putString("band4", s);
        editor.putInt("progress4", integer.intValue());
        editor.commit();
    }

    public Map getPreferences00()
    {
        HashMap hashmap = new HashMap();
        SharedPreferences sharedpreferences = context.getSharedPreferences("music", 0);
        hashmap.put("band0", sharedpreferences.getString("band0", "0"));
        hashmap.put("progress0", String.valueOf(sharedpreferences.getInt("progress0", 2)));
        return hashmap;
    }

    public Map getPreferences01()
    {
        HashMap hashmap = new HashMap();
        SharedPreferences sharedpreferences = context.getSharedPreferences("music", 0);
        hashmap.put("band1", sharedpreferences.getString("band1", "1"));
        hashmap.put("progress1", String.valueOf(sharedpreferences.getInt("progress1", 2)));
        return hashmap;
    }

    public Map getPreferences02()
    {
        HashMap hashmap = new HashMap();
        SharedPreferences sharedpreferences = context.getSharedPreferences("music", 0);
        hashmap.put("band2", sharedpreferences.getString("band2", "2"));
        hashmap.put("progress2", String.valueOf(sharedpreferences.getInt("progress2", 2)));
        return hashmap;
    }

    public Map getPreferences03()
    {
        HashMap hashmap = new HashMap();
        SharedPreferences sharedpreferences = context.getSharedPreferences("music", 0);
        hashmap.put("band3", sharedpreferences.getString("band3", "3"));
        hashmap.put("progress3", String.valueOf(sharedpreferences.getInt("progress3", 2)));
        return hashmap;
    }

    public Map getPreferences04()
    {
        HashMap hashmap = new HashMap();
        SharedPreferences sharedpreferences = context.getSharedPreferences("music", 0);
        hashmap.put("band4", sharedpreferences.getString("band4", "4"));
        hashmap.put("progress4", String.valueOf(sharedpreferences.getInt("progress4", 2)));
        return hashmap;
    }

    public Map getPreferencesalbum()
    {
        HashMap hashmap = new HashMap();
        SharedPreferences sharedpreferences = context.getSharedPreferences("music", 0);
        hashmap.put("album", sharedpreferences.getString("album", "album"));
        hashmap.put("albumnum", String.valueOf(sharedpreferences.getInt("albumnum", 12)));
        return hashmap;
    }

    public Map getPreferencesback()
    {
        HashMap hashmap = new HashMap();
        SharedPreferences sharedpreferences = context.getSharedPreferences("music", 0);
        hashmap.put("background", sharedpreferences.getString("background", ""));
        hashmap.put("ui", String.valueOf(sharedpreferences.getInt("ui", 0)));
        return hashmap;
    }

    public Map getPreferenceslrcurl()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("lrcurledit", context.getSharedPreferences("music", 0).getString("lrcurledit", ""));
        return hashmap;
    }

    public Map getPreferencessinger()
    {
        HashMap hashmap = new HashMap();
        SharedPreferences sharedpreferences = context.getSharedPreferences("music", 0);
        hashmap.put("singer", sharedpreferences.getString("singer", "singer"));
        hashmap.put("singernum", String.valueOf(sharedpreferences.getInt("singernum", 12)));
        return hashmap;
    }

    public void savealbum(String s, Integer integer)
    {
        s = context.getSharedPreferences("music", 0).edit();
        s.putString("album", "album");
        s.putInt("albumnum", integer.intValue());
        s.commit();
    }

    public void savelrcurl(String s)
    {
        android.content.SharedPreferences.Editor editor = context.getSharedPreferences("music", 0).edit();
        editor.putString("lrcurledit", s);
        editor.commit();
    }

    public void savesinger(String s, Integer integer)
    {
        s = context.getSharedPreferences("music", 0).edit();
        s.putString("singer", "singer");
        s.putInt("singernum", integer.intValue());
        s.commit();
    }
}
