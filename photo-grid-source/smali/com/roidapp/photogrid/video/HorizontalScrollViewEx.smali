.class public Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;
.super Landroid/widget/HorizontalScrollView;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/roidapp/photogrid/video/d;


# instance fields
.field a:Z

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/widget/BaseAdapter;

.field private d:Landroid/widget/AdapterView$OnItemClickListener;

.field private e:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/roidapp/photogrid/release/hr;

.field private g:Z

.field private h:Z

.field private i:Lcom/roidapp/photogrid/release/hs;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, p1}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    .line 33
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->b:Landroid/widget/LinearLayout;

    .line 34
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->c:Landroid/widget/BaseAdapter;

    .line 35
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->d:Landroid/widget/AdapterView$OnItemClickListener;

    .line 36
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->e:Landroid/util/SparseArray;

    .line 135
    iput-boolean v1, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->g:Z

    .line 136
    iput-boolean v1, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->h:Z

    .line 155
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->i:Lcom/roidapp/photogrid/release/hs;

    .line 178
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a:Z

    .line 20
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->c()V

    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, p1, p2}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 33
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->b:Landroid/widget/LinearLayout;

    .line 34
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->c:Landroid/widget/BaseAdapter;

    .line 35
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->d:Landroid/widget/AdapterView$OnItemClickListener;

    .line 36
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->e:Landroid/util/SparseArray;

    .line 135
    iput-boolean v1, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->g:Z

    .line 136
    iput-boolean v1, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->h:Z

    .line 155
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->i:Lcom/roidapp/photogrid/release/hs;

    .line 178
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a:Z

    .line 25
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->c()V

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 29
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 33
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->b:Landroid/widget/LinearLayout;

    .line 34
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->c:Landroid/widget/BaseAdapter;

    .line 35
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->d:Landroid/widget/AdapterView$OnItemClickListener;

    .line 36
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->e:Landroid/util/SparseArray;

    .line 135
    iput-boolean v1, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->g:Z

    .line 136
    iput-boolean v1, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->h:Z

    .line 155
    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->i:Lcom/roidapp/photogrid/release/hs;

    .line 178
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a:Z

    .line 30
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->c()V

    .line 31
    return-void
.end method

.method private c()V
    .locals 3

    .prologue
    const/4 v2, -0x1

    .line 39
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->b:Landroid/widget/LinearLayout;

    if-nez v0, :cond_0

    .line 40
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->b:Landroid/widget/LinearLayout;

    .line 41
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->b:Landroid/widget/LinearLayout;

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 45
    return-void
.end method


# virtual methods
.method public final a(I)Landroid/view/View;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->e:Landroid/util/SparseArray;

    if-nez v0, :cond_0

    .line 69
    const/4 v0, 0x0

    .line 71
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->e:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    goto :goto_0
.end method

.method public final a()Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->b:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public final a(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->d:Landroid/widget/AdapterView$OnItemClickListener;

    .line 80
    return-void
.end method

.method public final a(Landroid/widget/BaseAdapter;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 62
    iput-object p1, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->c:Landroid/widget/BaseAdapter;

    .line 1096
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 1098
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->e:Landroid/util/SparseArray;

    if-eqz v0, :cond_0

    .line 1099
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->e:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 1100
    iput-object v3, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->e:Landroid/util/SparseArray;

    .line 1103
    :cond_0
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->e:Landroid/util/SparseArray;

    .line 1105
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->c:Landroid/widget/BaseAdapter;

    if-eqz v0, :cond_2

    .line 1108
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->c:Landroid/widget/BaseAdapter;

    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->getCount()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 1109
    iget-object v1, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->c:Landroid/widget/BaseAdapter;

    invoke-virtual {v1, v0, v3, v3}, Landroid/widget/BaseAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 1110
    if-eqz v1, :cond_1

    .line 1115
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1116
    iget-object v2, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->e:Landroid/util/SparseArray;

    invoke-virtual {v2, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1118
    iget-object v2, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 1108
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 65
    :cond_2
    return-void
.end method

.method public final a(Lcom/roidapp/photogrid/release/hr;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->f:Lcom/roidapp/photogrid/release/hr;

    .line 59
    return-void
.end method

.method public final a(Lcom/roidapp/photogrid/release/hs;)V
    .locals 0

    .prologue
    .line 157
    iput-object p1, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->i:Lcom/roidapp/photogrid/release/hs;

    .line 158
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 139
    iput-boolean p1, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->g:Z

    .line 140
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->b:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 86
    iput-object v1, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->b:Landroid/widget/LinearLayout;

    .line 89
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->e:Landroid/util/SparseArray;

    if-eqz v0, :cond_1

    .line 90
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->e:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 91
    iput-object v1, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->e:Landroid/util/SparseArray;

    .line 93
    :cond_1
    return-void
.end method

.method public final b(I)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 188
    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a:Z

    .line 189
    invoke-super {p0, p1, v0}, Landroid/widget/HorizontalScrollView;->scrollTo(II)V

    .line 190
    return-void
.end method

.method public fling(I)V
    .locals 1

    .prologue
    .line 182
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a:Z

    .line 183
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->fling(I)V

    .line 185
    return-void
.end method

.method public isClickable()Z
    .locals 1

    .prologue
    .line 147
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->h:Z

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    .line 124
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->e:Landroid/util/SparseArray;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->d:Landroid/widget/AdapterView$OnItemClickListener;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->isClickable()Z

    move-result v0

    if-nez v0, :cond_1

    .line 131
    :cond_0
    :goto_0
    return-void

    .line 128
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a:Z

    .line 130
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->d:Landroid/widget/AdapterView$OnItemClickListener;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->e:Landroid/util/SparseArray;

    invoke-virtual {v2, p1}, Landroid/util/SparseArray;->indexOfValue(Ljava/lang/Object;)I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    int-to-long v4, v2

    move-object v2, p1

    invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    .prologue
    .line 51
    invoke-super/range {p0 .. p5}, Landroid/widget/HorizontalScrollView;->onLayout(ZIIII)V

    .line 52
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->f:Lcom/roidapp/photogrid/release/hr;

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->f:Lcom/roidapp/photogrid/release/hr;

    invoke-interface {v0}, Lcom/roidapp/photogrid/release/hr;->a()V

    .line 55
    :cond_0
    return-void
.end method

.method protected onScrollChanged(IIII)V
    .locals 2

    .prologue
    .line 198
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/HorizontalScrollView;->onScrollChanged(IIII)V

    .line 199
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->i:Lcom/roidapp/photogrid/release/hs;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a:Z

    if-eqz v0, :cond_0

    if-eq p1, p3, :cond_0

    .line 200
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->i:Lcom/roidapp/photogrid/release/hs;

    int-to-float v1, p1

    invoke-interface {v0, v1}, Lcom/roidapp/photogrid/release/hs;->a(F)V

    .line 202
    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 163
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a:Z

    .line 166
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 172
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 175
    return v0

    .line 168
    :pswitch_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a:Z

    goto :goto_0

    .line 166
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public setClickable(Z)V
    .locals 0

    .prologue
    .line 143
    iput-boolean p1, p0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->h:Z

    .line 144
    return-void
.end method
