.class final Lkik/android/widget/preferences/bq;
.super Lkik/android/chat/fragment/KikDialogFragment$c;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/preference/Preference;

.field final synthetic b:Lkik/android/widget/preferences/UsernamePreference;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/UsernamePreference;Landroid/preference/Preference;)V
    .locals 0

    .prologue
    .line 90
    iput-object p1, p0, Lkik/android/widget/preferences/bq;->b:Lkik/android/widget/preferences/UsernamePreference;

    iput-object p2, p0, Lkik/android/widget/preferences/bq;->a:Landroid/preference/Preference;

    invoke-direct {p0}, Lkik/android/chat/fragment/KikDialogFragment$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 93
    iget-object v0, p0, Lkik/android/widget/preferences/bq;->b:Lkik/android/widget/preferences/UsernamePreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/UsernamePreference;->c()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/preferences/bq;->a:Landroid/preference/Preference;

    invoke-static {v0, v1}, Lkik/android/widget/preferences/KikPreference;->a(Landroid/view/View;Landroid/preference/Preference;)V

    .line 94
    return-void
.end method
