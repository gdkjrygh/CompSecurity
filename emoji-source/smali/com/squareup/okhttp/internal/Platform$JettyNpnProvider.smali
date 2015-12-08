.class Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;
.super Ljava/lang/Object;
.source "Platform.java"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/Platform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "JettyNpnProvider"
.end annotation


# instance fields
.field private final protocols:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private selected:Ljava/lang/String;

.field private unsupported:Z


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 337
    .local p1, "protocols":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 338
    iput-object p1, p0, Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;->protocols:Ljava/util/List;

    .line 339
    return-void
.end method

.method static synthetic access$200(Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;)Z
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;

    .prologue
    .line 332
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;->unsupported:Z

    return v0
.end method

.method static synthetic access$300(Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;

    .prologue
    .line 332
    iget-object v0, p0, Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;->selected:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1, "proxy"    # Ljava/lang/Object;
    .param p2, "method"    # Ljava/lang/reflect/Method;
    .param p3, "args"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 342
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    .line 343
    .local v0, "methodName":Ljava/lang/String;
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    .line 344
    .local v1, "returnType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    if-nez p3, :cond_0

    .line 345
    sget-object p3, Lcom/squareup/okhttp/internal/Util;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    .line 347
    :cond_0
    const-string v3, "supports"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v3, v1, :cond_1

    .line 348
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    .line 366
    :goto_0
    return-object v3

    .line 349
    :cond_1
    const-string v3, "unsupported"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-ne v3, v1, :cond_2

    .line 350
    iput-boolean v6, p0, Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;->unsupported:Z

    move-object v3, v4

    .line 351
    goto :goto_0

    .line 352
    :cond_2
    const-string v3, "protocols"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    array-length v3, p3

    if-nez v3, :cond_3

    .line 353
    iget-object v3, p0, Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;->protocols:Ljava/util/List;

    goto :goto_0

    .line 354
    :cond_3
    const-string v3, "selectProtocol"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const-class v3, Ljava/lang/String;

    if-ne v3, v1, :cond_5

    array-length v3, p3

    if-ne v3, v6, :cond_5

    aget-object v3, p3, v5

    if-eqz v3, :cond_4

    aget-object v3, p3, v5

    instance-of v3, v3, Ljava/util/List;

    if-eqz v3, :cond_5

    .line 359
    :cond_4
    aget-object v2, p3, v5

    check-cast v2, Ljava/util/List;

    .line 360
    .local v2, "serverProtocols":Ljava/util/List;, "Ljava/util/List<*>;"
    iget-object v3, p0, Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;->protocols:Ljava/util/List;

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iput-object v3, p0, Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;->selected:Ljava/lang/String;

    .line 361
    iget-object v3, p0, Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;->selected:Ljava/lang/String;

    goto :goto_0

    .line 362
    .end local v2    # "serverProtocols":Ljava/util/List;, "Ljava/util/List<*>;"
    :cond_5
    const-string v3, "protocolSelected"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    array-length v3, p3

    if-ne v3, v6, :cond_6

    .line 363
    aget-object v3, p3, v5

    check-cast v3, Ljava/lang/String;

    iput-object v3, p0, Lcom/squareup/okhttp/internal/Platform$JettyNpnProvider;->selected:Ljava/lang/String;

    move-object v3, v4

    .line 364
    goto :goto_0

    .line 366
    :cond_6
    invoke-virtual {p2, p0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0
.end method
