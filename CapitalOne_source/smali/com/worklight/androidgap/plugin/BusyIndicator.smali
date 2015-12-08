.class public Lcom/worklight/androidgap/plugin/BusyIndicator;
.super Lorg/apache/cordova/api/Plugin;
.source "BusyIndicator.java"


# instance fields
.field private spinnerDialog:Landroid/app/ProgressDialog;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Lorg/apache/cordova/api/Plugin;-><init>()V

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/worklight/androidgap/plugin/BusyIndicator;->spinnerDialog:Landroid/app/ProgressDialog;

    .line 27
    return-void
.end method

.method static synthetic access$0(Lcom/worklight/androidgap/plugin/BusyIndicator;Landroid/app/ProgressDialog;)V
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/worklight/androidgap/plugin/BusyIndicator;->spinnerDialog:Landroid/app/ProgressDialog;

    return-void
.end method

.method static synthetic access$1(Lcom/worklight/androidgap/plugin/BusyIndicator;)Landroid/app/ProgressDialog;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/BusyIndicator;->spinnerDialog:Landroid/app/ProgressDialog;

    return-object v0
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
    .locals 6
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "args"    # Lorg/json/JSONArray;
    .param p3, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 66
    sget-object v3, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    .line 67
    .local v3, "status":Lorg/apache/cordova/api/PluginResult$Status;
    new-instance v1, Lorg/apache/cordova/api/PluginResult;

    const-string v4, ""

    invoke-direct {v1, v3, v4}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .line 69
    .local v1, "result":Lorg/apache/cordova/api/PluginResult;
    :try_start_0
    const-string v4, "show"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 70
    const/4 v4, 0x0

    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/worklight/androidgap/plugin/BusyIndicator;->show(Ljava/lang/String;)V

    :cond_0
    :goto_0
    move-object v4, v1

    .line 81
    :goto_1
    return-object v4

    .line 72
    :cond_1
    const-string v4, "hide"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 73
    invoke-virtual {p0}, Lcom/worklight/androidgap/plugin/BusyIndicator;->hide()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 80
    :catch_0
    move-exception v0

    .line 81
    .local v0, "e":Lorg/json/JSONException;
    new-instance v4, Lorg/apache/cordova/api/PluginResult;

    sget-object v5, Lorg/apache/cordova/api/PluginResult$Status;->JSON_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v4, v5}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    goto :goto_1

    .line 75
    .end local v0    # "e":Lorg/json/JSONException;
    :cond_2
    :try_start_1
    const-string v4, "isVisible"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 76
    new-instance v2, Lorg/apache/cordova/api/PluginResult;

    invoke-virtual {p0}, Lcom/worklight/androidgap/plugin/BusyIndicator;->isVisible()Z

    move-result v4

    invoke-direct {v2, v3, v4}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Z)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .end local v1    # "result":Lorg/apache/cordova/api/PluginResult;
    .local v2, "result":Lorg/apache/cordova/api/PluginResult;
    move-object v1, v2

    .end local v2    # "result":Lorg/apache/cordova/api/PluginResult;
    .restart local v1    # "result":Lorg/apache/cordova/api/PluginResult;
    goto :goto_0
.end method

.method public hide()V
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/BusyIndicator;->spinnerDialog:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/BusyIndicator;->spinnerDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/worklight/androidgap/plugin/BusyIndicator;->spinnerDialog:Landroid/app/ProgressDialog;

    .line 58
    :cond_0
    return-void
.end method

.method public isSynch(Ljava/lang/String;)Z
    .locals 1
    .param p1, "action"    # Ljava/lang/String;

    .prologue
    .line 86
    const/4 v0, 0x1

    return v0
.end method

.method public isVisible()Z
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/BusyIndicator;->spinnerDialog:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/worklight/androidgap/plugin/BusyIndicator;->spinnerDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public show(Ljava/lang/String;)V
    .locals 3
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 32
    iget-object v2, p0, Lcom/worklight/androidgap/plugin/BusyIndicator;->spinnerDialog:Landroid/app/ProgressDialog;

    if-eqz v2, :cond_0

    .line 33
    iget-object v2, p0, Lcom/worklight/androidgap/plugin/BusyIndicator;->spinnerDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v2}, Landroid/app/ProgressDialog;->dismiss()V

    .line 34
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/worklight/androidgap/plugin/BusyIndicator;->spinnerDialog:Landroid/app/ProgressDialog;

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/worklight/androidgap/plugin/BusyIndicator;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    .line 39
    .local v0, "ctx":Lorg/apache/cordova/api/CordovaInterface;
    new-instance v1, Lcom/worklight/androidgap/plugin/BusyIndicator$1;

    invoke-direct {v1, p0, v0, p1}, Lcom/worklight/androidgap/plugin/BusyIndicator$1;-><init>(Lcom/worklight/androidgap/plugin/BusyIndicator;Lorg/apache/cordova/api/CordovaInterface;Ljava/lang/String;)V

    .line 50
    .local v1, "runnable":Ljava/lang/Runnable;
    iget-object v2, p0, Lcom/worklight/androidgap/plugin/BusyIndicator;->cordova:Lorg/apache/cordova/api/CordovaInterface;

    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v2, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 51
    return-void
.end method
