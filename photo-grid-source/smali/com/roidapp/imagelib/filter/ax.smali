.class public abstract Lcom/roidapp/imagelib/filter/ax;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field public b:I

.field private c:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

.field private d:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

.field private final e:I


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 32
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 21
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/imagelib/filter/ax;->b:I

    .line 26
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/ax;->d:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 33
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/e;->g:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/imagelib/filter/ax;->e:I

    .line 35
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/ax;->c:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 36
    const/4 v0, 0x0

    .line 37
    if-eqz p1, :cond_0

    .line 38
    invoke-interface {p1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->d()Ljava/util/List;

    move-result-object v0

    .line 39
    :cond_0
    if-eqz v0, :cond_1

    .line 40
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/ax;->d:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/ax;->d:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 42
    :cond_1
    iput-object p2, p0, Lcom/roidapp/imagelib/filter/ax;->a:Landroid/content/Context;

    .line 47
    return-void
.end method


# virtual methods
.method public final a()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ax;->c:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    return-object v0
.end method

.method public abstract a(Landroid/widget/ImageView;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V
.end method

.method public final a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x0

    .line 57
    if-eqz p1, :cond_0

    .line 58
    invoke-interface {p1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->d()Ljava/util/List;

    move-result-object v0

    .line 59
    :cond_0
    if-eqz v0, :cond_1

    .line 60
    invoke-interface {v0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/ax;->d:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 62
    :cond_1
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/ax;->c:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 63
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ax;->d:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ax;->d:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    array-length v0, v0

    goto :goto_0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ax;->d:[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .prologue
    .line 81
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 87
    if-nez p2, :cond_0

    .line 88
    new-instance v1, Lcom/roidapp/imagelib/filter/ay;

    invoke-direct {v1, v4}, Lcom/roidapp/imagelib/filter/ay;-><init>(B)V

    .line 89
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/ax;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v2, Lcom/roidapp/imagelib/h;->f:I

    invoke-virtual {v0, v2, p3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 90
    sget v0, Lcom/roidapp/imagelib/g;->l:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/imagelib/filter/ay;->b:Landroid/widget/ImageView;

    .line 92
    sget v0, Lcom/roidapp/imagelib/g;->B:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/imagelib/filter/ay;->a:Landroid/widget/TextView;

    .line 94
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 99
    :goto_0
    invoke-virtual {p0, p1}, Lcom/roidapp/imagelib/filter/ax;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 100
    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->c()I

    move-result v2

    .line 101
    iget v3, p0, Lcom/roidapp/imagelib/filter/ax;->b:I

    if-ne v2, v3, :cond_1

    .line 102
    iget-object v3, v1, Lcom/roidapp/imagelib/filter/ay;->b:Landroid/widget/ImageView;

    iget-object v4, p0, Lcom/roidapp/imagelib/filter/ax;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/roidapp/imagelib/d;->b:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 112
    :goto_1
    iget-object v3, v1, Lcom/roidapp/imagelib/filter/ay;->b:Landroid/widget/ImageView;

    invoke-virtual {p0, v3, v0}, Lcom/roidapp/imagelib/filter/ax;->a(Landroid/widget/ImageView;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 114
    iget-object v3, v1, Lcom/roidapp/imagelib/filter/ay;->a:Landroid/widget/TextView;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 115
    iget-object v1, v1, Lcom/roidapp/imagelib/filter/ay;->a:Landroid/widget/TextView;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    return-object p2

    .line 96
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/ay;

    move-object v1, v0

    goto :goto_0

    .line 104
    :cond_1
    iget-object v3, v1, Lcom/roidapp/imagelib/filter/ay;->b:Landroid/widget/ImageView;

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    goto :goto_1
.end method
