.class public final enum Lcom/mopub/common/event/BaseEvent$Name;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mopub/common/event/BaseEvent$Name;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum AD_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

.field public static final enum CLICK_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

.field public static final enum IMPRESSION_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

.field private static final synthetic b:[Lcom/mopub/common/event/BaseEvent$Name;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 64
    new-instance v0, Lcom/mopub/common/event/BaseEvent$Name;

    const-string v1, "AD_REQUEST"

    const-string v2, "ad_request"

    invoke-direct {v0, v1, v3, v2}, Lcom/mopub/common/event/BaseEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$Name;->AD_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

    .line 65
    new-instance v0, Lcom/mopub/common/event/BaseEvent$Name;

    const-string v1, "IMPRESSION_REQUEST"

    const-string v2, "impression_request"

    invoke-direct {v0, v1, v4, v2}, Lcom/mopub/common/event/BaseEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$Name;->IMPRESSION_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

    .line 66
    new-instance v0, Lcom/mopub/common/event/BaseEvent$Name;

    const-string v1, "CLICK_REQUEST"

    const-string v2, "click_request"

    invoke-direct {v0, v1, v5, v2}, Lcom/mopub/common/event/BaseEvent$Name;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$Name;->CLICK_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

    .line 63
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/mopub/common/event/BaseEvent$Name;

    sget-object v1, Lcom/mopub/common/event/BaseEvent$Name;->AD_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mopub/common/event/BaseEvent$Name;->IMPRESSION_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

    aput-object v1, v0, v4

    sget-object v1, Lcom/mopub/common/event/BaseEvent$Name;->CLICK_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;

    aput-object v1, v0, v5

    sput-object v0, Lcom/mopub/common/event/BaseEvent$Name;->b:[Lcom/mopub/common/event/BaseEvent$Name;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 69
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 70
    iput-object p3, p0, Lcom/mopub/common/event/BaseEvent$Name;->a:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/common/event/BaseEvent$Name;
    .locals 1

    .prologue
    .line 63
    const-class v0, Lcom/mopub/common/event/BaseEvent$Name;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/event/BaseEvent$Name;

    return-object v0
.end method

.method public static values()[Lcom/mopub/common/event/BaseEvent$Name;
    .locals 1

    .prologue
    .line 63
    sget-object v0, Lcom/mopub/common/event/BaseEvent$Name;->b:[Lcom/mopub/common/event/BaseEvent$Name;

    invoke-virtual {v0}, [Lcom/mopub/common/event/BaseEvent$Name;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/common/event/BaseEvent$Name;

    return-object v0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent$Name;->a:Ljava/lang/String;

    return-object v0
.end method
