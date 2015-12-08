.class public Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;
.super Ljava/lang/Object;

# interfaces
.implements Lau/com/bytecode/opencsv/bean/MappingStrategy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lau/com/bytecode/opencsv/bean/MappingStrategy",
        "<TT;>;"
    }
.end annotation


# instance fields
.field protected descriptorMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/beans/PropertyDescriptor;",
            ">;"
        }
    .end annotation
.end field

.field protected header:[Ljava/lang/String;

.field protected type:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;->descriptorMap:Ljava/util/Map;

    return-void
.end method

.method private loadDescriptors(Ljava/lang/Class;)[Ljava/beans/PropertyDescriptor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<TT;>;)[",
            "Ljava/beans/PropertyDescriptor;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/beans/IntrospectionException;
        }
    .end annotation

    invoke-static {p1}, Ljava/beans/Introspector;->getBeanInfo(Ljava/lang/Class;)Ljava/beans/BeanInfo;

    move-result-object v0

    invoke-interface {v0}, Ljava/beans/BeanInfo;->getPropertyDescriptors()[Ljava/beans/PropertyDescriptor;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public captureHeader(Lau/com/bytecode/opencsv/CSVReader;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Lau/com/bytecode/opencsv/CSVReader;->readNext()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;->header:[Ljava/lang/String;

    return-void
.end method

.method public createBean()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InstantiationException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    iget-object v0, p0, Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;->type:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public findDescriptor(I)Ljava/beans/PropertyDescriptor;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/beans/IntrospectionException;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;->getColumnName(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {p0, v0}, Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;->findDescriptor(Ljava/lang/String;)Ljava/beans/PropertyDescriptor;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected findDescriptor(Ljava/lang/String;)Ljava/beans/PropertyDescriptor;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/beans/IntrospectionException;
        }
    .end annotation

    iget-object v0, p0, Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;->descriptorMap:Ljava/util/Map;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;->loadDescriptorMap(Ljava/lang/Class;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;->descriptorMap:Ljava/util/Map;

    :cond_0
    iget-object v0, p0, Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;->descriptorMap:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/beans/PropertyDescriptor;

    return-object v0
.end method

.method protected getColumnName(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;->header:[Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;->header:[Ljava/lang/String;

    array-length v0, v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;->header:[Ljava/lang/String;

    aget-object v0, v0, p1

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;->type:Ljava/lang/Class;

    return-object v0
.end method

.method protected loadDescriptorMap(Ljava/lang/Class;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/beans/PropertyDescriptor;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/beans/IntrospectionException;
        }
    .end annotation

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0}, Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-direct {p0, v0}, Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;->loadDescriptors(Ljava/lang/Class;)[Ljava/beans/PropertyDescriptor;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    invoke-virtual {v4}, Ljava/beans/PropertyDescriptor;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method protected matches(Ljava/lang/String;Ljava/beans/PropertyDescriptor;)Z
    .locals 2

    invoke-virtual {p2}, Ljava/beans/PropertyDescriptor;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public setType(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lau/com/bytecode/opencsv/bean/HeaderColumnNameMappingStrategy;->type:Ljava/lang/Class;

    return-void
.end method
