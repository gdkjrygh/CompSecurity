// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import org.joda.time.DateTime;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerBioViewModel

public static class i
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

    public country country(String s)
    {
        country = s;
        return this;
    }

    public country dateOfBirth(DateTime datetime)
    {
        dateOfBirth = datetime;
        return this;
    }

    public dateOfBirth height(Integer integer)
    {
        height = integer;
        return this;
    }

    public height id(int i)
    {
        id = i;
        return this;
    }

    public id jersey(Integer integer)
    {
        jersey = integer;
        return this;
    }

    public jersey name(String s)
    {
        name = s;
        return this;
    }

    public name position(String s)
    {
        position = s;
        return this;
    }

    public position positionReal(String s)
    {
        positionReal = s;
        return this;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PlayerBioViewModel.PlayerBioViewModelBuilder(id=").append(id).append(", jersey=").append(jersey).append(", name=").append(name).append(", position=").append(position).append(", positionReal=").append(positionReal).append(", height=").append(height).append(", weight=").append(weight).append(", dateOfBirth=").append(dateOfBirth).append(", country=").append(country).append(")").toString();
    }

    public country weight(Integer integer)
    {
        weight = integer;
        return this;
    }

    i()
    {
    }
}
