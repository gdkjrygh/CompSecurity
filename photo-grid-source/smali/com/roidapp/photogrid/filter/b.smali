.class public final Lcom/roidapp/photogrid/filter/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/roidapp/imagelib/e/b;Landroid/graphics/Bitmap;Lcom/roidapp/photogrid/release/ig;)Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 49
    if-eqz p0, :cond_0

    .line 1213
    iget-object v0, p2, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 49
    :goto_0
    if-eqz v0, :cond_2

    .line 58
    :cond_0
    :goto_1
    return-object p1

    .line 1213
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {p0, p1}, Lcom/roidapp/imagelib/e/b;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 51
    if-eqz v0, :cond_0

    if-eq v0, p1, :cond_0

    .line 52
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_3

    .line 53
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_3
    move-object p1, v0

    .line 55
    goto :goto_1
.end method

.method public static a(Landroid/content/Context;)Lcom/roidapp/imagelib/e/b;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 16
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/aa;->g()Z

    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 28
    :goto_0
    return-object v0

    .line 18
    :cond_0
    new-instance v1, Lcom/roidapp/imagelib/filter/bi;

    invoke-direct {v1, p0}, Lcom/roidapp/imagelib/filter/bi;-><init>(Landroid/content/Context;)V

    .line 19
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/imagelib/filter/aa;->d()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    invoke-interface {v2}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 24
    :goto_1
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/aa;->e()Lcom/roidapp/imagelib/b/b;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/b/b;)V

    .line 25
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/aa;->b()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/filter/bi;->a(I)V

    .line 26
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/filter/bi;->c(Z)V

    .line 27
    new-instance v0, Lcom/roidapp/imagelib/e/b;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/imagelib/e/b;-><init>(Landroid/content/Context;Lcom/roidapp/imagelib/e/a;)V

    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    goto :goto_1
.end method

.method public static b(Landroid/content/Context;)Lcom/roidapp/imagelib/e/b;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 32
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/aa;->g()Z

    move-result v1

    .line 33
    if-nez v1, :cond_0

    .line 44
    :goto_0
    return-object v0

    .line 34
    :cond_0
    new-instance v1, Lcom/roidapp/imagelib/filter/bi;

    invoke-direct {v1, p0}, Lcom/roidapp/imagelib/filter/bi;-><init>(Landroid/content/Context;)V

    .line 35
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/imagelib/filter/aa;->c()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    invoke-virtual {v1, v2}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 40
    :goto_1
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/aa;->e()Lcom/roidapp/imagelib/b/b;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/b/b;)V

    .line 41
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/aa;->b()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/filter/bi;->a(I)V

    .line 42
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/filter/bi;->c(Z)V

    .line 43
    new-instance v0, Lcom/roidapp/imagelib/e/b;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/imagelib/e/b;-><init>(Landroid/content/Context;Lcom/roidapp/imagelib/e/a;)V

    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    goto :goto_1
.end method
