.class Lcom/facebook/zero/ui/e;
.super Ljava/lang/Object;
.source "CarrierBottomBannerController.java"

# interfaces
.implements Lcom/facebook/zero/ui/c;


# instance fields
.field final synthetic a:Lcom/facebook/zero/ui/d;


# direct methods
.method constructor <init>(Lcom/facebook/zero/ui/d;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/facebook/zero/ui/e;->a:Lcom/facebook/zero/ui/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/facebook/zero/ui/e;->a:Lcom/facebook/zero/ui/d;

    invoke-static {v0}, Lcom/facebook/zero/ui/d;->a(Lcom/facebook/zero/ui/d;)V

    .line 76
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/facebook/zero/ui/e;->a:Lcom/facebook/zero/ui/d;

    invoke-static {v0, p1}, Lcom/facebook/zero/ui/d;->a(Lcom/facebook/zero/ui/d;Ljava/lang/String;)V

    .line 81
    return-void
.end method
