.class public Lorg/apache/cordova/api/PluginEntry;
.super Ljava/lang/Object;
.source "PluginEntry.java"


# instance fields
.field public onload:Z

.field public plugin:Lorg/apache/cordova/api/CordovaPlugin;

.field public pluginClass:Ljava/lang/String;

.field public service:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1
    .param p1, "service"    # Ljava/lang/String;
    .param p2, "pluginClass"    # Ljava/lang/String;
    .param p3, "onload"    # Z

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const-string v0, ""

    iput-object v0, p0, Lorg/apache/cordova/api/PluginEntry;->service:Ljava/lang/String;

    .line 39
    const-string v0, ""

    iput-object v0, p0, Lorg/apache/cordova/api/PluginEntry;->pluginClass:Ljava/lang/String;

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/cordova/api/PluginEntry;->plugin:Lorg/apache/cordova/api/CordovaPlugin;

    .line 51
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/cordova/api/PluginEntry;->onload:Z

    .line 61
    iput-object p1, p0, Lorg/apache/cordova/api/PluginEntry;->service:Ljava/lang/String;

    .line 62
    iput-object p2, p0, Lorg/apache/cordova/api/PluginEntry;->pluginClass:Ljava/lang/String;

    .line 63
    iput-boolean p3, p0, Lorg/apache/cordova/api/PluginEntry;->onload:Z

    .line 64
    return-void
.end method

.method private getClassByName(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1
    .param p1, "clazz"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .prologue
    .line 100
    const/4 v0, 0x0

    .line 101
    .local v0, "c":Ljava/lang/Class;
    if-eqz p1, :cond_0

    .line 102
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 104
    :cond_0
    return-object v0
.end method

.method private isCordovaPlugin(Ljava/lang/Class;)Z
    .locals 1
    .param p1, "c"    # Ljava/lang/Class;

    .prologue
    .line 112
    if-eqz p1, :cond_0

    .line 113
    const-class v0, Lorg/apache/cordova/api/CordovaPlugin;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    .line 115
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public createPlugin(Lorg/apache/cordova/CordovaWebView;Lorg/apache/cordova/api/CordovaInterface;)Lorg/apache/cordova/api/CordovaPlugin;
    .locals 5
    .param p1, "webView"    # Lorg/apache/cordova/CordovaWebView;
    .param p2, "ctx"    # Lorg/apache/cordova/api/CordovaInterface;

    .prologue
    .line 73
    iget-object v2, p0, Lorg/apache/cordova/api/PluginEntry;->plugin:Lorg/apache/cordova/api/CordovaPlugin;

    if-eqz v2, :cond_0

    .line 74
    iget-object v2, p0, Lorg/apache/cordova/api/PluginEntry;->plugin:Lorg/apache/cordova/api/CordovaPlugin;

    .line 88
    :goto_0
    return-object v2

    .line 78
    :cond_0
    :try_start_0
    iget-object v2, p0, Lorg/apache/cordova/api/PluginEntry;->pluginClass:Ljava/lang/String;

    invoke-direct {p0, v2}, Lorg/apache/cordova/api/PluginEntry;->getClassByName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 79
    .local v0, "c":Ljava/lang/Class;
    invoke-direct {p0, v0}, Lorg/apache/cordova/api/PluginEntry;->isCordovaPlugin(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 80
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/cordova/api/CordovaPlugin;

    iput-object v2, p0, Lorg/apache/cordova/api/PluginEntry;->plugin:Lorg/apache/cordova/api/CordovaPlugin;

    .line 81
    iget-object v2, p0, Lorg/apache/cordova/api/PluginEntry;->plugin:Lorg/apache/cordova/api/CordovaPlugin;

    invoke-virtual {v2, p2, p1}, Lorg/apache/cordova/api/CordovaPlugin;->initialize(Lorg/apache/cordova/api/CordovaInterface;Lorg/apache/cordova/CordovaWebView;)V

    .line 82
    iget-object v2, p0, Lorg/apache/cordova/api/PluginEntry;->plugin:Lorg/apache/cordova/api/CordovaPlugin;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 84
    .end local v0    # "c":Ljava/lang/Class;
    :catch_0
    move-exception v1

    .line 85
    .local v1, "e":Ljava/lang/Exception;
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 86
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error adding plugin "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lorg/apache/cordova/api/PluginEntry;->pluginClass:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 88
    .end local v1    # "e":Ljava/lang/Exception;
    :cond_1
    const/4 v2, 0x0

    goto :goto_0
.end method
