.class public Lcom/googlecode/mp4parser/BasicContainer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/coremedia/iso/boxes/Container;
.implements Ljava/io/Closeable;
.implements Ljava/util/Iterator;


# static fields
.field private static final EOF:Lcom/coremedia/iso/boxes/Box;

.field private static LOG:Lcom/googlecode/mp4parser/util/Logger;


# instance fields
.field protected boxParser:Lcom/coremedia/iso/BoxParser;

.field private boxes:Ljava/util/List;

.field protected dataSource:Lcom/googlecode/mp4parser/DataSource;

.field endPosition:J

.field lookahead:Lcom/coremedia/iso/boxes/Box;

.field parsePosition:J

.field startPosition:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 24
    new-instance v0, Lcom/googlecode/mp4parser/BasicContainer$1;

    const-string v1, "eof "

    invoke-direct {v0, v1}, Lcom/googlecode/mp4parser/BasicContainer$1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/googlecode/mp4parser/BasicContainer;->EOF:Lcom/coremedia/iso/boxes/Box;

    .line 39
    const-class v0, Lcom/googlecode/mp4parser/BasicContainer;

    invoke-static {v0}, Lcom/googlecode/mp4parser/util/Logger;->getLogger(Ljava/lang/Class;)Lcom/googlecode/mp4parser/util/Logger;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/BasicContainer;->LOG:Lcom/googlecode/mp4parser/util/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->lookahead:Lcom/coremedia/iso/boxes/Box;

    .line 43
    iput-wide v2, p0, Lcom/googlecode/mp4parser/BasicContainer;->parsePosition:J

    .line 44
    iput-wide v2, p0, Lcom/googlecode/mp4parser/BasicContainer;->startPosition:J

    .line 45
    iput-wide v2, p0, Lcom/googlecode/mp4parser/BasicContainer;->endPosition:J

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->boxes:Ljava/util/List;

    .line 49
    return-void
.end method


# virtual methods
.method public addBox(Lcom/coremedia/iso/boxes/Box;)V
    .locals 2

    .prologue
    .line 133
    if-eqz p1, :cond_0

    .line 134
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/googlecode/mp4parser/BasicContainer;->getBoxes()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->boxes:Ljava/util/List;

    .line 135
    invoke-interface {p1, p0}, Lcom/coremedia/iso/boxes/Box;->setParent(Lcom/coremedia/iso/boxes/Container;)V

    .line 136
    iget-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->boxes:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 138
    :cond_0
    return-void
.end method

.method public close()V
    .locals 1

    .prologue
    .line 261
    iget-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/DataSource;->close()V

    .line 262
    return-void
.end method

.method public getBoxes()Ljava/util/List;
    .locals 2

    .prologue
    .line 52
    iget-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->lookahead:Lcom/coremedia/iso/boxes/Box;

    sget-object v1, Lcom/googlecode/mp4parser/BasicContainer;->EOF:Lcom/coremedia/iso/boxes/Box;

    if-eq v0, v1, :cond_0

    .line 53
    new-instance v0, Lcom/googlecode/mp4parser/util/LazyList;

    iget-object v1, p0, Lcom/googlecode/mp4parser/BasicContainer;->boxes:Ljava/util/List;

    invoke-direct {v0, v1, p0}, Lcom/googlecode/mp4parser/util/LazyList;-><init>(Ljava/util/List;Ljava/util/Iterator;)V

    .line 55
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->boxes:Ljava/util/List;

    goto :goto_0
.end method

.method public getBoxes(Ljava/lang/Class;)Ljava/util/List;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 77
    .line 79
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/BasicContainer;->getBoxes()Ljava/util/List;

    move-result-object v4

    .line 80
    const/4 v0, 0x0

    move v3, v0

    move-object v2, v1

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lt v3, v0, :cond_0

    .line 97
    if-eqz v2, :cond_4

    .line 102
    :goto_1
    return-object v2

    .line 81
    :cond_0
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/Box;

    .line 85
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 86
    if-nez v1, :cond_1

    move-object v1, v2

    .line 80
    :goto_2
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    move-object v2, v1

    move-object v1, v0

    goto :goto_0

    .line 89
    :cond_1
    if-nez v2, :cond_2

    .line 90
    new-instance v2, Ljava/util/ArrayList;

    const/4 v5, 0x2

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 91
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    :cond_2
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    move-object v0, v1

    move-object v1, v2

    goto :goto_2

    .line 99
    :cond_4
    if-eqz v1, :cond_5

    .line 100
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    goto :goto_1

    .line 102
    :cond_5
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    goto :goto_1
.end method

.method public getBoxes(Ljava/lang/Class;Z)Ljava/util/List;
    .locals 5

    .prologue
    .line 108
    new-instance v2, Ljava/util/ArrayList;

    const/4 v0, 0x2

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 109
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/BasicContainer;->getBoxes()Ljava/util/List;

    move-result-object v3

    .line 110
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_0

    .line 123
    return-object v2

    .line 111
    :cond_0
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/Box;

    .line 115
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 116
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    :cond_1
    if-eqz p2, :cond_2

    instance-of v4, v0, Lcom/coremedia/iso/boxes/Container;

    if-eqz v4, :cond_2

    .line 120
    check-cast v0, Lcom/coremedia/iso/boxes/Container;

    invoke-interface {v0, p1, p2}, Lcom/coremedia/iso/boxes/Container;->getBoxes(Ljava/lang/Class;Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 110
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public getByteBuffer(JJ)Ljava/nio/ByteBuffer;
    .locals 17

    .prologue
    .line 221
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/BasicContainer;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    if-eqz v2, :cond_0

    .line 222
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/googlecode/mp4parser/BasicContainer;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    monitor-enter v3

    .line 223
    :try_start_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/googlecode/mp4parser/BasicContainer;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    move-object/from16 v0, p0

    iget-wide v4, v0, Lcom/googlecode/mp4parser/BasicContainer;->startPosition:J

    add-long v4, v4, p1

    move-wide/from16 v0, p3

    invoke-interface {v2, v4, v5, v0, v1}, Lcom/googlecode/mp4parser/DataSource;->map(JJ)Ljava/nio/ByteBuffer;

    move-result-object v2

    monitor-exit v3

    .line 256
    :goto_0
    return-object v2

    .line 222
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2

    .line 226
    :cond_0
    invoke-static/range {p3 .. p4}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v2

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v8

    .line 227
    add-long v10, p1, p3

    .line 229
    const-wide/16 v2, 0x0

    .line 230
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/googlecode/mp4parser/BasicContainer;->boxes:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move-wide v4, v2

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    .line 256
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object v2

    check-cast v2, Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 230
    :cond_1
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/coremedia/iso/boxes/Box;

    .line 232
    invoke-interface {v2}, Lcom/coremedia/iso/boxes/Box;->getSize()J

    move-result-wide v6

    add-long/2addr v6, v4

    .line 233
    cmp-long v3, v6, p1

    if-lez v3, :cond_5

    cmp-long v3, v4, v10

    if-gez v3, :cond_5

    .line 234
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 235
    invoke-static {v3}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;

    move-result-object v12

    .line 236
    invoke-interface {v2, v12}, Lcom/coremedia/iso/boxes/Box;->getBox(Ljava/nio/channels/WritableByteChannel;)V

    .line 237
    invoke-interface {v12}, Ljava/nio/channels/WritableByteChannel;->close()V

    .line 239
    cmp-long v12, v4, p1

    if-ltz v12, :cond_2

    cmp-long v12, v6, v10

    if-gtz v12, :cond_2

    .line 240
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-wide v4, v6

    .line 242
    goto :goto_1

    :cond_2
    cmp-long v12, v4, p1

    if-gez v12, :cond_3

    cmp-long v12, v6, v10

    if-lez v12, :cond_3

    .line 244
    invoke-interface {v2}, Lcom/coremedia/iso/boxes/Box;->getSize()J

    move-result-wide v12

    sub-long v14, p1, v4

    sub-long/2addr v12, v14

    sub-long v14, v6, v10

    sub-long/2addr v12, v14

    invoke-static {v12, v13}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v2

    .line 245
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    sub-long v4, p1, v4

    invoke-static {v4, v5}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v4

    invoke-virtual {v8, v3, v4, v2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    move-wide v4, v6

    .line 246
    goto :goto_1

    :cond_3
    cmp-long v12, v4, p1

    if-gez v12, :cond_4

    cmp-long v12, v6, v10

    if-gtz v12, :cond_4

    .line 248
    invoke-interface {v2}, Lcom/coremedia/iso/boxes/Box;->getSize()J

    move-result-wide v12

    sub-long v14, p1, v4

    sub-long/2addr v12, v14

    invoke-static {v12, v13}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v2

    .line 249
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    sub-long v4, p1, v4

    invoke-static {v4, v5}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v4

    invoke-virtual {v8, v3, v4, v2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    move-wide v4, v6

    .line 250
    goto/16 :goto_1

    :cond_4
    cmp-long v4, v4, p1

    if-ltz v4, :cond_5

    cmp-long v4, v6, v10

    if-lez v4, :cond_5

    .line 251
    invoke-interface {v2}, Lcom/coremedia/iso/boxes/Box;->getSize()J

    move-result-wide v4

    sub-long v12, v6, v10

    sub-long/2addr v4, v12

    invoke-static {v4, v5}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v2

    .line 252
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v8, v3, v4, v2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    :cond_5
    move-wide v4, v6

    goto/16 :goto_1
.end method

.method protected getContainerSize()J
    .locals 6

    .prologue
    .line 66
    const-wide/16 v2, 0x0

    .line 67
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/BasicContainer;->getBoxes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_0

    .line 72
    return-wide v2

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->boxes:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/Box;

    invoke-interface {v0}, Lcom/coremedia/iso/boxes/Box;->getSize()J

    move-result-wide v4

    add-long/2addr v2, v4

    .line 67
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public hasNext()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 154
    iget-object v2, p0, Lcom/googlecode/mp4parser/BasicContainer;->lookahead:Lcom/coremedia/iso/boxes/Box;

    sget-object v3, Lcom/googlecode/mp4parser/BasicContainer;->EOF:Lcom/coremedia/iso/boxes/Box;

    if-ne v2, v3, :cond_0

    .line 165
    :goto_0
    return v0

    .line 157
    :cond_0
    iget-object v2, p0, Lcom/googlecode/mp4parser/BasicContainer;->lookahead:Lcom/coremedia/iso/boxes/Box;

    if-eqz v2, :cond_1

    move v0, v1

    .line 158
    goto :goto_0

    .line 161
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/BasicContainer;->next()Lcom/coremedia/iso/boxes/Box;

    move-result-object v2

    iput-object v2, p0, Lcom/googlecode/mp4parser/BasicContainer;->lookahead:Lcom/coremedia/iso/boxes/Box;
    :try_end_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v1

    .line 162
    goto :goto_0

    .line 164
    :catch_0
    move-exception v1

    sget-object v1, Lcom/googlecode/mp4parser/BasicContainer;->EOF:Lcom/coremedia/iso/boxes/Box;

    iput-object v1, p0, Lcom/googlecode/mp4parser/BasicContainer;->lookahead:Lcom/coremedia/iso/boxes/Box;

    goto :goto_0
.end method

.method public initContainer(Lcom/googlecode/mp4parser/DataSource;JLcom/coremedia/iso/BoxParser;)V
    .locals 2

    .prologue
    .line 142
    iput-object p1, p0, Lcom/googlecode/mp4parser/BasicContainer;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    .line 143
    invoke-interface {p1}, Lcom/googlecode/mp4parser/DataSource;->position()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->startPosition:J

    iput-wide v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->parsePosition:J

    .line 144
    invoke-interface {p1}, Lcom/googlecode/mp4parser/DataSource;->position()J

    move-result-wide v0

    add-long/2addr v0, p2

    invoke-interface {p1, v0, v1}, Lcom/googlecode/mp4parser/DataSource;->position(J)V

    .line 145
    invoke-interface {p1}, Lcom/googlecode/mp4parser/DataSource;->position()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->endPosition:J

    .line 146
    iput-object p4, p0, Lcom/googlecode/mp4parser/BasicContainer;->boxParser:Lcom/coremedia/iso/BoxParser;

    .line 147
    return-void
.end method

.method public next()Lcom/coremedia/iso/boxes/Box;
    .locals 4

    .prologue
    .line 171
    iget-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->lookahead:Lcom/coremedia/iso/boxes/Box;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->lookahead:Lcom/coremedia/iso/boxes/Box;

    sget-object v1, Lcom/googlecode/mp4parser/BasicContainer;->EOF:Lcom/coremedia/iso/boxes/Box;

    if-eq v0, v1, :cond_0

    .line 172
    iget-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->lookahead:Lcom/coremedia/iso/boxes/Box;

    .line 173
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/googlecode/mp4parser/BasicContainer;->lookahead:Lcom/coremedia/iso/boxes/Box;

    .line 188
    :goto_0
    return-object v0

    .line 177
    :cond_0
    iget-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->parsePosition:J

    iget-wide v2, p0, Lcom/googlecode/mp4parser/BasicContainer;->endPosition:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    .line 178
    :cond_1
    sget-object v0, Lcom/googlecode/mp4parser/BasicContainer;->EOF:Lcom/coremedia/iso/boxes/Box;

    iput-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->lookahead:Lcom/coremedia/iso/boxes/Box;

    .line 179
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 183
    :cond_2
    :try_start_0
    iget-object v1, p0, Lcom/googlecode/mp4parser/BasicContainer;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    monitor-enter v1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 184
    :try_start_1
    iget-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    iget-wide v2, p0, Lcom/googlecode/mp4parser/BasicContainer;->parsePosition:J

    invoke-interface {v0, v2, v3}, Lcom/googlecode/mp4parser/DataSource;->position(J)V

    .line 185
    iget-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->boxParser:Lcom/coremedia/iso/BoxParser;

    iget-object v2, p0, Lcom/googlecode/mp4parser/BasicContainer;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    invoke-interface {v0, v2, p0}, Lcom/coremedia/iso/BoxParser;->parseBox(Lcom/googlecode/mp4parser/DataSource;Lcom/coremedia/iso/boxes/Container;)Lcom/coremedia/iso/boxes/Box;

    move-result-object v0

    .line 187
    iget-object v2, p0, Lcom/googlecode/mp4parser/BasicContainer;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    invoke-interface {v2}, Lcom/googlecode/mp4parser/DataSource;->position()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/googlecode/mp4parser/BasicContainer;->parsePosition:J

    .line 188
    monitor-exit v1

    goto :goto_0

    .line 183
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/io/EOFException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 191
    :catch_0
    move-exception v0

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 193
    :catch_1
    move-exception v0

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/BasicContainer;->next()Lcom/coremedia/iso/boxes/Box;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    .prologue
    .line 150
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public setBoxes(Ljava/util/List;)V
    .locals 1

    .prologue
    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->boxes:Ljava/util/List;

    .line 61
    sget-object v0, Lcom/googlecode/mp4parser/BasicContainer;->EOF:Lcom/coremedia/iso/boxes/Box;

    iput-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->lookahead:Lcom/coremedia/iso/boxes/Box;

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->dataSource:Lcom/googlecode/mp4parser/DataSource;

    .line 63
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 200
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 202
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->boxes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_0

    .line 209
    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 204
    :cond_0
    if-lez v1, :cond_1

    .line 205
    const-string v0, ";"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    :cond_1
    iget-object v0, p0, Lcom/googlecode/mp4parser/BasicContainer;->boxes:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/Box;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public final writeContainer(Ljava/nio/channels/WritableByteChannel;)V
    .locals 2

    .prologue
    .line 215
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/BasicContainer;->getBoxes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 218
    return-void

    .line 215
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/Box;

    .line 216
    invoke-interface {v0, p1}, Lcom/coremedia/iso/boxes/Box;->getBox(Ljava/nio/channels/WritableByteChannel;)V

    goto :goto_0
.end method
