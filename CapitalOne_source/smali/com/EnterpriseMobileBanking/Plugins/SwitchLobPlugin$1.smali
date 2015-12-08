.class Lcom/EnterpriseMobileBanking/Plugins/SwitchLobPlugin$1;
.super Ljava/lang/Object;
.source "SwitchLobPlugin.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/SwitchLobPlugin;->execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/Plugins/SwitchLobPlugin;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/Plugins/SwitchLobPlugin;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/SwitchLobPlugin$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/SwitchLobPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    .prologue
    .line 40
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/BusyJSI;->forceHide()V

    .line 41
    return-void
.end method
