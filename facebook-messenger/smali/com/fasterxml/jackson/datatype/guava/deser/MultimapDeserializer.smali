.class public Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;
.super Lcom/fasterxml/jackson/databind/JsonDeserializer;
.source "MultimapDeserializer.java"

# interfaces
.implements Lcom/fasterxml/jackson/databind/deser/ContextualDeserializer;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/databind/JsonDeserializer",
        "<",
        "Lcom/google/common/a/iw",
        "<**>;>;",
        "Lcom/fasterxml/jackson/databind/deser/ContextualDeserializer;"
    }
.end annotation


# static fields
.field private static final METHOD_NAMES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final creatorMethod:Ljava/lang/reflect/Method;

.field private final elementDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/databind/JsonDeserializer",
            "<*>;"
        }
    .end annotation
.end field

.field private final elementTypeDeserializer:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

.field private final keyDeserializer:Lcom/fasterxml/jackson/databind/KeyDeserializer;

.field private final type:Lcom/fasterxml/jackson/databind/type/MapLikeType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 23
    const-string v0, "copyOf"

    const-string v1, "create"

    invoke-static {v0, v1}, Lcom/google/common/a/es;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->METHOD_NAMES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/type/MapLikeType;Lcom/fasterxml/jackson/databind/KeyDeserializer;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/type/MapLikeType;",
            "Lcom/fasterxml/jackson/databind/KeyDeserializer;",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 42
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/type/MapLikeType;->getRawClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->findTransformer(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;-><init>(Lcom/fasterxml/jackson/databind/type/MapLikeType;Lcom/fasterxml/jackson/databind/KeyDeserializer;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;Ljava/lang/reflect/Method;)V

    .line 44
    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/type/MapLikeType;Lcom/fasterxml/jackson/databind/KeyDeserializer;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;Ljava/lang/reflect/Method;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/type/MapLikeType;",
            "Lcom/fasterxml/jackson/databind/KeyDeserializer;",
            "Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer",
            "<*>;",
            "Ljava/lang/reflect/Method;",
            ")V"
        }
    .end annotation

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;-><init>()V

    .line 51
    iput-object p1, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->type:Lcom/fasterxml/jackson/databind/type/MapLikeType;

    .line 52
    iput-object p2, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->keyDeserializer:Lcom/fasterxml/jackson/databind/KeyDeserializer;

    .line 53
    iput-object p3, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->elementTypeDeserializer:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    .line 54
    iput-object p4, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->elementDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    .line 55
    iput-object p5, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->creatorMethod:Ljava/lang/reflect/Method;

    .line 56
    return-void
.end method

.method private _peel(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 1

    .prologue
    .line 177
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 178
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    goto :goto_0

    .line 180
    :cond_0
    return-object p1
.end method

.method private expect(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/core/JsonToken;)V
    .locals 3

    .prologue
    .line 170
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    if-eq v0, p2, :cond_0

    .line 171
    new-instance v0, Lcom/fasterxml/jackson/databind/JsonMappingException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expecting "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", found "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentLocation()Lcom/fasterxml/jackson/core/JsonLocation;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/fasterxml/jackson/databind/JsonMappingException;-><init>(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonLocation;)V

    throw v0

    .line 173
    :cond_0
    return-void
.end method

.method private static findTransformer(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 135
    const-class v0, Lcom/google/common/a/gw;

    if-eq p0, v0, :cond_0

    const-class v0, Lcom/google/common/a/hp;

    if-eq p0, v0, :cond_0

    const-class v0, Lcom/google/common/a/iw;

    if-ne p0, v0, :cond_1

    :cond_0
    move-object v0, v1

    .line 165
    :goto_0
    return-object v0

    .line 142
    :cond_1
    sget-object v0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->METHOD_NAMES:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 144
    const/4 v3, 0x1

    :try_start_0
    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    const-class v5, Lcom/google/common/a/iw;

    aput-object v5, v3, v4

    invoke-virtual {p0, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 145
    if-eqz v0, :cond_2

    goto :goto_0

    .line 154
    :cond_3
    sget-object v0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->METHOD_NAMES:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 156
    const/4 v3, 0x1

    :try_start_1
    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    const-class v5, Lcom/google/common/a/iw;

    aput-object v5, v3, v4

    invoke-virtual {p0, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    .line 157
    if-eqz v0, :cond_4

    goto :goto_0

    :cond_5
    move-object v0, v1

    .line 165
    goto :goto_0

    .line 160
    :catch_0
    move-exception v0

    goto :goto_2

    .line 148
    :catch_1
    move-exception v0

    goto :goto_1
.end method


# virtual methods
.method public createContextual(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            "Lcom/fasterxml/jackson/databind/BeanProperty;",
            ")",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 65
    iget-object v2, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->keyDeserializer:Lcom/fasterxml/jackson/databind/KeyDeserializer;

    .line 66
    if-nez v2, :cond_0

    .line 67
    iget-object v0, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->type:Lcom/fasterxml/jackson/databind/type/MapLikeType;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/type/MapLikeType;->getKeyType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->findKeyDeserializer(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/KeyDeserializer;

    move-result-object v2

    .line 69
    :cond_0
    iget-object v4, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->elementDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    .line 70
    if-nez v4, :cond_1

    .line 71
    iget-object v0, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->type:Lcom/fasterxml/jackson/databind/type/MapLikeType;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/type/MapLikeType;->getContentType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->findContextualValueDeserializer(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object v4

    .line 74
    :cond_1
    iget-object v3, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->elementTypeDeserializer:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    .line 75
    if-eqz v3, :cond_2

    if-eqz p2, :cond_2

    .line 76
    invoke-virtual {v3, p2}, Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;->forProperty(Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    move-result-object v3

    .line 78
    :cond_2
    new-instance v0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;

    iget-object v1, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->type:Lcom/fasterxml/jackson/databind/type/MapLikeType;

    iget-object v5, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->creatorMethod:Ljava/lang/reflect/Method;

    invoke-direct/range {v0 .. v5}, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;-><init>(Lcom/fasterxml/jackson/databind/type/MapLikeType;Lcom/fasterxml/jackson/databind/KeyDeserializer;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/JsonDeserializer;Ljava/lang/reflect/Method;)V

    return-object v0
.end method

.method public deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/google/common/a/iw;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/core/JsonParser;",
            "Lcom/fasterxml/jackson/databind/DeserializationContext;",
            ")",
            "Lcom/google/common/a/iw",
            "<**>;"
        }
    .end annotation

    .prologue
    .line 86
    invoke-static {}, Lcom/google/common/a/gw;->a()Lcom/google/common/a/gw;

    move-result-object v1

    .line 91
    :cond_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v0

    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->END_OBJECT:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v0, v2, :cond_3

    .line 94
    iget-object v0, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->keyDeserializer:Lcom/fasterxml/jackson/databind/KeyDeserializer;

    if-eqz v0, :cond_1

    .line 96
    iget-object v0, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->keyDeserializer:Lcom/fasterxml/jackson/databind/KeyDeserializer;

    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, p2}, Lcom/fasterxml/jackson/databind/KeyDeserializer;->deserializeKey(Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v0

    .line 103
    :goto_0
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    .line 104
    sget-object v2, Lcom/fasterxml/jackson/core/JsonToken;->START_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-direct {p0, p1, v2}, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->expect(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/core/JsonToken;)V

    .line 106
    :goto_1
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    move-result-object v2

    sget-object v3, Lcom/fasterxml/jackson/core/JsonToken;->END_ARRAY:Lcom/fasterxml/jackson/core/JsonToken;

    if-eq v2, v3, :cond_0

    .line 108
    iget-object v2, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->elementTypeDeserializer:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    if-eqz v2, :cond_2

    .line 110
    iget-object v2, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->elementDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    iget-object v3, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->elementTypeDeserializer:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    invoke-virtual {v2, p1, p2, v3}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserializeWithType(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/common/a/gw;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_1

    .line 100
    :cond_1
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->getCurrentName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 114
    :cond_2
    iget-object v2, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->elementDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    invoke-virtual {v2, p1, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/common/a/gw;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_1

    .line 118
    :cond_3
    iget-object v0, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->creatorMethod:Ljava/lang/reflect/Method;

    if-nez v0, :cond_4

    move-object v0, v1

    .line 122
    :goto_2
    return-object v0

    :cond_4
    :try_start_0
    iget-object v0, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->creatorMethod:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/iw;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_2

    .line 123
    :catch_0
    move-exception v0

    .line 124
    new-instance v1, Lcom/fasterxml/jackson/databind/JsonMappingException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not map to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->type:Lcom/fasterxml/jackson/databind/type/MapLikeType;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->_peel(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/fasterxml/jackson/databind/JsonMappingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 125
    :catch_1
    move-exception v0

    .line 126
    new-instance v1, Lcom/fasterxml/jackson/databind/JsonMappingException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not map to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->type:Lcom/fasterxml/jackson/databind/type/MapLikeType;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->_peel(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/fasterxml/jackson/databind/JsonMappingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 127
    :catch_2
    move-exception v0

    .line 128
    new-instance v1, Lcom/fasterxml/jackson/databind/JsonMappingException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not map to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->type:Lcom/fasterxml/jackson/databind/type/MapLikeType;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->_peel(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/fasterxml/jackson/databind/JsonMappingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public bridge synthetic deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 20
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/datatype/guava/deser/MultimapDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lcom/google/common/a/iw;

    move-result-object v0

    return-object v0
.end method
