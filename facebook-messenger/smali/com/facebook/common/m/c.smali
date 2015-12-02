.class public final enum Lcom/facebook/common/m/c;
.super Ljava/lang/Enum;
.source "DNSResolver.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/common/m/c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/common/m/c;

.field public static final enum SecurityException:Lcom/facebook/common/m/c;

.field public static final enum Success:Lcom/facebook/common/m/c;

.field public static final enum TimedOut:Lcom/facebook/common/m/c;

.field public static final enum UnknownHost:Lcom/facebook/common/m/c;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 14
    new-instance v0, Lcom/facebook/common/m/c;

    const-string v1, "Success"

    invoke-direct {v0, v1, v2}, Lcom/facebook/common/m/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/m/c;->Success:Lcom/facebook/common/m/c;

    .line 15
    new-instance v0, Lcom/facebook/common/m/c;

    const-string v1, "TimedOut"

    invoke-direct {v0, v1, v3}, Lcom/facebook/common/m/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/m/c;->TimedOut:Lcom/facebook/common/m/c;

    .line 16
    new-instance v0, Lcom/facebook/common/m/c;

    const-string v1, "UnknownHost"

    invoke-direct {v0, v1, v4}, Lcom/facebook/common/m/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/m/c;->UnknownHost:Lcom/facebook/common/m/c;

    .line 17
    new-instance v0, Lcom/facebook/common/m/c;

    const-string v1, "SecurityException"

    invoke-direct {v0, v1, v5}, Lcom/facebook/common/m/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/common/m/c;->SecurityException:Lcom/facebook/common/m/c;

    .line 13
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/common/m/c;

    sget-object v1, Lcom/facebook/common/m/c;->Success:Lcom/facebook/common/m/c;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/common/m/c;->TimedOut:Lcom/facebook/common/m/c;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/common/m/c;->UnknownHost:Lcom/facebook/common/m/c;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/common/m/c;->SecurityException:Lcom/facebook/common/m/c;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/common/m/c;->$VALUES:[Lcom/facebook/common/m/c;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/common/m/c;
    .locals 1

    .prologue
    .line 13
    const-class v0, Lcom/facebook/common/m/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/m/c;

    return-object v0
.end method

.method public static values()[Lcom/facebook/common/m/c;
    .locals 1

    .prologue
    .line 13
    sget-object v0, Lcom/facebook/common/m/c;->$VALUES:[Lcom/facebook/common/m/c;

    invoke-virtual {v0}, [Lcom/facebook/common/m/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/common/m/c;

    return-object v0
.end method
