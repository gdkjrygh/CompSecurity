.class Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin$2;
.super Ljava/lang/Object;
.source "ESIPlugin.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;)V
    .locals 0

    .prologue
    .line 148
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin$2;->this$0:Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 150
    # getter for: Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->access$000()Ljava/lang/String;

    move-result-object v0

    const-string v1, "showEnrollmentStatusMessage - in the runOnUiThread"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin$2;->this$0:Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v1, 0x7f080024

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 153
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin$2;->this$0:Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;

    iget-object v0, v0, Lcom/EnterpriseMobileBanking/Plugins/ESIPlugin;->activity:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    const v1, 0x7f0800a4

    invoke-virtual {v0, v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 154
    return-void
.end method
