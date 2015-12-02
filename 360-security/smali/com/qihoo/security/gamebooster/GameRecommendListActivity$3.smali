.class synthetic Lcom/qihoo/security/gamebooster/GameRecommendListActivity$3;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/gamebooster/GameRecommendListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 268
    invoke-static {}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->values()[Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity$3;->a:[I

    :try_start_0
    sget-object v0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity$3;->a:[I

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterAddRecmdAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
