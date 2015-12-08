.class final Lkik/a/g/s;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/g/b;


# direct methods
.method constructor <init>(Lkik/a/g/b;)V
    .locals 0

    .prologue
    .line 406
    iput-object p1, p0, Lkik/a/g/s;->a:Lkik/a/g/b;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 406
    check-cast p1, Lkik/a/f/f/k;

    iget-object v0, p0, Lkik/a/g/s;->a:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v0

    invoke-virtual {p1}, Lkik/a/f/f/k;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Lkik/a/d/n;

    if-eqz v1, :cond_0

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0, v2}, Lkik/a/d/n;->j(Z)V

    iget-object v1, p0, Lkik/a/g/s;->a:Lkik/a/g/b;

    invoke-static {v1}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v1

    invoke-interface {v1, v0}, Lkik/a/e/r;->a(Lkik/a/d/k;)V

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 421
    iget-object v0, p0, Lkik/a/g/s;->a:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->d(Lkik/a/g/b;)Lcom/kik/g/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 422
    return-void
.end method
