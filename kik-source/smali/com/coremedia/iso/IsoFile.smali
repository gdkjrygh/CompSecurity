.class public Lcom/coremedia/iso/IsoFile;
.super Lcom/googlecode/mp4parser/BasicContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation runtime Lcom/googlecode/mp4parser/annotations/DoNotParseDetail;
.end annotation


# static fields
.field private static LOG:Lcom/googlecode/mp4parser/util/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    const-class v0, Lcom/coremedia/iso/IsoFile;

    invoke-static {v0}, Lcom/googlecode/mp4parser/util/Logger;->getLogger(Ljava/lang/Class;)Lcom/googlecode/mp4parser/util/Logger;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/IsoFile;->LOG:Lcom/googlecode/mp4parser/util/Logger;

    return-void
.end method

.method public constructor <init>(Lcom/googlecode/mp4parser/DataSource;)V
    .locals 2

    .prologue
    .line 59
    new-instance v0, Lcom/coremedia/iso/PropertyBoxParserImpl;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/coremedia/iso/PropertyBoxParserImpl;-><init>([Ljava/lang/String;)V

    invoke-direct {p0, p1, v0}, Lcom/coremedia/iso/IsoFile;-><init>(Lcom/googlecode/mp4parser/DataSource;Lcom/coremedia/iso/BoxParser;)V

    .line 61
    return-void
.end method

.method public constructor <init>(Lcom/googlecode/mp4parser/DataSource;Lcom/coremedia/iso/BoxParser;)V
    .locals 2

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/googlecode/mp4parser/BasicContainer;-><init>()V

    .line 64
    invoke-interface {p1}, Lcom/googlecode/mp4parser/DataSource;->size()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/coremedia/iso/IsoFile;->initContainer(Lcom/googlecode/mp4parser/DataSource;JLcom/coremedia/iso/BoxParser;)V

    .line 65
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 50
    new-instance v0, Lcom/googlecode/mp4parser/FileDataSourceImpl;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/googlecode/mp4parser/FileDataSourceImpl;-><init>(Ljava/io/File;)V

    invoke-direct {p0, v0}, Lcom/coremedia/iso/IsoFile;-><init>(Lcom/googlecode/mp4parser/DataSource;)V

    .line 51
    return-void
.end method

.method public static bytesToFourCC([B)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v3, 0x4

    const/4 v2, 0x0

    .line 78
    new-array v0, v3, [B

    .line 79
    if-eqz p0, :cond_0

    .line 80
    array-length v1, p0

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 83
    :cond_0
    :try_start_0
    new-instance v1, Ljava/lang/String;

    const-string v2, "ISO-8859-1"

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 84
    :catch_0
    move-exception v0

    .line 85
    new-instance v1, Ljava/lang/Error;

    const-string v2, "Required character encoding is missing"

    invoke-direct {v1, v2, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static fourCCtoBytes(Ljava/lang/String;)[B
    .locals 4

    .prologue
    const/4 v3, 0x4

    .line 68
    new-array v1, v3, [B

    .line 69
    if-eqz p0, :cond_0

    .line 70
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-lt v0, v2, :cond_1

    .line 74
    :cond_0
    return-object v1

    .line 71
    :cond_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    .line 70
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public close()V
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/coremedia/iso/IsoFile;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/DataSource;->close()V

    .line 116
    return-void
.end method

.method public getBox(Ljava/nio/channels/WritableByteChannel;)V
    .locals 0

    .prologue
    .line 111
    invoke-virtual {p0, p1}, Lcom/coremedia/iso/IsoFile;->writeContainer(Ljava/nio/channels/WritableByteChannel;)V

    .line 112
    return-void
.end method

.method public getMovieBox()Lcom/coremedia/iso/boxes/MovieBox;
    .locals 3

    .prologue
    .line 102
    invoke-virtual {p0}, Lcom/coremedia/iso/IsoFile;->getBoxes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 107
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 102
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/Box;

    .line 103
    instance-of v2, v0, Lcom/coremedia/iso/boxes/MovieBox;

    if-eqz v2, :cond_0

    .line 104
    check-cast v0, Lcom/coremedia/iso/boxes/MovieBox;

    goto :goto_0
.end method

.method public getSize()J
    .locals 2

    .prologue
    .line 91
    invoke-virtual {p0}, Lcom/coremedia/iso/IsoFile;->getContainerSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "model("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/coremedia/iso/IsoFile;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
