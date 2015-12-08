.class public final Lcom/bumptech/glide/load/resource/d/h;
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
        "Lcom/bumptech/glide/load/resource/d/a;",
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

.field private final b:Lcom/bumptech/glide/load/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/g",
            "<",
            "Lcom/bumptech/glide/load/resource/c/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/b/a/e;Lcom/bumptech/glide/load/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b/a/e;",
            "Lcom/bumptech/glide/load/g",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 20
    new-instance v0, Lcom/bumptech/glide/load/resource/c/f;

    invoke-direct {v0, p2, p1}, Lcom/bumptech/glide/load/resource/c/f;-><init>(Lcom/bumptech/glide/load/g;Lcom/bumptech/glide/load/b/a/e;)V

    invoke-direct {p0, p2, v0}, Lcom/bumptech/glide/load/resource/d/h;-><init>(Lcom/bumptech/glide/load/g;Lcom/bumptech/glide/load/g;)V

    .line 21
    return-void
.end method

.method private constructor <init>(Lcom/bumptech/glide/load/g;Lcom/bumptech/glide/load/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/g",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/bumptech/glide/load/g",
            "<",
            "Lcom/bumptech/glide/load/resource/c/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/d/h;->a:Lcom/bumptech/glide/load/g;

    .line 26
    iput-object p2, p0, Lcom/bumptech/glide/load/resource/d/h;->b:Lcom/bumptech/glide/load/g;

    .line 27
    return-void
.end method


# virtual methods
.method public final a(Lcom/bumptech/glide/load/b/x;II)Lcom/bumptech/glide/load/b/x;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b/x",
            "<",
            "Lcom/bumptech/glide/load/resource/d/a;",
            ">;II)",
            "Lcom/bumptech/glide/load/b/x",
            "<",
            "Lcom/bumptech/glide/load/resource/d/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 31
    invoke-interface {p1}, Lcom/bumptech/glide/load/b/x;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/resource/d/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/d/a;->b()Lcom/bumptech/glide/load/b/x;

    move-result-object v1

    .line 32
    invoke-interface {p1}, Lcom/bumptech/glide/load/b/x;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/resource/d/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/d/a;->c()Lcom/bumptech/glide/load/b/x;

    move-result-object v0

    .line 33
    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/bumptech/glide/load/resource/d/h;->a:Lcom/bumptech/glide/load/g;

    if-eqz v2, :cond_1

    .line 34
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/d/h;->a:Lcom/bumptech/glide/load/g;

    invoke-interface {v0, v1, p2, p3}, Lcom/bumptech/glide/load/g;->a(Lcom/bumptech/glide/load/b/x;II)Lcom/bumptech/glide/load/b/x;

    move-result-object v2

    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 36
    new-instance v1, Lcom/bumptech/glide/load/resource/d/a;

    invoke-interface {p1}, Lcom/bumptech/glide/load/b/x;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/resource/d/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/d/a;->c()Lcom/bumptech/glide/load/b/x;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/bumptech/glide/load/resource/d/a;-><init>(Lcom/bumptech/glide/load/b/x;Lcom/bumptech/glide/load/b/x;)V

    .line 37
    new-instance p1, Lcom/bumptech/glide/load/resource/d/b;

    invoke-direct {p1, v1}, Lcom/bumptech/glide/load/resource/d/b;-><init>(Lcom/bumptech/glide/load/resource/d/a;)V

    .line 46
    :cond_0
    :goto_0
    return-object p1

    .line 39
    :cond_1
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/bumptech/glide/load/resource/d/h;->b:Lcom/bumptech/glide/load/g;

    if-eqz v1, :cond_0

    .line 40
    iget-object v1, p0, Lcom/bumptech/glide/load/resource/d/h;->b:Lcom/bumptech/glide/load/g;

    invoke-interface {v1, v0, p2, p3}, Lcom/bumptech/glide/load/g;->a(Lcom/bumptech/glide/load/b/x;II)Lcom/bumptech/glide/load/b/x;

    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 42
    new-instance v2, Lcom/bumptech/glide/load/resource/d/a;

    invoke-interface {p1}, Lcom/bumptech/glide/load/b/x;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/resource/d/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/d/a;->b()Lcom/bumptech/glide/load/b/x;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Lcom/bumptech/glide/load/resource/d/a;-><init>(Lcom/bumptech/glide/load/b/x;Lcom/bumptech/glide/load/b/x;)V

    .line 43
    new-instance p1, Lcom/bumptech/glide/load/resource/d/b;

    invoke-direct {p1, v2}, Lcom/bumptech/glide/load/resource/d/b;-><init>(Lcom/bumptech/glide/load/resource/d/a;)V

    goto :goto_0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/d/h;->a:Lcom/bumptech/glide/load/g;

    invoke-interface {v0}, Lcom/bumptech/glide/load/g;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
