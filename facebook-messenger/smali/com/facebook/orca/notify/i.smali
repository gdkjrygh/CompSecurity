.class public Lcom/facebook/orca/notify/i;
.super Lcom/facebook/orca/notify/ai;
.source "FailedToSendMessageNotification.java"


# instance fields
.field private final b:Ljava/lang/String;

.field private c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 20
    sget-object v0, Lcom/facebook/orca/notify/aj;->FAILED_TO_SEND:Lcom/facebook/orca/notify/aj;

    invoke-direct {p0, v0}, Lcom/facebook/orca/notify/ai;-><init>(Lcom/facebook/orca/notify/aj;)V

    .line 21
    iput-object p1, p0, Lcom/facebook/orca/notify/i;->b:Ljava/lang/String;

    .line 22
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/orca/notify/i;->b:Ljava/lang/String;

    return-object v0
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 34
    iput-boolean p1, p0, Lcom/facebook/orca/notify/i;->c:Z

    .line 35
    return-void
.end method
