.class public Lkik/android/chat/fragment/settings/PreferenceFragment$a;
.super Lkik/android/util/an;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/settings/PreferenceFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 534
    invoke-direct {p0}, Lkik/android/util/an;-><init>()V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/settings/PreferenceFragment$a;)I
    .locals 2

    .prologue
    .line 534
    const-string v0, "PreferenceFragment.PREFERENCE_LIST_XML_ID"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/settings/PreferenceFragment$a;->b(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method


# virtual methods
.method public final a()Lkik/android/chat/fragment/settings/PreferenceFragment$a;
    .locals 2

    .prologue
    .line 555
    const-string v0, "PreferenceFragment.PREFERENCE_TOPBAR_ICON"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/settings/PreferenceFragment$a;->a(Ljava/lang/String;I)V

    .line 556
    return-object p0
.end method

.method public final a(I)Lkik/android/chat/fragment/settings/PreferenceFragment$a;
    .locals 1

    .prologue
    .line 544
    const-string v0, "PreferenceFragment.PREFERENCE_LIST_XML_ID"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/settings/PreferenceFragment$a;->a(Ljava/lang/String;I)V

    .line 545
    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lkik/android/chat/fragment/settings/PreferenceFragment$a;
    .locals 1

    .prologue
    .line 577
    const-string v0, "PreferenceFragment.PREFERENCE_CALLOUT_SHOWN"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/settings/PreferenceFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 578
    return-object p0
.end method

.method public final b()I
    .locals 2

    .prologue
    .line 572
    const-string v0, "PreferenceFragment.PREFERENCE_BACK_BUTTON"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/settings/PreferenceFragment$a;->b(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final b(I)Lkik/android/chat/fragment/settings/PreferenceFragment$a;
    .locals 1

    .prologue
    .line 566
    const-string v0, "PreferenceFragment.PREFERENCE_BACK_BUTTON"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/settings/PreferenceFragment$a;->a(Ljava/lang/String;I)V

    .line 567
    return-object p0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 583
    const-string v0, "PreferenceFragment.PREFERENCE_CALLOUT_SHOWN"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/settings/PreferenceFragment$a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 584
    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public final d()Lkik/android/chat/fragment/settings/PreferenceFragment$a;
    .locals 2

    .prologue
    .line 589
    const-string v0, "PreferenceFragment.PREFERENCE_SHOW_SHADOW"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/settings/PreferenceFragment$a;->a(Ljava/lang/String;Z)V

    .line 590
    return-object p0
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 595
    const-string v0, "PreferenceFragment.PREFERENCE_SHOW_SHADOW"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/settings/PreferenceFragment$a;->f(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
