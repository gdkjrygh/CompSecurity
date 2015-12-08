// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgModel, BoardCoverImages, BoardCoverImages60x, BoardImages, 
//            IgInterest, BoardImage90x, IgUser

public class IgBoard
    implements IgModel
{

    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public BoardImages h;
    public String i;
    public String j;
    public BoardCoverImages k;
    public Boolean l;
    public Boolean m;
    public Boolean n;
    public Boolean o;
    public String p;
    public Integer q;
    public Integer r;
    public Integer s;
    public String t;
    public IgUser u;
    public List v;

    public IgBoard()
    {
        n = Boolean.valueOf(true);
        q = Integer.valueOf(-1);
        r = Integer.valueOf(-1);
        s = Integer.valueOf(-1);
    }

    public final com.pinterest.api.model.Board.BoardArtifact a()
    {
        Object obj1 = null;
        com.pinterest.api.model.Board.BoardArtifact boardartifact = new com.pinterest.api.model.Board.BoardArtifact();
        Board board = new Board();
        board.setUid(a);
        board.setLastModifiedAt(ModelHelper.stringToDate(c));
        board.setName(d);
        board.setCategory(e);
        board.setDescription(f);
        board.setUrl(g);
        board.setImageCoverUrl(j);
        board.setImagePreviewUrl(i);
        board.setFollowing(l);
        board.setCollaborative(m);
        board.setCollaboratorInvitesEnabled(n);
        board.setCollaborator(o);
        board.setPinCount(q);
        board.setFollowerCount(r);
        board.setCollaboratorCount(s);
        board.setLayout(t);
        if (p != null)
        {
            board.setSecret(Boolean.valueOf(p.equalsIgnoreCase("secret")));
        }
        if (k != null && k.a != null)
        {
            board.setImageCoverThumbnail(k.a.a);
        }
        Object obj;
        if (h != null && h.a != null)
        {
            Object obj2 = h.a;
            if (obj2 == null)
            {
                obj = null;
            } else
            {
                obj = new StringBuilder();
                obj2 = ((List) (obj2)).iterator();
                do
                {
                    if (!((Iterator) (obj2)).hasNext())
                    {
                        break;
                    }
                    BoardImage90x boardimage90x = (BoardImage90x)((Iterator) (obj2)).next();
                    if (boardimage90x.a != null)
                    {
                        ((StringBuilder) (obj)).append((new StringBuilder(",")).append(boardimage90x.a).toString());
                    }
                } while (true);
                obj = ((StringBuilder) (obj)).toString().substring(1);
            }
            board.setImageThumbnailUrls(((String) (obj)));
        }
        if (v != null)
        {
            obj = new ArrayList();
            for (obj2 = v.iterator(); ((Iterator) (obj2)).hasNext(); ((List) (obj)).add(((IgInterest)((Iterator) (obj2)).next()).a())) { }
            board.setInterestList(((List) (obj)));
        }
        obj = obj1;
        if (u != null)
        {
            obj = u.a();
            board.setUserUid(((User) (obj)).getUid());
        }
        if (MyUser.isUserMe(board.getUserUid()))
        {
            board.setCacheExpirationDate(ModelHelper.extendedCacheExpirationDate());
        }
        boardartifact.setBoard(board);
        boardartifact.setUser(((User) (obj)));
        return boardartifact;
    }

    public Object getModel()
    {
        return a();
    }
}
