.class public final Lcom/roidapp/photogrid/cloud/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/ads/k;


# instance fields
.field private a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/cmcm/adsdk/nativead/d;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private c:F

.field private d:I

.field private e:Z

.field private f:Lcom/roidapp/cloudlib/ads/i;

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 2

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p2}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/aa;->a:Ljava/util/Set;

    .line 55
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0, p2}, Landroid/util/SparseArray;-><init>(I)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/aa;->b:Landroid/util/SparseArray;

    .line 56
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 57
    invoke-static {v0}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/common/a;->b:Z

    if-eqz v0, :cond_1

    .line 58
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/aa;->e:Z

    .line 65
    :goto_0
    return-void

    .line 62
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 63
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v1, p0, Lcom/roidapp/photogrid/cloud/aa;->d:I

    .line 64
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lcom/roidapp/photogrid/cloud/aa;->c:F

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/aa;)Lcom/roidapp/cloudlib/ads/i;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/aa;->f:Lcom/roidapp/cloudlib/ads/i;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/aa;)Landroid/util/SparseArray;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/aa;->b:Landroid/util/SparseArray;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/roidapp/cloudlib/ads/j;Landroid/view/View;Landroid/view/ViewGroup;Lcom/bumptech/glide/p;)Landroid/view/View;
    .locals 11

    .prologue
    const/4 v10, 0x1

    const/high16 v9, 0x42400000    # 48.0f

    const v8, 0x3ff33333    # 1.9f

    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 141
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/ads/j;->a()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/cmcm/adsdk/nativead/d;

    if-eqz v0, :cond_c

    .line 142
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/ads/j;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/nativead/d;

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/ads/j;->b()Ljava/lang/String;

    move-result-object v5

    .line 1231
    if-nez v0, :cond_1

    move-object p2, v4

    .line 1232
    :cond_0
    :goto_0
    return-object p2

    .line 1236
    :cond_1
    if-nez p2, :cond_8

    .line 1237
    new-instance v2, Lcom/roidapp/photogrid/cloud/ad;

    invoke-direct {v2, v3}, Lcom/roidapp/photogrid/cloud/ad;-><init>(B)V

    .line 1238
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v6, 0x7f03001d

    invoke-virtual {v1, v6, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 1239
    const v1, 0x7f0d009b

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v2, Lcom/roidapp/photogrid/cloud/ad;->a:Landroid/widget/TextView;

    .line 1240
    const v1, 0x7f0d009f

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v2, Lcom/roidapp/photogrid/cloud/ad;->b:Landroid/widget/TextView;

    .line 1241
    const v1, 0x7f0d009a

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v2, Lcom/roidapp/photogrid/cloud/ad;->c:Landroid/widget/TextView;

    .line 1242
    const v1, 0x7f0d0098

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, v2, Lcom/roidapp/photogrid/cloud/ad;->d:Landroid/widget/ImageView;

    .line 1243
    const v1, 0x7f0d009e

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, v2, Lcom/roidapp/photogrid/cloud/ad;->e:Landroid/widget/ImageView;

    .line 1244
    const v1, 0x7f0d0099

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, v2, Lcom/roidapp/photogrid/cloud/ad;->f:Landroid/widget/ImageView;

    .line 1245
    invoke-virtual {p2, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v1, v2

    .line 1251
    :goto_1
    iget-object v2, v1, Lcom/roidapp/photogrid/cloud/ad;->a:Landroid/widget/TextView;

    if-eqz v2, :cond_2

    .line 1252
    iget-object v2, v1, Lcom/roidapp/photogrid/cloud/ad;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/cmcm/adsdk/nativead/d;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1254
    :cond_2
    iget-object v2, v1, Lcom/roidapp/photogrid/cloud/ad;->b:Landroid/widget/TextView;

    if-eqz v2, :cond_3

    .line 1255
    iget-object v2, v1, Lcom/roidapp/photogrid/cloud/ad;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/cmcm/adsdk/nativead/d;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1256
    iget-object v2, v1, Lcom/roidapp/photogrid/cloud/ad;->b:Landroid/widget/TextView;

    const/16 v4, 0x64

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1258
    :cond_3
    iget-object v2, v1, Lcom/roidapp/photogrid/cloud/ad;->c:Landroid/widget/TextView;

    if-eqz v2, :cond_4

    .line 1259
    invoke-virtual {v0}, Lcom/cmcm/adsdk/nativead/d;->g()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_9

    .line 1260
    iget-object v2, v1, Lcom/roidapp/photogrid/cloud/ad;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/cmcm/adsdk/nativead/d;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1264
    :cond_4
    :goto_2
    invoke-virtual {v0}, Lcom/cmcm/adsdk/nativead/d;->e()Ljava/lang/String;

    move-result-object v2

    .line 1265
    invoke-virtual {v0}, Lcom/cmcm/adsdk/nativead/d;->f()Ljava/lang/String;

    move-result-object v4

    .line 1268
    iget-object v6, v1, Lcom/roidapp/photogrid/cloud/ad;->e:Landroid/widget/ImageView;

    if-eqz v6, :cond_5

    .line 1269
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_a

    .line 1270
    iget-object v6, v1, Lcom/roidapp/photogrid/cloud/ad;->e:Landroid/widget/ImageView;

    invoke-virtual {v6, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1271
    iget v6, p0, Lcom/roidapp/photogrid/cloud/aa;->d:I

    int-to-float v6, v6

    iget v7, p0, Lcom/roidapp/photogrid/cloud/aa;->c:F

    mul-float/2addr v7, v9

    sub-float/2addr v6, v7

    .line 1272
    iget-object v7, v1, Lcom/roidapp/photogrid/cloud/ad;->e:Landroid/widget/ImageView;

    invoke-virtual {v7}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    .line 1273
    div-float/2addr v6, v8

    float-to-int v6, v6

    iput v6, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1274
    if-eqz p4, :cond_5

    .line 1275
    invoke-virtual {p4, v2}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/bumptech/glide/d;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v2

    sget-object v6, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v2, v6}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v2

    iget-object v6, v1, Lcom/roidapp/photogrid/cloud/ad;->e:Landroid/widget/ImageView;

    invoke-virtual {v2, v6}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 1283
    :cond_5
    :goto_3
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, v1, Lcom/roidapp/photogrid/cloud/ad;->d:Landroid/widget/ImageView;

    if-eqz v2, :cond_6

    .line 1284
    if-eqz p4, :cond_6

    .line 1285
    invoke-virtual {p4, v4}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/bumptech/glide/d;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v2

    sget-object v4, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v2, v4}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v2

    iget-object v4, v1, Lcom/roidapp/photogrid/cloud/ad;->d:Landroid/widget/ImageView;

    invoke-virtual {v2, v4}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 1292
    :cond_6
    iget-object v2, v1, Lcom/roidapp/photogrid/cloud/ad;->f:Landroid/widget/ImageView;

    if-eqz v2, :cond_7

    .line 1293
    iget-object v2, v1, Lcom/roidapp/photogrid/cloud/ad;->f:Landroid/widget/ImageView;

    invoke-virtual {v0}, Lcom/cmcm/adsdk/nativead/d;->j()Z

    move-result v1

    if-eqz v1, :cond_b

    const v1, 0x7f02014b

    :goto_4
    invoke-static {v2, v1}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 1302
    :cond_7
    invoke-virtual {v0, p2}, Lcom/cmcm/adsdk/nativead/d;->a(Landroid/view/View;)V

    .line 1303
    invoke-virtual {p2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1305
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/aa;->a:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1306
    const/4 v1, 0x5

    invoke-static {v5, v1, v10}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;II)V

    .line 1308
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/aa;->a:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1309
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/aa;->b:Landroid/util/SparseArray;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {v1, v0, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 1248
    :cond_8
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/cloud/ad;

    goto/16 :goto_1

    .line 1261
    :cond_9
    iget-object v2, v1, Lcom/roidapp/photogrid/cloud/ad;->c:Landroid/widget/TextView;

    const-string v4, "Try it"

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 1281
    :cond_a
    iget-object v2, v1, Lcom/roidapp/photogrid/cloud/ad;->e:Landroid/widget/ImageView;

    const/16 v6, 0x8

    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_3

    :cond_b
    move v1, v3

    .line 1293
    goto :goto_4

    .line 2151
    :cond_c
    if-nez p2, :cond_13

    .line 2152
    new-instance v1, Lcom/roidapp/photogrid/cloud/ad;

    invoke-direct {v1, v3}, Lcom/roidapp/photogrid/cloud/ad;-><init>(B)V

    .line 2153
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f03001d

    invoke-virtual {v0, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 2154
    const v0, 0x7f0d009b

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/photogrid/cloud/ad;->a:Landroid/widget/TextView;

    .line 2155
    const v0, 0x7f0d009f

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/photogrid/cloud/ad;->b:Landroid/widget/TextView;

    .line 2156
    const v0, 0x7f0d009a

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/photogrid/cloud/ad;->c:Landroid/widget/TextView;

    .line 2157
    const v0, 0x7f0d0098

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/photogrid/cloud/ad;->d:Landroid/widget/ImageView;

    .line 2158
    const v0, 0x7f0d009e

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/photogrid/cloud/ad;->e:Landroid/widget/ImageView;

    .line 2159
    const v0, 0x7f0d0099

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcom/roidapp/photogrid/cloud/ad;->f:Landroid/widget/ImageView;

    .line 2160
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v0, v1

    .line 2166
    :goto_5
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/ad;->a:Landroid/widget/TextView;

    if-eqz v1, :cond_d

    .line 2167
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/ad;->a:Landroid/widget/TextView;

    const-string v2, "3D Theme"

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2169
    :cond_d
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/ad;->b:Landroid/widget/TextView;

    if-eqz v1, :cond_e

    .line 2170
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/ad;->b:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2172
    :cond_e
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/ad;->c:Landroid/widget/TextView;

    if-eqz v1, :cond_f

    .line 2173
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/ad;->c:Landroid/widget/TextView;

    const v2, 0x7f070021

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 2176
    :cond_f
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/ad;->e:Landroid/widget/ImageView;

    if-eqz v1, :cond_10

    .line 2177
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/ad;->e:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2178
    iget v1, p0, Lcom/roidapp/photogrid/cloud/aa;->d:I

    int-to-float v1, v1

    iget v2, p0, Lcom/roidapp/photogrid/cloud/aa;->c:F

    mul-float/2addr v2, v9

    sub-float/2addr v1, v2

    .line 2179
    iget-object v2, v0, Lcom/roidapp/photogrid/cloud/ad;->e:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    .line 2180
    div-float/2addr v1, v8

    float-to-int v1, v1

    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 2181
    if-eqz p4, :cond_10

    .line 2182
    const v1, 0x7f020009

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p4, v1}, Lcom/bumptech/glide/p;->a(Ljava/lang/Integer;)Lcom/bumptech/glide/d;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/d;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v1

    sget-object v2, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v1

    iget-object v2, v0, Lcom/roidapp/photogrid/cloud/ad;->e:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 2188
    :cond_10
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/ad;->d:Landroid/widget/ImageView;

    if-eqz v1, :cond_11

    .line 2189
    if-eqz p4, :cond_11

    .line 2190
    const v1, 0x7f020008

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p4, v1}, Lcom/bumptech/glide/p;->a(Ljava/lang/Integer;)Lcom/bumptech/glide/d;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/d;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v1

    sget-object v2, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/c;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v1

    iget-object v2, v0, Lcom/roidapp/photogrid/cloud/ad;->d:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 2197
    :cond_11
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/ad;->f:Landroid/widget/ImageView;

    if-eqz v1, :cond_12

    .line 2198
    iget-object v1, v0, Lcom/roidapp/photogrid/cloud/ad;->f:Landroid/widget/ImageView;

    const v2, 0x7f02014b

    invoke-static {v1, v2}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 2200
    :cond_12
    new-instance v1, Lcom/roidapp/photogrid/cloud/ab;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/cloud/ab;-><init>(Lcom/roidapp/photogrid/cloud/aa;)V

    .line 2212
    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2213
    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/ad;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2214
    invoke-virtual {p2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 2223
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/aa;->g:Z

    if-nez v0, :cond_0

    .line 2224
    const-string v0, "Ad/Show/CML"

    invoke-static {v0, v4}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 2225
    iput-boolean v10, p0, Lcom/roidapp/photogrid/cloud/aa;->g:Z

    goto/16 :goto_0

    .line 2163
    :cond_13
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/ad;

    goto/16 :goto_5
.end method

.method public final a()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 68
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/aa;->a:Ljava/util/Set;

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/aa;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 70
    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/aa;->a:Ljava/util/Set;

    .line 72
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/aa;->b:Landroid/util/SparseArray;

    if-eqz v0, :cond_1

    .line 73
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/aa;->b:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 74
    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/aa;->b:Landroid/util/SparseArray;

    .line 76
    :cond_1
    invoke-static {}, Lcom/roidapp/cloudlib/ads/f;->a()Lcom/roidapp/cloudlib/ads/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/ads/f;->b()V

    .line 77
    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/aa;->f:Lcom/roidapp/cloudlib/ads/i;

    .line 78
    return-void
.end method

.method public final a(Landroid/content/Context;Lcom/roidapp/photogrid/cloud/ac;Lcom/roidapp/cloudlib/ads/i;)V
    .locals 3

    .prologue
    .line 81
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/aa;->e:Z

    if-nez v0, :cond_0

    invoke-static {p2}, Lcom/roidapp/photogrid/cloud/ac;->a(Lcom/roidapp/photogrid/cloud/ac;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 90
    :cond_0
    :goto_0
    return-void

    .line 84
    :cond_1
    iput-object p3, p0, Lcom/roidapp/photogrid/cloud/aa;->f:Lcom/roidapp/cloudlib/ads/i;

    .line 85
    invoke-static {p2}, Lcom/roidapp/photogrid/cloud/ac;->b(Lcom/roidapp/photogrid/cloud/ac;)Z

    .line 87
    invoke-static {}, Lcom/roidapp/cloudlib/ads/f;->a()Lcom/roidapp/cloudlib/ads/f;

    move-result-object v0

    const v1, 0x9c48

    new-instance v2, Lcom/roidapp/photogrid/cloud/ae;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/cloud/ae;-><init>(Lcom/roidapp/photogrid/cloud/aa;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/roidapp/cloudlib/ads/f;->a(Landroid/content/Context;ILcom/cmcm/a/a/d;)V

    goto :goto_0
.end method
