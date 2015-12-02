.class Lcom/facebook/orca/sms/b;
.super Ljava/lang/Object;
.source "FetchMmsSmsMessagesParams.java"


# instance fields
.field private final a:J

.field private final b:I

.field private final c:Ljava/lang/Long;

.field private final d:Ljava/lang/Long;


# direct methods
.method private constructor <init>(JILjava/lang/Long;Ljava/lang/Long;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    if-ltz p3, :cond_2

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 19
    if-nez p4, :cond_0

    if-eqz p5, :cond_1

    :cond_0
    move v2, v1

    :cond_1
    invoke-static {v2}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 20
    iput-wide p1, p0, Lcom/facebook/orca/sms/b;->a:J

    .line 21
    iput p3, p0, Lcom/facebook/orca/sms/b;->b:I

    .line 22
    iput-object p4, p0, Lcom/facebook/orca/sms/b;->c:Ljava/lang/Long;

    .line 23
    iput-object p5, p0, Lcom/facebook/orca/sms/b;->d:Ljava/lang/Long;

    .line 24
    return-void

    :cond_2
    move v0, v2

    .line 18
    goto :goto_0
.end method

.method static a(JIJ)Lcom/facebook/orca/sms/b;
    .locals 6

    .prologue
    .line 27
    new-instance v0, Lcom/facebook/orca/sms/b;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const/4 v5, 0x0

    move-wide v1, p0

    move v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/sms/b;-><init>(JILjava/lang/Long;Ljava/lang/Long;)V

    return-object v0
.end method

.method static b(JIJ)Lcom/facebook/orca/sms/b;
    .locals 6

    .prologue
    .line 31
    new-instance v0, Lcom/facebook/orca/sms/b;

    const/4 v4, 0x0

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    move-wide v1, p0

    move v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/sms/b;-><init>(JILjava/lang/Long;Ljava/lang/Long;)V

    return-object v0
.end method


# virtual methods
.method a()J
    .locals 2

    .prologue
    .line 35
    iget-wide v0, p0, Lcom/facebook/orca/sms/b;->a:J

    return-wide v0
.end method

.method b()I
    .locals 1

    .prologue
    .line 39
    iget v0, p0, Lcom/facebook/orca/sms/b;->b:I

    return v0
.end method

.method c()Ljava/lang/Long;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/orca/sms/b;->c:Ljava/lang/Long;

    return-object v0
.end method

.method d()Ljava/lang/Long;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/orca/sms/b;->d:Ljava/lang/Long;

    return-object v0
.end method
