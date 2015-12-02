.class public final enum Lcom/facebook/contacts/data/ad;
.super Ljava/lang/Enum;
.source "FbContactsContract.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/contacts/data/ad;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/contacts/data/ad;

.field public static final enum NAME:Lcom/facebook/contacts/data/ad;

.field public static final enum PHONE_E164:Lcom/facebook/contacts/data/ad;

.field public static final enum PHONE_LOCAL:Lcom/facebook/contacts/data/ad;

.field public static final enum PHONE_NATIONAL:Lcom/facebook/contacts/data/ad;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 115
    new-instance v0, Lcom/facebook/contacts/data/ad;

    const-string v1, "NAME"

    invoke-direct {v0, v1, v2}, Lcom/facebook/contacts/data/ad;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/data/ad;->NAME:Lcom/facebook/contacts/data/ad;

    .line 118
    new-instance v0, Lcom/facebook/contacts/data/ad;

    const-string v1, "PHONE_E164"

    invoke-direct {v0, v1, v3}, Lcom/facebook/contacts/data/ad;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/data/ad;->PHONE_E164:Lcom/facebook/contacts/data/ad;

    .line 121
    new-instance v0, Lcom/facebook/contacts/data/ad;

    const-string v1, "PHONE_NATIONAL"

    invoke-direct {v0, v1, v4}, Lcom/facebook/contacts/data/ad;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/data/ad;->PHONE_NATIONAL:Lcom/facebook/contacts/data/ad;

    .line 124
    new-instance v0, Lcom/facebook/contacts/data/ad;

    const-string v1, "PHONE_LOCAL"

    invoke-direct {v0, v1, v5}, Lcom/facebook/contacts/data/ad;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/data/ad;->PHONE_LOCAL:Lcom/facebook/contacts/data/ad;

    .line 113
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/contacts/data/ad;

    sget-object v1, Lcom/facebook/contacts/data/ad;->NAME:Lcom/facebook/contacts/data/ad;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/contacts/data/ad;->PHONE_E164:Lcom/facebook/contacts/data/ad;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/contacts/data/ad;->PHONE_NATIONAL:Lcom/facebook/contacts/data/ad;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/contacts/data/ad;->PHONE_LOCAL:Lcom/facebook/contacts/data/ad;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/contacts/data/ad;->$VALUES:[Lcom/facebook/contacts/data/ad;

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
    .line 113
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/contacts/data/ad;
    .locals 1

    .prologue
    .line 113
    const-class v0, Lcom/facebook/contacts/data/ad;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/data/ad;

    return-object v0
.end method

.method public static values()[Lcom/facebook/contacts/data/ad;
    .locals 1

    .prologue
    .line 113
    sget-object v0, Lcom/facebook/contacts/data/ad;->$VALUES:[Lcom/facebook/contacts/data/ad;

    invoke-virtual {v0}, [Lcom/facebook/contacts/data/ad;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/contacts/data/ad;

    return-object v0
.end method
