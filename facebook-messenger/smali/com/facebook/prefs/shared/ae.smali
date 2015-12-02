.class public Lcom/facebook/prefs/shared/ae;
.super Lcom/facebook/common/s/a;
.source "PrefKey.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/common/s/a",
        "<",
        "Lcom/facebook/prefs/shared/ae;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1}, Lcom/facebook/common/s/a;-><init>(Ljava/lang/String;)V

    .line 14
    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;
    .locals 1

    .prologue
    .line 18
    new-instance v0, Lcom/facebook/prefs/shared/ae;

    invoke-direct {v0, p1}, Lcom/facebook/prefs/shared/ae;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method protected synthetic b(Ljava/lang/String;)Lcom/facebook/common/s/a;
    .locals 1

    .prologue
    .line 10
    invoke-virtual {p0, p1}, Lcom/facebook/prefs/shared/ae;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    return-object v0
.end method
