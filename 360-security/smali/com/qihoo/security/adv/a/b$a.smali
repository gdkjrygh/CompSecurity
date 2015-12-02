.class Lcom/qihoo/security/adv/a/b$a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/facebook/ads/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/adv/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/adv/a/b;

.field private final b:Lcom/facebook/ads/NativeAd;

.field private final c:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

.field private final d:Z

.field private e:Lcom/qihoo/security/appbox/core/c;

.field private final f:Ljava/lang/String;

.field private final g:J


# direct methods
.method private constructor <init>(Lcom/qihoo/security/adv/a/b;Lcom/facebook/ads/NativeAd;Lcom/qihoo/security/adv/AdvDataManager$AdvType;ZLjava/lang/String;)V
    .locals 2

    .prologue
    .line 133
    iput-object p1, p0, Lcom/qihoo/security/adv/a/b$a;->a:Lcom/qihoo/security/adv/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 134
    iput-object p2, p0, Lcom/qihoo/security/adv/a/b$a;->b:Lcom/facebook/ads/NativeAd;

    .line 135
    iput-object p3, p0, Lcom/qihoo/security/adv/a/b$a;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 136
    iput-boolean p4, p0, Lcom/qihoo/security/adv/a/b$a;->d:Z

    .line 137
    iput-object p5, p0, Lcom/qihoo/security/adv/a/b$a;->f:Ljava/lang/String;

    .line 138
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/adv/a/b$a;->g:J

    .line 139
    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/adv/a/b;Lcom/facebook/ads/NativeAd;Lcom/qihoo/security/adv/AdvDataManager$AdvType;ZLjava/lang/String;Lcom/qihoo/security/adv/a/b$1;)V
    .locals 0

    .prologue
    .line 124
    invoke-direct/range {p0 .. p5}, Lcom/qihoo/security/adv/a/b$a;-><init>(Lcom/qihoo/security/adv/a/b;Lcom/facebook/ads/NativeAd;Lcom/qihoo/security/adv/AdvDataManager$AdvType;ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onAdClicked(Lcom/facebook/ads/a;)V
    .locals 3

    .prologue
    .line 143
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->b:Lcom/facebook/ads/NativeAd;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->e:Lcom/qihoo/security/appbox/core/c;

    if-eqz v0, :cond_0

    .line 147
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->e:Lcom/qihoo/security/appbox/core/c;

    iget-boolean v0, v0, Lcom/qihoo/security/appbox/core/c;->q:Z

    if-eqz v0, :cond_1

    .line 153
    :cond_0
    :goto_0
    return-void

    .line 150
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->e:Lcom/qihoo/security/appbox/core/c;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/qihoo/security/appbox/core/c;->q:Z

    .line 151
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->a:Lcom/qihoo/security/adv/a/b;

    iget-object v1, p0, Lcom/qihoo/security/adv/a/b$a;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iget-object v2, p0, Lcom/qihoo/security/adv/a/b$a;->f:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/adv/a/b;->a(Lcom/qihoo/security/adv/a/b;Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onAdLoaded(Lcom/facebook/ads/a;)V
    .locals 8

    .prologue
    .line 160
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->b:Lcom/facebook/ads/NativeAd;

    if-eq p1, v0, :cond_0

    .line 203
    :goto_0
    return-void

    .line 164
    :cond_0
    new-instance v0, Lcom/qihoo/security/appbox/core/c;

    invoke-direct {v0}, Lcom/qihoo/security/appbox/core/c;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->e:Lcom/qihoo/security/appbox/core/c;

    .line 165
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->b:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd;->f()Ljava/lang/String;

    move-result-object v0

    .line 166
    iget-object v1, p0, Lcom/qihoo/security/adv/a/b$a;->b:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd;->e()Lcom/facebook/ads/NativeAd$a;

    move-result-object v1

    .line 167
    iget-object v2, p0, Lcom/qihoo/security/adv/a/b$a;->b:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v2}, Lcom/facebook/ads/NativeAd;->d()Lcom/facebook/ads/NativeAd$a;

    move-result-object v2

    .line 168
    iget-object v3, p0, Lcom/qihoo/security/adv/a/b$a;->b:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v3}, Lcom/facebook/ads/NativeAd;->g()Ljava/lang/String;

    move-result-object v3

    .line 169
    iget-object v4, p0, Lcom/qihoo/security/adv/a/b$a;->b:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v4}, Lcom/facebook/ads/NativeAd;->j()Lcom/facebook/ads/NativeAd$b;

    move-result-object v4

    .line 170
    iget-object v5, p0, Lcom/qihoo/security/adv/a/b$a;->b:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v5}, Lcom/facebook/ads/NativeAd;->h()Ljava/lang/String;

    move-result-object v5

    .line 171
    if-eqz v0, :cond_1

    .line 172
    iget-object v6, p0, Lcom/qihoo/security/adv/a/b$a;->e:Lcom/qihoo/security/appbox/core/c;

    iput-object v0, v6, Lcom/qihoo/security/appbox/core/c;->j:Ljava/lang/String;

    .line 174
    :cond_1
    if-eqz v1, :cond_2

    .line 175
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->e:Lcom/qihoo/security/appbox/core/c;

    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd$a;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/c;->e:Ljava/lang/String;

    .line 177
    :cond_2
    if-eqz v2, :cond_3

    .line 178
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->e:Lcom/qihoo/security/appbox/core/c;

    invoke-virtual {v2}, Lcom/facebook/ads/NativeAd$a;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/c;->h:Ljava/lang/String;

    .line 180
    :cond_3
    if-eqz v3, :cond_4

    .line 181
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->e:Lcom/qihoo/security/appbox/core/c;

    iput-object v3, v0, Lcom/qihoo/security/appbox/core/c;->b:Ljava/lang/String;

    .line 183
    :cond_4
    if-eqz v4, :cond_5

    .line 184
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->e:Lcom/qihoo/security/appbox/core/c;

    invoke-virtual {v4}, Lcom/facebook/ads/NativeAd$b;->a()D

    move-result-wide v2

    double-to-float v1, v2

    iput v1, v0, Lcom/qihoo/security/appbox/core/c;->m:F

    .line 186
    :cond_5
    if-eqz v5, :cond_6

    .line 187
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->e:Lcom/qihoo/security/appbox/core/c;

    iput-object v5, v0, Lcom/qihoo/security/appbox/core/c;->s:Ljava/lang/String;

    .line 189
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->e:Lcom/qihoo/security/appbox/core/c;

    iget-object v1, p0, Lcom/qihoo/security/adv/a/b$a;->b:Lcom/facebook/ads/NativeAd;

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/c;->o:Lcom/facebook/ads/NativeAd;

    .line 190
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->e:Lcom/qihoo/security/appbox/core/c;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/appbox/core/c;->r:J

    .line 191
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->a:Lcom/qihoo/security/adv/a/b;

    invoke-static {v0}, Lcom/qihoo/security/adv/a/b;->a(Lcom/qihoo/security/adv/a/b;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/adv/a/b$a;->f:Ljava/lang/String;

    iget-object v2, p0, Lcom/qihoo/security/adv/a/b$a;->e:Lcom/qihoo/security/appbox/core/c;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->a:Lcom/qihoo/security/adv/a/b;

    iget-object v1, p0, Lcom/qihoo/security/adv/a/b$a;->f:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qihoo/security/adv/a/b;->a(Lcom/qihoo/security/adv/a/b;Ljava/lang/String;)V

    .line 196
    iget-boolean v0, p0, Lcom/qihoo/security/adv/a/b$a;->d:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->a:Lcom/qihoo/security/adv/a/b;

    invoke-static {v0}, Lcom/qihoo/security/adv/a/b;->b(Lcom/qihoo/security/adv/a/b;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/common/e/b;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 197
    invoke-static {}, Lcom/qihoo/security/appbox/c/a/b;->a()Lcom/qihoo/security/appbox/c/a/b;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/adv/a/b$a;->e:Lcom/qihoo/security/appbox/core/c;

    iget-object v1, v1, Lcom/qihoo/security/appbox/core/c;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/appbox/c/a/b;->a(Ljava/lang/String;)V

    .line 198
    invoke-static {}, Lcom/qihoo/security/appbox/c/a/b;->a()Lcom/qihoo/security/appbox/c/a/b;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/adv/a/b$a;->e:Lcom/qihoo/security/appbox/core/c;

    iget-object v1, v1, Lcom/qihoo/security/appbox/core/c;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/appbox/c/a/b;->a(Ljava/lang/String;)V

    .line 200
    :cond_7
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iget-object v1, p0, Lcom/qihoo/security/adv/a/b$a;->f:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/qihoo/security/adv/a/b$a;->g:J

    sub-long/2addr v4, v6

    invoke-static {v0, v1, v2, v4, v5}, Lcom/qihoo/security/adv/a/c;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;IJ)V

    .line 202
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/f/b;

    iget-object v2, p0, Lcom/qihoo/security/adv/a/b$a;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iget-object v3, p0, Lcom/qihoo/security/adv/a/b$a;->f:Ljava/lang/String;

    const/4 v4, 0x1

    invoke-direct {v1, v2, v3, v4}, Lcom/qihoo/security/f/b;-><init>(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;Z)V

    invoke-virtual {v0, v1}, Lde/greenrobot/event/EventBus;->post(Ljava/lang/Object;)V

    goto/16 :goto_0
.end method

.method public onError(Lcom/facebook/ads/a;Lcom/facebook/ads/c;)V
    .locals 8

    .prologue
    .line 210
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/f/b;

    iget-object v2, p0, Lcom/qihoo/security/adv/a/b$a;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iget-object v3, p0, Lcom/qihoo/security/adv/a/b$a;->f:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lcom/qihoo/security/f/b;-><init>(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;Z)V

    invoke-virtual {v0, v1}, Lde/greenrobot/event/EventBus;->post(Ljava/lang/Object;)V

    .line 211
    iget-object v0, p0, Lcom/qihoo/security/adv/a/b$a;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iget-object v1, p0, Lcom/qihoo/security/adv/a/b$a;->f:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/facebook/ads/c;->a()I

    move-result v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/qihoo/security/adv/a/b$a;->g:J

    sub-long/2addr v4, v6

    invoke-static {v0, v1, v2, v4, v5}, Lcom/qihoo/security/adv/a/c;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;IJ)V

    .line 213
    return-void
.end method
