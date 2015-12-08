.class final Lkik/a/b/a/e;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/b/a/a;


# direct methods
.method constructor <init>(Lkik/a/b/a/a;)V
    .locals 0

    .prologue
    .line 2165
    iput-object p1, p0, Lkik/a/b/a/e;->a:Lkik/a/b/a/a;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 9

    .prologue
    .line 2165
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/b/a/e;->a:Lkik/a/b/a/a;

    new-instance v1, Lkik/a/b/a/a$d;

    iget-object v2, p0, Lkik/a/b/a/e;->a:Lkik/a/b/a/a;

    invoke-static {v2}, Lkik/a/b/a/a;->f(Lkik/a/b/a/a;)Lkik/a/e/f;

    move-result-object v2

    invoke-interface {v2}, Lkik/a/e/f;->j()J

    move-result-wide v2

    iget-object v4, p0, Lkik/a/b/a/e;->a:Lkik/a/b/a/a;

    invoke-static {v4}, Lkik/a/b/a/a;->f(Lkik/a/b/a/a;)Lkik/a/e/f;

    move-result-object v4

    invoke-interface {v4}, Lkik/a/e/f;->g()J

    move-result-wide v4

    sub-long/2addr v2, v4

    iget-object v4, p0, Lkik/a/b/a/e;->a:Lkik/a/b/a/a;

    invoke-static {v4}, Lkik/a/b/a/a;->f(Lkik/a/b/a/a;)Lkik/a/e/f;

    move-result-object v4

    invoke-interface {v4}, Lkik/a/e/f;->j()J

    move-result-wide v4

    iget-object v6, p0, Lkik/a/b/a/e;->a:Lkik/a/b/a/a;

    invoke-static {v6}, Lkik/a/b/a/a;->f(Lkik/a/b/a/a;)Lkik/a/e/f;

    move-result-object v6

    invoke-interface {v6}, Lkik/a/e/f;->i()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lkik/a/b/a/e;->a:Lkik/a/b/a/a;

    invoke-static {v7}, Lkik/a/b/a/a;->f(Lkik/a/b/a/a;)Lkik/a/e/f;

    move-result-object v7

    invoke-interface {v7}, Lkik/a/e/f;->h()J

    move-result-wide v7

    invoke-direct/range {v1 .. v8}, Lkik/a/b/a/a$d;-><init>(JJLjava/lang/String;J)V

    invoke-static {v0, v1}, Lkik/a/b/a/a;->a(Lkik/a/b/a/a;Lkik/a/b/a/a$d;)Lkik/a/b/a/a$d;

    iget-object v0, p0, Lkik/a/b/a/e;->a:Lkik/a/b/a/a;

    invoke-static {v0}, Lkik/a/b/a/a;->a(Lkik/a/b/a/a;)Lkik/a/e/v;

    move-result-object v0

    invoke-interface {v0}, Lkik/a/e/v;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/a/b/a/e;->a:Lkik/a/b/a/a;

    invoke-static {v0}, Lkik/a/b/a/a;->h(Lkik/a/b/a/a;)V

    :goto_0
    iget-object v0, p0, Lkik/a/b/a/e;->a:Lkik/a/b/a/a;

    invoke-virtual {v0}, Lkik/a/b/a/a;->F()V

    iget-object v0, p0, Lkik/a/b/a/e;->a:Lkik/a/b/a/a;

    invoke-static {v0}, Lkik/a/b/a/a;->c(Lkik/a/b/a/a;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lkik/a/b/a/e;->a:Lkik/a/b/a/a;

    invoke-static {v0}, Lkik/a/b/a/a;->f(Lkik/a/b/a/a;)Lkik/a/e/f;

    move-result-object v0

    new-instance v1, Lkik/a/f/f/u;

    iget-object v2, p0, Lkik/a/b/a/e;->a:Lkik/a/b/a/a;

    invoke-direct {v1, v2}, Lkik/a/f/f/u;-><init>(Lkik/a/f/j;)V

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lkik/a/e/f;->a(Lkik/a/f/f/z;Z)Lcom/kik/g/p;

    goto :goto_0
.end method
