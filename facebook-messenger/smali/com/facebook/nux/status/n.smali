.class public final enum Lcom/facebook/nux/status/n;
.super Ljava/lang/Enum;
.source "UpdateNuxStatusParams.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/nux/status/n;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/nux/status/n;

.field public static final enum COMPLETE:Lcom/facebook/nux/status/n;

.field public static final enum SKIPPED:Lcom/facebook/nux/status/n;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 30
    new-instance v0, Lcom/facebook/nux/status/n;

    const-string v1, "COMPLETE"

    invoke-direct {v0, v1, v2}, Lcom/facebook/nux/status/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/nux/status/n;->COMPLETE:Lcom/facebook/nux/status/n;

    .line 31
    new-instance v0, Lcom/facebook/nux/status/n;

    const-string v1, "SKIPPED"

    invoke-direct {v0, v1, v3}, Lcom/facebook/nux/status/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/nux/status/n;->SKIPPED:Lcom/facebook/nux/status/n;

    .line 29
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/nux/status/n;

    sget-object v1, Lcom/facebook/nux/status/n;->COMPLETE:Lcom/facebook/nux/status/n;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/nux/status/n;->SKIPPED:Lcom/facebook/nux/status/n;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/nux/status/n;->$VALUES:[Lcom/facebook/nux/status/n;

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
    .line 29
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/nux/status/n;
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/facebook/nux/status/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/nux/status/n;

    return-object v0
.end method

.method public static values()[Lcom/facebook/nux/status/n;
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lcom/facebook/nux/status/n;->$VALUES:[Lcom/facebook/nux/status/n;

    invoke-virtual {v0}, [Lcom/facebook/nux/status/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/nux/status/n;

    return-object v0
.end method
