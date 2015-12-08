.class public Lcom/jirbo/adcolony/AdColonyBrowser;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field static A:Z

.field static B:Z

.field static C:Z

.field static a:Z

.field public static url:Ljava/lang/String;

.field static v:Z

.field static w:Z

.field static x:Z

.field static y:Z

.field static z:Z


# instance fields
.field b:Landroid/webkit/WebView;

.field c:Lcom/jirbo/adcolony/ADCImage;

.field d:Lcom/jirbo/adcolony/ADCImage;

.field e:Lcom/jirbo/adcolony/ADCImage;

.field f:Lcom/jirbo/adcolony/ADCImage;

.field g:Lcom/jirbo/adcolony/ADCImage;

.field h:Lcom/jirbo/adcolony/ADCImage;

.field i:Lcom/jirbo/adcolony/ADCImage;

.field j:Lcom/jirbo/adcolony/ADCImage;

.field k:Lcom/jirbo/adcolony/ADCImage;

.field l:Landroid/widget/RelativeLayout;

.field m:Landroid/widget/RelativeLayout;

.field n:Z

.field o:Z

.field p:Z

.field q:Z

.field r:Landroid/widget/ProgressBar;

.field s:Landroid/util/DisplayMetrics;

.field t:Lcom/jirbo/adcolony/AdColonyBrowser$a;

.field u:Lcom/jirbo/adcolony/AdColonyBrowser$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 37
    sput-boolean v1, Lcom/jirbo/adcolony/AdColonyBrowser;->a:Z

    .line 66
    sput-boolean v0, Lcom/jirbo/adcolony/AdColonyBrowser;->v:Z

    .line 67
    sput-boolean v0, Lcom/jirbo/adcolony/AdColonyBrowser;->w:Z

    .line 68
    sput-boolean v0, Lcom/jirbo/adcolony/AdColonyBrowser;->x:Z

    .line 69
    sput-boolean v0, Lcom/jirbo/adcolony/AdColonyBrowser;->y:Z

    .line 70
    sput-boolean v1, Lcom/jirbo/adcolony/AdColonyBrowser;->z:Z

    .line 71
    sput-boolean v0, Lcom/jirbo/adcolony/AdColonyBrowser;->A:Z

    .line 72
    sput-boolean v0, Lcom/jirbo/adcolony/AdColonyBrowser;->B:Z

    .line 73
    sput-boolean v0, Lcom/jirbo/adcolony/AdColonyBrowser;->C:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 34
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 54
    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->n:Z

    .line 55
    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->o:Z

    .line 56
    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->p:Z

    .line 57
    iput-boolean v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->q:Z

    .line 370
    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 8

    .prologue
    .line 288
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 290
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->s:Landroid/util/DisplayMetrics;

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->g:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    int-to-double v6, v3

    mul-double/2addr v4, v6

    double-to-int v3, v4

    sub-int/2addr v2, v3

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 291
    const/4 v1, 0x3

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getId()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 292
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->b:Landroid/webkit/WebView;

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 293
    const/4 v0, 0x1

    sput-boolean v0, Lcom/jirbo/adcolony/AdColonyBrowser;->z:Z

    .line 294
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->t:Lcom/jirbo/adcolony/AdColonyBrowser$a;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->invalidate()V

    .line 295
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 12

    .prologue
    const/4 v11, -0x2

    const/4 v10, 0x3

    const-wide/high16 v8, 0x3ff8000000000000L    # 1.5

    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 77
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 79
    sput-boolean v6, Lcom/jirbo/adcolony/AdColonyBrowser;->B:Z

    .line 82
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v1, "browser_back_image_normal"

    invoke-static {v1}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->c:Lcom/jirbo/adcolony/ADCImage;

    .line 83
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v1, "browser_stop_image_normal"

    invoke-static {v1}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->d:Lcom/jirbo/adcolony/ADCImage;

    .line 84
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v1, "browser_reload_image_normal"

    invoke-static {v1}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->e:Lcom/jirbo/adcolony/ADCImage;

    .line 85
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v1, "browser_forward_image_normal"

    invoke-static {v1}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->f:Lcom/jirbo/adcolony/ADCImage;

    .line 86
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v1, "browser_close_image_normal"

    invoke-static {v1}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->g:Lcom/jirbo/adcolony/ADCImage;

    .line 87
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v1, "browser_glow_button"

    invoke-static {v1}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->h:Lcom/jirbo/adcolony/ADCImage;

    .line 88
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v1, "browser_icon"

    invoke-static {v1}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->i:Lcom/jirbo/adcolony/ADCImage;

    .line 91
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v1, "browser_back_image_normal"

    invoke-static {v1}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v6}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->j:Lcom/jirbo/adcolony/ADCImage;

    .line 92
    new-instance v0, Lcom/jirbo/adcolony/ADCImage;

    const-string v1, "browser_forward_image_normal"

    invoke-static {v1}, Lcom/jirbo/adcolony/a;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v6}, Lcom/jirbo/adcolony/ADCImage;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->k:Lcom/jirbo/adcolony/ADCImage;

    .line 95
    invoke-static {}, Lcom/jirbo/adcolony/AdColony;->activity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->s:Landroid/util/DisplayMetrics;

    .line 96
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->s:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->s:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->xdpi:F

    div-float/2addr v0, v1

    .line 97
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->s:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->s:Landroid/util/DisplayMetrics;

    iget v2, v2, Landroid/util/DisplayMetrics;->ydpi:F

    div-float/2addr v1, v2

    .line 98
    mul-float/2addr v0, v0

    mul-float/2addr v1, v1

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    .line 99
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->s:Landroid/util/DisplayMetrics;

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->s:Landroid/util/DisplayMetrics;

    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    mul-int/2addr v2, v3

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->s:Landroid/util/DisplayMetrics;

    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    iget-object v4, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->s:Landroid/util/DisplayMetrics;

    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    mul-int/2addr v3, v4

    add-int/2addr v2, v3

    int-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    .line 101
    div-double v0, v2, v0

    .line 103
    const-wide v2, 0x406b800000000000L    # 220.0

    div-double/2addr v0, v2

    .line 104
    const-wide v2, 0x3ffccccccccccccdL    # 1.8

    cmpl-double v2, v0, v2

    if-lez v2, :cond_0

    const-wide v0, 0x3ffccccccccccccdL    # 1.8

    .line 107
    :cond_0
    sput-boolean v6, Lcom/jirbo/adcolony/AdColonyBrowser;->z:Z

    .line 108
    sput-boolean v7, Lcom/jirbo/adcolony/AdColonyBrowser;->v:Z

    .line 109
    sput-boolean v7, Lcom/jirbo/adcolony/AdColonyBrowser;->w:Z

    .line 110
    sput-boolean v7, Lcom/jirbo/adcolony/AdColonyBrowser;->C:Z

    .line 113
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->c:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2, v0, v1}, Lcom/jirbo/adcolony/ADCImage;->a(D)V

    .line 114
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->d:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2, v0, v1}, Lcom/jirbo/adcolony/ADCImage;->a(D)V

    .line 115
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->e:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2, v0, v1}, Lcom/jirbo/adcolony/ADCImage;->a(D)V

    .line 116
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->f:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2, v0, v1}, Lcom/jirbo/adcolony/ADCImage;->a(D)V

    .line 117
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->g:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2, v0, v1}, Lcom/jirbo/adcolony/ADCImage;->a(D)V

    .line 118
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->h:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2, v0, v1}, Lcom/jirbo/adcolony/ADCImage;->a(D)V

    .line 119
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->j:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2, v0, v1}, Lcom/jirbo/adcolony/ADCImage;->a(D)V

    .line 120
    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->k:Lcom/jirbo/adcolony/ADCImage;

    invoke-virtual {v2, v0, v1}, Lcom/jirbo/adcolony/ADCImage;->a(D)V

    .line 122
    new-instance v0, Landroid/widget/ProgressBar;

    invoke-direct {v0, p0}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->r:Landroid/widget/ProgressBar;

    .line 123
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->r:Landroid/widget/ProgressBar;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 126
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->m:Landroid/widget/RelativeLayout;

    .line 127
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->l:Landroid/widget/RelativeLayout;

    .line 128
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->l:Landroid/widget/RelativeLayout;

    const v1, -0x333334

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 130
    sget-boolean v0, Lcom/jirbo/adcolony/a;->m:Z

    if-nez v0, :cond_2

    .line 132
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->l:Landroid/widget/RelativeLayout;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x1

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->c:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    int-to-double v4, v3

    mul-double/2addr v4, v8

    double-to-int v3, v4

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 139
    :goto_0
    invoke-virtual {p0, v6}, Lcom/jirbo/adcolony/AdColonyBrowser;->requestWindowFeature(I)Z

    .line 142
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyBrowser;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    const/16 v2, 0x400

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 145
    invoke-virtual {p0}, Lcom/jirbo/adcolony/AdColonyBrowser;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/view/Window;->requestFeature(I)Z

    .line 148
    invoke-virtual {p0, v10}, Lcom/jirbo/adcolony/AdColonyBrowser;->setVolumeControlStream(I)V

    .line 151
    new-instance v0, Landroid/webkit/WebView;

    invoke-direct {v0, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->b:Landroid/webkit/WebView;

    .line 152
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 153
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 154
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 155
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 156
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    .line 159
    sget-boolean v0, Lcom/jirbo/adcolony/AdColonyBrowser;->a:Z

    if-eqz v0, :cond_1

    .line 161
    sget-boolean v0, Lcom/jirbo/adcolony/a;->m:Z

    if-nez v0, :cond_4

    .line 163
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xa

    if-lt v0, v1, :cond_3

    .line 165
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/AdColonyBrowser;->setRequestedOrientation(I)V

    .line 178
    :cond_1
    :goto_1
    sput-boolean v6, Lcom/jirbo/adcolony/AdColonyBrowser;->a:Z

    .line 181
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->b:Landroid/webkit/WebView;

    new-instance v1, Lcom/jirbo/adcolony/AdColonyBrowser$1;

    invoke-direct {v1, p0}, Lcom/jirbo/adcolony/AdColonyBrowser$1;-><init>(Lcom/jirbo/adcolony/AdColonyBrowser;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 194
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->b:Landroid/webkit/WebView;

    new-instance v1, Lcom/jirbo/adcolony/AdColonyBrowser$2;

    invoke-direct {v1, p0}, Lcom/jirbo/adcolony/AdColonyBrowser$2;-><init>(Lcom/jirbo/adcolony/AdColonyBrowser;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 240
    new-instance v0, Lcom/jirbo/adcolony/AdColonyBrowser$a;

    invoke-direct {v0, p0, p0}, Lcom/jirbo/adcolony/AdColonyBrowser$a;-><init>(Lcom/jirbo/adcolony/AdColonyBrowser;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->t:Lcom/jirbo/adcolony/AdColonyBrowser$a;

    .line 241
    new-instance v0, Lcom/jirbo/adcolony/AdColonyBrowser$c;

    invoke-direct {v0, p0, p0}, Lcom/jirbo/adcolony/AdColonyBrowser$c;-><init>(Lcom/jirbo/adcolony/AdColonyBrowser;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->u:Lcom/jirbo/adcolony/AdColonyBrowser$c;

    .line 243
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->m:Landroid/widget/RelativeLayout;

    const v1, 0xffffff

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 244
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->m:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 246
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->l:Landroid/widget/RelativeLayout;

    const/16 v1, 0x3039

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setId(I)V

    .line 248
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->s:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->g:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->g:I

    int-to-double v2, v2

    mul-double/2addr v2, v8

    double-to-int v2, v2

    sub-int/2addr v1, v2

    invoke-direct {v0, v11, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 249
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getId()I

    move-result v1

    invoke-virtual {v0, v10, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 250
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->m:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->b:Landroid/webkit/WebView;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 252
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v1, 0x14

    invoke-direct {v0, v11, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 253
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getId()I

    move-result v1

    invoke-virtual {v0, v10, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 254
    const/16 v1, -0xa

    invoke-virtual {v0, v7, v1, v7, v7}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 255
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->m:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->u:Lcom/jirbo/adcolony/AdColonyBrowser$c;

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 258
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->s:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->s:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    if-le v0, v1, :cond_5

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->s:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 259
    :goto_2
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->m:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->t:Lcom/jirbo/adcolony/AdColonyBrowser$a;

    new-instance v3, Landroid/widget/RelativeLayout$LayoutParams;

    mul-int/lit8 v4, v0, 0x2

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {v3, v4, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2, v3}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 261
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->s:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->g:Lcom/jirbo/adcolony/ADCImage;

    iget v2, v2, Lcom/jirbo/adcolony/ADCImage;->g:I

    int-to-double v2, v2

    mul-double/2addr v2, v8

    double-to-int v2, v2

    sub-int/2addr v1, v2

    invoke-direct {v0, v11, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 262
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getId()I

    move-result v1

    invoke-virtual {v0, v10, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 263
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->m:Landroid/widget/RelativeLayout;

    new-instance v2, Lcom/jirbo/adcolony/AdColonyBrowser$b;

    invoke-direct {v2, p0, p0}, Lcom/jirbo/adcolony/AdColonyBrowser$b;-><init>(Lcom/jirbo/adcolony/AdColonyBrowser;Landroid/app/Activity;)V

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 264
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/AdColonyBrowser;->setContentView(Landroid/view/View;)V

    .line 267
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->b:Landroid/webkit/WebView;

    sget-object v1, Lcom/jirbo/adcolony/AdColonyBrowser;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 268
    sget-object v0, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v1, "Viewing "

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    sget-object v1, Lcom/jirbo/adcolony/AdColonyBrowser;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 269
    return-void

    .line 136
    :cond_2
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->l:Landroid/widget/RelativeLayout;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x1

    iget-object v3, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->c:Lcom/jirbo/adcolony/ADCImage;

    iget v3, v3, Lcom/jirbo/adcolony/ADCImage;->g:I

    int-to-double v4, v3

    mul-double/2addr v4, v8

    double-to-int v3, v4

    invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 169
    :cond_3
    invoke-virtual {p0, v7}, Lcom/jirbo/adcolony/AdColonyBrowser;->setRequestedOrientation(I)V

    goto/16 :goto_1

    .line 174
    :cond_4
    sget v0, Lcom/jirbo/adcolony/a;->w:I

    invoke-virtual {p0, v0}, Lcom/jirbo/adcolony/AdColonyBrowser;->setRequestedOrientation(I)V

    goto/16 :goto_1

    .line 258
    :cond_5
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->s:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    goto :goto_2
.end method

.method public onDestroy()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 298
    sget-boolean v0, Lcom/jirbo/adcolony/a;->u:Z

    if-nez v0, :cond_1

    sget-boolean v0, Lcom/jirbo/adcolony/AdColonyBrowser;->A:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    move v1, v2

    .line 300
    :goto_0
    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 301
    :cond_0
    sget-object v0, Lcom/jirbo/adcolony/a;->ad:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 303
    :cond_1
    sput-boolean v2, Lcom/jirbo/adcolony/AdColonyBrowser;->A:Z

    .line 304
    sput-boolean v2, Lcom/jirbo/adcolony/AdColonyBrowser;->B:Z

    .line 305
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 306
    return-void
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 277
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 278
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->t:Lcom/jirbo/adcolony/AdColonyBrowser$a;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->b()V

    .line 279
    return-void
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 282
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 283
    const/4 v0, 0x1

    sput-boolean v0, Lcom/jirbo/adcolony/AdColonyBrowser;->z:Z

    .line 284
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyBrowser;->t:Lcom/jirbo/adcolony/AdColonyBrowser$a;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/AdColonyBrowser$a;->invalidate()V

    .line 285
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    .prologue
    .line 273
    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    .line 274
    return-void
.end method
