.class public final enum Lcom/qihoo/security/v5/DownloadStatus;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/v5/DownloadStatus;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum DOWNLOADING:Lcom/qihoo/security/v5/DownloadStatus;

.field public static final enum FAILED:Lcom/qihoo/security/v5/DownloadStatus;

.field public static final enum IDLE:Lcom/qihoo/security/v5/DownloadStatus;

.field public static final enum PAUSED:Lcom/qihoo/security/v5/DownloadStatus;

.field public static final enum PENDING:Lcom/qihoo/security/v5/DownloadStatus;

.field public static final enum SUCCESS:Lcom/qihoo/security/v5/DownloadStatus;

.field private static final synthetic a:[Lcom/qihoo/security/v5/DownloadStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 11
    new-instance v0, Lcom/qihoo/security/v5/DownloadStatus;

    const-string/jumbo v1, "PENDING"

    invoke-direct {v0, v1, v3}, Lcom/qihoo/security/v5/DownloadStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/v5/DownloadStatus;->PENDING:Lcom/qihoo/security/v5/DownloadStatus;

    new-instance v0, Lcom/qihoo/security/v5/DownloadStatus;

    const-string/jumbo v1, "DOWNLOADING"

    invoke-direct {v0, v1, v4}, Lcom/qihoo/security/v5/DownloadStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/v5/DownloadStatus;->DOWNLOADING:Lcom/qihoo/security/v5/DownloadStatus;

    new-instance v0, Lcom/qihoo/security/v5/DownloadStatus;

    const-string/jumbo v1, "PAUSED"

    invoke-direct {v0, v1, v5}, Lcom/qihoo/security/v5/DownloadStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/v5/DownloadStatus;->PAUSED:Lcom/qihoo/security/v5/DownloadStatus;

    new-instance v0, Lcom/qihoo/security/v5/DownloadStatus;

    const-string/jumbo v1, "SUCCESS"

    invoke-direct {v0, v1, v6}, Lcom/qihoo/security/v5/DownloadStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/v5/DownloadStatus;->SUCCESS:Lcom/qihoo/security/v5/DownloadStatus;

    new-instance v0, Lcom/qihoo/security/v5/DownloadStatus;

    const-string/jumbo v1, "FAILED"

    invoke-direct {v0, v1, v7}, Lcom/qihoo/security/v5/DownloadStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/v5/DownloadStatus;->FAILED:Lcom/qihoo/security/v5/DownloadStatus;

    new-instance v0, Lcom/qihoo/security/v5/DownloadStatus;

    const-string/jumbo v1, "IDLE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/v5/DownloadStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/v5/DownloadStatus;->IDLE:Lcom/qihoo/security/v5/DownloadStatus;

    .line 10
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/qihoo/security/v5/DownloadStatus;

    sget-object v1, Lcom/qihoo/security/v5/DownloadStatus;->PENDING:Lcom/qihoo/security/v5/DownloadStatus;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo/security/v5/DownloadStatus;->DOWNLOADING:Lcom/qihoo/security/v5/DownloadStatus;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo/security/v5/DownloadStatus;->PAUSED:Lcom/qihoo/security/v5/DownloadStatus;

    aput-object v1, v0, v5

    sget-object v1, Lcom/qihoo/security/v5/DownloadStatus;->SUCCESS:Lcom/qihoo/security/v5/DownloadStatus;

    aput-object v1, v0, v6

    sget-object v1, Lcom/qihoo/security/v5/DownloadStatus;->FAILED:Lcom/qihoo/security/v5/DownloadStatus;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/qihoo/security/v5/DownloadStatus;->IDLE:Lcom/qihoo/security/v5/DownloadStatus;

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo/security/v5/DownloadStatus;->a:[Lcom/qihoo/security/v5/DownloadStatus;

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
    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/v5/DownloadStatus;
    .locals 1

    .prologue
    .line 10
    const-class v0, Lcom/qihoo/security/v5/DownloadStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/v5/DownloadStatus;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/v5/DownloadStatus;
    .locals 1

    .prologue
    .line 10
    sget-object v0, Lcom/qihoo/security/v5/DownloadStatus;->a:[Lcom/qihoo/security/v5/DownloadStatus;

    invoke-virtual {v0}, [Lcom/qihoo/security/v5/DownloadStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/v5/DownloadStatus;

    return-object v0
.end method
