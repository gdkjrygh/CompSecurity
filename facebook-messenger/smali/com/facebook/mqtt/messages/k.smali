.class public final enum Lcom/facebook/mqtt/messages/k;
.super Ljava/lang/Enum;
.source "MessageType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/mqtt/messages/k;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/mqtt/messages/k;

.field public static final enum CONNACK:Lcom/facebook/mqtt/messages/k;

.field public static final enum CONNECT:Lcom/facebook/mqtt/messages/k;

.field public static final enum DISCONNECT:Lcom/facebook/mqtt/messages/k;

.field public static final enum PINGREQ:Lcom/facebook/mqtt/messages/k;

.field public static final enum PINGRESP:Lcom/facebook/mqtt/messages/k;

.field public static final enum PUBACK:Lcom/facebook/mqtt/messages/k;

.field public static final enum PUBCOMP:Lcom/facebook/mqtt/messages/k;

.field public static final enum PUBLISH:Lcom/facebook/mqtt/messages/k;

.field public static final enum PUBREC:Lcom/facebook/mqtt/messages/k;

.field public static final enum PUBREL:Lcom/facebook/mqtt/messages/k;

.field public static final enum SUBACK:Lcom/facebook/mqtt/messages/k;

.field public static final enum SUBSCRIBE:Lcom/facebook/mqtt/messages/k;

.field public static final enum UNSUBACK:Lcom/facebook/mqtt/messages/k;

.field public static final enum UNSUBSCRIBE:Lcom/facebook/mqtt/messages/k;

.field private static final map:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/facebook/mqtt/messages/k;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v0, 0x0

    .line 16
    new-instance v1, Lcom/facebook/mqtt/messages/k;

    const-string v2, "CONNECT"

    invoke-direct {v1, v2, v0, v5}, Lcom/facebook/mqtt/messages/k;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/mqtt/messages/k;->CONNECT:Lcom/facebook/mqtt/messages/k;

    .line 17
    new-instance v1, Lcom/facebook/mqtt/messages/k;

    const-string v2, "CONNACK"

    invoke-direct {v1, v2, v5, v6}, Lcom/facebook/mqtt/messages/k;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/mqtt/messages/k;->CONNACK:Lcom/facebook/mqtt/messages/k;

    .line 18
    new-instance v1, Lcom/facebook/mqtt/messages/k;

    const-string v2, "PUBLISH"

    invoke-direct {v1, v2, v6, v7}, Lcom/facebook/mqtt/messages/k;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/mqtt/messages/k;->PUBLISH:Lcom/facebook/mqtt/messages/k;

    .line 19
    new-instance v1, Lcom/facebook/mqtt/messages/k;

    const-string v2, "PUBACK"

    invoke-direct {v1, v2, v7, v8}, Lcom/facebook/mqtt/messages/k;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/mqtt/messages/k;->PUBACK:Lcom/facebook/mqtt/messages/k;

    .line 20
    new-instance v1, Lcom/facebook/mqtt/messages/k;

    const-string v2, "PUBREC"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v8, v3}, Lcom/facebook/mqtt/messages/k;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/mqtt/messages/k;->PUBREC:Lcom/facebook/mqtt/messages/k;

    .line 21
    new-instance v1, Lcom/facebook/mqtt/messages/k;

    const-string v2, "PUBREL"

    const/4 v3, 0x5

    const/4 v4, 0x6

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/mqtt/messages/k;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/mqtt/messages/k;->PUBREL:Lcom/facebook/mqtt/messages/k;

    .line 22
    new-instance v1, Lcom/facebook/mqtt/messages/k;

    const-string v2, "PUBCOMP"

    const/4 v3, 0x6

    const/4 v4, 0x7

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/mqtt/messages/k;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/mqtt/messages/k;->PUBCOMP:Lcom/facebook/mqtt/messages/k;

    .line 23
    new-instance v1, Lcom/facebook/mqtt/messages/k;

    const-string v2, "SUBSCRIBE"

    const/4 v3, 0x7

    const/16 v4, 0x8

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/mqtt/messages/k;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/mqtt/messages/k;->SUBSCRIBE:Lcom/facebook/mqtt/messages/k;

    .line 24
    new-instance v1, Lcom/facebook/mqtt/messages/k;

    const-string v2, "SUBACK"

    const/16 v3, 0x8

    const/16 v4, 0x9

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/mqtt/messages/k;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/mqtt/messages/k;->SUBACK:Lcom/facebook/mqtt/messages/k;

    .line 25
    new-instance v1, Lcom/facebook/mqtt/messages/k;

    const-string v2, "UNSUBSCRIBE"

    const/16 v3, 0x9

    const/16 v4, 0xa

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/mqtt/messages/k;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/mqtt/messages/k;->UNSUBSCRIBE:Lcom/facebook/mqtt/messages/k;

    .line 26
    new-instance v1, Lcom/facebook/mqtt/messages/k;

    const-string v2, "UNSUBACK"

    const/16 v3, 0xa

    const/16 v4, 0xb

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/mqtt/messages/k;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/mqtt/messages/k;->UNSUBACK:Lcom/facebook/mqtt/messages/k;

    .line 27
    new-instance v1, Lcom/facebook/mqtt/messages/k;

    const-string v2, "PINGREQ"

    const/16 v3, 0xb

    const/16 v4, 0xc

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/mqtt/messages/k;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/mqtt/messages/k;->PINGREQ:Lcom/facebook/mqtt/messages/k;

    .line 28
    new-instance v1, Lcom/facebook/mqtt/messages/k;

    const-string v2, "PINGRESP"

    const/16 v3, 0xc

    const/16 v4, 0xd

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/mqtt/messages/k;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/mqtt/messages/k;->PINGRESP:Lcom/facebook/mqtt/messages/k;

    .line 29
    new-instance v1, Lcom/facebook/mqtt/messages/k;

    const-string v2, "DISCONNECT"

    const/16 v3, 0xd

    const/16 v4, 0xe

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/mqtt/messages/k;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/facebook/mqtt/messages/k;->DISCONNECT:Lcom/facebook/mqtt/messages/k;

    .line 10
    const/16 v1, 0xe

    new-array v1, v1, [Lcom/facebook/mqtt/messages/k;

    sget-object v2, Lcom/facebook/mqtt/messages/k;->CONNECT:Lcom/facebook/mqtt/messages/k;

    aput-object v2, v1, v0

    sget-object v2, Lcom/facebook/mqtt/messages/k;->CONNACK:Lcom/facebook/mqtt/messages/k;

    aput-object v2, v1, v5

    sget-object v2, Lcom/facebook/mqtt/messages/k;->PUBLISH:Lcom/facebook/mqtt/messages/k;

    aput-object v2, v1, v6

    sget-object v2, Lcom/facebook/mqtt/messages/k;->PUBACK:Lcom/facebook/mqtt/messages/k;

    aput-object v2, v1, v7

    sget-object v2, Lcom/facebook/mqtt/messages/k;->PUBREC:Lcom/facebook/mqtt/messages/k;

    aput-object v2, v1, v8

    const/4 v2, 0x5

    sget-object v3, Lcom/facebook/mqtt/messages/k;->PUBREL:Lcom/facebook/mqtt/messages/k;

    aput-object v3, v1, v2

    const/4 v2, 0x6

    sget-object v3, Lcom/facebook/mqtt/messages/k;->PUBCOMP:Lcom/facebook/mqtt/messages/k;

    aput-object v3, v1, v2

    const/4 v2, 0x7

    sget-object v3, Lcom/facebook/mqtt/messages/k;->SUBSCRIBE:Lcom/facebook/mqtt/messages/k;

    aput-object v3, v1, v2

    const/16 v2, 0x8

    sget-object v3, Lcom/facebook/mqtt/messages/k;->SUBACK:Lcom/facebook/mqtt/messages/k;

    aput-object v3, v1, v2

    const/16 v2, 0x9

    sget-object v3, Lcom/facebook/mqtt/messages/k;->UNSUBSCRIBE:Lcom/facebook/mqtt/messages/k;

    aput-object v3, v1, v2

    const/16 v2, 0xa

    sget-object v3, Lcom/facebook/mqtt/messages/k;->UNSUBACK:Lcom/facebook/mqtt/messages/k;

    aput-object v3, v1, v2

    const/16 v2, 0xb

    sget-object v3, Lcom/facebook/mqtt/messages/k;->PINGREQ:Lcom/facebook/mqtt/messages/k;

    aput-object v3, v1, v2

    const/16 v2, 0xc

    sget-object v3, Lcom/facebook/mqtt/messages/k;->PINGRESP:Lcom/facebook/mqtt/messages/k;

    aput-object v3, v1, v2

    const/16 v2, 0xd

    sget-object v3, Lcom/facebook/mqtt/messages/k;->DISCONNECT:Lcom/facebook/mqtt/messages/k;

    aput-object v3, v1, v2

    sput-object v1, Lcom/facebook/mqtt/messages/k;->$VALUES:[Lcom/facebook/mqtt/messages/k;

    .line 40
    invoke-static {}, Lcom/google/common/a/ev;->k()Lcom/google/common/a/ew;

    move-result-object v1

    .line 41
    invoke-static {}, Lcom/facebook/mqtt/messages/k;->values()[Lcom/facebook/mqtt/messages/k;

    move-result-object v2

    array-length v3, v2

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 42
    iget v5, v4, Lcom/facebook/mqtt/messages/k;->value:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v5, v4}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 41
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v1}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    sput-object v0, Lcom/facebook/mqtt/messages/k;->map:Lcom/google/common/a/ev;

    .line 45
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .prologue
    .line 33
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 34
    iput p3, p0, Lcom/facebook/mqtt/messages/k;->value:I

    .line 35
    return-void
.end method

.method public static fromInt(I)Lcom/facebook/mqtt/messages/k;
    .locals 2

    .prologue
    .line 48
    sget-object v0, Lcom/facebook/mqtt/messages/k;->map:Lcom/google/common/a/ev;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/messages/k;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/mqtt/messages/k;
    .locals 1

    .prologue
    .line 10
    const-class v0, Lcom/facebook/mqtt/messages/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/mqtt/messages/k;

    return-object v0
.end method

.method public static values()[Lcom/facebook/mqtt/messages/k;
    .locals 1

    .prologue
    .line 10
    sget-object v0, Lcom/facebook/mqtt/messages/k;->$VALUES:[Lcom/facebook/mqtt/messages/k;

    invoke-virtual {v0}, [Lcom/facebook/mqtt/messages/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/mqtt/messages/k;

    return-object v0
.end method


# virtual methods
.method public toInt()I
    .locals 1

    .prologue
    .line 52
    iget v0, p0, Lcom/facebook/mqtt/messages/k;->value:I

    return v0
.end method
