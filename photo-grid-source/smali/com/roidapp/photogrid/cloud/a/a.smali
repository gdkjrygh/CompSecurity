.class public final Lcom/roidapp/photogrid/cloud/a/a;
.super Lcom/roidapp/photogrid/cloud/a/l;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/ads/m;


# instance fields
.field public a:I

.field public b:I

.field c:Z

.field private g:I

.field private h:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/widget/BaseAdapter;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private j:I

.field private k:I

.field private l:Lcom/cmcm/a/a/d;

.field private m:Lcom/cmcm/a/a/a;

.field private n:Lcom/roidapp/cloudlib/ads/n;

.field private o:Lcom/google/ads/formats/NativeAppInstallAd;

.field private p:Lcom/google/ads/AdLoader;

.field private q:Z

.field private final r:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;IILcom/roidapp/photogrid/cloud/a/t;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 58
    invoke-direct {p0, p1, v3, p4}, Lcom/roidapp/photogrid/cloud/a/l;-><init>(Landroid/content/Context;ILcom/roidapp/photogrid/cloud/a/t;)V

    .line 42
    const/4 v0, 0x6

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->b:I

    .line 59
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/a/a;->r:Landroid/app/Activity;

    .line 60
    iput p2, p0, Lcom/roidapp/photogrid/cloud/a/a;->g:I

    .line 61
    iput p3, p0, Lcom/roidapp/photogrid/cloud/a/a;->a:I

    .line 1117
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 1118
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v1, v1

    .line 1119
    const/high16 v2, 0x42400000    # 48.0f

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v2

    sub-float v0, v1, v0

    .line 1120
    const v1, 0x3ff33333    # 1.9f

    div-float v1, v0, v1

    float-to-int v1, v1

    iput v1, p0, Lcom/roidapp/photogrid/cloud/a/a;->k:I

    .line 1121
    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->j:I

    .line 1123
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    const-string v1, "ad"

    const-string v2, "sort_native"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/a/a;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Queue;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->i:Ljava/util/Queue;

    .line 1124
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->i:Ljava/util/Queue;

    if-nez v0, :cond_0

    .line 1125
    new-instance v0, Ljava/util/LinkedList;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Integer;

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v3

    const/4 v2, 0x1

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->i:Ljava/util/Queue;

    .line 63
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/a/a;Lcom/cmcm/a/a/a;)Lcom/cmcm/a/a/a;
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/a/a;->m:Lcom/cmcm/a/a/a;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/a/a;)Lcom/cmcm/a/a/d;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->l:Lcom/cmcm/a/a/d;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/a/a;Lcom/google/ads/formats/NativeAppInstallAd;)Lcom/google/ads/formats/NativeAppInstallAd;
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/a/a;->o:Lcom/google/ads/formats/NativeAppInstallAd;

    return-object p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/a/a;)I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->g:I

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/cloud/a/a;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/a/a;->e()V

    return-void
.end method

.method static synthetic d(Lcom/roidapp/photogrid/cloud/a/a;)Z
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->q:Z

    return v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/cloud/a/a;)Lcom/google/ads/AdLoader;
    .locals 1

    .prologue
    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->p:Lcom/google/ads/AdLoader;

    return-object v0
.end method

.method private e()V
    .locals 4

    .prologue
    .line 129
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->d:Landroid/content/Context;

    if-nez v0, :cond_2

    .line 146
    :cond_1
    :goto_0
    return-void

    .line 130
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->i:Ljava/util/Queue;

    if-eqz v0, :cond_1

    .line 132
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->i:Ljava/util/Queue;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->i:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    move-object v1, v0

    .line 133
    :goto_1
    if-eqz v1, :cond_1

    .line 135
    const/4 v0, 0x0

    .line 136
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 144
    :goto_2
    :pswitch_0
    if-eqz v0, :cond_0

    goto :goto_0

    .line 132
    :cond_3
    const/4 v0, 0x0

    move-object v1, v0

    goto :goto_1

    .line 138
    :pswitch_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/a/a;->f()Z

    move-result v0

    goto :goto_2

    .line 2149
    :pswitch_2
    new-instance v0, Lcom/roidapp/photogrid/cloud/a/j;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/a/j;-><init>(Lcom/roidapp/photogrid/cloud/a/a;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->l:Lcom/cmcm/a/a/d;

    .line 2150
    invoke-static {}, Lcom/roidapp/cloudlib/ads/f;->a()Lcom/roidapp/cloudlib/ads/f;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/a;->d:Landroid/content/Context;

    iget v2, p0, Lcom/roidapp/photogrid/cloud/a/a;->g:I

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/a/a;->l:Lcom/cmcm/a/a/d;

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/ads/f;->a(Landroid/content/Context;ILcom/cmcm/a/a/d;)V

    .line 2153
    const/4 v0, 0x1

    .line 141
    goto :goto_2

    .line 136
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic f(Lcom/roidapp/photogrid/cloud/a/a;)Lcom/google/ads/formats/NativeAppInstallAd;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->o:Lcom/google/ads/formats/NativeAppInstallAd;

    return-object v0
.end method

.method private f()Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 199
    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    move-result-object v1

    iget-boolean v1, v1, Lcom/roidapp/photogrid/common/a;->a:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lcom/roidapp/photogrid/cloud/a/a;->q:Z

    if-eqz v1, :cond_1

    .line 234
    :cond_0
    :goto_0
    return v0

    .line 200
    :cond_1
    new-instance v1, Lcom/google/ads/AdLoader$Builder;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/a/a;->d:Landroid/content/Context;

    const-string v3, "ca-app-pub-5185134000426737/1982366401"

    invoke-direct {v1, v2, v3}, Lcom/google/ads/AdLoader$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v2, Lcom/roidapp/photogrid/cloud/a/c;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/cloud/a/c;-><init>(Lcom/roidapp/photogrid/cloud/a/a;)V

    invoke-virtual {v1, v2}, Lcom/google/ads/AdLoader$Builder;->forAppInstallAd(Lcom/google/ads/formats/NativeAppInstallAd$OnAppInstallAdLoadedListener;)Lcom/google/ads/AdLoader$Builder;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/cloud/a/b;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/cloud/a/b;-><init>(Lcom/roidapp/photogrid/cloud/a/a;)V

    invoke-virtual {v1, v2}, Lcom/google/ads/AdLoader$Builder;->withAdListener(Lcom/google/android/gms/ads/AdListener;)Lcom/google/ads/AdLoader$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/ads/AdLoader$Builder;->build()Lcom/google/ads/AdLoader;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/a/a;->p:Lcom/google/ads/AdLoader;

    .line 229
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/a;->p:Lcom/google/ads/AdLoader;

    new-instance v2, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;

    invoke-direct {v2}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;-><init>()V

    invoke-virtual {v2}, Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest$Builder;->build()Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/ads/AdLoader;->loadAd(Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;)V
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 234
    const/4 v0, 0x1

    goto :goto_0

    .line 231
    :catch_0
    move-exception v1

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/a/a;->p:Lcom/google/ads/AdLoader;

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    .prologue
    .line 87
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->c:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->f:Z

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->d:Landroid/content/Context;

    if-nez v0, :cond_2

    .line 88
    :cond_0
    const/4 v7, 0x0

    .line 101
    :cond_1
    :goto_0
    return-object v7

    .line 89
    :cond_2
    if-eqz p2, :cond_1a

    .line 90
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/roidapp/photogrid/cloud/a/a;

    if-nez v0, :cond_1a

    .line 93
    const/4 p2, 0x0

    move-object v0, p2

    .line 96
    :goto_1
    if-eqz v0, :cond_12

    move-object v7, v0

    .line 97
    :goto_2
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1238
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->m:Lcom/cmcm/a/a/a;

    if-eqz v0, :cond_16

    if-eqz v7, :cond_16

    .line 1240
    const v0, 0x7f0d009c

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1241
    const v1, 0x7f0d009d

    invoke-virtual {v7, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 1242
    const v2, 0x7f0d009b

    invoke-virtual {v7, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 1243
    const v3, 0x7f0d009f

    invoke-virtual {v7, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 1244
    const v4, 0x7f0d009a

    invoke-virtual {v7, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 1245
    const v5, 0x7f0d0098

    invoke-virtual {v7, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    .line 1246
    const v6, 0x7f0d009e

    invoke-virtual {v7, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    .line 1248
    if-eqz v0, :cond_3

    .line 1249
    const/16 v8, 0x8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1250
    :cond_3
    if-eqz v1, :cond_4

    .line 1251
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1253
    :cond_4
    if-eqz v2, :cond_5

    .line 1254
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->m:Lcom/cmcm/a/a/a;

    invoke-interface {v0}, Lcom/cmcm/a/a/a;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1255
    :cond_5
    if-eqz v3, :cond_6

    .line 1256
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->m:Lcom/cmcm/a/a/a;

    invoke-interface {v0}, Lcom/cmcm/a/a/a;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1257
    const/16 v0, 0x64

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1259
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->m:Lcom/cmcm/a/a/a;

    if-eqz v0, :cond_7

    .line 1260
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->m:Lcom/cmcm/a/a/a;

    invoke-interface {v0}, Lcom/cmcm/a/a/a;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_13

    .line 1261
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->m:Lcom/cmcm/a/a/a;

    invoke-interface {v0}, Lcom/cmcm/a/a/a;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1265
    :cond_7
    :goto_3
    if-eqz v6, :cond_9

    .line 1266
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->m:Lcom/cmcm/a/a/a;

    invoke-interface {v0}, Lcom/cmcm/a/a/a;->e()Ljava/lang/String;

    move-result-object v0

    .line 1268
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_14

    .line 1269
    invoke-virtual {v6}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 1270
    if-eqz v1, :cond_8

    .line 1271
    iget v2, p0, Lcom/roidapp/photogrid/cloud/a/a;->k:I

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1272
    iget v2, p0, Lcom/roidapp/photogrid/cloud/a/a;->j:I

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1274
    :cond_8
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/a;->r:Landroid/app/Activity;

    invoke-static {v1}, Lcom/bumptech/glide/h;->a(Landroid/app/Activity;)Lcom/bumptech/glide/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/d;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/c;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 1280
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1285
    :cond_9
    :goto_4
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->m:Lcom/cmcm/a/a/a;

    invoke-interface {v0}, Lcom/cmcm/a/a/a;->f()Ljava/lang/String;

    move-result-object v0

    .line 1286
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_a

    if-eqz v5, :cond_a

    .line 1287
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/a;->r:Landroid/app/Activity;

    invoke-static {v1}, Lcom/bumptech/glide/h;->a(Landroid/app/Activity;)Lcom/bumptech/glide/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/d;->g()Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/c;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    .line 1294
    :cond_a
    const v0, 0x7f0d0099

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/a/a;->m:Lcom/cmcm/a/a/a;

    invoke-interface {v1}, Lcom/cmcm/a/a/a;->j()Z

    move-result v1

    if-eqz v1, :cond_15

    const v1, 0x7f02014b

    :goto_5
    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 1304
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->m:Lcom/cmcm/a/a/a;

    invoke-interface {v0, v7}, Lcom/cmcm/a/a/a;->a(Landroid/view/View;)V

    .line 1311
    const/4 v0, 0x6

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->b:I

    .line 1312
    const/4 v0, 0x1

    .line 99
    :goto_6
    if-nez v0, :cond_1

    .line 100
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->o:Lcom/google/ads/formats/NativeAppInstallAd;

    .line 1318
    if-eqz v0, :cond_1

    if-eqz v7, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->o:Lcom/google/ads/formats/NativeAppInstallAd;

    if-eqz v0, :cond_1

    .line 1320
    const v0, 0x7f0d009c

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1321
    const v1, 0x7f0d009d

    invoke-virtual {v7, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 1322
    const v2, 0x7f0d009b

    invoke-virtual {v7, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 1323
    const v3, 0x7f0d009f

    invoke-virtual {v7, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 1324
    const v4, 0x7f0d009a

    invoke-virtual {v7, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 1325
    const v5, 0x7f0d0098

    invoke-virtual {v7, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    .line 1326
    const v6, 0x7f0d009e

    invoke-virtual {v7, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    .line 1329
    iget-object v8, p0, Lcom/roidapp/photogrid/cloud/a/a;->o:Lcom/google/ads/formats/NativeAppInstallAd;

    invoke-interface {v8}, Lcom/google/ads/formats/NativeAppInstallAd;->getAttributionText()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_b

    const-string v8, ""

    iget-object v9, p0, Lcom/roidapp/photogrid/cloud/a/a;->o:Lcom/google/ads/formats/NativeAppInstallAd;

    invoke-interface {v9}, Lcom/google/ads/formats/NativeAppInstallAd;->getAttributionText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    .line 1330
    const/4 v8, 0x0

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1331
    iget-object v8, p0, Lcom/roidapp/photogrid/cloud/a/a;->o:Lcom/google/ads/formats/NativeAppInstallAd;

    invoke-interface {v8}, Lcom/google/ads/formats/NativeAppInstallAd;->getAttributionText()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1332
    new-instance v8, Lcom/roidapp/photogrid/cloud/a/d;

    invoke-direct {v8, p0}, Lcom/roidapp/photogrid/cloud/a/d;-><init>(Lcom/roidapp/photogrid/cloud/a/a;)V

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1340
    :cond_b
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->o:Lcom/google/ads/formats/NativeAppInstallAd;

    invoke-interface {v0}, Lcom/google/ads/formats/NativeAppInstallAd;->getAttributionIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 1341
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1342
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->o:Lcom/google/ads/formats/NativeAppInstallAd;

    invoke-interface {v0}, Lcom/google/ads/formats/NativeAppInstallAd;->getAttributionIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1343
    new-instance v0, Lcom/roidapp/photogrid/cloud/a/e;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/a/e;-><init>(Lcom/roidapp/photogrid/cloud/a/a;)V

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1350
    :cond_c
    if-eqz v2, :cond_d

    .line 1352
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->o:Lcom/google/ads/formats/NativeAppInstallAd;

    invoke-interface {v0}, Lcom/google/ads/formats/NativeAppInstallAd;->getHeadline()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1353
    new-instance v0, Lcom/roidapp/photogrid/cloud/a/f;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/a/f;-><init>(Lcom/roidapp/photogrid/cloud/a/a;)V

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1361
    :cond_d
    if-eqz v3, :cond_e

    .line 1362
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->o:Lcom/google/ads/formats/NativeAppInstallAd;

    invoke-interface {v0}, Lcom/google/ads/formats/NativeAppInstallAd;->getBody()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1364
    const/16 v0, 0x64

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1366
    :cond_e
    if-eqz v4, :cond_f

    .line 1368
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->o:Lcom/google/ads/formats/NativeAppInstallAd;

    invoke-interface {v0}, Lcom/google/ads/formats/NativeAppInstallAd;->getCallToAction()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1369
    new-instance v0, Lcom/roidapp/photogrid/cloud/a/g;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/a/g;-><init>(Lcom/roidapp/photogrid/cloud/a/a;)V

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1377
    :cond_f
    if-eqz v6, :cond_11

    .line 1378
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->o:Lcom/google/ads/formats/NativeAppInstallAd;

    invoke-interface {v0}, Lcom/google/ads/formats/NativeAppInstallAd;->getImage()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 1379
    if-eqz v2, :cond_19

    .line 1380
    invoke-virtual {v6}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 1381
    if-eqz v3, :cond_10

    .line 1383
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 1384
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    .line 1385
    if-lez v0, :cond_18

    if-lez v1, :cond_18

    .line 1387
    if-le v1, v0, :cond_17

    .line 1389
    int-to-float v0, v0

    iget v4, p0, Lcom/roidapp/photogrid/cloud/a/a;->k:I

    int-to-float v4, v4

    mul-float/2addr v0, v4

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 1390
    iget v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->k:I

    .line 1396
    :goto_7
    iput v0, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1397
    iput v1, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1403
    :cond_10
    :goto_8
    invoke-virtual {v6, v3}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1404
    invoke-virtual {v6, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1405
    new-instance v0, Lcom/roidapp/photogrid/cloud/a/h;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/a/h;-><init>(Lcom/roidapp/photogrid/cloud/a/a;)V

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1411
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1418
    :cond_11
    :goto_9
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->o:Lcom/google/ads/formats/NativeAppInstallAd;

    invoke-interface {v0}, Lcom/google/ads/formats/NativeAppInstallAd;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1419
    new-instance v0, Lcom/roidapp/photogrid/cloud/a/i;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/a/i;-><init>(Lcom/roidapp/photogrid/cloud/a/a;)V

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1431
    const v0, 0x7f0d0099

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v1, 0x7f02014b

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/ImageView;I)V

    .line 1439
    const/16 v0, 0x8

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->b:I

    goto/16 :goto_0

    .line 96
    :cond_12
    const v0, 0x7f03001d

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    goto/16 :goto_2

    .line 1262
    :cond_13
    const-string v0, "Try it"

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 1282
    :cond_14
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_4

    .line 1294
    :cond_15
    const/4 v1, 0x0

    goto/16 :goto_5

    .line 1314
    :cond_16
    const/4 v0, 0x0

    goto/16 :goto_6

    .line 1392
    :cond_17
    int-to-float v1, v1

    iget v4, p0, Lcom/roidapp/photogrid/cloud/a/a;->j:I

    int-to-float v4, v4

    mul-float/2addr v1, v4

    int-to-float v0, v0

    div-float v0, v1, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 1393
    iget v1, p0, Lcom/roidapp/photogrid/cloud/a/a;->j:I

    goto :goto_7

    .line 1399
    :cond_18
    iget v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->k:I

    iput v0, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1400
    iget v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->j:I

    iput v0, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_8

    .line 1414
    :cond_19
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_9

    :cond_1a
    move-object v0, p2

    goto/16 :goto_1
.end method

.method public final a()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 67
    iput-object v3, p0, Lcom/roidapp/photogrid/cloud/a/a;->n:Lcom/roidapp/cloudlib/ads/n;

    .line 68
    iput-object v3, p0, Lcom/roidapp/photogrid/cloud/a/a;->m:Lcom/cmcm/a/a/a;

    .line 69
    iput-object v3, p0, Lcom/roidapp/photogrid/cloud/a/a;->p:Lcom/google/ads/AdLoader;

    .line 70
    iput-object v3, p0, Lcom/roidapp/photogrid/cloud/a/a;->o:Lcom/google/ads/formats/NativeAppInstallAd;

    .line 71
    invoke-static {}, Lcom/roidapp/cloudlib/ads/f;->a()Lcom/roidapp/cloudlib/ads/f;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/cloud/a/a;->g:I

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/a/a;->l:Lcom/cmcm/a/a/d;

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/ads/f;->a(ILcom/cmcm/a/a/d;)V

    .line 72
    iput-object v3, p0, Lcom/roidapp/photogrid/cloud/a/a;->l:Lcom/cmcm/a/a/d;

    .line 73
    invoke-super {p0}, Lcom/roidapp/photogrid/cloud/a/l;->a()V

    .line 74
    return-void
.end method

.method public final a(Landroid/widget/BaseAdapter;)V
    .locals 1

    .prologue
    .line 82
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->h:Ljava/lang/ref/WeakReference;

    .line 83
    return-void
.end method

.method protected final b()V
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->h:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 106
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->h:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/BaseAdapter;

    .line 107
    if-eqz v0, :cond_0

    .line 108
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 110
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 0

    .prologue
    .line 113
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/a/a;->e()V

    .line 114
    return-void
.end method
