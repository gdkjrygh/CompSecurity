.class public final enum Lcom/facebook/orca/threadview/af;
.super Ljava/lang/Enum;
.source "RowReceiptItem.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/threadview/af;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/threadview/af;

.field public static final enum DELIVERED:Lcom/facebook/orca/threadview/af;

.field public static final enum FAILED_TO_SEND:Lcom/facebook/orca/threadview/af;

.field public static final enum GROUP_READ:Lcom/facebook/orca/threadview/af;

.field public static final enum PENDING:Lcom/facebook/orca/threadview/af;

.field public static final enum READ:Lcom/facebook/orca/threadview/af;

.field public static final enum SENT_BY_ME_TO_SERVER:Lcom/facebook/orca/threadview/af;

.field public static final enum SENT_FROM_RECEIPT:Lcom/facebook/orca/threadview/af;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 22
    new-instance v0, Lcom/facebook/orca/threadview/af;

    const-string v1, "PENDING"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/threadview/af;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/af;->PENDING:Lcom/facebook/orca/threadview/af;

    .line 23
    new-instance v0, Lcom/facebook/orca/threadview/af;

    const-string v1, "SENT_BY_ME_TO_SERVER"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/threadview/af;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/af;->SENT_BY_ME_TO_SERVER:Lcom/facebook/orca/threadview/af;

    .line 24
    new-instance v0, Lcom/facebook/orca/threadview/af;

    const-string v1, "FAILED_TO_SEND"

    invoke-direct {v0, v1, v5}, Lcom/facebook/orca/threadview/af;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/af;->FAILED_TO_SEND:Lcom/facebook/orca/threadview/af;

    .line 25
    new-instance v0, Lcom/facebook/orca/threadview/af;

    const-string v1, "SENT_FROM_RECEIPT"

    invoke-direct {v0, v1, v6}, Lcom/facebook/orca/threadview/af;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/af;->SENT_FROM_RECEIPT:Lcom/facebook/orca/threadview/af;

    .line 26
    new-instance v0, Lcom/facebook/orca/threadview/af;

    const-string v1, "READ"

    invoke-direct {v0, v1, v7}, Lcom/facebook/orca/threadview/af;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/af;->READ:Lcom/facebook/orca/threadview/af;

    .line 27
    new-instance v0, Lcom/facebook/orca/threadview/af;

    const-string v1, "DELIVERED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/threadview/af;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/af;->DELIVERED:Lcom/facebook/orca/threadview/af;

    .line 28
    new-instance v0, Lcom/facebook/orca/threadview/af;

    const-string v1, "GROUP_READ"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/threadview/af;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/af;->GROUP_READ:Lcom/facebook/orca/threadview/af;

    .line 21
    const/4 v0, 0x7

    new-array v0, v0, [Lcom/facebook/orca/threadview/af;

    sget-object v1, Lcom/facebook/orca/threadview/af;->PENDING:Lcom/facebook/orca/threadview/af;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/threadview/af;->SENT_BY_ME_TO_SERVER:Lcom/facebook/orca/threadview/af;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/orca/threadview/af;->FAILED_TO_SEND:Lcom/facebook/orca/threadview/af;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/orca/threadview/af;->SENT_FROM_RECEIPT:Lcom/facebook/orca/threadview/af;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/orca/threadview/af;->READ:Lcom/facebook/orca/threadview/af;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/orca/threadview/af;->DELIVERED:Lcom/facebook/orca/threadview/af;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/orca/threadview/af;->GROUP_READ:Lcom/facebook/orca/threadview/af;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/orca/threadview/af;->$VALUES:[Lcom/facebook/orca/threadview/af;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 21
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/threadview/af;
    .locals 1

    .prologue
    .line 21
    const-class v0, Lcom/facebook/orca/threadview/af;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/af;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/threadview/af;
    .locals 1

    .prologue
    .line 21
    sget-object v0, Lcom/facebook/orca/threadview/af;->$VALUES:[Lcom/facebook/orca/threadview/af;

    invoke-virtual {v0}, [Lcom/facebook/orca/threadview/af;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/threadview/af;

    return-object v0
.end method
