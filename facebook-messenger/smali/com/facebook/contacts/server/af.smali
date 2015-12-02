.class public final enum Lcom/facebook/contacts/server/af;
.super Ljava/lang/Enum;
.source "UploadBulkContactChangeResult.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/contacts/server/af;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/contacts/server/af;

.field public static final enum HIGH:Lcom/facebook/contacts/server/af;

.field public static final enum LOW:Lcom/facebook/contacts/server/af;

.field public static final enum MEDIUM:Lcom/facebook/contacts/server/af;

.field public static final enum UNKNOWN:Lcom/facebook/contacts/server/af;

.field public static final enum VERY_LOW:Lcom/facebook/contacts/server/af;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 25
    new-instance v0, Lcom/facebook/contacts/server/af;

    const-string v1, "HIGH"

    invoke-direct {v0, v1, v2}, Lcom/facebook/contacts/server/af;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/af;->HIGH:Lcom/facebook/contacts/server/af;

    .line 26
    new-instance v0, Lcom/facebook/contacts/server/af;

    const-string v1, "MEDIUM"

    invoke-direct {v0, v1, v3}, Lcom/facebook/contacts/server/af;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/af;->MEDIUM:Lcom/facebook/contacts/server/af;

    .line 27
    new-instance v0, Lcom/facebook/contacts/server/af;

    const-string v1, "LOW"

    invoke-direct {v0, v1, v4}, Lcom/facebook/contacts/server/af;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/af;->LOW:Lcom/facebook/contacts/server/af;

    .line 28
    new-instance v0, Lcom/facebook/contacts/server/af;

    const-string v1, "VERY_LOW"

    invoke-direct {v0, v1, v5}, Lcom/facebook/contacts/server/af;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/af;->VERY_LOW:Lcom/facebook/contacts/server/af;

    .line 29
    new-instance v0, Lcom/facebook/contacts/server/af;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1, v6}, Lcom/facebook/contacts/server/af;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/af;->UNKNOWN:Lcom/facebook/contacts/server/af;

    .line 24
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/facebook/contacts/server/af;

    sget-object v1, Lcom/facebook/contacts/server/af;->HIGH:Lcom/facebook/contacts/server/af;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/contacts/server/af;->MEDIUM:Lcom/facebook/contacts/server/af;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/contacts/server/af;->LOW:Lcom/facebook/contacts/server/af;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/contacts/server/af;->VERY_LOW:Lcom/facebook/contacts/server/af;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/contacts/server/af;->UNKNOWN:Lcom/facebook/contacts/server/af;

    aput-object v1, v0, v6

    sput-object v0, Lcom/facebook/contacts/server/af;->$VALUES:[Lcom/facebook/contacts/server/af;

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
    .line 24
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/contacts/server/af;
    .locals 1

    .prologue
    .line 24
    const-class v0, Lcom/facebook/contacts/server/af;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/af;

    return-object v0
.end method

.method public static values()[Lcom/facebook/contacts/server/af;
    .locals 1

    .prologue
    .line 24
    sget-object v0, Lcom/facebook/contacts/server/af;->$VALUES:[Lcom/facebook/contacts/server/af;

    invoke-virtual {v0}, [Lcom/facebook/contacts/server/af;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/contacts/server/af;

    return-object v0
.end method
