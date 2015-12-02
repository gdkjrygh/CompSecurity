.class final enum Lcom/qihoo/security/ui/main/BoosterFragment$e;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/main/BoosterFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/ui/main/BoosterFragment$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/qihoo/security/ui/main/BoosterFragment$e;

.field public static final enum b:Lcom/qihoo/security/ui/main/BoosterFragment$e;

.field public static final enum c:Lcom/qihoo/security/ui/main/BoosterFragment$e;

.field public static final enum d:Lcom/qihoo/security/ui/main/BoosterFragment$e;

.field public static final enum e:Lcom/qihoo/security/ui/main/BoosterFragment$e;

.field public static final enum f:Lcom/qihoo/security/ui/main/BoosterFragment$e;

.field public static final enum g:Lcom/qihoo/security/ui/main/BoosterFragment$e;

.field private static final synthetic h:[Lcom/qihoo/security/ui/main/BoosterFragment$e;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 203
    new-instance v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;

    const-string/jumbo v1, "IDLE"

    invoke-direct {v0, v1, v3}, Lcom/qihoo/security/ui/main/BoosterFragment$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->a:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    .line 204
    new-instance v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;

    const-string/jumbo v1, "SCANNING"

    invoke-direct {v0, v1, v4}, Lcom/qihoo/security/ui/main/BoosterFragment$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->b:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    .line 205
    new-instance v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;

    const-string/jumbo v1, "READY_BOOST"

    invoke-direct {v0, v1, v5}, Lcom/qihoo/security/ui/main/BoosterFragment$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->c:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    .line 206
    new-instance v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;

    const-string/jumbo v1, "BOOSTING"

    invoke-direct {v0, v1, v6}, Lcom/qihoo/security/ui/main/BoosterFragment$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->d:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    .line 207
    new-instance v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;

    const-string/jumbo v1, "BOOSTED"

    invoke-direct {v0, v1, v7}, Lcom/qihoo/security/ui/main/BoosterFragment$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->e:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    .line 208
    new-instance v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;

    const-string/jumbo v1, "BOOSTED_BACK"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/main/BoosterFragment$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->f:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    .line 209
    new-instance v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;

    const-string/jumbo v1, "FASTEST"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/main/BoosterFragment$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->g:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    .line 202
    const/4 v0, 0x7

    new-array v0, v0, [Lcom/qihoo/security/ui/main/BoosterFragment$e;

    sget-object v1, Lcom/qihoo/security/ui/main/BoosterFragment$e;->a:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo/security/ui/main/BoosterFragment$e;->b:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo/security/ui/main/BoosterFragment$e;->c:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    aput-object v1, v0, v5

    sget-object v1, Lcom/qihoo/security/ui/main/BoosterFragment$e;->d:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    aput-object v1, v0, v6

    sget-object v1, Lcom/qihoo/security/ui/main/BoosterFragment$e;->e:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/qihoo/security/ui/main/BoosterFragment$e;->f:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/qihoo/security/ui/main/BoosterFragment$e;->g:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->h:[Lcom/qihoo/security/ui/main/BoosterFragment$e;

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
    .line 202
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/ui/main/BoosterFragment$e;
    .locals 1

    .prologue
    .line 202
    const-class v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/ui/main/BoosterFragment$e;
    .locals 1

    .prologue
    .line 202
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->h:[Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-virtual {v0}, [Lcom/qihoo/security/ui/main/BoosterFragment$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/ui/main/BoosterFragment$e;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 212
    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->a:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment$e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->c:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment$e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/qihoo/security/ui/main/BoosterFragment$e;->g:Lcom/qihoo/security/ui/main/BoosterFragment$e;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/main/BoosterFragment$e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
