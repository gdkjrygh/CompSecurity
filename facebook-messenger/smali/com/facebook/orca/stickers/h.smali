.class Lcom/facebook/orca/stickers/h;
.super Ljava/lang/Object;
.source "StickerLogger.java"


# instance fields
.field private final a:Lcom/facebook/analytics/av;


# direct methods
.method constructor <init>(Lcom/facebook/analytics/av;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/facebook/orca/stickers/h;->a:Lcom/facebook/analytics/av;

    .line 18
    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;)Lcom/facebook/analytics/cb;
    .locals 2

    .prologue
    .line 28
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "click"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 29
    invoke-virtual {v0, p1}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 30
    return-object v0
.end method

.method a(Lcom/facebook/analytics/cb;)V
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/orca/stickers/h;->a:Lcom/facebook/analytics/av;

    invoke-interface {v0, p1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 25
    return-void
.end method
