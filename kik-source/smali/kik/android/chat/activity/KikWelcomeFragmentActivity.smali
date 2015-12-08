.class public Lkik/android/chat/activity/KikWelcomeFragmentActivity;
.super Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 23
    invoke-virtual {p0}, Lkik/android/chat/activity/KikWelcomeFragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    invoke-virtual {p0}, Lkik/android/chat/activity/KikWelcomeFragmentActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "SimpleFragmentWrapperActivity.fragmentlaunchclass"

    const-class v2, Lkik/android/chat/fragment/KikWelcomeFragment;

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 27
    :cond_0
    invoke-super {p0, p1}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->onCreate(Landroid/os/Bundle;)V

    .line 28
    return-void
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 41
    invoke-super {p0}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->onPause()V

    .line 43
    invoke-virtual {p0}, Lkik/android/chat/activity/KikWelcomeFragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    invoke-virtual {v0, p0}, Lkik/android/chat/KikApplication;->c(Landroid/app/Activity;)V

    .line 44
    return-void
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 33
    invoke-super {p0}, Lkik/android/chat/fragment/SimpleFragmentWrapperActivity;->onResume()V

    .line 35
    invoke-virtual {p0}, Lkik/android/chat/activity/KikWelcomeFragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    invoke-virtual {v0, p0}, Lkik/android/chat/KikApplication;->d(Landroid/app/Activity;)V

    .line 36
    return-void
.end method
