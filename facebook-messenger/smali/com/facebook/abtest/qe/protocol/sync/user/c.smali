.class public Lcom/facebook/abtest/qe/protocol/sync/user/c;
.super Ljava/lang/Object;
.source "SyncQuickExperimentUserInfoResult.java"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Z

.field private d:Ljava/lang/String;

.field private e:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/abtest/qe/protocol/sync/user/c;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/abtest/qe/protocol/sync/user/c;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/abtest/qe/protocol/sync/user/c;)Z
    .locals 1

    .prologue
    .line 83
    iget-boolean v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/c;->c:Z

    return v0
.end method

.method static synthetic d(Lcom/facebook/abtest/qe/protocol/sync/user/c;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/c;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/abtest/qe/protocol/sync/user/c;)Lcom/google/common/a/ev;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/user/c;->e:Lcom/google/common/a/ev;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;
    .locals 2

    .prologue
    .line 116
    new-instance v0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;-><init>(Lcom/facebook/abtest/qe/protocol/sync/user/c;Lcom/facebook/abtest/qe/protocol/sync/user/b;)V

    return-object v0
.end method

.method public a(Lcom/google/common/a/ev;)Lcom/facebook/abtest/qe/protocol/sync/user/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/abtest/qe/protocol/sync/user/c;"
        }
    .end annotation

    .prologue
    .line 111
    iput-object p1, p0, Lcom/facebook/abtest/qe/protocol/sync/user/c;->e:Lcom/google/common/a/ev;

    .line 112
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/user/c;
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/facebook/abtest/qe/protocol/sync/user/c;->a:Ljava/lang/String;

    .line 92
    return-object p0
.end method

.method public a(Z)Lcom/facebook/abtest/qe/protocol/sync/user/c;
    .locals 0

    .prologue
    .line 101
    iput-boolean p1, p0, Lcom/facebook/abtest/qe/protocol/sync/user/c;->c:Z

    .line 102
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/user/c;
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Lcom/facebook/abtest/qe/protocol/sync/user/c;->b:Ljava/lang/String;

    .line 97
    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/user/c;
    .locals 0

    .prologue
    .line 106
    iput-object p1, p0, Lcom/facebook/abtest/qe/protocol/sync/user/c;->d:Ljava/lang/String;

    .line 107
    return-object p0
.end method
