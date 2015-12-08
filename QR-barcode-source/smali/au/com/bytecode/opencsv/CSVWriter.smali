.class public Lau/com/bytecode/opencsv/CSVWriter;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final DEFAULT_ESCAPE_CHARACTER:C = '\"'

.field public static final DEFAULT_LINE_END:Ljava/lang/String; = "\n"

.field public static final DEFAULT_QUOTE_CHARACTER:C = '\"'

.field public static final DEFAULT_SEPARATOR:C = ','

.field public static final INITIAL_STRING_SIZE:I = 0x80

.field public static final NO_ESCAPE_CHARACTER:C

.field public static final NO_QUOTE_CHARACTER:C


# instance fields
.field private escapechar:C

.field private lineEnd:Ljava/lang/String;

.field private pw:Ljava/io/PrintWriter;

.field private quotechar:C

.field private rawWriter:Ljava/io/Writer;

.field private resultService:Lau/com/bytecode/opencsv/ResultSetHelper;

.field private separator:C


# direct methods
.method public constructor <init>(Ljava/io/Writer;)V
    .locals 1

    const/16 v0, 0x2c

    invoke-direct {p0, p1, v0}, Lau/com/bytecode/opencsv/CSVWriter;-><init>(Ljava/io/Writer;C)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;C)V
    .locals 1

    const/16 v0, 0x22

    invoke-direct {p0, p1, p2, v0}, Lau/com/bytecode/opencsv/CSVWriter;-><init>(Ljava/io/Writer;CC)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;CC)V
    .locals 1

    const/16 v0, 0x22

    invoke-direct {p0, p1, p2, p3, v0}, Lau/com/bytecode/opencsv/CSVWriter;-><init>(Ljava/io/Writer;CCC)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;CCC)V
    .locals 6

    const-string v5, "\n"

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lau/com/bytecode/opencsv/CSVWriter;-><init>(Ljava/io/Writer;CCCLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;CCCLjava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lau/com/bytecode/opencsv/ResultSetHelperService;

    invoke-direct {v0}, Lau/com/bytecode/opencsv/ResultSetHelperService;-><init>()V

    iput-object v0, p0, Lau/com/bytecode/opencsv/CSVWriter;->resultService:Lau/com/bytecode/opencsv/ResultSetHelper;

    iput-object p1, p0, Lau/com/bytecode/opencsv/CSVWriter;->rawWriter:Ljava/io/Writer;

    new-instance v0, Ljava/io/PrintWriter;

    invoke-direct {v0, p1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    iput-object v0, p0, Lau/com/bytecode/opencsv/CSVWriter;->pw:Ljava/io/PrintWriter;

    iput-char p2, p0, Lau/com/bytecode/opencsv/CSVWriter;->separator:C

    iput-char p3, p0, Lau/com/bytecode/opencsv/CSVWriter;->quotechar:C

    iput-char p4, p0, Lau/com/bytecode/opencsv/CSVWriter;->escapechar:C

    iput-object p5, p0, Lau/com/bytecode/opencsv/CSVWriter;->lineEnd:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;CCLjava/lang/String;)V
    .locals 6

    const/16 v4, 0x22

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lau/com/bytecode/opencsv/CSVWriter;-><init>(Ljava/io/Writer;CCCLjava/lang/String;)V

    return-void
.end method

.method private stringContainsSpecialCharacters(Ljava/lang/String;)Z
    .locals 2

    const/4 v1, -0x1

    iget-char v0, p0, Lau/com/bytecode/opencsv/CSVWriter;->quotechar:C

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-ne v0, v1, :cond_0

    iget-char v0, p0, Lau/com/bytecode/opencsv/CSVWriter;->escapechar:C

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-eq v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public checkError()Z
    .locals 1

    iget-object v0, p0, Lau/com/bytecode/opencsv/CSVWriter;->pw:Ljava/io/PrintWriter;

    invoke-virtual {v0}, Ljava/io/PrintWriter;->checkError()Z

    move-result v0

    return v0
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lau/com/bytecode/opencsv/CSVWriter;->flush()V

    iget-object v0, p0, Lau/com/bytecode/opencsv/CSVWriter;->pw:Ljava/io/PrintWriter;

    invoke-virtual {v0}, Ljava/io/PrintWriter;->close()V

    iget-object v0, p0, Lau/com/bytecode/opencsv/CSVWriter;->rawWriter:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    return-void
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lau/com/bytecode/opencsv/CSVWriter;->pw:Ljava/io/PrintWriter;

    invoke-virtual {v0}, Ljava/io/PrintWriter;->flush()V

    return-void
.end method

.method protected processLine(Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 4

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0x80

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_2

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    iget-char v3, p0, Lau/com/bytecode/opencsv/CSVWriter;->escapechar:C

    if-eqz v3, :cond_0

    iget-char v3, p0, Lau/com/bytecode/opencsv/CSVWriter;->quotechar:C

    if-ne v2, v3, :cond_0

    iget-char v3, p0, Lau/com/bytecode/opencsv/CSVWriter;->escapechar:C

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-char v3, p0, Lau/com/bytecode/opencsv/CSVWriter;->escapechar:C

    if-eqz v3, :cond_1

    iget-char v3, p0, Lau/com/bytecode/opencsv/CSVWriter;->escapechar:C

    if-ne v2, v3, :cond_1

    iget-char v3, p0, Lau/com/bytecode/opencsv/CSVWriter;->escapechar:C

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    return-object v1
.end method

.method public setResultService(Lau/com/bytecode/opencsv/ResultSetHelper;)V
    .locals 0

    iput-object p1, p0, Lau/com/bytecode/opencsv/CSVWriter;->resultService:Lau/com/bytecode/opencsv/ResultSetHelper;

    return-void
.end method

.method public writeAll(Ljava/sql/ResultSet;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;,
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lau/com/bytecode/opencsv/CSVWriter;->writeColumnNames(Ljava/sql/ResultSet;)V

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/sql/ResultSet;->next()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lau/com/bytecode/opencsv/CSVWriter;->resultService:Lau/com/bytecode/opencsv/ResultSetHelper;

    invoke-interface {v0, p1}, Lau/com/bytecode/opencsv/ResultSetHelper;->getColumnValues(Ljava/sql/ResultSet;)[Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lau/com/bytecode/opencsv/CSVWriter;->writeNext([Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public writeAll(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<[",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p0, v0}, Lau/com/bytecode/opencsv/CSVWriter;->writeNext([Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected writeColumnNames(Ljava/sql/ResultSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    iget-object v0, p0, Lau/com/bytecode/opencsv/CSVWriter;->resultService:Lau/com/bytecode/opencsv/ResultSetHelper;

    invoke-interface {v0, p1}, Lau/com/bytecode/opencsv/ResultSetHelper;->getColumnNames(Ljava/sql/ResultSet;)[Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lau/com/bytecode/opencsv/CSVWriter;->writeNext([Ljava/lang/String;)V

    return-void
.end method

.method public writeNext([Ljava/lang/String;)V
    .locals 4

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v0, 0x80

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v0, 0x0

    :goto_1
    array-length v1, p1

    if-ge v0, v1, :cond_6

    if-eqz v0, :cond_1

    iget-char v1, p0, Lau/com/bytecode/opencsv/CSVWriter;->separator:C

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    aget-object v1, p1, v0

    if-nez v1, :cond_3

    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    iget-char v3, p0, Lau/com/bytecode/opencsv/CSVWriter;->quotechar:C

    if-eqz v3, :cond_4

    iget-char v3, p0, Lau/com/bytecode/opencsv/CSVWriter;->quotechar:C

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_4
    invoke-direct {p0, v1}, Lau/com/bytecode/opencsv/CSVWriter;->stringContainsSpecialCharacters(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p0, v1}, Lau/com/bytecode/opencsv/CSVWriter;->processLine(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    :cond_5
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    iget-char v1, p0, Lau/com/bytecode/opencsv/CSVWriter;->quotechar:C

    if-eqz v1, :cond_2

    iget-char v1, p0, Lau/com/bytecode/opencsv/CSVWriter;->quotechar:C

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_6
    iget-object v0, p0, Lau/com/bytecode/opencsv/CSVWriter;->lineEnd:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lau/com/bytecode/opencsv/CSVWriter;->pw:Ljava/io/PrintWriter;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->write(Ljava/lang/String;)V

    goto :goto_0
.end method
