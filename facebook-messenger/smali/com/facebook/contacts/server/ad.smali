.class public final enum Lcom/facebook/contacts/server/ad;
.super Ljava/lang/Enum;
.source "UploadBulkContactChange.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/contacts/server/ad;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/contacts/server/ad;

.field public static final enum ADD:Lcom/facebook/contacts/server/ad;

.field public static final enum DELETE:Lcom/facebook/contacts/server/ad;

.field public static final enum MODIFY:Lcom/facebook/contacts/server/ad;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 23
    new-instance v0, Lcom/facebook/contacts/server/ad;

    const-string v1, "ADD"

    invoke-direct {v0, v1, v2}, Lcom/facebook/contacts/server/ad;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/ad;->ADD:Lcom/facebook/contacts/server/ad;

    .line 24
    new-instance v0, Lcom/facebook/contacts/server/ad;

    const-string v1, "MODIFY"

    invoke-direct {v0, v1, v3}, Lcom/facebook/contacts/server/ad;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/ad;->MODIFY:Lcom/facebook/contacts/server/ad;

    .line 25
    new-instance v0, Lcom/facebook/contacts/server/ad;

    const-string v1, "DELETE"

    invoke-direct {v0, v1, v4}, Lcom/facebook/contacts/server/ad;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/ad;->DELETE:Lcom/facebook/contacts/server/ad;

    .line 22
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/contacts/server/ad;

    sget-object v1, Lcom/facebook/contacts/server/ad;->ADD:Lcom/facebook/contacts/server/ad;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/contacts/server/ad;->MODIFY:Lcom/facebook/contacts/server/ad;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/contacts/server/ad;->DELETE:Lcom/facebook/contacts/server/ad;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/contacts/server/ad;->$VALUES:[Lcom/facebook/contacts/server/ad;

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
    .line 22
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/contacts/server/ad;
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/facebook/contacts/server/ad;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/ad;

    return-object v0
.end method

.method public static values()[Lcom/facebook/contacts/server/ad;
    .locals 1

    .prologue
    .line 22
    sget-object v0, Lcom/facebook/contacts/server/ad;->$VALUES:[Lcom/facebook/contacts/server/ad;

    invoke-virtual {v0}, [Lcom/facebook/contacts/server/ad;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/contacts/server/ad;

    return-object v0
.end method
