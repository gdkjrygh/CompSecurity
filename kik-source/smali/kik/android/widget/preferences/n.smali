.class final Lkik/android/widget/preferences/n;
.super Lkik/android/chat/fragment/KikDialogFragment$c;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/widget/preferences/m;


# direct methods
.method constructor <init>(Lkik/android/widget/preferences/m;)V
    .locals 0

    .prologue
    .line 153
    iput-object p1, p0, Lkik/android/widget/preferences/n;->a:Lkik/android/widget/preferences/m;

    invoke-direct {p0}, Lkik/android/chat/fragment/KikDialogFragment$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 157
    iget-object v0, p0, Lkik/android/widget/preferences/n;->a:Lkik/android/widget/preferences/m;

    iget-object v0, v0, Lkik/android/widget/preferences/m;->b:Landroid/view/View;

    iget-object v1, p0, Lkik/android/widget/preferences/n;->a:Lkik/android/widget/preferences/m;

    iget-object v1, v1, Lkik/android/widget/preferences/m;->c:Landroid/preference/Preference;

    invoke-static {v0, v1}, Lkik/android/widget/preferences/KikPreference;->a(Landroid/view/View;Landroid/preference/Preference;)V

    .line 158
    return-void
.end method
