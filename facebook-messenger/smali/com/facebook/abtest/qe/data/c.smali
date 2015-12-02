.class public Lcom/facebook/abtest/qe/data/c;
.super Ljava/lang/Object;
.source "QuickExperimentInfo.java"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Z

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 233
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/abtest/qe/data/c;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/abtest/qe/data/c;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/abtest/qe/data/c;)Z
    .locals 1

    .prologue
    .line 233
    iget-boolean v0, p0, Lcom/facebook/abtest/qe/data/c;->c:Z

    return v0
.end method

.method static synthetic d(Lcom/facebook/abtest/qe/data/c;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/c;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/abtest/qe/data/c;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/c;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic f(Lcom/facebook/abtest/qe/data/c;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/c;->f:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic g(Lcom/facebook/abtest/qe/data/c;)Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/facebook/abtest/qe/data/c;->g:Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
    .locals 2

    .prologue
    .line 279
    new-instance v0, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;-><init>(Lcom/facebook/abtest/qe/data/c;Lcom/facebook/abtest/qe/data/b;)V

    return-object v0
.end method

.method public a(Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;)Lcom/facebook/abtest/qe/data/c;
    .locals 0

    .prologue
    .line 274
    iput-object p1, p0, Lcom/facebook/abtest/qe/data/c;->g:Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    .line 275
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;
    .locals 0

    .prologue
    .line 244
    iput-object p1, p0, Lcom/facebook/abtest/qe/data/c;->a:Ljava/lang/String;

    .line 245
    return-object p0
.end method

.method public a(Ljava/util/Map;)Lcom/facebook/abtest/qe/data/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/abtest/qe/data/c;"
        }
    .end annotation

    .prologue
    .line 269
    iput-object p1, p0, Lcom/facebook/abtest/qe/data/c;->f:Ljava/util/Map;

    .line 270
    return-object p0
.end method

.method public a(Z)Lcom/facebook/abtest/qe/data/c;
    .locals 0

    .prologue
    .line 254
    iput-boolean p1, p0, Lcom/facebook/abtest/qe/data/c;->c:Z

    .line 255
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;
    .locals 0

    .prologue
    .line 249
    iput-object p1, p0, Lcom/facebook/abtest/qe/data/c;->b:Ljava/lang/String;

    .line 250
    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;
    .locals 0

    .prologue
    .line 259
    iput-object p1, p0, Lcom/facebook/abtest/qe/data/c;->d:Ljava/lang/String;

    .line 260
    return-object p0
.end method

.method public d(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/c;
    .locals 0

    .prologue
    .line 264
    iput-object p1, p0, Lcom/facebook/abtest/qe/data/c;->e:Ljava/lang/String;

    .line 265
    return-object p0
.end method
