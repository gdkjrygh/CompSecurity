.class public final Lcom/roidapp/cloudlib/template/a/d;
.super Lcom/roidapp/cloudlib/template/a/e;
.source "SourceFile"


# instance fields
.field private h:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/roidapp/cloudlib/template/TemplateInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/template/c/f;Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0, p1, p2}, Lcom/roidapp/cloudlib/template/a/e;-><init>(Lcom/roidapp/cloudlib/template/c/f;Landroid/view/View$OnClickListener;)V

    .line 17
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/d;->h:Ljava/util/LinkedList;

    .line 19
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    .prologue
    .line 51
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/d;->h:Ljava/util/LinkedList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/d;->h:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/d;->h:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/a/d;->f()I

    move-result v1

    add-int/2addr v0, v1

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

    .line 71
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/d;->e:Lcom/roidapp/cloudlib/template/a;

    invoke-virtual {v0, p2}, Lcom/roidapp/cloudlib/template/a;->d(Lcom/roidapp/cloudlib/template/TemplateInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->p:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/d;->g:[Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 78
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/d;->d:Lcom/roidapp/cloudlib/template/b;

    invoke-virtual {v0, p2}, Lcom/roidapp/cloudlib/template/b;->c(Lcom/roidapp/cloudlib/template/TemplateInfo;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 84
    :goto_1
    return-void

    .line 75
    :cond_0
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->p:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/d;->g:[Landroid/graphics/drawable/Drawable;

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 82
    :cond_1
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->m:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

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
    .line 23
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/d;->h:Ljava/util/LinkedList;

    if-eqz v0, :cond_0

    .line 24
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/d;->h:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 26
    :cond_0
    return-void
.end method

.method public final b(I)J
    .locals 2

    .prologue
    .line 66
    int-to-long v0, p1

    return-wide v0
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/d;->h:Ljava/util/LinkedList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/d;->h:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 36
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/d;->h:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 37
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/a/d;->c()V

    .line 39
    :cond_0
    return-void
.end method

.method public final e(I)Lcom/roidapp/cloudlib/template/TemplateInfo;
    .locals 2

    .prologue
    .line 56
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/template/a/d;->f(I)I

    move-result v0

    .line 57
    if-ltz v0, :cond_0

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/d;->h:Ljava/util/LinkedList;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/d;->h:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 58
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/d;->h:Ljava/util/LinkedList;

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 61
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()V
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/d;->h:Ljava/util/LinkedList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/d;->h:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 44
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/d;->h:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/d;->h:Ljava/util/LinkedList;

    .line 47
    :cond_0
    return-void
.end method
