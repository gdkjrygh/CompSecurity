.class public Lcom/facebook/abtest/qe/protocol/sync/c;
.super Ljava/lang/Object;
.source "SyncQuickExperimentParams.java"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/abtest/qe/protocol/sync/c;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/abtest/qe/protocol/sync/c;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/abtest/qe/protocol/sync/c;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/abtest/qe/protocol/sync/c;->c:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;
    .locals 2

    .prologue
    .line 96
    new-instance v0, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;-><init>(Lcom/facebook/abtest/qe/protocol/sync/c;Lcom/facebook/abtest/qe/protocol/sync/b;)V

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/c;
    .locals 0

    .prologue
    .line 81
    iput-object p1, p0, Lcom/facebook/abtest/qe/protocol/sync/c;->a:Ljava/lang/String;

    .line 82
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/c;
    .locals 0

    .prologue
    .line 86
    iput-object p1, p0, Lcom/facebook/abtest/qe/protocol/sync/c;->b:Ljava/lang/String;

    .line 87
    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/c;
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/facebook/abtest/qe/protocol/sync/c;->c:Ljava/lang/String;

    .line 92
    return-object p0
.end method
