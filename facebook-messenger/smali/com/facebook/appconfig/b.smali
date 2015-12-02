.class public Lcom/facebook/appconfig/b;
.super Ljava/lang/Object;
.source "AppConfigCache.java"


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;

.field private final b:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private volatile c:Lcom/facebook/appconfig/AppConfig;


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/facebook/appconfig/b;->a:Lcom/facebook/prefs/shared/d;

    .line 27
    iput-object p2, p0, Lcom/facebook/appconfig/b;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 28
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/appconfig/AppConfig;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 37
    iget-object v1, p0, Lcom/facebook/appconfig/b;->c:Lcom/facebook/appconfig/AppConfig;

    if-eqz v1, :cond_1

    .line 38
    iget-object v0, p0, Lcom/facebook/appconfig/b;->c:Lcom/facebook/appconfig/AppConfig;

    .line 49
    :cond_0
    :goto_0
    return-object v0

    .line 40
    :cond_1
    iget-object v1, p0, Lcom/facebook/appconfig/b;->a:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/appconfig/l;->c:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 41
    iget-object v1, p0, Lcom/facebook/appconfig/b;->a:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/appconfig/l;->b:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v4, 0x0

    invoke-interface {v1, v3, v4, v5}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v3

    .line 43
    if-eqz v2, :cond_0

    .line 47
    :try_start_0
    new-instance v1, Lcom/facebook/appconfig/AppConfig;

    iget-object v5, p0, Lcom/facebook/appconfig/b;->b:Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {v5, v2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/appconfig/AppConfig;-><init>(Lcom/fasterxml/jackson/databind/JsonNode;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    .line 48
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public a(Lcom/facebook/appconfig/AppConfig;)V
    .locals 4
    .param p1    # Lcom/facebook/appconfig/AppConfig;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 59
    if-nez p1, :cond_0

    .line 69
    :goto_0
    return-void

    .line 63
    :cond_0
    iget-object v0, p0, Lcom/facebook/appconfig/b;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 64
    sget-object v1, Lcom/facebook/appconfig/l;->c:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1}, Lcom/facebook/appconfig/AppConfig;->c()Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fasterxml/jackson/databind/JsonNode;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    .line 65
    sget-object v1, Lcom/facebook/appconfig/l;->b:Lcom/facebook/prefs/shared/ae;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 66
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 68
    iput-object p1, p0, Lcom/facebook/appconfig/b;->c:Lcom/facebook/appconfig/AppConfig;

    goto :goto_0
.end method
