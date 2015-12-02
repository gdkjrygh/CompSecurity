.class public final enum Lcom/facebook/abtest/qe/a/b;
.super Ljava/lang/Enum;
.source "QuickExperimentAnalyticsEvent.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/abtest/qe/a/b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/abtest/qe/a/b;

.field public static final enum CONVERSION:Lcom/facebook/abtest/qe/a/b;

.field public static final enum EXPOSURE:Lcom/facebook/abtest/qe/a/b;

.field public static final enum UNDEPLOYMENT:Lcom/facebook/abtest/qe/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 26
    new-instance v0, Lcom/facebook/abtest/qe/a/b;

    const-string v1, "EXPOSURE"

    invoke-direct {v0, v1, v2}, Lcom/facebook/abtest/qe/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/abtest/qe/a/b;->EXPOSURE:Lcom/facebook/abtest/qe/a/b;

    .line 27
    new-instance v0, Lcom/facebook/abtest/qe/a/b;

    const-string v1, "UNDEPLOYMENT"

    invoke-direct {v0, v1, v3}, Lcom/facebook/abtest/qe/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/abtest/qe/a/b;->UNDEPLOYMENT:Lcom/facebook/abtest/qe/a/b;

    .line 28
    new-instance v0, Lcom/facebook/abtest/qe/a/b;

    const-string v1, "CONVERSION"

    invoke-direct {v0, v1, v4}, Lcom/facebook/abtest/qe/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/abtest/qe/a/b;->CONVERSION:Lcom/facebook/abtest/qe/a/b;

    .line 25
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/abtest/qe/a/b;

    sget-object v1, Lcom/facebook/abtest/qe/a/b;->EXPOSURE:Lcom/facebook/abtest/qe/a/b;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/abtest/qe/a/b;->UNDEPLOYMENT:Lcom/facebook/abtest/qe/a/b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/abtest/qe/a/b;->CONVERSION:Lcom/facebook/abtest/qe/a/b;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/abtest/qe/a/b;->$VALUES:[Lcom/facebook/abtest/qe/a/b;

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
    .line 25
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/abtest/qe/a/b;
    .locals 1

    .prologue
    .line 25
    const-class v0, Lcom/facebook/abtest/qe/a/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/a/b;

    return-object v0
.end method

.method public static values()[Lcom/facebook/abtest/qe/a/b;
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lcom/facebook/abtest/qe/a/b;->$VALUES:[Lcom/facebook/abtest/qe/a/b;

    invoke-virtual {v0}, [Lcom/facebook/abtest/qe/a/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/abtest/qe/a/b;

    return-object v0
.end method
