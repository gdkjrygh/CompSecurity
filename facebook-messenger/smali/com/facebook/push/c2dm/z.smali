.class public final enum Lcom/facebook/push/c2dm/z;
.super Ljava/lang/Enum;
.source "PushTokenHolder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/push/c2dm/z;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/push/c2dm/z;

.field public static final enum C2DM:Lcom/facebook/push/c2dm/z;

.field public static final enum GCM:Lcom/facebook/push/c2dm/z;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 31
    new-instance v0, Lcom/facebook/push/c2dm/z;

    const-string v1, "C2DM"

    invoke-direct {v0, v1, v2}, Lcom/facebook/push/c2dm/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/c2dm/z;->C2DM:Lcom/facebook/push/c2dm/z;

    .line 32
    new-instance v0, Lcom/facebook/push/c2dm/z;

    const-string v1, "GCM"

    invoke-direct {v0, v1, v3}, Lcom/facebook/push/c2dm/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/push/c2dm/z;->GCM:Lcom/facebook/push/c2dm/z;

    .line 30
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/push/c2dm/z;

    sget-object v1, Lcom/facebook/push/c2dm/z;->C2DM:Lcom/facebook/push/c2dm/z;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/push/c2dm/z;->GCM:Lcom/facebook/push/c2dm/z;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/push/c2dm/z;->$VALUES:[Lcom/facebook/push/c2dm/z;

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
    .line 30
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/push/c2dm/z;
    .locals 1

    .prologue
    .line 30
    const-class v0, Lcom/facebook/push/c2dm/z;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/c2dm/z;

    return-object v0
.end method

.method public static values()[Lcom/facebook/push/c2dm/z;
    .locals 1

    .prologue
    .line 30
    sget-object v0, Lcom/facebook/push/c2dm/z;->$VALUES:[Lcom/facebook/push/c2dm/z;

    invoke-virtual {v0}, [Lcom/facebook/push/c2dm/z;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/push/c2dm/z;

    return-object v0
.end method
