.class public Lcom/qihoo360/mobilesafe/core/ProcessState;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/mobilesafe/core/ProcessState$State;
    }
.end annotation


# instance fields
.field protected volatile b:Lcom/qihoo360/mobilesafe/core/ProcessState$State;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected b()V
    .locals 1

    .prologue
    .line 40
    sget-object v0, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->STATE_DOING:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/ProcessState;->b:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    .line 41
    return-void
.end method

.method protected c()V
    .locals 1

    .prologue
    .line 47
    sget-object v0, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->STATE_FINISH:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/ProcessState;->b:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    .line 48
    return-void
.end method

.method protected d()V
    .locals 1

    .prologue
    .line 54
    sget-object v0, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->STATE_PREPARE:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/core/ProcessState;->b:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    .line 55
    return-void
.end method

.method public e()Z
    .locals 3

    .prologue
    .line 63
    const/4 v0, 0x0

    .line 64
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/ProcessState;->b:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    sget-object v2, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->STATE_DOING:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/ProcessState;->b:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    sget-object v2, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->STATE_PREPARE:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    if-ne v1, v2, :cond_1

    .line 65
    :cond_0
    const/4 v0, 0x1

    .line 67
    :cond_1
    return v0
.end method
