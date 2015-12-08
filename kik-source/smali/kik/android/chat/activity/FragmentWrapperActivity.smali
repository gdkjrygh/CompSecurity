.class public Lkik/android/chat/activity/FragmentWrapperActivity;
.super Landroid/support/v4/app/FragmentActivity;
.source "SourceFile"


# instance fields
.field protected a:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected b:Lkik/a/ab;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private c:Z

.field private d:Lcom/kik/g/p;

.field private e:Ljava/lang/String;

.field private f:Lcom/kik/g/f;

.field private g:Ljava/lang/String;

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:I

.field private l:Lcom/kik/g/i;

.field private m:Lcom/kik/g/i;

.field private n:Lcom/kik/g/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 53
    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    .line 56
    iput-boolean v1, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->c:Z

    .line 59
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->f:Lcom/kik/g/f;

    .line 61
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->h:Z

    .line 62
    iput-boolean v1, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->i:Z

    .line 63
    iput-boolean v1, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->j:Z

    .line 69
    new-instance v0, Lkik/android/chat/activity/a;

    invoke-direct {v0, p0}, Lkik/android/chat/activity/a;-><init>(Lkik/android/chat/activity/FragmentWrapperActivity;)V

    iput-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->l:Lcom/kik/g/i;

    .line 84
    new-instance v0, Lkik/android/chat/activity/c;

    invoke-direct {v0, p0}, Lkik/android/chat/activity/c;-><init>(Lkik/android/chat/activity/FragmentWrapperActivity;)V

    iput-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->m:Lcom/kik/g/i;

    .line 95
    new-instance v0, Lkik/android/chat/activity/d;

    invoke-direct {v0, p0}, Lkik/android/chat/activity/d;-><init>(Lkik/android/chat/activity/FragmentWrapperActivity;)V

    iput-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->n:Lcom/kik/g/i;

    return-void
.end method

.method private a(Landroid/content/Intent;)Landroid/support/v4/app/Fragment;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 266
    if-nez p1, :cond_0

    .line 326
    :goto_0
    return-object v1

    .line 269
    :cond_0
    const-string v0, "kik.android.util.FragmentBundle.FragmentClass"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 272
    iget-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->g:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 273
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lkik/android/chat/activity/k;->c(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->g:Ljava/lang/String;

    .line 275
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lkik/android/chat/activity/k;->a(Landroid/os/Bundle;)Lcom/kik/g/p;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->d:Lcom/kik/g/p;

    .line 276
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lkik/android/chat/activity/k;->b(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->e:Ljava/lang/String;

    .line 280
    :try_start_0
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    .line 290
    :goto_1
    if-nez v1, :cond_2

    .line 291
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 282
    :catch_0
    move-exception v0

    .line 283
    invoke-static {}, Lcom/a/a/a;->d()Lcom/a/a/a;

    move-result-object v3

    iget-object v3, v3, Lcom/a/a/a;->c:Lcom/a/a/c/g;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Attempting to create an instance of : "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/a/a/c/g;->a(Ljava/lang/String;)V

    .line 284
    invoke-static {}, Lcom/a/a/a;->d()Lcom/a/a/a;

    move-result-object v2

    iget-object v2, v2, Lcom/a/a/a;->c:Lcom/a/a/c/g;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "With params: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/a/a/c/g;->a(Ljava/lang/String;)V

    .line 285
    invoke-static {}, Lcom/a/a/a;->d()Lcom/a/a/a;

    move-result-object v2

    iget-object v2, v2, Lcom/a/a/a;->c:Lcom/a/a/c/g;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "With flags: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Intent;->getFlags()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/a/a/c/g;->a(Ljava/lang/String;)V

    .line 287
    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_1

    .line 293
    :cond_2
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/support/v4/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 294
    instance-of v0, v1, Lcom/kik/ui/fragment/FragmentBase;

    if-eqz v0, :cond_3

    move-object v0, v1

    .line 295
    check-cast v0, Lcom/kik/ui/fragment/FragmentBase;

    invoke-virtual {v0}, Lcom/kik/ui/fragment/FragmentBase;->E()Lcom/kik/g/p;

    move-result-object v0

    .line 297
    new-instance v2, Lkik/android/chat/activity/e;

    invoke-direct {v2, p0}, Lkik/android/chat/activity/e;-><init>(Lkik/android/chat/activity/FragmentWrapperActivity;)V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 324
    :cond_3
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    const v2, 0x7f0e0062

    invoke-virtual {v0, v2, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 325
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    goto/16 :goto_0
.end method

.method static synthetic a(Lkik/android/chat/activity/FragmentWrapperActivity;)Lcom/kik/g/f;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->f:Lcom/kik/g/f;

    return-object v0
.end method

.method static synthetic b(Lkik/android/chat/activity/FragmentWrapperActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->g:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lkik/android/chat/activity/FragmentWrapperActivity;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lkik/android/chat/activity/FragmentWrapperActivity;)Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->d:Lcom/kik/g/p;

    return-object v0
.end method

.method private f()V
    .locals 1

    .prologue
    .line 479
    const/16 v0, 0xb

    invoke-static {v0}, Lcom/kik/sdkutils/y;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 480
    iget-boolean v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->i:Z

    if-eqz v0, :cond_1

    .line 481
    iget-boolean v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->c:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->j:Z

    if-nez v0, :cond_0

    .line 482
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->i:Z

    .line 483
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 492
    :cond_0
    :goto_0
    return-void

    .line 487
    :cond_1
    iget-boolean v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->j:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->c:Z

    if-nez v0, :cond_0

    .line 488
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->i:Z

    goto :goto_0
.end method


# virtual methods
.method public final a()Landroid/support/v4/app/Fragment;
    .locals 2

    .prologue
    .line 155
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const v1, 0x7f0e0062

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 156
    return-object v0
.end method

.method public final a(I)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .prologue
    .line 546
    const/16 v0, 0x15

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 547
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 548
    if-nez v0, :cond_1

    .line 555
    :cond_0
    :goto_0
    return-void

    .line 551
    :cond_1
    const/high16 v1, -0x80000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 552
    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 553
    invoke-virtual {v0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_0
.end method

.method final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 583
    iput-object p1, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->g:Ljava/lang/String;

    .line 584
    return-void
.end method

.method public final a(Z)Z
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 118
    const/4 v3, 0x0

    .line 119
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->a()Landroid/support/v4/app/Fragment;

    move-result-object v1

    .line 122
    if-nez p1, :cond_0

    instance-of v0, v1, Lcom/kik/h/a;

    if-eqz v0, :cond_0

    move-object v0, v1

    .line 123
    check-cast v0, Lcom/kik/h/a;

    invoke-interface {v0}, Lcom/kik/h/a;->v()Z

    move-result v3

    .line 126
    :cond_0
    if-nez v3, :cond_3

    instance-of v0, v1, Lkik/android/chat/fragment/KikCardBrowserFragment;

    if-eqz v0, :cond_3

    move-object v0, v1

    .line 128
    check-cast v0, Lkik/android/chat/fragment/KikCardBrowserFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikCardBrowserFragment;->B()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 129
    check-cast v1, Lkik/android/chat/fragment/KikCardBrowserFragment;

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikCardBrowserFragment;->a(Lorg/json/JSONObject;)V

    move v0, v2

    .line 132
    :goto_0
    if-nez v0, :cond_1

    .line 134
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->finish()V

    move v0, v2

    .line 137
    :cond_1
    :goto_1
    return v0

    :cond_2
    move v0, v3

    goto :goto_0

    :cond_3
    move v0, v3

    goto :goto_1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 379
    iget-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 384
    iget-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 447
    :try_start_0
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const-string v2, "android.support.v4.app.FragmentManagerImpl"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "mStateSaved"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-nez v1, :cond_0

    .line 454
    :goto_0
    return v0

    .line 447
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 452
    :catch_0
    move-exception v0

    iget-boolean v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->h:Z

    goto :goto_0
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 532
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->a()Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 533
    instance-of v1, v0, Lcom/kik/cards/web/ay;

    if-eqz v1, :cond_0

    .line 534
    check-cast v0, Lcom/kik/cards/web/ay;

    .line 536
    invoke-interface {v0, p1}, Lcom/kik/cards/web/ay;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 537
    const/4 v0, 0x1

    .line 540
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 496
    iget-boolean v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->j:Z

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 7

    .prologue
    const v3, 0x7f090062

    const/4 v2, -0x1

    const/4 v5, 0x1

    .line 591
    const v0, 0xffff

    and-int/2addr v0, p1

    .line 593
    const/16 v1, 0x11

    if-ne v0, v1, :cond_4

    if-ne p2, v2, :cond_4

    .line 594
    iget-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->a:Lkik/a/e/v;

    invoke-interface {v0}, Lkik/a/e/v;->n()Lkik/a/e/h;

    move-result-object v0

    invoke-interface {v0}, Lkik/a/e/h;->a()Lkik/a/d/t;

    move-result-object v1

    .line 595
    if-nez v1, :cond_2

    const/4 v2, 0x0

    .line 596
    :goto_0
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_3

    .line 597
    :cond_0
    invoke-virtual {p0, v3}, Lkik/android/chat/activity/FragmentWrapperActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 626
    :cond_1
    :goto_1
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 627
    return-void

    .line 595
    :cond_2
    new-instance v2, Ljava/io/File;

    invoke-virtual {v1}, Lkik/a/d/t;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 600
    :cond_3
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    const-string v3, "com.kik.ext.camera"

    invoke-virtual {v1}, Lkik/a/d/t;->a()Ljava/lang/String;

    move-result-object v4

    iget-object v6, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->a:Lkik/a/e/v;

    move-object v1, p0

    invoke-virtual/range {v0 .. v6}, Lkik/android/f/a/f;->a(Landroid/app/Activity;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;ZLkik/a/e/v;)V

    goto :goto_1

    .line 603
    :cond_4
    const/16 v1, 0xcb

    if-ne v0, v1, :cond_6

    if-ne p2, v2, :cond_6

    .line 605
    invoke-static {p3}, Lkik/android/util/e;->a(Landroid/content/Intent;)Landroid/net/Uri;

    move-result-object v0

    .line 606
    iget-object v1, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->a:Lkik/a/e/v;

    invoke-interface {v1}, Lkik/a/e/v;->n()Lkik/a/e/h;

    move-result-object v1

    invoke-interface {v1}, Lkik/a/e/h;->a()Lkik/a/d/t;

    move-result-object v1

    .line 607
    if-eqz v0, :cond_1

    .line 608
    invoke-static {v0, p0}, Lkik/android/util/e;->a(Landroid/net/Uri;Landroid/content/Context;)Ljava/io/File;

    move-result-object v2

    .line 609
    if-eqz v2, :cond_5

    if-eqz v1, :cond_5

    .line 611
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    const-string v3, "com.kik.ext.gallery"

    invoke-virtual {v1}, Lkik/a/d/t;->a()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    iget-object v6, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->a:Lkik/a/e/v;

    move-object v1, p0

    invoke-virtual/range {v0 .. v6}, Lkik/android/f/a/f;->a(Landroid/app/Activity;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;ZLkik/a/e/v;)V

    goto :goto_1

    .line 614
    :cond_5
    invoke-virtual {p0, v3}, Lkik/android/chat/activity/FragmentWrapperActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_1

    .line 618
    :cond_6
    const v0, 0x17318

    if-ne p1, v0, :cond_1

    .line 619
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->a()Landroid/support/v4/app/Fragment;

    move-result-object v0

    instance-of v0, v0, Lcom/kik/cards/web/CardsWebViewFragment;

    if-eqz v0, :cond_7

    .line 620
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->a()Landroid/support/v4/app/Fragment;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_1

    .line 622
    :cond_7
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->a()Landroid/support/v4/app/Fragment;

    move-result-object v0

    instance-of v0, v0, Lcom/kik/cards/web/CardsWebViewFragment;

    if-eqz v0, :cond_1

    .line 623
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->a()Landroid/support/v4/app/Fragment;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_1
.end method

.method public onBackPressed()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 111
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->a()Landroid/support/v4/app/Fragment;

    move-result-object v0

    instance-of v2, v0, Lcom/kik/h/a;

    if-eqz v2, :cond_1

    check-cast v0, Lcom/kik/h/a;

    invoke-interface {v0}, Lcom/kik/h/a;->A()Z

    move-result v0

    :goto_0
    if-nez v0, :cond_0

    invoke-virtual {p0, v1}, Lkik/android/chat/activity/FragmentWrapperActivity;->a(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 112
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onBackPressed()V

    .line 114
    :cond_0
    return-void

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 400
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 403
    if-eqz p1, :cond_2

    iget v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->k:I

    iget v1, p1, Landroid/content/res/Configuration;->orientation:I

    if-eq v0, v1, :cond_2

    .line 404
    const/4 v0, 0x0

    .line 405
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->getWindow()Landroid/view/Window;

    move-result-object v1

    .line 406
    if-eqz v1, :cond_0

    .line 407
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 409
    :cond_0
    if-eqz v0, :cond_1

    .line 410
    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 412
    :cond_1
    iget v0, p1, Landroid/content/res/Configuration;->orientation:I

    iput v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->k:I

    .line 414
    :cond_2
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 205
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 206
    invoke-virtual {p0, v1}, Lkik/android/chat/activity/FragmentWrapperActivity;->requestWindowFeature(I)Z

    .line 208
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/a;

    invoke-interface {v0}, Lkik/android/chat/a;->a()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/activity/FragmentWrapperActivity;)V

    .line 211
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v3, Lkik/android/widget/ey;

    invoke-direct {v3}, Lkik/android/widget/ey;-><init>()V

    invoke-virtual {v0, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 216
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 217
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 219
    :goto_0
    if-eqz p1, :cond_6

    .line 222
    :goto_1
    iput-object v2, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->g:Ljava/lang/String;

    if-eqz p1, :cond_0

    const-string v0, "com.kik.util.KActivityLauncher.synthTaskId"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->g:Ljava/lang/String;

    .line 224
    :cond_0
    invoke-static {}, Lkik/android/chat/activity/k;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->g:Ljava/lang/String;

    if-eqz v2, :cond_1

    if-eqz v0, :cond_1

    iget-object v2, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->g:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    :goto_2
    if-eqz v0, :cond_2

    .line 228
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->finish()V

    .line 256
    :goto_3
    return-void

    .line 224
    :cond_1
    const/4 v0, 0x0

    goto :goto_2

    .line 232
    :cond_2
    iget-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->f:Lcom/kik/g/f;

    iget-object v2, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->b:Lkik/a/ab;

    invoke-interface {v2}, Lkik/a/ab;->a()Lcom/kik/g/e;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->l:Lcom/kik/g/i;

    invoke-virtual {v0, v2, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 233
    iget-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->f:Lcom/kik/g/f;

    iget-object v2, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->b:Lkik/a/ab;

    invoke-interface {v2}, Lkik/a/ab;->c()Lcom/kik/g/e;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->l:Lcom/kik/g/i;

    invoke-virtual {v0, v2, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 234
    iget-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->f:Lcom/kik/g/f;

    invoke-static {}, Lkik/android/chat/activity/k;->a()Lcom/kik/g/e;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->m:Lcom/kik/g/i;

    invoke-virtual {v0, v2, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 235
    iget-object v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->f:Lcom/kik/g/f;

    invoke-static {}, Lkik/android/chat/activity/k;->b()Lcom/kik/g/e;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->n:Lcom/kik/g/i;

    invoke-virtual {v0, v2, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 238
    invoke-virtual {p0, v1}, Lkik/android/chat/activity/FragmentWrapperActivity;->requestWindowFeature(I)Z

    .line 240
    const v0, 0x7f03000d

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->setContentView(I)V

    .line 241
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->a(Landroid/content/Intent;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    .line 243
    instance-of v0, v1, Lcom/kik/ui/fragment/FragmentBase;

    if-eqz v0, :cond_5

    move-object v0, v1

    .line 244
    check-cast v0, Lcom/kik/ui/fragment/FragmentBase;

    .line 245
    invoke-virtual {v0}, Lcom/kik/ui/fragment/FragmentBase;->M()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 246
    const/16 v0, 0x13

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_3

    const/high16 v2, -0x80000000

    invoke-virtual {v0, v2}, Landroid/view/Window;->clearFlags(I)V

    const/high16 v2, 0x4000000

    invoke-virtual {v0, v2}, Landroid/view/Window;->addFlags(I)V

    .line 255
    :cond_3
    :goto_4
    invoke-static {p0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/chat/activity/FragmentWrapperActivity;Landroid/support/v4/app/Fragment;)V

    goto :goto_3

    .line 249
    :cond_4
    invoke-virtual {v0}, Lcom/kik/ui/fragment/FragmentBase;->y()I

    move-result v0

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->a(I)V

    goto :goto_4

    .line 253
    :cond_5
    const v0, 0x7f0c0078

    invoke-static {v0}, Lkik/android/chat/KikApplication;->e(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->a(I)V

    goto :goto_4

    :cond_6
    move-object p1, v0

    goto/16 :goto_1

    :cond_7
    move-object v0, v2

    goto/16 :goto_0
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 348
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->a()Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 349
    iget-object v1, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->f:Lcom/kik/g/f;

    invoke-virtual {v1}, Lcom/kik/g/f;->a()V

    .line 350
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 351
    invoke-static {p0}, Lkik/android/chat/activity/k;->a(Lkik/android/chat/activity/FragmentWrapperActivity;)V

    .line 354
    :cond_0
    instance-of v1, v0, Lkik/android/chat/fragment/KikScopedDialogFragment;

    if-eqz v1, :cond_1

    .line 355
    check-cast v0, Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->ab()V

    .line 358
    :cond_1
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onDestroy()V

    .line 359
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 429
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/FragmentActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    .line 431
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isLongPress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x52

    if-ne p1, v1, :cond_0

    .line 432
    const/4 v0, 0x1

    .line 434
    :cond_0
    return v0
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 183
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 184
    if-nez p1, :cond_0

    :goto_0
    if-eqz v0, :cond_1

    .line 191
    :goto_1
    return-void

    .line 184
    :cond_0
    const-string v1, "com.kik.util.KActivityLauncher.no.refresh"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    goto :goto_0

    .line 189
    :cond_1
    invoke-direct {p0, p1}, Lkik/android/chat/activity/FragmentWrapperActivity;->a(Landroid/content/Intent;)Landroid/support/v4/app/Fragment;

    goto :goto_1
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 502
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onPause()V

    .line 503
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->j:Z

    .line 504
    invoke-direct {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->f()V

    .line 505
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    invoke-virtual {v0, p0}, Lkik/android/chat/KikApplication;->c(Landroid/app/Activity;)V

    .line 506
    return-void
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 419
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onResume()V

    .line 420
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->h:Z

    .line 421
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->j:Z

    .line 422
    invoke-direct {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->f()V

    .line 423
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    invoke-virtual {v0, p0}, Lkik/android/chat/KikApplication;->d(Landroid/app/Activity;)V

    .line 424
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 364
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 365
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->h:Z

    .line 366
    const-string v0, "com.kik.util.KActivityLauncher.synthTaskId"

    iget-object v1, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->g:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 2

    .prologue
    .line 332
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onWindowFocusChanged(Z)V

    .line 333
    iput-boolean p1, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->c:Z

    .line 334
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->a()Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/kik/h/d;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/kik/h/d;

    iget-boolean v1, p0, Lkik/android/chat/activity/FragmentWrapperActivity;->c:Z

    invoke-interface {v0, v1}, Lcom/kik/h/d;->a(Z)V

    .line 335
    :cond_0
    invoke-direct {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->f()V

    .line 336
    invoke-virtual {p0}, Lkik/android/chat/activity/FragmentWrapperActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    .line 337
    if-eqz p1, :cond_1

    .line 338
    invoke-virtual {v0, p0}, Lkik/android/chat/KikApplication;->a(Landroid/app/Activity;)V

    .line 343
    :goto_0
    return-void

    .line 341
    :cond_1
    invoke-virtual {v0, p0}, Lkik/android/chat/KikApplication;->b(Landroid/app/Activity;)V

    goto :goto_0
.end method
