.class final Lcom/roidapp/cloudlib/instagram/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;)V
    .locals 0

    .prologue
    .line 173
    iput-object p1, p0, Lcom/roidapp/cloudlib/instagram/o;->a:Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 176
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 177
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/o;->a:Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->a(Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;)V

    .line 179
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
