.class Lorg/chromium/content/browser/input/AdapterInputConnection$ImeState;
.super Ljava/lang/Object;
.source "AdapterInputConnection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/input/AdapterInputConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ImeState"
.end annotation

.annotation build Lorg/chromium/base/VisibleForTesting;
.end annotation


# instance fields
.field public final compositionEnd:I

.field public final compositionStart:I

.field public final selectionEnd:I

.field public final selectionStart:I

.field public final text:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;IIII)V
    .locals 0
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "selectionStart"    # I
    .param p3, "selectionEnd"    # I
    .param p4, "compositionStart"    # I
    .param p5, "compositionEnd"    # I

    .prologue
    .line 525
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 526
    iput-object p1, p0, Lorg/chromium/content/browser/input/AdapterInputConnection$ImeState;->text:Ljava/lang/String;

    .line 527
    iput p2, p0, Lorg/chromium/content/browser/input/AdapterInputConnection$ImeState;->selectionStart:I

    .line 528
    iput p3, p0, Lorg/chromium/content/browser/input/AdapterInputConnection$ImeState;->selectionEnd:I

    .line 529
    iput p4, p0, Lorg/chromium/content/browser/input/AdapterInputConnection$ImeState;->compositionStart:I

    .line 530
    iput p5, p0, Lorg/chromium/content/browser/input/AdapterInputConnection$ImeState;->compositionEnd:I

    .line 531
    return-void
.end method
