.class public Lkik/android/widget/preferences/BlockListPreference;
.super Lkik/android/widget/preferences/KikPreference;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 20
    sget-object v0, Lcom/kik/d/b/a$c;->n:Lcom/kik/d/b/a$c;

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/preferences/KikPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/kik/d/b/a$c;)V

    .line 21
    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 2

    .prologue
    .line 26
    invoke-virtual {p0}, Lkik/android/widget/preferences/BlockListPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v1

    .line 27
    instance-of v0, v1, Lkik/android/chat/fragment/settings/d;

    if-eqz v0, :cond_0

    move-object v0, v1

    .line 28
    check-cast v0, Lkik/android/chat/fragment/settings/d;

    invoke-interface {v0}, Lkik/android/chat/fragment/settings/d;->b()V

    .line 30
    :cond_0
    new-instance v0, Lkik/android/chat/fragment/KikBlockedContactsFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikBlockedContactsFragment$a;-><init>()V

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/util/an;)Lcom/kik/g/p;

    .line 31
    const/4 v0, 0x0

    return v0
.end method
