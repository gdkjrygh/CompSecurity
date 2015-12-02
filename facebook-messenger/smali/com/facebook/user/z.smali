.class Lcom/facebook/user/z;
.super Lcom/facebook/inject/d;
.source "UserModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/user/a/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/user/x;


# direct methods
.method private constructor <init>(Lcom/facebook/user/x;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/facebook/user/z;->a:Lcom/facebook/user/x;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/user/x;Lcom/facebook/user/y;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/facebook/user/z;-><init>(Lcom/facebook/user/x;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/user/a/h;
    .locals 2

    .prologue
    .line 40
    new-instance v0, Lcom/facebook/user/a/h;

    const-class v1, Ljava/util/Locale;

    invoke-virtual {p0, v1}, Lcom/facebook/user/z;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/user/a/h;-><init>(Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 36
    invoke-virtual {p0}, Lcom/facebook/user/z;->a()Lcom/facebook/user/a/h;

    move-result-object v0

    return-object v0
.end method
