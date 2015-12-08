.class public Lcom/mopub/mraid/MraidVideoViewController;
.super Lcom/mopub/mobileads/BaseVideoViewController;
.source "SourceFile"


# instance fields
.field private final a:Landroid/widget/VideoView;

.field private b:Landroid/widget/ImageButton;

.field private c:I

.field private d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Bundle;Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;)V
    .locals 2

    .prologue
    .line 33
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p3}, Lcom/mopub/mobileads/BaseVideoViewController;-><init>(Landroid/content/Context;Ljava/lang/Long;Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;)V

    .line 35
    new-instance v0, Landroid/widget/VideoView;

    invoke-direct {v0, p1}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mopub/mraid/MraidVideoViewController;->a:Landroid/widget/VideoView;

    .line 36
    iget-object v0, p0, Lcom/mopub/mraid/MraidVideoViewController;->a:Landroid/widget/VideoView;

    new-instance v1, Lcom/mopub/mraid/ai;

    invoke-direct {v1, p0}, Lcom/mopub/mraid/ai;-><init>(Lcom/mopub/mraid/MraidVideoViewController;)V

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 44
    iget-object v0, p0, Lcom/mopub/mraid/MraidVideoViewController;->a:Landroid/widget/VideoView;

    new-instance v1, Lcom/mopub/mraid/aj;

    invoke-direct {v1, p0}, Lcom/mopub/mraid/aj;-><init>(Lcom/mopub/mraid/MraidVideoViewController;)V

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 54
    iget-object v0, p0, Lcom/mopub/mraid/MraidVideoViewController;->a:Landroid/widget/VideoView;

    const-string v1, "video_url"

    invoke-virtual {p2, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setVideoPath(Ljava/lang/String;)V

    .line 55
    return-void
.end method

.method static synthetic a(Lcom/mopub/mraid/MraidVideoViewController;)Landroid/widget/ImageButton;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/mopub/mraid/MraidVideoViewController;->b:Landroid/widget/ImageButton;

    return-object v0
.end method

.method static synthetic b(Lcom/mopub/mraid/MraidVideoViewController;)V
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/mopub/mraid/MraidVideoViewController;->a(Z)V

    return-void
.end method

.method static synthetic c(Lcom/mopub/mraid/MraidVideoViewController;)V
    .locals 0

    .prologue
    .line 22
    invoke-virtual {p0}, Lcom/mopub/mraid/MraidVideoViewController;->h()V

    return-void
.end method

.method static synthetic d(Lcom/mopub/mraid/MraidVideoViewController;)Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;
    .locals 1

    .prologue
    .line 22
    invoke-virtual {p0}, Lcom/mopub/mraid/MraidVideoViewController;->f()Lcom/mopub/mobileads/BaseVideoViewController$BaseVideoViewControllerListener;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected final a()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 59
    invoke-super {p0}, Lcom/mopub/mobileads/BaseVideoViewController;->a()V

    .line 60
    const/high16 v0, 0x42480000    # 50.0f

    invoke-virtual {p0}, Lcom/mopub/mraid/MraidVideoViewController;->g()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mopub/common/util/Dips;->asIntPixels(FLandroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/mopub/mraid/MraidVideoViewController;->d:I

    .line 61
    const/high16 v0, 0x41000000    # 8.0f

    invoke-virtual {p0}, Lcom/mopub/mraid/MraidVideoViewController;->g()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mopub/common/util/Dips;->asIntPixels(FLandroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/mopub/mraid/MraidVideoViewController;->c:I

    .line 1082
    new-instance v0, Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/mopub/mraid/MraidVideoViewController;->g()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/mopub/mraid/MraidVideoViewController;->b:Landroid/widget/ImageButton;

    .line 1083
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 1084
    new-array v1, v5, [I

    const v2, -0x10100a7

    aput v2, v1, v4

    sget-object v2, Lcom/mopub/common/util/Drawables;->INTERSTITIAL_CLOSE_BUTTON_NORMAL:Lcom/mopub/common/util/Drawables;

    invoke-virtual {p0}, Lcom/mopub/mraid/MraidVideoViewController;->g()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/mopub/common/util/Drawables;->createDrawable(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 1086
    new-array v1, v5, [I

    const v2, 0x10100a7

    aput v2, v1, v4

    sget-object v2, Lcom/mopub/common/util/Drawables;->INTERSTITIAL_CLOSE_BUTTON_PRESSED:Lcom/mopub/common/util/Drawables;

    invoke-virtual {p0}, Lcom/mopub/mraid/MraidVideoViewController;->g()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/mopub/common/util/Drawables;->createDrawable(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 1088
    iget-object v1, p0, Lcom/mopub/mraid/MraidVideoViewController;->b:Landroid/widget/ImageButton;

    invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1090
    iget-object v0, p0, Lcom/mopub/mraid/MraidVideoViewController;->b:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1091
    iget-object v0, p0, Lcom/mopub/mraid/MraidVideoViewController;->b:Landroid/widget/ImageButton;

    new-instance v1, Lcom/mopub/mraid/ak;

    invoke-direct {v1, p0}, Lcom/mopub/mraid/ak;-><init>(Lcom/mopub/mraid/MraidVideoViewController;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1097
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    iget v1, p0, Lcom/mopub/mraid/MraidVideoViewController;->d:I

    iget v2, p0, Lcom/mopub/mraid/MraidVideoViewController;->d:I

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 1098
    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1099
    iget v1, p0, Lcom/mopub/mraid/MraidVideoViewController;->c:I

    iget v2, p0, Lcom/mopub/mraid/MraidVideoViewController;->c:I

    invoke-virtual {v0, v1, v4, v2, v4}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 1100
    invoke-virtual {p0}, Lcom/mopub/mraid/MraidVideoViewController;->getLayout()Landroid/view/ViewGroup;

    move-result-object v1

    iget-object v2, p0, Lcom/mopub/mraid/MraidVideoViewController;->b:Landroid/widget/ImageButton;

    invoke-virtual {v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 63
    iget-object v0, p0, Lcom/mopub/mraid/MraidVideoViewController;->b:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 64
    iget-object v0, p0, Lcom/mopub/mraid/MraidVideoViewController;->a:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->start()V

    .line 65
    return-void
.end method

.method protected final b()Landroid/widget/VideoView;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/mopub/mraid/MraidVideoViewController;->a:Landroid/widget/VideoView;

    return-object v0
.end method

.method protected final c()V
    .locals 0

    .prologue
    .line 76
    return-void
.end method

.method protected final d()V
    .locals 0

    .prologue
    .line 79
    return-void
.end method

.method protected final e()V
    .locals 0

    .prologue
    .line 73
    return-void
.end method
