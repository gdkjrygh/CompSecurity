.class final Lcom/cleanmaster/ui/app/market/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/http/client/RedirectHandler;


# instance fields
.field final synthetic a:Lcom/cleanmaster/ui/app/market/i;


# direct methods
.method constructor <init>(Lcom/cleanmaster/ui/app/market/i;)V
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/j;->a:Lcom/cleanmaster/ui/app/market/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getLocationURI(Lorg/apache/http/HttpResponse;Lorg/apache/http/protocol/HttpContext;)Ljava/net/URI;
    .locals 1

    .prologue
    .line 63
    const/4 v0, 0x0

    return-object v0
.end method

.method public final isRedirectRequested(Lorg/apache/http/HttpResponse;Lorg/apache/http/protocol/HttpContext;)Z
    .locals 1

    .prologue
    .line 68
    const/4 v0, 0x0

    return v0
.end method
