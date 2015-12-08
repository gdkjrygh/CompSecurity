.class public Lcom/kik/cards/web/profile/ProfilePlugin;
.super Lcom/kik/cards/web/plugin/d;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:I

.field private d:Lcom/kik/g/p;

.field private e:Lkik/android/chat/fragment/KikScopedDialogFragment;

.field private f:Lkik/a/e/r;

.field private g:Ljava/lang/String;

.field private h:Lcom/kik/cards/web/browser/BrowserPlugin$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lkik/android/chat/fragment/KikScopedDialogFragment;Lkik/a/e/r;Lcom/kik/cards/web/browser/BrowserPlugin$a;)V
    .locals 1

    .prologue
    .line 38
    const-string v0, "Profile"

    invoke-direct {p0, v0}, Lcom/kik/cards/web/plugin/d;-><init>(Ljava/lang/String;)V

    .line 29
    const/4 v0, 0x4

    iput v0, p0, Lcom/kik/cards/web/profile/ProfilePlugin;->b:I

    .line 39
    iput-object p1, p0, Lcom/kik/cards/web/profile/ProfilePlugin;->a:Landroid/content/Context;

    .line 40
    iput-object p2, p0, Lcom/kik/cards/web/profile/ProfilePlugin;->e:Lkik/android/chat/fragment/KikScopedDialogFragment;

    .line 41
    iput-object p3, p0, Lcom/kik/cards/web/profile/ProfilePlugin;->f:Lkik/a/e/r;

    .line 42
    iput-object p4, p0, Lcom/kik/cards/web/profile/ProfilePlugin;->h:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    .line 43
    return-void
.end method

.method static synthetic a(Lcom/kik/cards/web/profile/ProfilePlugin;)Lkik/android/chat/fragment/KikScopedDialogFragment;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/kik/cards/web/profile/ProfilePlugin;->e:Lkik/android/chat/fragment/KikScopedDialogFragment;

    return-object v0
.end method

.method static synthetic a(Lcom/kik/cards/web/profile/ProfilePlugin;Lkik/a/d/k;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0, p1}, Lcom/kik/cards/web/profile/ProfilePlugin;->a(Lkik/a/d/k;)V

    return-void
.end method

.method private a(Lkik/a/d/k;)V
    .locals 2

    .prologue
    .line 107
    new-instance v0, Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;-><init>()V

    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v0

    iget v1, p0, Lcom/kik/cards/web/profile/ProfilePlugin;->b:I

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->b(I)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/profile/ProfilePlugin;->a:Landroid/content/Context;

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 108
    return-void
.end method

.method static synthetic b(Lcom/kik/cards/web/profile/ProfilePlugin;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/kik/cards/web/profile/ProfilePlugin;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lcom/kik/cards/web/profile/ProfilePlugin;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/kik/cards/web/profile/ProfilePlugin;->g:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public openProfile(Lorg/json/JSONObject;)Lcom/kik/cards/web/plugin/j;
    .locals 4
    .annotation runtime Lcom/kik/cards/web/plugin/g;
    .end annotation

    .prologue
    .line 48
    iget-object v0, p0, Lcom/kik/cards/web/profile/ProfilePlugin;->h:Lcom/kik/cards/web/browser/BrowserPlugin$a;

    invoke-interface {v0}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 102
    :goto_0
    return-object v0

    .line 52
    :cond_0
    const-string v0, "username"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 53
    iput-object v0, p0, Lcom/kik/cards/web/profile/ProfilePlugin;->g:Ljava/lang/String;

    .line 55
    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 56
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x190

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 59
    :cond_1
    iget-object v1, p0, Lcom/kik/cards/web/profile/ProfilePlugin;->f:Lkik/a/e/r;

    invoke-interface {v1, v0}, Lkik/a/e/r;->b(Ljava/lang/String;)Lkik/a/d/k;

    move-result-object v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    invoke-direct {p0, v1}, Lcom/kik/cards/web/profile/ProfilePlugin;->a(Lkik/a/d/k;)V

    .line 102
    :goto_1
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    goto :goto_0

    .line 65
    :cond_2
    new-instance v1, Lkik/android/chat/fragment/ProgressDialogFragment;

    iget-object v2, p0, Lcom/kik/cards/web/profile/ProfilePlugin;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0900ff

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lkik/android/chat/fragment/ProgressDialogFragment;-><init>(Ljava/lang/String;Z)V

    .line 66
    iget-object v2, p0, Lcom/kik/cards/web/profile/ProfilePlugin;->e:Lkik/android/chat/fragment/KikScopedDialogFragment;

    invoke-virtual {v2, v1}, Lkik/android/chat/fragment/KikScopedDialogFragment;->a(Lkik/android/chat/fragment/KikDialogFragment;)V

    .line 68
    iget-object v1, p0, Lcom/kik/cards/web/profile/ProfilePlugin;->f:Lkik/a/e/r;

    invoke-interface {v1, v0}, Lkik/a/e/r;->d(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/profile/ProfilePlugin;->d:Lcom/kik/g/p;

    .line 69
    iget-object v0, p0, Lcom/kik/cards/web/profile/ProfilePlugin;->d:Lcom/kik/g/p;

    new-instance v1, Lcom/kik/cards/web/profile/a;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/profile/a;-><init>(Lcom/kik/cards/web/profile/ProfilePlugin;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_1
.end method
