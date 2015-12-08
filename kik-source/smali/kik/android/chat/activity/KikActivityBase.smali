.class public Lkik/android/chat/activity/KikActivityBase;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/activity/KikActivityBase$a;
    }
.end annotation


# instance fields
.field private volatile a:Z

.field b:Lkik/a/e/k;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field c:Lkik/a/ab;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected final d:I

.field private volatile e:Z

.field private f:Lkik/android/chat/activity/KikActivityBase$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 24
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 27
    iput-boolean v0, p0, Lkik/android/chat/activity/KikActivityBase;->a:Z

    .line 28
    iput-boolean v0, p0, Lkik/android/chat/activity/KikActivityBase;->e:Z

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/activity/KikActivityBase;->f:Lkik/android/chat/activity/KikActivityBase$a;

    .line 34
    const/4 v0, 0x1

    iput v0, p0, Lkik/android/chat/activity/KikActivityBase;->d:I

    .line 172
    return-void
.end method

.method static synthetic a(Lkik/android/chat/activity/KikActivityBase;)Lkik/android/chat/activity/KikActivityBase$a;
    .locals 1

    .prologue
    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/activity/KikActivityBase;->f:Lkik/android/chat/activity/KikActivityBase$a;

    return-object v0
.end method


# virtual methods
.method protected final b()V
    .locals 1

    .prologue
    .line 75
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/activity/KikActivityBase;->a:Z

    .line 76
    return-void
.end method

.method protected final c()Z
    .locals 1

    .prologue
    .line 99
    iget-boolean v0, p0, Lkik/android/chat/activity/KikActivityBase;->a:Z

    return v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 39
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 40
    invoke-virtual {p0}, Lkik/android/chat/activity/KikActivityBase;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/a;

    invoke-interface {v0}, Lkik/android/chat/a;->a()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/activity/KikActivityBase;)V

    .line 42
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikActivityBase;->requestWindowFeature(I)Z

    .line 43
    new-instance v0, Lkik/android/chat/activity/KikActivityBase$a;

    invoke-direct {v0, p0}, Lkik/android/chat/activity/KikActivityBase$a;-><init>(Lkik/android/chat/activity/KikActivityBase;)V

    iput-object v0, p0, Lkik/android/chat/activity/KikActivityBase;->f:Lkik/android/chat/activity/KikActivityBase$a;

    .line 44
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lkik/android/chat/activity/KikActivityBase;->f:Lkik/android/chat/activity/KikActivityBase$a;

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lkik/android/chat/activity/KikActivityBase;->f:Lkik/android/chat/activity/KikActivityBase$a;

    invoke-virtual {v0}, Lkik/android/chat/activity/KikActivityBase$a;->a()V

    .line 93
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/activity/KikActivityBase;->f:Lkik/android/chat/activity/KikActivityBase$a;

    .line 94
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 95
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 82
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 83
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/activity/KikActivityBase;->a:Z

    .line 84
    invoke-virtual {p0}, Lkik/android/chat/activity/KikActivityBase;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    invoke-virtual {v0, p0}, Lkik/android/chat/KikApplication;->d(Landroid/app/Activity;)V

    .line 85
    return-void
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 54
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 56
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/activity/KikActivityBase;->a:Z

    .line 57
    invoke-virtual {p0}, Lkik/android/chat/activity/KikActivityBase;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    invoke-virtual {v0, p0}, Lkik/android/chat/KikApplication;->c(Landroid/app/Activity;)V

    .line 58
    return-void
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 63
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 65
    iget-object v0, p0, Lkik/android/chat/activity/KikActivityBase;->b:Lkik/a/e/k;

    invoke-interface {v0}, Lkik/a/e/k;->c()V

    .line 66
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/activity/KikActivityBase;->a:Z

    .line 67
    invoke-virtual {p0}, Lkik/android/chat/activity/KikActivityBase;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    invoke-virtual {v0, p0}, Lkik/android/chat/KikApplication;->d(Landroid/app/Activity;)V

    .line 68
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 168
    const-string v0, "WORKAROUND_FOR_BUG_19917_KEY"

    const-string v1, "WORKAROUND_FOR_BUG_19917_VALUE"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 170
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    .prologue
    .line 114
    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    .line 115
    iput-boolean p1, p0, Lkik/android/chat/activity/KikActivityBase;->e:Z

    .line 116
    return-void
.end method
