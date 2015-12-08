.class final Lcom/roidapp/cloudlib/dropbox/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)V
    .locals 0

    .prologue
    .line 162
    iput-object p1, p0, Lcom/roidapp/cloudlib/dropbox/i;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/i;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->h()Z

    .line 166
    return-void
.end method
