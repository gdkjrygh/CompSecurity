.class Lcom/facebook/push/mqtt/n;
.super Lcom/facebook/inject/d;
.source "KeepaliveDelayAdjustmentPercentageProvider.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/push/mqtt/n;->a:Lcom/facebook/prefs/shared/d;

    .line 25
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 3

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/push/mqtt/n;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/push/mqtt/au;->c:Lcom/facebook/prefs/shared/ae;

    const/16 v2, 0x1e

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 16
    invoke-virtual {p0}, Lcom/facebook/push/mqtt/n;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
