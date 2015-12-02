.class public Lcom/facebook/backgroundlocation/status/a;
.super Ljava/lang/Object;
.source "BackgroundLocationAnalyticsFeatureStatusReporter.java"

# interfaces
.implements Lcom/facebook/analytics/d/a;


# instance fields
.field private final a:Lcom/facebook/backgroundlocation/status/d;


# direct methods
.method public constructor <init>(Lcom/facebook/backgroundlocation/status/d;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/facebook/backgroundlocation/status/a;->a:Lcom/facebook/backgroundlocation/status/d;

    .line 19
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 23
    const-string v0, "background_location"

    return-object v0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/facebook/backgroundlocation/status/a;->a:Lcom/facebook/backgroundlocation/status/d;

    invoke-virtual {v0}, Lcom/facebook/backgroundlocation/status/d;->a()Z

    move-result v0

    return v0
.end method

.method public c()Lcom/fasterxml/jackson/databind/JsonNode;
    .locals 1

    .prologue
    .line 33
    const/4 v0, 0x0

    return-object v0
.end method
