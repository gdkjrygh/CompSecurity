.class public Lcom/mopub/mobileads/AdViewController;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Landroid/widget/FrameLayout$LayoutParams;

.field private static final c:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Landroid/view/View;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:I
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation
.end field

.field private final d:J

.field private e:Landroid/content/Context;

.field private f:Lcom/mopub/mobileads/MoPubView;

.field private g:Lcom/mopub/mobileads/WebViewAdUrlGenerator;

.field private h:Lcom/mopub/network/AdResponse;

.field private final i:Ljava/lang/Runnable;

.field private final j:Lcom/mopub/network/AdRequest$Listener;

.field private k:Z

.field private l:Landroid/os/Handler;

.field private m:Z

.field private n:Ljava/lang/String;

.field private o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private p:Z

.field private q:Z

.field private r:Ljava/lang/String;

.field private s:Landroid/location/Location;

.field private t:Z

.field private u:Z

.field private v:Ljava/lang/String;

.field private w:I

.field private x:Lcom/mopub/network/AdRequest;

.field private y:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, -0x2

    .line 47
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v1, 0x11

    invoke-direct {v0, v2, v2, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    sput-object v0, Lcom/mopub/mobileads/AdViewController;->b:Landroid/widget/FrameLayout$LayoutParams;

    .line 52
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lcom/mopub/mobileads/AdViewController;->c:Ljava/util/WeakHashMap;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/mopub/mobileads/MoPubView;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput v1, p0, Lcom/mopub/mobileads/AdViewController;->a:I

    .line 78
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/AdViewController;->o:Ljava/util/Map;

    .line 79
    iput-boolean v1, p0, Lcom/mopub/mobileads/AdViewController;->p:Z

    .line 80
    iput-boolean v1, p0, Lcom/mopub/mobileads/AdViewController;->q:Z

    .line 102
    iput-object p1, p0, Lcom/mopub/mobileads/AdViewController;->e:Landroid/content/Context;

    .line 103
    iput-object p2, p0, Lcom/mopub/mobileads/AdViewController;->f:Lcom/mopub/mobileads/MoPubView;

    .line 106
    const/4 v0, -0x1

    iput v0, p0, Lcom/mopub/mobileads/AdViewController;->w:I

    .line 107
    invoke-static {}, Lcom/mopub/common/util/Utils;->generateUniqueId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/mopub/mobileads/AdViewController;->d:J

    .line 109
    new-instance v0, Lcom/mopub/mobileads/WebViewAdUrlGenerator;

    iget-object v1, p0, Lcom/mopub/mobileads/AdViewController;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/mopub/mobileads/AdViewController;->e:Landroid/content/Context;

    invoke-static {v2}, Lcom/mopub/mraid/MraidNativeCommandHandler;->isStorePictureSupported(Landroid/content/Context;)Z

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/mopub/mobileads/WebViewAdUrlGenerator;-><init>(Landroid/content/Context;Z)V

    iput-object v0, p0, Lcom/mopub/mobileads/AdViewController;->g:Lcom/mopub/mobileads/WebViewAdUrlGenerator;

    .line 112
    new-instance v0, Lcom/mopub/mobileads/g;

    invoke-direct {v0, p0}, Lcom/mopub/mobileads/g;-><init>(Lcom/mopub/mobileads/AdViewController;)V

    iput-object v0, p0, Lcom/mopub/mobileads/AdViewController;->j:Lcom/mopub/network/AdRequest$Listener;

    .line 124
    new-instance v0, Lcom/mopub/mobileads/h;

    invoke-direct {v0, p0}, Lcom/mopub/mobileads/h;-><init>(Lcom/mopub/mobileads/AdViewController;)V

    iput-object v0, p0, Lcom/mopub/mobileads/AdViewController;->i:Ljava/lang/Runnable;

    .line 129
    const v0, 0xea60

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mobileads/AdViewController;->y:Ljava/lang/Integer;

    .line 130
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/AdViewController;->l:Landroid/os/Handler;

    .line 131
    return-void
.end method

.method static synthetic a(Lcom/mopub/mobileads/AdViewController;Landroid/view/View;)Landroid/widget/FrameLayout$LayoutParams;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 3564
    .line 3566
    iget-object v1, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    if-eqz v1, :cond_2

    .line 3567
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getWidth()Ljava/lang/Integer;

    move-result-object v1

    .line 3568
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getHeight()Ljava/lang/Integer;

    move-result-object v0

    move-object v2, v1

    move-object v1, v0

    .line 3571
    :goto_0
    if-eqz v2, :cond_1

    if-eqz v1, :cond_1

    .line 4098
    sget-object v0, Lcom/mopub/mobileads/AdViewController;->c:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 3571
    :goto_1
    if-eqz v0, :cond_1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_1

    .line 3572
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    iget-object v2, p0, Lcom/mopub/mobileads/AdViewController;->e:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/mopub/common/util/Dips;->asIntPixels(FLandroid/content/Context;)I

    move-result v2

    .line 3573
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lcom/mopub/mobileads/AdViewController;->e:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/mopub/common/util/Dips;->asIntPixels(FLandroid/content/Context;)I

    move-result v1

    .line 3575
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v3, 0x11

    invoke-direct {v0, v2, v1, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    :goto_2
    return-object v0

    .line 4098
    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    .line 3577
    :cond_1
    sget-object v0, Lcom/mopub/mobileads/AdViewController;->b:Landroid/widget/FrameLayout$LayoutParams;

    goto :goto_2

    :cond_2
    move-object v1, v0

    move-object v2, v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/mopub/mobileads/AdViewController;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/mopub/mobileads/AdViewController;->l()V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 237
    if-nez p1, :cond_1

    .line 3459
    :cond_0
    :goto_0
    return-void

    .line 239
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Loading url: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 240
    iget-boolean v0, p0, Lcom/mopub/mobileads/AdViewController;->m:Z

    if-eqz v0, :cond_2

    .line 241
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->v:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 242
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Already loading an ad for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mopub/mobileads/AdViewController;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", wait to finish."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->i(Ljava/lang/String;)V

    goto :goto_0

    .line 247
    :cond_2
    iput-object p1, p0, Lcom/mopub/mobileads/AdViewController;->n:Ljava/lang/String;

    .line 248
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/mobileads/AdViewController;->m:Z

    .line 250
    iget-object v1, p0, Lcom/mopub/mobileads/AdViewController;->n:Ljava/lang/String;

    .line 3455
    invoke-virtual {p0}, Lcom/mopub/mobileads/AdViewController;->getMoPubView()Lcom/mopub/mobileads/MoPubView;

    move-result-object v2

    .line 3456
    if-eqz v2, :cond_3

    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->e:Landroid/content/Context;

    if-nez v0, :cond_4

    .line 3457
    :cond_3
    const-string v0, "Can\'t load an ad in this ad view because it was destroyed."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 3458
    invoke-virtual {p0}, Lcom/mopub/mobileads/AdViewController;->a()V

    goto :goto_0

    .line 3462
    :cond_4
    new-instance v0, Lcom/mopub/network/AdRequest;

    invoke-virtual {v2}, Lcom/mopub/mobileads/MoPubView;->getAdFormat()Lcom/mopub/common/AdFormat;

    move-result-object v2

    iget-object v3, p0, Lcom/mopub/mobileads/AdViewController;->v:Ljava/lang/String;

    iget-object v4, p0, Lcom/mopub/mobileads/AdViewController;->e:Landroid/content/Context;

    iget-object v5, p0, Lcom/mopub/mobileads/AdViewController;->j:Lcom/mopub/network/AdRequest$Listener;

    invoke-direct/range {v0 .. v5}, Lcom/mopub/network/AdRequest;-><init>(Ljava/lang/String;Lcom/mopub/common/AdFormat;Ljava/lang/String;Landroid/content/Context;Lcom/mopub/network/AdRequest$Listener;)V

    .line 3468
    iget-object v1, p0, Lcom/mopub/mobileads/AdViewController;->e:Landroid/content/Context;

    invoke-static {v1}, Lcom/mopub/network/Networking;->getRequestQueue(Landroid/content/Context;)Lcom/mopub/network/MoPubRequestQueue;

    move-result-object v1

    .line 3469
    invoke-virtual {v1, v0}, Lcom/mopub/volley/RequestQueue;->add(Lcom/mopub/volley/Request;)Lcom/mopub/volley/Request;

    .line 3470
    iput-object v0, p0, Lcom/mopub/mobileads/AdViewController;->x:Lcom/mopub/network/AdRequest;

    goto :goto_0
.end method

.method private b(Lcom/mopub/mobileads/MoPubErrorCode;)V
    .locals 1

    .prologue
    .line 488
    const-string v0, "Ad failed to load."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->i(Ljava/lang/String;)V

    .line 489
    invoke-virtual {p0}, Lcom/mopub/mobileads/AdViewController;->a()V

    .line 491
    invoke-virtual {p0}, Lcom/mopub/mobileads/AdViewController;->getMoPubView()Lcom/mopub/mobileads/MoPubView;

    move-result-object v0

    .line 492
    if-nez v0, :cond_0

    .line 498
    :goto_0
    return-void

    .line 496
    :cond_0
    invoke-virtual {p0}, Lcom/mopub/mobileads/AdViewController;->j()V

    .line 497
    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/MoPubView;->a(Lcom/mopub/mobileads/MoPubErrorCode;)V

    goto :goto_0
.end method

.method private b(Z)V
    .locals 3

    .prologue
    .line 370
    iget-boolean v0, p0, Lcom/mopub/mobileads/AdViewController;->u:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/mopub/mobileads/AdViewController;->p:Z

    if-eq v0, p1, :cond_2

    const/4 v0, 0x1

    .line 371
    :goto_0
    if-eqz v0, :cond_0

    .line 372
    if-eqz p1, :cond_3

    const-string v0, "enabled"

    .line 373
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Refresh "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " for ad unit ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mobileads/AdViewController;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 376
    :cond_0
    iput-boolean p1, p0, Lcom/mopub/mobileads/AdViewController;->p:Z

    .line 377
    iget-boolean v0, p0, Lcom/mopub/mobileads/AdViewController;->u:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/mopub/mobileads/AdViewController;->p:Z

    if-eqz v0, :cond_4

    .line 378
    invoke-virtual {p0}, Lcom/mopub/mobileads/AdViewController;->j()V

    .line 382
    :cond_1
    :goto_2
    return-void

    .line 370
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 372
    :cond_3
    const-string v0, "disabled"

    goto :goto_1

    .line 379
    :cond_4
    iget-boolean v0, p0, Lcom/mopub/mobileads/AdViewController;->p:Z

    if-nez v0, :cond_1

    .line 380
    invoke-direct {p0}, Lcom/mopub/mobileads/AdViewController;->m()V

    goto :goto_2
.end method

.method private l()V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 219
    iput-boolean v1, p0, Lcom/mopub/mobileads/AdViewController;->u:Z

    .line 220
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->v:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 221
    const-string v0, "Can\'t load an ad in this ad view because the ad unit ID is not set. Did you forget to call setAdUnitId()?"

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 234
    :goto_0
    return-void

    .line 1530
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->e:Landroid/content/Context;

    if-eqz v0, :cond_2

    .line 1534
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->e:Landroid/content/Context;

    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {v0, v2}, Landroid/content/Context;->checkCallingPermission(Ljava/lang/String;)I

    move-result v0

    .line 1535
    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    move v0, v1

    .line 226
    :goto_1
    if-nez v0, :cond_3

    .line 227
    const-string v0, "Can\'t load an ad because there is no network connectivity."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 228
    invoke-virtual {p0}, Lcom/mopub/mobileads/AdViewController;->j()V

    goto :goto_0

    .line 1538
    :cond_1
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->e:Landroid/content/Context;

    const-string v2, "connectivity"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 1540
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 1541
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    .line 2480
    :cond_3
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->g:Lcom/mopub/mobileads/WebViewAdUrlGenerator;

    if-nez v0, :cond_4

    const/4 v0, 0x0

    .line 233
    :goto_2
    invoke-direct {p0, v0}, Lcom/mopub/mobileads/AdViewController;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 2480
    :cond_4
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->g:Lcom/mopub/mobileads/WebViewAdUrlGenerator;

    iget-object v1, p0, Lcom/mopub/mobileads/AdViewController;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/WebViewAdUrlGenerator;->withAdUnitId(Ljava/lang/String;)Lcom/mopub/common/AdUrlGenerator;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mobileads/AdViewController;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mopub/common/AdUrlGenerator;->withKeywords(Ljava/lang/String;)Lcom/mopub/common/AdUrlGenerator;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mobileads/AdViewController;->s:Landroid/location/Location;

    invoke-virtual {v0, v1}, Lcom/mopub/common/AdUrlGenerator;->withLocation(Landroid/location/Location;)Lcom/mopub/common/AdUrlGenerator;

    move-result-object v0

    const-string v1, "ads.mopub.com"

    invoke-virtual {v0, v1}, Lcom/mopub/common/AdUrlGenerator;->generateUrlString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2
.end method

.method private m()V
    .locals 2

    .prologue
    .line 526
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->l:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/mobileads/AdViewController;->i:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 527
    return-void
.end method

.method public static setShouldHonorServerDimensions(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 94
    sget-object v0, Lcom/mopub/mobileads/AdViewController;->c:Ljava/util/WeakHashMap;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    return-void
.end method


# virtual methods
.method final a()V
    .locals 1

    .prologue
    .line 279
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mopub/mobileads/AdViewController;->m:Z

    .line 280
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->x:Lcom/mopub/network/AdRequest;

    if-eqz v0, :cond_1

    .line 281
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->x:Lcom/mopub/network/AdRequest;

    invoke-virtual {v0}, Lcom/mopub/network/AdRequest;->isCanceled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 282
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->x:Lcom/mopub/network/AdRequest;

    invoke-virtual {v0}, Lcom/mopub/network/AdRequest;->cancel()V

    .line 284
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/mobileads/AdViewController;->x:Lcom/mopub/network/AdRequest;

    .line 286
    :cond_1
    return-void
.end method

.method final a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 548
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->l:Landroid/os/Handler;

    new-instance v1, Lcom/mopub/mobileads/i;

    invoke-direct {v1, p0, p1}, Lcom/mopub/mobileads/i;-><init>(Lcom/mopub/mobileads/AdViewController;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 561
    return-void
.end method

.method final a(Lcom/mopub/mobileads/MoPubErrorCode;)V
    .locals 3

    .prologue
    .line 259
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mopub/mobileads/AdViewController;->m:Z

    .line 261
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, "MoPubErrorCode: "

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez p1, :cond_0

    const-string v0, ""

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    if-nez v0, :cond_1

    const-string v0, ""

    .line 264
    :goto_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 265
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Loading failover url: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 266
    invoke-direct {p0, v0}, Lcom/mopub/mobileads/AdViewController;->a(Ljava/lang/String;)V

    .line 271
    :goto_2
    return-void

    .line 261
    :cond_0
    invoke-virtual {p1}, Lcom/mopub/mobileads/MoPubErrorCode;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 263
    :cond_1
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getFailoverUrl()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 269
    :cond_2
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->NO_FILL:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-direct {p0, v0}, Lcom/mopub/mobileads/AdViewController;->b(Lcom/mopub/mobileads/MoPubErrorCode;)V

    goto :goto_2
.end method

.method final a(Lcom/mopub/network/AdResponse;)V
    .locals 3
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    .line 135
    const/4 v0, 0x1

    iput v0, p0, Lcom/mopub/mobileads/AdViewController;->a:I

    .line 136
    iput-object p1, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    .line 138
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getAdTimeoutMillis()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/mopub/mobileads/AdViewController;->w:I

    :goto_0
    iput v0, p0, Lcom/mopub/mobileads/AdViewController;->w:I

    .line 141
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getRefreshTimeMillis()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mobileads/AdViewController;->y:Ljava/lang/Integer;

    .line 142
    invoke-virtual {p0}, Lcom/mopub/mobileads/AdViewController;->a()V

    .line 145
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    .line 1024
    const-string v1, "Performing custom event."

    invoke-static {v1}, Lcom/mopub/common/logging/MoPubLog;->i(Ljava/lang/String;)V

    .line 1027
    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getCustomEventClassName()Ljava/lang/String;

    move-result-object v1

    .line 1028
    if-eqz v1, :cond_2

    .line 1029
    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getServerExtras()Ljava/util/Map;

    move-result-object v2

    .line 1030
    new-instance v0, Lcom/mopub/mobileads/d;

    invoke-direct {v0, p0, v1, v2}, Lcom/mopub/mobileads/d;-><init>(Lcom/mopub/mobileads/AdViewController;Ljava/lang/String;Ljava/util/Map;)V

    .line 146
    :goto_1
    if-eqz v0, :cond_0

    .line 147
    invoke-virtual {v0}, Lcom/mopub/mobileads/c;->a()V

    .line 149
    :cond_0
    invoke-virtual {p0}, Lcom/mopub/mobileads/AdViewController;->j()V

    .line 150
    return-void

    .line 138
    :cond_1
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getAdTimeoutMillis()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    .line 1033
    :cond_2
    const-string v0, "Failed to create custom event."

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->i(Ljava/lang/String;)V

    .line 1034
    const/4 v0, 0x0

    goto :goto_1
.end method

.method final a(Lcom/mopub/volley/VolleyError;)V
    .locals 3
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    .line 154
    instance-of v0, p1, Lcom/mopub/network/MoPubNetworkError;

    if-eqz v0, :cond_0

    move-object v0, p1

    .line 161
    check-cast v0, Lcom/mopub/network/MoPubNetworkError;

    .line 162
    invoke-virtual {v0}, Lcom/mopub/network/MoPubNetworkError;->getRefreshTimeMillis()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 163
    invoke-virtual {v0}, Lcom/mopub/network/MoPubNetworkError;->getRefreshTimeMillis()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/mobileads/AdViewController;->y:Ljava/lang/Integer;

    .line 167
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->e:Landroid/content/Context;

    .line 1180
    iget-object v1, p1, Lcom/mopub/volley/VolleyError;->networkResponse:Lcom/mopub/volley/NetworkResponse;

    .line 1183
    instance-of v2, p1, Lcom/mopub/network/MoPubNetworkError;

    if-eqz v2, :cond_2

    .line 1184
    sget-object v0, Lcom/mopub/mobileads/j;->a:[I

    check-cast p1, Lcom/mopub/network/MoPubNetworkError;

    invoke-virtual {p1}, Lcom/mopub/network/MoPubNetworkError;->getReason()Lcom/mopub/network/MoPubNetworkError$Reason;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mopub/network/MoPubNetworkError$Reason;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 1190
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->UNSPECIFIED:Lcom/mopub/mobileads/MoPubErrorCode;

    .line 168
    :goto_0
    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->SERVER_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    if-ne v0, v1, :cond_1

    .line 169
    iget v1, p0, Lcom/mopub/mobileads/AdViewController;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/mopub/mobileads/AdViewController;->a:I

    .line 172
    :cond_1
    invoke-virtual {p0}, Lcom/mopub/mobileads/AdViewController;->a()V

    .line 173
    invoke-direct {p0, v0}, Lcom/mopub/mobileads/AdViewController;->b(Lcom/mopub/mobileads/MoPubErrorCode;)V

    .line 174
    return-void

    .line 1186
    :pswitch_0
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->WARMUP:Lcom/mopub/mobileads/MoPubErrorCode;

    goto :goto_0

    .line 1188
    :pswitch_1
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->NO_FILL:Lcom/mopub/mobileads/MoPubErrorCode;

    goto :goto_0

    .line 1194
    :cond_2
    if-nez v1, :cond_4

    .line 1195
    invoke-static {v0}, Lcom/mopub/common/util/DeviceUtils;->isNetworkAvailable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1196
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->NO_CONNECTION:Lcom/mopub/mobileads/MoPubErrorCode;

    goto :goto_0

    .line 1198
    :cond_3
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->UNSPECIFIED:Lcom/mopub/mobileads/MoPubErrorCode;

    goto :goto_0

    .line 1201
    :cond_4
    iget-object v0, p1, Lcom/mopub/volley/VolleyError;->networkResponse:Lcom/mopub/volley/NetworkResponse;

    iget v0, v0, Lcom/mopub/volley/NetworkResponse;->statusCode:I

    const/16 v1, 0x190

    if-lt v0, v1, :cond_5

    .line 1202
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->SERVER_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    goto :goto_0

    .line 1205
    :cond_5
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->UNSPECIFIED:Lcom/mopub/mobileads/MoPubErrorCode;

    goto :goto_0

    .line 1184
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method final a(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 511
    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0, p1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    :goto_0
    iput-object v0, p0, Lcom/mopub/mobileads/AdViewController;->o:Ljava/util/Map;

    .line 514
    return-void

    .line 511
    :cond_0
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    goto :goto_0
.end method

.method final a(Z)V
    .locals 0

    .prologue
    .line 365
    iput-boolean p1, p0, Lcom/mopub/mobileads/AdViewController;->q:Z

    .line 366
    invoke-direct {p0, p1}, Lcom/mopub/mobileads/AdViewController;->b(Z)V

    .line 367
    return-void
.end method

.method final b()V
    .locals 1

    .prologue
    .line 356
    iget-boolean v0, p0, Lcom/mopub/mobileads/AdViewController;->p:Z

    iput-boolean v0, p0, Lcom/mopub/mobileads/AdViewController;->q:Z

    .line 357
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/mopub/mobileads/AdViewController;->b(Z)V

    .line 358
    return-void
.end method

.method final c()V
    .locals 1

    .prologue
    .line 361
    iget-boolean v0, p0, Lcom/mopub/mobileads/AdViewController;->q:Z

    invoke-direct {p0, v0}, Lcom/mopub/mobileads/AdViewController;->b(Z)V

    .line 362
    return-void
.end method

.method public customEventActionWillBegin()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 607
    invoke-virtual {p0}, Lcom/mopub/mobileads/AdViewController;->h()V

    .line 608
    return-void
.end method

.method public customEventDidFailToLoadAd()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 602
    sget-object v0, Lcom/mopub/mobileads/MoPubErrorCode;->UNSPECIFIED:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-virtual {p0, v0}, Lcom/mopub/mobileads/AdViewController;->a(Lcom/mopub/mobileads/MoPubErrorCode;)V

    .line 603
    return-void
.end method

.method public customEventDidLoadAd()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 595
    invoke-virtual {p0}, Lcom/mopub/mobileads/AdViewController;->a()V

    .line 596
    invoke-virtual {p0}, Lcom/mopub/mobileads/AdViewController;->g()V

    .line 597
    invoke-virtual {p0}, Lcom/mopub/mobileads/AdViewController;->j()V

    .line 598
    return-void
.end method

.method final d()Z
    .locals 1

    .prologue
    .line 406
    iget-boolean v0, p0, Lcom/mopub/mobileads/AdViewController;->k:Z

    return v0
.end method

.method final e()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 413
    iget-boolean v0, p0, Lcom/mopub/mobileads/AdViewController;->k:Z

    if-eqz v0, :cond_0

    .line 434
    :goto_0
    return-void

    .line 417
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->x:Lcom/mopub/network/AdRequest;

    if-eqz v0, :cond_1

    .line 418
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->x:Lcom/mopub/network/AdRequest;

    invoke-virtual {v0}, Lcom/mopub/network/AdRequest;->cancel()V

    .line 419
    iput-object v1, p0, Lcom/mopub/mobileads/AdViewController;->x:Lcom/mopub/network/AdRequest;

    .line 422
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/mopub/mobileads/AdViewController;->b(Z)V

    .line 423
    invoke-direct {p0}, Lcom/mopub/mobileads/AdViewController;->m()V

    .line 428
    iput-object v1, p0, Lcom/mopub/mobileads/AdViewController;->f:Lcom/mopub/mobileads/MoPubView;

    .line 429
    iput-object v1, p0, Lcom/mopub/mobileads/AdViewController;->e:Landroid/content/Context;

    .line 430
    iput-object v1, p0, Lcom/mopub/mobileads/AdViewController;->g:Lcom/mopub/mobileads/WebViewAdUrlGenerator;

    .line 433
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/mobileads/AdViewController;->k:Z

    goto :goto_0
.end method

.method final f()Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 437
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getAdTimeoutMillis()Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0
.end method

.method final g()V
    .locals 3

    .prologue
    .line 441
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    if-eqz v0, :cond_0

    .line 442
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getImpressionTrackingUrl()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mobileads/AdViewController;->e:Landroid/content/Context;

    sget-object v2, Lcom/mopub/common/event/BaseEvent$Name;->IMPRESSION_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

    invoke-static {v0, v1, v2}, Lcom/mopub/network/TrackingRequest;->makeTrackingHttpRequest(Ljava/lang/String;Landroid/content/Context;Lcom/mopub/common/event/BaseEvent$Name;)V

    .line 445
    :cond_0
    return-void
.end method

.method public getAdHeight()I
    .locals 1

    .prologue
    .line 329
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getHeight()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 330
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getHeight()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 333
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getAdReport()Lcom/mopub/common/AdReport;
    .locals 4

    .prologue
    .line 386
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->v:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    if-eqz v0, :cond_0

    .line 387
    new-instance v0, Lcom/mopub/common/AdReport;

    iget-object v1, p0, Lcom/mopub/mobileads/AdViewController;->v:Ljava/lang/String;

    iget-object v2, p0, Lcom/mopub/mobileads/AdViewController;->e:Landroid/content/Context;

    invoke-static {v2}, Lcom/mopub/common/ClientMetadata;->getInstance(Landroid/content/Context;)Lcom/mopub/common/ClientMetadata;

    move-result-object v2

    iget-object v3, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/AdReport;-><init>(Ljava/lang/String;Lcom/mopub/common/ClientMetadata;Lcom/mopub/network/AdResponse;)V

    .line 389
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 305
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->v:Ljava/lang/String;

    return-object v0
.end method

.method public getAdWidth()I
    .locals 1

    .prologue
    .line 321
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getWidth()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 322
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getWidth()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 325
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getAutorefreshEnabled()Z
    .locals 1

    .prologue
    .line 352
    iget-boolean v0, p0, Lcom/mopub/mobileads/AdViewController;->p:Z

    return v0
.end method

.method public getBroadcastIdentifier()J
    .locals 2

    .prologue
    .line 313
    iget-wide v0, p0, Lcom/mopub/mobileads/AdViewController;->d:J

    return-wide v0
.end method

.method public getClickTrackingUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 338
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getClickTrackingUrl()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getKeywords()Ljava/lang/String;
    .locals 1

    .prologue
    .line 289
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->r:Ljava/lang/String;

    return-object v0
.end method

.method public getLocation()Landroid/location/Location;
    .locals 1

    .prologue
    .line 297
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->s:Landroid/location/Location;

    return-object v0
.end method

.method public getMoPubView()Lcom/mopub/mobileads/MoPubView;
    .locals 1

    .prologue
    .line 210
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->f:Lcom/mopub/mobileads/MoPubView;

    return-object v0
.end method

.method public getRedirectUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 343
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getRedirectUrl()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getResponseString()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 348
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getStringBody()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getTesting()Z
    .locals 1

    .prologue
    .line 393
    iget-boolean v0, p0, Lcom/mopub/mobileads/AdViewController;->t:Z

    return v0
.end method

.method final h()V
    .locals 3

    .prologue
    .line 448
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    if-eqz v0, :cond_0

    .line 449
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->h:Lcom/mopub/network/AdResponse;

    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getClickTrackingUrl()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mobileads/AdViewController;->e:Landroid/content/Context;

    sget-object v2, Lcom/mopub/common/event/BaseEvent$Name;->CLICK_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

    invoke-static {v0, v1, v2}, Lcom/mopub/network/TrackingRequest;->makeTrackingHttpRequest(Ljava/lang/String;Landroid/content/Context;Lcom/mopub/common/event/BaseEvent$Name;)V

    .line 452
    :cond_0
    return-void
.end method

.method final i()V
    .locals 0

    .prologue
    .line 474
    invoke-virtual {p0}, Lcom/mopub/mobileads/AdViewController;->a()V

    .line 475
    invoke-virtual {p0}, Lcom/mopub/mobileads/AdViewController;->loadAd()V

    .line 476
    return-void
.end method

.method public isFacebookSupported()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 620
    const/4 v0, 0x0

    return v0
.end method

.method final j()V
    .locals 10

    .prologue
    .line 501
    invoke-direct {p0}, Lcom/mopub/mobileads/AdViewController;->m()V

    .line 502
    iget-boolean v0, p0, Lcom/mopub/mobileads/AdViewController;->p:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->y:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->y:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_0

    .line 504
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->l:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/mobileads/AdViewController;->i:Ljava/lang/Runnable;

    const-wide/32 v2, 0x927c0

    iget-object v4, p0, Lcom/mopub/mobileads/AdViewController;->y:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-long v4, v4

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    iget v8, p0, Lcom/mopub/mobileads/AdViewController;->a:I

    int-to-double v8, v8

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    double-to-long v6, v6

    mul-long/2addr v4, v6

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 508
    :cond_0
    return-void
.end method

.method final k()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 520
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->o:Ljava/util/Map;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/TreeMap;

    iget-object v1, p0, Lcom/mopub/mobileads/AdViewController;->o:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    goto :goto_0
.end method

.method public loadAd()V
    .locals 1

    .prologue
    .line 214
    const/4 v0, 0x1

    iput v0, p0, Lcom/mopub/mobileads/AdViewController;->a:I

    .line 215
    invoke-direct {p0}, Lcom/mopub/mobileads/AdViewController;->l()V

    .line 216
    return-void
.end method

.method public reload()V
    .locals 2

    .prologue
    .line 254
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Reload ad: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mopub/mobileads/AdViewController;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 255
    iget-object v0, p0, Lcom/mopub/mobileads/AdViewController;->n:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/mopub/mobileads/AdViewController;->a(Ljava/lang/String;)V

    .line 256
    return-void
.end method

.method public setAdUnitId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 309
    iput-object p1, p0, Lcom/mopub/mobileads/AdViewController;->v:Ljava/lang/String;

    .line 310
    return-void
.end method

.method public setClickthroughUrl(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 613
    return-void
.end method

.method public setFacebookSupported(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 627
    return-void
.end method

.method public setKeywords(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 293
    iput-object p1, p0, Lcom/mopub/mobileads/AdViewController;->r:Ljava/lang/String;

    .line 294
    return-void
.end method

.method public setLocation(Landroid/location/Location;)V
    .locals 0

    .prologue
    .line 301
    iput-object p1, p0, Lcom/mopub/mobileads/AdViewController;->s:Landroid/location/Location;

    .line 302
    return-void
.end method

.method public setTesting(Z)V
    .locals 0

    .prologue
    .line 397
    iput-boolean p1, p0, Lcom/mopub/mobileads/AdViewController;->t:Z

    .line 398
    return-void
.end method

.method public setTimeout(I)V
    .locals 0

    .prologue
    .line 317
    iput p1, p0, Lcom/mopub/mobileads/AdViewController;->w:I

    .line 318
    return-void
.end method
