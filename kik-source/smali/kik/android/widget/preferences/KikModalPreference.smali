.class public abstract Lkik/android/widget/preferences/KikModalPreference;
.super Landroid/preference/Preference;
.source "SourceFile"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceClickListener;
.implements Lcom/kik/m/p;


# instance fields
.field private a:Ljava/lang/String;

.field protected b:Lkik/a/e/e;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private c:Lcom/kik/d/b/a$c;

.field private d:Lkik/android/chat/fragment/KikScopedDialogFragment;

.field private e:I

.field private f:Z

.field private g:Z

.field private h:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 58
    invoke-direct {p0, p1, p2, p3}, Landroid/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    iput-boolean v1, p0, Lkik/android/widget/preferences/KikModalPreference;->f:Z

    .line 33
    iput-boolean v1, p0, Lkik/android/widget/preferences/KikModalPreference;->g:Z

    .line 59
    const v0, 0x7f030088

    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/KikModalPreference;->setLayoutResource(I)V

    .line 61
    iput-object p4, p0, Lkik/android/widget/preferences/KikModalPreference;->c:Lcom/kik/d/b/a$c;

    .line 63
    sget-object v0, Lkik/android/ag$b;->k:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 65
    invoke-virtual {v0, v1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lkik/android/widget/preferences/KikModalPreference;->e:I

    .line 67
    new-instance v1, Lkik/android/widget/preferences/t;

    invoke-direct {v1, p0}, Lkik/android/widget/preferences/t;-><init>(Lkik/android/widget/preferences/KikModalPreference;)V

    invoke-virtual {p0, v1}, Lkik/android/widget/preferences/KikModalPreference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 74
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 75
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/kik/d/b/a$c;)V
    .locals 1

    .prologue
    .line 53
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lkik/android/widget/preferences/KikModalPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V

    .line 54
    return-void
.end method

.method static synthetic a(Lkik/android/widget/preferences/KikModalPreference;)Lcom/kik/d/b/a$c;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lkik/android/widget/preferences/KikModalPreference;->c:Lcom/kik/d/b/a$c;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 145
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/preferences/KikModalPreference;->g:Z

    .line 146
    return-void
.end method

.method public a(Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 48
    invoke-interface {p1, p0}, Lcom/kik/e/a;->a(Lkik/android/widget/preferences/KikModalPreference;)V

    .line 49
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikScopedDialogFragment;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lkik/android/widget/preferences/KikModalPreference;->d:Lkik/android/chat/fragment/KikScopedDialogFragment;

    .line 44
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 139
    iput-boolean p1, p0, Lkik/android/widget/preferences/KikModalPreference;->f:Z

    .line 140
    return-void
.end method

.method protected final b()Lkik/android/chat/fragment/KikScopedDialogFragment;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lkik/android/widget/preferences/KikModalPreference;->d:Lkik/android/chat/fragment/KikScopedDialogFragment;

    return-object v0
.end method

.method public final c()Landroid/view/View;
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Lkik/android/widget/preferences/KikModalPreference;->h:Landroid/view/View;

    return-object v0
.end method

.method protected onBindView(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 89
    invoke-super {p0, p1}, Landroid/preference/Preference;->onBindView(Landroid/view/View;)V

    .line 91
    iput-object p1, p0, Lkik/android/widget/preferences/KikModalPreference;->h:Landroid/view/View;

    .line 93
    iget v0, p0, Lkik/android/widget/preferences/KikModalPreference;->e:I

    invoke-static {p1, v0}, Lkik/android/widget/preferences/KikPreference;->a(Landroid/view/View;I)V

    .line 95
    const v0, 0x7f0e01c1

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 96
    if-eqz v0, :cond_1

    .line 97
    iget-object v1, p0, Lkik/android/widget/preferences/KikModalPreference;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 98
    iget-object v1, p0, Lkik/android/widget/preferences/KikModalPreference;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    :cond_0
    iget-boolean v0, p0, Lkik/android/widget/preferences/KikModalPreference;->f:Z

    if-eqz v0, :cond_1

    .line 101
    iget-boolean v0, p0, Lkik/android/widget/preferences/KikModalPreference;->g:Z

    invoke-static {p1, v0, p0}, Lkik/android/widget/preferences/KikPreference;->a(Landroid/view/View;ZLandroid/preference/Preference;)V

    .line 104
    :cond_1
    return-void
.end method

.method public setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V
    .locals 1

    .prologue
    .line 110
    new-instance v0, Lkik/android/widget/preferences/u;

    invoke-direct {v0, p0, p1}, Lkik/android/widget/preferences/u;-><init>(Lkik/android/widget/preferences/KikModalPreference;Landroid/preference/Preference$OnPreferenceClickListener;)V

    invoke-super {p0, v0}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 134
    return-void
.end method
