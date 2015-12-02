.class public Lcom/facebook/abtest/qe/service/c;
.super Ljava/lang/Object;
.source "QuickExperimentMemoryCacheServiceHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/f;


# instance fields
.field private final a:Lcom/facebook/abtest/qe/g/a;

.field private final b:Lcom/facebook/abtest/qe/b/a;


# direct methods
.method public constructor <init>(Lcom/facebook/abtest/qe/g/a;Lcom/facebook/abtest/qe/b/a;)V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/g/a;

    iput-object v0, p0, Lcom/facebook/abtest/qe/service/c;->a:Lcom/facebook/abtest/qe/g/a;

    .line 32
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/b/a;

    iput-object v0, p0, Lcom/facebook/abtest/qe/service/c;->b:Lcom/facebook/abtest/qe/b/a;

    .line 33
    return-void
.end method

.method private b(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 9

    .prologue
    .line 49
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v4

    .line 51
    invoke-virtual {v4}, Lcom/facebook/fbservice/service/OperationResult;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 53
    const-string v0, "result"

    invoke-virtual {v4, v0}, Lcom/facebook/fbservice/service/OperationResult;->b(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 54
    const-string v1, "sync_user"

    invoke-virtual {v4, v1}, Lcom/facebook/fbservice/service/OperationResult;->b(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    .line 55
    const-string v2, "sync_meta"

    invoke-virtual {v4, v2}, Lcom/facebook/fbservice/service/OperationResult;->b(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    .line 56
    iget-object v3, p0, Lcom/facebook/abtest/qe/service/c;->a:Lcom/facebook/abtest/qe/g/a;

    invoke-virtual {v3}, Lcom/facebook/abtest/qe/g/a;->a()Ljava/lang/String;

    move-result-object v5

    .line 57
    invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 59
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;

    .line 61
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    .line 63
    if-nez v3, :cond_1

    if-eqz v0, :cond_0

    .line 65
    :cond_1
    new-instance v7, Lcom/facebook/abtest/qe/data/c;

    invoke-direct {v7}, Lcom/facebook/abtest/qe/data/c;-><init>()V

    invoke-virtual {v3}, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/facebook/abtest/qe/data/c;->a(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v7

    invoke-virtual {v3}, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/facebook/abtest/qe/data/c;->b(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v7

    invoke-virtual {v3}, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->c()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/facebook/abtest/qe/data/c;->c(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v7

    invoke-virtual {v3}, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->d()Z

    move-result v8

    invoke-virtual {v7, v8}, Lcom/facebook/abtest/qe/data/c;->a(Z)Lcom/facebook/abtest/qe/data/c;

    move-result-object v7

    invoke-virtual {v7, v5}, Lcom/facebook/abtest/qe/data/c;->d(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v7

    invoke-virtual {v3}, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->e()Lcom/google/common/a/ev;

    move-result-object v3

    invoke-virtual {v7, v3}, Lcom/facebook/abtest/qe/data/c;->a(Ljava/util/Map;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/facebook/abtest/qe/data/c;->a(Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/data/c;->a()Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v0

    .line 74
    iget-object v3, p0, Lcom/facebook/abtest/qe/service/c;->b:Lcom/facebook/abtest/qe/b/a;

    sget-object v7, Lcom/facebook/abtest/qe/c/f;->FROM_SERVER:Lcom/facebook/abtest/qe/c/f;

    invoke-virtual {v3, v0, v7}, Lcom/facebook/abtest/qe/b/a;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Lcom/facebook/abtest/qe/c/f;)V

    goto :goto_0

    .line 78
    :cond_2
    iget-object v0, p0, Lcom/facebook/abtest/qe/service/c;->b:Lcom/facebook/abtest/qe/b/a;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/b/a;->c()V

    .line 81
    :cond_3
    return-object v4
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 38
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 39
    sget-object v1, Lcom/facebook/abtest/qe/service/a;->a:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    invoke-direct {p0, p1, p2}, Lcom/facebook/abtest/qe/service/c;->b(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 43
    :goto_0
    return-object v0

    :cond_0
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0
.end method
