.class Lcom/facebook/orca/camera/CropImageView;
.super Lcom/facebook/orca/camera/s;
.source "CropImage.java"


# instance fields
.field a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/facebook/orca/camera/m;",
            ">;"
        }
    .end annotation
.end field

.field b:Lcom/facebook/orca/camera/m;

.field c:F

.field d:F

.field e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 580
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/camera/s;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 559
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->a:Ljava/util/ArrayList;

    .line 560
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->b:Lcom/facebook/orca/camera/m;

    .line 581
    return-void
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 623
    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 624
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/m;

    .line 625
    invoke-virtual {v0, v2}, Lcom/facebook/orca/camera/m;->a(Z)V

    .line 626
    invoke-virtual {v0}, Lcom/facebook/orca/camera/m;->c()V

    .line 623
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 629
    :cond_0
    add-int/lit8 v2, v2, 0x1

    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 630
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/m;

    .line 631
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v0, v1, v3}, Lcom/facebook/orca/camera/m;->a(FF)I

    move-result v1

    .line 632
    if-eq v1, v4, :cond_0

    .line 633
    invoke-virtual {v0}, Lcom/facebook/orca/camera/m;->a()Z

    move-result v1

    if-nez v1, :cond_2

    .line 634
    invoke-virtual {v0, v4}, Lcom/facebook/orca/camera/m;->a(Z)V

    .line 635
    invoke-virtual {v0}, Lcom/facebook/orca/camera/m;->c()V

    .line 640
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/orca/camera/CropImageView;->invalidate()V

    .line 641
    return-void
.end method

.method private b(Lcom/facebook/orca/camera/m;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 738
    iget-object v1, p1, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    .line 740
    invoke-virtual {p0}, Lcom/facebook/orca/camera/CropImageView;->getLeft()I

    move-result v0

    iget v2, v1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v2

    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 741
    invoke-virtual {p0}, Lcom/facebook/orca/camera/CropImageView;->getRight()I

    move-result v0

    iget v3, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v0, v3

    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 743
    invoke-virtual {p0}, Lcom/facebook/orca/camera/CropImageView;->getTop()I

    move-result v0

    iget v4, v1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v0, v4

    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 744
    invoke-virtual {p0}, Lcom/facebook/orca/camera/CropImageView;->getBottom()I

    move-result v4

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    sub-int v1, v4, v1

    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 746
    if-eqz v2, :cond_2

    .line 747
    :goto_0
    if-eqz v0, :cond_3

    .line 749
    :goto_1
    if-nez v2, :cond_0

    if-eqz v0, :cond_1

    .line 750
    :cond_0
    int-to-float v1, v2

    int-to-float v0, v0

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/camera/CropImageView;->b(FF)V

    .line 752
    :cond_1
    return-void

    :cond_2
    move v2, v3

    .line 746
    goto :goto_0

    :cond_3
    move v0, v1

    .line 747
    goto :goto_1
.end method

.method private c(Lcom/facebook/orca/camera/m;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    const v4, 0x3f19999a    # 0.6f

    .line 757
    iget-object v0, p1, Lcom/facebook/orca/camera/m;->d:Landroid/graphics/Rect;

    .line 759
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    .line 760
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    .line 762
    invoke-virtual {p0}, Lcom/facebook/orca/camera/CropImageView;->getWidth()I

    move-result v2

    int-to-float v2, v2

    .line 763
    invoke-virtual {p0}, Lcom/facebook/orca/camera/CropImageView;->getHeight()I

    move-result v3

    int-to-float v3, v3

    .line 765
    div-float v1, v2, v1

    mul-float/2addr v1, v4

    .line 766
    div-float v0, v3, v0

    mul-float/2addr v0, v4

    .line 768
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 769
    invoke-virtual {p0}, Lcom/facebook/orca/camera/CropImageView;->b()F

    move-result v1

    mul-float/2addr v0, v1

    .line 770
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 772
    invoke-virtual {p0}, Lcom/facebook/orca/camera/CropImageView;->b()F

    move-result v1

    sub-float v1, v0, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    div-float/2addr v1, v0

    float-to-double v1, v1

    const-wide v3, 0x3fb999999999999aL    # 0.1

    cmpl-double v1, v1, v3

    if-lez v1, :cond_0

    .line 773
    const/4 v1, 0x2

    new-array v1, v1, [F

    iget-object v2, p1, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    move-result v2

    aput v2, v1, v5

    iget-object v2, p1, Lcom/facebook/orca/camera/m;->e:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    aput v2, v1, v6

    .line 775
    invoke-virtual {p0}, Lcom/facebook/orca/camera/CropImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 776
    aget v2, v1, v5

    aget v1, v1, v6

    const/high16 v3, 0x43960000    # 300.0f

    invoke-virtual {p0, v0, v2, v1, v3}, Lcom/facebook/orca/camera/CropImageView;->a(FFFF)V

    .line 779
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/camera/CropImageView;->b(Lcom/facebook/orca/camera/m;)V

    .line 780
    return-void
.end method


# virtual methods
.method protected a(FF)V
    .locals 3

    .prologue
    .line 612
    invoke-super {p0, p1, p2}, Lcom/facebook/orca/camera/s;->a(FF)V

    .line 613
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 614
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/m;

    .line 615
    iget-object v2, v0, Lcom/facebook/orca/camera/m;->f:Landroid/graphics/Matrix;

    invoke-virtual {v2, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 616
    invoke-virtual {v0}, Lcom/facebook/orca/camera/m;->c()V

    .line 613
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 618
    :cond_0
    return-void
.end method

.method protected a(FFF)V
    .locals 4

    .prologue
    .line 585
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/orca/camera/s;->a(FFF)V

    .line 586
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/m;

    .line 587
    iget-object v2, v0, Lcom/facebook/orca/camera/m;->f:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lcom/facebook/orca/camera/CropImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 588
    invoke-virtual {v0}, Lcom/facebook/orca/camera/m;->c()V

    goto :goto_0

    .line 590
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/orca/camera/m;)V
    .locals 1

    .prologue
    .line 791
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 792
    invoke-virtual {p0}, Lcom/facebook/orca/camera/CropImageView;->invalidate()V

    .line 793
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .prologue
    .line 784
    invoke-super {p0, p1}, Lcom/facebook/orca/camera/s;->onDraw(Landroid/graphics/Canvas;)V

    .line 785
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 786
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/m;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/camera/m;->a(Landroid/graphics/Canvas;)V

    .line 785
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 788
    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 4

    .prologue
    .line 567
    invoke-super/range {p0 .. p5}, Lcom/facebook/orca/camera/s;->onLayout(ZIIII)V

    .line 568
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->h:Lcom/facebook/widget/images/e;

    invoke-virtual {v0}, Lcom/facebook/widget/images/e;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 569
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/m;

    .line 570
    iget-object v2, v0, Lcom/facebook/orca/camera/m;->f:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lcom/facebook/orca/camera/CropImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 571
    invoke-virtual {v0}, Lcom/facebook/orca/camera/m;->c()V

    .line 572
    iget-boolean v2, v0, Lcom/facebook/orca/camera/m;->b:Z

    if-eqz v2, :cond_0

    .line 573
    invoke-direct {p0, v0}, Lcom/facebook/orca/camera/CropImageView;->c(Lcom/facebook/orca/camera/m;)V

    goto :goto_0

    .line 577
    :cond_1
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v5, 0x1

    .line 645
    invoke-virtual {p0}, Lcom/facebook/orca/camera/CropImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/CropImage;

    .line 646
    iget-boolean v1, v0, Lcom/facebook/orca/camera/CropImage;->b:Z

    if-eqz v1, :cond_0

    .line 733
    :goto_0
    return v2

    .line 650
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 718
    :cond_1
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_1

    :cond_2
    :goto_2
    move v2, v5

    .line 733
    goto :goto_0

    .line 652
    :pswitch_0
    iget-boolean v0, v0, Lcom/facebook/orca/camera/CropImage;->a:Z

    if-eqz v0, :cond_3

    .line 653
    invoke-direct {p0, p1}, Lcom/facebook/orca/camera/CropImageView;->a(Landroid/view/MotionEvent;)V

    goto :goto_1

    :cond_3
    move v1, v2

    .line 655
    :goto_3
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 656
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/m;

    .line 657
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/facebook/orca/camera/m;->a(FF)I

    move-result v2

    .line 658
    if-eq v2, v5, :cond_5

    .line 659
    iput v2, p0, Lcom/facebook/orca/camera/CropImageView;->e:I

    .line 660
    iput-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->b:Lcom/facebook/orca/camera/m;

    .line 661
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/facebook/orca/camera/CropImageView;->c:F

    .line 662
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/facebook/orca/camera/CropImageView;->d:F

    .line 663
    iget-object v1, p0, Lcom/facebook/orca/camera/CropImageView;->b:Lcom/facebook/orca/camera/m;

    const/16 v0, 0x20

    if-ne v2, v0, :cond_4

    sget-object v0, Lcom/facebook/orca/camera/n;->Move:Lcom/facebook/orca/camera/n;

    :goto_4
    invoke-virtual {v1, v0}, Lcom/facebook/orca/camera/m;->a(Lcom/facebook/orca/camera/n;)V

    goto :goto_1

    :cond_4
    sget-object v0, Lcom/facebook/orca/camera/n;->Grow:Lcom/facebook/orca/camera/n;

    goto :goto_4

    .line 655
    :cond_5
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    .line 673
    :pswitch_1
    iget-boolean v1, v0, Lcom/facebook/orca/camera/CropImage;->a:Z

    if-eqz v1, :cond_9

    move v3, v2

    .line 674
    :goto_5
    iget-object v1, p0, Lcom/facebook/orca/camera/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v3, v1, :cond_a

    .line 675
    iget-object v1, p0, Lcom/facebook/orca/camera/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/camera/m;

    .line 676
    invoke-virtual {v1}, Lcom/facebook/orca/camera/m;->a()Z

    move-result v4

    if-eqz v4, :cond_8

    .line 677
    iput-object v1, v0, Lcom/facebook/orca/camera/CropImage;->c:Lcom/facebook/orca/camera/m;

    move v4, v2

    .line 678
    :goto_6
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_7

    .line 679
    if-ne v4, v3, :cond_6

    .line 678
    :goto_7
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_6

    .line 682
    :cond_6
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/m;

    invoke-virtual {v0, v5}, Lcom/facebook/orca/camera/m;->b(Z)V

    goto :goto_7

    .line 684
    :cond_7
    invoke-direct {p0, v1}, Lcom/facebook/orca/camera/CropImageView;->c(Lcom/facebook/orca/camera/m;)V

    .line 685
    invoke-virtual {p0}, Lcom/facebook/orca/camera/CropImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/camera/CropImage;

    iput-boolean v2, v0, Lcom/facebook/orca/camera/CropImage;->a:Z

    move v2, v5

    .line 686
    goto/16 :goto_0

    .line 674
    :cond_8
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_5

    .line 689
    :cond_9
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->b:Lcom/facebook/orca/camera/m;

    if-eqz v0, :cond_a

    .line 690
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->b:Lcom/facebook/orca/camera/m;

    invoke-direct {p0, v0}, Lcom/facebook/orca/camera/CropImageView;->c(Lcom/facebook/orca/camera/m;)V

    .line 691
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->b:Lcom/facebook/orca/camera/m;

    sget-object v1, Lcom/facebook/orca/camera/n;->None:Lcom/facebook/orca/camera/n;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/camera/m;->a(Lcom/facebook/orca/camera/n;)V

    .line 694
    :cond_a
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->b:Lcom/facebook/orca/camera/m;

    goto/16 :goto_1

    .line 697
    :pswitch_2
    iget-boolean v0, v0, Lcom/facebook/orca/camera/CropImage;->a:Z

    if-eqz v0, :cond_b

    .line 698
    invoke-direct {p0, p1}, Lcom/facebook/orca/camera/CropImageView;->a(Landroid/view/MotionEvent;)V

    goto/16 :goto_1

    .line 699
    :cond_b
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->b:Lcom/facebook/orca/camera/m;

    if-eqz v0, :cond_1

    .line 700
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->b:Lcom/facebook/orca/camera/m;

    iget v1, p0, Lcom/facebook/orca/camera/CropImageView;->e:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    iget v3, p0, Lcom/facebook/orca/camera/CropImageView;->c:F

    sub-float/2addr v2, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    iget v4, p0, Lcom/facebook/orca/camera/CropImageView;->d:F

    sub-float/2addr v3, v4

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/orca/camera/m;->a(IFF)V

    .line 703
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/facebook/orca/camera/CropImageView;->c:F

    .line 704
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/facebook/orca/camera/CropImageView;->d:F

    .line 712
    iget-object v0, p0, Lcom/facebook/orca/camera/CropImageView;->b:Lcom/facebook/orca/camera/m;

    invoke-direct {p0, v0}, Lcom/facebook/orca/camera/CropImageView;->b(Lcom/facebook/orca/camera/m;)V

    goto/16 :goto_1

    .line 720
    :pswitch_3
    invoke-virtual {p0, v5, v5}, Lcom/facebook/orca/camera/CropImageView;->a(ZZ)V

    goto/16 :goto_2

    .line 727
    :pswitch_4
    invoke-virtual {p0}, Lcom/facebook/orca/camera/CropImageView;->b()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    .line 728
    invoke-virtual {p0, v5, v5}, Lcom/facebook/orca/camera/CropImageView;->a(ZZ)V

    goto/16 :goto_2

    .line 650
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    .line 718
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
