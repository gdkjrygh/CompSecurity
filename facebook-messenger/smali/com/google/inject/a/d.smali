.class public Lcom/google/inject/a/d;
.super Ljava/lang/Object;
.source "MoreTypes.java"


# static fields
.field public static final a:[Ljava/lang/reflect/Type;

.field private static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/f",
            "<*>;",
            "Lcom/google/inject/f",
            "<*>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 48
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/reflect/Type;

    sput-object v0, Lcom/google/inject/a/d;->a:[Ljava/lang/reflect/Type;

    .line 52
    new-instance v0, Lcom/google/common/a/ew;

    invoke-direct {v0}, Lcom/google/common/a/ew;-><init>()V

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/inject/f;->c(Ljava/lang/Class;)Lcom/google/inject/f;

    move-result-object v1

    const-class v2, Ljava/lang/Boolean;

    invoke-static {v2}, Lcom/google/inject/f;->c(Ljava/lang/Class;)Lcom/google/inject/f;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/inject/f;->c(Ljava/lang/Class;)Lcom/google/inject/f;

    move-result-object v1

    const-class v2, Ljava/lang/Byte;

    invoke-static {v2}, Lcom/google/inject/f;->c(Ljava/lang/Class;)Lcom/google/inject/f;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/inject/f;->c(Ljava/lang/Class;)Lcom/google/inject/f;

    move-result-object v1

    const-class v2, Ljava/lang/Short;

    invoke-static {v2}, Lcom/google/inject/f;->c(Ljava/lang/Class;)Lcom/google/inject/f;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/inject/f;->c(Ljava/lang/Class;)Lcom/google/inject/f;

    move-result-object v1

    const-class v2, Ljava/lang/Integer;

    invoke-static {v2}, Lcom/google/inject/f;->c(Ljava/lang/Class;)Lcom/google/inject/f;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/inject/f;->c(Ljava/lang/Class;)Lcom/google/inject/f;

    move-result-object v1

    const-class v2, Ljava/lang/Long;

    invoke-static {v2}, Lcom/google/inject/f;->c(Ljava/lang/Class;)Lcom/google/inject/f;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/inject/f;->c(Ljava/lang/Class;)Lcom/google/inject/f;

    move-result-object v1

    const-class v2, Ljava/lang/Float;

    invoke-static {v2}, Lcom/google/inject/f;->c(Ljava/lang/Class;)Lcom/google/inject/f;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/inject/f;->c(Ljava/lang/Class;)Lcom/google/inject/f;

    move-result-object v1

    const-class v2, Ljava/lang/Double;

    invoke-static {v2}, Lcom/google/inject/f;->c(Ljava/lang/Class;)Lcom/google/inject/f;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/inject/f;->c(Ljava/lang/Class;)Lcom/google/inject/f;

    move-result-object v1

    const-class v2, Ljava/lang/Character;

    invoke-static {v2}, Lcom/google/inject/f;->c(Ljava/lang/Class;)Lcom/google/inject/f;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/inject/f;->c(Ljava/lang/Class;)Lcom/google/inject/f;

    move-result-object v1

    const-class v2, Ljava/lang/Void;

    invoke-static {v2}, Lcom/google/inject/f;->c(Ljava/lang/Class;)Lcom/google/inject/f;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    sput-object v0, Lcom/google/inject/a/d;->b:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 46
    invoke-static {p0}, Lcom/google/inject/a/d;->b(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public static a(Lcom/google/inject/f;)Lcom/google/inject/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/f",
            "<TT;>;)",
            "Lcom/google/inject/f",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 76
    invoke-virtual {p0}, Lcom/google/inject/f;->b()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 77
    invoke-static {v0}, Lcom/google/inject/a/d;->e(Ljava/lang/reflect/Type;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 78
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Key not fully specified "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 81
    :cond_0
    invoke-virtual {p0}, Lcom/google/inject/f;->a()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljavax/inject/a;

    if-ne v1, v2, :cond_2

    .line 82
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 87
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/google/inject/b/c;->a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/f;->a(Ljava/lang/reflect/Type;)Lcom/google/inject/f;

    move-result-object v0

    .line 94
    :cond_1
    :goto_0
    return-object v0

    .line 93
    :cond_2
    sget-object v0, Lcom/google/inject/a/d;->b:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/f;

    .line 94
    if-nez v0, :cond_1

    move-object v0, p0

    goto :goto_0
.end method

.method public static a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 4

    .prologue
    .line 123
    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_1

    .line 124
    check-cast p0, Ljava/lang/Class;

    .line 125
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/inject/a/f;

    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lcom/google/inject/a/d;->a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/inject/a/f;-><init>(Ljava/lang/reflect/Type;)V

    move-object p0, v0

    .line 145
    :cond_0
    :goto_0
    return-object p0

    .line 127
    :cond_1
    instance-of v0, p0, Lcom/google/inject/a/e;

    if-nez v0, :cond_0

    .line 130
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_2

    .line 131
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 132
    new-instance v0, Lcom/google/inject/a/g;

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/inject/a/g;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    move-object p0, v0

    goto :goto_0

    .line 135
    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v0, :cond_3

    .line 136
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .line 137
    new-instance v0, Lcom/google/inject/a/f;

    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/inject/a/f;-><init>(Ljava/lang/reflect/Type;)V

    move-object p0, v0

    goto :goto_0

    .line 139
    :cond_3
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_0

    .line 140
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 141
    new-instance v0, Lcom/google/inject/a/h;

    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/inject/a/h;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    move-object p0, v0

    goto :goto_0
.end method

.method static synthetic a(Ljava/lang/reflect/Type;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 46
    invoke-static {p0, p1}, Lcom/google/inject/a/d;->b(Ljava/lang/reflect/Type;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 184
    if-ne p0, p1, :cond_1

    move v1, v0

    .line 234
    :cond_0
    :goto_0
    return v1

    .line 188
    :cond_1
    instance-of v2, p0, Ljava/lang/Class;

    if-eqz v2, :cond_2

    .line 190
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    .line 192
    :cond_2
    instance-of v2, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_4

    .line 193
    instance-of v2, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_0

    .line 198
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 199
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 200
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_1

    .line 204
    :cond_4
    instance-of v2, p0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v2, :cond_5

    .line 205
    instance-of v0, p1, Ljava/lang/reflect/GenericArrayType;

    if-eqz v0, :cond_0

    .line 209
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .line 210
    check-cast p1, Ljava/lang/reflect/GenericArrayType;

    .line 211
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-interface {p1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/inject/a/d;->a(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result v1

    goto :goto_0

    .line 213
    :cond_5
    instance-of v2, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v2, :cond_7

    .line 214
    instance-of v2, p1, Ljava/lang/reflect/WildcardType;

    if-eqz v2, :cond_0

    .line 218
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 219
    check-cast p1, Ljava/lang/reflect/WildcardType;

    .line 220
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    :goto_2
    move v1, v0

    goto/16 :goto_0

    :cond_6
    move v0, v1

    goto :goto_2

    .line 223
    :cond_7
    instance-of v2, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v2, :cond_0

    .line 224
    instance-of v2, p1, Ljava/lang/reflect/TypeVariable;

    if-eqz v2, :cond_0

    .line 227
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    .line 228
    check-cast p1, Ljava/lang/reflect/TypeVariable;

    .line 229
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    move-result-object v2

    invoke-interface {p1}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    move-result-object v3

    if-ne v2, v3, :cond_8

    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    :goto_3
    move v1, v0

    goto/16 :goto_0

    :cond_8
    move v0, v1

    goto :goto_3
.end method

.method private static b(Ljava/lang/Object;)I
    .locals 1

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

.method public static b(Ljava/lang/reflect/Type;)Ljava/lang/Class;
    .locals 6
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
    const/4 v4, 0x0

    .line 150
    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 152
    check-cast p0, Ljava/lang/Class;

    .line 172
    :goto_0
    return-object p0

    .line 154
    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_1

    move-object v0, p0

    .line 155
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 160
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 161
    instance-of v1, v0, Ljava/lang/Class;

    const-string v2, "Expected a Class, but <%s> is of type %s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p0, v3, v4

    const/4 v4, 0x1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v1, v2, v3}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 163
    check-cast v0, Ljava/lang/Class;

    move-object p0, v0

    goto :goto_0

    .line 165
    :cond_1
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v0, :cond_2

    .line 166
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 167
    invoke-static {v0}, Lcom/google/inject/a/d;->b(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, v4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    goto :goto_0

    .line 169
    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_3

    .line 172
    const-class p0, Ljava/lang/Object;

    goto :goto_0

    .line 175
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected a Class, ParameterizedType, or GenericArrayType, but <"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "> is of type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static b(Ljava/lang/reflect/Type;Ljava/lang/String;)V
    .locals 5

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

    invoke-static {v0, v3, v4}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 507
    return-void

    :cond_1
    move v0, v1

    .line 505
    goto :goto_0
.end method

.method public static c(Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 243
    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic d(Ljava/lang/reflect/Type;)Z
    .locals 1

    .prologue
    .line 46
    invoke-static {p0}, Lcom/google/inject/a/d;->e(Ljava/lang/reflect/Type;)Z

    move-result v0

    return v0
.end method

.method private static e(Ljava/lang/reflect/Type;)Z
    .locals 1

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
    instance-of v0, p0, Lcom/google/inject/a/e;

    if-eqz v0, :cond_1

    .line 107
    check-cast p0, Lcom/google/inject/a/e;

    invoke-interface {p0}, Lcom/google/inject/a/e;->a()Z

    move-result v0

    goto :goto_0

    .line 109
    :cond_1
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_2

    .line 110
    const/4 v0, 0x0

    goto :goto_0

    .line 113
    :cond_2
    invoke-static {p0}, Lcom/google/inject/a/d;->a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    check-cast v0, Lcom/google/inject/a/e;

    invoke-interface {v0}, Lcom/google/inject/a/e;->a()Z

    move-result v0

    goto :goto_0
.end method
