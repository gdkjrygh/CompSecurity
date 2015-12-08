.class final Lcom/bumptech/glide/load/b/a/q;
.super Lcom/bumptech/glide/load/b/a/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bumptech/glide/load/b/a/d",
        "<",
        "Lcom/bumptech/glide/load/b/a/p;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 157
    invoke-direct {p0}, Lcom/bumptech/glide/load/b/a/d;-><init>()V

    return-void
.end method


# virtual methods
.method protected final synthetic a()Lcom/bumptech/glide/load/b/a/m;
    .locals 1

    .prologue
    .line 157
    .line 1167
    new-instance v0, Lcom/bumptech/glide/load/b/a/p;

    invoke-direct {v0, p0}, Lcom/bumptech/glide/load/b/a/p;-><init>(Lcom/bumptech/glide/load/b/a/q;)V

    .line 157
    return-object v0
.end method

.method public final a(ILandroid/graphics/Bitmap$Config;)Lcom/bumptech/glide/load/b/a/p;
    .locals 1

    .prologue
    .line 160
    invoke-virtual {p0}, Lcom/bumptech/glide/load/b/a/q;->b()Lcom/bumptech/glide/load/b/a/m;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/b/a/p;

    .line 161
    invoke-virtual {v0, p1, p2}, Lcom/bumptech/glide/load/b/a/p;->a(ILandroid/graphics/Bitmap$Config;)V

    .line 162
    return-object v0
.end method
