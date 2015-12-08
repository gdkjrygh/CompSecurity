.class public Lcom/bumptech/glide/load/resource/d/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/bumptech/glide/load/b/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/b/x",
            "<",
            "Lcom/bumptech/glide/load/resource/c/b;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/bumptech/glide/load/b/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/b/x",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/b/x;Lcom/bumptech/glide/load/b/x;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b/x",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/bumptech/glide/load/b/x",
            "<",
            "Lcom/bumptech/glide/load/resource/c/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can only contain either a bitmap resource or a gif resource, not both"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 20
    :cond_0
    if-nez p1, :cond_1

    if-nez p2, :cond_1

    .line 21
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Must contain either a bitmap resource or a gif resource"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 23
    :cond_1
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/d/a;->b:Lcom/bumptech/glide/load/b/x;

    .line 24
    iput-object p2, p0, Lcom/bumptech/glide/load/resource/d/a;->a:Lcom/bumptech/glide/load/b/x;

    .line 25
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/d/a;->b:Lcom/bumptech/glide/load/b/x;

    if-eqz v0, :cond_0

    .line 32
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/d/a;->b:Lcom/bumptech/glide/load/b/x;

    invoke-interface {v0}, Lcom/bumptech/glide/load/b/x;->c()I

    move-result v0

    .line 34
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/d/a;->a:Lcom/bumptech/glide/load/b/x;

    invoke-interface {v0}, Lcom/bumptech/glide/load/b/x;->c()I

    move-result v0

    goto :goto_0
.end method

.method public final b()Lcom/bumptech/glide/load/b/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/load/b/x",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .prologue
    .line 42
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/d/a;->b:Lcom/bumptech/glide/load/b/x;

    return-object v0
.end method

.method public final c()Lcom/bumptech/glide/load/b/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/load/b/x",
            "<",
            "Lcom/bumptech/glide/load/resource/c/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 49
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/d/a;->a:Lcom/bumptech/glide/load/b/x;

    return-object v0
.end method
