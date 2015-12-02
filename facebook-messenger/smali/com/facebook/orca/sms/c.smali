.class Lcom/facebook/orca/sms/c;
.super Ljava/lang/Object;
.source "FetchMmsSmsThreadListParams.java"


# instance fields
.field private final a:I

.field private final b:Ljava/lang/Long;

.field private final c:Ljava/lang/Long;


# direct methods
.method private constructor <init>(ILjava/lang/Long;Ljava/lang/Long;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    if-lez p1, :cond_2

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 14
    if-nez p2, :cond_0

    if-eqz p3, :cond_1

    :cond_0
    move v2, v1

    :cond_1
    invoke-static {v2}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 15
    iput p1, p0, Lcom/facebook/orca/sms/c;->a:I

    .line 16
    iput-object p2, p0, Lcom/facebook/orca/sms/c;->b:Ljava/lang/Long;

    .line 17
    iput-object p3, p0, Lcom/facebook/orca/sms/c;->c:Ljava/lang/Long;

    .line 18
    return-void

    :cond_2
    move v0, v2

    .line 13
    goto :goto_0
.end method

.method static a(IJ)Lcom/facebook/orca/sms/c;
    .locals 3

    .prologue
    .line 21
    new-instance v0, Lcom/facebook/orca/sms/c;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/facebook/orca/sms/c;-><init>(ILjava/lang/Long;Ljava/lang/Long;)V

    return-object v0
.end method

.method static b(IJ)Lcom/facebook/orca/sms/c;
    .locals 3

    .prologue
    .line 25
    new-instance v0, Lcom/facebook/orca/sms/c;

    const/4 v1, 0x0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/facebook/orca/sms/c;-><init>(ILjava/lang/Long;Ljava/lang/Long;)V

    return-object v0
.end method


# virtual methods
.method a()I
    .locals 1

    .prologue
    .line 29
    iget v0, p0, Lcom/facebook/orca/sms/c;->a:I

    return v0
.end method

.method b()Ljava/lang/Long;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/orca/sms/c;->b:Ljava/lang/Long;

    return-object v0
.end method

.method c()Ljava/lang/Long;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/sms/c;->c:Ljava/lang/Long;

    return-object v0
.end method
