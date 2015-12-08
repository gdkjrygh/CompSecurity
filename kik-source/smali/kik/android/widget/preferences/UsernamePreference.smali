.class public Lkik/android/widget/preferences/UsernamePreference;
.super Lkik/android/widget/preferences/KikModalPreference;
.source "SourceFile"


# instance fields
.field protected a:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected c:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field d:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "ContactImageLoader"
    .end annotation
.end field

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 40
    sget-object v0, Lcom/kik/d/b/a$c;->w:Lcom/kik/d/b/a$c;

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/preferences/KikModalPreference;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Lcom/kik/d/b/a$c;)V

    .line 41
    iput-object p1, p0, Lkik/android/widget/preferences/UsernamePreference;->e:Landroid/content/Context;

    .line 42
    return-void
.end method

.method static synthetic a(Lkik/android/widget/preferences/UsernamePreference;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lkik/android/widget/preferences/UsernamePreference;->e:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/kik/e/a;)V
    .locals 0

    .prologue
    .line 47
    invoke-interface {p1, p0}, Lcom/kik/e/a;->a(Lkik/android/widget/preferences/UsernamePreference;)V

    .line 48
    return-void
.end method

.method protected onBindView(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 53
    invoke-super {p0, p1}, Lkik/android/widget/preferences/KikModalPreference;->onBindView(Landroid/view/View;)V

    .line 55
    const v0, 0x7f0e01c1

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 57
    iget-object v1, p0, Lkik/android/widget/preferences/UsernamePreference;->a:Lkik/a/e/w;

    invoke-interface {v1}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v1

    .line 59
    if-eqz v0, :cond_0

    .line 60
    iget-object v1, v1, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    :cond_0
    return-void
.end method

.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 67
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/CharSequence;

    invoke-virtual {p0}, Lkik/android/widget/preferences/UsernamePreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v1

    const v2, 0x7f0902a6

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v4

    const/4 v1, 0x1

    invoke-virtual {p0}, Lkik/android/widget/preferences/UsernamePreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v2

    const v3, 0x7f0900f5

    invoke-virtual {v2, v3}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 68
    new-instance v1, Lkik/android/chat/fragment/KikDialogFragment$a;

    invoke-virtual {p0}, Lkik/android/widget/preferences/UsernamePreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v2

    invoke-virtual {v2}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;-><init>(Landroid/content/res/Resources;)V

    .line 69
    invoke-virtual {p0}, Lkik/android/widget/preferences/UsernamePreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v2

    const v3, 0x7f0902c9

    invoke-virtual {v2, v3}, Lkik/android/chat/fragment/KikScopedDialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 70
    new-instance v2, Lkik/android/widget/preferences/bp;

    invoke-direct {v2, p0}, Lkik/android/widget/preferences/bp;-><init>(Lkik/android/widget/preferences/UsernamePreference;)V

    invoke-virtual {v1, v0, v2}, Lkik/android/chat/fragment/KikDialogFragment$a;->a([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 90
    new-instance v0, Lkik/android/widget/preferences/bq;

    invoke-direct {v0, p0, p1}, Lkik/android/widget/preferences/bq;-><init>(Lkik/android/widget/preferences/UsernamePreference;Landroid/preference/Preference;)V

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikDialogFragment$a;->a(Lkik/android/chat/fragment/KikDialogFragment$c;)Lkik/android/chat/fragment/KikDialogFragment$a;

    .line 96
    invoke-virtual {p0}, Lkik/android/widget/preferences/UsernamePreference;->b()Lkik/android/chat/fragment/KikScopedDialogFragment;

    move-result-object v0

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikDialogFragment$a;->a()Lkik/android/chat/fragment/KikDialogFragment;

    move-result-object v1

    sget-object v2, Lkik/android/chat/fragment/KikScopedDialogFragment$a;->b:Lkik/android/chat/fragment/KikScopedDialogFragment$a;

    const-string v3, "namePreference"

    invoke-virtual {v0, v1, v2, v3}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;Lkik/android/chat/fragment/KikScopedDialogFragment$a;Ljava/lang/String;)V

    .line 98
    return v4
.end method
