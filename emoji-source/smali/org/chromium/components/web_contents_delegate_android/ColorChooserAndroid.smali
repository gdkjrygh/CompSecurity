.class public Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;
.super Ljava/lang/Object;
.source "ColorChooserAndroid.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "web_contents_delegate_android"
.end annotation


# instance fields
.field private final mDialog:Lorg/chromium/ui/ColorPickerDialog;

.field private final mNativeColorChooserAndroid:J


# direct methods
.method private constructor <init>(JLandroid/content/Context;I[Lorg/chromium/ui/ColorSuggestion;)V
    .locals 3
    .param p1, "nativeColorChooserAndroid"    # J
    .param p3, "context"    # Landroid/content/Context;
    .param p4, "initialColor"    # I
    .param p5, "suggestions"    # [Lorg/chromium/ui/ColorSuggestion;

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid$1;

    invoke-direct {v0, p0}, Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid$1;-><init>(Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;)V

    .line 35
    .local v0, "listener":Lorg/chromium/ui/OnColorChangedListener;
    iput-wide p1, p0, Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;->mNativeColorChooserAndroid:J

    .line 36
    new-instance v1, Lorg/chromium/ui/ColorPickerDialog;

    invoke-direct {v1, p3, v0, p4, p5}, Lorg/chromium/ui/ColorPickerDialog;-><init>(Landroid/content/Context;Lorg/chromium/ui/OnColorChangedListener;I[Lorg/chromium/ui/ColorSuggestion;)V

    iput-object v1, p0, Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;->mDialog:Lorg/chromium/ui/ColorPickerDialog;

    .line 37
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;)Lorg/chromium/ui/ColorPickerDialog;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;

    .prologue
    .line 21
    iget-object v0, p0, Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;->mDialog:Lorg/chromium/ui/ColorPickerDialog;

    return-object v0
.end method

.method static synthetic access$100(Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;)J
    .locals 2
    .param p0, "x0"    # Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;

    .prologue
    .line 21
    iget-wide v0, p0, Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;->mNativeColorChooserAndroid:J

    return-wide v0
.end method

.method static synthetic access$200(Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;JI)V
    .locals 1
    .param p0, "x0"    # Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;
    .param p1, "x1"    # J
    .param p3, "x2"    # I

    .prologue
    .line 21
    invoke-direct {p0, p1, p2, p3}, Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;->nativeOnColorChosen(JI)V

    return-void
.end method

.method private static addToColorSuggestionArray([Lorg/chromium/ui/ColorSuggestion;IILjava/lang/String;)V
    .locals 1
    .param p0, "array"    # [Lorg/chromium/ui/ColorSuggestion;
    .param p1, "index"    # I
    .param p2, "color"    # I
    .param p3, "label"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 74
    new-instance v0, Lorg/chromium/ui/ColorSuggestion;

    invoke-direct {v0, p2, p3}, Lorg/chromium/ui/ColorSuggestion;-><init>(ILjava/lang/String;)V

    aput-object v0, p0, p1

    .line 75
    return-void
.end method

.method public static createColorChooserAndroid(JLorg/chromium/content/browser/ContentViewCore;I[Lorg/chromium/ui/ColorSuggestion;)Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;
    .locals 8
    .param p0, "nativeColorChooserAndroid"    # J
    .param p2, "contentViewCore"    # Lorg/chromium/content/browser/ContentViewCore;
    .param p3, "initialColor"    # I
    .param p4, "suggestions"    # [Lorg/chromium/ui/ColorSuggestion;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 54
    new-instance v1, Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;

    invoke-virtual {p2}, Lorg/chromium/content/browser/ContentViewCore;->getContext()Landroid/content/Context;

    move-result-object v4

    move-wide v2, p0

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;-><init>(JLandroid/content/Context;I[Lorg/chromium/ui/ColorSuggestion;)V

    .line 56
    .local v1, "chooser":Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;
    invoke-direct {v1}, Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;->openColorChooser()V

    .line 57
    return-object v1
.end method

.method private static createColorSuggestionArray(I)[Lorg/chromium/ui/ColorSuggestion;
    .locals 1
    .param p0, "size"    # I
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 62
    new-array v0, p0, [Lorg/chromium/ui/ColorSuggestion;

    return-object v0
.end method

.method private native nativeOnColorChosen(JI)V
.end method

.method private openColorChooser()V
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;->mDialog:Lorg/chromium/ui/ColorPickerDialog;

    invoke-virtual {v0}, Lorg/chromium/ui/ColorPickerDialog;->show()V

    .line 41
    return-void
.end method


# virtual methods
.method public closeColorChooser()V
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 45
    iget-object v0, p0, Lorg/chromium/components/web_contents_delegate_android/ColorChooserAndroid;->mDialog:Lorg/chromium/ui/ColorPickerDialog;

    invoke-virtual {v0}, Lorg/chromium/ui/ColorPickerDialog;->dismiss()V

    .line 46
    return-void
.end method
