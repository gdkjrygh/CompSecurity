.class public Lcom/roidapp/photogrid/video/HorizontalViewEx;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/roidapp/photogrid/video/d;


# instance fields
.field private a:Landroid/widget/BaseAdapter;

.field private b:Landroid/widget/AdapterView$OnItemClickListener;

.field private c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 27
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->a:Landroid/widget/BaseAdapter;

    .line 28
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->b:Landroid/widget/AdapterView$OnItemClickListener;

    .line 29
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->c:Landroid/util/SparseArray;

    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->a:Landroid/widget/BaseAdapter;

    .line 28
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->b:Landroid/widget/AdapterView$OnItemClickListener;

    .line 29
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->c:Landroid/util/SparseArray;

    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 27
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->a:Landroid/widget/BaseAdapter;

    .line 28
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->b:Landroid/widget/AdapterView$OnItemClickListener;

    .line 29
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->c:Landroid/util/SparseArray;

    .line 25
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 50
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/HorizontalViewEx;->removeAllViews()V

    .line 52
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->c:Landroid/util/SparseArray;

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->c:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->c:Landroid/util/SparseArray;

    .line 56
    :cond_0
    return-void
.end method

.method public final a(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->b:Landroid/widget/AdapterView$OnItemClickListener;

    .line 46
    return-void
.end method

.method public final a(Landroid/widget/BaseAdapter;)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v1, 0x0

    .line 32
    iput-object p1, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->a:Landroid/widget/BaseAdapter;

    .line 1059
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/HorizontalViewEx;->removeAllViews()V

    .line 1061
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->c:Landroid/util/SparseArray;

    if-eqz v0, :cond_0

    .line 1062
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->c:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 1063
    iput-object v7, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->c:Landroid/util/SparseArray;

    .line 1066
    :cond_0
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->c:Landroid/util/SparseArray;

    .line 1068
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->a:Landroid/widget/BaseAdapter;

    if-eqz v0, :cond_3

    move v0, v1

    move v2, v1

    .line 1072
    :goto_0
    iget-object v3, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->a:Landroid/widget/BaseAdapter;

    invoke-virtual {v3}, Landroid/widget/BaseAdapter;->getCount()I

    move-result v3

    if-ge v0, v3, :cond_2

    .line 1073
    iget-object v3, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->a:Landroid/widget/BaseAdapter;

    invoke-virtual {v3, v0, v7, v7}, Landroid/widget/BaseAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 1074
    if-eqz v3, :cond_1

    .line 1079
    invoke-virtual {v3, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1080
    iget-object v4, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->c:Landroid/util/SparseArray;

    invoke-virtual {v4, v0, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1082
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x1

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct {v4, v1, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {p0, v3, v4}, Lcom/roidapp/photogrid/video/HorizontalViewEx;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1084
    add-int/lit8 v2, v2, 0x1

    .line 1072
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1087
    :cond_2
    int-to-float v0, v2

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/HorizontalViewEx;->setWeightSum(F)V

    .line 35
    :cond_3
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    .line 92
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->c:Landroid/util/SparseArray;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->b:Landroid/widget/AdapterView$OnItemClickListener;

    if-nez v0, :cond_1

    .line 97
    :cond_0
    :goto_0
    return-void

    .line 96
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->b:Landroid/widget/AdapterView$OnItemClickListener;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/roidapp/photogrid/video/HorizontalViewEx;->c:Landroid/util/SparseArray;

    invoke-virtual {v2, p1}, Landroid/util/SparseArray;->indexOfValue(Ljava/lang/Object;)I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    int-to-long v4, v2

    move-object v2, p1

    invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    goto :goto_0
.end method
