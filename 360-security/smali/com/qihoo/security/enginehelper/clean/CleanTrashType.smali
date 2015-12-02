.class public final enum Lcom/qihoo/security/enginehelper/clean/CleanTrashType;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/enginehelper/clean/CleanTrashType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum APK:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

.field public static final enum BIGFILE:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

.field public static final enum CACHE:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

.field public static final enum PROCESS:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

.field public static final enum SYSTEM:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

.field public static final enum UNINSTALLED:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

.field private static final synthetic a:[Lcom/qihoo/security/enginehelper/clean/CleanTrashType;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 4
    new-instance v0, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    const-string/jumbo v1, "PROCESS"

    invoke-direct {v0, v1, v3}, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;->PROCESS:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    new-instance v0, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    const-string/jumbo v1, "CACHE"

    invoke-direct {v0, v1, v4}, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;->CACHE:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    new-instance v0, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    const-string/jumbo v1, "UNINSTALLED"

    invoke-direct {v0, v1, v5}, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;->UNINSTALLED:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    new-instance v0, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    const-string/jumbo v1, "APK"

    invoke-direct {v0, v1, v6}, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;->APK:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    new-instance v0, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    const-string/jumbo v1, "BIGFILE"

    invoke-direct {v0, v1, v7}, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;->BIGFILE:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    new-instance v0, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    const-string/jumbo v1, "SYSTEM"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;->SYSTEM:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    .line 3
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    sget-object v1, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;->PROCESS:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;->CACHE:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;->UNINSTALLED:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;->APK:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;->BIGFILE:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;->SYSTEM:Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;->a:[Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/enginehelper/clean/CleanTrashType;
    .locals 1

    .prologue
    .line 3
    const-class v0, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/enginehelper/clean/CleanTrashType;
    .locals 1

    .prologue
    .line 3
    sget-object v0, Lcom/qihoo/security/enginehelper/clean/CleanTrashType;->a:[Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    invoke-virtual {v0}, [Lcom/qihoo/security/enginehelper/clean/CleanTrashType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/enginehelper/clean/CleanTrashType;

    return-object v0
.end method
