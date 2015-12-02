.class public Lcom/facebook/common/w/f;
.super Ljava/lang/Object;
.source "ReflectionUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    return-void
.end method

.method public static a(Ljava/lang/Class;Lcom/facebook/common/w/g;Ljava/util/EnumSet;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<*>;",
            "Lcom/facebook/common/w/g",
            "<TT;>;",
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/common/w/h;",
            ">;)",
            "Ljava/util/Map",
            "<+",
            "Ljava/lang/reflect/AccessibleObject;",
            "TT;>;"
        }
    .end annotation

    .prologue
    .line 29
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 31
    invoke-static {p0, p1, p2, v0}, Lcom/facebook/common/w/f;->a(Ljava/lang/Class;Lcom/facebook/common/w/g;Ljava/util/EnumSet;Ljava/util/Map;)V

    .line 32
    return-object v0
.end method

.method protected static a(Ljava/lang/Class;Lcom/facebook/common/w/g;Ljava/util/EnumSet;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<*>;",
            "Lcom/facebook/common/w/g",
            "<TT;>;",
            "Ljava/util/EnumSet",
            "<",
            "Lcom/facebook/common/w/h;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/AccessibleObject;",
            "TT;>;)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 38
    sget-object v0, Lcom/facebook/common/w/h;->INCLUDE_SUPERCLASSES:Lcom/facebook/common/w/h;

    invoke-virtual {p2, v0}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    invoke-static {v0, p1, p2, p3}, Lcom/facebook/common/w/f;->a(Ljava/lang/Class;Lcom/facebook/common/w/g;Ljava/util/EnumSet;Ljava/util/Map;)V

    .line 45
    :cond_0
    sget-object v0, Lcom/facebook/common/w/h;->INCLUDE_CONSTRUCTORS:Lcom/facebook/common/w/h;

    invoke-virtual {p2, v0}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 46
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v2

    move v0, v1

    .line 48
    :goto_0
    array-length v3, v2

    if-ge v0, v3, :cond_2

    .line 49
    aget-object v3, v2, v0

    invoke-interface {p1, v3}, Lcom/facebook/common/w/g;->b(Ljava/lang/reflect/AccessibleObject;)Ljava/lang/Object;

    move-result-object v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    aget-object v4, v2, v0

    invoke-interface {p3, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 56
    :cond_2
    sget-object v0, Lcom/facebook/common/w/h;->INCLUDE_METHODS:Lcom/facebook/common/w/h;

    invoke-virtual {p2, v0}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 57
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    move v0, v1

    .line 59
    :goto_1
    array-length v3, v2

    if-ge v0, v3, :cond_4

    .line 60
    aget-object v3, v2, v0

    invoke-interface {p1, v3}, Lcom/facebook/common/w/g;->b(Ljava/lang/reflect/AccessibleObject;)Ljava/lang/Object;

    move-result-object v3

    .line 61
    if-eqz v3, :cond_3

    .line 62
    aget-object v4, v2, v0

    invoke-interface {p3, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 67
    :cond_4
    sget-object v0, Lcom/facebook/common/w/h;->INCLUDE_FIELDS:Lcom/facebook/common/w/h;

    invoke-virtual {p2, v0}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 68
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    .line 70
    :goto_2
    array-length v2, v0

    if-ge v1, v2, :cond_6

    .line 71
    aget-object v2, v0, v1

    invoke-interface {p1, v2}, Lcom/facebook/common/w/g;->b(Ljava/lang/reflect/AccessibleObject;)Ljava/lang/Object;

    move-result-object v2

    .line 72
    if-eqz v2, :cond_5

    .line 73
    aget-object v3, v0, v1

    invoke-interface {p3, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 77
    :cond_6
    return-void
.end method
