.class public Lcom/facebook/orca/threadview/a/a;
.super Ljava/lang/Object;
.source "SendReceiptQuickExperiment.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Lcom/facebook/abtest/qe/d/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/abtest/qe/d/a",
            "<",
            "Lcom/facebook/orca/threadview/a/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/facebook/orca/threadview/a/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/threadview/a/a;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/abtest/qe/d/e;)V
    .locals 3

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/d/e;

    const-string v1, "orca_send_receipts"

    new-instance v2, Lcom/facebook/orca/threadview/a/b;

    invoke-direct {v2, p0}, Lcom/facebook/orca/threadview/a/b;-><init>(Lcom/facebook/orca/threadview/a/a;)V

    invoke-virtual {v0, v1, v2}, Lcom/facebook/abtest/qe/d/e;->a(Ljava/lang/String;Lcom/facebook/abtest/qe/d/c;)Lcom/facebook/abtest/qe/d/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/a/a;->b:Lcom/facebook/abtest/qe/d/a;

    .line 60
    return-void
.end method

.method private a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/threadview/a/c;
    .locals 4

    .prologue
    .line 68
    const-string v0, "show_pending_receipt"

    invoke-virtual {p1, v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v1

    .line 69
    const-string v0, "show_send_receipt"

    invoke-virtual {p1, v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    .line 70
    const-string v0, "show_failed_receipt"

    invoke-virtual {p1, v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    .line 73
    invoke-virtual {v1}, Lcom/google/common/base/Optional;->orNull()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v2

    .line 74
    invoke-virtual {v1}, Lcom/google/common/base/Optional;->orNull()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v3

    .line 75
    invoke-virtual {v1}, Lcom/google/common/base/Optional;->orNull()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    .line 76
    new-instance v1, Lcom/facebook/orca/threadview/a/c;

    invoke-direct {v1, p0, v2, v3, v0}, Lcom/facebook/orca/threadview/a/c;-><init>(Lcom/facebook/orca/threadview/a/a;ZZZ)V

    return-object v1
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/a/a;Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/threadview/a/c;
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/a/a;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/threadview/a/c;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threadview/a/c;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/orca/threadview/a/a;->b:Lcom/facebook/abtest/qe/d/a;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/d/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/a/c;

    return-object v0
.end method
