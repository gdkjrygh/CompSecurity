.class Lorg/apache/cordova/BatteryListener$1;
.super Landroid/content/BroadcastReceiver;
.source "BatteryListener.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/BatteryListener;->execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/api/CallbackContext;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/BatteryListener;


# direct methods
.method constructor <init>(Lorg/apache/cordova/BatteryListener;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lorg/apache/cordova/BatteryListener$1;->this$0:Lorg/apache/cordova/BatteryListener;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 72
    iget-object v0, p0, Lorg/apache/cordova/BatteryListener$1;->this$0:Lorg/apache/cordova/BatteryListener;

    # invokes: Lorg/apache/cordova/BatteryListener;->updateBatteryInfo(Landroid/content/Intent;)V
    invoke-static {v0, p2}, Lorg/apache/cordova/BatteryListener;->access$000(Lorg/apache/cordova/BatteryListener;Landroid/content/Intent;)V

    .line 73
    return-void
.end method
