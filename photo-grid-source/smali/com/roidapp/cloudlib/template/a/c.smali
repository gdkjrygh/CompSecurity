.class public final Lcom/roidapp/cloudlib/template/a/c;
.super Lcom/roidapp/cloudlib/template/a/e;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/template/c/f;Landroid/view/View$OnClickListener;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1, p2}, Lcom/roidapp/cloudlib/template/a/e;-><init>(Lcom/roidapp/cloudlib/template/c/f;Landroid/view/View$OnClickListener;)V

    .line 15
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/c;->d:Lcom/roidapp/cloudlib/template/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/c;->d:Lcom/roidapp/cloudlib/template/b;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b;->a()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final a(Lcom/roidapp/cloudlib/template/a/f;Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 49
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/c;->e:Lcom/roidapp/cloudlib/template/a;

    invoke-virtual {v0, p2}, Lcom/roidapp/cloudlib/template/a;->d(Lcom/roidapp/cloudlib/template/TemplateInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->p:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/c;->g:[Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 56
    :goto_0
    invoke-virtual {p2}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/template/j;->a(J)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 57
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->q:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 62
    :goto_1
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 63
    return-void

    .line 53
    :cond_0
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->p:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/c;->g:[Landroid/graphics/drawable/Drawable;

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 60
    :cond_1
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->q:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1
.end method

.method public final a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/template/TemplateInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 19
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/c;->d:Lcom/roidapp/cloudlib/template/b;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/template/b;->a(Ljava/util/List;)V

    .line 20
    return-void
.end method

.method public final b(I)J
    .locals 2

    .prologue
    .line 34
    int-to-long v0, p1

    return-wide v0
.end method

.method public final d()V
    .locals 0

    .prologue
    .line 39
    return-void
.end method

.method public final e(I)Lcom/roidapp/cloudlib/template/TemplateInfo;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/c;->d:Lcom/roidapp/cloudlib/template/b;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/template/b;->a(I)Lcom/roidapp/cloudlib/template/TemplateInfo;

    move-result-object v0

    return-object v0
.end method

.method public final e()V
    .locals 1

    .prologue
    .line 43
    invoke-super {p0}, Lcom/roidapp/cloudlib/template/a/e;->e()V

    .line 44
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/c;->d:Lcom/roidapp/cloudlib/template/b;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b;->b()V

    .line 45
    return-void
.end method
