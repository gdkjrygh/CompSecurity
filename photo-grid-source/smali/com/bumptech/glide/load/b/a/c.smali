.class final Lcom/bumptech/glide/load/b/a/c;
.super Lcom/bumptech/glide/load/b/a/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bumptech/glide/load/b/a/d",
        "<",
        "Lcom/bumptech/glide/load/b/a/b;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Lcom/bumptech/glide/load/b/a/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(IILandroid/graphics/Bitmap$Config;)Lcom/bumptech/glide/load/b/a/b;
    .locals 1

    .prologue
    .line 63
    invoke-virtual {p0}, Lcom/bumptech/glide/load/b/a/c;->b()Lcom/bumptech/glide/load/b/a/m;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/b/a/b;

    .line 64
    invoke-virtual {v0, p1, p2, p3}, Lcom/bumptech/glide/load/b/a/b;->a(IILandroid/graphics/Bitmap$Config;)V

    .line 65
    return-object v0
.end method

.method protected final synthetic a()Lcom/bumptech/glide/load/b/a/m;
    .locals 1

    .prologue
    .line 61
    .line 1070
    new-instance v0, Lcom/bumptech/glide/load/b/a/b;

    invoke-direct {v0, p0}, Lcom/bumptech/glide/load/b/a/b;-><init>(Lcom/bumptech/glide/load/b/a/c;)V

    .line 61
    return-object v0
.end method
