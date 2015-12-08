.class final Lcom/b/a/c/ad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/b/a/c/aa;


# direct methods
.method constructor <init>(Lcom/b/a/c/aa;)V
    .locals 0

    .prologue
    .line 572
    iput-object p1, p0, Lcom/b/a/c/ad;->a:Lcom/b/a/c/aa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 572
    .line 1575
    iget-object v0, p0, Lcom/b/a/c/ad;->a:Lcom/b/a/c/aa;

    invoke-static {v0}, Lcom/b/a/c/aa;->a(Lcom/b/a/c/aa;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1576
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 1578
    iget-object v0, p0, Lcom/b/a/c/ad;->a:Lcom/b/a/c/aa;

    invoke-static {v0}, Lcom/b/a/c/aa;->c(Lcom/b/a/c/aa;)Lcom/b/a/c/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/b/a/c/h;->p()Lcom/b/a/c/a/a/d;

    move-result-object v0

    .line 1580
    if-eqz v0, :cond_0

    .line 1581
    iget-object v1, p0, Lcom/b/a/c/ad;->a:Lcom/b/a/c/aa;

    invoke-static {v1, v0}, Lcom/b/a/c/aa;->a(Lcom/b/a/c/aa;Lcom/b/a/c/a/a/d;)V

    .line 1583
    :cond_0
    iget-object v0, p0, Lcom/b/a/c/ad;->a:Lcom/b/a/c/aa;

    invoke-static {v0}, Lcom/b/a/c/aa;->d(Lcom/b/a/c/aa;)V

    .line 1584
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 1586
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0

    .line 1588
    :cond_1
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 1590
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0
.end method
