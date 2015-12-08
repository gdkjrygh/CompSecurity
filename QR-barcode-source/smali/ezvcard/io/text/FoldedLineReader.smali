.class public Lezvcard/io/text/FoldedLineReader;
.super Ljava/io/BufferedReader;
.source "FoldedLineReader.java"


# static fields
.field private static final foldedQuotedPrintableValueRegex:Ljava/util/regex/Pattern;


# instance fields
.field private lastLine:Ljava/lang/String;

.field private lastLineNum:I

.field private lineCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 48
    const-string v0, "[^:]*?QUOTED-PRINTABLE.*?:.*?="

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lezvcard/io/text/FoldedLineReader;->foldedQuotedPrintableValueRegex:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;)V
    .locals 1
    .param p1, "reader"    # Ljava/io/Reader;

    .prologue
    const/4 v0, 0x0

    .line 58
    invoke-direct {p0, p1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 51
    iput v0, p0, Lezvcard/io/text/FoldedLineReader;->lastLineNum:I

    iput v0, p0, Lezvcard/io/text/FoldedLineReader;->lineCount:I

    .line 59
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 66
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lezvcard/io/text/FoldedLineReader;-><init>(Ljava/io/Reader;)V

    .line 67
    return-void
.end method

.method private readNonEmptyLine()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 88
    :cond_0
    invoke-super {p0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    .line 89
    .local v0, "line":Ljava/lang/String;
    if-eqz v0, :cond_1

    .line 90
    iget v1, p0, Lezvcard/io/text/FoldedLineReader;->lineCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lezvcard/io/text/FoldedLineReader;->lineCount:I

    .line 92
    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    .line 93
    :cond_2
    return-object v0
.end method


# virtual methods
.method public getLineNum()I
    .locals 1

    .prologue
    .line 74
    iget v0, p0, Lezvcard/io/text/FoldedLineReader;->lastLineNum:I

    return v0
.end method

.method public readLine()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    const/4 v8, 0x0

    .line 103
    iget-object v7, p0, Lezvcard/io/text/FoldedLineReader;->lastLine:Ljava/lang/String;

    if-nez v7, :cond_0

    invoke-direct {p0}, Lezvcard/io/text/FoldedLineReader;->readNonEmptyLine()Ljava/lang/String;

    move-result-object v5

    .line 104
    .local v5, "wholeLine":Ljava/lang/String;
    :goto_0
    iput-object v6, p0, Lezvcard/io/text/FoldedLineReader;->lastLine:Ljava/lang/String;

    .line 105
    if-nez v5, :cond_1

    .line 189
    :goto_1
    return-object v6

    .line 103
    .end local v5    # "wholeLine":Ljava/lang/String;
    :cond_0
    iget-object v5, p0, Lezvcard/io/text/FoldedLineReader;->lastLine:Ljava/lang/String;

    goto :goto_0

    .line 135
    .restart local v5    # "wholeLine":Ljava/lang/String;
    :cond_1
    const/4 v1, 0x0

    .line 136
    .local v1, "foldedQuotedPrintableLine":Z
    sget-object v6, Lezvcard/io/text/FoldedLineReader;->foldedQuotedPrintableValueRegex:Ljava/util/regex/Pattern;

    invoke-virtual {v6, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 137
    const/4 v1, 0x1

    .line 140
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    invoke-virtual {v5, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 143
    :cond_2
    iget v6, p0, Lezvcard/io/text/FoldedLineReader;->lineCount:I

    iput v6, p0, Lezvcard/io/text/FoldedLineReader;->lastLineNum:I

    .line 144
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .local v4, "unfoldedLine":Ljava/lang/StringBuilder;
    :goto_2
    if-eqz v1, :cond_4

    invoke-super {p0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    .line 147
    .local v3, "line":Ljava/lang/String;
    :goto_3
    if-nez v3, :cond_5

    .line 189
    :cond_3
    :goto_4
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    .line 146
    .end local v3    # "line":Ljava/lang/String;
    :cond_4
    invoke-direct {p0}, Lezvcard/io/text/FoldedLineReader;->readNonEmptyLine()Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    .line 152
    .restart local v3    # "line":Ljava/lang/String;
    :cond_5
    if-eqz v1, :cond_7

    .line 153
    invoke-static {v3}, Lezvcard/util/StringUtils;->ltrim(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 155
    const-string v6, "="

    invoke-virtual {v3, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    .line 156
    .local v0, "endsInEquals":Z
    if-eqz v0, :cond_6

    .line 158
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    invoke-virtual {v3, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 161
    :cond_6
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    if-eqz v0, :cond_3

    goto :goto_2

    .line 172
    .end local v0    # "endsInEquals":Z
    :cond_7
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_9

    invoke-virtual {v3, v8}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 175
    const/4 v2, 0x1

    .line 177
    .local v2, "lastWhitespace":I
    :goto_5
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v2, v6, :cond_8

    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 178
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    .line 180
    :cond_8
    invoke-virtual {v3, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 185
    .end local v2    # "lastWhitespace":I
    :cond_9
    iput-object v3, p0, Lezvcard/io/text/FoldedLineReader;->lastLine:Ljava/lang/String;

    goto :goto_4
.end method
