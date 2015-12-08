.class public Lorg/apache/cordova/PluginEntry;
.super Ljava/lang/Object;
.source "PluginEntry.java"


# instance fields
.field public onload:Z

.field public plugin:Lorg/apache/cordova/CordovaPlugin;

.field public pluginClass:Ljava/lang/String;

.field public service:Ljava/lang/String;

.field private urlFilters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 6
    .param p1, "service"    # Ljava/lang/String;
    .param p2, "pluginClass"    # Ljava/lang/String;
    .param p3, "onload"    # Z

    .prologue
    const/4 v4, 0x0

    .line 66
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v5, v4

    invoke-direct/range {v0 .. v5}, Lorg/apache/cordova/PluginEntry;-><init>(Ljava/lang/String;Ljava/lang/String;ZLorg/apache/cordova/CordovaPlugin;Ljava/util/List;)V

    .line 67
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V
    .locals 1
    .param p1, "service"    # Ljava/lang/String;
    .param p2, "pluginClass"    # Ljava/lang/String;
    .param p3, "onload"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 70
    .local p4, "urlFilters":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Lorg/apache/cordova/PluginEntry;->service:Ljava/lang/String;

    .line 72
    iput-object p2, p0, Lorg/apache/cordova/PluginEntry;->pluginClass:Ljava/lang/String;

    .line 73
    iput-boolean p3, p0, Lorg/apache/cordova/PluginEntry;->onload:Z

    .line 74
    iput-object p4, p0, Lorg/apache/cordova/PluginEntry;->urlFilters:Ljava/util/List;

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/cordova/PluginEntry;->plugin:Lorg/apache/cordova/CordovaPlugin;

    .line 76
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLorg/apache/cordova/CordovaPlugin;Ljava/util/List;)V
    .locals 0
    .param p1, "service"    # Ljava/lang/String;
    .param p2, "pluginClass"    # Ljava/lang/String;
    .param p3, "onload"    # Z
    .param p4, "plugin"    # Lorg/apache/cordova/CordovaPlugin;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lorg/apache/cordova/CordovaPlugin;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 78
    .local p5, "urlFilters":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, Lorg/apache/cordova/PluginEntry;->service:Ljava/lang/String;

    .line 80
    iput-object p2, p0, Lorg/apache/cordova/PluginEntry;->pluginClass:Ljava/lang/String;

    .line 81
    iput-boolean p3, p0, Lorg/apache/cordova/PluginEntry;->onload:Z

    .line 82
    iput-object p5, p0, Lorg/apache/cordova/PluginEntry;->urlFilters:Ljava/util/List;

    .line 83
    iput-object p4, p0, Lorg/apache/cordova/PluginEntry;->plugin:Lorg/apache/cordova/CordovaPlugin;

    .line 84
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/apache/cordova/CordovaPlugin;)V
    .locals 6
    .param p1, "service"    # Ljava/lang/String;
    .param p2, "plugin"    # Lorg/apache/cordova/CordovaPlugin;

    .prologue
    .line 57
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lorg/apache/cordova/PluginEntry;-><init>(Ljava/lang/String;Ljava/lang/String;ZLorg/apache/cordova/CordovaPlugin;Ljava/util/List;)V

    .line 58
    return-void
.end method


# virtual methods
.method public getUrlFilters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 87
    iget-object v0, p0, Lorg/apache/cordova/PluginEntry;->urlFilters:Ljava/util/List;

    return-object v0
.end method
