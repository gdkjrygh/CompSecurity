.class public final Lkik/android/b/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/cards/web/kik/h;


# instance fields
.field private a:Lcom/kik/cards/web/CardsWebViewFragment;

.field private b:Lkik/a/e/r;


# direct methods
.method public constructor <init>(Lcom/kik/cards/web/CardsWebViewFragment;Lkik/a/e/r;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lkik/android/b/k;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    .line 42
    iput-object p2, p0, Lkik/android/b/k;->b:Lkik/a/e/r;

    .line 43
    return-void
.end method

.method static synthetic a(Lkik/android/b/k;)Lcom/kik/cards/web/CardsWebViewFragment;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lkik/android/b/k;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    return-object v0
.end method

.method static synthetic a(Lkik/android/b/k;Lkik/a/d/k;Ljava/util/List;I)Lcom/kik/g/p;
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 33
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Contact was null!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    invoke-virtual {v0, p2}, Lkik/android/f/a/f;->b(Ljava/util/List;)V

    new-instance v0, Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatFragment$a;-><init>()V

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikChatFragment$a;->b(Z)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v0

    invoke-virtual {p1}, Lkik/a/d/k;->m()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v0, Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;-><init>()V

    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v1

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->b(I)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    invoke-virtual {v0, p3}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    iget-object v1, p0, Lkik/android/b/k;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v1}, Lcom/kik/cards/web/CardsWebViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-virtual {v0, p3}, Lkik/android/chat/fragment/KikChatFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    iget-object v1, p0, Lkik/android/b/k;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v1}, Lcom/kik/cards/web/CardsWebViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 86
    iget-object v0, p0, Lkik/android/b/k;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 87
    if-nez v0, :cond_0

    .line 111
    :goto_0
    return-void

    .line 92
    :cond_0
    const/4 v0, 0x0

    .line 93
    new-instance v1, Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/KikChatFragment$a;-><init>()V

    invoke-virtual {v1, p2}, Lkik/android/chat/fragment/KikChatFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v1

    .line 94
    if-eqz p1, :cond_1

    .line 95
    iget-object v0, p0, Lkik/android/b/k;->b:Lkik/a/e/r;

    const/4 v2, 0x0

    invoke-interface {v0, p1, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 97
    :cond_1
    if-eqz v0, :cond_2

    .line 98
    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v0

    invoke-virtual {v0, p3}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Z)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lkik/android/chat/fragment/KikChatFragment$a;->b(Z)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lkik/android/chat/fragment/KikChatFragment$a;->c(Z)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v0

    iget-object v2, p0, Lkik/android/b/k;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v2}, Lcom/kik/cards/web/CardsWebViewFragment;->w()I

    move-result v2

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/KikChatFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    .line 106
    iget-object v0, p0, Lkik/android/b/k;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v1, v0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    goto :goto_0

    .line 109
    :cond_2
    iget-object v0, p0, Lkik/android/b/k;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v1, v0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    goto :goto_0
.end method


# virtual methods
.method public final a(Lcom/kik/cards/web/kik/KikMessageParcelable;)Lcom/kik/g/p;
    .locals 4

    .prologue
    .line 123
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    iget-object v1, p0, Lkik/android/b/k;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    iget-object v2, p0, Lkik/android/b/k;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v2}, Lcom/kik/cards/web/CardsWebViewFragment;->w()I

    move-result v2

    iget-object v3, p0, Lkik/android/b/k;->b:Lkik/a/e/r;

    invoke-virtual {v0, p1, v1, v2, v3}, Lkik/android/f/a/f;->a(Lcom/kik/cards/web/kik/KikMessageParcelable;Landroid/support/v4/app/Fragment;ILkik/a/e/r;)Lcom/kik/g/p;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/util/List;Ljava/lang/String;)Lcom/kik/g/p;
    .locals 4

    .prologue
    .line 138
    if-eqz p2, :cond_1

    .line 139
    const/4 v0, 0x0

    .line 140
    iget-object v1, p0, Lkik/android/b/k;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    instance-of v1, v1, Lkik/android/chat/fragment/KikCardBrowserFragment;

    if-eqz v1, :cond_4

    .line 141
    iget-object v0, p0, Lkik/android/b/k;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    check-cast v0, Lkik/android/chat/fragment/KikCardBrowserFragment;

    move-object v1, v0

    .line 145
    :goto_0
    if-eqz v1, :cond_0

    .line 146
    const v0, 0x7f090148

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikCardBrowserFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/KikCardBrowserFragment;->f(Ljava/lang/String;)V

    .line 148
    :cond_0
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 149
    iget-object v2, p0, Lkik/android/b/k;->b:Lkik/a/e/r;

    invoke-interface {v2, p2}, Lkik/a/e/r;->d(Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v2

    .line 150
    new-instance v3, Lkik/android/b/l;

    invoke-direct {v3, p0, v0, p1, v1}, Lkik/android/b/l;-><init>(Lkik/android/b/k;Lcom/kik/g/p;Ljava/util/List;Lkik/android/chat/fragment/KikCardBrowserFragment;)V

    invoke-virtual {v2, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 178
    :goto_1
    return-object v0

    :cond_1
    iget-object v0, p0, Lkik/android/b/k;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->w()I

    move-result v0

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-gtz v1, :cond_3

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Smiley list must be non-empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_1

    :cond_3
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v1

    invoke-virtual {v1, p1}, Lkik/android/f/a/f;->b(Ljava/util/List;)V

    new-instance v1, Lkik/android/chat/fragment/SendToFragment$a;

    invoke-direct {v1}, Lkik/android/chat/fragment/SendToFragment$a;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/SendToFragment$a;->a(Z)Lkik/android/chat/fragment/SendToFragment$a;

    invoke-virtual {v1, v0}, Lkik/android/chat/fragment/SendToFragment$a;->a(I)Lcom/kik/ui/fragment/FragmentBase$a;

    iget-object v0, p0, Lkik/android/b/k;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v1, v0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    move-result-object v0

    goto :goto_1

    :cond_4
    move-object v1, v0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 81
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lkik/android/b/k;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 82
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 116
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lkik/android/b/k;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 117
    return-void
.end method

.method public final b(Ljava/util/List;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 129
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkik/android/f/a/f;->b(Ljava/util/List;)V

    .line 130
    new-instance v0, Lkik/android/chat/fragment/KikChatFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikChatFragment$a;-><init>()V

    invoke-virtual {v0, p2}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatFragment$a;->b(Z)Lkik/android/chat/fragment/KikChatFragment$a;

    move-result-object v0

    .line 132
    iget-object v1, p0, Lkik/android/b/k;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v1}, Lcom/kik/cards/web/CardsWebViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->f()Lcom/kik/g/p;

    .line 133
    return-void
.end method
