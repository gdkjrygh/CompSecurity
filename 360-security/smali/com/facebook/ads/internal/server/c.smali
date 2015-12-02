.class public Lcom/facebook/ads/internal/server/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/ads/internal/server/c$a;
    }
.end annotation


# instance fields
.field protected a:Lcom/facebook/ads/internal/server/c$a;

.field protected b:Ljava/lang/String;

.field protected c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/facebook/ads/internal/server/c$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    sget-object v0, Lcom/facebook/ads/internal/server/c$a;->a:Lcom/facebook/ads/internal/server/c$a;

    iput-object v0, p0, Lcom/facebook/ads/internal/server/c;->a:Lcom/facebook/ads/internal/server/c$a;

    :cond_0
    return-void
.end method

.method public constructor <init>(Lcom/facebook/ads/internal/server/c$a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/ads/internal/server/c;->a:Lcom/facebook/ads/internal/server/c$a;

    iput-object p2, p0, Lcom/facebook/ads/internal/server/c;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/ads/internal/server/c;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ads/internal/server/c$a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/server/c;->a:Lcom/facebook/ads/internal/server/c$a;

    return-object v0
.end method
