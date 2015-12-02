.class public final enum Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Status"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum FINISHED:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

.field public static final enum PENDING:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

.field public static final enum RUNNING:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

.field private static final synthetic a:[Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 241
    new-instance v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    const-string/jumbo v1, "PENDING"

    invoke-direct {v0, v1, v2}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;-><init>(Ljava/lang/String;I)V

    .line 244
    sput-object v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->PENDING:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    .line 245
    new-instance v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    const-string/jumbo v1, "RUNNING"

    invoke-direct {v0, v1, v3}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;-><init>(Ljava/lang/String;I)V

    .line 248
    sput-object v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->RUNNING:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    .line 249
    new-instance v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    const-string/jumbo v1, "FINISHED"

    invoke-direct {v0, v1, v4}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;-><init>(Ljava/lang/String;I)V

    .line 252
    sput-object v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->FINISHED:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    .line 240
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    sget-object v1, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->PENDING:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    aput-object v1, v0, v2

    sget-object v1, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->RUNNING:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->FINISHED:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    aput-object v1, v0, v4

    sput-object v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->a:[Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 240
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    return-object v0
.end method

.method public static values()[Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;->a:[Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    array-length v1, v0

    new-array v2, v1, [Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$Status;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
