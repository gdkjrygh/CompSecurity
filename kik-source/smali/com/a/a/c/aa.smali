.class final Lcom/a/a/c/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic a:Lcom/a/a/c/x;


# direct methods
.method constructor <init>(Lcom/a/a/c/x;)V
    .locals 0

    .prologue
    .line 517
    iput-object p1, p0, Lcom/a/a/c/aa;->a:Lcom/a/a/c/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 517
    iget-object v0, p0, Lcom/a/a/c/aa;->a:Lcom/a/a/c/x;

    invoke-static {v0}, Lcom/a/a/c/x;->a(Lcom/a/a/c/x;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/a/a/c/aa;->a:Lcom/a/a/c/x;

    invoke-static {v0}, Lcom/a/a/c/x;->d(Lcom/a/a/c/x;)Lcom/a/a/c/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/c/g;->p()Lcom/a/a/c/a/a/d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/a/a/c/aa;->a:Lcom/a/a/c/x;

    invoke-static {v1, v0}, Lcom/a/a/c/x;->a(Lcom/a/a/c/x;Lcom/a/a/c/a/a/d;)V

    :cond_0
    iget-object v0, p0, Lcom/a/a/c/aa;->a:Lcom/a/a/c/x;

    invoke-static {v0}, Lcom/a/a/c/x;->e(Lcom/a/a/c/x;)V

    iget-object v0, p0, Lcom/a/a/c/aa;->a:Lcom/a/a/c/x;

    invoke-static {v0}, Lcom/a/a/c/x;->c(Lcom/a/a/c/x;)V

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0
.end method
