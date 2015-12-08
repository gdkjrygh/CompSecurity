.class final Lkik/a/b/a/m;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:J

.field final synthetic c:Lkik/a/d/f;

.field final synthetic d:Lkik/a/b/a/a;


# direct methods
.method constructor <init>(Lkik/a/b/a/a;Ljava/lang/String;JLkik/a/d/f;)V
    .locals 1

    .prologue
    .line 1340
    iput-object p1, p0, Lkik/a/b/a/m;->d:Lkik/a/b/a/a;

    iput-object p2, p0, Lkik/a/b/a/m;->a:Ljava/lang/String;

    iput-wide p3, p0, Lkik/a/b/a/m;->b:J

    iput-object p5, p0, Lkik/a/b/a/m;->c:Lkik/a/d/f;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 1340
    iget-object v0, p0, Lkik/a/b/a/m;->d:Lkik/a/b/a/a;

    iget-object v1, p0, Lkik/a/b/a/m;->a:Ljava/lang/String;

    iget-wide v2, p0, Lkik/a/b/a/m;->b:J

    invoke-virtual {v0, v1, v2, v3}, Lkik/a/b/a/a;->a(Ljava/lang/String;J)V

    iget-object v0, p0, Lkik/a/b/a/m;->d:Lkik/a/b/a/a;

    invoke-static {v0}, Lkik/a/b/a/a;->a(Lkik/a/b/a/a;)Lkik/a/e/v;

    move-result-object v0

    iget-object v1, p0, Lkik/a/b/a/m;->c:Lkik/a/d/f;

    invoke-virtual {v1}, Lkik/a/d/f;->q()Lkik/a/d/g;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/v;->a(Lkik/a/d/g;)Z

    iget-object v0, p0, Lkik/a/b/a/m;->d:Lkik/a/b/a/a;

    invoke-static {v0}, Lkik/a/b/a/a;->b(Lkik/a/b/a/a;)Lcom/kik/g/k;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 1350
    iget-object v0, p0, Lkik/a/b/a/m;->c:Lkik/a/d/f;

    invoke-virtual {v0}, Lkik/a/d/f;->r()V

    .line 1353
    iget-object v0, p0, Lkik/a/b/a/m;->d:Lkik/a/b/a/a;

    invoke-static {v0}, Lkik/a/b/a/a;->a(Lkik/a/b/a/a;)Lkik/a/e/v;

    move-result-object v0

    iget-object v1, p0, Lkik/a/b/a/m;->c:Lkik/a/d/f;

    invoke-virtual {v1}, Lkik/a/d/f;->q()Lkik/a/d/g;

    move-result-object v1

    invoke-interface {v0, v1}, Lkik/a/e/v;->a(Lkik/a/d/g;)Z

    .line 1354
    iget-object v0, p0, Lkik/a/b/a/m;->d:Lkik/a/b/a/a;

    invoke-static {v0}, Lkik/a/b/a/a;->b(Lkik/a/b/a/a;)Lcom/kik/g/k;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 1356
    return-void
.end method
