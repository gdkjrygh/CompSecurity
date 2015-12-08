// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;


// Referenced classes of package com.pinterest.api.model:
//            Comment

public final class _deleted
{

    private Comment _comment;
    private boolean _deleted;

    public final Comment getComment()
    {
        return _comment;
    }

    public final void setComment(Comment comment)
    {
        _comment = comment;
    }

    public final void setDeleted(boolean flag)
    {
        _deleted = flag;
    }

    public final boolean wasDeleted()
    {
        return _deleted;
    }

    public (Comment comment)
    {
        if (comment == null)
        {
            comment = new Comment();
        }
        _comment = comment;
    }

    public _comment(Comment comment, boolean flag)
    {
        if (comment == null)
        {
            comment = new Comment();
        }
        _comment = comment;
        _deleted = flag;
    }
}
