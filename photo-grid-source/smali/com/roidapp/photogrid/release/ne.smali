.class public final Lcom/roidapp/photogrid/release/ne;
.super Lcom/roidapp/photogrid/release/mm;
.source "SourceFile"

# interfaces
.implements Ljp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;


# instance fields
.field private L:Lcom/roidapp/imagelib/filter/bi;

.field private M:Lcom/roidapp/imagelib/b/b;

.field private N:Z

.field private O:Z

.field private P:I

.field private Q:I

.field private R:Ljp/co/cyberagent/android/gpuimage/GPUImageView;


# direct methods
.method public constructor <init>(ZLandroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/az;)V
    .locals 5

    .prologue
    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v1, 0x0

    .line 65
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/mm;-><init>()V

    .line 57
    new-instance v0, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v0}, Lcom/roidapp/imagelib/b/b;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->M:Lcom/roidapp/imagelib/b/b;

    .line 66
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/ne;->F:Z

    .line 67
    iput-object p2, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    .line 68
    iput-object p3, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    .line 69
    iput-object p4, p0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    .line 70
    iput-object p5, p0, Lcom/roidapp/photogrid/release/ne;->D:Lcom/roidapp/photogrid/release/PhotoView;

    .line 71
    iput-object p6, p0, Lcom/roidapp/photogrid/release/ne;->E:Lcom/roidapp/photogrid/release/az;

    .line 72
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    .line 74
    if-eqz p1, :cond_4

    .line 75
    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 76
    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 77
    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    .line 78
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->g(Z)V

    .line 79
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->d(Z)V

    .line 80
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->c(I)V

    .line 81
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->f(Z)V

    .line 84
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->aI()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 85
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->a:[I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v3, v3

    add-int/lit8 v3, v3, -0x1

    aget v0, v0, v3

    .line 86
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 87
    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 88
    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/ih;->r(I)V

    .line 96
    :goto_0
    invoke-static {p2}, Lcom/roidapp/photogrid/common/bc;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p3, :cond_0

    array-length v0, p3

    if-le v0, v4, :cond_0

    .line 98
    const/16 v0, 0x16

    invoke-virtual {p4, v0}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 116
    :cond_0
    :goto_1
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 117
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->I()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ne;->m:I

    .line 3152
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    packed-switch v0, :pswitch_data_0

    .line 3199
    new-array v0, v1, [I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    .line 120
    :cond_1
    :goto_2
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ne;->s:I

    .line 121
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ne;->t:I

    .line 122
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ne;->u:I

    .line 124
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->m()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->A:Ljava/util/List;

    move-object v0, p2

    .line 127
    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 4094
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v0

    .line 127
    if-eqz v0, :cond_7

    .line 128
    new-instance v0, Lcom/roidapp/imagelib/filter/bi;

    invoke-direct {v0, p2}, Lcom/roidapp/imagelib/filter/bi;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->L:Lcom/roidapp/imagelib/filter/bi;

    .line 129
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->L:Lcom/roidapp/imagelib/filter/bi;

    if-eqz v0, :cond_2

    .line 130
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->L:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, v4}, Lcom/roidapp/imagelib/filter/bi;->c(Z)V

    .line 132
    :cond_2
    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/ne;->N:Z

    .line 133
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/baselib/gl/c;->c()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 135
    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/ne;->O:Z

    .line 137
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->o()Ljava/util/List;

    move-result-object v0

    .line 138
    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_3
    iput v0, p0, Lcom/roidapp/photogrid/release/ne;->Q:I

    .line 147
    :goto_4
    return-void

    .line 90
    :cond_3
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 91
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->r(I)V

    goto/16 :goto_0

    .line 102
    :cond_4
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->w()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 103
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->w()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->z:Ljava/util/List;

    goto :goto_1

    .line 3154
    :pswitch_0
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->b:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    goto :goto_2

    .line 3157
    :pswitch_1
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->c:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    goto :goto_2

    .line 3160
    :pswitch_2
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->d:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    goto :goto_2

    .line 3163
    :pswitch_3
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->e:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    goto/16 :goto_2

    .line 3166
    :pswitch_4
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->f:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    goto/16 :goto_2

    .line 3169
    :pswitch_5
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->g:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    goto/16 :goto_2

    .line 3172
    :pswitch_6
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->h:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    goto/16 :goto_2

    .line 3175
    :pswitch_7
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->i:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    goto/16 :goto_2

    .line 3178
    :pswitch_8
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->j:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    goto/16 :goto_2

    .line 3181
    :pswitch_9
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->k:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    goto/16 :goto_2

    .line 3184
    :pswitch_a
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->l:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    goto/16 :goto_2

    .line 3187
    :pswitch_b
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->m:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    goto/16 :goto_2

    .line 3190
    :pswitch_c
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->n:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    goto/16 :goto_2

    .line 3193
    :pswitch_d
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->o:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    goto/16 :goto_2

    .line 3196
    :pswitch_e
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->p:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    goto/16 :goto_2

    :cond_5
    move v0, v1

    .line 138
    goto/16 :goto_3

    .line 142
    :cond_6
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ne;->O:Z

    goto/16 :goto_4

    .line 144
    :cond_7
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ne;->N:Z

    goto/16 :goto_4

    .line 3152
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
    .end packed-switch
.end method

.method private a(ILandroid/graphics/Bitmap;)V
    .locals 4

    .prologue
    .line 553
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    invoke-virtual {v1, v2}, Lcom/roidapp/imagelib/ImageLibrary;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 555
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "tmp_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".png"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 557
    :try_start_0
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p2, v0, v1, v2}, Lcom/roidapp/imagelib/b/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;

    move-result-object v0

    .line 559
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, p1

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 565
    :goto_0
    return-void

    .line 560
    :catch_0
    move-exception v0

    .line 561
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ne;->p()V

    .line 562
    const/16 v1, 0x95

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/ne;->d(I)V

    .line 563
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method private a(Landroid/widget/RelativeLayout;)V
    .locals 6

    .prologue
    .line 760
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->j:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->p:Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/view/View;Landroid/widget/RelativeLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 766
    :goto_0
    return-void

    .line 762
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    goto :goto_0

    .line 764
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ne;ILandroid/graphics/Bitmap;)V
    .locals 4

    .prologue
    .line 7449
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->o()Ljava/util/List;

    move-result-object v1

    .line 7450
    if-eqz v1, :cond_0

    .line 7451
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/e;

    .line 7452
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->L:Lcom/roidapp/imagelib/filter/bi;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 7454
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x4

    if-ne v0, v2, :cond_0

    .line 7455
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/e;

    .line 7456
    const/4 v2, 0x0

    .line 7458
    :try_start_0
    new-instance v1, Ljava/io/FileInputStream;

    iget-object v3, v0, Lcom/roidapp/cloudlib/template/e;->b:Ljava/lang/String;

    invoke-direct {v1, v3}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7459
    :try_start_1
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->L:Lcom/roidapp/imagelib/filter/bi;

    iget-object v3, v0, Lcom/roidapp/cloudlib/template/e;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/roidapp/imagelib/filter/bi;->c(Ljava/lang/String;)V

    .line 7460
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->L:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v2, v1}, Lcom/roidapp/imagelib/filter/bi;->a(Ljava/io/InputStream;)V

    .line 7461
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->L:Lcom/roidapp/imagelib/filter/bi;

    iget-object v3, v0, Lcom/roidapp/cloudlib/template/e;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/roidapp/imagelib/filter/bi;->a(Ljava/lang/String;)V

    .line 7462
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->L:Lcom/roidapp/imagelib/filter/bi;

    iget-object v0, v0, Lcom/roidapp/cloudlib/template/e;->d:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/roidapp/imagelib/filter/bi;->b(Ljava/lang/String;)V

    .line 7463
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ic;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->L:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v2, p2}, Lcom/roidapp/imagelib/filter/bi;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, v0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    .line 7464
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ic;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-direct {p0, p1, v0}, Lcom/roidapp/photogrid/release/ne;->a(ILandroid/graphics/Bitmap;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_d
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_c
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_b
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_a
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 7484
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 7494
    :cond_0
    :goto_0
    return-void

    .line 7486
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 7465
    :catch_1
    move-exception v0

    move-object v1, v2

    .line 7466
    :goto_1
    :try_start_3
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ne;->p()V

    .line 7467
    const/16 v2, 0x96

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/ne;->d(I)V

    .line 7468
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 7482
    if-eqz v1, :cond_0

    .line 7484
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_0

    .line 7486
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 7469
    :catch_3
    move-exception v0

    move-object v1, v2

    .line 7470
    :goto_2
    :try_start_5
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ne;->p()V

    .line 7471
    const/16 v2, 0x97

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/ne;->d(I)V

    .line 7472
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 7482
    if-eqz v1, :cond_0

    .line 7484
    :try_start_6
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_0

    .line 7486
    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 7473
    :catch_5
    move-exception v0

    move-object v1, v2

    .line 7474
    :goto_3
    :try_start_7
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ne;->p()V

    .line 7475
    const/16 v2, 0x98

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/ne;->d(I)V

    .line 7476
    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 7482
    if-eqz v1, :cond_0

    .line 7484
    :try_start_8
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    goto :goto_0

    .line 7486
    :catch_6
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 7477
    :catch_7
    move-exception v0

    move-object v1, v2

    .line 7478
    :goto_4
    :try_start_9
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ne;->p()V

    .line 7479
    const/16 v2, 0x99

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/ne;->d(I)V

    .line 7480
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 7482
    if-eqz v1, :cond_0

    .line 7484
    :try_start_a
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_8

    goto :goto_0

    .line 7486
    :catch_8
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 7482
    :catchall_0
    move-exception v0

    move-object v1, v2

    :goto_5
    if-eqz v1, :cond_1

    .line 7484
    :try_start_b
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_9

    .line 7487
    :cond_1
    :goto_6
    throw v0

    .line 7486
    :catch_9
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_6

    .line 7482
    :catchall_1
    move-exception v0

    goto :goto_5

    .line 7477
    :catch_a
    move-exception v0

    goto :goto_4

    .line 7473
    :catch_b
    move-exception v0

    goto :goto_3

    .line 7469
    :catch_c
    move-exception v0

    goto :goto_2

    .line 7465
    :catch_d
    move-exception v0

    goto :goto_1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ne;)Z
    .locals 1

    .prologue
    .line 54
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ne;->O:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ne;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ne;->p()V

    return-void
.end method

.method private d(II)V
    .locals 13

    .prologue
    .line 662
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v5, v4

    const/4 v0, 0x0

    move v3, v0

    :goto_0
    if-ge v3, v5, :cond_c

    aget-object v0, v4, v3

    .line 663
    iget-object v6, v0, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 664
    if-nez v6, :cond_0

    .line 665
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "data null"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 671
    :cond_0
    int-to-float v0, p1

    iget v1, v6, Lcom/roidapp/photogrid/release/lc;->j:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 672
    int-to-float v0, p2

    iget v1, v6, Lcom/roidapp/photogrid/release/lc;->k:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v7

    .line 673
    int-to-float v0, p1

    iget v1, v6, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    add-int/2addr v0, v2

    .line 674
    int-to-float v1, p2

    iget v8, v6, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v1, v8

    const/high16 v8, 0x42c80000    # 100.0f

    div-float/2addr v1, v8

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    add-int/2addr v1, v7

    .line 676
    iget-boolean v8, v6, Lcom/roidapp/photogrid/release/lc;->f:Z

    if-eqz v8, :cond_6

    .line 677
    new-instance v8, Landroid/graphics/Path;

    invoke-direct {v8}, Landroid/graphics/Path;-><init>()V

    .line 678
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 679
    iget v1, v0, Landroid/graphics/PointF;->x:F

    int-to-float v9, p1

    mul-float/2addr v1, v9

    const/high16 v9, 0x42c80000    # 100.0f

    div-float/2addr v1, v9

    int-to-float v9, v2

    add-float/2addr v1, v9

    iget v0, v0, Landroid/graphics/PointF;->y:F

    int-to-float v9, p2

    mul-float/2addr v0, v9

    const/high16 v9, 0x42c80000    # 100.0f

    div-float/2addr v0, v9

    int-to-float v9, v7

    add-float/2addr v0, v9

    invoke-virtual {v8, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 681
    const/4 v0, 0x1

    move v1, v0

    :goto_1
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 682
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 683
    iget v9, v0, Landroid/graphics/PointF;->x:F

    int-to-float v10, p1

    mul-float/2addr v9, v10

    const/high16 v10, 0x42c80000    # 100.0f

    div-float/2addr v9, v10

    int-to-float v10, v2

    add-float/2addr v9, v10

    iget v0, v0, Landroid/graphics/PointF;->y:F

    int-to-float v10, p2

    mul-float/2addr v0, v10

    const/high16 v10, 0x42c80000    # 100.0f

    div-float/2addr v0, v10

    int-to-float v10, v7

    add-float/2addr v0, v10

    invoke-virtual {v8, v9, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 681
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 685
    :cond_1
    invoke-virtual {v8}, Landroid/graphics/Path;->close()V

    .line 686
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 687
    const/4 v1, 0x1

    invoke-virtual {v8, v0, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 688
    iget-object v1, v6, Lcom/roidapp/photogrid/release/lc;->p:Landroid/graphics/Region;

    new-instance v2, Landroid/graphics/Region;

    iget v7, v0, Landroid/graphics/RectF;->left:F

    float-to-int v7, v7

    iget v9, v0, Landroid/graphics/RectF;->top:F

    float-to-int v9, v9

    iget v10, v0, Landroid/graphics/RectF;->right:F

    float-to-int v10, v10

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    float-to-int v0, v0

    invoke-direct {v2, v7, v9, v10, v0}, Landroid/graphics/Region;-><init>(IIII)V

    invoke-virtual {v1, v8, v2}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    .line 694
    :goto_2
    new-instance v7, Landroid/graphics/Path;

    invoke-direct {v7}, Landroid/graphics/Path;-><init>()V

    .line 696
    iget-object v8, v6, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 697
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    .line 698
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    iget v10, v0, Landroid/graphics/PointF;->x:F

    .line 699
    iget-object v0, v6, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    iget v11, v0, Landroid/graphics/PointF;->y:F

    .line 701
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 702
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 704
    cmpg-float v2, v1, v10

    if-gez v2, :cond_7

    .line 705
    int-to-float v2, p1

    mul-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v1, v2

    .line 709
    :goto_3
    cmpg-float v2, v0, v11

    if-gez v2, :cond_8

    .line 710
    int-to-float v2, p2

    mul-float/2addr v0, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v0, v2

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v0, v2

    .line 717
    :goto_4
    const/4 v2, 0x0

    cmpg-float v2, v1, v2

    if-gez v2, :cond_2

    .line 718
    const/4 v1, 0x0

    .line 720
    :cond_2
    const/4 v2, 0x0

    cmpg-float v2, v0, v2

    if-gez v2, :cond_3

    .line 721
    const/4 v0, 0x0

    .line 723
    :cond_3
    invoke-virtual {v7, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 725
    const/4 v0, 0x1

    move v2, v0

    :goto_5
    if-ge v2, v9, :cond_b

    .line 726
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 727
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 728
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 730
    cmpg-float v12, v1, v10

    if-gez v12, :cond_9

    .line 731
    int-to-float v12, p1

    mul-float/2addr v1, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v1, v12

    const/high16 v12, 0x3f800000    # 1.0f

    sub-float/2addr v1, v12

    .line 735
    :goto_6
    cmpg-float v12, v0, v11

    if-gez v12, :cond_a

    .line 736
    int-to-float v12, p2

    mul-float/2addr v0, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v0, v12

    const/high16 v12, 0x3f800000    # 1.0f

    sub-float/2addr v0, v12

    .line 741
    :goto_7
    const/4 v12, 0x0

    cmpg-float v12, v1, v12

    if-gez v12, :cond_4

    .line 742
    const/4 v1, 0x0

    .line 744
    :cond_4
    const/4 v12, 0x0

    cmpg-float v12, v0, v12

    if-gez v12, :cond_5

    .line 745
    const/4 v0, 0x0

    .line 747
    :cond_5
    invoke-virtual {v7, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 725
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_5

    .line 690
    :cond_6
    iget-object v8, v6, Lcom/roidapp/photogrid/release/lc;->p:Landroid/graphics/Region;

    invoke-virtual {v8, v2, v7, v0, v1}, Landroid/graphics/Region;->set(IIII)Z

    goto/16 :goto_2

    .line 707
    :cond_7
    int-to-float v2, p1

    mul-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v1, v2

    goto :goto_3

    .line 712
    :cond_8
    int-to-float v2, p2

    mul-float/2addr v0, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v0, v2

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v0, v2

    goto :goto_4

    .line 733
    :cond_9
    int-to-float v12, p1

    mul-float/2addr v1, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v1, v12

    const/high16 v12, 0x3f800000    # 1.0f

    add-float/2addr v1, v12

    goto :goto_6

    .line 738
    :cond_a
    int-to-float v12, p2

    mul-float/2addr v0, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v0, v12

    const/high16 v12, 0x3f800000    # 1.0f

    add-float/2addr v0, v12

    goto :goto_7

    .line 749
    :cond_b
    invoke-virtual {v7}, Landroid/graphics/Path;->close()V

    .line 750
    iput-object v7, v6, Lcom/roidapp/photogrid/release/lc;->a:Landroid/graphics/Path;

    .line 662
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto/16 :goto_0

    .line 752
    :cond_c
    return-void
.end method

.method private n()V
    .locals 11

    .prologue
    const/high16 v9, 0x42c80000    # 100.0f

    const/4 v3, 0x0

    .line 773
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-nez v0, :cond_1

    .line 856
    :cond_0
    return-void

    .line 777
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ne;->F:Z

    if-eqz v0, :cond_6

    .line 7028
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->p()Ljava/util/List;

    move-result-object v4

    .line 7029
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->q()Ljava/util/List;

    move-result-object v5

    .line 7030
    if-eqz v4, :cond_5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_5

    .line 7031
    new-instance v0, Lcom/roidapp/cloudlib/template/c;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/template/c;-><init>()V

    move v2, v3

    .line 7032
    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_5

    .line 7033
    new-instance v6, Lcom/roidapp/photogrid/release/qz;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    invoke-direct {v6, v0}, Lcom/roidapp/photogrid/release/qz;-><init>(Landroid/content/Context;)V

    .line 7034
    const/4 v0, 0x2

    iput v0, v6, Lcom/roidapp/photogrid/release/qz;->V:I

    .line 7035
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 7112
    if-eqz v0, :cond_2

    .line 7114
    const-string v1, "${PIC_WEATHER}"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    .line 7115
    if-ltz v1, :cond_2

    .line 7116
    const-string v7, "sunny.png"

    .line 7119
    const-string v1, "${PIC_WEATHER}"

    invoke-virtual {v0, v1, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 7121
    const-string v8, "sunny.png"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v7

    if-nez v7, :cond_4

    .line 7123
    const-string v1, "${PIC_WEATHER}"

    const-string v7, "sunny.png"

    invoke-virtual {v0, v1, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 7035
    :cond_2
    :goto_1
    iput-object v0, v6, Lcom/roidapp/photogrid/release/qz;->K:Ljava/lang/String;

    .line 7036
    iget-object v0, v6, Lcom/roidapp/photogrid/release/qz;->K:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 7039
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 7040
    const-string v1, "x"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    div-float/2addr v1, v9

    iput v1, v6, Lcom/roidapp/photogrid/release/qz;->M:F

    .line 7041
    const-string v1, "y"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    div-float/2addr v1, v9

    iput v1, v6, Lcom/roidapp/photogrid/release/qz;->N:F

    .line 7042
    const-string v1, "angle"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iput v1, v6, Lcom/roidapp/photogrid/release/qz;->l:F

    .line 7043
    const-string v1, "scale"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    div-float/2addr v0, v9

    iput v0, v6, Lcom/roidapp/photogrid/release/qz;->O:F

    .line 7044
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->z:Ljava/util/List;

    invoke-interface {v0, v3, v6}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 7032
    :cond_3
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_0

    :cond_4
    move-object v0, v1

    .line 7125
    goto :goto_1

    .line 779
    :cond_5
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ne;->o()V

    .line 785
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->z:Ljava/util/List;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_d

    .line 786
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_9

    .line 787
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    .line 792
    instance-of v2, v0, Lcom/roidapp/photogrid/release/ps;

    if-nez v2, :cond_7

    .line 795
    iput-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 796
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/ao;)V

    goto :goto_2

    .line 798
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i()V

    .line 801
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 805
    :goto_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->A:Ljava/util/List;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_b

    .line 806
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_a

    .line 807
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->A:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 809
    :cond_a
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 814
    :cond_b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 815
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v4, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 818
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_c
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    .line 819
    instance-of v1, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v1, :cond_e

    move-object v1, v0

    .line 820
    check-cast v1, Lcom/roidapp/photogrid/release/ra;

    .line 821
    iget v6, v1, Lcom/roidapp/photogrid/release/ra;->j:F

    .line 822
    iget v7, v1, Lcom/roidapp/photogrid/release/ra;->k:F

    .line 826
    int-to-float v8, v2

    iget v9, v1, Lcom/roidapp/photogrid/release/ra;->c:I

    int-to-float v9, v9

    div-float/2addr v8, v9

    .line 827
    int-to-float v9, v4

    iget v10, v1, Lcom/roidapp/photogrid/release/ra;->d:I

    int-to-float v10, v10

    div-float/2addr v9, v10

    .line 829
    mul-float v10, v6, v8

    .line 830
    mul-float/2addr v9, v7

    .line 832
    iput v2, v1, Lcom/roidapp/photogrid/release/ra;->c:I

    .line 833
    iput v4, v1, Lcom/roidapp/photogrid/release/ra;->d:I

    .line 834
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->i()V

    .line 837
    neg-float v6, v6

    neg-float v7, v7

    invoke-virtual {v1, v6, v7}, Lcom/roidapp/photogrid/release/ra;->b(FF)V

    .line 839
    iget v6, v1, Lcom/roidapp/photogrid/release/ra;->h:F

    .line 840
    mul-float/2addr v6, v8

    iget v7, v1, Lcom/roidapp/photogrid/release/ra;->l:F

    invoke-virtual {v1, v6, v7, v10, v9}, Lcom/roidapp/photogrid/release/ra;->b(FFFF)V

    move-object v1, v0

    .line 841
    check-cast v1, Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->j()V

    .line 842
    iput-boolean v3, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    goto :goto_4

    .line 803
    :cond_d
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i()V

    goto/16 :goto_3

    .line 843
    :cond_e
    instance-of v1, v0, Lcom/roidapp/photogrid/release/qz;

    if-eqz v1, :cond_c

    .line 845
    check-cast v0, Lcom/roidapp/photogrid/release/qz;

    .line 847
    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->c:I

    if-lez v1, :cond_f

    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->d:I

    if-lez v1, :cond_f

    .line 848
    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->j:F

    int-to-float v6, v2

    iget v7, v0, Lcom/roidapp/photogrid/release/qz;->c:I

    int-to-float v7, v7

    div-float/2addr v6, v7

    mul-float/2addr v1, v6

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->j:F

    .line 849
    iget v1, v0, Lcom/roidapp/photogrid/release/qz;->k:F

    int-to-float v6, v4

    iget v7, v0, Lcom/roidapp/photogrid/release/qz;->d:I

    int-to-float v7, v7

    div-float/2addr v6, v7

    mul-float/2addr v1, v6

    iput v1, v0, Lcom/roidapp/photogrid/release/qz;->k:F

    .line 851
    :cond_f
    iput v2, v0, Lcom/roidapp/photogrid/release/qz;->c:I

    .line 852
    iput v4, v0, Lcom/roidapp/photogrid/release/qz;->d:I

    .line 853
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qz;->g()V

    goto :goto_4
.end method

.method private o()V
    .locals 14

    .prologue
    const/4 v13, 0x3

    const/high16 v12, 0x42c80000    # 100.0f

    const/4 v11, 0x0

    const/4 v10, 0x1

    .line 937
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->X()Ljava/util/List;

    move-result-object v0

    .line 938
    if-eqz v0, :cond_8

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_8

    .line 939
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/rc;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/rc;

    move-result-object v1

    .line 940
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/rc;->a()Ljava/util/HashMap;

    move-result-object v2

    .line 941
    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v3

    .line 942
    iget-object v1, v1, Lcom/roidapp/photogrid/release/rc;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 943
    new-instance v5, Lcom/roidapp/cloudlib/template/c;

    invoke-direct {v5}, Lcom/roidapp/cloudlib/template/c;-><init>()V

    .line 944
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/m;

    .line 945
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    iget-object v7, v0, Lcom/roidapp/cloudlib/template/m;->a:Ljava/lang/String;

    invoke-virtual {v5, v1, v7}, Lcom/roidapp/cloudlib/template/c;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 946
    if-eqz v1, :cond_0

    .line 949
    new-instance v7, Lcom/roidapp/photogrid/release/ra;

    iget-object v8, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    invoke-direct {v7, v8, v1}, Lcom/roidapp/photogrid/release/ra;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 950
    iget v1, p0, Lcom/roidapp/photogrid/release/ne;->n:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->c:I

    .line 951
    iget v1, p0, Lcom/roidapp/photogrid/release/ne;->o:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->d:I

    .line 952
    iput-boolean v10, v7, Lcom/roidapp/photogrid/release/ra;->an:Z

    .line 953
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->g:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->ae:I

    .line 954
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->h:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->af:I

    .line 955
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->i:F

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->ah:F

    .line 957
    iget-object v1, v0, Lcom/roidapp/cloudlib/template/m;->l:Ljava/lang/String;

    iput-object v1, v7, Lcom/roidapp/photogrid/release/ra;->ao:Ljava/lang/String;

    .line 958
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->m:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->ap:I

    .line 959
    iput-boolean v10, v7, Lcom/roidapp/photogrid/release/ra;->aq:Z

    .line 960
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->n:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->ar:I

    .line 961
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->n:I

    if-eq v1, v10, :cond_3

    .line 962
    iput v13, v7, Lcom/roidapp/photogrid/release/ra;->P:I

    .line 963
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->n:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->ar:I

    .line 968
    :goto_1
    iget-boolean v1, v0, Lcom/roidapp/cloudlib/template/m;->u:Z

    .line 969
    iput-boolean v1, v7, Lcom/roidapp/photogrid/release/ra;->ag:Z

    .line 970
    if-eqz v1, :cond_4

    .line 971
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->q:F

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->au:F

    .line 972
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->r:F

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->av:F

    .line 973
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->s:F

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->aw:F

    .line 974
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->t:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->ax:I

    .line 982
    :goto_2
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->o:I

    if-ne v1, v10, :cond_5

    .line 983
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    iput-object v1, v7, Lcom/roidapp/photogrid/release/ra;->K:Landroid/text/Layout$Alignment;

    .line 991
    :cond_1
    :goto_3
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->p:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->as:I

    .line 993
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->k:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->aj:I

    .line 995
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->f:I

    add-int/lit8 v8, v3, -0x1

    if-gt v1, v8, :cond_2

    .line 996
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->f:I

    add-int/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    iput-object v1, v7, Lcom/roidapp/photogrid/release/ra;->J:Landroid/graphics/Typeface;

    .line 997
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->f:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->M:I

    .line 1000
    :cond_2
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->j:I

    int-to-float v1, v1

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->ad:F

    .line 1001
    iget v1, p0, Lcom/roidapp/photogrid/release/ne;->n:I

    iget v8, p0, Lcom/roidapp/photogrid/release/ne;->o:I

    invoke-virtual {v7, v1, v8}, Lcom/roidapp/photogrid/release/ra;->b(II)V

    .line 1002
    invoke-virtual {v7}, Lcom/roidapp/photogrid/release/ra;->g()V

    .line 1003
    invoke-virtual {v7}, Lcom/roidapp/photogrid/release/ra;->l()V

    .line 1007
    iget v1, p0, Lcom/roidapp/photogrid/release/ne;->n:I

    int-to-float v1, v1

    iget v8, v0, Lcom/roidapp/cloudlib/template/m;->b:F

    mul-float/2addr v1, v8

    div-float/2addr v1, v12

    invoke-virtual {v7}, Lcom/roidapp/photogrid/release/ra;->c()I

    move-result v8

    div-int/lit8 v8, v8, 0x2

    int-to-float v8, v8

    sub-float/2addr v1, v8

    .line 1008
    iget v8, p0, Lcom/roidapp/photogrid/release/ne;->o:I

    int-to-float v8, v8

    iget v9, v0, Lcom/roidapp/cloudlib/template/m;->c:F

    mul-float/2addr v8, v9

    div-float/2addr v8, v12

    invoke-virtual {v7}, Lcom/roidapp/photogrid/release/ra;->d()I

    move-result v9

    div-int/lit8 v9, v9, 0x2

    int-to-float v9, v9

    sub-float/2addr v8, v9

    .line 1010
    invoke-virtual {v7, v11, v11}, Lcom/roidapp/photogrid/release/ra;->a(FF)Z

    .line 1012
    iget v9, v0, Lcom/roidapp/cloudlib/template/m;->e:F

    invoke-virtual {v7, v9}, Lcom/roidapp/photogrid/release/ra;->b(F)V

    .line 1013
    iget v9, v0, Lcom/roidapp/cloudlib/template/m;->d:F

    div-float/2addr v9, v12

    invoke-virtual {v7, v9}, Lcom/roidapp/photogrid/release/ra;->c(F)V

    .line 1014
    iget-boolean v0, v0, Lcom/roidapp/cloudlib/template/m;->v:Z

    if-eqz v0, :cond_7

    .line 1015
    invoke-virtual {v7, v1, v8}, Lcom/roidapp/photogrid/release/ra;->c(FF)V

    .line 1019
    :goto_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->z:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 965
    :cond_3
    iput v10, v7, Lcom/roidapp/photogrid/release/ra;->P:I

    goto/16 :goto_1

    .line 976
    :cond_4
    iput v11, v7, Lcom/roidapp/photogrid/release/ra;->au:F

    .line 977
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->r:F

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->av:F

    .line 978
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->s:F

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->aw:F

    .line 979
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->t:I

    iput v1, v7, Lcom/roidapp/photogrid/release/ra;->ax:I

    goto/16 :goto_2

    .line 984
    :cond_5
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->o:I

    const/4 v8, 0x2

    if-ne v1, v8, :cond_6

    .line 985
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    iput-object v1, v7, Lcom/roidapp/photogrid/release/ra;->K:Landroid/text/Layout$Alignment;

    goto/16 :goto_3

    .line 986
    :cond_6
    iget v1, v0, Lcom/roidapp/cloudlib/template/m;->o:I

    if-ne v1, v13, :cond_1

    .line 987
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    iput-object v1, v7, Lcom/roidapp/photogrid/release/ra;->K:Landroid/text/Layout$Alignment;

    goto/16 :goto_3

    .line 1017
    :cond_7
    invoke-virtual {v7, v1, v8}, Lcom/roidapp/photogrid/release/ra;->b(FF)V

    goto :goto_4

    .line 1022
    :cond_8
    return-void
.end method

.method private p()V
    .locals 5

    .prologue
    .line 1082
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 1083
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ne;->G:Z

    if-eqz v0, :cond_4

    .line 1084
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1085
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    monitor-enter v2

    .line 1086
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ic;

    .line 1087
    if-eqz v0, :cond_0

    .line 1088
    iget-object v4, v0, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1089
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ic;->a()V

    goto :goto_0

    .line 1097
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1093
    :cond_1
    :try_start_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 1094
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->m(Ljava/util/List;)V

    .line 1096
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1097
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1112
    :cond_3
    :goto_1
    return-void

    .line 1099
    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ne;->G:Z

    .line 1100
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    monitor-enter v1

    .line 1101
    :try_start_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ic;

    .line 1102
    if-eqz v0, :cond_5

    .line 1103
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ic;->a()V

    goto :goto_2

    .line 1108
    :catchall_1
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    .line 1107
    :cond_6
    :try_start_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1108
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1
.end method


# virtual methods
.method public final a()V
    .locals 10

    .prologue
    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v8, 0x1

    .line 302
    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ne;->p()V

    .line 303
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 4205
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->j:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 4206
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 4209
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v2

    .line 4212
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ne;->x:I

    .line 4213
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ne;->w:I

    .line 4214
    iget v0, p0, Lcom/roidapp/photogrid/release/ne;->x:I

    iget v1, p0, Lcom/roidapp/photogrid/release/ne;->w:I

    if-ge v0, v1, :cond_1

    .line 4215
    iget v0, p0, Lcom/roidapp/photogrid/release/ne;->x:I

    .line 4216
    iget v1, p0, Lcom/roidapp/photogrid/release/ne;->w:I

    iput v1, p0, Lcom/roidapp/photogrid/release/ne;->x:I

    .line 4217
    iput v0, p0, Lcom/roidapp/photogrid/release/ne;->w:I

    .line 4221
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900dd

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    .line 4222
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090058

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    .line 4223
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090057

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    .line 4226
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    const v5, 0x7f0d0085

    invoke-virtual {v0, v5}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 4227
    if-eqz v5, :cond_2

    .line 4228
    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    const-string v6, "template"

    const/4 v7, 0x1

    invoke-static {v0, v6, v7}, Lcom/roidapp/photogrid/common/a;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;)I

    move-result v0

    if-eq v0, v8, :cond_9

    .line 4229
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->B:Z

    if-nez v0, :cond_7

    .line 4230
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    .line 4232
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_2

    .line 4233
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 4234
    iget-boolean v6, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->F:Z

    if-eqz v6, :cond_2

    .line 4235
    const/4 v6, 0x0

    iput-boolean v6, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->F:Z

    .line 4236
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->C()V

    .line 4246
    :cond_2
    :goto_0
    if-eqz v5, :cond_a

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_a

    .line 4247
    const v0, 0x7f0d0086

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 4248
    if-eqz v0, :cond_15

    .line 4249
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 4250
    if-lez v0, :cond_15

    .line 4251
    int-to-float v0, v0

    .line 4260
    :goto_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v5, 0x7f0900cb

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    .line 4261
    iget v5, p0, Lcom/roidapp/photogrid/release/ne;->x:I

    int-to-float v5, v5

    sub-float v3, v5, v3

    sub-float/2addr v3, v4

    sub-float v0, v3, v0

    sub-float/2addr v0, v1

    sget v1, Lcom/roidapp/photogrid/common/az;->g:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-int v1, v0

    .line 4264
    iget v0, p0, Lcom/roidapp/photogrid/release/ne;->w:I

    int-to-float v0, v0

    int-to-float v3, v1

    div-float/2addr v0, v3

    .line 4265
    cmpg-float v0, v2, v0

    if-gez v0, :cond_b

    .line 4267
    int-to-float v0, v1

    mul-float/2addr v0, v2

    float-to-int v0, v0

    .line 4272
    :goto_2
    int-to-float v0, v0

    iget v2, p0, Lcom/roidapp/photogrid/release/ne;->C:F

    mul-float/2addr v0, v2

    float-to-int v2, v0

    .line 4273
    int-to-float v0, v1

    iget v1, p0, Lcom/roidapp/photogrid/release/ne;->C:F

    mul-float/2addr v0, v1

    float-to-int v1, v0

    .line 4275
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v3, 0x7f03000c

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->j:Landroid/view/ViewGroup;

    .line 4276
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x1

    invoke-direct {v0, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 4277
    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 4278
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 4279
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4281
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->j:Landroid/view/ViewGroup;

    const v1, 0x7f0d0061

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->k:Landroid/widget/RelativeLayout;

    .line 4283
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->j:Landroid/view/ViewGroup;

    const v1, 0x7f0d0060

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->p:Landroid/widget/LinearLayout;

    .line 4284
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 4296
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->q:Lcom/roidapp/photogrid/release/an;

    .line 305
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 306
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 4358
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 4359
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ay()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 4360
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v1, v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/rf;->a(Ljava/util/ArrayList;I)V

    .line 307
    :goto_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xd

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 308
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->k:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ne;->a(Landroid/widget/RelativeLayout;)V

    .line 309
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xe

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 4636
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ne;->n:I

    .line 4637
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ne;->o:I

    .line 4638
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->e()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_10

    .line 4639
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->q:Lcom/roidapp/photogrid/release/an;

    if-nez v0, :cond_3

    .line 4640
    new-instance v0, Lcom/roidapp/photogrid/release/an;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    iget v2, p0, Lcom/roidapp/photogrid/release/ne;->n:I

    iget v3, p0, Lcom/roidapp/photogrid/release/ne;->o:I

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/an;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->q:Lcom/roidapp/photogrid/release/an;

    .line 4641
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->q:Lcom/roidapp/photogrid/release/an;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/an;->c(Z)V

    .line 4644
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->q:Lcom/roidapp/photogrid/release/an;

    iget v1, p0, Lcom/roidapp/photogrid/release/ne;->r:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ne;->s:I

    iget v3, p0, Lcom/roidapp/photogrid/release/ne;->t:I

    iget v4, p0, Lcom/roidapp/photogrid/release/ne;->u:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/release/an;->a(IIII)V

    .line 311
    :cond_3
    :goto_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x10

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 312
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->v:Lcom/roidapp/photogrid/release/mp;

    const-string v1, "FragmentBorder"

    invoke-interface {v0, v1}, Lcom/roidapp/photogrid/release/mp;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ck;

    .line 313
    if-eqz v0, :cond_4

    .line 314
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ck;->a()V

    .line 5623
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 5624
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v1, :cond_5

    .line 5625
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/PhotoView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5627
    :cond_5
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v1, :cond_6

    .line 5628
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/az;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 318
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x12

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 319
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ne;->n()V

    .line 320
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x13

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 321
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/ne;->d(II)V

    .line 322
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x14

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 323
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 6506
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, Lcom/roidapp/photogrid/release/nf;

    invoke-direct {v3, p0, v0, v1}, Lcom/roidapp/photogrid/release/nf;-><init>(Lcom/roidapp/photogrid/release/ne;II)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 349
    :goto_5
    return-void

    .line 4240
    :cond_7
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 326
    :catch_0
    move-exception v0

    .line 327
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ne;->p()V

    .line 328
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_14

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "bg create decodeBitmap null"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "sticker create bitmap null"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    .line 329
    :cond_8
    iget v1, p0, Lcom/roidapp/photogrid/release/ne;->C:F

    cmpl-float v1, v1, v9

    if-nez v1, :cond_12

    .line 330
    const/high16 v0, 0x3f400000    # 0.75f

    iput v0, p0, Lcom/roidapp/photogrid/release/ne;->C:F

    .line 331
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->K:Landroid/os/Handler;

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_5

    .line 4243
    :cond_9
    const/16 v0, 0x8

    :try_start_1
    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0

    .line 4256
    :cond_a
    const/4 v0, 0x0

    goto/16 :goto_1

    .line 4269
    :cond_b
    iget v0, p0, Lcom/roidapp/photogrid/release/ne;->w:I

    .line 4270
    int-to-float v1, v0

    div-float/2addr v1, v2

    float-to-int v1, v1

    goto/16 :goto_2

    .line 4361
    :cond_c
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aL()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aM()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 4362
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->aL()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/rf;->a(Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 4363
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->k(Ljava/lang/String;)V

    .line 4364
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->r(Z)V

    goto/16 :goto_3

    .line 4366
    :cond_d
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    iget v3, p0, Lcom/roidapp/photogrid/release/ne;->m:I

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v4, v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;Ljava/util/ArrayList;[III)V

    goto/16 :goto_3

    .line 4369
    :cond_e
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aL()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aM()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 4370
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->k(Ljava/lang/String;)V

    .line 4371
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->r(Z)V

    .line 4373
    :cond_f
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    const/4 v3, -0x1

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v4, v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;Ljava/util/ArrayList;[III)V

    goto/16 :goto_3

    .line 4648
    :cond_10
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->q:Lcom/roidapp/photogrid/release/an;

    if-eqz v0, :cond_11

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 4649
    :cond_11
    new-instance v0, Lcom/roidapp/photogrid/release/an;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    iget v2, p0, Lcom/roidapp/photogrid/release/ne;->n:I

    iget v3, p0, Lcom/roidapp/photogrid/release/ne;->o:I

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/an;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->q:Lcom/roidapp/photogrid/release/an;

    .line 4650
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->q:Lcom/roidapp/photogrid/release/an;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/an;->c(Z)V

    .line 4651
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->q:Lcom/roidapp/photogrid/release/an;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->f()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/an;->a(Ljava/lang/String;Z)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_4

    .line 333
    :cond_12
    iget v1, p0, Lcom/roidapp/photogrid/release/ne;->C:F

    const/high16 v2, 0x3f400000    # 0.75f

    cmpl-float v1, v1, v2

    if-nez v1, :cond_13

    .line 334
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lcom/roidapp/photogrid/release/ne;->C:F

    .line 335
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->K:Landroid/os/Handler;

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_5

    .line 338
    :cond_13
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 339
    iput v9, p0, Lcom/roidapp/photogrid/release/ne;->C:F

    .line 340
    const/16 v0, 0x8e

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ne;->d(I)V

    goto/16 :goto_5

    .line 344
    :cond_14
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 345
    iput v9, p0, Lcom/roidapp/photogrid/release/ne;->C:F

    .line 346
    const/16 v0, 0x8f

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ne;->d(I)V

    goto/16 :goto_5

    :cond_15
    move v0, v1

    goto/16 :goto_1
.end method

.method public final a(Landroid/widget/RelativeLayout;Landroid/view/View$OnTouchListener;)V
    .locals 9

    .prologue
    const/high16 v8, 0x42c80000    # 100.0f

    const/4 v3, 0x0

    .line 860
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ne;->H:Z

    if-eqz v0, :cond_1

    .line 931
    :cond_0
    :goto_0
    return-void

    .line 866
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->R:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v0, :cond_2

    .line 867
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->R:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->removeAllViews()V

    .line 868
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->R:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    .line 869
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->R:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    .line 872
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->q:Lcom/roidapp/photogrid/release/an;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-nez v0, :cond_3

    .line 873
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->p:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 875
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x4b

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 877
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v1, v1

    if-ne v0, v1, :cond_0

    move v2, v3

    .line 878
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ge v2, v0, :cond_4

    .line 879
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->k:Landroid/widget/RelativeLayout;

    add-int/lit8 v1, v2, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 880
    if-nez v0, :cond_9

    .line 881
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ne;->a()V

    .line 909
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_6

    .line 910
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 911
    if-eqz v0, :cond_5

    .line 912
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 914
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->j:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 917
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_8

    .line 918
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 919
    if-eqz v0, :cond_7

    .line 920
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 922
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->j:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 925
    :cond_8
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 926
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f09010a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v3, v3, v3, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 927
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 928
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 929
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->j:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 930
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p2}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto/16 :goto_0

    .line 884
    :cond_9
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget v1, v1, Lcom/roidapp/photogrid/release/ic;->d:I

    int-to-float v4, v1

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    iget v1, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v1, v4

    div-float v4, v1, v8

    .line 885
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget v1, v1, Lcom/roidapp/photogrid/release/ic;->e:I

    int-to-float v5, v1

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    iget v1, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v1, v5

    div-float v5, v1, v8

    .line 886
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    .line 887
    if-eqz v1, :cond_b

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v6

    if-nez v6, :cond_b

    .line 888
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->b(Landroid/graphics/Bitmap;)V

    .line 889
    iget-boolean v6, p0, Lcom/roidapp/photogrid/release/ne;->O:Z

    if-eqz v6, :cond_a

    .line 890
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    .line 891
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    .line 892
    int-to-float v6, v6

    div-float/2addr v4, v6

    .line 893
    int-to-float v6, v7

    div-float/2addr v5, v6

    .line 894
    cmpl-float v6, v4, v5

    if-lez v6, :cond_c

    .line 895
    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/if;->b(F)V

    .line 900
    :cond_a
    :goto_2
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->a(Landroid/graphics/Bitmap;)V

    .line 902
    :cond_b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    mul-int/lit8 v1, v2, 0x2

    add-int/lit8 v1, v1, 0x4c

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 878
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_1

    .line 897
    :cond_c
    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/if;->b(F)V

    goto :goto_2
.end method

.method public final b(Z)I
    .locals 2

    .prologue
    .line 1116
    if-eqz p1, :cond_0

    .line 1117
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    array-length v0, v0

    .line 1124
    :goto_0
    return v0

    .line 1119
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aA()I

    move-result v0

    .line 1120
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->B:[I

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    if-lt v0, v1, :cond_1

    .line 1121
    const/4 v0, 0x0

    goto :goto_0

    .line 1123
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 1124
    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 1051
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ne;->H:Z

    .line 1052
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->j:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 1053
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 1055
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ne;->p()V

    .line 1056
    return-void
.end method

.method public final b(II)V
    .locals 4

    .prologue
    .line 1177
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ig;->c()V

    .line 1178
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, p2

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ig;->c()V

    .line 1180
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, p1

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ig;->a()Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    .line 1181
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, p1

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/lc;->a()Lcom/roidapp/photogrid/release/lc;

    move-result-object v1

    .line 1183
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v3, v3, p2

    aput-object v3, v2, p1

    .line 1184
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aput-object v0, v2, p2

    .line 1185
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, p2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    iput-object v2, v0, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 1186
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, p1

    iput-object v1, v0, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 1194
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1195
    const/4 v1, 0x2

    iput v1, v0, Landroid/os/Message;->what:I

    .line 1196
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 1197
    iput p2, v0, Landroid/os/Message;->arg2:I

    .line 1198
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->K:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1204
    return-void
.end method

.method public final b(IZ)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 1332
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1360
    :cond_0
    :goto_0
    return-void

    .line 1335
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->j:Landroid/view/ViewGroup;

    add-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 1337
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    .line 1338
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput-boolean p2, v2, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 1340
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v2, Lcom/roidapp/photogrid/release/ig;->v:F

    .line 1341
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v4, v2, Lcom/roidapp/photogrid/release/ig;->t:F

    .line 1342
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v4, v2, Lcom/roidapp/photogrid/release/ig;->u:F

    .line 1343
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v5, v2, Lcom/roidapp/photogrid/release/ig;->p:I

    .line 1344
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v5, v2, Lcom/roidapp/photogrid/release/ig;->x:I

    .line 1345
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v6, v2, Lcom/roidapp/photogrid/release/ig;->r:I

    .line 1346
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput v6, v2, Lcom/roidapp/photogrid/release/ig;->s:I

    .line 1353
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iput-object v2, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    .line 1354
    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->a(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

.method public final c(I)V
    .locals 9

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    const/high16 v8, 0x42c80000    # 100.0f

    .line 1274
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->k:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ne;->a(Landroid/widget/RelativeLayout;)V

    .line 1275
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/ne;->d(II)V

    .line 1277
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v1, v1

    if-ne v0, v1, :cond_0

    move v2, v3

    .line 1278
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ge v2, v0, :cond_0

    .line 1279
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->k:Landroid/widget/RelativeLayout;

    add-int/lit8 v1, v2, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 1280
    if-nez v0, :cond_1

    .line 1285
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ne;->a()V

    .line 1308
    :cond_0
    return-void

    .line 1289
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget v1, v1, Lcom/roidapp/photogrid/release/ic;->d:I

    int-to-float v5, v1

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    iget v1, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v1, v5

    div-float v5, v1, v8

    .line 1290
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget v1, v1, Lcom/roidapp/photogrid/release/ic;->e:I

    int-to-float v6, v1

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    iget v1, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v1, v6

    div-float v6, v1, v8

    .line 1291
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->b(Landroid/graphics/Bitmap;)V

    .line 1292
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ne;->O:Z

    if-eqz v1, :cond_2

    .line 1293
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    .line 1294
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 1295
    int-to-float v7, v7

    div-float/2addr v5, v7

    .line 1296
    int-to-float v1, v1

    div-float v1, v6, v1

    .line 1297
    cmpl-float v6, v5, v1

    if-lez v6, :cond_3

    .line 1298
    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/if;->b(F)V

    .line 1304
    :cond_2
    :goto_1
    if-ne p1, v4, :cond_4

    move v1, v4

    :goto_2
    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/if;->D:Z

    .line 1305
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/if;->invalidate()V

    .line 1278
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_0

    .line 1300
    :cond_3
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->b(F)V

    goto :goto_1

    :cond_4
    move v1, v3

    .line 1304
    goto :goto_2
.end method

.method public final c(II)V
    .locals 9

    .prologue
    const/16 v8, 0xf

    .line 1208
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1270
    :cond_0
    :goto_0
    return-void

    .line 1211
    :cond_1
    const-string v0, "Exchange"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 1213
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ic;

    .line 1214
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    .line 1216
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ne;->j:Landroid/view/ViewGroup;

    add-int/lit8 v3, p1, 0x1

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/release/if;

    .line 1217
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ne;->j:Landroid/view/ViewGroup;

    add-int/lit8 v4, p2, 0x1

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/roidapp/photogrid/release/if;

    .line 1218
    iget-object v4, v2, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    .line 1219
    iget-object v5, v3, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    .line 1223
    iput-object v5, v0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    .line 1224
    iput-object v4, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    .line 1225
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v4, v4, p1

    iput-object v4, v2, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    .line 1226
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v4, v4, p2

    iput-object v4, v3, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    .line 1229
    iget-object v4, v2, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget-boolean v4, v4, Lcom/roidapp/photogrid/release/ig;->B:Z

    iput-boolean v4, v2, Lcom/roidapp/photogrid/release/if;->C:Z

    .line 1233
    iget-object v4, v3, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget-boolean v4, v4, Lcom/roidapp/photogrid/release/ig;->B:Z

    iput-boolean v4, v3, Lcom/roidapp/photogrid/release/if;->C:Z

    .line 1238
    :try_start_0
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v5, v5, p1

    iget v6, v0, Lcom/roidapp/photogrid/release/ic;->d:I

    iget v7, v0, Lcom/roidapp/photogrid/release/ic;->e:I

    invoke-virtual {v0, v4, v5, v6, v7}, Lcom/roidapp/photogrid/release/ic;->a(Landroid/content/Context;Lcom/roidapp/photogrid/release/ig;II)Landroid/graphics/Bitmap;

    .line 1239
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v5, v5, p2

    iget v6, v1, Lcom/roidapp/photogrid/release/ic;->d:I

    iget v7, v1, Lcom/roidapp/photogrid/release/ic;->e:I

    invoke-virtual {v1, v4, v5, v6, v7}, Lcom/roidapp/photogrid/release/ic;->a(Landroid/content/Context;Lcom/roidapp/photogrid/release/ig;II)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 1247
    iget-object v4, v0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/if;->b(Landroid/graphics/Bitmap;)V

    .line 1248
    iget-object v0, v0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/if;->a(Landroid/graphics/Bitmap;)V

    .line 1250
    iget-object v0, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/if;->b(Landroid/graphics/Bitmap;)V

    .line 1251
    iget-object v0, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/if;->a(Landroid/graphics/Bitmap;)V

    .line 1253
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v8}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 1241
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 1242
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v8}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 1243
    const/16 v0, 0xa1

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ne;->d(I)V

    goto/16 :goto_0
.end method

.method public final f()V
    .locals 2

    .prologue
    .line 1060
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->A:Ljava/util/List;

    if-nez v0, :cond_0

    .line 1061
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->A:Ljava/util/List;

    .line 1063
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->D:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_2

    .line 1064
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->z:Ljava/util/List;

    if-nez v0, :cond_1

    .line 1065
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->z:Ljava/util/List;

    .line 1067
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->z:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->D:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1068
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->z:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/util/List;)V

    .line 1070
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->E:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 1071
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->A:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1072
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->A:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(Ljava/util/List;)V

    .line 1073
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->E:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1075
    :cond_3
    return-void
.end method

.method public final m()V
    .locals 11

    .prologue
    const/4 v2, 0x0

    const/4 v4, 0x3

    .line 380
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->o()Ljava/util/List;

    move-result-object v1

    .line 381
    if-eqz v1, :cond_5

    .line 382
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    .line 383
    iget v3, p0, Lcom/roidapp/photogrid/release/ne;->P:I

    if-lt v3, v0, :cond_1

    .line 384
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 441
    :cond_0
    :goto_0
    return-void

    .line 387
    :cond_1
    iget v0, p0, Lcom/roidapp/photogrid/release/ne;->P:I

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/e;

    .line 388
    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->L:Lcom/roidapp/imagelib/filter/bi;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->i:[Lcom/roidapp/photogrid/release/ig;

    iget v3, p0, Lcom/roidapp/photogrid/release/ne;->P:I

    aget-object v0, v0, v3

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    if-nez v0, :cond_3

    .line 389
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x4

    if-ne v0, v3, :cond_0

    .line 390
    iget v0, p0, Lcom/roidapp/photogrid/release/ne;->P:I

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/e;

    .line 393
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    iget v3, p0, Lcom/roidapp/photogrid/release/ne;->P:I

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/ic;

    iget-object v6, v1, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    .line 394
    new-instance v10, Ljava/io/FileInputStream;

    iget-object v1, v0, Lcom/roidapp/cloudlib/template/e;->b:Ljava/lang/String;

    invoke-direct {v10, v1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 395
    :try_start_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->L:Lcom/roidapp/imagelib/filter/bi;

    iget-object v2, v0, Lcom/roidapp/cloudlib/template/e;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/roidapp/imagelib/filter/bi;->c(Ljava/lang/String;)V

    .line 396
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->L:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v1, v10}, Lcom/roidapp/imagelib/filter/bi;->a(Ljava/io/InputStream;)V

    .line 397
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->L:Lcom/roidapp/imagelib/filter/bi;

    iget-object v2, v0, Lcom/roidapp/cloudlib/template/e;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/roidapp/imagelib/filter/bi;->a(Ljava/lang/String;)V

    .line 398
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->L:Lcom/roidapp/imagelib/filter/bi;

    iget-object v0, v0, Lcom/roidapp/cloudlib/template/e;->d:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/filter/bi;->b(Ljava/lang/String;)V

    .line 399
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 400
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 401
    int-to-float v0, v0

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 403
    const/high16 v1, 0x43340000    # 180.0f

    div-float v0, v1, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 404
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    invoke-direct {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ne;->R:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    .line 405
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v1, 0x7f0d03e9

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 406
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->R:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 407
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 408
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->R:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v1, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 409
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->R:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ne;->O:Z

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setGalaxyYSeries(Z)V

    .line 410
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->R:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setVisibility(I)V

    .line 411
    iget-object v7, p0, Lcom/roidapp/photogrid/release/ne;->R:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->L:Lcom/roidapp/imagelib/filter/bi;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ne;->L:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/bi;->f()I

    move-result v1

    const/16 v2, 0xb4

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ne;->L:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/bi;->a(IIILcom/roidapp/imagelib/b/b;Z)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 412
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->R:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->deleteImage()V

    .line 413
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->R:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0, v6}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setImage(Landroid/graphics/Bitmap;)V

    .line 414
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->R:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->forceLayout()V

    .line 415
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ne;->R:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xb4

    move v8, v3

    move-object v9, p0

    invoke-virtual/range {v4 .. v9}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->saveToPictures(Ljava/lang/String;Ljava/lang/String;IILjp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 423
    :try_start_2
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_0

    .line 425
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_0

    .line 416
    :catch_1
    move-exception v0

    move-object v1, v2

    .line 417
    :goto_1
    :try_start_3
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ne;->p()V

    .line 418
    const/16 v2, 0x96

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/ne;->d(I)V

    .line 419
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 421
    if-eqz v1, :cond_0

    .line 423
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto/16 :goto_0

    .line 425
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_0

    .line 421
    :catchall_0
    move-exception v0

    move-object v10, v2

    :goto_2
    if-eqz v10, :cond_2

    .line 423
    :try_start_5
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 426
    :cond_2
    :goto_3
    throw v0

    .line 425
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_3

    .line 431
    :cond_3
    iget v0, p0, Lcom/roidapp/photogrid/release/ne;->P:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/ne;->P:I

    .line 432
    iget v0, p0, Lcom/roidapp/photogrid/release/ne;->P:I

    iget v1, p0, Lcom/roidapp/photogrid/release/ne;->Q:I

    if-ge v0, v1, :cond_4

    .line 433
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    goto/16 :goto_0

    .line 435
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    goto/16 :goto_0

    .line 438
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    goto/16 :goto_0

    .line 421
    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v10, v1

    goto :goto_2

    .line 416
    :catch_4
    move-exception v0

    move-object v1, v10

    goto :goto_1
.end method

.method public final onPictureSaved(Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 1320
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->y:Ljava/util/ArrayList;

    iget v1, p0, Lcom/roidapp/photogrid/release/ne;->P:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ic;

    iput-object p1, v0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    .line 1321
    iget v0, p0, Lcom/roidapp/photogrid/release/ne;->P:I

    invoke-direct {p0, v0, p1}, Lcom/roidapp/photogrid/release/ne;->a(ILandroid/graphics/Bitmap;)V

    .line 1322
    iget v0, p0, Lcom/roidapp/photogrid/release/ne;->P:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/ne;->P:I

    .line 1323
    iget v0, p0, Lcom/roidapp/photogrid/release/ne;->P:I

    iget v1, p0, Lcom/roidapp/photogrid/release/ne;->Q:I

    if-lt v0, v1, :cond_0

    .line 1324
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 1329
    :goto_0
    return-void

    .line 1327
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ne;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    goto :goto_0
.end method
