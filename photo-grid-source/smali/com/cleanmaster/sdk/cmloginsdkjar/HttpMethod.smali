.class public final enum Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

.field public static final enum DELETE:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

.field public static final enum GET:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

.field public static final enum POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 10
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    const-string v1, "GET"

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->GET:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    .line 15
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    const-string v1, "POST"

    invoke-direct {v0, v1, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    .line 20
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    const-string v1, "DELETE"

    invoke-direct {v0, v1, v4}, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->DELETE:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    .line 6
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    sget-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->GET:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    aput-object v1, v0, v2

    sget-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->POST:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    aput-object v1, v0, v3

    sget-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->DELETE:Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    aput-object v1, v0, v4

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->$VALUES:[Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

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
    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;
    .locals 1

    .prologue
    .line 6
    const-class v0, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    return-object v0
.end method

.method public static values()[Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;
    .locals 1

    .prologue
    .line 6
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->$VALUES:[Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    invoke-virtual {v0}, [Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/HttpMethod;

    return-object v0
.end method
