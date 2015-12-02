.class Lcom/facebook/http/b/z;
.super Lcom/facebook/inject/d;
.source "FbHttpModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/http/protocol/q;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/http/b/w;


# direct methods
.method private constructor <init>(Lcom/facebook/http/b/w;)V
    .locals 0

    .prologue
    .line 305
    iput-object p1, p0, Lcom/facebook/http/b/z;->a:Lcom/facebook/http/b/w;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/http/b/w;Lcom/facebook/http/b/x;)V
    .locals 0

    .prologue
    .line 305
    invoke-direct {p0, p1}, Lcom/facebook/http/b/z;-><init>(Lcom/facebook/http/b/w;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/http/protocol/q;
    .locals 4

    .prologue
    .line 309
    new-instance v0, Lcom/facebook/http/protocol/q;

    const-class v1, Ljava/util/Locale;

    invoke-virtual {p0, v1}, Lcom/facebook/http/b/z;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    const-class v2, Ljava/lang/String;

    const-class v3, Lcom/facebook/common/hardware/PhoneIsoCountryCode;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/http/b/z;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/http/protocol/q;-><init>(Ljavax/inject/a;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 305
    invoke-virtual {p0}, Lcom/facebook/http/b/z;->a()Lcom/facebook/http/protocol/q;

    move-result-object v0

    return-object v0
.end method
