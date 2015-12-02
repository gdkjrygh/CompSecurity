.class public Landroid/support/v4/app/DialogFragment;
.super Landroid/support/v4/app/Fragment;
.source "DialogFragment.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field a:I

.field b:I

.field c:Z

.field d:Z

.field e:I

.field f:Landroid/app/Dialog;

.field g:Z

.field h:Z

.field i:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 84
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 73
    iput v0, p0, Landroid/support/v4/app/DialogFragment;->a:I

    .line 74
    iput v0, p0, Landroid/support/v4/app/DialogFragment;->b:I

    .line 75
    iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->c:Z

    .line 76
    iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->d:Z

    .line 77
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v4/app/DialogFragment;->e:I

    .line 85
    return-void
.end method


# virtual methods
.method public a(Landroid/support/v4/app/ad;Ljava/lang/String;)I
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 140
    iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->h:Z

    .line 141
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->i:Z

    .line 142
    invoke-virtual {p1, p0, p2}, Landroid/support/v4/app/ad;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 143
    iput-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->g:Z

    .line 144
    invoke-virtual {p1}, Landroid/support/v4/app/ad;->a()I

    move-result v0

    iput v0, p0, Landroid/support/v4/app/DialogFragment;->e:I

    .line 145
    iget v0, p0, Landroid/support/v4/app/DialogFragment;->e:I

    return v0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 180
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v4/app/DialogFragment;->a(Z)V

    .line 181
    return-void
.end method

.method public a(II)V
    .locals 2

    .prologue
    .line 102
    iput p1, p0, Landroid/support/v4/app/DialogFragment;->a:I

    .line 103
    iget v0, p0, Landroid/support/v4/app/DialogFragment;->a:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget v0, p0, Landroid/support/v4/app/DialogFragment;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 104
    :cond_0
    const v0, 0x1030059

    iput v0, p0, Landroid/support/v4/app/DialogFragment;->b:I

    .line 106
    :cond_1
    if-eqz p2, :cond_2

    .line 107
    iput p2, p0, Landroid/support/v4/app/DialogFragment;->b:I

    .line 109
    :cond_2
    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 278
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->a(Landroid/content/Context;)V

    .line 279
    iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->i:Z

    if-nez v0, :cond_0

    .line 282
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->h:Z

    .line 284
    :cond_0
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 299
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->a(Landroid/os/Bundle;)V

    .line 301
    iget v0, p0, Landroid/support/v4/app/DialogFragment;->H:I

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->d:Z

    .line 303
    if-eqz p1, :cond_0

    .line 304
    const-string v0, "android:style"

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroid/support/v4/app/DialogFragment;->a:I

    .line 305
    const-string v0, "android:theme"

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroid/support/v4/app/DialogFragment;->b:I

    .line 306
    const-string v0, "android:cancelable"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->c:Z

    .line 307
    const-string v0, "android:showsDialog"

    iget-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->d:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->d:Z

    .line 308
    const-string v0, "android:backStackId"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroid/support/v4/app/DialogFragment;->e:I

    .line 311
    :cond_0
    return-void

    :cond_1
    move v0, v2

    .line 301
    goto :goto_0
.end method

.method public a(Landroid/support/v4/app/q;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 123
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->h:Z

    .line 124
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->i:Z

    .line 125
    invoke-virtual {p1}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 126
    invoke-virtual {v0, p0, p2}, Landroid/support/v4/app/ad;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 127
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    .line 128
    return-void
.end method

.method a(Z)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 194
    iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->h:Z

    if-eqz v0, :cond_0

    .line 217
    :goto_0
    return-void

    .line 197
    :cond_0
    iput-boolean v2, p0, Landroid/support/v4/app/DialogFragment;->h:Z

    .line 198
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->i:Z

    .line 199
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    if-eqz v0, :cond_1

    .line 200
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 201
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    .line 203
    :cond_1
    iput-boolean v2, p0, Landroid/support/v4/app/DialogFragment;->g:Z

    .line 204
    iget v0, p0, Landroid/support/v4/app/DialogFragment;->e:I

    if-ltz v0, :cond_2

    .line 205
    invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->p()Landroid/support/v4/app/q;

    move-result-object v0

    iget v1, p0, Landroid/support/v4/app/DialogFragment;->e:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/q;->a(II)V

    .line 207
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v4/app/DialogFragment;->e:I

    goto :goto_0

    .line 209
    :cond_2
    invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->p()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 210
    invoke-virtual {v0, p0}, Landroid/support/v4/app/ad;->a(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 211
    if-eqz p1, :cond_3

    .line 212
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->b()I

    goto :goto_0

    .line 214
    :cond_3
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    goto :goto_0
.end method

.method public b(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 2

    .prologue
    .line 316
    iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->d:Z

    if-nez v0, :cond_0

    .line 317
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->b(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 335
    :goto_0
    return-object v0

    .line 320
    :cond_0
    invoke-virtual {p0, p1}, Landroid/support/v4/app/DialogFragment;->c(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    .line 321
    iget v0, p0, Landroid/support/v4/app/DialogFragment;->a:I

    packed-switch v0, :pswitch_data_0

    .line 331
    :goto_1
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    if-eqz v0, :cond_1

    .line 332
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    goto :goto_0

    .line 323
    :pswitch_0
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x18

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 329
    :pswitch_1
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    goto :goto_1

    .line 335
    :cond_1
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->D:Landroid/support/v4/app/p;

    invoke-virtual {v0}, Landroid/support/v4/app/p;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    goto :goto_0

    .line 321
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b()V
    .locals 1

    .prologue
    .line 190
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/support/v4/app/DialogFragment;->a(Z)V

    .line 191
    return-void
.end method

.method public b(Z)V
    .locals 0

    .prologue
    .line 266
    iput-boolean p1, p0, Landroid/support/v4/app/DialogFragment;->d:Z

    .line 267
    return-void
.end method

.method public c()Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 220
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    return-object v0
.end method

.method public c(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .prologue
    .line 362
    new-instance v0, Landroid/app/Dialog;

    invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->n()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->d()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    return-object v0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 224
    iget v0, p0, Landroid/support/v4/app/DialogFragment;->b:I

    return v0
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 380
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->d(Landroid/os/Bundle;)V

    .line 382
    iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->d:Z

    if-nez v0, :cond_1

    .line 407
    :cond_0
    :goto_0
    return-void

    .line 386
    :cond_1
    invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->z()Landroid/view/View;

    move-result-object v0

    .line 387
    if-eqz v0, :cond_3

    .line 388
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 389
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DialogFragment can not be attached to a container view"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 391
    :cond_2
    iget-object v1, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 393
    :cond_3
    invoke-virtual {p0}, Landroid/support/v4/app/DialogFragment;->n()Landroid/content/Context;

    move-result-object v0

    .line 395
    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_4

    .line 396
    iget-object v1, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOwnerActivity(Landroid/app/Activity;)V

    .line 398
    :cond_4
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    iget-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->c:Z

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 399
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 400
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 401
    if-eqz p1, :cond_0

    .line 402
    const-string v0, "android:savedDialogState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 403
    if-eqz v0, :cond_0

    .line 404
    iget-object v1, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method public e()V
    .locals 1

    .prologue
    .line 288
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->e()V

    .line 289
    iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->i:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->h:Z

    if-nez v0, :cond_0

    .line 293
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->h:Z

    .line 295
    :cond_0
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 420
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->e(Landroid/os/Bundle;)V

    .line 421
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 422
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    .line 423
    if-eqz v0, :cond_0

    .line 424
    const-string v1, "android:savedDialogState"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 427
    :cond_0
    iget v0, p0, Landroid/support/v4/app/DialogFragment;->a:I

    if-eqz v0, :cond_1

    .line 428
    const-string v0, "android:style"

    iget v1, p0, Landroid/support/v4/app/DialogFragment;->a:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 430
    :cond_1
    iget v0, p0, Landroid/support/v4/app/DialogFragment;->b:I

    if-eqz v0, :cond_2

    .line 431
    const-string v0, "android:theme"

    iget v1, p0, Landroid/support/v4/app/DialogFragment;->b:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 433
    :cond_2
    iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->c:Z

    if-nez v0, :cond_3

    .line 434
    const-string v0, "android:cancelable"

    iget-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->c:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 436
    :cond_3
    iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->d:Z

    if-nez v0, :cond_4

    .line 437
    const-string v0, "android:showsDialog"

    iget-boolean v1, p0, Landroid/support/v4/app/DialogFragment;->d:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 439
    :cond_4
    iget v0, p0, Landroid/support/v4/app/DialogFragment;->e:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    .line 440
    const-string v0, "android:backStackId"

    iget v1, p0, Landroid/support/v4/app/DialogFragment;->e:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 442
    :cond_5
    return-void
.end method

.method public f()V
    .locals 1

    .prologue
    .line 411
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->f()V

    .line 412
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 413
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->g:Z

    .line 414
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 416
    :cond_0
    return-void
.end method

.method public g()V
    .locals 1

    .prologue
    .line 446
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->g()V

    .line 447
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 448
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->hide()V

    .line 450
    :cond_0
    return-void
.end method

.method public h()V
    .locals 1

    .prologue
    .line 457
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->h()V

    .line 458
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 462
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->g:Z

    .line 463
    iget-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 464
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/app/DialogFragment;->f:Landroid/app/Dialog;

    .line 466
    :cond_0
    return-void
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .prologue
    .line 366
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 369
    iget-boolean v0, p0, Landroid/support/v4/app/DialogFragment;->g:Z

    if-nez v0, :cond_0

    .line 374
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/support/v4/app/DialogFragment;->a(Z)V

    .line 376
    :cond_0
    return-void
.end method
