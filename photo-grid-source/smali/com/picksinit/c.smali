.class final Lcom/picksinit/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/picksinit/b;


# direct methods
.method constructor <init>(Lcom/picksinit/b;)V
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lcom/picksinit/c;->a:Lcom/picksinit/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 83
    invoke-static {}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient;->a()Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient;

    move-result-object v0

    iget-object v1, p0, Lcom/picksinit/c;->a:Lcom/picksinit/b;

    invoke-virtual {v1}, Lcom/picksinit/b;->getMid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/transport/CmMarketHttpClient;->a(Ljava/lang/String;)Z

    .line 84
    return-void
.end method
