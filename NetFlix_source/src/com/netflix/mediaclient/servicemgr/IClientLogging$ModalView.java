// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;


// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            IClientLogging

public static final class A extends Enum
{

    private static final facebook $VALUES[];
    public static final facebook appLoading;
    public static final facebook audioSubtitlesSelector;
    public static final facebook badPayment;
    public static final facebook bob;
    public static final facebook browseTitles;
    public static final facebook characterDetails;
    public static final facebook customerService;
    public static final facebook emailConfirmation;
    public static final facebook episodesSelector;
    public static final facebook errorDialog;
    public static final facebook facebook;
    public static final facebook homeScreen;
    public static final facebook jfkGate;
    public static final facebook legalTerms;
    public static final facebook login;
    public static final facebook logout;
    public static final facebook maxStreamsReached;
    public static final facebook mdxPlayback;
    public static final facebook movieDetails;
    public static final facebook nmLanding;
    public static final facebook offerDetails;
    public static final facebook openSourceLicenses;
    public static final facebook orderConfirmation;
    public static final facebook originalDetails;
    public static final facebook payment;
    public static final facebook playback;
    public static final facebook playbackControls;
    public static final facebook postPlay;
    public static final facebook prePlayback;
    public static final facebook privacyPolicy;
    public static final facebook profilesGate;
    public static final facebook registration;
    public static final facebook search;
    public static final facebook searchResults;
    public static final facebook seasonsSelector;
    public static final facebook settings;
    public static final facebook signupPrompt;
    public static final facebook trickplay;
    public static final facebook upgradeStreamsError;
    public static final facebook upgradeStreamsPitch;
    public static final facebook upgradeStreamsPrompt;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/netflix/mediaclient/servicemgr/IClientLogging$ModalView, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        appLoading = new <init>("appLoading", 0);
        nmLanding = new <init>("nmLanding", 1);
        signupPrompt = new <init>("signupPrompt", 2);
        registration = new <init>("registration", 3);
        emailConfirmation = new <init>("emailConfirmation", 4);
        login = new <init>("login", 5);
        privacyPolicy = new <init>("privacyPolicy", 6);
        offerDetails = new <init>("offerDetails", 7);
        payment = new <init>("payment", 8);
        badPayment = new <init>("badPayment", 9);
        legalTerms = new <init>("legalTerms", 10);
        orderConfirmation = new <init>("orderConfirmation", 11);
        profilesGate = new <init>("profilesGate", 12);
        jfkGate = new <init>("jfkGate", 13);
        homeScreen = new <init>("homeScreen", 14);
        bob = new <init>("bob", 15);
        movieDetails = new <init>("movieDetails", 16);
        browseTitles = new <init>("browseTitles", 17);
        originalDetails = new <init>("originalDetails", 18);
        audioSubtitlesSelector = new <init>("audioSubtitlesSelector", 19);
        characterDetails = new <init>("characterDetails", 20);
        seasonsSelector = new <init>("seasonsSelector", 21);
        episodesSelector = new <init>("episodesSelector", 22);
        search = new <init>("search", 23);
        searchResults = new <init>("searchResults", 24);
        prePlayback = new <init>("prePlayback", 25);
        playback = new <init>("playback", 26);
        playbackControls = new <init>("playbackControls", 27);
        trickplay = new <init>("trickplay", 28);
        postPlay = new <init>("postPlay", 29);
        customerService = new <init>("customerService", 30);
        logout = new <init>("logout", 31);
        errorDialog = new <init>("errorDialog", 32);
        upgradeStreamsPitch = new <init>("upgradeStreamsPitch", 33);
        upgradeStreamsPrompt = new <init>("upgradeStreamsPrompt", 34);
        upgradeStreamsError = new <init>("upgradeStreamsError", 35);
        maxStreamsReached = new <init>("maxStreamsReached", 36);
        mdxPlayback = new <init>("mdxPlayback", 37);
        openSourceLicenses = new <init>("openSourceLicenses", 38);
        settings = new <init>("settings", 39);
        facebook = new <init>("facebook", 40);
        $VALUES = (new .VALUES[] {
            appLoading, nmLanding, signupPrompt, registration, emailConfirmation, login, privacyPolicy, offerDetails, payment, badPayment, 
            legalTerms, orderConfirmation, profilesGate, jfkGate, homeScreen, bob, movieDetails, browseTitles, originalDetails, audioSubtitlesSelector, 
            characterDetails, seasonsSelector, episodesSelector, search, searchResults, prePlayback, playback, playbackControls, trickplay, postPlay, 
            customerService, logout, errorDialog, upgradeStreamsPitch, upgradeStreamsPrompt, upgradeStreamsError, maxStreamsReached, mdxPlayback, openSourceLicenses, settings, 
            facebook
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
