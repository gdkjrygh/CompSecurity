.class public Lau/com/bytecode/opencsv/CSVParser;
.super Ljava/lang/Object;


# static fields
.field public static final DEFAULT_ESCAPE_CHARACTER:C = '\\'

.field public static final DEFAULT_IGNORE_LEADING_WHITESPACE:Z = true

.field public static final DEFAULT_QUOTE_CHARACTER:C = '\"'

.field public static final DEFAULT_SEPARATOR:C = ','

.field public static final DEFAULT_STRICT_QUOTES:Z = false

.field public static final INITIAL_READ_SIZE:I = 0x80

.field public static final NULL_CHARACTER:C


# instance fields
.field private final escape:C

.field private final ignoreLeadingWhiteSpace:Z

.field private inField:Z

.field private pending:Ljava/lang/String;

.field private final quotechar:C

.field private final separator:C

.field private final strictQuotes:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    const/16 v0, 0x2c

    const/16 v1, 0x22

    const/16 v2, 0x5c

    invoke-direct {p0, v0, v1, v2}, Lau/com/bytecode/opencsv/CSVParser;-><init>(CCC)V

    return-void
.end method

.method public constructor <init>(C)V
    .locals 2

    const/16 v0, 0x22

    const/16 v1, 0x5c

    invoke-direct {p0, p1, v0, v1}, Lau/com/bytecode/opencsv/CSVParser;-><init>(CCC)V

    return-void
.end method

.method public constructor <init>(CC)V
    .locals 1

    const/16 v0, 0x5c

    invoke-direct {p0, p1, p2, v0}, Lau/com/bytecode/opencsv/CSVParser;-><init>(CCC)V

    return-void
.end method

.method public constructor <init>(CCC)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lau/com/bytecode/opencsv/CSVParser;-><init>(CCCZ)V

    return-void
.end method

.method public constructor <init>(CCCZ)V
    .locals 6

    const/4 v5, 0x1

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lau/com/bytecode/opencsv/CSVParser;-><init>(CCCZZ)V

    return-void
.end method

.method public constructor <init>(CCCZZ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lau/com/bytecode/opencsv/CSVParser;->inField:Z

    invoke-direct {p0, p1, p2, p3}, Lau/com/bytecode/opencsv/CSVParser;->anyCharactersAreTheSame(CCC)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "The separator, quote, and escape characters must be different!"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-nez p1, :cond_1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "The separator character must be defined!"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-char p1, p0, Lau/com/bytecode/opencsv/CSVParser;->separator:C

    iput-char p2, p0, Lau/com/bytecode/opencsv/CSVParser;->quotechar:C

    iput-char p3, p0, Lau/com/bytecode/opencsv/CSVParser;->escape:C

    iput-boolean p4, p0, Lau/com/bytecode/opencsv/CSVParser;->strictQuotes:Z

    iput-boolean p5, p0, Lau/com/bytecode/opencsv/CSVParser;->ignoreLeadingWhiteSpace:Z

    return-void
.end method

.method private anyCharactersAreTheSame(CCC)Z
    .locals 1

    invoke-direct {p0, p1, p2}, Lau/com/bytecode/opencsv/CSVParser;->isSameCharacter(CC)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1, p3}, Lau/com/bytecode/opencsv/CSVParser;->isSameCharacter(CC)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p2, p3}, Lau/com/bytecode/opencsv/CSVParser;->isSameCharacter(CC)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private isNextCharacterEscapedQuote(Ljava/lang/String;ZI)Z
    .locals 2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, p3, 0x1

    if-le v0, v1, :cond_0

    add-int/lit8 v0, p3, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    iget-char v1, p0, Lau/com/bytecode/opencsv/CSVParser;->quotechar:C

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private isSameCharacter(CC)Z
    .locals 1

    if-eqz p1, :cond_0

    if-ne p1, p2, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private parseLine(Ljava/lang/String;Z)[Ljava/lang/String;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v5, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p2, :cond_0

    iget-object v0, p0, Lau/com/bytecode/opencsv/CSVParser;->pending:Ljava/lang/String;

    if-eqz v0, :cond_0

    iput-object v5, p0, Lau/com/bytecode/opencsv/CSVParser;->pending:Ljava/lang/String;

    :cond_0
    if-nez p1, :cond_2

    iget-object v0, p0, Lau/com/bytecode/opencsv/CSVParser;->pending:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v3, p0, Lau/com/bytecode/opencsv/CSVParser;->pending:Ljava/lang/String;

    iput-object v5, p0, Lau/com/bytecode/opencsv/CSVParser;->pending:Ljava/lang/String;

    new-array v0, v1, [Ljava/lang/String;

    aput-object v3, v0, v2

    :goto_0
    return-object v0

    :cond_1
    move-object v0, v5

    goto :goto_0

    :cond_2
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/lang/StringBuilder;

    const/16 v0, 0x80

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-object v0, p0, Lau/com/bytecode/opencsv/CSVParser;->pending:Ljava/lang/String;

    if-eqz v0, :cond_15

    iget-object v0, p0, Lau/com/bytecode/opencsv/CSVParser;->pending:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iput-object v5, p0, Lau/com/bytecode/opencsv/CSVParser;->pending:Ljava/lang/String;

    move v0, v1

    :goto_1
    move v3, v0

    move v0, v2

    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v0, v4, :cond_11

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v8

    iget-char v4, p0, Lau/com/bytecode/opencsv/CSVParser;->escape:C

    if-ne v8, v4, :cond_6

    if-nez v3, :cond_3

    iget-boolean v4, p0, Lau/com/bytecode/opencsv/CSVParser;->inField:Z

    if-eqz v4, :cond_5

    :cond_3
    move v4, v1

    :goto_3
    invoke-virtual {p0, p1, v4, v0}, Lau/com/bytecode/opencsv/CSVParser;->isNextCharacterEscapable(Ljava/lang/String;ZI)Z

    move-result v4

    if-eqz v4, :cond_4

    add-int/lit8 v4, v0, 0x1

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    :cond_4
    :goto_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    move v4, v2

    goto :goto_3

    :cond_6
    iget-char v4, p0, Lau/com/bytecode/opencsv/CSVParser;->quotechar:C

    if-ne v8, v4, :cond_e

    if-nez v3, :cond_7

    iget-boolean v4, p0, Lau/com/bytecode/opencsv/CSVParser;->inField:Z

    if-eqz v4, :cond_8

    :cond_7
    move v4, v1

    :goto_5
    invoke-direct {p0, p1, v4, v0}, Lau/com/bytecode/opencsv/CSVParser;->isNextCharacterEscapedQuote(Ljava/lang/String;ZI)Z

    move-result v4

    if-eqz v4, :cond_9

    add-int/lit8 v4, v0, 0x1

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    :goto_6
    iget-boolean v4, p0, Lau/com/bytecode/opencsv/CSVParser;->inField:Z

    if-nez v4, :cond_d

    move v4, v1

    :goto_7
    iput-boolean v4, p0, Lau/com/bytecode/opencsv/CSVParser;->inField:Z

    goto :goto_4

    :cond_8
    move v4, v2

    goto :goto_5

    :cond_9
    iget-boolean v4, p0, Lau/com/bytecode/opencsv/CSVParser;->strictQuotes:Z

    if-nez v4, :cond_a

    const/4 v4, 0x2

    if-le v0, v4, :cond_a

    add-int/lit8 v4, v0, -0x1

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    iget-char v9, p0, Lau/com/bytecode/opencsv/CSVParser;->separator:C

    if-eq v4, v9, :cond_a

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v9, v0, 0x1

    if-le v4, v9, :cond_a

    add-int/lit8 v4, v0, 0x1

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    iget-char v9, p0, Lau/com/bytecode/opencsv/CSVParser;->separator:C

    if-eq v4, v9, :cond_a

    iget-boolean v4, p0, Lau/com/bytecode/opencsv/CSVParser;->ignoreLeadingWhiteSpace:Z

    if-eqz v4, :cond_b

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-lez v4, :cond_b

    invoke-virtual {p0, v6}, Lau/com/bytecode/opencsv/CSVParser;->isAllWhiteSpace(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    :cond_a
    :goto_8
    if-nez v3, :cond_c

    move v3, v1

    goto :goto_6

    :cond_b
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_8

    :cond_c
    move v3, v2

    goto :goto_6

    :cond_d
    move v4, v2

    goto :goto_7

    :cond_e
    iget-char v4, p0, Lau/com/bytecode/opencsv/CSVParser;->separator:C

    if-ne v8, v4, :cond_f

    if-nez v3, :cond_f

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v7, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    iput-boolean v2, p0, Lau/com/bytecode/opencsv/CSVParser;->inField:Z

    goto :goto_4

    :cond_f
    iget-boolean v4, p0, Lau/com/bytecode/opencsv/CSVParser;->strictQuotes:Z

    if-eqz v4, :cond_10

    if-eqz v3, :cond_4

    :cond_10
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iput-boolean v1, p0, Lau/com/bytecode/opencsv/CSVParser;->inField:Z

    goto/16 :goto_4

    :cond_11
    if-eqz v3, :cond_14

    if-eqz p2, :cond_13

    const-string v0, "\n"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lau/com/bytecode/opencsv/CSVParser;->pending:Ljava/lang/String;

    :goto_9
    if-eqz v5, :cond_12

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_12
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v7, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    goto/16 :goto_0

    :cond_13
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Un-terminated quoted field at end of CSV line"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    move-object v5, v6

    goto :goto_9

    :cond_15
    move v0, v2

    goto/16 :goto_1
.end method


# virtual methods
.method protected isAllWhiteSpace(Ljava/lang/CharSequence;)Z
    .locals 4

    const/4 v1, 0x0

    const/4 v2, 0x1

    move v0, v1

    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v0, v3, :cond_1

    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v3

    if-nez v3, :cond_0

    :goto_1
    return v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

.method protected isNextCharacterEscapable(Ljava/lang/String;ZI)Z
    .locals 2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, p3, 0x1

    if-le v0, v1, :cond_1

    add-int/lit8 v0, p3, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    iget-char v1, p0, Lau/com/bytecode/opencsv/CSVParser;->quotechar:C

    if-eq v0, v1, :cond_0

    add-int/lit8 v0, p3, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    iget-char v1, p0, Lau/com/bytecode/opencsv/CSVParser;->escape:C

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isPending()Z
    .locals 1

    iget-object v0, p0, Lau/com/bytecode/opencsv/CSVParser;->pending:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public parseLine(Ljava/lang/String;)[Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lau/com/bytecode/opencsv/CSVParser;->parseLine(Ljava/lang/String;Z)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public parseLineMulti(Ljava/lang/String;)[Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lau/com/bytecode/opencsv/CSVParser;->parseLine(Ljava/lang/String;Z)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
