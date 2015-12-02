.class public final enum Lcom/facebook/orca/activity/j;
.super Ljava/lang/Enum;
.source "ConfirmActionParams.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/activity/j;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/activity/j;

.field public static final enum DELETE:Lcom/facebook/orca/activity/j;

.field public static final enum NORMAL:Lcom/facebook/orca/activity/j;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 11
    new-instance v0, Lcom/facebook/orca/activity/j;

    const-string v1, "NORMAL"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/activity/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/activity/j;->NORMAL:Lcom/facebook/orca/activity/j;

    .line 12
    new-instance v0, Lcom/facebook/orca/activity/j;

    const-string v1, "DELETE"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/activity/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/activity/j;->DELETE:Lcom/facebook/orca/activity/j;

    .line 10
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/orca/activity/j;

    sget-object v1, Lcom/facebook/orca/activity/j;->NORMAL:Lcom/facebook/orca/activity/j;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/activity/j;->DELETE:Lcom/facebook/orca/activity/j;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/orca/activity/j;->$VALUES:[Lcom/facebook/orca/activity/j;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/activity/j;
    .locals 1

    .prologue
    .line 10
    const-class v0, Lcom/facebook/orca/activity/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/activity/j;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/activity/j;
    .locals 1

    .prologue
    .line 10
    sget-object v0, Lcom/facebook/orca/activity/j;->$VALUES:[Lcom/facebook/orca/activity/j;

    invoke-virtual {v0}, [Lcom/facebook/orca/activity/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/activity/j;

    return-object v0
.end method
