.class public final Lcom/bumptech/glide/load/resource/c/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/g",
        "<",
        "Lcom/bumptech/glide/load/resource/c/b;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/load/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/g",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/bumptech/glide/load/b/a/e;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/g;Lcom/bumptech/glide/load/b/a/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/g",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/bumptech/glide/load/b/a/e;",
            ")V"
        }
    .end annotation

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/c/f;->a:Lcom/bumptech/glide/load/g;

    .line 20
    iput-object p2, p0, Lcom/bumptech/glide/load/resource/c/f;->b:Lcom/bumptech/glide/load/b/a/e;

    .line 21
    return-void
.end method


# virtual methods
.method public final a(Lcom/bumptech/glide/load/b/x;II)Lcom/bumptech/glide/load/b/x;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b/x",
            "<",
            "Lcom/bumptech/glide/load/resource/c/b;",
            ">;II)",
            "Lcom/bumptech/glide/load/b/x",
            "<",
            "Lcom/bumptech/glide/load/resource/c/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 25
    invoke-interface {p1}, Lcom/bumptech/glide/load/b/x;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/resource/c/b;

    .line 31
    invoke-interface {p1}, Lcom/bumptech/glide/load/b/x;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/load/resource/c/b;

    invoke-virtual {v1}, Lcom/bumptech/glide/load/resource/c/b;->b()Landroid/graphics/Bitmap;

    move-result-object v2

    .line 32
    new-instance v1, Lcom/bumptech/glide/load/resource/bitmap/c;

    iget-object v3, p0, Lcom/bumptech/glide/load/resource/c/f;->b:Lcom/bumptech/glide/load/b/a/e;

    invoke-direct {v1, v2, v3}, Lcom/bumptech/glide/load/resource/bitmap/c;-><init>(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/b/a/e;)V

    .line 33
    iget-object v3, p0, Lcom/bumptech/glide/load/resource/c/f;->a:Lcom/bumptech/glide/load/g;

    invoke-interface {v3, v1, p2, p3}, Lcom/bumptech/glide/load/g;->a(Lcom/bumptech/glide/load/b/x;II)Lcom/bumptech/glide/load/b/x;

    move-result-object v1

    .line 34
    invoke-interface {v1}, Lcom/bumptech/glide/load/b/x;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 36
    new-instance p1, Lcom/bumptech/glide/load/resource/c/e;

    new-instance v2, Lcom/bumptech/glide/load/resource/c/b;

    iget-object v3, p0, Lcom/bumptech/glide/load/resource/c/f;->a:Lcom/bumptech/glide/load/g;

    invoke-direct {v2, v0, v1, v3}, Lcom/bumptech/glide/load/resource/c/b;-><init>(Lcom/bumptech/glide/load/resource/c/b;Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/g;)V

    invoke-direct {p1, v2}, Lcom/bumptech/glide/load/resource/c/e;-><init>(Lcom/bumptech/glide/load/resource/c/b;)V

    .line 38
    :cond_0
    return-object p1
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/f;->a:Lcom/bumptech/glide/load/g;

    invoke-interface {v0}, Lcom/bumptech/glide/load/g;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
