.class public final enum Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;

.field public static final enum NEXT:Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;

.field public static final enum PREVIOUS:Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 174
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;

    const-string v1, "NEXT"

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;->NEXT:Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;

    .line 178
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;

    const-string v1, "PREVIOUS"

    invoke-direct {v0, v1, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;->PREVIOUS:Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;

    .line 170
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;

    sget-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;->NEXT:Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;

    aput-object v1, v0, v2

    sget-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;->PREVIOUS:Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;

    aput-object v1, v0, v3

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;->$VALUES:[Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;

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
    .line 170
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;
    .locals 1

    .prologue
    .line 170
    const-class v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;

    return-object v0
.end method

.method public static values()[Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;
    .locals 1

    .prologue
    .line 170
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;->$VALUES:[Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;

    invoke-virtual {v0}, [Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/Response$PagingDirection;

    return-object v0
.end method
