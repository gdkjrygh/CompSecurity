.class Lorg/chromium/content/browser/ContentViewCore$7;
.super Ljava/lang/Object;
.source "ContentViewCore.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/ContentViewCore;->onGenericMotionEvent(Landroid/view/MotionEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/ContentViewCore;

.field final synthetic val$eventFakeMouseMove:Landroid/view/MotionEvent;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/ContentViewCore;Landroid/view/MotionEvent;)V
    .locals 0

    .prologue
    .line 1599
    iput-object p1, p0, Lorg/chromium/content/browser/ContentViewCore$7;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    iput-object p2, p0, Lorg/chromium/content/browser/ContentViewCore$7;->val$eventFakeMouseMove:Landroid/view/MotionEvent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 1602
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$7;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewCore$7;->val$eventFakeMouseMove:Landroid/view/MotionEvent;

    invoke-virtual {v0, v1}, Lorg/chromium/content/browser/ContentViewCore;->onHoverEvent(Landroid/view/MotionEvent;)Z

    .line 1603
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$7;->val$eventFakeMouseMove:Landroid/view/MotionEvent;

    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 1604
    return-void
.end method
