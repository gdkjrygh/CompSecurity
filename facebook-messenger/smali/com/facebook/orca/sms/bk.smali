.class public Lcom/facebook/orca/sms/bk;
.super Ljava/lang/Object;
.source "MmsSmsUserUtils.java"


# instance fields
.field private final a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/orca/p/a;

.field private final c:Lcom/facebook/user/i;


# direct methods
.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/orca/p/a;Lcom/facebook/user/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;",
            "Lcom/facebook/orca/p/a;",
            "Lcom/facebook/user/i;",
            ")V"
        }
    .end annotation

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/facebook/orca/sms/bk;->a:Ljavax/inject/a;

    .line 32
    iput-object p2, p0, Lcom/facebook/orca/sms/bk;->b:Lcom/facebook/orca/p/a;

    .line 33
    iput-object p3, p0, Lcom/facebook/orca/sms/bk;->c:Lcom/facebook/user/i;

    .line 34
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/user/User;
    .locals 4

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/orca/sms/bk;->c:Lcom/facebook/user/i;

    invoke-virtual {v0, p1}, Lcom/facebook/user/i;->a(Ljava/lang/String;)Lcom/facebook/user/j;

    move-result-object v0

    .line 92
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/facebook/user/j;->a(I)Lcom/facebook/user/UserPhoneNumber;

    move-result-object v1

    .line 94
    invoke-static {p2}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 95
    invoke-virtual {v0}, Lcom/facebook/user/j;->c()Ljava/lang/String;

    move-result-object p2

    .line 97
    :cond_0
    new-instance v2, Lcom/facebook/user/o;

    invoke-direct {v2}, Lcom/facebook/user/o;-><init>()V

    sget-object v3, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    invoke-virtual {v0}, Lcom/facebook/user/j;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/facebook/user/o;->a(Lcom/facebook/user/n;Ljava/lang/String;)Lcom/facebook/user/o;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/user/o;->a(Ljava/lang/String;)Lcom/facebook/user/o;

    move-result-object v0

    invoke-static {v1}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/user/o;->b(Ljava/util/List;)Lcom/facebook/user/o;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/facebook/user/o;->b(Ljava/lang/String;)Lcom/facebook/user/o;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/facebook/user/o;->c(Ljava/lang/String;)Lcom/facebook/user/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/o;->x()Lcom/facebook/user/User;

    move-result-object v0

    .line 104
    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 5

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/orca/sms/bk;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 58
    invoke-virtual {v0}, Lcom/facebook/user/User;->a()Lcom/facebook/user/n;

    move-result-object v1

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v1, v2, :cond_0

    .line 59
    new-instance v1, Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/user/User;->h()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/facebook/user/User;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "@facebook.com"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v3, v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;-><init>(Lcom/facebook/user/UserKey;Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v1

    .line 64
    :goto_0
    return-object v0

    .line 63
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/user/User;->a()Lcom/facebook/user/n;

    move-result-object v1

    sget-object v2, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    if-ne v1, v2, :cond_1

    .line 64
    new-instance v1, Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/user/User;->h()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;-><init>(Lcom/facebook/user/UserKey;Ljava/lang/String;)V

    move-object v0, v1

    goto :goto_0

    .line 68
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid me user type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Lcom/facebook/user/User;)Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 73
    invoke-virtual {p1}, Lcom/facebook/user/User;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v3, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    if-ne v0, v3, :cond_1

    move v0, v1

    :goto_0
    const-string v3, "Expecting User of type PHONE_NUMBER, was given User of type %s"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/facebook/user/User;->a()Lcom/facebook/user/n;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 78
    invoke-virtual {p1}, Lcom/facebook/user/User;->b()Ljava/lang/String;

    move-result-object v0

    .line 79
    iget-object v1, p0, Lcom/facebook/orca/sms/bk;->c:Lcom/facebook/user/i;

    invoke-virtual {v1, v0}, Lcom/facebook/user/i;->a(Ljava/lang/String;)Lcom/facebook/user/j;

    move-result-object v1

    .line 80
    invoke-virtual {v1}, Lcom/facebook/user/j;->c()Ljava/lang/String;

    move-result-object v0

    .line 81
    if-eqz p1, :cond_0

    .line 82
    invoke-virtual {p1}, Lcom/facebook/user/User;->g()Ljava/lang/String;

    move-result-object v0

    .line 84
    :cond_0
    new-instance v2, Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v1}, Lcom/facebook/user/j;->d()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;-><init>(Lcom/facebook/user/UserKey;Ljava/lang/String;)V

    return-object v2

    :cond_1
    move v0, v2

    .line 73
    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/user/User;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 39
    iget-object v1, p0, Lcom/facebook/orca/sms/bk;->b:Lcom/facebook/orca/p/a;

    invoke-virtual {v1, p1}, Lcom/facebook/orca/p/a;->a(Ljava/lang/String;)V

    .line 41
    :try_start_0
    iget-object v1, p0, Lcom/facebook/orca/sms/bk;->b:Lcom/facebook/orca/p/a;

    invoke-virtual {v1}, Lcom/facebook/orca/p/a;->b()Lcom/facebook/user/User;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 43
    iget-object v1, p0, Lcom/facebook/orca/sms/bk;->b:Lcom/facebook/orca/p/a;

    invoke-virtual {v1}, Lcom/facebook/orca/p/a;->a()V

    .line 48
    if-eqz v2, :cond_0

    .line 49
    invoke-virtual {v2}, Lcom/facebook/user/User;->h()Ljava/lang/String;

    move-result-object v1

    .line 50
    invoke-virtual {v2}, Lcom/facebook/user/User;->q()Ljava/lang/String;

    move-result-object v0

    .line 52
    :goto_0
    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/orca/sms/bk;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/user/User;

    move-result-object v0

    .line 53
    return-object v0

    .line 43
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/facebook/orca/sms/bk;->b:Lcom/facebook/orca/p/a;

    invoke-virtual {v1}, Lcom/facebook/orca/p/a;->a()V

    throw v0

    :cond_0
    move-object v1, v0

    goto :goto_0
.end method
