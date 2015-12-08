.class public final enum Lcom/mopub/common/event/BaseEvent$Category;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mopub/common/event/BaseEvent$Category;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum REQUESTS:Lcom/mopub/common/event/BaseEvent$Category;

.field private static final synthetic b:[Lcom/mopub/common/event/BaseEvent$Category;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 80
    new-instance v0, Lcom/mopub/common/event/BaseEvent$Category;

    const-string v1, "REQUESTS"

    const-string v2, "requests"

    invoke-direct {v0, v1, v2}, Lcom/mopub/common/event/BaseEvent$Category;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$Category;->REQUESTS:Lcom/mopub/common/event/BaseEvent$Category;

    .line 79
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/mopub/common/event/BaseEvent$Category;

    const/4 v1, 0x0

    sget-object v2, Lcom/mopub/common/event/BaseEvent$Category;->REQUESTS:Lcom/mopub/common/event/BaseEvent$Category;

    aput-object v2, v0, v1

    sput-object v0, Lcom/mopub/common/event/BaseEvent$Category;->b:[Lcom/mopub/common/event/BaseEvent$Category;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 83
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 84
    iput-object p2, p0, Lcom/mopub/common/event/BaseEvent$Category;->a:Ljava/lang/String;

    .line 85
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/common/event/BaseEvent$Category;
    .locals 1

    .prologue
    .line 79
    const-class v0, Lcom/mopub/common/event/BaseEvent$Category;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/event/BaseEvent$Category;

    return-object v0
.end method

.method public static values()[Lcom/mopub/common/event/BaseEvent$Category;
    .locals 1

    .prologue
    .line 79
    sget-object v0, Lcom/mopub/common/event/BaseEvent$Category;->b:[Lcom/mopub/common/event/BaseEvent$Category;

    invoke-virtual {v0}, [Lcom/mopub/common/event/BaseEvent$Category;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/common/event/BaseEvent$Category;

    return-object v0
.end method


# virtual methods
.method public final getCategory()Ljava/lang/String;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/mopub/common/event/BaseEvent$Category;->a:Ljava/lang/String;

    return-object v0
.end method
