// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            UIViewLogging

public static final class  extends Enum
{

    private static final genreKidsEntry $VALUES[];
    public static final genreKidsEntry actionBarBackButton;
    public static final genreKidsEntry actionBarKidsEntry;
    public static final genreKidsEntry actionBarKidsExit;
    public static final genreKidsEntry backButton;
    public static final genreKidsEntry genreKidsEntry;
    public static final genreKidsEntry moreButton;
    public static final genreKidsEntry slidingMenuClosed;
    public static final genreKidsEntry slidingMenuKidsEntry;
    public static final genreKidsEntry slidingMenuKidsExit;
    public static final genreKidsEntry slidingMenuOpened;
    public static final genreKidsEntry upButton;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/netflix/mediaclient/servicemgr/UIViewLogging$UIViewCommandName, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        moreButton = new <init>("moreButton", 0);
        upButton = new <init>("upButton", 1);
        backButton = new <init>("backButton", 2);
        actionBarBackButton = new <init>("actionBarBackButton", 3);
        actionBarKidsEntry = new <init>("actionBarKidsEntry", 4);
        actionBarKidsExit = new <init>("actionBarKidsExit", 5);
        slidingMenuKidsEntry = new <init>("slidingMenuKidsEntry", 6);
        slidingMenuKidsExit = new <init>("slidingMenuKidsExit", 7);
        slidingMenuOpened = new <init>("slidingMenuOpened", 8);
        slidingMenuClosed = new <init>("slidingMenuClosed", 9);
        genreKidsEntry = new <init>("genreKidsEntry", 10);
        $VALUES = (new .VALUES[] {
            moreButton, upButton, backButton, actionBarBackButton, actionBarKidsEntry, actionBarKidsExit, slidingMenuKidsEntry, slidingMenuKidsExit, slidingMenuOpened, slidingMenuClosed, 
            genreKidsEntry
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
