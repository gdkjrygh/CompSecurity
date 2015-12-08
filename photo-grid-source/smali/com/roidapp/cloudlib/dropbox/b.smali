.class public final Lcom/roidapp/cloudlib/dropbox/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/a/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/a/c",
        "<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/dropbox/client2/DropboxAPI;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/dropbox/client2/DropboxAPI",
            "<*>;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/dropbox/client2/DropboxAPI;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/dropbox/client2/DropboxAPI",
            "<*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/roidapp/cloudlib/dropbox/b;->a:Lcom/dropbox/client2/DropboxAPI;

    .line 24
    iput-object p2, p0, Lcom/roidapp/cloudlib/dropbox/b;->b:Ljava/lang/String;

    .line 25
    return-void
.end method

.method private d()Ljava/io/InputStream;
    .locals 5

    .prologue
    .line 30
    :try_start_0
    new-instance v0, Ljava/io/BufferedInputStream;

    iget-object v1, p0, Lcom/roidapp/cloudlib/dropbox/b;->a:Lcom/dropbox/client2/DropboxAPI;

    iget-object v2, p0, Lcom/roidapp/cloudlib/dropbox/b;->b:Ljava/lang/String;

    sget-object v3, Lcom/dropbox/client2/DropboxAPI$ThumbSize;->ICON_256x256:Lcom/dropbox/client2/DropboxAPI$ThumbSize;

    sget-object v4, Lcom/dropbox/client2/DropboxAPI$ThumbFormat;->JPEG:Lcom/dropbox/client2/DropboxAPI$ThumbFormat;

    invoke-virtual {v1, v2, v3, v4}, Lcom/dropbox/client2/DropboxAPI;->getThumbnailStream(Ljava/lang/String;Lcom/dropbox/client2/DropboxAPI$ThumbSize;Lcom/dropbox/client2/DropboxAPI$ThumbFormat;)Lcom/dropbox/client2/DropboxAPI$DropboxInputStream;

    move-result-object v1

    const/16 v2, 0x1000

    invoke-direct {v0, v1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 36
    :catch_0
    move-exception v0

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0
.end method


# virtual methods
.method public final synthetic a(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/roidapp/cloudlib/dropbox/b;->d()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final a()V
    .locals 0

    .prologue
    .line 43
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/roidapp/cloudlib/dropbox/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()V
    .locals 0

    .prologue
    .line 53
    return-void
.end method
