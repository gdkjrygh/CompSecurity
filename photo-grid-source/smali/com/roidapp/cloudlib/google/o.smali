.class final Lcom/roidapp/cloudlib/google/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/b/p;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)V
    .locals 0

    .prologue
    .line 203
    iput-object p1, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .prologue
    .line 262
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->m(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    if-lez p1, :cond_0

    .line 263
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->n(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Landroid/widget/TextView;

    move-result-object v0

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

    .line 265
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 3

    .prologue
    .line 212
    instance-of v0, p2, Ljava/io/IOException;

    if-eqz v0, :cond_3

    .line 213
    const-string v0, "SearchPhotoFragment"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "download "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " network failed, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", try to download small url"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 218
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->c(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Lcom/roidapp/cloudlib/ad;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->d(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-static {v1}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->e(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Lcom/roidapp/cloudlib/ad;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/ad;->getCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 219
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->g(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Lcom/roidapp/cloudlib/ad;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-static {v1}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->f(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/ad;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 220
    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 221
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 222
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    iget-object v1, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    sget v2, Lcom/roidapp/cloudlib/at;->b:I

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->b(Ljava/lang/String;)V

    .line 235
    :cond_1
    :goto_0
    return-void

    .line 226
    :cond_2
    iget-object v1, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-static {v1}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->h(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Z

    .line 227
    iget-object v1, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 232
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 233
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    iget-object v1, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    sget v2, Lcom/roidapp/cloudlib/at;->c:I

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 241
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "image download finish, url="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", savePath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    if-eqz p2, :cond_0

    .line 244
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->i(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Landroid/app/AlertDialog;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 245
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->j(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 249
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->k(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Lcom/roidapp/cloudlib/ae;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 250
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-static {v0}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->l(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;)Lcom/roidapp/cloudlib/ae;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/roidapp/cloudlib/ae;->a(Ljava/lang/String;)V

    .line 253
    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 254
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.MEDIA_SCANNER_SCAN_FILE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 255
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 256
    iget-object v1, p0, Lcom/roidapp/cloudlib/google/o;->a:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/google/SearchPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 258
    :cond_2
    return-void
.end method
