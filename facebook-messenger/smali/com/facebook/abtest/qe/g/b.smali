.class public final Lcom/facebook/abtest/qe/g/b;
.super Lcom/facebook/inject/d;
.source "LocaleUtilAutoProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/abtest/qe/g/a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/abtest/qe/g/a;
    .locals 1

    .prologue
    .line 13
    new-instance v0, Lcom/facebook/abtest/qe/g/a;

    invoke-direct {v0}, Lcom/facebook/abtest/qe/g/a;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 8
    invoke-virtual {p0}, Lcom/facebook/abtest/qe/g/b;->a()Lcom/facebook/abtest/qe/g/a;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 18
    instance-of v0, p1, Lcom/facebook/abtest/qe/g/b;

    return v0
.end method
