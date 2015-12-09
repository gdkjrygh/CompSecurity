.class Lorg/apache/cordova/Notification$2;
.super Ljava/lang/Object;
.source "Notification.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/Notification;->confirm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/cordova/api/CallbackContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/Notification;

.field final synthetic val$callbackContext:Lorg/apache/cordova/api/CallbackContext;

.field final synthetic val$cordova:Lorg/apache/cordova/api/CordovaInterface;

.field final synthetic val$fButtons:[Ljava/lang/String;

.field final synthetic val$message:Ljava/lang/String;

.field final synthetic val$title:Ljava/lang/String;


# direct methods
.method constructor <init>(Lorg/apache/cordova/Notification;Lorg/apache/cordova/api/CordovaInterface;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lorg/apache/cordova/api/CallbackContext;)V
    .locals 0

    .prologue
    .line 196
    iput-object p1, p0, Lorg/apache/cordova/Notification$2;->this$0:Lorg/apache/cordova/Notification;

    iput-object p2, p0, Lorg/apache/cordova/Notification$2;->val$cordova:Lorg/apache/cordova/api/CordovaInterface;

    iput-object p3, p0, Lorg/apache/cordova/Notification$2;->val$message:Ljava/lang/String;

    iput-object p4, p0, Lorg/apache/cordova/Notification$2;->val$title:Ljava/lang/String;

    iput-object p5, p0, Lorg/apache/cordova/Notification$2;->val$fButtons:[Ljava/lang/String;

    iput-object p6, p0, Lorg/apache/cordova/Notification$2;->val$callbackContext:Lorg/apache/cordova/api/CallbackContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    .line 198
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lorg/apache/cordova/Notification$2;->val$cordova:Lorg/apache/cordova/api/CordovaInterface;

    invoke-interface {v1}, Lorg/apache/cordova/api/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 199
    .local v0, "dlg":Landroid/app/AlertDialog$Builder;
    iget-object v1, p0, Lorg/apache/cordova/Notification$2;->val$message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 200
    iget-object v1, p0, Lorg/apache/cordova/Notification$2;->val$title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 201
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 204
    iget-object v1, p0, Lorg/apache/cordova/Notification$2;->val$fButtons:[Ljava/lang/String;

    array-length v1, v1

    if-lez v1, :cond_0

    .line 205
    iget-object v1, p0, Lorg/apache/cordova/Notification$2;->val$fButtons:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    new-instance v2, Lorg/apache/cordova/Notification$2$1;

    invoke-direct {v2, p0}, Lorg/apache/cordova/Notification$2$1;-><init>(Lorg/apache/cordova/Notification$2;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 215
    :cond_0
    iget-object v1, p0, Lorg/apache/cordova/Notification$2;->val$fButtons:[Ljava/lang/String;

    array-length v1, v1

    if-le v1, v3, :cond_1

    .line 216
    iget-object v1, p0, Lorg/apache/cordova/Notification$2;->val$fButtons:[Ljava/lang/String;

    aget-object v1, v1, v3

    new-instance v2, Lorg/apache/cordova/Notification$2$2;

    invoke-direct {v2, p0}, Lorg/apache/cordova/Notification$2$2;-><init>(Lorg/apache/cordova/Notification$2;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 226
    :cond_1
    iget-object v1, p0, Lorg/apache/cordova/Notification$2;->val$fButtons:[Ljava/lang/String;

    array-length v1, v1

    if-le v1, v4, :cond_2

    .line 227
    iget-object v1, p0, Lorg/apache/cordova/Notification$2;->val$fButtons:[Ljava/lang/String;

    aget-object v1, v1, v4

    new-instance v2, Lorg/apache/cordova/Notification$2$3;

    invoke-direct {v2, p0}, Lorg/apache/cordova/Notification$2$3;-><init>(Lorg/apache/cordova/Notification$2;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 236
    :cond_2
    new-instance v1, Lorg/apache/cordova/Notification$2$4;

    invoke-direct {v1, p0}, Lorg/apache/cordova/Notification$2$4;-><init>(Lorg/apache/cordova/Notification$2;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 244
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 245
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 246
    return-void
.end method
