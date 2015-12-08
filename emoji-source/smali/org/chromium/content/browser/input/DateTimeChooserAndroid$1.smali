.class Lorg/chromium/content/browser/input/DateTimeChooserAndroid$1;
.super Ljava/lang/Object;
.source "DateTimeChooserAndroid.java"

# interfaces
.implements Lorg/chromium/ui/picker/InputDialogContainer$InputActionDelegate;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/input/DateTimeChooserAndroid;-><init>(Landroid/content/Context;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/input/DateTimeChooserAndroid;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/input/DateTimeChooserAndroid;)V
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lorg/chromium/content/browser/input/DateTimeChooserAndroid$1;->this$0:Lorg/chromium/content/browser/input/DateTimeChooserAndroid;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public cancelDateTimeDialog()V
    .locals 4

    .prologue
    .line 37
    iget-object v0, p0, Lorg/chromium/content/browser/input/DateTimeChooserAndroid$1;->this$0:Lorg/chromium/content/browser/input/DateTimeChooserAndroid;

    iget-object v1, p0, Lorg/chromium/content/browser/input/DateTimeChooserAndroid$1;->this$0:Lorg/chromium/content/browser/input/DateTimeChooserAndroid;

    # getter for: Lorg/chromium/content/browser/input/DateTimeChooserAndroid;->mNativeDateTimeChooserAndroid:J
    invoke-static {v1}, Lorg/chromium/content/browser/input/DateTimeChooserAndroid;->access$000(Lorg/chromium/content/browser/input/DateTimeChooserAndroid;)J

    move-result-wide v2

    # invokes: Lorg/chromium/content/browser/input/DateTimeChooserAndroid;->nativeCancelDialog(J)V
    invoke-static {v0, v2, v3}, Lorg/chromium/content/browser/input/DateTimeChooserAndroid;->access$200(Lorg/chromium/content/browser/input/DateTimeChooserAndroid;J)V

    .line 38
    return-void
.end method

.method public replaceDateTime(D)V
    .locals 5
    .param p1, "value"    # D

    .prologue
    .line 32
    iget-object v0, p0, Lorg/chromium/content/browser/input/DateTimeChooserAndroid$1;->this$0:Lorg/chromium/content/browser/input/DateTimeChooserAndroid;

    iget-object v1, p0, Lorg/chromium/content/browser/input/DateTimeChooserAndroid$1;->this$0:Lorg/chromium/content/browser/input/DateTimeChooserAndroid;

    # getter for: Lorg/chromium/content/browser/input/DateTimeChooserAndroid;->mNativeDateTimeChooserAndroid:J
    invoke-static {v1}, Lorg/chromium/content/browser/input/DateTimeChooserAndroid;->access$000(Lorg/chromium/content/browser/input/DateTimeChooserAndroid;)J

    move-result-wide v2

    # invokes: Lorg/chromium/content/browser/input/DateTimeChooserAndroid;->nativeReplaceDateTime(JD)V
    invoke-static {v0, v2, v3, p1, p2}, Lorg/chromium/content/browser/input/DateTimeChooserAndroid;->access$100(Lorg/chromium/content/browser/input/DateTimeChooserAndroid;JD)V

    .line 33
    return-void
.end method
