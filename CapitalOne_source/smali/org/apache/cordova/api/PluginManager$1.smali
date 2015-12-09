.class Lorg/apache/cordova/api/PluginManager$1;
.super Ljava/lang/Object;
.source "PluginManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/api/PluginManager;->exec(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/api/PluginManager;


# direct methods
.method constructor <init>(Lorg/apache/cordova/api/PluginManager;)V
    .locals 0

    .prologue
    .line 226
    iput-object p1, p0, Lorg/apache/cordova/api/PluginManager$1;->this$0:Lorg/apache/cordova/api/PluginManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    .prologue
    .line 231
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->forceHide()V

    .line 232
    return-void
.end method
