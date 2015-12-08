.class public abstract Lkik/android/widget/preferences/KikCheckBoxPreference;
.super Landroid/preference/CheckBoxPreference;
.source "SourceFile"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceChangeListener;
.implements Lcom/kik/m/p;


# instance fields
.field protected a:Lkik/a/e/e;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private b:Lcom/kik/d/b/a$c;

.field private c:Lkik/android/chat/fragment/KikScopedDialogFragment;

.field private d:Z

.field private final e:I

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

    .line 61
    invoke-direct {p0, p1, p2, p3}, Landroid/preference/CheckBoxPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    iput-boolean v1, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->d:Z

    .line 33
    iput-boolean v1, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->f:Z

    .line 34
    iput-boolean v1, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->g:Z

    .line 35
    iput-boolean v1, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->h:Z

    .line 36
    iput-boolean v1, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->i:Z

    .line 63
    const v0, 0x7f030085

    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/KikCheckBoxPreference;->setLayoutResource(I)V

    .line 64
    const v0, 0x7f030057

    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/KikCheckBoxPreference;->setWidgetLayoutResource(I)V

    .line 66
    iput-object p4, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->b:Lcom/kik/d/b/a$c;

    .line 68
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/KikCheckBoxPreference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    .line 70
    sget-object v0, Lkik/android/ag$b;->k:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 72
    invoke-virtual {v0, v1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->e:I

    .line 73
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/kik/d/b/a$c;)V
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lkik/android/widget/preferences/KikCheckBoxPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V

    .line 57
    return-void
.end method

.method static synthetic a(Lkik/android/widget/preferences/KikCheckBoxPreference;)Lcom/kik/d/b/a$c;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->b:Lcom/kik/d/b/a$c;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 158
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->h:Z

    .line 159
    return-void
.end method

.method public a(Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 51
    invoke-interface {p1, p0}, Lcom/kik/e/a;->a(Lkik/android/widget/preferences/KikCheckBoxPreference;)V

    .line 52
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikScopedDialogFragment;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->c:Lkik/android/chat/fragment/KikScopedDialogFragment;

    .line 47
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 152
    iput-boolean p1, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->f:Z

    .line 153
    return-void
.end method

.method protected final b()Lkik/android/chat/fragment/KikScopedDialogFragment;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->c:Lkik/android/chat/fragment/KikScopedDialogFragment;

    return-object v0
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 142
    iget-object v0, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->j:Landroid/view/View;

    const v1, 0x7f0e01be

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 143
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 144
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->g:Z

    .line 145
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->f:Z

    .line 147
    :cond_0
    return-void
.end method

.method public final d()Landroid/view/View;
    .locals 1

    .prologue
    .line 163
    iget-object v0, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->j:Landroid/view/View;

    return-object v0
.end method

.method public final e()V
    .locals 1

    .prologue
    .line 168
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->i:Z

    .line 169
    return-void
.end method

.method public final f()V
    .locals 1

    .prologue
    .line 173
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->f:Z

    .line 174
    return-void
.end method

.method protected onBindView(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 78
    invoke-super {p0, p1}, Landroid/preference/CheckBoxPreference;->onBindView(Landroid/view/View;)V

    .line 79
    iput-object p1, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->j:Landroid/view/View;

    .line 80
    const v0, 0x7f0e01be

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 81
    iget-boolean v1, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->f:Z

    if-eqz v1, :cond_1

    .line 82
    iget-boolean v0, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->h:Z

    invoke-static {p1, v0, p0}, Lkik/android/widget/preferences/KikPreference;->a(Landroid/view/View;ZLandroid/preference/Preference;)V

    .line 89
    :cond_0
    :goto_0
    iget v0, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->e:I

    invoke-static {p1, v0}, Lkik/android/widget/preferences/KikPreference;->a(Landroid/view/View;I)V

    .line 91
    iput-boolean v3, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->d:Z

    .line 92
    return-void

    .line 84
    :cond_1
    iget-boolean v1, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->g:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->i:Z

    if-nez v1, :cond_0

    .line 85
    new-array v1, v3, [Landroid/view/View;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {v1}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 86
    iget-object v0, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->j:Landroid/view/View;

    invoke-static {v0, p0}, Lkik/android/widget/preferences/KikPreference;->a(Landroid/view/View;Landroid/preference/Preference;)V

    goto :goto_0
.end method

.method public setChecked(Z)V
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 97
    invoke-virtual {p0}, Lkik/android/widget/preferences/KikCheckBoxPreference;->isChecked()Z

    move-result v0

    if-eq v0, p1, :cond_0

    iget-boolean v0, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->a:Lkik/a/e/e;

    if-eqz v0, :cond_0

    .line 98
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 100
    const-string v0, "s"

    iget-object v1, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->b:Lcom/kik/d/b/a$c;

    invoke-virtual {v1}, Lcom/kik/d/b/a$c;->a()I

    move-result v1

    int-to-long v6, v1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    iget-object v0, p0, Lkik/android/widget/preferences/KikCheckBoxPreference;->a:Lkik/a/e/e;

    invoke-interface {v0}, Lkik/a/e/e;->c()Lcom/kik/d/f;

    move-result-object v1

    sget-object v2, Lcom/kik/d/b/a$k;->M:Lcom/kik/d/b/a$k;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v6

    move-object v4, v3

    invoke-virtual/range {v1 .. v7}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;J)V

    .line 105
    :cond_0
    invoke-super {p0, p1}, Landroid/preference/CheckBoxPreference;->setChecked(Z)V

    .line 106
    return-void
.end method

.method public setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V
    .locals 1

    .prologue
    .line 112
    new-instance v0, Lkik/android/widget/preferences/h;

    invoke-direct {v0, p0, p1}, Lkik/android/widget/preferences/h;-><init>(Lkik/android/widget/preferences/KikCheckBoxPreference;Landroid/preference/Preference$OnPreferenceChangeListener;)V

    invoke-super {p0, v0}, Landroid/preference/CheckBoxPreference;->setOnPreferenceChangeListener(Landroid/preference/Preference$OnPreferenceChangeListener;)V

    .line 138
    return-void
.end method
