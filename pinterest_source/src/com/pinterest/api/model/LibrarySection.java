// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import java.util.Date;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            Model, Board, InterestsFeed

public class LibrarySection extends Model
{

    public static final String TYPE_BOARD = "board";
    public static final String TYPE_EMPTY_STATE = "empty_state";
    public static final String TYPE_LIKES = "likes";
    public static final String TYPE_PINS = "pins";
    private Board board;
    private InterestsFeed interestsFeed;
    private List pinList;
    private String type;

    public LibrarySection(Board board1, String s, List list)
    {
        board = board1;
        type = s;
        pinList = list;
        if (board1 != null && board1.getInterestList() != null)
        {
            interestsFeed = new InterestsFeed();
            interestsFeed.setItems(board1.getInterestList());
        }
    }

    public Board getBoard()
    {
        return board;
    }

    public Date getCacheExpirationDate()
    {
        return null;
    }

    public InterestsFeed getInterestsFeed()
    {
        return interestsFeed;
    }

    public List getPinList()
    {
        return pinList;
    }

    public String getType()
    {
        return type;
    }

    public String getUid()
    {
        return null;
    }

    public void setBoard(Board board1)
    {
        board = board1;
    }

    public void setCacheExpirationDate(Date date)
    {
    }

    public void setInterestsFeed(InterestsFeed interestsfeed)
    {
        interestsFeed = interestsfeed;
    }

    public void setPinList(List list)
    {
        pinList = list;
    }

    public void setType(String s)
    {
        type = s;
    }
}
