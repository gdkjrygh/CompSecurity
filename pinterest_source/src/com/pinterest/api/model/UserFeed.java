// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.os.Parcel;
import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            Feed, User, ModelHelper, Board, 
//            MyUser

public class UserFeed extends Feed
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String NAME = "UserFeed";

    public UserFeed()
    {
        super(null, null);
    }

    public UserFeed(Parcel parcel)
    {
        super(null, null);
        readFromParcel(parcel);
    }

    public UserFeed(PinterestJsonObject pinterestjsonobject, String s)
    {
        super(pinterestjsonobject, s);
        if (pinterestjsonobject == null || !(getData() instanceof PinterestJsonArray))
        {
            return;
        } else
        {
            setItems(User.makeAll((PinterestJsonArray)getData()));
            setData(null);
            return;
        }
    }

    protected List getPersistedItems()
    {
        return ModelHelper.getUsers(_ids);
    }

    public String toCollaboratorsDisplay(Board board, int i)
    {
        int k = 0;
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        List list;
        User user;
        int j;
        if (board.getCollaborator() == Boolean.TRUE || MyUser.isUserMe(board.getUserUid()))
        {
            stringbuilder.append(Resources.string(0x7f07060f));
            j = 1;
        } else
        {
            j = 0;
        }
        list = getItems();
        if (k >= list.size() || j >= i)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        user = (User)list.get(k);
        if (MyUser.isUserMe(user)) goto _L2; else goto _L1
_L1:
        j++;
        if (j == 1) goto _L4; else goto _L3
_L3:
        if (list.size() > i) goto _L6; else goto _L5
_L5:
        if (j < list.size())
        {
            s = ",";
        } else
        {
            s = (new StringBuilder(" ")).append(Resources.string(0x7f070055)).toString();
        }
        stringbuilder.append(s).append(" ");
_L4:
        if (user.getFirstName() != null)
        {
            stringbuilder.append(user.getFirstName());
        }
_L2:
        k++;
        continue; /* Loop/switch isn't completed */
_L6:
        if (j >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder.append(", ");
        if (true) goto _L4; else goto _L7
_L7:
        j = board.getCollaboratorCount().intValue() + 1;
        if (j > i)
        {
            stringbuilder.append(" ").append(Resources.stringPlural(0x7f090000, Integer.valueOf((j - i) + 1)));
        } else
        {
            stringbuilder.append(" ").append(Resources.string(0x7f070057));
        }
        return stringbuilder.toString();
        if (true) goto _L9; else goto _L8
_L9:
        break MISSING_BLOCK_LABEL_52;
_L8:
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final UserFeed createFromParcel(Parcel parcel)
        {
            return new UserFeed(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final UserFeed[] newArray(int i)
        {
            return new UserFeed[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
