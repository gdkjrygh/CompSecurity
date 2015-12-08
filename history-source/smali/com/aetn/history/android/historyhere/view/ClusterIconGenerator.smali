.class public Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;
.super Ljava/lang/Object;
.source "ClusterIconGenerator.java"


# instance fields
.field private mAnchorU:F

.field private mAnchorV:F

.field private mContainer:Landroid/view/ViewGroup;

.field private mContentView:Landroid/view/View;

.field private final mContext:Landroid/content/Context;

.field private mTextView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mAnchorU:F

    .line 35
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mAnchorV:F

    .line 41
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mContext:Landroid/content/Context;

    .line 42
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030036

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mContainer:Landroid/view/ViewGroup;

    .line 43
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mContainer:Landroid/view/ViewGroup;

    const v1, 0x7f0a002f

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mTextView:Landroid/widget/TextView;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mContentView:Landroid/view/View;

    .line 44
    return-void
.end method


# virtual methods
.method public makeIcon()Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 66
    invoke-static {v6, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 67
    .local v1, "measureSpec":I
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {v5, v1, v1}, Landroid/view/ViewGroup;->measure(II)V

    .line 69
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v3

    .line 70
    .local v3, "measuredWidth":I
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v2

    .line 72
    .local v2, "measuredHeight":I
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {v5, v6, v6, v3, v2}, Landroid/view/ViewGroup;->layout(IIII)V

    .line 76
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v2, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 77
    .local v4, "r":Landroid/graphics/Bitmap;
    invoke-virtual {v4, v6}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 79
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 82
    .local v0, "canvas":Landroid/graphics/Canvas;
    iget-object v5, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 83
    return-object v4
.end method

.method public makeIcon(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 52
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    :cond_0
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->makeIcon()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 6
    .param p1, "background"    # Landroid/graphics/drawable/Drawable;

    .prologue
    const/4 v2, 0x0

    .line 136
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 140
    if-eqz p1, :cond_0

    .line 141
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 142
    .local v0, "rect":Landroid/graphics/Rect;
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 143
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mContainer:Landroid/view/ViewGroup;

    iget v2, v0, Landroid/graphics/Rect;->left:I

    iget v3, v0, Landroid/graphics/Rect;->top:I

    iget v4, v0, Landroid/graphics/Rect;->right:I

    iget v5, v0, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/view/ViewGroup;->setPadding(IIII)V

    .line 147
    .end local v0    # "rect":Landroid/graphics/Rect;
    :goto_0
    return-void

    .line 145
    :cond_0
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {v1, v2, v2, v2, v2}, Landroid/view/ViewGroup;->setPadding(IIII)V

    goto :goto_0
.end method

.method public setContentPadding(IIII)V
    .locals 1
    .param p1, "left"    # I
    .param p2, "top"    # I
    .param p3, "right"    # I
    .param p4, "bottom"    # I

    .prologue
    .line 159
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mContentView:Landroid/view/View;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/view/View;->setPadding(IIII)V

    .line 160
    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 3
    .param p1, "contentView"    # Landroid/view/View;

    .prologue
    .line 93
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 94
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 95
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mContentView:Landroid/view/View;

    .line 96
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mContainer:Landroid/view/ViewGroup;

    const v2, 0x7f0a002f

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 97
    .local v0, "view":Landroid/view/View;
    instance-of v1, v0, Landroid/widget/TextView;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/widget/TextView;

    .end local v0    # "view":Landroid/view/View;
    :goto_0
    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mTextView:Landroid/widget/TextView;

    .line 98
    return-void

    .line 97
    .restart local v0    # "view":Landroid/view/View;
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setTextAppearance(I)V
    .locals 1
    .param p1, "resid"    # I

    .prologue
    .line 122
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0, p1}, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->setTextAppearance(Landroid/content/Context;I)V

    .line 123
    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "resid"    # I

    .prologue
    .line 110
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/ClusterIconGenerator;->mTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 113
    :cond_0
    return-void
.end method
