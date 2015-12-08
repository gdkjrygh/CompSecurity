.class public final Lkik/android/chat/fragment/KikChatFragment$a;
.super Lcom/kik/ui/fragment/FragmentBase$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/KikChatFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 5673
    invoke-direct {p0}, Lcom/kik/ui/fragment/FragmentBase$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatFragment$a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 5673
    const-string v0, "chatGroupJID"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment$a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lkik/android/chat/fragment/KikChatFragment$a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 5673
    const-string v0, "chatContactJID"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment$a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lkik/android/chat/fragment/KikChatFragment$a;)Z
    .locals 1

    .prologue
    .line 5673
    const-string v0, "showKeyBoard"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment$a;->f(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lkik/android/chat/fragment/KikChatFragment$a;)Z
    .locals 1

    .prologue
    .line 5673
    const-string v0, "kikchatPluginOpenedDirectly"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment$a;->f(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method static synthetic e(Lkik/android/chat/fragment/KikChatFragment$a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 5673
    const-string v0, "sessionId"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment$a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic f(Lkik/android/chat/fragment/KikChatFragment$a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 5673
    const-string v0, "campaignId"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment$a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic g(Lkik/android/chat/fragment/KikChatFragment$a;)Z
    .locals 1

    .prologue
    .line 5673
    const-string v0, "returnToMissedConvos"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatFragment$a;->f(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method static synthetic h(Lkik/android/chat/fragment/KikChatFragment$a;)Z
    .locals 2

    .prologue
    .line 5673
    const-string v0, "kik.chat.close.on.block"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikChatFragment$a;->b(Ljava/lang/String;Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method static synthetic i(Lkik/android/chat/fragment/KikChatFragment$a;)I
    .locals 2

    .prologue
    .line 5673
    const-string v0, "KikChatFragment.CardIndex"

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikChatFragment$a;->b(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method


# virtual methods
.method public final a()Lkik/android/chat/fragment/KikChatFragment$a;
    .locals 2

    .prologue
    .line 5736
    const-string v0, "returnToMissedConvos"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Ljava/lang/String;Z)V

    .line 5737
    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatFragment$a;
    .locals 1

    .prologue
    .line 5699
    if-eqz p1, :cond_0

    .line 5700
    const-string v0, "chatContactJID"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 5702
    :cond_0
    return-object p0
.end method

.method public final a(Lkik/a/d/f;Lkik/a/e/l;)Lkik/android/chat/fragment/KikChatFragment$a;
    .locals 2

    .prologue
    .line 5685
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    .line 5694
    :cond_0
    :goto_0
    return-object p0

    .line 5688
    :cond_1
    invoke-virtual {p1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lkik/a/e/l;->a(Ljava/lang/String;Z)Lkik/a/d/n;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 5689
    const-string v0, "chatGroupJID"

    invoke-virtual {p1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 5692
    :cond_2
    const-string v0, "chatContactJID"

    invoke-virtual {p1}, Lkik/a/d/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatFragment$a;
    .locals 2

    .prologue
    .line 5707
    if-eqz p1, :cond_0

    .line 5708
    const-string v0, "chatContactJID"

    invoke-virtual {p1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 5710
    :cond_0
    return-object p0
.end method

.method public final a(Z)Lkik/android/chat/fragment/KikChatFragment$a;
    .locals 1

    .prologue
    .line 5747
    const-string v0, "showKeyBoard"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Ljava/lang/String;Z)V

    .line 5748
    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatFragment$a;
    .locals 1

    .prologue
    .line 5725
    const-string v0, "campaignId"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 5726
    return-object p0
.end method

.method public final b(Z)Lkik/android/chat/fragment/KikChatFragment$a;
    .locals 1

    .prologue
    .line 5758
    const-string v0, "kikchatPluginOpenedDirectly"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Ljava/lang/String;Z)V

    .line 5759
    return-object p0
.end method

.method public final b()Z
    .locals 2

    .prologue
    .line 5781
    const-string v0, "skipTalkToCover"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikChatFragment$a;->b(Ljava/lang/String;Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final c(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatFragment$a;
    .locals 1

    .prologue
    .line 5769
    const-string v0, "sessionId"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 5770
    return-object p0
.end method

.method public final c(Z)Lkik/android/chat/fragment/KikChatFragment$a;
    .locals 1

    .prologue
    .line 5775
    const-string v0, "skipTalkToCover"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Ljava/lang/String;Z)V

    .line 5776
    return-object p0
.end method

.method public final d(Z)Lkik/android/chat/fragment/KikChatFragment$a;
    .locals 1

    .prologue
    .line 5802
    const-string v0, "kik.chat.close.on.block"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikChatFragment$a;->a(Ljava/lang/String;Z)V

    .line 5803
    return-object p0
.end method
