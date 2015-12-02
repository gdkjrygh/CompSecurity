.class public Lcom/facebook/mqtt/p;
.super Ljava/lang/Object;
.source "MqttClientFactory.java"


# instance fields
.field private final a:Landroid/net/ConnectivityManager;

.field private final b:Lcom/facebook/mqtt/y;

.field private final c:Lcom/facebook/analytics/cj;

.field private final d:Lcom/facebook/k/a;

.field private final e:Lcom/facebook/common/time/a;


# direct methods
.method public constructor <init>(Landroid/net/ConnectivityManager;Lcom/facebook/mqtt/y;Lcom/facebook/analytics/cj;Lcom/facebook/k/a;Lcom/facebook/common/time/a;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/facebook/mqtt/p;->a:Landroid/net/ConnectivityManager;

    .line 29
    iput-object p2, p0, Lcom/facebook/mqtt/p;->b:Lcom/facebook/mqtt/y;

    .line 30
    iput-object p3, p0, Lcom/facebook/mqtt/p;->c:Lcom/facebook/analytics/cj;

    .line 31
    iput-object p4, p0, Lcom/facebook/mqtt/p;->d:Lcom/facebook/k/a;

    .line 32
    iput-object p5, p0, Lcom/facebook/mqtt/p;->e:Lcom/facebook/common/time/a;

    .line 33
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/mqtt/w;)Lcom/facebook/mqtt/b;
    .locals 7

    .prologue
    .line 42
    new-instance v0, Lcom/facebook/mqtt/b;

    iget-object v1, p0, Lcom/facebook/mqtt/p;->a:Landroid/net/ConnectivityManager;

    iget-object v2, p0, Lcom/facebook/mqtt/p;->b:Lcom/facebook/mqtt/y;

    iget-object v3, p0, Lcom/facebook/mqtt/p;->c:Lcom/facebook/analytics/cj;

    iget-object v4, p0, Lcom/facebook/mqtt/p;->d:Lcom/facebook/k/a;

    iget-object v6, p0, Lcom/facebook/mqtt/p;->e:Lcom/facebook/common/time/a;

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Lcom/facebook/mqtt/b;-><init>(Landroid/net/ConnectivityManager;Lcom/facebook/mqtt/y;Lcom/facebook/analytics/cj;Lcom/facebook/k/a;Lcom/facebook/mqtt/w;Lcom/facebook/common/time/a;)V

    return-object v0
.end method
