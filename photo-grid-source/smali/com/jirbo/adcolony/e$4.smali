.class Lcom/jirbo/adcolony/e$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/e;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/e;)V
    .locals 0

    .prologue
    .line 380
    iput-object p1, p0, Lcom/jirbo/adcolony/e$4;->a:Lcom/jirbo/adcolony/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, -0x1

    .line 382
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 383
    iget-object v0, p0, Lcom/jirbo/adcolony/e$4;->a:Lcom/jirbo/adcolony/e;

    iput v2, v0, Lcom/jirbo/adcolony/e;->o:I

    .line 384
    iget-object v0, p0, Lcom/jirbo/adcolony/e$4;->a:Lcom/jirbo/adcolony/e;

    iput v2, v0, Lcom/jirbo/adcolony/e;->p:I

    .line 385
    iget-object v0, p0, Lcom/jirbo/adcolony/e$4;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    if-eqz v0, :cond_0

    .line 386
    iget-object v0, p0, Lcom/jirbo/adcolony/e$4;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->w:Landroid/widget/MediaController;

    invoke-virtual {v0}, Landroid/widget/MediaController;->hide()V

    .line 390
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/e$4;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->A:Landroid/media/MediaPlayer$OnErrorListener;

    if-eqz v0, :cond_2

    .line 391
    iget-object v0, p0, Lcom/jirbo/adcolony/e$4;->a:Lcom/jirbo/adcolony/e;

    iget-object v0, v0, Lcom/jirbo/adcolony/e;->A:Landroid/media/MediaPlayer$OnErrorListener;

    iget-object v1, p0, Lcom/jirbo/adcolony/e$4;->a:Lcom/jirbo/adcolony/e;

    iget-object v1, v1, Lcom/jirbo/adcolony/e;->r:Landroid/media/MediaPlayer;

    invoke-interface {v0, v1, p2, p3}, Landroid/media/MediaPlayer$OnErrorListener;->onError(Landroid/media/MediaPlayer;II)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 428
    :cond_1
    :goto_0
    return v3

    .line 401
    :cond_2
    iget-object v0, p0, Lcom/jirbo/adcolony/e$4;->a:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 402
    iget-object v0, p0, Lcom/jirbo/adcolony/e$4;->a:Lcom/jirbo/adcolony/e;

    invoke-virtual {v0}, Lcom/jirbo/adcolony/e;->b()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    .line 405
    const/16 v0, 0xc8

    if-ne p2, v0, :cond_3

    .line 406
    const-string v0, "Invalid progressive playback"

    .line 411
    :goto_1
    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/jirbo/adcolony/e$4;->a:Lcom/jirbo/adcolony/e;

    invoke-virtual {v2}, Lcom/jirbo/adcolony/e;->b()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v2, "ERROR"

    .line 412
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 413
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "OKAY"

    new-instance v2, Lcom/jirbo/adcolony/e$4$1;

    invoke-direct {v2, p0}, Lcom/jirbo/adcolony/e$4$1;-><init>(Lcom/jirbo/adcolony/e$4;)V

    .line 414
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 425
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 426
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0

    .line 408
    :cond_3
    const-string v0, "Unknown error"

    goto :goto_1
.end method
