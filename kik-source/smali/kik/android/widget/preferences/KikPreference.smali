.class public abstract Lkik/android/widget/preferences/KikPreference;
.super Landroid/preference/Preference;
.source "SourceFile"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceClickListener;
.implements Lcom/kik/m/p;


# instance fields
.field protected a:Lkik/a/e/e;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private b:Z

.field private c:Z

.field private d:Landroid/view/View;

.field private e:Lcom/kik/d/b/a$c;

.field private f:Landroid/graphics/drawable/Drawable;

.field private g:Lkik/android/chat/fragment/KikScopedDialogFragment;

.field private h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 124
    invoke-direct {p0, p1, p2, p3}, Landroid/preference/Preference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    iput-boolean v2, p0, Lkik/android/widget/preferences/KikPreference;->b:Z

    .line 39
    iput-boolean v2, p0, Lkik/android/widget/preferences/KikPreference;->c:Z

    .line 125
    const v0, 0x7f030086

    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/KikPreference;->setLayoutResource(I)V

    .line 126
    sget-object v0, Lkik/android/ag$b;->k:[I

    invoke-virtual {p1, p2, v0, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 127
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/preferences/KikPreference;->f:Landroid/graphics/drawable/Drawable;

    .line 128
    iput-object p4, p0, Lkik/android/widget/preferences/KikPreference;->e:Lcom/kik/d/b/a$c;

    .line 130
    sget-object v0, Lkik/android/ag$b;->k:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 132
    invoke-virtual {v0, v2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lkik/android/widget/preferences/KikPreference;->h:I

    .line 134
    new-instance v0, Lkik/android/widget/preferences/x;

    invoke-direct {v0, p0}, Lkik/android/widget/preferences/x;-><init>(Lkik/android/widget/preferences/KikPreference;)V

    invoke-virtual {p0, v0}, Lkik/android/widget/preferences/KikPreference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 141
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/kik/d/b/a$c;)V
    .locals 1

    .prologue
    .line 119
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, Lkik/android/widget/preferences/KikPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kik/d/b/a$c;)V

    .line 120
    return-void
.end method

.method static synthetic a(Lkik/android/widget/preferences/KikPreference;)Lcom/kik/d/b/a$c;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lkik/android/widget/preferences/KikPreference;->e:Lcom/kik/d/b/a$c;

    return-object v0
.end method

.method public static a(Landroid/view/View;I)V
    .locals 6

    .prologue
    const v5, 0x7f020122

    const/16 v4, 0x8

    const/4 v3, 0x0

    .line 70
    const v0, 0x7f0e01bc

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 71
    const v1, 0x7f0e01c0

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 73
    if-eqz v0, :cond_0

    .line 74
    and-int/lit8 v2, p1, 0x5

    if-nez v2, :cond_2

    .line 75
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 81
    :goto_0
    and-int/lit8 v2, p1, 0x4

    if-eqz v2, :cond_0

    .line 82
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 86
    :cond_0
    if-eqz v1, :cond_1

    .line 87
    and-int/lit8 v0, p1, 0xa

    if-nez v0, :cond_3

    .line 88
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 94
    :goto_1
    and-int/lit8 v0, p1, 0x8

    if-eqz v0, :cond_1

    .line 95
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 97
    invoke-virtual {v1, v3, v3, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 100
    :cond_1
    return-void

    .line 78
    :cond_2
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 91
    :cond_3
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1
.end method

.method public static a(Landroid/view/View;Landroid/preference/Preference;)V
    .locals 3

    .prologue
    .line 234
    const v0, 0x7f0e01be

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 236
    invoke-static {v0}, Lkik/android/util/cv;->c(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/animation/Animation;->hasEnded()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v1

    if-nez v1, :cond_1

    .line 238
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->clearAnimation()V

    .line 239
    const/16 v1, 0x12c

    new-instance v2, Lkik/android/widget/preferences/ab;

    invoke-direct {v2, p1}, Lkik/android/widget/preferences/ab;-><init>(Landroid/preference/Preference;)V

    invoke-static {v0, v1, v2}, Lkik/android/util/av;->a(Landroid/view/View;ILandroid/view/animation/Animation$AnimationListener;)V

    .line 273
    :cond_1
    return-void
.end method

.method public static a(Landroid/view/View;ZLandroid/preference/Preference;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 168
    const v0, 0x7f0e01be

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 169
    const v1, 0x7f0e01bf

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 170
    invoke-static {v0}, Lkik/android/util/cv;->d(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 171
    new-array v2, v4, [Landroid/view/View;

    aput-object v0, v2, v3

    invoke-static {v2}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 172
    if-nez p1, :cond_0

    .line 173
    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v2, 0x33

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 174
    new-array v0, v4, [Landroid/view/View;

    aput-object v1, v0, v3

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 175
    new-instance v0, Lkik/android/widget/preferences/y;

    invoke-direct {v0, v1, p0, p2}, Lkik/android/widget/preferences/y;-><init>(Landroid/view/View;Landroid/view/View;Landroid/preference/Preference;)V

    const-wide/16 v2, 0x14

    invoke-virtual {p0, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 204
    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/kik/g/p;Lkik/android/chat/fragment/KikScopedDialogFragment;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 50
    invoke-virtual {p1}, Lcom/kik/g/p;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 51
    new-instance v0, Lkik/android/chat/fragment/ProgressDialogFragment;

    invoke-direct {v0, p0, v1}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    .line 53
    invoke-virtual {v0}, Lkik/android/chat/fragment/ProgressDialogFragment;->e()V

    .line 54
    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ProgressDialogFragment;->setCancelable(Z)V

    .line 56
    invoke-virtual {p2, v0}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 58
    new-instance v1, Lkik/android/widget/preferences/w;

    invoke-direct {v1, v0}, Lkik/android/widget/preferences/w;-><init>(Lkik/android/chat/fragment/ProgressDialogFragment;)V

    invoke-virtual {p1, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 66
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 284
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/widget/preferences/KikPreference;->c:Z

    .line 285
    return-void
.end method

.method public a(Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 114
    invoke-interface {p1, p0}, Lcom/kik/e/a;->a(Lkik/android/widget/preferences/KikPreference;)V

    .line 115
    return-void
.end method

.method public final a(Lkik/android/chat/fragment/KikScopedDialogFragment;)V
    .locals 0

    .prologue
    .line 109
    iput-object p1, p0, Lkik/android/widget/preferences/KikPreference;->g:Lkik/android/chat/fragment/KikScopedDialogFragment;

    .line 110
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 278
    iput-boolean p1, p0, Lkik/android/widget/preferences/KikPreference;->b:Z

    .line 279
    return-void
.end method

.method protected final b()Lkik/android/chat/fragment/KikScopedDialogFragment;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lkik/android/widget/preferences/KikPreference;->g:Lkik/android/chat/fragment/KikScopedDialogFragment;

    return-object v0
.end method

.method public final c()Landroid/view/View;
    .locals 1

    .prologue
    .line 289
    iget-object v0, p0, Lkik/android/widget/preferences/KikPreference;->d:Landroid/view/View;

    return-object v0
.end method

.method protected onBindView(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 146
    invoke-super {p0, p1}, Landroid/preference/Preference;->onBindView(Landroid/view/View;)V

    .line 147
    iput-object p1, p0, Lkik/android/widget/preferences/KikPreference;->d:Landroid/view/View;

    .line 149
    iget v0, p0, Lkik/android/widget/preferences/KikPreference;->h:I

    invoke-static {p1, v0}, Lkik/android/widget/preferences/KikPreference;->a(Landroid/view/View;I)V

    .line 151
    const v0, 0x7f0e003a

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 153
    if-eqz v0, :cond_0

    .line 154
    iget-object v1, p0, Lkik/android/widget/preferences/KikPreference;->f:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_2

    .line 155
    iget-object v1, p0, Lkik/android/widget/preferences/KikPreference;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 161
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lkik/android/widget/preferences/KikPreference;->b:Z

    if-eqz v0, :cond_1

    .line 162
    iget-boolean v0, p0, Lkik/android/widget/preferences/KikPreference;->c:Z

    invoke-static {p1, v0, p0}, Lkik/android/widget/preferences/KikPreference;->a(Landroid/view/View;ZLandroid/preference/Preference;)V

    .line 164
    :cond_1
    return-void

    .line 158
    :cond_2
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method public setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V
    .locals 1

    .prologue
    .line 210
    new-instance v0, Lkik/android/widget/preferences/aa;

    invoke-direct {v0, p0, p1}, Lkik/android/widget/preferences/aa;-><init>(Lkik/android/widget/preferences/KikPreference;Landroid/preference/Preference$OnPreferenceClickListener;)V

    invoke-super {p0, v0}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 230
    return-void
.end method
