// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.biz;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.arist.entity.ButtonInfo;
import java.util.ArrayList;

public class ButtonInfoBiz
{

    private String btnDes[];
    private String btnDesNum[];
    private int btnIcon[];
    private String btnName[];
    private Context context;
    private ArrayList infos;
    private SharedPreferences mainPref;

    public ButtonInfoBiz(Context context1)
    {
        btnName = new String[7];
        btnDes = new String[7];
        btnIcon = new int[7];
        btnDesNum = new String[7];
        context = context1;
    }

    public ArrayList getButtonInfos()
    {
        infos = new ArrayList();
        mainPref = context.getSharedPreferences("main_activity_pref", 0);
        btnDesNum[0] = (new StringBuilder()).append(mainPref.getInt("num_of_all_music", 0)).toString();
        btnDesNum[1] = (new StringBuilder()).append(mainPref.getInt("num_of_artist", 0)).toString();
        btnDesNum[2] = (new StringBuilder()).append(mainPref.getInt("num_of_album", 0)).toString();
        btnDesNum[3] = (new StringBuilder()).append(mainPref.getInt("num_of_all_folder", 0)).toString();
        btnDesNum[4] = (new StringBuilder()).append(mainPref.getInt("num_of_favorite", 0)).toString();
        btnDesNum[5] = (new StringBuilder()).append(mainPref.getInt("num_of_add", 0)).toString();
        btnDesNum[6] = (new StringBuilder()).append(mainPref.getInt("num_of_download", 0)).toString();
        btnName = context.getResources().getStringArray(0x7f0b0000);
        btnDes = context.getResources().getStringArray(0x7f0b0001);
        btnIcon = (new int[] {
            0x7f02001a, 0x7f02001b, 0x7f020019, 0x7f020020, 0x7f02001f, 0x7f020018, 0x7f02001e
        });
        int i = 0;
        do
        {
            if (i >= btnIcon.length)
            {
                return infos;
            }
            ButtonInfo buttoninfo = new ButtonInfo();
            buttoninfo.setBtnResId(btnIcon[i]);
            buttoninfo.setBtnTitle(btnName[i]);
            buttoninfo.setBtnDes((new StringBuilder(String.valueOf(btnDesNum[i]))).append(" ").append(btnDes[i]).toString());
            infos.add(buttoninfo);
            i++;
        } while (true);
    }
}
