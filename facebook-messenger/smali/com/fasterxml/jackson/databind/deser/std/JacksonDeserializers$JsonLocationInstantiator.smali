.class public Lcom/fasterxml/jackson/databind/deser/std/JacksonDeserializers$JsonLocationInstantiator;
.super Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;
.source "JacksonDeserializers.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 81
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/deser/ValueInstantiator;-><init>()V

    return-void
.end method

.method private static final _int(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 114
    if-nez p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result v0

    goto :goto_0
.end method

.method private static final _long(Ljava/lang/Object;)J
    .locals 2

    .prologue
    .line 111
    if-nez p0, :cond_0

    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0

    :cond_0
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    goto :goto_0
.end method


# virtual methods
.method public canCreateFromObjectWith()Z
    .locals 1

    .prologue
    .line 89
    const/4 v0, 0x1

    return v0
.end method

.method public createFromObjectWith(Lcom/fasterxml/jackson/databind/DeserializationContext;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .prologue
    .line 106
    new-instance v0, Lcom/fasterxml/jackson/core/JsonLocation;

    const/4 v1, 0x0

    aget-object v1, p2, v1

    const/4 v2, 0x1

    aget-object v2, p2, v2

    invoke-static {v2}, Lcom/fasterxml/jackson/databind/deser/std/JacksonDeserializers$JsonLocationInstantiator;->_long(Ljava/lang/Object;)J

    move-result-wide v2

    const/4 v4, 0x2

    aget-object v4, p2, v4

    invoke-static {v4}, Lcom/fasterxml/jackson/databind/deser/std/JacksonDeserializers$JsonLocationInstantiator;->_long(Ljava/lang/Object;)J

    move-result-wide v4

    const/4 v6, 0x3

    aget-object v6, p2, v6

    invoke-static {v6}, Lcom/fasterxml/jackson/databind/deser/std/JacksonDeserializers$JsonLocationInstantiator;->_int(Ljava/lang/Object;)I

    move-result v6

    const/4 v7, 0x4

    aget-object v7, p2, v7

    invoke-static {v7}, Lcom/fasterxml/jackson/databind/deser/std/JacksonDeserializers$JsonLocationInstantiator;->_int(Ljava/lang/Object;)I

    move-result v7

    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/core/JsonLocation;-><init>(Ljava/lang/Object;JJII)V

    return-object v0
.end method

.method public getFromObjectArguments(Lcom/fasterxml/jackson/databind/DeserializationConfig;)[Lcom/fasterxml/jackson/databind/deser/CreatorProperty;
    .locals 14

    .prologue
    const/4 v13, 0x3

    const/4 v12, 0x2

    const/4 v11, 0x1

    const/4 v6, 0x0

    const/4 v3, 0x0

    .line 93
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/DeserializationConfig;->constructType(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v8

    .line 94
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/DeserializationConfig;->constructType(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v9

    .line 95
    const/4 v0, 0x5

    new-array v10, v0, [Lcom/fasterxml/jackson/databind/deser/CreatorProperty;

    new-instance v0, Lcom/fasterxml/jackson/databind/deser/CreatorProperty;

    const-string v1, "sourceRef"

    const-class v2, Ljava/lang/Object;

    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/DeserializationConfig;->constructType(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v2

    move-object v4, v3

    move-object v5, v3

    move-object v7, v3

    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/databind/deser/CreatorProperty;-><init>(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/util/Annotations;Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;ILjava/lang/Object;)V

    aput-object v0, v10, v6

    new-instance v0, Lcom/fasterxml/jackson/databind/deser/CreatorProperty;

    const-string v1, "byteOffset"

    move-object v2, v9

    move-object v4, v3

    move-object v5, v3

    move v6, v11

    move-object v7, v3

    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/databind/deser/CreatorProperty;-><init>(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/util/Annotations;Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;ILjava/lang/Object;)V

    aput-object v0, v10, v11

    new-instance v0, Lcom/fasterxml/jackson/databind/deser/CreatorProperty;

    const-string v1, "charOffset"

    move-object v2, v9

    move-object v4, v3

    move-object v5, v3

    move v6, v12

    move-object v7, v3

    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/databind/deser/CreatorProperty;-><init>(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/util/Annotations;Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;ILjava/lang/Object;)V

    aput-object v0, v10, v12

    new-instance v0, Lcom/fasterxml/jackson/databind/deser/CreatorProperty;

    const-string v1, "lineNr"

    move-object v2, v8

    move-object v4, v3

    move-object v5, v3

    move v6, v13

    move-object v7, v3

    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/databind/deser/CreatorProperty;-><init>(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/util/Annotations;Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;ILjava/lang/Object;)V

    aput-object v0, v10, v13

    const/4 v9, 0x4

    new-instance v0, Lcom/fasterxml/jackson/databind/deser/CreatorProperty;

    const-string v1, "columnNr"

    const/4 v6, 0x4

    move-object v2, v8

    move-object v4, v3

    move-object v5, v3

    move-object v7, v3

    invoke-direct/range {v0 .. v7}, Lcom/fasterxml/jackson/databind/deser/CreatorProperty;-><init>(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/util/Annotations;Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;ILjava/lang/Object;)V

    aput-object v0, v10, v9

    return-object v10
.end method

.method public bridge synthetic getFromObjectArguments(Lcom/fasterxml/jackson/databind/DeserializationConfig;)[Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
    .locals 1

    .prologue
    .line 81
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/std/JacksonDeserializers$JsonLocationInstantiator;->getFromObjectArguments(Lcom/fasterxml/jackson/databind/DeserializationConfig;)[Lcom/fasterxml/jackson/databind/deser/CreatorProperty;

    move-result-object v0

    return-object v0
.end method

.method public getValueTypeDesc()Ljava/lang/String;
    .locals 1

    .prologue
    .line 85
    const-class v0, Lcom/fasterxml/jackson/core/JsonLocation;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
