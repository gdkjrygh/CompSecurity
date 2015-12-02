.class public Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers;
.super Ljava/lang/Object;
.source "JdkDeserializers.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 319
    return-void
.end method

.method public static all()[Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 26
    const/16 v0, 0xc

    new-array v0, v0, [Lcom/fasterxml/jackson/databind/deser/std/StdDeserializer;

    const/4 v1, 0x0

    new-instance v2, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$StringDeserializer;

    invoke-direct {v2}, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$StringDeserializer;-><init>()V

    aput-object v2, v0, v1

    const/4 v1, 0x1

    new-instance v2, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$UUIDDeserializer;

    invoke-direct {v2}, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$UUIDDeserializer;-><init>()V

    aput-object v2, v0, v1

    const/4 v1, 0x2

    new-instance v2, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$URLDeserializer;

    invoke-direct {v2}, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$URLDeserializer;-><init>()V

    aput-object v2, v0, v1

    const/4 v1, 0x3

    new-instance v2, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$URIDeserializer;

    invoke-direct {v2}, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$URIDeserializer;-><init>()V

    aput-object v2, v0, v1

    const/4 v1, 0x4

    new-instance v2, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$CurrencyDeserializer;

    invoke-direct {v2}, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$CurrencyDeserializer;-><init>()V

    aput-object v2, v0, v1

    const/4 v1, 0x5

    new-instance v2, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$PatternDeserializer;

    invoke-direct {v2}, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$PatternDeserializer;-><init>()V

    aput-object v2, v0, v1

    const/4 v1, 0x6

    new-instance v2, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$LocaleDeserializer;

    invoke-direct {v2}, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$LocaleDeserializer;-><init>()V

    aput-object v2, v0, v1

    const/4 v1, 0x7

    new-instance v2, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$InetAddressDeserializer;

    invoke-direct {v2}, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$InetAddressDeserializer;-><init>()V

    aput-object v2, v0, v1

    const/16 v1, 0x8

    new-instance v2, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$CharsetDeserializer;

    invoke-direct {v2}, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$CharsetDeserializer;-><init>()V

    aput-object v2, v0, v1

    const/16 v1, 0x9

    new-instance v2, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$AtomicBooleanDeserializer;

    invoke-direct {v2}, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$AtomicBooleanDeserializer;-><init>()V

    aput-object v2, v0, v1

    const/16 v1, 0xa

    new-instance v2, Lcom/fasterxml/jackson/databind/deser/std/ClassDeserializer;

    invoke-direct {v2}, Lcom/fasterxml/jackson/databind/deser/std/ClassDeserializer;-><init>()V

    aput-object v2, v0, v1

    const/16 v1, 0xb

    new-instance v2, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$StackTraceElementDeserializer;

    invoke-direct {v2}, Lcom/fasterxml/jackson/databind/deser/std/JdkDeserializers$StackTraceElementDeserializer;-><init>()V

    aput-object v2, v0, v1

    return-object v0
.end method
