.class public Lau/com/bytecode/opencsv/bean/HeaderColumnNameTranslateMappingStrategy;
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
.field private columnMapping:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lau/com/bytecode/opencsv/bean/HeaderColumnNameTranslateMappingStrategy;->columnMapping:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public getColumnMapping()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lau/com/bytecode/opencsv/bean/HeaderColumnNameTranslateMappingStrategy;->columnMapping:Ljava/util/Map;

    return-object v0
.end method

.method protected getColumnName(I)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lau/com/bytecode/opencsv/bean/HeaderColumnNameTranslateMappingStrategy;->header:[Ljava/lang/String;

    array-length v0, v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lau/com/bytecode/opencsv/bean/HeaderColumnNameTranslateMappingStrategy;->columnMapping:Ljava/util/Map;

    iget-object v1, p0, Lau/com/bytecode/opencsv/bean/HeaderColumnNameTranslateMappingStrategy;->header:[Ljava/lang/String;

    aget-object v1, v1, p1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setColumnMapping(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lau/com/bytecode/opencsv/bean/HeaderColumnNameTranslateMappingStrategy;->columnMapping:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method
