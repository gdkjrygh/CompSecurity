.class public final enum Lcom/facebook/orca/attachments/f;
.super Ljava/lang/Enum;
.source "ImageAttachmentData.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/attachments/f;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/attachments/f;

.field public static final enum LANDSCAPE:Lcom/facebook/orca/attachments/f;

.field public static final enum PORTRAIT:Lcom/facebook/orca/attachments/f;

.field public static final enum SQUARE:Lcom/facebook/orca/attachments/f;

.field public static final enum UNKNOWN:Lcom/facebook/orca/attachments/f;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 20
    new-instance v0, Lcom/facebook/orca/attachments/f;

    const-string v1, "LANDSCAPE"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/attachments/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/attachments/f;->LANDSCAPE:Lcom/facebook/orca/attachments/f;

    .line 21
    new-instance v0, Lcom/facebook/orca/attachments/f;

    const-string v1, "PORTRAIT"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/attachments/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/attachments/f;->PORTRAIT:Lcom/facebook/orca/attachments/f;

    .line 22
    new-instance v0, Lcom/facebook/orca/attachments/f;

    const-string v1, "SQUARE"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/attachments/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/attachments/f;->SQUARE:Lcom/facebook/orca/attachments/f;

    .line 23
    new-instance v0, Lcom/facebook/orca/attachments/f;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1, v5}, Lcom/facebook/orca/attachments/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/attachments/f;->UNKNOWN:Lcom/facebook/orca/attachments/f;

    .line 19
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/orca/attachments/f;

    sget-object v1, Lcom/facebook/orca/attachments/f;->LANDSCAPE:Lcom/facebook/orca/attachments/f;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/attachments/f;->PORTRAIT:Lcom/facebook/orca/attachments/f;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/attachments/f;->SQUARE:Lcom/facebook/orca/attachments/f;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/orca/attachments/f;->UNKNOWN:Lcom/facebook/orca/attachments/f;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/orca/attachments/f;->$VALUES:[Lcom/facebook/orca/attachments/f;

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
    .line 19
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/attachments/f;
    .locals 1

    .prologue
    .line 19
    const-class v0, Lcom/facebook/orca/attachments/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/attachments/f;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/attachments/f;
    .locals 1

    .prologue
    .line 19
    sget-object v0, Lcom/facebook/orca/attachments/f;->$VALUES:[Lcom/facebook/orca/attachments/f;

    invoke-virtual {v0}, [Lcom/facebook/orca/attachments/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/attachments/f;

    return-object v0
.end method
