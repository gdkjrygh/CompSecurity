.class public Lcom/facebook/o/b;
.super Ljava/lang/Object;
.source "StrictModeAggregator.java"

# interfaces
.implements Lcom/b/a/c;


# instance fields
.field private final a:Lcom/facebook/common/e/h;


# direct methods
.method public constructor <init>(Lcom/facebook/common/e/h;)V
    .locals 0

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Lcom/facebook/o/b;->a:Lcom/facebook/common/e/h;

    .line 69
    return-void
.end method


# virtual methods
.method public report(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 75
    if-nez p1, :cond_0

    .line 89
    :goto_0
    return-void

    .line 80
    :cond_0
    const-string v0, "\n"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    .line 83
    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 84
    array-length v2, v1

    if-le v2, v3, :cond_1

    .line 85
    aget-object v0, v1, v3

    .line 88
    :cond_1
    iget-object v1, p0, Lcom/facebook/o/b;->a:Lcom/facebook/common/e/h;

    invoke-interface {v1, v0, v0, p1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
