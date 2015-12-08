.class Lcom/splunk/mint/ActionView;
.super Lcom/splunk/mint/BaseDTO;
.source "ActionView.java"

# interfaces
.implements Lcom/splunk/mint/InterfaceDataType;


# instance fields
.field public viewName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/splunk/mint/EnumActionType;Ljava/lang/String;)V
    .locals 1
    .param p1, "type"    # Lcom/splunk/mint/EnumActionType;
    .param p2, "viewName"    # Ljava/lang/String;

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/splunk/mint/BaseDTO;-><init>(Lcom/splunk/mint/EnumActionType;)V

    .line 24
    const-string v0, ""

    iput-object v0, p0, Lcom/splunk/mint/ActionView;->viewName:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Lcom/splunk/mint/ActionView;->viewName:Ljava/lang/String;

    .line 17
    return-void
.end method

.method public static final logView(Ljava/lang/String;)Lcom/splunk/mint/ActionView;
    .locals 2
    .param p0, "viewName"    # Ljava/lang/String;

    .prologue
    .line 21
    new-instance v0, Lcom/splunk/mint/ActionView;

    sget-object v1, Lcom/splunk/mint/EnumActionType;->view:Lcom/splunk/mint/EnumActionType;

    invoke-direct {v0, v1, p0}, Lcom/splunk/mint/ActionView;-><init>(Lcom/splunk/mint/EnumActionType;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public save(Lcom/splunk/mint/DataSaver;)V
    .locals 1
    .param p1, "dataSaver"    # Lcom/splunk/mint/DataSaver;

    .prologue
    .line 48
    invoke-virtual {p0}, Lcom/splunk/mint/ActionView;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/splunk/mint/DataSaver;->save(Ljava/lang/String;)V

    .line 49
    return-void
.end method

.method public send(Landroid/content/Context;Lcom/splunk/mint/NetSender;Z)V
    .locals 1
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "netSender"    # Lcom/splunk/mint/NetSender;
    .param p3, "saveOnFail"    # Z

    .prologue
    .line 43
    invoke-virtual {p0}, Lcom/splunk/mint/ActionView;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0, p3}, Lcom/splunk/mint/NetSender;->send(Ljava/lang/String;Z)V

    .line 44
    return-void
.end method

.method public send(Lcom/splunk/mint/NetSender;Z)V
    .locals 1
    .param p1, "netSender"    # Lcom/splunk/mint/NetSender;
    .param p2, "saveOnFail"    # Z

    .prologue
    .line 53
    invoke-virtual {p0}, Lcom/splunk/mint/ActionView;->toJsonLine()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lcom/splunk/mint/NetSender;->send(Ljava/lang/String;Z)V

    .line 54
    return-void
.end method

.method public toJsonLine()Ljava/lang/String;
    .locals 4

    .prologue
    .line 28
    invoke-virtual {p0}, Lcom/splunk/mint/ActionView;->getBasicDataFixtureJson()Lorg/json/JSONObject;

    move-result-object v1

    .line 31
    .local v1, "json":Lorg/json/JSONObject;
    :try_start_0
    iget-object v2, p0, Lcom/splunk/mint/ActionView;->viewName:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 32
    const-string v2, "view_name"

    iget-object v3, p0, Lcom/splunk/mint/ActionView;->viewName:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    :cond_0
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/splunk/mint/EnumActionType;->view:Lcom/splunk/mint/EnumActionType;

    invoke-static {v3}, Lcom/splunk/mint/Properties;->getSeparator(Lcom/splunk/mint/EnumActionType;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2

    .line 35
    :catch_0
    move-exception v0

    .line 36
    .local v0, "e":Lorg/json/JSONException;
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method
