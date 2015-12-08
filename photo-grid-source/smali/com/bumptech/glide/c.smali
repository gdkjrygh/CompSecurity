.class public Lcom/bumptech/glide/c;
.super Lcom/bumptech/glide/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ModelType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/bumptech/glide/e",
        "<TModelType;",
        "Lcom/bumptech/glide/load/c/j;",
        "Lcom/bumptech/glide/load/resource/d/a;",
        "Lcom/bumptech/glide/load/resource/a/b;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/Class;Lcom/bumptech/glide/f/f;Lcom/bumptech/glide/h;Lcom/bumptech/glide/d/p;Lcom/bumptech/glide/d/i;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class",
            "<TModelType;>;",
            "Lcom/bumptech/glide/f/f",
            "<TModelType;",
            "Lcom/bumptech/glide/load/c/j;",
            "Lcom/bumptech/glide/load/resource/d/a;",
            "Lcom/bumptech/glide/load/resource/a/b;",
            ">;",
            "Lcom/bumptech/glide/h;",
            "Lcom/bumptech/glide/d/p;",
            "Lcom/bumptech/glide/d/i;",
            ")V"
        }
    .end annotation

    .prologue
    .line 48
    const-class v4, Lcom/bumptech/glide/load/resource/a/b;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/bumptech/glide/e;-><init>(Landroid/content/Context;Ljava/lang/Class;Lcom/bumptech/glide/f/f;Ljava/lang/Class;Lcom/bumptech/glide/h;Lcom/bumptech/glide/d/p;Lcom/bumptech/glide/d/i;)V

    .line 1246
    new-instance v0, Lcom/bumptech/glide/g/a/a;

    invoke-direct {v0}, Lcom/bumptech/glide/g/a/a;-><init>()V

    invoke-super {p0, v0}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/g/a/f;)Lcom/bumptech/glide/e;

    .line 51
    return-void
.end method


# virtual methods
.method public final a()Lcom/bumptech/glide/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/c",
            "<TModelType;>;"
        }
    .end annotation

    .prologue
    .line 179
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/bumptech/glide/load/g;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/bumptech/glide/c;->c:Lcom/bumptech/glide/h;

    invoke-virtual {v2}, Lcom/bumptech/glide/h;->e()Lcom/bumptech/glide/load/resource/d/h;

    move-result-object v2

    aput-object v2, v0, v1

    .line 2228
    invoke-super {p0, v0}, Lcom/bumptech/glide/e;->a([Lcom/bumptech/glide/load/g;)Lcom/bumptech/glide/e;

    .line 179
    return-object p0
.end method

.method public final a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b/e;",
            ")",
            "Lcom/bumptech/glide/c",
            "<TModelType;>;"
        }
    .end annotation

    .prologue
    .line 377
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->b(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/e;

    .line 378
    return-object p0
.end method

.method public final bridge synthetic a(I)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 41
    .line 8319
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(I)Lcom/bumptech/glide/e;

    .line 41
    return-object p0
.end method

.method public final synthetic a(II)Lcom/bumptech/glide/e;
    .locals 1

    .prologue
    .line 41
    invoke-virtual {p0, p1, p2}, Lcom/bumptech/glide/c;->b(II)Lcom/bumptech/glide/c;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 41
    .line 7328
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/e;

    .line 41
    return-object p0
.end method

.method public final bridge synthetic a(Lcom/bumptech/glide/e;)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 41
    .line 12088
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/e;)Lcom/bumptech/glide/e;

    .line 41
    return-object p0
.end method

.method public final bridge synthetic a(Lcom/bumptech/glide/load/b;)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 41
    .line 10404
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/load/b;)Lcom/bumptech/glide/e;

    .line 41
    return-object p0
.end method

.method public final bridge synthetic a(Lcom/bumptech/glide/load/c;)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 41
    .line 5419
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/load/c;)Lcom/bumptech/glide/e;

    .line 41
    return-object p0
.end method

.method public final bridge synthetic a(Lcom/bumptech/glide/load/e;)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 41
    .line 11115
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/load/e;)Lcom/bumptech/glide/e;

    .line 41
    return-object p0
.end method

.method public final bridge synthetic a(Ljava/lang/Object;)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 41
    .line 4425
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Ljava/lang/Object;)Lcom/bumptech/glide/e;

    .line 41
    return-object p0
.end method

.method public final bridge synthetic a(Z)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 41
    .line 6386
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Z)Lcom/bumptech/glide/e;

    .line 41
    return-object p0
.end method

.method public final bridge synthetic a([Lcom/bumptech/glide/load/g;)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 41
    .line 10228
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a([Lcom/bumptech/glide/load/g;)Lcom/bumptech/glide/e;

    .line 41
    return-object p0
.end method

.method public final a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            ")",
            "Lcom/bumptech/glide/g/b/k",
            "<",
            "Lcom/bumptech/glide/load/resource/a/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 448
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    move-result-object v0

    return-object v0
.end method

.method public final b(II)Lcom/bumptech/glide/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/bumptech/glide/c",
            "<TModelType;>;"
        }
    .end annotation

    .prologue
    .line 395
    invoke-super {p0, p1, p2}, Lcom/bumptech/glide/e;->a(II)Lcom/bumptech/glide/e;

    .line 396
    return-object p0
.end method

.method public final b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            ")",
            "Lcom/bumptech/glide/c",
            "<TModelType;>;"
        }
    .end annotation

    .prologue
    .line 328
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/e;

    .line 329
    return-object p0
.end method

.method public final b(Lcom/bumptech/glide/load/c;)Lcom/bumptech/glide/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/c;",
            ")",
            "Lcom/bumptech/glide/c",
            "<TModelType;>;"
        }
    .end annotation

    .prologue
    .line 419
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/load/c;)Lcom/bumptech/glide/e;

    .line 420
    return-object p0
.end method

.method public final b(Ljava/lang/Object;)Lcom/bumptech/glide/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModelType;)",
            "Lcom/bumptech/glide/c",
            "<TModelType;>;"
        }
    .end annotation

    .prologue
    .line 425
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->a(Ljava/lang/Object;)Lcom/bumptech/glide/e;

    .line 426
    return-object p0
.end method

.method public final bridge synthetic b(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 41
    .line 10377
    invoke-super {p0, p1}, Lcom/bumptech/glide/e;->b(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/e;

    .line 41
    return-object p0
.end method

.method final b()V
    .locals 0

    .prologue
    .line 453
    invoke-virtual {p0}, Lcom/bumptech/glide/c;->f()Lcom/bumptech/glide/c;

    .line 454
    return-void
.end method

.method final c()V
    .locals 0

    .prologue
    .line 458
    invoke-virtual {p0}, Lcom/bumptech/glide/c;->a()Lcom/bumptech/glide/c;

    .line 459
    return-void
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 41
    .line 12431
    invoke-super {p0}, Lcom/bumptech/glide/e;->d()Lcom/bumptech/glide/e;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/c;

    .line 41
    return-object v0
.end method

.method public final bridge synthetic d()Lcom/bumptech/glide/e;
    .locals 1

    .prologue
    .line 41
    .line 3431
    invoke-super {p0}, Lcom/bumptech/glide/e;->d()Lcom/bumptech/glide/e;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/c;

    .line 41
    return-object v0
.end method

.method public final bridge synthetic e()Lcom/bumptech/glide/e;
    .locals 0

    .prologue
    .line 41
    .line 9281
    invoke-super {p0}, Lcom/bumptech/glide/e;->e()Lcom/bumptech/glide/e;

    .line 41
    return-object p0
.end method

.method public final f()Lcom/bumptech/glide/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/c",
            "<TModelType;>;"
        }
    .end annotation

    .prologue
    .line 194
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/bumptech/glide/load/g;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/bumptech/glide/c;->c:Lcom/bumptech/glide/h;

    invoke-virtual {v2}, Lcom/bumptech/glide/h;->f()Lcom/bumptech/glide/load/resource/d/h;

    move-result-object v2

    aput-object v2, v0, v1

    .line 3228
    invoke-super {p0, v0}, Lcom/bumptech/glide/e;->a([Lcom/bumptech/glide/load/g;)Lcom/bumptech/glide/e;

    .line 194
    return-object p0
.end method

.method public final g()Lcom/bumptech/glide/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/c",
            "<TModelType;>;"
        }
    .end annotation

    .prologue
    .line 281
    invoke-super {p0}, Lcom/bumptech/glide/e;->e()Lcom/bumptech/glide/e;

    .line 282
    return-object p0
.end method

.method public final h()Lcom/bumptech/glide/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/c",
            "<TModelType;>;"
        }
    .end annotation

    .prologue
    .line 319
    const v0, 0x7f02044b

    invoke-super {p0, v0}, Lcom/bumptech/glide/e;->a(I)Lcom/bumptech/glide/e;

    .line 320
    return-object p0
.end method
