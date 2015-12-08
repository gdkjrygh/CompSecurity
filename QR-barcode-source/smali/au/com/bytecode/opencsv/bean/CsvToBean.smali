.class public Lau/com/bytecode/opencsv/bean/CsvToBean;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private editorMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/beans/PropertyEditor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lau/com/bytecode/opencsv/bean/CsvToBean;->editorMap:Ljava/util/Map;

    return-void
.end method

.method private addEditorToMap(Ljava/lang/Class;Ljava/beans/PropertyEditor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/beans/PropertyEditor;",
            ")V"
        }
    .end annotation

    if-eqz p2, :cond_0

    iget-object v0, p0, Lau/com/bytecode/opencsv/bean/CsvToBean;->editorMap:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private checkForTrim(Ljava/lang/String;Ljava/beans/PropertyDescriptor;)Ljava/lang/String;
    .locals 1

    invoke-direct {p0, p2}, Lau/com/bytecode/opencsv/bean/CsvToBean;->trimmableProperty(Ljava/beans/PropertyDescriptor;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private getPropertyEditorValue(Ljava/lang/Class;)Ljava/beans/PropertyEditor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/beans/PropertyEditor;"
        }
    .end annotation

    iget-object v0, p0, Lau/com/bytecode/opencsv/bean/CsvToBean;->editorMap:Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lau/com/bytecode/opencsv/bean/CsvToBean;->editorMap:Ljava/util/Map;

    :cond_0
    iget-object v0, p0, Lau/com/bytecode/opencsv/bean/CsvToBean;->editorMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/beans/PropertyEditor;

    if-nez v0, :cond_1

    invoke-static {p1}, Ljava/beans/PropertyEditorManager;->findEditor(Ljava/lang/Class;)Ljava/beans/PropertyEditor;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lau/com/bytecode/opencsv/bean/CsvToBean;->addEditorToMap(Ljava/lang/Class;Ljava/beans/PropertyEditor;)V

    :cond_1
    return-object v0
.end method

.method private trimmableProperty(Ljava/beans/PropertyDescriptor;)Z
    .locals 2

    invoke-virtual {p1}, Ljava/beans/PropertyDescriptor;->getPropertyType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "String"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected convertValue(Ljava/lang/String;Ljava/beans/PropertyDescriptor;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InstantiationException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    invoke-virtual {p0, p2}, Lau/com/bytecode/opencsv/bean/CsvToBean;->getPropertyEditor(Ljava/beans/PropertyDescriptor;)Ljava/beans/PropertyEditor;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/beans/PropertyEditor;->setAsText(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/beans/PropertyEditor;->getValue()Ljava/lang/Object;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method protected getPropertyEditor(Ljava/beans/PropertyDescriptor;)Ljava/beans/PropertyEditor;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InstantiationException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/beans/PropertyDescriptor;->getPropertyEditorClass()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/beans/PropertyEditor;

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Ljava/beans/PropertyDescriptor;->getPropertyType()Ljava/lang/Class;

    move-result-object v0

    invoke-direct {p0, v0}, Lau/com/bytecode/opencsv/bean/CsvToBean;->getPropertyEditorValue(Ljava/lang/Class;)Ljava/beans/PropertyEditor;

    move-result-object v0

    goto :goto_0
.end method

.method public parse(Lau/com/bytecode/opencsv/bean/MappingStrategy;Lau/com/bytecode/opencsv/CSVReader;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lau/com/bytecode/opencsv/bean/MappingStrategy",
            "<TT;>;",
            "Lau/com/bytecode/opencsv/CSVReader;",
            ")",
            "Ljava/util/List",
            "<TT;>;"
        }
    .end annotation

    :try_start_0
    invoke-interface {p1, p2}, Lau/com/bytecode/opencsv/bean/MappingStrategy;->captureHeader(Lau/com/bytecode/opencsv/CSVReader;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-virtual {p2}, Lau/com/bytecode/opencsv/CSVReader;->readNext()[Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1, v1}, Lau/com/bytecode/opencsv/bean/CsvToBean;->processLine(Lau/com/bytecode/opencsv/bean/MappingStrategy;[Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Error parsing CSV!"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    return-object v0
.end method

.method public parse(Lau/com/bytecode/opencsv/bean/MappingStrategy;Ljava/io/Reader;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lau/com/bytecode/opencsv/bean/MappingStrategy",
            "<TT;>;",
            "Ljava/io/Reader;",
            ")",
            "Ljava/util/List",
            "<TT;>;"
        }
    .end annotation

    new-instance v0, Lau/com/bytecode/opencsv/CSVReader;

    invoke-direct {v0, p2}, Lau/com/bytecode/opencsv/CSVReader;-><init>(Ljava/io/Reader;)V

    invoke-virtual {p0, p1, v0}, Lau/com/bytecode/opencsv/bean/CsvToBean;->parse(Lau/com/bytecode/opencsv/bean/MappingStrategy;Lau/com/bytecode/opencsv/CSVReader;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected processLine(Lau/com/bytecode/opencsv/bean/MappingStrategy;[Ljava/lang/String;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lau/com/bytecode/opencsv/bean/MappingStrategy",
            "<TT;>;[",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/reflect/InvocationTargetException;,
            Ljava/lang/InstantiationException;,
            Ljava/beans/IntrospectionException;
        }
    .end annotation

    const/4 v1, 0x0

    invoke-interface {p1}, Lau/com/bytecode/opencsv/bean/MappingStrategy;->createBean()Ljava/lang/Object;

    move-result-object v2

    move v0, v1

    :goto_0
    array-length v3, p2

    if-ge v0, v3, :cond_1

    invoke-interface {p1, v0}, Lau/com/bytecode/opencsv/bean/MappingStrategy;->findDescriptor(I)Ljava/beans/PropertyDescriptor;

    move-result-object v3

    if-eqz v3, :cond_0

    aget-object v4, p2, v0

    invoke-direct {p0, v4, v3}, Lau/com/bytecode/opencsv/bean/CsvToBean;->checkForTrim(Ljava/lang/String;Ljava/beans/PropertyDescriptor;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4, v3}, Lau/com/bytecode/opencsv/bean/CsvToBean;->convertValue(Ljava/lang/String;Ljava/beans/PropertyDescriptor;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3}, Ljava/beans/PropertyDescriptor;->getWriteMethod()Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v4, v5, v1

    invoke-virtual {v3, v2, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-object v2
.end method
