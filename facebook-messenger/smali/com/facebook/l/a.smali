.class public final enum Lcom/facebook/l/a;
.super Ljava/lang/Enum;
.source "Availability.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/l/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/l/a;

.field public static final enum AVAILABLE:Lcom/facebook/l/a;

.field public static final enum NONE:Lcom/facebook/l/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 11
    new-instance v0, Lcom/facebook/l/a;

    const-string v1, "AVAILABLE"

    invoke-direct {v0, v1, v2}, Lcom/facebook/l/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/l/a;->AVAILABLE:Lcom/facebook/l/a;

    .line 14
    new-instance v0, Lcom/facebook/l/a;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v3}, Lcom/facebook/l/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/l/a;->NONE:Lcom/facebook/l/a;

    .line 8
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/l/a;

    sget-object v1, Lcom/facebook/l/a;->AVAILABLE:Lcom/facebook/l/a;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/l/a;->NONE:Lcom/facebook/l/a;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/l/a;->$VALUES:[Lcom/facebook/l/a;

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
    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/l/a;
    .locals 1

    .prologue
    .line 8
    const-class v0, Lcom/facebook/l/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/l/a;

    return-object v0
.end method

.method public static values()[Lcom/facebook/l/a;
    .locals 1

    .prologue
    .line 8
    sget-object v0, Lcom/facebook/l/a;->$VALUES:[Lcom/facebook/l/a;

    invoke-virtual {v0}, [Lcom/facebook/l/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/l/a;

    return-object v0
.end method
