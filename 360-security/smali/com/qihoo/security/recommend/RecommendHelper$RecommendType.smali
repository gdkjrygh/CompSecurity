.class public final enum Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/recommend/RecommendHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RecommendType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum Anitvirus:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

.field public static final enum Boost:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

.field public static final enum Clean:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

.field private static final synthetic a:[Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;


# instance fields
.field public countKey:Ljava/lang/String;

.field public iconRes:I

.field public okRes:I

.field public recommendAction:Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

.field public timeKey:Ljava/lang/String;

.field public titleRes:I


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .prologue
    const v6, 0x7f0c017a

    const/4 v13, 0x2

    const/4 v12, 0x1

    const/4 v2, 0x0

    .line 63
    new-instance v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    const-string/jumbo v1, "Boost"

    const-string/jumbo v3, "last_recommend_boost_time"

    const-string/jumbo v4, "boost_recommend_count"

    const v5, 0x7f0200f8

    sget-object v8, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;->Boost:Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    move v7, v6

    invoke-direct/range {v0 .. v8}, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILcom/qihoo/security/recommend/RecommendHelper$RecommendAction;)V

    sput-object v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Boost:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    .line 67
    new-instance v3, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    const-string/jumbo v4, "Clean"

    const-string/jumbo v6, "last_recommend_clean_time"

    const-string/jumbo v7, "clean_recommend_count"

    const v8, 0x7f0200f9

    const v9, 0x7f0c00cf

    const v10, 0x7f0c00d5

    sget-object v11, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;->Clean:Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    move v5, v12

    invoke-direct/range {v3 .. v11}, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILcom/qihoo/security/recommend/RecommendHelper$RecommendAction;)V

    sput-object v3, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Clean:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    .line 70
    new-instance v3, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    const-string/jumbo v4, "Anitvirus"

    const-string/jumbo v6, "last_recommend_anitvirus_time"

    const-string/jumbo v7, "anitvirus_recommend_count"

    const v8, 0x7f0200f7

    const v9, 0x7f0c00d0

    const v10, 0x7f0c00d6

    sget-object v11, Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;->Anivirus:Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    move v5, v13

    invoke-direct/range {v3 .. v11}, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILcom/qihoo/security/recommend/RecommendHelper$RecommendAction;)V

    sput-object v3, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Anitvirus:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    .line 62
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    sget-object v1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Boost:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Clean:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    aput-object v1, v0, v12

    sget-object v1, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->Anitvirus:Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    aput-object v1, v0, v13

    sput-object v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->a:[Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILcom/qihoo/security/recommend/RecommendHelper$RecommendAction;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "III",
            "Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;",
            ")V"
        }
    .end annotation

    .prologue
    .line 80
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 81
    iput-object p3, p0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->timeKey:Ljava/lang/String;

    .line 82
    iput-object p4, p0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->countKey:Ljava/lang/String;

    .line 83
    iput p5, p0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->iconRes:I

    .line 84
    iput p6, p0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->titleRes:I

    .line 85
    iput p7, p0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->okRes:I

    .line 86
    iput-object p8, p0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->recommendAction:Lcom/qihoo/security/recommend/RecommendHelper$RecommendAction;

    .line 87
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;
    .locals 1

    .prologue
    .line 62
    const-class v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;
    .locals 1

    .prologue
    .line 62
    sget-object v0, Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->a:[Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    invoke-virtual {v0}, [Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/recommend/RecommendHelper$RecommendType;

    return-object v0
.end method
