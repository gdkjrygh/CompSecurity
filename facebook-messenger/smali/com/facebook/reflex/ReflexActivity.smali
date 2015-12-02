.class public Lcom/facebook/reflex/ReflexActivity;
.super Landroid/app/NativeActivity;
.source "ReflexActivity.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x9
.end annotation

.annotation build Lcom/facebook/base/DoNotStrip;
.end annotation


# static fields
.field private static c:Lcom/facebook/reflex/Widget;


# instance fields
.field private a:Lcom/facebook/reflex/Widget;

.field private b:Z

.field private mNativeActivityHandle:I
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    const-string v0, "fb_stl_shared"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 22
    const-string v0, "fb"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 23
    const-string v0, "stopmotion"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 24
    const-string v0, "peanut"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 25
    const-string v0, "reflex"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 27
    const-string v0, "reflex-jni"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 28
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 17
    invoke-direct {p0}, Landroid/app/NativeActivity;-><init>()V

    .line 31
    iput-boolean v0, p0, Lcom/facebook/reflex/ReflexActivity;->b:Z

    .line 33
    iput v0, p0, Lcom/facebook/reflex/ReflexActivity;->mNativeActivityHandle:I

    return-void
.end method

.method private dispatchKeyEventFromInput(JJIIIIIIII)V
    .locals 14
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .prologue
    .line 109
    new-instance v1, Landroid/view/KeyEvent;

    move-wide v2, p1

    move-wide/from16 v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Landroid/view/KeyEvent;-><init>(JJIIIIIIII)V

    .line 117
    const/4 v2, 0x4

    move/from16 v0, p6

    if-ne v0, v2, :cond_2

    .line 118
    const/4 v2, 0x1

    move/from16 v0, p5

    if-ne v0, v2, :cond_1

    invoke-virtual {v1}, Landroid/view/KeyEvent;->isCanceled()Z

    move-result v1

    if-nez v1, :cond_1

    .line 119
    const-string v1, "input_method"

    invoke-virtual {p0, v1}, Lcom/facebook/reflex/ReflexActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 120
    invoke-virtual {p0}, Lcom/facebook/reflex/ReflexActivity;->getCurrentFocus()Landroid/view/View;

    move-result-object v2

    .line 121
    if-nez v2, :cond_0

    .line 122
    invoke-virtual {p0}, Lcom/facebook/reflex/ReflexActivity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    .line 124
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    move-result v1

    .line 125
    if-nez v1, :cond_1

    .line 126
    invoke-virtual {p0}, Lcom/facebook/reflex/ReflexActivity;->onBackPressed()V

    .line 143
    :cond_1
    :goto_0
    return-void

    .line 133
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/reflex/ReflexActivity;->onUserInteraction()V

    .line 134
    invoke-virtual {p0}, Lcom/facebook/reflex/ReflexActivity;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 135
    invoke-virtual {v2, v1}, Landroid/view/Window;->superDispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 140
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    .line 141
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v2

    :goto_1
    invoke-virtual {v1, p0, v2, p0}, Landroid/view/KeyEvent;->dispatch(Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    goto :goto_1
.end method

.method public static e()Lcom/facebook/reflex/Widget;
    .locals 1

    .prologue
    .line 165
    sget-object v0, Lcom/facebook/reflex/ReflexActivity;->c:Lcom/facebook/reflex/Widget;

    return-object v0
.end method

.method private native nativeSetRoot(Lcom/facebook/reflex/Widget;)V
.end method

.method private static native setRuntimeProperty(Ljava/lang/String;Ljava/lang/String;)V
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation
.end method


# virtual methods
.method protected a(Lcom/facebook/reflex/Widget;)V
    .locals 1

    .prologue
    .line 43
    iput-object p1, p0, Lcom/facebook/reflex/ReflexActivity;->a:Lcom/facebook/reflex/Widget;

    .line 44
    iget-boolean v0, p0, Lcom/facebook/reflex/ReflexActivity;->b:Z

    if-eqz v0, :cond_0

    .line 45
    iget-object v0, p0, Lcom/facebook/reflex/ReflexActivity;->a:Lcom/facebook/reflex/Widget;

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/ReflexActivity;->b(Lcom/facebook/reflex/Widget;)V

    .line 47
    :cond_0
    return-void
.end method

.method public b(Lcom/facebook/reflex/Widget;)V
    .locals 2

    .prologue
    .line 146
    sget-object v0, Lcom/facebook/reflex/ReflexActivity;->c:Lcom/facebook/reflex/Widget;

    if-ne v0, p1, :cond_1

    .line 162
    :cond_0
    :goto_0
    return-void

    .line 152
    :cond_1
    sget-object v0, Lcom/facebook/reflex/ReflexActivity;->c:Lcom/facebook/reflex/Widget;

    .line 153
    sput-object p1, Lcom/facebook/reflex/ReflexActivity;->c:Lcom/facebook/reflex/Widget;

    .line 154
    sget-object v1, Lcom/facebook/reflex/ReflexActivity;->c:Lcom/facebook/reflex/Widget;

    if-eqz v1, :cond_2

    .line 155
    sget-object v1, Lcom/facebook/reflex/ReflexActivity;->c:Lcom/facebook/reflex/Widget;

    invoke-virtual {v1}, Lcom/facebook/reflex/Widget;->a()V

    .line 157
    :cond_2
    sget-object v1, Lcom/facebook/reflex/ReflexActivity;->c:Lcom/facebook/reflex/Widget;

    invoke-direct {p0, v1}, Lcom/facebook/reflex/ReflexActivity;->nativeSetRoot(Lcom/facebook/reflex/Widget;)V

    .line 159
    if-eqz v0, :cond_0

    .line 160
    invoke-virtual {v0}, Lcom/facebook/reflex/Widget;->b()V

    goto :goto_0
.end method

.method protected didReceiveDriverInformation(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation build Lcom/facebook/base/DoNotStrip;
    .end annotation

    .prologue
    .line 93
    return-void
.end method

.method protected onPause()V
    .locals 1

    .prologue
    .line 51
    invoke-super {p0}, Landroid/app/NativeActivity;->onPause()V

    .line 52
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/reflex/ReflexActivity;->b:Z

    .line 56
    return-void
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 60
    invoke-super {p0}, Landroid/app/NativeActivity;->onResume()V

    .line 61
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/reflex/ReflexActivity;->b:Z

    .line 62
    iget-object v0, p0, Lcom/facebook/reflex/ReflexActivity;->a:Lcom/facebook/reflex/Widget;

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/ReflexActivity;->b(Lcom/facebook/reflex/Widget;)V

    .line 63
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 68
    invoke-static {}, Lcom/facebook/reflex/ReflexActivity;->e()Lcom/facebook/reflex/Widget;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/reflex/ReflexActivity;->a:Lcom/facebook/reflex/Widget;

    if-ne v0, v1, :cond_0

    .line 69
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/reflex/ReflexActivity;->b(Lcom/facebook/reflex/Widget;)V

    .line 71
    :cond_0
    invoke-super {p0}, Landroid/app/NativeActivity;->onStop()V

    .line 72
    return-void
.end method
