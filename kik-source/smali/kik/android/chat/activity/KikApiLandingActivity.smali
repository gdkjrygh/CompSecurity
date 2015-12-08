.class public Lkik/android/chat/activity/KikApiLandingActivity;
.super Lkik/android/chat/activity/KikIqActivityBase;
.source "SourceFile"


# instance fields
.field protected a:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected e:Lkik/a/e/l;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected f:Lkik/a/e/r;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected g:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private k:Landroid/widget/Toast;

.field private l:Lcom/kik/b/b;

.field private m:Lcom/kik/g/p;

.field private n:Lcom/kik/b/a;

.field private o:Lcom/kik/b/a;

.field private p:Lcom/kik/b/a;

.field private q:Lcom/kik/b/a;

.field private r:Lcom/kik/b/a;

.field private s:Lcom/kik/b/a;

.field private t:Lcom/kik/b/a;

.field private u:Lcom/kik/b/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 38
    invoke-direct {p0}, Lkik/android/chat/activity/KikIqActivityBase;-><init>()V

    .line 49
    new-instance v0, Lkik/android/chat/activity/p;

    const-string v1, "default"

    invoke-direct {v0, p0, v1}, Lkik/android/chat/activity/p;-><init>(Lkik/android/chat/activity/KikApiLandingActivity;Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->n:Lcom/kik/b/a;

    .line 57
    new-instance v0, Lkik/android/chat/activity/t;

    const-string v1, "kik://api.kik.com/users/{username}/profile"

    invoke-direct {v0, p0, v1}, Lkik/android/chat/activity/t;-><init>(Lkik/android/chat/activity/KikApiLandingActivity;Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->o:Lcom/kik/b/a;

    .line 75
    new-instance v0, Lkik/android/chat/activity/u;

    const-string v1, "(?:http(?:s)?://)?(?:www.)?kik.com/u/open/{username}"

    invoke-direct {v0, p0, v1}, Lkik/android/chat/activity/u;-><init>(Lkik/android/chat/activity/KikApiLandingActivity;Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->p:Lcom/kik/b/a;

    .line 93
    new-instance v0, Lkik/android/chat/activity/v;

    const-string v1, "kik://users/{username}/profile"

    invoke-direct {v0, p0, v1}, Lkik/android/chat/activity/v;-><init>(Lkik/android/chat/activity/KikApiLandingActivity;Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->q:Lcom/kik/b/a;

    .line 111
    new-instance v0, Lkik/android/chat/activity/w;

    const-string v1, "kik-share://kik.com/u/{username}"

    invoke-direct {v0, p0, v1}, Lkik/android/chat/activity/w;-><init>(Lkik/android/chat/activity/KikApiLandingActivity;Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->r:Lcom/kik/b/a;

    .line 133
    new-instance v0, Lkik/android/chat/activity/x;

    const-string v1, "kik-share://kik.com/g/{tag}"

    invoke-direct {v0, p0, v1}, Lkik/android/chat/activity/x;-><init>(Lkik/android/chat/activity/KikApiLandingActivity;Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->s:Lcom/kik/b/a;

    .line 147
    new-instance v0, Lkik/android/chat/activity/y;

    const-string v1, "kik-share://kik.com/back"

    invoke-direct {v0, p0, v1}, Lkik/android/chat/activity/y;-><init>(Lkik/android/chat/activity/KikApiLandingActivity;Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->t:Lcom/kik/b/a;

    .line 159
    new-instance v0, Lkik/android/chat/activity/z;

    const-string v1, "kik-share://kik.com/send/{parameters}"

    invoke-direct {v0, p0, v1}, Lkik/android/chat/activity/z;-><init>(Lkik/android/chat/activity/KikApiLandingActivity;Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->u:Lcom/kik/b/a;

    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 249
    invoke-virtual {p0}, Lkik/android/chat/activity/KikApiLandingActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/KikApplication;

    invoke-virtual {v0}, Lkik/android/chat/KikApplication;->n()Z

    .line 251
    invoke-virtual {p0}, Lkik/android/chat/activity/KikApiLandingActivity;->b()V

    .line 256
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    .line 257
    if-nez v0, :cond_0

    .line 269
    :goto_0
    return-void

    .line 261
    :cond_0
    const-string v1, "cards"

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "card"

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 262
    :cond_1
    new-instance v1, Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikConversationsFragment$a;-><init>()V

    .line 263
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikConversationsFragment$a;

    .line 264
    invoke-static {v1, p0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->a()Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    goto :goto_0

    .line 267
    :cond_2
    iget-object v1, p0, Lkik/android/chat/activity/KikApiLandingActivity;->l:Lcom/kik/b/b;

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/kik/b/b;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Lkik/a/d/k;)V
    .locals 3

    .prologue
    .line 348
    new-instance v0, Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;-><init>()V

    .line 349
    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v1

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->b(I)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    .line 350
    invoke-static {v0, p0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->c()Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 351
    invoke-virtual {p0}, Lkik/android/chat/activity/KikApiLandingActivity;->finish()V

    .line 352
    return-void
.end method

.method static synthetic a(Lkik/android/chat/activity/KikApiLandingActivity;)V
    .locals 2

    .prologue
    .line 38
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lkik/android/chat/activity/IntroActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikApiLandingActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/activity/KikApiLandingActivity;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 38
    const v0, 0x7f0901ee

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikApiLandingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->k:Landroid/widget/Toast;

    const v1, 0x7f090356

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(I)V

    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->k:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    invoke-virtual {p0}, Lkik/android/chat/activity/KikApiLandingActivity;->finish()V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x14

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->k:Landroid/widget/Toast;

    const v1, 0x7f090355

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(I)V

    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->k:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    invoke-virtual {p0}, Lkik/android/chat/activity/KikApiLandingActivity;->finish()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->k:Landroid/widget/Toast;

    const v1, 0x7f090351

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setText(I)V

    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->k:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    invoke-virtual {p0}, Lkik/android/chat/activity/KikApiLandingActivity;->finish()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->f:Lkik/a/e/r;

    invoke-interface {v0, p1}, Lkik/a/e/r;->b(Ljava/lang/String;)Lkik/a/d/k;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lkik/a/d/k;->g()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-direct {p0, v0}, Lkik/android/chat/activity/KikApiLandingActivity;->a(Lkik/a/d/k;)V

    goto :goto_0

    :cond_3
    const v0, 0x7f0900ff

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikApiLandingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikApiLandingActivity;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->f:Lkik/a/e/r;

    invoke-interface {v0, p1}, Lkik/a/e/r;->d(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->m:Lcom/kik/g/p;

    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->m:Lcom/kik/g/p;

    new-instance v1, Lkik/android/chat/activity/q;

    invoke-direct {v1, p0, p1}, Lkik/android/chat/activity/q;-><init>(Lkik/android/chat/activity/KikApiLandingActivity;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0
.end method

.method static synthetic a(Lkik/android/chat/activity/KikApiLandingActivity;Lkik/a/d/a/a;)V
    .locals 3

    .prologue
    .line 38
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;Z[B)V

    new-instance v0, Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;-><init>()V

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;->a()Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-static {v0, p0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    return-void
.end method

.method static synthetic a(Lkik/android/chat/activity/KikApiLandingActivity;Lkik/a/d/k;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0, p1}, Lkik/android/chat/activity/KikApiLandingActivity;->a(Lkik/a/d/k;)V

    return-void
.end method

.method static synthetic b(Lkik/android/chat/activity/KikApiLandingActivity;)V
    .locals 2

    .prologue
    .line 38
    new-instance v0, Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikConversationsFragment$a;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikConversationsFragment$a;->a(Z)Lkik/android/chat/fragment/KikConversationsFragment$a;

    invoke-static {v0, p0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->c()Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    return-void
.end method

.method static synthetic b(Lkik/android/chat/activity/KikApiLandingActivity;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 38
    new-instance v0, Lkik/android/chat/activity/aa;

    invoke-direct {v0, p0, p1}, Lkik/android/chat/activity/aa;-><init>(Lkik/android/chat/activity/KikApiLandingActivity;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikApiLandingActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    invoke-virtual {p0}, Lkik/android/chat/activity/KikApiLandingActivity;->finish()V

    return-void
.end method

.method static synthetic c(Lkik/android/chat/activity/KikApiLandingActivity;)Landroid/widget/Toast;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->k:Landroid/widget/Toast;

    return-object v0
.end method


# virtual methods
.method protected final a(Lkik/a/f/f/z;)V
    .locals 4

    .prologue
    .line 357
    invoke-super {p0, p1}, Lkik/android/chat/activity/KikIqActivityBase;->a(Lkik/a/f/f/z;)V

    .line 358
    check-cast p1, Lkik/a/f/f/g;

    .line 359
    invoke-virtual {p1}, Lkik/a/f/f/g;->d()Lkik/a/d/k;

    move-result-object v0

    .line 361
    if-eqz v0, :cond_1

    .line 363
    iget-object v1, p0, Lkik/android/chat/activity/KikApiLandingActivity;->f:Lkik/a/e/r;

    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    .line 365
    if-eqz v1, :cond_0

    .line 366
    invoke-virtual {v0, v1}, Lkik/a/d/k;->b(Lkik/a/d/k;)V

    .line 369
    :cond_0
    iget-object v1, p0, Lkik/android/chat/activity/KikApiLandingActivity;->f:Lkik/a/e/r;

    invoke-interface {v1, v0}, Lkik/a/e/r;->a(Lkik/a/d/k;)V

    .line 371
    iget-object v1, p0, Lkik/android/chat/activity/KikApiLandingActivity;->m:Lcom/kik/g/p;

    if-eqz v1, :cond_1

    .line 372
    iget-object v1, p0, Lkik/android/chat/activity/KikApiLandingActivity;->m:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 375
    :cond_1
    return-void
.end method

.method protected final b(Lkik/a/f/f/z;)Z
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 380
    invoke-virtual {p1}, Lkik/a/f/f/z;->l()I

    move-result v0

    const/16 v1, 0xc9

    if-ne v0, v1, :cond_1

    .line 381
    const v1, 0x7f0900a2

    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/Object;

    invoke-virtual {p1}, Lkik/a/f/f/z;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v2, v3

    invoke-virtual {p0, v1, v2}, Lkik/android/chat/activity/KikApiLandingActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->i:Ljava/lang/String;

    .line 387
    :goto_0
    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->m:Lcom/kik/g/p;

    if-eqz v0, :cond_0

    .line 388
    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->m:Lcom/kik/g/p;

    new-instance v1, Ljava/lang/Throwable;

    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    .line 390
    :cond_0
    return v3

    .line 384
    :cond_1
    const v0, 0x7f090383

    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikApiLandingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->i:Ljava/lang/String;

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 209
    invoke-super {p0, p1}, Lkik/android/chat/activity/KikIqActivityBase;->onCreate(Landroid/os/Bundle;)V

    .line 210
    invoke-virtual {p0}, Lkik/android/chat/activity/KikApiLandingActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lkik/android/chat/a;

    invoke-interface {v0}, Lkik/android/chat/a;->a()Lcom/kik/e/a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/kik/e/a;->a(Lkik/android/chat/activity/KikApiLandingActivity;)V

    .line 211
    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->g:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->a(Lkik/a/e/v;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 213
    const v0, 0x7f09014f

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 214
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lkik/android/chat/activity/IntroActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 215
    invoke-virtual {p0, v0}, Lkik/android/chat/activity/KikApiLandingActivity;->startActivity(Landroid/content/Intent;)V

    .line 216
    invoke-virtual {p0}, Lkik/android/chat/activity/KikApiLandingActivity;->finish()V

    .line 232
    :goto_0
    return-void

    .line 220
    :cond_0
    new-instance v0, Lcom/kik/b/b;

    iget-object v1, p0, Lkik/android/chat/activity/KikApiLandingActivity;->n:Lcom/kik/b/a;

    invoke-direct {v0, v1}, Lcom/kik/b/b;-><init>(Lcom/kik/b/a;)V

    iput-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->l:Lcom/kik/b/b;

    .line 221
    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->l:Lcom/kik/b/b;

    iget-object v1, p0, Lkik/android/chat/activity/KikApiLandingActivity;->o:Lcom/kik/b/a;

    invoke-virtual {v0, v1}, Lcom/kik/b/b;->a(Lcom/kik/b/a;)V

    .line 222
    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->l:Lcom/kik/b/b;

    iget-object v1, p0, Lkik/android/chat/activity/KikApiLandingActivity;->r:Lcom/kik/b/a;

    invoke-virtual {v0, v1}, Lcom/kik/b/b;->a(Lcom/kik/b/a;)V

    .line 223
    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->l:Lcom/kik/b/b;

    iget-object v1, p0, Lkik/android/chat/activity/KikApiLandingActivity;->p:Lcom/kik/b/a;

    invoke-virtual {v0, v1}, Lcom/kik/b/b;->a(Lcom/kik/b/a;)V

    .line 224
    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->l:Lcom/kik/b/b;

    iget-object v1, p0, Lkik/android/chat/activity/KikApiLandingActivity;->q:Lcom/kik/b/a;

    invoke-virtual {v0, v1}, Lcom/kik/b/b;->a(Lcom/kik/b/a;)V

    .line 225
    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->l:Lcom/kik/b/b;

    iget-object v1, p0, Lkik/android/chat/activity/KikApiLandingActivity;->s:Lcom/kik/b/a;

    invoke-virtual {v0, v1}, Lcom/kik/b/b;->a(Lcom/kik/b/a;)V

    .line 226
    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->l:Lcom/kik/b/b;

    iget-object v1, p0, Lkik/android/chat/activity/KikApiLandingActivity;->t:Lcom/kik/b/a;

    invoke-virtual {v0, v1}, Lcom/kik/b/b;->a(Lcom/kik/b/a;)V

    .line 227
    iget-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->l:Lcom/kik/b/b;

    iget-object v1, p0, Lkik/android/chat/activity/KikApiLandingActivity;->u:Lcom/kik/b/a;

    invoke-virtual {v0, v1}, Lcom/kik/b/b;->a(Lcom/kik/b/a;)V

    .line 229
    const-string v0, ""

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/activity/KikApiLandingActivity;->k:Landroid/widget/Toast;

    .line 231
    invoke-virtual {p0}, Lkik/android/chat/activity/KikApiLandingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lkik/android/chat/activity/KikApiLandingActivity;->a(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 243
    invoke-super {p0, p1}, Lkik/android/chat/activity/KikIqActivityBase;->onNewIntent(Landroid/content/Intent;)V

    .line 244
    invoke-direct {p0, p1}, Lkik/android/chat/activity/KikApiLandingActivity;->a(Landroid/content/Intent;)V

    .line 245
    return-void
.end method
