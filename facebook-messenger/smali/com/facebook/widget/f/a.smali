.class public Lcom/facebook/widget/f/a;
.super Ljava/lang/Object;
.source "MultitouchResampler.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x9
.end annotation


# instance fields
.field private a:[Lcom/facebook/widget/f/b;

.field private b:[I

.field private c:[Landroid/view/MotionEvent$PointerCoords;

.field private d:Lcom/facebook/widget/f/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 31
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/widget/f/a;-><init>(Z)V

    .line 32
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x6

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-array v0, v1, [Lcom/facebook/widget/f/b;

    iput-object v0, p0, Lcom/facebook/widget/f/a;->a:[Lcom/facebook/widget/f/b;

    .line 36
    new-array v0, v1, [I

    iput-object v0, p0, Lcom/facebook/widget/f/a;->b:[I

    .line 37
    new-array v0, v1, [Landroid/view/MotionEvent$PointerCoords;

    iput-object v0, p0, Lcom/facebook/widget/f/a;->c:[Landroid/view/MotionEvent$PointerCoords;

    .line 38
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x5

    if-gt v0, v1, :cond_0

    .line 39
    iget-object v1, p0, Lcom/facebook/widget/f/a;->a:[Lcom/facebook/widget/f/b;

    new-instance v2, Lcom/facebook/widget/f/b;

    invoke-direct {v2, p1}, Lcom/facebook/widget/f/b;-><init>(Z)V

    aput-object v2, v1, v0

    .line 40
    iget-object v1, p0, Lcom/facebook/widget/f/a;->c:[Landroid/view/MotionEvent$PointerCoords;

    new-instance v2, Landroid/view/MotionEvent$PointerCoords;

    invoke-direct {v2}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    aput-object v2, v1, v0

    .line 38
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 42
    :cond_0
    new-instance v0, Lcom/facebook/widget/f/c;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, Lcom/facebook/widget/f/c;-><init>(FFJ)V

    iput-object v0, p0, Lcom/facebook/widget/f/a;->d:Lcom/facebook/widget/f/c;

    .line 43
    return-void
.end method

.method private final a(I)Lcom/facebook/widget/f/b;
    .locals 2

    .prologue
    const/4 v1, 0x5

    .line 137
    if-ge p1, v1, :cond_0

    .line 138
    iget-object v0, p0, Lcom/facebook/widget/f/a;->a:[Lcom/facebook/widget/f/b;

    aget-object v0, v0, p1

    .line 143
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/f/a;->a:[Lcom/facebook/widget/f/b;

    aget-object v0, v0, v1

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;IJ)Landroid/view/MotionEvent;
    .locals 17

    .prologue
    .line 116
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x9

    if-lt v2, v3, :cond_1

    .line 117
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    const/4 v3, 0x5

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v7

    .line 118
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v7, :cond_0

    .line 119
    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    .line 120
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/facebook/widget/f/a;->b:[I

    aput v3, v4, v2

    .line 121
    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lcom/facebook/widget/f/a;->a(I)Lcom/facebook/widget/f/b;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/facebook/widget/f/a;->d:Lcom/facebook/widget/f/c;

    move-wide/from16 v0, p3

    invoke-virtual {v3, v0, v1, v4}, Lcom/facebook/widget/f/b;->a(JLcom/facebook/widget/f/c;)V

    .line 122
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/widget/f/a;->c:[Landroid/view/MotionEvent$PointerCoords;

    aget-object v3, v3, v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/facebook/widget/f/a;->d:Lcom/facebook/widget/f/c;

    invoke-virtual {v4}, Lcom/facebook/widget/f/c;->b()F

    move-result v4

    iput v4, v3, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 123
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/widget/f/a;->c:[Landroid/view/MotionEvent$PointerCoords;

    aget-object v3, v3, v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/facebook/widget/f/a;->d:Lcom/facebook/widget/f/c;

    invoke-virtual {v4}, Lcom/facebook/widget/f/c;->c()F

    move-result v4

    iput v4, v3, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 118
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 126
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v2

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/facebook/widget/f/a;->b:[I

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/facebook/widget/f/a;->c:[Landroid/view/MotionEvent$PointerCoords;

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getMetaState()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getXPrecision()F

    move-result v11

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getYPrecision()F

    move-result v12

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEdgeFlags()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v15

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getFlags()I

    move-result v16

    move-wide/from16 v4, p3

    move/from16 v6, p2

    invoke-static/range {v2 .. v16}, Landroid/view/MotionEvent;->obtain(JJII[I[Landroid/view/MotionEvent$PointerCoords;IFFIIII)Landroid/view/MotionEvent;

    move-result-object v2

    .line 130
    return-object v2

    .line 132
    :cond_1
    new-instance v2, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v3, "Cannot synthesize motion events on pre-GB devices"

    invoke-direct {v2, v3}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public a(Landroid/view/MotionEvent;)V
    .locals 10

    .prologue
    const/4 v1, 0x0

    .line 56
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 58
    and-int/lit16 v0, v0, 0xff

    sparse-switch v0, :sswitch_data_0

    .line 80
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v3

    .line 81
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v4

    move v2, v1

    .line 82
    :goto_0
    if-ge v2, v3, :cond_4

    .line 83
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    .line 84
    invoke-direct {p0, v0}, Lcom/facebook/widget/f/a;->a(I)Lcom/facebook/widget/f/b;

    move-result-object v5

    move v0, v1

    .line 85
    :goto_1
    if-ge v0, v4, :cond_3

    .line 86
    invoke-virtual {p1, v2, v0}, Landroid/view/MotionEvent;->getHistoricalX(II)F

    move-result v6

    .line 87
    invoke-virtual {p1, v2, v0}, Landroid/view/MotionEvent;->getHistoricalY(II)F

    move-result v7

    .line 88
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getHistoricalEventTime(I)J

    move-result-wide v8

    .line 89
    invoke-virtual {v5, v6, v7, v8, v9}, Lcom/facebook/widget/f/b;->a(FFJ)V

    .line 85
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 63
    :sswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    .line 64
    :goto_2
    if-ge v1, v0, :cond_4

    .line 65
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    .line 66
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    .line 67
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v4

    .line 68
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v6

    .line 69
    invoke-direct {p0, v6}, Lcom/facebook/widget/f/a;->a(I)Lcom/facebook/widget/f/b;

    move-result-object v6

    .line 71
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v7

    const/4 v8, 0x5

    if-ne v7, v8, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v7

    if-eq v7, v1, :cond_1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v7

    if-nez v7, :cond_2

    .line 73
    :cond_1
    invoke-virtual {v6}, Lcom/facebook/widget/f/b;->a()V

    .line 75
    :cond_2
    invoke-virtual {v6, v2, v3, v4, v5}, Lcom/facebook/widget/f/b;->a(FFJ)V

    .line 64
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 91
    :cond_3
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    .line 92
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    .line 93
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v7

    .line 94
    invoke-virtual {v5, v0, v6, v7, v8}, Lcom/facebook/widget/f/b;->a(FFJ)V

    .line 82
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 99
    :cond_4
    return-void

    .line 58
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x5 -> :sswitch_0
    .end sparse-switch
.end method
