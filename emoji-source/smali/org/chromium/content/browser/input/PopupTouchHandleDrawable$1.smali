.class Lorg/chromium/content/browser/input/PopupTouchHandleDrawable$1;
.super Ljava/lang/Object;
.source "PopupTouchHandleDrawable.java"

# interfaces
.implements Lorg/chromium/content/browser/PositionObserver$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/input/PopupTouchHandleDrawable;-><init>(Lorg/chromium/content/browser/input/PopupTouchHandleDrawable$PopupTouchHandleDrawableDelegate;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/input/PopupTouchHandleDrawable;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/input/PopupTouchHandleDrawable;)V
    .locals 0

    .prologue
    .line 116
    iput-object p1, p0, Lorg/chromium/content/browser/input/PopupTouchHandleDrawable$1;->this$0:Lorg/chromium/content/browser/input/PopupTouchHandleDrawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPositionChanged(II)V
    .locals 1
    .param p1, "x"    # I
    .param p2, "y"    # I

    .prologue
    .line 119
    iget-object v0, p0, Lorg/chromium/content/browser/input/PopupTouchHandleDrawable$1;->this$0:Lorg/chromium/content/browser/input/PopupTouchHandleDrawable;

    # invokes: Lorg/chromium/content/browser/input/PopupTouchHandleDrawable;->updateParentPosition(II)V
    invoke-static {v0, p1, p2}, Lorg/chromium/content/browser/input/PopupTouchHandleDrawable;->access$000(Lorg/chromium/content/browser/input/PopupTouchHandleDrawable;II)V

    .line 120
    return-void
.end method
