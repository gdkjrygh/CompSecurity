.class public final enum Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/recommend/RecommendHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RecommendAction"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum Anivirus:Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

.field public static final enum Boost:Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

.field public static final enum Clean:Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

.field private static final synthetic a:[Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;


# instance fields
.field public cancel:I

.field public click:I

.field public show:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .prologue
    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v2, 0x0

    .line 47
    new-instance v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    const-string/jumbo v1, "Boost"

    const/16 v3, 0x6d61

    const/16 v4, 0x6d62

    const/16 v5, 0x6d63

    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;-><init>(Ljava/lang/String;IIII)V

    sput-object v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;->Boost:Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    .line 48
    new-instance v3, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    const-string/jumbo v4, "Clean"

    const/16 v6, 0x6d64

    const/16 v7, 0x6d65

    const/16 v8, 0x6d66

    move v5, v9

    invoke-direct/range {v3 .. v8}, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;-><init>(Ljava/lang/String;IIII)V

    sput-object v3, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;->Clean:Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    .line 49
    new-instance v3, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    const-string/jumbo v4, "Anivirus"

    const/16 v6, 0x6d67

    const/16 v7, 0x6d68

    const/16 v8, 0x6d69

    move v5, v10

    invoke-direct/range {v3 .. v8}, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;-><init>(Ljava/lang/String;IIII)V

    sput-object v3, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;->Anivirus:Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    .line 46
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    sget-object v1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;->Boost:Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    aput-object v1, v0, v2

    sget-object v1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;->Clean:Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    aput-object v1, v0, v9

    sget-object v1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;->Anivirus:Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    aput-object v1, v0, v10

    sput-object v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;->a:[Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III)V"
        }
    .end annotation

    .prologue
    .line 55
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 56
    iput p3, p0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;->show:I

    .line 57
    iput p4, p0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;->click:I

    .line 58
    iput p5, p0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;->cancel:I

    .line 59
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;
    .locals 1

    .prologue
    .line 46
    const-class v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;
    .locals 1

    .prologue
    .line 46
    sget-object v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;->a:[Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    invoke-virtual {v0}, [Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    return-object v0
.end method
