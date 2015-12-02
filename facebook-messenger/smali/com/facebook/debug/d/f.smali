.class final Lcom/facebook/debug/d/f;
.super Lcom/facebook/common/o/c;
.source "Tracer.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/common/o/c",
        "<",
        "Lcom/facebook/debug/d/e;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lcom/facebook/common/o/c;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public synthetic a()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 25
    invoke-virtual {p0}, Lcom/facebook/debug/d/f;->b()Lcom/facebook/debug/d/e;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/debug/d/e;)V
    .locals 2

    .prologue
    .line 34
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/facebook/debug/d/e;->a(Lcom/facebook/debug/d/e;Lcom/facebook/debug/d/a;)Lcom/facebook/debug/d/a;

    .line 35
    const-wide/16 v0, -0x1

    invoke-static {p1, v0, v1}, Lcom/facebook/debug/d/e;->a(Lcom/facebook/debug/d/e;J)J

    .line 36
    return-void
.end method

.method public b()Lcom/facebook/debug/d/e;
    .locals 2

    .prologue
    .line 28
    new-instance v0, Lcom/facebook/debug/d/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/debug/d/e;-><init>(Lcom/facebook/debug/d/f;)V

    return-object v0
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 25
    check-cast p1, Lcom/facebook/debug/d/e;

    invoke-virtual {p0, p1}, Lcom/facebook/debug/d/f;->a(Lcom/facebook/debug/d/e;)V

    return-void
.end method
