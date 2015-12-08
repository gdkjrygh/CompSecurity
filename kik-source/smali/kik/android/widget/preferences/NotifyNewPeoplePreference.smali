.class public Lkik/android/widget/preferences/NotifyNewPeoplePreference;
.super Lkik/android/widget/preferences/KikCheckBoxPreference;
.source "SourceFile"


# instance fields
.field protected b:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 35
    const v0, 0x101008f

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 40
    sget-object v0, Lcom/kik/d/b/a$c;->e:Lcom/kik/d/b/a$c;

    invoke-direct {p0, p1, p2, p3, v0}, Lkik/android/widget/preferences/KikCheckBoxPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V

    .line 41
    return-void
.end method

.method static synthetic a(Lkik/android/widget/preferences/NotifyNewPeoplePreference;)V
    .locals 0

    .prologue
    .line 29
    invoke-virtual {p0}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->notifyChanged()V

    return-void
.end method

.method static synthetic a(Lkik/android/widget/preferences/NotifyNewPeoplePreference;Z)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->b(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 3

    .prologue
    .line 59
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->setEnabled(Z)V

    .line 61
    iget-object v0, p0, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->b:Lkik/a/e/w;

    invoke-interface {v0, p1}, Lkik/a/e/w;->a(Z)Lcom/kik/g/p;

    move-result-object v0

    .line 63
    invoke-virtual {p0}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v1

    new-instance v2, Lkik/android/widget/preferences/au;

    invoke-direct {v2, p0, p1}, Lkik/android/widget/preferences/au;-><init>(Lkik/android/widget/preferences/NotifyNewPeoplePreference;Z)V

    invoke-static {v1, v2}, Lcom/kik/sdkutils/d;->a(Landroid/support/v4/app/Fragment;Lcom/kik/g/r;)Lcom/kik/g/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 89
    new-instance v1, Lkik/android/widget/preferences/av;

    invoke-direct {v1, p0}, Lkik/android/widget/preferences/av;-><init>(Lkik/android/widget/preferences/NotifyNewPeoplePreference;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 96
    return-void
.end method


# virtual methods
.method public final a(Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 46
    invoke-interface {p1, p0}, Lcom/kik/e/a;->a(Lkik/android/widget/preferences/NotifyNewPeoplePreference;)V

    .line 47
    return-void
.end method

.method protected onCreateView(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .prologue
    .line 52
    invoke-super {p0, p1}, Lkik/android/widget/preferences/KikCheckBoxPreference;->onCreateView(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 53
    iget-object v1, p0, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->b:Lkik/a/e/w;

    invoke-interface {v1}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v1

    iget-object v1, v1, Lkik/a/d/aa;->h:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p0, v1}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->setChecked(Z)V

    .line 54
    return-object v0
.end method

.method public onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 102
    move-object v0, p1

    check-cast v0, Lkik/android/widget/preferences/KikCheckBoxPreference;

    .line 103
    invoke-virtual {v0}, Lkik/android/widget/preferences/KikCheckBoxPreference;->isChecked()Z

    move-result v0

    .line 105
    if-eqz v0, :cond_0

    .line 107
    new-instance v1, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {p0}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v1, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    .line 108
    const v3, 0x7f09002a

    invoke-virtual {v1, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v3

    const v4, 0x7f0902b2

    invoke-virtual {v3, v4}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(I)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v3

    invoke-virtual {v3, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(Z)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v3

    const v4, 0x7f090299

    new-instance v5, Lkik/android/widget/preferences/ay;

    invoke-direct {v5, p0}, Lkik/android/widget/preferences/ay;-><init>(Lkik/android/widget/preferences/NotifyNewPeoplePreference;)V

    invoke-virtual {v3, v4, v5}, Lkik/android/chat/fragment/KikDialogFragment$a;->b(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v3

    const v4, 0x7f0902b1

    new-instance v5, Lkik/android/widget/preferences/ax;

    invoke-direct {v5, p0, v0}, Lkik/android/widget/preferences/ax;-><init>(Lkik/android/widget/preferences/NotifyNewPeoplePreference;Z)V

    invoke-virtual {v3, v4, v5}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(ILandroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    move-result-object v0

    new-instance v3, Lkik/android/widget/preferences/aw;

    invoke-direct {v3, p0, p1}, Lkik/android/widget/preferences/aw;-><init>(Lkik/android/widget/preferences/NotifyNewPeoplePreference;Landroid/preference/Preference;)V

    invoke-virtual {v0, v3}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Lkik/android/chat/fragment/KikDialogFragment$c;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 129
    invoke-virtual {p0}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v0

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a()Lkik/android/chat/fragment/KikDialogFragment;

    move-result-object v1

    sget-object v3, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v4, "notifyNew"

    invoke-virtual {v0, v1, v3, v4}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    .line 137
    :goto_0
    return v2

    .line 134
    :cond_0
    if-nez v0, :cond_1

    move v0, v1

    :goto_1
    invoke-direct {p0, v0}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->b(Z)V

    move v2, v1

    .line 137
    goto :goto_0

    :cond_1
    move v0, v2

    .line 134
    goto :goto_1
.end method
