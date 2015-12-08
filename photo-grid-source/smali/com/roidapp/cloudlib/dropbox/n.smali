.class public final Lcom/roidapp/cloudlib/dropbox/n;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Lcom/roidapp/cloudlib/dropbox/c;",
        ">;"
    }
.end annotation


# instance fields
.field a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Lcom/dropbox/client2/DropboxAPI$Entry;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/dropbox/client2/DropboxAPI;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/dropbox/client2/DropboxAPI",
            "<*>;"
        }
    .end annotation
.end field

.field private d:Z


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;Lcom/dropbox/client2/DropboxAPI;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;",
            "Lcom/dropbox/client2/DropboxAPI",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 35
    new-instance v0, Lcom/roidapp/cloudlib/dropbox/o;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/dropbox/o;-><init>(Lcom/roidapp/cloudlib/dropbox/n;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/n;->a:Ljava/util/Comparator;

    .line 27
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/dropbox/n;->b:Ljava/lang/ref/WeakReference;

    .line 28
    iput-object p2, p0, Lcom/roidapp/cloudlib/dropbox/n;->c:Lcom/dropbox/client2/DropboxAPI;

    .line 29
    return-void
.end method

.method private varargs a([Ljava/lang/String;)Lcom/roidapp/cloudlib/dropbox/c;
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v0, 0x0

    .line 60
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/dropbox/n;->d:Z

    .line 61
    aget-object v1, p1, v0

    .line 62
    const-string v0, "LoadDropBoxPhotoTask"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "load path is "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    new-instance v6, Lcom/roidapp/cloudlib/dropbox/c;

    invoke-direct {v6}, Lcom/roidapp/cloudlib/dropbox/c;-><init>()V

    .line 65
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/n;->c:Lcom/dropbox/client2/DropboxAPI;

    invoke-virtual {v0}, Lcom/dropbox/client2/DropboxAPI;->getSession()Lcom/dropbox/client2/session/Session;

    move-result-object v0

    invoke-interface {v0}, Lcom/dropbox/client2/session/Session;->isLinked()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 68
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/n;->c:Lcom/dropbox/client2/DropboxAPI;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/dropbox/client2/DropboxAPI;->metadata(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)Lcom/dropbox/client2/DropboxAPI$Entry;

    move-result-object v0

    .line 69
    const-string v1, "LoadDropBoxPhotoTask"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "The file dir : "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v3, v0, Lcom/dropbox/client2/DropboxAPI$Entry;->isDir:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    iget-object v0, v0, Lcom/dropbox/client2/DropboxAPI$Entry;->contents:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/dropbox/client2/DropboxAPI$Entry;

    .line 72
    const-string v2, "DbExampleLog"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "The file\'s rev is now: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v0, Lcom/dropbox/client2/DropboxAPI$Entry;->rev:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ",name is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/dropbox/client2/DropboxAPI$Entry;->fileName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " type"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, v0, Lcom/dropbox/client2/DropboxAPI$Entry;->mimeType:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    iget-boolean v2, v0, Lcom/dropbox/client2/DropboxAPI$Entry;->isDir:Z

    if-nez v2, :cond_1

    sget-object v2, Lcom/roidapp/cloudlib/dropbox/a;->i:Ljava/lang/String;

    iget-object v3, v0, Lcom/dropbox/client2/DropboxAPI$Entry;->mimeType:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 76
    :cond_1
    iget-object v2, v6, Lcom/roidapp/cloudlib/dropbox/c;->a:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/dropbox/client2/exception/DropboxException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 88
    :catch_0
    move-exception v0

    .line 89
    invoke-virtual {v0}, Lcom/dropbox/client2/exception/DropboxException;->getMessage()Ljava/lang/String;

    move-result-object v1

    .line 90
    if-eqz v1, :cond_2

    const-string v2, "certificate"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 91
    iput-boolean v7, p0, Lcom/roidapp/cloudlib/dropbox/n;->d:Z

    .line 93
    :cond_2
    invoke-virtual {v0}, Lcom/dropbox/client2/exception/DropboxException;->printStackTrace()V

    :cond_3
    :goto_1
    move-object v0, v6

    .line 98
    :goto_2
    return-object v0

    .line 79
    :cond_4
    :try_start_1
    iget-object v0, v6, Lcom/roidapp/cloudlib/dropbox/c;->a:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/cloudlib/dropbox/n;->a:Ljava/util/Comparator;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_1
    .catch Lcom/dropbox/client2/exception/DropboxException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_1

    move-object v0, v6

    .line 87
    goto :goto_2

    .line 95
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Error;->printStackTrace()V

    goto :goto_1
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 18
    check-cast p1, [Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/dropbox/n;->a([Ljava/lang/String;)Lcom/roidapp/cloudlib/dropbox/c;

    move-result-object v0

    return-object v0
.end method

.method protected final onCancelled()V
    .locals 2

    .prologue
    .line 116
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/n;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    .line 117
    if-eqz v0, :cond_0

    .line 118
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->a(Lcom/roidapp/cloudlib/dropbox/c;)V

    .line 120
    :cond_0
    return-void
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 18
    check-cast p1, Lcom/roidapp/cloudlib/dropbox/c;

    .line 1103
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/n;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;

    .line 1104
    if-eqz v0, :cond_1

    .line 1105
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/dropbox/n;->d:Z

    if-eqz v1, :cond_0

    .line 1106
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 1107
    if-eqz v1, :cond_0

    .line 1108
    sget v2, Lcom/roidapp/cloudlib/at;->aZ:I

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 1110
    :cond_0
    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/dropbox/DropBoxPhotoFragment;->a(Lcom/roidapp/cloudlib/dropbox/c;)V

    .line 18
    :cond_1
    return-void
.end method

.method protected final onPreExecute()V
    .locals 0

    .prologue
    .line 53
    invoke-super {p0}, Lcom/roidapp/baselib/c/c;->onPreExecute()V

    .line 54
    return-void
.end method
