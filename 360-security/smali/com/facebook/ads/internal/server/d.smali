.class public Lcom/facebook/ads/internal/server/d;
.super Lcom/facebook/ads/internal/server/c;


# instance fields
.field protected d:Ljava/lang/String;

.field public e:Lcom/facebook/ads/internal/d/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/facebook/ads/internal/server/c$a;->c:Lcom/facebook/ads/internal/server/c$a;

    invoke-direct {p0, v0, p2, p1}, Lcom/facebook/ads/internal/server/c;-><init>(Lcom/facebook/ads/internal/server/c$a;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/ads/internal/d/b;

    invoke-direct {v0}, Lcom/facebook/ads/internal/d/b;-><init>()V

    iput-object v0, p0, Lcom/facebook/ads/internal/server/d;->e:Lcom/facebook/ads/internal/d/b;

    return-void
.end method


# virtual methods
.method public b()Lcom/facebook/ads/internal/d/b;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/server/d;->e:Lcom/facebook/ads/internal/d/b;

    return-object v0
.end method
