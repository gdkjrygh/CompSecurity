.class public Lkik/android/widget/preferences/EnterKeySendPreference;
.super Lkik/android/widget/preferences/KikCheckBoxPreference;
.source "SourceFile"


# instance fields
.field private b:Lkik/android/chat/a/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 20
    const v0, 0x101008f

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/preferences/EnterKeySendPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lcom/kik/d/b/a$c;->p:Lcom/kik/d/b/a$c;

    invoke-direct {p0, p1, p2, p3, v0}, Lkik/android/widget/preferences/KikCheckBoxPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V

    .line 26
    return-void
.end method


# virtual methods
.method public final a(Lkik/android/chat/a/a;)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lkik/android/widget/preferences/EnterKeySendPreference;->b:Lkik/android/chat/a/a;

    .line 31
    return-void
.end method

.method public onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 36
    instance-of v0, p2, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/preferences/EnterKeySendPreference;->b:Lkik/android/chat/a/a;

    if-eqz v0, :cond_0

    .line 37
    iget-object v0, p0, Lkik/android/widget/preferences/EnterKeySendPreference;->b:Lkik/android/chat/a/a;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lkik/android/chat/a/a;->a(Z)V

    .line 39
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
