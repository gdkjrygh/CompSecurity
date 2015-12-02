.class public final enum Lcom/facebook/orca/threadlist/al;
.super Ljava/lang/Enum;
.source "ThreadListAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/threadlist/al;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/threadlist/al;

.field public static final enum CHOOSE_DIALOG:Lcom/facebook/orca/threadlist/al;

.field public static final enum NORMAL:Lcom/facebook/orca/threadlist/al;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 30
    new-instance v0, Lcom/facebook/orca/threadlist/al;

    const-string v1, "NORMAL"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/threadlist/al;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadlist/al;->NORMAL:Lcom/facebook/orca/threadlist/al;

    .line 31
    new-instance v0, Lcom/facebook/orca/threadlist/al;

    const-string v1, "CHOOSE_DIALOG"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/threadlist/al;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadlist/al;->CHOOSE_DIALOG:Lcom/facebook/orca/threadlist/al;

    .line 29
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/orca/threadlist/al;

    sget-object v1, Lcom/facebook/orca/threadlist/al;->NORMAL:Lcom/facebook/orca/threadlist/al;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/threadlist/al;->CHOOSE_DIALOG:Lcom/facebook/orca/threadlist/al;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/orca/threadlist/al;->$VALUES:[Lcom/facebook/orca/threadlist/al;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/threadlist/al;
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/facebook/orca/threadlist/al;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadlist/al;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/threadlist/al;
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lcom/facebook/orca/threadlist/al;->$VALUES:[Lcom/facebook/orca/threadlist/al;

    invoke-virtual {v0}, [Lcom/facebook/orca/threadlist/al;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/threadlist/al;

    return-object v0
.end method
