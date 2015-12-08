.class public abstract Lcom/roidapp/cloudlib/t;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field protected a:I

.field protected b:I

.field public c:Landroid/widget/GridView;

.field protected d:Lcom/roidapp/cloudlib/ad;

.field protected e:I

.field protected f:Landroid/app/AlertDialog;

.field protected g:Lcom/roidapp/baselib/b/k;

.field protected h:Z

.field protected i:Lcom/roidapp/baselib/b/p;

.field protected j:Lcom/roidapp/cloudlib/ae;

.field protected k:Lcom/roidapp/cloudlib/ah;

.field protected l:Lcom/roidapp/cloudlib/af;

.field protected m:Landroid/widget/TextView;

.field protected final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/bumptech/glide/g/c;",
            ">;"
        }
    .end annotation
.end field

.field private o:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 55
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 64
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/cloudlib/t;->e:I

    .line 67
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/t;->h:Z

    .line 72
    iput-object v1, p0, Lcom/roidapp/cloudlib/t;->k:Lcom/roidapp/cloudlib/ah;

    .line 75
    iput-object v1, p0, Lcom/roidapp/cloudlib/t;->l:Lcom/roidapp/cloudlib/af;

    .line 77
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/t;->n:Ljava/util/List;

    .line 578
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/t;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->o:Landroid/widget/ImageView;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 345
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/t;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 346
    if-nez v0, :cond_0

    .line 427
    :goto_0
    return-void

    .line 348
    :cond_0
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/t;->h:Z

    if-eqz v0, :cond_1

    .line 349
    const-string v0, "BaseFragment"

    const-string v1, "showDownloadDialog, but one is exist."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 353
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/t;->h:Z

    .line 354
    const-string v0, "BaseFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "begin to download "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 355
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_3

    .line 357
    :cond_2
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/t;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 358
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    .line 359
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    const v1, 0x1080055

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setIcon(I)V

    .line 360
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/t;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 361
    sget v1, Lcom/roidapp/cloudlib/as;->a:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 362
    iget-object v1, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->setView(Landroid/view/View;)V

    .line 363
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setCancelable(Z)V

    .line 364
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 367
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    sget v1, Lcom/roidapp/cloudlib/ar;->q:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    .line 369
    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 370
    iget-object v1, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    sget v2, Lcom/roidapp/cloudlib/ar;->t:I

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/roidapp/cloudlib/t;->m:Landroid/widget/TextView;

    .line 372
    iget-object v1, p0, Lcom/roidapp/cloudlib/t;->i:Lcom/roidapp/baselib/b/p;

    if-nez v1, :cond_4

    .line 373
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/t;->c()Lcom/roidapp/baselib/b/p;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/cloudlib/t;->i:Lcom/roidapp/baselib/b/p;

    .line 375
    :cond_4
    iget-object v1, p0, Lcom/roidapp/cloudlib/t;->g:Lcom/roidapp/baselib/b/k;

    iget-object v2, p0, Lcom/roidapp/cloudlib/t;->o:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/roidapp/cloudlib/t;->i:Lcom/roidapp/baselib/b/p;

    invoke-virtual {v1, p1, v2, v0, v3}, Lcom/roidapp/baselib/b/k;->a(Ljava/lang/Object;Landroid/widget/ImageView;Landroid/widget/ProgressBar;Lcom/roidapp/baselib/b/p;)V

    .line 377
    iget-object v1, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    sget v2, Lcom/roidapp/cloudlib/ar;->r:I

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 379
    new-instance v2, Lcom/roidapp/cloudlib/z;

    invoke-direct {v2, p0, p1, v0}, Lcom/roidapp/cloudlib/z;-><init>(Lcom/roidapp/cloudlib/t;Ljava/lang/String;Landroid/widget/ProgressBar;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 402
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 405
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    sget v1, Lcom/roidapp/cloudlib/ar;->o:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 407
    new-instance v1, Lcom/roidapp/cloudlib/aa;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/cloudlib/aa;-><init>(Lcom/roidapp/cloudlib/t;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 418
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    new-instance v1, Lcom/roidapp/cloudlib/ab;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/ab;-><init>(Lcom/roidapp/cloudlib/t;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    goto/16 :goto_0
.end method


# virtual methods
.method protected a()Landroid/widget/AbsListView$OnScrollListener;
    .locals 1

    .prologue
    .line 98
    new-instance v0, Lcom/roidapp/cloudlib/u;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/u;-><init>(Lcom/roidapp/cloudlib/t;)V

    return-object v0
.end method

.method protected final a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/e;
    .locals 1

    .prologue
    .line 189
    new-instance v0, Lcom/roidapp/cloudlib/x;

    invoke-direct {v0, p0, p1}, Lcom/roidapp/cloudlib/x;-><init>(Lcom/roidapp/cloudlib/t;Landroid/widget/ImageView;)V

    return-object v0
.end method

.method protected final a(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 89
    sget v0, Lcom/roidapp/cloudlib/ar;->p:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/t;->o:Landroid/widget/ImageView;

    .line 90
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/ae;)V
    .locals 0

    .prologue
    .line 302
    iput-object p1, p0, Lcom/roidapp/cloudlib/t;->j:Lcom/roidapp/cloudlib/ae;

    .line 303
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/af;)V
    .locals 0

    .prologue
    .line 298
    iput-object p1, p0, Lcom/roidapp/cloudlib/t;->l:Lcom/roidapp/cloudlib/af;

    .line 299
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/ah;)V
    .locals 0

    .prologue
    .line 465
    iput-object p1, p0, Lcom/roidapp/cloudlib/t;->k:Lcom/roidapp/cloudlib/ah;

    .line 466
    return-void
.end method

.method public a(Ljava/lang/Exception;)V
    .locals 2

    .prologue
    .line 442
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->k:Lcom/roidapp/cloudlib/ah;

    if-eqz v0, :cond_1

    .line 443
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/net/UnknownHostException;

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/io/FileNotFoundException;

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/net/SocketTimeoutException;

    if-ne v0, v1, :cond_1

    .line 445
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->k:Lcom/roidapp/cloudlib/ah;

    new-instance v1, Lcom/roidapp/cloudlib/ac;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/ac;-><init>(Lcom/roidapp/cloudlib/t;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/ah;->post(Ljava/lang/Runnable;)Z

    .line 457
    :cond_1
    return-void
.end method

.method protected a(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 307
    instance-of v0, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;

    if-eqz v0, :cond_1

    .line 308
    invoke-static {p1}, Lcom/roidapp/baselib/d/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/d/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 313
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/baselib/d/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 315
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 316
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_4

    .line 318
    :try_start_0
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 319
    const/4 v3, 0x1

    iput-boolean v3, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 320
    invoke-static {v0, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 321
    iget v3, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-lez v3, :cond_2

    iget v2, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-lez v2, :cond_2

    .line 322
    iget-object v2, p0, Lcom/roidapp/cloudlib/t;->j:Lcom/roidapp/cloudlib/ae;

    if-eqz v2, :cond_0

    .line 323
    iget-object v2, p0, Lcom/roidapp/cloudlib/t;->j:Lcom/roidapp/cloudlib/ae;

    invoke-interface {v2, v0}, Lcom/roidapp/cloudlib/ae;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 341
    :cond_0
    :goto_1
    return-void

    .line 311
    :cond_1
    invoke-static {p1}, Lcom/roidapp/baselib/d/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 327
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->o:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    .line 328
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->o:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 330
    :cond_3
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 331
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/t;->c(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 334
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 335
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 339
    :cond_4
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/t;->c(Ljava/lang/String;)V

    goto :goto_1
.end method

.method protected b()Landroid/widget/AdapterView$OnItemClickListener;
    .locals 1

    .prologue
    .line 122
    new-instance v0, Lcom/roidapp/cloudlib/v;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/v;-><init>(Lcom/roidapp/cloudlib/t;)V

    return-object v0
.end method

.method protected final b(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 145
    sget v0, Lcom/roidapp/cloudlib/ar;->bK:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/t;->c:Landroid/widget/GridView;

    .line 147
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->c:Landroid/widget/GridView;

    iget-object v1, p0, Lcom/roidapp/cloudlib/t;->d:Lcom/roidapp/cloudlib/ad;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 149
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->c:Landroid/widget/GridView;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/t;->a()Landroid/widget/AbsListView$OnScrollListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 151
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->c:Landroid/widget/GridView;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/t;->b()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 157
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->c:Landroid/widget/GridView;

    invoke-virtual {v0}, Landroid/widget/GridView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/roidapp/cloudlib/w;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/w;-><init>(Lcom/roidapp/cloudlib/t;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 172
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 430
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 431
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    sget v1, Lcom/roidapp/cloudlib/ar;->q:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 432
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    sget v1, Lcom/roidapp/cloudlib/ar;->r:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 433
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    sget v1, Lcom/roidapp/cloudlib/ar;->s:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 434
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 435
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->o:Landroid/widget/ImageView;

    invoke-static {v0}, Lcom/roidapp/baselib/b/k;->a(Landroid/widget/ImageView;)V

    .line 436
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->o:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 438
    :cond_0
    return-void
.end method

.method protected c()Lcom/roidapp/baselib/b/p;
    .locals 2

    .prologue
    .line 242
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    .line 243
    new-instance v1, Lcom/roidapp/cloudlib/y;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/cloudlib/y;-><init>(Lcom/roidapp/cloudlib/t;Ljava/lang/String;)V

    return-object v1
.end method

.method public abstract d()V
.end method

.method public final e()Lcom/roidapp/cloudlib/ah;
    .locals 1

    .prologue
    .line 469
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->k:Lcom/roidapp/cloudlib/ah;

    return-object v0
.end method

.method public final f()I
    .locals 1

    .prologue
    .line 477
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public g()V
    .locals 0

    .prologue
    .line 567
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 81
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 83
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/t;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/ap;->g:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/t;->b:I

    .line 84
    new-instance v0, Lcom/roidapp/baselib/b/k;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/t;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/baselib/d/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/roidapp/baselib/b/k;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/t;->g:Lcom/roidapp/baselib/b/k;

    .line 85
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->g:Lcom/roidapp/baselib/b/k;

    instance-of v1, p0, Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/b/k;->a(Z)V

    .line 86
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 176
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->o:Landroid/widget/ImageView;

    invoke-static {v0}, Lcom/roidapp/baselib/b/k;->a(Landroid/widget/ImageView;)V

    .line 177
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->c:Landroid/widget/GridView;

    if-eqz v0, :cond_0

    .line 178
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->c:Landroid/widget/GridView;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 179
    iput-object v1, p0, Lcom/roidapp/cloudlib/t;->d:Lcom/roidapp/cloudlib/ad;

    .line 181
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 182
    iget-object v0, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 183
    iput-object v1, p0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    .line 185
    :cond_1
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 186
    return-void
.end method
