.class public Lcom/facebook/ui/a/e;
.super Lcom/google/common/d/a/a;
.source "AnimatorEndFuture.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/d/a/a",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/a/a/a;)V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/google/common/d/a/a;-><init>()V

    .line 15
    new-instance v0, Lcom/facebook/ui/a/f;

    invoke-direct {v0, p0}, Lcom/facebook/ui/a/f;-><init>(Lcom/facebook/ui/a/e;)V

    invoke-virtual {p1, v0}, Lcom/a/a/a;->a(Lcom/a/a/b;)V

    .line 26
    return-void
.end method

.method static synthetic a(Lcom/facebook/ui/a/e;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 12
    invoke-virtual {p0, p1}, Lcom/facebook/ui/a/e;->a_(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
