.class Lorg/apache/cordova/dialogs/Notification$6$1;
.super Ljava/lang/Object;
.source "Notification.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/dialogs/Notification$6;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lorg/apache/cordova/dialogs/Notification$6;


# direct methods
.method constructor <init>(Lorg/apache/cordova/dialogs/Notification$6;)V
    .locals 0
    .param p1, "this$1"    # Lorg/apache/cordova/dialogs/Notification$6;

    .prologue
    .line 421
    iput-object p1, p0, Lorg/apache/cordova/dialogs/Notification$6$1;->this$1:Lorg/apache/cordova/dialogs/Notification$6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 423
    iget-object v0, p0, Lorg/apache/cordova/dialogs/Notification$6$1;->this$1:Lorg/apache/cordova/dialogs/Notification$6;

    iget-object v0, v0, Lorg/apache/cordova/dialogs/Notification$6;->val$notification:Lorg/apache/cordova/dialogs/Notification;

    const/4 v1, 0x0

    iput-object v1, v0, Lorg/apache/cordova/dialogs/Notification;->progressDialog:Landroid/app/ProgressDialog;

    .line 424
    return-void
.end method
