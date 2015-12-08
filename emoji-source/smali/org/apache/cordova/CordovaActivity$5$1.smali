.class Lorg/apache/cordova/CordovaActivity$5$1;
.super Landroid/view/OrientationEventListener;
.source "CordovaActivity.java"


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
.method constructor <init>(Lorg/apache/cordova/CordovaActivity$5;Landroid/content/Context;I)V
    .locals 0
    .param p1, "this$1"    # Lorg/apache/cordova/CordovaActivity$5;
    .param p2, "x0"    # Landroid/content/Context;
    .param p3, "x1"    # I

    .prologue
    .line 1032
    iput-object p1, p0, Lorg/apache/cordova/CordovaActivity$5$1;->this$1:Lorg/apache/cordova/CordovaActivity$5;

    invoke-direct {p0, p2, p3}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public onOrientationChanged(I)V
    .locals 3
    .param p1, "ori"    # I

    .prologue
    .line 1034
    iget-object v1, p0, Lorg/apache/cordova/CordovaActivity$5$1;->this$1:Lorg/apache/cordova/CordovaActivity$5;

    iget-object v1, v1, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    iget-object v1, v1, Lorg/apache/cordova/CordovaActivity;->splashDialog:Landroid/app/Dialog;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/apache/cordova/CordovaActivity$5$1;->this$1:Lorg/apache/cordova/CordovaActivity$5;

    iget-object v1, v1, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    iget-object v1, v1, Lorg/apache/cordova/CordovaActivity;->splashDialog:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->isShowing()Z

    move-result v1

    if-nez v1, :cond_1

    .line 1044
    :cond_0
    :goto_0
    return-void

    .line 1038
    :cond_1
    iget-object v1, p0, Lorg/apache/cordova/CordovaActivity$5$1;->this$1:Lorg/apache/cordova/CordovaActivity$5;

    iget-object v1, v1, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    invoke-virtual {v1}, Lorg/apache/cordova/CordovaActivity;->getScreenOrientation()I

    move-result v0

    .line 1039
    .local v0, "orientation":I
    iget-object v1, p0, Lorg/apache/cordova/CordovaActivity$5$1;->this$1:Lorg/apache/cordova/CordovaActivity$5;

    iget-object v1, v1, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    iget v1, v1, Lorg/apache/cordova/CordovaActivity;->mCurrentOrientation:I

    if-eq v0, v1, :cond_0

    .line 1040
    iget-object v1, p0, Lorg/apache/cordova/CordovaActivity$5$1;->this$1:Lorg/apache/cordova/CordovaActivity$5;

    iget-object v1, v1, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    iget-object v2, p0, Lorg/apache/cordova/CordovaActivity$5$1;->this$1:Lorg/apache/cordova/CordovaActivity$5;

    iget-object v2, v2, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    invoke-virtual {v2}, Lorg/apache/cordova/CordovaActivity;->getSplashLayout()Landroid/widget/LinearLayout;

    move-result-object v2

    iput-object v2, v1, Lorg/apache/cordova/CordovaActivity;->splashLayout:Landroid/widget/LinearLayout;

    .line 1041
    iget-object v1, p0, Lorg/apache/cordova/CordovaActivity$5$1;->this$1:Lorg/apache/cordova/CordovaActivity$5;

    iget-object v1, v1, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    iget-object v1, v1, Lorg/apache/cordova/CordovaActivity;->splashDialog:Landroid/app/Dialog;

    iget-object v2, p0, Lorg/apache/cordova/CordovaActivity$5$1;->this$1:Lorg/apache/cordova/CordovaActivity$5;

    iget-object v2, v2, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    iget-object v2, v2, Lorg/apache/cordova/CordovaActivity;->splashLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 1042
    iget-object v1, p0, Lorg/apache/cordova/CordovaActivity$5$1;->this$1:Lorg/apache/cordova/CordovaActivity$5;

    iget-object v1, v1, Lorg/apache/cordova/CordovaActivity$5;->this$0:Lorg/apache/cordova/CordovaActivity;

    iput v0, v1, Lorg/apache/cordova/CordovaActivity;->mCurrentOrientation:I

    goto :goto_0
.end method
