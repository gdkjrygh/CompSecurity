.class public Lcom/roidapp/baselib/view/FlowLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation


# instance fields
.field private a:I

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 51
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roidapp/baselib/view/FlowLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 52
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/roidapp/baselib/view/FlowLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 56
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .prologue
    const v1, 0x800003

    const/4 v2, 0x3

    .line 59
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 44
    invoke-static {}, Lcom/roidapp/baselib/view/FlowLayout;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    :goto_0
    or-int/lit8 v0, v0, 0x30

    iput v0, p0, Lcom/roidapp/baselib/view/FlowLayout;->a:I

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/FlowLayout;->b:Ljava/util/List;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/FlowLayout;->c:Ljava/util/List;

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/baselib/view/FlowLayout;->d:Ljava/util/List;

    .line 61
    sget-object v0, Lcom/roidapp/baselib/i;->k:[I

    const/4 v3, 0x0

    invoke-virtual {p1, p2, v0, p3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 65
    :try_start_0
    sget v0, Lcom/roidapp/baselib/i;->n:I

    const/4 v4, -0x1

    invoke-virtual {v3, v0, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    .line 66
    if-lez v0, :cond_2

    .line 1351
    iget v4, p0, Lcom/roidapp/baselib/view/FlowLayout;->a:I

    if-eq v4, v0, :cond_2

    .line 1352
    const v4, 0x800007

    and-int/2addr v4, v0

    if-nez v4, :cond_0

    .line 1353
    invoke-static {}, Lcom/roidapp/baselib/view/FlowLayout;->a()Z

    move-result v4

    if-eqz v4, :cond_4

    :goto_1
    or-int/2addr v0, v1

    .line 1356
    :cond_0
    and-int/lit8 v1, v0, 0x70

    if-nez v1, :cond_1

    .line 1357
    or-int/lit8 v0, v0, 0x30

    .line 1360
    :cond_1
    iput v0, p0, Lcom/roidapp/baselib/view/FlowLayout;->a:I

    .line 1361
    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FlowLayout;->requestLayout()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    :cond_2
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 71
    return-void

    :cond_3
    move v0, v2

    .line 44
    goto :goto_0

    :cond_4
    move v1, v2

    .line 1353
    goto :goto_1

    .line 70
    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    throw v0
.end method

.method private static a()Z
    .locals 2

    .prologue
    .line 373
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 2346
    new-instance v0, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;

    invoke-direct {v0}, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;-><init>()V

    .line 41
    return-object v0
.end method

.method public synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    .line 41
    .line 3338
    new-instance v0, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;

    invoke-virtual {p0}, Lcom/roidapp/baselib/view/FlowLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    return-object v0
.end method

.method protected synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 3330
    new-instance v0, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;

    invoke-direct {v0, p1}, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 22

    .prologue
    .line 177
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/baselib/view/FlowLayout;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 178
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/baselib/view/FlowLayout;->c:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 179
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/baselib/view/FlowLayout;->d:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 181
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/view/FlowLayout;->getWidth()I

    move-result v10

    .line 182
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/view/FlowLayout;->getHeight()I

    move-result v11

    .line 184
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/view/FlowLayout;->getPaddingTop()I

    move-result v8

    .line 186
    const/4 v7, 0x0

    .line 187
    const/4 v6, 0x0

    .line 188
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 191
    move-object/from16 v0, p0

    iget v3, v0, Lcom/roidapp/baselib/view/FlowLayout;->a:I

    and-int/lit8 v3, v3, 0x7

    sparse-switch v3, :sswitch_data_0

    .line 194
    const/4 v3, 0x0

    move v4, v3

    .line 204
    :goto_0
    const/4 v3, 0x0

    move v9, v8

    move v8, v7

    move v7, v6

    move-object v6, v5

    move v5, v3

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/view/FlowLayout;->getChildCount()I

    move-result v3

    if-ge v5, v3, :cond_2

    .line 206
    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/roidapp/baselib/view/FlowLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    .line 208
    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v13, 0x8

    if-eq v3, v13, :cond_1

    .line 212
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;

    .line 214
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    move-result v13

    iget v14, v3, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->leftMargin:I

    add-int/2addr v13, v14

    iget v14, v3, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->rightMargin:I

    add-int/2addr v13, v14

    .line 215
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    move-result v14

    iget v15, v3, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v14, v15

    iget v3, v3, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->topMargin:I

    add-int/2addr v3, v14

    .line 217
    add-int v14, v8, v13

    if-le v14, v10, :cond_0

    .line 218
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/roidapp/baselib/view/FlowLayout;->c:Ljava/util/List;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 219
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/roidapp/baselib/view/FlowLayout;->b:Ljava/util/List;

    invoke-interface {v14, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 220
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/roidapp/baselib/view/FlowLayout;->d:Ljava/util/List;

    sub-int v8, v10, v8

    int-to-float v8, v8

    mul-float/2addr v8, v4

    float-to-int v8, v8

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/view/FlowLayout;->getPaddingLeft()I

    move-result v14

    add-int/2addr v8, v14

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 222
    add-int/2addr v9, v7

    .line 224
    const/4 v7, 0x0

    .line 225
    const/4 v8, 0x0

    .line 226
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 229
    :cond_0
    add-int/2addr v8, v13

    .line 230
    invoke-static {v7, v3}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 231
    invoke-interface {v6, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 204
    :cond_1
    add-int/lit8 v3, v5, 0x1

    move v5, v3

    goto :goto_1

    .line 197
    :sswitch_0
    const/high16 v3, 0x3f000000    # 0.5f

    move v4, v3

    .line 198
    goto :goto_0

    .line 200
    :sswitch_1
    const/high16 v3, 0x3f800000    # 1.0f

    move v4, v3

    goto :goto_0

    .line 234
    :cond_2
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/baselib/view/FlowLayout;->c:Ljava/util/List;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 235
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/baselib/view/FlowLayout;->b:Ljava/util/List;

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 236
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/baselib/view/FlowLayout;->d:Ljava/util/List;

    sub-int v5, v10, v8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    float-to-int v4, v4

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/view/FlowLayout;->getPaddingLeft()I

    move-result v5

    add-int/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 238
    add-int v4, v9, v7

    .line 240
    const/4 v3, 0x0

    .line 241
    move-object/from16 v0, p0

    iget v5, v0, Lcom/roidapp/baselib/view/FlowLayout;->a:I

    and-int/lit8 v5, v5, 0x70

    sparse-switch v5, :sswitch_data_1

    move v6, v3

    .line 253
    :goto_2
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/baselib/view/FlowLayout;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v14

    .line 256
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/view/FlowLayout;->getPaddingTop()I

    move-result v4

    .line 258
    const/4 v3, 0x0

    move v11, v3

    move v12, v4

    :goto_3
    if-ge v11, v14, :cond_7

    .line 260
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/baselib/view/FlowLayout;->c:Ljava/util/List;

    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v15

    .line 261
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/baselib/view/FlowLayout;->b:Ljava/util/List;

    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/util/List;

    .line 262
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/baselib/view/FlowLayout;->d:Ljava/util/List;

    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v10

    .line 264
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v16

    .line 266
    const/4 v3, 0x0

    move v13, v3

    :goto_4
    move/from16 v0, v16

    if-ge v13, v0, :cond_6

    .line 268
    invoke-interface {v5, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    .line 270
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/16 v7, 0x8

    if-eq v4, v7, :cond_8

    .line 274
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;

    .line 277
    iget v7, v4, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->height:I

    const/4 v9, -0x1

    if-ne v7, v9, :cond_3

    .line 278
    const/high16 v7, -0x80000000

    .line 281
    iget v9, v4, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->width:I

    const/16 v17, -0x1

    move/from16 v0, v17

    if-ne v9, v0, :cond_5

    .line 282
    const/high16 v7, 0x40000000    # 2.0f

    move v9, v7

    move v7, v8

    .line 288
    :goto_5
    invoke-static {v7, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    iget v9, v4, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->topMargin:I

    sub-int v9, v15, v9

    iget v0, v4, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->bottomMargin:I

    move/from16 v17, v0

    sub-int v9, v9, v17

    const/high16 v17, 0x40000000    # 2.0f

    move/from16 v0, v17

    invoke-static {v9, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    invoke-virtual {v3, v7, v9}, Landroid/view/View;->measure(II)V

    .line 294
    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    .line 295
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v17

    .line 297
    const/4 v7, 0x0

    .line 299
    iget v0, v4, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->a:I

    move/from16 v18, v0

    invoke-static/range {v18 .. v18}, Landroid/view/Gravity;->isVertical(I)Z

    move-result v18

    if-eqz v18, :cond_4

    .line 300
    iget v0, v4, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->a:I

    move/from16 v18, v0

    sparse-switch v18, :sswitch_data_2

    .line 314
    :cond_4
    :goto_6
    iget v0, v4, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->leftMargin:I

    move/from16 v18, v0

    add-int v18, v18, v10

    iget v0, v4, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->topMargin:I

    move/from16 v19, v0

    add-int v19, v19, v12

    add-int v19, v19, v7

    add-int v19, v19, v6

    add-int v20, v10, v9

    iget v0, v4, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->leftMargin:I

    move/from16 v21, v0

    add-int v20, v20, v21

    add-int v17, v17, v12

    iget v0, v4, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->topMargin:I

    move/from16 v21, v0

    add-int v17, v17, v21

    add-int v7, v7, v17

    add-int/2addr v7, v6

    move/from16 v0, v18

    move/from16 v1, v19

    move/from16 v2, v20

    invoke-virtual {v3, v0, v1, v2, v7}, Landroid/view/View;->layout(IIII)V

    .line 319
    iget v3, v4, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->leftMargin:I

    add-int/2addr v3, v9

    iget v4, v4, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->rightMargin:I

    add-int/2addr v3, v4

    add-int/2addr v3, v10

    .line 266
    :goto_7
    add-int/lit8 v4, v13, 0x1

    move v10, v3

    move v13, v4

    goto/16 :goto_4

    .line 246
    :sswitch_2
    sub-int v3, v11, v4

    div-int/lit8 v3, v3, 0x2

    move v6, v3

    .line 247
    goto/16 :goto_2

    .line 249
    :sswitch_3
    sub-int v3, v11, v4

    move v6, v3

    goto/16 :goto_2

    .line 283
    :cond_5
    iget v9, v4, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->width:I

    if-ltz v9, :cond_9

    .line 284
    const/high16 v9, 0x40000000    # 2.0f

    .line 285
    iget v7, v4, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->width:I

    goto :goto_5

    .line 306
    :sswitch_4
    sub-int v7, v15, v17

    iget v0, v4, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->topMargin:I

    move/from16 v18, v0

    sub-int v7, v7, v18

    iget v0, v4, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->bottomMargin:I

    move/from16 v18, v0

    sub-int v7, v7, v18

    div-int/lit8 v7, v7, 0x2

    goto :goto_6

    .line 309
    :sswitch_5
    sub-int v7, v15, v17

    iget v0, v4, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->topMargin:I

    move/from16 v18, v0

    sub-int v7, v7, v18

    iget v0, v4, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->bottomMargin:I

    move/from16 v18, v0

    sub-int v7, v7, v18

    goto :goto_6

    .line 323
    :cond_6
    add-int v4, v12, v15

    .line 258
    add-int/lit8 v3, v11, 0x1

    move v11, v3

    move v12, v4

    goto/16 :goto_3

    .line 326
    :cond_7
    return-void

    :cond_8
    move v3, v10

    goto :goto_7

    :cond_9
    move v9, v7

    move v7, v8

    goto/16 :goto_5

    .line 191
    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x5 -> :sswitch_1
    .end sparse-switch

    .line 241
    :sswitch_data_1
    .sparse-switch
        0x10 -> :sswitch_2
        0x50 -> :sswitch_3
    .end sparse-switch

    .line 300
    :sswitch_data_2
    .sparse-switch
        0x10 -> :sswitch_4
        0x11 -> :sswitch_4
        0x50 -> :sswitch_5
    .end sparse-switch
.end method

.method protected onMeasure(II)V
    .locals 18

    .prologue
    .line 80
    invoke-super/range {p0 .. p2}, Landroid/view/ViewGroup;->onMeasure(II)V

    .line 82
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/view/FlowLayout;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/view/FlowLayout;->getPaddingRight()I

    move-result v2

    sub-int v8, v1, v2

    .line 83
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v10

    .line 85
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v15

    .line 86
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v16

    .line 88
    const/4 v13, 0x0

    .line 89
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/view/FlowLayout;->getPaddingTop()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/view/FlowLayout;->getPaddingBottom()I

    move-result v2

    add-int v6, v1, v2

    .line 91
    const/4 v4, 0x0

    .line 92
    const/4 v12, 0x0

    .line 94
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/view/FlowLayout;->getChildCount()I

    move-result v17

    .line 96
    const/4 v1, 0x0

    move v14, v1

    :goto_0
    move/from16 v0, v17

    if-ge v14, v0, :cond_6

    .line 98
    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Lcom/roidapp/baselib/view/FlowLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 99
    add-int/lit8 v1, v17, -0x1

    if-ne v14, v1, :cond_1

    const/4 v1, 0x1

    move v7, v1

    .line 101
    :goto_1
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v3, 0x8

    if-ne v1, v3, :cond_2

    .line 103
    if-eqz v7, :cond_b

    .line 104
    invoke-static {v13, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 105
    add-int/2addr v6, v12

    move v2, v1

    move v1, v12

    .line 96
    :cond_0
    :goto_2
    add-int/lit8 v3, v14, 0x1

    move v14, v3

    move v12, v1

    move v13, v2

    goto :goto_0

    .line 99
    :cond_1
    const/4 v1, 0x0

    move v7, v1

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move/from16 v3, p1

    move/from16 v5, p2

    .line 111
    invoke-virtual/range {v1 .. v6}, Lcom/roidapp/baselib/view/FlowLayout;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 113
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;

    .line 115
    const/high16 v3, -0x80000000

    .line 118
    const/high16 v9, -0x80000000

    .line 121
    iget v5, v1, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->width:I

    const/4 v11, -0x1

    if-ne v5, v11, :cond_3

    .line 122
    const/high16 v5, 0x40000000    # 2.0f

    .line 123
    iget v3, v1, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->leftMargin:I

    iget v11, v1, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->rightMargin:I

    add-int/2addr v3, v11

    sub-int v3, v8, v3

    .line 129
    :goto_3
    iget v11, v1, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->height:I

    if-ltz v11, :cond_4

    .line 130
    const/high16 v11, 0x40000000    # 2.0f

    .line 131
    iget v9, v1, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->height:I

    .line 137
    :goto_4
    invoke-static {v3, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-static {v9, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Landroid/view/View;->measure(II)V

    .line 142
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    iget v5, v1, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->leftMargin:I

    add-int/2addr v3, v5

    iget v5, v1, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->rightMargin:I

    add-int/2addr v3, v5

    .line 144
    add-int v5, v4, v3

    if-le v5, v8, :cond_5

    .line 146
    invoke-static {v13, v4}, Ljava/lang/Math;->max(II)I

    move-result v13

    .line 149
    add-int/2addr v6, v12

    .line 150
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    iget v4, v1, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->topMargin:I

    add-int/2addr v2, v4

    iget v1, v1, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v1, v2

    move v4, v3

    move v2, v13

    .line 157
    :goto_5
    if-eqz v7, :cond_0

    .line 158
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 159
    add-int/2addr v6, v1

    goto :goto_2

    .line 124
    :cond_3
    iget v5, v1, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->width:I

    if-ltz v5, :cond_a

    .line 125
    const/high16 v5, 0x40000000    # 2.0f

    .line 126
    iget v3, v1, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->width:I

    goto :goto_3

    .line 132
    :cond_4
    if-nez v16, :cond_9

    .line 133
    const/4 v11, 0x0

    .line 134
    const/4 v9, 0x0

    goto :goto_4

    .line 153
    :cond_5
    add-int/2addr v4, v3

    .line 154
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    iget v3, v1, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->topMargin:I

    add-int/2addr v2, v3

    iget v1, v1, Lcom/roidapp/baselib/view/FlowLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v1, v2

    invoke-static {v12, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    move v2, v13

    goto :goto_5

    .line 164
    :cond_6
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/view/FlowLayout;->getPaddingLeft()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/baselib/view/FlowLayout;->getPaddingRight()I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v1, v13

    .line 166
    const/high16 v2, 0x40000000    # 2.0f

    if-ne v15, v2, :cond_7

    :goto_6
    const/high16 v1, 0x40000000    # 2.0f

    move/from16 v0, v16

    if-ne v0, v1, :cond_8

    :goto_7
    move-object/from16 v0, p0

    invoke-virtual {v0, v8, v10}, Lcom/roidapp/baselib/view/FlowLayout;->setMeasuredDimension(II)V

    .line 169
    return-void

    :cond_7
    move v8, v1

    .line 166
    goto :goto_6

    :cond_8
    move v10, v6

    goto :goto_7

    :cond_9
    move v11, v9

    move v9, v10

    goto :goto_4

    :cond_a
    move v5, v3

    move v3, v8

    goto :goto_3

    :cond_b
    move v1, v12

    move v2, v13

    goto/16 :goto_2
.end method
