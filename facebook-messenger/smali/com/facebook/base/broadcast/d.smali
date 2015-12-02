.class public Lcom/facebook/base/broadcast/d;
.super Ljava/lang/Object;
.source "BaseFbBroadcastManager.java"

# interfaces
.implements Lcom/facebook/base/broadcast/k;


# instance fields
.field final synthetic a:Lcom/facebook/base/broadcast/b;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/c/b;",
            ">;"
        }
    .end annotation
.end field

.field private c:Landroid/content/IntentFilter;

.field private d:Landroid/os/Handler;


# direct methods
.method protected constructor <init>(Lcom/facebook/base/broadcast/b;)V
    .locals 1

    .prologue
    .line 129
    iput-object p1, p0, Lcom/facebook/base/broadcast/d;->a:Lcom/facebook/base/broadcast/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/broadcast/d;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Handler;)Lcom/facebook/base/broadcast/k;
    .locals 0

    .prologue
    .line 151
    iput-object p1, p0, Lcom/facebook/base/broadcast/d;->d:Landroid/os/Handler;

    .line 152
    return-object p0
.end method

.method public a(Ljava/lang/String;Lcom/facebook/c/b;)Lcom/facebook/base/broadcast/k;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lcom/facebook/base/broadcast/d;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    return-object p0
.end method

.method public a()Lcom/facebook/base/broadcast/l;
    .locals 5

    .prologue
    .line 157
    new-instance v0, Lcom/facebook/base/broadcast/g;

    iget-object v1, p0, Lcom/facebook/base/broadcast/d;->a:Lcom/facebook/base/broadcast/b;

    iget-object v2, p0, Lcom/facebook/base/broadcast/d;->b:Ljava/util/Map;

    iget-object v3, p0, Lcom/facebook/base/broadcast/d;->c:Landroid/content/IntentFilter;

    iget-object v4, p0, Lcom/facebook/base/broadcast/d;->d:Landroid/os/Handler;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/base/broadcast/g;-><init>(Lcom/facebook/base/broadcast/b;Ljava/util/Map;Landroid/content/IntentFilter;Landroid/os/Handler;)V

    return-object v0
.end method
