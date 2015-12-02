.class Lcom/facebook/common/json/b;
.super Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;
.source "AndroidJacksonModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer",
        "<",
        "Landroid/net/Uri;",
        ">;"
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 42
    const-class v0, Landroid/net/Uri;

    invoke-direct {p0, v0}, Lcom/fasterxml/jackson/databind/deser/std/FromStringDeserializer;-><init>(Ljava/lang/Class;)V

    .line 43
    return-void
.end method


# virtual methods
.method protected synthetic _deserialize(Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 39
    invoke-virtual {p0, p1, p2}, Lcom/facebook/common/json/b;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method protected a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/DeserializationContext;)Landroid/net/Uri;
    .locals 1

    .prologue
    .line 48
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method
