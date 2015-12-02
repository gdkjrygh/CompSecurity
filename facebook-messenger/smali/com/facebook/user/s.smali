.class public final enum Lcom/facebook/user/s;
.super Ljava/lang/Enum;
.source "UserIdentifier.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/user/s;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/user/s;

.field public static final enum EMAIL:Lcom/facebook/user/s;

.field public static final enum FBID:Lcom/facebook/user/s;

.field public static final enum PHONE:Lcom/facebook/user/s;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 14
    new-instance v0, Lcom/facebook/user/s;

    const-string v1, "EMAIL"

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/s;->EMAIL:Lcom/facebook/user/s;

    .line 15
    new-instance v0, Lcom/facebook/user/s;

    const-string v1, "PHONE"

    invoke-direct {v0, v1, v3}, Lcom/facebook/user/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/s;->PHONE:Lcom/facebook/user/s;

    .line 16
    new-instance v0, Lcom/facebook/user/s;

    const-string v1, "FBID"

    invoke-direct {v0, v1, v4}, Lcom/facebook/user/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/s;->FBID:Lcom/facebook/user/s;

    .line 13
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/user/s;

    sget-object v1, Lcom/facebook/user/s;->EMAIL:Lcom/facebook/user/s;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/user/s;->PHONE:Lcom/facebook/user/s;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/user/s;->FBID:Lcom/facebook/user/s;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/user/s;->$VALUES:[Lcom/facebook/user/s;

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
    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/user/s;
    .locals 1

    .prologue
    .line 13
    const-class v0, Lcom/facebook/user/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/s;

    return-object v0
.end method

.method public static values()[Lcom/facebook/user/s;
    .locals 1

    .prologue
    .line 13
    sget-object v0, Lcom/facebook/user/s;->$VALUES:[Lcom/facebook/user/s;

    invoke-virtual {v0}, [Lcom/facebook/user/s;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/user/s;

    return-object v0
.end method
