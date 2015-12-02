.class Lcom/qihoo/security/notify/NotificationService$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/notify/NotificationService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/notify/NotificationService;


# direct methods
.method constructor <init>(Lcom/qihoo/security/notify/NotificationService;)V
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/qihoo/security/notify/NotificationService$1;->a:Lcom/qihoo/security/notify/NotificationService;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 31
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 38
    :goto_0
    return-void

    .line 33
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/notify/NotificationService$1;->a:Lcom/qihoo/security/notify/NotificationService;

    invoke-static {v0}, Lcom/qihoo/security/notify/NotificationService;->a(Lcom/qihoo/security/notify/NotificationService;)V

    goto :goto_0

    .line 31
    :pswitch_data_0
    .packed-switch 0x1008
        :pswitch_0
    .end packed-switch
.end method
