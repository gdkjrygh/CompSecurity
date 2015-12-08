.class Lcom/flurry/sdk/iy$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/util/Map;

.field final synthetic c:Lcom/flurry/sdk/iy;


# direct methods
.method constructor <init>(Lcom/flurry/sdk/iy;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0

    .prologue
    .line 687
    iput-object p1, p0, Lcom/flurry/sdk/iy$7;->c:Lcom/flurry/sdk/iy;

    iput-object p2, p0, Lcom/flurry/sdk/iy$7;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/flurry/sdk/iy$7;->b:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 690
    invoke-static {}, Lcom/flurry/sdk/hi;->a()Lcom/flurry/sdk/hi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/hi;->c()Lcom/flurry/sdk/id;

    move-result-object v0

    iget-object v1, p0, Lcom/flurry/sdk/iy$7;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/flurry/sdk/iy$7;->b:Ljava/util/Map;

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/id;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 691
    return-void
.end method
