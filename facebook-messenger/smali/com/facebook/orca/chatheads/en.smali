.class public final enum Lcom/facebook/orca/chatheads/en;
.super Ljava/lang/Enum;
.source "ViewDragDismissHelper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/chatheads/en;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/chatheads/en;

.field public static final enum DOWN:Lcom/facebook/orca/chatheads/en;

.field public static final enum UP:Lcom/facebook/orca/chatheads/en;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 38
    new-instance v0, Lcom/facebook/orca/chatheads/en;

    const-string v1, "UP"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/chatheads/en;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/chatheads/en;->UP:Lcom/facebook/orca/chatheads/en;

    .line 39
    new-instance v0, Lcom/facebook/orca/chatheads/en;

    const-string v1, "DOWN"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/chatheads/en;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/chatheads/en;->DOWN:Lcom/facebook/orca/chatheads/en;

    .line 37
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/orca/chatheads/en;

    sget-object v1, Lcom/facebook/orca/chatheads/en;->UP:Lcom/facebook/orca/chatheads/en;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/chatheads/en;->DOWN:Lcom/facebook/orca/chatheads/en;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/orca/chatheads/en;->$VALUES:[Lcom/facebook/orca/chatheads/en;

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
    .line 37
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/chatheads/en;
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/facebook/orca/chatheads/en;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/en;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/chatheads/en;
    .locals 1

    .prologue
    .line 37
    sget-object v0, Lcom/facebook/orca/chatheads/en;->$VALUES:[Lcom/facebook/orca/chatheads/en;

    invoke-virtual {v0}, [Lcom/facebook/orca/chatheads/en;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/chatheads/en;

    return-object v0
.end method
