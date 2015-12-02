.class public final enum Lcom/facebook/l/j;
.super Ljava/lang/Enum;
.source "PayForPlayPresence.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/l/j;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/l/j;

.field public static final enum DISABLED:Lcom/facebook/l/j;

.field public static final enum ENABLED:Lcom/facebook/l/j;

.field public static final enum OFF:Lcom/facebook/l/j;


# instance fields
.field private final mShowPresence:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 12
    new-instance v0, Lcom/facebook/l/j;

    const-string v1, "ENABLED"

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/l/j;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/facebook/l/j;->ENABLED:Lcom/facebook/l/j;

    .line 15
    new-instance v0, Lcom/facebook/l/j;

    const-string v1, "DISABLED"

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/l/j;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/facebook/l/j;->DISABLED:Lcom/facebook/l/j;

    .line 18
    new-instance v0, Lcom/facebook/l/j;

    const-string v1, "OFF"

    invoke-direct {v0, v1, v4, v2}, Lcom/facebook/l/j;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/facebook/l/j;->OFF:Lcom/facebook/l/j;

    .line 9
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/l/j;

    sget-object v1, Lcom/facebook/l/j;->ENABLED:Lcom/facebook/l/j;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/l/j;->DISABLED:Lcom/facebook/l/j;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/l/j;->OFF:Lcom/facebook/l/j;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/l/j;->$VALUES:[Lcom/facebook/l/j;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .prologue
    .line 22
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 23
    iput-boolean p3, p0, Lcom/facebook/l/j;->mShowPresence:Z

    .line 24
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/l/j;
    .locals 1

    .prologue
    .line 9
    const-class v0, Lcom/facebook/l/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/l/j;

    return-object v0
.end method

.method public static values()[Lcom/facebook/l/j;
    .locals 1

    .prologue
    .line 9
    sget-object v0, Lcom/facebook/l/j;->$VALUES:[Lcom/facebook/l/j;

    invoke-virtual {v0}, [Lcom/facebook/l/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/l/j;

    return-object v0
.end method


# virtual methods
.method public shouldShowPresence()Z
    .locals 1

    .prologue
    .line 32
    iget-boolean v0, p0, Lcom/facebook/l/j;->mShowPresence:Z

    return v0
.end method
