.class public Lcom/facebook/orca/fbwebrtc/ax;
.super Ljava/lang/Object;
.source "WebrtcNotificationManager.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Landroid/app/NotificationManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/facebook/orca/fbwebrtc/ax;

    sput-object v0, Lcom/facebook/orca/fbwebrtc/ax;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/app/NotificationManager;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/ax;->b:Landroid/content/Context;

    .line 27
    iput-object p2, p0, Lcom/facebook/orca/fbwebrtc/ax;->c:Landroid/app/NotificationManager;

    .line 28
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 58
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ax;->c:Landroid/app/NotificationManager;

    const/16 v1, 0x2715

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 59
    return-void
.end method

.method public a(JLjava/lang/String;)V
    .locals 4

    .prologue
    .line 34
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/ax;->b:Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 35
    const-string v1, "com.facebook.orca.fbwebrtc.intent.action.SHOW_UI"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 36
    const-string v1, "CONTACT_ID"

    invoke-virtual {v0, v1, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 38
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/ax;->b:Landroid/content/Context;

    const/4 v2, 0x0

    const/high16 v3, 0x10000000

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 41
    new-instance v1, Landroid/support/v4/app/ap;

    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/ax;->b:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/support/v4/app/ap;-><init>(Landroid/content/Context;)V

    const v2, 0x1080084

    invoke-virtual {v1, v2}, Landroid/support/v4/app/ap;->a(I)Landroid/support/v4/app/ap;

    move-result-object v1

    invoke-virtual {v1, p3}, Landroid/support/v4/app/ap;->a(Ljava/lang/CharSequence;)Landroid/support/v4/app/ap;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/ax;->b:Landroid/content/Context;

    sget v3, Lcom/facebook/o;->webrtc_notification_incall_text:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/app/ap;->b(Ljava/lang/CharSequence;)Landroid/support/v4/app/ap;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/support/v4/app/ap;->a(Z)Landroid/support/v4/app/ap;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/ap;->a(Landroid/app/PendingIntent;)Landroid/support/v4/app/ap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/ap;->a()Landroid/app/Notification;

    move-result-object v0

    .line 49
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/ax;->c:Landroid/app/NotificationManager;

    const/16 v2, 0x2715

    invoke-virtual {v1, v2, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 52
    return-void
.end method
