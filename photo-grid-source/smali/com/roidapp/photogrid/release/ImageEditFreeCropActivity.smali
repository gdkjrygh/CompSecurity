.class public Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/roidapp/imagelib/filter/av;


# instance fields
.field private a:I

.field private b:I

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Ljava/lang/String;

.field private g:Lcom/roidapp/imagelib/freecrop/e;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, -0x1

    const/4 v0, 0x0

    .line 42
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 49
    iput v1, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->a:I

    .line 50
    iput v1, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->b:I

    .line 52
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->c:Z

    .line 53
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->d:Z

    .line 54
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->e:Z

    .line 66
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->i:Z

    .line 71
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 42
    .line 2187
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2188
    const-string v0, "FreeCropMode"

    invoke-virtual {p0, v0, v2}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 2189
    const-string v1, "freecrop_tech"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_0

    .line 2190
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "freecrop_tech"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2191
    new-instance v0, Landroid/app/Dialog;

    const v1, 0x7f0b001d

    invoke-direct {v0, p0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 2193
    const v1, 0x7f0300ee

    :try_start_0
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 2201
    const v1, 0x7f0d0279

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/release/ii;

    invoke-direct {v2, p0, v0}, Lcom/roidapp/photogrid/release/ii;-><init>(Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;Landroid/app/Dialog;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2207
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 2199
    :cond_0
    :goto_0
    return-void

    .line 2195
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0

    .line 2198
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method private a(Z)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 324
    .line 1388
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->u:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 1389
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 325
    :cond_0
    sput-boolean v4, Lcom/roidapp/photogrid/common/az;->w:Z

    .line 326
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->b:I

    if-nez v0, :cond_2

    .line 327
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x9

    if-eq v0, v1, :cond_1

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_4

    .line 328
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    new-array v1, v3, [Lcom/roidapp/photogrid/release/ig;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->au()Lcom/roidapp/photogrid/release/ig;

    move-result-object v2

    aput-object v2, v1, v4

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 329
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->a(Lcom/roidapp/photogrid/release/ig;)V

    .line 336
    :cond_2
    :goto_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ak()I

    .line 337
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 338
    const-class v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 340
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 341
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 342
    iget v2, v1, Landroid/graphics/Rect;->top:I

    if-lez v2, :cond_3

    .line 343
    iget v1, v1, Landroid/graphics/Rect;->top:I

    sput v1, Lcom/roidapp/photogrid/common/az;->g:I

    .line 345
    :cond_3
    if-eqz p1, :cond_5

    .line 346
    const-string v1, "freecropImageIndex"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 350
    :goto_1
    const-string v1, "isfreeCrop"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 351
    const-string v1, "isInterFilter"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 352
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->startActivity(Landroid/content/Intent;)V

    .line 353
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->finish()V

    .line 354
    return-void

    .line 331
    :cond_4
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->O()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 332
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->b([Lcom/roidapp/photogrid/release/ig;)V

    goto :goto_0

    .line 348
    :cond_5
    const-string v1, "freecropImageIndex"

    iget v2, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->a:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_1
.end method

.method private d()V
    .locals 2

    .prologue
    .line 181
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 182
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->startActivity(Landroid/content/Intent;)V

    .line 183
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->finish()V

    .line 184
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 250
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 251
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->d:Z

    .line 252
    return-void
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 307
    return-void
.end method

.method public final a(ILjava/lang/String;Lcom/roidapp/imagelib/b/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;I)V
    .locals 0

    .prologue
    .line 301
    return-void
.end method

.method public final a(Landroid/net/Uri;Ljava/lang/String;Lcom/roidapp/imagelib/b/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 241
    if-eqz p1, :cond_0

    .line 242
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 1233
    invoke-static {}, Lcom/roidapp/photogrid/release/qx;->a()Lcom/roidapp/photogrid/release/qx;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/qx;->a(Ljava/lang/String;)V

    .line 1234
    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->a(Z)V

    .line 243
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->h:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 244
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->d:Z

    .line 245
    return-void
.end method

.method public final a(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 265
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->h:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 268
    const-class v0, Ljava/lang/OutOfMemoryError;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 269
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07020f

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 293
    :cond_0
    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->a(Z)V

    .line 294
    return-void

    .line 270
    :cond_1
    const-class v0, Ljava/io/IOException;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 271
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 272
    if-eqz v0, :cond_0

    .line 273
    const-string v1, "702"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 274
    invoke-static {p0}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 275
    :cond_2
    const-string v1, "700"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 277
    invoke-static {p0, p2}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 278
    :cond_3
    const-string v1, "701"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 280
    invoke-static {p0, p2}, Lcom/roidapp/photogrid/common/y;->b(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 281
    :cond_4
    const-string v1, "703"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 282
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07028d

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 284
    :cond_5
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 288
    :cond_6
    if-eqz p1, :cond_0

    .line 289
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 257
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->h:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 258
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->d:Z

    .line 259
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07017c

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 260
    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 137
    const-string v0, "ClipPage"

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 358
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->d:Z

    if-eqz v0, :cond_1

    .line 379
    :cond_0
    :goto_0
    return-void

    .line 360
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->e:Z

    if-nez v0, :cond_0

    .line 362
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 364
    :sswitch_0
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->a(Z)V

    goto :goto_0

    .line 367
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->g:Lcom/roidapp/imagelib/freecrop/e;

    if-eqz v0, :cond_0

    .line 368
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->d:Z

    .line 369
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->e:Z

    .line 370
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->g:Lcom/roidapp/imagelib/freecrop/e;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/freecrop/e;->a()Z

    .line 371
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->h:Landroid/widget/RelativeLayout;

    const v1, 0x7f0d01ac

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 372
    const v1, 0x7f07028a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 373
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 362
    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0d0028 -> :sswitch_0
        0x7f0d003a -> :sswitch_1
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v5, -0x1

    const/4 v4, 0x0

    .line 77
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 79
    invoke-static {p1}, Lcom/roidapp/photogrid/common/an;->b(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 80
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "ImageEditFreeCropActivity"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 81
    if-eqz v0, :cond_0

    .line 82
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 85
    :cond_0
    const-string v0, "160"

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 86
    const-string v0, "ImageEditFreeCropActivity"

    const-string v1, "The process has been killed, return to home."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    :cond_1
    :goto_0
    return-void

    .line 89
    :cond_2
    const-string v0, "ImageEditFreeCropActivity/onCreate"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 93
    const v0, 0x7f0300d3

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    :goto_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->c:Z

    if-nez v0, :cond_1

    .line 101
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "freeSingleCrop"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->i:Z

    .line 103
    const-string v0, "FreeCropMode"

    invoke-virtual {p0, v0, v4}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 104
    const-string v1, "entry_mode"

    invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->b:I

    .line 106
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->b:I

    if-ne v0, v5, :cond_3

    .line 107
    const-string v0, "ImageEditFreeCropActivity"

    const-string v1, "error Entry!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->d()V

    goto :goto_0

    .line 95
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 96
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->c:Z

    .line 97
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto :goto_1

    .line 1141
    :cond_3
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 1143
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v1

    .line 1144
    if-eqz v1, :cond_4

    array-length v2, v1

    if-nez v2, :cond_5

    .line 1145
    :cond_4
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->d()V

    .line 1212
    :goto_2
    const v0, 0x7f0d0028

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1213
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1214
    invoke-virtual {v0}, Landroid/widget/TextView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/release/ij;

    invoke-direct {v2, p0, v0}, Lcom/roidapp/photogrid/release/ij;-><init>(Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;Landroid/widget/TextView;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 1222
    const v1, 0x7f07005a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1224
    const v0, 0x7f0d003a

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1225
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1227
    const v0, 0x7f0d040d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->h:Landroid/widget/RelativeLayout;

    .line 1229
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto/16 :goto_0

    .line 1148
    :cond_5
    iget v2, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->b:I

    if-nez v2, :cond_6

    .line 1151
    aget-object v1, v1, v4

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ig;->d()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->f:Ljava/lang/String;

    .line 1163
    :goto_3
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1164
    const-string v2, "edit_image_path"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->f:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1166
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    const-string v3, "ImageEditFreeCropActivity"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    if-nez v2, :cond_9

    .line 1167
    new-instance v2, Lcom/roidapp/imagelib/freecrop/e;

    invoke-direct {v2}, Lcom/roidapp/imagelib/freecrop/e;-><init>()V

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->g:Lcom/roidapp/imagelib/freecrop/e;

    .line 1168
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->g:Lcom/roidapp/imagelib/freecrop/e;

    invoke-virtual {v2, v1}, Lcom/roidapp/imagelib/freecrop/e;->setArguments(Landroid/os/Bundle;)V

    .line 1169
    const v1, 0x7f0d005e

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->g:Lcom/roidapp/imagelib/freecrop/e;

    const-string v3, "ImageEditFreeCropActivity"

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 1170
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto :goto_2

    .line 1153
    :cond_6
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "edit_image_index"

    invoke-virtual {v2, v3, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->a:I

    .line 1154
    iget v2, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->a:I

    if-ltz v2, :cond_7

    iget v2, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->a:I

    array-length v3, v1

    if-lt v2, v3, :cond_8

    .line 1155
    :cond_7
    const-string v0, "ImageEditFreeCropActivity"

    const-string v1, "get edit_image_index failed."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1156
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->d()V

    goto/16 :goto_2

    .line 1160
    :cond_8
    iget v2, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->a:I

    aget-object v1, v1, v2

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ig;->d()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->f:Ljava/lang/String;

    goto :goto_3

    .line 1172
    :cond_9
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "ImageEditFreeCropActivity"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/freecrop/e;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->g:Lcom/roidapp/imagelib/freecrop/e;

    goto/16 :goto_2
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 311
    const/4 v1, 0x4

    if-ne p1, v1, :cond_1

    .line 312
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->d:Z

    if-ne v1, v0, :cond_0

    .line 319
    :goto_0
    return v0

    .line 315
    :cond_0
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->a(Z)V

    goto :goto_0

    .line 319
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/release/ParentActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 121
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 122
    const-string v0, "entry_mode"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 123
    const-string v0, "entry_mode"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->b:I

    .line 126
    :cond_0
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 130
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 131
    invoke-static {p1}, Lcom/roidapp/photogrid/common/an;->a(Landroid/os/Bundle;)V

    .line 132
    const-string v0, "entry_mode"

    iget v1, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->b:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 133
    return-void
.end method

.method public final x()V
    .locals 1

    .prologue
    .line 384
    const-string v0, "freecrop"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;->t:Ljava/lang/String;

    .line 385
    return-void
.end method
