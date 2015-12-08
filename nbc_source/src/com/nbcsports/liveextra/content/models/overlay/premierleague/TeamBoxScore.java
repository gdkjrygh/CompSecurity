// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.models.overlay.premierleague;

import java.util.List;

public class TeamBoxScore
{
    public static class Score
    {

        int crn;
        String form;
        int foul;
        int goals;
        String ha;
        int offsd;
        int rc;
        int sht;
        int sot;
        int tckl;
        String tmstp;
        int yc;

        public int getCrn()
        {
            return crn;
        }

        public String getForm()
        {
            return form;
        }

        public int getFoul()
        {
            return foul;
        }

        public int getGoals()
        {
            return goals;
        }

        public String getHa()
        {
            return ha;
        }

        public int getOffsd()
        {
            return offsd;
        }

        public int getRc()
        {
            return rc;
        }

        public int getSht()
        {
            return sht;
        }

        public int getSot()
        {
            return sot;
        }

        public int getTckl()
        {
            return tckl;
        }

        public String getTmstp()
        {
            return tmstp;
        }

        public int getYc()
        {
            return yc;
        }

        public Score()
        {
        }

        public Score(String s)
        {
            ha = s;
        }
    }


    public static final Score DEFAULT_AWAY = new Score("A");
    public static final Score DEFAULT_HOME = new Score("H");
    List scores;

    public TeamBoxScore()
    {
    }

    public List getScores()
    {
        return scores;
    }

}
