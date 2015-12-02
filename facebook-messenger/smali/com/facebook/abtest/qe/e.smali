.class Lcom/facebook/abtest/qe/e;
.super Ljava/lang/Object;
.source "QuickExperimentManagerImpl.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Lcom/facebook/abtest/qe/data/QuickExperimentInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/abtest/qe/data/d;

.field final synthetic c:Lcom/facebook/abtest/qe/d;


# direct methods
.method constructor <init>(Lcom/facebook/abtest/qe/d;Ljava/lang/String;Lcom/facebook/abtest/qe/data/d;)V
    .locals 0

    .prologue
    .line 78
    iput-object p1, p0, Lcom/facebook/abtest/qe/e;->c:Lcom/facebook/abtest/qe/d;

    iput-object p2, p0, Lcom/facebook/abtest/qe/e;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/abtest/qe/e;->b:Lcom/facebook/abtest/qe/data/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/abtest/qe/data/QuickExperimentInfo;
    .locals 3

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/abtest/qe/e;->c:Lcom/facebook/abtest/qe/d;

    iget-object v1, p0, Lcom/facebook/abtest/qe/e;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/abtest/qe/e;->b:Lcom/facebook/abtest/qe/data/d;

    invoke-static {v0, v1, v2}, Lcom/facebook/abtest/qe/d;->a(Lcom/facebook/abtest/qe/d;Ljava/lang/String;Lcom/facebook/abtest/qe/data/d;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 78
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/e;->a()Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v0

    return-object v0
.end method
