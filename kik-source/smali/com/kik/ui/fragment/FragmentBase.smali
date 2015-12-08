.class public abstract Lcom/kik/ui/fragment/FragmentBase;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Lcom/kik/h/a;
.implements Lcom/kik/h/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/ui/fragment/FragmentBase$a;
    }
.end annotation


# instance fields
.field private a:Landroid/os/Bundle;

.field private b:Z

.field private c:Lcom/kik/g/p;

.field private d:I

.field private e:Landroid/view/View;

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Lcom/kik/g/f;

.field private k:Z

.field protected final u:I

.field protected v:Landroid/view/inputmethod/InputMethodManager;

.field protected w:Lkik/android/widget/cw;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 30
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 34
    const/4 v0, 0x1

    iput v0, p0, Lcom/kik/ui/fragment/FragmentBase;->u:I

    .line 38
    iput-boolean v1, p0, Lcom/kik/ui/fragment/FragmentBase;->b:Z

    .line 39
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    iput-object v0, p0, Lcom/kik/ui/fragment/FragmentBase;->c:Lcom/kik/g/p;

    .line 40
    const/4 v0, 0x2

    iput v0, p0, Lcom/kik/ui/fragment/FragmentBase;->d:I

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/ui/fragment/FragmentBase;->e:Landroid/view/View;

    .line 42
    iput-boolean v1, p0, Lcom/kik/ui/fragment/FragmentBase;->f:Z

    .line 43
    iput-boolean v1, p0, Lcom/kik/ui/fragment/FragmentBase;->g:Z

    .line 48
    iput-boolean v1, p0, Lcom/kik/ui/fragment/FragmentBase;->h:Z

    .line 50
    iput-boolean v1, p0, Lcom/kik/ui/fragment/FragmentBase;->i:Z

    .line 51
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lcom/kik/ui/fragment/FragmentBase;->j:Lcom/kik/g/f;

    .line 55
    iput-boolean v1, p0, Lcom/kik/ui/fragment/FragmentBase;->k:Z

    .line 486
    return-void
.end method

.method public static varargs a(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    invoke-static {p0, p1}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/kik/ui/fragment/FragmentBase;)V
    .locals 1

    .prologue
    .line 30
    iget-boolean v0, p0, Lcom/kik/ui/fragment/FragmentBase;->f:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/kik/ui/fragment/FragmentBase;->D()V

    iget v0, p0, Lcom/kik/ui/fragment/FragmentBase;->d:I

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/ui/fragment/FragmentBase;->f:Z

    :cond_1
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/kik/ui/fragment/FragmentBase;->e:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/ui/fragment/FragmentBase;->e:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/kik/ui/fragment/FragmentBase;->a(Landroid/view/View;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/kik/ui/fragment/FragmentBase;->e:Landroid/view/View;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/kik/ui/fragment/FragmentBase;->getView()Landroid/view/View;

    move-result-object v0

    :cond_2
    invoke-virtual {p0, v0}, Lcom/kik/ui/fragment/FragmentBase;->b(Landroid/view/View;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static b(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 64
    invoke-static {p0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c()V
    .locals 2

    .prologue
    .line 286
    iget-boolean v0, p0, Lcom/kik/ui/fragment/FragmentBase;->g:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/kik/ui/fragment/FragmentBase;->h:Z

    if-eqz v0, :cond_1

    .line 297
    :cond_0
    :goto_0
    return-void

    .line 289
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/ui/fragment/FragmentBase;->g:Z

    .line 291
    iget-boolean v0, p0, Lcom/kik/ui/fragment/FragmentBase;->b:Z

    if-eqz v0, :cond_2

    .line 292
    iget-object v0, p0, Lcom/kik/ui/fragment/FragmentBase;->c:Lcom/kik/g/p;

    iget-object v1, p0, Lcom/kik/ui/fragment/FragmentBase;->a:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 295
    :cond_2
    iget-object v0, p0, Lcom/kik/ui/fragment/FragmentBase;->c:Lcom/kik/g/p;

    invoke-virtual {v0}, Lcom/kik/g/p;->e()V

    goto :goto_0
.end method


# virtual methods
.method public A()Z
    .locals 1

    .prologue
    .line 405
    const/4 v0, 0x0

    return v0
.end method

.method public B()Z
    .locals 1

    .prologue
    .line 81
    const/4 v0, 0x0

    return v0
.end method

.method protected C()I
    .locals 1

    .prologue
    .line 140
    const/16 v0, 0x10

    return v0
.end method

.method public final D()V
    .locals 2

    .prologue
    .line 224
    invoke-virtual {p0}, Lcom/kik/ui/fragment/FragmentBase;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 225
    if-eqz v0, :cond_0

    .line 226
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0}, Lcom/kik/ui/fragment/FragmentBase;->C()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 228
    :cond_0
    return-void
.end method

.method public final E()Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 243
    iget-object v0, p0, Lcom/kik/ui/fragment/FragmentBase;->c:Lcom/kik/g/p;

    return-object v0
.end method

.method public final F()V
    .locals 1

    .prologue
    .line 256
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/ui/fragment/FragmentBase;->f:Z

    .line 257
    return-void
.end method

.method protected final G()V
    .locals 1

    .prologue
    .line 261
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/ui/fragment/FragmentBase;->f:Z

    .line 262
    return-void
.end method

.method public final H()Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 280
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/ui/fragment/FragmentBase;->h:Z

    .line 281
    iget-object v0, p0, Lcom/kik/ui/fragment/FragmentBase;->c:Lcom/kik/g/p;

    return-object v0
.end method

.method protected I()Z
    .locals 1

    .prologue
    .line 357
    iget-boolean v0, p0, Lcom/kik/ui/fragment/FragmentBase;->i:Z

    return v0
.end method

.method public final J()V
    .locals 3

    .prologue
    .line 367
    invoke-direct {p0}, Lcom/kik/ui/fragment/FragmentBase;->c()V

    .line 370
    invoke-virtual {p0}, Lcom/kik/ui/fragment/FragmentBase;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 371
    invoke-virtual {p0}, Lcom/kik/ui/fragment/FragmentBase;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 373
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->getBackStackEntryCount()I

    move-result v2

    if-lez v2, :cond_1

    .line 374
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->popBackStack()V

    .line 379
    :cond_0
    :goto_0
    return-void

    .line 376
    :cond_1
    if-eqz v1, :cond_0

    .line 377
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    goto :goto_0
.end method

.method protected K()I
    .locals 1

    .prologue
    .line 391
    const/4 v0, 0x0

    return v0
.end method

.method protected L()V
    .locals 1

    .prologue
    .line 410
    iget-object v0, p0, Lcom/kik/ui/fragment/FragmentBase;->w:Lkik/android/widget/cw;

    if-eqz v0, :cond_0

    .line 411
    iget-object v0, p0, Lcom/kik/ui/fragment/FragmentBase;->w:Lkik/android/widget/cw;

    invoke-virtual {v0, p0}, Lkik/android/widget/cw;->a(Landroid/support/v4/app/Fragment;)V

    .line 413
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/kik/ui/fragment/FragmentBase;->b(Landroid/view/View;)V

    .line 415
    :cond_0
    return-void
.end method

.method public M()Z
    .locals 1

    .prologue
    .line 429
    const/4 v0, 0x0

    return v0
.end method

.method public final N()I
    .locals 5

    .prologue
    .line 439
    const/4 v0, 0x0

    .line 440
    const/16 v1, 0x13

    invoke-static {v1}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/kik/ui/fragment/FragmentBase;->M()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 441
    invoke-virtual {p0}, Lcom/kik/ui/fragment/FragmentBase;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "status_bar_height"

    const-string v3, "dimen"

    const-string v4, "android"

    invoke-virtual {v1, v2, v3, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 442
    if-lez v1, :cond_0

    .line 443
    invoke-virtual {p0}, Lcom/kik/ui/fragment/FragmentBase;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 446
    :cond_0
    return v0
.end method

.method protected final O()Z
    .locals 1

    .prologue
    .line 465
    iget-boolean v0, p0, Lcom/kik/ui/fragment/FragmentBase;->k:Z

    return v0
.end method

.method protected final P()V
    .locals 2

    .prologue
    .line 470
    invoke-virtual {p0}, Lcom/kik/ui/fragment/FragmentBase;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 471
    if-nez v0, :cond_0

    .line 475
    :goto_0
    return-void

    .line 474
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Activity;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    goto :goto_0
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 86
    iput-object p1, p0, Lcom/kik/ui/fragment/FragmentBase;->a:Landroid/os/Bundle;

    .line 87
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/ui/fragment/FragmentBase;->b:Z

    .line 88
    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 301
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/kik/ui/fragment/FragmentBase;->a(Landroid/view/View;Z)V

    .line 302
    return-void
.end method

.method public final a(Landroid/view/View;I)V
    .locals 0

    .prologue
    .line 346
    iput-object p1, p0, Lcom/kik/ui/fragment/FragmentBase;->e:Landroid/view/View;

    .line 347
    iput p2, p0, Lcom/kik/ui/fragment/FragmentBase;->d:I

    .line 348
    return-void
.end method

.method public final a(Landroid/view/View;Z)V
    .locals 1

    .prologue
    .line 306
    iget-object v0, p0, Lcom/kik/ui/fragment/FragmentBase;->v:Landroid/view/inputmethod/InputMethodManager;

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    .line 320
    :cond_0
    :goto_0
    return-void

    .line 312
    :cond_1
    new-instance v0, Lcom/kik/ui/fragment/d;

    invoke-direct {v0, p0, p1, p2}, Lcom/kik/ui/fragment/d;-><init>(Lcom/kik/ui/fragment/FragmentBase;Landroid/view/View;Z)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 362
    iput-boolean p1, p0, Lcom/kik/ui/fragment/FragmentBase;->i:Z

    .line 363
    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 326
    invoke-virtual {p0}, Lcom/kik/ui/fragment/FragmentBase;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 327
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/kik/ui/fragment/FragmentBase;->v:Landroid/view/inputmethod/InputMethodManager;

    if-nez v1, :cond_1

    .line 342
    :cond_0
    :goto_0
    return-void

    .line 331
    :cond_1
    invoke-virtual {v0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object v0

    .line 332
    if-eqz v0, :cond_2

    move-object p1, v0

    .line 335
    :cond_2
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/kik/ui/fragment/FragmentBase;->v:Landroid/view/inputmethod/InputMethodManager;

    if-eqz v0, :cond_0

    .line 336
    iget-object v0, p0, Lcom/kik/ui/fragment/FragmentBase;->v:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p1}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 340
    iget-object v0, p0, Lcom/kik/ui/fragment/FragmentBase;->v:Landroid/view/inputmethod/InputMethodManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    goto :goto_0
.end method

.method protected final c(I)V
    .locals 1

    .prologue
    .line 479
    invoke-virtual {p0}, Lcom/kik/ui/fragment/FragmentBase;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 480
    if-eqz v0, :cond_0

    .line 482
    invoke-virtual {v0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 484
    :cond_0
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 233
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 237
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/kik/ui/fragment/FragmentBase;->a(Z)V

    .line 238
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 75
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 76
    invoke-virtual {p0}, Lcom/kik/ui/fragment/FragmentBase;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/kik/ui/fragment/FragmentBase;->v:Landroid/view/inputmethod/InputMethodManager;

    .line 77
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 267
    iget-object v0, p0, Lcom/kik/ui/fragment/FragmentBase;->j:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 268
    invoke-direct {p0}, Lcom/kik/ui/fragment/FragmentBase;->c()V

    .line 269
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 270
    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .prologue
    .line 250
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/ui/fragment/FragmentBase;->f:Z

    .line 251
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    .line 252
    return-void
.end method

.method public onResume()V
    .locals 4

    .prologue
    .line 151
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 153
    iget-boolean v0, p0, Lcom/kik/ui/fragment/FragmentBase;->f:Z

    if-eqz v0, :cond_0

    .line 185
    :goto_0
    return-void

    .line 159
    :cond_0
    invoke-virtual {p0}, Lcom/kik/ui/fragment/FragmentBase;->getView()Landroid/view/View;

    move-result-object v0

    .line 162
    if-eqz v0, :cond_1

    .line 163
    new-instance v1, Lcom/kik/ui/fragment/b;

    invoke-direct {v1, p0}, Lcom/kik/ui/fragment/b;-><init>(Lcom/kik/ui/fragment/FragmentBase;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 173
    new-instance v1, Lcom/kik/ui/fragment/c;

    invoke-direct {v1, p0}, Lcom/kik/ui/fragment/c;-><init>(Lcom/kik/ui/fragment/FragmentBase;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 183
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Trying to handle keyboard for fragment without view"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkik/android/util/bx;->f(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 93
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 94
    if-eqz p1, :cond_1

    const v0, 0x7f0e001d

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/kik/ui/fragment/a;

    invoke-direct {v1, p0}, Lcom/kik/ui/fragment/a;-><init>(Lcom/kik/ui/fragment/FragmentBase;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    const v0, 0x7f0e0078

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/kik/ui/fragment/FragmentBase;->K()I

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/kik/ui/fragment/FragmentBase;->K()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 95
    :cond_1
    return-void
.end method

.method public v()Z
    .locals 1

    .prologue
    .line 398
    invoke-virtual {p0}, Lcom/kik/ui/fragment/FragmentBase;->J()V

    .line 399
    const/4 v0, 0x1

    return v0
.end method

.method public y()I
    .locals 1

    .prologue
    .line 419
    const v0, 0x7f0c0078

    invoke-static {v0}, Lkik/android/chat/KikApplication;->e(I)I

    move-result v0

    return v0
.end method
