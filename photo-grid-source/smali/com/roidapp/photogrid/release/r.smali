.class public final Lcom/roidapp/photogrid/release/r;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private b:Landroid/support/v4/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LruCache",
            "<",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/roidapp/photogrid/release/v;

.field private d:Z

.field private e:I

.field private f:I

.field private g:Lcom/roidapp/photogrid/release/a;

.field private final h:I

.field private i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/b;",
            ">;"
        }
    .end annotation
.end field

.field private j:I

.field private k:Landroid/content/Context;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/GridView;

.field private n:Landroid/view/View;

.field private o:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 41
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 47
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/r;->d:Z

    .line 48
    iput v0, p0, Lcom/roidapp/photogrid/release/r;->e:I

    iput v0, p0, Lcom/roidapp/photogrid/release/r;->f:I

    .line 50
    const/16 v0, 0xf

    iput v0, p0, Lcom/roidapp/photogrid/release/r;->h:I

    .line 51
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/r;->i:Ljava/util/ArrayList;

    .line 52
    iput v1, p0, Lcom/roidapp/photogrid/release/r;->j:I

    .line 59
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/r;->o:Z

    .line 409
    return-void
.end method

.method static synthetic a(Landroid/graphics/Bitmap;)I
    .locals 1

    .prologue
    .line 41
    invoke-static {p0}, Lcom/roidapp/photogrid/release/r;->b(Landroid/graphics/Bitmap;)I

    move-result v0

    return v0
.end method

.method private a(Lcom/roidapp/photogrid/release/b;)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 233
    if-eqz p1, :cond_8

    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->b:Landroid/support/v4/util/LruCache;

    if-eqz v0, :cond_8

    .line 236
    iget-boolean v0, p1, Lcom/roidapp/photogrid/release/b;->g:Z

    if-eqz v0, :cond_1

    .line 237
    iget-object v0, p1, Lcom/roidapp/photogrid/release/b;->e:Ljava/lang/String;

    move-object v1, v0

    .line 242
    :goto_0
    iget-object v3, p0, Lcom/roidapp/photogrid/release/r;->b:Landroid/support/v4/util/LruCache;

    monitor-enter v3

    .line 2223
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->b:Landroid/support/v4/util/LruCache;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->b:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0}, Landroid/support/v4/util/LruCache;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 2224
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->b:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0, v1}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 2225
    if-eqz v0, :cond_2

    .line 245
    :goto_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 246
    if-eqz v0, :cond_3

    .line 282
    :cond_0
    :goto_2
    return-object v0

    .line 239
    :cond_1
    iget v0, p1, Lcom/roidapp/photogrid/release/b;->a:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    :cond_2
    move-object v0, v2

    .line 2229
    goto :goto_1

    .line 245
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 250
    :cond_3
    iget-boolean v2, p1, Lcom/roidapp/photogrid/release/b;->f:Z

    if-eqz v2, :cond_4

    .line 251
    invoke-static {}, Lcom/roidapp/photogrid/release/rd;->a()Lcom/roidapp/photogrid/release/rd;

    iget-object v0, p1, Lcom/roidapp/photogrid/release/b;->c:Ljava/lang/String;

    iget v1, p0, Lcom/roidapp/photogrid/release/r;->f:I

    iget v2, p0, Lcom/roidapp/photogrid/release/r;->e:I

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/rd;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_2

    .line 252
    :cond_4
    iget-boolean v2, p1, Lcom/roidapp/photogrid/release/b;->h:Z

    if-eqz v2, :cond_5

    .line 254
    :try_start_2
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 255
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 257
    invoke-static {}, Lcom/roidapp/photogrid/release/rd;->a()Lcom/roidapp/photogrid/release/rd;

    iget v2, p0, Lcom/roidapp/photogrid/release/r;->f:I

    iget v3, p0, Lcom/roidapp/photogrid/release/r;->e:I

    invoke-static {v1, v2, v3}, Lcom/roidapp/photogrid/release/rd;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    goto :goto_2

    .line 264
    :cond_5
    iget-boolean v1, p1, Lcom/roidapp/photogrid/release/b;->g:Z

    if-eqz v1, :cond_7

    .line 265
    iget-object v1, p0, Lcom/roidapp/photogrid/release/r;->k:Landroid/content/Context;

    if-nez v1, :cond_6

    .line 267
    :try_start_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/r;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v2, p1, Lcom/roidapp/photogrid/release/b;->d:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-virtual {v1, v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/release/r;->k:Landroid/content/Context;
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_0

    .line 273
    :cond_6
    :goto_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/r;->k:Landroid/content/Context;

    if-eqz v1, :cond_0

    .line 274
    invoke-static {}, Lcom/roidapp/photogrid/release/rd;->a()Lcom/roidapp/photogrid/release/rd;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->k:Landroid/content/Context;

    iget-object v1, p1, Lcom/roidapp/photogrid/release/b;->e:Ljava/lang/String;

    iget v2, p0, Lcom/roidapp/photogrid/release/r;->f:I

    iget v3, p0, Lcom/roidapp/photogrid/release/r;->e:I

    invoke-static {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/rd;->a(Landroid/content/Context;Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_2

    .line 270
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    goto :goto_3

    .line 278
    :cond_7
    invoke-static {}, Lcom/roidapp/photogrid/release/rd;->a()Lcom/roidapp/photogrid/release/rd;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget v1, p1, Lcom/roidapp/photogrid/release/b;->a:I

    iget v2, p0, Lcom/roidapp/photogrid/release/r;->f:I

    iget v3, p0, Lcom/roidapp/photogrid/release/r;->e:I

    invoke-static {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/rd;->a(Landroid/content/Context;III)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_2

    :cond_8
    move-object v0, v2

    .line 282
    goto :goto_2

    :catch_1
    move-exception v1

    goto :goto_2
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/r;Lcom/roidapp/photogrid/release/b;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/r;->a(Lcom/roidapp/photogrid/release/b;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/r;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/GridImageView;)Lcom/roidapp/photogrid/release/u;
    .locals 1

    .prologue
    .line 41
    invoke-static {p0}, Lcom/roidapp/photogrid/release/r;->b(Lcom/roidapp/photogrid/release/GridImageView;)Lcom/roidapp/photogrid/release/u;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/r;Z)Z
    .locals 0

    .prologue
    .line 41
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/r;->o:Z

    return p1
.end method

.method private static b(Landroid/graphics/Bitmap;)I
    .locals 3

    .prologue
    .line 168
    invoke-static {}, Lcom/roidapp/baselib/c/n;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    :try_start_0
    const-class v0, Landroid/graphics/Bitmap;

    const-string v1, "getByteCount"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 172
    if-eqz v0, :cond_0

    .line 173
    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 180
    :goto_0
    return v0

    .line 176
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 180
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getRowBytes()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    mul-int/2addr v0, v1

    goto :goto_0
.end method

.method private static b(Lcom/roidapp/photogrid/release/GridImageView;)Lcom/roidapp/photogrid/release/u;
    .locals 2

    .prologue
    .line 378
    if-eqz p0, :cond_0

    .line 379
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/GridImageView;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 380
    instance-of v1, v0, Lcom/roidapp/photogrid/release/aa;

    if-eqz v1, :cond_0

    .line 381
    check-cast v0, Lcom/roidapp/photogrid/release/aa;

    .line 382
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/aa;->a()Lcom/roidapp/photogrid/release/u;

    move-result-object v0

    .line 385
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/r;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->i:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/r;)Landroid/support/v4/util/LruCache;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->b:Landroid/support/v4/util/LruCache;

    return-object v0
.end method

.method private c()V
    .locals 1

    .prologue
    .line 185
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->b:Landroid/support/v4/util/LruCache;

    if-eqz v0, :cond_0

    .line 186
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->b:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0}, Landroid/support/v4/util/LruCache;->evictAll()V

    .line 188
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/r;)Z
    .locals 1

    .prologue
    .line 41
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/r;->d:Z

    return v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/r;)I
    .locals 1

    .prologue
    .line 41
    iget v0, p0, Lcom/roidapp/photogrid/release/r;->e:I

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/r;)I
    .locals 1

    .prologue
    .line 41
    iget v0, p0, Lcom/roidapp/photogrid/release/r;->f:I

    return v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/r;)Lcom/roidapp/photogrid/release/a;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->g:Lcom/roidapp/photogrid/release/a;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/r;)Z
    .locals 1

    .prologue
    .line 41
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/r;->o:Z

    return v0
.end method


# virtual methods
.method protected final a()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/16 v2, 0x8

    .line 116
    iget v0, p0, Lcom/roidapp/photogrid/release/r;->j:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 117
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 118
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 122
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->n:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 131
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->m:Landroid/widget/GridView;

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->m:Landroid/widget/GridView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 133
    new-instance v0, Lcom/roidapp/photogrid/release/v;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/r;->i:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/release/v;-><init>(Lcom/roidapp/photogrid/release/r;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/r;->c:Lcom/roidapp/photogrid/release/v;

    .line 134
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->m:Landroid/widget/GridView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/r;->c:Lcom/roidapp/photogrid/release/v;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 139
    :cond_0
    return-void

    .line 120
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 123
    :cond_2
    iget v0, p0, Lcom/roidapp/photogrid/release/r;->j:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 124
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 125
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->n:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 126
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/r;->c()V

    goto :goto_1

    .line 128
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->n:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 129
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1
.end method

.method public final a(IILcom/roidapp/photogrid/release/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lcom/roidapp/photogrid/release/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 68
    iput p1, p0, Lcom/roidapp/photogrid/release/r;->e:I

    .line 69
    iput p2, p0, Lcom/roidapp/photogrid/release/r;->f:I

    .line 71
    iput-object p3, p0, Lcom/roidapp/photogrid/release/r;->g:Lcom/roidapp/photogrid/release/a;

    .line 72
    return-void
.end method

.method public final a(ILcom/roidapp/photogrid/release/GridImageView;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 191
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt p1, v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 215
    :cond_0
    :goto_0
    return-void

    .line 195
    :cond_1
    iget-object v3, p0, Lcom/roidapp/photogrid/release/r;->i:Ljava/util/ArrayList;

    monitor-enter v3

    .line 196
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/b;

    .line 197
    iget-boolean v4, v0, Lcom/roidapp/photogrid/release/b;->g:Z

    if-eqz v4, :cond_4

    .line 198
    iget-object v0, v0, Lcom/roidapp/photogrid/release/b;->e:Ljava/lang/String;

    .line 203
    :goto_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1358
    invoke-static {p2}, Lcom/roidapp/photogrid/release/r;->b(Lcom/roidapp/photogrid/release/GridImageView;)Lcom/roidapp/photogrid/release/u;

    move-result-object v3

    .line 1360
    if-eqz v3, :cond_3

    .line 1361
    invoke-static {v3}, Lcom/roidapp/photogrid/release/u;->a(Lcom/roidapp/photogrid/release/u;)Ljava/lang/String;

    move-result-object v4

    .line 1362
    if-eqz v4, :cond_2

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1363
    :cond_2
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/u;->cancel(Z)Z

    :cond_3
    move v0, v2

    .line 207
    :goto_2
    if-eqz v0, :cond_0

    .line 208
    new-instance v0, Lcom/roidapp/photogrid/release/u;

    invoke-direct {v0, p0, p2}, Lcom/roidapp/photogrid/release/u;-><init>(Lcom/roidapp/photogrid/release/r;Lcom/roidapp/photogrid/release/GridImageView;)V

    .line 209
    new-instance v3, Lcom/roidapp/photogrid/release/aa;

    invoke-direct {v3, p0, v0}, Lcom/roidapp/photogrid/release/aa;-><init>(Lcom/roidapp/photogrid/release/r;Lcom/roidapp/photogrid/release/u;)V

    .line 210
    invoke-virtual {p2, v3}, Lcom/roidapp/photogrid/release/GridImageView;->a(Landroid/graphics/drawable/Drawable;)V

    .line 212
    new-array v2, v2, [Ljava/lang/Integer;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/u;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    goto :goto_0

    .line 200
    :cond_4
    :try_start_1
    iget v0, v0, Lcom/roidapp/photogrid/release/b;->a:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 203
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_5
    move v0, v1

    .line 1366
    goto :goto_2
.end method

.method public final a(ILjava/util/ArrayList;Landroid/content/Context;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/b;",
            ">;",
            "Landroid/content/Context;",
            "Z)V"
        }
    .end annotation

    .prologue
    .line 75
    iput p1, p0, Lcom/roidapp/photogrid/release/r;->j:I

    .line 76
    iput-object p2, p0, Lcom/roidapp/photogrid/release/r;->i:Ljava/util/ArrayList;

    .line 78
    iput-object p3, p0, Lcom/roidapp/photogrid/release/r;->k:Landroid/content/Context;

    .line 79
    iput-boolean p4, p0, Lcom/roidapp/photogrid/release/r;->d:Z

    .line 80
    return-void
.end method

.method protected final a(Z)V
    .locals 1

    .prologue
    .line 142
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/r;->d:Z

    .line 143
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/r;->b(Z)V

    .line 144
    return-void
.end method

.method protected final b()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 532
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->m:Landroid/widget/GridView;

    if-eqz v0, :cond_0

    .line 533
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->m:Landroid/widget/GridView;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 534
    iput-object v1, p0, Lcom/roidapp/photogrid/release/r;->m:Landroid/widget/GridView;

    .line 536
    :cond_0
    iput-object v1, p0, Lcom/roidapp/photogrid/release/r;->c:Lcom/roidapp/photogrid/release/v;

    .line 537
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/r;->c()V

    .line 538
    return-void
.end method

.method protected final b(Z)V
    .locals 2

    .prologue
    .line 148
    if-eqz p1, :cond_1

    .line 149
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->m:Landroid/widget/GridView;

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->m:Landroid/widget/GridView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 151
    new-instance v0, Lcom/roidapp/photogrid/release/v;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/r;->i:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/release/v;-><init>(Lcom/roidapp/photogrid/release/r;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/r;->c:Lcom/roidapp/photogrid/release/v;

    .line 152
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->m:Landroid/widget/GridView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/r;->c:Lcom/roidapp/photogrid/release/v;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 160
    :cond_0
    :goto_0
    return-void

    .line 155
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->c:Lcom/roidapp/photogrid/release/v;

    if-eqz v0, :cond_0

    .line 156
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->c:Lcom/roidapp/photogrid/release/v;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/v;->notifyDataSetChanged()V

    goto :goto_0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 62
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/r;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 63
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 64
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    .line 84
    const v0, 0x7f030003

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 1090
    const v0, 0x7f0d0034

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/r;->l:Landroid/widget/TextView;

    .line 1091
    const v0, 0x7f0d0035

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/r;->m:Landroid/widget/GridView;

    .line 1092
    const v0, 0x7f0d0036

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/r;->n:Landroid/view/View;

    .line 1093
    const v0, 0x7f0d0037

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 1094
    new-instance v2, Lcom/roidapp/photogrid/release/s;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/s;-><init>(Lcom/roidapp/photogrid/release/r;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1102
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->b:Landroid/support/v4/util/LruCache;

    if-nez v0, :cond_0

    .line 1103
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v2

    long-to-int v0, v2

    .line 1104
    div-int/lit8 v0, v0, 0xa

    .line 1105
    new-instance v2, Lcom/roidapp/photogrid/release/t;

    invoke-direct {v2, p0, v0}, Lcom/roidapp/photogrid/release/t;-><init>(Lcom/roidapp/photogrid/release/r;I)V

    iput-object v2, p0, Lcom/roidapp/photogrid/release/r;->b:Landroid/support/v4/util/LruCache;

    .line 1112
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/r;->a()V

    .line 86
    return-object v1
.end method

.method public final onDestroy()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 522
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 523
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->m:Landroid/widget/GridView;

    if-eqz v0, :cond_0

    .line 524
    iget-object v0, p0, Lcom/roidapp/photogrid/release/r;->m:Landroid/widget/GridView;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 525
    iput-object v1, p0, Lcom/roidapp/photogrid/release/r;->m:Landroid/widget/GridView;

    .line 527
    :cond_0
    iput-object v1, p0, Lcom/roidapp/photogrid/release/r;->c:Lcom/roidapp/photogrid/release/v;

    .line 528
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/r;->c()V

    .line 529
    return-void
.end method
