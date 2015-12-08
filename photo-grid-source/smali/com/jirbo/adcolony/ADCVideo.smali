.class public abstract Lcom/jirbo/adcolony/ADCVideo;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field static a:I

.field static b:I

.field static c:I

.field static d:Z

.field static e:Z

.field static f:Z

.field static g:Z

.field static h:Landroid/app/Activity;

.field static i:Z

.field static j:Z


# instance fields
.field A:Ljava/lang/String;

.field B:Ljava/lang/String;

.field C:Z

.field D:Z

.field E:Lcom/jirbo/adcolony/e;

.field F:Lcom/jirbo/adcolony/ae;

.field G:Lcom/jirbo/adcolony/AdColonyAd;

.field H:Lcom/immersion/hapticmediasdk/HapticContentSDK;

.field I:Ljava/lang/String;

.field J:Z

.field K:Z

.field L:Ljava/lang/String;

.field M:Landroid/widget/VideoView;

.field N:Landroid/widget/FrameLayout;

.field O:Landroid/widget/FrameLayout;

.field P:Landroid/widget/FrameLayout;

.field Q:Landroid/graphics/Rect;

.field R:Lcom/jirbo/adcolony/ADCImage;

.field S:Lcom/jirbo/adcolony/ADCVideo$a;

.field T:Ljava/io/FileInputStream;

.field k:Z

.field l:Z

.field m:Z

.field n:Z

.field o:Z

.field p:D

.field q:D

.field r:J

.field s:J

.field t:I

.field u:I

.field v:I

.field w:I

.field x:I

.field y:I

.field z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 44
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 80
    const-string v0, ""

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->A:Ljava/lang/String;

    .line 81
    const-string v0, ""

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->B:Ljava/lang/String;

    .line 83
    iput-boolean v1, p0, Lcom/jirbo/adcolony/ADCVideo;->C:Z

    .line 84
    iput-boolean v1, p0, Lcom/jirbo/adcolony/ADCVideo;->D:Z

    .line 94
    iput-boolean v1, p0, Lcom/jirbo/adcolony/ADCVideo;->K:Z

    .line 95
    const-string v0, "Your purchase will begin shortly!"

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->L:Ljava/lang/String;

    .line 104
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->Q:Landroid/graphics/Rect;

    .line 658
    return-void
.end method

.method static a()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 116
    sput v0, Lcom/jirbo/adcolony/ADCVideo;->a:I

    .line 117
    sput-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->d:Z

    .line 118
    sput-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->e:Z

    .line 119
    sput-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->g:Z

    .line 120
    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 616
    iput-object p1, p0, Lcom/jirbo/adcolony/ADCVideo;->A:Ljava/lang/String;

    .line 617
    const/4 v0, 0x1

    sput-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->g:Z

    .line 618
    new-instance v0, Landroid/widget/VideoView;

    invoke-direct {v0, p0}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->M:Landroid/widget/VideoView;

    .line 620
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 622
    iget-object v1, p0, Lcom/jirbo/adcolony/ADCVideo;->M:Landroid/widget/VideoView;

    invoke-virtual {v1, v0}, Landroid/widget/VideoView;->setVideoURI(Landroid/net/Uri;)V

    .line 625
    new-instance v0, Landroid/widget/MediaController;

    invoke-direct {v0, p0}, Landroid/widget/MediaController;-><init>(Landroid/content/Context;)V

    .line 626
    iget-object v1, p0, Lcom/jirbo/adcolony/ADCVideo;->M:Landroid/widget/VideoView;

    invoke-virtual {v0, v1}, Landroid/widget/MediaController;->setMediaPlayer(Landroid/widget/MediaController$MediaPlayerControl;)V

    .line 628
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->M:Landroid/widget/VideoView;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget v2, p0, Lcom/jirbo/adcolony/ADCVideo;->t:I

    iget v3, p0, Lcom/jirbo/adcolony/ADCVideo;->u:I

    const/16 v4, 0x11

    invoke-direct {v1, v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 629
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->P:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCVideo;->M:Landroid/widget/VideoView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 630
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->P:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCVideo;->S:Lcom/jirbo/adcolony/ADCVideo$a;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 632
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->P:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ADCVideo;->setContentView(Landroid/view/View;)V

    .line 634
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->M:Landroid/widget/VideoView;

    new-instance v1, Lcom/jirbo/adcolony/ADCVideo$2;

    invoke-direct {v1, p0}, Lcom/jirbo/adcolony/ADCVideo$2;-><init>(Lcom/jirbo/adcolony/ADCVideo;)V

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 644
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->M:Landroid/widget/VideoView;

    new-instance v1, Lcom/jirbo/adcolony/ADCVideo$3;

    invoke-direct {v1, p0}, Lcom/jirbo/adcolony/ADCVideo$3;-><init>(Lcom/jirbo/adcolony/ADCVideo;)V

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 652
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->M:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->start()V

    .line 653
    return-void
.end method

.method b()Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 369
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ADCVideo;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 370
    iget v2, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v2, p0, Lcom/jirbo/adcolony/ADCVideo;->t:I

    .line 371
    iget v2, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v2, p0, Lcom/jirbo/adcolony/ADCVideo;->u:I

    .line 373
    iget v2, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v2, p0, Lcom/jirbo/adcolony/ADCVideo;->t:I

    .line 374
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v1, p0, Lcom/jirbo/adcolony/ADCVideo;->u:I

    .line 376
    const/high16 v1, -0x1000000

    iput v1, p0, Lcom/jirbo/adcolony/ADCVideo;->z:I

    .line 378
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ADCVideo;->getWindow()Landroid/view/Window;

    move-result-object v1

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    iget v3, p0, Lcom/jirbo/adcolony/ADCVideo;->z:I

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 380
    iget v1, p0, Lcom/jirbo/adcolony/ADCVideo;->t:I

    .line 381
    iget v2, p0, Lcom/jirbo/adcolony/ADCVideo;->u:I

    .line 383
    iput v1, p0, Lcom/jirbo/adcolony/ADCVideo;->x:I

    .line 384
    iput v2, p0, Lcom/jirbo/adcolony/ADCVideo;->y:I

    .line 386
    sget-boolean v3, Lcom/jirbo/adcolony/a;->m:Z

    if-nez v3, :cond_0

    iget v3, p0, Lcom/jirbo/adcolony/ADCVideo;->x:I

    iget v4, p0, Lcom/jirbo/adcolony/ADCVideo;->y:I

    if-ge v3, v4, :cond_0

    .line 388
    iput v2, p0, Lcom/jirbo/adcolony/ADCVideo;->t:I

    .line 389
    iput v1, p0, Lcom/jirbo/adcolony/ADCVideo;->u:I

    .line 390
    iput v2, p0, Lcom/jirbo/adcolony/ADCVideo;->x:I

    .line 391
    iput v1, p0, Lcom/jirbo/adcolony/ADCVideo;->y:I

    .line 394
    :cond_0
    sget-boolean v1, Lcom/jirbo/adcolony/a;->B:Z

    if-eqz v1, :cond_1

    .line 396
    sput-boolean v0, Lcom/jirbo/adcolony/a;->B:Z

    .line 397
    const/4 v0, 0x1

    .line 399
    :cond_1
    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 8

    .prologue
    const/16 v7, 0xa

    const/4 v6, 0x4

    const/4 v4, 0x6

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 128
    sput-boolean v2, Lcom/jirbo/adcolony/a;->aa:Z

    .line 129
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 131
    const-string v0, "haptics_enabled"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->i(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ADCVideo;->J:Z

    .line 132
    const-string v0, "haptics_filepath"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->I:Ljava/lang/String;

    .line 133
    const-string v0, "in_progress"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->L:Ljava/lang/String;

    .line 135
    const-string v0, "video_filepath"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->B:Ljava/lang/String;

    .line 137
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ADCVideo;->J:Z

    if-eqz v0, :cond_0

    .line 141
    const/4 v0, 0x0

    :try_start_0
    invoke-static {v0, p0}, Lcom/immersion/hapticmediasdk/HapticContentSDKFactory;->GetNewSDKInstance(ILandroid/content/Context;)Lcom/immersion/hapticmediasdk/HapticContentSDK;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->H:Lcom/immersion/hapticmediasdk/HapticContentSDK;

    .line 142
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->H:Lcom/immersion/hapticmediasdk/HapticContentSDK;

    iget-object v3, p0, Lcom/jirbo/adcolony/ADCVideo;->I:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->openHaptics(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 151
    :goto_0
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->H:Lcom/immersion/hapticmediasdk/HapticContentSDK;

    if-nez v0, :cond_0

    iput-boolean v2, p0, Lcom/jirbo/adcolony/ADCVideo;->J:Z

    .line 154
    :cond_0
    sput-object p0, Lcom/jirbo/adcolony/ADCVideo;->h:Landroid/app/Activity;

    .line 156
    const-string v0, "video_enabled"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->i(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    move v0, v1

    :goto_1
    sput-boolean v0, Lcom/jirbo/adcolony/a;->Q:Z

    .line 157
    const-string v0, "end_card_enabled"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->i(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    move v0, v1

    :goto_2
    sput-boolean v0, Lcom/jirbo/adcolony/a;->P:Z

    .line 158
    const-string v0, "load_timeout_enabled"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->i(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lcom/jirbo/adcolony/a;->R:Z

    .line 159
    const-string v0, "load_timeout"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->h(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/jirbo/adcolony/a;->S:I

    move v3, v2

    .line 161
    :goto_3
    sget-object v0, Lcom/jirbo/adcolony/a;->ag:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_5

    .line 163
    sget-object v0, Lcom/jirbo/adcolony/a;->ag:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 165
    sget-object v0, Lcom/jirbo/adcolony/a;->ag:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;

    .line 166
    iget-object v5, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    if-eqz v5, :cond_1

    iget-object v5, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->S:Landroid/view/View;

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 167
    :cond_1
    iget-object v5, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    if-eqz v5, :cond_2

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 161
    :cond_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_3

    .line 147
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 148
    iput-boolean v2, p0, Lcom/jirbo/adcolony/ADCVideo;->J:Z

    goto :goto_0

    :cond_3
    move v0, v2

    .line 156
    goto :goto_1

    :cond_4
    move v0, v2

    .line 157
    goto :goto_2

    .line 172
    :cond_5
    sget-object v0, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->G:Lcom/jirbo/adcolony/AdColonyAd;

    .line 173
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->G:Lcom/jirbo/adcolony/AdColonyAd;

    if-nez v0, :cond_6

    .line 175
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ADCVideo;->finish()V

    .line 272
    :goto_4
    return-void

    .line 179
    :cond_6
    const-string v0, "v4iap_enabled"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 181
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->G:Lcom/jirbo/adcolony/AdColonyAd;

    sget-object v3, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->AUTOMATIC:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    iput-object v3, v0, Lcom/jirbo/adcolony/AdColonyAd;->u:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    .line 182
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->G:Lcom/jirbo/adcolony/AdColonyAd;

    iput-boolean v1, v0, Lcom/jirbo/adcolony/AdColonyAd;->t:Z

    .line 183
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->G:Lcom/jirbo/adcolony/AdColonyAd;

    const-string v3, "product_id"

    invoke-static {v3}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/jirbo/adcolony/AdColonyAd;->m:Ljava/lang/String;

    .line 186
    :cond_7
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->G:Lcom/jirbo/adcolony/AdColonyAd;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyAd;->s:Z

    sput-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->e:Z

    .line 189
    invoke-virtual {p0, v1}, Lcom/jirbo/adcolony/ADCVideo;->requestWindowFeature(I)Z

    .line 192
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ADCVideo;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v3, 0x400

    const/16 v5, 0x400

    invoke-virtual {v0, v3, v5}, Landroid/view/Window;->setFlags(II)V

    .line 195
    sget-boolean v0, Lcom/jirbo/adcolony/a;->m:Z

    if-nez v0, :cond_9

    .line 198
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v7, :cond_8

    .line 201
    invoke-virtual {p0, v4}, Lcom/jirbo/adcolony/ADCVideo;->setRequestedOrientation(I)V

    .line 256
    :goto_5
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ADCVideo;->setVolumeControlStream(I)V

    .line 259
    new-instance v0, Lcom/jirbo/adcolony/e;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/e;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    .line 260
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->N:Landroid/widget/FrameLayout;

    .line 261
    new-instance v0, Lcom/jirbo/adcolony/ae;

    invoke-direct {v0, p0}, Lcom/jirbo/adcolony/ae;-><init>(Lcom/jirbo/adcolony/ADCVideo;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    .line 262
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->P:Landroid/widget/FrameLayout;

    .line 263
    new-instance v0, Lcom/jirbo/adcolony/ADCVideo$a;

    invoke-direct {v0, p0, p0}, Lcom/jirbo/adcolony/ADCVideo$a;-><init>(Lcom/jirbo/adcolony/ADCVideo;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->S:Lcom/jirbo/adcolony/ADCVideo$a;

    .line 264
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v1, "browser_icon"

    invoke-static {v1}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->R:Lcom/jirbo/adcolony/ADCImage;

    .line 267
    sput-boolean v2, Lcom/jirbo/adcolony/AdColonyBrowser;->A:Z

    .line 270
    sput-object p0, Lcom/jirbo/adcolony/a;->K:Lcom/jirbo/adcolony/ADCVideo;

    .line 271
    sput-object p0, Lcom/jirbo/adcolony/a;->L:Lcom/jirbo/adcolony/ADCVideo;

    goto :goto_4

    .line 206
    :cond_8
    invoke-virtual {p0, v2}, Lcom/jirbo/adcolony/ADCVideo;->setRequestedOrientation(I)V

    goto :goto_5

    .line 213
    :cond_9
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ADCVideo;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v3, v0, Landroid/content/res/Configuration;->orientation:I

    .line 214
    if-eqz v3, :cond_a

    if-eq v3, v4, :cond_a

    const/4 v0, 0x2

    if-ne v3, v0, :cond_b

    :cond_a
    move v0, v4

    :goto_6
    sput v0, Lcom/jirbo/adcolony/a;->w:I

    .line 220
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v7, :cond_c

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v4, "Kindle Fire"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 223
    sget v0, Lcom/jirbo/adcolony/a;->w:I

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ADCVideo;->setRequestedOrientation(I)V

    goto :goto_5

    .line 214
    :cond_b
    const/4 v0, 0x7

    goto :goto_6

    .line 228
    :cond_c
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v4, "Kindle Fire"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 230
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ADCVideo;->getRequestedOrientation()I

    .line 231
    const-string v0, "window"

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ADCVideo;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 232
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    .line 233
    packed-switch v0, :pswitch_data_0

    .line 245
    const/16 v1, 0x8

    .line 250
    :goto_7
    :pswitch_0
    sput v1, Lcom/jirbo/adcolony/a;->w:I

    .line 251
    invoke-virtual {p0, v1}, Lcom/jirbo/adcolony/ADCVideo;->setRequestedOrientation(I)V

    goto/16 :goto_5

    :pswitch_1
    move v1, v2

    .line 240
    goto :goto_7

    .line 242
    :pswitch_2
    const/16 v1, 0x9

    .line 243
    goto :goto_7

    :cond_d
    move v1, v3

    goto :goto_7

    .line 233
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 346
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 348
    sget-boolean v0, Lcom/jirbo/adcolony/a;->aa:Z

    .line 357
    sput-boolean v1, Lcom/jirbo/adcolony/a;->v:Z

    .line 358
    const/4 v0, 0x0

    sput-object v0, Lcom/jirbo/adcolony/a;->K:Lcom/jirbo/adcolony/ADCVideo;

    .line 359
    sput-boolean v1, Lcom/jirbo/adcolony/a;->aa:Z

    .line 360
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 605
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    .line 606
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x1

    .line 547
    sget-object v0, Lcom/jirbo/adcolony/w;->I:Lcom/jirbo/adcolony/w;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/w;->I:Lcom/jirbo/adcolony/w;

    invoke-virtual {v0, p1, p2}, Lcom/jirbo/adcolony/w;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 595
    :goto_0
    return v0

    .line 551
    :cond_0
    const/4 v0, 0x4

    if-ne p1, v0, :cond_6

    .line 553
    sget-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->d:Z

    if-eqz v0, :cond_3

    .line 555
    sget-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->g:Z

    if-eqz v0, :cond_2

    .line 557
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->M:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->stopPlayback()V

    .line 558
    sput-boolean v3, Lcom/jirbo/adcolony/ADCVideo;->g:Z

    .line 559
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->P:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 560
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->N:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ADCVideo;->setContentView(Landroid/view/View;)V

    :cond_1
    :goto_1
    move v0, v1

    .line 586
    goto :goto_0

    .line 562
    :cond_2
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    iget v0, v0, Lcom/jirbo/adcolony/ae;->t:I

    if-nez v0, :cond_1

    .line 564
    sput-boolean v1, Lcom/jirbo/adcolony/a;->aa:Z

    .line 565
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ae;->f()V

    goto :goto_1

    .line 570
    :cond_3
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    if-eqz v0, :cond_5

    sget-object v0, Lcom/jirbo/adcolony/w;->I:Lcom/jirbo/adcolony/w;

    if-eqz v0, :cond_5

    .line 572
    sget-object v0, Lcom/jirbo/adcolony/w;->I:Lcom/jirbo/adcolony/w;

    iget-object v0, v0, Lcom/jirbo/adcolony/w;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/ADCImage;

    .line 574
    invoke-virtual {v0}, Lcom/jirbo/adcolony/ADCImage;->a()V

    goto :goto_2

    .line 576
    :cond_4
    const/4 v0, 0x0

    sput-object v0, Lcom/jirbo/adcolony/w;->I:Lcom/jirbo/adcolony/w;

    .line 577
    sput-boolean v3, Lcom/jirbo/adcolony/w;->H:Z

    .line 578
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->start()V

    goto :goto_1

    .line 580
    :cond_5
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/ae;->M:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/ae;->O:Z

    if-eqz v0, :cond_1

    .line 582
    sput-boolean v1, Lcom/jirbo/adcolony/a;->aa:Z

    .line 583
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ae;->g()V

    goto :goto_1

    .line 588
    :cond_6
    const/16 v0, 0x52

    if-ne p1, v0, :cond_7

    move v0, v1

    .line 591
    goto :goto_0

    .line 595
    :cond_7
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onPause()V
    .locals 8

    .prologue
    const/high16 v7, -0x1000000

    const/4 v6, 0x0

    .line 493
    sput-boolean v6, Lcom/jirbo/adcolony/ADCVideo;->i:Z

    .line 495
    sget-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->g:Z

    if-eqz v0, :cond_4

    .line 497
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->M:Landroid/widget/VideoView;

    if-eqz v0, :cond_0

    .line 499
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->M:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->getCurrentPosition()I

    move-result v0

    sput v0, Lcom/jirbo/adcolony/ADCVideo;->b:I

    .line 500
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->M:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->stopPlayback()V

    .line 509
    :cond_0
    :goto_0
    sget-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->d:Z

    if-eqz v0, :cond_1

    .line 511
    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 512
    invoke-virtual {v0, v7}, Landroid/view/View;->setBackgroundColor(I)V

    .line 513
    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ADCVideo;->setContentView(Landroid/view/View;)V

    .line 514
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/jirbo/adcolony/ADCVideo;->s:J

    .line 515
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ADCVideo;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v0, p0, Lcom/jirbo/adcolony/ADCVideo;->q:D

    iget-wide v2, p0, Lcom/jirbo/adcolony/ADCVideo;->s:J

    iget-wide v4, p0, Lcom/jirbo/adcolony/ADCVideo;->r:J

    sub-long/2addr v2, v4

    long-to-double v2, v2

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v2, v4

    add-double/2addr v0, v2

    iput-wide v0, p0, Lcom/jirbo/adcolony/ADCVideo;->q:D

    .line 518
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    if-eqz v0, :cond_5

    .line 520
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->getCurrentPosition()I

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->getCurrentPosition()I

    move-result v0

    sput v0, Lcom/jirbo/adcolony/ADCVideo;->a:I

    .line 521
    :cond_2
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->a()V

    .line 522
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0, v7}, Lcom/jirbo/adcolony/e;->setBackgroundColor(I)V

    .line 523
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ADCVideo;->J:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->H:Lcom/immersion/hapticmediasdk/HapticContentSDK;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->pause()I

    .line 531
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/jirbo/adcolony/ae;->A:Z

    .line 532
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    iput-boolean v6, v0, Lcom/jirbo/adcolony/ae;->I:Z

    .line 533
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    iput-boolean v6, v0, Lcom/jirbo/adcolony/ae;->H:Z

    .line 534
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    iput-boolean v6, v0, Lcom/jirbo/adcolony/ae;->J:Z

    .line 535
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    iput v6, v0, Lcom/jirbo/adcolony/ae;->u:I

    .line 536
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    iput v6, v0, Lcom/jirbo/adcolony/ae;->t:I

    .line 537
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ae;->invalidate()V

    .line 539
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 540
    return-void

    .line 505
    :cond_4
    sput v6, Lcom/jirbo/adcolony/ADCVideo;->b:I

    goto :goto_0

    .line 527
    :cond_5
    sput v6, Lcom/jirbo/adcolony/ADCVideo;->a:I

    goto :goto_1
.end method

.method public onResume()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/16 v6, 0x11

    .line 280
    sput-boolean v7, Lcom/jirbo/adcolony/ADCVideo;->i:Z

    .line 281
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 282
    invoke-static {}, Lcom/jirbo/adcolony/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/jirbo/adcolony/ADCVideo;->finish()V

    .line 283
    :cond_0
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ADCVideo;->b()Z

    .line 285
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ADCVideo;->C:Z

    if-eqz v0, :cond_6

    .line 287
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/ADCVideo;->C:Z

    .line 290
    sget-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->d:Z

    if-nez v0, :cond_6

    .line 292
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/ae;->Q:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->O:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    iget-object v1, v1, Lcom/jirbo/adcolony/ae;->a:Landroid/webkit/WebView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 293
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/ae;->Q:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->O:Landroid/widget/FrameLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 294
    :cond_2
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "Kindle Fire"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    const/16 v1, 0x14

    iput v1, v0, Lcom/jirbo/adcolony/ae;->m:I

    .line 295
    :cond_3
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "SCH-I800"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    const/16 v1, 0x19

    iput v1, v0, Lcom/jirbo/adcolony/ae;->m:I

    .line 296
    :cond_4
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->N:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    iget v3, p0, Lcom/jirbo/adcolony/ADCVideo;->x:I

    iget v4, p0, Lcom/jirbo/adcolony/ADCVideo;->y:I

    invoke-direct {v2, v3, v4, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 297
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/ae;->Q:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->N:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCVideo;->O:Landroid/widget/FrameLayout;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    iget v3, p0, Lcom/jirbo/adcolony/ADCVideo;->t:I

    iget v4, p0, Lcom/jirbo/adcolony/ADCVideo;->u:I

    iget-object v5, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    iget v5, v5, Lcom/jirbo/adcolony/ae;->m:I

    sub-int/2addr v4, v5

    invoke-direct {v2, v3, v4, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 298
    :cond_5
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->N:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    iget v3, p0, Lcom/jirbo/adcolony/ADCVideo;->t:I

    iget v4, p0, Lcom/jirbo/adcolony/ADCVideo;->u:I

    invoke-direct {v2, v3, v4, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 303
    :cond_6
    sget-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->g:Z

    if-eqz v0, :cond_a

    .line 305
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->P:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCVideo;->S:Lcom/jirbo/adcolony/ADCVideo$a;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 306
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->P:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCVideo;->S:Lcom/jirbo/adcolony/ADCVideo$a;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 307
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->P:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ADCVideo;->setContentView(Landroid/view/View;)V

    .line 316
    :cond_7
    :goto_0
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/e;->a(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 317
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/e;->a(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 322
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCVideo;->B:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->T:Ljava/io/FileInputStream;

    .line 323
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    iget-object v1, p0, Lcom/jirbo/adcolony/ADCVideo;->T:Ljava/io/FileInputStream;

    invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/e;->a(Ljava/io/FileDescriptor;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 334
    sget-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->j:Z

    if-nez v0, :cond_8

    invoke-virtual {p0, v7}, Lcom/jirbo/adcolony/ADCVideo;->onWindowFocusChanged(Z)V

    .line 337
    :cond_8
    sget-boolean v0, Lcom/jirbo/adcolony/a;->Q:Z

    if-eqz v0, :cond_9

    .line 339
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ae;->a()V

    .line 340
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ae;->c()V

    .line 342
    :cond_9
    :goto_1
    return-void

    .line 311
    :cond_a
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->N:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ADCVideo;->setContentView(Landroid/view/View;)V

    .line 312
    sget-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->d:Z

    if-eqz v0, :cond_7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/jirbo/adcolony/ADCVideo;->r:J

    goto :goto_0

    .line 328
    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to play video: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "video_filepath"

    invoke-static {v1}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->e(Ljava/lang/String;)V

    .line 329
    invoke-virtual {p0}, Lcom/jirbo/adcolony/ADCVideo;->finish()V

    goto :goto_1
.end method

.method public onWindowFocusChanged(Z)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 407
    if-eqz p1, :cond_9

    .line 409
    sput-boolean v4, Lcom/jirbo/adcolony/ADCVideo;->j:Z

    .line 410
    sget-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->d:Z

    if-nez v0, :cond_5

    sget-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->i:Z

    if-eqz v0, :cond_5

    .line 412
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    if-eqz v0, :cond_2

    .line 416
    sget v0, Lcom/jirbo/adcolony/ADCVideo;->c:I

    if-eqz v0, :cond_0

    sget v0, Lcom/jirbo/adcolony/ADCVideo;->c:I

    sput v0, Lcom/jirbo/adcolony/ADCVideo;->a:I

    .line 417
    :cond_0
    sput v4, Lcom/jirbo/adcolony/ADCVideo;->c:I

    .line 418
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    sget v1, Lcom/jirbo/adcolony/ADCVideo;->a:I

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/e;->seekTo(I)V

    .line 421
    sget-boolean v0, Lcom/jirbo/adcolony/a;->m:Z

    if-eqz v0, :cond_3

    .line 423
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 424
    new-instance v1, Lcom/jirbo/adcolony/ADCVideo$1;

    invoke-direct {v1, p0}, Lcom/jirbo/adcolony/ADCVideo$1;-><init>(Lcom/jirbo/adcolony/ADCVideo;)V

    .line 431
    iget-object v2, p0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    const/high16 v3, -0x1000000

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/e;->setBackgroundColor(I)V

    .line 432
    const-wide/16 v2, 0x384

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 439
    :goto_0
    sget-boolean v0, Lcom/jirbo/adcolony/w;->H:Z

    if-nez v0, :cond_1

    .line 441
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    iput-boolean v4, v0, Lcom/jirbo/adcolony/ae;->S:Z

    .line 442
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->start()V

    .line 443
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ADCVideo;->J:Z

    if-eqz v0, :cond_1

    .line 445
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ADCVideo;->K:Z

    if-eqz v0, :cond_4

    .line 447
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->H:Lcom/immersion/hapticmediasdk/HapticContentSDK;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->play()I

    .line 450
    :goto_1
    iput-boolean v4, p0, Lcom/jirbo/adcolony/ADCVideo;->K:Z

    .line 453
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ae;->requestFocus()Z

    .line 454
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ae;->invalidate()V

    .line 486
    :cond_2
    :goto_2
    return-void

    .line 436
    :cond_3
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0, v4}, Lcom/jirbo/adcolony/e;->setBackgroundColor(I)V

    goto :goto_0

    .line 449
    :cond_4
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->H:Lcom/immersion/hapticmediasdk/HapticContentSDK;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->resume()I

    goto :goto_1

    .line 457
    :cond_5
    sget-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->g:Z

    if-eqz v0, :cond_8

    .line 459
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->M:Landroid/widget/VideoView;

    if-eqz v0, :cond_6

    .line 461
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->M:Landroid/widget/VideoView;

    sget v1, Lcom/jirbo/adcolony/ADCVideo;->b:I

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->seekTo(I)V

    .line 462
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->M:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->start()V

    goto :goto_2

    .line 466
    :cond_6
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->P:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->P:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 467
    :cond_7
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->N:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/ADCVideo;->setContentView(Landroid/view/View;)V

    goto :goto_2

    .line 470
    :cond_8
    sget-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->d:Z

    if-eqz v0, :cond_2

    .line 473
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->F:Lcom/jirbo/adcolony/ae;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/ae;->invalidate()V

    goto :goto_2

    .line 478
    :cond_9
    sget-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->i:Z

    if-eqz v0, :cond_b

    .line 480
    iget-boolean v0, p0, Lcom/jirbo/adcolony/ADCVideo;->J:Z

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->H:Lcom/immersion/hapticmediasdk/HapticContentSDK;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/HapticContentSDK;->pause()I

    .line 481
    :cond_a
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->getCurrentPosition()I

    move-result v0

    sput v0, Lcom/jirbo/adcolony/ADCVideo;->a:I

    .line 482
    iget-object v0, p0, Lcom/jirbo/adcolony/ADCVideo;->E:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->pause()V

    .line 484
    :cond_b
    const/4 v0, 0x1

    sput-boolean v0, Lcom/jirbo/adcolony/ADCVideo;->j:Z

    goto :goto_2
.end method
