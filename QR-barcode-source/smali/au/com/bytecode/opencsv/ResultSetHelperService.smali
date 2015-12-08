.class public Lau/com/bytecode/opencsv/ResultSetHelperService;
.super Ljava/lang/Object;

# interfaces
.implements Lau/com/bytecode/opencsv/ResultSetHelper;


# static fields
.field public static final CLOBBUFFERSIZE:I = 0x800

.field private static final LONGNVARCHAR:I = -0x10

.field private static final NCHAR:I = -0xf

.field private static final NCLOB:I = 0x7db

.field private static final NVARCHAR:I = -0x9


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private getColumnValue(Ljava/sql/ResultSet;II)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;,
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, ""

    sparse-switch p2, :sswitch_data_0

    const-string v0, ""

    :cond_0
    :goto_0
    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    return-object v0

    :sswitch_0
    invoke-interface {p1, p3}, Ljava/sql/ResultSet;->getObject(I)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lau/com/bytecode/opencsv/ResultSetHelperService;->handleObject(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :sswitch_1
    invoke-interface {p1, p3}, Ljava/sql/ResultSet;->getBoolean(I)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :sswitch_2
    invoke-interface {p1, p3}, Ljava/sql/ResultSet;->getClob(I)Ljava/sql/Clob;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lau/com/bytecode/opencsv/ResultSetHelperService;->read(Ljava/sql/Clob;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :sswitch_3
    invoke-direct {p0, p1, p3}, Lau/com/bytecode/opencsv/ResultSetHelperService;->handleLong(Ljava/sql/ResultSet;I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :sswitch_4
    invoke-interface {p1, p3}, Ljava/sql/ResultSet;->getBigDecimal(I)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-direct {p0, v0}, Lau/com/bytecode/opencsv/ResultSetHelperService;->handleBigDecimal(Ljava/math/BigDecimal;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :sswitch_5
    invoke-direct {p0, p1, p3}, Lau/com/bytecode/opencsv/ResultSetHelperService;->handleInteger(Ljava/sql/ResultSet;I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :sswitch_6
    invoke-direct {p0, p1, p3}, Lau/com/bytecode/opencsv/ResultSetHelperService;->handleDate(Ljava/sql/ResultSet;I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :sswitch_7
    invoke-interface {p1, p3}, Ljava/sql/ResultSet;->getTime(I)Ljava/sql/Time;

    move-result-object v0

    invoke-direct {p0, v0}, Lau/com/bytecode/opencsv/ResultSetHelperService;->handleTime(Ljava/sql/Time;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :sswitch_8
    invoke-interface {p1, p3}, Ljava/sql/ResultSet;->getTimestamp(I)Ljava/sql/Timestamp;

    move-result-object v0

    invoke-direct {p0, v0}, Lau/com/bytecode/opencsv/ResultSetHelperService;->handleTimestamp(Ljava/sql/Timestamp;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :sswitch_9
    invoke-interface {p1, p3}, Ljava/sql/ResultSet;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x10 -> :sswitch_9
        -0xf -> :sswitch_9
        -0x9 -> :sswitch_9
        -0x7 -> :sswitch_0
        -0x6 -> :sswitch_5
        -0x5 -> :sswitch_3
        -0x1 -> :sswitch_9
        0x1 -> :sswitch_9
        0x2 -> :sswitch_4
        0x3 -> :sswitch_4
        0x4 -> :sswitch_5
        0x5 -> :sswitch_5
        0x6 -> :sswitch_4
        0x7 -> :sswitch_4
        0x8 -> :sswitch_4
        0xc -> :sswitch_9
        0x10 -> :sswitch_1
        0x5b -> :sswitch_6
        0x5c -> :sswitch_7
        0x5d -> :sswitch_8
        0x7d0 -> :sswitch_0
        0x7d5 -> :sswitch_2
        0x7db -> :sswitch_2
    .end sparse-switch
.end method

.method private handleBigDecimal(Ljava/math/BigDecimal;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private handleDate(Ljava/sql/ResultSet;I)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    invoke-interface {p1, p2}, Ljava/sql/ResultSet;->getDate(I)Ljava/sql/Date;

    move-result-object v1

    const/4 v0, 0x0

    if-eqz v1, :cond_0

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v2, "dd-MMM-yyyy"

    invoke-direct {v0, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private handleInteger(Ljava/sql/ResultSet;I)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    invoke-interface {p1, p2}, Ljava/sql/ResultSet;->getInt(I)I

    move-result v0

    invoke-interface {p1}, Ljava/sql/ResultSet;->wasNull()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private handleLong(Ljava/sql/ResultSet;I)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    invoke-interface {p1, p2}, Ljava/sql/ResultSet;->getLong(I)J

    move-result-wide v0

    invoke-interface {p1}, Ljava/sql/ResultSet;->wasNull()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private handleObject(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private handleTime(Ljava/sql/Time;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Ljava/sql/Time;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private handleTimestamp(Ljava/sql/Timestamp;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "dd-MMM-yyyy HH:mm:ss"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private static read(Ljava/sql/Clob;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v5, 0x0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ljava/sql/Clob;->length()J

    move-result-wide v2

    long-to-int v1, v2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-interface {p0}, Ljava/sql/Clob;->getCharacterStream()Ljava/io/Reader;

    move-result-object v1

    const/16 v2, 0x800

    new-array v2, v2, [C

    :goto_0
    array-length v3, v2

    invoke-virtual {v1, v2, v5, v3}, Ljava/io/Reader;->read([CII)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    invoke-virtual {v0, v2, v5, v3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getColumnNames(Ljava/sql/ResultSet;)[Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/sql/ResultSet;->getMetaData()Ljava/sql/ResultSetMetaData;

    move-result-object v2

    const/4 v0, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/sql/ResultSetMetaData;->getColumnCount()I

    move-result v3

    if-ge v0, v3, :cond_0

    add-int/lit8 v3, v0, 0x1

    invoke-interface {v2, v3}, Ljava/sql/ResultSetMetaData;->getColumnName(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public getColumnValues(Ljava/sql/ResultSet;)[Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;,
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/sql/ResultSet;->getMetaData()Ljava/sql/ResultSetMetaData;

    move-result-object v2

    const/4 v0, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/sql/ResultSetMetaData;->getColumnCount()I

    move-result v3

    if-ge v0, v3, :cond_0

    add-int/lit8 v3, v0, 0x1

    invoke-interface {v2, v3}, Ljava/sql/ResultSetMetaData;->getColumnType(I)I

    move-result v3

    add-int/lit8 v4, v0, 0x1

    invoke-direct {p0, p1, v3, v4}, Lau/com/bytecode/opencsv/ResultSetHelperService;->getColumnValue(Ljava/sql/ResultSet;II)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method
