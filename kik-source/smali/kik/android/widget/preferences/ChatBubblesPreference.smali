.class public Lkik/android/widget/preferences/ChatBubblesPreference;
.super Lkik/android/widget/preferences/KikPreference;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 20
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/preferences/KikPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/kik/d/b/a$c;)V

    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lkik/android/widget/preferences/KikPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V

    .line 26
    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 2

    .prologue
    .line 31
    invoke-virtual {p0}, Lkik/android/widget/preferences/ChatBubblesPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v0

    .line 32
    instance-of v1, v0, Lkik/android/chat/fragment/settings/d;

    if-eqz v1, :cond_0

    .line 33
    check-cast v0, Lkik/android/chat/fragment/settings/d;

    invoke-interface {v0}, Lkik/android/chat/fragment/settings/d;->b()V

    .line 35
    :cond_0
    new-instance v0, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$b;

    invoke-direct {v0}, Lkik/android/chat/fragment/ChatBubbleSelectionFragment$b;-><init>()V

    invoke-virtual {p0}, Lkik/android/widget/preferences/ChatBubblesPreference;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 36
    const/4 v0, 0x0

    return v0
.end method
