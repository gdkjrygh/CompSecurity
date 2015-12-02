.class Lcom/facebook/orca/sms/f;
.super Ljava/lang/Object;
.source "FetchMmsSmsThreadSummaryResult.java"


# instance fields
.field private final a:J

.field private final b:J

.field private final c:J

.field private final d:Z

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Lcom/facebook/messages/model/threads/ParticipantInfo;


# direct methods
.method constructor <init>(JJJZLjava/lang/String;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-wide p1, p0, Lcom/facebook/orca/sms/f;->a:J

    .line 40
    iput-wide p3, p0, Lcom/facebook/orca/sms/f;->b:J

    .line 41
    iput-wide p5, p0, Lcom/facebook/orca/sms/f;->c:J

    .line 42
    iput-boolean p7, p0, Lcom/facebook/orca/sms/f;->d:Z

    .line 43
    iput-object p8, p0, Lcom/facebook/orca/sms/f;->e:Ljava/lang/String;

    .line 44
    iput-object v0, p0, Lcom/facebook/orca/sms/f;->f:Ljava/lang/String;

    .line 45
    iput-object v0, p0, Lcom/facebook/orca/sms/f;->g:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 46
    return-void
.end method

.method constructor <init>(JJJZLjava/lang/String;Ljava/lang/String;Lcom/facebook/messages/model/threads/ParticipantInfo;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-wide p1, p0, Lcom/facebook/orca/sms/f;->a:J

    .line 25
    iput-wide p3, p0, Lcom/facebook/orca/sms/f;->b:J

    .line 26
    iput-wide p5, p0, Lcom/facebook/orca/sms/f;->c:J

    .line 27
    iput-boolean p7, p0, Lcom/facebook/orca/sms/f;->d:Z

    .line 28
    iput-object p8, p0, Lcom/facebook/orca/sms/f;->e:Ljava/lang/String;

    .line 29
    iput-object p9, p0, Lcom/facebook/orca/sms/f;->f:Ljava/lang/String;

    .line 30
    iput-object p10, p0, Lcom/facebook/orca/sms/f;->g:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 31
    return-void
.end method

.method static a(Lcom/facebook/orca/sms/f;Ljava/lang/String;Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/orca/sms/f;
    .locals 11

    .prologue
    .line 52
    new-instance v0, Lcom/facebook/orca/sms/f;

    iget-wide v1, p0, Lcom/facebook/orca/sms/f;->a:J

    iget-wide v3, p0, Lcom/facebook/orca/sms/f;->b:J

    iget-wide v5, p0, Lcom/facebook/orca/sms/f;->c:J

    iget-boolean v7, p0, Lcom/facebook/orca/sms/f;->d:Z

    iget-object v8, p0, Lcom/facebook/orca/sms/f;->e:Ljava/lang/String;

    move-object v9, p1

    move-object v10, p2

    invoke-direct/range {v0 .. v10}, Lcom/facebook/orca/sms/f;-><init>(JJJZLjava/lang/String;Ljava/lang/String;Lcom/facebook/messages/model/threads/ParticipantInfo;)V

    return-object v0
.end method


# virtual methods
.method a()J
    .locals 2

    .prologue
    .line 63
    iget-wide v0, p0, Lcom/facebook/orca/sms/f;->a:J

    return-wide v0
.end method

.method b()J
    .locals 2

    .prologue
    .line 67
    iget-wide v0, p0, Lcom/facebook/orca/sms/f;->b:J

    return-wide v0
.end method

.method c()J
    .locals 2

    .prologue
    .line 71
    iget-wide v0, p0, Lcom/facebook/orca/sms/f;->c:J

    return-wide v0
.end method

.method d()Z
    .locals 1

    .prologue
    .line 75
    iget-boolean v0, p0, Lcom/facebook/orca/sms/f;->d:Z

    return v0
.end method

.method e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/orca/sms/f;->e:Ljava/lang/String;

    return-object v0
.end method

.method f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/orca/sms/f;->f:Ljava/lang/String;

    return-object v0
.end method

.method g()Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/facebook/orca/sms/f;->g:Lcom/facebook/messages/model/threads/ParticipantInfo;

    return-object v0
.end method
