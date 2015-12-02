.class public Lcom/facebook/common/json/a;
.super Lcom/fasterxml/jackson/databind/Module;
.source "AndroidJacksonModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/Module;-><init>()V

    .line 39
    return-void
.end method


# virtual methods
.method public getModuleName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    const-string v0, "Android"

    return-object v0
.end method

.method public setupModule(Lcom/fasterxml/jackson/databind/Module$SetupContext;)V
    .locals 3

    .prologue
    .line 31
    new-instance v0, Lcom/fasterxml/jackson/databind/module/SimpleDeserializers;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/module/SimpleDeserializers;-><init>()V

    .line 32
    const-class v1, Landroid/net/Uri;

    new-instance v2, Lcom/facebook/common/json/b;

    invoke-direct {v2}, Lcom/facebook/common/json/b;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/module/SimpleDeserializers;->addDeserializer(Ljava/lang/Class;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V

    .line 33
    invoke-interface {p1, v0}, Lcom/fasterxml/jackson/databind/Module$SetupContext;->addDeserializers(Lcom/fasterxml/jackson/databind/deser/Deserializers;)V

    .line 34
    return-void
.end method

.method public version()Lcom/fasterxml/jackson/core/Version;
    .locals 7

    .prologue
    const/4 v5, 0x0

    const/4 v2, 0x0

    .line 26
    new-instance v0, Lcom/fasterxml/jackson/core/Version;

    const/4 v1, 0x1

    const-string v4, ""

    move v3, v2

    move-object v6, v5

    invoke-direct/range {v0 .. v6}, Lcom/fasterxml/jackson/core/Version;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
