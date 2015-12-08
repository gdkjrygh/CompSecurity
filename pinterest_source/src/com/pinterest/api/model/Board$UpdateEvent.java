// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;


// Referenced classes of package com.pinterest.api.model:
//            Board

public final class _refresh
{

    private Board _board;
    private boolean _deleted;
    private boolean _refresh;

    public final Board getBoard()
    {
        return _board;
    }

    public final boolean refreshFeed()
    {
        return _refresh;
    }

    public final void setBoard(Board board)
    {
        _board = board;
    }

    public final void setDeleted(boolean flag)
    {
        _deleted = flag;
    }

    public final boolean wasDeleted()
    {
        return _deleted;
    }

    public (Board board)
    {
        this(board, false);
    }

    public <init>(Board board, boolean flag)
    {
        this(board, flag, false);
    }

    public <init>(Board board, boolean flag, boolean flag1)
    {
        if (board == null)
        {
            board = new Board();
        }
        _board = board;
        _deleted = flag;
        _refresh = flag1;
    }
}
