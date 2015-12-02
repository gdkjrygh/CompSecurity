.class public final enum Lcom/facebook/orca/photos/b/n;
.super Ljava/lang/Enum;
.source "PhotoUploadManager.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/photos/b/n;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/photos/b/n;

.field public static final enum FAIL:Lcom/facebook/orca/photos/b/n;

.field public static final enum IN_PROGRESS:Lcom/facebook/orca/photos/b/n;

.field public static final enum NOT_ACTIVE:Lcom/facebook/orca/photos/b/n;

.field public static final enum SUCCESS:Lcom/facebook/orca/photos/b/n;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 37
    new-instance v0, Lcom/facebook/orca/photos/b/n;

    const-string v1, "IN_PROGRESS"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/photos/b/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/photos/b/n;->IN_PROGRESS:Lcom/facebook/orca/photos/b/n;

    .line 38
    new-instance v0, Lcom/facebook/orca/photos/b/n;

    const-string v1, "SUCCESS"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/photos/b/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/photos/b/n;->SUCCESS:Lcom/facebook/orca/photos/b/n;

    .line 39
    new-instance v0, Lcom/facebook/orca/photos/b/n;

    const-string v1, "NOT_ACTIVE"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/photos/b/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/photos/b/n;->NOT_ACTIVE:Lcom/facebook/orca/photos/b/n;

    .line 40
    new-instance v0, Lcom/facebook/orca/photos/b/n;

    const-string v1, "FAIL"

    invoke-direct {v0, v1, v5}, Lcom/facebook/orca/photos/b/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/photos/b/n;->FAIL:Lcom/facebook/orca/photos/b/n;

    .line 36
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/orca/photos/b/n;

    sget-object v1, Lcom/facebook/orca/photos/b/n;->IN_PROGRESS:Lcom/facebook/orca/photos/b/n;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/photos/b/n;->SUCCESS:Lcom/facebook/orca/photos/b/n;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/photos/b/n;->NOT_ACTIVE:Lcom/facebook/orca/photos/b/n;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/orca/photos/b/n;->FAIL:Lcom/facebook/orca/photos/b/n;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/orca/photos/b/n;->$VALUES:[Lcom/facebook/orca/photos/b/n;

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
    .line 36
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/photos/b/n;
    .locals 1

    .prologue
    .line 36
    const-class v0, Lcom/facebook/orca/photos/b/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/b/n;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/photos/b/n;
    .locals 1

    .prologue
    .line 36
    sget-object v0, Lcom/facebook/orca/photos/b/n;->$VALUES:[Lcom/facebook/orca/photos/b/n;

    invoke-virtual {v0}, [Lcom/facebook/orca/photos/b/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/photos/b/n;

    return-object v0
.end method
