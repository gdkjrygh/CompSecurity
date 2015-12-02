.class public Lcom/facebook/orca/app/fc;
.super Ljava/lang/Object;
.source "MessengerBugReporterConfig.java"

# interfaces
.implements Lcom/facebook/bugreporter/l;


# instance fields
.field private final a:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;

    const-string v1, "Messenger"

    const-wide v2, 0x66f1319cdbf3L

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;-><init>(Ljava/lang/String;J)V

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/app/fc;->a:Lcom/google/common/a/es;

    .line 33
    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/app/fc;->a:Lcom/google/common/a/es;

    return-object v0
.end method

.method public b()Lcom/google/common/a/fi;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .prologue
    .line 42
    const-wide v0, 0xb3883dfd82bcL

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-wide v1, 0x10cc0d7ff4499L

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method
