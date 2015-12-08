.class public Lcom/jirbo/adcolony/AdColonyNativeAdView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;
.implements Landroid/media/MediaPlayer$OnErrorListener;
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# instance fields
.field A:Z

.field B:Z

.field C:Z

.field D:Z

.field E:Z

.field F:Z

.field G:Z

.field H:Z

.field I:Z

.field J:Z

.field K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

.field L:Lcom/jirbo/adcolony/AdColonyNativeAdListener;

.field M:Lcom/jirbo/adcolony/AdColonyNativeAdMutedListener;

.field N:Lcom/jirbo/adcolony/ADCImage;

.field O:Lcom/jirbo/adcolony/ADCImage;

.field P:Lcom/jirbo/adcolony/ADCImage;

.field Q:Landroid/widget/ImageView;

.field R:Lcom/jirbo/adcolony/AdColonyNativeAdView$b;

.field S:Landroid/view/View;

.field T:Landroid/graphics/Bitmap;

.field U:Lcom/jirbo/adcolony/ADCImage;

.field V:Landroid/widget/ImageView;

.field W:Z

.field Z:Landroid/widget/Button;

.field a:Landroid/widget/TextView;

.field aA:F

.field aB:Ljava/io/FileInputStream;

.field aa:Ljava/lang/String;

.field ab:Ljava/lang/String;

.field ac:Ljava/lang/String;

.field ad:Landroid/media/MediaPlayer;

.field ae:Landroid/view/Surface;

.field af:Ljava/lang/String;

.field ag:Ljava/lang/String;

.field ah:Ljava/lang/String;

.field ai:Ljava/lang/String;

.field aj:Ljava/lang/String;

.field ak:Ljava/lang/String;

.field al:Ljava/lang/String;

.field am:Ljava/lang/String;

.field an:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

.field ao:I

.field ap:I

.field aq:I

.field ar:I

.field as:I

.field at:I

.field au:I

.field av:I

.field aw:Lcom/jirbo/adcolony/n$ab;

.field ax:Lcom/jirbo/adcolony/n$a;

.field ay:F

.field az:F

.field b:Landroid/widget/TextView;

.field c:Landroid/widget/TextView;

.field d:Landroid/app/Activity;

.field e:Ljava/lang/String;

.field f:Ljava/lang/String;

.field g:Landroid/view/ViewGroup;

.field h:Landroid/graphics/SurfaceTexture;

.field i:I

.field j:I

.field k:I

.field l:I

.field m:Z

.field n:Z

.field o:Z

.field p:Z

.field q:Z

.field r:Z

.field s:Z

.field t:Z

.field u:Z

.field v:Z

.field w:Z

.field x:Z

.field y:Z

.field z:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;I)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    const/high16 v1, 0x3e800000    # 0.25f

    .line 145
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 77
    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->B:Z

    .line 79
    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->D:Z

    .line 102
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->W:Z

    .line 104
    const-string v0, ""

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aa:Ljava/lang/String;

    .line 105
    const-string v0, ""

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ab:Ljava/lang/String;

    .line 106
    const-string v0, ""

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ac:Ljava/lang/String;

    .line 118
    const-string v0, ""

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->am:Ljava/lang/String;

    .line 120
    sget-object v0, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->NONE:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->an:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    .line 125
    const/4 v0, -0x1

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ar:I

    .line 127
    const v0, -0x333334

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->at:I

    .line 128
    const/high16 v0, -0x1000000

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->au:I

    .line 134
    iput v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ay:F

    .line 135
    iput v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->az:F

    .line 147
    invoke-virtual {p0, p1, p2, p3}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->a(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 149
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->a()V

    .line 150
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;II)V
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v2, 0x0

    const/high16 v1, 0x3e800000    # 0.25f

    .line 153
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 77
    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->B:Z

    .line 79
    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->D:Z

    .line 102
    iput-boolean v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->W:Z

    .line 104
    const-string v0, ""

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aa:Ljava/lang/String;

    .line 105
    const-string v0, ""

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ab:Ljava/lang/String;

    .line 106
    const-string v0, ""

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ac:Ljava/lang/String;

    .line 118
    const-string v0, ""

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->am:Ljava/lang/String;

    .line 120
    sget-object v0, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->NONE:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->an:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    .line 125
    const/4 v0, -0x1

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ar:I

    .line 127
    const v0, -0x333334

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->at:I

    .line 128
    const/high16 v0, -0x1000000

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->au:I

    .line 134
    iput v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ay:F

    .line 135
    iput v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->az:F

    .line 155
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->a(Landroid/app/Activity;Ljava/lang/String;II)V

    .line 157
    invoke-virtual {p0, v2}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->a(Z)V

    .line 158
    return-void
.end method

.method constructor <init>(Landroid/app/Activity;Ljava/lang/String;IZ)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    const/high16 v1, 0x3e800000    # 0.25f

    .line 162
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 77
    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->B:Z

    .line 79
    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->D:Z

    .line 102
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->W:Z

    .line 104
    const-string v0, ""

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aa:Ljava/lang/String;

    .line 105
    const-string v0, ""

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ab:Ljava/lang/String;

    .line 106
    const-string v0, ""

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ac:Ljava/lang/String;

    .line 118
    const-string v0, ""

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->am:Ljava/lang/String;

    .line 120
    sget-object v0, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->NONE:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->an:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    .line 125
    const/4 v0, -0x1

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ar:I

    .line 127
    const v0, -0x333334

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->at:I

    .line 128
    const/high16 v0, -0x1000000

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->au:I

    .line 134
    iput v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ay:F

    .line 135
    iput v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->az:F

    .line 164
    iput-boolean p4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->G:Z

    .line 166
    invoke-virtual {p0, p1, p2, p3}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->a(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 168
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->a()V

    .line 169
    return-void
.end method


# virtual methods
.method a()V
    .locals 1

    .prologue
    .line 231
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->a(Z)V

    .line 232
    return-void
.end method

.method a(FZ)V
    .locals 6

    .prologue
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    const-wide/16 v2, 0x0

    .line 669
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-ge v0, v1, :cond_1

    .line 706
    :cond_0
    :goto_0
    return-void

    .line 670
    :cond_1
    iput p1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->az:F

    .line 671
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_4

    float-to-double v0, p1

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_4

    float-to-double v0, p1

    cmpg-double v0, v0, v4

    if-gtz v0, :cond_4

    .line 673
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->x:Z

    if-nez v0, :cond_2

    .line 675
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1, p1}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 678
    :cond_2
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->z:Z

    if-eqz v0, :cond_0

    .line 680
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->T:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->P:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    if-ne v0, v1, :cond_3

    float-to-double v0, p1

    cmpl-double v0, v0, v2

    if-lez v0, :cond_3

    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->x:Z

    if-nez v0, :cond_3

    .line 682
    new-instance v0, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v0}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 683
    const-string v1, "user_action"

    invoke-virtual {v0, v1, p2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Z)V

    .line 685
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->O:Lcom/jirbo/adcolony/ADCImage;

    iget-object v2, v2, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 686
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->O:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    iput-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->T:Landroid/graphics/Bitmap;

    .line 687
    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    const-string v2, "sound_unmute"

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v1, v2, v0, v3}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 688
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->r:Z

    goto :goto_0

    .line 691
    :cond_3
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->T:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->O:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    if-ne v0, v1, :cond_0

    float-to-double v0, p1

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    .line 693
    new-instance v0, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v0}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 694
    const-string v1, "user_action"

    invoke-virtual {v0, v1, p2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Z)V

    .line 696
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->P:Lcom/jirbo/adcolony/ADCImage;

    iget-object v2, v2, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 697
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->P:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    iput-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->T:Landroid/graphics/Bitmap;

    .line 698
    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    const-string v2, "sound_mute"

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v1, v2, v0, v3}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 699
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->r:Z

    goto/16 :goto_0

    .line 702
    :cond_4
    float-to-double v0, p1

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_0

    float-to-double v0, p1

    cmpg-double v0, v0, v4

    if-gtz v0, :cond_0

    .line 704
    iput p1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ay:F

    goto/16 :goto_0
.end method

.method a(Landroid/app/Activity;Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 176
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->a(Landroid/app/Activity;Ljava/lang/String;II)V

    .line 177
    return-void
.end method

.method a(Landroid/app/Activity;Ljava/lang/String;II)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 180
    invoke-static {}, Lcom/jirbo/adcolony/a;->e()V

    .line 181
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->G:Z

    if-nez v0, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/a;->ag:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    :cond_0
    const/4 v0, 0x0

    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 184
    iput-object p1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->d:Landroid/app/Activity;

    .line 185
    iput-object p2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->e:Ljava/lang/String;

    .line 186
    iput p3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aq:I

    .line 187
    iput p3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->k:I

    .line 188
    if-eqz p4, :cond_1

    .line 190
    iput p4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->l:I

    .line 191
    iput p4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ar:I

    .line 192
    iput-boolean v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->o:Z

    .line 195
    :cond_1
    iput-boolean v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->r:Z

    .line 197
    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aA:F

    .line 200
    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    .line 202
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xe

    if-lt v0, v2, :cond_2

    .line 204
    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 205
    invoke-virtual {v1, v2}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 206
    iget v0, v2, Landroid/graphics/Point;->x:I

    .line 207
    iget v1, v2, Landroid/graphics/Point;->y:I

    .line 215
    :goto_0
    if-ge v0, v1, :cond_3

    :goto_1
    iput v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->av:I

    .line 217
    new-instance v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-direct {v0, p2}, Lcom/jirbo/adcolony/AdColonyInterstitialAd;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    .line 219
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    const-string v1, "native"

    iput-object v1, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->j:Ljava/lang/String;

    .line 220
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    const-string v1, "native"

    iput-object v1, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->k:Ljava/lang/String;

    .line 221
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v0, p2, v1}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 223
    const/high16 v0, -0x1000000

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->setBackgroundColor(I)V

    .line 224
    return-void

    .line 211
    :cond_2
    invoke-virtual {v1}, Landroid/view/Display;->getWidth()I

    move-result v0

    .line 212
    invoke-virtual {v1}, Landroid/view/Display;->getHeight()I

    move-result v1

    goto :goto_0

    :cond_3
    move v0, v1

    .line 215
    goto :goto_1
.end method

.method a(Z)V
    .locals 12

    .prologue
    const/16 v1, 0x30

    const/16 v11, 0xe

    const/high16 v10, 0x3f800000    # 1.0f

    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 235
    iput-boolean v8, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->z:Z

    .line 236
    iput-boolean v8, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->q:Z

    .line 237
    invoke-virtual {p0, v8}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->setWillNotDraw(Z)V

    .line 239
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iput-object p0, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->x:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    .line 241
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->B:Z

    if-eqz v0, :cond_11

    .line 243
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    if-eqz v0, :cond_4

    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->g:Ljava/lang/String;

    if-eqz v0, :cond_4

    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->g:Ljava/lang/String;

    invoke-virtual {v0, v2, v9, v8}, Lcom/jirbo/adcolony/d;->a(Ljava/lang/String;ZZ)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->e:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/c;->b(Ljava/lang/String;)V

    .line 246
    :goto_0
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v0, v9}, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->b(Z)Z

    .line 247
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->h:Lcom/jirbo/adcolony/n$ab;

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aw:Lcom/jirbo/adcolony/n$ab;

    .line 251
    const-string v0, "video_filepath"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->f:Ljava/lang/String;

    .line 252
    const-string v0, "advertiser_name"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->af:Ljava/lang/String;

    .line 253
    const-string v0, "description"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ag:Ljava/lang/String;

    .line 254
    const-string v0, "title"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ah:Ljava/lang/String;

    .line 255
    const-string v0, "poster_image"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ai:Ljava/lang/String;

    .line 256
    const-string v0, "unmute"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aj:Ljava/lang/String;

    .line 257
    const-string v0, "mute"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ak:Ljava/lang/String;

    .line 258
    const-string v0, "thumb_image"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->al:Ljava/lang/String;

    .line 259
    const-string v0, "native_engagement_enabled"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->i(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->W:Z

    .line 260
    const-string v0, "native_engagement_label"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aa:Ljava/lang/String;

    .line 261
    const-string v0, "native_engagement_command"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ab:Ljava/lang/String;

    .line 262
    const-string v0, "native_engagement_type"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ac:Ljava/lang/String;

    .line 263
    const-string v0, "v4iap_enabled"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->i(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->J:Z

    .line 264
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->J:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->AUTOMATIC:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->an:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    .line 265
    :cond_0
    const-string v0, "product_id"

    invoke-static {v0}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->am:Ljava/lang/String;

    .line 266
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->i:Lcom/jirbo/adcolony/n$a;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->i:Lcom/jirbo/adcolony/n$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$a;->w:Lcom/jirbo/adcolony/n$p;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->i:Lcom/jirbo/adcolony/n$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$a;->w:Lcom/jirbo/adcolony/n$p;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/n$p;->b:Z

    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->y:Z

    .line 268
    :goto_1
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aw:Lcom/jirbo/adcolony/n$ab;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aw:Lcom/jirbo/adcolony/n$ab;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/n$ab;->k()V

    .line 269
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->i:Lcom/jirbo/adcolony/n$a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->i:Lcom/jirbo/adcolony/n$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$a;->w:Lcom/jirbo/adcolony/n$p;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->i:Lcom/jirbo/adcolony/n$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$a;->w:Lcom/jirbo/adcolony/n$p;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/n$p;->a:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->h:Lcom/jirbo/adcolony/n$ab;

    if-nez v0, :cond_6

    .line 271
    :cond_2
    const/16 v0, 0xd

    sput v0, Lcom/jirbo/adcolony/a;->ac:I

    .line 421
    :cond_3
    :goto_2
    return-void

    .line 244
    :cond_4
    iput-boolean v9, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    goto/16 :goto_0

    .line 267
    :cond_5
    iput-boolean v9, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->y:Z

    goto :goto_1

    .line 274
    :cond_6
    iput-boolean v9, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->s:Z

    .line 275
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->G:Z

    if-nez v0, :cond_3

    .line 277
    iput-boolean v8, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->B:Z

    .line 283
    :cond_7
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->i:Lcom/jirbo/adcolony/n$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$a;->v:Lcom/jirbo/adcolony/n$aa;

    iget v0, v0, Lcom/jirbo/adcolony/n$aa;->b:I

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ao:I

    .line 284
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->i:Lcom/jirbo/adcolony/n$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$a;->v:Lcom/jirbo/adcolony/n$aa;

    iget v0, v0, Lcom/jirbo/adcolony/n$aa;->c:I

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ap:I

    .line 285
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ar:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_8

    .line 287
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ap:I

    int-to-double v2, v0

    iget v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aq:I

    int-to-double v4, v0

    iget v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ao:I

    int-to-double v6, v0

    div-double/2addr v4, v6

    mul-double/2addr v2, v4

    double-to-int v0, v2

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ar:I

    .line 288
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ar:I

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->l:I

    .line 292
    :cond_8
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aq:I

    int-to-float v0, v0

    iget v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ao:I

    int-to-float v2, v2

    div-float/2addr v0, v2

    .line 293
    iget v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ar:I

    int-to-float v2, v2

    iget v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ap:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 294
    iget v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ao:I

    int-to-float v3, v3

    iget v4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ap:I

    int-to-float v4, v4

    div-float/2addr v3, v4

    .line 296
    cmpl-float v0, v0, v2

    if-lez v0, :cond_12

    iget v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ar:I

    int-to-float v0, v0

    mul-float/2addr v0, v3

    float-to-int v0, v0

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aq:I

    .line 299
    :goto_3
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->W:Z

    if-eqz v0, :cond_9

    .line 301
    new-instance v0, Landroid/widget/Button;

    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Z:Landroid/widget/Button;

    .line 302
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Z:Landroid/widget/Button;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aa:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 303
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Z:Landroid/widget/Button;

    const/16 v2, 0x11

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setGravity(I)V

    .line 304
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Z:Landroid/widget/Button;

    const-wide/high16 v2, 0x4032000000000000L    # 18.0

    iget v4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aq:I

    int-to-double v4, v4

    iget v6, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->av:I

    int-to-double v6, v6

    div-double/2addr v4, v6

    mul-double/2addr v2, v4

    double-to-int v2, v2

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setTextSize(F)V

    .line 305
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Z:Landroid/widget/Button;

    invoke-virtual {v0, v8, v8, v8, v8}, Landroid/widget/Button;->setPadding(IIII)V

    .line 306
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Z:Landroid/widget/Button;

    iget v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->at:I

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setBackgroundColor(I)V

    .line 307
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Z:Landroid/widget/Button;

    iget v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->au:I

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setTextColor(I)V

    .line 308
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Z:Landroid/widget/Button;

    new-instance v2, Lcom/jirbo/adcolony/AdColonyNativeAdView$1;

    invoke-direct {v2, p0}, Lcom/jirbo/adcolony/AdColonyNativeAdView$1;-><init>(Lcom/jirbo/adcolony/AdColonyNativeAdView;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 354
    :cond_9
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ai:Ljava/lang/String;

    invoke-direct {v0, v2, v9, v8}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;ZZ)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->N:Lcom/jirbo/adcolony/ADCImage;

    .line 355
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->N:Lcom/jirbo/adcolony/ADCImage;

    iget v0, v0, Lcom/jirbo/adcolony/ADCImage;->f:I

    int-to-float v0, v0

    iget v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->k:I

    int-to-float v2, v2

    div-float/2addr v0, v2

    div-float v0, v10, v0

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->N:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->g:I

    int-to-float v2, v2

    iget v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->l:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    div-float v2, v10, v2

    cmpl-float v0, v0, v2

    if-lez v0, :cond_13

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->N:Lcom/jirbo/adcolony/ADCImage;

    iget v0, v0, Lcom/jirbo/adcolony/ADCImage;->g:I

    int-to-float v0, v0

    iget v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->l:I

    int-to-float v2, v2

    div-float/2addr v0, v2

    div-float v0, v10, v0

    .line 358
    :goto_4
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->N:Lcom/jirbo/adcolony/ADCImage;

    float-to-double v4, v0

    invoke-virtual {v2, v4, v5, v9}, Lcom/jirbo/adcolony/ADCImage;->a(DZ)V

    .line 359
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aj:Ljava/lang/String;

    invoke-direct {v0, v2, v9, v8}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;ZZ)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->P:Lcom/jirbo/adcolony/ADCImage;

    .line 360
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ak:Ljava/lang/String;

    invoke-direct {v0, v2, v9, v8}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;ZZ)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->O:Lcom/jirbo/adcolony/ADCImage;

    .line 361
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->al:Ljava/lang/String;

    invoke-direct {v0, v2, v9, v8}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;ZZ)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->U:Lcom/jirbo/adcolony/ADCImage;

    .line 362
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->U:Lcom/jirbo/adcolony/ADCImage;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->U:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->f:I

    int-to-float v2, v2

    iget v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aq:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    float-to-double v2, v2

    iget v4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aq:I

    int-to-double v4, v4

    const-wide/high16 v6, 0x4016000000000000L    # 5.5

    div-double/2addr v4, v6

    iget v6, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aq:I

    int-to-float v6, v6

    float-to-double v6, v6

    div-double/2addr v4, v6

    div-double/2addr v2, v4

    double-to-float v2, v2

    div-float v2, v10, v2

    float-to-double v2, v2

    invoke-virtual {v0, v2, v3, v9}, Lcom/jirbo/adcolony/ADCImage;->a(DZ)V

    .line 363
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->O:Lcom/jirbo/adcolony/ADCImage;

    iget v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aA:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    float-to-double v2, v2

    invoke-virtual {v0, v2, v3, v9}, Lcom/jirbo/adcolony/ADCImage;->a(DZ)V

    .line 364
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->P:Lcom/jirbo/adcolony/ADCImage;

    iget v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aA:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    float-to-double v2, v2

    invoke-virtual {v0, v2, v3, v9}, Lcom/jirbo/adcolony/ADCImage;->a(DZ)V

    .line 366
    new-instance v0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;

    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v0, p0, v2}, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;-><init>(Lcom/jirbo/adcolony/AdColonyNativeAdView;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->R:Lcom/jirbo/adcolony/AdColonyNativeAdView$b;

    .line 367
    new-instance v0, Landroid/widget/ImageView;

    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->V:Landroid/widget/ImageView;

    .line 368
    new-instance v0, Landroid/widget/ImageView;

    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    .line 369
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->V:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->U:Lcom/jirbo/adcolony/ADCImage;

    iget-object v2, v2, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 371
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->r:Z

    if-eqz v0, :cond_14

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->O:Lcom/jirbo/adcolony/ADCImage;

    iget-object v2, v2, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 373
    :goto_5
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->O:Lcom/jirbo/adcolony/ADCImage;

    iget v0, v0, Lcom/jirbo/adcolony/ADCImage;->f:I

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->O:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    invoke-direct {v2, v0, v3, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 374
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->k:I

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->O:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->f:I

    sub-int/2addr v0, v3

    invoke-virtual {v2, v0, v8, v8, v8}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    .line 375
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    new-instance v3, Lcom/jirbo/adcolony/AdColonyNativeAdView$2;

    invoke-direct {v3, p0}, Lcom/jirbo/adcolony/AdColonyNativeAdView$2;-><init>(Lcom/jirbo/adcolony/AdColonyNativeAdView;)V

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 396
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->O:Lcom/jirbo/adcolony/ADCImage;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->T:Landroid/graphics/Bitmap;

    .line 398
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 399
    :cond_a
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->v:Z

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    const/4 v3, 0x4

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 401
    :cond_b
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v11, :cond_c

    new-instance v0, Lcom/jirbo/adcolony/AdColonyNativeAdView$a;

    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v3

    iget-boolean v4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    invoke-direct {v0, p0, v3, v4}, Lcom/jirbo/adcolony/AdColonyNativeAdView$a;-><init>(Lcom/jirbo/adcolony/AdColonyNativeAdView;Landroid/content/Context;Z)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->S:Landroid/view/View;

    .line 405
    :cond_c
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->W:Z

    if-eqz v0, :cond_15

    move v0, v1

    .line 406
    :goto_6
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    iget v4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aq:I

    iget v5, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ar:I

    invoke-direct {v3, v4, v5, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 407
    if-ne v0, v1, :cond_d

    iget v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->k:I

    iget v4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aq:I

    sub-int/2addr v1, v4

    div-int/lit8 v1, v1, 0x2

    iget v4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->l:I

    iget v5, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ar:I

    sub-int/2addr v4, v5

    div-int/lit8 v4, v4, 0x2

    invoke-virtual {v3, v1, v4, v8, v8}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    .line 408
    :cond_d
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v1, v11, :cond_e

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->S:Landroid/view/View;

    invoke-virtual {p0, v1, v3}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 409
    :cond_e
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v11, :cond_f

    iput-boolean v9, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    .line 410
    :cond_f
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->k:I

    iget v4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->l:I

    invoke-direct {v1, v3, v4, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 411
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->k:I

    iget v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aq:I

    sub-int/2addr v0, v3

    div-int/lit8 v0, v0, 0x2

    iget v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->l:I

    iget v4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ar:I

    sub-int/2addr v3, v4

    div-int/lit8 v3, v3, 0x2

    invoke-virtual {v1, v0, v3, v8, v8}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    .line 412
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->R:Lcom/jirbo/adcolony/AdColonyNativeAdView$b;

    invoke-virtual {p0, v0, v1}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 413
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->y:Z

    if-eqz v0, :cond_10

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v11, :cond_10

    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->D:Z

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    invoke-virtual {p0, v0, v2}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 414
    :cond_10
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->W:Z

    if-eqz v0, :cond_3

    .line 417
    if-eqz p1, :cond_16

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    iget v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->k:I

    iget v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->l:I

    div-int/lit8 v2, v2, 0x5

    const/16 v3, 0x50

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 419
    :goto_7
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Z:Landroid/widget/Button;

    invoke-virtual {p0, v1, v0}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_2

    .line 279
    :cond_11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v0, v11, :cond_7

    goto/16 :goto_2

    .line 297
    :cond_12
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aq:I

    int-to-float v0, v0

    div-float/2addr v0, v3

    float-to-int v0, v0

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ar:I

    goto/16 :goto_3

    .line 355
    :cond_13
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->N:Lcom/jirbo/adcolony/ADCImage;

    iget v0, v0, Lcom/jirbo/adcolony/ADCImage;->f:I

    int-to-float v0, v0

    iget v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->k:I

    int-to-float v2, v2

    div-float/2addr v0, v2

    div-float v0, v10, v0

    goto/16 :goto_4

    .line 372
    :cond_14
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->P:Lcom/jirbo/adcolony/ADCImage;

    iget-object v2, v2, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto/16 :goto_5

    .line 405
    :cond_15
    const/16 v0, 0x11

    goto/16 :goto_6

    .line 418
    :cond_16
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    iget v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->k:I

    iget v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ar:I

    div-int/lit8 v2, v2, 0x5

    const/16 v3, 0x50

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    goto :goto_7
.end method

.method a(ZZ)V
    .locals 4

    .prologue
    .line 492
    if-eqz p1, :cond_1

    .line 494
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->P:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 495
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->r:Z

    .line 496
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p2}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->a(FZ)V

    .line 497
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->P:Lcom/jirbo/adcolony/ADCImage;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->T:Landroid/graphics/Bitmap;

    .line 516
    :cond_0
    :goto_0
    return-void

    .line 499
    :cond_1
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->x:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->T:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->P:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    if-ne v0, v1, :cond_0

    .line 501
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->O:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 502
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->r:Z

    .line 503
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_2

    .line 505
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->az:F

    float-to-double v0, v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_3

    .line 507
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->az:F

    invoke-virtual {p0, v0, p2}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->a(FZ)V

    .line 514
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->O:Lcom/jirbo/adcolony/ADCImage;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->T:Landroid/graphics/Bitmap;

    goto :goto_0

    .line 511
    :cond_3
    const/high16 v0, 0x3e800000    # 0.25f

    invoke-virtual {p0, v0, p2}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->a(FZ)V

    goto :goto_1
.end method

.method declared-synchronized b()V
    .locals 2

    .prologue
    .line 717
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_2

    .line 723
    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    .line 718
    :cond_2
    :try_start_1
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->az:F

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->setVolume(F)V

    .line 719
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 720
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/d;->a(Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 721
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->q:Z

    .line 722
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->L:Lcom/jirbo/adcolony/AdColonyNativeAdListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->L:Lcom/jirbo/adcolony/AdColonyNativeAdListener;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p0}, Lcom/jirbo/adcolony/AdColonyNativeAdListener;->onAdColonyNativeAdStarted(ZLcom/jirbo/adcolony/AdColonyNativeAdView;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 717
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method b(Z)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 433
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v1, v0}, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->a(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->e:Ljava/lang/String;

    invoke-static {v1}, Lcom/jirbo/adcolony/AdColony;->isZoneNative(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 434
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method c()V
    .locals 3

    .prologue
    .line 730
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->v:Z

    if-nez v0, :cond_0

    .line 732
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    const-string v1, "video_paused"

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/u;->b(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 733
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 735
    :cond_0
    return-void
.end method

.method c(Z)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 646
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 648
    if-eqz p1, :cond_1

    .line 650
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0, v1, v1}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 651
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->P:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 652
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->P:Lcom/jirbo/adcolony/ADCImage;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->T:Landroid/graphics/Bitmap;

    .line 662
    :cond_0
    :goto_0
    return-void

    .line 656
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    iget v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->az:F

    iget v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->az:F

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 657
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->O:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 658
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->O:Lcom/jirbo/adcolony/ADCImage;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->T:Landroid/graphics/Bitmap;

    goto :goto_0
.end method

.method public canceled()Z
    .locals 1

    .prologue
    .line 570
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->I:Z

    return v0
.end method

.method public destroy()V
    .locals 2

    .prologue
    .line 530
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "[ADC] Native Ad Destroy called."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 531
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ae:Landroid/view/Surface;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ae:Landroid/view/Surface;

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 532
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 533
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    .line 534
    sget-object v0, Lcom/jirbo/adcolony/a;->ag:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 535
    return-void
.end method

.method public getAdvertiserImage()Landroid/widget/ImageView;
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 542
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->U:Lcom/jirbo/adcolony/ADCImage;

    if-nez v0, :cond_0

    .line 544
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->al:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v4, v2}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;ZZ)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->U:Lcom/jirbo/adcolony/ADCImage;

    .line 545
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->U:Lcom/jirbo/adcolony/ADCImage;

    iget v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aA:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    float-to-double v2, v1

    invoke-virtual {v0, v2, v3, v4}, Lcom/jirbo/adcolony/ADCImage;->a(DZ)V

    .line 548
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->V:Landroid/widget/ImageView;

    if-nez v0, :cond_1

    .line 550
    new-instance v0, Landroid/widget/ImageView;

    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->V:Landroid/widget/ImageView;

    .line 551
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->V:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->U:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 553
    :cond_1
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->V:Landroid/widget/ImageView;

    return-object v0
.end method

.method public getAdvertiserName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 561
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->af:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 565
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ag:Ljava/lang/String;

    return-object v0
.end method

.method public getNativeAdHeight()I
    .locals 2

    .prologue
    .line 446
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->W:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->l:I

    iget v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->l:I

    div-int/lit8 v1, v1, 0x5

    add-int/2addr v0, v1

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->l:I

    goto :goto_0
.end method

.method public getNativeAdWidth()I
    .locals 1

    .prologue
    .line 442
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->k:I

    return v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 557
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ah:Ljava/lang/String;

    return-object v0
.end method

.method public iapEnabled()Z
    .locals 1

    .prologue
    .line 575
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->J:Z

    return v0
.end method

.method public iapEngagementType()Lcom/jirbo/adcolony/AdColonyIAPEngagement;
    .locals 2

    .prologue
    .line 583
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->u:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    sget-object v1, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->END_CARD:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->END_CARD:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    .line 584
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->an:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    goto :goto_0
.end method

.method public iapProductID()Ljava/lang/String;
    .locals 1

    .prologue
    .line 579
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->am:Ljava/lang/String;

    return-object v0
.end method

.method public isReady()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 428
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v1, v0}, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->a(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->s:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->F:Z

    if-nez v1, :cond_0

    .line 429
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public notifyAddedToListView()V
    .locals 4

    .prologue
    .line 925
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->m:Z

    if-nez v0, :cond_0

    .line 927
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->m:Z

    .line 931
    :goto_0
    return-void

    .line 930
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->S:Landroid/view/View;

    check-cast v0, Lcom/jirbo/adcolony/AdColonyNativeAdView$a;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->h:Landroid/graphics/SurfaceTexture;

    iget v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->i:I

    iget v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->j:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/jirbo/adcolony/AdColonyNativeAdView$a;->onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V

    goto :goto_0
.end method

.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 772
    :try_start_0
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->aB:Ljava/io/FileInputStream;

    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 779
    :goto_0
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->R:Lcom/jirbo/adcolony/AdColonyNativeAdView$b;

    invoke-virtual {v0, v4}, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->setVisibility(I)V

    .line 780
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 781
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    const-string v1, "native"

    iput-object v1, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->j:Ljava/lang/String;

    .line 782
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    const-string v1, "native"

    iput-object v1, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->k:Ljava/lang/String;

    .line 783
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iput-boolean v5, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->q:Z

    .line 784
    iput-boolean v5, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    .line 785
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 786
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    .line 787
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iput v4, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->p:I

    .line 788
    new-instance v0, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v0}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 789
    const-string v1, "ad_slot"

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->h:Lcom/jirbo/adcolony/n$ab;

    iget-object v2, v2, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    iget v2, v2, Lcom/jirbo/adcolony/ag;->d:I

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;I)V

    .line 790
    const-string v1, "replay"

    invoke-virtual {v0, v1, v4}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Z)V

    .line 791
    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    const-string v2, "native_complete"

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v1, v2, v0, v3}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 792
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->L:Lcom/jirbo/adcolony/AdColonyNativeAdListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->L:Lcom/jirbo/adcolony/AdColonyNativeAdListener;

    invoke-interface {v0, v4, p0}, Lcom/jirbo/adcolony/AdColonyNativeAdListener;->onAdColonyNativeAdFinished(ZLcom/jirbo/adcolony/AdColonyNativeAdView;)V

    .line 793
    :cond_1
    iput-boolean v5, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->C:Z

    .line 794
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .prologue
    const/16 v5, 0xff

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 818
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->g:Landroid/view/ViewGroup;

    if-nez v0, :cond_1

    .line 866
    :cond_0
    :goto_0
    return-void

    .line 820
    :cond_1
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 822
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->g:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->g:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->requestFocus()Z

    .line 824
    :cond_2
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    iput v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->as:I

    .line 825
    :cond_3
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->as:I

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget v4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->as:I

    iput v4, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->p:I

    .line 827
    :cond_4
    invoke-virtual {p0, v3}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->getLocalVisibleRect(Landroid/graphics/Rect;)Z

    .line 828
    iget v0, v3, Landroid/graphics/Rect;->bottom:I

    iget v4, v3, Landroid/graphics/Rect;->top:I

    sub-int/2addr v0, v4

    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->getNativeAdHeight()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    if-le v0, v4, :cond_8

    move v0, v1

    .line 830
    :goto_1
    if-nez v0, :cond_5

    iget-boolean v4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->n:Z

    if-eqz v4, :cond_6

    :cond_5
    iget-boolean v4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->n:Z

    if-eqz v4, :cond_9

    if-eqz v0, :cond_6

    iget v0, v3, Landroid/graphics/Rect;->bottom:I

    iget v4, v3, Landroid/graphics/Rect;->top:I

    sub-int/2addr v0, v4

    .line 831
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->getNativeAdHeight()I

    move-result v4

    if-ge v0, v4, :cond_9

    iget v0, v3, Landroid/graphics/Rect;->top:I

    if-eqz v0, :cond_9

    .line 833
    :cond_6
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->v:Z

    if-nez v0, :cond_7

    .line 835
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "[ADC] Scroll Pause"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 836
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    const-string v1, "video_paused"

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v0, v1, v3}, Lcom/jirbo/adcolony/u;->b(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 837
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 838
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->R:Lcom/jirbo/adcolony/AdColonyNativeAdView$b;

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->setVisibility(I)V

    .line 865
    :cond_7
    :goto_2
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->A:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->invalidate()V

    goto/16 :goto_0

    :cond_8
    move v0, v2

    .line 828
    goto :goto_1

    .line 841
    :cond_9
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 843
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->z:Z

    if-nez v0, :cond_a

    .line 845
    invoke-virtual {p1, v5, v2, v2, v2}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    goto :goto_2

    .line 849
    :cond_a
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    const-string v2, "native"

    iput-object v2, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->j:Ljava/lang/String;

    .line 850
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    const-string v2, "native"

    iput-object v2, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->k:Ljava/lang/String;

    .line 851
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v2

    int-to-double v2, v2

    iget-object v4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v4}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v4

    int-to-double v4, v4

    div-double/2addr v2, v4

    iget-object v4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v0, v2, v3, v4}, Lcom/jirbo/adcolony/d;->a(DLcom/jirbo/adcolony/AdColonyAd;)V

    .line 854
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->H:Z

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    const/16 v2, 0x7d0

    if-le v0, v2, :cond_7

    .line 856
    iput-boolean v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->H:Z

    .line 857
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    const-string v1, "native_start"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "{\"ad_slot\":"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->h:Lcom/jirbo/adcolony/n$ab;

    iget-object v3, v3, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    iget v3, v3, Lcom/jirbo/adcolony/ag;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", \"replay\":false}"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v0, v1, v2, v3}, Lcom/jirbo/adcolony/d;->a(Ljava/lang/String;Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    goto :goto_2

    .line 861
    :cond_b
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->R:Lcom/jirbo/adcolony/AdColonyNativeAdView$b;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->a:Z

    if-nez v0, :cond_7

    .line 863
    invoke-virtual {p1, v5, v2, v2, v2}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    goto/16 :goto_2
.end method

.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 801
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->R:Lcom/jirbo/adcolony/AdColonyNativeAdView$b;

    invoke-virtual {v0, v3}, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->setVisibility(I)V

    .line 802
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 803
    iput-boolean v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    .line 804
    iput-boolean v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->z:Z

    .line 805
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    .line 806
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iput v3, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->p:I

    .line 807
    return v2
.end method

.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 742
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "[ADC] Native Ad onPrepared called."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 743
    iput-boolean v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->z:Z

    .line 745
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->T:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->O:Lcom/jirbo/adcolony/ADCImage;

    iget-object v0, v0, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    .line 747
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->R:Lcom/jirbo/adcolony/AdColonyNativeAdView$b;

    invoke-virtual {v0, v3}, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->setVisibility(I)V

    .line 748
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 749
    iput-boolean v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    .line 750
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    .line 751
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iput v3, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->p:I

    .line 763
    :goto_0
    return-void

    .line 755
    :cond_1
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->r:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->T:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->O:Lcom/jirbo/adcolony/ADCImage;

    iget-object v1, v1, Lcom/jirbo/adcolony/ADCImage;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 757
    invoke-virtual {p0, v2}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->c(Z)V

    goto :goto_0

    .line 761
    :cond_2
    iget v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->az:F

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->setVolume(F)V

    goto :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 877
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    if-lt v2, v3, :cond_0

    .line 920
    :goto_0
    return v0

    .line 878
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    .line 880
    if-ne v2, v1, :cond_3

    sget-boolean v2, Lcom/jirbo/adcolony/a;->v:Z

    if-eqz v2, :cond_3

    invoke-static {}, Lcom/jirbo/adcolony/q;->c()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 882
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    sput-object v2, Lcom/jirbo/adcolony/a;->J:Lcom/jirbo/adcolony/AdColonyAd;

    .line 883
    sget-object v2, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v2, v2, Lcom/jirbo/adcolony/d;->a:Lcom/jirbo/adcolony/c;

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->e:Ljava/lang/String;

    iget-object v4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v4, v4, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->i:Lcom/jirbo/adcolony/n$a;

    invoke-virtual {v2, v3, v4}, Lcom/jirbo/adcolony/c;->a(Ljava/lang/String;Lcom/jirbo/adcolony/n$a;)V

    .line 884
    invoke-static {}, Lcom/jirbo/adcolony/ADCVideo;->a()V

    .line 889
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-boolean v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->C:Z

    iput-boolean v3, v2, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->s:Z

    .line 892
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iput-boolean v1, v2, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->r:Z

    .line 893
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    const-string v3, "native"

    iput-object v3, v2, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->j:Ljava/lang/String;

    .line 894
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    const-string v3, "fullscreen"

    iput-object v3, v2, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->k:Ljava/lang/String;

    .line 895
    sput-boolean v0, Lcom/jirbo/adcolony/a;->v:Z

    .line 896
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    const-string v2, "video_expanded"

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/u;->b(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 897
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->L:Lcom/jirbo/adcolony/AdColonyNativeAdListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->L:Lcom/jirbo/adcolony/AdColonyNativeAdListener;

    invoke-interface {v0, v1, p0}, Lcom/jirbo/adcolony/AdColonyNativeAdListener;->onAdColonyNativeAdStarted(ZLcom/jirbo/adcolony/AdColonyNativeAdView;)V

    .line 898
    :cond_1
    sget-boolean v0, Lcom/jirbo/adcolony/a;->m:Z

    if-eqz v0, :cond_4

    .line 900
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v2, "Launching AdColonyOverlay"

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 901
    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v0

    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v3

    const-class v4, Lcom/jirbo/adcolony/AdColonyOverlay;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 908
    :goto_1
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    if-eqz v0, :cond_2

    .line 911
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    const/4 v2, -0x1

    iput v2, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->f:I

    .line 912
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->h:Lcom/jirbo/adcolony/n$ab;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    iget v2, v0, Lcom/jirbo/adcolony/ag;->d:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Lcom/jirbo/adcolony/ag;->d:I

    .line 913
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    const-string v2, "start"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "{\"ad_slot\":"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v4, v4, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->h:Lcom/jirbo/adcolony/n$ab;

    iget-object v4, v4, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    iget v4, v4, Lcom/jirbo/adcolony/ag;->d:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", \"replay\":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-boolean v4, v4, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->s:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "}"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v0, v2, v3, v4}, Lcom/jirbo/adcolony/d;->a(Ljava/lang/String;Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 914
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->h:Lcom/jirbo/adcolony/t;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->g:Ljava/lang/String;

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget-object v3, v3, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->i:Lcom/jirbo/adcolony/n$a;

    iget v3, v3, Lcom/jirbo/adcolony/n$a;->d:I

    invoke-virtual {v0, v2, v3}, Lcom/jirbo/adcolony/t;->a(Ljava/lang/String;I)V

    .line 916
    :cond_2
    iput-boolean v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    .line 917
    iput-boolean v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->C:Z

    :cond_3
    move v0, v1

    .line 920
    goto/16 :goto_0

    .line 905
    :cond_4
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v2, "Launching AdColonyFullscreen"

    invoke-virtual {v0, v2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 906
    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v0

    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v3

    const-class v4, Lcom/jirbo/adcolony/AdColonyFullscreen;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_1
.end method

.method public pause()V
    .locals 3

    .prologue
    .line 610
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "[ADC] Native Ad Pause called."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 611
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 613
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    const-string v1, "video_paused"

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/u;->b(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 614
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->v:Z

    .line 615
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 616
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->R:Lcom/jirbo/adcolony/AdColonyNativeAdView$b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->setVisibility(I)V

    .line 617
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 619
    :cond_0
    return-void
.end method

.method public prepareForListView()V
    .locals 1

    .prologue
    .line 935
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->n:Z

    .line 936
    return-void
.end method

.method public resume()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 629
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "[ADC] Native Ad Resume called."

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 630
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->v:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    if-nez v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 632
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    const-string v1, "video_resumed"

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/u;->b(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 633
    iput-boolean v3, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->v:Z

    .line 634
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iget v1, v1, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->p:I

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 635
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ad:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 636
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->R:Lcom/jirbo/adcolony/AdColonyNativeAdView$b;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/AdColonyNativeAdView$b;->setVisibility(I)V

    .line 637
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Q:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 639
    :cond_0
    return-void
.end method

.method public setMuted(Z)V
    .locals 1

    .prologue
    .line 520
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->a(ZZ)V

    .line 521
    return-void
.end method

.method public setOverlayButtonColor(I)V
    .locals 1

    .prologue
    .line 451
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->W:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Z:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setBackgroundColor(I)V

    .line 452
    :cond_0
    iput p1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->at:I

    .line 453
    return-void
.end method

.method public setOverlayButtonTextColor(I)V
    .locals 1

    .prologue
    .line 460
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->W:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Z:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setTextColor(I)V

    .line 461
    :cond_0
    iput p1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->au:I

    .line 462
    return-void
.end method

.method public setOverlayButtonTypeface(Landroid/graphics/Typeface;I)V
    .locals 1

    .prologue
    .line 465
    iget-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->W:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Z:Landroid/widget/Button;

    invoke-virtual {v0, p1, p2}, Landroid/widget/Button;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 466
    :cond_0
    return-void
.end method

.method public setVolume(F)V
    .locals 1

    .prologue
    .line 709
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/jirbo/adcolony/AdColonyNativeAdView;->a(FZ)V

    .line 710
    return-void
.end method

.method public withListener(Lcom/jirbo/adcolony/AdColonyNativeAdListener;)Lcom/jirbo/adcolony/AdColonyNativeAdView;
    .locals 1

    .prologue
    .line 593
    iput-object p1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->L:Lcom/jirbo/adcolony/AdColonyNativeAdListener;

    .line 594
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    iput-object p1, v0, Lcom/jirbo/adcolony/AdColonyInterstitialAd;->w:Lcom/jirbo/adcolony/AdColonyNativeAdListener;

    .line 595
    return-object p0
.end method

.method public withMutedListener(Lcom/jirbo/adcolony/AdColonyNativeAdMutedListener;)Lcom/jirbo/adcolony/AdColonyNativeAdView;
    .locals 0

    .prologue
    .line 599
    iput-object p1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->M:Lcom/jirbo/adcolony/AdColonyNativeAdMutedListener;

    .line 600
    return-object p0
.end method
