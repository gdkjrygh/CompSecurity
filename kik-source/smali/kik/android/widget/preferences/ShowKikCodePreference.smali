.class public Lkik/android/widget/preferences/ShowKikCodePreference;
.super Lkik/android/widget/preferences/KikPreference;
.source "SourceFile"


# instance fields
.field b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/preferences/KikPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/kik/d/b/a$c;)V

    .line 30
    iput-object p1, p0, Lkik/android/widget/preferences/ShowKikCodePreference;->b:Landroid/content/Context;

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lkik/android/widget/preferences/KikPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V

    .line 24
    iput-object p1, p0, Lkik/android/widget/preferences/ShowKikCodePreference;->b:Landroid/content/Context;

    .line 25
    return-void
.end method


# virtual methods
.method public final a(Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 36
    invoke-interface {p1, p0}, Lcom/kik/e/a;->a(Lkik/android/widget/preferences/ShowKikCodePreference;)V

    .line 37
    return-void
.end method

.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 42
    new-instance v0, Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;-><init>()V

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->a(Z)Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    move-result-object v0

    sget-object v1, Lkik/android/chat/fragment/ScanCodeTabFragment$c;->b:Lkik/android/chat/fragment/ScanCodeTabFragment$c;

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ScanCodeTabFragment$a;->a(Lkik/android/chat/fragment/ScanCodeTabFragment$c;)Lkik/android/chat/fragment/ScanCodeTabFragment$a;

    move-result-object v0

    iget-object v1, p0, Lkik/android/widget/preferences/ShowKikCodePreference;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 46
    return v2
.end method
