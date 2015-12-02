.class public Lcom/facebook/orca/threads/p;
.super Ljava/lang/Object;
.source "ThreadParticipantBuilder.java"


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# instance fields
.field private a:Lcom/facebook/messages/model/threads/ParticipantInfo;

.field private b:Ljava/lang/String;

.field private c:Lcom/facebook/orca/notify/NotificationSetting;

.field private d:J

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/orca/threads/p;->a:Lcom/facebook/messages/model/threads/ParticipantInfo;

    return-object v0
.end method

.method public a(J)Lcom/facebook/orca/threads/p;
    .locals 0

    .prologue
    .line 62
    iput-wide p1, p0, Lcom/facebook/orca/threads/p;->d:J

    .line 63
    return-object p0
.end method

.method public a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/orca/threads/p;
    .locals 0

    .prologue
    .line 35
    iput-object p1, p0, Lcom/facebook/orca/threads/p;->a:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 36
    return-object p0
.end method

.method public a(Lcom/facebook/orca/notify/NotificationSetting;)Lcom/facebook/orca/threads/p;
    .locals 0

    .prologue
    .line 53
    iput-object p1, p0, Lcom/facebook/orca/threads/p;->c:Lcom/facebook/orca/notify/NotificationSetting;

    .line 54
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/orca/threads/p;
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/facebook/orca/threads/p;->b:Ljava/lang/String;

    .line 45
    return-object p0
.end method

.method public a(Lcom/facebook/orca/threads/ThreadParticipant;)V
    .locals 2

    .prologue
    .line 23
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/p;->a:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 24
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/p;->b:Ljava/lang/String;

    .line 25
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->h()Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/p;->c:Lcom/facebook/orca/notify/NotificationSetting;

    .line 26
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->i()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/threads/p;->d:J

    .line 27
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadParticipant;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threads/p;->e:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public b(Ljava/lang/String;)Lcom/facebook/orca/threads/p;
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lcom/facebook/orca/threads/p;->e:Ljava/lang/String;

    .line 72
    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/orca/threads/p;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/facebook/orca/notify/NotificationSetting;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/orca/threads/p;->c:Lcom/facebook/orca/notify/NotificationSetting;

    return-object v0
.end method

.method public d()J
    .locals 2

    .prologue
    .line 58
    iget-wide v0, p0, Lcom/facebook/orca/threads/p;->d:J

    return-wide v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/orca/threads/p;->e:Ljava/lang/String;

    return-object v0
.end method

.method public f()Lcom/facebook/orca/threads/ThreadParticipant;
    .locals 1

    .prologue
    .line 76
    new-instance v0, Lcom/facebook/orca/threads/ThreadParticipant;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threads/ThreadParticipant;-><init>(Lcom/facebook/orca/threads/p;)V

    return-object v0
.end method
