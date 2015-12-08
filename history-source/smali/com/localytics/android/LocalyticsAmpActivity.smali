.class public Lcom/localytics/android/LocalyticsAmpActivity;
.super Landroid/support/v4/app/FragmentActivity;
.source "LocalyticsAmpActivity.java"


# instance fields
.field protected mLocalyticsSession:Lcom/localytics/android/LocalyticsAmpSession;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 18
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 19
    new-instance v0, Lcom/localytics/android/LocalyticsAmpSession;

    invoke-direct {v0, p0}, Lcom/localytics/android/LocalyticsAmpSession;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/localytics/android/LocalyticsAmpActivity;->mLocalyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    .line 20
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpActivity;->mLocalyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->open()V

    .line 21
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpActivity;->mLocalyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {p0}, Lcom/localytics/android/LocalyticsAmpActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/LocalyticsAmpSession;->handleIntent(Landroid/content/Intent;)V

    .line 22
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpActivity;->mLocalyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {p0}, Lcom/localytics/android/LocalyticsAmpActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/LocalyticsAmpSession;->handleNotificationReceived(Landroid/content/Intent;)V

    .line 23
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpActivity;->mLocalyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {p0}, Lcom/localytics/android/LocalyticsAmpActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/LocalyticsAmpSession;->handlePushReceived(Landroid/content/Intent;)V

    .line 24
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpActivity;->mLocalyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->upload()V

    .line 25
    return-void
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpActivity;->mLocalyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->detach()V

    .line 43
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpActivity;->mLocalyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->close()V

    .line 44
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpActivity;->mLocalyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->upload()V

    .line 45
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onPause()V

    .line 46
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 30
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onResume()V

    .line 31
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpActivity;->mLocalyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->open()V

    .line 32
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpActivity;->mLocalyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {p0}, Lcom/localytics/android/LocalyticsAmpActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/LocalyticsAmpSession;->handleIntent(Landroid/content/Intent;)V

    .line 33
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpActivity;->mLocalyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {p0}, Lcom/localytics/android/LocalyticsAmpActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/LocalyticsAmpSession;->handleNotificationReceived(Landroid/content/Intent;)V

    .line 34
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpActivity;->mLocalyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {p0}, Lcom/localytics/android/LocalyticsAmpActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/localytics/android/LocalyticsAmpSession;->handlePushReceived(Landroid/content/Intent;)V

    .line 35
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpActivity;->mLocalyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0}, Lcom/localytics/android/LocalyticsAmpSession;->upload()V

    .line 36
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpActivity;->mLocalyticsSession:Lcom/localytics/android/LocalyticsAmpSession;

    invoke-virtual {v0, p0}, Lcom/localytics/android/LocalyticsAmpSession;->attach(Landroid/support/v4/app/FragmentActivity;)V

    .line 37
    return-void
.end method
