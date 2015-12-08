.class public Lau/com/bytecode/opencsv/CSVReader;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final DEFAULT_SKIP_LINES:I


# instance fields
.field private br:Ljava/io/BufferedReader;

.field private hasNext:Z

.field private linesSkiped:Z

.field private parser:Lau/com/bytecode/opencsv/CSVParser;

.field private skipLines:I


# direct methods
.method public constructor <init>(Ljava/io/Reader;)V
    .locals 3

    const/16 v0, 0x2c

    const/16 v1, 0x22

    const/16 v2, 0x5c

    invoke-direct {p0, p1, v0, v1, v2}, Lau/com/bytecode/opencsv/CSVReader;-><init>(Ljava/io/Reader;CCC)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;C)V
    .locals 2

    const/16 v0, 0x22

    const/16 v1, 0x5c

    invoke-direct {p0, p1, p2, v0, v1}, Lau/com/bytecode/opencsv/CSVReader;-><init>(Ljava/io/Reader;CCC)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;CC)V
    .locals 7

    const/4 v5, 0x0

    const/16 v4, 0x5c

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v6, v5

    invoke-direct/range {v0 .. v6}, Lau/com/bytecode/opencsv/CSVReader;-><init>(Ljava/io/Reader;CCCIZ)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;CCC)V
    .locals 7

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v6, v5

    invoke-direct/range {v0 .. v6}, Lau/com/bytecode/opencsv/CSVReader;-><init>(Ljava/io/Reader;CCCIZ)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;CCCI)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lau/com/bytecode/opencsv/CSVReader;-><init>(Ljava/io/Reader;CCCIZ)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;CCCIZ)V
    .locals 8

    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v7}, Lau/com/bytecode/opencsv/CSVReader;-><init>(Ljava/io/Reader;CCCIZZ)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;CCCIZZ)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lau/com/bytecode/opencsv/CSVReader;->hasNext:Z

    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, p1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    iput-object v0, p0, Lau/com/bytecode/opencsv/CSVReader;->br:Ljava/io/BufferedReader;

    new-instance v0, Lau/com/bytecode/opencsv/CSVParser;

    move v1, p2

    move v2, p3

    move v3, p4

    move v4, p6

    move v5, p7

    invoke-direct/range {v0 .. v5}, Lau/com/bytecode/opencsv/CSVParser;-><init>(CCCZZ)V

    iput-object v0, p0, Lau/com/bytecode/opencsv/CSVReader;->parser:Lau/com/bytecode/opencsv/CSVParser;

    iput p5, p0, Lau/com/bytecode/opencsv/CSVReader;->skipLines:I

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;CCI)V
    .locals 7

    const/16 v4, 0x5c

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v5, p4

    invoke-direct/range {v0 .. v6}, Lau/com/bytecode/opencsv/CSVReader;-><init>(Ljava/io/Reader;CCCIZ)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;CCZ)V
    .locals 7

    const/16 v4, 0x5c

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v6, p4

    invoke-direct/range {v0 .. v6}, Lau/com/bytecode/opencsv/CSVReader;-><init>(Ljava/io/Reader;CCCIZ)V

    return-void
.end method

.method private getNextLine()Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v1, 0x0

    iget-boolean v0, p0, Lau/com/bytecode/opencsv/CSVReader;->linesSkiped:Z

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    iget v2, p0, Lau/com/bytecode/opencsv/CSVReader;->skipLines:I

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lau/com/bytecode/opencsv/CSVReader;->br:Ljava/io/BufferedReader;

    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lau/com/bytecode/opencsv/CSVReader;->linesSkiped:Z

    :cond_1
    iget-object v0, p0, Lau/com/bytecode/opencsv/CSVReader;->br:Ljava/io/BufferedReader;

    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    iput-boolean v1, p0, Lau/com/bytecode/opencsv/CSVReader;->hasNext:Z

    :cond_2
    iget-boolean v1, p0, Lau/com/bytecode/opencsv/CSVReader;->hasNext:Z

    if-eqz v1, :cond_3

    :goto_1
    return-object v0

    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lau/com/bytecode/opencsv/CSVReader;->br:Ljava/io/BufferedReader;

    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    return-void
.end method

.method public readAll()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    :goto_0
    iget-boolean v1, p0, Lau/com/bytecode/opencsv/CSVReader;->hasNext:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lau/com/bytecode/opencsv/CSVReader;->readNext()[Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public readNext()[Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v4, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-direct {p0}, Lau/com/bytecode/opencsv/CSVReader;->getNextLine()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lau/com/bytecode/opencsv/CSVReader;->hasNext:Z

    if-nez v1, :cond_0

    :goto_1
    return-object v2

    :cond_0
    iget-object v1, p0, Lau/com/bytecode/opencsv/CSVReader;->parser:Lau/com/bytecode/opencsv/CSVParser;

    invoke-virtual {v1, v0}, Lau/com/bytecode/opencsv/CSVParser;->parseLineMulti(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    if-lez v1, :cond_2

    if-nez v2, :cond_1

    :goto_2
    iget-object v1, p0, Lau/com/bytecode/opencsv/CSVReader;->parser:Lau/com/bytecode/opencsv/CSVParser;

    invoke-virtual {v1}, Lau/com/bytecode/opencsv/CSVParser;->isPending()Z

    move-result v1

    if-nez v1, :cond_3

    move-object v2, v0

    goto :goto_1

    :cond_1
    array-length v1, v2

    array-length v3, v0

    add-int/2addr v1, v3

    new-array v1, v1, [Ljava/lang/String;

    array-length v3, v2

    invoke-static {v2, v4, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v2, v2

    array-length v3, v0

    invoke-static {v0, v4, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, v1

    goto :goto_2

    :cond_2
    move-object v0, v2

    goto :goto_2

    :cond_3
    move-object v2, v0

    goto :goto_0
.end method
