.class public Lcom/facebook/orca/sms/ae;
.super Ljava/lang/Object;
.source "MmsSmsLogExternalMessagesBackgroundTask.java"


# static fields
.field static f:Lcom/facebook/orca/sms/ae;


# instance fields
.field final a:I

.field final b:I

.field final c:I

.field final d:I

.field final e:J


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 226
    new-instance v0, Lcom/facebook/orca/sms/ae;

    const-wide/16 v5, 0x0

    move v2, v1

    move v3, v1

    move v4, v1

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/sms/ae;-><init>(IIIIJ)V

    sput-object v0, Lcom/facebook/orca/sms/ae;->f:Lcom/facebook/orca/sms/ae;

    return-void
.end method

.method constructor <init>(IIIIJ)V
    .locals 0

    .prologue
    .line 233
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 234
    iput p1, p0, Lcom/facebook/orca/sms/ae;->a:I

    .line 235
    iput p2, p0, Lcom/facebook/orca/sms/ae;->b:I

    .line 236
    iput p3, p0, Lcom/facebook/orca/sms/ae;->c:I

    .line 237
    iput p4, p0, Lcom/facebook/orca/sms/ae;->d:I

    .line 238
    iput-wide p5, p0, Lcom/facebook/orca/sms/ae;->e:J

    .line 239
    return-void
.end method
