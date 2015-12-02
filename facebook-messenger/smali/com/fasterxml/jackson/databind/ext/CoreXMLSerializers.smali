.class public Lcom/fasterxml/jackson/databind/ext/CoreXMLSerializers;
.super Ljava/lang/Object;
.source "CoreXMLSerializers.java"

# interfaces
.implements Lcom/fasterxml/jackson/databind/util/Provider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/fasterxml/jackson/databind/util/Provider",
        "<",
        "Ljava/util/Map$Entry",
        "<",
        "Ljava/lang/Class",
        "<*>;",
        "Lcom/fasterxml/jackson/databind/JsonSerializer",
        "<*>;>;>;"
    }
.end annotation


# static fields
.field static final _serializers:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Class",
            "<*>;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer",
            "<*>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 36
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/fasterxml/jackson/databind/ext/CoreXMLSerializers;->_serializers:Ljava/util/HashMap;

    .line 42
    sget-object v0, Lcom/fasterxml/jackson/databind/ser/std/ToStringSerializer;->instance:Lcom/fasterxml/jackson/databind/ser/std/ToStringSerializer;

    .line 43
    sget-object v1, Lcom/fasterxml/jackson/databind/ext/CoreXMLSerializers;->_serializers:Ljava/util/HashMap;

    const-class v2, Ljavax/xml/datatype/Duration;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    sget-object v1, Lcom/fasterxml/jackson/databind/ext/CoreXMLSerializers;->_serializers:Ljava/util/HashMap;

    const-class v2, Ljavax/xml/datatype/XMLGregorianCalendar;

    new-instance v3, Lcom/fasterxml/jackson/databind/ext/CoreXMLSerializers$XMLGregorianCalendarSerializer;

    invoke-direct {v3}, Lcom/fasterxml/jackson/databind/ext/CoreXMLSerializers$XMLGregorianCalendarSerializer;-><init>()V

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    sget-object v1, Lcom/fasterxml/jackson/databind/ext/CoreXMLSerializers;->_serializers:Ljava/util/HashMap;

    const-class v2, Ljavax/xml/namespace/QName;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    return-void
.end method


# virtual methods
.method public provide()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Ljava/util/Map$Entry",
            "<",
            "Ljava/lang/Class",
            "<*>;",
            "Lcom/fasterxml/jackson/databind/JsonSerializer",
            "<*>;>;>;"
        }
    .end annotation

    .prologue
    .line 50
    sget-object v0, Lcom/fasterxml/jackson/databind/ext/CoreXMLSerializers;->_serializers:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
