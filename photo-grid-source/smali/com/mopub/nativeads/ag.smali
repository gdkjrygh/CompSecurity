.class final Lcom/mopub/nativeads/ag;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;


# instance fields
.field final synthetic a:Lcom/mopub/nativeads/ae;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/ae;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/mopub/nativeads/ag;->a:Lcom/mopub/nativeads/ae;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onNativeFail(Lcom/mopub/nativeads/NativeErrorCode;)V
    .locals 7

    .prologue
    const v6, 0x493e0

    .line 107
    iget-object v0, p0, Lcom/mopub/nativeads/ag;->a:Lcom/mopub/nativeads/ae;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/mopub/nativeads/ae;->a:Z

    .line 111
    iget-object v0, p0, Lcom/mopub/nativeads/ag;->a:Lcom/mopub/nativeads/ae;

    iget v0, v0, Lcom/mopub/nativeads/ae;->d:I

    if-lt v0, v6, :cond_0

    .line 112
    iget-object v0, p0, Lcom/mopub/nativeads/ag;->a:Lcom/mopub/nativeads/ae;

    .line 2215
    const/16 v1, 0x3e8

    iput v1, v0, Lcom/mopub/nativeads/ae;->d:I

    .line 119
    :goto_0
    return-void

    .line 116
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/ag;->a:Lcom/mopub/nativeads/ae;

    .line 3207
    iget v1, v0, Lcom/mopub/nativeads/ae;->d:I

    int-to-double v2, v1

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    mul-double/2addr v2, v4

    double-to-int v1, v2

    iput v1, v0, Lcom/mopub/nativeads/ae;->d:I

    .line 3208
    iget v1, v0, Lcom/mopub/nativeads/ae;->d:I

    if-le v1, v6, :cond_1

    .line 3209
    iput v6, v0, Lcom/mopub/nativeads/ae;->d:I

    .line 117
    :cond_1
    iget-object v0, p0, Lcom/mopub/nativeads/ag;->a:Lcom/mopub/nativeads/ae;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/mopub/nativeads/ae;->b:Z

    .line 118
    iget-object v0, p0, Lcom/mopub/nativeads/ag;->a:Lcom/mopub/nativeads/ae;

    invoke-static {v0}, Lcom/mopub/nativeads/ae;->e(Lcom/mopub/nativeads/ae;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/nativeads/ag;->a:Lcom/mopub/nativeads/ae;

    invoke-static {v1}, Lcom/mopub/nativeads/ae;->d(Lcom/mopub/nativeads/ae;)Ljava/lang/Runnable;

    move-result-object v1

    iget-object v2, p0, Lcom/mopub/nativeads/ag;->a:Lcom/mopub/nativeads/ae;

    iget v2, v2, Lcom/mopub/nativeads/ae;->d:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method public final onNativeLoad(Lcom/mopub/nativeads/NativeResponse;)V
    .locals 2

    .prologue
    .line 88
    iget-object v0, p0, Lcom/mopub/nativeads/ag;->a:Lcom/mopub/nativeads/ae;

    invoke-static {v0}, Lcom/mopub/nativeads/ae;->a(Lcom/mopub/nativeads/ae;)Lcom/mopub/nativeads/MoPubNative;

    move-result-object v0

    if-nez v0, :cond_0

    .line 102
    :goto_0
    return-void

    .line 92
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/ag;->a:Lcom/mopub/nativeads/ae;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/mopub/nativeads/ae;->a:Z

    .line 93
    iget-object v0, p0, Lcom/mopub/nativeads/ag;->a:Lcom/mopub/nativeads/ae;

    iget v1, v0, Lcom/mopub/nativeads/ae;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/mopub/nativeads/ae;->c:I

    .line 94
    iget-object v0, p0, Lcom/mopub/nativeads/ag;->a:Lcom/mopub/nativeads/ae;

    .line 1215
    const/16 v1, 0x3e8

    iput v1, v0, Lcom/mopub/nativeads/ae;->d:I

    .line 96
    iget-object v0, p0, Lcom/mopub/nativeads/ag;->a:Lcom/mopub/nativeads/ae;

    invoke-static {v0}, Lcom/mopub/nativeads/ae;->b(Lcom/mopub/nativeads/ae;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/mopub/nativeads/ax;

    invoke-direct {v1, p1}, Lcom/mopub/nativeads/ax;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    iget-object v0, p0, Lcom/mopub/nativeads/ag;->a:Lcom/mopub/nativeads/ae;

    invoke-static {v0}, Lcom/mopub/nativeads/ae;->b(Lcom/mopub/nativeads/ae;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/mopub/nativeads/ag;->a:Lcom/mopub/nativeads/ae;

    invoke-static {v0}, Lcom/mopub/nativeads/ae;->c(Lcom/mopub/nativeads/ae;)Lcom/mopub/nativeads/ah;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 98
    iget-object v0, p0, Lcom/mopub/nativeads/ag;->a:Lcom/mopub/nativeads/ae;

    invoke-static {v0}, Lcom/mopub/nativeads/ae;->c(Lcom/mopub/nativeads/ae;)Lcom/mopub/nativeads/ah;

    move-result-object v0

    invoke-interface {v0}, Lcom/mopub/nativeads/ah;->onAdsAvailable()V

    .line 101
    :cond_1
    iget-object v0, p0, Lcom/mopub/nativeads/ag;->a:Lcom/mopub/nativeads/ae;

    invoke-virtual {v0}, Lcom/mopub/nativeads/ae;->c()V

    goto :goto_0
.end method
