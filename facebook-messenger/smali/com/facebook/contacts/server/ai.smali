.class public final enum Lcom/facebook/contacts/server/ai;
.super Ljava/lang/Enum;
.source "UploadBulkContactFieldMatch.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/contacts/server/ai;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/contacts/server/ai;

.field public static final enum HARD:Lcom/facebook/contacts/server/ai;

.field public static final enum SOFT:Lcom/facebook/contacts/server/ai;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 21
    new-instance v0, Lcom/facebook/contacts/server/ai;

    const-string v1, "HARD"

    invoke-direct {v0, v1, v2}, Lcom/facebook/contacts/server/ai;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/ai;->HARD:Lcom/facebook/contacts/server/ai;

    .line 22
    new-instance v0, Lcom/facebook/contacts/server/ai;

    const-string v1, "SOFT"

    invoke-direct {v0, v1, v3}, Lcom/facebook/contacts/server/ai;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/ai;->SOFT:Lcom/facebook/contacts/server/ai;

    .line 20
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/contacts/server/ai;

    sget-object v1, Lcom/facebook/contacts/server/ai;->HARD:Lcom/facebook/contacts/server/ai;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/contacts/server/ai;->SOFT:Lcom/facebook/contacts/server/ai;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/contacts/server/ai;->$VALUES:[Lcom/facebook/contacts/server/ai;

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
    .line 20
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/contacts/server/ai;
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/facebook/contacts/server/ai;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/ai;

    return-object v0
.end method

.method public static values()[Lcom/facebook/contacts/server/ai;
    .locals 1

    .prologue
    .line 20
    sget-object v0, Lcom/facebook/contacts/server/ai;->$VALUES:[Lcom/facebook/contacts/server/ai;

    invoke-virtual {v0}, [Lcom/facebook/contacts/server/ai;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/contacts/server/ai;

    return-object v0
.end method
