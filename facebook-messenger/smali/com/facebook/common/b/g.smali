.class public Lcom/facebook/common/b/g;
.super Ljava/lang/Object;
.source "TopologicalSort.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final a:Lcom/facebook/common/b/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/b/h",
            "<TT;>;"
        }
    .end annotation
.end field

.field final b:Lcom/facebook/common/b/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/b/h",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/common/b/h;Lcom/facebook/common/b/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/b/h",
            "<TT;>;",
            "Lcom/facebook/common/b/h",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/facebook/common/b/g;->a:Lcom/facebook/common/b/h;

    .line 48
    iput-object p2, p0, Lcom/facebook/common/b/g;->b:Lcom/facebook/common/b/h;

    .line 49
    return-void
.end method
