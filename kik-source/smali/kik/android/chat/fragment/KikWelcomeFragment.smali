.class public Lkik/android/chat/fragment/KikWelcomeFragment;
.super Lkik/android/chat/fragment/KikIqFragmentBase;
.source "SourceFile"


# instance fields
.field protected a:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected b:Lkik/a/e/w;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected c:Lkik/android/util/ar;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private d:Lcom/kik/g/f;

.field private e:Lcom/kik/g/i;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;-><init>()V

    .line 40
    new-instance v0, Lkik/android/chat/fragment/pz;

    invoke-direct {v0, p0}, Lkik/android/chat/fragment/pz;-><init>(Lkik/android/chat/fragment/KikWelcomeFragment;)V

    iput-object v0, p0, Lkik/android/chat/fragment/KikWelcomeFragment;->e:Lcom/kik/g/i;

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikWelcomeFragment;)V
    .locals 0

    .prologue
    .line 22
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikWelcomeFragment;->J()V

    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 96
    invoke-super {p0, p1, p2, p3}, Lkik/android/chat/fragment/KikIqFragmentBase;->onActivityResult(IILandroid/content/Intent;)V

    .line 97
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 98
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikWelcomeFragment;->J()V

    .line 100
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 34
    invoke-super {p0, p1}, Lkik/android/chat/fragment/KikIqFragmentBase;->onCreate(Landroid/os/Bundle;)V

    .line 35
    invoke-virtual {p0}, Lkik/android/chat/fragment/KikWelcomeFragment;->V()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/fragment/KikWelcomeFragment;)V

    .line 36
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/chat/fragment/KikWelcomeFragment;->d:Lcom/kik/g/f;

    .line 37
    iget-object v0, p0, Lkik/android/chat/fragment/KikWelcomeFragment;->a:Lcom/kik/android/a;

    const-string v1, "Intro Shown"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->g()Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 38
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .prologue
    .line 51
    const v0, 0x7f030017

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 52
    const v1, 0x7f0e0067

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 53
    const v2, 0x7f0e0085

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 55
    const-string v3, "AUTOMATION_TITLE_REGISTER"

    invoke-virtual {v2, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 56
    iget-object v3, p0, Lkik/android/chat/fragment/KikWelcomeFragment;->d:Lcom/kik/g/f;

    iget-object v4, p0, Lkik/android/chat/fragment/KikWelcomeFragment;->b:Lkik/a/e/w;

    invoke-interface {v4}, Lkik/a/e/w;->b()Lcom/kik/g/e;

    move-result-object v4

    iget-object v5, p0, Lkik/android/chat/fragment/KikWelcomeFragment;->e:Lcom/kik/g/i;

    invoke-virtual {v3, v4, v5}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 58
    iget-object v3, p0, Lkik/android/chat/fragment/KikWelcomeFragment;->b:Lkik/a/e/w;

    invoke-interface {v3}, Lkik/a/e/w;->h()Lcom/kik/g/p;

    move-result-object v3

    new-instance v4, Lkik/android/chat/fragment/qa;

    invoke-direct {v4, p0}, Lkik/android/chat/fragment/qa;-><init>(Lkik/android/chat/fragment/KikWelcomeFragment;)V

    invoke-virtual {v3, v4}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 67
    new-instance v3, Lkik/android/chat/fragment/qb;

    invoke-direct {v3, p0}, Lkik/android/chat/fragment/qb;-><init>(Lkik/android/chat/fragment/KikWelcomeFragment;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 79
    new-instance v2, Lkik/android/chat/fragment/qc;

    invoke-direct {v2, p0}, Lkik/android/chat/fragment/qc;-><init>(Lkik/android/chat/fragment/KikWelcomeFragment;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 110
    invoke-super {p0}, Lkik/android/chat/fragment/KikIqFragmentBase;->onDestroy()V

    .line 111
    iget-object v0, p0, Lkik/android/chat/fragment/KikWelcomeFragment;->d:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 112
    iget-object v0, p0, Lkik/android/chat/fragment/KikWelcomeFragment;->c:Lkik/android/util/ar;

    invoke-static {v0}, Lkik/android/chat/fragment/KikRegistrationFragment;->a(Lkik/android/util/ar;)V

    .line 113
    return-void
.end method
