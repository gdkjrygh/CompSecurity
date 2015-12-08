.class public Lcom/facebook/ads/internal/dto/a;
.super Ljava/lang/Object;


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field public final a:Lcom/facebook/ads/internal/server/AdPlacementType;

.field public b:Ljava/lang/String;

.field public c:Lorg/json/JSONObject;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/facebook/ads/internal/dto/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/ads/internal/dto/a;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/ads/internal/server/AdPlacementType;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/ads/internal/dto/a;->a:Lcom/facebook/ads/internal/server/AdPlacementType;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/internal/dto/a;->b:Ljava/lang/String;

    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/internal/dto/a;->c:Lorg/json/JSONObject;

    return-void
.end method
