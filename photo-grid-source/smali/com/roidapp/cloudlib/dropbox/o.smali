.class final Lcom/roidapp/cloudlib/dropbox/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/dropbox/client2/DropboxAPI$Entry;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/dropbox/n;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/dropbox/n;)V
    .locals 0

    .prologue
    .line 35
    iput-object p1, p0, Lcom/roidapp/cloudlib/dropbox/o;->a:Lcom/roidapp/cloudlib/dropbox/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 35
    check-cast p1, Lcom/dropbox/client2/DropboxAPI$Entry;

    check-cast p2, Lcom/dropbox/client2/DropboxAPI$Entry;

    .line 1038
    iget-boolean v0, p1, Lcom/dropbox/client2/DropboxAPI$Entry;->isDir:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p2, Lcom/dropbox/client2/DropboxAPI$Entry;->isDir:Z

    if-nez v0, :cond_0

    .line 1039
    const/4 v0, -0x1

    .line 1041
    :goto_0
    return v0

    .line 1040
    :cond_0
    iget-boolean v0, p1, Lcom/dropbox/client2/DropboxAPI$Entry;->isDir:Z

    if-nez v0, :cond_1

    iget-boolean v0, p2, Lcom/dropbox/client2/DropboxAPI$Entry;->isDir:Z

    if-eqz v0, :cond_1

    .line 1041
    const/4 v0, 0x1

    goto :goto_0

    .line 1042
    :cond_1
    iget-boolean v0, p1, Lcom/dropbox/client2/DropboxAPI$Entry;->isDir:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p2, Lcom/dropbox/client2/DropboxAPI$Entry;->isDir:Z

    .line 1045
    :cond_2
    iget-object v0, p1, Lcom/dropbox/client2/DropboxAPI$Entry;->path:Ljava/lang/String;

    iget-object v1, p2, Lcom/dropbox/client2/DropboxAPI$Entry;->path:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method
