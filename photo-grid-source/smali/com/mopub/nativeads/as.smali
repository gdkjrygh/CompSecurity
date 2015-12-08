.class final Lcom/mopub/nativeads/as;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/nativeads/PositioningSource;


# static fields
.field static a:I
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Landroid/os/Handler;

.field private final d:Ljava/lang/Runnable;

.field private final e:Lcom/mopub/volley/Response$Listener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/mopub/volley/Response$Listener",
            "<",
            "Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/mopub/volley/Response$ErrorListener;

.field private g:Lcom/mopub/nativeads/PositioningSource$PositioningListener;

.field private h:I

.field private i:Ljava/lang/String;

.field private j:Lcom/mopub/nativeads/PositioningRequest;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    const v0, 0x493e0

    sput v0, Lcom/mopub/nativeads/as;->a:I

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/nativeads/as;->b:Landroid/content/Context;

    .line 71
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/mopub/nativeads/as;->c:Landroid/os/Handler;

    .line 72
    new-instance v0, Lcom/mopub/nativeads/at;

    invoke-direct {v0, p0}, Lcom/mopub/nativeads/at;-><init>(Lcom/mopub/nativeads/as;)V

    iput-object v0, p0, Lcom/mopub/nativeads/as;->d:Ljava/lang/Runnable;

    .line 79
    new-instance v0, Lcom/mopub/nativeads/au;

    invoke-direct {v0, p0}, Lcom/mopub/nativeads/au;-><init>(Lcom/mopub/nativeads/as;)V

    iput-object v0, p0, Lcom/mopub/nativeads/as;->e:Lcom/mopub/volley/Response$Listener;

    .line 86
    new-instance v0, Lcom/mopub/nativeads/av;

    invoke-direct {v0, p0}, Lcom/mopub/nativeads/av;-><init>(Lcom/mopub/nativeads/as;)V

    iput-object v0, p0, Lcom/mopub/nativeads/as;->f:Lcom/mopub/volley/Response$ErrorListener;

    .line 101
    return-void
.end method

.method private a()V
    .locals 4

    .prologue
    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Loading positioning from: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/mopub/nativeads/as;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 127
    new-instance v0, Lcom/mopub/nativeads/PositioningRequest;

    iget-object v1, p0, Lcom/mopub/nativeads/as;->i:Ljava/lang/String;

    iget-object v2, p0, Lcom/mopub/nativeads/as;->e:Lcom/mopub/volley/Response$Listener;

    iget-object v3, p0, Lcom/mopub/nativeads/as;->f:Lcom/mopub/volley/Response$ErrorListener;

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/nativeads/PositioningRequest;-><init>(Ljava/lang/String;Lcom/mopub/volley/Response$Listener;Lcom/mopub/volley/Response$ErrorListener;)V

    iput-object v0, p0, Lcom/mopub/nativeads/as;->j:Lcom/mopub/nativeads/PositioningRequest;

    .line 128
    iget-object v0, p0, Lcom/mopub/nativeads/as;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/mopub/network/Networking;->getRequestQueue(Landroid/content/Context;)Lcom/mopub/network/MoPubRequestQueue;

    move-result-object v0

    .line 129
    iget-object v1, p0, Lcom/mopub/nativeads/as;->j:Lcom/mopub/nativeads/PositioningRequest;

    invoke-virtual {v0, v1}, Lcom/mopub/volley/RequestQueue;->add(Lcom/mopub/volley/Request;)Lcom/mopub/volley/Request;

    .line 130
    return-void
.end method

.method static synthetic a(Lcom/mopub/nativeads/as;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/mopub/nativeads/as;->a()V

    return-void
.end method

.method static synthetic a(Lcom/mopub/nativeads/as;Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;)V
    .locals 1

    .prologue
    .line 47
    .line 1133
    iget-object v0, p0, Lcom/mopub/nativeads/as;->g:Lcom/mopub/nativeads/PositioningSource$PositioningListener;

    if-eqz v0, :cond_0

    .line 1134
    iget-object v0, p0, Lcom/mopub/nativeads/as;->g:Lcom/mopub/nativeads/PositioningSource$PositioningListener;

    invoke-interface {v0, p1}, Lcom/mopub/nativeads/PositioningSource$PositioningListener;->onLoad(Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;)V

    .line 1136
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/nativeads/as;->g:Lcom/mopub/nativeads/PositioningSource$PositioningListener;

    .line 1137
    const/4 v0, 0x0

    iput v0, p0, Lcom/mopub/nativeads/as;->h:I

    .line 47
    return-void
.end method

.method static synthetic b(Lcom/mopub/nativeads/as;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/mopub/nativeads/as;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lcom/mopub/nativeads/as;)V
    .locals 6

    .prologue
    .line 1141
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    iget v2, p0, Lcom/mopub/nativeads/as;->h:I

    add-int/lit8 v2, v2, 0x1

    int-to-double v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    .line 1142
    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    .line 1143
    sget v1, Lcom/mopub/nativeads/as;->a:I

    if-lt v0, v1, :cond_1

    .line 1144
    const-string v0, "Error downloading positioning information"

    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 1145
    iget-object v0, p0, Lcom/mopub/nativeads/as;->g:Lcom/mopub/nativeads/PositioningSource$PositioningListener;

    if-eqz v0, :cond_0

    .line 1146
    iget-object v0, p0, Lcom/mopub/nativeads/as;->g:Lcom/mopub/nativeads/PositioningSource$PositioningListener;

    invoke-interface {v0}, Lcom/mopub/nativeads/PositioningSource$PositioningListener;->onFailed()V

    .line 1148
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/nativeads/as;->g:Lcom/mopub/nativeads/PositioningSource$PositioningListener;

    .line 1149
    :goto_0
    return-void

    .line 1152
    :cond_1
    iget v1, p0, Lcom/mopub/nativeads/as;->h:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/mopub/nativeads/as;->h:I

    .line 1153
    iget-object v1, p0, Lcom/mopub/nativeads/as;->c:Landroid/os/Handler;

    iget-object v2, p0, Lcom/mopub/nativeads/as;->d:Ljava/lang/Runnable;

    int-to-long v4, v0

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method


# virtual methods
.method public final loadPositions(Ljava/lang/String;Lcom/mopub/nativeads/PositioningSource$PositioningListener;)V
    .locals 2

    .prologue
    .line 106
    iget-object v0, p0, Lcom/mopub/nativeads/as;->j:Lcom/mopub/nativeads/PositioningRequest;

    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Lcom/mopub/nativeads/as;->j:Lcom/mopub/nativeads/PositioningRequest;

    invoke-virtual {v0}, Lcom/mopub/nativeads/PositioningRequest;->cancel()V

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/nativeads/as;->j:Lcom/mopub/nativeads/PositioningRequest;

    .line 112
    :cond_0
    iget v0, p0, Lcom/mopub/nativeads/as;->h:I

    if-lez v0, :cond_1

    .line 113
    iget-object v0, p0, Lcom/mopub/nativeads/as;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/nativeads/as;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 114
    const/4 v0, 0x0

    iput v0, p0, Lcom/mopub/nativeads/as;->h:I

    .line 117
    :cond_1
    iput-object p2, p0, Lcom/mopub/nativeads/as;->g:Lcom/mopub/nativeads/PositioningSource$PositioningListener;

    .line 118
    new-instance v0, Lcom/mopub/nativeads/ar;

    iget-object v1, p0, Lcom/mopub/nativeads/as;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/mopub/nativeads/ar;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/ar;->withAdUnitId(Ljava/lang/String;)Lcom/mopub/nativeads/ar;

    move-result-object v0

    const-string v1, "ads.mopub.com"

    invoke-virtual {v0, v1}, Lcom/mopub/nativeads/ar;->generateUrlString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/nativeads/as;->i:Ljava/lang/String;

    .line 121
    invoke-direct {p0}, Lcom/mopub/nativeads/as;->a()V

    .line 122
    return-void
.end method
