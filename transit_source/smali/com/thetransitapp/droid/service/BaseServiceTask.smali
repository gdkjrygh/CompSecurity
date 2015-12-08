.class public abstract Lcom/thetransitapp/droid/service/BaseServiceTask;
.super Lroboguice/util/RoboAsyncTask;
.source "BaseServiceTask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lroboguice/util/RoboAsyncTask",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private dialog:Landroid/app/ProgressDialog;

.field private plannerSource:Lcom/thetransitapp/droid/data/OnlinePlannerSource;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field private transitSource:Lcom/thetransitapp/droid/data/TransitSource;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 31
    .local p0, "this":Lcom/thetransitapp/droid/service/BaseServiceTask;, "Lcom/thetransitapp/droid/service/BaseServiceTask<TT;>;"
    const/4 v0, -0x1

    invoke-direct {p0, p1, v0}, Lcom/thetransitapp/droid/service/BaseServiceTask;-><init>(Landroid/content/Context;I)V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "messageId"    # I

    .prologue
    .line 35
    .local p0, "this":Lcom/thetransitapp/droid/service/BaseServiceTask;, "Lcom/thetransitapp/droid/service/BaseServiceTask<TT;>;"
    invoke-direct {p0, p1}, Lroboguice/util/RoboAsyncTask;-><init>(Landroid/content/Context;)V

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/thetransitapp/droid/service/BaseServiceTask;->dialog:Landroid/app/ProgressDialog;

    .line 37
    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 38
    new-instance v0, Landroid/app/ProgressDialog;

    iget-object v1, p0, Lcom/thetransitapp/droid/service/BaseServiceTask;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/thetransitapp/droid/service/BaseServiceTask;->dialog:Landroid/app/ProgressDialog;

    .line 39
    iget-object v0, p0, Lcom/thetransitapp/droid/service/BaseServiceTask;->dialog:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 40
    iget-object v0, p0, Lcom/thetransitapp/droid/service/BaseServiceTask;->dialog:Landroid/app/ProgressDialog;

    iget-object v1, p0, Lcom/thetransitapp/droid/service/BaseServiceTask;->context:Landroid/content/Context;

    invoke-virtual {v1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 42
    :cond_0
    return-void
.end method


# virtual methods
.method public getOnlineSource()Lcom/thetransitapp/droid/data/BaseOnlineSource;
    .locals 1

    .prologue
    .line 45
    .local p0, "this":Lcom/thetransitapp/droid/service/BaseServiceTask;, "Lcom/thetransitapp/droid/service/BaseServiceTask<TT;>;"
    iget-object v0, p0, Lcom/thetransitapp/droid/service/BaseServiceTask;->transitSource:Lcom/thetransitapp/droid/data/TransitSource;

    check-cast v0, Lcom/thetransitapp/droid/data/BaseOnlineSource;

    return-object v0
.end method

.method public getPlannerSource()Lcom/thetransitapp/droid/data/OnlinePlannerSource;
    .locals 1

    .prologue
    .line 26
    .local p0, "this":Lcom/thetransitapp/droid/service/BaseServiceTask;, "Lcom/thetransitapp/droid/service/BaseServiceTask<TT;>;"
    iget-object v0, p0, Lcom/thetransitapp/droid/service/BaseServiceTask;->plannerSource:Lcom/thetransitapp/droid/data/OnlinePlannerSource;

    return-object v0
.end method

.method public getTransitSource()Lcom/thetransitapp/droid/data/TransitSource;
    .locals 1

    .prologue
    .line 23
    .local p0, "this":Lcom/thetransitapp/droid/service/BaseServiceTask;, "Lcom/thetransitapp/droid/service/BaseServiceTask<TT;>;"
    iget-object v0, p0, Lcom/thetransitapp/droid/service/BaseServiceTask;->transitSource:Lcom/thetransitapp/droid/data/TransitSource;

    return-object v0
.end method

.method protected onException(Ljava/lang/Exception;)V
    .locals 4
    .param p1, "e"    # Ljava/lang/Exception;

    .prologue
    .line 57
    .local p0, "this":Lcom/thetransitapp/droid/service/BaseServiceTask;, "Lcom/thetransitapp/droid/service/BaseServiceTask<TT;>;"
    instance-of v1, p1, Lorg/apache/http/HttpException;

    if-eqz v1, :cond_0

    .line 58
    instance-of v1, p0, Lcom/thetransitapp/droid/service/RoutingTask;

    if-eqz v1, :cond_1

    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Last OnlinePlannerSource URL: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/thetransitapp/droid/service/BaseServiceTask;->plannerSource:Lcom/thetransitapp/droid/data/OnlinePlannerSource;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/data/OnlinePlannerSource;->getLastURL()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/crashlytics/android/Crashlytics;->log(Ljava/lang/String;)V

    .line 67
    :cond_0
    :goto_0
    invoke-static {p1}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 70
    iget-object v1, p0, Lcom/thetransitapp/droid/service/BaseServiceTask;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/thetransitapp/droid/service/BaseServiceTask;->context:Landroid/content/Context;

    const v3, 0x7f0a0077

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    .line 71
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 72
    return-void

    .line 60
    :cond_1
    iget-object v1, p0, Lcom/thetransitapp/droid/service/BaseServiceTask;->transitSource:Lcom/thetransitapp/droid/data/TransitSource;

    instance-of v1, v1, Lcom/thetransitapp/droid/data/OnlineTransitSource;

    if-eqz v1, :cond_0

    .line 61
    iget-object v0, p0, Lcom/thetransitapp/droid/service/BaseServiceTask;->transitSource:Lcom/thetransitapp/droid/data/TransitSource;

    check-cast v0, Lcom/thetransitapp/droid/data/OnlineTransitSource;

    .line 63
    .local v0, "source":Lcom/thetransitapp/droid/data/OnlineTransitSource;
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Last TransitSource URL: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/thetransitapp/droid/data/OnlineTransitSource;->getLastURL()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/crashlytics/android/Crashlytics;->log(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected onFinally()V
    .locals 1

    .prologue
    .line 76
    .local p0, "this":Lcom/thetransitapp/droid/service/BaseServiceTask;, "Lcom/thetransitapp/droid/service/BaseServiceTask<TT;>;"
    iget-object v0, p0, Lcom/thetransitapp/droid/service/BaseServiceTask;->dialog:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/thetransitapp/droid/service/BaseServiceTask;->dialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/thetransitapp/droid/service/BaseServiceTask;->dialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 79
    :cond_0
    return-void
.end method

.method protected onPreExecute()V
    .locals 1

    .prologue
    .line 50
    .local p0, "this":Lcom/thetransitapp/droid/service/BaseServiceTask;, "Lcom/thetransitapp/droid/service/BaseServiceTask<TT;>;"
    iget-object v0, p0, Lcom/thetransitapp/droid/service/BaseServiceTask;->dialog:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    .line 51
    iget-object v0, p0, Lcom/thetransitapp/droid/service/BaseServiceTask;->dialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 53
    :cond_0
    return-void
.end method
