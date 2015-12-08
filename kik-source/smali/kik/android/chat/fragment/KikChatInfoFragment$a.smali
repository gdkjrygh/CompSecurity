.class public final Lkik/android/chat/fragment/KikChatInfoFragment$a;
.super Lcom/kik/ui/fragment/FragmentBase$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/KikChatInfoFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 1760
    invoke-direct {p0}, Lcom/kik/ui/fragment/FragmentBase$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lkik/android/chat/fragment/KikChatInfoFragment$a;)I
    .locals 2

    .prologue
    .line 1760
    const-string v0, "kik.prof.extra.actiontype"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->b(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1788
    const-string v0, "kik.chat.origin"

    const-string v1, "kik.chat.origin.unknown"

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatInfoFragment$a;
    .locals 1

    .prologue
    .line 1782
    const-string v0, "kik.chat.origin"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1783
    return-object p0
.end method

.method public final a(Lkik/a/d/k;)Lkik/android/chat/fragment/KikChatInfoFragment$a;
    .locals 1

    .prologue
    .line 1908
    if-nez p1, :cond_0

    const/4 v0, 0x0

    .line 1909
    :goto_0
    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->d(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatInfoFragment$a;

    move-result-object v0

    return-object v0

    .line 1908
    :cond_0
    invoke-virtual {p1}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Lkik/android/scan/a/c;)Lkik/android/chat/fragment/KikChatInfoFragment$a;
    .locals 2

    .prologue
    .line 1926
    if-eqz p1, :cond_0

    .line 1927
    const-string v0, "kik.chat.info.scan.nonce"

    invoke-virtual {p1}, Lkik/android/scan/a/c;->c()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Ljava/lang/String;I)V

    .line 1928
    const-string v0, "kik.chat.info.scan.data"

    invoke-virtual {p1}, Lkik/android/scan/a/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1929
    const-string v0, "kik.chat.info.scan.invite"

    invoke-virtual {p1}, Lkik/android/scan/a/c;->d()[B

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Ljava/lang/String;[B)V

    .line 1930
    const-string v0, "kik.chat.info.scan.bytes"

    invoke-virtual {p1}, Lkik/android/scan/a/c;->a()[B

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Ljava/lang/String;[B)V

    .line 1932
    :cond_0
    return-object p0
.end method

.method public final a(Z)Lkik/android/chat/fragment/KikChatInfoFragment$a;
    .locals 1

    .prologue
    .line 1825
    const-string v0, "returnToMissedConvos"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Ljava/lang/String;Z)V

    .line 1826
    return-object p0
.end method

.method public final b()Lkik/android/chat/fragment/KikChatInfoFragment$a;
    .locals 2

    .prologue
    .line 1814
    const-string v0, "groupExtraRestrictAdd"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Ljava/lang/String;Z)V

    .line 1815
    return-object p0
.end method

.method public final b(I)Lkik/android/chat/fragment/KikChatInfoFragment$a;
    .locals 1

    .prologue
    .line 1847
    const-string v0, "kik.prof.extra.actiontype"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Ljava/lang/String;I)V

    .line 1848
    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatInfoFragment$a;
    .locals 1

    .prologue
    .line 1803
    const-string v0, "fromConversationId"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1804
    return-object p0
.end method

.method public final b(Z)Lkik/android/chat/fragment/KikChatInfoFragment$a;
    .locals 1

    .prologue
    .line 1858
    const-string v0, "kik.prof.extra.finishpromise"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Ljava/lang/String;Z)V

    .line 1859
    return-object p0
.end method

.method public final c()Lkik/android/chat/fragment/KikChatInfoFragment$a;
    .locals 2

    .prologue
    .line 1891
    const-string v0, "isFiltered"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Ljava/lang/String;Z)V

    .line 1892
    return-object p0
.end method

.method public final c(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatInfoFragment$a;
    .locals 1

    .prologue
    .line 1836
    const-string v0, "sessionId"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1837
    return-object p0
.end method

.method public final c(Z)Lkik/android/chat/fragment/KikChatInfoFragment$a;
    .locals 1

    .prologue
    .line 1869
    const-string v0, "showKeyBoard"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Ljava/lang/String;Z)V

    .line 1870
    return-object p0
.end method

.method public final d(Ljava/lang/String;)Lkik/android/chat/fragment/KikChatInfoFragment$a;
    .locals 1

    .prologue
    .line 1902
    const-string v0, "kik.prof.extra.jid"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1903
    return-object p0
.end method

.method public final d(Z)Lkik/android/chat/fragment/KikChatInfoFragment$a;
    .locals 1

    .prologue
    .line 1880
    const-string v0, "showSelectAsSendTo"

    invoke-virtual {p0, v0, p1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->a(Ljava/lang/String;Z)V

    .line 1881
    return-object p0
.end method

.method public final d()Lkik/android/scan/a/c;
    .locals 4

    .prologue
    .line 1914
    const-string v0, "kik.chat.info.scan.bytes"

    invoke-virtual {p0, v0}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->h(Ljava/lang/String;)[B

    move-result-object v0

    .line 1915
    if-nez v0, :cond_0

    .line 1916
    const/4 v0, 0x0

    .line 1921
    :goto_0
    return-object v0

    .line 1918
    :cond_0
    const-string v1, "kik.chat.info.scan.invite"

    invoke-virtual {p0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->h(Ljava/lang/String;)[B

    move-result-object v1

    .line 1919
    const-string v2, "kik.chat.info.scan.nonce"

    invoke-virtual {p0, v2}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->i(Ljava/lang/String;)S

    move-result v2

    .line 1920
    const-string v3, "kik.chat.info.scan.data"

    invoke-virtual {p0, v3}, Lkik/android/chat/fragment/KikChatInfoFragment$a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1921
    invoke-static {v0, v1, v3, v2}, Lkik/android/scan/a/c;->a([B[BLjava/lang/String;S)Lkik/android/scan/a/c;

    move-result-object v0

    goto :goto_0
.end method
