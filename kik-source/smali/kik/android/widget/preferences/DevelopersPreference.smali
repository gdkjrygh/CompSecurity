.class public Lkik/android/widget/preferences/DevelopersPreference;
.super Lkik/android/widget/preferences/KikPreferenceScreen;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 17
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/preferences/KikPreferenceScreen;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/kik/d/b/a$c;)V

    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lkik/android/widget/preferences/KikPreferenceScreen;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V

    .line 23
    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 2

    .prologue
    .line 27
    invoke-virtual {p0}, Lkik/android/widget/preferences/DevelopersPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v0

    .line 28
    instance-of v1, v0, Lkik/android/chat/fragment/settings/d;

    if-eqz v1, :cond_0

    .line 29
    check-cast v0, Lkik/android/chat/fragment/settings/d;

    invoke-interface {v0}, Lkik/android/chat/fragment/settings/d;->b()V

    .line 31
    :cond_0
    invoke-super {p0, p1}, Lkik/android/widget/preferences/KikPreferenceScreen;->onPreferenceClick(Landroid/preference/Preference;)Z

    move-result v0

    return v0
.end method
