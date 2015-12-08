// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.groups.members;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import com.googlecode.flickrjandroid.util.StringUtilities;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.groups.members:
//            Member, MembersList

public class MembersInterface
{

    public static final String METHOD_GET_LIST = "flickr.groups.members.getList";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public MembersInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    private Member parseMember(JSONObject jsonobject)
    {
        Member member = new Member();
        member.setId(jsonobject.getString("nsid"));
        member.setUserName(jsonobject.getString("username"));
        member.setIconServer(jsonobject.getString("iconserver"));
        member.setIconFarm(jsonobject.getString("iconfarm"));
        member.setMemberType(jsonobject.getString("membertype"));
        return member;
    }

    public MembersList getList(String s, Set set, int i, int j)
    {
        MembersList memberslist = new MembersList();
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("method", "flickr.groups.members.getList"));
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new Parameter("group_id", s));
        if (i > 0)
        {
            arraylist.add(new Parameter("per_page", String.valueOf(i)));
        }
        if (j > 0)
        {
            arraylist.add(new Parameter("page", String.valueOf(j)));
        }
        if (set != null)
        {
            arraylist.add(new Parameter("membertypes", StringUtilities.join(set, ",")));
        }
        OAuthUtils.addOAuthToken(arraylist);
        s = transportAPI.postJSON(sharedSecret, arraylist);
        if (s.isError())
        {
            throw new FlickrException(s.getErrorCode(), s.getErrorMessage());
        }
        s = s.getData().getJSONObject("members");
        memberslist.setPage(s.getInt("page"));
        memberslist.setPages(s.getInt("pages"));
        memberslist.setPerPage(s.getInt("perpage"));
        memberslist.setTotal(s.getInt("total"));
        s = s.optJSONArray("member");
        i = 0;
        do
        {
            if (s == null || i >= s.length())
            {
                return memberslist;
            }
            memberslist.add(parseMember(s.getJSONObject(i)));
            i++;
        } while (true);
    }
}
