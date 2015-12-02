.class public Lcom/fasterxml/jackson/databind/type/TypeBindings;
.super Ljava/lang/Object;
.source "TypeBindings.java"


# static fields
.field private static final NO_TYPES:[Lcom/fasterxml/jackson/databind/JavaType;

.field public static final UNBOUND:Lcom/fasterxml/jackson/databind/JavaType;


# instance fields
.field protected _bindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ">;"
        }
    .end annotation
.end field

.field protected final _contextClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field protected final _contextType:Lcom/fasterxml/jackson/databind/JavaType;

.field private final _parentBindings:Lcom/fasterxml/jackson/databind/type/TypeBindings;

.field protected _placeholders:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected final _typeFactory:Lcom/fasterxml/jackson/databind/type/TypeFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 13
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/fasterxml/jackson/databind/JavaType;

    sput-object v0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->NO_TYPES:[Lcom/fasterxml/jackson/databind/JavaType;

    .line 18
    new-instance v0, Lcom/fasterxml/jackson/databind/type/SimpleType;

    const-class v1, Ljava/lang/Object;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/type/SimpleType;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->UNBOUND:Lcom/fasterxml/jackson/databind/JavaType;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/JavaType;)V
    .locals 2

    .prologue
    .line 69
    const/4 v0, 0x0

    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/fasterxml/jackson/databind/type/TypeBindings;-><init>(Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/type/TypeBindings;Ljava/lang/Class;Lcom/fasterxml/jackson/databind/JavaType;)V

    .line 70
    return-void
.end method

.method private constructor <init>(Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/type/TypeBindings;Ljava/lang/Class;Lcom/fasterxml/jackson/databind/JavaType;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/type/TypeFactory;",
            "Lcom/fasterxml/jackson/databind/type/TypeBindings;",
            "Ljava/lang/Class",
            "<*>;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            ")V"
        }
    .end annotation

    .prologue
    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_typeFactory:Lcom/fasterxml/jackson/databind/type/TypeFactory;

    .line 86
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_parentBindings:Lcom/fasterxml/jackson/databind/type/TypeBindings;

    .line 87
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextClass:Ljava/lang/Class;

    .line 88
    iput-object p4, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextType:Lcom/fasterxml/jackson/databind/JavaType;

    .line 89
    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/type/TypeFactory;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/type/TypeFactory;",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 64
    invoke-direct {p0, p1, v0, p2, v0}, Lcom/fasterxml/jackson/databind/type/TypeBindings;-><init>(Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/type/TypeBindings;Ljava/lang/Class;Lcom/fasterxml/jackson/databind/JavaType;)V

    .line 65
    return-void
.end method


# virtual methods
.method public _addPlaceholder(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_placeholders:Ljava/util/HashSet;

    if-nez v0, :cond_0

    .line 225
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_placeholders:Ljava/util/HashSet;

    .line 227
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_placeholders:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 228
    return-void
.end method

.method protected _resolve()V
    .locals 4

    .prologue
    .line 203
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextClass:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_resolveBindings(Ljava/lang/reflect/Type;)V

    .line 206
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextType:Lcom/fasterxml/jackson/databind/JavaType;

    if-eqz v0, :cond_0

    .line 207
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JavaType;->containedTypeCount()I

    move-result v1

    .line 208
    if-lez v1, :cond_0

    .line 209
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 210
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/JavaType;->containedTypeName(I)Ljava/lang/String;

    move-result-object v2

    .line 211
    iget-object v3, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v3, v0}, Lcom/fasterxml/jackson/databind/JavaType;->containedType(I)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v3

    .line 212
    invoke-virtual {p0, v2, v3}, Lcom/fasterxml/jackson/databind/type/TypeBindings;->addBinding(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;)V

    .line 209
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 218
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    if-nez v0, :cond_1

    .line 219
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    .line 221
    :cond_1
    return-void
.end method

.method protected _resolveBindings(Ljava/lang/reflect/Type;)V
    .locals 9

    .prologue
    const/4 v2, 0x0

    .line 232
    if-nez p1, :cond_1

    .line 313
    :cond_0
    return-void

    .line 235
    :cond_1
    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_6

    .line 236
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 237
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v1

    .line 238
    if-eqz v1, :cond_5

    array-length v0, v1

    if-lez v0, :cond_5

    .line 239
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 240
    invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v3

    .line 241
    array-length v4, v3

    array-length v5, v1

    if-eq v4, v5, :cond_2

    .line 242
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Strange parametrized type (in class "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "): number of type arguments != number of type parameters ("

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " vs "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    array-length v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 244
    :cond_2
    array-length v4, v1

    move v0, v2

    :goto_0
    if-ge v0, v4, :cond_5

    .line 245
    aget-object v5, v3, v0

    .line 246
    invoke-interface {v5}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v5

    .line 247
    iget-object v6, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    if-nez v6, :cond_4

    .line 248
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v6, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    .line 256
    :cond_3
    invoke-virtual {p0, v5}, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_addPlaceholder(Ljava/lang/String;)V

    .line 258
    iget-object v6, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    iget-object v7, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_typeFactory:Lcom/fasterxml/jackson/databind/type/TypeFactory;

    aget-object v8, v1, v0

    invoke-virtual {v7, v8, p0}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->_constructType(Ljava/lang/reflect/Type;Lcom/fasterxml/jackson/databind/type/TypeBindings;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v7

    invoke-interface {v6, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 253
    :cond_4
    iget-object v6, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_1

    .line 261
    :cond_5
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 309
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_resolveBindings(Ljava/lang/reflect/Type;)V

    .line 310
    invoke-virtual {v0}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object v0

    array-length v1, v0

    :goto_3
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 311
    invoke-virtual {p0, v3}, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_resolveBindings(Ljava/lang/reflect/Type;)V

    .line 310
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 262
    :cond_6
    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 263
    check-cast p1, Ljava/lang/Class;

    .line 269
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_resolveBindings(Ljava/lang/reflect/Type;)V

    .line 273
    invoke-virtual {p1}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v3

    .line 274
    if-eqz v3, :cond_c

    array-length v0, v3

    if-lez v0, :cond_c

    .line 275
    const/4 v0, 0x0

    .line 277
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextType:Lcom/fasterxml/jackson/databind/JavaType;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 278
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_typeFactory:Lcom/fasterxml/jackson/databind/type/TypeFactory;

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v0, v1, p1}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->findTypeParameters(Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/Class;)[Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    :cond_7
    move v1, v2

    .line 281
    :goto_4
    array-length v4, v3

    if-ge v1, v4, :cond_c

    .line 282
    aget-object v4, v3, v1

    .line 284
    invoke-interface {v4}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v5

    .line 285
    invoke-interface {v4}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    move-result-object v4

    aget-object v4, v4, v2

    .line 286
    if-eqz v4, :cond_9

    .line 287
    iget-object v6, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    if-nez v6, :cond_a

    .line 288
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v6, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    .line 292
    :cond_8
    invoke-virtual {p0, v5}, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_addPlaceholder(Ljava/lang/String;)V

    .line 294
    if-eqz v0, :cond_b

    .line 295
    iget-object v4, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    aget-object v6, v0, v1

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    :cond_9
    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 290
    :cond_a
    iget-object v6, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_5

    .line 297
    :cond_b
    iget-object v6, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    iget-object v7, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_typeFactory:Lcom/fasterxml/jackson/databind/type/TypeFactory;

    invoke-virtual {v7, v4, p0}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->_constructType(Ljava/lang/reflect/Type;Lcom/fasterxml/jackson/databind/type/TypeBindings;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v4

    invoke-interface {v6, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_c
    move-object v0, p1

    .line 302
    goto/16 :goto_2
.end method

.method public addBinding(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;)V
    .locals 1

    .prologue
    .line 178
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 179
    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    .line 181
    :cond_1
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    return-void
.end method

.method public childInstance()Lcom/fasterxml/jackson/databind/type/TypeBindings;
    .locals 4

    .prologue
    .line 79
    new-instance v0, Lcom/fasterxml/jackson/databind/type/TypeBindings;

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_typeFactory:Lcom/fasterxml/jackson/databind/type/TypeFactory;

    iget-object v2, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextClass:Ljava/lang/Class;

    iget-object v3, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-direct {v0, v1, p0, v2, v3}, Lcom/fasterxml/jackson/databind/type/TypeBindings;-><init>(Lcom/fasterxml/jackson/databind/type/TypeFactory;Lcom/fasterxml/jackson/databind/type/TypeBindings;Ljava/lang/Class;Lcom/fasterxml/jackson/databind/JavaType;)V

    return-object v0
.end method

.method public findType(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JavaType;
    .locals 4

    .prologue
    .line 120
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 121
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_resolve()V

    .line 123
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/JavaType;

    .line 124
    if-eqz v0, :cond_1

    .line 146
    :goto_0
    return-object v0

    .line 127
    :cond_1
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_placeholders:Ljava/util/HashSet;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_placeholders:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 128
    sget-object v0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->UNBOUND:Lcom/fasterxml/jackson/databind/JavaType;

    goto :goto_0

    .line 130
    :cond_2
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_parentBindings:Lcom/fasterxml/jackson/databind/type/TypeBindings;

    if-eqz v0, :cond_3

    .line 131
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_parentBindings:Lcom/fasterxml/jackson/databind/type/TypeBindings;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/type/TypeBindings;->findType(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    goto :goto_0

    .line 140
    :cond_3
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextClass:Ljava/lang/Class;

    if-eqz v0, :cond_4

    .line 141
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextClass:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    move-result-object v0

    .line 142
    if-eqz v0, :cond_4

    .line 145
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextClass:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-nez v0, :cond_4

    .line 146
    sget-object v0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->UNBOUND:Lcom/fasterxml/jackson/databind/JavaType;

    goto :goto_0

    .line 163
    :cond_4
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextClass:Ljava/lang/Class;

    if-eqz v0, :cond_5

    .line 164
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextClass:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 170
    :goto_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Type variable \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\' can not be resolved (with context of class "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 165
    :cond_5
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextType:Lcom/fasterxml/jackson/databind/JavaType;

    if-eqz v0, :cond_6

    .line 166
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/databind/JavaType;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 168
    :cond_6
    const-string v0, "UNKNOWN"

    goto :goto_1
.end method

.method public getBindingCount()I
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 113
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_resolve()V

    .line 115
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public resolveType(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Lcom/fasterxml/jackson/databind/JavaType;"
        }
    .end annotation

    .prologue
    .line 98
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_typeFactory:Lcom/fasterxml/jackson/databind/type/TypeFactory;

    invoke-virtual {v0, p1, p0}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->_constructType(Ljava/lang/reflect/Type;Lcom/fasterxml/jackson/databind/type/TypeBindings;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    return-object v0
.end method

.method public resolveType(Ljava/lang/reflect/Type;)Lcom/fasterxml/jackson/databind/JavaType;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_typeFactory:Lcom/fasterxml/jackson/databind/type/TypeFactory;

    invoke-virtual {v0, p1, p0}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->_constructType(Ljava/lang/reflect/Type;Lcom/fasterxml/jackson/databind/type/TypeBindings;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 318
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 319
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_resolve()V

    .line 321
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[TypeBindings for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 322
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextType:Lcom/fasterxml/jackson/databind/JavaType;

    if-eqz v1, :cond_1

    .line 323
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextType:Lcom/fasterxml/jackson/databind/JavaType;

    invoke-virtual {v1}, Lcom/fasterxml/jackson/databind/JavaType;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    :goto_0
    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 325
    :cond_1
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_contextClass:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method public typesAsArray()[Lcom/fasterxml/jackson/databind/JavaType;
    .locals 2

    .prologue
    .line 186
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 187
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_resolve()V

    .line 189
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 190
    sget-object v0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->NO_TYPES:[Lcom/fasterxml/jackson/databind/JavaType;

    .line 192
    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/type/TypeBindings;->_bindings:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    new-array v1, v1, [Lcom/fasterxml/jackson/databind/JavaType;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/databind/JavaType;

    goto :goto_0
.end method
