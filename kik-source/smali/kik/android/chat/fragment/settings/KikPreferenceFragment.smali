.class public Lkik/android/chat/fragment/settings/KikPreferenceFragment;
.super Lkik/android/chat/fragment/settings/PreferenceFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/fragment/settings/KikPreferenceFragment$a;
    }
.end annotation


# instance fields
.field private a:Lcom/kik/g/f;

.field private b:Lcom/kik/g/i;

.field f:Lkik/android/chat/a/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected g:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected h:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;-><init>()V

    .line 30
    new-instance v0, Lkik/android/chat/fragment/settings/a;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/settings/a;-><init>(Lkik/android/chat/fragment/settings/KikPreferenceFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/settings/KikPreferenceFragment;->b:Lcom/kik/g/i;

    .line 141
    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/settings/KikPreferenceFragment;)V
    .locals 0

    .prologue
    .line 25
    invoke-virtual {p0}, Lkik/android/chat/fragment/settings/KikPreferenceFragment;->a()V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 0

    .prologue
    .line 133
    return-void
.end method

.method protected final a(Landroid/preference/PreferenceScreen;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 95
    invoke-super {p0, p1}, Lkik/android/chat/fragment/settings/PreferenceFragment;->a(Landroid/preference/PreferenceScreen;)V

    .line 96
    if-nez p1, :cond_1

    .line 123
    :cond_0
    :goto_0
    return-void

    .line 100
    :cond_1
    const-string v0, "kik.tell.sms"

    invoke-virtual {p1, v0}, Landroid/preference/PreferenceScreen;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v2

    .line 101
    const-string v0, "kik.tell.email"

    invoke-virtual {p1, v0}, Landroid/preference/PreferenceScreen;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lkik/android/widget/preferences/ShareEmailPreference;

    .line 103
    if-eqz v0, :cond_3

    new-instance v3, Landroid/content/Intent;

    const-string v4, "android.intent.action.SEND"

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v4, "plain/text"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0}, Lkik/android/widget/preferences/ShareEmailPreference;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {v4, v3, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    const/4 v1, 0x1

    :cond_2
    if-nez v1, :cond_3

    .line 104
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceScreen;->removePreference(Landroid/preference/Preference;)Z

    .line 106
    :cond_3
    const-string v0, "kik.enterbutton.sends"

    invoke-virtual {p1, v0}, Landroid/preference/PreferenceScreen;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    check-cast v0, Lkik/android/widget/preferences/EnterKeySendPreference;

    .line 107
    if-eqz v0, :cond_4

    .line 108
    iget-object v1, p0, Lkik/android/chat/fragment/settings/KikPreferenceFragment;->f:Lkik/android/chat/a/a;

    invoke-virtual {v0, v1}, Lkik/android/widget/preferences/EnterKeySendPreference;->a(Lkik/android/chat/a/a;)V

    .line 111
    :cond_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_5

    if-eqz v2, :cond_5

    .line 113
    invoke-virtual {p1, v2}, Landroid/preference/PreferenceScreen;->removePreference(Landroid/preference/Preference;)Z

    .line 117
    :cond_5
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 118
    const-string v0, "kik.abtests"

    invoke-virtual {p1, v0}, Landroid/preference/PreferenceScreen;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 119
    if-eqz v0, :cond_0

    .line 120
    invoke-virtual {p1, v0}, Landroid/preference/PreferenceScreen;->removePreference(Landroid/preference/Preference;)Z

    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 52
    invoke-virtual {p0}, Lkik/android/chat/fragment/settings/KikPreferenceFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/settings/KikPreferenceFragment;)V

    .line 53
    invoke-super {p0, p1}, Lkik/android/chat/fragment/settings/PreferenceFragment;->onCreate(Landroid/os/Bundle;)V

    .line 55
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/settings/KikPreferenceFragment;->a:Lcom/kik/g/f;

    .line 56
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 61
    iget-object v0, p0, Lkik/android/chat/fragment/settings/KikPreferenceFragment;->a:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/chat/fragment/settings/KikPreferenceFragment;->g:Lkik/a/e/w;

    invoke-interface {v1}, Lkik/a/e/w;->a()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/settings/KikPreferenceFragment;->b:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 63
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/settings/PreferenceFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v1

    .line 64
    const v0, 0x102000a

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    .line 67
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 68
    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setFooterDividersEnabled(Z)V

    .line 69
    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setHeaderDividersEnabled(Z)V

    .line 71
    return-object v1
.end method

.method public onDestroyView()V
    .locals 1

    .prologue
    .line 82
    invoke-super {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->onDestroyView()V

    .line 83
    iget-object v0, p0, Lkik/android/chat/fragment/settings/KikPreferenceFragment;->a:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 84
    return-void
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 128
    invoke-super {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->onPause()V

    .line 129
    return-void
.end method

.method public onResume()V
    .locals 0

    .prologue
    .line 138
    invoke-super {p0}, Lkik/android/chat/fragment/settings/PreferenceFragment;->onResume()V

    .line 139
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 89
    invoke-super {p0, p1}, Lkik/android/chat/fragment/settings/PreferenceFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 90
    return-void
.end method
