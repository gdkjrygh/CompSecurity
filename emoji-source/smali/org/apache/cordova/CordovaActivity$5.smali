.class Lorg/apache/cordova/CordovaActivity$5;
.super Ljava/lang/Object;
.source "CordovaActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/CordovaActivity;->showSplashScreen(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/CordovaActivity;

.field final synthetic val$that:Lorg/apache/cordova/CordovaActivity;

.field final synthetic val$time:I


# direct methods
.method constructor <init>(Lorg/apache/cordova/CordovaActivity;Lorg/apache/cordova/CordovaActivity;I)V
    .locals 0
    .param p1, "this$0"    # Lorg/apache/cordova/CordovaActivity;

    .prologue
    .line 1014
    iput-object p1, p0, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    iput-object p2, p0, Lorg/apache/cordova/CordovaActivity$5;->val$that:Lorg/apache/cordova/CordovaActivity;

    iput p3, p0, Lorg/apache/cordova/CordovaActivity$5;->val$time:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 1017
    iget-object v1, p0, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    iget-object v2, p0, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    invoke-virtual {v2}, Lorg/apache/cordova/CordovaActivity;->getSplashLayout()Landroid/widget/LinearLayout;

    move-result-object v2

    iput-object v2, v1, Lorg/apache/cordova/CordovaActivity;->splashLayout:Landroid/widget/LinearLayout;

    .line 1019
    iget-object v1, p0, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    new-instance v2, Landroid/app/Dialog;

    iget-object v3, p0, Lorg/apache/cordova/CordovaActivity$5;->val$that:Lorg/apache/cordova/CordovaActivity;

    const v4, 0x1030010

    invoke-direct {v2, v3, v4}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v2, v1, Lorg/apache/cordova/CordovaActivity;->splashDialog:Landroid/app/Dialog;

    .line 1021
    iget-object v1, p0, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    const-string v2, "FullScreen"

    invoke-virtual {v1, v2, v5}, Lorg/apache/cordova/CordovaActivity;->getBooleanProperty(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1023
    iget-object v1, p0, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    iget-object v2, p0, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    iget-object v2, v2, Lorg/apache/cordova/CordovaActivity;->splashDialog:Landroid/app/Dialog;

    invoke-virtual {v2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v2

    # invokes: Lorg/apache/cordova/CordovaActivity;->toggleFullscreen(Landroid/view/Window;)V
    invoke-static {v1, v2}, Lorg/apache/cordova/CordovaActivity;->access$000(Lorg/apache/cordova/CordovaActivity;Landroid/view/Window;)V

    .line 1026
    :cond_0
    iget-object v1, p0, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    iget-object v1, v1, Lorg/apache/cordova/CordovaActivity;->splashDialog:Landroid/app/Dialog;

    iget-object v2, p0, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    iget-object v2, v2, Lorg/apache/cordova/CordovaActivity;->splashLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 1027
    iget-object v1, p0, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    iget-object v1, v1, Lorg/apache/cordova/CordovaActivity;->splashDialog:Landroid/app/Dialog;

    invoke-virtual {v1, v5}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 1028
    iget-object v1, p0, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    iget-object v1, v1, Lorg/apache/cordova/CordovaActivity;->splashDialog:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 1030
    iget-object v1, p0, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    iget-object v2, p0, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    invoke-virtual {v2}, Lorg/apache/cordova/CordovaActivity;->getScreenOrientation()I

    move-result v2

    iput v2, v1, Lorg/apache/cordova/CordovaActivity;->mCurrentOrientation:I

    .line 1031
    iget-object v1, p0, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    new-instance v2, Lorg/apache/cordova/CordovaActivity$5$1;

    iget-object v3, p0, Lorg/apache/cordova/CordovaActivity$5;->val$that:Lorg/apache/cordova/CordovaActivity;

    const/4 v4, 0x3

    invoke-direct {v2, p0, v3, v4}, Lorg/apache/cordova/CordovaActivity$5$1;-><init>(Lorg/apache/cordova/CordovaActivity$5;Landroid/content/Context;I)V

    iput-object v2, v1, Lorg/apache/cordova/CordovaActivity;->splashOrientationListener:Landroid/view/OrientationEventListener;

    .line 1046
    iget-object v1, p0, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    iget-object v1, v1, Lorg/apache/cordova/CordovaActivity;->splashOrientationListener:Landroid/view/OrientationEventListener;

    invoke-virtual {v1}, Landroid/view/OrientationEventListener;->enable()V

    .line 1049
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 1050
    .local v0, "handler":Landroid/os/Handler;
    new-instance v1, Lorg/apache/cordova/CordovaActivity$5$2;

    invoke-direct {v1, p0}, Lorg/apache/cordova/CordovaActivity$5$2;-><init>(Lorg/apache/cordova/CordovaActivity$5;)V

    iget v2, p0, Lorg/apache/cordova/CordovaActivity$5;->val$time:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1055
    return-void
.end method
