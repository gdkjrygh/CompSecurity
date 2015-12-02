.class Lcom/facebook/orca/threadlist/d;
.super Ljava/lang/Object;
.source "ContextMenuEntryPointExperiment.java"

# interfaces
.implements Lcom/facebook/abtest/qe/d/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/abtest/qe/d/c",
        "<",
        "Lcom/facebook/orca/threadlist/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/c;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/c;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/facebook/orca/threadlist/d;->a:Lcom/facebook/orca/threadlist/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 47
    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadlist/d;->b(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/threadlist/e;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/threadlist/e;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/orca/threadlist/d;->a:Lcom/facebook/orca/threadlist/c;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadlist/c;->a(Lcom/facebook/orca/threadlist/c;Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/threadlist/e;

    move-result-object v0

    return-object v0
.end method
