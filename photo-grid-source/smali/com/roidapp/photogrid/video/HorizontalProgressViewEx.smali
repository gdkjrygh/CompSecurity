.class public Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

.field private b:Lcom/roidapp/photogrid/release/hs;

.field private c:Z

.field private d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 23
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 20
    iput-object v1, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    .line 39
    iput-object v1, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->b:Lcom/roidapp/photogrid/release/hs;

    .line 47
    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->c:Z

    .line 48
    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->d:Z

    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 27
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 20
    iput-object v1, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    .line 39
    iput-object v1, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->b:Lcom/roidapp/photogrid/release/hs;

    .line 47
    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->c:Z

    .line 48
    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->d:Z

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 32
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    iput-object v1, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    .line 39
    iput-object v1, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->b:Lcom/roidapp/photogrid/release/hs;

    .line 47
    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->c:Z

    .line 48
    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->d:Z

    .line 33
    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/photogrid/release/hs;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->b:Lcom/roidapp/photogrid/release/hs;

    .line 44
    return-void
.end method

.method public final a(Lcom/roidapp/photogrid/video/ScrollImageViewEx;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    .line 37
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .prologue
    const/16 v4, 0xb

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 57
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 124
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :goto_0
    return v0

    .line 59
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    if-nez v0, :cond_0

    move v0, v1

    .line 60
    goto :goto_0

    .line 62
    :cond_0
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 63
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v0, v4, :cond_3

    .line 64
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    .line 1156
    sget-boolean v4, Lcom/c/a/a/a;->a:Z

    if-eqz v4, :cond_1

    invoke-static {v0}, Lcom/c/a/a/a;->a(Landroid/view/View;)Lcom/c/a/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/a/a/a;->a()F

    move-result v0

    .line 64
    :goto_1
    float-to-int v0, v0

    iput v0, v3, Landroid/graphics/Rect;->left:I

    .line 65
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    .line 2168
    sget-boolean v4, Lcom/c/a/a/a;->a:Z

    if-eqz v4, :cond_2

    invoke-static {v0}, Lcom/c/a/a/a;->a(Landroid/view/View;)Lcom/c/a/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/a/a/a;->b()F

    move-result v0

    .line 65
    :goto_2
    float-to-int v0, v0

    iput v0, v3, Landroid/graphics/Rect;->top:I

    .line 66
    iget v0, v3, Landroid/graphics/Rect;->top:I

    iget-object v4, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->getHeight()I

    move-result v4

    add-int/2addr v0, v4

    iput v0, v3, Landroid/graphics/Rect;->bottom:I

    .line 67
    iget v0, v3, Landroid/graphics/Rect;->left:I

    iget-object v4, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->getWidth()I

    move-result v4

    add-int/2addr v0, v4

    iput v0, v3, Landroid/graphics/Rect;->right:I

    .line 77
    :goto_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v4, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    .line 3099
    iget v4, v4, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->b:I

    .line 77
    div-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    sub-float/2addr v0, v4

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v3, v0, v4}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 78
    iput-boolean v2, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->c:Z

    move v0, v2

    .line 79
    goto :goto_0

    .line 1277
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getX()F

    move-result v0

    goto :goto_1

    .line 2285
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    move-result v0

    goto :goto_2

    .line 68
    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x12

    if-ge v0, v4, :cond_4

    .line 69
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->getLeft()I

    move-result v0

    int-to-float v0, v0

    iget-object v4, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->getTranslationX()F

    move-result v4

    add-float/2addr v0, v4

    float-to-int v0, v0

    iput v0, v3, Landroid/graphics/Rect;->left:I

    .line 70
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->getTop()I

    move-result v0

    int-to-float v0, v0

    iget-object v4, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->getTranslationY()F

    move-result v4

    add-float/2addr v0, v4

    float-to-int v0, v0

    iput v0, v3, Landroid/graphics/Rect;->top:I

    .line 71
    iget v0, v3, Landroid/graphics/Rect;->top:I

    iget-object v4, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->getHeight()I

    move-result v4

    add-int/2addr v0, v4

    iput v0, v3, Landroid/graphics/Rect;->bottom:I

    .line 72
    iget v0, v3, Landroid/graphics/Rect;->left:I

    iget-object v4, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->getWidth()I

    move-result v4

    add-int/2addr v0, v4

    iput v0, v3, Landroid/graphics/Rect;->right:I

    goto :goto_3

    .line 74
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->getHitRect(Landroid/graphics/Rect;)V

    goto :goto_3

    :cond_5
    move v0, v1

    .line 81
    goto/16 :goto_0

    .line 83
    :pswitch_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->c:Z

    if-nez v0, :cond_6

    move v0, v1

    .line 84
    goto/16 :goto_0

    .line 86
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    if-nez v0, :cond_7

    move v0, v1

    .line 87
    goto/16 :goto_0

    .line 88
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    .line 4096
    iget v0, v0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a:I

    .line 88
    if-eqz v0, :cond_8

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    .line 5096
    iget v1, v1, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a:I

    .line 88
    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_8

    move v0, v2

    .line 89
    goto/16 :goto_0

    .line 91
    :cond_8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    .line 5099
    iget v1, v1, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->b:I

    .line 91
    int-to-float v1, v1

    sub-float v1, v0, v1

    .line 92
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v0, v4, :cond_a

    .line 93
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 95
    iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    int-to-float v0, v0

    .line 97
    iget-object v3, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-virtual {v3, v1}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->setX(F)V

    .line 103
    :goto_4
    iget-object v3, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->b:Lcom/roidapp/photogrid/release/hs;

    if-eqz v3, :cond_9

    cmpl-float v0, v1, v0

    if-eqz v0, :cond_9

    .line 104
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->b:Lcom/roidapp/photogrid/release/hs;

    invoke-interface {v0, v1}, Lcom/roidapp/photogrid/release/hs;->a(F)V

    :cond_9
    move v0, v2

    .line 105
    goto/16 :goto_0

    .line 99
    :cond_a
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->getX()F

    move-result v0

    .line 100
    iget-object v3, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-virtual {v3, v1}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->setX(F)V

    goto :goto_4

    .line 108
    :pswitch_2
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->c:Z

    if-nez v0, :cond_b

    move v0, v1

    .line 109
    goto/16 :goto_0

    .line 112
    :cond_b
    iget-object v0, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    if-nez v0, :cond_c

    move v0, v1

    .line 113
    goto/16 :goto_0

    .line 115
    :cond_c
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 116
    iget-object v3, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->getHitRect(Landroid/graphics/Rect;)V

    .line 117
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v0, v3, v4}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 118
    iput-boolean v1, p0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->c:Z

    move v0, v2

    .line 119
    goto/16 :goto_0

    :cond_d
    move v0, v1

    .line 121
    goto/16 :goto_0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
