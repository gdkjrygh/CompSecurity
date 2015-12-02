.class public Lcom/facebook/abtest/qe/service/b;
.super Ljava/lang/Object;
.source "QuickExperimentDbServiceHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/f;


# instance fields
.field private final a:Lcom/facebook/abtest/qe/g/a;

.field private final b:Lcom/facebook/abtest/qe/c/e;


# direct methods
.method public constructor <init>(Lcom/facebook/abtest/qe/g/a;Lcom/facebook/abtest/qe/c/e;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/facebook/abtest/qe/service/b;->a:Lcom/facebook/abtest/qe/g/a;

    .line 28
    iput-object p2, p0, Lcom/facebook/abtest/qe/service/b;->b:Lcom/facebook/abtest/qe/c/e;

    .line 29
    return-void
.end method

.method private b(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 8

    .prologue
    .line 47
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v4

    .line 50
    invoke-virtual {v4}, Lcom/facebook/fbservice/service/OperationResult;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 52
    const-string v0, "result"

    invoke-virtual {v4, v0}, Lcom/facebook/fbservice/service/OperationResult;->b(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    .line 53
    const-string v1, "sync_user"

    invoke-virtual {v4, v1}, Lcom/facebook/fbservice/service/OperationResult;->b(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    .line 54
    const-string v2, "sync_meta"

    invoke-virtual {v4, v2}, Lcom/facebook/fbservice/service/OperationResult;->b(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    .line 56
    iget-object v3, p0, Lcom/facebook/abtest/qe/service/b;->a:Lcom/facebook/abtest/qe/g/a;

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

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 58
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;

    .line 60
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    .line 63
    invoke-virtual {p0, v3, v0, v5}, Lcom/facebook/abtest/qe/service/b;->a(Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;Ljava/lang/String;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v0

    .line 67
    if-eqz v0, :cond_0

    .line 68
    iget-object v3, p0, Lcom/facebook/abtest/qe/service/b;->b:Lcom/facebook/abtest/qe/c/e;

    sget-object v7, Lcom/facebook/abtest/qe/c/f;->FROM_SERVER:Lcom/facebook/abtest/qe/c/f;

    invoke-virtual {v3, v0, v7}, Lcom/facebook/abtest/qe/c/e;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;Lcom/facebook/abtest/qe/c/f;)V

    goto :goto_0

    .line 76
    :cond_1
    return-object v4
.end method


# virtual methods
.method a(Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;Ljava/lang/String;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
    .locals 2
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 93
    if-nez p1, :cond_0

    .line 94
    const/4 v0, 0x0

    .line 97
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/facebook/abtest/qe/data/c;

    invoke-direct {v0}, Lcom/facebook/abtest/qe/data/c;-><init>()V

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/abtest/qe/data/c;->a(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/abtest/qe/data/c;->b(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/abtest/qe/data/c;->c(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/abtest/qe/data/c;->a(Z)Lcom/facebook/abtest/qe/data/c;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/facebook/abtest/qe/data/c;->d(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;->e()Lcom/google/common/a/ev;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/abtest/qe/data/c;->a(Ljava/util/Map;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/abtest/qe/data/c;->a(Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;)Lcom/facebook/abtest/qe/data/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/data/c;->a()Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 35
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 36
    sget-object v1, Lcom/facebook/abtest/qe/service/a;->a:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 37
    invoke-direct {p0, p1, p2}, Lcom/facebook/abtest/qe/service/b;->b(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0

    .line 39
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown operation type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
