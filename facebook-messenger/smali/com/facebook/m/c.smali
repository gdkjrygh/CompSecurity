.class Lcom/facebook/m/c;
.super Ljava/lang/Object;
.source "RageSensorEventListener.java"


# instance fields
.field final a:J

.field private final b:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/facebook/m/e;",
            ">;"
        }
    .end annotation
.end field

.field private c:J

.field private d:J

.field private e:Lcom/facebook/m/d;


# direct methods
.method constructor <init>()V
    .locals 2

    .prologue
    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    const-wide/32 v0, 0x3b9aca00

    iput-wide v0, p0, Lcom/facebook/m/c;->a:J

    .line 91
    sget-object v0, Lcom/facebook/m/d;->Insignificant:Lcom/facebook/m/d;

    iput-object v0, p0, Lcom/facebook/m/c;->e:Lcom/facebook/m/d;

    .line 94
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/facebook/m/c;->b:Ljava/util/LinkedList;

    .line 95
    return-void
.end method


# virtual methods
.method a()V
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/facebook/m/c;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 114
    return-void
.end method

.method a(Landroid/hardware/SensorEvent;)V
    .locals 4

    .prologue
    .line 99
    iget-object v0, p0, Lcom/facebook/m/c;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 100
    iget-wide v0, p1, Landroid/hardware/SensorEvent;->timestamp:J

    iput-wide v0, p0, Lcom/facebook/m/c;->c:J

    .line 101
    iget-wide v0, p0, Lcom/facebook/m/c;->c:J

    const-wide/32 v2, 0x3b9aca00

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/facebook/m/c;->d:J

    .line 102
    iget-object v0, p0, Lcom/facebook/m/c;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/facebook/m/e;

    invoke-direct {v1, p1}, Lcom/facebook/m/e;-><init>(Landroid/hardware/SensorEvent;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 110
    :goto_0
    return-void

    .line 103
    :cond_0
    iget-wide v0, p1, Landroid/hardware/SensorEvent;->timestamp:J

    iget-wide v2, p0, Lcom/facebook/m/c;->d:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 104
    iget-object v0, p0, Lcom/facebook/m/c;->b:Ljava/util/LinkedList;

    new-instance v1, Lcom/facebook/m/e;

    invoke-direct {v1, p1}, Lcom/facebook/m/e;-><init>(Landroid/hardware/SensorEvent;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    goto :goto_0

    .line 106
    :cond_1
    iget-object v0, p0, Lcom/facebook/m/c;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/m/e;

    .line 107
    invoke-virtual {v0, p1}, Lcom/facebook/m/e;->a(Landroid/hardware/SensorEvent;)V

    .line 108
    iget-object v1, p0, Lcom/facebook/m/c;->b:Ljava/util/LinkedList;

    invoke-virtual {v1, v0}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method b()Z
    .locals 10

    .prologue
    const/4 v9, 0x2

    const/4 v5, 0x1

    const/4 v2, 0x0

    .line 123
    .line 125
    iget-object v0, p0, Lcom/facebook/m/c;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v1, v2

    move v3, v2

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/m/e;

    .line 126
    iget v4, v0, Lcom/facebook/m/e;->a:F

    const v7, 0x416b5c0f

    cmpl-float v4, v4, v7

    if-lez v4, :cond_1

    move v4, v5

    .line 127
    :goto_1
    iget v0, v0, Lcom/facebook/m/e;->a:F

    const v7, -0x3e94a3f1

    cmpg-float v0, v0, v7

    if-gez v0, :cond_2

    move v0, v5

    .line 129
    :goto_2
    sget-object v7, Lcom/facebook/m/b;->a:[I

    iget-object v8, p0, Lcom/facebook/m/c;->e:Lcom/facebook/m/d;

    invoke-virtual {v8}, Lcom/facebook/m/d;->ordinal()I

    move-result v8

    aget v7, v7, v8

    packed-switch v7, :pswitch_data_0

    :cond_0
    :goto_3
    move v0, v1

    move v1, v3

    :goto_4
    move v3, v1

    move v1, v0

    .line 163
    goto :goto_0

    :cond_1
    move v4, v2

    .line 126
    goto :goto_1

    :cond_2
    move v0, v2

    .line 127
    goto :goto_2

    .line 132
    :pswitch_0
    if-eqz v4, :cond_3

    .line 133
    sget-object v0, Lcom/facebook/m/d;->AboveThreshold:Lcom/facebook/m/d;

    iput-object v0, p0, Lcom/facebook/m/c;->e:Lcom/facebook/m/d;

    .line 134
    add-int/lit8 v3, v3, 0x1

    move v0, v1

    move v1, v3

    goto :goto_4

    .line 135
    :cond_3
    if-eqz v0, :cond_0

    .line 136
    sget-object v0, Lcom/facebook/m/d;->BelowThreshold:Lcom/facebook/m/d;

    iput-object v0, p0, Lcom/facebook/m/c;->e:Lcom/facebook/m/d;

    .line 137
    add-int/lit8 v1, v1, 0x1

    move v0, v1

    move v1, v3

    goto :goto_4

    .line 143
    :pswitch_1
    if-eqz v0, :cond_4

    .line 144
    sget-object v0, Lcom/facebook/m/d;->BelowThreshold:Lcom/facebook/m/d;

    iput-object v0, p0, Lcom/facebook/m/c;->e:Lcom/facebook/m/d;

    .line 145
    add-int/lit8 v1, v1, 0x1

    move v0, v1

    move v1, v3

    goto :goto_4

    .line 146
    :cond_4
    if-nez v4, :cond_0

    .line 147
    sget-object v0, Lcom/facebook/m/d;->Insignificant:Lcom/facebook/m/d;

    iput-object v0, p0, Lcom/facebook/m/c;->e:Lcom/facebook/m/d;

    move v0, v1

    move v1, v3

    goto :goto_4

    .line 154
    :pswitch_2
    if-eqz v4, :cond_5

    .line 155
    sget-object v0, Lcom/facebook/m/d;->AboveThreshold:Lcom/facebook/m/d;

    iput-object v0, p0, Lcom/facebook/m/c;->e:Lcom/facebook/m/d;

    .line 156
    add-int/lit8 v3, v3, 0x1

    move v0, v1

    move v1, v3

    goto :goto_4

    .line 157
    :cond_5
    if-nez v0, :cond_0

    .line 158
    sget-object v0, Lcom/facebook/m/d;->Insignificant:Lcom/facebook/m/d;

    iput-object v0, p0, Lcom/facebook/m/c;->e:Lcom/facebook/m/d;

    goto :goto_3

    .line 166
    :cond_6
    if-lt v3, v9, :cond_7

    if-lt v1, v9, :cond_7

    :goto_5
    return v5

    :cond_7
    move v5, v2

    goto :goto_5

    .line 129
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
