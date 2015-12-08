.class Lorg/apache/cordova/CordovaActivity$5$2;
.super Ljava/lang/Object;
.source "CordovaActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/CordovaActivity$5;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lorg/apache/cordova/CordovaActivity$5;


# direct methods
.method constructor <init>(Lorg/apache/cordova/CordovaActivity$5;)V
    .locals 0
    .param p1, "this$1"    # Lorg/apache/cordova/CordovaActivity$5;

    .prologue
    .line 1050
    iput-object p1, p0, Lorg/apache/cordova/CordovaActivity$5$2;->this$1:Lorg/apache/cordova/CordovaActivity$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 1052
    iget-object v0, p0, Lorg/apache/cordova/CordovaActivity$5$2;->this$1:Lorg/apache/cordova/CordovaActivity$5;

    iget-object v0, v0, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    invoke-virtual {v0}, Lorg/apache/cordova/CordovaActivity;->removeSplashScreen()V

    .line 1053
    return-void
.end method
