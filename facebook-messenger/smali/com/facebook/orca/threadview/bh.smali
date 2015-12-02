.class final enum Lcom/facebook/orca/threadview/bh;
.super Ljava/lang/Enum;
.source "ThreadViewAudioAttachmentView.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/threadview/bh;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/threadview/bh;

.field public static final enum DOWNLOADED:Lcom/facebook/orca/threadview/bh;

.field public static final enum ERROR:Lcom/facebook/orca/threadview/bh;

.field public static final enum INIT:Lcom/facebook/orca/threadview/bh;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 90
    new-instance v0, Lcom/facebook/orca/threadview/bh;

    const-string v1, "INIT"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/threadview/bh;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/bh;->INIT:Lcom/facebook/orca/threadview/bh;

    .line 91
    new-instance v0, Lcom/facebook/orca/threadview/bh;

    const-string v1, "DOWNLOADED"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/threadview/bh;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/bh;->DOWNLOADED:Lcom/facebook/orca/threadview/bh;

    .line 92
    new-instance v0, Lcom/facebook/orca/threadview/bh;

    const-string v1, "ERROR"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/threadview/bh;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/threadview/bh;->ERROR:Lcom/facebook/orca/threadview/bh;

    .line 89
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/orca/threadview/bh;

    sget-object v1, Lcom/facebook/orca/threadview/bh;->INIT:Lcom/facebook/orca/threadview/bh;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/threadview/bh;->DOWNLOADED:Lcom/facebook/orca/threadview/bh;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/threadview/bh;->ERROR:Lcom/facebook/orca/threadview/bh;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/orca/threadview/bh;->$VALUES:[Lcom/facebook/orca/threadview/bh;

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
    .line 89
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/threadview/bh;
    .locals 1

    .prologue
    .line 89
    const-class v0, Lcom/facebook/orca/threadview/bh;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/bh;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/threadview/bh;
    .locals 1

    .prologue
    .line 89
    sget-object v0, Lcom/facebook/orca/threadview/bh;->$VALUES:[Lcom/facebook/orca/threadview/bh;

    invoke-virtual {v0}, [Lcom/facebook/orca/threadview/bh;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/threadview/bh;

    return-object v0
.end method
