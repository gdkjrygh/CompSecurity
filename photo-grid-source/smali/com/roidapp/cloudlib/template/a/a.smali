.class public final Lcom/roidapp/cloudlib/template/a/a;
.super Lcom/roidapp/cloudlib/template/a/e;
.source "SourceFile"


# instance fields
.field private h:Z


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/template/c/f;Landroid/view/View$OnClickListener;)V
    .locals 2

    .prologue
    .line 23
    invoke-direct {p0, p1, p2}, Lcom/roidapp/cloudlib/template/a/e;-><init>(Lcom/roidapp/cloudlib/template/c/f;Landroid/view/View$OnClickListener;)V

    .line 24
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/a;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/al;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/template/a/a;->h:Z

    .line 25
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/a;->e:Lcom/roidapp/cloudlib/template/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/a;->e()I

    move-result v0

    return v0
.end method

.method protected final a(Lcom/roidapp/cloudlib/template/a/f;Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 6

    .prologue
    const/16 v5, 0x8

    const/4 v4, 0x0

    .line 59
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/a;->d:Lcom/roidapp/cloudlib/template/b;

    invoke-virtual {v0, p2}, Lcom/roidapp/cloudlib/template/b;->c(Lcom/roidapp/cloudlib/template/TemplateInfo;)Z

    move-result v0

    .line 61
    if-nez v0, :cond_0

    iget-boolean v1, p0, Lcom/roidapp/cloudlib/template/a/a;->h:Z

    if-nez v1, :cond_0

    invoke-virtual {p2}, Lcom/roidapp/cloudlib/template/TemplateInfo;->q()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 62
    invoke-virtual {p2}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/roidapp/cloudlib/template/j;->b(J)Z

    move-result v1

    .line 63
    if-nez v1, :cond_0

    .line 66
    iget-object v1, p1, Lcom/roidapp/cloudlib/template/a/f;->s:Landroid/widget/ImageView;

    sget v2, Lcom/roidapp/cloudlib/aq;->I:I

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 67
    iget-object v1, p1, Lcom/roidapp/cloudlib/template/a/f;->s:Landroid/widget/ImageView;

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 74
    :goto_0
    iget-object v1, p1, Lcom/roidapp/cloudlib/template/a/f;->p:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/a/a;->g:[Landroid/graphics/drawable/Drawable;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 76
    if-eqz v0, :cond_1

    .line 77
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 82
    :goto_1
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->l:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/roidapp/cloudlib/template/TemplateInfo;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    return-void

    .line 71
    :cond_0
    iget-object v1, p1, Lcom/roidapp/cloudlib/template/a/f;->s:Landroid/widget/ImageView;

    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 80
    :cond_1
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

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
    .line 29
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/a;->e:Lcom/roidapp/cloudlib/template/a;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/template/a;->a(Ljava/util/List;)V

    .line 30
    return-void
.end method

.method public final b(I)J
    .locals 2

    .prologue
    .line 44
    int-to-long v0, p1

    return-wide v0
.end method

.method public final d()V
    .locals 0

    .prologue
    .line 49
    return-void
.end method

.method public final e(I)Lcom/roidapp/cloudlib/template/TemplateInfo;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/a;->e:Lcom/roidapp/cloudlib/template/a;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/template/a;->a(I)Lcom/roidapp/cloudlib/template/TemplateInfo;

    move-result-object v0

    return-object v0
.end method

.method public final e()V
    .locals 1

    .prologue
    .line 53
    invoke-super {p0}, Lcom/roidapp/cloudlib/template/a/e;->e()V

    .line 54
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/a;->e:Lcom/roidapp/cloudlib/template/a;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/a;->g()V

    .line 55
    return-void
.end method
