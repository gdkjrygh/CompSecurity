.class public Lkik/android/widget/preferences/NotifySoundPreference;
.super Lkik/android/widget/preferences/KikCheckBoxPreference;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 16
    const v0, 0x101008f

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/preferences/NotifySoundPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 21
    sget-object v0, Lcom/kik/d/b/a$c;->b:Lcom/kik/d/b/a$c;

    invoke-direct {p0, p1, p2, p3, v0}, Lkik/android/widget/preferences/KikCheckBoxPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V

    .line 22
    return-void
.end method


# virtual methods
.method public onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x1

    return v0
.end method
