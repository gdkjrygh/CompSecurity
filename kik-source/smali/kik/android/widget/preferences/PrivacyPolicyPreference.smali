.class public Lkik/android/widget/preferences/PrivacyPolicyPreference;
.super Lkik/android/widget/preferences/KikModalPreference;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 24
    sget-object v0, Lcom/kik/d/b/a$c;->u:Lcom/kik/d/b/a$c;

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/preferences/KikModalPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/kik/d/b/a$c;)V

    .line 25
    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 9

    .prologue
    const/4 v8, 0x1

    .line 30
    invoke-virtual {p0}, Lkik/android/widget/preferences/PrivacyPolicyPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v1

    .line 31
    instance-of v0, v1, Lkik/android/chat/fragment/settings/d;

    if-eqz v0, :cond_0

    move-object v0, v1

    .line 32
    check-cast v0, Lkik/android/chat/fragment/settings/d;

    invoke-interface {v0}, Lkik/android/chat/fragment/settings/d;->b()V

    .line 34
    :cond_0
    new-instance v0, Lkik/android/util/bg;

    invoke-virtual {p0}, Lkik/android/widget/preferences/PrivacyPolicyPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v2

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v0, v2}, Lkik/android/util/bg;-><init>(Landroid/content/Context;)V

    .line 35
    invoke-virtual {v0}, Lkik/android/util/bg;->a()Ljava/lang/String;

    move-result-object v0

    .line 36
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-virtual {p0}, Lkik/android/widget/preferences/PrivacyPolicyPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v4

    invoke-virtual {v4}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f090362

    new-array v6, v8, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    invoke-virtual {v4, v5, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 38
    invoke-virtual {v1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    .line 40
    return v8
.end method
