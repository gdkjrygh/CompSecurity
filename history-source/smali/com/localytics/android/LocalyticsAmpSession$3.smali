.class Lcom/localytics/android/LocalyticsAmpSession$3;
.super Landroid/os/AsyncTask;
.source "LocalyticsAmpSession.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/localytics/android/LocalyticsAmpSession;->handleIntent(Landroid/content/Intent;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final pushRegID:Ljava/lang/String;

.field final synthetic this$0:Lcom/localytics/android/LocalyticsAmpSession;

.field final synthetic val$apiKey:Ljava/lang/String;

.field final synthetic val$campaign:Ljava/lang/String;

.field final synthetic val$creative:Ljava/lang/String;

.field final synthetic val$provider:Lcom/localytics/android/LocalyticsProvider;


# direct methods
.method constructor <init>(Lcom/localytics/android/LocalyticsAmpSession;Lcom/localytics/android/LocalyticsProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 423
    iput-object p1, p0, Lcom/localytics/android/LocalyticsAmpSession$3;->this$0:Lcom/localytics/android/LocalyticsAmpSession;

    iput-object p2, p0, Lcom/localytics/android/LocalyticsAmpSession$3;->val$provider:Lcom/localytics/android/LocalyticsProvider;

    iput-object p3, p0, Lcom/localytics/android/LocalyticsAmpSession$3;->val$apiKey:Ljava/lang/String;

    iput-object p4, p0, Lcom/localytics/android/LocalyticsAmpSession$3;->val$campaign:Ljava/lang/String;

    iput-object p5, p0, Lcom/localytics/android/LocalyticsAmpSession$3;->val$creative:Ljava/lang/String;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 424
    invoke-direct {p0}, Lcom/localytics/android/LocalyticsAmpSession$3;->getPushRegistrationID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/localytics/android/LocalyticsAmpSession$3;->pushRegID:Ljava/lang/String;

    return-void
.end method

.method private getPushRegistrationID()Ljava/lang/String;
    .locals 2

    .prologue
    .line 428
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpSession$3;->val$provider:Lcom/localytics/android/LocalyticsProvider;

    new-instance v1, Lcom/localytics/android/LocalyticsAmpSession$3$1;

    invoke-direct {v1, p0}, Lcom/localytics/android/LocalyticsAmpSession$3$1;-><init>(Lcom/localytics/android/LocalyticsAmpSession$3;)V

    invoke-virtual {v0, v1}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # [Ljava/lang/Object;

    .prologue
    .line 423
    check-cast p1, [Ljava/lang/Void;

    .end local p1    # "x0":[Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/localytics/android/LocalyticsAmpSession$3;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 2
    .param p1, "params"    # [Ljava/lang/Void;

    .prologue
    .line 477
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpSession$3;->val$provider:Lcom/localytics/android/LocalyticsProvider;

    new-instance v1, Lcom/localytics/android/LocalyticsAmpSession$3$2;

    invoke-direct {v1, p0}, Lcom/localytics/android/LocalyticsAmpSession$3$2;-><init>(Lcom/localytics/android/LocalyticsAmpSession$3;)V

    invoke-virtual {v0, v1}, Lcom/localytics/android/LocalyticsProvider;->runBatchTransaction(Ljava/lang/Runnable;)V

    .line 512
    const/4 v0, 0x0

    return-object v0
.end method

.method protected onPreExecute()V
    .locals 3

    .prologue
    .line 463
    iget-object v1, p0, Lcom/localytics/android/LocalyticsAmpSession$3;->pushRegID:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 465
    const-string v0, "Push Test Activated\nYou should receive a notification soon."

    .line 471
    .local v0, "message":Ljava/lang/String;
    :goto_0
    iget-object v1, p0, Lcom/localytics/android/LocalyticsAmpSession$3;->this$0:Lcom/localytics/android/LocalyticsAmpSession;

    iget-object v1, v1, Lcom/localytics/android/LocalyticsAmpSession;->mContext:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 472
    return-void

    .line 469
    .end local v0    # "message":Ljava/lang/String;
    :cond_0
    const-string v0, "App isn\'t registered with GCM to receive push notifications. Please make sure that this.localyticsSession.registerPush(<PROJECT_ID>) has been called."

    .restart local v0    # "message":Ljava/lang/String;
    goto :goto_0
.end method
