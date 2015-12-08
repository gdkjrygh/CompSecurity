.class Lcom/jirbo/adcolony/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jirbo/adcolony/ADCDownload$Listener;


# instance fields
.field a:Lcom/jirbo/adcolony/d;

.field b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/jirbo/adcolony/u$a;",
            ">;"
        }
    .end annotation
.end field

.field c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/jirbo/adcolony/u$a;",
            ">;"
        }
    .end annotation
.end field

.field d:I

.field e:Z


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/d;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/u;->b:Ljava/util/ArrayList;

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/jirbo/adcolony/u;->c:Ljava/util/ArrayList;

    .line 11
    iput v1, p0, Lcom/jirbo/adcolony/u;->d:I

    .line 12
    iput-boolean v1, p0, Lcom/jirbo/adcolony/u;->e:Z

    .line 17
    iput-object p1, p0, Lcom/jirbo/adcolony/u;->a:Lcom/jirbo/adcolony/d;

    .line 18
    return-void
.end method


# virtual methods
.method a()V
    .locals 1

    .prologue
    .line 168
    invoke-virtual {p0}, Lcom/jirbo/adcolony/u;->b()V

    .line 169
    const/4 v0, 0x0

    iput v0, p0, Lcom/jirbo/adcolony/u;->d:I

    .line 170
    return-void
.end method

.method a(DLcom/jirbo/adcolony/AdColonyAd;)V
    .locals 17

    .prologue
    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v12, 0x3fe8000000000000L    # 0.75

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    const-wide/high16 v8, 0x3fd0000000000000L    # 0.25

    .line 137
    move-object/from16 v0, p3

    iget-wide v4, v0, Lcom/jirbo/adcolony/AdColonyAd;->n:D

    .line 138
    cmpg-double v6, p1, v4

    if-gez v6, :cond_0

    .line 164
    :goto_0
    return-void

    .line 139
    :cond_0
    cmpg-double v6, v4, v8

    if-gez v6, :cond_1

    cmpl-double v6, p1, v8

    if-ltz v6, :cond_1

    .line 141
    move-object/from16 v0, p3

    iget-object v6, v0, Lcom/jirbo/adcolony/AdColonyAd;->g:Ljava/lang/String;

    invoke-static {v6}, Lcom/jirbo/adcolony/AdColony;->isZoneV4VC(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_5

    move-object/from16 v0, p3

    iget-object v6, v0, Lcom/jirbo/adcolony/AdColonyAd;->k:Ljava/lang/String;

    const-string v7, "native"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const-string v6, "native_first_quartile"

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-virtual {v0, v6, v1}, Lcom/jirbo/adcolony/u;->b(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 144
    :cond_1
    :goto_1
    cmpg-double v6, v4, v10

    if-gez v6, :cond_2

    cmpl-double v6, p1, v10

    if-ltz v6, :cond_2

    .line 146
    move-object/from16 v0, p3

    iget-object v6, v0, Lcom/jirbo/adcolony/AdColonyAd;->g:Ljava/lang/String;

    invoke-static {v6}, Lcom/jirbo/adcolony/AdColony;->isZoneV4VC(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_6

    move-object/from16 v0, p3

    iget-object v6, v0, Lcom/jirbo/adcolony/AdColonyAd;->k:Ljava/lang/String;

    const-string v7, "native"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const-string v6, "native_midpoint"

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-virtual {v0, v6, v1}, Lcom/jirbo/adcolony/u;->b(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 149
    :cond_2
    :goto_2
    cmpg-double v6, v4, v12

    if-gez v6, :cond_3

    cmpl-double v6, p1, v12

    if-ltz v6, :cond_3

    .line 151
    move-object/from16 v0, p3

    iget-object v6, v0, Lcom/jirbo/adcolony/AdColonyAd;->g:Ljava/lang/String;

    invoke-static {v6}, Lcom/jirbo/adcolony/AdColony;->isZoneV4VC(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_7

    move-object/from16 v0, p3

    iget-object v6, v0, Lcom/jirbo/adcolony/AdColonyAd;->k:Ljava/lang/String;

    const-string v7, "native"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const-string v6, "native_third_quartile"

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-virtual {v0, v6, v1}, Lcom/jirbo/adcolony/u;->b(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 154
    :cond_3
    :goto_3
    cmpg-double v4, v4, v14

    if-gez v4, :cond_4

    cmpl-double v4, p1, v14

    if-ltz v4, :cond_4

    move-object/from16 v0, p3

    iget-object v4, v0, Lcom/jirbo/adcolony/AdColonyAd;->k:Ljava/lang/String;

    const-string v5, "native"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 156
    sget-object v4, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v5, "Tracking ad event - complete"

    invoke-virtual {v4, v5}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    .line 157
    new-instance v4, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v4}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 159
    const-string v5, "ad_slot"

    move-object/from16 v0, p3

    iget-object v6, v0, Lcom/jirbo/adcolony/AdColonyAd;->h:Lcom/jirbo/adcolony/n$ab;

    iget-object v6, v6, Lcom/jirbo/adcolony/n$ab;->k:Lcom/jirbo/adcolony/ag;

    iget v6, v6, Lcom/jirbo/adcolony/ag;->d:I

    invoke-virtual {v4, v5, v6}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;I)V

    .line 160
    const-string v5, "replay"

    move-object/from16 v0, p3

    iget-boolean v6, v0, Lcom/jirbo/adcolony/AdColonyAd;->s:Z

    invoke-virtual {v4, v5, v6}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Z)V

    .line 161
    const-string v5, "complete"

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-virtual {v0, v5, v4, v1}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 163
    :cond_4
    move-wide/from16 v0, p1

    move-object/from16 v2, p3

    iput-wide v0, v2, Lcom/jirbo/adcolony/AdColonyAd;->n:D

    goto/16 :goto_0

    .line 142
    :cond_5
    const-string v6, "first_quartile"

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-virtual {v0, v6, v1}, Lcom/jirbo/adcolony/u;->b(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    goto/16 :goto_1

    .line 147
    :cond_6
    const-string v6, "midpoint"

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-virtual {v0, v6, v1}, Lcom/jirbo/adcolony/u;->b(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    goto/16 :goto_2

    .line 152
    :cond_7
    const-string v6, "third_quartile"

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-virtual {v0, v6, v1}, Lcom/jirbo/adcolony/u;->b(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    goto :goto_3
.end method

.method a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;)V
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/jirbo/adcolony/u;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->k:Lcom/jirbo/adcolony/n$f;

    .line 44
    if-eqz v0, :cond_0

    .line 46
    iget-object v0, v0, Lcom/jirbo/adcolony/n$f;->h:Lcom/jirbo/adcolony/ADCData$g;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;)V

    .line 49
    :cond_0
    iget-object v0, p0, Lcom/jirbo/adcolony/u;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->l:Lcom/jirbo/adcolony/n$w;

    .line 50
    if-eqz v0, :cond_1

    .line 52
    iget-object v0, v0, Lcom/jirbo/adcolony/n$w;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {p0, p1, v0}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 54
    :cond_1
    return-void
.end method

.method a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;Lcom/jirbo/adcolony/AdColonyAd;)V
    .locals 2

    .prologue
    .line 63
    if-nez p1, :cond_0

    .line 65
    sget-object v0, Lcom/jirbo/adcolony/l;->d:Lcom/jirbo/adcolony/l;

    const-string v1, "No such event type:"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 79
    :goto_0
    return-void

    .line 68
    :cond_0
    const-string v0, "start"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "native_start"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->e:Lcom/jirbo/adcolony/v;

    iget v1, v0, Lcom/jirbo/adcolony/v;->i:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/jirbo/adcolony/v;->i:I

    .line 70
    :cond_2
    if-nez p2, :cond_3

    .line 72
    new-instance p2, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {p2}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 73
    const-string v0, "replay"

    iget-boolean v1, p3, Lcom/jirbo/adcolony/AdColonyAd;->s:Z

    invoke-virtual {p2, v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Z)V

    .line 76
    :cond_3
    const-string v0, "s_imp_count"

    sget-object v1, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v1, v1, Lcom/jirbo/adcolony/d;->e:Lcom/jirbo/adcolony/v;

    iget v1, v1, Lcom/jirbo/adcolony/v;->i:I

    invoke-virtual {p2, v0, v1}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;I)V

    .line 77
    iget-object v0, p3, Lcom/jirbo/adcolony/AdColonyAd;->i:Lcom/jirbo/adcolony/n$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$a;->t:Lcom/jirbo/adcolony/n$b;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$b;->D:Lcom/jirbo/adcolony/ADCData$g;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 78
    iget-object v0, p3, Lcom/jirbo/adcolony/AdColonyAd;->i:Lcom/jirbo/adcolony/n$a;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$a;->q:Lcom/jirbo/adcolony/n$x;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$x;->C:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {p0, p1, v0}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0
.end method

.method a(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V
    .locals 4

    .prologue
    .line 22
    iget-object v0, p0, Lcom/jirbo/adcolony/u;->a:Lcom/jirbo/adcolony/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/u;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/u;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/u;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jirbo/adcolony/u;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    .line 26
    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/n$ae;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/n$ab;

    move-result-object v0

    if-nez v0, :cond_1

    .line 39
    :cond_0
    :goto_0
    return-void

    .line 28
    :cond_1
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "Ad request for zone "

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 29
    iget-object v0, p0, Lcom/jirbo/adcolony/u;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->b:Lcom/jirbo/adcolony/b;

    iget-object v0, v0, Lcom/jirbo/adcolony/b;->j:Lcom/jirbo/adcolony/n$e;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$e;->n:Lcom/jirbo/adcolony/n$ae;

    invoke-virtual {v0, p1}, Lcom/jirbo/adcolony/n$ae;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/n$ab;

    move-result-object v0

    .line 30
    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/jirbo/adcolony/n$ab;->h:Lcom/jirbo/adcolony/n$ac;

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/jirbo/adcolony/n$ab;->h:Lcom/jirbo/adcolony/n$ac;

    iget-object v1, v1, Lcom/jirbo/adcolony/n$ac;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 32
    new-instance v1, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v1}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 33
    sget v2, Lcom/jirbo/adcolony/a;->ac:I

    if-nez v2, :cond_2

    const-string v2, "request_denied"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Z)V

    .line 35
    :goto_1
    const-string v2, "request_denied_reason"

    sget v3, Lcom/jirbo/adcolony/a;->ac:I

    invoke-virtual {v1, v2, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;I)V

    .line 36
    const-string v2, "request"

    iget-object v3, v0, Lcom/jirbo/adcolony/n$ab;->h:Lcom/jirbo/adcolony/n$ac;

    iget-object v3, v3, Lcom/jirbo/adcolony/n$ac;->a:Ljava/lang/String;

    invoke-virtual {p0, v2, v3, v1, p2}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 37
    sget-object v1, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v2, "Tracking ad request - URL : "

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v1

    iget-object v0, v0, Lcom/jirbo/adcolony/n$ab;->h:Lcom/jirbo/adcolony/n$ac;

    iget-object v0, v0, Lcom/jirbo/adcolony/n$ac;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    goto :goto_0

    .line 34
    :cond_2
    const-string v2, "request_denied"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Z)V

    goto :goto_1
.end method

.method a(Ljava/lang/String;Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;)V
    .locals 1

    .prologue
    .line 83
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 84
    return-void
.end method

.method a(Ljava/lang/String;Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;Lcom/jirbo/adcolony/AdColonyAd;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 87
    if-eqz p2, :cond_0

    const-string v0, ""

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 114
    :cond_0
    :goto_0
    return-void

    .line 88
    :cond_1
    if-nez p3, :cond_2

    new-instance p3, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {p3}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 90
    :cond_2
    invoke-static {}, Lcom/jirbo/adcolony/ab;->b()Ljava/lang/String;

    move-result-object v0

    .line 91
    if-eqz p4, :cond_3

    const-string v1, "asi"

    iget-object v2, p4, Lcom/jirbo/adcolony/AdColonyAd;->l:Ljava/lang/String;

    invoke-virtual {p3, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    :cond_3
    const-string v1, "sid"

    iget-object v2, p0, Lcom/jirbo/adcolony/u;->a:Lcom/jirbo/adcolony/d;

    iget-object v2, v2, Lcom/jirbo/adcolony/d;->e:Lcom/jirbo/adcolony/v;

    iget-object v2, v2, Lcom/jirbo/adcolony/v;->j:Ljava/lang/String;

    invoke-virtual {p3, v1, v2}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    const-string v1, "guid"

    invoke-virtual {p3, v1, v0}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    const-string v1, "guid_key"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "DUBu6wJ27y6xs7VWmNDw67DD"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/jirbo/adcolony/ab;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v1, v0}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    new-instance v0, Lcom/jirbo/adcolony/u$a;

    invoke-direct {v0}, Lcom/jirbo/adcolony/u$a;-><init>()V

    .line 97
    iput-object p1, v0, Lcom/jirbo/adcolony/u$a;->a:Ljava/lang/String;

    .line 98
    iput-object p2, v0, Lcom/jirbo/adcolony/u$a;->b:Ljava/lang/String;

    .line 99
    sget-object v1, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v2, "EVENT ---------------------------"

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 100
    sget-object v1, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v2, "EVENT - TYPE = "

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 101
    sget-object v1, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v2, "EVENT - URL  = "

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 102
    invoke-virtual {p3}, Lcom/jirbo/adcolony/ADCData$g;->q()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/jirbo/adcolony/u$a;->c:Ljava/lang/String;

    .line 104
    const-string v1, "reward_v4vc"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 106
    const-string v1, "v4vc_name"

    invoke-virtual {p3, v1}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/jirbo/adcolony/u$a;->d:Ljava/lang/String;

    .line 107
    const-string v1, "v4vc_amount"

    invoke-virtual {p3, v1}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/jirbo/adcolony/u$a;->h:I

    .line 110
    :cond_4
    iget-object v1, p0, Lcom/jirbo/adcolony/u;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    iput-boolean v3, p0, Lcom/jirbo/adcolony/u;->e:Z

    .line 113
    sput-boolean v3, Lcom/jirbo/adcolony/a;->r:Z

    goto/16 :goto_0
.end method

.method a(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x1

    .line 118
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 133
    :cond_0
    :goto_0
    return-void

    .line 120
    :cond_1
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 122
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 124
    new-instance v2, Lcom/jirbo/adcolony/u$a;

    invoke-direct {v2}, Lcom/jirbo/adcolony/u$a;-><init>()V

    .line 125
    iput-object p1, v2, Lcom/jirbo/adcolony/u$a;->a:Ljava/lang/String;

    .line 126
    iput-object v0, v2, Lcom/jirbo/adcolony/u$a;->b:Ljava/lang/String;

    .line 127
    iput-boolean v3, v2, Lcom/jirbo/adcolony/u$a;->k:Z

    .line 128
    iget-object v0, p0, Lcom/jirbo/adcolony/u;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 131
    :cond_2
    iput-boolean v3, p0, Lcom/jirbo/adcolony/u;->e:Z

    .line 132
    sput-boolean v3, Lcom/jirbo/adcolony/a;->r:Z

    goto :goto_0
.end method

.method b()V
    .locals 6

    .prologue
    .line 174
    const/4 v0, 0x1

    sput-boolean v0, Lcom/jirbo/adcolony/a;->r:Z

    .line 175
    new-instance v0, Lcom/jirbo/adcolony/f;

    const-string v1, "tracking_info.txt"

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/f;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/jirbo/adcolony/k;->c(Lcom/jirbo/adcolony/f;)Lcom/jirbo/adcolony/ADCData$c;

    move-result-object v1

    .line 176
    if-eqz v1, :cond_2

    .line 178
    iget-object v0, p0, Lcom/jirbo/adcolony/u;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 179
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1}, Lcom/jirbo/adcolony/ADCData$c;->i()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 181
    invoke-virtual {v1, v0}, Lcom/jirbo/adcolony/ADCData$c;->b(I)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v2

    .line 182
    new-instance v3, Lcom/jirbo/adcolony/u$a;

    invoke-direct {v3}, Lcom/jirbo/adcolony/u$a;-><init>()V

    .line 183
    const-string v4, "type"

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/jirbo/adcolony/u$a;->a:Ljava/lang/String;

    .line 184
    const-string v4, "url"

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/jirbo/adcolony/u$a;->b:Ljava/lang/String;

    .line 185
    const-string v4, "payload"

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Lcom/jirbo/adcolony/ADCData$g;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/jirbo/adcolony/u$a;->c:Ljava/lang/String;

    .line 186
    const-string v4, "attempts"

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v4

    iput v4, v3, Lcom/jirbo/adcolony/u$a;->f:I

    .line 187
    const-string v4, "third_party"

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v4

    iput-boolean v4, v3, Lcom/jirbo/adcolony/u$a;->k:Z

    .line 189
    iget-object v4, v3, Lcom/jirbo/adcolony/u$a;->a:Ljava/lang/String;

    const-string v5, "v4vc_callback"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v4, v3, Lcom/jirbo/adcolony/u$a;->a:Ljava/lang/String;

    const-string v5, "reward_v4vc"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 191
    :cond_0
    const-string v4, "v4vc_name"

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/jirbo/adcolony/u$a;->d:Ljava/lang/String;

    .line 192
    const-string v4, "v4vc_amount"

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/ADCData$g;->g(Ljava/lang/String;)I

    move-result v2

    iput v2, v3, Lcom/jirbo/adcolony/u$a;->h:I

    .line 194
    :cond_1
    iget-object v2, p0, Lcom/jirbo/adcolony/u;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 197
    :cond_2
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "Loaded "

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    iget-object v1, p0, Lcom/jirbo/adcolony/u;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(I)Lcom/jirbo/adcolony/l;

    move-result-object v0

    const-string v1, " events"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 198
    return-void
.end method

.method b(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V
    .locals 1

    .prologue
    .line 58
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lcom/jirbo/adcolony/u;->a(Ljava/lang/String;Lcom/jirbo/adcolony/ADCData$g;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 59
    return-void
.end method

.method c()V
    .locals 6

    .prologue
    .line 202
    iget-object v0, p0, Lcom/jirbo/adcolony/u;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 203
    iget-object v0, p0, Lcom/jirbo/adcolony/u;->c:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jirbo/adcolony/u;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 204
    iget-object v0, p0, Lcom/jirbo/adcolony/u;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 205
    new-instance v2, Lcom/jirbo/adcolony/ADCData$c;

    invoke-direct {v2}, Lcom/jirbo/adcolony/ADCData$c;-><init>()V

    .line 206
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/jirbo/adcolony/u;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 208
    iget-object v0, p0, Lcom/jirbo/adcolony/u;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/u$a;

    .line 209
    iget-boolean v3, v0, Lcom/jirbo/adcolony/u$a;->i:Z

    if-nez v3, :cond_3

    .line 211
    iget-object v3, p0, Lcom/jirbo/adcolony/u;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    new-instance v3, Lcom/jirbo/adcolony/ADCData$g;

    invoke-direct {v3}, Lcom/jirbo/adcolony/ADCData$g;-><init>()V

    .line 214
    const-string v4, "type"

    iget-object v5, v0, Lcom/jirbo/adcolony/u$a;->a:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    const-string v4, "url"

    iget-object v5, v0, Lcom/jirbo/adcolony/u$a;->b:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    iget-object v4, v0, Lcom/jirbo/adcolony/u$a;->c:Ljava/lang/String;

    if-eqz v4, :cond_0

    const-string v4, "payload"

    iget-object v5, v0, Lcom/jirbo/adcolony/u$a;->c:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    :cond_0
    const-string v4, "attempts"

    iget v5, v0, Lcom/jirbo/adcolony/u$a;->f:I

    invoke-virtual {v3, v4, v5}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;I)V

    .line 218
    iget-object v4, v0, Lcom/jirbo/adcolony/u$a;->d:Ljava/lang/String;

    if-eqz v4, :cond_1

    .line 220
    const-string v4, "v4vc_name"

    iget-object v5, v0, Lcom/jirbo/adcolony/u$a;->d:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    const-string v4, "v4vc_amount"

    iget v5, v0, Lcom/jirbo/adcolony/u$a;->h:I

    invoke-virtual {v3, v4, v5}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;I)V

    .line 223
    :cond_1
    iget-boolean v0, v0, Lcom/jirbo/adcolony/u$a;->k:Z

    if-eqz v0, :cond_2

    const-string v0, "third_party"

    const/4 v4, 0x1

    invoke-virtual {v3, v0, v4}, Lcom/jirbo/adcolony/ADCData$g;->b(Ljava/lang/String;Z)V

    .line 224
    :cond_2
    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/ADCData$c;->a(Lcom/jirbo/adcolony/ADCData$i;)Lcom/jirbo/adcolony/ADCData$c;

    .line 206
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 227
    :cond_4
    iget-object v0, p0, Lcom/jirbo/adcolony/u;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 229
    sget-object v0, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v1, "Saving tracking_info ("

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    iget-object v1, p0, Lcom/jirbo/adcolony/u;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->a(I)Lcom/jirbo/adcolony/l;

    move-result-object v0

    const-string v1, " events)"

    invoke-virtual {v0, v1}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 230
    new-instance v0, Lcom/jirbo/adcolony/f;

    const-string v1, "tracking_info.txt"

    invoke-direct {v0, v1}, Lcom/jirbo/adcolony/f;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lcom/jirbo/adcolony/k;->a(Lcom/jirbo/adcolony/f;Lcom/jirbo/adcolony/ADCData$c;)V

    .line 231
    return-void
.end method

.method d()V
    .locals 1

    .prologue
    .line 235
    iget-boolean v0, p0, Lcom/jirbo/adcolony/u;->e:Z

    if-eqz v0, :cond_0

    .line 237
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jirbo/adcolony/u;->e:Z

    .line 238
    invoke-virtual {p0}, Lcom/jirbo/adcolony/u;->c()V

    .line 240
    :cond_0
    invoke-virtual {p0}, Lcom/jirbo/adcolony/u;->e()V

    .line 241
    return-void
.end method

.method e()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    .line 245
    iget-object v0, p0, Lcom/jirbo/adcolony/u;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 274
    :cond_0
    return-void

    .line 247
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/jirbo/adcolony/u;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x3e8

    if-le v0, v1, :cond_2

    iget-object v0, p0, Lcom/jirbo/adcolony/u;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jirbo/adcolony/u;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 249
    :cond_2
    invoke-static {}, Lcom/jirbo/adcolony/q;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 251
    invoke-static {}, Lcom/jirbo/adcolony/ab;->c()D

    move-result-wide v2

    .line 252
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    iget-object v0, p0, Lcom/jirbo/adcolony/u;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 254
    iget-object v0, p0, Lcom/jirbo/adcolony/u;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jirbo/adcolony/u$a;

    .line 255
    iget-wide v4, v0, Lcom/jirbo/adcolony/u$a;->e:D

    cmpg-double v4, v4, v2

    if-gez v4, :cond_6

    iget-boolean v4, v0, Lcom/jirbo/adcolony/u$a;->j:Z

    if-nez v4, :cond_6

    .line 257
    iget v4, p0, Lcom/jirbo/adcolony/u;->d:I

    const/4 v5, 0x5

    if-eq v4, v5, :cond_0

    .line 258
    iget v4, p0, Lcom/jirbo/adcolony/u;->d:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Lcom/jirbo/adcolony/u;->d:I

    .line 259
    iput-boolean v7, v0, Lcom/jirbo/adcolony/u$a;->j:Z

    .line 261
    iget-object v4, v0, Lcom/jirbo/adcolony/u$a;->a:Ljava/lang/String;

    const-string v5, "v4vc_callback"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    sget-object v4, Lcom/jirbo/adcolony/a;->Y:Ljava/util/ArrayList;

    iget-object v5, v0, Lcom/jirbo/adcolony/u$a;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 262
    :cond_3
    new-instance v4, Lcom/jirbo/adcolony/ADCDownload;

    iget-object v5, p0, Lcom/jirbo/adcolony/u;->a:Lcom/jirbo/adcolony/d;

    iget-object v6, v0, Lcom/jirbo/adcolony/u$a;->b:Ljava/lang/String;

    invoke-direct {v4, v5, v6, p0}, Lcom/jirbo/adcolony/ADCDownload;-><init>(Lcom/jirbo/adcolony/d;Ljava/lang/String;Lcom/jirbo/adcolony/ADCDownload$Listener;)V

    invoke-virtual {v4, v0}, Lcom/jirbo/adcolony/ADCDownload;->a(Ljava/lang/Object;)Lcom/jirbo/adcolony/ADCDownload;

    move-result-object v4

    .line 263
    iget-boolean v5, v0, Lcom/jirbo/adcolony/u$a;->k:Z

    if-eqz v5, :cond_4

    iput-boolean v7, v4, Lcom/jirbo/adcolony/ADCDownload;->h:Z

    .line 264
    :cond_4
    iget-object v5, v0, Lcom/jirbo/adcolony/u$a;->c:Ljava/lang/String;

    if-eqz v5, :cond_5

    .line 266
    const-string v5, "application/json"

    iget-object v6, v0, Lcom/jirbo/adcolony/u$a;->c:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lcom/jirbo/adcolony/ADCDownload;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/jirbo/adcolony/ADCDownload;

    .line 269
    :cond_5
    sget-object v5, Lcom/jirbo/adcolony/l;->b:Lcom/jirbo/adcolony/l;

    const-string v6, "Submitting \'"

    invoke-virtual {v5, v6}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v5

    iget-object v0, v0, Lcom/jirbo/adcolony/u$a;->a:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v0

    const-string v5, "\' event."

    invoke-virtual {v0, v5}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 270
    invoke-virtual {v4}, Lcom/jirbo/adcolony/ADCDownload;->b()V

    .line 271
    sput-boolean v7, Lcom/jirbo/adcolony/a;->r:Z

    .line 252
    :cond_6
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1
.end method

.method public on_download_finished(Lcom/jirbo/adcolony/ADCDownload;)V
    .locals 9

    .prologue
    const/16 v1, 0x2710

    const/4 v8, -0x1

    const/4 v7, 0x1

    const/4 v3, 0x0

    .line 278
    sput-boolean v7, Lcom/jirbo/adcolony/a;->r:Z

    .line 279
    iput-boolean v7, p0, Lcom/jirbo/adcolony/u;->e:Z

    .line 280
    iget v0, p0, Lcom/jirbo/adcolony/u;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/jirbo/adcolony/u;->d:I

    .line 281
    iget-object v0, p1, Lcom/jirbo/adcolony/ADCDownload;->e:Ljava/lang/Object;

    check-cast v0, Lcom/jirbo/adcolony/u$a;

    .line 282
    sget-object v2, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v4, "on_download_finished - event.type = "

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v2

    iget-object v4, v0, Lcom/jirbo/adcolony/u$a;->a:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 283
    iput-boolean v3, v0, Lcom/jirbo/adcolony/u$a;->j:Z

    .line 285
    iget-boolean v2, p1, Lcom/jirbo/adcolony/ADCDownload;->i:Z

    .line 286
    if-eqz v2, :cond_0

    iget-object v4, v0, Lcom/jirbo/adcolony/u$a;->c:Ljava/lang/String;

    if-eqz v4, :cond_0

    .line 288
    iget-object v2, p1, Lcom/jirbo/adcolony/ADCDownload;->n:Ljava/lang/String;

    invoke-static {v2}, Lcom/jirbo/adcolony/k;->b(Ljava/lang/String;)Lcom/jirbo/adcolony/ADCData$g;

    move-result-object v4

    .line 289
    if-eqz v4, :cond_8

    .line 291
    const-string v2, "status"

    invoke-virtual {v4, v2}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "success"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    .line 292
    if-eqz v2, :cond_0

    .line 294
    iget-object v5, v0, Lcom/jirbo/adcolony/u$a;->a:Ljava/lang/String;

    const-string v6, "reward_v4vc"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 296
    const-string v5, "v4vc_status"

    invoke-virtual {v4, v5}, Lcom/jirbo/adcolony/ADCData$g;->h(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 298
    const-string v5, "v4vc_callback"

    invoke-virtual {v4, v5}, Lcom/jirbo/adcolony/ADCData$g;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 299
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_5

    .line 302
    new-instance v5, Lcom/jirbo/adcolony/u$a;

    invoke-direct {v5}, Lcom/jirbo/adcolony/u$a;-><init>()V

    .line 303
    const-string v6, "v4vc_callback"

    iput-object v6, v5, Lcom/jirbo/adcolony/u$a;->a:Ljava/lang/String;

    .line 304
    iput-object v4, v5, Lcom/jirbo/adcolony/u$a;->b:Ljava/lang/String;

    .line 305
    iget-object v4, v0, Lcom/jirbo/adcolony/u$a;->d:Ljava/lang/String;

    iput-object v4, v5, Lcom/jirbo/adcolony/u$a;->d:Ljava/lang/String;

    .line 306
    iget v4, v0, Lcom/jirbo/adcolony/u$a;->h:I

    iput v4, v5, Lcom/jirbo/adcolony/u$a;->h:I

    .line 307
    iget-object v4, p0, Lcom/jirbo/adcolony/u;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    :cond_0
    :goto_0
    if-eqz v2, :cond_2

    iget-object v4, v0, Lcom/jirbo/adcolony/u$a;->a:Ljava/lang/String;

    const-string v5, "v4vc_callback"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 332
    sget-object v4, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v5, "v4vc_callback response:"

    invoke-virtual {v4, v5}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    move-result-object v4

    iget-object v5, p1, Lcom/jirbo/adcolony/ADCDownload;->n:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 333
    iget-object v4, p1, Lcom/jirbo/adcolony/ADCDownload;->n:Ljava/lang/String;

    const-string v5, "vc_success"

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    if-eq v4, v8, :cond_9

    .line 335
    sget-object v4, Lcom/jirbo/adcolony/a;->K:Lcom/jirbo/adcolony/ADCVideo;

    if-eqz v4, :cond_1

    sget-object v4, Lcom/jirbo/adcolony/a;->K:Lcom/jirbo/adcolony/ADCVideo;

    iput-boolean v7, v4, Lcom/jirbo/adcolony/ADCVideo;->o:Z

    .line 336
    :cond_1
    sget-object v4, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v5, "v4vc_callback success"

    invoke-virtual {v4, v5}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 337
    iget-object v4, p0, Lcom/jirbo/adcolony/u;->a:Lcom/jirbo/adcolony/d;

    iget-object v5, v0, Lcom/jirbo/adcolony/u$a;->d:Ljava/lang/String;

    iget v6, v0, Lcom/jirbo/adcolony/u$a;->h:I

    invoke-virtual {v4, v7, v5, v6}, Lcom/jirbo/adcolony/d;->a(ZLjava/lang/String;I)V

    .line 352
    :cond_2
    :goto_1
    if-eqz v2, :cond_c

    .line 354
    sget-object v1, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v2, "Event submission SUCCESS for type: "

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v1

    iget-object v2, v0, Lcom/jirbo/adcolony/u$a;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 355
    iput-boolean v7, v0, Lcom/jirbo/adcolony/u$a;->i:Z

    .line 380
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/jirbo/adcolony/u;->a:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->e:Lcom/jirbo/adcolony/v;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/v;->b:Z

    if-nez v0, :cond_4

    .line 382
    invoke-virtual {p0}, Lcom/jirbo/adcolony/u;->c()V

    .line 384
    :cond_4
    return-void

    .line 312
    :cond_5
    sget-object v4, Lcom/jirbo/adcolony/a;->K:Lcom/jirbo/adcolony/ADCVideo;

    if-eqz v4, :cond_6

    sget-object v4, Lcom/jirbo/adcolony/a;->K:Lcom/jirbo/adcolony/ADCVideo;

    iput-boolean v7, v4, Lcom/jirbo/adcolony/ADCVideo;->o:Z

    .line 313
    :cond_6
    sget-object v4, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v5, "Client-side V4VC success"

    invoke-virtual {v4, v5}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    goto :goto_0

    .line 319
    :cond_7
    sget-object v4, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v5, "Client-side V4VC failure"

    invoke-virtual {v4, v5}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    goto :goto_0

    :cond_8
    move v2, v3

    .line 326
    goto :goto_0

    .line 339
    :cond_9
    iget-object v4, p1, Lcom/jirbo/adcolony/ADCDownload;->n:Ljava/lang/String;

    const-string v5, "vc_decline"

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    if-ne v4, v8, :cond_a

    iget-object v4, p1, Lcom/jirbo/adcolony/ADCDownload;->n:Ljava/lang/String;

    const-string v5, "vc_noreward"

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    if-eq v4, v8, :cond_b

    .line 341
    :cond_a
    sget-object v4, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v5, "Server-side V4VC failure: "

    invoke-virtual {v4, v5}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v4

    iget-object v5, p1, Lcom/jirbo/adcolony/ADCDownload;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 342
    sget-object v4, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v5, "v4vc_callback declined"

    invoke-virtual {v4, v5}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 343
    iget-object v4, p0, Lcom/jirbo/adcolony/u;->a:Lcom/jirbo/adcolony/d;

    const-string v5, ""

    invoke-virtual {v4, v3, v5, v3}, Lcom/jirbo/adcolony/d;->a(ZLjava/lang/String;I)V

    goto :goto_1

    .line 347
    :cond_b
    sget-object v2, Lcom/jirbo/adcolony/l;->c:Lcom/jirbo/adcolony/l;

    const-string v4, "Server-side V4VC failure: "

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v2

    iget-object v4, p1, Lcom/jirbo/adcolony/ADCDownload;->c:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    move v2, v3

    .line 348
    goto :goto_1

    .line 359
    :cond_c
    sget-object v2, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v4, "Event submission FAILED for type: "

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v2

    iget-object v4, v0, Lcom/jirbo/adcolony/u$a;->a:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v2

    const-string v4, " on try "

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v2

    iget v4, v0, Lcom/jirbo/adcolony/u$a;->f:I

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v2, v4}, Lcom/jirbo/adcolony/l;->b(I)Lcom/jirbo/adcolony/l;

    .line 360
    iget v2, v0, Lcom/jirbo/adcolony/u$a;->f:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Lcom/jirbo/adcolony/u$a;->f:I

    .line 362
    iget v2, v0, Lcom/jirbo/adcolony/u$a;->f:I

    const/16 v4, 0x18

    if-lt v2, v4, :cond_d

    .line 364
    sget-object v1, Lcom/jirbo/adcolony/l;->d:Lcom/jirbo/adcolony/l;

    const-string v2, "Discarding event after 24 attempts to report."

    invoke-virtual {v1, v2}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 365
    iput-boolean v7, v0, Lcom/jirbo/adcolony/u$a;->i:Z

    .line 367
    iget-object v0, v0, Lcom/jirbo/adcolony/u$a;->a:Ljava/lang/String;

    const-string v1, "v4vc_callback"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/jirbo/adcolony/u;->a:Lcom/jirbo/adcolony/d;

    const-string v1, ""

    invoke-virtual {v0, v3, v1, v3}, Lcom/jirbo/adcolony/d;->a(ZLjava/lang/String;I)V

    goto/16 :goto_2

    .line 371
    :cond_d
    const/16 v2, 0x14

    .line 372
    iget v3, v0, Lcom/jirbo/adcolony/u$a;->g:I

    if-lez v3, :cond_e

    iget v2, v0, Lcom/jirbo/adcolony/u$a;->g:I

    mul-int/lit8 v2, v2, 0x3

    .line 373
    :cond_e
    if-le v2, v1, :cond_f

    .line 374
    :goto_3
    sget-object v2, Lcom/jirbo/adcolony/l;->a:Lcom/jirbo/adcolony/l;

    const-string v3, "Retrying in "

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/jirbo/adcolony/l;->a(I)Lcom/jirbo/adcolony/l;

    move-result-object v2

    const-string v3, " seconds (attempt "

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/l;->a(Ljava/lang/String;)Lcom/jirbo/adcolony/l;

    move-result-object v2

    iget v3, v0, Lcom/jirbo/adcolony/u$a;->f:I

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/l;->a(I)Lcom/jirbo/adcolony/l;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Lcom/jirbo/adcolony/l;->b(Ljava/lang/Object;)Lcom/jirbo/adcolony/l;

    .line 375
    iput v1, v0, Lcom/jirbo/adcolony/u$a;->g:I

    .line 376
    invoke-static {}, Lcom/jirbo/adcolony/ab;->c()D

    move-result-wide v2

    int-to-double v4, v1

    add-double/2addr v2, v4

    iput-wide v2, v0, Lcom/jirbo/adcolony/u$a;->e:D

    goto/16 :goto_2

    :cond_f
    move v1, v2

    goto :goto_3
.end method
