.class public final enum Lcom/facebook/vvm/a/b;
.super Ljava/lang/Enum;
.source "ApplicationDirectedString.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/vvm/a/b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/vvm/a/b;

.field public static final enum CREATED:Lcom/facebook/vvm/a/b;

.field public static final enum DEACTIVATED_ENHANCED_SERVICES:Lcom/facebook/vvm/a/b;

.field public static final enum INITIALIZED:Lcom/facebook/vvm/a/b;

.field public static final enum NO_SUCH_MAILBOX:Lcom/facebook/vvm/a/b;

.field public static final enum RESET_PASSWORD:Lcom/facebook/vvm/a/b;

.field public static final enum UNKNOWN:Lcom/facebook/vvm/a/b;


# instance fields
.field private strValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 38
    new-instance v0, Lcom/facebook/vvm/a/b;

    const-string v1, "CREATED"

    const-string v2, "C"

    invoke-direct {v0, v1, v4, v2}, Lcom/facebook/vvm/a/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/vvm/a/b;->CREATED:Lcom/facebook/vvm/a/b;

    .line 39
    new-instance v0, Lcom/facebook/vvm/a/b;

    const-string v1, "INITIALIZED"

    const-string v2, "I"

    invoke-direct {v0, v1, v5, v2}, Lcom/facebook/vvm/a/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/vvm/a/b;->INITIALIZED:Lcom/facebook/vvm/a/b;

    .line 40
    new-instance v0, Lcom/facebook/vvm/a/b;

    const-string v1, "UNKNOWN"

    const-string v2, "U"

    invoke-direct {v0, v1, v6, v2}, Lcom/facebook/vvm/a/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/vvm/a/b;->UNKNOWN:Lcom/facebook/vvm/a/b;

    .line 41
    new-instance v0, Lcom/facebook/vvm/a/b;

    const-string v1, "NO_SUCH_MAILBOX"

    const-string v2, "N"

    invoke-direct {v0, v1, v7, v2}, Lcom/facebook/vvm/a/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/vvm/a/b;->NO_SUCH_MAILBOX:Lcom/facebook/vvm/a/b;

    .line 42
    new-instance v0, Lcom/facebook/vvm/a/b;

    const-string v1, "RESET_PASSWORD"

    const-string v2, "R"

    invoke-direct {v0, v1, v8, v2}, Lcom/facebook/vvm/a/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/vvm/a/b;->RESET_PASSWORD:Lcom/facebook/vvm/a/b;

    .line 43
    new-instance v0, Lcom/facebook/vvm/a/b;

    const-string v1, "DEACTIVATED_ENHANCED_SERVICES"

    const/4 v2, 0x5

    const-string v3, "D"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/vvm/a/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/vvm/a/b;->DEACTIVATED_ENHANCED_SERVICES:Lcom/facebook/vvm/a/b;

    .line 37
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/facebook/vvm/a/b;

    sget-object v1, Lcom/facebook/vvm/a/b;->CREATED:Lcom/facebook/vvm/a/b;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/vvm/a/b;->INITIALIZED:Lcom/facebook/vvm/a/b;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/vvm/a/b;->UNKNOWN:Lcom/facebook/vvm/a/b;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/vvm/a/b;->NO_SUCH_MAILBOX:Lcom/facebook/vvm/a/b;

    aput-object v1, v0, v7

    sget-object v1, Lcom/facebook/vvm/a/b;->RESET_PASSWORD:Lcom/facebook/vvm/a/b;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/vvm/a/b;->DEACTIVATED_ENHANCED_SERVICES:Lcom/facebook/vvm/a/b;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/vvm/a/b;->$VALUES:[Lcom/facebook/vvm/a/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 46
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 47
    iput-object p3, p0, Lcom/facebook/vvm/a/b;->strValue:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public static parse(Ljava/lang/String;)Lcom/facebook/vvm/a/b;
    .locals 5

    .prologue
    .line 53
    invoke-static {}, Lcom/facebook/vvm/a/b;->values()[Lcom/facebook/vvm/a/b;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v0, v2, v1

    .line 54
    iget-object v4, v0, Lcom/facebook/vvm/a/b;->strValue:Ljava/lang/String;

    invoke-virtual {p0, v4}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v4

    if-nez v4, :cond_0

    .line 59
    :goto_1
    return-object v0

    .line 53
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 58
    :cond_1
    const-string v0, "ApplicationDirectedString"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid mailbox status "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " did not match any known statuses."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/vvm/a/b;
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/facebook/vvm/a/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/vvm/a/b;

    return-object v0
.end method

.method public static values()[Lcom/facebook/vvm/a/b;
    .locals 1

    .prologue
    .line 37
    sget-object v0, Lcom/facebook/vvm/a/b;->$VALUES:[Lcom/facebook/vvm/a/b;

    invoke-virtual {v0}, [Lcom/facebook/vvm/a/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/vvm/a/b;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/vvm/a/b;->strValue:Ljava/lang/String;

    return-object v0
.end method
