.class final Lkik/android/chat/fragment/co;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;)V
    .locals 0

    .prologue
    .line 1009
    iput-object p1, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPageScrollStateChanged(I)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 1053
    if-ne p1, v1, :cond_0

    .line 1054
    iget-object v0, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->c(Lkik/android/chat/fragment/KikChatFragment;Z)Z

    .line 1056
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->J(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_1

    .line 1057
    iget-object v0, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    sget-object v1, Lkik/android/chat/fragment/KikChatFragment$e;->g:Lkik/android/chat/fragment/KikChatFragment$e;

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->b(Lkik/android/chat/fragment/KikChatFragment;Lkik/android/chat/fragment/KikChatFragment$e;)V

    .line 1058
    iget-object v0, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->b(Lkik/android/chat/fragment/KikChatFragment;Z)Z

    .line 1060
    :cond_1
    return-void
.end method

.method public final onPageScrolled(IFI)V
    .locals 4

    .prologue
    .line 1013
    iget-object v0, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->J(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    float-to-double v0, p2

    const-wide v2, 0x3fefc6a7ef9db22dL    # 0.993

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    float-to-double v0, p2

    const-wide v2, 0x3f7cac083126e979L    # 0.007

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 1014
    iget-object v0, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->b(Lkik/android/chat/fragment/KikChatFragment;Z)Z

    .line 1015
    iget-object v0, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    sget-object v1, Lkik/android/chat/fragment/KikChatFragment$e;->f:Lkik/android/chat/fragment/KikChatFragment$e;

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Lkik/android/chat/fragment/KikChatFragment$e;)V

    .line 1017
    :cond_0
    return-void
.end method

.method public final onPageSelected(I)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 1022
    iget-object v0, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikChatFragment;->g:Lcom/kik/android/a;

    const-string v1, "Switched Tab"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Swipe"

    iget-object v2, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->M(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Start Tab"

    iget-object v2, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->K(Lkik/android/chat/fragment/KikChatFragment;)Lcom/kik/view/adapters/MediaTrayTabAdapter;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v3}, Lkik/android/chat/fragment/KikChatFragment;->L(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "End Tab"

    iget-object v2, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->K(Lkik/android/chat/fragment/KikChatFragment;)Lcom/kik/view/adapters/MediaTrayTabAdapter;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Maximized"

    iget-object v2, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Landscape"

    iget-object v2, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->g(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 1030
    iget-object v0, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0, v4}, Lkik/android/chat/fragment/KikChatFragment;->c(Lkik/android/chat/fragment/KikChatFragment;Z)Z

    .line 1031
    iget-object v0, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0, p1}, Lkik/android/chat/fragment/KikChatFragment;->c(Lkik/android/chat/fragment/KikChatFragment;I)V

    .line 1032
    iget-object v0, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0, p1}, Lkik/android/chat/fragment/KikChatFragment;->d(Lkik/android/chat/fragment/KikChatFragment;I)I

    .line 1035
    iget-object v0, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1036
    iget-object v0, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    sget-object v1, Lkik/android/chat/fragment/KikChatFragment$e;->c:Lkik/android/chat/fragment/KikChatFragment$e;

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Lkik/android/chat/fragment/KikChatFragment$e;)V

    .line 1042
    :goto_0
    const-string v0, "Camera"

    iget-object v1, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikChatFragment;->K(Lkik/android/chat/fragment/KikChatFragment;)Lcom/kik/view/adapters/MediaTrayTabAdapter;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikChatFragment;->L(Lkik/android/chat/fragment/KikChatFragment;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kik/view/adapters/MediaTrayTabAdapter;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1043
    iget-object v0, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->d(Lkik/android/chat/fragment/KikChatFragment;Z)V

    .line 1048
    :goto_1
    return-void

    .line 1039
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    sget-object v1, Lkik/android/chat/fragment/KikChatFragment$e;->b:Lkik/android/chat/fragment/KikChatFragment$e;

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Lkik/android/chat/fragment/KikChatFragment$e;)V

    goto :goto_0

    .line 1046
    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/co;->a:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0, v4}, Lkik/android/chat/fragment/KikChatFragment;->d(Lkik/android/chat/fragment/KikChatFragment;Z)V

    goto :goto_1
.end method
