.class public Lkik/android/widget/preferences/MatchingPreference;
.super Lkik/android/widget/preferences/KikPreference;
.source "SourceFile"


# instance fields
.field protected b:Lkik/a/e/b;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 28
    sget-object v0, Lcom/kik/d/b/a$c;->m:Lcom/kik/d/b/a$c;

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/preferences/KikPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/kik/d/b/a$c;)V

    .line 29
    return-void
.end method


# virtual methods
.method public final a(Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 34
    invoke-interface {p1, p0}, Lcom/kik/e/a;->a(Lkik/android/widget/preferences/MatchingPreference;)V

    .line 35
    return-void
.end method

.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 4

    .prologue
    .line 40
    new-instance v0, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {p0}, Lkik/android/widget/preferences/MatchingPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    .line 42
    const v1, 0x7f0901c5

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f0901c7

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f090326

    new-instance v3, Lkik/android/widget/preferences/ap;

    invoke-direct {v3, p0}, Lkik/android/widget/preferences/ap;-><init>(Lkik/android/widget/preferences/MatchingPreference;)V

    invoke-virtual {v1, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    const v2, 0x7f0901c6

    new-instance v3, Lkik/android/widget/preferences/ao;

    invoke-direct {v3, p0}, Lkik/android/widget/preferences/ao;-><init>(Lkik/android/widget/preferences/MatchingPreference;)V

    invoke-virtual {v1, v2, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v1

    new-instance v2, Lkik/android/widget/preferences/an;

    invoke-direct {v2, p0, p1}, Lkik/android/widget/preferences/an;-><init>(Lkik/android/widget/preferences/MatchingPreference;Landroid/preference/Preference;)V

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Lkik/android/chat/fragment/KikDialogFragment$c;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 68
    invoke-virtual {p0}, Lkik/android/widget/preferences/MatchingPreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v1

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a()Lkik/android/chat/fragment/KikDialogFragment;

    move-result-object v0

    sget-object v2, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v3, "matching"

    invoke-virtual {v1, v0, v2, v3}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    .line 70
    const/4 v0, 0x0

    return v0
.end method
