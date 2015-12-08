.class final Lkik/android/widget/eu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# instance fields
.field final synthetic a:Lkik/android/widget/WebVideoView;


# direct methods
.method constructor <init>(Lkik/android/widget/WebVideoView;)V
    .locals 0

    .prologue
    .line 349
    iput-object p1, p0, Lkik/android/widget/eu;->a:Lkik/android/widget/WebVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onError(Landroid/media/MediaPlayer;II)Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v1, -0x1

    .line 352
    iget-object v0, p0, Lkik/android/widget/eu;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0, v1}, Lkik/android/widget/WebVideoView;->c(Lkik/android/widget/WebVideoView;I)I

    .line 353
    iget-object v0, p0, Lkik/android/widget/eu;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0, v1}, Lkik/android/widget/WebVideoView;->d(Lkik/android/widget/WebVideoView;I)I

    .line 354
    iget-object v0, p0, Lkik/android/widget/eu;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->h(Lkik/android/widget/WebVideoView;)Lkik/android/widget/VideoController;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 355
    iget-object v0, p0, Lkik/android/widget/eu;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->h(Lkik/android/widget/WebVideoView;)Lkik/android/widget/VideoController;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/widget/VideoController;->c()V

    .line 358
    :cond_0
    iget-object v0, p0, Lkik/android/widget/eu;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->j(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer$OnErrorListener;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 359
    iget-object v0, p0, Lkik/android/widget/eu;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->j(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer$OnErrorListener;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/eu;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v1}, Lkik/android/widget/WebVideoView;->g(Lkik/android/widget/WebVideoView;)Landroid/media/MediaPlayer;

    move-result-object v1

    invoke-interface {v0, v1, p2, p3}, Landroid/media/MediaPlayer$OnErrorListener;->onError(Landroid/media/MediaPlayer;II)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 400
    :cond_1
    :goto_0
    return v3

    .line 370
    :cond_2
    iget-object v0, p0, Lkik/android/widget/eu;->a:Lkik/android/widget/WebVideoView;

    invoke-virtual {v0}, Lkik/android/widget/WebVideoView;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 371
    iget-object v0, p0, Lkik/android/widget/eu;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v0}, Lkik/android/widget/WebVideoView;->k(Lkik/android/widget/WebVideoView;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 374
    const/16 v0, 0xc8

    if-ne p2, v0, :cond_3

    .line 375
    const v0, 0x1040015

    .line 381
    :goto_1
    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lkik/android/widget/eu;->a:Lkik/android/widget/WebVideoView;

    invoke-static {v2}, Lkik/android/widget/WebVideoView;->k(Lkik/android/widget/WebVideoView;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x1040012

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x1040010

    new-instance v2, Lkik/android/widget/ev;

    invoke-direct {v2, p0}, Lkik/android/widget/ev;-><init>(Lkik/android/widget/eu;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0

    .line 378
    :cond_3
    const v0, 0x1040011

    goto :goto_1
.end method
