// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import org.joda.time.DateTime;

public class PlayerBioViewModel
{
    public static class PlayerBioViewModelBuilder
    {

        private String country;
        private DateTime dateOfBirth;
        private Integer height;
        private int id;
        private Integer jersey;
        private String name;
        private String position;
        private String positionReal;
        private Integer weight;

        public PlayerBioViewModel build()
        {
            return new PlayerBioViewModel(id, jersey, name, position, positionReal, height, weight, dateOfBirth, country);
        }

        public PlayerBioViewModelBuilder country(String s)
        {
            country = s;
            return this;
        }

        public PlayerBioViewModelBuilder dateOfBirth(DateTime datetime)
        {
            dateOfBirth = datetime;
            return this;
        }

        public PlayerBioViewModelBuilder height(Integer integer)
        {
            height = integer;
            return this;
        }

        public PlayerBioViewModelBuilder id(int i)
        {
            id = i;
            return this;
        }

        public PlayerBioViewModelBuilder jersey(Integer integer)
        {
            jersey = integer;
            return this;
        }

        public PlayerBioViewModelBuilder name(String s)
        {
            name = s;
            return this;
        }

        public PlayerBioViewModelBuilder position(String s)
        {
            position = s;
            return this;
        }

        public PlayerBioViewModelBuilder positionReal(String s)
        {
            positionReal = s;
            return this;
        }

        public String toString()
        {
            return (new StringBuilder()).append("PlayerBioViewModel.PlayerBioViewModelBuilder(id=").append(id).append(", jersey=").append(jersey).append(", name=").append(name).append(", position=").append(position).append(", positionReal=").append(positionReal).append(", height=").append(height).append(", weight=").append(weight).append(", dateOfBirth=").append(dateOfBirth).append(", country=").append(country).append(")").toString();
        }

        public PlayerBioViewModelBuilder weight(Integer integer)
        {
            weight = integer;
            return this;
        }

        PlayerBioViewModelBuilder()
        {
        }
    }


    public String country;
    public DateTime dateOfBirth;
    public Integer height;
    public int id;
    public Integer jersey;
    public String name;
    public String position;
    public String positionReal;
    public Integer weight;

    PlayerBioViewModel(int i, Integer integer, String s, String s1, String s2, Integer integer1, Integer integer2, 
            DateTime datetime, String s3)
    {
        id = i;
        jersey = integer;
        name = s;
        position = s1;
        positionReal = s2;
        height = integer1;
        weight = integer2;
        dateOfBirth = datetime;
        country = s3;
    }

    public static PlayerBioViewModelBuilder builder()
    {
        return new PlayerBioViewModelBuilder();
    }

    public static PlayerBioViewModel fromPlayer(com.nbcsports.liveextra.content.models.overlay.premierleague.PlayerInfo.Player player)
    {
        return builder().id(player.getPid()).jersey(Integer.valueOf(player.getJersey())).name(player.getName()).position(player.getPosition()).positionReal(player.getPosReal()).height(Integer.valueOf(player.getHeight())).weight(Integer.valueOf(player.getWeight())).dateOfBirth(DateTime.parse(player.getDob())).country(player.getCountry()).build();
    }

    public String getFirstName()
    {
        return name.split(" ")[0];
    }

    public String getLastName()
    {
        return name.substring(name.indexOf(" ") + 1);
    }

    public boolean isGoalkeeper()
    {
        return position.equals("Goalkeeper");
    }
}
