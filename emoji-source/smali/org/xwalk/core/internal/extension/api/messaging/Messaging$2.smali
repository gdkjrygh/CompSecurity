.class Lorg/xwalk/core/internal/extension/api/messaging/Messaging$2;
.super Ljava/lang/Object;
.source "Messaging.java"

# interfaces
.implements Lorg/xwalk/core/internal/extension/api/messaging/Command;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->initMethodMap()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/extension/api/messaging/Messaging;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)V
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$2;->this$0:Lorg/xwalk/core/internal/extension/api/messaging/Messaging;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public runCommand(ILorg/json/JSONObject;)V
    .locals 1
    .param p1, "instanceID"    # I
    .param p2, "jsonMsg"    # Lorg/json/JSONObject;

    .prologue
    .line 50
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$2;->this$0:Lorg/xwalk/core/internal/extension/api/messaging/Messaging;

    # getter for: Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->mSmsManager:Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;
    invoke-static {v0}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->access$000(Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;->onSmsClear(ILorg/json/JSONObject;)V

    .line 51
    return-void
.end method
