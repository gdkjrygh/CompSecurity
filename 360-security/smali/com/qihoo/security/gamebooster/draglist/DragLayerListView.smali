.class public Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;
.super Landroid/widget/FrameLayout;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/gamebooster/draglist/DragLayerListView$a;
    }
.end annotation


# instance fields
.field a:Z

.field private b:Landroid/widget/ListView;

.field private c:Lcom/qihoo/security/gamebooster/draglist/DragLayer;

.field private d:Lcom/qihoo/security/gamebooster/draglist/DeleteZone;

.field private e:Landroid/view/View;

.field private f:F

.field private g:Landroid/graphics/Bitmap;

.field private h:F

.field private i:F

.field private j:Z

.field private k:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;

.field private l:Landroid/view/ViewConfiguration;

.field private m:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    const v0, 0x3f8ccccd    # 1.1f

    iput v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->f:F

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->a:Z

    .line 35
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->l:Landroid/view/ViewConfiguration;

    .line 36
    return-void
.end method

.method private a()V
    .locals 1

    .prologue
    .line 54
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->a:Z

    .line 55
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->k:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;

    invoke-interface {v0}, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;->d()V

    .line 57
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .prologue
    .line 184
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->b:Landroid/widget/ListView;

    if-nez v0, :cond_0

    .line 189
    :goto_0
    return-void

    .line 187
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->b:Landroid/widget/ListView;

    invoke-virtual {v0, p1}, Landroid/widget/ListView;->smoothScrollToPosition(I)V

    goto :goto_0
.end method

.method public a(Landroid/view/View;)V
    .locals 9

    .prologue
    const/high16 v8, 0x40000000    # 2.0f

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 141
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->c:Lcom/qihoo/security/gamebooster/draglist/DragLayer;

    invoke-virtual {v0, v6}, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->setVisibility(I)V

    .line 143
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->e:Landroid/view/View;

    .line 144
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->e:Landroid/view/View;

    invoke-virtual {v0, v6}, Landroid/view/View;->setPressed(Z)V

    .line 145
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->k:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;

    if-eqz v0, :cond_0

    .line 146
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->k:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;

    sget-object v1, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->StartDrag:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    invoke-interface {v0, v1, p1}, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;->a(Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;Landroid/view/View;)V

    .line 148
    :cond_0
    const v0, 0x7f0b0049

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 149
    iget v1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->f:F

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    float-to-int v1, v1

    .line 150
    iget v2, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->f:F

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v2, v3

    float-to-int v2, v2

    .line 151
    invoke-virtual {v0, v7}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 152
    invoke-virtual {v0}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v3

    .line 153
    invoke-static {v3, v1, v2, v7}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->g:Landroid/graphics/Bitmap;

    .line 154
    invoke-virtual {v0, v6}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 155
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->e:Landroid/view/View;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 156
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 157
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->b:Landroid/widget/ListView;

    invoke-virtual {v2, v0, v1}, Landroid/widget/ListView;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 159
    iget v2, v1, Landroid/graphics/Rect;->top:I

    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->getContext()Landroid/content/Context;

    move-result-object v3

    const/high16 v4, 0x42700000    # 60.0f

    invoke-static {v3, v4}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;F)I

    move-result v3

    add-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->top:I

    .line 160
    iget v2, v1, Landroid/graphics/Rect;->left:I

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    int-to-float v3, v3

    iget v4, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->f:F

    sub-float/2addr v4, v5

    mul-float/2addr v3, v4

    div-float/2addr v3, v8

    sub-float/2addr v2, v3

    float-to-int v2, v2

    .line 161
    iget v1, v1, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    iget v3, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->f:F

    sub-float/2addr v3, v5

    mul-float/2addr v0, v3

    div-float/2addr v0, v8

    sub-float v0, v1, v0

    float-to-int v0, v0

    .line 162
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->c:Lcom/qihoo/security/gamebooster/draglist/DragLayer;

    iget-object v3, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v3}, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->setDragBitmap(Landroid/graphics/Bitmap;)V

    .line 163
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->c:Lcom/qihoo/security/gamebooster/draglist/DragLayer;

    iget v3, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->h:F

    int-to-float v4, v2

    sub-float/2addr v3, v4

    iget v4, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->i:F

    int-to-float v5, v0

    sub-float/2addr v4, v5

    invoke-virtual {v1, v3, v4}, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->c(FF)V

    .line 164
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->c:Lcom/qihoo/security/gamebooster/draglist/DragLayer;

    int-to-float v2, v2

    int-to-float v0, v0

    invoke-virtual {v1, v2, v0}, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->a(FF)V

    .line 165
    iput-boolean v7, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->j:Z

    .line 166
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->d:Lcom/qihoo/security/gamebooster/draglist/DeleteZone;

    invoke-virtual {v0, v6}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->setVisibility(I)V

    .line 167
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->d:Lcom/qihoo/security/gamebooster/draglist/DeleteZone;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->a()V

    .line 169
    return-void
.end method

.method public a(Z)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 172
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->e:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->e:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 175
    :cond_0
    iput-object v2, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->e:Landroid/view/View;

    .line 176
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->invalidate()V

    .line 177
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->g:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    .line 178
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 179
    iput-object v2, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->g:Landroid/graphics/Bitmap;

    .line 181
    :cond_1
    return-void
.end method

.method public getListView()Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->b:Landroid/widget/ListView;

    return-object v0
.end method

.method protected onFinishInflate()V
    .locals 1

    .prologue
    .line 47
    invoke-super {p0}, Landroid/widget/FrameLayout;->onFinishInflate()V

    .line 48
    const v0, 0x7f0b010d

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->b:Landroid/widget/ListView;

    .line 49
    const v0, 0x7f0b010e

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/draglist/DragLayer;

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->c:Lcom/qihoo/security/gamebooster/draglist/DragLayer;

    .line 50
    const v0, 0x7f0b00f7

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->d:Lcom/qihoo/security/gamebooster/draglist/DeleteZone;

    .line 51
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 61
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    .line 62
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    .line 63
    iget-boolean v3, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->j:Z

    if-eqz v3, :cond_0

    .line 88
    :goto_0
    return v0

    .line 66
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    .line 88
    :cond_1
    :goto_1
    :pswitch_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0

    .line 68
    :pswitch_1
    iput v1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->h:F

    .line 69
    iput v2, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->i:F

    iput v2, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->m:F

    goto :goto_1

    .line 72
    :pswitch_2
    iget-boolean v1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->a:Z

    if-nez v1, :cond_1

    .line 73
    iget v1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->m:F

    cmpl-float v1, v2, v1

    if-lez v1, :cond_2

    .line 74
    iput v2, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->m:F

    goto :goto_1

    .line 76
    :cond_2
    iget v1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->m:F

    sub-float/2addr v1, v2

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->l:Landroid/view/ViewConfiguration;

    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v2

    int-to-float v2, v2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_1

    .line 77
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->a()V

    goto :goto_0

    .line 66
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 93
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    .line 94
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    .line 95
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v5

    packed-switch v5, :pswitch_data_0

    .line 133
    :goto_0
    return v1

    .line 97
    :pswitch_0
    iput v3, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->h:F

    .line 98
    iput v4, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->i:F

    goto :goto_0

    .line 101
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->c:Lcom/qihoo/security/gamebooster/draglist/DragLayer;

    invoke-virtual {v0, v3, v4}, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->b(FF)V

    .line 102
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->d:Lcom/qihoo/security/gamebooster/draglist/DeleteZone;

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->e:Landroid/view/View;

    invoke-virtual {v0, v2, v3, v4}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->a(Landroid/view/View;FF)V

    goto :goto_0

    .line 106
    :pswitch_2
    iget-object v5, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->d:Lcom/qihoo/security/gamebooster/draglist/DeleteZone;

    const/4 v6, 0x4

    invoke-virtual {v5, v6}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->setVisibility(I)V

    .line 107
    iget-object v5, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->c:Lcom/qihoo/security/gamebooster/draglist/DragLayer;

    invoke-virtual {v5, v0}, Lcom/qihoo/security/gamebooster/draglist/DragLayer;->setDragBitmap(Landroid/graphics/Bitmap;)V

    .line 108
    iget-object v5, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->d:Lcom/qihoo/security/gamebooster/draglist/DeleteZone;

    iget-object v6, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->e:Landroid/view/View;

    invoke-virtual {v5, v6, v3, v4}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->b(Landroid/view/View;FF)I

    move-result v3

    .line 111
    packed-switch v3, :pswitch_data_1

    .line 124
    :goto_1
    iget-object v4, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->k:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;

    if-eqz v4, :cond_0

    .line 125
    iget-object v4, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->k:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;

    iget-object v5, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->e:Landroid/view/View;

    invoke-interface {v4, v0, v5}, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;->a(Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;Landroid/view/View;)V

    .line 127
    :cond_0
    if-nez v3, :cond_1

    move v0, v1

    :goto_2
    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->a(Z)V

    .line 128
    iput-boolean v2, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->j:Z

    goto :goto_0

    .line 113
    :pswitch_3
    sget-object v0, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->Delete:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    goto :goto_1

    .line 116
    :pswitch_4
    sget-object v0, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->UnInstall:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    goto :goto_1

    .line 119
    :pswitch_5
    sget-object v0, Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;->Release:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter$DragState;

    goto :goto_1

    :cond_1
    move v0, v2

    .line 127
    goto :goto_2

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch

    .line 111
    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public setAdapter(Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;)V
    .locals 1

    .prologue
    .line 39
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->k:Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;

    .line 40
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->d:Lcom/qihoo/security/gamebooster/draglist/DeleteZone;

    if-eqz v0, :cond_0

    .line 41
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/draglist/DragLayerListView;->d:Lcom/qihoo/security/gamebooster/draglist/DeleteZone;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/gamebooster/draglist/DeleteZone;->setAdapter(Lcom/qihoo/security/gamebooster/draglist/DragListAdapter;)V

    .line 43
    :cond_0
    return-void
.end method
