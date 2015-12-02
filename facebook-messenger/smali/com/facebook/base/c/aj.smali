.class Lcom/facebook/base/c/aj;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Ljava/util/Locale;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 696
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 696
    invoke-direct {p0}, Lcom/facebook/base/c/aj;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Locale;
    .locals 1

    .prologue
    .line 700
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 696
    invoke-virtual {p0}, Lcom/facebook/base/c/aj;->a()Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method
