.class Lroboguice/activity/RoboSplashActivity$1;
.super Ljava/lang/Object;
.source "RoboSplashActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lroboguice/activity/RoboSplashActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lroboguice/activity/RoboSplashActivity;

.field final synthetic val$start:J


# direct methods
.method constructor <init>(Lroboguice/activity/RoboSplashActivity;J)V
    .locals 0

    .prologue
    .line 31
    iput-object p1, p0, Lroboguice/activity/RoboSplashActivity$1;->this$0:Lroboguice/activity/RoboSplashActivity;

    iput-wide p2, p0, Lroboguice/activity/RoboSplashActivity$1;->val$start:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    .line 36
    iget-object v4, p0, Lroboguice/activity/RoboSplashActivity$1;->this$0:Lroboguice/activity/RoboSplashActivity;

    invoke-virtual {v4}, Lroboguice/activity/RoboSplashActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    .line 37
    .local v0, "app":Landroid/app/Application;
    iget-object v4, p0, Lroboguice/activity/RoboSplashActivity$1;->this$0:Lroboguice/activity/RoboSplashActivity;

    invoke-virtual {v4}, Lroboguice/activity/RoboSplashActivity;->getApplication()Landroid/app/Application;

    move-result-object v4

    invoke-static {v4}, Lroboguice/RoboGuice;->getBaseApplicationInjector(Landroid/app/Application;)Lcom/google/inject/Injector;

    .line 40
    iget-object v4, p0, Lroboguice/activity/RoboSplashActivity$1;->this$0:Lroboguice/activity/RoboSplashActivity;

    invoke-virtual {v4, v0}, Lroboguice/activity/RoboSplashActivity;->doStuffInBackground(Landroid/app/Application;)V

    .line 43
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lroboguice/activity/RoboSplashActivity$1;->val$start:J

    sub-long v1, v4, v6

    .line 44
    .local v1, "duration":J
    iget-object v4, p0, Lroboguice/activity/RoboSplashActivity$1;->this$0:Lroboguice/activity/RoboSplashActivity;

    iget v4, v4, Lroboguice/activity/RoboSplashActivity;->minDisplayMs:I

    int-to-long v4, v4

    cmp-long v4, v1, v4

    if-gez v4, :cond_0

    .line 46
    :try_start_0
    iget-object v4, p0, Lroboguice/activity/RoboSplashActivity$1;->this$0:Lroboguice/activity/RoboSplashActivity;

    iget v4, v4, Lroboguice/activity/RoboSplashActivity;->minDisplayMs:I

    int-to-long v4, v4

    sub-long/2addr v4, v1

    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    :cond_0
    :goto_0
    iget-object v4, p0, Lroboguice/activity/RoboSplashActivity$1;->this$0:Lroboguice/activity/RoboSplashActivity;

    invoke-virtual {v4}, Lroboguice/activity/RoboSplashActivity;->startNextActivity()V

    .line 53
    iget-object v4, p0, Lroboguice/activity/RoboSplashActivity$1;->this$0:Lroboguice/activity/RoboSplashActivity;

    invoke-virtual {v4}, Lroboguice/activity/RoboSplashActivity;->andFinishThisOne()V

    .line 55
    return-void

    .line 47
    :catch_0
    move-exception v3

    .line 48
    .local v3, "e":Ljava/lang/InterruptedException;
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    goto :goto_0
.end method
