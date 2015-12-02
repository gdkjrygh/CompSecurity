.class public final enum Lcom/facebook/contacts/server/ag;
.super Ljava/lang/Enum;
.source "UploadBulkContactChangeResult.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/contacts/server/ag;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/contacts/server/ag;

.field public static final enum ADD:Lcom/facebook/contacts/server/ag;

.field public static final enum MODIFY:Lcom/facebook/contacts/server/ag;

.field public static final enum NONE:Lcom/facebook/contacts/server/ag;

.field public static final enum REMOVE:Lcom/facebook/contacts/server/ag;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 18
    new-instance v0, Lcom/facebook/contacts/server/ag;

    const-string v1, "ADD"

    invoke-direct {v0, v1, v2}, Lcom/facebook/contacts/server/ag;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/ag;->ADD:Lcom/facebook/contacts/server/ag;

    .line 19
    new-instance v0, Lcom/facebook/contacts/server/ag;

    const-string v1, "MODIFY"

    invoke-direct {v0, v1, v3}, Lcom/facebook/contacts/server/ag;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/ag;->MODIFY:Lcom/facebook/contacts/server/ag;

    .line 20
    new-instance v0, Lcom/facebook/contacts/server/ag;

    const-string v1, "REMOVE"

    invoke-direct {v0, v1, v4}, Lcom/facebook/contacts/server/ag;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/ag;->REMOVE:Lcom/facebook/contacts/server/ag;

    .line 21
    new-instance v0, Lcom/facebook/contacts/server/ag;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v5}, Lcom/facebook/contacts/server/ag;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/ag;->NONE:Lcom/facebook/contacts/server/ag;

    .line 17
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/contacts/server/ag;

    sget-object v1, Lcom/facebook/contacts/server/ag;->ADD:Lcom/facebook/contacts/server/ag;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/contacts/server/ag;->MODIFY:Lcom/facebook/contacts/server/ag;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/contacts/server/ag;->REMOVE:Lcom/facebook/contacts/server/ag;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/contacts/server/ag;->NONE:Lcom/facebook/contacts/server/ag;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/contacts/server/ag;->$VALUES:[Lcom/facebook/contacts/server/ag;

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
    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/contacts/server/ag;
    .locals 1

    .prologue
    .line 17
    const-class v0, Lcom/facebook/contacts/server/ag;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/ag;

    return-object v0
.end method

.method public static values()[Lcom/facebook/contacts/server/ag;
    .locals 1

    .prologue
    .line 17
    sget-object v0, Lcom/facebook/contacts/server/ag;->$VALUES:[Lcom/facebook/contacts/server/ag;

    invoke-virtual {v0}, [Lcom/facebook/contacts/server/ag;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/contacts/server/ag;

    return-object v0
.end method
