.class public Lcom/facebook/ads/internal/server/d;
.super Lcom/facebook/ads/internal/server/c;


# instance fields
.field public final a:Lcom/facebook/ads/internal/dto/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lcom/facebook/ads/internal/server/c$a;->c:Lcom/facebook/ads/internal/server/c$a;

    invoke-direct {p0, v0}, Lcom/facebook/ads/internal/server/c;-><init>(Lcom/facebook/ads/internal/server/c$a;)V

    new-instance v0, Lcom/facebook/ads/internal/dto/b;

    invoke-direct {v0}, Lcom/facebook/ads/internal/dto/b;-><init>()V

    iput-object v0, p0, Lcom/facebook/ads/internal/server/d;->a:Lcom/facebook/ads/internal/dto/b;

    return-void
.end method


# virtual methods
.method public b()Lcom/facebook/ads/internal/dto/b;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/server/d;->a:Lcom/facebook/ads/internal/dto/b;

    return-object v0
.end method
