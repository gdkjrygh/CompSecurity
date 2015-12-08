.class public Lcom/arist/model/equize/VerticalSeekBar;
.super Landroid/widget/SeekBar;


# instance fields
.field private a:Landroid/widget/SeekBar$OnSeekBarChangeListener;

.field private b:Lcom/arist/model/equize/m;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private a(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/SeekBar;->setPressed(Z)V

    iget-object v0, p0, Lcom/arist/model/equize/VerticalSeekBar;->b:Lcom/arist/model/equize/m;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/equize/VerticalSeekBar;->b:Lcom/arist/model/equize/m;

    :cond_0
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    const/high16 v0, -0x3d4c0000    # -90.0f

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->rotate(F)V

    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getHeight()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-super {p0, p1}, Landroid/widget/SeekBar;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method protected declared-synchronized onMeasure(II)V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-super {p0, p2, p1}, Landroid/widget/SeekBar;->onMeasure(II)V

    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/arist/model/equize/VerticalSeekBar;->setMeasuredDimension(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p2, p1, p4, p3}, Landroid/widget/SeekBar;->onSizeChanged(IIII)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    const/4 v1, 0x1

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->isEnabled()Z

    move-result v2

    if-nez v2, :cond_0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    :cond_1
    :goto_1
    move v0, v1

    goto :goto_0

    :pswitch_0
    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getMax()I

    move-result v2

    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getMax()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    mul-float/2addr v3, v4

    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    float-to-int v3, v3

    sub-int/2addr v2, v3

    invoke-virtual {p0, v2}, Lcom/arist/model/equize/VerticalSeekBar;->setProgress(I)V

    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getHeight()I

    move-result v3

    invoke-virtual {p0, v2, v3, v0, v0}, Lcom/arist/model/equize/VerticalSeekBar;->onSizeChanged(IIII)V

    invoke-direct {p0, v1}, Lcom/arist/model/equize/VerticalSeekBar;->a(Z)V

    iget-object v0, p0, Lcom/arist/model/equize/VerticalSeekBar;->a:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/equize/VerticalSeekBar;->a:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-interface {v0, p0}, Landroid/widget/SeekBar$OnSeekBarChangeListener;->onStartTrackingTouch(Landroid/widget/SeekBar;)V

    goto :goto_1

    :pswitch_1
    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getMax()I

    move-result v2

    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getMax()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    mul-float/2addr v3, v4

    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    float-to-int v3, v3

    sub-int/2addr v2, v3

    invoke-virtual {p0, v2}, Lcom/arist/model/equize/VerticalSeekBar;->setProgress(I)V

    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getHeight()I

    move-result v3

    invoke-virtual {p0, v2, v3, v0, v0}, Lcom/arist/model/equize/VerticalSeekBar;->onSizeChanged(IIII)V

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getMax()I

    move-result v2

    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getMax()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    mul-float/2addr v3, v4

    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    float-to-int v3, v3

    sub-int/2addr v2, v3

    invoke-virtual {p0, v2}, Lcom/arist/model/equize/VerticalSeekBar;->setProgress(I)V

    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getHeight()I

    move-result v3

    invoke-virtual {p0, v2, v3, v0, v0}, Lcom/arist/model/equize/VerticalSeekBar;->onSizeChanged(IIII)V

    iget-object v2, p0, Lcom/arist/model/equize/VerticalSeekBar;->a:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/arist/model/equize/VerticalSeekBar;->a:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-interface {v2, p0}, Landroid/widget/SeekBar$OnSeekBarChangeListener;->onStopTrackingTouch(Landroid/widget/SeekBar;)V

    :cond_2
    invoke-direct {p0, v0}, Lcom/arist/model/equize/VerticalSeekBar;->a(Z)V

    goto/16 :goto_1

    :pswitch_3
    iget-object v2, p0, Lcom/arist/model/equize/VerticalSeekBar;->a:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/arist/model/equize/VerticalSeekBar;->a:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    invoke-interface {v2, p0}, Landroid/widget/SeekBar$OnSeekBarChangeListener;->onStopTrackingTouch(Landroid/widget/SeekBar;)V

    :cond_3
    invoke-direct {p0, v0}, Lcom/arist/model/equize/VerticalSeekBar;->a(Z)V

    goto/16 :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method

.method public setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    iput-object p1, p0, Lcom/arist/model/equize/VerticalSeekBar;->a:Landroid/widget/SeekBar$OnSeekBarChangeListener;

    return-void
.end method

.method public declared-synchronized setProgress(I)V
    .locals 4

    monitor-enter p0

    :try_start_0
    invoke-super {p0, p1}, Landroid/widget/SeekBar;->setProgress(I)V

    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/arist/model/equize/VerticalSeekBar;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/arist/model/equize/VerticalSeekBar;->onSizeChanged(IIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
