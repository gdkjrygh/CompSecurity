.class Lcom/facebook/messages/a/a/c;
.super Ljava/lang/Object;
.source "ContactPickerServerSuppliedParams.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/abtest/qe/data/QuickExperimentInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/messages/a/a/a;


# direct methods
.method constructor <init>(Lcom/facebook/messages/a/a/a;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/facebook/messages/a/a/c;->a:Lcom/facebook/messages/a/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/messages/a/a/c;->a:Lcom/facebook/messages/a/a/a;

    invoke-virtual {v0, p1}, Lcom/facebook/messages/a/a/a;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V

    .line 64
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 60
    check-cast p1, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    invoke-virtual {p0, p1}, Lcom/facebook/messages/a/a/c;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 69
    return-void
.end method
