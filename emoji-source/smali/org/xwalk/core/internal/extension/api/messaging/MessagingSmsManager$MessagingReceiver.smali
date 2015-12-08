.class abstract Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$MessagingReceiver;
.super Landroid/content/BroadcastReceiver;
.source "MessagingSmsManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "MessagingReceiver"
.end annotation


# instance fields
.field protected mMessaging:Lorg/xwalk/core/internal/extension/api/messaging/Messaging;

.field final synthetic this$0:Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;


# direct methods
.method public constructor <init>(Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;Lorg/xwalk/core/internal/extension/api/messaging/Messaging;)V
    .locals 0
    .param p2, "messaging"    # Lorg/xwalk/core/internal/extension/api/messaging/Messaging;

    .prologue
    .line 46
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$MessagingReceiver;->this$0:Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 47
    iput-object p2, p0, Lorg/xwalk/core/internal/extension/api/messaging/MessagingSmsManager$MessagingReceiver;->mMessaging:Lorg/xwalk/core/internal/extension/api/messaging/Messaging;

    .line 48
    return-void
.end method
