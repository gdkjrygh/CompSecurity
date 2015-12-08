.class final Lcom/kik/sdkutils/s;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/support/v4/app/Fragment;

.field final synthetic b:Lcom/kik/g/r;


# direct methods
.method constructor <init>(Landroid/support/v4/app/Fragment;Lcom/kik/g/r;)V
    .locals 0

    .prologue
    .line 283
    iput-object p1, p0, Lcom/kik/sdkutils/s;->a:Landroid/support/v4/app/Fragment;

    iput-object p2, p0, Lcom/kik/sdkutils/s;->b:Lcom/kik/g/r;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 288
    iget-object v0, p0, Lcom/kik/sdkutils/s;->a:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 290
    if-nez v0, :cond_0

    .line 301
    :goto_0
    return-void

    .line 294
    :cond_0
    new-instance v1, Lcom/kik/sdkutils/t;

    invoke-direct {v1, p0}, Lcom/kik/sdkutils/t;-><init>(Lcom/kik/sdkutils/s;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 360
    iget-object v0, p0, Lcom/kik/sdkutils/s;->a:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 362
    if-nez v0, :cond_0

    .line 373
    :goto_0
    return-void

    .line 366
    :cond_0
    new-instance v1, Lcom/kik/sdkutils/x;

    invoke-direct {v1, p0, p1}, Lcom/kik/sdkutils/x;-><init>(Lcom/kik/sdkutils/s;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 342
    iget-object v0, p0, Lcom/kik/sdkutils/s;->a:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 344
    if-nez v0, :cond_0

    .line 355
    :goto_0
    return-void

    .line 348
    :cond_0
    new-instance v1, Lcom/kik/sdkutils/w;

    invoke-direct {v1, p0, p1}, Lcom/kik/sdkutils/w;-><init>(Lcom/kik/sdkutils/s;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 306
    iget-object v0, p0, Lcom/kik/sdkutils/s;->a:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 308
    if-nez v0, :cond_0

    .line 319
    :goto_0
    return-void

    .line 312
    :cond_0
    new-instance v1, Lcom/kik/sdkutils/u;

    invoke-direct {v1, p0}, Lcom/kik/sdkutils/u;-><init>(Lcom/kik/sdkutils/s;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 324
    iget-object v0, p0, Lcom/kik/sdkutils/s;->a:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 326
    if-nez v0, :cond_0

    .line 337
    :goto_0
    return-void

    .line 330
    :cond_0
    new-instance v1, Lcom/kik/sdkutils/v;

    invoke-direct {v1, p0, p1}, Lcom/kik/sdkutils/v;-><init>(Lcom/kik/sdkutils/s;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method
