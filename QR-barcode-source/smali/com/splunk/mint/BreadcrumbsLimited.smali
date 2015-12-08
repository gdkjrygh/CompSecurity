.class Lcom/splunk/mint/BreadcrumbsLimited;
.super Ljava/util/ArrayList;
.source "BreadcrumbsLimited.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field protected static final MAX_BREADCRUMBS:I = 0x10

.field private static final serialVersionUID:J = -0x62f427739220a025L


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method


# virtual methods
.method public addToList(Ljava/lang/String;)Z
    .locals 3
    .param p1, "breadcrumb"    # Ljava/lang/String;

    .prologue
    const/16 v2, 0x10

    .line 27
    if-nez p1, :cond_0

    .line 28
    const-string p1, "null"

    .line 30
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Breadcrumb: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " was added to the breadcrumb list"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/splunk/mint/Logger;->logInfo(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p0, p1}, Lcom/splunk/mint/BreadcrumbsLimited;->add(Ljava/lang/Object;)Z

    .line 33
    invoke-virtual {p0}, Lcom/splunk/mint/BreadcrumbsLimited;->size()I

    move-result v0

    if-le v0, v2, :cond_1

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Breadcrumbs list is bigger than "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " items, removing the oldest one."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/splunk/mint/Logger;->logInfo(Ljava/lang/String;)V

    .line 36
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/splunk/mint/BreadcrumbsLimited;->remove(I)Ljava/lang/Object;

    .line 38
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public getList()Lorg/json/JSONArray;
    .locals 4

    .prologue
    .line 47
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 49
    .local v1, "breadcrumbs":Lorg/json/JSONArray;
    invoke-virtual {p0}, Lcom/splunk/mint/BreadcrumbsLimited;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 50
    .local v0, "breadcrumb":Ljava/lang/String;
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 53
    .end local v0    # "breadcrumb":Ljava/lang/String;
    :cond_0
    return-object v1
.end method
