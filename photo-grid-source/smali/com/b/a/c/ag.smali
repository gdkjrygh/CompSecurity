.class final Lcom/b/a/c/ag;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/io/File;

.field final synthetic b:Lcom/b/a/c/aa;


# direct methods
.method constructor <init>(Lcom/b/a/c/aa;Ljava/io/File;)V
    .locals 0

    .prologue
    .line 1270
    iput-object p1, p0, Lcom/b/a/c/ag;->b:Lcom/b/a/c/aa;

    iput-object p2, p0, Lcom/b/a/c/ag;->a:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 1273
    iget-object v0, p0, Lcom/b/a/c/ag;->b:Lcom/b/a/c/aa;

    invoke-static {v0}, Lcom/b/a/c/aa;->c(Lcom/b/a/c/aa;)Lcom/b/a/c/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/b/a/c/h;->v()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, La/a/a/a/a/b/l;->m(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1274
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 1276
    invoke-static {}, La/a/a/a/a/g/q;->a()La/a/a/a/a/g/q;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/g/q;->b()La/a/a/a/a/g/v;

    move-result-object v0

    .line 1278
    iget-object v1, p0, Lcom/b/a/c/ag;->b:Lcom/b/a/c/aa;

    invoke-static {v1}, Lcom/b/a/c/aa;->c(Lcom/b/a/c/aa;)Lcom/b/a/c/h;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/b/a/c/h;->a(La/a/a/a/a/g/v;)Lcom/b/a/c/ar;

    move-result-object v0

    .line 1283
    if-eqz v0, :cond_0

    .line 1284
    new-instance v1, Lcom/b/a/c/br;

    invoke-direct {v1, v0}, Lcom/b/a/c/br;-><init>(Lcom/b/a/c/ar;)V

    new-instance v0, Lcom/b/a/c/bv;

    iget-object v2, p0, Lcom/b/a/c/ag;->a:Ljava/io/File;

    invoke-static {}, Lcom/b/a/c/aa;->f()Ljava/util/Map;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/b/a/c/bv;-><init>(Ljava/io/File;Ljava/util/Map;)V

    invoke-virtual {v1, v0}, Lcom/b/a/c/br;->a(Lcom/b/a/c/bq;)Z

    .line 1288
    :cond_0
    return-void
.end method
