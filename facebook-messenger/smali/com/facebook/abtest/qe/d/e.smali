.class public Lcom/facebook/abtest/qe/d/e;
.super Ljava/lang/Object;
.source "QuickExperimentInfoAdapterFactory.java"


# instance fields
.field private final a:Lcom/facebook/abtest/qe/b/a;

.field private final b:Lcom/facebook/abtest/qe/e/a;


# direct methods
.method public constructor <init>(Lcom/facebook/abtest/qe/b/a;Lcom/facebook/abtest/qe/e/a;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/b/a;

    iput-object v0, p0, Lcom/facebook/abtest/qe/d/e;->a:Lcom/facebook/abtest/qe/b/a;

    .line 32
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/e/a;

    iput-object v0, p0, Lcom/facebook/abtest/qe/d/e;->b:Lcom/facebook/abtest/qe/e/a;

    .line 33
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/facebook/abtest/qe/d/c;)Lcom/facebook/abtest/qe/d/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<CONFIG:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lcom/facebook/abtest/qe/d/c",
            "<TCONFIG;>;)",
            "Lcom/facebook/abtest/qe/d/a",
            "<TCONFIG;>;"
        }
    .end annotation

    .prologue
    .line 43
    new-instance v0, Lcom/facebook/abtest/qe/d/a;

    iget-object v1, p0, Lcom/facebook/abtest/qe/d/e;->a:Lcom/facebook/abtest/qe/b/a;

    iget-object v2, p0, Lcom/facebook/abtest/qe/d/e;->b:Lcom/facebook/abtest/qe/e/a;

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/facebook/abtest/qe/d/a;-><init>(Lcom/facebook/abtest/qe/b/a;Lcom/facebook/abtest/qe/e/a;Ljava/lang/String;Lcom/facebook/abtest/qe/d/c;)V

    return-object v0
.end method
