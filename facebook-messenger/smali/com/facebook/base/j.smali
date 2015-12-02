.class public final enum Lcom/facebook/base/j;
.super Ljava/lang/Enum;
.source "SignatureType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/base/j;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/base/j;

.field public static final enum DEBUG:Lcom/facebook/base/j;

.field public static final enum IN_HOUSE:Lcom/facebook/base/j;

.field public static final enum PROD:Lcom/facebook/base/j;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 49
    new-instance v0, Lcom/facebook/base/j;

    const-string v1, "DEBUG"

    invoke-direct {v0, v1, v2}, Lcom/facebook/base/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/base/j;->DEBUG:Lcom/facebook/base/j;

    .line 50
    new-instance v0, Lcom/facebook/base/j;

    const-string v1, "IN_HOUSE"

    invoke-direct {v0, v1, v3}, Lcom/facebook/base/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/base/j;->IN_HOUSE:Lcom/facebook/base/j;

    .line 51
    new-instance v0, Lcom/facebook/base/j;

    const-string v1, "PROD"

    invoke-direct {v0, v1, v4}, Lcom/facebook/base/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/base/j;->PROD:Lcom/facebook/base/j;

    .line 48
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/base/j;

    sget-object v1, Lcom/facebook/base/j;->DEBUG:Lcom/facebook/base/j;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/base/j;->IN_HOUSE:Lcom/facebook/base/j;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/base/j;->PROD:Lcom/facebook/base/j;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/base/j;->$VALUES:[Lcom/facebook/base/j;

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
    .line 48
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/base/j;
    .locals 1

    .prologue
    .line 48
    const-class v0, Lcom/facebook/base/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/j;

    return-object v0
.end method

.method public static values()[Lcom/facebook/base/j;
    .locals 1

    .prologue
    .line 48
    sget-object v0, Lcom/facebook/base/j;->$VALUES:[Lcom/facebook/base/j;

    invoke-virtual {v0}, [Lcom/facebook/base/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/base/j;

    return-object v0
.end method


# virtual methods
.method public getPermission()Ljava/lang/String;
    .locals 4

    .prologue
    .line 55
    const-string v0, "com.facebook.permission.%s.FB_APP_COMMUNICATION"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/facebook/base/j;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
