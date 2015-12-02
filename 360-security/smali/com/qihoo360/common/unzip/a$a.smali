.class public Lcom/qihoo360/common/unzip/a$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/common/unzip/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/common/unzip/a$a$a;
    }
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:I

.field c:I

.field d:J

.field e:J

.field f:J

.field final synthetic g:Lcom/qihoo360/common/unzip/a;


# direct methods
.method public constructor <init>(Lcom/qihoo360/common/unzip/a;)V
    .locals 0

    .prologue
    .line 396
    iput-object p1, p0, Lcom/qihoo360/common/unzip/a$a;->g:Lcom/qihoo360/common/unzip/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo360/common/unzip/a$a;)Lcom/qihoo360/common/unzip/a;
    .locals 1

    .prologue
    .line 396
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a$a;->g:Lcom/qihoo360/common/unzip/a;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 428
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/io/InputStream;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 439
    iget-wide v2, p0, Lcom/qihoo360/common/unzip/a$a;->f:J

    .line 440
    new-instance v0, Lcom/qihoo360/common/unzip/a$a$a;

    iget-wide v4, p0, Lcom/qihoo360/common/unzip/a$a;->d:J

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/qihoo360/common/unzip/a$a$a;-><init>(Lcom/qihoo360/common/unzip/a$a;JJ)V

    .line 441
    iget v1, p0, Lcom/qihoo360/common/unzip/a$a;->c:I

    sparse-switch v1, :sswitch_data_0

    .line 455
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Unsupported compression method "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/qihoo360/common/unzip/a$a;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 445
    :sswitch_0
    invoke-virtual {v0}, Lcom/qihoo360/common/unzip/a$a$a;->a()V

    .line 446
    new-instance v2, Ljava/util/zip/Inflater;

    const/4 v1, 0x1

    invoke-direct {v2, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 447
    new-instance v1, Lcom/qihoo360/common/unzip/a$a$1;

    invoke-direct {v1, p0, v0, v2, v2}, Lcom/qihoo360/common/unzip/a$a$1;-><init>(Lcom/qihoo360/common/unzip/a$a;Ljava/io/InputStream;Ljava/util/zip/Inflater;Ljava/util/zip/Inflater;)V

    move-object v0, v1

    :sswitch_1
    return-object v0

    .line 441
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x8 -> :sswitch_0
    .end sparse-switch
.end method

.method c()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const-wide/16 v6, 0x1a

    const-wide/16 v4, 0x2

    .line 498
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a$a;->g:Lcom/qihoo360/common/unzip/a;

    iget-object v0, v0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    iget-wide v2, p0, Lcom/qihoo360/common/unzip/a$a;->e:J

    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 501
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a$a;->g:Lcom/qihoo360/common/unzip/a;

    iget-object v0, v0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lcom/qihoo360/common/unzip/a$a;->g:Lcom/qihoo360/common/unzip/a;

    invoke-static {v1}, Lcom/qihoo360/common/unzip/a;->a(Lcom/qihoo360/common/unzip/a;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 503
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a$a;->g:Lcom/qihoo360/common/unzip/a;

    invoke-static {v0}, Lcom/qihoo360/common/unzip/a;->a(Lcom/qihoo360/common/unzip/a;)[B

    move-result-object v0

    sget-object v1, Lcom/qihoo360/common/unzip/ZipLong;->LFH_SIG:Lcom/qihoo360/common/unzip/ZipLong;

    invoke-virtual {v1}, Lcom/qihoo360/common/unzip/ZipLong;->getBytes()[B

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 504
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a$a;->g:Lcom/qihoo360/common/unzip/a;

    iget-object v0, v0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    iget-wide v2, p0, Lcom/qihoo360/common/unzip/a$a;->e:J

    add-long/2addr v2, v6

    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 506
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a$a;->g:Lcom/qihoo360/common/unzip/a;

    iget-object v0, v0, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lcom/qihoo360/common/unzip/a$a;->g:Lcom/qihoo360/common/unzip/a;

    invoke-static {v1}, Lcom/qihoo360/common/unzip/a;->c(Lcom/qihoo360/common/unzip/a;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 507
    iget-object v0, p0, Lcom/qihoo360/common/unzip/a$a;->g:Lcom/qihoo360/common/unzip/a;

    invoke-static {v0}, Lcom/qihoo360/common/unzip/a;->c(Lcom/qihoo360/common/unzip/a;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/unzip/ZipShort;->getValue([B)I

    move-result v0

    .line 508
    iget-object v1, p0, Lcom/qihoo360/common/unzip/a$a;->g:Lcom/qihoo360/common/unzip/a;

    iget-object v1, v1, Lcom/qihoo360/common/unzip/a;->a:Ljava/io/RandomAccessFile;

    iget-object v2, p0, Lcom/qihoo360/common/unzip/a$a;->g:Lcom/qihoo360/common/unzip/a;

    invoke-static {v2}, Lcom/qihoo360/common/unzip/a;->c(Lcom/qihoo360/common/unzip/a;)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 509
    iget-object v1, p0, Lcom/qihoo360/common/unzip/a$a;->g:Lcom/qihoo360/common/unzip/a;

    invoke-static {v1}, Lcom/qihoo360/common/unzip/a;->c(Lcom/qihoo360/common/unzip/a;)[B

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo360/common/unzip/ZipShort;->getValue([B)I

    move-result v1

    .line 511
    iget-wide v2, p0, Lcom/qihoo360/common/unzip/a$a;->e:J

    add-long/2addr v2, v6

    add-long/2addr v2, v4

    add-long/2addr v2, v4

    int-to-long v4, v0

    add-long/2addr v2, v4

    int-to-long v0, v1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/qihoo360/common/unzip/a$a;->f:J

    .line 516
    return-void

    .line 514
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Invalid entry LFH offset: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lcom/qihoo360/common/unzip/a$a;->e:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
