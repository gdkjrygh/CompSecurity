.class public Lcom/roidapp/cloudlib/sns/h/a;
.super Landroid/support/v4/app/DialogFragment;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Lcom/roidapp/cloudlib/sns/b/x;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Landroid/widget/EditText;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/view/View;

.field private h:Landroid/view/View;

.field private i:Landroid/view/View;

.field private j:Landroid/widget/ImageView;

.field private k:Landroid/content/DialogInterface$OnDismissListener;

.field private l:Landroid/os/Handler;

.field private m:Landroid/net/Uri;

.field private n:Landroid/os/Bundle;

.field private o:Ljava/lang/String;

.field private p:Landroid/widget/EditText;

.field private q:[Ljava/lang/String;

.field private r:Lcom/roidapp/baselib/view/r;

.field private s:Z

.field private t:Ljava/util/regex/Pattern;

.field private u:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 92
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 88
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->s:Z

    .line 90
    const-string v0, "[^0-9a-zA-Z]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->t:Ljava/util/regex/Pattern;

    .line 539
    new-instance v0, Lcom/roidapp/cloudlib/sns/h/e;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/h/e;-><init>(Lcom/roidapp/cloudlib/sns/h/a;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->u:Ljava/lang/Runnable;

    .line 93
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/h/a;->setStyle(II)V

    .line 94
    return-void
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 466
    if-nez p1, :cond_0

    const/4 v0, 0x0

    .line 467
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->t:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private a(IZ)V
    .locals 6

    .prologue
    const-wide/16 v4, 0xbb8

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 475
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 476
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->h:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->g:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->f:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 477
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->h:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 478
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->h:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 480
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 481
    if-eqz p2, :cond_2

    .line 482
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->l:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 483
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Application;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->l:Landroid/os/Handler;

    .line 484
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->l:Landroid/os/Handler;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/a;->u:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 485
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->h:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setClickable(Z)V

    .line 486
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->l:Landroid/os/Handler;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/a;->u:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 487
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->g:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 493
    :goto_0
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 494
    invoke-virtual {v0, v3}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 495
    invoke-virtual {v0, v4, v5}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 496
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/a;->h:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 500
    :cond_1
    return-void

    .line 489
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->h:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setClickable(Z)V

    .line 490
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/h/a;)V
    .locals 4

    .prologue
    .line 1503
    invoke-static {}, Lcom/roidapp/baselib/d/a;->c()Ljava/lang/String;

    move-result-object v0

    .line 1504
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    .line 1506
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v2

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v2, v3, v0, v1}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    .line 1507
    if-eqz v2, :cond_0

    .line 1508
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->m:Landroid/net/Uri;

    .line 1511
    const/16 v0, 0x86

    :try_start_0
    invoke-virtual {p0, v2, v0}, Lcom/roidapp/cloudlib/sns/h/a;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1514
    :cond_0
    :goto_0
    return-void

    .line 1513
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/h/a;IZ)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/h/a;->a(IZ)V

    return-void
.end method

.method private a(Z)V
    .locals 3

    .prologue
    .line 326
    if-eqz p1, :cond_0

    .line 327
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->e:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/ao;->b:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 331
    :goto_0
    return-void

    .line 329
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->e:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/ao;->c:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0
.end method

.method private b()V
    .locals 3

    .prologue
    .line 178
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->o:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 179
    invoke-static {p0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/a;->a:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/b;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/a;->a()Lcom/bumptech/glide/a;

    move-result-object v0

    new-instance v1, Lcom/roidapp/cloudlib/sns/e/a;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/a;->j:Landroid/widget/ImageView;

    invoke-direct {v1, v2}, Lcom/roidapp/cloudlib/sns/e/a;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    .line 194
    :goto_0
    return-void

    .line 186
    :cond_0
    invoke-static {p0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/a;->a:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v0

    invoke-static {p0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/a;->o:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/b;->a(Lcom/bumptech/glide/a;)Lcom/bumptech/glide/a;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/a;->a()Lcom/bumptech/glide/a;

    move-result-object v0

    new-instance v1, Lcom/roidapp/cloudlib/sns/e/a;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/a;->j:Landroid/widget/ImageView;

    invoke-direct {v1, v2}, Lcom/roidapp/cloudlib/sns/e/a;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/h/a;)V
    .locals 2

    .prologue
    .line 1519
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1520
    const-string v1, "image/*"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1522
    const/16 v1, 0xb96

    :try_start_0
    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/h/a;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1525
    :goto_0
    return-void

    .line 1524
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->printStackTrace()V

    goto :goto_0
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 529
    if-nez p1, :cond_0

    .line 537
    :goto_0
    return-void

    .line 532
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/roidapp/cloudlib/al;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 533
    const/16 v1, 0x154e

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/h/a;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 535
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/sns/h/a;)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->q:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/sns/h/a;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->p:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/cloudlib/sns/h/a;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/cloudlib/sns/h/a;)Landroid/view/View;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->h:Landroid/view/View;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/cloudlib/sns/h/a;)Landroid/view/View;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->i:Landroid/view/View;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/cloudlib/sns/h/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->o:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/cloudlib/sns/h/a;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/h/a;->b()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 101
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->s:Z

    .line 102
    return-void
.end method

.method public final a(Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 0

    .prologue
    .line 97
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/a;->k:Landroid/content/DialogInterface$OnDismissListener;

    .line 98
    return-void
.end method

.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 6

    .prologue
    const/16 v5, 0x1e

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 430
    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    if-eqz v0, :cond_2

    .line 432
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 436
    invoke-direct {p0, v3}, Lcom/roidapp/cloudlib/sns/h/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 437
    invoke-static {v3, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 438
    sget v3, Lcom/roidapp/cloudlib/at;->bj:I

    invoke-direct {p0, v3, v2}, Lcom/roidapp/cloudlib/sns/h/a;->a(IZ)V

    move-object v3, v0

    move v0, v1

    .line 444
    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-le v4, v5, :cond_0

    .line 445
    sget v0, Lcom/roidapp/cloudlib/at;->bm:I

    invoke-direct {p0, v0, v2}, Lcom/roidapp/cloudlib/sns/h/a;->a(IZ)V

    .line 446
    invoke-virtual {v3, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    move v0, v1

    .line 450
    :cond_0
    if-eqz v0, :cond_1

    .line 455
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 456
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setSelection(I)V

    .line 461
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_3

    :goto_1
    invoke-direct {p0, v1}, Lcom/roidapp/cloudlib/sns/h/a;->a(Z)V

    .line 463
    :cond_2
    return-void

    :cond_3
    move v1, v2

    .line 461
    goto :goto_1

    :cond_4
    move v0, v2

    goto :goto_0
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 422
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 409
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 410
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/a;->n:Landroid/os/Bundle;

    .line 411
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 335
    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    .line 336
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/DialogFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 405
    :cond_0
    :goto_0
    return-void

    .line 339
    :cond_1
    sparse-switch p1, :sswitch_data_0

    .line 403
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/DialogFragment;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0

    .line 341
    :sswitch_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->m:Landroid/net/Uri;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->n:Landroid/os/Bundle;

    const-string v1, "PATH"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 342
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->n:Landroid/os/Bundle;

    const-string v1, "PATH"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->m:Landroid/net/Uri;

    .line 344
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->m:Landroid/net/Uri;

    if-eqz v0, :cond_0

    .line 345
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->m:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 346
    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/h/a;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 351
    :sswitch_1
    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 352
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Landroid/net/Uri;Z)[Ljava/lang/String;

    move-result-object v0

    .line 354
    if-eqz v0, :cond_0

    array-length v1, v0

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 361
    aget-object v1, v0, v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 362
    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 370
    :pswitch_1
    sget v0, Lcom/roidapp/cloudlib/at;->bs:I

    invoke-direct {p0, v0, v3}, Lcom/roidapp/cloudlib/sns/h/a;->a(IZ)V

    goto :goto_0

    .line 364
    :pswitch_2
    sget v0, Lcom/roidapp/cloudlib/at;->bt:I

    invoke-direct {p0, v0, v3}, Lcom/roidapp/cloudlib/sns/h/a;->a(IZ)V

    goto :goto_0

    .line 367
    :pswitch_3
    sget v0, Lcom/roidapp/cloudlib/at;->a:I

    invoke-direct {p0, v0, v3}, Lcom/roidapp/cloudlib/sns/h/a;->a(IZ)V

    goto :goto_0

    .line 374
    :pswitch_4
    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/h/a;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 383
    :sswitch_2
    if-eqz p3, :cond_0

    .line 384
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 385
    if-eqz v0, :cond_0

    .line 387
    const-string v1, "crop_path"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 388
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->o:Ljava/lang/String;

    .line 389
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 391
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 392
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->i:Landroid/view/View;

    if-eqz v0, :cond_3

    .line 393
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->i:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 395
    :cond_3
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/a;->a:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lcom/roidapp/cloudlib/sns/h/f;

    invoke-direct {v4, p0}, Lcom/roidapp/cloudlib/sns/h/f;-><init>(Lcom/roidapp/cloudlib/sns/h/a;)V

    invoke-static {v0, v2, v3, v1, v4}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;JLjava/lang/String;Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 339
    :sswitch_data_0
    .sparse-switch
        0x86 -> :sswitch_0
        0xb96 -> :sswitch_1
        0x154e -> :sswitch_2
    .end sparse-switch

    .line 362
    :pswitch_data_0
    .packed-switch -0x3
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method public onClick(Landroid/view/View;)V
    .locals 8

    .prologue
    const/4 v0, 0x0

    const/4 v5, 0x1

    const/4 v2, 0x0

    .line 222
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->isAdded()Z

    move-result v1

    if-nez v1, :cond_1

    .line 323
    :cond_0
    :goto_0
    return-void

    .line 223
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    .line 224
    sget v3, Lcom/roidapp/cloudlib/ar;->b:I

    if-ne v1, v3, :cond_2

    .line 225
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/widget/EditText;)Z

    .line 226
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->dismiss()V

    goto :goto_0

    .line 227
    :cond_2
    sget v3, Lcom/roidapp/cloudlib/ar;->bH:I

    if-ne v1, v3, :cond_a

    .line 228
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/a;->i:Landroid/view/View;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/a;->a:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    if-eqz v1, :cond_0

    .line 229
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/widget/EditText;)Z

    .line 231
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 233
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 236
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 237
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 238
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 239
    if-eqz v0, :cond_3

    .line 240
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    invoke-virtual {v0, v1, v5}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 242
    :cond_3
    sget v0, Lcom/roidapp/cloudlib/at;->bk:I

    invoke-direct {p0, v0, v2}, Lcom/roidapp/cloudlib/sns/h/a;->a(IZ)V

    goto :goto_0

    .line 244
    :cond_4
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/a;->b:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 245
    const-string v1, "nickname"

    invoke-virtual {v4, v1, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    :cond_5
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/a;->p:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    move v1, v2

    .line 250
    :goto_1
    iget-object v6, p0, Lcom/roidapp/cloudlib/sns/h/a;->q:[Ljava/lang/String;

    array-length v6, v6

    if-ge v1, v6, :cond_7

    .line 251
    iget-object v6, p0, Lcom/roidapp/cloudlib/sns/h/a;->q:[Ljava/lang/String;

    aget-object v6, v6, v1

    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 252
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 250
    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 257
    :cond_7
    if-eqz v0, :cond_8

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 258
    const-string v1, "gender"

    invoke-virtual {v4, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    :cond_8
    invoke-virtual {v4}, Landroid/os/Bundle;->size()I

    move-result v1

    if-lez v1, :cond_9

    .line 262
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/a;->i:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 263
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    .line 264
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/a;->a:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v6, v2, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    new-instance v2, Lcom/roidapp/cloudlib/sns/h/g;

    invoke-direct {v2, p0, v3, v0}, Lcom/roidapp/cloudlib/sns/h/g;-><init>(Lcom/roidapp/cloudlib/sns/h/a;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1, v6, v7, v4, v2}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JLandroid/os/Bundle;Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 267
    :cond_9
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->dismiss()V

    goto/16 :goto_0

    .line 273
    :cond_a
    sget v3, Lcom/roidapp/cloudlib/ar;->L:I

    if-ne v1, v3, :cond_b

    .line 274
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/widget/EditText;)Z

    .line 276
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V

    goto/16 :goto_0

    .line 277
    :cond_b
    sget v0, Lcom/roidapp/cloudlib/ar;->bl:I

    if-ne v1, v0, :cond_c

    .line 279
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/roidapp/cloudlib/at;->z:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    sget v3, Lcom/roidapp/cloudlib/at;->x:I

    invoke-virtual {p0, v3}, Lcom/roidapp/cloudlib/sns/h/a;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    sget v2, Lcom/roidapp/cloudlib/at;->y:I

    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/sns/h/a;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v5

    new-instance v2, Lcom/roidapp/cloudlib/sns/h/b;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/sns/h/b;-><init>(Lcom/roidapp/cloudlib/sns/h/a;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto/16 :goto_0

    .line 294
    :cond_c
    sget v0, Lcom/roidapp/cloudlib/ar;->do:I

    if-ne v1, v0, :cond_0

    .line 296
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->isFocusable()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 297
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setFocusableInTouchMode(Z)V

    .line 298
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->clearFocus()V

    .line 299
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/widget/EditText;)Z

    .line 301
    :cond_d
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->r:Lcom/roidapp/baselib/view/r;

    if-nez v0, :cond_e

    .line 302
    new-instance v0, Lcom/roidapp/baselib/view/r;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/h/a;->q:[Ljava/lang/String;

    invoke-direct {v0, v1, v3}, Lcom/roidapp/baselib/view/r;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->r:Lcom/roidapp/baselib/view/r;

    .line 303
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->r:Lcom/roidapp/baselib/view/r;

    new-instance v1, Lcom/roidapp/cloudlib/sns/h/c;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/h/c;-><init>(Lcom/roidapp/cloudlib/sns/h/a;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/r;->a(Lcom/roidapp/baselib/view/u;)V

    .line 310
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->r:Lcom/roidapp/baselib/view/r;

    new-instance v1, Lcom/roidapp/cloudlib/sns/h/d;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/h/d;-><init>(Lcom/roidapp/cloudlib/sns/h/a;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/r;->a(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 321
    :cond_e
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->r:Lcom/roidapp/baselib/view/r;

    invoke-virtual {v0, p1, v2}, Lcom/roidapp/baselib/view/r;->a(Landroid/view/View;I)V

    goto/16 :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 106
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 107
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 108
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "need login."

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 109
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->dismiss()V

    .line 116
    :goto_0
    return-void

    .line 112
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->a:Lcom/roidapp/cloudlib/sns/b/x;

    .line 113
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->a:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->b:Ljava/lang/String;

    .line 114
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->a:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->c:Ljava/lang/String;

    .line 115
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/a;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/an;->a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->q:[Ljava/lang/String;

    goto :goto_0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/16 v5, 0x8

    const/4 v2, 0x0

    .line 120
    sget v0, Lcom/roidapp/cloudlib/as;->T:I

    invoke-virtual {p1, v0, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 121
    sget v0, Lcom/roidapp/cloudlib/ar;->dq:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    .line 122
    sget v0, Lcom/roidapp/cloudlib/ar;->do:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->p:Landroid/widget/EditText;

    .line 123
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->p:Landroid/widget/EditText;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 124
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->a:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 125
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->a:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->d:Ljava/lang/String;

    const-string v4, "1"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 126
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->p:Landroid/widget/EditText;

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/h/a;->q:[Ljava/lang/String;

    aget-object v4, v4, v1

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 135
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->p:Landroid/widget/EditText;

    invoke-virtual {v0, p0}, Landroid/widget/EditText;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 137
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->b:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/h/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/h/a;->b:Ljava/lang/String;

    invoke-static {v0, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 139
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/h/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 140
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 141
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/h/a;->b:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setSelection(I)V

    .line 144
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    invoke-virtual {v0, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 146
    sget v0, Lcom/roidapp/cloudlib/ar;->L:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->h:Landroid/view/View;

    .line 148
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->h:Landroid/view/View;

    sget v4, Lcom/roidapp/cloudlib/ar;->cN:I

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->f:Landroid/widget/TextView;

    .line 149
    sget v0, Lcom/roidapp/cloudlib/ar;->bH:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->e:Landroid/widget/TextView;

    .line 150
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->length()I

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    :goto_2
    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/h/a;->a(Z)V

    .line 152
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->h:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->bT:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->g:Landroid/view/View;

    .line 154
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->h:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 155
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->h:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 157
    sget v0, Lcom/roidapp/cloudlib/ar;->ck:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->i:Landroid/view/View;

    .line 158
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->i:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->l:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 160
    sget v0, Lcom/roidapp/cloudlib/ar;->bl:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->j:Landroid/widget/ImageView;

    .line 161
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 163
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/h/a;->b()V

    .line 166
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->s:Z

    if-eqz v0, :cond_5

    .line 167
    sget v0, Lcom/roidapp/cloudlib/ar;->b:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 173
    :goto_3
    sget v0, Lcom/roidapp/cloudlib/ar;->bH:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 174
    return-object v3

    .line 127
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->a:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->d:Ljava/lang/String;

    const-string v4, "0"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->p:Landroid/widget/EditText;

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/h/a;->q:[Ljava/lang/String;

    aget-object v4, v4, v2

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 143
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    const-string v4, ""

    invoke-virtual {v0, v4}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_4
    move v0, v2

    .line 150
    goto :goto_2

    .line 169
    :cond_5
    sget v0, Lcom/roidapp/cloudlib/ar;->b:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 170
    sget v0, Lcom/roidapp/cloudlib/ar;->bt:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 209
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onDestroy()V

    .line 210
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->k:Landroid/content/DialogInterface$OnDismissListener;

    .line 211
    invoke-static {}, Lcom/roidapp/cloudlib/sns/u;->a()Lcom/roidapp/cloudlib/sns/u;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/u;->a(Ljava/lang/Object;)V

    .line 212
    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 198
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onDestroyView()V

    .line 199
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->d:Landroid/widget/EditText;

    .line 200
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->i:Landroid/view/View;

    .line 201
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->f:Landroid/widget/TextView;

    .line 202
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->h:Landroid/view/View;

    .line 203
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->g:Landroid/view/View;

    .line 204
    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->e:Landroid/widget/TextView;

    .line 205
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 216
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 217
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->k:Landroid/content/DialogInterface$OnDismissListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->k:Landroid/content/DialogInterface$OnDismissListener;

    invoke-interface {v0, p1}, Landroid/content/DialogInterface$OnDismissListener;->onDismiss(Landroid/content/DialogInterface;)V

    .line 218
    :cond_0
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 415
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/a;->m:Landroid/net/Uri;

    if-eqz v0, :cond_0

    .line 416
    const-string v0, "PATH"

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/a;->m:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 417
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 418
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 426
    return-void
.end method
