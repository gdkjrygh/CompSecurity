.class public Lcom/fasterxml/jackson/databind/module/SimpleKeyDeserializers;
.super Ljava/lang/Object;
.source "SimpleKeyDeserializers.java"

# interfaces
.implements Lcom/fasterxml/jackson/databind/deser/KeyDeserializers;


# instance fields
.field protected _classMappings:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Lcom/fasterxml/jackson/databind/type/ClassKey;",
            "Lcom/fasterxml/jackson/databind/KeyDeserializer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleKeyDeserializers;->_classMappings:Ljava/util/HashMap;

    .line 32
    return-void
.end method


# virtual methods
.method public addDeserializer(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/KeyDeserializer;)Lcom/fasterxml/jackson/databind/module/SimpleKeyDeserializers;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Lcom/fasterxml/jackson/databind/KeyDeserializer;",
            ")",
            "Lcom/fasterxml/jackson/databind/module/SimpleKeyDeserializers;"
        }
    .end annotation

    .prologue
    .line 36
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleKeyDeserializers;->_classMappings:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 37
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleKeyDeserializers;->_classMappings:Ljava/util/HashMap;

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleKeyDeserializers;->_classMappings:Ljava/util/HashMap;

    new-instance v1, Lcom/fasterxml/jackson/databind/type/ClassKey;

    invoke-direct {v1, p1}, Lcom/fasterxml/jackson/databind/type/ClassKey;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    return-object p0
.end method

.method public findKeyDeserializer(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/BeanDescription;)Lcom/fasterxml/jackson/databind/KeyDeserializer;
    .locals 3

    .prologue
    .line 53
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleKeyDeserializers;->_classMappings:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 54
    const/4 v0, 0x0

    .line 56
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/module/SimpleKeyDeserializers;->_classMappings:Ljava/util/HashMap;

    new-instance v1, Lcom/fasterxml/jackson/databind/type/ClassKey;

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/JavaType;->getRawClass()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/fasterxml/jackson/databind/type/ClassKey;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/databind/KeyDeserializer;

    goto :goto_0
.end method
