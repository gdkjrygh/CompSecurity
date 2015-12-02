.class Lcom/facebook/orca/threadview/a/b;
.super Ljava/lang/Object;
.source "SendReceiptQuickExperiment.java"

# interfaces
.implements Lcom/facebook/abtest/qe/d/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/abtest/qe/d/c",
        "<",
        "Lcom/facebook/orca/threadview/a/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/a/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/a/a;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/facebook/orca/threadview/a/b;->a:Lcom/facebook/orca/threadview/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 52
    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadview/a/b;->b(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/threadview/a/c;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/threadview/a/c;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/facebook/orca/threadview/a/b;->a:Lcom/facebook/orca/threadview/a/a;

    invoke-static {v0, p1}, Lcom/facebook/orca/threadview/a/a;->a(Lcom/facebook/orca/threadview/a/a;Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/threadview/a/c;

    move-result-object v0

    return-object v0
.end method
