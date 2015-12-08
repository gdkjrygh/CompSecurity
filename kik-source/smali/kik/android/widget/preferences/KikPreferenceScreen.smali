.class public Lkik/android/widget/preferences/KikPreferenceScreen;
.super Lkik/android/widget/preferences/KikPreference;
.source "SourceFile"


# instance fields
.field b:I

.field private c:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 36
    invoke-direct {p0, p1, p2, p3, p4}, Lkik/android/widget/preferences/KikPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V

    .line 18
    iput v2, p0, Lkik/android/widget/preferences/KikPreferenceScreen;->b:I

    .line 38
    const v0, 0x7f030086

    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/KikPreferenceScreen;->setLayoutResource(I)V

    .line 40
    sget-object v0, Lkik/android/ag$b;->l:[I

    invoke-virtual {p1, p2, v0, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 42
    invoke-virtual {v0, v2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lkik/android/widget/preferences/KikPreferenceScreen;->b:I

    .line 43
    const/4 v1, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lkik/android/widget/preferences/KikPreferenceScreen;->c:I

    .line 45
    const/4 v1, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    iput v1, p0, Lkik/android/widget/preferences/KikPreferenceScreen;->e:I

    .line 47
    sget-object v1, Lkik/android/ag$b;->k:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 49
    invoke-virtual {v1, v2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lkik/android/widget/preferences/KikPreferenceScreen;->d:I

    .line 51
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 52
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/kik/d/b/a$c;)V
    .locals 1

    .prologue
    .line 31
    const v0, 0x101008b

    invoke-direct {p0, p1, p2, v0, p3}, Lkik/android/widget/preferences/KikPreferenceScreen;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V

    .line 32
    return-void
.end method


# virtual methods
.method public final a(Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 26
    invoke-interface {p1, p0}, Lcom/kik/e/a;->a(Lkik/android/widget/preferences/KikPreferenceScreen;)V

    .line 27
    return-void
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 67
    iget v0, p0, Lkik/android/widget/preferences/KikPreferenceScreen;->b:I

    return v0
.end method

.method public final e()I
    .locals 1

    .prologue
    .line 80
    iget v0, p0, Lkik/android/widget/preferences/KikPreferenceScreen;->e:I

    return v0
.end method

.method protected onBindView(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 57
    invoke-super {p0, p1}, Lkik/android/widget/preferences/KikPreference;->onBindView(Landroid/view/View;)V

    .line 59
    iget v0, p0, Lkik/android/widget/preferences/KikPreferenceScreen;->d:I

    invoke-static {p1, v0}, Lkik/android/widget/preferences/KikPreference;->a(Landroid/view/View;I)V

    .line 60
    return-void
.end method

.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 2

    .prologue
    .line 86
    invoke-virtual {p0}, Lkik/android/widget/preferences/KikPreferenceScreen;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v0

    .line 87
    instance-of v1, v0, Lkik/android/chat/fragment/settings/d;

    if-eqz v1, :cond_0

    .line 88
    check-cast v0, Lkik/android/chat/fragment/settings/d;

    invoke-interface {v0}, Lkik/android/chat/fragment/settings/d;->b()V

    .line 90
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
