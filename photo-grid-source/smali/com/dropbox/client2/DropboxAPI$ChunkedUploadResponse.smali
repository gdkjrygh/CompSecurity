.class public final Lcom/dropbox/client2/DropboxAPI$ChunkedUploadResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final offset:J

.field private final uploadId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 2
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
    .line 538
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 539
    const-string v0, "upload_id"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$ChunkedUploadResponse;->uploadId:Ljava/lang/String;

    .line 540
    const-string v0, "offset"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/dropbox/client2/DropboxAPI$ChunkedUploadResponse;->offset:J

    .line 541
    return-void
.end method


# virtual methods
.method public final getOffset()J
    .locals 2

    .prologue
    .line 548
    iget-wide v0, p0, Lcom/dropbox/client2/DropboxAPI$ChunkedUploadResponse;->offset:J

    return-wide v0
.end method

.method public final getUploadId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 544
    iget-object v0, p0, Lcom/dropbox/client2/DropboxAPI$ChunkedUploadResponse;->uploadId:Ljava/lang/String;

    return-object v0
.end method
