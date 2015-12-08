.class Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid$1;
.super Ljava/lang/Object;
.source "ColorChooserAndroid.java"

# interfaces
.implements Lorg/chromium/ui/OnColorChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;-><init>(JLandroid/content/Context;I[Lorg/chromium/ui/ColorSuggestion;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;


# direct methods
.method constructor <init>(Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;)V
    .locals 0

    .prologue
    .line 27
    iput-object p1, p0, Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid$1;->this$0:Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onColorChanged(I)V
    .locals 4
    .param p1, "color"    # I

    .prologue
    .line 30
    iget-object v0, p0, Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid$1;->this$0:Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;

    # getter for: Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;->mDialog:Lorg/chromium/ui/ColorPickerDialog;
    invoke-static {v0}, Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;->access$000(Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;)Lorg/chromium/ui/ColorPickerDialog;

    move-result-object v0

    invoke-virtual {v0}, Lorg/chromium/ui/ColorPickerDialog;->dismiss()V

    .line 31
    iget-object v0, p0, Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid$1;->this$0:Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;

    iget-object v1, p0, Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid$1;->this$0:Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;

    # getter for: Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;->mNativeColorChooserAndroid:J
    invoke-static {v1}, Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;->access$100(Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;)J

    move-result-wide v2

    # invokes: Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;->nativeOnColorChosen(JI)V
    invoke-static {v0, v2, v3, p1}, Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;->access$200(Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;JI)V

    .line 32
    return-void
.end method
