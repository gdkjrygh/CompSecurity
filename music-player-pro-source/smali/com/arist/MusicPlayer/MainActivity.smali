.class public Lcom/arist/MusicPlayer/MainActivity;
.super Landroid/app/Activity;
.source "MainActivity.java"

# interfaces
.implements Lnet/coocent/android/xmlparser/LoadAppInfoListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/arist/MusicPlayer/MainActivity$MyReciever;,
        Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicCancel;,
        Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicDetail;,
        Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;,
        Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicRemove;,
        Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicUpdate;,
        Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerFolder;,
        Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;,
        Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMusic;,
        Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerNetMusic;,
        Lcom/arist/MusicPlayer/MainActivity$OnItemLongClickListenerMusic;,
        Lcom/arist/MusicPlayer/MainActivity$OnItemLongClickListenerNetMusic;,
        Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;
    }
.end annotation


# static fields
.field private static final DIALOG_MUEIC_DETAIL:I = 0x2

.field private static final DIALOG_MUEIC_EDIT:I = 0x3

.field public static final DIALOG_MUSIC:I = 0x1

.field private static final DIALOG_NET_MUSIC_CONFIRM:I = 0x4

.field public static final DIALOG_NET_MUSIC_OP:I = 0x5

.field private static final TYPE_FOLDER:I = 0x2

.field private static final TYPE_MUSIC:I = 0x3

.field private static final VP_BUTTONGRID:I = 0x0

.field private static final VP_FOLDERLIST:I = 0x1

.field private static final VP_MUSICLIST:I = 0x2

.field private static final VP_NETMUSICLIST:I = 0x3

.field private static final startAnim:I = 0x0

.field private static final stopAnim:I = 0x1


# instance fields
.field private anim:Landroid/view/animation/Animation;

.field private btnLocalMusic:Landroid/widget/Button;

.field private btnNext:Landroid/widget/ImageButton;

.field private btnPlay:Landroid/widget/ImageButton;

.field private btnPre:Landroid/widget/ImageButton;

.field private btn_equalizer:Landroid/widget/TextView;

.field private btn_exit:Landroid/widget/TextView;

.field private btn_playMode:Landroid/widget/TextView;

.field private btn_scan:Landroid/widget/TextView;

.field private btn_searchMusic:Landroid/widget/TextView;

.field private btn_setting:Landroid/widget/TextView;

.field private btn_skin:Landroid/widget/TextView;

.field private btn_sleep:Landroid/widget/TextView;

.field private btn_slideMenu:Landroid/widget/Button;

.field private buttonInfoBiz:Lcom/arist/biz/ButtonInfoBiz;

.field private comps:[Landroid/widget/ImageView;

.field private controlPanelArtistMain:Landroid/widget/TextView;

.field private controlPanelTitleMain:Landroid/widget/TextView;

.field private controlPanel_TextLayout:Landroid/widget/LinearLayout;

.field public currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

.field public currentPageIndex:I

.field private downloadMusicName:Ljava/lang/String;

.field private etNetMusicSearch:Landroid/widget/EditText;

.field private folderAdapter:Lcom/arist/Adapter/FolderAdapter;

.field private folderDao:Lcom/arist/dao/MusicFolderDao;

.field private folders:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/MusicFolder;",
            ">;"
        }
    .end annotation
.end field

.field private giftLayout:Landroid/widget/RelativeLayout;

.field private gv:Landroid/widget/GridView;

.field private handler:Landroid/os/Handler;

.field private inflater:Landroid/view/LayoutInflater;

.field private infos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/ButtonInfo;",
            ">;"
        }
    .end annotation
.end field

.field isExitAdLoad:Z

.field private isSleepOpened:Z

.field private ivAlbum:Landroid/widget/ImageView;

.field private ivNetMusicLoading:Landroid/widget/ImageView;

.field private iv_comp1:Landroid/widget/ImageView;

.field private iv_comp2:Landroid/widget/ImageView;

.field private iv_comp3:Landroid/widget/ImageView;

.field private jamendoMusicArray:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/yong/jamendo/api/JamendoMusic;",
            ">;"
        }
    .end annotation
.end field

.field private layout:Landroid/widget/RelativeLayout;

.field private listViewFolder:Landroid/widget/ListView;

.field private listViewMusic:Landroid/widget/ListView;

.field private listViewNetMusic:Landroid/widget/ListView;

.field mEnterAndExit:Lnet/coocent/android/exitwithrate/EnterAndExit;

.field mExitAdview:Lcom/google/android/gms/ads/AdView;

.field private mSlideHolder:Lcom/yong/slidemenu/SlideHolder;

.field private mainGridAdapter:Lcom/arist/Adapter/MainGridAdapter;

.field private mainPref:Lcom/arist/util/MainGridPreference;

.field private mediaScannerConnection:Landroid/media/MediaScannerConnection;

.field private mediaScannerConnectionClient:Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;

.field private musicAdapter:Lcom/arist/Adapter/MusicAdapter;

.field private musicBiz:Lcom/arist/biz/MusicBiz;

.field private musicDao:Lcom/arist/dao/MusicDao;

.field private musicProgressMain:Landroid/widget/ProgressBar;

.field private musics:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Music;",
            ">;"
        }
    .end annotation
.end field

.field private netMusicAdapter:Lcom/arist/Adapter/NetMusicAdapter;

.field private netMusicLayout:Landroid/widget/RelativeLayout;

.field onShareClickListtener:Landroid/view/View$OnClickListener;

.field private playModeEntries:[Ljava/lang/String;

.field private popupWindowSearch:Lcom/arist/PopMenu/PopupWindowSearch;

.field private reciever:Lcom/arist/MusicPlayer/MainActivity$MyReciever;

.field private screenWidth:I

.field private searchThreadRunning:Z

.field private seekProgress:I

.field private seekTimer:Ljava/util/Timer;

.field private seeking:Z

.field public selMusic:Lcom/arist/entity/Music;

.field private selectedButtonId:I

.field private sleepTime:I

.field private sleepTimer:Ljava/util/Timer;

.field private tv_netMusicTips:Landroid/widget/TextView;

.field private vpAdapter:Lcom/arist/Adapter/MyPagerAdapter;

.field private vpContainer:Landroid/support/v4/view/ViewPager;

.field private vpViews:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v0, 0x0

    const/4 v2, 0x4

    const/4 v1, 0x0

    .line 108
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 130
    iput v1, p0, Lcom/arist/MusicPlayer/MainActivity;->currentPageIndex:I

    .line 148
    iput-boolean v1, p0, Lcom/arist/MusicPlayer/MainActivity;->isExitAdLoad:Z

    .line 202
    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->popupWindowSearch:Lcom/arist/PopMenu/PopupWindowSearch;

    .line 206
    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->vpContainer:Landroid/support/v4/view/ViewPager;

    .line 209
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->vpViews:Ljava/util/ArrayList;

    .line 222
    iput v2, p0, Lcom/arist/MusicPlayer/MainActivity;->selectedButtonId:I

    .line 578
    iput-boolean v1, p0, Lcom/arist/MusicPlayer/MainActivity;->seeking:Z

    .line 753
    new-instance v0, Lcom/arist/MusicPlayer/MainActivity$1;

    invoke-direct {v0, p0}, Lcom/arist/MusicPlayer/MainActivity$1;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->onShareClickListtener:Landroid/view/View$OnClickListener;

    .line 1031
    iput v1, p0, Lcom/arist/MusicPlayer/MainActivity;->seekProgress:I

    .line 1270
    iput-boolean v1, p0, Lcom/arist/MusicPlayer/MainActivity;->isSleepOpened:Z

    .line 1272
    new-array v0, v2, [Ljava/lang/String;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->playModeEntries:[Ljava/lang/String;

    .line 1321
    const-string v0, ""

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->downloadMusicName:Ljava/lang/String;

    .line 1324
    new-instance v0, Lcom/arist/MusicPlayer/MainActivity$2;

    invoke-direct {v0, p0}, Lcom/arist/MusicPlayer/MainActivity$2;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mediaScannerConnectionClient:Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;

    .line 1692
    iput-boolean v1, p0, Lcom/arist/MusicPlayer/MainActivity;->searchThreadRunning:Z

    .line 1693
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->jamendoMusicArray:Ljava/util/ArrayList;

    .line 108
    return-void
.end method

.method static synthetic access$0(Lcom/arist/MusicPlayer/MainActivity;Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 575
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity;->anim:Landroid/view/animation/Animation;

    return-void
.end method

.method static synthetic access$1(Lcom/arist/MusicPlayer/MainActivity;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 570
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->ivAlbum:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$10(Lcom/arist/MusicPlayer/MainActivity;I)V
    .locals 0

    .prologue
    .line 486
    invoke-direct {p0, p1}, Lcom/arist/MusicPlayer/MainActivity;->updateView(I)V

    return-void
.end method

.method static synthetic access$11(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/util/MainGridPreference;
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    return-object v0
.end method

.method static synthetic access$12(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/Adapter/FolderAdapter;
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->folderAdapter:Lcom/arist/Adapter/FolderAdapter;

    return-object v0
.end method

.method static synthetic access$13(Lcom/arist/MusicPlayer/MainActivity;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 132
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic access$14(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 132
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$15(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/Adapter/MusicAdapter;
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->musicAdapter:Lcom/arist/Adapter/MusicAdapter;

    return-object v0
.end method

.method static synthetic access$16(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/Adapter/NetMusicAdapter;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->netMusicAdapter:Lcom/arist/Adapter/NetMusicAdapter;

    return-object v0
.end method

.method static synthetic access$17(Lcom/arist/MusicPlayer/MainActivity;)Z
    .locals 1

    .prologue
    .line 578
    iget-boolean v0, p0, Lcom/arist/MusicPlayer/MainActivity;->seeking:Z

    return v0
.end method

.method static synthetic access$18(Lcom/arist/MusicPlayer/MainActivity;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 571
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->musicProgressMain:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic access$19(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 1348
    invoke-direct {p0}, Lcom/arist/MusicPlayer/MainActivity;->updateView()V

    return-void
.end method

.method static synthetic access$2(Lcom/arist/MusicPlayer/MainActivity;)Landroid/view/animation/Animation;
    .locals 1

    .prologue
    .line 575
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->anim:Landroid/view/animation/Animation;

    return-object v0
.end method

.method static synthetic access$20(Lcom/arist/MusicPlayer/MainActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1321
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity;->downloadMusicName:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$21(Lcom/arist/MusicPlayer/MainActivity;)Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;
    .locals 1

    .prologue
    .line 1324
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mediaScannerConnectionClient:Landroid/media/MediaScannerConnection$MediaScannerConnectionClient;

    return-object v0
.end method

.method static synthetic access$22(Lcom/arist/MusicPlayer/MainActivity;Landroid/media/MediaScannerConnection;)V
    .locals 0

    .prologue
    .line 1322
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity;->mediaScannerConnection:Landroid/media/MediaScannerConnection;

    return-void
.end method

.method static synthetic access$23(Lcom/arist/MusicPlayer/MainActivity;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 576
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$24(Lcom/arist/MusicPlayer/MainActivity;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 583
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->etNetMusicSearch:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic access$25(Lcom/arist/MusicPlayer/MainActivity;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 584
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->tv_netMusicTips:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$26(Lcom/arist/MusicPlayer/MainActivity;)Z
    .locals 1

    .prologue
    .line 1692
    iget-boolean v0, p0, Lcom/arist/MusicPlayer/MainActivity;->searchThreadRunning:Z

    return v0
.end method

.method static synthetic access$27(Lcom/arist/MusicPlayer/MainActivity;Z)V
    .locals 0

    .prologue
    .line 1692
    iput-boolean p1, p0, Lcom/arist/MusicPlayer/MainActivity;->searchThreadRunning:Z

    return-void
.end method

.method static synthetic access$28(Lcom/arist/MusicPlayer/MainActivity;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 1693
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity;->jamendoMusicArray:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic access$29(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 1693
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->jamendoMusicArray:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$3(Lcom/arist/MusicPlayer/MainActivity;)Landroid/media/MediaScannerConnection;
    .locals 1

    .prologue
    .line 1322
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mediaScannerConnection:Landroid/media/MediaScannerConnection;

    return-object v0
.end method

.method static synthetic access$30(Lcom/arist/MusicPlayer/MainActivity;)Lcom/yong/slidemenu/SlideHolder;
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mSlideHolder:Lcom/yong/slidemenu/SlideHolder;

    return-object v0
.end method

.method static synthetic access$31(Lcom/arist/MusicPlayer/MainActivity;)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 1272
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->playModeEntries:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$32(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 460
    invoke-direct {p0}, Lcom/arist/MusicPlayer/MainActivity;->setPlaymodeLeftDrawable()V

    return-void
.end method

.method static synthetic access$33(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/PopMenu/PopupWindowSearch;
    .locals 1

    .prologue
    .line 202
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->popupWindowSearch:Lcom/arist/PopMenu/PopupWindowSearch;

    return-object v0
.end method

.method static synthetic access$34(Lcom/arist/MusicPlayer/MainActivity;)Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 213
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->listViewMusic:Landroid/widget/ListView;

    return-object v0
.end method

.method static synthetic access$35(Lcom/arist/MusicPlayer/MainActivity;)Z
    .locals 1

    .prologue
    .line 1270
    iget-boolean v0, p0, Lcom/arist/MusicPlayer/MainActivity;->isSleepOpened:Z

    return v0
.end method

.method static synthetic access$36(Lcom/arist/MusicPlayer/MainActivity;)Landroid/view/LayoutInflater;
    .locals 1

    .prologue
    .line 207
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->inflater:Landroid/view/LayoutInflater;

    return-object v0
.end method

.method static synthetic access$37(Lcom/arist/MusicPlayer/MainActivity;Landroid/view/View;Landroid/widget/EditText;)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 416
    invoke-direct {p0, p1, p2}, Lcom/arist/MusicPlayer/MainActivity;->createSleepSetDlg(Landroid/view/View;Landroid/widget/EditText;)Landroid/app/Dialog;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$38(Lcom/arist/MusicPlayer/MainActivity;Z)V
    .locals 0

    .prologue
    .line 1270
    iput-boolean p1, p0, Lcom/arist/MusicPlayer/MainActivity;->isSleepOpened:Z

    return-void
.end method

.method static synthetic access$39(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/Timer;
    .locals 1

    .prologue
    .line 1269
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->sleepTimer:Ljava/util/Timer;

    return-object v0
.end method

.method static synthetic access$4(Lcom/arist/MusicPlayer/MainActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1321
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->downloadMusicName:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$40(Lcom/arist/MusicPlayer/MainActivity;I)V
    .locals 0

    .prologue
    .line 1271
    iput p1, p0, Lcom/arist/MusicPlayer/MainActivity;->sleepTime:I

    return-void
.end method

.method static synthetic access$41(Lcom/arist/MusicPlayer/MainActivity;)I
    .locals 1

    .prologue
    .line 1271
    iget v0, p0, Lcom/arist/MusicPlayer/MainActivity;->sleepTime:I

    return v0
.end method

.method static synthetic access$42(Lcom/arist/MusicPlayer/MainActivity;Ljava/util/Timer;)V
    .locals 0

    .prologue
    .line 1269
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity;->sleepTimer:Ljava/util/Timer;

    return-void
.end method

.method static synthetic access$43(Lcom/arist/MusicPlayer/MainActivity;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 133
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity;->folders:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic access$44(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->folders:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$45(Lcom/arist/MusicPlayer/MainActivity;)Landroid/support/v4/view/ViewPager;
    .locals 1

    .prologue
    .line 206
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->vpContainer:Landroid/support/v4/view/ViewPager;

    return-object v0
.end method

.method static synthetic access$46(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 1406
    invoke-direct {p0}, Lcom/arist/MusicPlayer/MainActivity;->doPlayNext()V

    return-void
.end method

.method static synthetic access$47(Lcom/arist/MusicPlayer/MainActivity;Ljava/util/Timer;)V
    .locals 0

    .prologue
    .line 577
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity;->seekTimer:Ljava/util/Timer;

    return-void
.end method

.method static synthetic access$48(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/Timer;
    .locals 1

    .prologue
    .line 577
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->seekTimer:Ljava/util/Timer;

    return-object v0
.end method

.method static synthetic access$49(Lcom/arist/MusicPlayer/MainActivity;Z)V
    .locals 0

    .prologue
    .line 578
    iput-boolean p1, p0, Lcom/arist/MusicPlayer/MainActivity;->seeking:Z

    return-void
.end method

.method static synthetic access$5(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/dao/MusicDao;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;

    return-object v0
.end method

.method static synthetic access$50(Lcom/arist/MusicPlayer/MainActivity;)I
    .locals 1

    .prologue
    .line 1031
    iget v0, p0, Lcom/arist/MusicPlayer/MainActivity;->seekProgress:I

    return v0
.end method

.method static synthetic access$51(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 1400
    invoke-direct {p0}, Lcom/arist/MusicPlayer/MainActivity;->doPlayPre()V

    return-void
.end method

.method static synthetic access$52(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 1375
    invoke-direct {p0}, Lcom/arist/MusicPlayer/MainActivity;->doPlay()V

    return-void
.end method

.method static synthetic access$53(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/biz/ButtonInfoBiz;
    .locals 1

    .prologue
    .line 135
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->buttonInfoBiz:Lcom/arist/biz/ButtonInfoBiz;

    return-object v0
.end method

.method static synthetic access$54(Lcom/arist/MusicPlayer/MainActivity;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 134
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity;->infos:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic access$55(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/Adapter/MainGridAdapter;
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mainGridAdapter:Lcom/arist/Adapter/MainGridAdapter;

    return-object v0
.end method

.method static synthetic access$56(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->infos:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$57(Lcom/arist/MusicPlayer/MainActivity;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 209
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->vpViews:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$58(Lcom/arist/MusicPlayer/MainActivity;I[I)V
    .locals 0

    .prologue
    .line 1412
    invoke-direct {p0, p1, p2}, Lcom/arist/MusicPlayer/MainActivity;->setComps(I[I)V

    return-void
.end method

.method static synthetic access$59(Lcom/arist/MusicPlayer/MainActivity;I)V
    .locals 0

    .prologue
    .line 1031
    iput p1, p0, Lcom/arist/MusicPlayer/MainActivity;->seekProgress:I

    return-void
.end method

.method static synthetic access$6(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/dao/MusicFolderDao;
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->folderDao:Lcom/arist/dao/MusicFolderDao;

    return-object v0
.end method

.method static synthetic access$60(Lcom/arist/MusicPlayer/MainActivity;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 582
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->ivNetMusicLoading:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$7(Lcom/arist/MusicPlayer/MainActivity;)Lcom/arist/biz/MusicBiz;
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->musicBiz:Lcom/arist/biz/MusicBiz;

    return-object v0
.end method

.method static synthetic access$8(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 1745
    invoke-direct {p0}, Lcom/arist/MusicPlayer/MainActivity;->resetSetMainGrid()V

    return-void
.end method

.method static synthetic access$9(Lcom/arist/MusicPlayer/MainActivity;I)V
    .locals 0

    .prologue
    .line 222
    iput p1, p0, Lcom/arist/MusicPlayer/MainActivity;->selectedButtonId:I

    return-void
.end method

.method private createSleepSetDlg(Landroid/view/View;Landroid/widget/EditText;)Landroid/app/Dialog;
    .locals 4
    .param p1, "sleepView"    # Landroid/view/View;
    .param p2, "et"    # Landroid/widget/EditText;

    .prologue
    .line 417
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 418
    const v2, 0x7f080053

    invoke-virtual {p0, v2}, Lcom/arist/MusicPlayer/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 419
    const v2, 0x7f02007a

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 420
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 421
    invoke-virtual {v1, p1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 422
    const v2, 0x7f080052

    invoke-virtual {p0, v2}, Lcom/arist/MusicPlayer/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 423
    new-instance v3, Lcom/arist/MusicPlayer/MainActivity$13;

    invoke-direct {v3, p0, p2}, Lcom/arist/MusicPlayer/MainActivity$13;-><init>(Lcom/arist/MusicPlayer/MainActivity;Landroid/widget/EditText;)V

    .line 422
    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 455
    const v2, 0x7f080051

    invoke-virtual {p0, v2}, Lcom/arist/MusicPlayer/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 456
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 457
    .local v0, "dialog":Landroid/app/Dialog;
    return-object v0
.end method

.method private doPlay()V
    .locals 3

    .prologue
    .line 1376
    sget-boolean v1, Lcom/arist/MusicPlayer/MyApplication;->isplayNetMusic:Z

    if-eqz v1, :cond_2

    .line 1377
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getInstance()Lcom/arist/MusicPlayer/MyApplication;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/MusicPlayer/MyApplication;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1378
    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v1, :cond_0

    .line 1379
    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->pause()V

    .line 1380
    const/4 v1, 0x3

    sput v1, Lcom/arist/MusicPlayer/MyApplication;->status:I

    .line 1392
    :cond_0
    :goto_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.MediaPlayer.action.STATUS_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/arist/MusicPlayer/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 1398
    :goto_1
    return-void

    .line 1386
    :cond_1
    :try_start_0
    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V

    .line 1387
    const/4 v1, 0x2

    sput v1, Lcom/arist/MusicPlayer/MyApplication;->status:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1388
    :catch_0
    move-exception v1

    goto :goto_0

    .line 1394
    :cond_2
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 1395
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "com.MediaPlayer.action.PLAY"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1396
    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_1
.end method

.method private doPlayNext()V
    .locals 2

    .prologue
    .line 1407
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 1408
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "com.MediaPlayer.action.NEXT"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1409
    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 1410
    return-void
.end method

.method private doPlayPre()V
    .locals 2

    .prologue
    .line 1401
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 1402
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "com.MediaPlayer.action.PREVIOUS"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1403
    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 1404
    return-void
.end method

.method private initListener()V
    .locals 3

    .prologue
    .line 587
    const v0, 0x7f0d0026

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->iv_comp1:Landroid/widget/ImageView;

    .line 588
    const v0, 0x7f0d0027

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->iv_comp2:Landroid/widget/ImageView;

    .line 589
    const v0, 0x7f0d0028

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->iv_comp3:Landroid/widget/ImageView;

    .line 591
    const/4 v0, 0x3

    new-array v0, v0, [Landroid/widget/ImageView;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity;->iv_comp1:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity;->iv_comp2:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity;->iv_comp3:Landroid/widget/ImageView;

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->comps:[Landroid/widget/ImageView;

    .line 593
    const v0, 0x7f0d002d

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btnNext:Landroid/widget/ImageButton;

    .line 594
    const v0, 0x7f0d002b

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btnPre:Landroid/widget/ImageButton;

    .line 595
    const v0, 0x7f0d002c

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btnPlay:Landroid/widget/ImageButton;

    .line 596
    const v0, 0x7f0d0031

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->ivAlbum:Landroid/widget/ImageView;

    .line 597
    const v0, 0x7f0d0032

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->controlPanel_TextLayout:Landroid/widget/LinearLayout;

    .line 598
    const v0, 0x7f0d0030

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->musicProgressMain:Landroid/widget/ProgressBar;

    .line 599
    const v0, 0x7f0d0033

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->controlPanelTitleMain:Landroid/widget/TextView;

    .line 600
    const v0, 0x7f0d0034

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->controlPanelArtistMain:Landroid/widget/TextView;

    .line 601
    const v0, 0x7f0d0023

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btnLocalMusic:Landroid/widget/Button;

    .line 605
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btnLocalMusic:Landroid/widget/Button;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$17;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$17;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 620
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btnNext:Landroid/widget/ImageButton;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$18;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$18;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 626
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btnNext:Landroid/widget/ImageButton;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$19;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$19;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 645
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btnNext:Landroid/widget/ImageButton;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$20;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$20;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 660
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btnPre:Landroid/widget/ImageButton;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$21;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$21;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 666
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btnPre:Landroid/widget/ImageButton;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$22;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$22;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 685
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btnPre:Landroid/widget/ImageButton;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$23;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$23;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 700
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btnPlay:Landroid/widget/ImageButton;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$24;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$24;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 705
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->ivAlbum:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->onShareClickListtener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 706
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->controlPanel_TextLayout:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->onShareClickListtener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 708
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->vpContainer:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$25;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$25;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 751
    return-void
.end method

.method private resetSetMainGrid()V
    .locals 5

    .prologue
    .line 1747
    :try_start_0
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musicBiz:Lcom/arist/biz/MusicBiz;

    invoke-virtual {v1}, Lcom/arist/biz/MusicBiz;->getRecentAddMusic()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MainGridPreference;->saveAdd(I)V

    .line 1748
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v1}, Lcom/arist/dao/MusicDao;->getAlbumNum()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MainGridPreference;->saveAlbum(I)V

    .line 1749
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v1}, Lcom/arist/dao/MusicDao;->getAllMusic()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MainGridPreference;->saveAllMusic(I)V

    .line 1750
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v1}, Lcom/arist/dao/MusicDao;->getArtistNum()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MainGridPreference;->saveArtist(I)V

    .line 1751
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;

    .line 1752
    sget-object v2, Lcom/arist/util/Constant;->BASE_DOWNLOAD_PATH:Ljava/lang/String;

    const/4 v3, 0x0

    .line 1753
    sget-object v4, Lcom/arist/util/Constant;->BASE_DOWNLOAD_PATH:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    .line 1752
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 1751
    invoke-virtual {v1, v2}, Lcom/arist/dao/MusicDao;->getMusic(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    .line 1753
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 1751
    invoke-virtual {v0, v1}, Lcom/arist/util/MainGridPreference;->saveDownload(I)V

    .line 1754
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    invoke-static {}, Lcom/arist/util/FavMusicXmlUtil;->getFavMusic()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MainGridPreference;->saveFav(I)V

    .line 1755
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v1}, Lcom/arist/dao/MusicDao;->getFolder()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MainGridPreference;->saveFolder(I)V

    .line 1757
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->buttonInfoBiz:Lcom/arist/biz/ButtonInfoBiz;

    invoke-virtual {v0}, Lcom/arist/biz/ButtonInfoBiz;->getButtonInfos()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->infos:Ljava/util/ArrayList;

    .line 1758
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mainGridAdapter:Lcom/arist/Adapter/MainGridAdapter;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->infos:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/arist/Adapter/MainGridAdapter;->setData(Ljava/util/ArrayList;)V

    .line 1759
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mainGridAdapter:Lcom/arist/Adapter/MainGridAdapter;

    invoke-virtual {v0}, Lcom/arist/Adapter/MainGridAdapter;->notifyDataSetChanged()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1762
    :goto_0
    return-void

    .line 1760
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private setComps(I[I)V
    .locals 5
    .param p1, "pageCount"    # I
    .param p2, "position"    # [I

    .prologue
    const v4, 0x7f0200a4

    const v3, 0x7f0200a3

    const/4 v2, 0x1

    .line 1413
    const/4 v1, 0x3

    if-ne p1, v1, :cond_3

    .line 1414
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-lt v0, p1, :cond_1

    .line 1428
    :cond_0
    return-void

    .line 1415
    :cond_1
    aget v1, p2, v0

    if-ne v1, v2, :cond_2

    .line 1416
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->comps:[Landroid/widget/ImageView;

    aget-object v1, v1, v0

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1414
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1418
    :cond_2
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->comps:[Landroid/widget/ImageView;

    aget-object v1, v1, v0

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 1421
    .end local v0    # "i":I
    :cond_3
    const/4 v0, 0x0

    .restart local v0    # "i":I
    :goto_2
    if-ge v0, p1, :cond_0

    .line 1422
    aget v1, p2, v0

    if-ne v1, v2, :cond_4

    .line 1423
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->comps:[Landroid/widget/ImageView;

    aget-object v1, v1, v0

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1421
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1425
    :cond_4
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->comps:[Landroid/widget/ImageView;

    aget-object v1, v1, v0

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_3
.end method

.method private setPlaymodeLeftDrawable()V
    .locals 6

    .prologue
    const v3, 0x7f020089

    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 461
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 462
    .local v1, "res":Landroid/content/res/Resources;
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 463
    .local v0, "img_playmode":Landroid/graphics/drawable/Drawable;
    sget v2, Lcom/arist/MusicPlayer/MyApplication;->playMode:I

    packed-switch v2, :pswitch_data_0

    .line 480
    :goto_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v2

    .line 481
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v3

    .line 480
    invoke-virtual {v0, v5, v5, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 483
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity;->btn_playMode:Landroid/widget/TextView;

    invoke-virtual {v2, v0, v4, v4, v4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 484
    return-void

    .line 465
    :pswitch_0
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 466
    goto :goto_0

    .line 468
    :pswitch_1
    const v2, 0x7f02008c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 469
    goto :goto_0

    .line 471
    :pswitch_2
    const v2, 0x7f02008a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 472
    goto :goto_0

    .line 474
    :pswitch_3
    const v2, 0x7f02008b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 475
    goto :goto_0

    .line 463
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private sortMusicList(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Music;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 556
    .local p1, "musics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    new-instance v0, Lcom/arist/MusicPlayer/MainActivity$16;

    invoke-direct {v0, p0}, Lcom/arist/MusicPlayer/MainActivity$16;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 565
    return-void
.end method

.method private startActivitySafely(Landroid/content/Intent;)V
    .locals 1
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 815
    const/high16 v0, 0x10000000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 817
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/arist/MusicPlayer/MainActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1

    .line 821
    :goto_0
    return-void

    .line 818
    :catch_0
    move-exception v0

    goto :goto_0

    .line 819
    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method private updateView()V
    .locals 4

    .prologue
    .line 1349
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->controlPanelTitleMain:Landroid/widget/TextView;

    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1350
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->controlPanelArtistMain:Landroid/widget/TextView;

    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicArtist()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1351
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musicProgressMain:Landroid/widget/ProgressBar;

    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicProgress()I

    move-result v2

    mul-int/lit16 v2, v2, 0x3e8

    .line 1352
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicDuration()I

    move-result v3

    div-int/2addr v2, v3

    .line 1351
    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 1354
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/MainActivity;->updatePlayStatusView()V

    .line 1358
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentMusic()Lcom/arist/entity/Music;

    move-result-object v1

    .line 1357
    invoke-static {v1}, Lcom/arist/util/AlbumPicUtil;->getAlbumBitmap(Lcom/arist/entity/Music;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1359
    .local v0, "bmp":Landroid/graphics/Bitmap;
    if-nez v0, :cond_0

    .line 1360
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->ivAlbum:Landroid/widget/ImageView;

    const v2, 0x7f020056

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1364
    :goto_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.MediaPlayer.action.ALBUM_PIC_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/arist/MusicPlayer/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 1365
    return-void

    .line 1362
    :cond_0
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->ivAlbum:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

.method private updateView(I)V
    .locals 8
    .param p1, "type"    # I

    .prologue
    const-wide/16 v6, 0xc8

    const/4 v5, 0x1

    .line 487
    packed-switch p1, :pswitch_data_0

    .line 553
    :goto_0
    return-void

    .line 491
    :pswitch_0
    iget v1, p0, Lcom/arist/MusicPlayer/MainActivity;->selectedButtonId:I

    packed-switch v1, :pswitch_data_1

    .line 514
    :goto_1
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->folderAdapter:Lcom/arist/Adapter/FolderAdapter;

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity;->folders:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Lcom/arist/Adapter/FolderAdapter;->changeData(Ljava/util/ArrayList;)V

    .line 515
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->vpContainer:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1, v5, v5}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    goto :goto_0

    .line 493
    :pswitch_1
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v1}, Lcom/arist/dao/MusicDao;->getTempAlbums()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->folders:Ljava/util/ArrayList;

    .line 494
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;

    new-instance v2, Lcom/arist/MusicPlayer/MainActivity$14;

    invoke-direct {v2, p0}, Lcom/arist/MusicPlayer/MainActivity$14;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v1, v2, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    .line 502
    :pswitch_2
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v1}, Lcom/arist/dao/MusicDao;->getTempArtists()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->folders:Ljava/util/ArrayList;

    .line 503
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;

    new-instance v2, Lcom/arist/MusicPlayer/MainActivity$15;

    invoke-direct {v2, p0}, Lcom/arist/MusicPlayer/MainActivity$15;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v1, v2, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    .line 511
    :pswitch_3
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->folderDao:Lcom/arist/dao/MusicFolderDao;

    invoke-virtual {v1}, Lcom/arist/dao/MusicFolderDao;->getAllFolder()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->folders:Ljava/util/ArrayList;

    goto :goto_1

    .line 521
    :pswitch_4
    iget v1, p0, Lcom/arist/MusicPlayer/MainActivity;->selectedButtonId:I

    sparse-switch v1, :sswitch_data_0

    .line 548
    :goto_2
    :sswitch_0
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;

    invoke-direct {p0, v1}, Lcom/arist/MusicPlayer/MainActivity;->sortMusicList(Ljava/util/ArrayList;)V

    .line 549
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musicAdapter:Lcom/arist/Adapter/MusicAdapter;

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Lcom/arist/Adapter/MusicAdapter;->changeData(Ljava/util/ArrayList;)V

    .line 550
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->vpContainer:Landroid/support/v4/view/ViewPager;

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v5}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    goto :goto_0

    .line 523
    :sswitch_1
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v1}, Lcom/arist/dao/MusicDao;->getAllMusic()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;

    goto :goto_2

    .line 527
    :sswitch_2
    :try_start_0
    invoke-static {}, Lcom/arist/util/FavMusicXmlUtil;->getFavMusic()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;

    .line 528
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/arist/util/MainGridPreference;->saveFav(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 529
    :catch_0
    move-exception v0

    .line 530
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2

    .line 534
    .end local v0    # "e":Ljava/lang/Exception;
    :sswitch_3
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musicBiz:Lcom/arist/biz/MusicBiz;

    invoke-virtual {v1}, Lcom/arist/biz/MusicBiz;->getRecentAddMusic()Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;

    goto :goto_2

    .line 540
    :sswitch_4
    :try_start_1
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;

    sget-object v2, Lcom/arist/util/Constant;->BASE_DOWNLOAD_PATH:Ljava/lang/String;

    .line 541
    const/4 v3, 0x0

    .line 542
    sget-object v4, Lcom/arist/util/Constant;->BASE_DOWNLOAD_PATH:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    .line 541
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 540
    invoke-virtual {v1, v2}, Lcom/arist/dao/MusicDao;->getMusic(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    .line 544
    :catch_1
    move-exception v1

    goto :goto_2

    .line 487
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_4
    .end packed-switch

    .line 491
    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch

    .line 521
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x5 -> :sswitch_2
        0x6 -> :sswitch_3
        0x7 -> :sswitch_4
        0x6f -> :sswitch_0
    .end sparse-switch
.end method

.method private updateView(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/yong/jamendo/api/JamendoMusic;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1432
    .local p1, "netMusics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/yong/jamendo/api/JamendoMusic;>;"
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->netMusicAdapter:Lcom/arist/Adapter/NetMusicAdapter;

    invoke-virtual {v1, p1}, Lcom/arist/Adapter/NetMusicAdapter;->changeData(Ljava/util/ArrayList;)V

    .line 1433
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 1434
    .local v0, "msg":Landroid/os/Message;
    const/4 v1, 0x7

    iput v1, v0, Landroid/os/Message;->what:I

    .line 1435
    const/4 v1, 0x1

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 1436
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1437
    return-void
.end method


# virtual methods
.method public addNetMusicView()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 392
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->inflater:Landroid/view/LayoutInflater;

    .line 393
    const v2, 0x7f030014

    .line 392
    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    iput-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->netMusicLayout:Landroid/widget/RelativeLayout;

    .line 394
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->netMusicLayout:Landroid/widget/RelativeLayout;

    .line 395
    const v2, 0x7f0d005b

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 394
    iput-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->ivNetMusicLoading:Landroid/widget/ImageView;

    .line 396
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->netMusicLayout:Landroid/widget/RelativeLayout;

    const v2, 0x7f0d005c

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->tv_netMusicTips:Landroid/widget/TextView;

    .line 397
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->netMusicLayout:Landroid/widget/RelativeLayout;

    .line 398
    const v2, 0x7f0d005d

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ListView;

    .line 397
    iput-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->listViewNetMusic:Landroid/widget/ListView;

    .line 399
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->listViewNetMusic:Landroid/widget/ListView;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setFastScrollEnabled(Z)V

    .line 400
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->netMusicLayout:Landroid/widget/RelativeLayout;

    .line 401
    const v2, 0x7f0d005a

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    .line 400
    iput-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->etNetMusicSearch:Landroid/widget/EditText;

    .line 402
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->netMusicLayout:Landroid/widget/RelativeLayout;

    .line 403
    const v2, 0x7f0d0059

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 402
    check-cast v0, Landroid/widget/ImageButton;

    .line 405
    .local v0, "btnNetMusicSearch":Landroid/widget/ImageButton;
    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;

    invoke-direct {v1, p0, v3}, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;-><init>(Lcom/arist/MusicPlayer/MainActivity;Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 406
    new-instance v1, Lcom/arist/Adapter/NetMusicAdapter;

    .line 407
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity;->listViewNetMusic:Landroid/widget/ListView;

    invoke-direct {v1, p0, v3, v2}, Lcom/arist/Adapter/NetMusicAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Landroid/widget/ListView;)V

    .line 406
    iput-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->netMusicAdapter:Lcom/arist/Adapter/NetMusicAdapter;

    .line 408
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->listViewNetMusic:Landroid/widget/ListView;

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity;->netMusicAdapter:Lcom/arist/Adapter/NetMusicAdapter;

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 409
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->listViewNetMusic:Landroid/widget/ListView;

    .line 410
    new-instance v2, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerNetMusic;

    invoke-direct {v2, p0}, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerNetMusic;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 411
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->listViewNetMusic:Landroid/widget/ListView;

    .line 412
    new-instance v2, Lcom/arist/MusicPlayer/MainActivity$OnItemLongClickListenerNetMusic;

    invoke-direct {v2, p0}, Lcom/arist/MusicPlayer/MainActivity$OnItemLongClickListenerNetMusic;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 413
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->vpViews:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity;->netMusicLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 414
    return-void
.end method

.method public initData()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 151
    new-instance v0, Lcom/arist/dao/MusicDao;

    invoke-direct {v0, p0}, Lcom/arist/dao/MusicDao;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;

    .line 152
    new-instance v0, Lcom/arist/dao/MusicFolderDao;

    invoke-direct {v0, p0}, Lcom/arist/dao/MusicFolderDao;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->folderDao:Lcom/arist/dao/MusicFolderDao;

    .line 154
    new-instance v0, Lcom/arist/biz/MusicBiz;

    invoke-direct {v0, p0}, Lcom/arist/biz/MusicBiz;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->musicBiz:Lcom/arist/biz/MusicBiz;

    .line 156
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->musicBiz:Lcom/arist/biz/MusicBiz;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;

    invoke-virtual {v0, v1}, Lcom/arist/biz/MusicBiz;->setMusicDao(Lcom/arist/dao/MusicDao;)V

    .line 157
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->musicBiz:Lcom/arist/biz/MusicBiz;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->folderDao:Lcom/arist/dao/MusicFolderDao;

    invoke-virtual {v0, v1}, Lcom/arist/biz/MusicBiz;->setFolderDao(Lcom/arist/dao/MusicFolderDao;)V

    .line 159
    new-instance v0, Lcom/arist/util/MainGridPreference;

    invoke-direct {v0, p0}, Lcom/arist/util/MainGridPreference;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mainPref:Lcom/arist/util/MainGridPreference;

    .line 161
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/MainActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/arist/MusicPlayer/MainActivity;->screenWidth:I

    .line 163
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 164
    const v1, 0x7f0b0002

    .line 163
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->playModeEntries:[Ljava/lang/String;

    .line 167
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->infos:Ljava/util/ArrayList;

    .line 168
    new-instance v0, Lcom/arist/biz/ButtonInfoBiz;

    invoke-direct {v0, p0}, Lcom/arist/biz/ButtonInfoBiz;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->buttonInfoBiz:Lcom/arist/biz/ButtonInfoBiz;

    .line 169
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->buttonInfoBiz:Lcom/arist/biz/ButtonInfoBiz;

    invoke-virtual {v0}, Lcom/arist/biz/ButtonInfoBiz;->getButtonInfos()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->infos:Ljava/util/ArrayList;

    .line 170
    new-instance v0, Lcom/arist/Adapter/MainGridAdapter;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->infos:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/arist/Adapter/MainGridAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mainGridAdapter:Lcom/arist/Adapter/MainGridAdapter;

    .line 173
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->folders:Ljava/util/ArrayList;

    .line 174
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->folderDao:Lcom/arist/dao/MusicFolderDao;

    invoke-virtual {v0}, Lcom/arist/dao/MusicFolderDao;->getAllFolder()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->folders:Ljava/util/ArrayList;

    .line 175
    new-instance v0, Lcom/arist/Adapter/FolderAdapter;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->folders:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/arist/Adapter/FolderAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->folderAdapter:Lcom/arist/Adapter/FolderAdapter;

    .line 178
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;

    .line 179
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicList:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 180
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 181
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicList:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;

    .line 198
    :cond_0
    :goto_0
    new-instance v0, Lcom/arist/Adapter/MusicAdapter;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/arist/Adapter/MusicAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->musicAdapter:Lcom/arist/Adapter/MusicAdapter;

    .line 200
    return-void

    .line 182
    :cond_1
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->folders:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 183
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musicDao:Lcom/arist/dao/MusicDao;

    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->folders:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/entity/MusicFolder;

    invoke-virtual {v0}, Lcom/arist/entity/MusicFolder;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/arist/dao/MusicDao;->getMusic(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;

    .line 184
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 185
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getInstance()Lcom/arist/MusicPlayer/MyApplication;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/arist/MusicPlayer/MyApplication;->setMusicList(Ljava/util/ArrayList;)V

    .line 186
    invoke-static {v2}, Lcom/arist/MusicPlayer/MyApplication;->setCurrentPosition(I)V

    .line 187
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/entity/Music;

    invoke-static {v0}, Lcom/arist/MusicPlayer/MyApplication;->setCurrentMusic(Lcom/arist/entity/Music;)V

    .line 189
    :try_start_0
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 190
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentMusic()Lcom/arist/entity/Music;

    move-result-object v1

    invoke-virtual {v1}, Lcom/arist/entity/Music;->getData()Ljava/lang/String;

    move-result-object v1

    .line 189
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 191
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 192
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public initView()V
    .locals 5

    .prologue
    const v4, 0x7f030012

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 225
    const v0, 0x7f0d001f

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/yong/slidemenu/SlideHolder;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mSlideHolder:Lcom/yong/slidemenu/SlideHolder;

    .line 228
    const v0, 0x7f0d0020

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->layout:Landroid/widget/RelativeLayout;

    .line 229
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->inflater:Landroid/view/LayoutInflater;

    .line 232
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->inflater:Landroid/view/LayoutInflater;

    const v1, 0x7f03000e

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->gv:Landroid/widget/GridView;

    .line 233
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->gv:Landroid/widget/GridView;

    iget v1, p0, Lcom/arist/MusicPlayer/MainActivity;->screenWidth:I

    div-int/lit8 v1, v1, 0x3

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setColumnWidth(I)V

    .line 234
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->inflater:Landroid/view/LayoutInflater;

    invoke-virtual {v0, v4, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->listViewFolder:Landroid/widget/ListView;

    .line 236
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->listViewFolder:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setFastScrollEnabled(Z)V

    .line 237
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->inflater:Landroid/view/LayoutInflater;

    invoke-virtual {v0, v4, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->listViewMusic:Landroid/widget/ListView;

    .line 239
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->listViewMusic:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setFastScrollEnabled(Z)V

    .line 240
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->gv:Landroid/widget/GridView;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->mainGridAdapter:Lcom/arist/Adapter/MainGridAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 241
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->gv:Landroid/widget/GridView;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMain;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 242
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->listViewFolder:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->folderAdapter:Lcom/arist/Adapter/FolderAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 243
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->listViewFolder:Landroid/widget/ListView;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerFolder;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerFolder;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 244
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->listViewMusic:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->musicAdapter:Lcom/arist/Adapter/MusicAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 245
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->listViewMusic:Landroid/widget/ListView;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMusic;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$OnItemClickListenerMusic;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 246
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->listViewMusic:Landroid/widget/ListView;

    .line 247
    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$OnItemLongClickListenerMusic;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$OnItemLongClickListenerMusic;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 250
    const v0, 0x7f0d002a

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->vpContainer:Landroid/support/v4/view/ViewPager;

    .line 251
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->vpContainer:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->setFocusable(Z)V

    .line 253
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->vpViews:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->gv:Landroid/widget/GridView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->vpViews:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->listViewFolder:Landroid/widget/ListView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->vpViews:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->listViewMusic:Landroid/widget/ListView;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    new-instance v0, Lcom/arist/PopMenu/PopupWindowSearch;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;

    invoke-direct {v0, p0, v1}, Lcom/arist/PopMenu/PopupWindowSearch;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->popupWindowSearch:Lcom/arist/PopMenu/PopupWindowSearch;

    .line 261
    const v0, 0x7f0d0022

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btn_slideMenu:Landroid/widget/Button;

    .line 262
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btn_slideMenu:Landroid/widget/Button;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$3;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$3;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 268
    const v0, 0x7f0d00a5

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btn_scan:Landroid/widget/TextView;

    .line 269
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btn_scan:Landroid/widget/TextView;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$4;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$4;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 278
    const v0, 0x7f0d00a7

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btn_playMode:Landroid/widget/TextView;

    .line 279
    invoke-direct {p0}, Lcom/arist/MusicPlayer/MainActivity;->setPlaymodeLeftDrawable()V

    .line 280
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btn_playMode:Landroid/widget/TextView;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$5;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$5;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 306
    const v0, 0x7f0d00aa

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btn_equalizer:Landroid/widget/TextView;

    .line 307
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btn_equalizer:Landroid/widget/TextView;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$6;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$6;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 315
    const v0, 0x7f0d00ab

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btn_skin:Landroid/widget/TextView;

    .line 316
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btn_skin:Landroid/widget/TextView;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$7;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$7;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 324
    const v0, 0x7f0d00a6

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btn_searchMusic:Landroid/widget/TextView;

    .line 325
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btn_searchMusic:Landroid/widget/TextView;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$8;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$8;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 334
    const v0, 0x7f0d00ac

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btn_sleep:Landroid/widget/TextView;

    .line 335
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btn_sleep:Landroid/widget/TextView;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$9;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$9;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 359
    const v0, 0x7f0d00ad

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btn_setting:Landroid/widget/TextView;

    .line 360
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btn_setting:Landroid/widget/TextView;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$10;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$10;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 367
    const v0, 0x7f0d00ae

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btn_exit:Landroid/widget/TextView;

    .line 368
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btn_exit:Landroid/widget/TextView;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$11;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$11;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 380
    const v0, 0x7f0d00a8

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->giftLayout:Landroid/widget/RelativeLayout;

    .line 381
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->giftLayout:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$12;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$12;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 387
    invoke-static {p0, p0}, Lnet/coocent/android/xmlparser/PromotionSDK;->InitMyActionBar(Lnet/coocent/android/xmlparser/LoadAppInfoListener;Landroid/app/Activity;)V

    .line 388
    invoke-static {}, Lnet/coocent/android/xmlparser/PromotionSDK;->starAppInfoLoadTask()V

    .line 389
    return-void
.end method

.method public onAppInfoLoaded(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lnet/coocent/android/xmlparser/GiftEntity;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 1835
    .local p1, "result":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lnet/coocent/android/xmlparser/GiftEntity;>;"
    invoke-static {p1}, Lnet/coocent/android/xmlparser/PromotionSDK;->InitAppInfoList(Ljava/util/ArrayList;)V

    .line 1836
    invoke-static {}, Lnet/coocent/android/xmlparser/PromotionSDK;->UpdateNewcount()V

    .line 1837
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 1037
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 1038
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->requestWindowFeature(I)Z

    .line 1039
    const v0, 0x7f030004

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->setContentView(I)V

    .line 1040
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getInstance()Lcom/arist/MusicPlayer/MyApplication;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/arist/MusicPlayer/MyApplication;->addActivity(Landroid/app/Activity;)V

    .line 1044
    new-instance v0, Lcom/arist/MusicPlayer/MainActivity$26;

    invoke-direct {v0, p0}, Lcom/arist/MusicPlayer/MainActivity$26;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->handler:Landroid/os/Handler;

    .line 1121
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/MainActivity;->initData()V

    .line 1122
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/MainActivity;->initView()V

    .line 1123
    invoke-direct {p0}, Lcom/arist/MusicPlayer/MainActivity;->initListener()V

    .line 1124
    new-instance v0, Lcom/arist/Adapter/MyPagerAdapter;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->vpViews:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lcom/arist/Adapter/MyPagerAdapter;-><init>(Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->vpAdapter:Lcom/arist/Adapter/MyPagerAdapter;

    .line 1125
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->vpContainer:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity;->vpAdapter:Lcom/arist/Adapter/MyPagerAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 1137
    new-instance v0, Lnet/coocent/android/exitwithrate/EnterAndExit;

    invoke-direct {v0, p0}, Lnet/coocent/android/exitwithrate/EnterAndExit;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mEnterAndExit:Lnet/coocent/android/exitwithrate/EnterAndExit;

    .line 1138
    new-instance v0, Lcom/google/android/gms/ads/AdView;

    invoke-direct {v0, p0}, Lcom/google/android/gms/ads/AdView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mExitAdview:Lcom/google/android/gms/ads/AdView;

    .line 1139
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mExitAdview:Lcom/google/android/gms/ads/AdView;

    sget-object v1, Lcom/google/android/gms/ads/AdSize;->MEDIUM_RECTANGLE:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setAdSize(Lcom/google/android/gms/ads/AdSize;)V

    .line 1140
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mExitAdview:Lcom/google/android/gms/ads/AdView;

    const-string v1, "ca-app-pub-4949699850115085/9640026851"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setAdUnitId(Ljava/lang/String;)V

    .line 1141
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mExitAdview:Lcom/google/android/gms/ads/AdView;

    new-instance v1, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 1142
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->mExitAdview:Lcom/google/android/gms/ads/AdView;

    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$27;

    invoke-direct {v1, p0}, Lcom/arist/MusicPlayer/MainActivity$27;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/AdView;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    .line 1150
    invoke-static {p0}, Lcom/arist/util/AdUtil;->showAD(Landroid/app/Activity;)V

    .line 1170
    return-void
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 12
    .param p1, "id"    # I

    .prologue
    const/4 v9, 0x0

    const v11, 0x7f020073

    const/4 v10, 0x1

    .line 1453
    packed-switch p1, :pswitch_data_0

    .line 1538
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    :goto_0
    return-object v0

    .line 1456
    :pswitch_0
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/MainActivity;->showMusicContexDlg()Landroid/app/Dialog;

    move-result-object v0

    goto :goto_0

    .line 1459
    :pswitch_1
    iget-object v7, p0, Lcom/arist/MusicPlayer/MainActivity;->inflater:Landroid/view/LayoutInflater;

    const v8, 0x7f03001a

    invoke-virtual {v7, v8, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 1460
    .local v5, "view1":Landroid/view/View;
    const v7, 0x7f0d006f

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 1461
    iget-object v8, p0, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    invoke-virtual {v8}, Lcom/arist/entity/Music;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1462
    const v7, 0x7f0d0070

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 1463
    iget-object v8, p0, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    invoke-virtual {v8}, Lcom/arist/entity/Music;->getAlbum()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1464
    const v7, 0x7f0d0071

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 1465
    iget-object v8, p0, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    invoke-virtual {v8}, Lcom/arist/entity/Music;->getArtist()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1466
    const v7, 0x7f0d0072

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 1467
    iget-object v8, p0, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    invoke-virtual {v8}, Lcom/arist/entity/Music;->getDuration()I

    move-result v8

    invoke-static {v8}, Lcom/arist/util/TimeFormat;->timeFormat(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1468
    const v7, 0x7f0d0073

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 1469
    iget-object v8, p0, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    invoke-virtual {v8}, Lcom/arist/entity/Music;->getSize()J

    move-result-wide v8

    invoke-static {v8, v9}, Lcom/arist/util/TimeFormat;->sizeFormat(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1471
    const v7, 0x7f0d0074

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 1472
    iget-object v8, p0, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    invoke-virtual {v8}, Lcom/arist/entity/Music;->getData()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1474
    const v7, 0x7f0d0075

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    .line 1475
    new-instance v8, Lcom/arist/MusicPlayer/MainActivity$28;

    invoke-direct {v8, p0}, Lcom/arist/MusicPlayer/MainActivity$28;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    .line 1474
    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1482
    const v7, 0x7f0d0076

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    .line 1483
    new-instance v8, Lcom/arist/MusicPlayer/MainActivity$29;

    invoke-direct {v8, p0}, Lcom/arist/MusicPlayer/MainActivity$29;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1489
    new-instance v7, Landroid/app/AlertDialog$Builder;

    invoke-direct {v7, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1490
    iget-object v8, p0, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    invoke-virtual {v8}, Lcom/arist/entity/Music;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 1491
    invoke-virtual {v7, v11}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 1492
    invoke-virtual {v7, v10}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    invoke-virtual {v7, v5}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    invoke-virtual {v7}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 1493
    .local v0, "dialog1":Landroid/app/Dialog;
    goto/16 :goto_0

    .line 1496
    .end local v0    # "dialog1":Landroid/app/Dialog;
    .end local v5    # "view1":Landroid/view/View;
    :pswitch_2
    iget-object v7, p0, Lcom/arist/MusicPlayer/MainActivity;->inflater:Landroid/view/LayoutInflater;

    const v8, 0x7f03001b

    invoke-virtual {v7, v8, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 1498
    .local v6, "view2":Landroid/view/View;
    const v7, 0x7f0d0077

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 1497
    check-cast v4, Landroid/widget/EditText;

    .line 1500
    .local v4, "etName":Landroid/widget/EditText;
    const v7, 0x7f0d0078

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 1499
    check-cast v2, Landroid/widget/EditText;

    .line 1502
    .local v2, "etAlbum":Landroid/widget/EditText;
    const v7, 0x7f0d0079

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 1501
    check-cast v3, Landroid/widget/EditText;

    .line 1503
    .local v3, "etArtist":Landroid/widget/EditText;
    iget-object v7, p0, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    invoke-virtual {v7}, Lcom/arist/entity/Music;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 1504
    iget-object v7, p0, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    invoke-virtual {v7}, Lcom/arist/entity/Music;->getAlbum()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 1505
    iget-object v7, p0, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    invoke-virtual {v7}, Lcom/arist/entity/Music;->getArtist()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 1507
    const v7, 0x7f0d007a

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    .line 1508
    new-instance v8, Lcom/arist/MusicPlayer/MainActivity$30;

    invoke-direct {v8, p0, v4, v2, v3}, Lcom/arist/MusicPlayer/MainActivity$30;-><init>(Lcom/arist/MusicPlayer/MainActivity;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V

    .line 1507
    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1519
    const v7, 0x7f0d007b

    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    .line 1520
    new-instance v8, Lcom/arist/MusicPlayer/MainActivity$31;

    invoke-direct {v8, p0}, Lcom/arist/MusicPlayer/MainActivity$31;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    .line 1519
    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1526
    new-instance v7, Landroid/app/AlertDialog$Builder;

    invoke-direct {v7, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1527
    invoke-virtual {v7, v10}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    iget-object v8, p0, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    invoke-virtual {v8}, Lcom/arist/entity/Music;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 1528
    invoke-virtual {v7, v11}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    invoke-virtual {v7, v6}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 1529
    invoke-virtual {v7}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    .local v1, "dialog2":Landroid/app/Dialog;
    move-object v0, v1

    .line 1530
    goto/16 :goto_0

    .line 1533
    .end local v1    # "dialog2":Landroid/app/Dialog;
    .end local v2    # "etAlbum":Landroid/widget/EditText;
    .end local v3    # "etArtist":Landroid/widget/EditText;
    .end local v4    # "etName":Landroid/widget/EditText;
    .end local v6    # "view2":Landroid/view/View;
    :pswitch_3
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/MainActivity;->showNewMusicConfirmPlayDlg()Landroid/app/Dialog;

    move-result-object v0

    goto/16 :goto_0

    .line 1536
    :pswitch_4
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/MainActivity;->shouNetMusicContextDlg()Landroid/app/Dialog;

    move-result-object v0

    goto/16 :goto_0

    .line 1453
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 1248
    const-string v0, "info"

    const-string v1, "onDestroy()"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1249
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->netMusicAdapter:Lcom/arist/Adapter/NetMusicAdapter;

    if-eqz v0, :cond_0

    .line 1250
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->netMusicAdapter:Lcom/arist/Adapter/NetMusicAdapter;

    invoke-virtual {v0}, Lcom/arist/Adapter/NetMusicAdapter;->quit()V

    .line 1256
    :cond_0
    invoke-static {p0}, Lnet/coocent/android/exitwithrate/EnterAndExit;->onDes(Landroid/app/Activity;)V

    .line 1258
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicPref:Lcom/arist/util/MusicPreference;

    sget v1, Lcom/arist/MusicPlayer/MyApplication;->currentPosition:I

    invoke-virtual {v0, v1}, Lcom/arist/util/MusicPreference;->savePosition(I)V

    .line 1259
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicPref:Lcom/arist/util/MusicPreference;

    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicProgress()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MusicPreference;->saveProgress(I)V

    .line 1260
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicPref:Lcom/arist/util/MusicPreference;

    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getMusicData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/arist/util/MusicPreference;->saveData(Ljava/lang/String;)V

    .line 1261
    sget-object v0, Lcom/arist/MusicPlayer/MyApplication;->musicPref:Lcom/arist/util/MusicPreference;

    sget v1, Lcom/arist/MusicPlayer/MyApplication;->playMode:I

    invoke-virtual {v0, v1}, Lcom/arist/util/MusicPreference;->savePlayMode(I)V

    .line 1263
    const/4 v0, 0x1

    sput v0, Lcom/arist/MusicPlayer/MyApplication;->status:I

    .line 1264
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.MediaPlayer.action.STATUS_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 1265
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getInstance()Lcom/arist/MusicPlayer/MyApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/MusicPlayer/MyApplication;->exit()V

    .line 1266
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 1267
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 9
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    const/4 v4, 0x0

    const/4 v5, 0x1

    .line 780
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/MainActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 782
    .local v2, "pm":Landroid/content/pm/PackageManager;
    new-instance v6, Landroid/content/Intent;

    const-string v7, "android.intent.action.MAIN"

    invoke-direct {v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 783
    const-string v7, "android.intent.category.HOME"

    invoke-virtual {v6, v7}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v6

    .line 781
    invoke-virtual {v2, v6, v4}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v1

    .line 784
    .local v1, "homeInfo":Landroid/content/pm/ResolveInfo;
    packed-switch p1, :pswitch_data_0

    .line 811
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v4

    :goto_0
    return v4

    .line 786
    :pswitch_0
    iget v6, p0, Lcom/arist/MusicPlayer/MainActivity;->currentPageIndex:I

    if-nez v6, :cond_0

    .line 787
    sget-object v6, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v6}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v6

    if-nez v6, :cond_2

    .line 789
    new-instance v6, Lnet/coocent/android/exitwithrate/EnterAndExit;

    invoke-direct {v6, p0}, Lnet/coocent/android/exitwithrate/EnterAndExit;-><init>(Landroid/app/Activity;)V

    iget-boolean v7, p0, Lcom/arist/MusicPlayer/MainActivity;->isExitAdLoad:Z

    iget-object v8, p0, Lcom/arist/MusicPlayer/MainActivity;->mExitAdview:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v6, v7, v8}, Lnet/coocent/android/exitwithrate/EnterAndExit;->exitWithRate(ZLandroid/view/View;)V

    .line 802
    :cond_0
    iget v6, p0, Lcom/arist/MusicPlayer/MainActivity;->currentPageIndex:I

    add-int/lit8 v6, v6, -0x1

    iput v6, p0, Lcom/arist/MusicPlayer/MainActivity;->currentPageIndex:I

    if-gez v6, :cond_3

    :goto_1
    iput v4, p0, Lcom/arist/MusicPlayer/MainActivity;->currentPageIndex:I

    .line 803
    iget v4, p0, Lcom/arist/MusicPlayer/MainActivity;->currentPageIndex:I

    invoke-static {v4}, Lcom/arist/MusicPlayer/MyApplication;->setCurrentPage(I)V

    .line 805
    iget v4, p0, Lcom/arist/MusicPlayer/MainActivity;->currentPageIndex:I

    if-ne v4, v5, :cond_1

    .line 806
    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity;->folderAdapter:Lcom/arist/Adapter/FolderAdapter;

    invoke-virtual {v4}, Lcom/arist/Adapter/FolderAdapter;->notifyDataSetChanged()V

    .line 807
    :cond_1
    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity;->vpContainer:Landroid/support/v4/view/ViewPager;

    iget v6, p0, Lcom/arist/MusicPlayer/MainActivity;->currentPageIndex:I

    invoke-virtual {v4, v6, v5}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    move v4, v5

    .line 808
    goto :goto_0

    .line 792
    :cond_2
    iget-object v0, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 793
    .local v0, "ai":Landroid/content/pm/ActivityInfo;
    new-instance v3, Landroid/content/Intent;

    const-string v4, "android.intent.action.MAIN"

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 794
    .local v3, "startIntent":Landroid/content/Intent;
    const-string v4, "android.intent.category.LAUNCHER"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 795
    new-instance v4, Landroid/content/ComponentName;

    iget-object v6, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 796
    iget-object v7, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v4, v6, v7}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 795
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 797
    invoke-direct {p0, v3}, Lcom/arist/MusicPlayer/MainActivity;->startActivitySafely(Landroid/content/Intent;)V

    move v4, v5

    .line 798
    goto :goto_0

    .line 802
    .end local v0    # "ai":Landroid/content/pm/ActivityInfo;
    .end local v3    # "startIntent":Landroid/content/Intent;
    :cond_3
    iget v4, p0, Lcom/arist/MusicPlayer/MainActivity;->currentPageIndex:I

    goto :goto_1

    .line 784
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 1226
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->reciever:Lcom/arist/MusicPlayer/MainActivity$MyReciever;

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/MainActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1228
    invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onPause(Landroid/content/Context;)V

    .line 1229
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 1230
    return-void
.end method

.method protected onRestart()V
    .locals 0

    .prologue
    .line 1243
    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    .line 1244
    return-void
.end method

.method protected onResume()V
    .locals 7

    .prologue
    .line 1182
    invoke-virtual {p0}, Lcom/arist/MusicPlayer/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 1183
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getWallpaperId()I

    move-result v5

    .line 1182
    invoke-static {v4, v5}, Lcom/arist/util/BitmapService;->readBitMap(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 1184
    .local v1, "bmp":Landroid/graphics/Bitmap;
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v0, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 1185
    .local v0, "bd":Landroid/graphics/drawable/BitmapDrawable;
    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity;->layout:Landroid/widget/RelativeLayout;

    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1187
    new-instance v4, Lcom/arist/MusicPlayer/MainActivity$MyReciever;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lcom/arist/MusicPlayer/MainActivity$MyReciever;-><init>(Lcom/arist/MusicPlayer/MainActivity;Lcom/arist/MusicPlayer/MainActivity$MyReciever;)V

    iput-object v4, p0, Lcom/arist/MusicPlayer/MainActivity;->reciever:Lcom/arist/MusicPlayer/MainActivity$MyReciever;

    .line 1188
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 1189
    .local v2, "filter":Landroid/content/IntentFilter;
    const-string v4, "com.MediaPlayer.action.MEDIAPLAYER_INFO"

    invoke-virtual {v2, v4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1190
    const-string v4, "com.MediaPlayer.action.MUSIC_CHANGED"

    invoke-virtual {v2, v4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1191
    const-string v4, "com.MediaPlayer.action.STATUS_CHANGED"

    invoke-virtual {v2, v4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1192
    const-string v4, "com.MediaPlayer.action.UPDATE_NETMUEIC_VIEW"

    invoke-virtual {v2, v4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1193
    const-string v4, "com.MediaPlayer.action.NET_MUSIC_BUFFERING"

    invoke-virtual {v2, v4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1194
    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity;->reciever:Lcom/arist/MusicPlayer/MainActivity$MyReciever;

    invoke-virtual {p0, v4, v2}, Lcom/arist/MusicPlayer/MainActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1196
    new-instance v3, Landroid/content/IntentFilter;

    invoke-direct {v3}, Landroid/content/IntentFilter;-><init>()V

    .line 1197
    .local v3, "filter2":Landroid/content/IntentFilter;
    const-string v4, "android.intent.action.MEDIA_SCANNER_STARTED"

    invoke-virtual {v3, v4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1198
    const-string v4, "android.intent.action.MEDIA_SCANNER_FINISHED"

    invoke-virtual {v3, v4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1199
    const-string v4, "file"

    invoke-virtual {v3, v4}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 1200
    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity;->reciever:Lcom/arist/MusicPlayer/MainActivity$MyReciever;

    invoke-virtual {p0, v4, v3}, Lcom/arist/MusicPlayer/MainActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1202
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getInstance()Lcom/arist/MusicPlayer/MyApplication;

    move-result-object v4

    invoke-virtual {v4}, Lcom/arist/MusicPlayer/MyApplication;->getmusicList()Ljava/util/ArrayList;

    move-result-object v4

    iput-object v4, p0, Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;

    .line 1203
    invoke-direct {p0}, Lcom/arist/MusicPlayer/MainActivity;->updateView()V

    .line 1207
    sget-boolean v4, Lcom/arist/MusicPlayer/MyApplication;->showList:Z

    if-eqz v4, :cond_0

    .line 1208
    const/4 v4, 0x0

    sput-boolean v4, Lcom/arist/MusicPlayer/MyApplication;->showList:Z

    .line 1209
    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity;->musicAdapter:Lcom/arist/Adapter/MusicAdapter;

    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity;->musics:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Lcom/arist/Adapter/MusicAdapter;->changeData(Ljava/util/ArrayList;)V

    .line 1210
    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity;->vpContainer:Landroid/support/v4/view/ViewPager;

    const/4 v5, 0x2

    const/4 v6, 0x1

    invoke-virtual {v4, v5, v6}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    .line 1212
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentPosition()I

    move-result v4

    iget-object v5, p0, Lcom/arist/MusicPlayer/MainActivity;->musicAdapter:Lcom/arist/Adapter/MusicAdapter;

    invoke-virtual {v5}, Lcom/arist/Adapter/MusicAdapter;->getCount()I

    move-result v5

    if-ge v4, v5, :cond_0

    .line 1213
    iget-object v4, p0, Lcom/arist/MusicPlayer/MainActivity;->listViewMusic:Landroid/widget/ListView;

    .line 1214
    invoke-static {}, Lcom/arist/MusicPlayer/MyApplication;->getCurrentPosition()I

    move-result v5

    .line 1213
    invoke-virtual {v4, v5}, Landroid/widget/ListView;->setSelection(I)V

    .line 1217
    :cond_0
    invoke-static {p0}, Lcom/umeng/analytics/MobclickAgent;->onResume(Landroid/content/Context;)V

    .line 1219
    invoke-static {}, Lnet/coocent/android/xmlparser/PromotionSDK;->onResume()V

    .line 1221
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 1222
    return-void
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 1174
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 1175
    return-void
.end method

.method protected onStop()V
    .locals 0

    .prologue
    .line 1235
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 1236
    return-void
.end method

.method public shouNetMusicContextDlg()Landroid/app/Dialog;
    .locals 5

    .prologue
    .line 1614
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity;->inflater:Landroid/view/LayoutInflater;

    .line 1615
    const v3, 0x7f03001e

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 1616
    .local v1, "view1":Landroid/view/View;
    const v2, 0x7f0d006f

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 1617
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity;->currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

    invoke-virtual {v3}, Lcom/yong/jamendo/api/JamendoMusic;->getMusic_name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1618
    const v2, 0x7f0d0070

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 1619
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity;->currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

    invoke-virtual {v3}, Lcom/yong/jamendo/api/JamendoMusic;->getAlbum_name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1620
    const v2, 0x7f0d0071

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 1621
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity;->currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

    invoke-virtual {v3}, Lcom/yong/jamendo/api/JamendoMusic;->getArtistName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1622
    const v2, 0x7f0d0072

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 1623
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity;->currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

    .line 1624
    invoke-virtual {v3}, Lcom/yong/jamendo/api/JamendoMusic;->getDuration()I

    move-result v3

    .line 1623
    invoke-static {v3}, Lcom/arist/util/TimeFormat;->timeFormatInSecond(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1627
    const v2, 0x7f0d0036

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 1628
    new-instance v3, Lcom/arist/MusicPlayer/MainActivity$34;

    invoke-direct {v3, p0}, Lcom/arist/MusicPlayer/MainActivity$34;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    .line 1627
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1645
    const v2, 0x7f0d008b

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 1646
    new-instance v3, Lcom/arist/MusicPlayer/MainActivity$35;

    invoke-direct {v3, p0}, Lcom/arist/MusicPlayer/MainActivity$35;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1652
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1653
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity;->currentNetMusic:Lcom/yong/jamendo/api/JamendoMusic;

    invoke-virtual {v3}, Lcom/yong/jamendo/api/JamendoMusic;->getMusic_name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 1654
    const v3, 0x7f020073

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 1655
    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 1656
    .local v0, "dialog1":Landroid/app/Dialog;
    return-object v0
.end method

.method public showMusicContexDlg()Landroid/app/Dialog;
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 1665
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity;->inflater:Landroid/view/LayoutInflater;

    const v3, 0x7f030019

    invoke-virtual {v2, v3, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 1667
    .local v1, "view":Landroid/view/View;
    const v2, 0x7f0d006b

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 1668
    new-instance v3, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicDetail;

    invoke-direct {v3, p0, v5}, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicDetail;-><init>(Lcom/arist/MusicPlayer/MainActivity;Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicDetail;)V

    .line 1667
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1669
    const v2, 0x7f0d006e

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 1670
    new-instance v3, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;

    invoke-direct {v3, p0, v5}, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;-><init>(Lcom/arist/MusicPlayer/MainActivity;Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicLove;)V

    .line 1669
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1671
    const v2, 0x7f0d006c

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 1672
    new-instance v3, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicRemove;

    invoke-direct {v3, p0, v5}, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicRemove;-><init>(Lcom/arist/MusicPlayer/MainActivity;Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicRemove;)V

    .line 1671
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1673
    const v2, 0x7f0d006d

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 1674
    new-instance v3, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicUpdate;

    invoke-direct {v3, p0, v5}, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicUpdate;-><init>(Lcom/arist/MusicPlayer/MainActivity;Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicUpdate;)V

    .line 1673
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1677
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1678
    iget-object v3, p0, Lcom/arist/MusicPlayer/MainActivity;->selMusic:Lcom/arist/entity/Music;

    invoke-virtual {v3}, Lcom/arist/entity/Music;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 1679
    const v3, 0x7f020073

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 1680
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 1681
    const v3, 0x7f080063

    .line 1682
    new-instance v4, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicCancel;

    invoke-direct {v4, p0, v5}, Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicCancel;-><init>(Lcom/arist/MusicPlayer/MainActivity;Lcom/arist/MusicPlayer/MainActivity$OnClickListenerMusicCancel;)V

    .line 1681
    invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 1682
    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 1683
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 1684
    .local v0, "musicContextDlg":Landroid/app/Dialog;
    return-object v0
.end method

.method public showNewMusicConfirmPlayDlg()Landroid/app/Dialog;
    .locals 4

    .prologue
    .line 1547
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1548
    const v2, 0x7f08007a

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 1549
    const v2, 0x108009b

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 1550
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 1551
    const v2, 0x7f08007b

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 1552
    const v2, 0x7f080051

    .line 1553
    new-instance v3, Lcom/arist/MusicPlayer/MainActivity$32;

    invoke-direct {v3, p0}, Lcom/arist/MusicPlayer/MainActivity$32;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    .line 1552
    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 1560
    const v2, 0x7f080052

    .line 1561
    new-instance v3, Lcom/arist/MusicPlayer/MainActivity$33;

    invoke-direct {v3, p0}, Lcom/arist/MusicPlayer/MainActivity$33;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    .line 1560
    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 1604
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 1605
    .local v0, "dialog3":Landroid/app/Dialog;
    return-object v0
.end method

.method public updatePlayStatusView()V
    .locals 2

    .prologue
    .line 1369
    sget v0, Lcom/arist/MusicPlayer/MyApplication;->status:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 1370
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btnPlay:Landroid/widget/ImageButton;

    const v1, 0x7f020050

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 1373
    :goto_0
    return-void

    .line 1372
    :cond_0
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity;->btnPlay:Landroid/widget/ImageButton;

    const v1, 0x7f020052

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_0
.end method
