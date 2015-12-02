.class public final enum Lcom/facebook/ui/images/b/u;
.super Ljava/lang/Enum;
.source "FetchedImage.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/ui/images/b/u;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/ui/images/b/u;

.field public static final enum DOWNLOAD_NOT_FOUND:Lcom/facebook/ui/images/b/u;

.field public static final enum DOWNLOAD_PIPELINE_ERROR:Lcom/facebook/ui/images/b/u;

.field public static final enum PREV_FAILURE_RETRY_BLOCKED:Lcom/facebook/ui/images/b/u;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 60
    new-instance v0, Lcom/facebook/ui/images/b/u;

    const-string v1, "PREV_FAILURE_RETRY_BLOCKED"

    invoke-direct {v0, v1, v2}, Lcom/facebook/ui/images/b/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/images/b/u;->PREV_FAILURE_RETRY_BLOCKED:Lcom/facebook/ui/images/b/u;

    .line 63
    new-instance v0, Lcom/facebook/ui/images/b/u;

    const-string v1, "DOWNLOAD_PIPELINE_ERROR"

    invoke-direct {v0, v1, v3}, Lcom/facebook/ui/images/b/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/images/b/u;->DOWNLOAD_PIPELINE_ERROR:Lcom/facebook/ui/images/b/u;

    .line 66
    new-instance v0, Lcom/facebook/ui/images/b/u;

    const-string v1, "DOWNLOAD_NOT_FOUND"

    invoke-direct {v0, v1, v4}, Lcom/facebook/ui/images/b/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ui/images/b/u;->DOWNLOAD_NOT_FOUND:Lcom/facebook/ui/images/b/u;

    .line 55
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/ui/images/b/u;

    sget-object v1, Lcom/facebook/ui/images/b/u;->PREV_FAILURE_RETRY_BLOCKED:Lcom/facebook/ui/images/b/u;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/ui/images/b/u;->DOWNLOAD_PIPELINE_ERROR:Lcom/facebook/ui/images/b/u;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/ui/images/b/u;->DOWNLOAD_NOT_FOUND:Lcom/facebook/ui/images/b/u;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/ui/images/b/u;->$VALUES:[Lcom/facebook/ui/images/b/u;

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
    .line 55
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/ui/images/b/u;
    .locals 1

    .prologue
    .line 55
    const-class v0, Lcom/facebook/ui/images/b/u;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/b/u;

    return-object v0
.end method

.method public static values()[Lcom/facebook/ui/images/b/u;
    .locals 1

    .prologue
    .line 55
    sget-object v0, Lcom/facebook/ui/images/b/u;->$VALUES:[Lcom/facebook/ui/images/b/u;

    invoke-virtual {v0}, [Lcom/facebook/ui/images/b/u;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/ui/images/b/u;

    return-object v0
.end method
