.class Lorg/apache/cordova/DroidGap$5;
.super Ljava/lang/Object;
.source "DroidGap.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/DroidGap;->showSplashScreen(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/DroidGap;

.field final synthetic val$that:Lorg/apache/cordova/DroidGap;

.field final synthetic val$time:I


# direct methods
.method constructor <init>(Lorg/apache/cordova/DroidGap;Lorg/apache/cordova/DroidGap;I)V
    .locals 0

    .prologue
    .line 969
    iput-object p1, p0, Lorg/apache/cordova/DroidGap$5;->this$0:Lorg/apache/cordova/DroidGap;

    iput-object p2, p0, Lorg/apache/cordova/DroidGap$5;->val$that:Lorg/apache/cordova/DroidGap;

    iput p3, p0, Lorg/apache/cordova/DroidGap$5;->val$time:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    const/4 v6, -0x1

    const/16 v7, 0x400

    .line 972
    iget-object v3, p0, Lorg/apache/cordova/DroidGap$5;->this$0:Lorg/apache/cordova/DroidGap;

    invoke-virtual {v3}, Lorg/apache/cordova/DroidGap;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v3

    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 975
    .local v0, "display":Landroid/view/Display;
    new-instance v2, Landroid/widget/LinearLayout;

    iget-object v3, p0, Lorg/apache/cordova/DroidGap$5;->val$that:Lorg/apache/cordova/DroidGap;

    invoke-virtual {v3}, Lorg/apache/cordova/DroidGap;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 976
    .local v2, "root":Landroid/widget/LinearLayout;
    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setMinimumHeight(I)V

    .line 977
    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setMinimumWidth(I)V

    .line 978
    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 979
    iget-object v3, p0, Lorg/apache/cordova/DroidGap$5;->val$that:Lorg/apache/cordova/DroidGap;

    const-string v4, "backgroundColor"

    const/high16 v5, -0x1000000

    invoke-virtual {v3, v4, v5}, Lorg/apache/cordova/DroidGap;->getIntegerProperty(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 980
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, 0x0

    invoke-direct {v3, v6, v6, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 982
    iget-object v3, p0, Lorg/apache/cordova/DroidGap$5;->val$that:Lorg/apache/cordova/DroidGap;

    iget v3, v3, Lorg/apache/cordova/DroidGap;->splashscreen:I

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 985
    iget-object v3, p0, Lorg/apache/cordova/DroidGap$5;->this$0:Lorg/apache/cordova/DroidGap;

    new-instance v4, Landroid/app/Dialog;

    iget-object v5, p0, Lorg/apache/cordova/DroidGap$5;->val$that:Lorg/apache/cordova/DroidGap;

    const v6, 0x1030010

    invoke-direct {v4, v5, v6}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v4, v3, Lorg/apache/cordova/DroidGap;->splashDialog:Landroid/app/Dialog;

    .line 987
    iget-object v3, p0, Lorg/apache/cordova/DroidGap$5;->this$0:Lorg/apache/cordova/DroidGap;

    invoke-virtual {v3}, Lorg/apache/cordova/DroidGap;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 v3, v3, 0x400

    if-ne v3, v7, :cond_0

    .line 989
    iget-object v3, p0, Lorg/apache/cordova/DroidGap$5;->this$0:Lorg/apache/cordova/DroidGap;

    iget-object v3, v3, Lorg/apache/cordova/DroidGap;->splashDialog:Landroid/app/Dialog;

    invoke-virtual {v3}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3, v7, v7}, Landroid/view/Window;->setFlags(II)V

    .line 992
    :cond_0
    iget-object v3, p0, Lorg/apache/cordova/DroidGap$5;->this$0:Lorg/apache/cordova/DroidGap;

    iget-object v3, v3, Lorg/apache/cordova/DroidGap;->splashDialog:Landroid/app/Dialog;

    invoke-virtual {v3, v2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 993
    iget-object v3, p0, Lorg/apache/cordova/DroidGap$5;->this$0:Lorg/apache/cordova/DroidGap;

    iget-object v3, v3, Lorg/apache/cordova/DroidGap;->splashDialog:Landroid/app/Dialog;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 994
    iget-object v3, p0, Lorg/apache/cordova/DroidGap$5;->this$0:Lorg/apache/cordova/DroidGap;

    iget-object v3, v3, Lorg/apache/cordova/DroidGap;->splashDialog:Landroid/app/Dialog;

    invoke-virtual {v3}, Landroid/app/Dialog;->show()V

    .line 997
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 998
    .local v1, "handler":Landroid/os/Handler;
    new-instance v3, Lorg/apache/cordova/DroidGap$5$1;

    invoke-direct {v3, p0}, Lorg/apache/cordova/DroidGap$5$1;-><init>(Lorg/apache/cordova/DroidGap$5;)V

    iget v4, p0, Lorg/apache/cordova/DroidGap$5;->val$time:I

    int-to-long v4, v4

    invoke-virtual {v1, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1003
    return-void
.end method
