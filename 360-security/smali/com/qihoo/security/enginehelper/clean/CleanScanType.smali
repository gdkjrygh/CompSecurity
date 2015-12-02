.class public final enum Lcom/qihoo/security/enginehelper/clean/CleanScanType;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/enginehelper/clean/CleanScanType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum FULL:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

.field public static final enum NOTIFICATION:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

.field public static final enum PREPOSE:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

.field private static final synthetic a:[Lcom/qihoo/security/enginehelper/clean/CleanScanType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 4
    new-instance v0, Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    const-string/jumbo v1, "FULL"

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/enginehelper/clean/CleanScanType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/enginehelper/clean/CleanScanType;->FULL:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    new-instance v0, Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    const-string/jumbo v1, "PREPOSE"

    invoke-direct {v0, v1, v3}, Lcom/qihoo/security/enginehelper/clean/CleanScanType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/enginehelper/clean/CleanScanType;->PREPOSE:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    new-instance v0, Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    const-string/jumbo v1, "NOTIFICATION"

    invoke-direct {v0, v1, v4}, Lcom/qihoo/security/enginehelper/clean/CleanScanType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/enginehelper/clean/CleanScanType;->NOTIFICATION:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    .line 3
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    sget-object v1, Lcom/qihoo/security/enginehelper/clean/CleanScanType;->FULL:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/qihoo/security/enginehelper/clean/CleanScanType;->PREPOSE:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo/security/enginehelper/clean/CleanScanType;->NOTIFICATION:Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/qihoo/security/enginehelper/clean/CleanScanType;->a:[Lcom/qihoo/security/enginehelper/clean/CleanScanType;

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
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/enginehelper/clean/CleanScanType;
    .locals 1

    .prologue
    .line 3
    const-class v0, Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/enginehelper/clean/CleanScanType;
    .locals 1

    .prologue
    .line 3
    sget-object v0, Lcom/qihoo/security/enginehelper/clean/CleanScanType;->a:[Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    invoke-virtual {v0}, [Lcom/qihoo/security/enginehelper/clean/CleanScanType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/enginehelper/clean/CleanScanType;

    return-object v0
.end method
