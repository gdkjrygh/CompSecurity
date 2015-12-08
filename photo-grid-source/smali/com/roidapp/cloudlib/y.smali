.class final Lcom/roidapp/cloudlib/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/b/p;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/roidapp/cloudlib/t;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/t;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 243
    iput-object p1, p0, Lcom/roidapp/cloudlib/y;->b:Lcom/roidapp/cloudlib/t;

    iput-object p2, p0, Lcom/roidapp/cloudlib/y;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .prologue
    .line 290
    iget-object v0, p0, Lcom/roidapp/cloudlib/y;->b:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->m:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 291
    iget-object v0, p0, Lcom/roidapp/cloudlib/y;->b:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->m:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 293
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 3

    .prologue
    .line 253
    iget-object v0, p0, Lcom/roidapp/cloudlib/y;->b:Lcom/roidapp/cloudlib/t;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/t;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 254
    iget-object v0, p0, Lcom/roidapp/cloudlib/y;->b:Lcom/roidapp/cloudlib/t;

    iget-object v1, p0, Lcom/roidapp/cloudlib/y;->b:Lcom/roidapp/cloudlib/t;

    sget v2, Lcom/roidapp/cloudlib/at;->c:I

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/t;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/t;->b(Ljava/lang/String;)V

    .line 258
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/y;->a:Ljava/lang/String;

    const-string v1, "DropBoxPhotoFragment"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 261
    iget-object v0, p0, Lcom/roidapp/cloudlib/y;->a:Ljava/lang/String;

    const-string v1, "FbPhotoFragment"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 264
    iget-object v0, p0, Lcom/roidapp/cloudlib/y;->a:Ljava/lang/String;

    const-string v1, "FlickrPhotoFragment"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 267
    iget-object v0, p0, Lcom/roidapp/cloudlib/y;->a:Ljava/lang/String;

    const-string v1, "InstagramPhotoFragment"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 270
    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "image download finish, url="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", savePath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    iget-object v0, p0, Lcom/roidapp/cloudlib/y;->b:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    .line 276
    iget-object v0, p0, Lcom/roidapp/cloudlib/y;->b:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->f:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 278
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/y;->b:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->j:Lcom/roidapp/cloudlib/ae;

    if-eqz v0, :cond_1

    .line 279
    iget-object v0, p0, Lcom/roidapp/cloudlib/y;->b:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->j:Lcom/roidapp/cloudlib/ae;

    invoke-interface {v0, p2}, Lcom/roidapp/cloudlib/ae;->a(Ljava/lang/String;)V

    .line 281
    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 282
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.MEDIA_SCANNER_SCAN_FILE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 283
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 284
    iget-object v1, p0, Lcom/roidapp/cloudlib/y;->b:Lcom/roidapp/cloudlib/t;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/t;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 286
    :cond_2
    return-void
.end method
