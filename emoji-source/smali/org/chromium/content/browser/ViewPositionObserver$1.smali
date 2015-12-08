.class Lorg/chromium/content/browser/ViewPositionObserver$1;
.super Ljava/lang/Object;
.source "ViewPositionObserver.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/ViewPositionObserver;-><init>(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/ViewPositionObserver;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/ViewPositionObserver;)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lorg/chromium/content/browser/ViewPositionObserver$1;->this$0:Lorg/chromium/content/browser/ViewPositionObserver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lorg/chromium/content/browser/ViewPositionObserver$1;->this$0:Lorg/chromium/content/browser/ViewPositionObserver;

    # invokes: Lorg/chromium/content/browser/ViewPositionObserver;->updatePosition()V
    invoke-static {v0}, Lorg/chromium/content/browser/ViewPositionObserver;->access$000(Lorg/chromium/content/browser/ViewPositionObserver;)V

    .line 34
    const/4 v0, 0x1

    return v0
.end method
