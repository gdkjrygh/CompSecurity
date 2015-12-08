// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.util.Pair;
import com.pinterest.base.Constants;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api.model:
//            FollowableModel, User, Pin, Interest, 
//            MyUser, ModelHelper

public class Board extends FollowableModel
{

    public static final String LAYOUT_DEFAULT = "default";
    public static final String LAYOUT_PLACE = "places";
    public static final String TYPE = "board";
    private List _interestList;
    private List _pinList;
    private List _pinThumbnailUrls;
    private Date cacheExpirationDate;
    private String category;
    private Boolean collaborative;
    private Boolean collaborator;
    private Integer collaboratorCount;
    private Boolean collaboratorInvitesEnabled;
    private Date createdAt;
    private String description;
    private Integer followerCount;
    private Boolean following;
    private Long id;
    private String imageCoverThumbnail;
    private String imageCoverUrl;
    private String imagePreviewUrl;
    private String imageThumbnailUrls;
    private Integer largestPinIndex;
    private Date lastModifiedAt;
    private String layout;
    private String name;
    private Integer pinCount;
    private String pinImageUrls;
    private String recommendationBlob;
    private String recommendationBoardUid;
    private String recommendationReason;
    private Boolean secret;
    private Date syncedAt;
    private String uid;
    private String url;
    public User user;
    private String userUid;

    public Board()
    {
        collaboratorInvitesEnabled = Boolean.valueOf(true);
        pinCount = Integer.valueOf(-1);
        followerCount = Integer.valueOf(-1);
        collaboratorCount = Integer.valueOf(-1);
    }

    public Board(Long long1)
    {
        collaboratorInvitesEnabled = Boolean.valueOf(true);
        pinCount = Integer.valueOf(-1);
        followerCount = Integer.valueOf(-1);
        collaboratorCount = Integer.valueOf(-1);
        id = long1;
    }

    public Board(Long long1, Date date, String s, String s1, Date date1, Date date2, Date date3, 
            String s2, String s3, String s4, String s5, String s6, String s7, String s8, 
            String s9, String s10, Boolean boolean1, Boolean boolean2, Boolean boolean3, Boolean boolean4, Boolean boolean5, 
            Integer integer, Integer integer1, Integer integer2, Integer integer3, String s11, String s12, String s13, 
            String s14)
    {
        collaboratorInvitesEnabled = Boolean.valueOf(true);
        pinCount = Integer.valueOf(-1);
        followerCount = Integer.valueOf(-1);
        collaboratorCount = Integer.valueOf(-1);
        id = long1;
        cacheExpirationDate = date;
        uid = s;
        userUid = s1;
        createdAt = date1;
        syncedAt = date2;
        lastModifiedAt = date3;
        name = s2;
        category = s3;
        description = s4;
        url = s5;
        imageThumbnailUrls = s6;
        pinImageUrls = s7;
        imagePreviewUrl = s8;
        imageCoverUrl = s9;
        imageCoverThumbnail = s10;
        following = boolean1;
        collaborative = boolean2;
        collaboratorInvitesEnabled = boolean3;
        collaborator = boolean4;
        secret = boolean5;
        largestPinIndex = integer;
        pinCount = integer1;
        followerCount = integer2;
        collaboratorCount = integer3;
        layout = s11;
        recommendationBlob = s12;
        recommendationReason = s13;
        recommendationBoardUid = s14;
    }

    private static void cacheBoard(final BoardArtifact artifact)
    {
        (new _cls1()).execute();
    }

    private static Pair getPinImageUrlAndIndex(PinterestJsonArray pinterestjsonarray)
    {
        Integer integer = Integer.valueOf(0);
        Integer integer1 = Integer.valueOf(0);
        if (pinterestjsonarray == null || pinterestjsonarray.a() == 0)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        int j = pinterestjsonarray.a();
        for (int i = 0; i < j; i++)
        {
            String s = pinterestjsonarray.d(i).a("url", null);
            Integer integer2 = Integer.valueOf(pinterestjsonarray.d(i).a("height", 0));
            if (integer2.intValue() > integer.intValue())
            {
                integer1 = Integer.valueOf(i);
                integer = integer2;
            }
            if (s != null)
            {
                stringbuilder.append((new StringBuilder(",")).append(s).toString());
            }
        }

        return Pair.create(stringbuilder.toString().substring(1), integer1);
    }

    private static String getThumbnailUrlsEntry(PinterestJsonArray pinterestjsonarray)
    {
        if (pinterestjsonarray == null || pinterestjsonarray.a() == 0)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        for (int j = pinterestjsonarray.a(); i < j; i++)
        {
            String s = pinterestjsonarray.d(i).a("url", null);
            if (s != null)
            {
                stringbuilder.append((new StringBuilder(",")).append(s).toString());
            }
        }

        return stringbuilder.toString().substring(1);
    }

    public static final boolean isNameValid(String s)
    {
        return s.trim().length() > 0;
    }

    public static BoardArtifact make(PinterestJsonObject pinterestjsonobject, boolean flag)
    {
        return make(pinterestjsonobject, flag, true);
    }

    public static BoardArtifact make(PinterestJsonObject pinterestjsonobject, boolean flag, boolean flag1)
    {
        if (pinterestjsonobject == null)
        {
            return null;
        }
        BoardArtifact boardartifact = new BoardArtifact();
        Object obj = pinterestjsonobject.c("data");
        if (obj != null)
        {
            pinterestjsonobject = ((PinterestJsonObject) (obj));
        }
        PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject.c("owner");
        obj = pinterestjsonobject.d("pins");
        Board board = (Board)pinterestjsonobject.a(com/pinterest/api/model/Board);
        if (pinterestjsonobject.f("privacy"))
        {
            board.setSecret(Boolean.valueOf(pinterestjsonobject.a("privacy", "public").equalsIgnoreCase("secret")));
        }
        Object obj1 = pinterestjsonobject.d("interests");
        PinterestJsonObject pinterestjsonobject2 = pinterestjsonobject.c("cover_images");
        if (pinterestjsonobject2 != null)
        {
            pinterestjsonobject2 = pinterestjsonobject2.c("60x60");
            if (pinterestjsonobject2 != null)
            {
                board.setImageCoverThumbnail(pinterestjsonobject2.a("url", null));
            }
        }
        pinterestjsonobject2 = pinterestjsonobject.c("images");
        if (pinterestjsonobject2 != null)
        {
            board.setImageThumbnailUrls(getThumbnailUrlsEntry(pinterestjsonobject2.e("90x90")));
            parsePinImageUrls(pinterestjsonobject2.e("200x"), board);
            parsePinImageUrls(pinterestjsonobject2.e("236x"), board);
            parsePinImageUrls(pinterestjsonobject2.e("345x"), board);
            parsePinImageUrls(pinterestjsonobject2.e("750x"), board);
        }
        pinterestjsonobject = pinterestjsonobject.d("pin_thumbnail_urls");
        if (pinterestjsonobject != null)
        {
            ArrayList arraylist = new ArrayList();
            for (int i = 0; i < pinterestjsonobject.a(); i++)
            {
                arraylist.add(pinterestjsonobject.a(i));
            }

            board.setPinThumbnailUrls(arraylist);
        }
        if (pinterestjsonobject1 != null)
        {
            pinterestjsonobject = User.make(pinterestjsonobject1, flag, flag1);
            board.setUserUid(pinterestjsonobject.getUid());
        } else
        {
            pinterestjsonobject = null;
        }
        if (obj != null)
        {
            board.setPinList(Pin.makeAll(((PinterestJsonArray) (obj))));
        }
        if (obj1 != null)
        {
            board.setInterestList(Interest.makeAll(((PinterestJsonArray) (obj1))));
        }
        if (MyUser.isUserMe(board.getUserUid()))
        {
            board.setCacheExpirationDate(ModelHelper.extendedCacheExpirationDate());
        }
        obj1 = board;
        obj = pinterestjsonobject;
        if (flag1)
        {
            obj1 = merge(board);
            obj = User.merge(pinterestjsonobject);
        }
        boardartifact.setBoard(((Board) (obj1)));
        boardartifact.setUser(((User) (obj)));
        if (flag)
        {
            cacheBoard(boardartifact);
        }
        return boardartifact;
    }

    public static Board make(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject == null)
        {
            return null;
        } else
        {
            return make(pinterestjsonobject, true).getBoard();
        }
    }

    public static List makeAll(PinterestJsonArray pinterestjsonarray)
    {
        ArrayList arraylist = new ArrayList();
        if (pinterestjsonarray == null)
        {
            return arraylist;
        }
        ArrayList arraylist3 = new ArrayList();
        Object obj = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        int j = pinterestjsonarray.a();
        for (int i = 0; i < j; i++)
        {
            BoardArtifact boardartifact = make(pinterestjsonarray.d(i), false, false);
            if (boardartifact.getBoard() != null)
            {
                arraylist.add(boardartifact.getBoard());
                arraylist3.add(boardartifact.getBoard().getUid());
            }
            if (boardartifact.getUser() == null)
            {
                continue;
            }
            arraylist2.add(boardartifact.getUser());
            ((List) (obj)).add(boardartifact.getUser().getUid());
            if (boardartifact.getUser().getPartner() != null)
            {
                arraylist1.add(boardartifact.getUser().getPartner());
            }
        }

        pinterestjsonarray = mergeAll(arraylist, ModelHelper.getBoards(arraylist3));
        obj = User.mergeAll(arraylist2, ModelHelper.getUsers(((List) (obj))));
        ModelHelper.setBoards(pinterestjsonarray);
        ModelHelper.setPartners(arraylist1);
        ModelHelper.setUsers(((List) (obj)));
        return arraylist;
    }

    public static Board merge(Board board)
    {
        if (board == null)
        {
            return null;
        } else
        {
            return merge(board, ModelHelper.getBoard(board.getUid()));
        }
    }

    public static Board merge(Board board, Board board1)
    {
        Board board2;
        if (board == null)
        {
            board2 = null;
        } else
        {
            board2 = board;
            if (board1 != null)
            {
                if (board.cacheExpirationDate != null)
                {
                    board1.cacheExpirationDate = board.cacheExpirationDate;
                }
                if (board.lastModifiedAt != null)
                {
                    board1.lastModifiedAt = board.lastModifiedAt;
                }
                if (board.userUid != null)
                {
                    board1.userUid = board.userUid;
                }
                if (board.createdAt != null)
                {
                    board1.createdAt = board.createdAt;
                }
                if (board.syncedAt != null)
                {
                    board1.syncedAt = board.syncedAt;
                }
                if (board.name != null)
                {
                    board1.name = board.name;
                }
                if (board.category != null)
                {
                    board1.category = board.category;
                }
                if (board.description != null)
                {
                    board1.description = board.description;
                }
                if (board.url != null)
                {
                    board1.url = board.url;
                }
                if (board.imageThumbnailUrls != null)
                {
                    board1.imageThumbnailUrls = board.imageThumbnailUrls;
                }
                if (board.pinImageUrls != null)
                {
                    board1.pinImageUrls = board.pinImageUrls;
                }
                if (board.largestPinIndex != null)
                {
                    board1.largestPinIndex = board.largestPinIndex;
                }
                if (board.imagePreviewUrl != null)
                {
                    board1.imagePreviewUrl = board.imagePreviewUrl;
                }
                if (board.imageCoverUrl != null)
                {
                    board1.imageCoverUrl = board.imageCoverUrl;
                }
                if (board.imageCoverThumbnail != null)
                {
                    board1.imageCoverThumbnail = board.imageCoverThumbnail;
                }
                if (board.following != null)
                {
                    board1.following = board.following;
                }
                if (board.collaborative != null)
                {
                    board1.collaborative = board.collaborative;
                }
                if (board.collaboratorInvitesEnabled != null)
                {
                    board1.collaboratorInvitesEnabled = board.collaboratorInvitesEnabled;
                }
                if (board.collaborator != null)
                {
                    board1.collaborator = board.collaborator;
                }
                if (board.secret != null)
                {
                    board1.secret = board.secret;
                }
                if (board.pinCount != null && board.pinCount.intValue() >= 0)
                {
                    board1.pinCount = board.pinCount;
                }
                if (board._pinList != null)
                {
                    board1._pinList = board._pinList;
                }
                if (board._pinThumbnailUrls != null)
                {
                    board1._pinThumbnailUrls = board._pinThumbnailUrls;
                }
                if (board._interestList != null)
                {
                    board1._interestList = board._interestList;
                }
                if (board.followerCount != null && board.followerCount.intValue() >= 0)
                {
                    board1.followerCount = board.followerCount;
                }
                if (board.collaboratorCount != null && board.collaboratorCount.intValue() >= 0)
                {
                    board1.collaboratorCount = board.collaboratorCount;
                }
                if (board.layout != null)
                {
                    board1.layout = board.layout;
                }
                if (board.imageThumbnailUrls != null)
                {
                    board1.imageThumbnailUrls = board.imageThumbnailUrls;
                }
                if (board.recommendationBlob != null)
                {
                    board1.recommendationBlob = board.recommendationBlob;
                }
                if (board.recommendationReason != null)
                {
                    board1.recommendationReason = board.recommendationReason;
                }
                if (board.recommendationBoardUid != null)
                {
                    board1.recommendationBoardUid = board.recommendationBoardUid;
                }
                return board1;
            }
        }
        return board2;
    }

    public static List mergeAll(List list, List list1)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            Board board = (Board)iterator.next();
            int i = list1.indexOf(board);
            if (i != -1)
            {
                list = (Board)list1.get(i);
            } else
            {
                list = null;
            }
            arraylist.add(merge(board, list));
        }
        return arraylist;
    }

    private static void parsePinImageUrls(PinterestJsonArray pinterestjsonarray, Board board)
    {
        if (pinterestjsonarray != null)
        {
            if ((pinterestjsonarray = getPinImageUrlAndIndex(pinterestjsonarray)) != null)
            {
                board.setPinImageUrls((String)((Pair) (pinterestjsonarray)).first);
                board.setLargestPinIndex((Integer)((Pair) (pinterestjsonarray)).second);
                return;
            }
        }
    }

    public boolean allowToInviteOthers()
    {
        return MyUser.isUserMe(userUid) || Constants.isTrue(collaborator) && Constants.isTrue(collaboratorInvitesEnabled);
    }

    public void cacheUser(User user1)
    {
        user = user1;
    }

    public boolean equals(Object obj)
    {
        while (obj == null || getUid() == null || !(obj instanceof Board) || !getUid().equals(((Board)obj).getUid())) 
        {
            return false;
        }
        return true;
    }

    public Date getCacheExpirationDate()
    {
        return cacheExpirationDate;
    }

    public String getCategory()
    {
        return category;
    }

    public Boolean getCollaborative()
    {
        return collaborative;
    }

    public Boolean getCollaborator()
    {
        return collaborator;
    }

    public Integer getCollaboratorCount()
    {
        return collaboratorCount;
    }

    public Boolean getCollaboratorInvitesEnabled()
    {
        return collaboratorInvitesEnabled;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public String getDescription()
    {
        return description;
    }

    public int getFollowCountDisplay()
    {
        if (followerCount == null || followerCount.intValue() <= 0)
        {
            return 0;
        } else
        {
            return followerCount.intValue();
        }
    }

    public Integer getFollowerCount()
    {
        return followerCount;
    }

    public Boolean getFollowing()
    {
        return following;
    }

    public Long getId()
    {
        return id;
    }

    public String getImageCoverThumbnail()
    {
        return imageCoverThumbnail;
    }

    public String getImageCoverUrl()
    {
        return imageCoverUrl;
    }

    public String getImagePreviewUrl()
    {
        return imagePreviewUrl;
    }

    public String getImageThumbnailUrls()
    {
        return imageThumbnailUrls;
    }

    public List getImageThumbnailsList()
    {
        if (ModelHelper.isValid(imageThumbnailUrls))
        {
            return Arrays.asList(imageThumbnailUrls.split(","));
        } else
        {
            return new ArrayList();
        }
    }

    public List getInterestList()
    {
        return _interestList;
    }

    public Integer getLargestPinIndex()
    {
        return largestPinIndex;
    }

    public Date getLastModifiedAt()
    {
        return lastModifiedAt;
    }

    public String getLayout()
    {
        return layout;
    }

    public String getName()
    {
        return name;
    }

    public Integer getPinCount()
    {
        return pinCount;
    }

    public int getPinCountDisplay()
    {
        if (pinCount == null || pinCount.intValue() <= 0)
        {
            return 0;
        } else
        {
            return pinCount.intValue();
        }
    }

    public String getPinImageUrls()
    {
        return pinImageUrls;
    }

    public List getPinImagesList()
    {
        if (ModelHelper.isValid(pinImageUrls))
        {
            return Arrays.asList(pinImageUrls.split(","));
        } else
        {
            return new ArrayList();
        }
    }

    public List getPinList()
    {
        return _pinList;
    }

    public List getPinThumbnailUrls()
    {
        return _pinThumbnailUrls;
    }

    public String getRecommendationBlob()
    {
        return recommendationBlob;
    }

    public String getRecommendationBoardUid()
    {
        return recommendationBoardUid;
    }

    public String getRecommendationReason()
    {
        return recommendationReason;
    }

    public Boolean getSecret()
    {
        return secret;
    }

    public Date getSyncedAt()
    {
        return syncedAt;
    }

    public String getUid()
    {
        return uid;
    }

    public String getUrl()
    {
        return url;
    }

    public User getUser()
    {
        if (user == null)
        {
            user = ModelHelper.getUser(getUserUid());
        }
        return user;
    }

    public String getUserUid()
    {
        return userUid;
    }

    public boolean hasDescription()
    {
        return StringUtils.isNotBlank(getDescription());
    }

    public boolean isMeOwnerOrCollaborator()
    {
        return Constants.isTrue(collaborator) || MyUser.isUserMe(userUid);
    }

    public boolean isPlaceBoard()
    {
        return "places".equals(layout);
    }

    public void setCacheExpirationDate(Date date)
    {
        cacheExpirationDate = date;
    }

    public void setCategory(String s)
    {
        category = s;
    }

    public void setCollaborative(Boolean boolean1)
    {
        collaborative = boolean1;
    }

    public void setCollaborator(Boolean boolean1)
    {
        collaborator = boolean1;
    }

    public void setCollaboratorCount(Integer integer)
    {
        collaboratorCount = integer;
    }

    public void setCollaboratorInvitesEnabled(Boolean boolean1)
    {
        collaboratorInvitesEnabled = boolean1;
    }

    public void setCreatedAt(Date date)
    {
        createdAt = date;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setFollowerCount(Integer integer)
    {
        followerCount = integer;
    }

    public void setFollowing(Boolean boolean1)
    {
        following = boolean1;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setImageCoverThumbnail(String s)
    {
        imageCoverThumbnail = s;
    }

    public void setImageCoverUrl(String s)
    {
        imageCoverUrl = s;
    }

    public void setImagePreviewUrl(String s)
    {
        imagePreviewUrl = s;
    }

    public void setImageThumbnailUrls(String s)
    {
        imageThumbnailUrls = s;
    }

    public void setImageThumbnailsList(List list)
    {
        setImageThumbnailUrls(list.toString().replaceAll("(^.|.$)", "").replace(", ", ","));
        ModelHelper.setBoard(this);
    }

    public void setInterestList(List list)
    {
        _interestList = list;
    }

    public void setLargestPinIndex(Integer integer)
    {
        largestPinIndex = integer;
    }

    public void setLastModifiedAt(Date date)
    {
        lastModifiedAt = date;
    }

    public void setLayout(String s)
    {
        layout = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPinCount(Integer integer)
    {
        pinCount = integer;
    }

    public void setPinImageUrls(String s)
    {
        pinImageUrls = s;
    }

    public void setPinList(List list)
    {
        _pinList = list;
    }

    public void setPinThumbnailUrls(List list)
    {
        _pinThumbnailUrls = list;
    }

    public void setRecommendationBlob(String s)
    {
        recommendationBlob = s;
    }

    public void setRecommendationBoardUid(String s)
    {
        recommendationBoardUid = s;
    }

    public void setRecommendationReason(String s)
    {
        recommendationReason = s;
    }

    public void setSecret(Boolean boolean1)
    {
        secret = boolean1;
    }

    public void setSyncedAt(Date date)
    {
        syncedAt = date;
    }

    public void setUid(String s)
    {
        uid = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public void setUserUid(String s)
    {
        userUid = s;
    }

    private class _cls1 extends BackgroundTask
    {

        final BoardArtifact val$artifact;

        public final void run()
        {
            ModelHelper.setBoard(artifact.getBoard());
            ModelHelper.setPartner(artifact.getUser().getPartner());
            ModelHelper.setUser(artifact.getUser());
        }

        _cls1()
        {
            artifact = boardartifact;
            super();
        }
    }


    private class BoardArtifact
    {

        private Board board;
        private User user;

        public final Board getBoard()
        {
            return board;
        }

        public final User getUser()
        {
            return user;
        }

        public final void setBoard(Board board1)
        {
            board = board1;
        }

        public final void setUser(User user1)
        {
            user = user1;
        }

        public BoardArtifact()
        {
        }
    }

}
