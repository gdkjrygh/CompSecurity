.class final Lcom/roidapp/photogrid/release/gb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field a:F

.field b:F

.field final synthetic c:Landroid/graphics/drawable/LevelListDrawable;

.field final synthetic d:Lcom/roidapp/photogrid/release/ga;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ga;Landroid/graphics/drawable/LevelListDrawable;)V
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/roidapp/photogrid/release/gb;->d:Lcom/roidapp/photogrid/release/ga;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/gb;->c:Landroid/graphics/drawable/LevelListDrawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 9

    .prologue
    const/4 v5, 0x1

    const/4 v8, 0x0

    .line 87
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 88
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 89
    iget-object v2, p0, Lcom/roidapp/photogrid/release/gb;->c:Landroid/graphics/drawable/LevelListDrawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/LevelListDrawable;->getIntrinsicWidth()I

    move-result v2

    .line 90
    iget-object v3, p0, Lcom/roidapp/photogrid/release/gb;->c:Landroid/graphics/drawable/LevelListDrawable;

    invoke-virtual {v3}, Landroid/graphics/drawable/LevelListDrawable;->getIntrinsicHeight()I

    move-result v3

    .line 91
    div-int/lit8 v1, v1, 0x2

    div-int/lit8 v4, v3, 0x2

    sub-int/2addr v1, v4

    .line 93
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    .line 120
    :cond_0
    :goto_0
    return v8

    .line 95
    :pswitch_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    iput v4, p0, Lcom/roidapp/photogrid/release/gb;->a:F

    .line 96
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    iput v4, p0, Lcom/roidapp/photogrid/release/gb;->b:F

    .line 97
    iget v4, p0, Lcom/roidapp/photogrid/release/gb;->a:F

    sub-int v2, v0, v2

    int-to-float v2, v2

    cmpl-float v2, v4, v2

    if-lez v2, :cond_0

    iget v2, p0, Lcom/roidapp/photogrid/release/gb;->a:F

    int-to-float v0, v0

    cmpg-float v0, v2, v0

    if-gez v0, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/release/gb;->b:F

    int-to-float v2, v1

    cmpl-float v0, v0, v2

    if-lez v0, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/release/gb;->b:F

    add-int/2addr v1, v3

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gb;->c:Landroid/graphics/drawable/LevelListDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/LevelListDrawable;->getLevel()I

    move-result v0

    if-eq v0, v5, :cond_0

    .line 99
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gb;->c:Landroid/graphics/drawable/LevelListDrawable;

    invoke-virtual {v0, v5}, Landroid/graphics/drawable/LevelListDrawable;->setLevel(I)Z

    goto :goto_0

    .line 105
    :pswitch_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    .line 106
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    .line 108
    iget-object v6, p0, Lcom/roidapp/photogrid/release/gb;->c:Landroid/graphics/drawable/LevelListDrawable;

    invoke-virtual {v6}, Landroid/graphics/drawable/LevelListDrawable;->getLevel()I

    move-result v6

    if-eqz v6, :cond_1

    .line 109
    iget-object v6, p0, Lcom/roidapp/photogrid/release/gb;->c:Landroid/graphics/drawable/LevelListDrawable;

    invoke-virtual {v6, v8}, Landroid/graphics/drawable/LevelListDrawable;->setLevel(I)Z

    .line 112
    :cond_1
    iget v6, p0, Lcom/roidapp/photogrid/release/gb;->a:F

    sub-float v6, v4, v6

    int-to-float v7, v2

    cmpl-float v6, v6, v7

    if-gtz v6, :cond_0

    iget v6, p0, Lcom/roidapp/photogrid/release/gb;->b:F

    sub-float v6, v5, v6

    int-to-float v7, v3

    cmpl-float v6, v6, v7

    if-gtz v6, :cond_0

    .line 115
    sub-int v2, v0, v2

    int-to-float v2, v2

    cmpl-float v2, v4, v2

    if-lez v2, :cond_0

    int-to-float v0, v0

    cmpg-float v0, v4, v0

    if-gez v0, :cond_0

    int-to-float v0, v1

    cmpl-float v0, v5, v0

    if-lez v0, :cond_0

    add-int v0, v1, v3

    int-to-float v0, v0

    cmpg-float v0, v5, v0

    if-gez v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gb;->d:Lcom/roidapp/photogrid/release/ga;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ga;->a(Lcom/roidapp/photogrid/release/ga;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->clear()V

    goto/16 :goto_0

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
