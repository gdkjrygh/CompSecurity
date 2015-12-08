.class final Lkik/android/widget/preferences/ab;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field final synthetic a:Landroid/preference/Preference;


# direct methods
.method constructor <init>(Landroid/preference/Preference;)V
    .locals 0

    .prologue
    .line 239
    iput-object p1, p0, Lkik/android/widget/preferences/ab;->a:Landroid/preference/Preference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 249
    iget-object v0, p0, Lkik/android/widget/preferences/ab;->a:Landroid/preference/Preference;

    instance-of v0, v0, Lcom/kik/m/p;

    if-eqz v0, :cond_0

    .line 250
    iget-object v0, p0, Lkik/android/widget/preferences/ab;->a:Landroid/preference/Preference;

    check-cast v0, Lcom/kik/m/p;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/kik/m/p;->a(Z)V

    .line 253
    :cond_0
    iget-object v0, p0, Lkik/android/widget/preferences/ab;->a:Landroid/preference/Preference;

    instance-of v0, v0, Lkik/android/widget/preferences/KikEditTextPreference;

    if-eqz v0, :cond_2

    .line 254
    iget-object v0, p0, Lkik/android/widget/preferences/ab;->a:Landroid/preference/Preference;

    check-cast v0, Lkik/android/widget/preferences/KikEditTextPreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/KikEditTextPreference;->d()V

    .line 255
    iget-object v0, p0, Lkik/android/widget/preferences/ab;->a:Landroid/preference/Preference;

    check-cast v0, Lkik/android/widget/preferences/KikEditTextPreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/KikEditTextPreference;->e()V

    .line 264
    :cond_1
    :goto_0
    return-void

    .line 257
    :cond_2
    iget-object v0, p0, Lkik/android/widget/preferences/ab;->a:Landroid/preference/Preference;

    instance-of v0, v0, Lkik/android/widget/preferences/KikCheckBoxPreference;

    if-eqz v0, :cond_3

    .line 258
    iget-object v0, p0, Lkik/android/widget/preferences/ab;->a:Landroid/preference/Preference;

    check-cast v0, Lkik/android/widget/preferences/KikCheckBoxPreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/KikCheckBoxPreference;->e()V

    .line 259
    iget-object v0, p0, Lkik/android/widget/preferences/ab;->a:Landroid/preference/Preference;

    check-cast v0, Lkik/android/widget/preferences/KikCheckBoxPreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/KikCheckBoxPreference;->f()V

    goto :goto_0

    .line 261
    :cond_3
    iget-object v0, p0, Lkik/android/widget/preferences/ab;->a:Landroid/preference/Preference;

    instance-of v0, v0, Lkik/android/widget/preferences/KikListPreference;

    if-eqz v0, :cond_1

    .line 262
    iget-object v0, p0, Lkik/android/widget/preferences/ab;->a:Landroid/preference/Preference;

    check-cast v0, Lkik/android/widget/preferences/KikListPreference;

    invoke-virtual {v0}, Lkik/android/widget/preferences/KikListPreference;->b()V

    goto :goto_0
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 270
    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 244
    return-void
.end method
