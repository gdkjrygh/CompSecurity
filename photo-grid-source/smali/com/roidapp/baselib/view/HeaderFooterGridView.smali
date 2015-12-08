.class public Lcom/roidapp/baselib/view/HeaderFooterGridView;
.super Landroid/widget/GridView;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/baselib/view/n;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/baselib/view/n;",
            ">;"
        }
    .end annotation
.end field

.field private c:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 48
    invoke-direct {p0, p1}, Landroid/widget/GridView;-><init>(Landroid/content/Context;)V

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/HeaderFooterGridView;->a:Ljava/util/ArrayList;

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/HeaderFooterGridView;->b:Ljava/util/ArrayList;

    .line 49
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 52
    invoke-direct {p0, p1, p2}, Landroid/widget/GridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/HeaderFooterGridView;->a:Ljava/util/ArrayList;

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/HeaderFooterGridView;->b:Ljava/util/ArrayList;

    .line 53
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 56
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/GridView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/HeaderFooterGridView;->a:Ljava/util/ArrayList;

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/HeaderFooterGridView;->b:Ljava/util/ArrayList;

    .line 57
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/roidapp/baselib/view/HeaderFooterGridView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final a(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 116
    .line 1083
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/HeaderFooterGridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    .line 1085
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/roidapp/baselib/view/p;

    if-nez v1, :cond_0

    .line 1086
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot add header view to grid -- setAdapter has already been called."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1089
    :cond_0
    new-instance v1, Lcom/roidapp/baselib/view/n;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/roidapp/baselib/view/n;-><init>(B)V

    .line 1090
    new-instance v2, Lcom/roidapp/baselib/view/o;

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/HeaderFooterGridView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, p0, v3}, Lcom/roidapp/baselib/view/o;-><init>(Lcom/roidapp/baselib/view/HeaderFooterGridView;Landroid/content/Context;)V

    .line 1091
    invoke-virtual {v2, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 1092
    iput-object p1, v1, Lcom/roidapp/baselib/view/n;->a:Landroid/view/View;

    .line 1093
    iput-object v2, v1, Lcom/roidapp/baselib/view/n;->b:Landroid/view/ViewGroup;

    .line 1094
    const/4 v2, 0x0

    iput-object v2, v1, Lcom/roidapp/baselib/view/n;->c:Ljava/lang/Object;

    .line 1095
    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/roidapp/baselib/view/n;->d:Z

    .line 1096
    iget-object v2, p0, Lcom/roidapp/baselib/view/HeaderFooterGridView;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1100
    if-eqz v0, :cond_1

    .line 1101
    check-cast v0, Lcom/roidapp/baselib/view/p;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/p;->a()V

    .line 117
    :cond_1
    return-void
.end method

.method public getNumColumns()I
    .locals 1

    .prologue
    .line 67
    iget v0, p0, Lcom/roidapp/baselib/view/HeaderFooterGridView;->c:I

    return v0
.end method

.method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 0

    .prologue
    .line 27
    check-cast p1, Landroid/widget/ListAdapter;

    invoke-virtual {p0, p1}, Lcom/roidapp/baselib/view/HeaderFooterGridView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 3

    .prologue
    .line 229
    iget-object v0, p0, Lcom/roidapp/baselib/view/HeaderFooterGridView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/baselib/view/HeaderFooterGridView;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 230
    :cond_0
    new-instance v0, Lcom/roidapp/baselib/view/p;

    iget-object v1, p0, Lcom/roidapp/baselib/view/HeaderFooterGridView;->a:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/roidapp/baselib/view/HeaderFooterGridView;->b:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2, p1}, Lcom/roidapp/baselib/view/p;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/widget/ListAdapter;)V

    .line 231
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/HeaderFooterGridView;->getNumColumns()I

    move-result v1

    .line 232
    const/4 v2, 0x1

    if-le v1, v2, :cond_1

    .line 233
    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/p;->a(I)V

    .line 235
    :cond_1
    invoke-super {p0, v0}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 239
    :goto_0
    return-void

    .line 237
    :cond_2
    invoke-super {p0, p1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    goto :goto_0
.end method

.method public setNumColumns(I)V
    .locals 0

    .prologue
    .line 61
    invoke-super {p0, p1}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 62
    iput p1, p0, Lcom/roidapp/baselib/view/HeaderFooterGridView;->c:I

    .line 63
    return-void
.end method
