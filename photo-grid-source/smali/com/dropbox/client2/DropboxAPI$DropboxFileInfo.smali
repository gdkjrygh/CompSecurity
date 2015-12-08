.class public final Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private charset:Ljava/lang/String;

.field private fileSize:J

.field private metadata:Lcom/dropbox/client2/DropboxAPI$Entry;

.field private mimeType:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lorg/apache/http/HttpResponse;)V
    .locals 6

    .prologue
    const-wide/16 v4, -0x1

    const/4 v0, 0x0

    const/4 v2, 0x1

    .line 565
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 558
    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;->mimeType:Ljava/lang/String;

    .line 559
    iput-wide v4, p0, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;->fileSize:J

    .line 560
    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;->charset:Ljava/lang/String;

    .line 561
    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;->metadata:Lcom/dropbox/client2/DropboxAPI$Entry;

    .line 566
    invoke-static {p1}, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;->parseXDropboxMetadata(Lorg/apache/http/HttpResponse;)Lcom/dropbox/client2/DropboxAPI$Entry;

    move-result-object v0

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;->metadata:Lcom/dropbox/client2/DropboxAPI$Entry;

    .line 567
    iget-object v0, p0, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;->metadata:Lcom/dropbox/client2/DropboxAPI$Entry;

    if-nez v0, :cond_0

    .line 568
    new-instance v0, Lcom/dropbox/client2/exception/DropboxParseException;

    const-string v1, "Error parsing metadata."

    invoke-direct {v0, v1}, Lcom/dropbox/client2/exception/DropboxParseException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 571
    :cond_0
    iget-object v0, p0, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;->metadata:Lcom/dropbox/client2/DropboxAPI$Entry;

    invoke-static {p1, v0}, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;->parseFileSize(Lorg/apache/http/HttpResponse;Lcom/dropbox/client2/DropboxAPI$Entry;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;->fileSize:J

    .line 572
    iget-wide v0, p0, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;->fileSize:J

    cmp-long v0, v0, v4

    if-nez v0, :cond_1

    .line 573
    new-instance v0, Lcom/dropbox/client2/exception/DropboxParseException;

    const-string v1, "Error determining file size."

    invoke-direct {v0, v1}, Lcom/dropbox/client2/exception/DropboxParseException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 577
    :cond_1
    const-string v0, "Content-Type"

    invoke-interface {p1, v0}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v0

    .line 578
    if-eqz v0, :cond_3

    .line 579
    invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 580
    if-eqz v0, :cond_3

    .line 581
    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 582
    array-length v1, v0

    if-lez v1, :cond_2

    .line 583
    const/4 v1, 0x0

    aget-object v1, v0, v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;->mimeType:Ljava/lang/String;

    .line 585
    :cond_2
    array-length v1, v0

    if-le v1, v2, :cond_3

    .line 586
    aget-object v0, v0, v2

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 587
    array-length v1, v0

    if-le v1, v2, :cond_3

    .line 588
    aget-object v0, v0, v2

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;->charset:Ljava/lang/String;

    .line 593
    :cond_3
    return-void
.end method

.method synthetic constructor <init>(Lorg/apache/http/HttpResponse;Lcom/dropbox/client2/DropboxAPI$1;)V
    .locals 0

    .prologue
    .line 556
    invoke-direct {p0, p1}, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;-><init>(Lorg/apache/http/HttpResponse;)V

    return-void
.end method

.method private static parseFileSize(Lorg/apache/http/HttpResponse;Lcom/dropbox/client2/DropboxAPI$Entry;)J
    .locals 4

    .prologue
    .line 639
    invoke-interface {p0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContentLength()J

    move-result-wide v0

    .line 640
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    .line 649
    :goto_0
    return-wide v0

    .line 645
    :cond_0
    if-eqz p1, :cond_1

    .line 646
    iget-wide v0, p1, Lcom/dropbox/client2/DropboxAPI$Entry;->bytes:J

    goto :goto_0

    .line 649
    :cond_1
    const-wide/16 v0, -0x1

    goto :goto_0
.end method

.method private static parseXDropboxMetadata(Lorg/apache/http/HttpResponse;)Lcom/dropbox/client2/DropboxAPI$Entry;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 604
    if-nez p0, :cond_0

    move-object v0, v1

    .line 622
    :goto_0
    return-object v0

    .line 608
    :cond_0
    const-string v0, "X-Dropbox-Metadata"

    invoke-interface {p0, v0}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;

    move-result-object v0

    .line 610
    if-nez v0, :cond_1

    move-object v0, v1

    .line 611
    goto :goto_0

    .line 615
    :cond_1
    invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 1000
    new-instance v2, Ljava/io/StringReader;

    invoke-direct {v2, v0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lb/a/a/d;->a(Ljava/io/Reader;)Ljava/lang/Object;

    move-result-object v0

    .line 617
    if-nez v0, :cond_2

    move-object v0, v1

    .line 618
    goto :goto_0

    .line 621
    :cond_2
    check-cast v0, Ljava/util/Map;

    .line 622
    new-instance v1, Lcom/dropbox/client2/DropboxAPI$Entry;

    invoke-direct {v1, v0}, Lcom/dropbox/client2/DropboxAPI$Entry;-><init>(Ljava/util/Map;)V

    move-object v0, v1

    goto :goto_0
.end method


# virtual methods
.method public final getCharset()Ljava/lang/String;
    .locals 1

    .prologue
    .line 680
    iget-object v0, p0, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;->charset:Ljava/lang/String;

    return-object v0
.end method

.method public final getContentLength()J
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 665
    invoke-virtual {p0}, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;->getFileSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public final getFileSize()J
    .locals 2

    .prologue
    .line 672
    iget-wide v0, p0, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;->fileSize:J

    return-wide v0
.end method

.method public final getMetadata()Lcom/dropbox/client2/DropboxAPI$Entry;
    .locals 1

    .prologue
    .line 687
    iget-object v0, p0, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;->metadata:Lcom/dropbox/client2/DropboxAPI$Entry;

    return-object v0
.end method

.method public final getMimeType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 657
    iget-object v0, p0, Lcom/dropbox/client2/DropboxAPI$DropboxFileInfo;->mimeType:Ljava/lang/String;

    return-object v0
.end method
