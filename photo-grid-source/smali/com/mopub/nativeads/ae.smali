.class final Lcom/mopub/nativeads/ae;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Z
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation
.end field

.field b:Z
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation
.end field

.field c:I
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation
.end field

.field d:I
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation
.end field

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/mopub/nativeads/ax",
            "<",
            "Lcom/mopub/nativeads/NativeResponse;",
            ">;>;"
        }
    .end annotation
.end field

.field private final f:Landroid/os/Handler;

.field private final g:Ljava/lang/Runnable;

.field private final h:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

.field private i:Lcom/mopub/nativeads/ah;

.field private j:Lcom/mopub/nativeads/RequestParameters;

.field private k:Lcom/mopub/nativeads/MoPubNative;


# direct methods
.method constructor <init>()V
    .locals 2

    .prologue
    .line 66
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/mopub/nativeads/ae;-><init>(Ljava/util/List;Landroid/os/Handler;)V

    .line 67
    return-void
.end method

.method private constructor <init>(Ljava/util/List;Landroid/os/Handler;)V
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/mopub/nativeads/ax",
            "<",
            "Lcom/mopub/nativeads/NativeResponse;",
            ">;>;",
            "Landroid/os/Handler;",
            ")V"
        }
    .end annotation

    .prologue
    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, Lcom/mopub/nativeads/ae;->e:Ljava/util/List;

    .line 73
    iput-object p2, p0, Lcom/mopub/nativeads/ae;->f:Landroid/os/Handler;

    .line 74
    new-instance v0, Lcom/mopub/nativeads/af;

    invoke-direct {v0, p0}, Lcom/mopub/nativeads/af;-><init>(Lcom/mopub/nativeads/ae;)V

    iput-object v0, p0, Lcom/mopub/nativeads/ae;->g:Ljava/lang/Runnable;

    .line 83
    new-instance v0, Lcom/mopub/nativeads/ag;

    invoke-direct {v0, p0}, Lcom/mopub/nativeads/ag;-><init>(Lcom/mopub/nativeads/ae;)V

    iput-object v0, p0, Lcom/mopub/nativeads/ae;->h:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

    .line 122
    const/4 v0, 0x0

    iput v0, p0, Lcom/mopub/nativeads/ae;->c:I

    .line 123
    const/16 v0, 0x3e8

    iput v0, p0, Lcom/mopub/nativeads/ae;->d:I

    .line 124
    return-void
.end method

.method static synthetic a(Lcom/mopub/nativeads/ae;)Lcom/mopub/nativeads/MoPubNative;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/mopub/nativeads/ae;->k:Lcom/mopub/nativeads/MoPubNative;

    return-object v0
.end method

.method static synthetic b(Lcom/mopub/nativeads/ae;)Ljava/util/List;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/mopub/nativeads/ae;->e:Ljava/util/List;

    return-object v0
.end method

.method static synthetic c(Lcom/mopub/nativeads/ae;)Lcom/mopub/nativeads/ah;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/mopub/nativeads/ae;->i:Lcom/mopub/nativeads/ah;

    return-object v0
.end method

.method static synthetic d(Lcom/mopub/nativeads/ae;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/mopub/nativeads/ae;->g:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic e(Lcom/mopub/nativeads/ae;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/mopub/nativeads/ae;->f:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method final a()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 156
    iget-object v0, p0, Lcom/mopub/nativeads/ae;->k:Lcom/mopub/nativeads/MoPubNative;

    if-eqz v0, :cond_0

    .line 157
    iget-object v0, p0, Lcom/mopub/nativeads/ae;->k:Lcom/mopub/nativeads/MoPubNative;

    invoke-virtual {v0}, Lcom/mopub/nativeads/MoPubNative;->destroy()V

    .line 158
    iput-object v1, p0, Lcom/mopub/nativeads/ae;->k:Lcom/mopub/nativeads/MoPubNative;

    .line 161
    :cond_0
    iput-object v1, p0, Lcom/mopub/nativeads/ae;->j:Lcom/mopub/nativeads/RequestParameters;

    .line 163
    iget-object v0, p0, Lcom/mopub/nativeads/ae;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/nativeads/ax;

    .line 164
    iget-object v0, v0, Lcom/mopub/nativeads/ax;->a:Ljava/lang/Object;

    check-cast v0, Lcom/mopub/nativeads/NativeResponse;

    invoke-virtual {v0}, Lcom/mopub/nativeads/NativeResponse;->destroy()V

    goto :goto_0

    .line 166
    :cond_1
    iget-object v0, p0, Lcom/mopub/nativeads/ae;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 168
    iget-object v0, p0, Lcom/mopub/nativeads/ae;->f:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 169
    iput-boolean v2, p0, Lcom/mopub/nativeads/ae;->a:Z

    .line 170
    iput v2, p0, Lcom/mopub/nativeads/ae;->c:I

    .line 1215
    const/16 v0, 0x3e8

    iput v0, p0, Lcom/mopub/nativeads/ae;->d:I

    .line 172
    return-void
.end method

.method final a(Landroid/content/Context;Ljava/lang/String;Lcom/mopub/nativeads/RequestParameters;)V
    .locals 2

    .prologue
    .line 137
    new-instance v0, Lcom/mopub/nativeads/MoPubNative;

    iget-object v1, p0, Lcom/mopub/nativeads/ae;->h:Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

    invoke-direct {v0, p1, p2, v1}, Lcom/mopub/nativeads/MoPubNative;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;)V

    .line 1143
    invoke-virtual {p0}, Lcom/mopub/nativeads/ae;->a()V

    .line 1145
    iput-object p3, p0, Lcom/mopub/nativeads/ae;->j:Lcom/mopub/nativeads/RequestParameters;

    .line 1146
    iput-object v0, p0, Lcom/mopub/nativeads/ae;->k:Lcom/mopub/nativeads/MoPubNative;

    .line 1148
    invoke-virtual {p0}, Lcom/mopub/nativeads/ae;->c()V

    .line 138
    return-void
.end method

.method final a(Lcom/mopub/nativeads/ah;)V
    .locals 0

    .prologue
    .line 131
    iput-object p1, p0, Lcom/mopub/nativeads/ae;->i:Lcom/mopub/nativeads/ah;

    .line 132
    return-void
.end method

.method final b()Lcom/mopub/nativeads/NativeResponse;
    .locals 8

    .prologue
    .line 186
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    .line 189
    iget-boolean v0, p0, Lcom/mopub/nativeads/ae;->a:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/mopub/nativeads/ae;->b:Z

    if-nez v0, :cond_0

    .line 190
    iget-object v0, p0, Lcom/mopub/nativeads/ae;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/nativeads/ae;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 194
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/ae;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 195
    iget-object v0, p0, Lcom/mopub/nativeads/ae;->e:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/nativeads/ax;

    .line 197
    iget-wide v4, v0, Lcom/mopub/nativeads/ax;->b:J

    sub-long v4, v2, v4

    const-wide/32 v6, 0xdbba0

    cmp-long v1, v4, v6

    if-gez v1, :cond_0

    .line 198
    iget-object v0, v0, Lcom/mopub/nativeads/ax;->a:Ljava/lang/Object;

    check-cast v0, Lcom/mopub/nativeads/NativeResponse;

    .line 201
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final c()V
    .locals 3
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .prologue
    .line 225
    iget-boolean v0, p0, Lcom/mopub/nativeads/ae;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mopub/nativeads/ae;->k:Lcom/mopub/nativeads/MoPubNative;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/nativeads/ae;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    .line 226
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mopub/nativeads/ae;->a:Z

    .line 227
    iget-object v0, p0, Lcom/mopub/nativeads/ae;->k:Lcom/mopub/nativeads/MoPubNative;

    iget-object v1, p0, Lcom/mopub/nativeads/ae;->j:Lcom/mopub/nativeads/RequestParameters;

    iget v2, p0, Lcom/mopub/nativeads/ae;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/mopub/nativeads/MoPubNative;->makeRequest(Lcom/mopub/nativeads/RequestParameters;Ljava/lang/Integer;)V

    .line 229
    :cond_0
    return-void
.end method
