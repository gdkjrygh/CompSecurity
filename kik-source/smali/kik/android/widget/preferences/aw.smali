.class final Lkik/android/widget/preferences/aw;
.super Lkik/android/chat/fragment/KikDialogFragment$c;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/preference/Preference;

.field final synthetic b:Lkik/android/widget/preferences/NotifyNewPeoplePreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/NotifyNewPeoplePreference;Landroid/preference/Preference;)V
    .locals 0

    .prologue
    .line 121
    iput-object p1, p0, Lkik/android/widget/preferences/aw;->b:Lkik/android/widget/preferences/NotifyNewPeoplePreference;

    iput-object p2, p0, Lkik/android/widget/preferences/aw;->a:Landroid/preference/Preference;

    invoke-direct {p0}, Lkik/android/chat/fragment/KikDialogFragment$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 125
    iget-object v0, p0, Lkik/android/widget/preferences/aw;->b:Lkik/android/widget/preferences/NotifyNewPeoplePreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/NotifyNewPeoplePreference;->d()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/preferences/aw;->a:Landroid/preference/Preference;

    invoke-static {v0, v1}, Lkik/android/widget/preferences/KikPreference;->a(Landroid/view/View;Landroid/preference/Preference;)V

    .line 126
    return-void
.end method
