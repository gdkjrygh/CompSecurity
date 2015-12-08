.class public final Lcom/bumptech/glide/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/bumptech/glide/r;

.field private final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TA;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<TA;>;"
        }
    .end annotation
.end field

.field private final d:Z


# direct methods
.method constructor <init>(Lcom/bumptech/glide/r;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)V"
        }
    .end annotation

    .prologue
    .line 748
    iput-object p1, p0, Lcom/bumptech/glide/s;->a:Lcom/bumptech/glide/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 749
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/s;->d:Z

    .line 750
    iput-object p2, p0, Lcom/bumptech/glide/s;->b:Ljava/lang/Object;

    .line 751
    invoke-static {p2}, Lcom/bumptech/glide/p;->a(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/s;->c:Ljava/lang/Class;

    .line 752
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lcom/bumptech/glide/g;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TZ;>;)",
            "Lcom/bumptech/glide/g",
            "<TA;TT;TZ;>;"
        }
    .end annotation

    .prologue
    .line 768
    new-instance v0, Lcom/bumptech/glide/g;

    iget-object v1, p0, Lcom/bumptech/glide/s;->a:Lcom/bumptech/glide/r;

    iget-object v1, v1, Lcom/bumptech/glide/r;->a:Lcom/bumptech/glide/p;

    invoke-static {v1}, Lcom/bumptech/glide/p;->a(Lcom/bumptech/glide/p;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/bumptech/glide/s;->a:Lcom/bumptech/glide/r;

    iget-object v2, v2, Lcom/bumptech/glide/r;->a:Lcom/bumptech/glide/p;

    invoke-static {v2}, Lcom/bumptech/glide/p;->b(Lcom/bumptech/glide/p;)Lcom/bumptech/glide/h;

    move-result-object v2

    iget-object v3, p0, Lcom/bumptech/glide/s;->c:Ljava/lang/Class;

    iget-object v4, p0, Lcom/bumptech/glide/s;->a:Lcom/bumptech/glide/r;

    invoke-static {v4}, Lcom/bumptech/glide/r;->a(Lcom/bumptech/glide/r;)Lcom/bumptech/glide/load/c/s;

    move-result-object v4

    iget-object v5, p0, Lcom/bumptech/glide/s;->a:Lcom/bumptech/glide/r;

    invoke-static {v5}, Lcom/bumptech/glide/r;->b(Lcom/bumptech/glide/r;)Ljava/lang/Class;

    move-result-object v5

    iget-object v6, p0, Lcom/bumptech/glide/s;->a:Lcom/bumptech/glide/r;

    iget-object v6, v6, Lcom/bumptech/glide/r;->a:Lcom/bumptech/glide/p;

    invoke-static {v6}, Lcom/bumptech/glide/p;->c(Lcom/bumptech/glide/p;)Lcom/bumptech/glide/d/p;

    move-result-object v7

    iget-object v6, p0, Lcom/bumptech/glide/s;->a:Lcom/bumptech/glide/r;

    iget-object v6, v6, Lcom/bumptech/glide/r;->a:Lcom/bumptech/glide/p;

    invoke-static {v6}, Lcom/bumptech/glide/p;->d(Lcom/bumptech/glide/p;)Lcom/bumptech/glide/d/i;

    move-result-object v8

    iget-object v6, p0, Lcom/bumptech/glide/s;->a:Lcom/bumptech/glide/r;

    iget-object v6, v6, Lcom/bumptech/glide/r;->a:Lcom/bumptech/glide/p;

    invoke-static {v6}, Lcom/bumptech/glide/p;->e(Lcom/bumptech/glide/p;)Lcom/bumptech/glide/u;

    move-result-object v9

    move-object v6, p1

    invoke-direct/range {v0 .. v9}, Lcom/bumptech/glide/g;-><init>(Landroid/content/Context;Lcom/bumptech/glide/h;Ljava/lang/Class;Lcom/bumptech/glide/load/c/s;Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/d/p;Lcom/bumptech/glide/d/i;Lcom/bumptech/glide/u;)V

    check-cast v0, Lcom/bumptech/glide/g;

    .line 771
    iget-boolean v1, p0, Lcom/bumptech/glide/s;->d:Z

    if-eqz v1, :cond_0

    .line 772
    iget-object v1, p0, Lcom/bumptech/glide/s;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/g;->a(Ljava/lang/Object;)Lcom/bumptech/glide/e;

    .line 774
    :cond_0
    return-object v0
.end method
