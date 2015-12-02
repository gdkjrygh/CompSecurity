.class Lcom/facebook/appconfig/e;
.super Ljava/lang/Object;
.source "AppConfigConfigurationComponent.java"

# interfaces
.implements Lcom/facebook/http/protocol/v;


# instance fields
.field final synthetic a:Lcom/facebook/appconfig/c;


# direct methods
.method private constructor <init>(Lcom/facebook/appconfig/c;)V
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lcom/facebook/appconfig/e;->a:Lcom/facebook/appconfig/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/appconfig/c;Lcom/facebook/appconfig/d;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0, p1}, Lcom/facebook/appconfig/e;-><init>(Lcom/facebook/appconfig/c;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/http/protocol/y;",
            ">;"
        }
    .end annotation

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/appconfig/e;->a:Lcom/facebook/appconfig/c;

    invoke-static {v0}, Lcom/facebook/appconfig/c;->a(Lcom/facebook/appconfig/c;)Lcom/facebook/appconfig/o;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    const-string v1, "appConfig"

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v0

    .line 46
    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 51
    const-string v0, "appConfig"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/appconfig/AppConfig;

    .line 52
    iget-object v1, p0, Lcom/facebook/appconfig/e;->a:Lcom/facebook/appconfig/c;

    invoke-static {v1}, Lcom/facebook/appconfig/c;->b(Lcom/facebook/appconfig/c;)Lcom/facebook/appconfig/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/appconfig/b;->a(Lcom/facebook/appconfig/AppConfig;)V

    .line 53
    return-void
.end method
