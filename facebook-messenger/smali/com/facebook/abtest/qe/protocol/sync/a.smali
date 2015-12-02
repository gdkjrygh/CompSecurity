.class public Lcom/facebook/abtest/qe/protocol/sync/a;
.super Ljava/lang/Object;
.source "QuickExperimentApiMethodsHelper.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 14
    const-string v0, "/testexpt:qe:%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->a()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 18
    const-string v0, "/testexpt:qe:%s/members/%s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->a()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {p0}, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;->b()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
