.class Lorg/xwalk/core/internal/extension/api/messaging/Messaging$4;
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
    .line 58
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$4;->this$0:Lorg/xwalk/core/internal/extension/api/messaging/Messaging;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public runCommand(ILorg/json/JSONObject;)V
    .locals 1
    .param p1, "instanceID"    # I
    .param p2, "jsonMsg"    # Lorg/json/JSONObject;

    .prologue
    .line 60
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/messaging/Messaging$4;->this$0:Lorg/xwalk/core/internal/extension/api/messaging/Messaging;

    # getter for: Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->mMessagingManager:Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;
    invoke-static {v0}, Lorg/xwalk/core/internal/extension/api/messaging/Messaging;->access$100(Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/xwalk/core/internal/extension/api/messaging/MessagingManager;->onMsgFindMessages(ILorg/json/JSONObject;)V

    .line 61
    return-void
.end method
