.class public Lcom/roidapp/cloudlib/sns/main/MainScrollView;
.super Landroid/widget/ScrollView;
.source "SourceFile"


# instance fields
.field private a:Lcom/roidapp/cloudlib/sns/main/f;

.field private b:F

.field private c:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 16
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/roidapp/cloudlib/sns/main/MainScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 21
    return-void
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 28
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/main/MainScrollView;->a:Lcom/roidapp/cloudlib/sns/main/f;

    if-nez v1, :cond_1

    .line 29
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 53
    :cond_0
    :goto_0
    return v0

    .line 31
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 53
    :goto_1
    :pswitch_0
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0

    .line 33
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/main/MainScrollView;->b:F

    goto :goto_1

    .line 36
    :pswitch_2
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/main/MainScrollView;->a:Lcom/roidapp/cloudlib/sns/main/f;

    invoke-interface {v1}, Lcom/roidapp/cloudlib/sns/main/f;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 37
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iput v1, p0, Lcom/roidapp/cloudlib/sns/main/MainScrollView;->c:F

    .line 38
    iget v1, p0, Lcom/roidapp/cloudlib/sns/main/MainScrollView;->c:F

    iget v2, p0, Lcom/roidapp/cloudlib/sns/main/MainScrollView;->b:F

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    .line 39
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/main/MainScrollView;->a:Lcom/roidapp/cloudlib/sns/main/f;

    invoke-interface {v1}, Lcom/roidapp/cloudlib/sns/main/f;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 40
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    goto :goto_1

    .line 48
    :cond_2
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method protected onScrollChanged(IIII)V
    .locals 0

    .prologue
    .line 72
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ScrollView;->onScrollChanged(IIII)V

    .line 76
    return-void
.end method
