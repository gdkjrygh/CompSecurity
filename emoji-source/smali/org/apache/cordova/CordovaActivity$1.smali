.class Lorg/apache/cordova/CordovaActivity$1;
.super Ljava/lang/Object;
.source "CordovaActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/CordovaActivity;->spinnerStart(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/CordovaActivity;

.field final synthetic val$me:Lorg/apache/cordova/CordovaActivity;


# direct methods
.method constructor <init>(Lorg/apache/cordova/CordovaActivity;Lorg/apache/cordova/CordovaActivity;)V
    .locals 0
    .param p1, "this$0"    # Lorg/apache/cordova/CordovaActivity;

    .prologue
    .line 740
    iput-object p1, p0, Lorg/apache/cordova/CordovaActivity$1;->this$0:Lorg/apache/cordova/CordovaActivity;

    iput-object p2, p0, Lorg/apache/cordova/CordovaActivity$1;->val$me:Lorg/apache/cordova/CordovaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 742
    iget-object v0, p0, Lorg/apache/cordova/CordovaActivity$1;->val$me:Lorg/apache/cordova/CordovaActivity;

    const/4 v1, 0x0

    iput-object v1, v0, Lorg/apache/cordova/CordovaActivity;->spinnerDialog:Landroid/app/ProgressDialog;

    .line 743
    return-void
.end method
