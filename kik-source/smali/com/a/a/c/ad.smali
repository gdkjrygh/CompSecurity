.class final Lcom/a/a/c/ad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/io/File;

.field final synthetic b:Lcom/a/a/c/x;


# direct methods
.method constructor <init>(Lcom/a/a/c/x;Ljava/io/File;)V
    .locals 0

    .prologue
    .line 1191
    iput-object p1, p0, Lcom/a/a/c/ad;->b:Lcom/a/a/c/x;

    iput-object p2, p0, Lcom/a/a/c/ad;->a:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 1194
    iget-object v0, p0, Lcom/a/a/c/ad;->b:Lcom/a/a/c/x;

    invoke-static {v0}, Lcom/a/a/c/x;->d(Lcom/a/a/c/x;)Lcom/a/a/c/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/c/g;->v()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lb/a/a/a/a/b/j;->n(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1195
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    .line 1197
    invoke-static {}, Lb/a/a/a/a/g/q;->a()Lb/a/a/a/a/g/q;

    move-result-object v0

    invoke-virtual {v0}, Lb/a/a/a/a/g/q;->b()Lb/a/a/a/a/g/t;

    move-result-object v0

    .line 1199
    iget-object v1, p0, Lcom/a/a/c/ad;->b:Lcom/a/a/c/x;

    invoke-static {v1}, Lcom/a/a/c/x;->d(Lcom/a/a/c/x;)Lcom/a/a/c/g;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/a/a/c/g;->a(Lb/a/a/a/a/g/t;)Lcom/a/a/c/an;

    move-result-object v0

    .line 1204
    if-eqz v0, :cond_0

    .line 1205
    new-instance v1, Lcom/a/a/c/aw;

    invoke-direct {v1, v0}, Lcom/a/a/c/aw;-><init>(Lcom/a/a/c/an;)V

    new-instance v0, Lcom/a/a/c/az;

    iget-object v2, p0, Lcom/a/a/c/ad;->a:Ljava/io/File;

    invoke-static {}, Lcom/a/a/c/x;->g()Ljava/util/Map;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/a/a/c/az;-><init>(Ljava/io/File;Ljava/util/Map;)V

    invoke-virtual {v1, v0}, Lcom/a/a/c/aw;->a(Lcom/a/a/c/av;)Z

    .line 1209
    :cond_0
    return-void
.end method
