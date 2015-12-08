.class public Lyong/powerfull/equalizer/Equize;
.super Landroid/app/Activity;
.source "Equize.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyong/powerfull/equalizer/Equize$Audiachange;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "AudioFxActivity"

.field static preferenceService:Lyong/powerfull/equalizer/PreferenceService;


# instance fields
.field private audioManager:Landroid/media/AudioManager;

.field bar1:Lyong/powerfull/equalizer/MySeekBar;

.field bar2:Lyong/powerfull/equalizer/MySeekBar;

.field bar3:Lyong/powerfull/equalizer/MySeekBar;

.field bar4:Lyong/powerfull/equalizer/MySeekBar;

.field bar5:Lyong/powerfull/equalizer/MySeekBar;

.field bar6:Lyong/powerfull/equalizer/MySeekBar;

.field choose:Z

.field private currentVolume:I

.field private eqService:Lcom/arist/service/MusicPlayService;

.field private equzechoosebtn:Landroid/widget/Button;

.field private equzesave:Landroid/widget/Button;

.field h:I

.field inggebgadjust:Landroid/widget/ImageView;

.field maxEQLevel:S

.field private maxVolume:I

.field presetEQ:[[I

.field private presetName:[Ljava/lang/String;

.field private visualizer:Lyong/powerfull/equalizer/VisualizerView;

.field w:I


# direct methods
.method public constructor <init>()V
    .locals 10

    .prologue
    const/4 v9, 0x4

    const/4 v8, 0x3

    const/16 v7, 0x12c

    const/4 v6, 0x0

    const/4 v5, 0x5

    .line 28
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 31
    iput-short v6, p0, Lyong/powerfull/equalizer/Equize;->maxEQLevel:S

    .line 36
    iput-boolean v6, p0, Lyong/powerfull/equalizer/Equize;->choose:Z

    .line 48
    const/16 v0, 0xa

    new-array v0, v0, [[I

    new-array v1, v5, [I

    aput v7, v1, v6

    aput v7, v1, v9

    aput-object v1, v0, v6

    const/4 v1, 0x1

    .line 49
    new-array v2, v5, [I

    fill-array-data v2, :array_0

    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 50
    new-array v2, v5, [I

    const/16 v3, 0x258

    aput v3, v2, v6

    const/4 v3, 0x2

    const/16 v4, 0xc8

    aput v4, v2, v3

    const/16 v3, 0x190

    aput v3, v2, v8

    const/16 v3, 0x64

    aput v3, v2, v9

    aput-object v2, v0, v1

    .line 51
    new-array v1, v5, [I

    aput-object v1, v0, v8

    .line 52
    new-array v1, v5, [I

    aput v7, v1, v6

    const/16 v2, 0xc8

    aput v2, v1, v8

    const/16 v2, -0x64

    aput v2, v1, v9

    aput-object v1, v0, v9

    .line 53
    new-array v1, v5, [I

    const/16 v2, 0x190

    aput v2, v1, v6

    const/4 v2, 0x1

    const/16 v3, 0x64

    aput v3, v1, v2

    const/4 v2, 0x2

    const/16 v3, 0x384

    aput v3, v1, v2

    aput v7, v1, v8

    aput-object v1, v0, v5

    const/4 v1, 0x6

    .line 54
    new-array v2, v5, [I

    const/16 v3, 0x1f4

    aput v3, v2, v6

    const/4 v3, 0x1

    aput v7, v2, v3

    const/16 v3, 0x64

    aput v3, v2, v8

    aput v7, v2, v9

    aput-object v2, v0, v1

    const/4 v1, 0x7

    .line 55
    new-array v2, v5, [I

    fill-array-data v2, :array_1

    aput-object v2, v0, v1

    const/16 v1, 0x8

    .line 56
    new-array v2, v5, [I

    fill-array-data v2, :array_2

    aput-object v2, v0, v1

    const/16 v1, 0x9

    .line 57
    new-array v2, v5, [I

    fill-array-data v2, :array_3

    aput-object v2, v0, v1

    iput-object v0, p0, Lyong/powerfull/equalizer/Equize;->presetEQ:[[I

    .line 28
    return-void

    .line 49
    :array_0
    .array-data 4
        0x1f4
        0x12c
        -0xc8
        0x190
        0x190
    .end array-data

    .line 55
    :array_1
    .array-data 4
        0x190
        0xc8
        -0xc8
        0xc8
        0x1f4
    .end array-data

    .line 56
    :array_2
    .array-data 4
        -0x64
        0xc8
        0x1f4
        0x64
        -0xc8
    .end array-data

    .line 57
    :array_3
    .array-data 4
        0x1f4
        0x12c
        -0x64
        0x12c
        0x1f4
    .end array-data
.end method

.method static synthetic access$0(Lyong/powerfull/equalizer/Equize;)Landroid/media/AudioManager;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lyong/powerfull/equalizer/Equize;->audioManager:Landroid/media/AudioManager;

    return-object v0
.end method

.method static synthetic access$1(Lyong/powerfull/equalizer/Equize;I)V
    .locals 0

    .prologue
    .line 29
    iput p1, p0, Lyong/powerfull/equalizer/Equize;->currentVolume:I

    return-void
.end method

.method static synthetic access$2(Lyong/powerfull/equalizer/Equize;)I
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lyong/powerfull/equalizer/Equize;->currentVolume:I

    return v0
.end method

.method static synthetic access$3(Lyong/powerfull/equalizer/Equize;)Lcom/arist/service/MusicPlayService;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lyong/powerfull/equalizer/Equize;->eqService:Lcom/arist/service/MusicPlayService;

    return-object v0
.end method

.method static synthetic access$4(Lyong/powerfull/equalizer/Equize;)Landroid/widget/Button;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lyong/powerfull/equalizer/Equize;->equzechoosebtn:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic access$5(Lyong/powerfull/equalizer/Equize;)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lyong/powerfull/equalizer/Equize;->presetName:[Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public onBackPressed()V
    .locals 0

    .prologue
    .line 241
    invoke-virtual {p0}, Lyong/powerfull/equalizer/Equize;->onFinish()V

    .line 243
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    .line 244
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 19
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    .line 69
    invoke-super/range {p0 .. p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 70
    const/16 v16, 0x7

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lyong/powerfull/equalizer/Equize;->requestWindowFeature(I)Z

    .line 71
    const v16, 0x7f030018

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lyong/powerfull/equalizer/Equize;->setContentView(I)V

    .line 72
    invoke-virtual/range {p0 .. p0}, Lyong/powerfull/equalizer/Equize;->getWindow()Landroid/view/Window;

    move-result-object v16

    const/16 v17, 0x7

    .line 73
    const v18, 0x7f030025

    .line 72
    invoke-virtual/range {v16 .. v18}, Landroid/view/Window;->setFeatureInt(II)V

    .line 75
    const v16, 0x7f0d00af

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lyong/powerfull/equalizer/Equize;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 74
    check-cast v3, Landroid/widget/ImageButton;

    .line 77
    .local v3, "equze_back":Landroid/widget/ImageButton;
    const v16, 0x7f0d00b1

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lyong/powerfull/equalizer/Equize;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 76
    check-cast v5, Landroid/widget/ImageButton;

    .line 78
    .local v5, "musiclist_play":Landroid/widget/ImageButton;
    const v16, 0x7f0d00b0

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lyong/powerfull/equalizer/Equize;->findViewById(I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Landroid/widget/TextView;

    .line 79
    .local v15, "titlename":Landroid/widget/TextView;
    const v16, 0x7f08009b

    invoke-virtual/range {v15 .. v16}, Landroid/widget/TextView;->setText(I)V

    .line 80
    const/16 v16, 0x8

    move/from16 v0, v16

    invoke-virtual {v5, v0}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 82
    invoke-virtual/range {p0 .. p0}, Lyong/powerfull/equalizer/Equize;->getResources()Landroid/content/res/Resources;

    move-result-object v16

    const v17, 0x7f0b0005

    invoke-virtual/range {v16 .. v17}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iput-object v0, v1, Lyong/powerfull/equalizer/Equize;->presetName:[Ljava/lang/String;

    .line 84
    invoke-static {}, Lcom/arist/service/MusicPlayService;->hasInstance()Z

    move-result v16

    if-eqz v16, :cond_0

    .line 85
    invoke-virtual/range {p0 .. p0}, Lyong/powerfull/equalizer/Equize;->getApplicationContext()Landroid/content/Context;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lcom/arist/service/MusicPlayService;->get(Landroid/content/Context;)Lcom/arist/service/MusicPlayService;

    move-result-object v16

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iput-object v0, v1, Lyong/powerfull/equalizer/Equize;->eqService:Lcom/arist/service/MusicPlayService;

    .line 87
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->eqService:Lcom/arist/service/MusicPlayService;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/arist/service/MusicPlayService;->mEqualizer:Lyong/powerfull/equalizer/CompatEq;

    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v16}, Lyong/powerfull/equalizer/CompatEq;->getBandMaxLevel()I

    move-result v16

    move/from16 v0, v16

    int-to-short v0, v0

    move/from16 v16, v0

    move/from16 v0, v16

    move-object/from16 v1, p0

    iput-short v0, v1, Lyong/powerfull/equalizer/Equize;->maxEQLevel:S

    .line 89
    new-instance v16, Lyong/powerfull/equalizer/Equize$1;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lyong/powerfull/equalizer/Equize$1;-><init>(Lyong/powerfull/equalizer/Equize;)V

    move-object/from16 v0, v16

    invoke-virtual {v3, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    const v16, 0x7f0d0063

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lyong/powerfull/equalizer/Equize;->findViewById(I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Landroid/widget/ImageView;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iput-object v0, v1, Lyong/powerfull/equalizer/Equize;->inggebgadjust:Landroid/widget/ImageView;

    .line 97
    const v16, 0x7f0d0061

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lyong/powerfull/equalizer/Equize;->findViewById(I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Landroid/widget/Button;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iput-object v0, v1, Lyong/powerfull/equalizer/Equize;->equzesave:Landroid/widget/Button;

    .line 98
    const v16, 0x7f0d0060

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lyong/powerfull/equalizer/Equize;->findViewById(I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Landroid/widget/Button;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iput-object v0, v1, Lyong/powerfull/equalizer/Equize;->equzechoosebtn:Landroid/widget/Button;

    .line 99
    const-string v16, "audio"

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lyong/powerfull/equalizer/Equize;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Landroid/media/AudioManager;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iput-object v0, v1, Lyong/powerfull/equalizer/Equize;->audioManager:Landroid/media/AudioManager;

    .line 100
    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->audioManager:Landroid/media/AudioManager;

    move-object/from16 v16, v0

    const/16 v17, 0x3

    invoke-virtual/range {v16 .. v17}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v16

    move/from16 v0, v16

    move-object/from16 v1, p0

    iput v0, v1, Lyong/powerfull/equalizer/Equize;->maxVolume:I

    .line 101
    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->audioManager:Landroid/media/AudioManager;

    move-object/from16 v16, v0

    const/16 v17, 0x3

    invoke-virtual/range {v16 .. v17}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v16

    move/from16 v0, v16

    move-object/from16 v1, p0

    iput v0, v1, Lyong/powerfull/equalizer/Equize;->currentVolume:I

    .line 102
    new-instance v16, Lyong/powerfull/equalizer/PreferenceService;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lyong/powerfull/equalizer/PreferenceService;-><init>(Landroid/content/Context;)V

    sput-object v16, Lyong/powerfull/equalizer/Equize;->preferenceService:Lyong/powerfull/equalizer/PreferenceService;

    .line 103
    new-instance v14, Lyong/powerfull/equalizer/ScreenInfo;

    move-object/from16 v0, p0

    invoke-direct {v14, v0}, Lyong/powerfull/equalizer/ScreenInfo;-><init>(Landroid/app/Activity;)V

    .line 104
    .local v14, "s":Lyong/powerfull/equalizer/ScreenInfo;
    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->inggebgadjust:Landroid/widget/ImageView;

    move-object/from16 v16, v0

    .line 105
    invoke-virtual/range {v16 .. v16}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v13

    .line 104
    check-cast v13, Landroid/widget/LinearLayout$LayoutParams;

    .line 107
    .local v13, "paramsss":Landroid/widget/LinearLayout$LayoutParams;
    const v16, 0x7f0d006a

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lyong/powerfull/equalizer/Equize;->findViewById(I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Lyong/powerfull/equalizer/VisualizerView;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iput-object v0, v1, Lyong/powerfull/equalizer/Equize;->visualizer:Lyong/powerfull/equalizer/VisualizerView;

    .line 109
    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->visualizer:Lyong/powerfull/equalizer/VisualizerView;

    move-object/from16 v16, v0

    sget-object v17, Lcom/arist/MusicPlayer/MyApplication;->mediaPlayer:Landroid/media/MediaPlayer;

    .line 110
    invoke-virtual/range {v17 .. v17}, Landroid/media/MediaPlayer;->getAudioSessionId()I

    move-result v17

    .line 109
    invoke-virtual/range {v16 .. v17}, Lyong/powerfull/equalizer/VisualizerView;->setupVisualizerFx(I)V

    .line 112
    invoke-virtual {v14}, Lyong/powerfull/equalizer/ScreenInfo;->getWidth()I

    move-result v16

    move/from16 v0, v16

    move-object/from16 v1, p0

    iput v0, v1, Lyong/powerfull/equalizer/Equize;->w:I

    .line 113
    invoke-virtual {v14}, Lyong/powerfull/equalizer/ScreenInfo;->getHeight()I

    move-result v16

    div-int/lit8 v16, v16, 0x5d

    mul-int/lit8 v16, v16, 0x9

    move/from16 v0, v16

    move-object/from16 v1, p0

    iput v0, v1, Lyong/powerfull/equalizer/Equize;->h:I

    .line 115
    move-object/from16 v0, p0

    iget v0, v0, Lyong/powerfull/equalizer/Equize;->w:I

    move/from16 v16, v0

    move/from16 v0, v16

    iput v0, v13, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 116
    move-object/from16 v0, p0

    iget v0, v0, Lyong/powerfull/equalizer/Equize;->w:I

    move/from16 v16, v0

    move/from16 v0, v16

    mul-int/lit16 v0, v0, 0x193

    move/from16 v16, v0

    move/from16 v0, v16

    div-int/lit16 v0, v0, 0x168

    move/from16 v16, v0

    move/from16 v0, v16

    iput v0, v13, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 117
    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->inggebgadjust:Landroid/widget/ImageView;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-virtual {v0, v13}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 119
    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->equzesave:Landroid/widget/Button;

    move-object/from16 v16, v0

    new-instance v17, Lyong/powerfull/equalizer/Equize$2;

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lyong/powerfull/equalizer/Equize$2;-><init>(Lyong/powerfull/equalizer/Equize;)V

    invoke-virtual/range {v16 .. v17}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    const v16, 0x7f0d0064

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lyong/powerfull/equalizer/Equize;->findViewById(I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Lyong/powerfull/equalizer/MySeekBar;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iput-object v0, v1, Lyong/powerfull/equalizer/Equize;->bar1:Lyong/powerfull/equalizer/MySeekBar;

    .line 131
    const v16, 0x7f0d0065

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lyong/powerfull/equalizer/Equize;->findViewById(I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Lyong/powerfull/equalizer/MySeekBar;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iput-object v0, v1, Lyong/powerfull/equalizer/Equize;->bar2:Lyong/powerfull/equalizer/MySeekBar;

    .line 132
    const v16, 0x7f0d0066

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lyong/powerfull/equalizer/Equize;->findViewById(I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Lyong/powerfull/equalizer/MySeekBar;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iput-object v0, v1, Lyong/powerfull/equalizer/Equize;->bar3:Lyong/powerfull/equalizer/MySeekBar;

    .line 133
    const v16, 0x7f0d0067

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lyong/powerfull/equalizer/Equize;->findViewById(I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Lyong/powerfull/equalizer/MySeekBar;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iput-object v0, v1, Lyong/powerfull/equalizer/Equize;->bar4:Lyong/powerfull/equalizer/MySeekBar;

    .line 134
    const v16, 0x7f0d0068

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lyong/powerfull/equalizer/Equize;->findViewById(I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Lyong/powerfull/equalizer/MySeekBar;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iput-object v0, v1, Lyong/powerfull/equalizer/Equize;->bar5:Lyong/powerfull/equalizer/MySeekBar;

    .line 135
    const v16, 0x7f0d0069

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lyong/powerfull/equalizer/Equize;->findViewById(I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Lyong/powerfull/equalizer/MySeekBar;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iput-object v0, v1, Lyong/powerfull/equalizer/Equize;->bar6:Lyong/powerfull/equalizer/MySeekBar;

    .line 136
    sget-object v16, Lyong/powerfull/equalizer/Equize;->preferenceService:Lyong/powerfull/equalizer/PreferenceService;

    invoke-virtual/range {v16 .. v16}, Lyong/powerfull/equalizer/PreferenceService;->getPreferences00()Ljava/util/Map;

    move-result-object v8

    .line 137
    .local v8, "params00":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    sget-object v16, Lyong/powerfull/equalizer/Equize;->preferenceService:Lyong/powerfull/equalizer/PreferenceService;

    invoke-virtual/range {v16 .. v16}, Lyong/powerfull/equalizer/PreferenceService;->getPreferences01()Ljava/util/Map;

    move-result-object v9

    .line 138
    .local v9, "params11":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    sget-object v16, Lyong/powerfull/equalizer/Equize;->preferenceService:Lyong/powerfull/equalizer/PreferenceService;

    invoke-virtual/range {v16 .. v16}, Lyong/powerfull/equalizer/PreferenceService;->getPreferences02()Ljava/util/Map;

    move-result-object v10

    .line 139
    .local v10, "params22":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    sget-object v16, Lyong/powerfull/equalizer/Equize;->preferenceService:Lyong/powerfull/equalizer/PreferenceService;

    invoke-virtual/range {v16 .. v16}, Lyong/powerfull/equalizer/PreferenceService;->getPreferences03()Ljava/util/Map;

    move-result-object v11

    .line 140
    .local v11, "params33":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    sget-object v16, Lyong/powerfull/equalizer/Equize;->preferenceService:Lyong/powerfull/equalizer/PreferenceService;

    invoke-virtual/range {v16 .. v16}, Lyong/powerfull/equalizer/PreferenceService;->getPreferences04()Ljava/util/Map;

    move-result-object v12

    .line 142
    .local v12, "params44":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const/16 v16, 0x5

    move/from16 v0, v16

    new-array v7, v0, [I

    const/16 v17, 0x0

    const-string v16, "progress0"

    move-object/from16 v0, v16

    invoke-interface {v8, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/String;

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v16

    aput v16, v7, v17

    const/16 v17, 0x1

    .line 143
    const-string v16, "progress1"

    move-object/from16 v0, v16

    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/String;

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v16

    aput v16, v7, v17

    const/16 v17, 0x2

    .line 144
    const-string v16, "progress2"

    move-object/from16 v0, v16

    invoke-interface {v10, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/String;

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v16

    aput v16, v7, v17

    const/16 v17, 0x3

    .line 145
    const-string v16, "progress3"

    move-object/from16 v0, v16

    invoke-interface {v11, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/String;

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v16

    aput v16, v7, v17

    const/16 v17, 0x4

    .line 146
    const-string v16, "progress4"

    move-object/from16 v0, v16

    invoke-interface {v12, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/lang/String;

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v16

    aput v16, v7, v17

    .line 147
    .local v7, "params":[I
    const/16 v16, 0x5

    move/from16 v0, v16

    new-array v2, v0, [Lyong/powerfull/equalizer/MySeekBar;

    const/16 v16, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->bar2:Lyong/powerfull/equalizer/MySeekBar;

    move-object/from16 v17, v0

    aput-object v17, v2, v16

    const/16 v16, 0x1

    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->bar3:Lyong/powerfull/equalizer/MySeekBar;

    move-object/from16 v17, v0

    aput-object v17, v2, v16

    const/16 v16, 0x2

    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->bar4:Lyong/powerfull/equalizer/MySeekBar;

    move-object/from16 v17, v0

    aput-object v17, v2, v16

    const/16 v16, 0x3

    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->bar5:Lyong/powerfull/equalizer/MySeekBar;

    move-object/from16 v17, v0

    aput-object v17, v2, v16

    const/16 v16, 0x4

    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->bar6:Lyong/powerfull/equalizer/MySeekBar;

    move-object/from16 v17, v0

    aput-object v17, v2, v16

    .line 149
    .local v2, "equizeBar":[Lyong/powerfull/equalizer/MySeekBar;
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->presetName:[Ljava/lang/String;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    array-length v0, v0

    move/from16 v16, v0

    move/from16 v0, v16

    if-lt v4, v0, :cond_1

    .line 161
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->bar1:Lyong/powerfull/equalizer/MySeekBar;

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lyong/powerfull/equalizer/Equize;->maxVolume:I

    move/from16 v17, v0

    invoke-virtual/range {v16 .. v17}, Lyong/powerfull/equalizer/MySeekBar;->setMax(I)V

    .line 162
    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->bar1:Lyong/powerfull/equalizer/MySeekBar;

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget v0, v0, Lyong/powerfull/equalizer/Equize;->currentVolume:I

    move/from16 v17, v0

    invoke-virtual/range {v16 .. v17}, Lyong/powerfull/equalizer/MySeekBar;->setProgress(I)V

    .line 163
    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->bar1:Lyong/powerfull/equalizer/MySeekBar;

    move-object/from16 v16, v0

    new-instance v17, Lyong/powerfull/equalizer/Equize$3;

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lyong/powerfull/equalizer/Equize$3;-><init>(Lyong/powerfull/equalizer/Equize;)V

    invoke-virtual/range {v16 .. v17}, Lyong/powerfull/equalizer/MySeekBar;->setOnSeekBarChangeListener(Lyong/powerfull/equalizer/MySeekBar$OnSeekBarChangeListener;)V

    .line 179
    const/4 v4, 0x0

    :goto_2
    const/16 v16, 0x5

    move/from16 v0, v16

    if-lt v4, v0, :cond_3

    .line 215
    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->equzechoosebtn:Landroid/widget/Button;

    move-object/from16 v16, v0

    new-instance v17, Lyong/powerfull/equalizer/Equize$5;

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v2}, Lyong/powerfull/equalizer/Equize$5;-><init>(Lyong/powerfull/equalizer/Equize;[Lyong/powerfull/equalizer/MySeekBar;)V

    invoke-virtual/range {v16 .. v17}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 237
    return-void

    .line 150
    :cond_1
    move v6, v4

    .line 151
    .local v6, "n":I
    const/16 v16, 0x0

    aget v16, v7, v16

    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->presetEQ:[[I

    move-object/from16 v17, v0

    aget-object v17, v17, v6

    const/16 v18, 0x0

    aget v17, v17, v18

    move/from16 v0, v16

    move/from16 v1, v17

    if-ne v0, v1, :cond_2

    const/16 v16, 0x1

    aget v16, v7, v16

    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->presetEQ:[[I

    move-object/from16 v17, v0

    aget-object v17, v17, v6

    const/16 v18, 0x1

    aget v17, v17, v18

    move/from16 v0, v16

    move/from16 v1, v17

    if-ne v0, v1, :cond_2

    .line 152
    const/16 v16, 0x2

    aget v16, v7, v16

    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->presetEQ:[[I

    move-object/from16 v17, v0

    aget-object v17, v17, v6

    const/16 v18, 0x2

    aget v17, v17, v18

    move/from16 v0, v16

    move/from16 v1, v17

    if-ne v0, v1, :cond_2

    .line 153
    const/16 v16, 0x3

    aget v16, v7, v16

    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->presetEQ:[[I

    move-object/from16 v17, v0

    aget-object v17, v17, v6

    const/16 v18, 0x3

    aget v17, v17, v18

    move/from16 v0, v16

    move/from16 v1, v17

    if-ne v0, v1, :cond_2

    .line 154
    const/16 v16, 0x4

    aget v16, v7, v16

    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->presetEQ:[[I

    move-object/from16 v17, v0

    aget-object v17, v17, v6

    const/16 v18, 0x4

    aget v17, v17, v18

    move/from16 v0, v16

    move/from16 v1, v17

    if-ne v0, v1, :cond_2

    .line 155
    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->equzechoosebtn:Landroid/widget/Button;

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->presetName:[Ljava/lang/String;

    move-object/from16 v17, v0

    aget-object v17, v17, v6

    invoke-virtual/range {v16 .. v17}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 158
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->equzechoosebtn:Landroid/widget/Button;

    move-object/from16 v16, v0

    const v17, 0x7f08009a

    invoke-virtual/range {v16 .. v17}, Landroid/widget/Button;->setText(I)V

    .line 149
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 180
    .end local v6    # "n":I
    :cond_3
    aget-object v16, v2, v4

    move-object/from16 v0, p0

    iget-object v0, v0, Lyong/powerfull/equalizer/Equize;->eqService:Lcom/arist/service/MusicPlayService;

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    iget-object v0, v0, Lcom/arist/service/MusicPlayService;->mEqualizer:Lyong/powerfull/equalizer/CompatEq;

    move-object/from16 v17, v0

    invoke-virtual/range {v17 .. v17}, Lyong/powerfull/equalizer/CompatEq;->getBandMaxLevel()I

    move-result v17

    mul-int/lit8 v17, v17, 0x2

    invoke-virtual/range {v16 .. v17}, Lyong/powerfull/equalizer/MySeekBar;->setMax(I)V

    .line 181
    aget-object v16, v2, v4

    aget v17, v7, v4

    move-object/from16 v0, p0

    iget-short v0, v0, Lyong/powerfull/equalizer/Equize;->maxEQLevel:S

    move/from16 v18, v0

    add-int v17, v17, v18

    invoke-virtual/range {v16 .. v17}, Lyong/powerfull/equalizer/MySeekBar;->setProgress(I)V

    .line 182
    aget-object v16, v2, v4

    .line 183
    new-instance v17, Lyong/powerfull/equalizer/Equize$4;

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v2}, Lyong/powerfull/equalizer/Equize$4;-><init>(Lyong/powerfull/equalizer/Equize;[Lyong/powerfull/equalizer/MySeekBar;)V

    invoke-virtual/range {v16 .. v17}, Lyong/powerfull/equalizer/MySeekBar;->setOnSeekBarChangeListener(Lyong/powerfull/equalizer/MySeekBar$OnSeekBarChangeListener;)V

    .line 179
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_2
.end method

.method protected onDestroy()V
    .locals 3

    .prologue
    .line 249
    sget-object v0, Lyong/powerfull/equalizer/Equize;->preferenceService:Lyong/powerfull/equalizer/PreferenceService;

    const-string v1, "AudioFxActivity"

    const/4 v2, 0x0

    invoke-static {v2}, Lyong/powerfull/equalizer/EquzeHelper;->getEe(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lyong/powerfull/equalizer/PreferenceService;->band0(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 250
    sget-object v0, Lyong/powerfull/equalizer/Equize;->preferenceService:Lyong/powerfull/equalizer/PreferenceService;

    const-string v1, "AudioFxActivity"

    const/4 v2, 0x1

    invoke-static {v2}, Lyong/powerfull/equalizer/EquzeHelper;->getEe(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lyong/powerfull/equalizer/PreferenceService;->band1(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 251
    sget-object v0, Lyong/powerfull/equalizer/Equize;->preferenceService:Lyong/powerfull/equalizer/PreferenceService;

    const-string v1, "AudioFxActivity"

    const/4 v2, 0x2

    invoke-static {v2}, Lyong/powerfull/equalizer/EquzeHelper;->getEe(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lyong/powerfull/equalizer/PreferenceService;->band2(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 252
    sget-object v0, Lyong/powerfull/equalizer/Equize;->preferenceService:Lyong/powerfull/equalizer/PreferenceService;

    const-string v1, "AudioFxActivity"

    const/4 v2, 0x3

    invoke-static {v2}, Lyong/powerfull/equalizer/EquzeHelper;->getEe(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lyong/powerfull/equalizer/PreferenceService;->band3(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 253
    sget-object v0, Lyong/powerfull/equalizer/Equize;->preferenceService:Lyong/powerfull/equalizer/PreferenceService;

    const-string v1, "AudioFxActivity"

    const/4 v2, 0x4

    invoke-static {v2}, Lyong/powerfull/equalizer/EquzeHelper;->getEe(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lyong/powerfull/equalizer/PreferenceService;->band4(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 277
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 278
    return-void
.end method

.method public onFinish()V
    .locals 1

    .prologue
    .line 281
    iget-object v0, p0, Lyong/powerfull/equalizer/Equize;->visualizer:Lyong/powerfull/equalizer/VisualizerView;

    if-eqz v0, :cond_0

    .line 282
    iget-object v0, p0, Lyong/powerfull/equalizer/Equize;->visualizer:Lyong/powerfull/equalizer/VisualizerView;

    invoke-virtual {v0}, Lyong/powerfull/equalizer/VisualizerView;->releaseVisualizerFx()V

    .line 284
    :cond_0
    invoke-virtual {p0}, Lyong/powerfull/equalizer/Equize;->finish()V

    .line 285
    return-void
.end method
