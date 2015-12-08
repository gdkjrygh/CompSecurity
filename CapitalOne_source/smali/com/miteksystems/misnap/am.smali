.class public final Lcom/miteksystems/misnap/am;
.super Landroid/widget/FrameLayout;

# interfaces
.implements Lcom/miteksystems/misnap/a;


# instance fields
.field a:Landroid/os/Handler;

.field b:Ljava/util/List;

.field private c:Lcom/miteksystems/misnap/MiSnap;

.field private d:Lcom/miteksystems/misnap/MitekAnalyzer;

.field private e:Ljava/util/List;

.field private f:J

.field private g:Ljava/util/HashMap;


# direct methods
.method private constructor <init>(Lcom/miteksystems/misnap/MiSnap;Landroid/os/Handler;)V
    .locals 2

    const/4 v1, 0x0

    const/4 v0, 0x0

    invoke-direct {p0, p1, v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v1, p0, Lcom/miteksystems/misnap/am;->a:Landroid/os/Handler;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/am;->e:Ljava/util/List;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/am;->g:Ljava/util/HashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/miteksystems/misnap/am;->b:Ljava/util/List;

    iput-object p1, p0, Lcom/miteksystems/misnap/am;->c:Lcom/miteksystems/misnap/MiSnap;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/miteksystems/misnap/am;->f:J

    iput-object p2, p0, Lcom/miteksystems/misnap/am;->a:Landroid/os/Handler;

    return-void
.end method

.method private constructor <init>(Lcom/miteksystems/misnap/MiSnap;Landroid/os/Handler;B)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/miteksystems/misnap/am;-><init>(Lcom/miteksystems/misnap/MiSnap;Landroid/os/Handler;)V

    return-void
.end method

.method constructor <init>(Lcom/miteksystems/misnap/MiSnap;Landroid/os/Handler;C)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/miteksystems/misnap/am;-><init>(Lcom/miteksystems/misnap/MiSnap;Landroid/os/Handler;B)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/miteksystems/misnap/MitekAnalyzer;)I
    .locals 5

    const/4 v1, 0x0

    const/4 v4, -0x1

    const/4 v0, 0x1

    iget-object v2, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    if-nez v2, :cond_0

    iput-object p1, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    :cond_0
    iget-object v2, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->l()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->l()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x5

    if-eq v2, v3, :cond_3

    :cond_1
    iget-object v2, p0, Lcom/miteksystems/misnap/am;->c:Lcom/miteksystems/misnap/MiSnap;

    sget v3, Lcom/miteksystems/misnap/R$string;->uxp_not_found:I

    invoke-virtual {v2, v3}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v4}, Lcom/miteksystems/misnap/am;->a(Ljava/lang/String;I)V

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/miteksystems/misnap/am;->a:Landroid/os/Handler;

    const/16 v2, 0xd

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_2
    return v1

    :cond_3
    iget-object v2, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->b()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->c()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/miteksystems/misnap/am;->c:Lcom/miteksystems/misnap/MiSnap;

    sget v3, Lcom/miteksystems/misnap/R$string;->uxp_closeness_failure:I

    invoke-virtual {v2, v3}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v3}, Lcom/miteksystems/misnap/MitekAnalyzer;->g()I

    move-result v3

    invoke-virtual {p0, v2, v3}, Lcom/miteksystems/misnap/am;->a(Ljava/lang/String;I)V

    goto :goto_0

    :cond_4
    iget-object v2, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->a()Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, p0, Lcom/miteksystems/misnap/am;->c:Lcom/miteksystems/misnap/MiSnap;

    sget v3, Lcom/miteksystems/misnap/R$string;->uxp_angle_failure:I

    invoke-virtual {v2, v3}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v3}, Lcom/miteksystems/misnap/MitekAnalyzer;->f()I

    move-result v3

    invoke-virtual {p0, v2, v3}, Lcom/miteksystems/misnap/am;->a(Ljava/lang/String;I)V

    goto :goto_0

    :cond_5
    iget-object v2, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->d()Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, p0, Lcom/miteksystems/misnap/am;->c:Lcom/miteksystems/misnap/MiSnap;

    sget v3, Lcom/miteksystems/misnap/R$string;->uxp_brightness_failure:I

    invoke-virtual {v2, v3}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v3}, Lcom/miteksystems/misnap/MitekAnalyzer;->j()I

    move-result v3

    invoke-virtual {p0, v2, v3}, Lcom/miteksystems/misnap/am;->a(Ljava/lang/String;I)V

    goto :goto_0

    :cond_6
    iget-object v2, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->e()Z

    move-result v2

    if-nez v2, :cond_7

    iget-object v2, p0, Lcom/miteksystems/misnap/am;->c:Lcom/miteksystems/misnap/MiSnap;

    sget v3, Lcom/miteksystems/misnap/R$string;->uxp_sharpness_failure:I

    invoke-virtual {v2, v3}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v3}, Lcom/miteksystems/misnap/MitekAnalyzer;->k()I

    move-result v3

    invoke-virtual {p0, v2, v3}, Lcom/miteksystems/misnap/am;->a(Ljava/lang/String;I)V

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lcom/miteksystems/misnap/am;->c:Lcom/miteksystems/misnap/MiSnap;

    sget v2, Lcom/miteksystems/misnap/R$string;->uxp_capture_unsteady:I

    invoke-virtual {v0, v2}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v4}, Lcom/miteksystems/misnap/am;->a(Ljava/lang/String;I)V

    move v0, v1

    goto/16 :goto_0
.end method

.method final a()Lorg/json/JSONArray;
    .locals 8

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    iget-object v0, p0, Lcom/miteksystems/misnap/am;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v2, p0, Lcom/miteksystems/misnap/am;->c:Lcom/miteksystems/misnap/MiSnap;

    sget v3, Lcom/miteksystems/misnap/R$string;->uxp_capture_manual:I

    invoke-virtual {v2, v3}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/miteksystems/misnap/am;->f:J

    sub-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    iget-object v2, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->j()I

    move-result v2

    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    iget-object v3, p0, Lcom/miteksystems/misnap/am;->c:Lcom/miteksystems/misnap/MiSnap;

    sget v4, Lcom/miteksystems/misnap/R$string;->uxp_measured_brightness:I

    invoke-virtual {v3, v4}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/miteksystems/misnap/am;->f:J

    sub-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    iget-object v2, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->k()I

    move-result v2

    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    iget-object v3, p0, Lcom/miteksystems/misnap/am;->c:Lcom/miteksystems/misnap/MiSnap;

    sget v4, Lcom/miteksystems/misnap/R$string;->uxp_measured_sharpness:I

    invoke-virtual {v3, v4}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/miteksystems/misnap/am;->f:J

    sub-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    iget-object v2, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->f()I

    move-result v2

    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    iget-object v3, p0, Lcom/miteksystems/misnap/am;->c:Lcom/miteksystems/misnap/MiSnap;

    sget v4, Lcom/miteksystems/misnap/R$string;->uxp_measured_angle:I

    invoke-virtual {v3, v4}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/miteksystems/misnap/am;->f:J

    sub-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    iget-object v2, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->g()I

    move-result v2

    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    iget-object v3, p0, Lcom/miteksystems/misnap/am;->c:Lcom/miteksystems/misnap/MiSnap;

    sget v4, Lcom/miteksystems/misnap/R$string;->uxp_measured_rectangle:I

    invoke-virtual {v3, v4}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/miteksystems/misnap/am;->f:J

    sub-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    iget-object v2, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->h()I

    move-result v2

    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    iget-object v3, p0, Lcom/miteksystems/misnap/am;->c:Lcom/miteksystems/misnap/MiSnap;

    sget v4, Lcom/miteksystems/misnap/R$string;->uxp_measured_width:I

    invoke-virtual {v3, v4}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/miteksystems/misnap/am;->f:J

    sub-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    iget-object v2, p0, Lcom/miteksystems/misnap/am;->d:Lcom/miteksystems/misnap/MitekAnalyzer;

    invoke-virtual {v2}, Lcom/miteksystems/misnap/MitekAnalyzer;->i()I

    move-result v2

    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    iget-object v3, p0, Lcom/miteksystems/misnap/am;->c:Lcom/miteksystems/misnap/MiSnap;

    sget v4, Lcom/miteksystems/misnap/R$string;->uxp_measured_height:I

    invoke-virtual {v3, v4}, Lcom/miteksystems/misnap/MiSnap;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    :cond_0
    :goto_1
    return-object v1

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/miteksystems/misnap/an;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    :try_start_1
    iget v5, v0, Lcom/miteksystems/misnap/an;->b:I

    const/4 v6, -0x1

    if-ne v5, v6, :cond_2

    iget-wide v6, v0, Lcom/miteksystems/misnap/an;->a:J

    invoke-virtual {v4, v6, v7}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    iget-object v0, v0, Lcom/miteksystems/misnap/an;->c:Ljava/lang/String;

    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_2
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto/16 :goto_0

    :cond_2
    :try_start_2
    iget-wide v6, v0, Lcom/miteksystems/misnap/an;->a:J

    invoke-virtual {v4, v6, v7}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    iget v5, v0, Lcom/miteksystems/misnap/an;->b:I

    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    iget-object v0, v0, Lcom/miteksystems/misnap/an;->c:Ljava/lang/String;

    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_2

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_1
.end method

.method final a(Ljava/lang/String;)V
    .locals 1

    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0}, Lcom/miteksystems/misnap/am;->a(Ljava/lang/String;I)V

    return-void
.end method

.method final a(Ljava/lang/String;I)V
    .locals 7

    iget-object v0, p0, Lcom/miteksystems/misnap/am;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    iget-object v0, p0, Lcom/miteksystems/misnap/am;->e:Ljava/util/List;

    new-instance v1, Lcom/miteksystems/misnap/an;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/miteksystems/misnap/am;->f:J

    sub-long v4, v2, v4

    move-object v2, p0

    move-object v3, p1

    move v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/miteksystems/misnap/an;-><init>(Lcom/miteksystems/misnap/am;Ljava/lang/String;JI)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
