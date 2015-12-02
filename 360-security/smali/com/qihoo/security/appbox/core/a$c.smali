.class Lcom/qihoo/security/appbox/core/a$c;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/facebook/ads/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/appbox/core/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field a:Lcom/facebook/ads/NativeAd;

.field b:Z

.field c:Lcom/qihoo/security/appbox/core/c;

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field final synthetic f:Lcom/qihoo/security/appbox/core/a;


# direct methods
.method private constructor <init>(Lcom/qihoo/security/appbox/core/a;Lcom/facebook/ads/NativeAd;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    .prologue
    .line 796
    iput-object p1, p0, Lcom/qihoo/security/appbox/core/a$c;->f:Lcom/qihoo/security/appbox/core/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 797
    iput-object p2, p0, Lcom/qihoo/security/appbox/core/a$c;->a:Lcom/facebook/ads/NativeAd;

    .line 798
    iput-boolean p4, p0, Lcom/qihoo/security/appbox/core/a$c;->b:Z

    .line 799
    iput-object p5, p0, Lcom/qihoo/security/appbox/core/a$c;->d:Ljava/lang/String;

    .line 800
    iput-object p3, p0, Lcom/qihoo/security/appbox/core/a$c;->e:Ljava/lang/String;

    .line 801
    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/appbox/core/a;Lcom/facebook/ads/NativeAd;Ljava/lang/String;ZLjava/lang/String;Lcom/qihoo/security/appbox/core/a$1;)V
    .locals 0

    .prologue
    .line 788
    invoke-direct/range {p0 .. p5}, Lcom/qihoo/security/appbox/core/a$c;-><init>(Lcom/qihoo/security/appbox/core/a;Lcom/facebook/ads/NativeAd;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onAdClicked(Lcom/facebook/ads/a;)V
    .locals 6

    .prologue
    .line 806
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$c;->a:Lcom/facebook/ads/NativeAd;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$c;->c:Lcom/qihoo/security/appbox/core/c;

    if-eqz v0, :cond_0

    .line 810
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$c;->c:Lcom/qihoo/security/appbox/core/c;

    iget-boolean v0, v0, Lcom/qihoo/security/appbox/core/c;->q:Z

    if-eqz v0, :cond_1

    .line 825
    :cond_0
    :goto_0
    return-void

    .line 813
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$c;->c:Lcom/qihoo/security/appbox/core/c;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/qihoo/security/appbox/core/c;->q:Z

    .line 814
    new-instance v2, Lcom/facebook/ads/NativeAd;

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a$c;->d:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lcom/facebook/ads/NativeAd;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 815
    new-instance v0, Lcom/qihoo/security/appbox/core/a$c;

    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a$c;->f:Lcom/qihoo/security/appbox/core/a;

    iget-object v3, p0, Lcom/qihoo/security/appbox/core/a$c;->e:Ljava/lang/String;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/qihoo/security/appbox/core/a$c;->d:Ljava/lang/String;

    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/appbox/core/a$c;-><init>(Lcom/qihoo/security/appbox/core/a;Lcom/facebook/ads/NativeAd;Ljava/lang/String;ZLjava/lang/String;)V

    .line 816
    invoke-virtual {v2, v0}, Lcom/facebook/ads/NativeAd;->a(Lcom/facebook/ads/d;)V

    .line 818
    :try_start_0
    invoke-virtual {v2}, Lcom/facebook/ads/NativeAd;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 819
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onAdLoaded(Lcom/facebook/ads/a;)V
    .locals 7

    .prologue
    .line 829
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$c;->a:Lcom/facebook/ads/NativeAd;

    if-eq p1, v0, :cond_1

    .line 873
    :cond_0
    :goto_0
    return-void

    .line 835
    :cond_1
    new-instance v0, Lcom/qihoo/security/appbox/core/c;

    invoke-direct {v0}, Lcom/qihoo/security/appbox/core/c;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/a$c;->c:Lcom/qihoo/security/appbox/core/c;

    .line 836
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$c;->a:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd;->f()Ljava/lang/String;

    move-result-object v0

    .line 837
    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a$c;->a:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd;->e()Lcom/facebook/ads/NativeAd$a;

    move-result-object v1

    .line 838
    iget-object v2, p0, Lcom/qihoo/security/appbox/core/a$c;->a:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v2}, Lcom/facebook/ads/NativeAd;->d()Lcom/facebook/ads/NativeAd$a;

    move-result-object v2

    .line 839
    iget-object v3, p0, Lcom/qihoo/security/appbox/core/a$c;->a:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v3}, Lcom/facebook/ads/NativeAd;->g()Ljava/lang/String;

    move-result-object v3

    .line 840
    iget-object v4, p0, Lcom/qihoo/security/appbox/core/a$c;->a:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v4}, Lcom/facebook/ads/NativeAd;->j()Lcom/facebook/ads/NativeAd$b;

    move-result-object v4

    .line 841
    iget-object v5, p0, Lcom/qihoo/security/appbox/core/a$c;->a:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v5}, Lcom/facebook/ads/NativeAd;->h()Ljava/lang/String;

    move-result-object v5

    .line 842
    if-eqz v0, :cond_2

    .line 843
    iget-object v6, p0, Lcom/qihoo/security/appbox/core/a$c;->c:Lcom/qihoo/security/appbox/core/c;

    iput-object v0, v6, Lcom/qihoo/security/appbox/core/c;->j:Ljava/lang/String;

    .line 845
    :cond_2
    if-eqz v1, :cond_3

    .line 846
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$c;->c:Lcom/qihoo/security/appbox/core/c;

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd$a;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/c;->e:Ljava/lang/String;

    .line 848
    :cond_3
    if-eqz v2, :cond_4

    .line 849
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$c;->c:Lcom/qihoo/security/appbox/core/c;

    invoke-virtual {v2}, Lcom/facebook/ads/NativeAd$a;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/c;->h:Ljava/lang/String;

    .line 851
    :cond_4
    if-eqz v3, :cond_5

    .line 852
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$c;->c:Lcom/qihoo/security/appbox/core/c;

    iput-object v3, v0, Lcom/qihoo/security/appbox/core/c;->b:Ljava/lang/String;

    .line 854
    :cond_5
    if-eqz v4, :cond_6

    .line 855
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$c;->c:Lcom/qihoo/security/appbox/core/c;

    invoke-virtual {v4}, Lcom/facebook/ads/NativeAd$b;->a()D

    move-result-wide v2

    double-to-float v1, v2

    iput v1, v0, Lcom/qihoo/security/appbox/core/c;->m:F

    .line 857
    :cond_6
    if-eqz v5, :cond_7

    .line 858
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$c;->c:Lcom/qihoo/security/appbox/core/c;

    iput-object v5, v0, Lcom/qihoo/security/appbox/core/c;->s:Ljava/lang/String;

    .line 860
    :cond_7
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$c;->c:Lcom/qihoo/security/appbox/core/c;

    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a$c;->a:Lcom/facebook/ads/NativeAd;

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/c;->o:Lcom/facebook/ads/NativeAd;

    .line 861
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$c;->c:Lcom/qihoo/security/appbox/core/c;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/appbox/core/c;->r:J

    .line 862
    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a$c;->f:Lcom/qihoo/security/appbox/core/a;

    monitor-enter v1

    .line 863
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$c;->f:Lcom/qihoo/security/appbox/core/a;

    iget-object v2, p0, Lcom/qihoo/security/appbox/core/a$c;->e:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/qihoo/security/appbox/core/a;->a(Lcom/qihoo/security/appbox/core/a;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 864
    iget-object v2, p0, Lcom/qihoo/security/appbox/core/a$c;->d:Ljava/lang/String;

    iget-object v3, p0, Lcom/qihoo/security/appbox/core/a$c;->c:Lcom/qihoo/security/appbox/core/c;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 868
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 869
    iget-boolean v0, p0, Lcom/qihoo/security/appbox/core/a$c;->b:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/e/b;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 870
    invoke-static {}, Lcom/qihoo/security/appbox/c/a/b;->a()Lcom/qihoo/security/appbox/c/a/b;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a$c;->c:Lcom/qihoo/security/appbox/core/c;

    iget-object v1, v1, Lcom/qihoo/security/appbox/core/c;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/appbox/c/a/b;->a(Ljava/lang/String;)V

    .line 871
    invoke-static {}, Lcom/qihoo/security/appbox/c/a/b;->a()Lcom/qihoo/security/appbox/c/a/b;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a$c;->c:Lcom/qihoo/security/appbox/core/c;

    iget-object v1, v1, Lcom/qihoo/security/appbox/core/c;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/appbox/c/a/b;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 868
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public onError(Lcom/facebook/ads/a;Lcom/facebook/ads/c;)V
    .locals 0

    .prologue
    .line 880
    return-void
.end method
