.class public final enum Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "StorageState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum INTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

.field public static final enum INTERNAL_EXTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

.field public static final enum INTERNAL_SYSTEM:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

.field public static final enum SYSTEM_INTERNAL_EXTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

.field private static final synthetic a:[Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 861
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    const-string/jumbo v1, "SYSTEM_INTERNAL_EXTERNAL"

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->SYSTEM_INTERNAL_EXTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    .line 866
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    const-string/jumbo v1, "INTERNAL_SYSTEM"

    invoke-direct {v0, v1, v3}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->INTERNAL_SYSTEM:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    .line 871
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    const-string/jumbo v1, "INTERNAL"

    invoke-direct {v0, v1, v4}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->INTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    .line 876
    new-instance v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    const-string/jumbo v1, "INTERNAL_EXTERNAL"

    invoke-direct {v0, v1, v5}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->INTERNAL_EXTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    .line 857
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->SYSTEM_INTERNAL_EXTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->INTERNAL_SYSTEM:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->INTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->INTERNAL_EXTERNAL:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    aput-object v1, v0, v5

    sput-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->a:[Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

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
    .line 857
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;
    .locals 1

    .prologue
    .line 857
    const-class v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;
    .locals 1

    .prologue
    .line 857
    sget-object v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->a:[Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    invoke-virtual {v0}, [Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState;

    return-object v0
.end method
