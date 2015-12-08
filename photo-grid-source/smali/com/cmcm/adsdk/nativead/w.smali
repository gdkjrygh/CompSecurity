.class public abstract Lcom/cmcm/adsdk/nativead/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cmcm/a/a/c;


# instance fields
.field protected mAdTypeName:Ljava/lang/String;

.field protected mContext:Landroid/content/Context;

.field protected mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

.field public mPositionId:Ljava/lang/String;

.field protected requestParams:Lcom/cmcm/adsdk/e;


# direct methods
.method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/w;->mPositionId:Ljava/lang/String;

    .line 21
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/w;->mContext:Landroid/content/Context;

    .line 22
    iput-object p2, p0, Lcom/cmcm/adsdk/nativead/w;->mPositionId:Ljava/lang/String;

    .line 23
    iput-object p3, p0, Lcom/cmcm/adsdk/nativead/w;->mAdTypeName:Ljava/lang/String;

    .line 24
    return-void
.end method


# virtual methods
.method protected abstract getAdList(I)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Lcom/cmcm/a/a/a;",
            ">;"
        }
    .end annotation
.end method

.method public getAdName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/w;->mAdTypeName:Ljava/lang/String;

    return-object v0
.end method

.method protected abstract removeAdFromPool(Lcom/cmcm/a/a/a;)V
.end method

.method protected declared-synchronized removeExpiredAds(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/cmcm/a/a/a;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 46
    monitor-enter p0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 57
    :cond_0
    monitor-exit p0

    return-void

    .line 49
    :cond_1
    :try_start_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 51
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/a;

    .line 53
    invoke-interface {v0}, Lcom/cmcm/a/a/a;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 54
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public setAdListener(Lcom/cmcm/a/a/d;)V
    .locals 0

    .prologue
    .line 43
    return-void
.end method

.method public setLoadCallBack(Lcom/cmcm/adsdk/nativead/h;)V
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/w;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    .line 39
    return-void
.end method

.method public setRequestParams(Lcom/cmcm/adsdk/e;)V
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/w;->requestParams:Lcom/cmcm/adsdk/e;

    .line 30
    return-void
.end method
