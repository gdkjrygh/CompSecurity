.class Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;
.super Ljava/lang/Object;
.source "ImeAdapter.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/input/ImeAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DelayedDismissInput"
.end annotation


# instance fields
.field private mNativeImeAdapter:J

.field final synthetic this$0:Lorg/chromium/content/browser/input/ImeAdapter;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/input/ImeAdapter;J)V
    .locals 0
    .param p2, "nativeImeAdapter"    # J

    .prologue
    .line 79
    iput-object p1, p0, Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;->this$0:Lorg/chromium/content/browser/input/ImeAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    iput-wide p2, p0, Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;->mNativeImeAdapter:J

    .line 81
    return-void
.end method


# virtual methods
.method detach()V
    .locals 2

    .prologue
    .line 85
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;->mNativeImeAdapter:J

    .line 86
    return-void
.end method

.method public run()V
    .locals 5

    .prologue
    .line 90
    iget-wide v0, p0, Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;->mNativeImeAdapter:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;->this$0:Lorg/chromium/content/browser/input/ImeAdapter;

    iget-wide v2, p0, Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;->mNativeImeAdapter:J

    sget v1, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputTypeNone:I

    sget v4, Lorg/chromium/content/browser/input/ImeAdapter;->sTextInputFlagNone:I

    invoke-virtual {v0, v2, v3, v1, v4}, Lorg/chromium/content/browser/input/ImeAdapter;->attach(JII)V

    .line 93
    :cond_0
    iget-object v0, p0, Lorg/chromium/content/browser/input/ImeAdapter$DelayedDismissInput;->this$0:Lorg/chromium/content/browser/input/ImeAdapter;

    const/4 v1, 0x1

    # invokes: Lorg/chromium/content/browser/input/ImeAdapter;->dismissInput(Z)V
    invoke-static {v0, v1}, Lorg/chromium/content/browser/input/ImeAdapter;->access$000(Lorg/chromium/content/browser/input/ImeAdapter;Z)V

    .line 94
    return-void
.end method
