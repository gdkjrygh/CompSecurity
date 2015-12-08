.class public Lau/com/bytecode/opencsv/bean/ColumnPositionMappingStrategy;
.super Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private columnMapping:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lau/com/bytecode/opencsv/bean/ColumnPositionMappingStrategy;->columnMapping:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public captureHeader(Lau/com/bytecode/opencsv/CSVReader;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method public getColumnMapping()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lau/com/bytecode/opencsv/bean/ColumnPositionMappingStrategy;->columnMapping:[Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lau/com/bytecode/opencsv/bean/ColumnPositionMappingStrategy;->columnMapping:[Ljava/lang/String;

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected getColumnName(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lau/com/bytecode/opencsv/bean/ColumnPositionMappingStrategy;->columnMapping:[Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lau/com/bytecode/opencsv/bean/ColumnPositionMappingStrategy;->columnMapping:[Ljava/lang/String;

    array-length v0, v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lau/com/bytecode/opencsv/bean/ColumnPositionMappingStrategy;->columnMapping:[Ljava/lang/String;

    aget-object v0, v0, p1

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setColumnMapping([Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    :goto_0
    iput-object v0, p0, Lau/com/bytecode/opencsv/bean/ColumnPositionMappingStrategy;->columnMapping:[Ljava/lang/String;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
