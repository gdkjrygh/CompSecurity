.class public final Lcom/bumptech/glide/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/bumptech/glide/p;

.field private final b:Lcom/bumptech/glide/load/c/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/c/s",
            "<TT;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/bumptech/glide/p;Lcom/bumptech/glide/load/c/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/c/s",
            "<TT;",
            "Ljava/io/InputStream;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 673
    iput-object p1, p0, Lcom/bumptech/glide/t;->a:Lcom/bumptech/glide/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 674
    iput-object p2, p0, Lcom/bumptech/glide/t;->b:Lcom/bumptech/glide/load/c/s;

    .line 675
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/bumptech/glide/d;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lcom/bumptech/glide/d",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 697
    invoke-static {p1}, Lcom/bumptech/glide/p;->a(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v1

    .line 1684
    new-instance v0, Lcom/bumptech/glide/d;

    iget-object v2, p0, Lcom/bumptech/glide/t;->b:Lcom/bumptech/glide/load/c/s;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/bumptech/glide/t;->a:Lcom/bumptech/glide/p;

    invoke-static {v4}, Lcom/bumptech/glide/p;->a(Lcom/bumptech/glide/p;)Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lcom/bumptech/glide/t;->a:Lcom/bumptech/glide/p;

    invoke-static {v5}, Lcom/bumptech/glide/p;->b(Lcom/bumptech/glide/p;)Lcom/bumptech/glide/h;

    move-result-object v5

    iget-object v6, p0, Lcom/bumptech/glide/t;->a:Lcom/bumptech/glide/p;

    invoke-static {v6}, Lcom/bumptech/glide/p;->c(Lcom/bumptech/glide/p;)Lcom/bumptech/glide/d/p;

    move-result-object v6

    iget-object v7, p0, Lcom/bumptech/glide/t;->a:Lcom/bumptech/glide/p;

    invoke-static {v7}, Lcom/bumptech/glide/p;->d(Lcom/bumptech/glide/p;)Lcom/bumptech/glide/d/i;

    move-result-object v7

    iget-object v8, p0, Lcom/bumptech/glide/t;->a:Lcom/bumptech/glide/p;

    invoke-static {v8}, Lcom/bumptech/glide/p;->e(Lcom/bumptech/glide/p;)Lcom/bumptech/glide/u;

    move-result-object v8

    invoke-direct/range {v0 .. v8}, Lcom/bumptech/glide/d;-><init>(Ljava/lang/Class;Lcom/bumptech/glide/load/c/s;Lcom/bumptech/glide/load/c/s;Landroid/content/Context;Lcom/bumptech/glide/h;Lcom/bumptech/glide/d/p;Lcom/bumptech/glide/d/i;Lcom/bumptech/glide/u;)V

    check-cast v0, Lcom/bumptech/glide/d;

    .line 697
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/d;->b(Ljava/lang/Object;)Lcom/bumptech/glide/c;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/d;

    return-object v0
.end method
