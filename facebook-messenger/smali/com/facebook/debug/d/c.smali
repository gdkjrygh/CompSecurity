.class final Lcom/facebook/debug/d/c;
.super Lcom/facebook/common/o/c;
.source "TraceEvent.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/common/o/c",
        "<",
        "Lcom/facebook/debug/d/b;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lcom/facebook/common/o/c;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public synthetic a()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 29
    invoke-virtual {p0}, Lcom/facebook/debug/d/c;->b()Lcom/facebook/debug/d/b;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/debug/d/b;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 37
    invoke-static {p1, v0}, Lcom/facebook/debug/d/b;->a(Lcom/facebook/debug/d/b;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    invoke-static {p1, v0}, Lcom/facebook/debug/d/b;->b(Lcom/facebook/debug/d/b;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    return-void
.end method

.method public b()Lcom/facebook/debug/d/b;
    .locals 2

    .prologue
    .line 32
    new-instance v0, Lcom/facebook/debug/d/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/debug/d/b;-><init>(Lcom/facebook/debug/d/c;)V

    return-object v0
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 29
    check-cast p1, Lcom/facebook/debug/d/b;

    invoke-virtual {p0, p1}, Lcom/facebook/debug/d/c;->a(Lcom/facebook/debug/d/b;)V

    return-void
.end method
