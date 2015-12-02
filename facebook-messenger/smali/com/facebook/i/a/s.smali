.class public final enum Lcom/facebook/i/a/s;
.super Ljava/lang/Enum;
.source "PeerProcessStatusListener.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/i/a/s;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/i/a/s;

.field public static final enum Incoming:Lcom/facebook/i/a/s;

.field public static final enum Outgoing:Lcom/facebook/i/a/s;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 11
    new-instance v0, Lcom/facebook/i/a/s;

    const-string v1, "Incoming"

    invoke-direct {v0, v1, v2}, Lcom/facebook/i/a/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/i/a/s;->Incoming:Lcom/facebook/i/a/s;

    .line 12
    new-instance v0, Lcom/facebook/i/a/s;

    const-string v1, "Outgoing"

    invoke-direct {v0, v1, v3}, Lcom/facebook/i/a/s;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/i/a/s;->Outgoing:Lcom/facebook/i/a/s;

    .line 10
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/i/a/s;

    sget-object v1, Lcom/facebook/i/a/s;->Incoming:Lcom/facebook/i/a/s;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/i/a/s;->Outgoing:Lcom/facebook/i/a/s;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/i/a/s;->$VALUES:[Lcom/facebook/i/a/s;

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
    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/i/a/s;
    .locals 1

    .prologue
    .line 10
    const-class v0, Lcom/facebook/i/a/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/i/a/s;

    return-object v0
.end method

.method public static values()[Lcom/facebook/i/a/s;
    .locals 1

    .prologue
    .line 10
    sget-object v0, Lcom/facebook/i/a/s;->$VALUES:[Lcom/facebook/i/a/s;

    invoke-virtual {v0}, [Lcom/facebook/i/a/s;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/i/a/s;

    return-object v0
.end method
