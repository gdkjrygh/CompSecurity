.class public Lkik/android/widget/preferences/HelpPreference;
.super Lkik/android/widget/preferences/KikModalPreference;
.source "SourceFile"


# instance fields
.field a:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lcom/kik/d/b/a$c;->r:Lcom/kik/d/b/a$c;

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/preferences/KikModalPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/kik/d/b/a$c;)V

    .line 27
    return-void
.end method


# virtual methods
.method public final a(Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 42
    invoke-interface {p1, p0}, Lcom/kik/e/a;->a(Lkik/android/widget/preferences/HelpPreference;)V

    .line 43
    return-void
.end method

.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 2

    .prologue
    .line 32
    invoke-virtual {p0}, Lkik/android/widget/preferences/HelpPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v0

    .line 33
    instance-of v1, v0, Lkik/android/chat/fragment/settings/d;

    if-eqz v1, :cond_0

    .line 34
    check-cast v0, Lkik/android/chat/fragment/settings/d;

    invoke-interface {v0}, Lkik/android/chat/fragment/settings/d;->b()V

    .line 36
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
