.class public Lcom/aetn/history/android/historyhere/view/AboutActivity;
.super Landroid/support/v4/app/FragmentActivity;
.source "AboutActivity.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "AboutActivity"


# instance fields
.field private app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

.field private localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

.field private versionText:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 29
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 30
    const v0, 0x7f030018

    invoke-virtual {p0, v0}, Lcom/aetn/history/android/historyhere/view/AboutActivity;->setContentView(I)V

    .line 32
    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/view/AboutActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/AboutActivity;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    .line 34
    const v0, 0x7f0a0052

    invoke-virtual {p0, v0}, Lcom/aetn/history/android/historyhere/view/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/AboutActivity;->versionText:Landroid/widget/TextView;

    .line 35
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/AboutActivity;->versionText:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "version "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/AboutActivity;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    iget-object v2, v2, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->currentAppVersionName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    new-instance v0, Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {p0}, Lcom/aetn/history/android/historyhere/view/AboutActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/view/AboutActivity;->app:Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getLocalyticsKey()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/localytics/android/LocalyticsAmpSession;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/view/AboutActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    .line 39
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/AboutActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->open()V

    .line 40
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/AboutActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    const-string v1, "HH:About"

    invoke-virtual {v0, v1}, Lcom/localytics/android/LocalyticsAmpSession;->tagScreen(Ljava/lang/String;)V

    .line 41
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/AboutActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->upload()V

    .line 44
    return-void
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/AboutActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    if-eqz v0, :cond_0

    .line 56
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/AboutActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->detach()V

    .line 57
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/AboutActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->close()V

    .line 58
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/AboutActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->upload()V

    .line 60
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onPause()V

    .line 61
    return-void
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 48
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onResume()V

    .line 49
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/AboutActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->open()V

    .line 50
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/AboutActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->upload()V

    .line 51
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/AboutActivity;->localyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0, p0}, Lcom/localytics/android/LocalyticsAmpSession;->attach(Landroid/support/v4/app/FragmentActivity;)V

    .line 52
    return-void
.end method
