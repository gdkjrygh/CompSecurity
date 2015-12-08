.class final Lkik/a/g/f;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lkik/a/g/b;


# direct methods
.method constructor <init>(Lkik/a/g/b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 560
    iput-object p1, p0, Lkik/a/g/f;->c:Lkik/a/g/b;

    iput-object p2, p0, Lkik/a/g/f;->a:Ljava/lang/String;

    iput-object p3, p0, Lkik/a/g/f;->b:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 560
    check-cast p1, Lkik/a/f/f/p;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/a/g/f;->c:Lkik/a/g/b;

    iget-object v1, p0, Lkik/a/g/f;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lkik/a/g/b;->a(Ljava/lang/String;Z)Lkik/a/d/n;

    move-result-object v0

    iget-object v1, p0, Lkik/a/g/f;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkik/a/d/n;->i(Ljava/lang/String;)V

    iget-object v1, p0, Lkik/a/g/f;->c:Lkik/a/g/b;

    invoke-virtual {v1, v0}, Lkik/a/g/b;->b(Lkik/a/d/n;)V

    iget-object v1, p0, Lkik/a/g/f;->c:Lkik/a/g/b;

    invoke-static {v1}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2, v3}, Lkik/a/e/r;->a(Lkik/a/d/k;ZZ)Z

    iget-object v0, p0, Lkik/a/g/f;->c:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v0

    invoke-interface {v0}, Lkik/a/e/r;->j()V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 575
    iget-object v0, p0, Lkik/a/g/f;->c:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->d(Lkik/a/g/b;)Lcom/kik/g/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 576
    return-void
.end method
