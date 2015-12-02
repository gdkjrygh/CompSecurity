.class public Lcom/facebook/abtest/qe/protocol/sync/full/c;
.super Ljava/lang/Object;
.source "SyncQuickExperimentMetaInfoResult.java"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/String;

.field private e:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/abtest/qe/protocol/sync/full/c;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/full/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/abtest/qe/protocol/sync/full/c;)Ljava/util/List;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/full/c;->b:Ljava/util/List;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/abtest/qe/protocol/sync/full/c;)Lcom/google/common/a/ev;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/full/c;->c:Lcom/google/common/a/ev;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/abtest/qe/protocol/sync/full/c;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/full/c;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/abtest/qe/protocol/sync/full/c;)J
    .locals 2

    .prologue
    .line 88
    iget-wide v0, p0, Lcom/facebook/abtest/qe/protocol/sync/full/c;->e:J

    return-wide v0
.end method


# virtual methods
.method public a()Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;
    .locals 2

    .prologue
    .line 121
    new-instance v0, Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;-><init>(Lcom/facebook/abtest/qe/protocol/sync/full/c;Lcom/facebook/abtest/qe/protocol/sync/full/b;)V

    return-object v0
.end method

.method public a(J)Lcom/facebook/abtest/qe/protocol/sync/full/c;
    .locals 0

    .prologue
    .line 116
    iput-wide p1, p0, Lcom/facebook/abtest/qe/protocol/sync/full/c;->e:J

    .line 117
    return-object p0
.end method

.method public a(Lcom/google/common/a/ev;)Lcom/facebook/abtest/qe/protocol/sync/full/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/facebook/abtest/qe/protocol/sync/full/c;"
        }
    .end annotation

    .prologue
    .line 106
    iput-object p1, p0, Lcom/facebook/abtest/qe/protocol/sync/full/c;->c:Lcom/google/common/a/ev;

    .line 107
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/full/c;
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Lcom/facebook/abtest/qe/protocol/sync/full/c;->a:Ljava/lang/String;

    .line 97
    return-object p0
.end method

.method public a(Ljava/util/List;)Lcom/facebook/abtest/qe/protocol/sync/full/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/abtest/qe/protocol/sync/full/c;"
        }
    .end annotation

    .prologue
    .line 101
    iput-object p1, p0, Lcom/facebook/abtest/qe/protocol/sync/full/c;->b:Ljava/util/List;

    .line 102
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/full/c;
    .locals 0

    .prologue
    .line 111
    iput-object p1, p0, Lcom/facebook/abtest/qe/protocol/sync/full/c;->d:Ljava/lang/String;

    .line 112
    return-object p0
.end method
