.class Lcom/facebook/user/ad;
.super Ljava/lang/ThreadLocal;
.source "UserSerialization.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal",
        "<",
        "Ljava/text/SimpleDateFormat;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/user/ac;


# direct methods
.method constructor <init>(Lcom/facebook/user/ac;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/facebook/user/ad;->a:Lcom/facebook/user/ac;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()Ljava/text/SimpleDateFormat;
    .locals 3

    .prologue
    .line 46
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "M/d/y"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    return-object v0
.end method

.method protected synthetic initialValue()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 43
    invoke-virtual {p0}, Lcom/facebook/user/ad;->a()Ljava/text/SimpleDateFormat;

    move-result-object v0

    return-object v0
.end method
