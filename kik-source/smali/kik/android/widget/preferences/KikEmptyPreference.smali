.class public Lkik/android/widget/preferences/KikEmptyPreference;
.super Landroid/preference/Preference;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 13
    invoke-direct {p0, p1, p2}, Landroid/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    const v0, 0x7f030087

    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/KikEmptyPreference;->setLayoutResource(I)V

    .line 16
    invoke-virtual {p0, v1}, Lkik/android/widget/preferences/KikEmptyPreference;->setEnabled(Z)V

    .line 17
    invoke-virtual {p0, v1}, Lkik/android/widget/preferences/KikEmptyPreference;->setSelectable(Z)V

    .line 18
    return-void
.end method
