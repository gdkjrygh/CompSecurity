.class public Lcom/google/inject/internal/MoreTypes;
.super Ljava/lang/Object;
.source "MoreTypes.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/MoreTypes$CompositeType;,
        Lcom/google/inject/internal/MoreTypes$WildcardTypeImpl;,
        Lcom/google/inject/internal/MoreTypes$GenericArrayTypeImpl;,
        Lcom/google/inject/internal/MoreTypes$ParameterizedTypeImpl;
    }
.end annotation


# static fields
.field public static final EMPTY_TYPE_ARRAY:[Ljava/lang/reflect/Type;

.field private static final PRIMITIVE_TO_WRAPPER:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/TypeLiteral",
            "<*>;",
            "Lcom/google/inject/TypeLiteral",
            "<*>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 47
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/reflect/Type;

    sput-object v0, Lcom/google/inject/internal/MoreTypes;->EMPTY_TYPE_ARRAY:[Ljava/lang/reflect/Type;

    .line 51
    new-instance v0, Lcom/google/inject/internal/util/$ImmutableMap$Builder;

    invoke-direct {v0}, Lcom/google/inject/internal/util/$ImmutableMap$Builder;-><init>()V

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v1

    const-class v2, Ljava/lang/Boolean;

    invoke-static {v2}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableMap$Builder;

    move-result-object v0

    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v1

    const-class v2, Ljava/lang/Byte;

    invoke-static {v2}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableMap$Builder;

    move-result-object v0

    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v1

    const-class v2, Ljava/lang/Short;

    invoke-static {v2}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableMap$Builder;

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v1

    const-class v2, Ljava/lang/Integer;

    invoke-static {v2}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableMap$Builder;

    move-result-object v0

    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v1

    const-class v2, Ljava/lang/Long;

    invoke-static {v2}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableMap$Builder;

    move-result-object v0

    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v1

    const-class v2, Ljava/lang/Float;

    invoke-static {v2}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableMap$Builder;

    move-result-object v0

    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v1

    const-class v2, Ljava/lang/Double;

    invoke-static {v2}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableMap$Builder;

    move-result-object v0

    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v1

    const-class v2, Ljava/lang/Character;

    invoke-static {v2}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableMap$Builder;

    move-result-object v0

    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v1

    const-class v2, Ljava/lang/Void;

    invoke-static {v2}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/inject/internal/util/$ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/inject/internal/util/$ImmutableMap$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/internal/util/$ImmutableMap$Builder;->build()Lcom/google/inject/internal/util/$ImmutableMap;

    move-result-object v0

    sput-object v0, Lcom/google/inject/internal/MoreTypes;->PRIMITIVE_TO_WRAPPER:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Ljava/lang/reflect/Type;Ljava/lang/String;)V
    .locals 0
    .param p0, "x0"    # Ljava/lang/reflect/Type;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 45
    invoke-static {p0, p1}, Lcom/google/inject/internal/MoreTypes;->checkNotPrimitive(Ljava/lang/reflect/Type;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Ljava/lang/reflect/Type;)Z
    .locals 1
    .param p0, "x0"    # Ljava/lang/reflect/Type;

    .prologue
    .line 45
    invoke-static {p0}, Lcom/google/inject/internal/MoreTypes;->isFullySpecified(Ljava/lang/reflect/Type;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$200(Ljava/lang/Object;)I
    .locals 1
    .param p0, "x0"    # Ljava/lang/Object;

    .prologue
    .line 45
    invoke-static {p0}, Lcom/google/inject/internal/MoreTypes;->hashCodeOrZero(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public static canonicalize(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 7
    .param p0, "type"    # Ljava/lang/reflect/Type;

    .prologue
    .line 123
    instance-of v4, p0, Ljava/lang/Class;

    if-eqz v4, :cond_2

    move-object v0, p0

    .line 124
    check-cast v0, Ljava/lang/Class;

    .line 125
    .local v0, "c":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance v4, Lcom/google/inject/internal/MoreTypes$GenericArrayTypeImpl;

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v5

    invoke-static {v5}, Lcom/google/inject/internal/MoreTypes;->canonicalize(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/google/inject/internal/MoreTypes$GenericArrayTypeImpl;-><init>(Ljava/lang/reflect/Type;)V

    move-object v0, v4

    .end local v0    # "c":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_0
    move-object p0, v0

    .line 145
    .end local p0    # "type":Ljava/lang/reflect/Type;
    .local v3, "w":Ljava/lang/reflect/WildcardType;
    :cond_1
    :goto_0
    return-object p0

    .line 127
    .end local v3    # "w":Ljava/lang/reflect/WildcardType;
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_2
    instance-of v4, p0, Lcom/google/inject/internal/MoreTypes$CompositeType;

    if-nez v4, :cond_1

    .line 130
    instance-of v4, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v4, :cond_3

    move-object v2, p0

    .line 131
    check-cast v2, Ljava/lang/reflect/ParameterizedType;

    .line 132
    .local v2, "p":Ljava/lang/reflect/ParameterizedType;
    new-instance p0, Lcom/google/inject/internal/MoreTypes$ParameterizedTypeImpl;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-direct {p0, v4, v5, v6}, Lcom/google/inject/internal/MoreTypes$ParameterizedTypeImpl;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    goto :goto_0

    .line 135
    .end local v2    # "p":Ljava/lang/reflect/ParameterizedType;
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_3
    instance-of v4, p0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v4, :cond_4

    move-object v1, p0

    .line 136
    check-cast v1, Ljava/lang/reflect/GenericArrayType;

    .line 137
    .local v1, "g":Ljava/lang/reflect/GenericArrayType;
    new-instance p0, Lcom/google/inject/internal/MoreTypes$GenericArrayTypeImpl;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-interface {v1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/google/inject/internal/MoreTypes$GenericArrayTypeImpl;-><init>(Ljava/lang/reflect/Type;)V

    goto :goto_0

    .line 139
    .end local v1    # "g":Ljava/lang/reflect/GenericArrayType;
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_4
    instance-of v4, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v4, :cond_1

    move-object v3, p0

    .line 140
    check-cast v3, Ljava/lang/reflect/WildcardType;

    .line 141
    .restart local v3    # "w":Ljava/lang/reflect/WildcardType;
    new-instance p0, Lcom/google/inject/internal/MoreTypes$WildcardTypeImpl;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-interface {v3}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-interface {v3}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-direct {p0, v4, v5}, Lcom/google/inject/internal/MoreTypes$WildcardTypeImpl;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    goto :goto_0
.end method

.method public static canonicalizeForKey(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/TypeLiteral;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;)",
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 75
    .local p0, "typeLiteral":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    invoke-virtual {p0}, Lcom/google/inject/TypeLiteral;->getType()Ljava/lang/reflect/Type;

    move-result-object v3

    .line 76
    .local v3, "type":Ljava/lang/reflect/Type;
    invoke-static {v3}, Lcom/google/inject/internal/MoreTypes;->isFullySpecified(Ljava/lang/reflect/Type;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 77
    new-instance v5, Lcom/google/inject/internal/Errors;

    invoke-direct {v5}, Lcom/google/inject/internal/Errors;-><init>()V

    invoke-virtual {v5, p0}, Lcom/google/inject/internal/Errors;->keyNotFullySpecified(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/internal/Errors;

    move-result-object v0

    .line 78
    .local v0, "errors":Lcom/google/inject/internal/Errors;
    new-instance v5, Lcom/google/inject/ConfigurationException;

    invoke-virtual {v0}, Lcom/google/inject/internal/Errors;->getMessages()Ljava/util/List;

    move-result-object v6

    invoke-direct {v5, v6}, Lcom/google/inject/ConfigurationException;-><init>(Ljava/lang/Iterable;)V

    throw v5

    .line 81
    .end local v0    # "errors":Lcom/google/inject/internal/Errors;
    :cond_0
    invoke-virtual {p0}, Lcom/google/inject/TypeLiteral;->getRawType()Ljava/lang/Class;

    move-result-object v5

    const-class v6, Ljavax/inject/Provider;

    if-ne v5, v6, :cond_1

    move-object v2, v3

    .line 82
    check-cast v2, Ljava/lang/reflect/ParameterizedType;

    .line 87
    .local v2, "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v5

    const/4 v6, 0x0

    aget-object v5, v5, v6

    invoke-static {v5}, Lcom/google/inject/util/Types;->providerOf(Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;

    move-result-object v5

    invoke-static {v5}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/reflect/Type;)Lcom/google/inject/TypeLiteral;

    move-result-object v1

    .line 94
    .end local v2    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    :goto_0
    return-object v1

    .line 93
    :cond_1
    sget-object v5, Lcom/google/inject/internal/MoreTypes;->PRIMITIVE_TO_WRAPPER:Ljava/util/Map;

    invoke-interface {v5, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/inject/TypeLiteral;

    .line 94
    .local v4, "wrappedPrimitives":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    if-eqz v4, :cond_2

    .end local v4    # "wrappedPrimitives":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    :goto_1
    move-object v1, v4

    goto :goto_0

    .restart local v4    # "wrappedPrimitives":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    :cond_2
    move-object v4, p0

    goto :goto_1
.end method

.method private static checkNotPrimitive(Ljava/lang/reflect/Type;Ljava/lang/String;)V
    .locals 5
    .param p0, "type"    # Ljava/lang/reflect/Type;
    .param p1, "use"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 505
    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move v0, v2

    :goto_0
    const-string v3, "Primitive types are not allowed in %s: %s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v1

    aput-object p0, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/inject/internal/util/$Preconditions;->checkArgument(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 507
    return-void

    :cond_1
    move v0, v1

    .line 505
    goto :goto_0
.end method

.method private static declaringClassOf(Ljava/lang/reflect/TypeVariable;)Ljava/lang/Class;
    .locals 2
    .param p0, "typeVariable"    # Ljava/lang/reflect/TypeVariable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/TypeVariable;",
            ")",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 316
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    move-result-object v0

    .line 317
    .local v0, "genericDeclaration":Ljava/lang/reflect/GenericDeclaration;
    instance-of v1, v0, Ljava/lang/Class;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Class;

    .end local v0    # "genericDeclaration":Ljava/lang/reflect/GenericDeclaration;
    :goto_0
    return-object v0

    .restart local v0    # "genericDeclaration":Ljava/lang/reflect/GenericDeclaration;
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static equals(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z
    .locals 12
    .param p0, "a"    # Ljava/lang/reflect/Type;
    .param p1, "b"    # Ljava/lang/reflect/Type;

    .prologue
    const/4 v8, 0x1

    const/4 v9, 0x0

    .line 184
    if-ne p0, p1, :cond_1

    move v9, v8

    .line 234
    :cond_0
    :goto_0
    return v9

    .line 188
    :cond_1
    instance-of v10, p0, Ljava/lang/Class;

    if-eqz v10, :cond_2

    .line 190
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_0

    .line 192
    :cond_2
    instance-of v10, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v10, :cond_4

    .line 193
    instance-of v10, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v10, :cond_0

    move-object v2, p0

    .line 198
    check-cast v2, Ljava/lang/reflect/ParameterizedType;

    .local v2, "pa":Ljava/lang/reflect/ParameterizedType;
    move-object v3, p1

    .line 199
    check-cast v3, Ljava/lang/reflect/ParameterizedType;

    .line 200
    .local v3, "pb":Ljava/lang/reflect/ParameterizedType;
    invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object v10

    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/google/inject/internal/util/$Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v10

    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v10

    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v11

    invoke-static {v10, v11}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    :goto_1
    move v9, v8

    goto :goto_0

    :cond_3
    move v8, v9

    goto :goto_1

    .line 204
    .end local v2    # "pa":Ljava/lang/reflect/ParameterizedType;
    .end local v3    # "pb":Ljava/lang/reflect/ParameterizedType;
    :cond_4
    instance-of v10, p0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v10, :cond_5

    .line 205
    instance-of v8, p1, Ljava/lang/reflect/GenericArrayType;

    if-eqz v8, :cond_0

    move-object v0, p0

    .line 209
    check-cast v0, Ljava/lang/reflect/GenericArrayType;

    .local v0, "ga":Ljava/lang/reflect/GenericArrayType;
    move-object v1, p1

    .line 210
    check-cast v1, Ljava/lang/reflect/GenericArrayType;

    .line 211
    .local v1, "gb":Ljava/lang/reflect/GenericArrayType;
    invoke-interface {v0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-interface {v1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/google/inject/internal/MoreTypes;->equals(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result v9

    goto :goto_0

    .line 213
    .end local v0    # "ga":Ljava/lang/reflect/GenericArrayType;
    .end local v1    # "gb":Ljava/lang/reflect/GenericArrayType;
    :cond_5
    instance-of v10, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v10, :cond_7

    .line 214
    instance-of v10, p1, Ljava/lang/reflect/WildcardType;

    if-eqz v10, :cond_0

    move-object v6, p0

    .line 218
    check-cast v6, Ljava/lang/reflect/WildcardType;

    .local v6, "wa":Ljava/lang/reflect/WildcardType;
    move-object v7, p1

    .line 219
    check-cast v7, Ljava/lang/reflect/WildcardType;

    .line 220
    .local v7, "wb":Ljava/lang/reflect/WildcardType;
    invoke-interface {v6}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v10

    invoke-interface {v7}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v11

    invoke-static {v10, v11}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v6}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v10

    invoke-interface {v7}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v11

    invoke-static {v10, v11}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    :goto_2
    move v9, v8

    goto/16 :goto_0

    :cond_6
    move v8, v9

    goto :goto_2

    .line 223
    .end local v6    # "wa":Ljava/lang/reflect/WildcardType;
    .end local v7    # "wb":Ljava/lang/reflect/WildcardType;
    :cond_7
    instance-of v10, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v10, :cond_0

    .line 224
    instance-of v10, p1, Ljava/lang/reflect/TypeVariable;

    if-eqz v10, :cond_0

    move-object v4, p0

    .line 227
    check-cast v4, Ljava/lang/reflect/TypeVariable;

    .local v4, "va":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
    move-object v5, p1

    .line 228
    check-cast v5, Ljava/lang/reflect/TypeVariable;

    .line 229
    .local v5, "vb":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
    invoke-interface {v4}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    move-result-object v10

    invoke-interface {v5}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    move-result-object v11

    if-ne v10, v11, :cond_8

    invoke-interface {v4}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v5}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    :goto_3
    move v9, v8

    goto/16 :goto_0

    :cond_8
    move v8, v9

    goto :goto_3
.end method

.method public static getGenericSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
    .locals 6
    .param p0, "type"    # Ljava/lang/reflect/Type;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/lang/reflect/Type;"
        }
    .end annotation

    .prologue
    .line 252
    .local p1, "rawType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .local p2, "toResolve":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    if-ne p2, p1, :cond_0

    .line 282
    .end local p0    # "type":Ljava/lang/reflect/Type;
    :goto_0
    return-object p0

    .line 257
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->isInterface()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 258
    invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v1

    .line 259
    .local v1, "interfaces":[Ljava/lang/Class;
    const/4 v0, 0x0

    .local v0, "i":I
    array-length v2, v1

    .local v2, "length":I
    :goto_1
    if-ge v0, v2, :cond_3

    .line 260
    aget-object v4, v1, v0

    if-ne v4, p2, :cond_1

    .line 261
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object v4

    aget-object p0, v4, v0

    goto :goto_0

    .line 262
    :cond_1
    aget-object v4, v1, v0

    invoke-virtual {p2, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 263
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object v4

    aget-object v4, v4, v0

    aget-object v5, v1, v0

    invoke-static {v4, v5, p2}, Lcom/google/inject/internal/MoreTypes;->getGenericSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object p0

    goto :goto_0

    .line 259
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 269
    .end local v0    # "i":I
    .end local v1    # "interfaces":[Ljava/lang/Class;
    .end local v2    # "length":I
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    move-result v4

    if-nez v4, :cond_6

    .line 270
    :goto_2
    const-class v4, Ljava/lang/Object;

    if-eq p1, v4, :cond_6

    .line 271
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v3

    .line 272
    .local v3, "rawSupertype":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    if-ne v3, p2, :cond_4

    .line 273
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object p0

    goto :goto_0

    .line 274
    :cond_4
    invoke-virtual {p2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 275
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4, v3, p2}, Lcom/google/inject/internal/MoreTypes;->getGenericSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object p0

    goto :goto_0

    .line 277
    :cond_5
    move-object p1, v3

    .line 278
    goto :goto_2

    .end local v3    # "rawSupertype":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_6
    move-object p0, p2

    .line 282
    goto :goto_0
.end method

.method public static getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;
    .locals 8
    .param p0, "type"    # Ljava/lang/reflect/Type;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            ")",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 150
    instance-of v3, p0, Ljava/lang/Class;

    if-eqz v3, :cond_0

    .line 152
    check-cast p0, Ljava/lang/Class;

    .line 172
    .end local p0    # "type":Ljava/lang/reflect/Type;
    :goto_0
    return-object p0

    .line 154
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_0
    instance-of v3, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_1

    move-object v1, p0

    .line 155
    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    .line 160
    .local v1, "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v2

    .line 161
    .local v2, "rawType":Ljava/lang/reflect/Type;
    instance-of v3, v2, Ljava/lang/Class;

    const-string v4, "Expected a Class, but <%s> is of type %s"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p0, v5, v6

    const/4 v6, 0x1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v3, v4, v5}, Lcom/google/inject/internal/util/$Preconditions;->checkArgument(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 163
    check-cast v2, Ljava/lang/Class;

    .end local v2    # "rawType":Ljava/lang/reflect/Type;
    move-object p0, v2

    goto :goto_0

    .line 165
    .end local v1    # "parameterizedType":Ljava/lang/reflect/ParameterizedType;
    :cond_1
    instance-of v3, p0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v3, :cond_2

    .line 166
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 167
    .local v0, "componentType":Ljava/lang/reflect/Type;
    invoke-static {v0}, Lcom/google/inject/internal/MoreTypes;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3, v6}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    goto :goto_0

    .line 169
    .end local v0    # "componentType":Ljava/lang/reflect/Type;
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_2
    instance-of v3, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v3, :cond_3

    .line 172
    const-class p0, Ljava/lang/Object;

    goto :goto_0

    .line 175
    :cond_3
    new-instance v3, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Expected a Class, ParameterizedType, or GenericArrayType, but <"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "> is of type "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3
.end method

.method private static hashCodeOrZero(Ljava/lang/Object;)I
    .locals 1
    .param p0, "o"    # Ljava/lang/Object;

    .prologue
    .line 239
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static indexOf([Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "toFind"    # Ljava/lang/Object;

    .prologue
    .line 303
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_1

    .line 304
    aget-object v1, p0, v0

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 305
    return v0

    .line 303
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 308
    :cond_1
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    throw v1
.end method

.method private static isFullySpecified(Ljava/lang/reflect/Type;)Z
    .locals 1
    .param p0, "type"    # Ljava/lang/reflect/Type;

    .prologue
    .line 103
    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 104
    const/4 v0, 0x1

    .line 113
    :goto_0
    return v0

    .line 106
    :cond_0
    instance-of v0, p0, Lcom/google/inject/internal/MoreTypes$CompositeType;

    if-eqz v0, :cond_1

    .line 107
    check-cast p0, Lcom/google/inject/internal/MoreTypes$CompositeType;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-interface {p0}, Lcom/google/inject/internal/MoreTypes$CompositeType;->isFullySpecified()Z

    move-result v0

    goto :goto_0

    .line 109
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_1
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_2

    .line 110
    const/4 v0, 0x0

    goto :goto_0

    .line 113
    :cond_2
    invoke-static {p0}, Lcom/google/inject/internal/MoreTypes;->canonicalize(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    check-cast v0, Lcom/google/inject/internal/MoreTypes$CompositeType;

    invoke-interface {v0}, Lcom/google/inject/internal/MoreTypes$CompositeType;->isFullySpecified()Z

    move-result v0

    goto :goto_0
.end method

.method public static resolveTypeVariable(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/TypeVariable;)Ljava/lang/reflect/Type;
    .locals 4
    .param p0, "type"    # Ljava/lang/reflect/Type;
    .param p2, "unknown"    # Ljava/lang/reflect/TypeVariable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/reflect/TypeVariable;",
            ")",
            "Ljava/lang/reflect/Type;"
        }
    .end annotation

    .prologue
    .line 286
    .local p1, "rawType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-static {p2}, Lcom/google/inject/internal/MoreTypes;->declaringClassOf(Ljava/lang/reflect/TypeVariable;)Ljava/lang/Class;

    move-result-object v1

    .line 289
    .local v1, "declaredByRaw":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    if-nez v1, :cond_1

    .line 299
    .end local p2    # "unknown":Ljava/lang/reflect/TypeVariable;
    :cond_0
    :goto_0
    return-object p2

    .line 293
    .restart local p2    # "unknown":Ljava/lang/reflect/TypeVariable;
    :cond_1
    invoke-static {p0, p1, v1}, Lcom/google/inject/internal/MoreTypes;->getGenericSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    .line 294
    .local v0, "declaredBy":Ljava/lang/reflect/Type;
    instance-of v3, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_0

    .line 295
    invoke-virtual {v1}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v3

    invoke-static {v3, p2}, Lcom/google/inject/internal/MoreTypes;->indexOf([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    .line 296
    .local v2, "index":I
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .end local v0    # "declaredBy":Ljava/lang/reflect/Type;
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v3

    aget-object p2, v3, v2

    goto :goto_0
.end method

.method public static typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 1
    .param p0, "type"    # Ljava/lang/reflect/Type;

    .prologue
    .line 243
    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/Class;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
