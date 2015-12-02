.class Lcom/facebook/analytics/periodicreporters/f;
.super Ljava/lang/Object;
.source "DeviceInfoPeriodicReporter.java"


# static fields
.field private static c:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Lcom/facebook/analytics/periodicreporters/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Ljava/lang/String;

.field private b:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 212
    new-instance v0, Lcom/facebook/analytics/periodicreporters/g;

    invoke-direct {v0}, Lcom/facebook/analytics/periodicreporters/g;-><init>()V

    sput-object v0, Lcom/facebook/analytics/periodicreporters/f;->c:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 2

    .prologue
    .line 200
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 201
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/periodicreporters/f;->a:Ljava/lang/String;

    .line 202
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/analytics/periodicreporters/f;->b:J

    .line 203
    return-void
.end method

.method static synthetic a(Lcom/facebook/analytics/periodicreporters/f;)J
    .locals 2

    .prologue
    .line 196
    iget-wide v0, p0, Lcom/facebook/analytics/periodicreporters/f;->b:J

    return-wide v0
.end method

.method static synthetic a()Ljava/util/Comparator;
    .locals 1

    .prologue
    .line 196
    sget-object v0, Lcom/facebook/analytics/periodicreporters/f;->c:Ljava/util/Comparator;

    return-object v0
.end method

.method private b()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 4

    .prologue
    .line 206
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 207
    const-string v1, "name"

    iget-object v2, p0, Lcom/facebook/analytics/periodicreporters/f;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 208
    const-string v1, "size"

    iget-wide v2, p0, Lcom/facebook/analytics/periodicreporters/f;->b:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;J)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 209
    return-object v0
.end method

.method static synthetic b(Lcom/facebook/analytics/periodicreporters/f;)Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 1

    .prologue
    .line 196
    invoke-direct {p0}, Lcom/facebook/analytics/periodicreporters/f;->b()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    return-object v0
.end method
