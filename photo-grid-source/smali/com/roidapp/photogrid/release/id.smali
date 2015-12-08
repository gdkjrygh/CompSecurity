.class public final Lcom/roidapp/photogrid/release/id;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private A:F

.field private B:Landroid/graphics/Matrix;

.field private C:Z

.field private D:Z

.field protected a:Landroid/graphics/Bitmap;

.field protected b:Landroid/graphics/RectF;

.field protected c:Z

.field protected d:F

.field protected e:F

.field protected f:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Lcom/roidapp/photogrid/release/lc;",
            ">;"
        }
    .end annotation
.end field

.field protected g:I

.field protected h:Landroid/graphics/PointF;

.field protected i:Landroid/graphics/PointF;

.field protected j:Z

.field private k:I

.field private l:I

.field private m:F

.field private n:F

.field private o:I

.field private p:I

.field private q:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private r:Z

.field private s:Lcom/roidapp/photogrid/release/mm;

.field private t:I

.field private u:I

.field private v:I

.field private w:I

.field private x:F

.field private y:F

.field private z:F


# direct methods
.method protected constructor <init>(Landroid/app/Activity;I)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/id;->b:Landroid/graphics/RectF;

    .line 37
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    .line 49
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/id;->j:Z

    .line 53
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->o:I

    .line 54
    const/4 v0, -0x2

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->p:I

    .line 66
    const/high16 v0, 0x41400000    # 12.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->A:F

    .line 70
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/id;->B:Landroid/graphics/Matrix;

    .line 73
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/id;->D:Z

    .line 77
    const v0, 0x7f0203a4

    .line 78
    packed-switch p2, :pswitch_data_0

    .line 87
    :goto_0
    :pswitch_0
    :try_start_0
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 88
    if-eqz v0, :cond_0

    .line 89
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/id;->a:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 96
    :cond_0
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 97
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->k:I

    .line 98
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->l:I

    .line 100
    :cond_1
    iput p2, p0, Lcom/roidapp/photogrid/release/id;->g:I

    .line 101
    check-cast p1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object p1, p0, Lcom/roidapp/photogrid/release/id;->q:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 102
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->q:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/id;->s:Lcom/roidapp/photogrid/release/mm;

    .line 104
    return-void

    .line 84
    :pswitch_1
    const v0, 0x7f0203a3

    goto :goto_0

    .line 92
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_1

    .line 94
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 78
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private a(FFF)Z
    .locals 17

    .prologue
    .line 752
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    move-result v3

    if-nez v3, :cond_15

    .line 757
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 758
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->s:Lcom/roidapp/photogrid/release/mm;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/mm;->y:Ljava/util/ArrayList;

    .line 759
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/photogrid/release/ic;

    .line 760
    iget-object v8, v3, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    .line 761
    const/4 v3, 0x0

    .line 762
    iget-object v4, v8, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v4, v3

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/PointF;

    .line 763
    iget v5, v3, Landroid/graphics/PointF;->y:F

    iget v10, v3, Landroid/graphics/PointF;->x:F

    mul-float v10, v10, p1

    add-float v10, v10, p2

    sub-float/2addr v5, v10

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    const/high16 v10, 0x3f000000    # 0.5f

    cmpg-float v5, v5, v10

    if-gez v5, :cond_1b

    .line 767
    add-int/lit8 v5, v4, 0x1

    .line 768
    const/4 v4, 0x2

    if-ne v5, v4, :cond_1

    .line 769
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v4, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 771
    :cond_1
    iget v4, v3, Landroid/graphics/PointF;->y:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 772
    iget v4, v3, Landroid/graphics/PointF;->y:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 773
    add-int/lit8 v4, v4, 0x1

    .line 774
    iget v3, v3, Landroid/graphics/PointF;->y:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v7, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v4, v5

    .line 775
    goto :goto_0

    .line 776
    :cond_2
    iget v3, v3, Landroid/graphics/PointF;->y:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v7, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v3, v5

    :goto_1
    move v4, v3

    .line 779
    goto :goto_0

    .line 788
    :cond_3
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 789
    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 790
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    invoke-virtual {v9, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 791
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    invoke-virtual {v9, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 797
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    move-result v10

    .line 800
    :cond_4
    invoke-virtual {v8}, Ljava/util/HashSet;->size()I

    move-result v11

    .line 801
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_5
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/photogrid/release/lc;

    .line 802
    const/4 v4, 0x0

    .line 803
    iget-object v5, v3, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    move v6, v4

    :cond_6
    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/PointF;

    .line 804
    if-nez v6, :cond_6

    .line 805
    invoke-virtual {v9}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_7
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/PointF;

    .line 806
    iget v15, v4, Landroid/graphics/PointF;->x:F

    iget v0, v5, Landroid/graphics/PointF;->x:F

    move/from16 v16, v0

    sub-float v15, v15, v16

    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    move-result v15

    const/high16 v16, 0x3f000000    # 0.5f

    cmpg-float v15, v15, v16

    if-gez v15, :cond_7

    iget v15, v4, Landroid/graphics/PointF;->y:F

    iget v5, v5, Landroid/graphics/PointF;->y:F

    sub-float v5, v15, v5

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    const/high16 v15, 0x3f000000    # 0.5f

    cmpg-float v5, v5, v15

    if-gez v5, :cond_7

    .line 807
    invoke-virtual {v8, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 808
    const/4 v4, 0x1

    move v6, v4

    .line 809
    goto :goto_2

    .line 816
    :cond_8
    if-eqz v6, :cond_5

    .line 817
    iget-object v3, v3, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/PointF;

    .line 818
    invoke-virtual {v9, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 822
    :cond_9
    invoke-virtual {v8}, Ljava/util/HashSet;->size()I

    move-result v3

    .line 823
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v4, v8}, Ljava/util/HashSet;->removeAll(Ljava/util/Collection;)Z

    .line 825
    if-eq v3, v10, :cond_a

    if-ne v11, v3, :cond_4

    .line 831
    :cond_a
    move-object/from16 v0, p0

    iput-object v8, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    .line 839
    invoke-virtual {v7}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 841
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->y:F

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->y:F

    cmpl-float v3, v3, v4

    if-lez v3, :cond_f

    .line 842
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    .line 843
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    move-object v5, v3

    move-object v6, v4

    .line 848
    :cond_b
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_15

    .line 849
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v9

    .line 850
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 851
    const/4 v4, 0x4

    if-ne v3, v4, :cond_b

    .line 853
    invoke-virtual {v7}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    .line 854
    :cond_c
    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    .line 855
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v11

    .line 857
    iget v3, v5, Landroid/graphics/PointF;->y:F

    cmpg-float v3, v9, v3

    if-gtz v3, :cond_11

    cmpg-float v3, v11, v9

    if-gez v3, :cond_11

    .line 859
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v12

    .line 860
    new-instance v13, Ljava/util/HashSet;

    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    .line 861
    :cond_d
    :goto_6
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    .line 862
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/roidapp/photogrid/release/lc;

    .line 863
    iget-object v3, v4, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_e
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/PointF;

    .line 864
    iget v3, v3, Landroid/graphics/PointF;->y:F

    cmpl-float v3, v3, v11

    if-nez v3, :cond_e

    .line 865
    invoke-virtual {v13, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 845
    :cond_f
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    .line 846
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    move-object v5, v3

    move-object v6, v4

    goto/16 :goto_4

    .line 870
    :cond_10
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v3, v13}, Ljava/util/HashSet;->removeAll(Ljava/util/Collection;)Z

    .line 874
    :cond_11
    iget v3, v6, Landroid/graphics/PointF;->y:F

    cmpl-float v3, v9, v3

    if-ltz v3, :cond_c

    cmpl-float v3, v11, v9

    if-lez v3, :cond_c

    .line 877
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v12

    .line 878
    new-instance v13, Ljava/util/HashSet;

    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    .line 879
    :cond_12
    :goto_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_14

    .line 880
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/photogrid/release/lc;

    .line 881
    iget-object v4, v3, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_13
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/PointF;

    .line 882
    iget v4, v4, Landroid/graphics/PointF;->y:F

    cmpl-float v4, v4, v11

    if-nez v4, :cond_13

    .line 883
    invoke-virtual {v13, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 888
    :cond_14
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v3, v13}, Ljava/util/HashSet;->removeAll(Ljava/util/Collection;)Z

    goto/16 :goto_5

    .line 923
    :cond_15
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/photogrid/release/lc;

    .line 924
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/lc;->b()Ljava/util/ArrayList;

    move-result-object v9

    .line 927
    const/4 v4, 0x0

    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/PointF;

    .line 928
    const/4 v5, 0x1

    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/PointF;

    .line 929
    const/4 v6, 0x2

    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/PointF;

    .line 930
    const/4 v7, 0x3

    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/graphics/PointF;

    .line 931
    iget v10, v4, Landroid/graphics/PointF;->y:F

    iget v11, v4, Landroid/graphics/PointF;->x:F

    mul-float v11, v11, p1

    add-float v11, v11, p2

    sub-float/2addr v10, v11

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v10

    const/high16 v11, 0x3f000000    # 0.5f

    cmpg-float v10, v10, v11

    if-gez v10, :cond_16

    .line 932
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    invoke-direct {v0, v4, v5, v1, v2}, Lcom/roidapp/photogrid/release/id;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;FF)Z

    move-result v10

    if-eqz v10, :cond_16

    .line 933
    const/4 v3, 0x1

    .line 957
    :goto_9
    return v3

    .line 936
    :cond_16
    iget v10, v5, Landroid/graphics/PointF;->y:F

    iget v11, v5, Landroid/graphics/PointF;->x:F

    mul-float v11, v11, p1

    add-float v11, v11, p2

    sub-float/2addr v10, v11

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v10

    const/high16 v11, 0x3f000000    # 0.5f

    cmpg-float v10, v10, v11

    if-gez v10, :cond_17

    .line 937
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    invoke-direct {v0, v5, v4, v1, v2}, Lcom/roidapp/photogrid/release/id;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;FF)Z

    move-result v4

    if-eqz v4, :cond_17

    .line 938
    const/4 v3, 0x1

    goto :goto_9

    .line 941
    :cond_17
    iget v4, v6, Landroid/graphics/PointF;->y:F

    iget v5, v6, Landroid/graphics/PointF;->x:F

    mul-float v5, v5, p1

    add-float v5, v5, p2

    sub-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const/high16 v5, 0x3f000000    # 0.5f

    cmpg-float v4, v4, v5

    if-gez v4, :cond_18

    .line 942
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    invoke-direct {v0, v6, v7, v1, v2}, Lcom/roidapp/photogrid/release/id;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;FF)Z

    move-result v4

    if-eqz v4, :cond_18

    .line 943
    const/4 v3, 0x1

    goto :goto_9

    .line 946
    :cond_18
    iget v4, v7, Landroid/graphics/PointF;->y:F

    iget v5, v7, Landroid/graphics/PointF;->x:F

    mul-float v5, v5, p1

    add-float v5, v5, p2

    sub-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const/high16 v5, 0x3f000000    # 0.5f

    cmpg-float v4, v4, v5

    if-gez v4, :cond_19

    .line 947
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    invoke-direct {v0, v7, v6, v1, v2}, Lcom/roidapp/photogrid/release/id;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;FF)Z

    move-result v4

    if-eqz v4, :cond_19

    .line 948
    const/4 v3, 0x1

    goto :goto_9

    .line 951
    :cond_19
    iput-object v9, v3, Lcom/roidapp/photogrid/release/lc;->d:Ljava/util/ArrayList;

    goto/16 :goto_8

    .line 955
    :cond_1a
    invoke-direct/range {p0 .. p0}, Lcom/roidapp/photogrid/release/id;->c()V

    .line 957
    const/4 v3, 0x0

    goto :goto_9

    :cond_1b
    move v3, v4

    goto/16 :goto_1
.end method

.method private a(Landroid/graphics/PointF;Landroid/graphics/PointF;F)Z
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 1194
    iget v0, p2, Landroid/graphics/PointF;->x:F

    iget v1, p1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v1

    .line 1195
    iget v1, p2, Landroid/graphics/PointF;->y:F

    iget v2, p1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v2

    .line 1196
    div-float v2, v1, v0

    .line 1197
    iget v3, p1, Landroid/graphics/PointF;->y:F

    iget v4, p1, Landroid/graphics/PointF;->x:F

    mul-float/2addr v4, v2

    sub-float/2addr v3, v4

    .line 1198
    iput p3, p1, Landroid/graphics/PointF;->x:F

    .line 1199
    cmpl-float v4, v0, v5

    if-eqz v4, :cond_0

    cmpl-float v1, v1, v5

    if-eqz v1, :cond_0

    .line 1200
    iget v1, p1, Landroid/graphics/PointF;->x:F

    mul-float/2addr v1, v2

    add-float/2addr v1, v3

    iput v1, p1, Landroid/graphics/PointF;->y:F

    .line 1203
    :cond_0
    cmpl-float v0, v0, v5

    if-lez v0, :cond_1

    .line 1204
    iget v0, p2, Landroid/graphics/PointF;->x:F

    iget v1, p1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v1

    .line 1208
    :goto_0
    iget v1, p0, Lcom/roidapp/photogrid/release/id;->A:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 1209
    const/4 v0, 0x1

    .line 1211
    :goto_1
    return v0

    .line 1206
    :cond_1
    iget v0, p1, Landroid/graphics/PointF;->x:F

    iget v1, p2, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v1

    goto :goto_0

    .line 1211
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private a(Landroid/graphics/PointF;Landroid/graphics/PointF;FF)Z
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 1251
    iget v0, p2, Landroid/graphics/PointF;->x:F

    iget v1, p1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v1

    .line 1252
    iget v1, p2, Landroid/graphics/PointF;->y:F

    iget v2, p1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v2

    .line 1254
    cmpl-float v2, v0, v4

    if-nez v2, :cond_0

    .line 1255
    iget v1, p1, Landroid/graphics/PointF;->x:F

    mul-float/2addr v1, p3

    add-float/2addr v1, p4

    iput v1, p1, Landroid/graphics/PointF;->y:F

    .line 1267
    :goto_0
    cmpl-float v0, v0, v4

    if-lez v0, :cond_2

    .line 1268
    iget v0, p2, Landroid/graphics/PointF;->x:F

    iget v1, p1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v1

    .line 1272
    :goto_1
    iget v1, p0, Lcom/roidapp/photogrid/release/id;->A:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    .line 1273
    const/4 v0, 0x1

    .line 1275
    :goto_2
    return v0

    .line 1256
    :cond_0
    cmpl-float v2, v1, v4

    if-nez v2, :cond_1

    .line 1257
    iget v1, p1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, p4

    div-float/2addr v1, p3

    iput v1, p1, Landroid/graphics/PointF;->x:F

    goto :goto_0

    .line 1259
    :cond_1
    div-float/2addr v1, v0

    .line 1260
    iget v2, p1, Landroid/graphics/PointF;->y:F

    iget v3, p1, Landroid/graphics/PointF;->x:F

    mul-float/2addr v3, v1

    sub-float/2addr v2, v3

    .line 1261
    sub-float/2addr v2, p4

    sub-float v1, p3, v1

    div-float v1, v2, v1

    .line 1262
    mul-float v2, p3, v1

    add-float/2addr v2, p4

    .line 1263
    iput v1, p1, Landroid/graphics/PointF;->x:F

    .line 1264
    iput v2, p1, Landroid/graphics/PointF;->y:F

    goto :goto_0

    .line 1270
    :cond_2
    iget v0, p1, Landroid/graphics/PointF;->x:F

    iget v1, p2, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v1

    goto :goto_1

    .line 1275
    :cond_3
    const/4 v0, 0x0

    goto :goto_2
.end method

.method private b(FFF)Z
    .locals 17

    .prologue
    .line 970
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    move-result v3

    if-nez v3, :cond_15

    .line 975
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 976
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->s:Lcom/roidapp/photogrid/release/mm;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/mm;->y:Ljava/util/ArrayList;

    .line 977
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/photogrid/release/ic;

    .line 978
    iget-object v8, v3, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    .line 979
    const/4 v3, 0x0

    .line 980
    iget-object v4, v8, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v4, v3

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/PointF;

    .line 981
    iget v5, v3, Landroid/graphics/PointF;->y:F

    iget v10, v3, Landroid/graphics/PointF;->x:F

    mul-float v10, v10, p1

    add-float v10, v10, p2

    sub-float/2addr v5, v10

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    const/high16 v10, 0x3f000000    # 0.5f

    cmpg-float v5, v5, v10

    if-gez v5, :cond_1b

    .line 985
    add-int/lit8 v5, v4, 0x1

    .line 986
    const/4 v4, 0x2

    if-ne v5, v4, :cond_1

    .line 987
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v4, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 989
    :cond_1
    iget v4, v3, Landroid/graphics/PointF;->y:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 990
    iget v4, v3, Landroid/graphics/PointF;->y:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 991
    add-int/lit8 v4, v4, 0x1

    .line 992
    iget v3, v3, Landroid/graphics/PointF;->y:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v7, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v4, v5

    .line 993
    goto :goto_0

    .line 994
    :cond_2
    iget v3, v3, Landroid/graphics/PointF;->y:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v7, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v3, v5

    :goto_1
    move v4, v3

    .line 997
    goto :goto_0

    .line 1011
    :cond_3
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 1012
    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 1013
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    invoke-virtual {v9, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1014
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    invoke-virtual {v9, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1020
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    move-result v10

    .line 1023
    :cond_4
    invoke-virtual {v8}, Ljava/util/HashSet;->size()I

    move-result v11

    .line 1024
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_5
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/photogrid/release/lc;

    .line 1025
    const/4 v4, 0x0

    .line 1026
    iget-object v5, v3, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    move v6, v4

    :cond_6
    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/PointF;

    .line 1027
    if-nez v6, :cond_6

    .line 1028
    invoke-virtual {v9}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_7
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/PointF;

    .line 1029
    iget v15, v4, Landroid/graphics/PointF;->x:F

    iget v0, v5, Landroid/graphics/PointF;->x:F

    move/from16 v16, v0

    sub-float v15, v15, v16

    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    move-result v15

    const/high16 v16, 0x3f000000    # 0.5f

    cmpg-float v15, v15, v16

    if-gez v15, :cond_7

    iget v15, v4, Landroid/graphics/PointF;->y:F

    iget v5, v5, Landroid/graphics/PointF;->y:F

    sub-float v5, v15, v5

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    const/high16 v15, 0x3f000000    # 0.5f

    cmpg-float v5, v5, v15

    if-gez v5, :cond_7

    .line 1030
    invoke-virtual {v8, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1031
    const/4 v4, 0x1

    move v6, v4

    .line 1032
    goto :goto_2

    .line 1039
    :cond_8
    if-eqz v6, :cond_5

    .line 1040
    iget-object v3, v3, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/PointF;

    .line 1041
    invoke-virtual {v9, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 1045
    :cond_9
    invoke-virtual {v8}, Ljava/util/HashSet;->size()I

    move-result v3

    .line 1046
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v4, v8}, Ljava/util/HashSet;->removeAll(Ljava/util/Collection;)Z

    .line 1048
    if-eq v3, v10, :cond_a

    if-ne v11, v3, :cond_4

    .line 1054
    :cond_a
    move-object/from16 v0, p0

    iput-object v8, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    .line 1062
    invoke-virtual {v7}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 1064
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->y:F

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    iget v4, v4, Landroid/graphics/PointF;->y:F

    cmpl-float v3, v3, v4

    if-lez v3, :cond_f

    .line 1065
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    .line 1066
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    move-object v5, v3

    move-object v6, v4

    .line 1071
    :cond_b
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_15

    .line 1072
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v9

    .line 1073
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 1074
    const/4 v4, 0x4

    if-ne v3, v4, :cond_b

    .line 1076
    invoke-virtual {v7}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    .line 1077
    :cond_c
    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    .line 1078
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v11

    .line 1080
    iget v3, v5, Landroid/graphics/PointF;->y:F

    cmpg-float v3, v9, v3

    if-gtz v3, :cond_11

    cmpg-float v3, v11, v9

    if-gez v3, :cond_11

    .line 1082
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v12

    .line 1083
    new-instance v13, Ljava/util/HashSet;

    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    .line 1084
    :cond_d
    :goto_6
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    .line 1085
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/roidapp/photogrid/release/lc;

    .line 1086
    iget-object v3, v4, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_e
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/PointF;

    .line 1087
    iget v3, v3, Landroid/graphics/PointF;->y:F

    cmpl-float v3, v3, v11

    if-nez v3, :cond_e

    .line 1088
    invoke-virtual {v13, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 1068
    :cond_f
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    .line 1069
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    move-object v5, v3

    move-object v6, v4

    goto/16 :goto_4

    .line 1093
    :cond_10
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v3, v13}, Ljava/util/HashSet;->removeAll(Ljava/util/Collection;)Z

    .line 1097
    :cond_11
    iget v3, v6, Landroid/graphics/PointF;->y:F

    cmpl-float v3, v9, v3

    if-ltz v3, :cond_c

    cmpl-float v3, v11, v9

    if-lez v3, :cond_c

    .line 1100
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v12

    .line 1101
    new-instance v13, Ljava/util/HashSet;

    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    .line 1102
    :cond_12
    :goto_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_14

    .line 1103
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/photogrid/release/lc;

    .line 1104
    iget-object v4, v3, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_13
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/PointF;

    .line 1105
    iget v4, v4, Landroid/graphics/PointF;->y:F

    cmpl-float v4, v4, v11

    if-nez v4, :cond_13

    .line 1106
    invoke-virtual {v13, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 1111
    :cond_14
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v3, v13}, Ljava/util/HashSet;->removeAll(Ljava/util/Collection;)Z

    goto/16 :goto_5

    .line 1147
    :cond_15
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/photogrid/release/lc;

    .line 1148
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/lc;->b()Ljava/util/ArrayList;

    move-result-object v9

    .line 1152
    const/4 v4, 0x0

    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/PointF;

    .line 1153
    const/4 v5, 0x1

    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/PointF;

    .line 1154
    const/4 v6, 0x2

    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/PointF;

    .line 1155
    const/4 v7, 0x3

    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/graphics/PointF;

    .line 1156
    iget v10, v4, Landroid/graphics/PointF;->y:F

    iget v11, v4, Landroid/graphics/PointF;->x:F

    mul-float v11, v11, p1

    add-float v11, v11, p2

    sub-float/2addr v10, v11

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v10

    const/high16 v11, 0x3f000000    # 0.5f

    cmpg-float v10, v10, v11

    if-gez v10, :cond_16

    .line 1157
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    invoke-direct {v0, v4, v7, v1, v2}, Lcom/roidapp/photogrid/release/id;->b(Landroid/graphics/PointF;Landroid/graphics/PointF;FF)Z

    move-result v10

    if-eqz v10, :cond_16

    .line 1158
    const/4 v3, 0x1

    .line 1182
    :goto_9
    return v3

    .line 1161
    :cond_16
    iget v10, v5, Landroid/graphics/PointF;->y:F

    iget v11, v5, Landroid/graphics/PointF;->x:F

    mul-float v11, v11, p1

    add-float v11, v11, p2

    sub-float/2addr v10, v11

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v10

    const/high16 v11, 0x3f000000    # 0.5f

    cmpg-float v10, v10, v11

    if-gez v10, :cond_17

    .line 1162
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    invoke-direct {v0, v5, v6, v1, v2}, Lcom/roidapp/photogrid/release/id;->b(Landroid/graphics/PointF;Landroid/graphics/PointF;FF)Z

    move-result v10

    if-eqz v10, :cond_17

    .line 1163
    const/4 v3, 0x1

    goto :goto_9

    .line 1166
    :cond_17
    iget v10, v6, Landroid/graphics/PointF;->y:F

    iget v11, v6, Landroid/graphics/PointF;->x:F

    mul-float v11, v11, p1

    add-float v11, v11, p2

    sub-float/2addr v10, v11

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v10

    const/high16 v11, 0x3f000000    # 0.5f

    cmpg-float v10, v10, v11

    if-gez v10, :cond_18

    .line 1167
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    invoke-direct {v0, v6, v5, v1, v2}, Lcom/roidapp/photogrid/release/id;->b(Landroid/graphics/PointF;Landroid/graphics/PointF;FF)Z

    move-result v5

    if-eqz v5, :cond_18

    .line 1168
    const/4 v3, 0x1

    goto :goto_9

    .line 1171
    :cond_18
    iget v5, v7, Landroid/graphics/PointF;->y:F

    iget v6, v7, Landroid/graphics/PointF;->x:F

    mul-float v6, v6, p1

    add-float v6, v6, p2

    sub-float/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    const/high16 v6, 0x3f000000    # 0.5f

    cmpg-float v5, v5, v6

    if-gez v5, :cond_19

    .line 1172
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    invoke-direct {v0, v7, v4, v1, v2}, Lcom/roidapp/photogrid/release/id;->b(Landroid/graphics/PointF;Landroid/graphics/PointF;FF)Z

    move-result v4

    if-eqz v4, :cond_19

    .line 1173
    const/4 v3, 0x1

    goto :goto_9

    .line 1176
    :cond_19
    iput-object v9, v3, Lcom/roidapp/photogrid/release/lc;->d:Ljava/util/ArrayList;

    goto/16 :goto_8

    .line 1180
    :cond_1a
    invoke-direct/range {p0 .. p0}, Lcom/roidapp/photogrid/release/id;->c()V

    .line 1182
    const/4 v3, 0x0

    goto :goto_9

    :cond_1b
    move v3, v4

    goto/16 :goto_1
.end method

.method private b(Landroid/graphics/PointF;Landroid/graphics/PointF;F)Z
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 1222
    iget v0, p2, Landroid/graphics/PointF;->x:F

    iget v1, p1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v1

    .line 1223
    iget v1, p2, Landroid/graphics/PointF;->y:F

    iget v2, p1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v2

    .line 1224
    div-float v2, v1, v0

    .line 1225
    iget v3, p1, Landroid/graphics/PointF;->y:F

    iget v4, p1, Landroid/graphics/PointF;->x:F

    mul-float/2addr v4, v2

    sub-float/2addr v3, v4

    .line 1226
    iput p3, p1, Landroid/graphics/PointF;->y:F

    .line 1227
    cmpl-float v0, v0, v5

    if-eqz v0, :cond_0

    cmpl-float v0, v1, v5

    if-eqz v0, :cond_0

    .line 1228
    iget v0, p1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v0, v3

    div-float/2addr v0, v2

    iput v0, p1, Landroid/graphics/PointF;->x:F

    .line 1231
    :cond_0
    cmpl-float v0, v1, v5

    if-lez v0, :cond_1

    .line 1232
    iget v0, p2, Landroid/graphics/PointF;->y:F

    iget v1, p1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v0, v1

    .line 1236
    :goto_0
    iget v1, p0, Lcom/roidapp/photogrid/release/id;->A:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 1237
    const/4 v0, 0x1

    .line 1239
    :goto_1
    return v0

    .line 1234
    :cond_1
    iget v0, p1, Landroid/graphics/PointF;->y:F

    iget v1, p2, Landroid/graphics/PointF;->y:F

    sub-float/2addr v0, v1

    goto :goto_0

    .line 1239
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private b(Landroid/graphics/PointF;Landroid/graphics/PointF;FF)Z
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 1287
    iget v0, p2, Landroid/graphics/PointF;->x:F

    iget v1, p1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v1

    .line 1288
    iget v1, p2, Landroid/graphics/PointF;->y:F

    iget v2, p1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v2

    .line 1290
    cmpl-float v2, v0, v4

    if-nez v2, :cond_0

    .line 1291
    iget v0, p1, Landroid/graphics/PointF;->x:F

    mul-float/2addr v0, p3

    add-float/2addr v0, p4

    iput v0, p1, Landroid/graphics/PointF;->y:F

    .line 1303
    :goto_0
    cmpl-float v0, v1, v4

    if-lez v0, :cond_2

    .line 1304
    iget v0, p2, Landroid/graphics/PointF;->y:F

    iget v1, p1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v0, v1

    .line 1308
    :goto_1
    iget v1, p0, Lcom/roidapp/photogrid/release/id;->A:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    .line 1309
    const/4 v0, 0x1

    .line 1311
    :goto_2
    return v0

    .line 1292
    :cond_0
    cmpl-float v2, v1, v4

    if-nez v2, :cond_1

    .line 1293
    iget v0, p1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v0, p4

    div-float/2addr v0, p3

    iput v0, p1, Landroid/graphics/PointF;->x:F

    goto :goto_0

    .line 1295
    :cond_1
    div-float v0, v1, v0

    .line 1296
    iget v2, p1, Landroid/graphics/PointF;->y:F

    iget v3, p1, Landroid/graphics/PointF;->x:F

    mul-float/2addr v3, v0

    sub-float/2addr v2, v3

    .line 1297
    sub-float/2addr v2, p4

    sub-float v0, p3, v0

    div-float v0, v2, v0

    .line 1298
    mul-float v2, p3, v0

    add-float/2addr v2, p4

    .line 1299
    iput v0, p1, Landroid/graphics/PointF;->x:F

    .line 1300
    iput v2, p1, Landroid/graphics/PointF;->y:F

    goto :goto_0

    .line 1306
    :cond_2
    iget v0, p1, Landroid/graphics/PointF;->y:F

    iget v1, p2, Landroid/graphics/PointF;->y:F

    sub-float/2addr v0, v1

    goto :goto_1

    .line 1311
    :cond_3
    const/4 v0, 0x0

    goto :goto_2
.end method

.method private c()V
    .locals 15

    .prologue
    const/high16 v3, 0x42c80000    # 100.0f

    const/high16 v14, 0x40000000    # 2.0f

    const/4 v13, 0x1

    const/4 v5, 0x0

    .line 1440
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/lc;

    .line 1441
    iget-object v2, v0, Lcom/roidapp/photogrid/release/lc;->d:Ljava/util/ArrayList;

    iput-object v2, v0, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    .line 1442
    const/4 v2, 0x0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/lc;->d:Ljava/util/ArrayList;

    goto :goto_0

    .line 1444
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/release/id;->o:I

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->p:I

    .line 1445
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    .line 2316
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 2319
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 2324
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/lc;

    .line 2325
    iget-object v1, v0, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 2326
    iget-object v1, v0, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v2, v3

    move v4, v5

    move v6, v3

    move v7, v5

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    .line 2327
    iget v10, v1, Landroid/graphics/PointF;->x:F

    cmpl-float v10, v10, v7

    if-lez v10, :cond_1

    .line 2328
    iget v7, v1, Landroid/graphics/PointF;->x:F

    .line 2330
    :cond_1
    iget v10, v1, Landroid/graphics/PointF;->x:F

    cmpg-float v10, v10, v6

    if-gez v10, :cond_2

    .line 2331
    iget v6, v1, Landroid/graphics/PointF;->x:F

    .line 2334
    :cond_2
    iget v10, v1, Landroid/graphics/PointF;->y:F

    cmpl-float v10, v10, v4

    if-lez v10, :cond_3

    .line 2335
    iget v4, v1, Landroid/graphics/PointF;->y:F

    .line 2337
    :cond_3
    iget v10, v1, Landroid/graphics/PointF;->y:F

    cmpg-float v10, v10, v2

    if-gez v10, :cond_a

    .line 2338
    iget v1, v1, Landroid/graphics/PointF;->y:F

    :goto_3
    move v2, v1

    .line 2340
    goto :goto_2

    .line 2358
    :cond_4
    sub-float v1, v7, v6

    iput v1, v0, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 2359
    sub-float v1, v4, v2

    iput v1, v0, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 2379
    iput v6, v0, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 2380
    iput v2, v0, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 2412
    iget-boolean v1, v0, Lcom/roidapp/photogrid/release/lc;->f:Z

    if-eqz v1, :cond_6

    .line 2415
    iget-object v1, v0, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v4, v5

    move v7, v5

    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    .line 2416
    iget v10, v1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v10, v6

    .line 2417
    iget v1, v1, Landroid/graphics/PointF;->y:F

    sub-float v11, v1, v2

    .line 2418
    add-float/2addr v7, v10

    .line 2419
    add-float v1, v4, v11

    .line 2420
    iget-object v4, v0, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    new-instance v12, Landroid/graphics/PointF;

    invoke-direct {v12, v10, v11}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v4, v1

    .line 2421
    goto :goto_4

    .line 2422
    :cond_5
    iget-object v1, v0, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 2424
    new-instance v2, Landroid/graphics/PointF;

    int-to-float v6, v1

    div-float v6, v7, v6

    int-to-float v1, v1

    div-float v1, v4, v1

    invoke-direct {v2, v6, v1}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v2, v0, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    goto/16 :goto_1

    .line 2427
    :cond_6
    iget-object v1, v0, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    .line 2428
    iget-object v7, v0, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    new-instance v9, Landroid/graphics/PointF;

    iget v10, v1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v10, v6

    iget v1, v1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v2

    invoke-direct {v9, v10, v1}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-interface {v7, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 2431
    :cond_7
    new-instance v1, Landroid/graphics/PointF;

    iget v2, v0, Lcom/roidapp/photogrid/release/lc;->l:F

    div-float/2addr v2, v14

    iget v4, v0, Lcom/roidapp/photogrid/release/lc;->m:F

    div-float/2addr v4, v14

    invoke-direct {v1, v2, v4}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v1, v0, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    goto/16 :goto_1

    .line 2348
    :cond_8
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/id;->D:Z

    if-nez v0, :cond_9

    .line 2349
    iput-boolean v13, p0, Lcom/roidapp/photogrid/release/id;->D:Z

    .line 2350
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v13}, Lcom/roidapp/photogrid/release/ih;->o(Z)V

    .line 1446
    :cond_9
    iget v0, p0, Lcom/roidapp/photogrid/release/id;->o:I

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->p:I

    .line 1447
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->s:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0, v13}, Lcom/roidapp/photogrid/release/mm;->c(I)V

    .line 1448
    return-void

    :cond_a
    move v1, v2

    goto/16 :goto_3
.end method

.method private c(FF)Z
    .locals 15

    .prologue
    .line 348
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v1

    if-nez v1, :cond_14

    .line 353
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 354
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->s:Lcom/roidapp/photogrid/release/mm;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/mm;->y:Ljava/util/ArrayList;

    .line 355
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    .line 356
    iget-object v4, v1, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    .line 358
    iget-object v1, v4, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    .line 359
    iget v2, v1, Landroid/graphics/PointF;->x:F

    sub-float v2, v2, p1

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/high16 v7, 0x3f000000    # 0.5f

    cmpg-float v2, v2, v7

    if-gez v2, :cond_1

    .line 361
    iget-object v2, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 363
    iget v2, v1, Landroid/graphics/PointF;->y:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 364
    iget v2, v1, Landroid/graphics/PointF;->y:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 365
    add-int/lit8 v2, v2, 0x1

    .line 366
    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v5, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 368
    :cond_2
    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v5, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 380
    :cond_3
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 381
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 382
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    invoke-virtual {v7, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 383
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    invoke-virtual {v7, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 389
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v8

    .line 392
    :cond_4
    invoke-virtual {v6}, Ljava/util/HashSet;->size()I

    move-result v9

    .line 393
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/lc;

    .line 394
    const/4 v2, 0x0

    .line 395
    iget-object v3, v1, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move v4, v2

    :cond_6
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/PointF;

    .line 396
    if-nez v4, :cond_6

    .line 397
    invoke-virtual {v7}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/PointF;

    .line 398
    iget v13, v2, Landroid/graphics/PointF;->x:F

    iget v14, v3, Landroid/graphics/PointF;->x:F

    sub-float/2addr v13, v14

    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    move-result v13

    const/high16 v14, 0x3f000000    # 0.5f

    cmpg-float v13, v13, v14

    if-gez v13, :cond_7

    iget v13, v2, Landroid/graphics/PointF;->y:F

    iget v3, v3, Landroid/graphics/PointF;->y:F

    sub-float v3, v13, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    const/high16 v13, 0x3f000000    # 0.5f

    cmpg-float v3, v3, v13

    if-gez v3, :cond_7

    .line 399
    invoke-virtual {v6, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 400
    const/4 v2, 0x1

    move v4, v2

    .line 401
    goto :goto_1

    .line 408
    :cond_8
    if-eqz v4, :cond_5

    .line 409
    iget-object v1, v1, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    .line 410
    invoke-virtual {v7, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 414
    :cond_9
    invoke-virtual {v6}, Ljava/util/HashSet;->size()I

    move-result v1

    .line 415
    iget-object v2, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v2, v6}, Ljava/util/HashSet;->removeAll(Ljava/util/Collection;)Z

    .line 417
    if-eq v1, v8, :cond_a

    if-ne v9, v1, :cond_4

    .line 424
    :cond_a
    iput-object v6, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    .line 432
    invoke-virtual {v5}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 433
    :cond_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_14

    .line 434
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v4

    .line 435
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 436
    const/4 v2, 0x4

    if-ne v1, v2, :cond_b

    .line 438
    invoke-virtual {v5}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 439
    :cond_c
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    .line 440
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v7

    .line 442
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    cmpg-float v1, v4, v1

    if-gtz v1, :cond_10

    cmpg-float v1, v7, v4

    if-gez v1, :cond_10

    .line 444
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 445
    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 446
    :cond_d
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    .line 447
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/roidapp/photogrid/release/lc;

    .line 448
    iget-boolean v1, v2, Lcom/roidapp/photogrid/release/lc;->f:Z

    if-nez v1, :cond_d

    .line 449
    iget-object v1, v2, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_e
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    .line 450
    iget v1, v1, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v7

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v11, 0x3f000000    # 0.5f

    cmpg-float v1, v1, v11

    if-gez v1, :cond_e

    .line 451
    invoke-virtual {v9, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 458
    :cond_f
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v1, v9}, Ljava/util/HashSet;->removeAll(Ljava/util/Collection;)Z

    .line 462
    :cond_10
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    cmpl-float v1, v4, v1

    if-ltz v1, :cond_c

    cmpl-float v1, v7, v4

    if-lez v1, :cond_c

    .line 465
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 466
    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 467
    :cond_11
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_13

    .line 468
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/lc;

    .line 469
    iget-boolean v2, v1, Lcom/roidapp/photogrid/release/lc;->f:Z

    if-nez v2, :cond_11

    .line 470
    iget-object v2, v1, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_12
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/PointF;

    .line 471
    iget v2, v2, Landroid/graphics/PointF;->y:F

    sub-float/2addr v2, v7

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/high16 v11, 0x3f000000    # 0.5f

    cmpg-float v2, v2, v11

    if-gez v2, :cond_12

    .line 472
    invoke-virtual {v9, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 479
    :cond_13
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v1, v9}, Ljava/util/HashSet;->removeAll(Ljava/util/Collection;)Z

    goto/16 :goto_3

    .line 503
    :cond_14
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/lc;

    .line 504
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/lc;->b()Ljava/util/ArrayList;

    move-result-object v7

    .line 506
    const/4 v2, 0x0

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/PointF;

    .line 507
    const/4 v3, 0x1

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/PointF;

    .line 508
    const/4 v4, 0x2

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/PointF;

    .line 509
    const/4 v5, 0x3

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/PointF;

    .line 510
    iget v8, v2, Landroid/graphics/PointF;->x:F

    sub-float v8, v8, p1

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    const/high16 v9, 0x3f000000    # 0.5f

    cmpg-float v8, v8, v9

    if-gez v8, :cond_15

    .line 511
    move/from16 v0, p2

    invoke-direct {p0, v2, v3, v0}, Lcom/roidapp/photogrid/release/id;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;F)Z

    move-result v8

    if-eqz v8, :cond_15

    .line 512
    const/4 v1, 0x1

    .line 537
    :goto_7
    return v1

    .line 515
    :cond_15
    iget v8, v3, Landroid/graphics/PointF;->x:F

    sub-float v8, v8, p1

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    const/high16 v9, 0x3f000000    # 0.5f

    cmpg-float v8, v8, v9

    if-gez v8, :cond_16

    .line 516
    move/from16 v0, p2

    invoke-direct {p0, v3, v2, v0}, Lcom/roidapp/photogrid/release/id;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;F)Z

    move-result v2

    if-eqz v2, :cond_16

    .line 517
    const/4 v1, 0x1

    goto :goto_7

    .line 520
    :cond_16
    iget v2, v4, Landroid/graphics/PointF;->x:F

    sub-float v2, v2, p1

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/high16 v3, 0x3f000000    # 0.5f

    cmpg-float v2, v2, v3

    if-gez v2, :cond_17

    .line 521
    move/from16 v0, p2

    invoke-direct {p0, v4, v5, v0}, Lcom/roidapp/photogrid/release/id;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;F)Z

    move-result v2

    if-eqz v2, :cond_17

    .line 522
    const/4 v1, 0x1

    goto :goto_7

    .line 525
    :cond_17
    iget v2, v5, Landroid/graphics/PointF;->x:F

    sub-float v2, v2, p1

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/high16 v3, 0x3f000000    # 0.5f

    cmpg-float v2, v2, v3

    if-gez v2, :cond_18

    .line 526
    move/from16 v0, p2

    invoke-direct {p0, v5, v4, v0}, Lcom/roidapp/photogrid/release/id;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;F)Z

    move-result v2

    if-eqz v2, :cond_18

    .line 527
    const/4 v1, 0x1

    goto :goto_7

    .line 530
    :cond_18
    iput-object v7, v1, Lcom/roidapp/photogrid/release/lc;->d:Ljava/util/ArrayList;

    goto/16 :goto_6

    .line 534
    :cond_19
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/id;->c()V

    .line 537
    const/4 v1, 0x0

    goto :goto_7
.end method

.method private d(FF)Z
    .locals 15

    .prologue
    .line 549
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v1

    if-nez v1, :cond_14

    .line 554
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 555
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->s:Lcom/roidapp/photogrid/release/mm;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/mm;->y:Ljava/util/ArrayList;

    .line 556
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    .line 557
    iget-object v4, v1, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    .line 559
    iget-object v1, v4, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    .line 560
    iget v2, v1, Landroid/graphics/PointF;->y:F

    sub-float v2, v2, p1

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/high16 v7, 0x3f000000    # 0.5f

    cmpg-float v2, v2, v7

    if-gez v2, :cond_1

    .line 566
    iget-object v2, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 568
    iget v2, v1, Landroid/graphics/PointF;->x:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 569
    iget v2, v1, Landroid/graphics/PointF;->x:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 570
    add-int/lit8 v2, v2, 0x1

    .line 571
    iget v1, v1, Landroid/graphics/PointF;->x:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v5, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 573
    :cond_2
    iget v1, v1, Landroid/graphics/PointF;->x:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v5, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 585
    :cond_3
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 586
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 587
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    invoke-virtual {v7, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 588
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    invoke-virtual {v7, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 594
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v8

    .line 597
    :cond_4
    invoke-virtual {v6}, Ljava/util/HashSet;->size()I

    move-result v9

    .line 598
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/lc;

    .line 599
    const/4 v2, 0x0

    .line 600
    iget-object v3, v1, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move v4, v2

    :cond_6
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/PointF;

    .line 601
    if-nez v4, :cond_6

    .line 602
    invoke-virtual {v7}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/PointF;

    .line 603
    iget v13, v2, Landroid/graphics/PointF;->x:F

    iget v14, v3, Landroid/graphics/PointF;->x:F

    sub-float/2addr v13, v14

    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    move-result v13

    const/high16 v14, 0x3f000000    # 0.5f

    cmpg-float v13, v13, v14

    if-gez v13, :cond_7

    iget v13, v2, Landroid/graphics/PointF;->y:F

    iget v3, v3, Landroid/graphics/PointF;->y:F

    sub-float v3, v13, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    const/high16 v13, 0x3f000000    # 0.5f

    cmpg-float v3, v3, v13

    if-gez v3, :cond_7

    .line 604
    invoke-virtual {v6, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 605
    const/4 v2, 0x1

    move v4, v2

    .line 606
    goto :goto_1

    .line 613
    :cond_8
    if-eqz v4, :cond_5

    .line 614
    iget-object v1, v1, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    .line 615
    invoke-virtual {v7, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 619
    :cond_9
    invoke-virtual {v6}, Ljava/util/HashSet;->size()I

    move-result v1

    .line 620
    iget-object v2, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v2, v6}, Ljava/util/HashSet;->removeAll(Ljava/util/Collection;)Z

    .line 622
    if-eq v1, v8, :cond_a

    if-ne v9, v1, :cond_4

    .line 629
    :cond_a
    iput-object v6, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    .line 636
    invoke-virtual {v5}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 637
    :cond_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_14

    .line 638
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v4

    .line 639
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 640
    const/4 v2, 0x4

    if-ne v1, v2, :cond_b

    .line 642
    invoke-virtual {v5}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 643
    :cond_c
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    .line 644
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v7

    .line 646
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    cmpg-float v1, v4, v1

    if-gtz v1, :cond_10

    cmpg-float v1, v7, v4

    if-gez v1, :cond_10

    .line 648
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 649
    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 650
    :cond_d
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    .line 651
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/roidapp/photogrid/release/lc;

    .line 652
    iget-boolean v1, v2, Lcom/roidapp/photogrid/release/lc;->f:Z

    if-nez v1, :cond_d

    .line 653
    iget-object v1, v2, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_e
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    .line 654
    iget v1, v1, Landroid/graphics/PointF;->x:F

    sub-float/2addr v1, v7

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v11, 0x3f000000    # 0.5f

    cmpg-float v1, v1, v11

    if-gez v1, :cond_e

    .line 655
    invoke-virtual {v9, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 661
    :cond_f
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v1, v9}, Ljava/util/HashSet;->removeAll(Ljava/util/Collection;)Z

    .line 665
    :cond_10
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    cmpl-float v1, v4, v1

    if-ltz v1, :cond_c

    cmpl-float v1, v7, v4

    if-lez v1, :cond_c

    .line 668
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 669
    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 670
    :cond_11
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_13

    .line 671
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/lc;

    .line 672
    iget-boolean v2, v1, Lcom/roidapp/photogrid/release/lc;->f:Z

    if-nez v2, :cond_11

    .line 673
    iget-object v2, v1, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_12
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/PointF;

    .line 674
    iget v2, v2, Landroid/graphics/PointF;->x:F

    sub-float/2addr v2, v7

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/high16 v11, 0x3f000000    # 0.5f

    cmpg-float v2, v2, v11

    if-gez v2, :cond_12

    .line 675
    invoke-virtual {v9, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 681
    :cond_13
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v1, v9}, Ljava/util/HashSet;->removeAll(Ljava/util/Collection;)Z

    goto/16 :goto_3

    .line 703
    :cond_14
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/lc;

    .line 704
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/lc;->b()Ljava/util/ArrayList;

    move-result-object v7

    .line 706
    const/4 v2, 0x0

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/PointF;

    .line 707
    const/4 v3, 0x1

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/PointF;

    .line 708
    const/4 v4, 0x2

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/PointF;

    .line 709
    const/4 v5, 0x3

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/PointF;

    .line 710
    iget v8, v2, Landroid/graphics/PointF;->y:F

    sub-float v8, v8, p1

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    const/high16 v9, 0x3f000000    # 0.5f

    cmpg-float v8, v8, v9

    if-gez v8, :cond_15

    .line 711
    move/from16 v0, p2

    invoke-direct {p0, v2, v5, v0}, Lcom/roidapp/photogrid/release/id;->b(Landroid/graphics/PointF;Landroid/graphics/PointF;F)Z

    move-result v8

    if-eqz v8, :cond_15

    .line 712
    const/4 v1, 0x1

    .line 736
    :goto_7
    return v1

    .line 715
    :cond_15
    iget v8, v3, Landroid/graphics/PointF;->y:F

    sub-float v8, v8, p1

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    const/high16 v9, 0x3f000000    # 0.5f

    cmpg-float v8, v8, v9

    if-gez v8, :cond_16

    .line 716
    move/from16 v0, p2

    invoke-direct {p0, v3, v4, v0}, Lcom/roidapp/photogrid/release/id;->b(Landroid/graphics/PointF;Landroid/graphics/PointF;F)Z

    move-result v8

    if-eqz v8, :cond_16

    .line 717
    const/4 v1, 0x1

    goto :goto_7

    .line 720
    :cond_16
    iget v8, v4, Landroid/graphics/PointF;->y:F

    sub-float v8, v8, p1

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    const/high16 v9, 0x3f000000    # 0.5f

    cmpg-float v8, v8, v9

    if-gez v8, :cond_17

    .line 721
    move/from16 v0, p2

    invoke-direct {p0, v4, v3, v0}, Lcom/roidapp/photogrid/release/id;->b(Landroid/graphics/PointF;Landroid/graphics/PointF;F)Z

    move-result v3

    if-eqz v3, :cond_17

    .line 722
    const/4 v1, 0x1

    goto :goto_7

    .line 725
    :cond_17
    iget v3, v5, Landroid/graphics/PointF;->y:F

    sub-float v3, v3, p1

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    const/high16 v4, 0x3f000000    # 0.5f

    cmpg-float v3, v3, v4

    if-gez v3, :cond_18

    .line 726
    move/from16 v0, p2

    invoke-direct {p0, v5, v2, v0}, Lcom/roidapp/photogrid/release/id;->b(Landroid/graphics/PointF;Landroid/graphics/PointF;F)Z

    move-result v2

    if-eqz v2, :cond_18

    .line 727
    const/4 v1, 0x1

    goto :goto_7

    .line 730
    :cond_18
    iput-object v7, v1, Lcom/roidapp/photogrid/release/lc;->d:Ljava/util/ArrayList;

    goto/16 :goto_6

    .line 733
    :cond_19
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/id;->c()V

    .line 736
    const/4 v1, 0x0

    goto :goto_7
.end method


# virtual methods
.method protected final a()V
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 127
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 129
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/id;->a:Landroid/graphics/Bitmap;

    .line 130
    return-void
.end method

.method protected final a(F)V
    .locals 5

    .prologue
    const/high16 v4, 0x40000000    # 2.0f

    .line 176
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/id;->C:Z

    .line 177
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->B:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 178
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->B:Landroid/graphics/Matrix;

    iget v1, p0, Lcom/roidapp/photogrid/release/id;->d:F

    iget v2, p0, Lcom/roidapp/photogrid/release/id;->k:I

    int-to-float v2, v2

    div-float/2addr v2, v4

    add-float/2addr v1, v2

    iget v2, p0, Lcom/roidapp/photogrid/release/id;->e:F

    iget v3, p0, Lcom/roidapp/photogrid/release/id;->l:I

    int-to-float v3, v3

    div-float/2addr v3, v4

    add-float/2addr v2, v3

    invoke-virtual {v0, p1, p1, v1, v2}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 179
    return-void
.end method

.method protected final a(FF)V
    .locals 0

    .prologue
    .line 121
    iput p1, p0, Lcom/roidapp/photogrid/release/id;->x:F

    .line 122
    iput p2, p0, Lcom/roidapp/photogrid/release/id;->y:F

    .line 123
    return-void
.end method

.method protected final a(FFZ)V
    .locals 2

    .prologue
    const/high16 v1, 0x40000000    # 2.0f

    .line 154
    iget v0, p0, Lcom/roidapp/photogrid/release/id;->k:I

    int-to-float v0, v0

    div-float/2addr v0, v1

    sub-float v0, p1, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->d:F

    .line 155
    iget v0, p0, Lcom/roidapp/photogrid/release/id;->l:I

    int-to-float v0, v0

    div-float/2addr v0, v1

    sub-float v0, p2, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->e:F

    .line 156
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->R()F

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->z:F

    .line 157
    const/high16 v0, 0x41400000    # 12.0f

    iget v1, p0, Lcom/roidapp/photogrid/release/id;->z:F

    add-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->A:F

    .line 158
    if-eqz p3, :cond_0

    .line 159
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 160
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->o:I

    .line 161
    const/4 v0, -0x2

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->p:I

    .line 169
    :cond_0
    return-void
.end method

.method protected final a(IIII)V
    .locals 0

    .prologue
    .line 111
    iput p1, p0, Lcom/roidapp/photogrid/release/id;->t:I

    .line 112
    iput p2, p0, Lcom/roidapp/photogrid/release/id;->u:I

    .line 113
    iput p3, p0, Lcom/roidapp/photogrid/release/id;->v:I

    .line 114
    iput p4, p0, Lcom/roidapp/photogrid/release/id;->w:I

    .line 115
    return-void
.end method

.method protected final a(Landroid/graphics/Canvas;)V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 134
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 135
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/id;->C:Z

    if-eqz v0, :cond_1

    .line 136
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/id;->C:Z

    .line 137
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 138
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->B:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 139
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->a:Landroid/graphics/Bitmap;

    iget v1, p0, Lcom/roidapp/photogrid/release/id;->d:F

    iget v2, p0, Lcom/roidapp/photogrid/release/id;->e:F

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 140
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 141
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->b:Landroid/graphics/RectF;

    iget v1, p0, Lcom/roidapp/photogrid/release/id;->d:F

    iget v2, p0, Lcom/roidapp/photogrid/release/id;->e:F

    iget v3, p0, Lcom/roidapp/photogrid/release/id;->d:F

    iget v4, p0, Lcom/roidapp/photogrid/release/id;->k:I

    int-to-float v4, v4

    add-float/2addr v3, v4

    iget v4, p0, Lcom/roidapp/photogrid/release/id;->e:F

    iget v5, p0, Lcom/roidapp/photogrid/release/id;->l:I

    int-to-float v5, v5

    add-float/2addr v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 148
    :cond_0
    :goto_0
    return-void

    .line 143
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->a:Landroid/graphics/Bitmap;

    iget v1, p0, Lcom/roidapp/photogrid/release/id;->d:F

    iget v2, p0, Lcom/roidapp/photogrid/release/id;->e:F

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 144
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->b:Landroid/graphics/RectF;

    iget v1, p0, Lcom/roidapp/photogrid/release/id;->d:F

    iget v2, p0, Lcom/roidapp/photogrid/release/id;->e:F

    iget v3, p0, Lcom/roidapp/photogrid/release/id;->d:F

    iget v4, p0, Lcom/roidapp/photogrid/release/id;->k:I

    int-to-float v4, v4

    add-float/2addr v3, v4

    iget v4, p0, Lcom/roidapp/photogrid/release/id;->e:F

    iget v5, p0, Lcom/roidapp/photogrid/release/id;->l:I

    int-to-float v5, v5

    add-float/2addr v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_0
.end method

.method protected final a(Landroid/graphics/PointF;Landroid/graphics/PointF;)V
    .locals 0

    .prologue
    .line 106
    iput-object p1, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    .line 107
    iput-object p2, p0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    .line 108
    return-void
.end method

.method protected final b()V
    .locals 1

    .prologue
    .line 172
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 173
    return-void
.end method

.method protected final declared-synchronized b(FF)Z
    .locals 5

    .prologue
    const/high16 v2, 0x40000000    # 2.0f

    const/4 v3, 0x0

    const/high16 v4, 0x42c80000    # 100.0f

    .line 182
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/id;->r:Z

    .line 194
    iget v0, p0, Lcom/roidapp/photogrid/release/id;->g:I

    packed-switch v0, :pswitch_data_0

    .line 207
    :goto_0
    mul-float v0, p1, v4

    iget v1, p0, Lcom/roidapp/photogrid/release/id;->t:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 208
    mul-float v1, p2, v4

    iget v2, p0, Lcom/roidapp/photogrid/release/id;->u:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 211
    iget v2, p0, Lcom/roidapp/photogrid/release/id;->g:I

    packed-switch v2, :pswitch_data_1

    .line 335
    :goto_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/id;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    .line 197
    :pswitch_0
    :try_start_1
    iget v0, p0, Lcom/roidapp/photogrid/release/id;->x:F

    sub-float v0, p1, v0

    iget v1, p0, Lcom/roidapp/photogrid/release/id;->v:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    sub-float p1, v0, v2

    .line 198
    iget v0, p0, Lcom/roidapp/photogrid/release/id;->y:F

    sub-float v0, p2, v0

    iget v1, p0, Lcom/roidapp/photogrid/release/id;->w:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    sub-float p2, v0, v2

    .line 199
    goto :goto_0

    .line 202
    :pswitch_1
    iget v0, p0, Lcom/roidapp/photogrid/release/id;->x:F

    add-float/2addr v0, p1

    iget v1, p0, Lcom/roidapp/photogrid/release/id;->v:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    sub-float p1, v0, v2

    .line 203
    iget v0, p0, Lcom/roidapp/photogrid/release/id;->y:F

    add-float/2addr v0, p2

    iget v1, p0, Lcom/roidapp/photogrid/release/id;->w:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    sub-float p2, v0, v2

    goto :goto_0

    .line 213
    :pswitch_2
    iget v0, p0, Lcom/roidapp/photogrid/release/id;->e:F

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    .line 214
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->o:I

    .line 226
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v2

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->m:F

    .line 227
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    iget-object v2, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    sub-float/2addr v0, v2

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->n:F

    .line 228
    iget v0, p0, Lcom/roidapp/photogrid/release/id;->m:F

    cmpl-float v0, v0, v3

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/roidapp/photogrid/release/id;->n:F

    cmpl-float v0, v0, v3

    if-eqz v0, :cond_1

    .line 229
    iget v0, p0, Lcom/roidapp/photogrid/release/id;->n:F

    iget v1, p0, Lcom/roidapp/photogrid/release/id;->m:F

    div-float/2addr v0, v1

    .line 230
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    iget-object v2, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->x:F

    mul-float/2addr v2, v0

    sub-float/2addr v1, v2

    .line 231
    mul-float v2, p2, v4

    iget v3, p0, Lcom/roidapp/photogrid/release/id;->u:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    mul-float v3, p1, v4

    iget v4, p0, Lcom/roidapp/photogrid/release/id;->t:I

    int-to-float v4, v4

    div-float/2addr v3, v4

    mul-float/2addr v3, v0

    sub-float/2addr v2, v3

    .line 233
    invoke-direct {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/id;->b(FFF)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/id;->j:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 182
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 216
    :cond_0
    const/4 v0, 0x1

    :try_start_2
    iput v0, p0, Lcom/roidapp/photogrid/release/id;->o:I

    goto :goto_2

    .line 235
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/id;->d(FF)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/id;->j:Z

    goto/16 :goto_1

    .line 240
    :pswitch_3
    iget v1, p0, Lcom/roidapp/photogrid/release/id;->d:F

    cmpg-float v1, p1, v1

    if-gez v1, :cond_2

    .line 241
    const/4 v1, 0x2

    iput v1, p0, Lcom/roidapp/photogrid/release/id;->o:I

    .line 254
    :goto_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->x:F

    sub-float/2addr v1, v2

    iput v1, p0, Lcom/roidapp/photogrid/release/id;->m:F

    .line 255
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    iget-object v2, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v2

    iput v1, p0, Lcom/roidapp/photogrid/release/id;->n:F

    .line 257
    iget v1, p0, Lcom/roidapp/photogrid/release/id;->m:F

    cmpl-float v1, v1, v3

    if-eqz v1, :cond_3

    iget v1, p0, Lcom/roidapp/photogrid/release/id;->n:F

    cmpl-float v1, v1, v3

    if-eqz v1, :cond_3

    .line 258
    iget v0, p0, Lcom/roidapp/photogrid/release/id;->n:F

    iget v1, p0, Lcom/roidapp/photogrid/release/id;->m:F

    div-float/2addr v0, v1

    .line 259
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    iget-object v2, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->x:F

    mul-float/2addr v2, v0

    sub-float/2addr v1, v2

    .line 260
    mul-float v2, p2, v4

    iget v3, p0, Lcom/roidapp/photogrid/release/id;->u:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    mul-float v3, p1, v4

    iget v4, p0, Lcom/roidapp/photogrid/release/id;->t:I

    int-to-float v4, v4

    div-float/2addr v3, v4

    mul-float/2addr v3, v0

    sub-float/2addr v2, v3

    .line 262
    invoke-direct {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/id;->a(FFF)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/id;->j:Z

    goto/16 :goto_1

    .line 243
    :cond_2
    const/4 v1, 0x3

    iput v1, p0, Lcom/roidapp/photogrid/release/id;->o:I

    goto :goto_3

    .line 264
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    invoke-direct {p0, v1, v0}, Lcom/roidapp/photogrid/release/id;->c(FF)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/id;->j:Z

    goto/16 :goto_1

    .line 270
    :pswitch_4
    iget v0, p0, Lcom/roidapp/photogrid/release/id;->e:F

    cmpg-float v0, p2, v0

    if-gez v0, :cond_4

    .line 271
    const/4 v0, 0x4

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->o:I

    .line 284
    :goto_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->x:F

    sub-float/2addr v0, v2

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->m:F

    .line 285
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    iget-object v2, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    sub-float/2addr v0, v2

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->n:F

    .line 286
    iget v0, p0, Lcom/roidapp/photogrid/release/id;->m:F

    cmpl-float v0, v0, v3

    if-eqz v0, :cond_5

    iget v0, p0, Lcom/roidapp/photogrid/release/id;->n:F

    cmpl-float v0, v0, v3

    if-eqz v0, :cond_5

    .line 287
    iget v0, p0, Lcom/roidapp/photogrid/release/id;->n:F

    iget v1, p0, Lcom/roidapp/photogrid/release/id;->m:F

    div-float/2addr v0, v1

    .line 288
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    iget-object v2, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->x:F

    mul-float/2addr v2, v0

    sub-float/2addr v1, v2

    .line 289
    mul-float v2, p2, v4

    iget v3, p0, Lcom/roidapp/photogrid/release/id;->u:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    mul-float v3, p1, v4

    iget v4, p0, Lcom/roidapp/photogrid/release/id;->t:I

    int-to-float v4, v4

    div-float/2addr v3, v4

    mul-float/2addr v3, v0

    sub-float/2addr v2, v3

    .line 291
    invoke-direct {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/id;->b(FFF)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/id;->j:Z

    goto/16 :goto_1

    .line 273
    :cond_4
    const/4 v0, 0x5

    iput v0, p0, Lcom/roidapp/photogrid/release/id;->o:I

    goto :goto_4

    .line 293
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/id;->d(FF)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/id;->j:Z

    goto/16 :goto_1

    .line 301
    :pswitch_5
    iget v1, p0, Lcom/roidapp/photogrid/release/id;->d:F

    cmpg-float v1, p1, v1

    if-gez v1, :cond_6

    .line 302
    const/4 v1, 0x6

    iput v1, p0, Lcom/roidapp/photogrid/release/id;->o:I

    .line 315
    :goto_5
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    iget-object v2, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->x:F

    sub-float/2addr v1, v2

    iput v1, p0, Lcom/roidapp/photogrid/release/id;->m:F

    .line 316
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->i:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    iget-object v2, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->y:F

    sub-float/2addr v1, v2

    iput v1, p0, Lcom/roidapp/photogrid/release/id;->n:F

    .line 317
    iget v1, p0, Lcom/roidapp/photogrid/release/id;->m:F

    cmpl-float v1, v1, v3

    if-eqz v1, :cond_7

    iget v1, p0, Lcom/roidapp/photogrid/release/id;->n:F

    cmpl-float v1, v1, v3

    if-eqz v1, :cond_7

    .line 318
    iget v0, p0, Lcom/roidapp/photogrid/release/id;->n:F

    iget v1, p0, Lcom/roidapp/photogrid/release/id;->m:F

    div-float/2addr v0, v1

    .line 319
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    iget-object v2, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->x:F

    mul-float/2addr v2, v0

    sub-float/2addr v1, v2

    .line 320
    mul-float v2, p2, v4

    iget v3, p0, Lcom/roidapp/photogrid/release/id;->u:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    mul-float v3, p1, v4

    iget v4, p0, Lcom/roidapp/photogrid/release/id;->t:I

    int-to-float v4, v4

    div-float/2addr v3, v4

    mul-float/2addr v3, v0

    sub-float/2addr v2, v3

    .line 322
    invoke-direct {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/id;->a(FFF)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/id;->j:Z

    goto/16 :goto_1

    .line 304
    :cond_6
    const/4 v1, 0x7

    iput v1, p0, Lcom/roidapp/photogrid/release/id;->o:I

    goto :goto_5

    .line 324
    :cond_7
    iget-object v1, p0, Lcom/roidapp/photogrid/release/id;->h:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    invoke-direct {p0, v1, v0}, Lcom/roidapp/photogrid/release/id;->c(FF)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/id;->j:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_1

    .line 194
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 211
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
