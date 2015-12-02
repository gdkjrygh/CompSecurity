.class public final enum Lcom/facebook/user/d;
.super Ljava/lang/Enum;
.source "ChatContext.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/user/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/user/d;

.field public static final enum BIRTHDAY:Lcom/facebook/user/d;

.field public static final enum CELEBRATION:Lcom/facebook/user/d;

.field public static final enum CHECKIN:Lcom/facebook/user/d;

.field public static final enum LISTENING:Lcom/facebook/user/d;

.field public static final enum NEARBY:Lcom/facebook/user/d;

.field public static final enum NEIGHBORHOOD:Lcom/facebook/user/d;

.field public static final enum OTHER:Lcom/facebook/user/d;

.field public static final enum PRESENCE:Lcom/facebook/user/d;

.field public static final enum VISITING:Lcom/facebook/user/d;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 55
    new-instance v0, Lcom/facebook/user/d;

    const-string v1, "NEARBY"

    invoke-direct {v0, v1, v3}, Lcom/facebook/user/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/d;->NEARBY:Lcom/facebook/user/d;

    .line 56
    new-instance v0, Lcom/facebook/user/d;

    const-string v1, "VISITING"

    invoke-direct {v0, v1, v4}, Lcom/facebook/user/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/d;->VISITING:Lcom/facebook/user/d;

    .line 57
    new-instance v0, Lcom/facebook/user/d;

    const-string v1, "BIRTHDAY"

    invoke-direct {v0, v1, v5}, Lcom/facebook/user/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/d;->BIRTHDAY:Lcom/facebook/user/d;

    .line 58
    new-instance v0, Lcom/facebook/user/d;

    const-string v1, "CHECKIN"

    invoke-direct {v0, v1, v6}, Lcom/facebook/user/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/d;->CHECKIN:Lcom/facebook/user/d;

    .line 59
    new-instance v0, Lcom/facebook/user/d;

    const-string v1, "CELEBRATION"

    invoke-direct {v0, v1, v7}, Lcom/facebook/user/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/d;->CELEBRATION:Lcom/facebook/user/d;

    .line 60
    new-instance v0, Lcom/facebook/user/d;

    const-string v1, "NEIGHBORHOOD"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/d;->NEIGHBORHOOD:Lcom/facebook/user/d;

    .line 61
    new-instance v0, Lcom/facebook/user/d;

    const-string v1, "LISTENING"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/d;->LISTENING:Lcom/facebook/user/d;

    .line 62
    new-instance v0, Lcom/facebook/user/d;

    const-string v1, "PRESENCE"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/d;->PRESENCE:Lcom/facebook/user/d;

    .line 63
    new-instance v0, Lcom/facebook/user/d;

    const-string v1, "OTHER"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/d;->OTHER:Lcom/facebook/user/d;

    .line 54
    const/16 v0, 0x9

    new-array v0, v0, [Lcom/facebook/user/d;

    sget-object v1, Lcom/facebook/user/d;->NEARBY:Lcom/facebook/user/d;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/user/d;->VISITING:Lcom/facebook/user/d;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/user/d;->BIRTHDAY:Lcom/facebook/user/d;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/user/d;->CHECKIN:Lcom/facebook/user/d;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/user/d;->CELEBRATION:Lcom/facebook/user/d;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/user/d;->NEIGHBORHOOD:Lcom/facebook/user/d;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/user/d;->LISTENING:Lcom/facebook/user/d;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/facebook/user/d;->PRESENCE:Lcom/facebook/user/d;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/facebook/user/d;->OTHER:Lcom/facebook/user/d;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/user/d;->$VALUES:[Lcom/facebook/user/d;

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
    .line 54
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/user/d;
    .locals 1

    .prologue
    .line 54
    const-class v0, Lcom/facebook/user/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/d;

    return-object v0
.end method

.method public static values()[Lcom/facebook/user/d;
    .locals 1

    .prologue
    .line 54
    sget-object v0, Lcom/facebook/user/d;->$VALUES:[Lcom/facebook/user/d;

    invoke-virtual {v0}, [Lcom/facebook/user/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/user/d;

    return-object v0
.end method
