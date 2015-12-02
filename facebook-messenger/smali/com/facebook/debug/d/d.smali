.class final enum Lcom/facebook/debug/d/d;
.super Ljava/lang/Enum;
.source "TraceEvent.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/debug/d/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/debug/d/d;

.field public static final enum COMMENT:Lcom/facebook/debug/d/d;

.field public static final enum START:Lcom/facebook/debug/d/d;

.field public static final enum STOP:Lcom/facebook/debug/d/d;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 15
    new-instance v0, Lcom/facebook/debug/d/d;

    const-string v1, "START"

    invoke-direct {v0, v1, v2}, Lcom/facebook/debug/d/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/debug/d/d;->START:Lcom/facebook/debug/d/d;

    .line 16
    new-instance v0, Lcom/facebook/debug/d/d;

    const-string v1, "STOP"

    invoke-direct {v0, v1, v3}, Lcom/facebook/debug/d/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/debug/d/d;->STOP:Lcom/facebook/debug/d/d;

    .line 17
    new-instance v0, Lcom/facebook/debug/d/d;

    const-string v1, "COMMENT"

    invoke-direct {v0, v1, v4}, Lcom/facebook/debug/d/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/debug/d/d;->COMMENT:Lcom/facebook/debug/d/d;

    .line 14
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/debug/d/d;

    sget-object v1, Lcom/facebook/debug/d/d;->START:Lcom/facebook/debug/d/d;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/debug/d/d;->STOP:Lcom/facebook/debug/d/d;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/debug/d/d;->COMMENT:Lcom/facebook/debug/d/d;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/debug/d/d;->$VALUES:[Lcom/facebook/debug/d/d;

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
    .line 14
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/debug/d/d;
    .locals 1

    .prologue
    .line 14
    const-class v0, Lcom/facebook/debug/d/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/debug/d/d;

    return-object v0
.end method

.method public static values()[Lcom/facebook/debug/d/d;
    .locals 1

    .prologue
    .line 14
    sget-object v0, Lcom/facebook/debug/d/d;->$VALUES:[Lcom/facebook/debug/d/d;

    invoke-virtual {v0}, [Lcom/facebook/debug/d/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/debug/d/d;

    return-object v0
.end method
