.class public Lcom/fasterxml/jackson/datatype/guava/MultimapTypeModifier;
.super Lcom/fasterxml/jackson/databind/type/TypeModifier;
.source "MultimapTypeModifier.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/type/TypeModifier;-><init>()V

    return-void
.end method


# virtual methods
.method public modifyType(Lcom/fasterxml/jackson/databind/JavaType;Ljava/lang/reflect/Type;Lcom/fasterxml/jackson/databind/type/TypeBindings;Lcom/fasterxml/jackson/databind/type/TypeFactory;)Lcom/fasterxml/jackson/databind/JavaType;
    .locals 3

    .prologue
    .line 14
    const-class v0, Lcom/google/common/a/iw;

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 16
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JavaType;->containedType(I)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v1

    .line 17
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JavaType;->containedType(I)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    .line 19
    if-nez v1, :cond_0

    .line 21
    const-class v1, Ljava/lang/String;

    invoke-virtual {p4, v1}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->constructType(Ljava/lang/reflect/Type;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v1

    .line 24
    :cond_0
    if-nez v0, :cond_1

    .line 26
    const-class v0, Ljava/lang/Object;

    invoke-virtual {p4, v0}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->constructType(Ljava/lang/reflect/Type;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    .line 29
    :cond_1
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p4, v2, v1, v0}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->constructMapLikeType(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/JavaType;)Lcom/fasterxml/jackson/databind/type/MapLikeType;

    move-result-object p1

    .line 32
    :cond_2
    return-object p1
.end method
