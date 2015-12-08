.class final Lcom/roidapp/cloudlib/dropbox/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)V
    .locals 0

    .prologue
    .line 182
    iput-object p1, p0, Lcom/roidapp/cloudlib/dropbox/j;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 185
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 186
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/j;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->h()Z

    .line 188
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
