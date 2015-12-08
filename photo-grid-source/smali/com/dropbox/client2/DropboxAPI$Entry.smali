.class public Lcom/dropbox/client2/DropboxAPI$Entry;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final JsonExtractor:Lcom/dropbox/client2/jsonextract/JsonExtractor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/dropbox/client2/jsonextract/JsonExtractor",
            "<",
            "Lcom/dropbox/client2/DropboxAPI$Entry;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public bytes:J

.field public clientMtime:Ljava/lang/String;

.field public contents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/dropbox/client2/DropboxAPI$Entry;",
            ">;"
        }
    .end annotation
.end field

.field public hash:Ljava/lang/String;

.field public icon:Ljava/lang/String;

.field public isDeleted:Z

.field public isDir:Z

.field public mimeType:Ljava/lang/String;

.field public modified:Ljava/lang/String;

.field public path:Ljava/lang/String;

.field public readOnly:Z

.field public rev:Ljava/lang/String;

.field public root:Ljava/lang/String;

.field public size:Ljava/lang/String;

.field public thumbExists:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 518
    new-instance v0, Lcom/dropbox/client2/DropboxAPI$Entry$1;

    invoke-direct {v0}, Lcom/dropbox/client2/DropboxAPI$Entry$1;-><init>()V

    sput-object v0, Lcom/dropbox/client2/DropboxAPI$Entry;->JsonExtractor:Lcom/dropbox/client2/jsonextract/JsonExtractor;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 494
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 495
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 462
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 463
    const-string v0, "bytes"

    invoke-static {p1, v0}, Lcom/dropbox/client2/DropboxAPI;->getFromMapAsLong(Ljava/util/Map;Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->bytes:J

    .line 464
    const-string v0, "hash"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->hash:Ljava/lang/String;

    .line 465
    const-string v0, "icon"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->icon:Ljava/lang/String;

    .line 466
    const-string v0, "is_dir"

    invoke-static {p1, v0}, Lcom/dropbox/client2/DropboxAPI;->getFromMapAsBoolean(Ljava/util/Map;Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->isDir:Z

    .line 467
    const-string v0, "modified"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->modified:Ljava/lang/String;

    .line 468
    const-string v0, "client_mtime"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->clientMtime:Ljava/lang/String;

    .line 469
    const-string v0, "path"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->path:Ljava/lang/String;

    .line 470
    const-string v0, "read_only"

    invoke-static {p1, v0}, Lcom/dropbox/client2/DropboxAPI;->getFromMapAsBoolean(Ljava/util/Map;Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->readOnly:Z

    .line 471
    const-string v0, "root"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->root:Ljava/lang/String;

    .line 472
    const-string v0, "size"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->size:Ljava/lang/String;

    .line 473
    const-string v0, "mime_type"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->mimeType:Ljava/lang/String;

    .line 474
    const-string v0, "rev"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->rev:Ljava/lang/String;

    .line 475
    const-string v0, "thumb_exists"

    invoke-static {p1, v0}, Lcom/dropbox/client2/DropboxAPI;->getFromMapAsBoolean(Ljava/util/Map;Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->thumbExists:Z

    .line 476
    const-string v0, "is_deleted"

    invoke-static {p1, v0}, Lcom/dropbox/client2/DropboxAPI;->getFromMapAsBoolean(Ljava/util/Map;Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->isDeleted:Z

    .line 478
    const-string v0, "contents"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 479
    if-eqz v0, :cond_1

    instance-of v1, v0, Lb/a/a/a;

    if-eqz v1, :cond_1

    .line 480
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->contents:Ljava/util/List;

    .line 482
    check-cast v0, Lb/a/a/a;

    invoke-virtual {v0}, Lb/a/a/a;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 483
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 484
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 485
    instance-of v2, v0, Ljava/util/Map;

    if-eqz v2, :cond_0

    .line 486
    iget-object v2, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->contents:Ljava/util/List;

    new-instance v3, Lcom/dropbox/client2/DropboxAPI$Entry;

    check-cast v0, Ljava/util/Map;

    invoke-direct {v3, v0}, Lcom/dropbox/client2/DropboxAPI$Entry;-><init>(Ljava/util/Map;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 490
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->contents:Ljava/util/List;

    .line 492
    :cond_2
    return-void
.end method


# virtual methods
.method public fileName()Ljava/lang/String;
    .locals 3

    .prologue
    .line 502
    iget-object v0, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->path:Ljava/lang/String;

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    .line 503
    iget-object v1, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->path:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x1

    iget-object v2, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->path:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public parentPath()Ljava/lang/String;
    .locals 3

    .prologue
    .line 510
    iget-object v0, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->path:Ljava/lang/String;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 511
    const-string v0, ""

    .line 514
    :goto_0
    return-object v0

    .line 513
    :cond_0
    iget-object v0, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->path:Ljava/lang/String;

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    .line 514
    iget-object v1, p0, Lcom/dropbox/client2/DropboxAPI$Entry;->path:Ljava/lang/String;

    const/4 v2, 0x0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
