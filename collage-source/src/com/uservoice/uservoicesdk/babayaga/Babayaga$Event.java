// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.babayaga;


// Referenced classes of package com.uservoice.uservoicesdk.babayaga:
//            Babayaga

public static final class code extends Enum
{

    private static final COMMENT_IDEA $VALUES[];
    public static final COMMENT_IDEA AUTHENTICATE;
    public static final COMMENT_IDEA COMMENT_IDEA;
    public static final COMMENT_IDEA IDENTIFY;
    public static final COMMENT_IDEA SEARCH_ARTICLES;
    public static final COMMENT_IDEA SEARCH_IDEAS;
    public static final COMMENT_IDEA SUBMIT_IDEA;
    public static final COMMENT_IDEA SUBMIT_TICKET;
    public static final COMMENT_IDEA SUBSCRIBE_IDEA;
    public static final COMMENT_IDEA VIEW_APP;
    public static final COMMENT_IDEA VIEW_ARTICLE;
    public static final COMMENT_IDEA VIEW_CHANNEL;
    public static final COMMENT_IDEA VIEW_FORUM;
    public static final COMMENT_IDEA VIEW_IDEA;
    public static final COMMENT_IDEA VIEW_KB;
    public static final COMMENT_IDEA VIEW_TOPIC;
    public static final COMMENT_IDEA VOTE_ARTICLE;
    public static final COMMENT_IDEA VOTE_IDEA;
    private final String code;

    public static code valueOf(String s)
    {
        return (code)Enum.valueOf(com/uservoice/uservoicesdk/babayaga/Babayaga$Event, s);
    }

    public static code[] values()
    {
        return (code[])$VALUES.clone();
    }

    public String getCode()
    {
        return code;
    }

    static 
    {
        VIEW_APP = new <init>("VIEW_APP", 0, "g");
        VIEW_FORUM = new <init>("VIEW_FORUM", 1, "m");
        VIEW_TOPIC = new <init>("VIEW_TOPIC", 2, "c");
        VIEW_KB = new <init>("VIEW_KB", 3, "k");
        VIEW_CHANNEL = new <init>("VIEW_CHANNEL", 4, "o");
        VIEW_IDEA = new <init>("VIEW_IDEA", 5, "i");
        VIEW_ARTICLE = new <init>("VIEW_ARTICLE", 6, "f");
        AUTHENTICATE = new <init>("AUTHENTICATE", 7, "u");
        SEARCH_IDEAS = new <init>("SEARCH_IDEAS", 8, "s");
        SEARCH_ARTICLES = new <init>("SEARCH_ARTICLES", 9, "r");
        VOTE_IDEA = new <init>("VOTE_IDEA", 10, "v");
        VOTE_ARTICLE = new <init>("VOTE_ARTICLE", 11, "z");
        SUBMIT_TICKET = new <init>("SUBMIT_TICKET", 12, "t");
        SUBMIT_IDEA = new <init>("SUBMIT_IDEA", 13, "d");
        SUBSCRIBE_IDEA = new <init>("SUBSCRIBE_IDEA", 14, "b");
        IDENTIFY = new <init>("IDENTIFY", 15, "y");
        COMMENT_IDEA = new <init>("COMMENT_IDEA", 16, "h");
        $VALUES = (new .VALUES[] {
            VIEW_APP, VIEW_FORUM, VIEW_TOPIC, VIEW_KB, VIEW_CHANNEL, VIEW_IDEA, VIEW_ARTICLE, AUTHENTICATE, SEARCH_IDEAS, SEARCH_ARTICLES, 
            VOTE_IDEA, VOTE_ARTICLE, SUBMIT_TICKET, SUBMIT_IDEA, SUBSCRIBE_IDEA, IDENTIFY, COMMENT_IDEA
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        code = s1;
    }
}
