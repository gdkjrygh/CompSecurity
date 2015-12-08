.class public final Lcom/roidapp/cloudlib/template/a/b;
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

.field private i:Z

.field private j:J

.field private k:J


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/template/c/f;Landroid/view/View$OnClickListener;)V
    .locals 4

    .prologue
    .line 24
    invoke-direct {p0, p1, p2}, Lcom/roidapp/cloudlib/template/a/e;-><init>(Lcom/roidapp/cloudlib/template/c/f;Landroid/view/View$OnClickListener;)V

    .line 25
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/b;->h:Ljava/util/LinkedList;

    .line 26
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/b;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/al;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/template/a/b;->i:Z

    .line 27
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/b;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "newestHotID"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/cloudlib/template/a/b;->j:J

    iput-wide v0, p0, Lcom/roidapp/cloudlib/template/a/b;->k:J

    .line 28
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 2

    .prologue
    .line 65
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/b;->h:Ljava/util/LinkedList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/b;->h:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/b;->h:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/a/b;->f()I

    move-result v1

    add-int/2addr v0, v1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final a(Lcom/roidapp/cloudlib/template/a/f;Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 9

    .prologue
    const/4 v2, 0x1

    const/16 v8, 0x8

    const/4 v1, 0x0

    .line 85
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/b;->d:Lcom/roidapp/cloudlib/template/b;

    invoke-virtual {v0, p2}, Lcom/roidapp/cloudlib/template/b;->c(Lcom/roidapp/cloudlib/template/TemplateInfo;)Z

    move-result v3

    .line 87
    if-nez v3, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/template/a/b;->i:Z

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/roidapp/cloudlib/template/j;->b(J)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    move v0, v2

    .line 88
    :goto_0
    invoke-virtual {p2}, Lcom/roidapp/cloudlib/template/TemplateInfo;->q()Z

    move-result v4

    if-eqz v4, :cond_1

    if-eqz v0, :cond_4

    .line 89
    :cond_1
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->s:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 95
    :goto_1
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->t:Landroid/widget/ImageView;

    if-eqz v0, :cond_2

    .line 96
    invoke-virtual {p2}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/roidapp/cloudlib/template/a/b;->j:J

    cmp-long v0, v4, v6

    if-lez v0, :cond_5

    .line 97
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->t:Landroid/widget/ImageView;

    sget v4, Lcom/roidapp/cloudlib/aq;->ae:I

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 98
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->t:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 99
    invoke-virtual {p2}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/roidapp/cloudlib/template/a/b;->k:J

    cmp-long v0, v4, v6

    if-lez v0, :cond_2

    .line 100
    invoke-virtual {p2}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/roidapp/cloudlib/template/a/b;->k:J

    .line 101
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v4, "newestHotID"

    iget-wide v6, p0, Lcom/roidapp/cloudlib/template/a/b;->k:J

    invoke-interface {v0, v4, v6, v7}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 107
    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/b;->e:Lcom/roidapp/cloudlib/template/a;

    invoke-virtual {v0, p2}, Lcom/roidapp/cloudlib/template/a;->d(Lcom/roidapp/cloudlib/template/TemplateInfo;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 108
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->p:Landroid/widget/ImageView;

    iget-object v4, p0, Lcom/roidapp/cloudlib/template/a/b;->g:[Landroid/graphics/drawable/Drawable;

    aget-object v2, v4, v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 114
    :goto_3
    if-eqz v3, :cond_7

    .line 115
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 119
    :goto_4
    return-void

    :cond_3
    move v0, v1

    .line 87
    goto :goto_0

    .line 92
    :cond_4
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->s:Landroid/widget/ImageView;

    sget v4, Lcom/roidapp/cloudlib/aq;->I:I

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 93
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->s:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 104
    :cond_5
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->t:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 111
    :cond_6
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->p:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/roidapp/cloudlib/template/a/b;->g:[Landroid/graphics/drawable/Drawable;

    aget-object v2, v2, v1

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_3

    .line 117
    :cond_7
    iget-object v0, p1, Lcom/roidapp/cloudlib/template/a/f;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_4
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
    .line 38
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/b;->h:Ljava/util/LinkedList;

    if-eqz v0, :cond_0

    .line 39
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/b;->h:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 41
    :cond_0
    return-void
.end method

.method public final b(I)J
    .locals 2

    .prologue
    .line 80
    int-to-long v0, p1

    return-wide v0
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/b;->h:Ljava/util/LinkedList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/b;->h:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/b;->h:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 51
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/template/a/b;->c()V

    .line 53
    :cond_0
    return-void
.end method

.method public final e(I)Lcom/roidapp/cloudlib/template/TemplateInfo;
    .locals 2

    .prologue
    .line 70
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/template/a/b;->f(I)I

    move-result v0

    .line 71
    if-ltz v0, :cond_0

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/b;->h:Ljava/util/LinkedList;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/b;->h:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 72
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/a/b;->h:Ljava/util/LinkedList;

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 75
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()V
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/b;->h:Ljava/util/LinkedList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/b;->h:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 58
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/a/b;->h:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/a/b;->h:Ljava/util/LinkedList;

    .line 61
    :cond_0
    return-void
.end method
