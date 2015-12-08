.class public Lorg/chromium/content/browser/TouchEventSynthesizer;
.super Ljava/lang/Object;
.source "TouchEventSynthesizer.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "content"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final ACTION_CANCEL:I = 0x2

.field private static final ACTION_END:I = 0x3

.field private static final ACTION_MOVE:I = 0x1

.field private static final ACTION_START:I = 0x0

.field private static final MAX_NUM_POINTERS:I = 0x10


# instance fields
.field private final mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

.field private mDownTimeInMs:J

.field private final mPointerCoords:[Landroid/view/MotionEvent$PointerCoords;

.field private final mPointerProperties:[Landroid/view/MotionEvent$PointerProperties;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const-class v0, Lorg/chromium/content/browser/TouchEventSynthesizer;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lorg/chromium/content/browser/ContentViewCore;)V
    .locals 2
    .param p1, "contentViewCore"    # Lorg/chromium/content/browser/ContentViewCore;

    .prologue
    const/16 v1, 0x10

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    .line 33
    new-array v0, v1, [Landroid/view/MotionEvent$PointerProperties;

    iput-object v0, p0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mPointerProperties:[Landroid/view/MotionEvent$PointerProperties;

    .line 34
    new-array v0, v1, [Landroid/view/MotionEvent$PointerCoords;

    iput-object v0, p0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mPointerCoords:[Landroid/view/MotionEvent$PointerCoords;

    .line 35
    return-void
.end method


# virtual methods
.method inject(IIJ)V
    .locals 21
    .param p1, "action"    # I
    .param p2, "pointerCount"    # I
    .param p3, "timeInMs"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 57
    packed-switch p1, :pswitch_data_0

    .line 115
    :cond_0
    :goto_0
    return-void

    .line 59
    :pswitch_0
    move-wide/from16 v0, p3

    move-object/from16 v2, p0

    iput-wide v0, v2, Lorg/chromium/content/browser/TouchEventSynthesizer;->mDownTimeInMs:J

    .line 60
    move-object/from16 v0, p0

    iget-wide v4, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mDownTimeInMs:J

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object/from16 v0, p0

    iget-object v10, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mPointerProperties:[Landroid/view/MotionEvent$PointerProperties;

    move-object/from16 v0, p0

    iget-object v11, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mPointerCoords:[Landroid/view/MotionEvent$PointerCoords;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/high16 v14, 0x3f800000    # 1.0f

    const/high16 v15, 0x3f800000    # 1.0f

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-wide/from16 v6, p3

    invoke-static/range {v4 .. v19}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    move-result-object v20

    .line 64
    .local v20, "event":Landroid/view/MotionEvent;
    move-object/from16 v0, p0

    iget-object v4, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    move-object/from16 v0, v20

    invoke-virtual {v4, v0}, Lorg/chromium/content/browser/ContentViewCore;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 65
    invoke-virtual/range {v20 .. v20}, Landroid/view/MotionEvent;->recycle()V

    .line 67
    const/4 v4, 0x1

    move/from16 v0, p2

    if-le v0, v4, :cond_0

    .line 68
    move-object/from16 v0, p0

    iget-wide v4, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mDownTimeInMs:J

    const/4 v8, 0x5

    move-object/from16 v0, p0

    iget-object v10, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mPointerProperties:[Landroid/view/MotionEvent$PointerProperties;

    move-object/from16 v0, p0

    iget-object v11, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mPointerCoords:[Landroid/view/MotionEvent$PointerCoords;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/high16 v14, 0x3f800000    # 1.0f

    const/high16 v15, 0x3f800000    # 1.0f

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-wide/from16 v6, p3

    move/from16 v9, p2

    invoke-static/range {v4 .. v19}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    move-result-object v20

    .line 73
    move-object/from16 v0, p0

    iget-object v4, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    move-object/from16 v0, v20

    invoke-virtual {v4, v0}, Lorg/chromium/content/browser/ContentViewCore;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 74
    invoke-virtual/range {v20 .. v20}, Landroid/view/MotionEvent;->recycle()V

    goto :goto_0

    .line 79
    .end local v20    # "event":Landroid/view/MotionEvent;
    :pswitch_1
    move-object/from16 v0, p0

    iget-wide v4, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mDownTimeInMs:J

    const/4 v8, 0x2

    move-object/from16 v0, p0

    iget-object v10, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mPointerProperties:[Landroid/view/MotionEvent$PointerProperties;

    move-object/from16 v0, p0

    iget-object v11, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mPointerCoords:[Landroid/view/MotionEvent$PointerCoords;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/high16 v14, 0x3f800000    # 1.0f

    const/high16 v15, 0x3f800000    # 1.0f

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-wide/from16 v6, p3

    move/from16 v9, p2

    invoke-static/range {v4 .. v19}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    move-result-object v20

    .line 83
    .restart local v20    # "event":Landroid/view/MotionEvent;
    move-object/from16 v0, p0

    iget-object v4, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    move-object/from16 v0, v20

    invoke-virtual {v4, v0}, Lorg/chromium/content/browser/ContentViewCore;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 84
    invoke-virtual/range {v20 .. v20}, Landroid/view/MotionEvent;->recycle()V

    goto/16 :goto_0

    .line 88
    .end local v20    # "event":Landroid/view/MotionEvent;
    :pswitch_2
    move-object/from16 v0, p0

    iget-wide v4, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mDownTimeInMs:J

    const/4 v8, 0x3

    const/4 v9, 0x1

    move-object/from16 v0, p0

    iget-object v10, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mPointerProperties:[Landroid/view/MotionEvent$PointerProperties;

    move-object/from16 v0, p0

    iget-object v11, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mPointerCoords:[Landroid/view/MotionEvent$PointerCoords;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/high16 v14, 0x3f800000    # 1.0f

    const/high16 v15, 0x3f800000    # 1.0f

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-wide/from16 v6, p3

    invoke-static/range {v4 .. v19}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    move-result-object v20

    .line 92
    .restart local v20    # "event":Landroid/view/MotionEvent;
    move-object/from16 v0, p0

    iget-object v4, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    move-object/from16 v0, v20

    invoke-virtual {v4, v0}, Lorg/chromium/content/browser/ContentViewCore;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 93
    invoke-virtual/range {v20 .. v20}, Landroid/view/MotionEvent;->recycle()V

    goto/16 :goto_0

    .line 97
    .end local v20    # "event":Landroid/view/MotionEvent;
    :pswitch_3
    const/4 v4, 0x1

    move/from16 v0, p2

    if-le v0, v4, :cond_1

    .line 98
    move-object/from16 v0, p0

    iget-wide v4, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mDownTimeInMs:J

    const/4 v8, 0x6

    move-object/from16 v0, p0

    iget-object v10, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mPointerProperties:[Landroid/view/MotionEvent$PointerProperties;

    move-object/from16 v0, p0

    iget-object v11, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mPointerCoords:[Landroid/view/MotionEvent$PointerCoords;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/high16 v14, 0x3f800000    # 1.0f

    const/high16 v15, 0x3f800000    # 1.0f

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-wide/from16 v6, p3

    move/from16 v9, p2

    invoke-static/range {v4 .. v19}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    move-result-object v20

    .line 102
    .restart local v20    # "event":Landroid/view/MotionEvent;
    move-object/from16 v0, p0

    iget-object v4, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    move-object/from16 v0, v20

    invoke-virtual {v4, v0}, Lorg/chromium/content/browser/ContentViewCore;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 103
    invoke-virtual/range {v20 .. v20}, Landroid/view/MotionEvent;->recycle()V

    .line 106
    .end local v20    # "event":Landroid/view/MotionEvent;
    :cond_1
    move-object/from16 v0, p0

    iget-wide v4, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mDownTimeInMs:J

    const/4 v8, 0x1

    const/4 v9, 0x1

    move-object/from16 v0, p0

    iget-object v10, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mPointerProperties:[Landroid/view/MotionEvent$PointerProperties;

    move-object/from16 v0, p0

    iget-object v11, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mPointerCoords:[Landroid/view/MotionEvent$PointerCoords;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/high16 v14, 0x3f800000    # 1.0f

    const/high16 v15, 0x3f800000    # 1.0f

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-wide/from16 v6, p3

    invoke-static/range {v4 .. v19}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    move-result-object v20

    .line 110
    .restart local v20    # "event":Landroid/view/MotionEvent;
    move-object/from16 v0, p0

    iget-object v4, v0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    move-object/from16 v0, v20

    invoke-virtual {v4, v0}, Lorg/chromium/content/browser/ContentViewCore;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 111
    invoke-virtual/range {v20 .. v20}, Landroid/view/MotionEvent;->recycle()V

    goto/16 :goto_0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method setPointer(IIII)V
    .locals 4
    .param p1, "index"    # I
    .param p2, "x"    # I
    .param p3, "y"    # I
    .param p4, "id"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 39
    sget-boolean v3, Lorg/chromium/content/browser/TouchEventSynthesizer;->$assertionsDisabled:Z

    if-nez v3, :cond_1

    if-ltz p1, :cond_0

    const/16 v3, 0x10

    if-lt p1, v3, :cond_1

    :cond_0
    new-instance v3, Ljava/lang/AssertionError;

    invoke-direct {v3}, Ljava/lang/AssertionError;-><init>()V

    throw v3

    .line 42
    :cond_1
    iget-object v3, p0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v3}, Lorg/chromium/content/browser/ContentViewCore;->getRenderCoordinates()Lorg/chromium/content/browser/RenderCoordinates;

    move-result-object v3

    invoke-virtual {v3}, Lorg/chromium/content/browser/RenderCoordinates;->getDeviceScaleFactor()F

    move-result v2

    .line 44
    .local v2, "scaleFactor":F
    new-instance v0, Landroid/view/MotionEvent$PointerCoords;

    invoke-direct {v0}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    .line 45
    .local v0, "coords":Landroid/view/MotionEvent$PointerCoords;
    int-to-float v3, p2

    mul-float/2addr v3, v2

    iput v3, v0, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 46
    int-to-float v3, p3

    mul-float/2addr v3, v2

    iput v3, v0, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 47
    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v0, Landroid/view/MotionEvent$PointerCoords;->pressure:F

    .line 48
    iget-object v3, p0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mPointerCoords:[Landroid/view/MotionEvent$PointerCoords;

    aput-object v0, v3, p1

    .line 50
    new-instance v1, Landroid/view/MotionEvent$PointerProperties;

    invoke-direct {v1}, Landroid/view/MotionEvent$PointerProperties;-><init>()V

    .line 51
    .local v1, "properties":Landroid/view/MotionEvent$PointerProperties;
    iput p4, v1, Landroid/view/MotionEvent$PointerProperties;->id:I

    .line 52
    iget-object v3, p0, Lorg/chromium/content/browser/TouchEventSynthesizer;->mPointerProperties:[Landroid/view/MotionEvent$PointerProperties;

    aput-object v1, v3, p1

    .line 53
    return-void
.end method
