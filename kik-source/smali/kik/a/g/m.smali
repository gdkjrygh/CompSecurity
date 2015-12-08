.class final Lkik/a/g/m;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/g/b;


# direct methods
.method constructor <init>(Lkik/a/g/b;)V
    .locals 0

    .prologue
    .line 140
    iput-object p1, p0, Lkik/a/g/m;->a:Lkik/a/g/b;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 140
    check-cast p2, Ljava/util/List;

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->l()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lkik/a/d/n;->G()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lkik/a/g/m;->a:Lkik/a/g/b;

    invoke-virtual {v0}, Lkik/a/d/n;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkik/a/g/b;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v2, p0, Lkik/a/g/m;->a:Lkik/a/g/b;

    invoke-virtual {v2, v0}, Lkik/a/g/b;->b(Lkik/a/d/n;)V

    iget-object v2, p0, Lkik/a/g/m;->a:Lkik/a/g/b;

    invoke-static {v2}, Lkik/a/g/b;->b(Lkik/a/g/b;)Lkik/a/e/r;

    move-result-object v2

    invoke-interface {v2, v0, v4, v4}, Lkik/a/e/r;->a(Lkik/a/d/k;ZZ)Z

    iget-object v2, p0, Lkik/a/g/m;->a:Lkik/a/g/b;

    invoke-static {v2}, Lkik/a/g/b;->c(Lkik/a/g/b;)Lcom/kik/g/k;

    move-result-object v2

    invoke-virtual {v0}, Lkik/a/d/n;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lkik/a/g/m;->a:Lkik/a/g/b;

    invoke-static {v0}, Lkik/a/g/b;->a(Lkik/a/g/b;)Lkik/a/e/v;

    move-result-object v0

    invoke-interface {v0, p2}, Lkik/a/e/v;->c(Ljava/util/List;)Z

    :cond_2
    return-void
.end method
