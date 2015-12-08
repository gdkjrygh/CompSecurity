.class public Lorg/chromium/ui/base/ViewAndroid;
.super Ljava/lang/Object;
.source "ViewAndroid.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "ui"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private mKeepScreenOnCount:I

.field private mKeepScreenOnView:Landroid/view/View;

.field private mNativeViewAndroid:J

.field private final mViewAndroidDelegate:Lorg/chromium/ui/base/ViewAndroidDelegate;

.field private final mWindowAndroid:Lorg/chromium/ui/base/WindowAndroid;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-class v0, Lorg/chromium/ui/base/ViewAndroid;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/ui/base/ViewAndroid;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lorg/chromium/ui/base/WindowAndroid;Lorg/chromium/ui/base/ViewAndroidDelegate;)V
    .locals 2
    .param p1, "nativeWindow"    # Lorg/chromium/ui/base/WindowAndroid;
    .param p2, "viewAndroidDelegate"    # Lorg/chromium/ui/base/ViewAndroidDelegate;

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mNativeViewAndroid:J

    .line 33
    iput-object p1, p0, Lorg/chromium/ui/base/ViewAndroid;->mWindowAndroid:Lorg/chromium/ui/base/WindowAndroid;

    .line 34
    iput-object p2, p0, Lorg/chromium/ui/base/ViewAndroid;->mViewAndroidDelegate:Lorg/chromium/ui/base/ViewAndroidDelegate;

    .line 35
    iget-object v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mWindowAndroid:Lorg/chromium/ui/base/WindowAndroid;

    invoke-virtual {v0}, Lorg/chromium/ui/base/WindowAndroid;->getNativePointer()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lorg/chromium/ui/base/ViewAndroid;->nativeInit(J)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mNativeViewAndroid:J

    .line 36
    return-void
.end method

.method private native nativeDestroy(J)V
.end method

.method private native nativeInit(J)J
.end method


# virtual methods
.method public decrementKeepScreenOnCount()V
    .locals 2

    .prologue
    .line 76
    sget-boolean v0, Lorg/chromium/ui/base/ViewAndroid;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mKeepScreenOnCount:I

    if-gtz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 77
    :cond_0
    iget v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mKeepScreenOnCount:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mKeepScreenOnCount:I

    .line 78
    iget v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mKeepScreenOnCount:I

    if-nez v0, :cond_1

    .line 79
    iget-object v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mViewAndroidDelegate:Lorg/chromium/ui/base/ViewAndroidDelegate;

    iget-object v1, p0, Lorg/chromium/ui/base/ViewAndroid;->mKeepScreenOnView:Landroid/view/View;

    invoke-interface {v0, v1}, Lorg/chromium/ui/base/ViewAndroidDelegate;->releaseAnchorView(Landroid/view/View;)V

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mKeepScreenOnView:Landroid/view/View;

    .line 82
    :cond_1
    return-void
.end method

.method public destroy()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 46
    iget-wide v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mNativeViewAndroid:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 47
    iget-wide v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mNativeViewAndroid:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/ui/base/ViewAndroid;->nativeDestroy(J)V

    .line 48
    iput-wide v2, p0, Lorg/chromium/ui/base/ViewAndroid;->mNativeViewAndroid:J

    .line 50
    :cond_0
    return-void
.end method

.method public getNativePointer()J
    .locals 2

    .prologue
    .line 57
    iget-wide v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mNativeViewAndroid:J

    return-wide v0
.end method

.method public getViewAndroidDelegate()Lorg/chromium/ui/base/ViewAndroidDelegate;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mViewAndroidDelegate:Lorg/chromium/ui/base/ViewAndroidDelegate;

    return-object v0
.end method

.method public incrementKeepScreenOnCount()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v2, 0x0

    .line 64
    iget v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mKeepScreenOnCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mKeepScreenOnCount:I

    .line 65
    iget v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mKeepScreenOnCount:I

    if-ne v0, v6, :cond_0

    .line 66
    iget-object v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mViewAndroidDelegate:Lorg/chromium/ui/base/ViewAndroidDelegate;

    invoke-interface {v0}, Lorg/chromium/ui/base/ViewAndroidDelegate;->acquireAnchorView()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mKeepScreenOnView:Landroid/view/View;

    .line 67
    iget-object v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mViewAndroidDelegate:Lorg/chromium/ui/base/ViewAndroidDelegate;

    iget-object v1, p0, Lorg/chromium/ui/base/ViewAndroid;->mKeepScreenOnView:Landroid/view/View;

    move v3, v2

    move v4, v2

    move v5, v2

    invoke-interface/range {v0 .. v5}, Lorg/chromium/ui/base/ViewAndroidDelegate;->setAnchorViewPosition(Landroid/view/View;FFFF)V

    .line 68
    iget-object v0, p0, Lorg/chromium/ui/base/ViewAndroid;->mKeepScreenOnView:Landroid/view/View;

    invoke-virtual {v0, v6}, Landroid/view/View;->setKeepScreenOn(Z)V

    .line 70
    :cond_0
    return-void
.end method
