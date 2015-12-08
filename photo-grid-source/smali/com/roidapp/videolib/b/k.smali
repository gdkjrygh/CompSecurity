.class public final Lcom/roidapp/videolib/b/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/videolib/b/x;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljp/co/cyberagent/android/a/h;

.field private c:Lcom/roidapp/videolib/b/w;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/videolib/b/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/k;->a:Ljava/util/List;

    .line 10
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/b/k;->b:Ljp/co/cyberagent/android/a/h;

    .line 11
    new-instance v0, Lcom/roidapp/videolib/b/w;

    invoke-direct {v0}, Lcom/roidapp/videolib/b/w;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/k;->c:Lcom/roidapp/videolib/b/w;

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/k;->d:Ljava/util/List;

    .line 19
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/roidapp/videolib/b/k;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 25
    iget-object v0, p0, Lcom/roidapp/videolib/b/k;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 26
    iget-object v0, p0, Lcom/roidapp/videolib/b/k;->c:Lcom/roidapp/videolib/b/w;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/w;->a()V

    .line 27
    return-void
.end method

.method public final a(J)V
    .locals 13

    .prologue
    .line 70
    .line 1040
    iget-object v0, p0, Lcom/roidapp/videolib/b/k;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1041
    iget-object v0, p0, Lcom/roidapp/videolib/b/k;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/videolib/b/x;

    .line 1042
    iget-wide v2, v0, Lcom/roidapp/videolib/b/x;->b:J

    cmp-long v2, p1, v2

    if-ltz v2, :cond_0

    iget-wide v2, v0, Lcom/roidapp/videolib/b/x;->c:J

    cmp-long v2, p1, v2

    if-gez v2, :cond_0

    .line 1043
    iget-object v2, p0, Lcom/roidapp/videolib/b/k;->d:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 71
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/k;->c:Lcom/roidapp/videolib/b/w;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/w;->a()V

    .line 72
    iget-object v0, p0, Lcom/roidapp/videolib/b/k;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/videolib/b/x;

    .line 73
    iget v1, v0, Lcom/roidapp/videolib/b/x;->a:I

    packed-switch v1, :pswitch_data_0

    goto :goto_1

    .line 75
    :pswitch_0
    iget-object v1, p0, Lcom/roidapp/videolib/b/k;->c:Lcom/roidapp/videolib/b/w;

    iget v2, v0, Lcom/roidapp/videolib/b/x;->d:F

    iget v3, v0, Lcom/roidapp/videolib/b/x;->e:F

    iget-wide v4, v0, Lcom/roidapp/videolib/b/x;->b:J

    iget-wide v6, v0, Lcom/roidapp/videolib/b/x;->c:J

    invoke-virtual/range {v1 .. v7}, Lcom/roidapp/videolib/b/w;->a(FFJJ)V

    goto :goto_1

    .line 79
    :pswitch_1
    iget-object v1, p0, Lcom/roidapp/videolib/b/k;->c:Lcom/roidapp/videolib/b/w;

    iget v2, v0, Lcom/roidapp/videolib/b/x;->d:F

    iget v3, v0, Lcom/roidapp/videolib/b/x;->e:F

    iget-wide v4, v0, Lcom/roidapp/videolib/b/x;->b:J

    iget-wide v6, v0, Lcom/roidapp/videolib/b/x;->c:J

    invoke-virtual/range {v1 .. v7}, Lcom/roidapp/videolib/b/w;->b(FFJJ)V

    goto :goto_1

    .line 83
    :pswitch_2
    iget-object v1, p0, Lcom/roidapp/videolib/b/k;->c:Lcom/roidapp/videolib/b/w;

    iget v2, v0, Lcom/roidapp/videolib/b/x;->d:F

    iget v3, v0, Lcom/roidapp/videolib/b/x;->e:F

    iget-wide v4, v0, Lcom/roidapp/videolib/b/x;->b:J

    iget-wide v6, v0, Lcom/roidapp/videolib/b/x;->c:J

    invoke-virtual/range {v1 .. v7}, Lcom/roidapp/videolib/b/w;->c(FFJJ)V

    goto :goto_1

    .line 87
    :pswitch_3
    iget-object v1, p0, Lcom/roidapp/videolib/b/k;->c:Lcom/roidapp/videolib/b/w;

    iget v2, v0, Lcom/roidapp/videolib/b/x;->d:F

    iget v3, v0, Lcom/roidapp/videolib/b/x;->e:F

    iget-wide v4, v0, Lcom/roidapp/videolib/b/x;->b:J

    iget-wide v6, v0, Lcom/roidapp/videolib/b/x;->c:J

    invoke-virtual/range {v1 .. v7}, Lcom/roidapp/videolib/b/w;->d(FFJJ)V

    goto :goto_1

    .line 91
    :pswitch_4
    iget-object v1, p0, Lcom/roidapp/videolib/b/k;->c:Lcom/roidapp/videolib/b/w;

    iget v2, v0, Lcom/roidapp/videolib/b/x;->d:F

    iget v3, v0, Lcom/roidapp/videolib/b/x;->e:F

    iget-wide v4, v0, Lcom/roidapp/videolib/b/x;->b:J

    iget-wide v6, v0, Lcom/roidapp/videolib/b/x;->c:J

    invoke-virtual/range {v1 .. v7}, Lcom/roidapp/videolib/b/w;->f(FFJJ)V

    goto :goto_1

    .line 95
    :pswitch_5
    iget-object v1, p0, Lcom/roidapp/videolib/b/k;->c:Lcom/roidapp/videolib/b/w;

    iget v2, v0, Lcom/roidapp/videolib/b/x;->d:F

    iget v3, v0, Lcom/roidapp/videolib/b/x;->e:F

    iget-wide v4, v0, Lcom/roidapp/videolib/b/x;->b:J

    iget-wide v6, v0, Lcom/roidapp/videolib/b/x;->c:J

    invoke-virtual/range {v1 .. v7}, Lcom/roidapp/videolib/b/w;->e(FFJJ)V

    goto :goto_1

    .line 99
    :pswitch_6
    iget-object v1, p0, Lcom/roidapp/videolib/b/k;->c:Lcom/roidapp/videolib/b/w;

    iget v2, v0, Lcom/roidapp/videolib/b/x;->d:F

    iget v3, v0, Lcom/roidapp/videolib/b/x;->e:F

    iget-wide v4, v0, Lcom/roidapp/videolib/b/x;->b:J

    iget-wide v6, v0, Lcom/roidapp/videolib/b/x;->c:J

    iget v8, v0, Lcom/roidapp/videolib/b/x;->f:F

    iget v9, v0, Lcom/roidapp/videolib/b/x;->g:F

    iget v10, v0, Lcom/roidapp/videolib/b/x;->h:F

    invoke-virtual/range {v1 .. v10}, Lcom/roidapp/videolib/b/w;->a(FFJJFFF)V

    goto :goto_1

    .line 103
    :pswitch_7
    iget-object v1, p0, Lcom/roidapp/videolib/b/k;->c:Lcom/roidapp/videolib/b/w;

    iget v2, v0, Lcom/roidapp/videolib/b/x;->d:F

    iget v3, v0, Lcom/roidapp/videolib/b/x;->e:F

    iget-wide v4, v0, Lcom/roidapp/videolib/b/x;->b:J

    iget-wide v6, v0, Lcom/roidapp/videolib/b/x;->c:J

    invoke-virtual/range {v1 .. v7}, Lcom/roidapp/videolib/b/w;->g(FFJJ)V

    goto/16 :goto_1

    .line 109
    :cond_2
    iget-object v0, p0, Lcom/roidapp/videolib/b/k;->c:Lcom/roidapp/videolib/b/w;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/videolib/b/w;->a(J)V

    .line 110
    return-void

    .line 73
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public final a(Lcom/roidapp/videolib/b/x;)V
    .locals 6

    .prologue
    .line 47
    iget-object v0, p0, Lcom/roidapp/videolib/b/k;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 48
    iget-object v0, p0, Lcom/roidapp/videolib/b/k;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    :goto_0
    return-void

    .line 52
    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/k;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 53
    iget-object v0, p0, Lcom/roidapp/videolib/b/k;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/videolib/b/x;

    .line 54
    iget-wide v2, v0, Lcom/roidapp/videolib/b/x;->b:J

    iget-wide v4, p1, Lcom/roidapp/videolib/b/x;->b:J

    cmp-long v0, v2, v4

    if-gtz v0, :cond_1

    .line 52
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 57
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/k;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_2

    .line 58
    iget-object v0, p0, Lcom/roidapp/videolib/b/k;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 60
    :cond_2
    iget-object v0, p0, Lcom/roidapp/videolib/b/k;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    iget-object v0, p0, Lcom/roidapp/videolib/b/k;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    :goto_2
    if-lt v0, v1, :cond_3

    .line 63
    iget-object v2, p0, Lcom/roidapp/videolib/b/k;->a:Ljava/util/List;

    add-int/lit8 v3, v0, 0x1

    iget-object v4, p0, Lcom/roidapp/videolib/b/k;->a:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 62
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 65
    :cond_3
    iget-object v0, p0, Lcom/roidapp/videolib/b/k;->a:Ljava/util/List;

    invoke-interface {v0, v1, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public final a(Ljp/co/cyberagent/android/a/h;)V
    .locals 1

    .prologue
    .line 29
    iput-object p1, p0, Lcom/roidapp/videolib/b/k;->b:Ljp/co/cyberagent/android/a/h;

    .line 30
    iget-object v0, p0, Lcom/roidapp/videolib/b/k;->c:Lcom/roidapp/videolib/b/w;

    invoke-virtual {v0, p1}, Lcom/roidapp/videolib/b/w;->a(Ljp/co/cyberagent/android/a/h;)V

    .line 31
    return-void
.end method
