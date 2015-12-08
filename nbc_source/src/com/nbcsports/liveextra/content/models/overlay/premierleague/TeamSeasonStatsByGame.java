// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.models.overlay.premierleague;

import java.util.List;

public class TeamSeasonStatsByGame
{
    public class TeamSeasonStats
    {

        int DW;
        int blk;
        int blkRk;
        int clnSht;
        int clnShtRk;
        int dwRk;
        int fl;
        int flRk;
        int g;
        int gls;
        int glsRk;
        String ha;
        int intRk;
        int intStat;
        double posPct;
        int posPctRk;
        int rc;
        int rcRk;
        double shtAcc;
        int shtAccRk;
        int tckl;
        int tcklRk;
        final TeamSeasonStatsByGame this$0;
        int tid;
        int yc;
        int ycRk;

        public int getBlk()
        {
            return blk;
        }

        public int getBlkRk()
        {
            return blkRk;
        }

        public int getClnSht()
        {
            return clnSht;
        }

        public int getClnShtRk()
        {
            return clnShtRk;
        }

        public int getDW()
        {
            return DW;
        }

        public int getDwRk()
        {
            return dwRk;
        }

        public int getFl()
        {
            return fl;
        }

        public int getFlRk()
        {
            return flRk;
        }

        public int getG()
        {
            return g;
        }

        public int getGls()
        {
            return gls;
        }

        public int getGlsRk()
        {
            return glsRk;
        }

        public String getHa()
        {
            return ha;
        }

        public int getIntRk()
        {
            return intRk;
        }

        public int getIntStat()
        {
            return intStat;
        }

        public double getPosPct()
        {
            return posPct;
        }

        public int getPosPctRk()
        {
            return posPctRk;
        }

        public int getRc()
        {
            return rc;
        }

        public int getRcRk()
        {
            return rcRk;
        }

        public double getShtAcc()
        {
            return shtAcc;
        }

        public int getShtAccRk()
        {
            return shtAccRk;
        }

        public int getTckl()
        {
            return tckl;
        }

        public int getTcklRk()
        {
            return tcklRk;
        }

        public int getTid()
        {
            return tid;
        }

        public int getYc()
        {
            return yc;
        }

        public int getYcRk()
        {
            return ycRk;
        }

        public TeamSeasonStats()
        {
            this$0 = TeamSeasonStatsByGame.this;
            super();
        }
    }


    List stats;

    public TeamSeasonStatsByGame()
    {
    }

    public List getStats()
    {
        return stats;
    }
}
