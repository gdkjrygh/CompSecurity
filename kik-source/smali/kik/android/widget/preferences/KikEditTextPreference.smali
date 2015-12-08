.class public abstract Lkik/android/widget/preferences/KikEditTextPreference;
.super Landroid/preference/EditTextPreference;
.source "SourceFile"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceChangeListener;
.implements Lcom/kik/m/p;


# instance fields
.field protected a:Lkik/a/e/e;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private final b:Ljava/lang/String;

.field private final c:I

.field private d:Lcom/kik/d/b/a$c;

.field private e:Lkik/android/chat/fragment/KikScopedDialogFragment;

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 51
    invoke-direct {p0, p1, p2, p3}, Landroid/preference/EditTextPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 37
    iput-boolean v1, p0, Lkik/android/widget/preferences/KikEditTextPreference;->f:Z

    .line 38
    iput-boolean v1, p0, Lkik/android/widget/preferences/KikEditTextPreference;->g:Z

    .line 39
    iput-boolean v1, p0, Lkik/android/widget/preferences/KikEditTextPreference;->h:Z

    .line 40
    iput-boolean v1, p0, Lkik/android/widget/preferences/KikEditTextPreference;->i:Z

    .line 53
    iput-object p4, p0, Lkik/android/widget/preferences/KikEditTextPreference;->d:Lcom/kik/d/b/a$c;

    .line 54
    invoke-virtual {p0}, Lkik/android/widget/preferences/KikEditTextPreference;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/preferences/KikEditTextPreference;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lkik/android/widget/preferences/KikEditTextPreference;->b:Ljava/lang/String;

    .line 55
    const v0, 0x7f030088

    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/KikEditTextPreference;->setLayoutResource(I)V

    .line 57
    sget-object v0, Lkik/android/ag$b;->k:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 59
    invoke-virtual {v0, v1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lkik/android/widget/preferences/KikEditTextPreference;->c:I

    .line 61
    new-instance v0, Lkik/android/widget/preferences/j;

    invoke-direct {v0, p0}, Lkik/android/widget/preferences/j;-><init>(Lkik/android/widget/preferences/KikEditTextPreference;)V

    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/KikEditTextPreference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    .line 68
    return-void

    .line 54
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/kik/d/b/a$c;)V
    .locals 1

    .prologue
    .line 46
    const v0, 0x1010092

    invoke-direct {p0, p1, p2, v0, p3}, Lkik/android/widget/preferences/KikEditTextPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V

    .line 47
    return-void
.end method

.method static synthetic a(Lkik/android/widget/preferences/KikEditTextPreference;)Lcom/kik/d/b/a$c;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lkik/android/widget/preferences/KikEditTextPreference;->d:Lcom/kik/d/b/a$c;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 162
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/preferences/KikEditTextPreference;->h:Z

    .line 163
    return-void
.end method

.method public a(Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 82
    invoke-interface {p1, p0}, Lcom/kik/e/a;->a(Lkik/android/widget/preferences/KikEditTextPreference;)V

    .line 83
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Lkik/android/widget/preferences/KikEditTextPreference;->e:Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-virtual {v0, p1, p2, p3}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    .line 142
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikScopedDialogFragment;)V
    .locals 0

    .prologue
    .line 77
    iput-object p1, p0, Lkik/android/widget/preferences/KikEditTextPreference;->e:Lkik/android/chat/fragment/KikScopedDialogFragment;

    .line 78
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 156
    iput-boolean p1, p0, Lkik/android/widget/preferences/KikEditTextPreference;->f:Z

    .line 157
    return-void
.end method

.method protected final b()Lkik/android/chat/fragment/KikScopedDialogFragment;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lkik/android/widget/preferences/KikEditTextPreference;->e:Lkik/android/chat/fragment/KikScopedDialogFragment;

    return-object v0
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 146
    iget-object v0, p0, Lkik/android/widget/preferences/KikEditTextPreference;->j:Landroid/view/View;

    const v1, 0x7f0e01be

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 147
    invoke-static {v0}, Lkik/android/util/cv;->c(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 148
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/preferences/KikEditTextPreference;->g:Z

    .line 149
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/preferences/KikEditTextPreference;->f:Z

    .line 151
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 167
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/preferences/KikEditTextPreference;->i:Z

    .line 168
    return-void
.end method

.method public final e()V
    .locals 1

    .prologue
    .line 172
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/preferences/KikEditTextPreference;->g:Z

    .line 173
    return-void
.end method

.method protected onBindView(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 88
    invoke-super {p0, p1}, Landroid/preference/EditTextPreference;->onBindView(Landroid/view/View;)V

    .line 89
    iput-object p1, p0, Lkik/android/widget/preferences/KikEditTextPreference;->j:Landroid/view/View;

    .line 90
    const v0, 0x1020016

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 92
    if-eqz v0, :cond_0

    .line 93
    iget-object v1, p0, Lkik/android/widget/preferences/KikEditTextPreference;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    const v0, 0x7f0e01be

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 97
    iget-boolean v1, p0, Lkik/android/widget/preferences/KikEditTextPreference;->f:Z

    if-eqz v1, :cond_2

    .line 98
    iget-boolean v0, p0, Lkik/android/widget/preferences/KikEditTextPreference;->h:Z

    invoke-static {p1, v0, p0}, Lkik/android/widget/preferences/KikPreference;->a(Landroid/view/View;ZLandroid/preference/Preference;)V

    .line 106
    :cond_0
    :goto_0
    const v0, 0x7f0e01c1

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 107
    if-eqz v0, :cond_1

    .line 108
    invoke-virtual {p0}, Lkik/android/widget/preferences/KikEditTextPreference;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    :cond_1
    iget v0, p0, Lkik/android/widget/preferences/KikEditTextPreference;->c:I

    invoke-static {p1, v0}, Lkik/android/widget/preferences/KikPreference;->a(Landroid/view/View;I)V

    .line 112
    return-void

    .line 100
    :cond_2
    iget-boolean v1, p0, Lkik/android/widget/preferences/KikEditTextPreference;->g:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lkik/android/widget/preferences/KikEditTextPreference;->i:Z

    if-nez v1, :cond_0

    .line 101
    const/4 v1, 0x1

    new-array v1, v1, [Landroid/view/View;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {v1}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 102
    iget-object v0, p0, Lkik/android/widget/preferences/KikEditTextPreference;->j:Landroid/view/View;

    invoke-static {v0, p0}, Lkik/android/widget/preferences/KikPreference;->a(Landroid/view/View;Landroid/preference/Preference;)V

    goto :goto_0
.end method

.method public setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V
    .locals 1

    .prologue
    .line 118
    new-instance v0, Lkik/android/widget/preferences/k;

    invoke-direct {v0, p0, p1}, Lkik/android/widget/preferences/k;-><init>(Lkik/android/widget/preferences/KikEditTextPreference;Landroid/preference/Preference$OnPreferenceChangeListener;)V

    invoke-super {p0, v0}, Landroid/preference/EditTextPreference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    .line 137
    return-void
.end method
