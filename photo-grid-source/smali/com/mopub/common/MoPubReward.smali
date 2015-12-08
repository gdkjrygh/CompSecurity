.class public final Lcom/mopub/common/MoPubReward;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final NO_REWARD_AMOUNT:I = -0x7b

.field public static final NO_REWARD_LABEL:Ljava/lang/String; = ""


# instance fields
.field private final a:Z

.field private final b:Ljava/lang/String;

.field private final c:I


# direct methods
.method private constructor <init>(ZLjava/lang/String;I)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-boolean p1, p0, Lcom/mopub/common/MoPubReward;->a:Z

    .line 17
    iput-object p2, p0, Lcom/mopub/common/MoPubReward;->b:Ljava/lang/String;

    .line 18
    iput p3, p0, Lcom/mopub/common/MoPubReward;->c:I

    .line 19
    return-void
.end method

.method public static failure()Lcom/mopub/common/MoPubReward;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 23
    new-instance v0, Lcom/mopub/common/MoPubReward;

    const-string v1, ""

    invoke-direct {v0, v2, v1, v2}, Lcom/mopub/common/MoPubReward;-><init>(ZLjava/lang/String;I)V

    return-object v0
.end method

.method public static success(Ljava/lang/String;I)Lcom/mopub/common/MoPubReward;
    .locals 2

    .prologue
    .line 28
    new-instance v0, Lcom/mopub/common/MoPubReward;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p1}, Lcom/mopub/common/MoPubReward;-><init>(ZLjava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public final getAmount()I
    .locals 1

    .prologue
    .line 41
    iget v0, p0, Lcom/mopub/common/MoPubReward;->c:I

    return v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/mopub/common/MoPubReward;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final isSuccessful()Z
    .locals 1

    .prologue
    .line 32
    iget-boolean v0, p0, Lcom/mopub/common/MoPubReward;->a:Z

    return v0
.end method
