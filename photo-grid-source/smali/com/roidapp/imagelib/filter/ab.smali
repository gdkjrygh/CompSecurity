.class public final Lcom/roidapp/imagelib/filter/ab;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field public a:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;",
            ">;"
        }
    .end annotation
.end field

.field private c:Landroid/view/LayoutInflater;

.field private final d:Landroid/content/Context;

.field private e:Z

.field private final f:I


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;",
            ">;",
            "Landroid/content/Context;",
            "Z)V"
        }
    .end annotation

    .prologue
    .line 32
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 33
    iput-boolean p3, p0, Lcom/roidapp/imagelib/filter/ab;->e:Z

    .line 34
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/ab;->b:Ljava/util/List;

    .line 35
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/ab;->c:Landroid/view/LayoutInflater;

    .line 36
    iput-object p2, p0, Lcom/roidapp/imagelib/filter/ab;->d:Landroid/content/Context;

    .line 37
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/e;->g:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/imagelib/filter/ab;->f:I

    .line 51
    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)I
    .locals 8

    .prologue
    const/4 v2, 0x0

    const/4 v1, -0x1

    .line 65
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ab;->b:Ljava/util/List;

    if-nez v0, :cond_1

    .line 79
    :cond_0
    :goto_0
    return v1

    .line 67
    :cond_1
    if-eqz p1, :cond_0

    move v1, v2

    .line 70
    :goto_1
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ab;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 71
    invoke-interface {p1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->c()J

    move-result-wide v4

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ab;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->c()J

    move-result-wide v6

    cmp-long v0, v4, v6

    if-eqz v0, :cond_0

    .line 70
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_2
    move v1, v2

    goto :goto_0
.end method

.method public final a(I)Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ab;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    return-object v0
.end method

.method public final a(J)Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;
    .locals 7

    .prologue
    .line 91
    const/4 v0, 0x0

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/ab;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 92
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ab;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 93
    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->c()J

    move-result-wide v4

    cmp-long v3, v4, p1

    if-nez v3, :cond_0

    .line 98
    :goto_1
    return-object v0

    .line 91
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 98
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 106
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ab;->b:Ljava/util/List;

    return-object v0
.end method

.method public final a(ILcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ab;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ab;->b:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 57
    :cond_0
    return-void
.end method

.method public final b(ILcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ab;->b:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 125
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/ab;->notifyDataSetChanged()V

    .line 126
    return-void
.end method

.method public final b(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ab;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 103
    return-void
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ab;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 22
    invoke-virtual {p0, p1}, Lcom/roidapp/imagelib/filter/ab;->a(I)Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 115
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    .prologue
    const/4 v8, 0x0

    .line 131
    if-nez p2, :cond_0

    .line 132
    new-instance v1, Lcom/roidapp/imagelib/filter/ac;

    invoke-direct {v1, v8}, Lcom/roidapp/imagelib/filter/ac;-><init>(B)V

    .line 133
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ab;->c:Landroid/view/LayoutInflater;

    sget v2, Lcom/roidapp/imagelib/h;->h:I

    invoke-virtual {v0, v2, p3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 135
    sget v0, Lcom/roidapp/imagelib/g;->B:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/imagelib/filter/ac;->a:Landroid/widget/TextView;

    .line 136
    sget v0, Lcom/roidapp/imagelib/g;->p:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/imagelib/filter/ac;->b:Landroid/widget/ImageView;

    .line 137
    sget v0, Lcom/roidapp/imagelib/g;->aw:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/imagelib/filter/ac;->c:Landroid/widget/ImageView;

    .line 138
    sget v0, Lcom/roidapp/imagelib/g;->q:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Lcom/roidapp/imagelib/filter/ac;->d:Landroid/view/View;

    .line 139
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 144
    :goto_0
    invoke-virtual {p0, p1}, Lcom/roidapp/imagelib/filter/ab;->a(I)Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v3

    .line 145
    iget-object v0, v1, Lcom/roidapp/imagelib/filter/ac;->d:Landroid/view/View;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 146
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ab;->a:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ab;->a:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->c()J

    move-result-wide v4

    invoke-interface {v3}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->c()J

    move-result-wide v6

    cmp-long v0, v4, v6

    if-nez v0, :cond_1

    .line 147
    iget-object v0, v1, Lcom/roidapp/imagelib/filter/ac;->d:Landroid/view/View;

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/ab;->d:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v4, Lcom/roidapp/imagelib/d;->b:I

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 150
    :goto_1
    iget-object v0, v1, Lcom/roidapp/imagelib/filter/ac;->a:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/ab;->d:Landroid/content/Context;

    invoke-interface {v3, v2}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 151
    iget-object v0, v1, Lcom/roidapp/imagelib/filter/ac;->a:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/ab;->d:Landroid/content/Context;

    invoke-interface {v3, v2}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->b(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 152
    invoke-interface {v3}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->c()J

    move-result-wide v4

    const-wide/16 v6, 0x66

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/ab;->e:Z

    if-eqz v0, :cond_2

    iget-object v0, v1, Lcom/roidapp/imagelib/filter/ac;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 154
    :goto_2
    invoke-interface {v3}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 155
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ab;->d:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ab;->d:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lcom/bumptech/glide/h;->a(Landroid/app/Activity;)Lcom/bumptech/glide/p;

    move-result-object v0

    move-object v2, v0

    .line 156
    :goto_3
    invoke-interface {v3}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v0

    sget-object v2, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/d;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/c;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v0

    iget-object v1, v1, Lcom/roidapp/imagelib/filter/ac;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 164
    :goto_4
    return-object p2

    .line 141
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/ac;

    move-object v1, v0

    goto/16 :goto_0

    .line 149
    :cond_1
    iget-object v0, v1, Lcom/roidapp/imagelib/filter/ac;->d:Landroid/view/View;

    invoke-virtual {v0, v8}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_1

    .line 153
    :cond_2
    iget-object v0, v1, Lcom/roidapp/imagelib/filter/ac;->c:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 155
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ab;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/bumptech/glide/h;->b(Landroid/content/Context;)Lcom/bumptech/glide/p;

    move-result-object v0

    move-object v2, v0

    goto :goto_3

    .line 162
    :cond_4
    iget-object v1, v1, Lcom/roidapp/imagelib/filter/ac;->b:Landroid/widget/ImageView;

    invoke-interface {v3}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_4
.end method
