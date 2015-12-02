.class public Lcom/facebook/orca/common/ui/widgets/text/a;
.super Ljava/lang/Object;
.source "MessengerThreadNameViewDataFactory.java"


# instance fields
.field private final a:Lcom/facebook/orca/f/z;

.field private final b:Lcom/facebook/orca/threads/q;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/f/z;Lcom/facebook/orca/threads/q;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/facebook/orca/common/ui/widgets/text/a;->a:Lcom/facebook/orca/f/z;

    .line 30
    iput-object p2, p0, Lcom/facebook/orca/common/ui/widgets/text/a;->b:Lcom/facebook/orca/threads/q;

    .line 31
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threadview/v;
    .locals 8

    .prologue
    const/4 v0, 0x0

    .line 34
    if-nez p1, :cond_0

    .line 43
    :goto_0
    return-object v0

    .line 37
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/text/a;->b:Lcom/facebook/orca/threads/q;

    invoke-virtual {v1, p1}, Lcom/facebook/orca/threads/q;->b(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v1

    .line 39
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadParticipant;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v5

    .line 41
    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadParticipant;->i()J

    move-result-wide v6

    .line 43
    :goto_2
    new-instance v0, Lcom/facebook/orca/threadview/v;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->f()Z

    move-result v1

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->g()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/orca/common/ui/widgets/text/a;->a:Lcom/facebook/orca/f/z;

    invoke-virtual {v3, p1}, Lcom/facebook/orca/f/z;->a(Lcom/facebook/orca/threads/ThreadSummary;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v3

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v4

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/threadview/v;-><init>(ZLjava/lang/String;Lcom/google/common/a/es;ZLcom/facebook/messages/model/threads/ParticipantInfo;J)V

    goto :goto_0

    :cond_1
    move-object v5, v0

    .line 39
    goto :goto_1

    .line 41
    :cond_2
    const-wide/16 v6, -0x1

    goto :goto_2
.end method

.method public a(Lcom/facebook/user/RecipientInfo;)Lcom/facebook/orca/threadview/v;
    .locals 8

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 73
    if-nez p1, :cond_0

    .line 81
    :goto_0
    return-object v2

    .line 76
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/user/RecipientInfo;->c()Ljava/lang/String;

    move-result-object v3

    .line 77
    new-instance v5, Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {p1}, Lcom/facebook/user/RecipientInfo;->a()Lcom/facebook/user/UserIdentifier;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/user/UserKey;->a(Lcom/facebook/user/UserIdentifier;)Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-direct {v5, v0, v3}, Lcom/facebook/messages/model/threads/ParticipantInfo;-><init>(Lcom/facebook/user/UserKey;Ljava/lang/String;)V

    .line 81
    new-instance v0, Lcom/facebook/orca/threadview/v;

    invoke-static {v3}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v3

    const-wide/16 v6, -0x1

    move v4, v1

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/threadview/v;-><init>(ZLjava/lang/String;Lcom/google/common/a/es;ZLcom/facebook/messages/model/threads/ParticipantInfo;J)V

    move-object v2, v0

    goto :goto_0
.end method

.method public a(Lcom/facebook/user/User;)Lcom/facebook/orca/threadview/v;
    .locals 8

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 54
    if-nez p1, :cond_0

    .line 62
    :goto_0
    return-object v2

    .line 57
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/user/User;->h()Ljava/lang/String;

    move-result-object v3

    .line 58
    new-instance v5, Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {p1}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-direct {v5, v0, v3}, Lcom/facebook/messages/model/threads/ParticipantInfo;-><init>(Lcom/facebook/user/UserKey;Ljava/lang/String;)V

    .line 62
    new-instance v0, Lcom/facebook/orca/threadview/v;

    invoke-static {v3}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v3

    const-wide/16 v6, -0x1

    move v4, v1

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/threadview/v;-><init>(ZLjava/lang/String;Lcom/google/common/a/es;ZLcom/facebook/messages/model/threads/ParticipantInfo;J)V

    move-object v2, v0

    goto :goto_0
.end method
