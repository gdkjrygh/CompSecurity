.class final Lkik/a/g/z;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/g/v;


# direct methods
.method constructor <init>(Lkik/a/g/v;)V
    .locals 0

    .prologue
    .line 1158
    iput-object p1, p0, Lkik/a/g/z;->a:Lkik/a/g/v;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 6

    .prologue
    .line 1158
    check-cast p1, Lkik/a/f/f/aj;

    invoke-virtual {p1}, Lkik/a/f/f/aj;->d()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, Lkik/a/g/z;->a:Lkik/a/g/v;

    const/4 v4, 0x0

    new-instance v5, Lkik/a/g/aa;

    invoke-direct {v5, p0}, Lkik/a/g/aa;-><init>(Lkik/a/g/z;)V

    invoke-virtual {v3, v0, v4, v5}, Lkik/a/g/v;->a(Ljava/lang/String;ZLkik/a/e/r$a;)Lkik/a/d/k;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lkik/a/g/z;->a:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->j(Lkik/a/g/v;)Lcom/kik/g/k;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 1185
    iget-object v0, p0, Lkik/a/g/z;->a:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->f(Lkik/a/g/v;)Lcom/kik/g/k;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1186
    return-void
.end method
