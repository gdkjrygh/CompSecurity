.class public abstract Lcom/coremedia/iso/AbstractBoxParser;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/coremedia/iso/BoxParser;


# static fields
.field private static LOG:Ljava/util/logging/Logger;


# instance fields
.field header:Ljava/lang/ThreadLocal;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    const-class v0, Lcom/coremedia/iso/AbstractBoxParser;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/coremedia/iso/AbstractBoxParser;->LOG:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Lcom/coremedia/iso/AbstractBoxParser$1;

    invoke-direct {v0, p0}, Lcom/coremedia/iso/AbstractBoxParser$1;-><init>(Lcom/coremedia/iso/AbstractBoxParser;)V

    iput-object v0, p0, Lcom/coremedia/iso/AbstractBoxParser;->header:Ljava/lang/ThreadLocal;

    .line 31
    return-void
.end method


# virtual methods
.method public abstract createBox(Ljava/lang/String;[BLjava/lang/String;)Lcom/coremedia/iso/boxes/Box;
.end method

.method public parseBox(Lcom/googlecode/mp4parser/DataSource;Lcom/coremedia/iso/boxes/Container;)Lcom/coremedia/iso/boxes/Box;
    .locals 12

    .prologue
    const-wide/16 v10, 0x8

    const-wide/16 v8, 0x1

    const/4 v4, 0x0

    const/16 v5, 0x10

    const/16 v1, 0x8

    .line 52
    invoke-interface {p1}, Lcom/googlecode/mp4parser/DataSource;->position()J

    move-result-wide v2

    .line 53
    iget-object v0, p0, Lcom/coremedia/iso/AbstractBoxParser;->header:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/nio/Buffer;->limit(I)Ljava/nio/Buffer;

    .line 57
    :cond_0
    iget-object v0, p0, Lcom/coremedia/iso/AbstractBoxParser;->header:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-interface {p1, v0}, Lcom/googlecode/mp4parser/DataSource;->read(Ljava/nio/ByteBuffer;)I

    move-result v0

    if-ne v0, v1, :cond_1

    .line 65
    iget-object v0, p0, Lcom/coremedia/iso/AbstractBoxParser;->header:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 67
    iget-object v0, p0, Lcom/coremedia/iso/AbstractBoxParser;->header:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lcom/coremedia/iso/IsoTypeReader;->readUInt32(Ljava/nio/ByteBuffer;)J

    move-result-wide v2

    .line 69
    cmp-long v0, v2, v10

    if-gez v0, :cond_2

    cmp-long v0, v2, v8

    if-lez v0, :cond_2

    .line 70
    sget-object v0, Lcom/coremedia/iso/AbstractBoxParser;->LOG:Ljava/util/logging/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "Plausibility check failed: size < 8 (size = "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "). Stop parsing!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 108
    :goto_0
    return-object v4

    .line 58
    :cond_1
    if-gez v0, :cond_0

    .line 59
    invoke-interface {p1, v2, v3}, Lcom/googlecode/mp4parser/DataSource;->position(J)V

    .line 60
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 75
    :cond_2
    iget-object v0, p0, Lcom/coremedia/iso/AbstractBoxParser;->header:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lcom/coremedia/iso/IsoTypeReader;->read4cc(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v7

    .line 80
    cmp-long v0, v2, v8

    if-nez v0, :cond_3

    .line 81
    iget-object v0, p0, Lcom/coremedia/iso/AbstractBoxParser;->header:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 82
    iget-object v0, p0, Lcom/coremedia/iso/AbstractBoxParser;->header:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-interface {p1, v0}, Lcom/googlecode/mp4parser/DataSource;->read(Ljava/nio/ByteBuffer;)I

    .line 83
    iget-object v0, p0, Lcom/coremedia/iso/AbstractBoxParser;->header:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 84
    iget-object v0, p0, Lcom/coremedia/iso/AbstractBoxParser;->header:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-static {v0}, Lcom/coremedia/iso/IsoTypeReader;->readUInt64(Ljava/nio/ByteBuffer;)J

    move-result-wide v0

    .line 85
    const-wide/16 v2, 0x10

    sub-long/2addr v0, v2

    move-wide v2, v0

    .line 92
    :goto_1
    const-string v0, "uuid"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 93
    iget-object v0, p0, Lcom/coremedia/iso/AbstractBoxParser;->header:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lcom/coremedia/iso/AbstractBoxParser;->header:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v1

    add-int/lit8 v1, v1, 0x10

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 94
    iget-object v0, p0, Lcom/coremedia/iso/AbstractBoxParser;->header:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-interface {p1, v0}, Lcom/googlecode/mp4parser/DataSource;->read(Ljava/nio/ByteBuffer;)I

    .line 95
    new-array v6, v5, [B

    .line 96
    iget-object v0, p0, Lcom/coremedia/iso/AbstractBoxParser;->header:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    add-int/lit8 v0, v0, -0x10

    move v1, v0

    :goto_2
    iget-object v0, p0, Lcom/coremedia/iso/AbstractBoxParser;->header:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    if-lt v1, v0, :cond_5

    .line 99
    const-wide/16 v0, 0x10

    sub-long v4, v2, v0

    move-object v1, v6

    .line 101
    :goto_3
    instance-of v0, p2, Lcom/coremedia/iso/boxes/Box;

    if-eqz v0, :cond_6

    move-object v0, p2

    check-cast v0, Lcom/coremedia/iso/boxes/Box;

    invoke-interface {v0}, Lcom/coremedia/iso/boxes/Box;->getType()Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-virtual {p0, v7, v1, v0}, Lcom/coremedia/iso/AbstractBoxParser;->createBox(Ljava/lang/String;[BLjava/lang/String;)Lcom/coremedia/iso/boxes/Box;

    move-result-object v1

    .line 102
    invoke-interface {v1, p2}, Lcom/coremedia/iso/boxes/Box;->setParent(Lcom/coremedia/iso/boxes/Container;)V

    .line 105
    iget-object v0, p0, Lcom/coremedia/iso/AbstractBoxParser;->header:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 107
    iget-object v0, p0, Lcom/coremedia/iso/AbstractBoxParser;->header:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/nio/ByteBuffer;

    move-object v2, p1

    move-object v6, p0

    invoke-interface/range {v1 .. v6}, Lcom/coremedia/iso/boxes/Box;->parse(Lcom/googlecode/mp4parser/DataSource;Ljava/nio/ByteBuffer;JLcom/coremedia/iso/BoxParser;)V

    move-object v4, v1

    .line 108
    goto/16 :goto_0

    .line 86
    :cond_3
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-nez v0, :cond_4

    .line 87
    invoke-interface {p1}, Lcom/googlecode/mp4parser/DataSource;->size()J

    move-result-wide v0

    invoke-interface {p1}, Lcom/googlecode/mp4parser/DataSource;->position()J

    move-result-wide v2

    sub-long/2addr v0, v2

    move-wide v2, v0

    .line 88
    goto/16 :goto_1

    .line 90
    :cond_4
    sub-long v0, v2, v10

    move-wide v2, v0

    goto/16 :goto_1

    .line 97
    :cond_5
    iget-object v0, p0, Lcom/coremedia/iso/AbstractBoxParser;->header:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    add-int/lit8 v0, v0, -0x10

    sub-int v4, v1, v0

    iget-object v0, p0, Lcom/coremedia/iso/AbstractBoxParser;->header:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    aput-byte v0, v6, v4

    .line 96
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    .line 101
    :cond_6
    const-string v0, ""

    goto :goto_4

    :cond_7
    move-object v1, v4

    move-wide v4, v2

    goto :goto_3
.end method
