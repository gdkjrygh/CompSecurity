.class final Lcom/roidapp/cloudlib/dropbox/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;)V
    .locals 0

    .prologue
    .line 143
    iput-object p1, p0, Lcom/roidapp/cloudlib/dropbox/g;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 147
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/g;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    iget-object v0, v0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->p:Ljava/lang/String;

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    .line 148
    iget-object v1, p0, Lcom/roidapp/cloudlib/dropbox/g;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    iget-object v1, v1, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->p:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 149
    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 150
    const-string v0, "/"

    .line 151
    :cond_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/dropbox/g;->a:Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->c(Ljava/lang/String;)V

    .line 152
    return-void
.end method
