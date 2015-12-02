.class public Lcom/facebook/reflex/view/c/a;
.super Ljava/lang/Object;
.source "AndroidAdapterWrapper.java"

# interfaces
.implements Lcom/facebook/reflex/view/c/i;


# instance fields
.field private final a:Landroid/widget/Adapter;

.field private final b:[Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Landroid/view/ViewGroup;

.field private d:Landroid/database/DataSetObserver;


# direct methods
.method public constructor <init>(Landroid/widget/Adapter;Landroid/view/ViewGroup;)V
    .locals 4

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-interface {p1}, Landroid/widget/Adapter;->getViewTypeCount()I

    move-result v1

    .line 29
    iput-object p1, p0, Lcom/facebook/reflex/view/c/a;->a:Landroid/widget/Adapter;

    .line 30
    new-array v0, v1, [Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/facebook/reflex/view/c/a;->b:[Ljava/util/ArrayList;

    .line 31
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 32
    iget-object v2, p0, Lcom/facebook/reflex/view/c/a;->b:[Ljava/util/ArrayList;

    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v3

    aput-object v3, v2, v0

    .line 31
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 34
    :cond_0
    iput-object p2, p0, Lcom/facebook/reflex/view/c/a;->c:Landroid/view/ViewGroup;

    .line 35
    return-void
.end method

.method private a(Ljava/util/ArrayList;J)Landroid/view/View;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;J)",
            "Landroid/view/View;"
        }
    .end annotation

    .prologue
    .line 68
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 69
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 70
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 71
    instance-of v2, v0, Lcom/facebook/reflex/view/c/b;

    if-eqz v2, :cond_0

    check-cast v0, Lcom/facebook/reflex/view/c/b;

    iget-wide v2, v0, Lcom/facebook/reflex/view/c/b;->b:J

    cmp-long v0, v2, p2

    if-nez v0, :cond_0

    .line 72
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 75
    :goto_1
    return-object v0

    .line 68
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 75
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    goto :goto_1
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/reflex/view/c/a;->a:Landroid/widget/Adapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    return v0
.end method

.method public a(I)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v5, -0x1

    .line 44
    iget-object v0, p0, Lcom/facebook/reflex/view/c/a;->a:Landroid/widget/Adapter;

    invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItemViewType(I)I

    move-result v2

    .line 45
    const/4 v0, 0x0

    .line 46
    if-eq v2, v5, :cond_0

    .line 47
    iget-object v0, p0, Lcom/facebook/reflex/view/c/a;->b:[Ljava/util/ArrayList;

    aget-object v0, v0, v2

    .line 48
    iget-object v1, p0, Lcom/facebook/reflex/view/c/a;->a:Landroid/widget/Adapter;

    invoke-interface {v1, p1}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v3

    invoke-direct {p0, v0, v3, v4}, Lcom/facebook/reflex/view/c/a;->a(Ljava/util/ArrayList;J)Landroid/view/View;

    move-result-object v0

    .line 50
    :cond_0
    iget-object v1, p0, Lcom/facebook/reflex/view/c/a;->a:Landroid/widget/Adapter;

    iget-object v3, p0, Lcom/facebook/reflex/view/c/a;->c:Landroid/view/ViewGroup;

    invoke-interface {v1, p1, v0, v3}, Landroid/widget/Adapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 51
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 53
    if-nez v0, :cond_1

    .line 54
    new-instance v0, Lcom/facebook/reflex/view/c/b;

    const/4 v1, -0x2

    invoke-direct {v0, v5, v1}, Lcom/facebook/reflex/view/c/b;-><init>(II)V

    .line 61
    :goto_0
    iput v2, v0, Lcom/facebook/reflex/view/c/b;->a:I

    .line 62
    iget-object v1, p0, Lcom/facebook/reflex/view/c/a;->a:Landroid/widget/Adapter;

    invoke-interface {v1, p1}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v1

    iput-wide v1, v0, Lcom/facebook/reflex/view/c/b;->b:J

    .line 63
    invoke-virtual {v3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 64
    return-object v3

    .line 56
    :cond_1
    instance-of v1, v0, Lcom/facebook/reflex/view/c/b;

    if-eqz v1, :cond_2

    .line 57
    check-cast v0, Lcom/facebook/reflex/view/c/b;

    goto :goto_0

    .line 59
    :cond_2
    new-instance v1, Lcom/facebook/reflex/view/c/b;

    iget v4, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {v1, v4, v0}, Lcom/facebook/reflex/view/c/b;-><init>(II)V

    move-object v0, v1

    goto :goto_0
.end method

.method public a(Landroid/database/DataSetObserver;)V
    .locals 2
    .param p1    # Landroid/database/DataSetObserver;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 108
    iget-object v0, p0, Lcom/facebook/reflex/view/c/a;->d:Landroid/database/DataSetObserver;

    if-eqz v0, :cond_0

    .line 109
    iget-object v0, p0, Lcom/facebook/reflex/view/c/a;->a:Landroid/widget/Adapter;

    iget-object v1, p0, Lcom/facebook/reflex/view/c/a;->d:Landroid/database/DataSetObserver;

    invoke-interface {v0, v1}, Landroid/widget/Adapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 111
    :cond_0
    iput-object p1, p0, Lcom/facebook/reflex/view/c/a;->d:Landroid/database/DataSetObserver;

    .line 112
    iget-object v0, p0, Lcom/facebook/reflex/view/c/a;->d:Landroid/database/DataSetObserver;

    if-eqz v0, :cond_1

    .line 113
    iget-object v0, p0, Lcom/facebook/reflex/view/c/a;->a:Landroid/widget/Adapter;

    iget-object v1, p0, Lcom/facebook/reflex/view/c/a;->d:Landroid/database/DataSetObserver;

    invoke-interface {v0, v1}, Landroid/widget/Adapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 115
    :cond_1
    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 80
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/view/c/b;

    .line 81
    iget v0, v0, Lcom/facebook/reflex/view/c/b;->a:I

    .line 82
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 83
    iget-object v1, p0, Lcom/facebook/reflex/view/c/a;->b:[Ljava/util/ArrayList;

    aget-object v0, v1, v0

    .line 84
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    :cond_0
    return-void
.end method

.method public b()V
    .locals 0

    .prologue
    .line 92
    return-void
.end method

.method public c()V
    .locals 7

    .prologue
    .line 96
    iget-object v3, p0, Lcom/facebook/reflex/view/c/a;->b:[Ljava/util/ArrayList;

    array-length v4, v3

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-ge v2, v4, :cond_2

    aget-object v5, v3, v2

    .line 97
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 98
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    .line 99
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    goto :goto_1

    .line 102
    :cond_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 96
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 104
    :cond_2
    return-void
.end method
