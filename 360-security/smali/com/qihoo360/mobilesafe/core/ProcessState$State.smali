.class public final enum Lcom/qihoo360/mobilesafe/core/ProcessState$State;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/mobilesafe/core/ProcessState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo360/mobilesafe/core/ProcessState$State;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum STATE_CANCEL:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

.field public static final enum STATE_DOING:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

.field public static final enum STATE_FINISH:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

.field public static final enum STATE_NULL:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

.field public static final enum STATE_PREPARE:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

.field private static final synthetic a:[Lcom/qihoo360/mobilesafe/core/ProcessState$State;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 14
    new-instance v0, Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    const-string/jumbo v1, "STATE_NULL"

    invoke-direct {v0, v1, v2}, Lcom/qihoo360/mobilesafe/core/ProcessState$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->STATE_NULL:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    .line 15
    new-instance v0, Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    const-string/jumbo v1, "STATE_PREPARE"

    invoke-direct {v0, v1, v3}, Lcom/qihoo360/mobilesafe/core/ProcessState$State;-><init>(Ljava/lang/String;I)V

    .line 18
    sput-object v0, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->STATE_PREPARE:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    .line 20
    new-instance v0, Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    const-string/jumbo v1, "STATE_DOING"

    invoke-direct {v0, v1, v4}, Lcom/qihoo360/mobilesafe/core/ProcessState$State;-><init>(Ljava/lang/String;I)V

    .line 23
    sput-object v0, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->STATE_DOING:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    .line 25
    new-instance v0, Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    const-string/jumbo v1, "STATE_FINISH"

    invoke-direct {v0, v1, v5}, Lcom/qihoo360/mobilesafe/core/ProcessState$State;-><init>(Ljava/lang/String;I)V

    .line 28
    sput-object v0, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->STATE_FINISH:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    .line 30
    new-instance v0, Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    const-string/jumbo v1, "STATE_CANCEL"

    invoke-direct {v0, v1, v6}, Lcom/qihoo360/mobilesafe/core/ProcessState$State;-><init>(Ljava/lang/String;I)V

    .line 33
    sput-object v0, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->STATE_CANCEL:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    .line 13
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    sget-object v1, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->STATE_NULL:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    aput-object v1, v0, v2

    sget-object v1, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->STATE_PREPARE:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->STATE_DOING:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->STATE_FINISH:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    aput-object v1, v0, v5

    sget-object v1, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->STATE_CANCEL:Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    aput-object v1, v0, v6

    sput-object v0, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->a:[Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo360/mobilesafe/core/ProcessState$State;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    return-object v0
.end method

.method public static values()[Lcom/qihoo360/mobilesafe/core/ProcessState$State;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/qihoo360/mobilesafe/core/ProcessState$State;->a:[Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    array-length v1, v0

    new-array v2, v1, [Lcom/qihoo360/mobilesafe/core/ProcessState$State;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
