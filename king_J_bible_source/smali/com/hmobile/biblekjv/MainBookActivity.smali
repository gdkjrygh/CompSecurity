.class public Lcom/hmobile/biblekjv/MainBookActivity;
.super Lcom/hmobile/biblekjv/BaseActivity;
.source "MainBookActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/speech/tts/TextToSpeech$OnInitListener;
.implements Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;
.implements Landroid/speech/tts/TextToSpeech$OnUtteranceCompletedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;,
        Lcom/hmobile/biblekjv/MainBookActivity$MyFlingListener;,
        Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;,
        Lcom/hmobile/biblekjv/MainBookActivity$saveLikeData;
    }
.end annotation


# static fields
.field private static final SWIPE_MAX_OFF_PATH:I = 0xfa

.field private static final SWIPE_MIN_DISTANCE:I = 0x78

.field private static final SWIPE_THRESHOLD_VELOCITY:I = 0xc8

.field public static mHandler:Landroid/os/Handler;

.field static m_selectedVerseList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private Eventname:Ljava/lang/String;

.field Firstbookmark:[Ljava/lang/String;

.field final MY_DATA_CHECK_CODE:I

.field final PICK_COLOR_ACTVITY:I

.field final SEARCH_ACTVITY:I

.field final SELECT_ACTVITY:I

.field private actionpopup:Lcom/hmobile/quickaction/ActionItem;

.field private book_count:I

.field private bookmark_info:Lcom/hmobile/model/BookMarkInfo;

.field bookmarkcolor:I

.field bookname:Ljava/lang/String;

.field private btnCancelNotes:Landroid/widget/Button;

.field private btnPause:Landroid/widget/Button;

.field private btnPlay:Landroid/widget/Button;

.field private btnSaveNotes:Landroid/widget/Button;

.field private btnStop:Landroid/widget/Button;

.field private chap_count:I

.field editor:Landroid/content/SharedPreferences$Editor;

.field private edtLable:Landroid/widget/EditText;

.field edtSearch:Landroid/widget/AutoCompleteTextView;

.field private edtTitle:Landroid/widget/EditText;

.field private flingDetector:Landroid/view/GestureDetector;

.field private gestureListener:Landroid/view/View$OnTouchListener;

.field private handler:Landroid/os/Handler;

.field private imgAa:Landroid/widget/ImageView;

.field private imgAudio:Landroid/widget/ImageView;

.field private imgAudioSetting:Landroid/widget/ImageView;

.field private imgBookMark:Landroid/widget/ImageView;

.field private imgCancel:Landroid/widget/ImageView;

.field private imgCancelSearch:Landroid/widget/ImageView;

.field private imgCopy:Landroid/widget/ImageView;

.field private imgFacebook:Landroid/widget/ImageView;

.field private imgLike:Landroid/widget/ImageView;

.field private imgNext:Landroid/widget/ImageView;

.field private imgPrevious:Landroid/widget/ImageView;

.field private imgSearch:Landroid/widget/ImageView;

.field private imgSearchText:Landroid/widget/ImageView;

.field private imgShare:Landroid/widget/ImageView;

.field private imgTwitter:Landroid/widget/ImageView;

.field isBookmarkmenuOpen:Z

.field private isFromBookMark:Z

.field private isFromFavorite:Z

.field private isFromLikeShare:Z

.field private isFromNotes:Z

.field private isFromSearchActivity:Z

.field private isFromSelectActivity:Z

.field private isFromToday:Z

.field private isFromWidget:Z

.field isSearchBarOpen:Z

.field isTTsContinue:Z

.field isttsOn:Z

.field private ll:Landroid/widget/LinearLayout;

.field private llNavigationFade:Landroid/widget/LinearLayout;

.field private llNotes:Landroid/widget/LinearLayout;

.field private llSearch:Landroid/widget/RelativeLayout;

.field private llShowBookmark:Landroid/widget/LinearLayout;

.field private mBlueToolTipView:Lcom/hmobile/tooltip/ToolTipView;

.field private mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

.field private mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

.field private mToolTipFrameLayout:Lcom/hmobile/tooltip/ToolTipRelativeLayout;

.field m_strings:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field m_tempstrings:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private m_verse_number_list:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field m_verselist:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/VerseInfo;",
            ">;"
        }
    .end annotation
.end field

.field navigationfade_global:Z

.field private note_label:Ljava/lang/String;

.field params:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field phoneStateListener:Landroid/telephony/PhoneStateListener;

.field qa:Lcom/hmobile/quickaction/QuickActionNotes;

.field private rlBookmarkMenu:Landroid/widget/LinearLayout;

.field private rlmain:Landroid/widget/RelativeLayout;

.field private scroll:Landroid/widget/ScrollView;

.field settings:Landroid/content/SharedPreferences;

.field private tabView:Lcom/hmobile/tab/TabView;

.field thread:Ljava/lang/Thread;

.field tts:Landroid/speech/tts/TextToSpeech;

.field private tts_count:I

.field private txtBookAndChapterName:Landroid/widget/TextView;

.field private txtContent:Landroid/widget/TextView;

.field private verse_id:I

.field private view_height:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 133
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/hmobile/biblekjv/MainBookActivity;->m_selectedVerseList:Ljava/util/ArrayList;

    .line 1164
    new-instance v0, Lcom/hmobile/biblekjv/MainBookActivity$2;

    invoke-direct {v0}, Lcom/hmobile/biblekjv/MainBookActivity$2;-><init>()V

    sput-object v0, Lcom/hmobile/biblekjv/MainBookActivity;->mHandler:Landroid/os/Handler;

    .line 1169
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 91
    invoke-direct {p0}, Lcom/hmobile/biblekjv/BaseActivity;-><init>()V

    .line 106
    iput-boolean v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->navigationfade_global:Z

    .line 110
    iput-boolean v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isBookmarkmenuOpen:Z

    iput-boolean v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isttsOn:Z

    .line 112
    iput v2, p0, Lcom/hmobile/biblekjv/MainBookActivity;->SELECT_ACTVITY:I

    const/4 v0, 0x2

    iput v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->SEARCH_ACTVITY:I

    const/4 v0, 0x3

    iput v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->PICK_COLOR_ACTVITY:I

    .line 113
    const/4 v0, 0x4

    iput v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->MY_DATA_CHECK_CODE:I

    .line 114
    iput v2, p0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    iput v2, p0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    iput v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->view_height:I

    iput v2, p0, Lcom/hmobile/biblekjv/MainBookActivity;->verse_id:I

    .line 115
    iput v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts_count:I

    .line 117
    iput-boolean v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromBookMark:Z

    iput-boolean v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromSelectActivity:Z

    .line 118
    iput-boolean v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromSearchActivity:Z

    iput-boolean v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromToday:Z

    .line 119
    iput-boolean v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromFavorite:Z

    iput-boolean v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromWidget:Z

    .line 120
    iput-boolean v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromLikeShare:Z

    iput-boolean v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromNotes:Z

    .line 121
    iput-object v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->Firstbookmark:[Ljava/lang/String;

    .line 127
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->Eventname:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->note_label:Ljava/lang/String;

    .line 129
    const v0, -0x151600

    iput v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->bookmarkcolor:I

    .line 135
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->m_verse_number_list:Ljava/util/ArrayList;

    .line 137
    iput-boolean v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isSearchBarOpen:Z

    iput-boolean v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isTTsContinue:Z

    .line 139
    iput-object v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->params:Ljava/util/HashMap;

    .line 153
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->m_strings:Ljava/util/ArrayList;

    .line 154
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->m_tempstrings:Ljava/util/ArrayList;

    .line 445
    new-instance v0, Lcom/hmobile/biblekjv/MainBookActivity$1;

    invoke-direct {v0, p0}, Lcom/hmobile/biblekjv/MainBookActivity$1;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;)V

    iput-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->handler:Landroid/os/Handler;

    .line 509
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->bookname:Ljava/lang/String;

    .line 1645
    new-instance v0, Lcom/hmobile/biblekjv/MainBookActivity$3;

    invoke-direct {v0, p0}, Lcom/hmobile/biblekjv/MainBookActivity$3;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;)V

    iput-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->phoneStateListener:Landroid/telephony/PhoneStateListener;

    .line 91
    return-void
.end method

.method private SetSpeech(Ljava/util/ArrayList;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/VerseInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p1, "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/VerseInfo;>;"
    const-wide/16 v8, 0x3e8

    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 1137
    iget v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts_count:I

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lt v3, v4, :cond_0

    .line 1138
    const/4 v3, 0x0

    iput v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts_count:I

    .line 1141
    :cond_0
    iget v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts_count:I

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/hmobile/model/VerseInfo;

    .line 1143
    .local v2, "verse":Lcom/hmobile/model/VerseInfo;
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    iput-object v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->params:Ljava/util/HashMap;

    .line 1144
    iget-object v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->params:Ljava/util/HashMap;

    const-string v4, "utteranceId"

    const-string v5, "END"

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1145
    if-eqz v2, :cond_1

    iget-object v3, v2, Lcom/hmobile/model/VerseInfo;->Verse:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1

    .line 1146
    iget-object v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->settings:Landroid/content/SharedPreferences;

    const-string v4, "speech_speed"

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v1

    .line 1147
    .local v1, "speed":F
    iget-object v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v3, v1}, Landroid/speech/tts/TextToSpeech;->setSpeechRate(F)I

    .line 1148
    iget-object v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->settings:Landroid/content/SharedPreferences;

    const-string v4, "speech_pitch"

    const/16 v5, 0xa

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 1149
    .local v0, "speechPitch":I
    iget-object v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    div-int/lit8 v4, v0, 0xa

    int-to-float v4, v4

    invoke-virtual {v3, v4}, Landroid/speech/tts/TextToSpeech;->setPitch(F)I

    .line 1150
    iget v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts_count:I

    if-nez v3, :cond_2

    .line 1151
    iget-object v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v3, v8, v9, v6, v7}, Landroid/speech/tts/TextToSpeech;->playSilence(JILjava/util/HashMap;)I

    .line 1152
    iget-object v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    new-instance v4, Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/hmobile/biblekjv/MainBookActivity;->bookname:Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, p0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v6, v7}, Landroid/speech/tts/TextToSpeech;->speak(Ljava/lang/String;ILjava/util/HashMap;)I

    .line 1153
    iget-object v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v3, v8, v9, v6, v7}, Landroid/speech/tts/TextToSpeech;->playSilence(JILjava/util/HashMap;)I

    .line 1154
    iget-object v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    iget-object v4, v2, Lcom/hmobile/model/VerseInfo;->Verse:Ljava/lang/String;

    iget-object v5, p0, Lcom/hmobile/biblekjv/MainBookActivity;->params:Ljava/util/HashMap;

    invoke-virtual {v3, v4, v6, v5}, Landroid/speech/tts/TextToSpeech;->speak(Ljava/lang/String;ILjava/util/HashMap;)I

    .line 1161
    .end local v0    # "speechPitch":I
    .end local v1    # "speed":F
    :cond_1
    :goto_0
    iget v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts_count:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts_count:I

    .line 1162
    return-void

    .line 1156
    .restart local v0    # "speechPitch":I
    .restart local v1    # "speed":F
    :cond_2
    iget-object v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    iget-object v4, v2, Lcom/hmobile/model/VerseInfo;->Verse:Ljava/lang/String;

    iget-object v5, p0, Lcom/hmobile/biblekjv/MainBookActivity;->params:Ljava/util/HashMap;

    invoke-virtual {v3, v4, v6, v5}, Landroid/speech/tts/TextToSpeech;->speak(Ljava/lang/String;ILjava/util/HashMap;)I

    goto :goto_0
.end method

.method static synthetic access$0(Lcom/hmobile/biblekjv/MainBookActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->llNavigationFade:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic access$1(Lcom/hmobile/biblekjv/MainBookActivity;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 445
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$10(Lcom/hmobile/biblekjv/MainBookActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->ll:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic access$11(Lcom/hmobile/biblekjv/MainBookActivity;)I
    .locals 1

    .prologue
    .line 114
    iget v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->verse_id:I

    return v0
.end method

.method static synthetic access$12(Lcom/hmobile/biblekjv/MainBookActivity;I)V
    .locals 0

    .prologue
    .line 114
    iput p1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->view_height:I

    return-void
.end method

.method static synthetic access$13(Lcom/hmobile/biblekjv/MainBookActivity;)Landroid/widget/ScrollView;
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->scroll:Landroid/widget/ScrollView;

    return-object v0
.end method

.method static synthetic access$14(Lcom/hmobile/biblekjv/MainBookActivity;)I
    .locals 1

    .prologue
    .line 114
    iget v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->view_height:I

    return v0
.end method

.method static synthetic access$15(Lcom/hmobile/biblekjv/MainBookActivity;Z)V
    .locals 0

    .prologue
    .line 117
    iput-boolean p1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromBookMark:Z

    return-void
.end method

.method static synthetic access$16(Lcom/hmobile/biblekjv/MainBookActivity;Z)V
    .locals 0

    .prologue
    .line 117
    iput-boolean p1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromSelectActivity:Z

    return-void
.end method

.method static synthetic access$17(Lcom/hmobile/biblekjv/MainBookActivity;Z)V
    .locals 0

    .prologue
    .line 118
    iput-boolean p1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromSearchActivity:Z

    return-void
.end method

.method static synthetic access$18(Lcom/hmobile/biblekjv/MainBookActivity;Z)V
    .locals 0

    .prologue
    .line 119
    iput-boolean p1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromFavorite:Z

    return-void
.end method

.method static synthetic access$19(Lcom/hmobile/biblekjv/MainBookActivity;Z)V
    .locals 0

    .prologue
    .line 118
    iput-boolean p1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromToday:Z

    return-void
.end method

.method static synthetic access$2(Lcom/hmobile/biblekjv/MainBookActivity;)Z
    .locals 1

    .prologue
    .line 117
    iget-boolean v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromBookMark:Z

    return v0
.end method

.method static synthetic access$20(Lcom/hmobile/biblekjv/MainBookActivity;Z)V
    .locals 0

    .prologue
    .line 119
    iput-boolean p1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromWidget:Z

    return-void
.end method

.method static synthetic access$21(Lcom/hmobile/biblekjv/MainBookActivity;Z)V
    .locals 0

    .prologue
    .line 120
    iput-boolean p1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromLikeShare:Z

    return-void
.end method

.method static synthetic access$22(Lcom/hmobile/biblekjv/MainBookActivity;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 135
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->m_verse_number_list:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$23(Lcom/hmobile/biblekjv/MainBookActivity;)I
    .locals 1

    .prologue
    .line 114
    iget v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    return v0
.end method

.method static synthetic access$24(Lcom/hmobile/biblekjv/MainBookActivity;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 135
    iput-object p1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->m_verse_number_list:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic access$25(Lcom/hmobile/biblekjv/MainBookActivity;)V
    .locals 0

    .prologue
    .line 739
    invoke-direct {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->clickNext()V

    return-void
.end method

.method static synthetic access$26(Lcom/hmobile/biblekjv/MainBookActivity;)V
    .locals 0

    .prologue
    .line 751
    invoke-direct {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->clickPrev()V

    return-void
.end method

.method static synthetic access$27(Lcom/hmobile/biblekjv/MainBookActivity;)Landroid/view/GestureDetector;
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->flingDetector:Landroid/view/GestureDetector;

    return-object v0
.end method

.method static synthetic access$28(Lcom/hmobile/biblekjv/MainBookActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->llSearch:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic access$29(Lcom/hmobile/biblekjv/MainBookActivity;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->txtBookAndChapterName:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$3(Lcom/hmobile/biblekjv/MainBookActivity;)Z
    .locals 1

    .prologue
    .line 117
    iget-boolean v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromSelectActivity:Z

    return v0
.end method

.method static synthetic access$30(Lcom/hmobile/biblekjv/MainBookActivity;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgSearch:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$31(Lcom/hmobile/biblekjv/MainBookActivity;Ljava/lang/String;J)V
    .locals 0

    .prologue
    .line 670
    invoke-direct {p0, p1, p2, p3}, Lcom/hmobile/biblekjv/MainBookActivity;->menuDialogDisplayPopup(Ljava/lang/String;J)V

    return-void
.end method

.method static synthetic access$32(Lcom/hmobile/biblekjv/MainBookActivity;)Lcom/hmobile/quickaction/ActionItem;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->actionpopup:Lcom/hmobile/quickaction/ActionItem;

    return-object v0
.end method

.method static synthetic access$33(Lcom/hmobile/biblekjv/MainBookActivity;I)V
    .locals 0

    .prologue
    .line 114
    iput p1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->verse_id:I

    return-void
.end method

.method static synthetic access$4(Lcom/hmobile/biblekjv/MainBookActivity;)Z
    .locals 1

    .prologue
    .line 118
    iget-boolean v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromSearchActivity:Z

    return v0
.end method

.method static synthetic access$5(Lcom/hmobile/biblekjv/MainBookActivity;)Z
    .locals 1

    .prologue
    .line 118
    iget-boolean v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromToday:Z

    return v0
.end method

.method static synthetic access$6(Lcom/hmobile/biblekjv/MainBookActivity;)Z
    .locals 1

    .prologue
    .line 119
    iget-boolean v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromFavorite:Z

    return v0
.end method

.method static synthetic access$7(Lcom/hmobile/biblekjv/MainBookActivity;)Z
    .locals 1

    .prologue
    .line 119
    iget-boolean v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromWidget:Z

    return v0
.end method

.method static synthetic access$8(Lcom/hmobile/biblekjv/MainBookActivity;)Z
    .locals 1

    .prologue
    .line 120
    iget-boolean v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromLikeShare:Z

    return v0
.end method

.method static synthetic access$9(Lcom/hmobile/biblekjv/MainBookActivity;)Z
    .locals 1

    .prologue
    .line 120
    iget-boolean v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromNotes:Z

    return v0
.end method

.method private clickNext()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 741
    iput v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts_count:I

    .line 742
    iget v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    .line 744
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->Reset()V

    .line 745
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->settings:Landroid/content/SharedPreferences;

    .line 746
    const-string v1, "navigation_fade"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 745
    iput-boolean v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->navigationfade_global:Z

    .line 748
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->scroll:Landroid/widget/ScrollView;

    invoke-virtual {v0, v3, v3}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 749
    return-void
.end method

.method private clickPrev()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 753
    iput v2, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts_count:I

    .line 754
    iget v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    if-le v0, v3, :cond_1

    .line 755
    iget v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    .line 756
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->Reset()V

    .line 765
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->settings:Landroid/content/SharedPreferences;

    .line 766
    const-string v1, "navigation_fade"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 765
    iput-boolean v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->navigationfade_global:Z

    .line 768
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->scroll:Landroid/widget/ScrollView;

    invoke-virtual {v0, v2, v2}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 769
    return-void

    .line 758
    :cond_1
    iget v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    if-le v0, v3, :cond_0

    .line 759
    iget v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    .line 761
    iget v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/hmobile/common/Utils;->ConvertToLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 760
    invoke-static {v0, v1}, Lcom/hmobile/model/BookInfo;->getTotalChapterCountBybookid(J)I

    move-result v0

    iput v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    .line 762
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->Reset()V

    goto :goto_0
.end method

.method private menuDialogDisplayPopup(Ljava/lang/String;J)V
    .locals 2
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "id"    # J

    .prologue
    .line 671
    new-instance v0, Lcom/hmobile/quickaction/ActionItem;

    invoke-direct {v0}, Lcom/hmobile/quickaction/ActionItem;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->actionpopup:Lcom/hmobile/quickaction/ActionItem;

    .line 672
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->actionpopup:Lcom/hmobile/quickaction/ActionItem;

    invoke-virtual {v0, p1}, Lcom/hmobile/quickaction/ActionItem;->setTitle(Ljava/lang/String;)V

    .line 673
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->actionpopup:Lcom/hmobile/quickaction/ActionItem;

    new-instance v1, Lcom/hmobile/biblekjv/MainBookActivity$10;

    invoke-direct {v1, p0, p2, p3}, Lcom/hmobile/biblekjv/MainBookActivity$10;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;J)V

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/ActionItem;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 682
    return-void
.end method

.method private stopSpeech()V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    .line 1173
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    if-eqz v0, :cond_1

    .line 1175
    const-string v0, "STOP SPEECH"

    invoke-static {v0}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    .line 1176
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->stop()I

    .line 1177
    iget v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts_count:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 1178
    iget v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts_count:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts_count:I

    .line 1179
    :cond_0
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->params:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    .line 1180
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->params:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 1186
    :cond_1
    return-void
.end method


# virtual methods
.method public CopyText(Ljava/lang/String;)V
    .locals 7
    .param p1, "copyContent"    # Ljava/lang/String;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 1332
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1333
    .local v2, "sdk":I
    const/16 v4, 0xb

    if-ge v2, v4, :cond_0

    .line 1334
    const-string v4, "clipboard"

    invoke-virtual {p0, v4}, Lcom/hmobile/biblekjv/MainBookActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/text/ClipboardManager;

    .line 1335
    .local v1, "clipboard":Landroid/text/ClipboardManager;
    invoke-virtual {v1, p1}, Landroid/text/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    .line 1342
    .end local v1    # "clipboard":Landroid/text/ClipboardManager;
    :goto_0
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    .line 1343
    const v5, 0x7f070061

    invoke-virtual {p0, v5}, Lcom/hmobile/biblekjv/MainBookActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    .line 1342
    invoke-static {v4, v5, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v3

    .line 1344
    .local v3, "t":Landroid/widget/Toast;
    const/16 v4, 0x51

    const/4 v5, 0x0

    .line 1345
    iget v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->screenHeight:I

    div-int/lit8 v6, v6, 0x2

    .line 1344
    invoke-virtual {v3, v4, v5, v6}, Landroid/widget/Toast;->setGravity(III)V

    .line 1346
    invoke-virtual {v3}, Landroid/widget/Toast;->show()V

    .line 1347
    return-void

    .line 1337
    .end local v3    # "t":Landroid/widget/Toast;
    :cond_0
    const-string v4, "clipboard"

    invoke-virtual {p0, v4}, Lcom/hmobile/biblekjv/MainBookActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ClipboardManager;

    .line 1339
    .local v1, "clipboard":Landroid/content/ClipboardManager;
    const-string v4, "Text is Copied"

    invoke-static {v4, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v0

    .line 1340
    .local v0, "clip":Landroid/content/ClipData;
    invoke-virtual {v1, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    goto :goto_0
.end method

.method public Failed()V
    .locals 0

    .prologue
    .line 1405
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->Reset()V

    .line 1406
    return-void
.end method

.method public LoadAutoText()V
    .locals 10

    .prologue
    .line 400
    invoke-static {}, Lcom/hmobile/model/BookInfo;->getBookList()Ljava/util/ArrayList;

    move-result-object v4

    .line 401
    .local v4, "m_books":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/BookInfo;>;"
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_1

    .line 418
    new-instance v0, Landroid/widget/ArrayAdapter;

    .line 419
    const v6, 0x1090011

    .line 420
    iget-object v7, p0, Lcom/hmobile/biblekjv/MainBookActivity;->m_strings:Ljava/util/ArrayList;

    .line 418
    invoke-direct {v0, p0, v6, v7}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 421
    .local v0, "adapter":Landroid/widget/ArrayAdapter;, "Landroid/widget/ArrayAdapter<Ljava/lang/String;>;"
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->edtSearch:Landroid/widget/AutoCompleteTextView;

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Landroid/widget/AutoCompleteTextView;->setThreshold(I)V

    .line 422
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->edtSearch:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v6, v0}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 423
    return-void

    .line 401
    .end local v0    # "adapter":Landroid/widget/ArrayAdapter;, "Landroid/widget/ArrayAdapter<Ljava/lang/String;>;"
    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/hmobile/model/BookInfo;

    .line 402
    .local v1, "bookInfo":Lcom/hmobile/model/BookInfo;
    invoke-virtual {v1}, Lcom/hmobile/model/BookInfo;->getID()J

    move-result-wide v8

    invoke-static {v8, v9}, Lcom/hmobile/model/BookInfo;->getTotalChapterCountBybookid(J)I

    move-result v2

    .line 407
    .local v2, "count":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    if-ge v3, v2, :cond_0

    .line 408
    iget-object v7, v1, Lcom/hmobile/model/BookInfo;->BookName:Ljava/lang/String;

    const-string v8, "\n"

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 409
    iget-object v7, v1, Lcom/hmobile/model/BookInfo;->BookName:Ljava/lang/String;

    const-string v8, "\n"

    const-string v9, ""

    invoke-virtual {v7, v8, v9}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 410
    .local v5, "str":Ljava/lang/String;
    iget-object v7, p0, Lcom/hmobile/biblekjv/MainBookActivity;->m_strings:Ljava/util/ArrayList;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v9, " "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    add-int/lit8 v9, v3, 0x1

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 411
    iget-object v7, p0, Lcom/hmobile/biblekjv/MainBookActivity;->m_tempstrings:Ljava/util/ArrayList;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v9, "###"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    add-int/lit8 v9, v3, 0x1

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 407
    .end local v5    # "str":Ljava/lang/String;
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 413
    :cond_2
    iget-object v7, p0, Lcom/hmobile/biblekjv/MainBookActivity;->m_strings:Ljava/util/ArrayList;

    new-instance v8, Ljava/lang/StringBuilder;

    iget-object v9, v1, Lcom/hmobile/model/BookInfo;->BookName:Ljava/lang/String;

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v9, " "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    add-int/lit8 v9, v3, 0x1

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 414
    iget-object v7, p0, Lcom/hmobile/biblekjv/MainBookActivity;->m_tempstrings:Ljava/util/ArrayList;

    new-instance v8, Ljava/lang/StringBuilder;

    iget-object v9, v1, Lcom/hmobile/model/BookInfo;->BookName:Ljava/lang/String;

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v9, "###"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    add-int/lit8 v9, v3, 0x1

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method public Reset()V
    .locals 3

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 1350
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->rlBookmarkMenu:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1351
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->llShowBookmark:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1352
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->txtBookAndChapterName:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1353
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgSearch:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1354
    iput-boolean v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isBookmarkmenuOpen:Z

    .line 1355
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/hmobile/biblekjv/MainBookActivity;->m_selectedVerseList:Ljava/util/ArrayList;

    .line 1356
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->m_verse_number_list:Ljava/util/ArrayList;

    .line 1357
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->loadData()V

    .line 1358
    return-void
.end method

.method public ShowAlertForAudioSetting()V
    .locals 17

    .prologue
    .line 1546
    const/4 v15, 0x5

    new-array v2, v15, [F

    fill-array-data v2, :array_0

    .line 1547
    .local v2, "audio_speed":[F
    const/16 v10, 0xa

    .line 1549
    .local v10, "speechPitch":I
    invoke-static/range {p0 .. p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v9

    .line 1550
    .local v9, "settings":Landroid/content/SharedPreferences;
    invoke-interface {v9}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    .line 1552
    .local v5, "editor":Landroid/content/SharedPreferences$Editor;
    new-instance v1, Landroid/app/AlertDialog$Builder;

    move-object/from16 v0, p0

    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1554
    .local v1, "alertDialog":Landroid/app/AlertDialog$Builder;
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v7

    .line 1555
    .local v7, "inflater":Landroid/view/LayoutInflater;
    const v15, 0x7f030003

    const/16 v16, 0x0

    move-object/from16 v0, v16

    invoke-virtual {v7, v15, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v14

    .line 1556
    .local v14, "v":Landroid/view/View;
    invoke-virtual {v1, v14}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1557
    const v15, 0x7f0700ba

    move-object/from16 v0, p0

    invoke-virtual {v0, v15}, Lcom/hmobile/biblekjv/MainBookActivity;->getString(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1, v15}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1558
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v4

    .line 1560
    .local v4, "dialog":Landroid/app/AlertDialog;
    const v15, 0x7f0e0025

    invoke-virtual {v14, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/widget/Spinner;

    .line 1562
    .local v13, "spnAudioSpeed":Landroid/widget/Spinner;
    const v15, 0x7f0e0028

    invoke-virtual {v14, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    .line 1561
    check-cast v8, Landroid/widget/SeekBar;

    .line 1565
    .local v8, "seekAudiopitch":Landroid/widget/SeekBar;
    const v15, 0x7f0e0029

    invoke-virtual {v14, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 1564
    check-cast v3, Landroid/widget/Button;

    .line 1567
    .local v3, "btnSaveSettings":Landroid/widget/Button;
    const-string v15, "speech_speed"

    const/high16 v16, 0x3f800000    # 1.0f

    move/from16 v0, v16

    invoke-interface {v9, v15, v0}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    move-result v11

    .line 1569
    .local v11, "speechSpeed":F
    const/4 v12, 0x0

    .line 1570
    .local v12, "speechspeed_id":I
    const/4 v6, 0x0

    .local v6, "i":I
    :goto_0
    array-length v15, v2

    if-lt v6, v15, :cond_0

    .line 1630
    return-void

    .line 1571
    :cond_0
    aget v15, v2, v6

    cmpl-float v15, v11, v15

    if-nez v15, :cond_1

    .line 1572
    move v12, v6

    .line 1574
    :cond_1
    invoke-virtual {v13, v12}, Landroid/widget/Spinner;->setSelection(I)V

    .line 1576
    const-string v15, "speech_pitch"

    const/16 v16, 0xa

    move/from16 v0, v16

    invoke-interface {v9, v15, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v10

    .line 1577
    invoke-virtual {v8, v10}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 1580
    new-instance v15, Lcom/hmobile/biblekjv/MainBookActivity$17;

    move-object/from16 v0, p0

    invoke-direct {v15, v0, v5}, Lcom/hmobile/biblekjv/MainBookActivity$17;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;Landroid/content/SharedPreferences$Editor;)V

    invoke-virtual {v8, v15}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 1600
    new-instance v15, Lcom/hmobile/biblekjv/MainBookActivity$18;

    move-object/from16 v0, p0

    invoke-direct {v15, v0, v5, v2}, Lcom/hmobile/biblekjv/MainBookActivity$18;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;Landroid/content/SharedPreferences$Editor;[F)V

    invoke-virtual {v13, v15}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 1617
    new-instance v15, Lcom/hmobile/biblekjv/MainBookActivity$19;

    move-object/from16 v0, p0

    invoke-direct {v15, v0, v5, v4}, Lcom/hmobile/biblekjv/MainBookActivity$19;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;Landroid/content/SharedPreferences$Editor;Landroid/app/AlertDialog;)V

    invoke-virtual {v3, v15}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1627
    invoke-virtual {v4}, Landroid/app/AlertDialog;->show()V

    .line 1570
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 1546
    nop

    :array_0
    .array-data 4
        0x3f000000    # 0.5f
        0x3f333333    # 0.7f
        0x3f800000    # 1.0f
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
.end method

.method public ShowAlertForFacebook(Ljava/lang/String;)V
    .locals 14
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 1361
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1364
    .local v0, "alertDialog":Landroid/app/AlertDialog$Builder;
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v6

    .line 1365
    .local v6, "inflater":Landroid/view/LayoutInflater;
    const v9, 0x7f03001e

    const/4 v10, 0x0

    invoke-virtual {v6, v9, v10}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 1366
    .local v7, "v":Landroid/view/View;
    invoke-virtual {v0, v7}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1367
    const v9, 0x7f07009b

    invoke-virtual {p0, v9}, Lcom/hmobile/biblekjv/MainBookActivity;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1368
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v2

    .line 1370
    .local v2, "dialog":Landroid/app/AlertDialog;
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v9

    invoke-interface {v9}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v3

    .line 1371
    .local v3, "dm":Landroid/view/Display;
    invoke-virtual {v3}, Landroid/view/Display;->getWidth()I

    move-result v8

    .line 1372
    .local v8, "width":I
    invoke-virtual {v3}, Landroid/view/Display;->getHeight()I

    move-result v5

    .line 1374
    .local v5, "height":I
    int-to-double v10, v8

    const-wide/high16 v12, 0x3fe0000000000000L    # 0.5

    div-double/2addr v10, v12

    double-to-int v9, v10

    invoke-virtual {v7, v9}, Landroid/view/View;->setMinimumWidth(I)V

    .line 1375
    div-int/lit8 v9, v5, 0x4

    invoke-virtual {v7, v9}, Landroid/view/View;->setMinimumHeight(I)V

    .line 1377
    const v9, 0x7f0e009d

    invoke-virtual {v7, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/EditText;

    .line 1378
    .local v4, "edtText":Landroid/widget/EditText;
    invoke-virtual {v4, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 1379
    const v9, 0x7f0e009e

    invoke-virtual {v7, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 1381
    .local v1, "btnOkay":Landroid/widget/Button;
    new-instance v9, Lcom/hmobile/biblekjv/MainBookActivity$13;

    invoke-direct {v9, p0, v4, v2}, Lcom/hmobile/biblekjv/MainBookActivity$13;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;Landroid/widget/EditText;Landroid/app/AlertDialog;)V

    invoke-virtual {v1, v9}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1394
    invoke-virtual {v2}, Landroid/app/AlertDialog;->show()V

    .line 1395
    return-void
.end method

.method public ShowAlertForSetting()V
    .locals 22

    .prologue
    .line 1410
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v18

    .line 1411
    const v19, 0x7f0d0005

    .line 1410
    invoke-virtual/range {v18 .. v19}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v7

    .line 1412
    .local v7, "fontStyle":[Ljava/lang/String;
    const/16 v18, 0x4

    move/from16 v0, v18

    new-array v6, v0, [I

    fill-array-data v6, :array_0

    .line 1414
    .local v6, "f_size":[I
    invoke-static/range {p0 .. p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v13

    .line 1415
    .local v13, "settings":Landroid/content/SharedPreferences;
    invoke-interface {v13}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    .line 1417
    .local v5, "editor":Landroid/content/SharedPreferences$Editor;
    new-instance v2, Landroid/app/AlertDialog$Builder;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1419
    .local v2, "alertDialog":Landroid/app/AlertDialog$Builder;
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v12

    .line 1420
    .local v12, "inflater":Landroid/view/LayoutInflater;
    const v18, 0x7f03002d

    const/16 v19, 0x0

    move/from16 v0, v18

    move-object/from16 v1, v19

    invoke-virtual {v12, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v17

    .line 1421
    .local v17, "v":Landroid/view/View;
    move-object/from16 v0, v17

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1422
    const v18, 0x7f070062

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/hmobile/biblekjv/MainBookActivity;->getString(I)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1423
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v4

    .line 1425
    .local v4, "dialog":Landroid/app/AlertDialog;
    const v18, 0x7f0e00d5

    invoke-virtual/range {v17 .. v18}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Landroid/widget/Spinner;

    .line 1426
    .local v14, "spnFontSize":Landroid/widget/Spinner;
    const v18, 0x7f0e00d8

    invoke-virtual/range {v17 .. v18}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Landroid/widget/Spinner;

    .line 1428
    .local v15, "spnFontStyle":Landroid/widget/Spinner;
    const v18, 0x7f0e00d9

    invoke-virtual/range {v17 .. v18}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    .line 1430
    .local v3, "btnSaveSettings":Landroid/widget/Button;
    const-string v18, "font_style"

    .line 1431
    const-string v19, "robotoregular.ttf"

    .line 1430
    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-interface {v13, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 1432
    .local v16, "stylename":Ljava/lang/String;
    const-string v18, "font_size"

    const/16 v19, 0x12

    move-object/from16 v0, v18

    move/from16 v1, v19

    invoke-interface {v13, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v8

    .line 1435
    .local v8, "fontsize":I
    const/4 v9, 0x0

    .line 1436
    .local v9, "fontsize_id":I
    const/4 v11, 0x0

    .local v11, "i":I
    :goto_0
    array-length v0, v6

    move/from16 v18, v0

    move/from16 v0, v18

    if-lt v11, v0, :cond_0

    .line 1442
    :goto_1
    invoke-virtual {v14, v9}, Landroid/widget/Spinner;->setSelection(I)V

    .line 1444
    const/4 v10, 0x0

    .line 1445
    .local v10, "fontstyle_id":I
    const/4 v11, 0x0

    :goto_2
    array-length v0, v7

    move/from16 v18, v0

    move/from16 v0, v18

    if-lt v11, v0, :cond_2

    .line 1453
    :goto_3
    invoke-virtual {v15, v10}, Landroid/widget/Spinner;->setSelection(I)V

    .line 1455
    new-instance v18, Lcom/hmobile/biblekjv/MainBookActivity$14;

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v5, v6}, Lcom/hmobile/biblekjv/MainBookActivity$14;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;Landroid/content/SharedPreferences$Editor;[I)V

    move-object/from16 v0, v18

    invoke-virtual {v14, v0}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 1470
    new-instance v18, Lcom/hmobile/biblekjv/MainBookActivity$15;

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v7, v5}, Lcom/hmobile/biblekjv/MainBookActivity$15;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;[Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)V

    move-object/from16 v0, v18

    invoke-virtual {v15, v0}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 1488
    new-instance v18, Lcom/hmobile/biblekjv/MainBookActivity$16;

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v5, v4}, Lcom/hmobile/biblekjv/MainBookActivity$16;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;Landroid/content/SharedPreferences$Editor;Landroid/app/AlertDialog;)V

    move-object/from16 v0, v18

    invoke-virtual {v3, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1498
    invoke-virtual {v4}, Landroid/app/AlertDialog;->show()V

    .line 1499
    return-void

    .line 1437
    .end local v10    # "fontstyle_id":I
    :cond_0
    aget v18, v6, v11

    move/from16 v0, v18

    if-ne v8, v0, :cond_1

    .line 1438
    move v9, v11

    .line 1439
    goto :goto_1

    .line 1436
    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 1446
    .restart local v10    # "fontstyle_id":I
    :cond_2
    new-instance v18, Ljava/lang/StringBuilder;

    aget-object v19, v7, v11

    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v19

    .line 1447
    const-string v20, "-"

    const-string v21, ""

    .line 1446
    invoke-virtual/range {v19 .. v21}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v19

    invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1448
    const-string v19, ".ttf"

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 1446
    move-object/from16 v0, v16

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v18

    .line 1448
    if-eqz v18, :cond_3

    .line 1449
    move v10, v11

    .line 1450
    goto :goto_3

    .line 1445
    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 1412
    nop

    :array_0
    .array-data 4
        0xc
        0xe
        0x12
        0x16
    .end array-data
.end method

.method public SuccessFully()V
    .locals 3

    .prologue
    .line 1399
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->m_verse_number_list:Ljava/util/ArrayList;

    iget v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    iget v2, p0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    invoke-virtual {p0, v0, v1, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->PostShare(Ljava/util/ArrayList;II)V

    .line 1400
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->Reset()V

    .line 1401
    return-void
.end method

.method public addBlueToolTipView(Ljava/lang/String;Landroid/view/View;)V
    .locals 3
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "btn"    # Landroid/view/View;

    .prologue
    .line 1633
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->mToolTipFrameLayout:Lcom/hmobile/tooltip/ToolTipRelativeLayout;

    new-instance v1, Lcom/hmobile/tooltip/ToolTip;

    invoke-direct {v1}, Lcom/hmobile/tooltip/ToolTip;-><init>()V

    .line 1634
    invoke-virtual {v1, p1}, Lcom/hmobile/tooltip/ToolTip;->withText(Ljava/lang/CharSequence;)Lcom/hmobile/tooltip/ToolTip;

    move-result-object v1

    const-string v2, "#383838"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/hmobile/tooltip/ToolTip;->withColor(I)Lcom/hmobile/tooltip/ToolTip;

    move-result-object v1

    .line 1635
    const/16 v2, 0x65

    invoke-virtual {v1, v2}, Lcom/hmobile/tooltip/ToolTip;->withAnimationType(I)Lcom/hmobile/tooltip/ToolTip;

    move-result-object v1

    .line 1633
    invoke-virtual {v0, v1, p2}, Lcom/hmobile/tooltip/ToolTipRelativeLayout;->showToolTipForView(Lcom/hmobile/tooltip/ToolTip;Landroid/view/View;)Lcom/hmobile/tooltip/ToolTipView;

    move-result-object v0

    iput-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->mBlueToolTipView:Lcom/hmobile/tooltip/ToolTipView;

    .line 1636
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->mBlueToolTipView:Lcom/hmobile/tooltip/ToolTipView;

    .line 1637
    new-instance v1, Lcom/hmobile/biblekjv/MainBookActivity$20;

    invoke-direct {v1, p0}, Lcom/hmobile/biblekjv/MainBookActivity$20;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;)V

    invoke-virtual {v0, v1}, Lcom/hmobile/tooltip/ToolTipView;->setOnToolTipViewClickedListener(Lcom/hmobile/tooltip/ToolTipView$OnToolTipViewClickedListener;)V

    .line 1643
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "ev"    # Landroid/view/MotionEvent;

    .prologue
    .line 1539
    invoke-super {p0, p1}, Lcom/hmobile/biblekjv/BaseActivity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1540
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->flingDetector:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public hidekeyBoard()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1129
    const-string v1, "input_method"

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/MainBookActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 1130
    .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->edtLable:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 1131
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->edtTitle:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 1132
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->edtSearch:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 1133
    return-void
.end method

.method public loadData()V
    .locals 34

    .prologue
    .line 512
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->ll:Landroid/widget/LinearLayout;

    move-object/from16 v26, v0

    invoke-virtual/range {v26 .. v26}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 515
    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    move/from16 v26, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    move/from16 v27, v0

    .line 514
    invoke-static/range {v26 .. v27}, Lcom/hmobile/model/BookMarkInfo;->getBookMarkInfoByPageNumber(II)Ljava/util/ArrayList;

    move-result-object v6

    .line 516
    .local v6, "b":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/BookMarkInfo;>;"
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->settings:Landroid/content/SharedPreferences;

    move-object/from16 v26, v0

    const-string v27, "font_style"

    .line 517
    const-string v28, "robotoregular.ttf"

    .line 516
    invoke-interface/range {v26 .. v28}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 518
    .local v20, "stylename":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->settings:Landroid/content/SharedPreferences;

    move-object/from16 v26, v0

    const-string v27, "low_light"

    const/16 v28, 0x1

    invoke-interface/range {v26 .. v28}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v13

    .line 519
    .local v13, "isLowlight":Z
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->settings:Landroid/content/SharedPreferences;

    move-object/from16 v26, v0

    const-string v27, "font_size"

    const/16 v28, 0x12

    invoke-interface/range {v26 .. v28}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v11

    .line 520
    .local v11, "fontsize":I
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v26

    move-object/from16 v0, v26

    move-object/from16 v1, v20

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v10

    .line 522
    .local v10, "fontStyle":Landroid/graphics/Typeface;
    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    move/from16 v26, v0

    .line 523
    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    move/from16 v27, v0

    .line 522
    invoke-static/range {v26 .. v27}, Lcom/hmobile/model/BookInfo;->getBookbyPage(II)Ljava/util/ArrayList;

    move-result-object v15

    .line 524
    .local v15, "m_lsit":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/VerseInfo;>;"
    move-object/from16 v0, p0

    iput-object v15, v0, Lcom/hmobile/biblekjv/MainBookActivity;->m_verselist:Ljava/util/ArrayList;

    .line 526
    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    move/from16 v26, v0

    invoke-static/range {v26 .. v26}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v26

    .line 525
    invoke-static/range {v26 .. v26}, Lcom/hmobile/common/Utils;->ConvertToLong(Ljava/lang/String;)J

    move-result-wide v26

    invoke-static/range {v26 .. v27}, Lcom/hmobile/model/BookInfo;->getBookNameByBookid(J)Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/hmobile/biblekjv/MainBookActivity;->bookname:Ljava/lang/String;

    .line 527
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->txtBookAndChapterName:Landroid/widget/TextView;

    move-object/from16 v26, v0

    new-instance v27, Ljava/lang/StringBuilder;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->bookname:Ljava/lang/String;

    move-object/from16 v28, v0

    invoke-static/range {v28 .. v28}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v28

    invoke-direct/range {v27 .. v28}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v28, " / "

    invoke-virtual/range {v27 .. v28}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v27

    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    move/from16 v28, v0

    invoke-virtual/range {v27 .. v28}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v27

    invoke-virtual/range {v27 .. v27}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 528
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->txtContent:Landroid/widget/TextView;

    move-object/from16 v26, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->bookname:Ljava/lang/String;

    move-object/from16 v27, v0

    invoke-virtual/range {v26 .. v27}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 529
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->txtContent:Landroid/widget/TextView;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 530
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->txtContent:Landroid/widget/TextView;

    move-object/from16 v26, v0

    int-to-float v0, v11

    move/from16 v27, v0

    invoke-virtual/range {v26 .. v27}, Landroid/widget/TextView;->setTextSize(F)V

    .line 531
    if-eqz v13, :cond_1

    .line 532
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->txtContent:Landroid/widget/TextView;

    move-object/from16 v26, v0

    const/high16 v27, -0x1000000

    invoke-virtual/range {v26 .. v27}, Landroid/widget/TextView;->setTextColor(I)V

    .line 533
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->rlmain:Landroid/widget/RelativeLayout;

    move-object/from16 v26, v0

    const/16 v27, -0x1

    invoke-virtual/range {v26 .. v27}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 538
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->ll:Landroid/widget/LinearLayout;

    move-object/from16 v26, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->txtContent:Landroid/widget/TextView;

    move-object/from16 v27, v0

    invoke-virtual/range {v26 .. v27}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 539
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->txtContent:Landroid/widget/TextView;

    move-object/from16 v26, v0

    new-instance v27, Lcom/hmobile/biblekjv/MainBookActivity$7;

    move-object/from16 v0, v27

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/hmobile/biblekjv/MainBookActivity$7;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;)V

    invoke-virtual/range {v26 .. v27}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 548
    const/16 v25, 0x1

    .line 549
    .local v25, "verse_count":I
    if-eqz v15, :cond_9

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v26

    if-lez v26, :cond_9

    .line 550
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v27

    :goto_1
    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->hasNext()Z

    move-result v26

    if-nez v26, :cond_2

    .line 653
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->isttsOn:Z

    move/from16 v26, v0

    if-eqz v26, :cond_0

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->isTTsContinue:Z

    move/from16 v26, v0

    if-eqz v26, :cond_0

    .line 654
    const-string v26, "is tts on after chapter change"

    invoke-static/range {v26 .. v26}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    .line 655
    invoke-direct/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->stopSpeech()V

    .line 656
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->m_verselist:Ljava/util/ArrayList;

    move-object/from16 v26, v0

    move-object/from16 v0, p0

    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Lcom/hmobile/biblekjv/MainBookActivity;->SetSpeech(Ljava/util/ArrayList;)V

    .line 658
    :cond_0
    new-instance v14, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;

    move-object/from16 v0, p0

    invoke-direct {v14, v0}, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;)V

    .line 659
    .local v14, "load":Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;
    const/16 v26, 0x0

    move/from16 v0, v26

    new-array v0, v0, [Ljava/lang/Void;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    invoke-virtual {v14, v0}, Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 665
    .end local v14    # "load":Lcom/hmobile/biblekjv/MainBookActivity$ScrolltoPage;
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->editor:Landroid/content/SharedPreferences$Editor;

    move-object/from16 v26, v0

    const-string v27, "last_read_chapter"

    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    move/from16 v28, v0

    invoke-interface/range {v26 .. v28}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 666
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->editor:Landroid/content/SharedPreferences$Editor;

    move-object/from16 v26, v0

    const-string v27, "last_read_book"

    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    move/from16 v28, v0

    invoke-interface/range {v26 .. v28}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 667
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->editor:Landroid/content/SharedPreferences$Editor;

    move-object/from16 v26, v0

    invoke-interface/range {v26 .. v26}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 668
    return-void

    .line 535
    .end local v25    # "verse_count":I
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->txtContent:Landroid/widget/TextView;

    move-object/from16 v26, v0

    const/16 v27, -0x1

    invoke-virtual/range {v26 .. v27}, Landroid/widget/TextView;->setTextColor(I)V

    .line 536
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->rlmain:Landroid/widget/RelativeLayout;

    move-object/from16 v26, v0

    const/high16 v27, -0x1000000

    invoke-virtual/range {v26 .. v27}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    goto/16 :goto_0

    .line 550
    .restart local v25    # "verse_count":I
    :cond_2
    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/hmobile/model/VerseInfo;

    .line 552
    .local v18, "s":Lcom/hmobile/model/VerseInfo;
    new-instance v22, Lcom/hmobile/biblekjv/ClickPreventableTextView;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/hmobile/biblekjv/ClickPreventableTextView;-><init>(Landroid/content/Context;)V

    .line 554
    .local v22, "txtVerse":Lcom/hmobile/biblekjv/ClickPreventableTextView;
    const/16 v26, 0x0

    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v26

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/hmobile/biblekjv/ClickPreventableTextView;->setTag(Ljava/lang/Object;)V

    .line 555
    new-instance v26, Landroid/widget/LinearLayout$LayoutParams;

    .line 556
    const/16 v28, -0x1

    const/16 v29, -0x2

    move-object/from16 v0, v26

    move/from16 v1, v28

    move/from16 v2, v29

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 555
    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/hmobile/biblekjv/ClickPreventableTextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 557
    const/16 v26, 0x0

    const/16 v28, 0x5

    const/16 v29, 0x0

    const/16 v30, 0x5

    move-object/from16 v0, v22

    move/from16 v1, v26

    move/from16 v2, v28

    move/from16 v3, v29

    move/from16 v4, v30

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/hmobile/biblekjv/ClickPreventableTextView;->setPadding(IIII)V

    .line 558
    new-instance v26, Ljava/lang/StringBuilder;

    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    move/from16 v28, v0

    invoke-static/range {v28 .. v28}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v26

    move-object/from16 v1, v28

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v28, ":"

    move-object/from16 v0, v26

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    move-object/from16 v0, v26

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v28, " "

    move-object/from16 v0, v26

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    .line 559
    .local v19, "setNumber":Ljava/lang/String;
    new-instance v26, Ljava/lang/StringBuilder;

    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v26

    move-object/from16 v1, v28

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/hmobile/model/VerseInfo;->Verse:Ljava/lang/String;

    move-object/from16 v28, v0

    move-object/from16 v0, v26

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/hmobile/biblekjv/ClickPreventableTextView;->setText(Ljava/lang/CharSequence;)V

    .line 560
    move-object/from16 v0, v22

    invoke-virtual {v0, v10}, Lcom/hmobile/biblekjv/ClickPreventableTextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 561
    int-to-float v0, v11

    move/from16 v26, v0

    move-object/from16 v0, v22

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/hmobile/biblekjv/ClickPreventableTextView;->setTextSize(F)V

    .line 562
    const/high16 v26, 0x3f800000    # 1.0f

    const/high16 v28, 0x3f800000    # 1.0f

    move-object/from16 v0, v22

    move/from16 v1, v26

    move/from16 v2, v28

    invoke-virtual {v0, v1, v2}, Lcom/hmobile/biblekjv/ClickPreventableTextView;->setLineSpacing(FF)V

    .line 563
    if-eqz v13, :cond_6

    .line 564
    const/high16 v26, -0x1000000

    move-object/from16 v0, v22

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/hmobile/biblekjv/ClickPreventableTextView;->setTextColor(I)V

    .line 569
    :goto_3
    new-instance v21, Landroid/text/SpannableString;

    new-instance v26, Ljava/lang/StringBuilder;

    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v26

    move-object/from16 v1, v28

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/hmobile/model/VerseInfo;->Verse:Ljava/lang/String;

    move-object/from16 v28, v0

    move-object/from16 v0, v26

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, v21

    move-object/from16 v1, v26

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 570
    .local v21, "text":Landroid/text/Spannable;
    move-object/from16 v0, v18

    iget v0, v0, Lcom/hmobile/model/VerseInfo;->BookId:I

    move/from16 v26, v0

    .line 571
    move-object/from16 v0, v18

    iget v0, v0, Lcom/hmobile/model/VerseInfo;->ChapterNumber:I

    move/from16 v28, v0

    move-object/from16 v0, v18

    iget v0, v0, Lcom/hmobile/model/VerseInfo;->VerseNumber:I

    move/from16 v29, v0

    .line 570
    move/from16 v0, v26

    move/from16 v1, v28

    move/from16 v2, v29

    invoke-static {v0, v1, v2}, Lcom/hmobile/model/NotesInfo;->isVerseNoted(III)Lcom/hmobile/model/NotesInfo;

    move-result-object v16

    .line 572
    .local v16, "ninfo":Lcom/hmobile/model/NotesInfo;
    if-eqz v16, :cond_3

    .line 575
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v26

    const v28, 0x7f02007f

    .line 574
    move-object/from16 v0, v26

    move/from16 v1, v28

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v17

    .line 576
    .local v17, "noteicon":Landroid/graphics/Bitmap;
    new-instance v12, Landroid/text/style/ImageSpan;

    .line 577
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v26

    .line 576
    move-object/from16 v0, v26

    move-object/from16 v1, v17

    invoke-direct {v12, v0, v1}, Landroid/text/style/ImageSpan;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    .line 578
    .local v12, "imagespan":Landroid/text/style/ImageSpan;
    new-instance v9, Lcom/hmobile/biblekjv/MainBookActivity$8;

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-direct {v9, v0, v1}, Lcom/hmobile/biblekjv/MainBookActivity$8;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;Lcom/hmobile/model/NotesInfo;)V

    .line 595
    .local v9, "cspan":Landroid/text/style/ClickableSpan;
    new-instance v26, Ljava/lang/StringBuilder;

    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v26

    move-object/from16 v1, v28

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/hmobile/model/VerseInfo;->Verse:Ljava/lang/String;

    move-object/from16 v28, v0

    move-object/from16 v0, v26

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/String;->length()I

    move-result v26

    add-int/lit8 v26, v26, -0x1

    .line 596
    new-instance v28, Ljava/lang/StringBuilder;

    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v29

    invoke-direct/range {v28 .. v29}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/hmobile/model/VerseInfo;->Verse:Ljava/lang/String;

    move-object/from16 v29, v0

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/String;->length()I

    move-result v28

    const/16 v29, 0x0

    .line 595
    move-object/from16 v0, v21

    move/from16 v1, v26

    move/from16 v2, v28

    move/from16 v3, v29

    invoke-interface {v0, v12, v1, v2, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 597
    new-instance v26, Ljava/lang/StringBuilder;

    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v28

    move-object/from16 v0, v26

    move-object/from16 v1, v28

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/hmobile/model/VerseInfo;->Verse:Ljava/lang/String;

    move-object/from16 v28, v0

    move-object/from16 v0, v26

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/String;->length()I

    move-result v26

    add-int/lit8 v26, v26, -0x1

    .line 598
    new-instance v28, Ljava/lang/StringBuilder;

    invoke-static/range {v19 .. v19}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v29

    invoke-direct/range {v28 .. v29}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/hmobile/model/VerseInfo;->Verse:Ljava/lang/String;

    move-object/from16 v29, v0

    invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v28

    invoke-virtual/range {v28 .. v28}, Ljava/lang/String;->length()I

    move-result v28

    const/16 v29, 0x0

    .line 597
    move-object/from16 v0, v21

    move/from16 v1, v26

    move/from16 v2, v28

    move/from16 v3, v29

    invoke-interface {v0, v9, v1, v2, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 600
    .end local v9    # "cspan":Landroid/text/style/ClickableSpan;
    .end local v12    # "imagespan":Landroid/text/style/ImageSpan;
    .end local v17    # "noteicon":Landroid/graphics/Bitmap;
    :cond_3
    if-eqz v6, :cond_5

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v26

    if-lez v26, :cond_5

    .line 601
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v28

    :cond_4
    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->hasNext()Z

    move-result v26

    if-nez v26, :cond_7

    .line 620
    :cond_5
    move-object/from16 v0, v22

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lcom/hmobile/biblekjv/ClickPreventableTextView;->setText(Ljava/lang/CharSequence;)V

    .line 621
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v26

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/hmobile/biblekjv/ClickPreventableTextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 623
    new-instance v26, Lcom/hmobile/biblekjv/MainBookActivity$9;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    move-object/from16 v2, v18

    move-object/from16 v3, v22

    invoke-direct {v0, v1, v2, v3}, Lcom/hmobile/biblekjv/MainBookActivity$9;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;Lcom/hmobile/model/VerseInfo;Lcom/hmobile/biblekjv/ClickPreventableTextView;)V

    move-object/from16 v0, v22

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/hmobile/biblekjv/ClickPreventableTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 649
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->ll:Landroid/widget/LinearLayout;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 650
    add-int/lit8 v25, v25, 0x1

    goto/16 :goto_1

    .line 566
    .end local v16    # "ninfo":Lcom/hmobile/model/NotesInfo;
    .end local v21    # "text":Landroid/text/Spannable;
    :cond_6
    const/16 v26, -0x1

    move-object/from16 v0, v22

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/hmobile/biblekjv/ClickPreventableTextView;->setTextColor(I)V

    goto/16 :goto_3

    .line 601
    .restart local v16    # "ninfo":Lcom/hmobile/model/NotesInfo;
    .restart local v21    # "text":Landroid/text/Spannable;
    :cond_7
    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/hmobile/model/BookMarkInfo;

    .line 602
    .local v7, "bookMarkInfo":Lcom/hmobile/model/BookMarkInfo;
    iget-boolean v0, v7, Lcom/hmobile/model/BookMarkInfo;->isBackColor:Z

    move/from16 v26, v0

    if-eqz v26, :cond_4

    .line 603
    iget-object v0, v7, Lcom/hmobile/model/BookMarkInfo;->Verse:Ljava/lang/String;

    move-object/from16 v26, v0

    .line 604
    const-string v29, "###"

    move-object/from16 v0, v26

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 605
    .local v8, "bookmarkverse":[Ljava/lang/String;
    array-length v0, v8

    move/from16 v29, v0

    const/16 v26, 0x0

    :goto_4
    move/from16 v0, v26

    move/from16 v1, v29

    if-ge v0, v1, :cond_4

    aget-object v24, v8, v26

    .line 606
    .local v24, "verse":Ljava/lang/String;
    new-instance v30, Ljava/lang/StringBuilder;

    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    move/from16 v31, v0

    invoke-static/range {v31 .. v31}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v31

    invoke-direct/range {v30 .. v31}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v31, ":"

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    move-object/from16 v0, v30

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v30

    const-string v31, " "

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    .line 607
    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/hmobile/model/VerseInfo;->Verse:Ljava/lang/String;

    move-object/from16 v31, v0

    invoke-virtual/range {v30 .. v31}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v30

    .line 606
    invoke-virtual/range {v30 .. v30}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v23

    .line 608
    .local v23, "v":Ljava/lang/String;
    invoke-virtual/range {v23 .. v24}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v30

    if-eqz v30, :cond_8

    .line 611
    new-instance v30, Landroid/text/style/BackgroundColorSpan;

    .line 612
    iget v0, v7, Lcom/hmobile/model/BookMarkInfo;->backColor:I

    move/from16 v31, v0

    invoke-direct/range {v30 .. v31}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    const/16 v31, 0x0

    .line 613
    invoke-interface/range {v21 .. v21}, Landroid/text/Spannable;->length()I

    move-result v32

    .line 614
    const/16 v33, 0x12

    .line 611
    move-object/from16 v0, v21

    move-object/from16 v1, v30

    move/from16 v2, v31

    move/from16 v3, v32

    move/from16 v4, v33

    invoke-interface {v0, v1, v2, v3, v4}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 605
    :cond_8
    add-int/lit8 v26, v26, 0x1

    goto :goto_4

    .line 661
    .end local v7    # "bookMarkInfo":Lcom/hmobile/model/BookMarkInfo;
    .end local v8    # "bookmarkverse":[Ljava/lang/String;
    .end local v16    # "ninfo":Lcom/hmobile/model/NotesInfo;
    .end local v18    # "s":Lcom/hmobile/model/VerseInfo;
    .end local v19    # "setNumber":Ljava/lang/String;
    .end local v21    # "text":Landroid/text/Spannable;
    .end local v22    # "txtVerse":Lcom/hmobile/biblekjv/ClickPreventableTextView;
    .end local v23    # "v":Ljava/lang/String;
    .end local v24    # "verse":Ljava/lang/String;
    :cond_9
    move-object/from16 v0, p0

    iget v0, v0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    move/from16 v26, v0

    add-int/lit8 v26, v26, 0x1

    move/from16 v0, v26

    move-object/from16 v1, p0

    iput v0, v1, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    .line 662
    const/16 v26, 0x1

    move/from16 v0, v26

    move-object/from16 v1, p0

    iput v0, v1, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    .line 663
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->loadData()V

    goto/16 :goto_2
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 9
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    const/4 v0, -0x1

    const/4 v1, 0x1

    .line 1055
    packed-switch p1, :pswitch_data_0

    .line 1107
    invoke-super {p0, p1, p2, p3}, Lcom/hmobile/biblekjv/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 1109
    :cond_0
    :goto_0
    return-void

    .line 1057
    :pswitch_0
    if-ne p2, v0, :cond_1

    .line 1058
    const-string v0, "book_id"

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    .line 1059
    const-string v0, "chap_id"

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    .line 1060
    const-string v0, "verse_id"

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->verse_id:I

    .line 1061
    iput-boolean v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromSelectActivity:Z

    .line 1062
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->loadData()V

    goto :goto_0

    .line 1066
    :cond_1
    :pswitch_1
    if-ne p2, v0, :cond_0

    .line 1067
    const-string v0, "book_id"

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    .line 1068
    const-string v0, "chap_id"

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    .line 1069
    const-string v0, "verse_id"

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->verse_id:I

    .line 1070
    iput-boolean v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromSearchActivity:Z

    .line 1071
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->loadData()V

    goto :goto_0

    .line 1075
    :pswitch_2
    if-eq p2, v1, :cond_0

    .line 1079
    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 1081
    .local v8, "installTTSIntent":Landroid/content/Intent;
    const-string v0, "android.speech.tts.engine.INSTALL_TTS_DATA"

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1082
    invoke-virtual {p0, v8}, Lcom/hmobile/biblekjv/MainBookActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 1086
    .end local v8    # "installTTSIntent":Landroid/content/Intent;
    :pswitch_3
    if-ne p2, v0, :cond_0

    .line 1087
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->Eventname:Ljava/lang/String;

    const-string v1, "BOOKMARKCOLOR"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1088
    const-string v0, "color"

    .line 1089
    const-string v1, "#00000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    .line 1088
    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->bookmarkcolor:I

    .line 1093
    const/4 v6, 0x1

    .line 1095
    .local v6, "isbackcolor":Z
    iget v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    iget v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    const-string v2, ""

    const-string v3, ""

    .line 1097
    sget-object v4, Lcom/hmobile/biblekjv/MainBookActivity;->m_selectedVerseList:Ljava/util/ArrayList;

    invoke-static {v4}, Lcom/hmobile/model/BookMarkInfo;->getStringFromArray(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v4

    .line 1098
    iget v5, p0, Lcom/hmobile/biblekjv/MainBookActivity;->verse_id:I

    iget v7, p0, Lcom/hmobile/biblekjv/MainBookActivity;->bookmarkcolor:I

    .line 1095
    invoke-static/range {v0 .. v7}, Lcom/hmobile/model/BookMarkInfo;->SaveBookMark(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZI)V

    .line 1099
    const-string v0, "Click"

    const-string v1, "Button"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Bookmaked "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1100
    iget v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/hmobile/biblekjv/MainBookActivity;->verse_id:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1099
    invoke-virtual {p0, v0, v1, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->sendAnalyticsevent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1101
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->Reset()V

    .line 1102
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->hidekeyBoard()V

    goto/16 :goto_0

    .line 1055
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public onBackPressed()V
    .locals 2

    .prologue
    .line 1674
    iget-boolean v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isttsOn:Z

    if-eqz v0, :cond_0

    .line 1675
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isttsOn:Z

    .line 1676
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgAudio:Landroid/widget/ImageView;

    const v1, 0x7f020074

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 1677
    invoke-direct {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->stopSpeech()V

    .line 1681
    :goto_0
    return-void

    .line 1679
    :cond_0
    invoke-super {p0}, Lcom/hmobile/biblekjv/BaseActivity;->onBackPressed()V

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 20
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 774
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgNext:Landroid/widget/ImageView;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_1

    .line 775
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->isTTsContinue:Z

    .line 776
    invoke-direct/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->clickNext()V

    .line 1010
    :cond_0
    :goto_0
    return-void

    .line 777
    :cond_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgPrevious:Landroid/widget/ImageView;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_2

    .line 778
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->isTTsContinue:Z

    .line 779
    invoke-direct/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->clickPrev()V

    goto :goto_0

    .line 780
    :cond_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgCancel:Landroid/widget/ImageView;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_3

    .line 781
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->Reset()V

    .line 782
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->hidekeyBoard()V

    goto :goto_0

    .line 783
    :cond_3
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgBookMark:Landroid/widget/ImageView;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_4

    .line 784
    new-instance v12, Landroid/content/Intent;

    .line 785
    const-class v2, Lcom/hmobile/biblekjv/PickColorActivity;

    .line 784
    move-object/from16 v0, p0

    invoke-direct {v12, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 786
    .local v12, "i":Landroid/content/Intent;
    const/4 v2, 0x3

    move-object/from16 v0, p0

    invoke-virtual {v0, v12, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 787
    const-string v2, "BOOKMARKCOLOR"

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->Eventname:Ljava/lang/String;

    goto :goto_0

    .line 788
    .end local v12    # "i":Landroid/content/Intent;
    :cond_4
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->btnSaveNotes:Landroid/widget/Button;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_7

    .line 789
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->edtLable:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-interface {v2}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v4

    .line 790
    .local v4, "lable":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->edtTitle:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-interface {v2}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v5

    .line 791
    .local v5, "title":Ljava/lang/String;
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->hidekeyBoard()V

    .line 793
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x1

    if-ge v2, v3, :cond_5

    .line 794
    const v2, 0x7f0700c1

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->showToast(Ljava/lang/String;)V

    goto :goto_0

    .line 795
    :cond_5
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x1

    if-ge v2, v3, :cond_6

    .line 796
    const v2, 0x7f0700c2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->showToast(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 798
    :cond_6
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->hidekeyBoard()V

    .line 799
    move-object/from16 v0, p0

    iget v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    move-object/from16 v0, p0

    iget v3, v0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    .line 800
    sget-object v6, Lcom/hmobile/biblekjv/MainBookActivity;->m_selectedVerseList:Ljava/util/ArrayList;

    invoke-static {v6}, Lcom/hmobile/model/NotesInfo;->getStringFromArray(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v6

    .line 801
    move-object/from16 v0, p0

    iget v7, v0, Lcom/hmobile/biblekjv/MainBookActivity;->verse_id:I

    .line 799
    invoke-static/range {v2 .. v7}, Lcom/hmobile/model/NotesInfo;->SaveNotes(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 802
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->llShowBookmark:Landroid/widget/LinearLayout;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 803
    const-string v2, "Click"

    const-string v3, "Button"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Save Notes "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 804
    move-object/from16 v0, p0

    iget v7, v0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    move-object/from16 v0, p0

    iget v7, v0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    move-object/from16 v0, p0

    iget v7, v0, Lcom/hmobile/biblekjv/MainBookActivity;->verse_id:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 803
    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->sendAnalyticsevent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 805
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->edtTitle:Landroid/widget/EditText;

    const-string v3, ""

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 806
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->edtLable:Landroid/widget/EditText;

    const-string v3, ""

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 807
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->Reset()V

    goto/16 :goto_0

    .line 810
    .end local v4    # "lable":Ljava/lang/String;
    .end local v5    # "title":Ljava/lang/String;
    :cond_7
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->llNotes:Landroid/widget/LinearLayout;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_9

    .line 811
    sget-object v2, Lcom/hmobile/biblekjv/MainBookActivity;->m_selectedVerseList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_8

    .line 812
    const v2, 0x7f0700c3

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->showToast(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 814
    :cond_8
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->llShowBookmark:Landroid/widget/LinearLayout;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_0

    .line 815
    :cond_9
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->btnCancelNotes:Landroid/widget/Button;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_a

    .line 816
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->edtTitle:Landroid/widget/EditText;

    const-string v3, ""

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 817
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->edtLable:Landroid/widget/EditText;

    const-string v3, ""

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 818
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->Reset()V

    .line 819
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->hidekeyBoard()V

    goto/16 :goto_0

    .line 820
    :cond_a
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgCopy:Landroid/widget/ImageView;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_d

    .line 821
    new-instance v16, Ljava/lang/StringBuilder;

    invoke-direct/range {v16 .. v16}, Ljava/lang/StringBuilder;-><init>()V

    .line 822
    .local v16, "sb":Ljava/lang/StringBuilder;
    sget-object v2, Lcom/hmobile/biblekjv/MainBookActivity;->m_selectedVerseList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_c

    .line 823
    sget-object v2, Lcom/hmobile/biblekjv/MainBookActivity;->m_selectedVerseList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_b

    .line 826
    const-string v2, " "

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 828
    move-object/from16 v0, p0

    iget v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/hmobile/common/Utils;->ConvertToLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 827
    invoke-static {v2, v3}, Lcom/hmobile/model/BookInfo;->getBookNameByBookid(J)Ljava/lang/String;

    move-result-object v8

    .line 829
    .local v8, "bookname":Ljava/lang/String;
    move-object/from16 v0, v16

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 830
    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->CopyText(Ljava/lang/String;)V

    .line 831
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->Reset()V

    goto/16 :goto_0

    .line 823
    .end local v8    # "bookname":Ljava/lang/String;
    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 824
    .local v10, "copy":Ljava/lang/String;
    move-object/from16 v0, v16

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 834
    .end local v10    # "copy":Ljava/lang/String;
    :cond_c
    const v2, 0x7f0700c4

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->showToast(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 836
    .end local v16    # "sb":Ljava/lang/StringBuilder;
    :cond_d
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgFacebook:Landroid/widget/ImageView;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_10

    .line 837
    new-instance v16, Ljava/lang/StringBuilder;

    invoke-direct/range {v16 .. v16}, Ljava/lang/StringBuilder;-><init>()V

    .line 838
    .restart local v16    # "sb":Ljava/lang/StringBuilder;
    sget-object v2, Lcom/hmobile/biblekjv/MainBookActivity;->m_selectedVerseList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_f

    .line 839
    sget-object v2, Lcom/hmobile/biblekjv/MainBookActivity;->m_selectedVerseList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_e

    .line 844
    move-object/from16 v0, p0

    iget v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/hmobile/common/Utils;->ConvertToLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 843
    invoke-static {v2, v3}, Lcom/hmobile/model/BookInfo;->getBookNameByBookid(J)Ljava/lang/String;

    move-result-object v8

    .line 845
    .restart local v8    # "bookname":Ljava/lang/String;
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 846
    const v3, 0x7f070084

    .line 845
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 847
    .local v15, "link":Ljava/lang/String;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 850
    .local v17, "share":Ljava/lang/String;
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/hmobile/biblekjv/MainBookActivity;->ShowAlertForFacebook(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 839
    .end local v8    # "bookname":Ljava/lang/String;
    .end local v15    # "link":Ljava/lang/String;
    .end local v17    # "share":Ljava/lang/String;
    :cond_e
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 840
    .restart local v10    # "copy":Ljava/lang/String;
    move-object/from16 v0, v16

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 855
    .end local v10    # "copy":Ljava/lang/String;
    :cond_f
    const v2, 0x7f0700c5

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->showToast(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 858
    .end local v16    # "sb":Ljava/lang/StringBuilder;
    :cond_10
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgTwitter:Landroid/widget/ImageView;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_14

    .line 859
    new-instance v16, Ljava/lang/StringBuilder;

    invoke-direct/range {v16 .. v16}, Ljava/lang/StringBuilder;-><init>()V

    .line 860
    .restart local v16    # "sb":Ljava/lang/StringBuilder;
    sget-object v2, Lcom/hmobile/biblekjv/MainBookActivity;->m_selectedVerseList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_13

    .line 861
    sget-object v2, Lcom/hmobile/biblekjv/MainBookActivity;->m_selectedVerseList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_11

    .line 865
    move-object/from16 v0, p0

    iget v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/hmobile/common/Utils;->ConvertToLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 864
    invoke-static {v2, v3}, Lcom/hmobile/model/BookInfo;->getBookNameByBookid(J)Ljava/lang/String;

    move-result-object v8

    .line 866
    .restart local v8    # "bookname":Ljava/lang/String;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 867
    .restart local v17    # "share":Ljava/lang/String;
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x8c

    if-le v2, v3, :cond_12

    .line 868
    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    move-object/from16 v1, p0

    invoke-virtual {v0, v2, v1}, Lcom/hmobile/biblekjv/MainBookActivity;->showAlertForTwitterShare(Ljava/lang/String;Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;)V

    goto/16 :goto_0

    .line 861
    .end local v8    # "bookname":Ljava/lang/String;
    .end local v17    # "share":Ljava/lang/String;
    :cond_11
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 862
    .restart local v10    # "copy":Ljava/lang/String;
    move-object/from16 v0, v16

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 871
    .end local v10    # "copy":Ljava/lang/String;
    .restart local v8    # "bookname":Ljava/lang/String;
    .restart local v17    # "share":Ljava/lang/String;
    :cond_12
    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    move-object/from16 v1, p0

    invoke-virtual {v0, v2, v1}, Lcom/hmobile/biblekjv/MainBookActivity;->signInwithTwitter(Ljava/lang/String;Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;)V

    goto/16 :goto_0

    .line 874
    .end local v8    # "bookname":Ljava/lang/String;
    .end local v17    # "share":Ljava/lang/String;
    :cond_13
    const v2, 0x7f0700c5

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->showToast(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 876
    .end local v16    # "sb":Ljava/lang/StringBuilder;
    :cond_14
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgShare:Landroid/widget/ImageView;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_17

    .line 877
    new-instance v16, Ljava/lang/StringBuilder;

    invoke-direct/range {v16 .. v16}, Ljava/lang/StringBuilder;-><init>()V

    .line 878
    .restart local v16    # "sb":Ljava/lang/StringBuilder;
    sget-object v2, Lcom/hmobile/biblekjv/MainBookActivity;->m_selectedVerseList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_16

    .line 879
    sget-object v2, Lcom/hmobile/biblekjv/MainBookActivity;->m_selectedVerseList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_15

    .line 883
    move-object/from16 v0, p0

    iget v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/hmobile/common/Utils;->ConvertToLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 882
    invoke-static {v2, v3}, Lcom/hmobile/model/BookInfo;->getBookNameByBookid(J)Ljava/lang/String;

    move-result-object v8

    .line 884
    .restart local v8    # "bookname":Ljava/lang/String;
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 885
    const v3, 0x7f070084

    .line 884
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 892
    .restart local v15    # "link":Ljava/lang/String;
    new-instance v14, Landroid/content/Intent;

    const-string v2, "android.intent.action.SEND"

    invoke-direct {v14, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 895
    .local v14, "intent":Landroid/content/Intent;
    const-string v2, "android.intent.extra.SUBJECT"

    .line 896
    const v3, 0x7f070086

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/hmobile/biblekjv/MainBookActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 895
    invoke-virtual {v14, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 898
    const-string v2, "text/plain"

    invoke-virtual {v14, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 899
    const-string v2, "android.intent.extra.TEXT"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, " "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v6, "\n"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 900
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 899
    invoke-virtual {v14, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 904
    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Lcom/hmobile/biblekjv/MainBookActivity;->startActivity(Landroid/content/Intent;)V

    .line 905
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->m_verse_number_list:Ljava/util/ArrayList;

    move-object/from16 v0, p0

    iget v3, v0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    move-object/from16 v0, p0

    iget v6, v0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->PostShare(Ljava/util/ArrayList;II)V

    .line 906
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->Reset()V

    .line 907
    const-string v2, "Click"

    const-string v3, "Button"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Shared "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget v7, v0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 908
    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    move-object/from16 v0, p0

    iget v7, v0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    move-object/from16 v0, p0

    iget v7, v0, Lcom/hmobile/biblekjv/MainBookActivity;->verse_id:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 907
    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->sendAnalyticsevent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 879
    .end local v8    # "bookname":Ljava/lang/String;
    .end local v14    # "intent":Landroid/content/Intent;
    .end local v15    # "link":Ljava/lang/String;
    :cond_15
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 880
    .restart local v10    # "copy":Ljava/lang/String;
    move-object/from16 v0, v16

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_4

    .line 910
    .end local v10    # "copy":Ljava/lang/String;
    :cond_16
    const v2, 0x7f0700c5

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->showToast(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 912
    .end local v16    # "sb":Ljava/lang/StringBuilder;
    :cond_17
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->txtBookAndChapterName:Landroid/widget/TextView;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_18

    .line 913
    new-instance v12, Landroid/content/Intent;

    const-class v2, Lcom/hmobile/biblekjv/SelectActivity;

    move-object/from16 v0, p0

    invoke-direct {v12, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 914
    .restart local v12    # "i":Landroid/content/Intent;
    const-string v2, "book_id"

    move-object/from16 v0, p0

    iget v3, v0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    invoke-virtual {v12, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 915
    const-string v2, "chap_id"

    move-object/from16 v0, p0

    iget v3, v0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    invoke-virtual {v12, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 916
    const-string v2, "verse_id"

    move-object/from16 v0, p0

    iget v3, v0, Lcom/hmobile/biblekjv/MainBookActivity;->verse_id:I

    invoke-virtual {v12, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 917
    const/high16 v2, 0x4000000

    invoke-virtual {v12, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 918
    move-object/from16 v0, p0

    invoke-virtual {v0, v12}, Lcom/hmobile/biblekjv/MainBookActivity;->startActivity(Landroid/content/Intent;)V

    .line 919
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->finish()V

    goto/16 :goto_0

    .line 920
    .end local v12    # "i":Landroid/content/Intent;
    :cond_18
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgSearch:Landroid/widget/ImageView;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_19

    .line 921
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->llSearch:Landroid/widget/RelativeLayout;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 922
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->isSearchBarOpen:Z

    .line 923
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->txtBookAndChapterName:Landroid/widget/TextView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 924
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgSearch:Landroid/widget/ImageView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 925
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->hideActionMenuIcon()V

    goto/16 :goto_0

    .line 926
    :cond_19
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgCancelSearch:Landroid/widget/ImageView;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_1a

    .line 927
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->llSearch:Landroid/widget/RelativeLayout;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 928
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->isSearchBarOpen:Z

    .line 929
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->txtBookAndChapterName:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 930
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgSearch:Landroid/widget/ImageView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 931
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->showActionMenuIcon()V

    .line 932
    const-string v2, "input_method"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/view/inputmethod/InputMethodManager;

    .line 933
    .local v13, "imm":Landroid/view/inputmethod/InputMethodManager;
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->edtLable:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v13, v2, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 934
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->edtTitle:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v13, v2, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 935
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->edtSearch:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v2}, Landroid/widget/AutoCompleteTextView;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v13, v2, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    goto/16 :goto_0

    .line 937
    .end local v13    # "imm":Landroid/view/inputmethod/InputMethodManager;
    :cond_1a
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgSearchText:Landroid/widget/ImageView;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_1b

    .line 939
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->hidekeyBoard()V

    .line 940
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->edtSearch:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v2}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-interface {v2}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v19

    .line 941
    .local v19, "word":Ljava/lang/String;
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_0

    .line 942
    new-instance v12, Landroid/content/Intent;

    .line 943
    const-class v2, Lcom/hmobile/biblekjv/SearchResultActivity;

    .line 942
    move-object/from16 v0, p0

    invoke-direct {v12, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 944
    .restart local v12    # "i":Landroid/content/Intent;
    const-string v2, "search_word"

    move-object/from16 v0, v19

    invoke-virtual {v12, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 945
    const/4 v2, 0x2

    move-object/from16 v0, p0

    invoke-virtual {v0, v12, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 946
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->llSearch:Landroid/widget/RelativeLayout;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 947
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->isSearchBarOpen:Z

    .line 948
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->txtBookAndChapterName:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 949
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgSearch:Landroid/widget/ImageView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 950
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->showActionMenuIcon()V

    goto/16 :goto_0

    .line 952
    .end local v12    # "i":Landroid/content/Intent;
    .end local v19    # "word":Ljava/lang/String;
    :cond_1b
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgAudio:Landroid/widget/ImageView;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_1f

    .line 953
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->isttsOn:Z

    if-eqz v2, :cond_1c

    .line 954
    const-string v2, "TSS STOP CALL"

    invoke-static {v2}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    .line 955
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->isttsOn:Z

    .line 956
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgAudio:Landroid/widget/ImageView;

    const v3, 0x7f020074

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 957
    invoke-direct/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->stopSpeech()V

    goto/16 :goto_0

    .line 959
    :cond_1c
    const/4 v11, 0x1

    .line 960
    .local v11, "doAudio":Z
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "VERSE NUMBERS "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/hmobile/biblekjv/MainBookActivity;->m_verse_number_list:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    .line 961
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->m_verse_number_list:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_1d

    .line 962
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->m_verse_number_list:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1e

    .line 963
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->m_verse_number_list:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    move-object/from16 v0, p0

    iput v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->tts_count:I

    .line 964
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->Reset()V

    .line 976
    :cond_1d
    :goto_5
    if-eqz v11, :cond_0

    .line 978
    :try_start_0
    new-instance v9, Landroid/content/Intent;

    invoke-direct {v9}, Landroid/content/Intent;-><init>()V

    .line 980
    .local v9, "checkTTSIntent":Landroid/content/Intent;
    const-string v2, "android.speech.tts.engine.CHECK_TTS_DATA"

    invoke-virtual {v9, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 982
    const/4 v2, 0x4

    .line 981
    move-object/from16 v0, p0

    invoke-virtual {v0, v9, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 983
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgAudio:Landroid/widget/ImageView;

    const v3, 0x7f020075

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 984
    invoke-static {}, Lcom/hmobile/common/NotificationCenter;->Instance()Lcom/hmobile/common/NotificationCenter;

    move-result-object v2

    .line 985
    const-string v3, "stoptts"

    const-string v6, "stopSpeech"

    .line 986
    const/4 v7, 0x0

    .line 984
    move-object/from16 v0, p0

    invoke-virtual {v2, v0, v3, v6, v7}, Lcom/hmobile/common/NotificationCenter;->addObserver(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 987
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->m_verselist:Ljava/util/ArrayList;

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->SetSpeech(Ljava/util/ArrayList;)V

    .line 988
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->isttsOn:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 989
    .end local v9    # "checkTTSIntent":Landroid/content/Intent;
    :catch_0
    move-exception v2

    goto/16 :goto_0

    .line 966
    :cond_1e
    const/4 v11, 0x0

    .line 968
    const v2, 0x7f0700bb

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/hmobile/biblekjv/MainBookActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 969
    const/4 v3, 0x1

    .line 967
    move-object/from16 v0, p0

    invoke-static {v0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v18

    .line 971
    .local v18, "t":Landroid/widget/Toast;
    const/16 v2, 0x51

    const/4 v3, 0x0

    .line 972
    move-object/from16 v0, p0

    iget v6, v0, Lcom/hmobile/biblekjv/MainBookActivity;->screenHeight:I

    div-int/lit8 v6, v6, 0x2

    .line 970
    move-object/from16 v0, v18

    invoke-virtual {v0, v2, v3, v6}, Landroid/widget/Toast;->setGravity(III)V

    .line 973
    invoke-virtual/range {v18 .. v18}, Landroid/widget/Toast;->show()V

    goto :goto_5

    .line 995
    .end local v11    # "doAudio":Z
    .end local v18    # "t":Landroid/widget/Toast;
    :cond_1f
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->btnPlay:Landroid/widget/Button;

    move-object/from16 v0, p1

    if-eq v0, v2, :cond_0

    .line 997
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->btnPause:Landroid/widget/Button;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_20

    .line 998
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v2}, Landroid/speech/tts/TextToSpeech;->stop()I

    goto/16 :goto_0

    .line 999
    :cond_20
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->btnStop:Landroid/widget/Button;

    move-object/from16 v0, p1

    if-eq v0, v2, :cond_0

    .line 1001
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgLike:Landroid/widget/ImageView;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_21

    .line 1002
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->saveFavorite()V

    goto/16 :goto_0

    .line 1003
    :cond_21
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgAa:Landroid/widget/ImageView;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_22

    .line 1004
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->ShowAlertForSetting()V

    goto/16 :goto_0

    .line 1005
    :cond_22
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/hmobile/biblekjv/MainBookActivity;->imgAudioSetting:Landroid/widget/ImageView;

    move-object/from16 v0, p1

    if-ne v0, v2, :cond_0

    .line 1006
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/biblekjv/MainBookActivity;->ShowAlertForAudioSetting()V

    goto/16 :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 9
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    const/4 v8, 0x1

    .line 159
    invoke-super {p0, p1}, Lcom/hmobile/biblekjv/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 160
    new-instance v5, Lcom/hmobile/biblekjv/TabProvider;

    invoke-direct {v5, p0}, Lcom/hmobile/biblekjv/TabProvider;-><init>(Landroid/app/Activity;)V

    .line 161
    .local v5, "tabProvider":Lcom/hmobile/tab/TabHostProvider;
    const-string v6, "main"

    invoke-virtual {v5, v6}, Lcom/hmobile/tab/TabHostProvider;->getTabHost(Ljava/lang/String;)Lcom/hmobile/tab/TabView;

    move-result-object v6

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tabView:Lcom/hmobile/tab/TabView;

    .line 162
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tabView:Lcom/hmobile/tab/TabView;

    const v7, 0x7f030004

    invoke-virtual {v6, v7}, Lcom/hmobile/tab/TabView;->setCurrentView(I)V

    .line 163
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tabView:Lcom/hmobile/tab/TabView;

    const/4 v7, 0x2

    invoke-virtual {v6, v7}, Lcom/hmobile/tab/TabView;->render(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->setContentView(Landroid/view/View;)V

    .line 168
    invoke-static {p0}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/analytics/tracking/android/GoogleAnalytics;

    move-result-object v6

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 171
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 172
    const v7, 0x7f070092

    invoke-virtual {p0, v7}, Lcom/hmobile/biblekjv/MainBookActivity;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getTracker(Ljava/lang/String;)Lcom/google/analytics/tracking/android/Tracker;

    move-result-object v6

    .line 171
    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    .line 173
    const-string v6, "phone"

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/telephony/TelephonyManager;

    .line 174
    .local v4, "mgr":Landroid/telephony/TelephonyManager;
    if-eqz v4, :cond_0

    .line 175
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->phoneStateListener:Landroid/telephony/PhoneStateListener;

    const/16 v7, 0x20

    invoke-virtual {v4, v6, v7}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 178
    :cond_0
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    const-string v7, "/MainBookReadingActivity"

    invoke-virtual {v6, v7}, Lcom/google/analytics/tracking/android/Tracker;->sendView(Ljava/lang/String;)V

    .line 179
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->addQuickActionMenu()V

    .line 180
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->menuDialogDisplay()V

    .line 182
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->getIntent()Landroid/content/Intent;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 183
    .local v0, "b":Landroid/os/Bundle;
    if-eqz v0, :cond_c

    .line 184
    const-string v6, "isFromBookMark"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 185
    const-string v6, "isFromBookMark"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    iput-boolean v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromBookMark:Z

    .line 187
    const-string v6, "BookMarkId"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 186
    invoke-static {v6, v7}, Lcom/hmobile/model/BookMarkInfo;->getBookMarkInfoById(J)Lcom/hmobile/model/BookMarkInfo;

    move-result-object v6

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->bookmark_info:Lcom/hmobile/model/BookMarkInfo;

    .line 188
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->bookmark_info:Lcom/hmobile/model/BookMarkInfo;

    iget v6, v6, Lcom/hmobile/model/BookMarkInfo;->verse_id:I

    iput v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->verse_id:I

    .line 189
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->bookmark_info:Lcom/hmobile/model/BookMarkInfo;

    iget-object v6, v6, Lcom/hmobile/model/BookMarkInfo;->Verse:Ljava/lang/String;

    const-string v7, "###"

    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->Firstbookmark:[Ljava/lang/String;

    .line 191
    :cond_1
    const-string v6, "Book_id"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 192
    const-string v6, "Book_id"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 193
    .local v2, "id":J
    invoke-static {v2, v3}, Lcom/hmobile/model/BookInfo;->getBookInfoByBookid(J)Lcom/hmobile/model/BookInfo;

    move-result-object v1

    .line 194
    .local v1, "info":Lcom/hmobile/model/BookInfo;
    if-eqz v1, :cond_2

    .line 195
    invoke-virtual {v1}, Lcom/hmobile/model/BookInfo;->getID()J

    move-result-wide v6

    long-to-int v6, v6

    iput v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    .line 196
    iput v8, p0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    .line 199
    .end local v1    # "info":Lcom/hmobile/model/BookInfo;
    .end local v2    # "id":J
    :cond_2
    const-string v6, "isFromToday"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 200
    const-string v6, "isFromToday"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    iput-boolean v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromToday:Z

    .line 209
    :cond_3
    const-string v6, "isFromFavorite"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 210
    const-string v6, "isFromFavorite"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    iput-boolean v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromFavorite:Z

    .line 211
    const-string v6, "book_id"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v6

    iput v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    .line 212
    const-string v6, "chap_id"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v6

    iput v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    .line 213
    const-string v6, "verse_id"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v6

    iput v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->verse_id:I

    .line 215
    :cond_4
    const-string v6, "isFromNotes"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 216
    const-string v6, "isFromNotes"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    iput-boolean v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromNotes:Z

    .line 217
    const-string v6, "note_label"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 218
    const-string v6, "note_label"

    const-string v7, ""

    invoke-virtual {v0, v6, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->note_label:Ljava/lang/String;

    .line 220
    :cond_5
    const-string v6, "book_id"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 221
    const-string v6, "book_id"

    invoke-virtual {v0, v6, v8}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v6

    iput v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    .line 223
    :cond_6
    const-string v6, "chap_id"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 224
    const-string v6, "chap_id"

    invoke-virtual {v0, v6, v8}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v6

    iput v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    .line 226
    :cond_7
    const-string v6, "verse_id"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 227
    const-string v6, "verse_id"

    invoke-virtual {v0, v6, v8}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v6

    iput v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->verse_id:I

    .line 229
    :cond_8
    const-string v6, "select_flag"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 230
    const-string v6, "select_flag"

    const/4 v7, 0x0

    invoke-virtual {v0, v6, v7}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    iput-boolean v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromSelectActivity:Z

    .line 232
    :cond_9
    const-string v6, "search_flag"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_a

    .line 233
    const-string v6, "search_flag"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    iput-boolean v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromSearchActivity:Z

    .line 235
    :cond_a
    const-string v6, "isFromWidget"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_b

    .line 236
    const-string v6, "isFromWidget"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    iput-boolean v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromWidget:Z

    .line 238
    :cond_b
    const-string v6, "isFromLikeShare"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_c

    .line 239
    const-string v6, "isFromLikeShare"

    invoke-virtual {v0, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    iput-boolean v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromLikeShare:Z

    .line 242
    :cond_c
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Main book activity book chapter verse **** "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 243
    iget v7, p0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget v7, p0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget v7, p0, Lcom/hmobile/biblekjv/MainBookActivity;->verse_id:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 242
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    .line 254
    new-instance v6, Landroid/view/GestureDetector;

    new-instance v7, Lcom/hmobile/biblekjv/MainBookActivity$MyFlingListener;

    invoke-direct {v7, p0}, Lcom/hmobile/biblekjv/MainBookActivity$MyFlingListener;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;)V

    invoke-direct {v6, v7}, Landroid/view/GestureDetector;-><init>(Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->flingDetector:Landroid/view/GestureDetector;

    .line 255
    new-instance v6, Lcom/hmobile/biblekjv/MainBookActivity$4;

    invoke-direct {v6, p0}, Lcom/hmobile/biblekjv/MainBookActivity$4;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;)V

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->gestureListener:Landroid/view/View$OnTouchListener;

    .line 263
    iget-boolean v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isFromBookMark:Z

    if-eqz v6, :cond_d

    .line 264
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->bookmark_info:Lcom/hmobile/model/BookMarkInfo;

    iget v6, v6, Lcom/hmobile/model/BookMarkInfo;->book_id:I

    iput v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->book_count:I

    .line 265
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->bookmark_info:Lcom/hmobile/model/BookMarkInfo;

    iget v6, v6, Lcom/hmobile/model/BookMarkInfo;->chap_number:I

    iput v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->chap_count:I

    .line 268
    :cond_d
    sget-boolean v6, Lcom/hmobile/biblekjv/HolyBibleApplication;->isPurchased:Z

    if-nez v6, :cond_e

    .line 269
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->addAdView()V

    .line 276
    :goto_0
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v6

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->settings:Landroid/content/SharedPreferences;

    .line 277
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->settings:Landroid/content/SharedPreferences;

    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->editor:Landroid/content/SharedPreferences$Editor;

    .line 278
    const v6, 0x7f0e0050

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->txtContent:Landroid/widget/TextView;

    .line 279
    const v6, 0x7f0e002c

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->txtBookAndChapterName:Landroid/widget/TextView;

    .line 280
    const v6, 0x7f0e004d

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RelativeLayout;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->rlmain:Landroid/widget/RelativeLayout;

    .line 281
    const v6, 0x7f0e0052

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/LinearLayout;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->llNavigationFade:Landroid/widget/LinearLayout;

    .line 282
    const v6, 0x7f0e002f

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/LinearLayout;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->rlBookmarkMenu:Landroid/widget/LinearLayout;

    .line 283
    const v6, 0x7f0e0047

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/LinearLayout;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->llShowBookmark:Landroid/widget/LinearLayout;

    .line 284
    const v6, 0x7f0e004e

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ScrollView;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->scroll:Landroid/widget/ScrollView;

    .line 285
    const v6, 0x7f0e004f

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/LinearLayout;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->ll:Landroid/widget/LinearLayout;

    .line 286
    const v6, 0x7f0e0034

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/LinearLayout;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->llNotes:Landroid/widget/LinearLayout;

    .line 287
    const v6, 0x7f0e0040

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RelativeLayout;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->llSearch:Landroid/widget/RelativeLayout;

    .line 288
    const v6, 0x7f0e005a

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgNext:Landroid/widget/ImageView;

    .line 289
    const v6, 0x7f0e004b

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/Button;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->btnSaveNotes:Landroid/widget/Button;

    .line 290
    const v6, 0x7f0e004c

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/Button;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->btnCancelNotes:Landroid/widget/Button;

    .line 291
    const v6, 0x7f0e0056

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgPrevious:Landroid/widget/ImageView;

    .line 292
    const v6, 0x7f0e0030

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgCancel:Landroid/widget/ImageView;

    .line 293
    const v6, 0x7f0e0058

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgAudio:Landroid/widget/ImageView;

    .line 294
    const v6, 0x7f0e0057

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgAa:Landroid/widget/ImageView;

    .line 295
    const v6, 0x7f0e0037

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgLike:Landroid/widget/ImageView;

    .line 296
    const v6, 0x7f0e0033

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgBookMark:Landroid/widget/ImageView;

    .line 297
    const v6, 0x7f0e0039

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgCopy:Landroid/widget/ImageView;

    .line 298
    const v6, 0x7f0e003b

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgFacebook:Landroid/widget/ImageView;

    .line 299
    const v6, 0x7f0e003d

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgTwitter:Landroid/widget/ImageView;

    .line 300
    const v6, 0x7f0e003f

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgShare:Landroid/widget/ImageView;

    .line 301
    const v6, 0x7f0e002d

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgSearch:Landroid/widget/ImageView;

    .line 302
    const v6, 0x7f0e0044

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgSearchText:Landroid/widget/ImageView;

    .line 303
    const v6, 0x7f0e0041

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgCancelSearch:Landroid/widget/ImageView;

    .line 304
    const v6, 0x7f0e0059

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgAudioSetting:Landroid/widget/ImageView;

    .line 305
    const v6, 0x7f0e005c

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lcom/hmobile/tooltip/ToolTipRelativeLayout;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->mToolTipFrameLayout:Lcom/hmobile/tooltip/ToolTipRelativeLayout;

    .line 307
    const v6, 0x7f0e0049

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/EditText;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->edtLable:Landroid/widget/EditText;

    .line 308
    const v6, 0x7f0e0048

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/EditText;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->edtTitle:Landroid/widget/EditText;

    .line 309
    const v6, 0x7f0e0045

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/AutoCompleteTextView;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->edtSearch:Landroid/widget/AutoCompleteTextView;

    .line 311
    const v6, 0x7f0e0053

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/Button;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->btnPlay:Landroid/widget/Button;

    .line 312
    const v6, 0x7f0e0055

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/Button;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->btnPause:Landroid/widget/Button;

    .line 313
    const v6, 0x7f0e0054

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/Button;

    iput-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->btnStop:Landroid/widget/Button;

    .line 315
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->btnPlay:Landroid/widget/Button;

    invoke-virtual {v6, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 316
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->btnPause:Landroid/widget/Button;

    invoke-virtual {v6, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 317
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->btnStop:Landroid/widget/Button;

    invoke-virtual {v6, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 319
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgLike:Landroid/widget/ImageView;

    invoke-virtual {v6, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 320
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgNext:Landroid/widget/ImageView;

    invoke-virtual {v6, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 321
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgAudio:Landroid/widget/ImageView;

    invoke-virtual {v6, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 322
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgAa:Landroid/widget/ImageView;

    invoke-virtual {v6, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 323
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgPrevious:Landroid/widget/ImageView;

    invoke-virtual {v6, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 324
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgCancel:Landroid/widget/ImageView;

    invoke-virtual {v6, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 325
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgCopy:Landroid/widget/ImageView;

    invoke-virtual {v6, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 326
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgBookMark:Landroid/widget/ImageView;

    invoke-virtual {v6, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 327
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgFacebook:Landroid/widget/ImageView;

    invoke-virtual {v6, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 328
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgTwitter:Landroid/widget/ImageView;

    invoke-virtual {v6, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 329
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgShare:Landroid/widget/ImageView;

    invoke-virtual {v6, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 330
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgSearch:Landroid/widget/ImageView;

    invoke-virtual {v6, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 331
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgSearchText:Landroid/widget/ImageView;

    invoke-virtual {v6, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 332
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgCancelSearch:Landroid/widget/ImageView;

    invoke-virtual {v6, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 333
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->btnSaveNotes:Landroid/widget/Button;

    invoke-virtual {v6, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 334
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->btnCancelNotes:Landroid/widget/Button;

    invoke-virtual {v6, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 335
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->txtBookAndChapterName:Landroid/widget/TextView;

    invoke-virtual {v6, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 336
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgAudioSetting:Landroid/widget/ImageView;

    invoke-virtual {v6, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 337
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->llNotes:Landroid/widget/LinearLayout;

    invoke-virtual {v6, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 340
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->edtSearch:Landroid/widget/AutoCompleteTextView;

    .line 341
    new-instance v7, Lcom/hmobile/biblekjv/MainBookActivity$5;

    invoke-direct {v7, p0}, Lcom/hmobile/biblekjv/MainBookActivity$5;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;)V

    invoke-virtual {v6, v7}, Landroid/widget/AutoCompleteTextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 372
    iget-object v6, p0, Lcom/hmobile/biblekjv/MainBookActivity;->edtSearch:Landroid/widget/AutoCompleteTextView;

    new-instance v7, Lcom/hmobile/biblekjv/MainBookActivity$6;

    invoke-direct {v7, p0}, Lcom/hmobile/biblekjv/MainBookActivity$6;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;)V

    invoke-virtual {v6, v7}, Landroid/widget/AutoCompleteTextView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 395
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->LoadAutoText()V

    .line 397
    return-void

    .line 271
    :cond_e
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->hideAdView()V

    goto/16 :goto_0
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 438
    invoke-super {p0}, Lcom/hmobile/biblekjv/BaseActivity;->onDestroy()V

    .line 439
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    if-eqz v0, :cond_0

    .line 440
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->stop()I

    .line 441
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->shutdown()V

    .line 443
    :cond_0
    return-void
.end method

.method public onInit(I)V
    .locals 2
    .param p1, "status"    # I

    .prologue
    .line 1222
    if-nez p1, :cond_1

    .line 1223
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Landroid/speech/tts/TextToSpeech;->isLanguageAvailable(Ljava/util/Locale;)I

    move-result v0

    if-nez v0, :cond_0

    .line 1224
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Landroid/speech/tts/TextToSpeech;->setLanguage(Ljava/util/Locale;)I

    .line 1231
    :cond_0
    :goto_0
    return-void

    .line 1227
    :cond_1
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 1228
    const-string v0, "Sorry! Text To Speech failed..."

    .line 1229
    const/4 v1, 0x1

    .line 1228
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 1229
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 427
    invoke-super {p0}, Lcom/hmobile/biblekjv/BaseActivity;->onResume()V

    .line 428
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->Reset()V

    .line 429
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->hidekeyBoard()V

    .line 430
    new-instance v0, Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;

    invoke-direct {v0, p0}, Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;)V

    .line 431
    .local v0, "load":Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/hmobile/biblekjv/MainBookActivity$LoadBook;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 432
    new-instance v1, Landroid/speech/tts/TextToSpeech;

    invoke-direct {v1, p0, p0}, Landroid/speech/tts/TextToSpeech;-><init>(Landroid/content/Context;Landroid/speech/tts/TextToSpeech$OnInitListener;)V

    iput-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    .line 433
    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts:Landroid/speech/tts/TextToSpeech;

    invoke-virtual {v1, p0}, Landroid/speech/tts/TextToSpeech;->setOnUtteranceCompletedListener(Landroid/speech/tts/TextToSpeech$OnUtteranceCompletedListener;)I

    .line 434
    return-void
.end method

.method public onUtteranceCompleted(Ljava/lang/String;)V
    .locals 2
    .param p1, "arg0"    # Ljava/lang/String;

    .prologue
    .line 1191
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TTS NUMBER : onUtteranceCompleted ............"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1192
    iget v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts_count:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1191
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    .line 1193
    iget v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->tts_count:I

    iget-object v1, p0, Lcom/hmobile/biblekjv/MainBookActivity;->m_verselist:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt v0, v1, :cond_1

    .line 1194
    new-instance v0, Lcom/hmobile/biblekjv/MainBookActivity$12;

    invoke-direct {v0, p0}, Lcom/hmobile/biblekjv/MainBookActivity$12;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;)V

    invoke-virtual {p0, v0}, Lcom/hmobile/biblekjv/MainBookActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1206
    :cond_0
    :goto_0
    return-void

    .line 1202
    :cond_1
    iget-boolean v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isttsOn:Z

    if-eqz v0, :cond_0

    .line 1203
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->m_verselist:Ljava/util/ArrayList;

    invoke-direct {p0, v0}, Lcom/hmobile/biblekjv/MainBookActivity;->SetSpeech(Ljava/util/ArrayList;)V

    goto :goto_0
.end method

.method public openbookmarkmenu()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/16 v1, 0x8

    .line 1040
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isBookmarkmenuOpen:Z

    .line 1041
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->txtBookAndChapterName:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1042
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->imgSearch:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1043
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->rlBookmarkMenu:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1045
    iget-boolean v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isSearchBarOpen:Z

    if-eqz v0, :cond_0

    .line 1046
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->llSearch:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1047
    iput-boolean v2, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isSearchBarOpen:Z

    .line 1049
    :cond_0
    return-void
.end method

.method public removeunderline(Landroid/widget/TextView;)V
    .locals 5
    .param p1, "textView"    # Landroid/widget/TextView;

    .prologue
    .line 1027
    :try_start_0
    new-instance v0, Landroid/text/SpannableString;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    .line 1028
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1027
    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 1029
    .local v0, "content":Landroid/text/SpannableString;
    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    const/4 v2, 0x0

    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v3

    .line 1030
    const/4 v4, 0x0

    .line 1029
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1032
    sget-object v1, Lcom/hmobile/biblekjv/MainBookActivity;->m_selectedVerseList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1033
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1037
    .end local v0    # "content":Landroid/text/SpannableString;
    :goto_0
    return-void

    .line 1034
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public saveFavorite()V
    .locals 9

    .prologue
    const/4 v8, 0x1

    .line 1235
    iget-object v5, p0, Lcom/hmobile/biblekjv/MainBookActivity;->m_verse_number_list:Ljava/util/ArrayList;

    if-eqz v5, :cond_2

    iget-object v5, p0, Lcom/hmobile/biblekjv/MainBookActivity;->m_verse_number_list:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lez v5, :cond_2

    .line 1236
    iget-object v5, p0, Lcom/hmobile/biblekjv/MainBookActivity;->m_verse_number_list:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_1

    .line 1259
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    .line 1260
    const v6, 0x7f070060

    invoke-virtual {p0, v6}, Lcom/hmobile/biblekjv/MainBookActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 1259
    invoke-static {v5, v6, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v3

    .line 1262
    .local v3, "t":Landroid/widget/Toast;
    const/16 v5, 0x51

    const/4 v6, 0x0

    .line 1263
    iget v7, p0, Lcom/hmobile/biblekjv/MainBookActivity;->screenHeight:I

    div-int/lit8 v7, v7, 0x2

    .line 1262
    invoke-virtual {v3, v5, v6, v7}, Landroid/widget/Toast;->setGravity(III)V

    .line 1264
    invoke-virtual {v3}, Landroid/widget/Toast;->show()V

    .line 1271
    .end local v3    # "t":Landroid/widget/Toast;
    :goto_1
    return-void

    .line 1236
    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 1238
    .local v1, "i":I
    iget-object v5, p0, Lcom/hmobile/biblekjv/MainBookActivity;->m_verselist:Ljava/util/ArrayList;

    .line 1237
    invoke-static {v1, v5}, Lcom/hmobile/model/VerseInfo;->getVerseInfoByVerseNumber(ILjava/util/ArrayList;)Lcom/hmobile/model/VerseInfo;

    move-result-object v4

    .line 1239
    .local v4, "verseInfo":Lcom/hmobile/model/VerseInfo;
    if-eqz v4, :cond_0

    .line 1240
    invoke-static {v4}, Lcom/hmobile/model/FavoriteInfo;->isExist(Lcom/hmobile/model/VerseInfo;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 1243
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v5

    .line 1244
    const-class v7, Lcom/hmobile/model/FavoriteInfo;

    .line 1243
    invoke-virtual {v5, v7}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->newEntity(Ljava/lang/Class;)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v2

    check-cast v2, Lcom/hmobile/model/FavoriteInfo;

    .line 1245
    .local v2, "info":Lcom/hmobile/model/FavoriteInfo;
    iget v5, v4, Lcom/hmobile/model/VerseInfo;->BookId:I

    iput v5, v2, Lcom/hmobile/model/FavoriteInfo;->BookId:I

    .line 1246
    iget v5, v4, Lcom/hmobile/model/VerseInfo;->ChapterNumber:I

    iput v5, v2, Lcom/hmobile/model/FavoriteInfo;->ChapterNumber:I

    .line 1247
    iget-object v5, v4, Lcom/hmobile/model/VerseInfo;->Verse:Ljava/lang/String;

    iput-object v5, v2, Lcom/hmobile/model/FavoriteInfo;->Verse:Ljava/lang/String;

    .line 1248
    iget v5, v4, Lcom/hmobile/model/VerseInfo;->VerseNumber:I

    iput v5, v2, Lcom/hmobile/model/FavoriteInfo;->VerseNumber:I

    .line 1249
    invoke-virtual {v2}, Lcom/hmobile/model/FavoriteInfo;->save()J
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1250
    .end local v2    # "info":Lcom/hmobile/model/FavoriteInfo;
    :catch_0
    move-exception v0

    .line 1251
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_0

    .line 1267
    .end local v0    # "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    .end local v1    # "i":I
    .end local v4    # "verseInfo":Lcom/hmobile/model/VerseInfo;
    :cond_2
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    const-string v6, "Verse is not selected."

    invoke-static {v5, v6, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v5

    .line 1268
    invoke-virtual {v5}, Landroid/widget/Toast;->show()V

    goto :goto_1
.end method

.method public setoncontentClick()V
    .locals 2

    .prologue
    .line 718
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->llNavigationFade:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 719
    iget-boolean v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->isBookmarkmenuOpen:Z

    if-nez v0, :cond_0

    .line 720
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->openbookmarkmenu()V

    .line 722
    :cond_0
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MainBookActivity;->startNewThread()V

    .line 723
    return-void
.end method

.method public startNewThread()V
    .locals 2

    .prologue
    .line 726
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/hmobile/biblekjv/MainBookActivity$11;

    invoke-direct {v1, p0}, Lcom/hmobile/biblekjv/MainBookActivity$11;-><init>(Lcom/hmobile/biblekjv/MainBookActivity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->thread:Ljava/lang/Thread;

    .line 736
    iget-object v0, p0, Lcom/hmobile/biblekjv/MainBookActivity;->thread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 737
    return-void
.end method

.method public underlineText(Landroid/widget/TextView;)V
    .locals 5
    .param p1, "textView"    # Landroid/widget/TextView;

    .prologue
    .line 1014
    :try_start_0
    new-instance v0, Landroid/text/SpannableString;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    .line 1015
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1014
    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 1016
    .local v0, "content":Landroid/text/SpannableString;
    new-instance v1, Landroid/text/style/UnderlineSpan;

    invoke-direct {v1}, Landroid/text/style/UnderlineSpan;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1018
    sget-object v1, Lcom/hmobile/biblekjv/MainBookActivity;->m_selectedVerseList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1019
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1023
    .end local v0    # "content":Landroid/text/SpannableString;
    :goto_0
    return-void

    .line 1020
    :catch_0
    move-exception v1

    goto :goto_0
.end method
